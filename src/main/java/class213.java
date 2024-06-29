import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class213 extends class69 {

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public int field3792;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public int field3791;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
    public int field3795;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public int field3788;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "Z")
    public static boolean field3790 = false;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "Lha;")
    public static class46 field3794 = class271.method1828(":assistreq:", -46);

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)Z")
    public final boolean method1500(int arg0, int arg1, int arg2) {
        field3789++;
        if (arg0 == 0) {
            return this.field3795 <= arg2 && this.field3792 >= arg2 && arg1 >= this.field3791 && arg1 <= this.field3788;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lrk;I)V")
    public static final void method1501(class179 arg0, int arg1) {
        field3787++;
        short var2 = 256;
        for (int var3 = 0; var3 < class60.field1006.length; var3++) {
            class60.field1006[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var2 * Math.random() * 128.0D);
            class60.field1006[var16] = (int) (Math.random() * 284.0D);
        }
        if (arg1 != -946146713) {
            method1502(53);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class63.field1058[var15] = (class60.field1006[var15 - 1] + class60.field1006[var15 + 1] + class60.field1006[var15 + 128] + class60.field1006[var15 - 128]) / 4;
                }
            }
            int[] var13 = class60.field1006;
            class60.field1006 = class63.field1058;
            class63.field1058 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field4622; var7++) {
            for (int var8 = 0; var8 < arg0.field4628; var8++) {
                if (arg0.field3203[var6++] != 0) {
                    int var9 = var8 + arg0.field4621 + 16;
                    int var10 = arg0.field4620 + var7 + 16;
                    int var11 = var9 + (var10 << 7);
                    class60.field1006[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
    public static void method1502(int arg0) {
        if (arg0 == -5445) {
            field3794 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(IIII)V")
    public class213(int arg0, int arg1, int arg2, int arg3) {
        this.field3792 = arg2;
        this.field3791 = arg1;
        this.field3795 = arg0;
        this.field3788 = arg3;
    }
}
