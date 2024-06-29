import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class261 extends class170 {

    @OriginalMember(owner = "client!kl", name = "bb", descriptor = "I")
    private int field4648 = 4096;

    @OriginalMember(owner = "client!kl", name = "X", descriptor = "I")
    private int field4644 = 0;

    @OriginalMember(owner = "client!kl", name = "db", descriptor = "I")
    public static int field4650 = 0;

    @OriginalMember(owner = "client!kl", name = "ab", descriptor = "I")
    public static int field4647 = 0;

    @OriginalMember(owner = "client!kl", name = "eb", descriptor = "I")
    public static int field4651 = 0;

    @OriginalMember(owner = "client!kl", name = "Z", descriptor = "S")
    public static short field4646 = 320;

    @OriginalMember(owner = "client!kl", name = "Y", descriptor = "Lke;")
    public static class107 field4645 = new class107(5000);

    @OriginalMember(owner = "client!kl", name = "hb", descriptor = "Lqk;")
    public static class207 field4654 = class24.method212(255, "Chargement des textures )2 ");

    @OriginalMember(owner = "client!kl", name = "ib", descriptor = "Z")
    public static boolean field4655 = true;

    @OriginalMember(owner = "client!kl", name = "jb", descriptor = "[Lte;")
    public static class76[] field4656 = new class76[50];

    @OriginalMember(owner = "client!kl", name = "kb", descriptor = "Lqk;")
    private static class207 field4657 = class24.method212(255, "Unable to find ");

    @OriginalMember(owner = "client!kl", name = "lb", descriptor = "Lqk;")
    public static class207 field4658 = field4657;

    @OriginalMember(owner = "client!kl", name = "W", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!kl", name = "fb", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!kl", name = "cb", descriptor = "Lhk;")
    public static class124 field4649;

    @OriginalMember(owner = "client!kl", name = "gb", descriptor = "[Luh;")
    public static class100[] field4653;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field4648 = arg0.method1050(arg1 ^ 1272009053);
            }
        } else {
            this.field4644 = arg0.method1050(1272006568);
        }
        if (arg1 != 5877) {
            field4653 = null;
        }
        ++field4643;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
    public class261() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        ++field4652;
        if (arg0 != -30) {
            method1811(-90);
        }
        int[] var3 = super.field3001.method1538(111, arg1);
        if (super.field3001.field3835) {
            int[] var4 = this.method1226(0, arg1, 113);
            for (int var5 = 0; ~var5 > ~class88.field1595; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field4644 <= var6 && this.field4648 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "(I)V")
    public static void method1811(int arg0) {
        field4654 = null;
        field4656 = null;
        field4649 = null;
        if (arg0 != 50) {
            method1811(60);
        }
        field4645 = null;
        field4657 = null;
        field4658 = null;
        field4653 = null;
    }
}
