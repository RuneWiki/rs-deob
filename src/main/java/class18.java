import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class18 extends class424 {

    @OriginalMember(owner = "client!fg", name = "M", descriptor = "I")
    private int field233 = 0;

    @OriginalMember(owner = "client!fg", name = "V", descriptor = "I")
    private int field242 = 4096;

    @OriginalMember(owner = "client!fg", name = "U", descriptor = "Z")
    public static boolean field241;

    @OriginalMember(owner = "client!fg", name = "W", descriptor = "[I")
    public static int[] field243;

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "Z")
    public static boolean field237;

    @OriginalMember(owner = "client!fg", name = "Z", descriptor = "S")
    public static short field246;

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!fg", name = "N", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!fg", name = "O", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!fg", name = "P", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!fg", name = "Y", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!fg", name = "X", descriptor = "Lsg;")
    public static class267 field244;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(IB)[I")
    public final int[] method43(int arg0, byte arg1) {
        ++field238;
        int[] var3 = super.field5892.method783(arg0, (byte) -27);
        if (arg1 != -10) {
            field244 = null;
        }
        if (super.field5892.field1427) {
            int[] var4 = this.method2621(0, arg1 ^ 115, arg0);
            for (int var5 = 0; ~var5 > ~class303.field4135; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field233 >= ~var6 && var6 <= this.field242 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class18() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(B)V")
    public static void method107(byte arg0) {
        field243 = null;
        if (arg0 > -117) {
            field245 = 55;
        }
        field244 = null;
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(III)I")
    public static final int method108(int arg0, int arg1, int arg2) {
        int var3 = 11 % ((-18 - arg1) / 45);
        ++field236;
        int var4 = -128 + class194.method1346(arg0 - -45365, -27342, arg2 + 91923, 4) - (-(-128 + class194.method1346(arg0 + 10294, -27342, arg2 + 37821, 2) >> 1) - (class194.method1346(arg0, -27342, arg2, 1) + -128 >> 2));
        int var5 = (int) ((double) var4 * 0.3D) + 35;
        if (~var5 > -11) {
            var5 = 10;
        } else if (~var5 < -61) {
            var5 = 60;
        }
        return var5;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lrg;BI)V")
    public final void method19(class366 arg0, byte arg1, int arg2) {
        ++field239;
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field242 = arg0.method2297(arg1 ^ -13320);
            }
        } else {
            this.field233 = arg0.method2297(13352);
        }
        if (arg1 != -48) {
            method107((byte) 127);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIB)V")
    public static final void method109(int arg0, int arg1, byte arg2) {
        ++field234;
        class68.field967 = new class408(arg1);
        class273.field3739 = new class408(arg0);
        if (arg2 <= 77) {
            field245 = 110;
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(Z)V")
    public static final void method110(boolean arg0) {
        ++field232;
        if (!arg0) {
            class408 var1 = class120.field1820;
            synchronized (class120.field1820) {
                class120.field1820.method2530((byte) -92);
            }
        }
    }

    static {
        new class368("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field241 = false;
        field243 = new int[250];
        field240 = 0;
        field237 = true;
        field246 = 1;
    }
}
