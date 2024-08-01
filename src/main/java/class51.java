import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("f")
public class class51 extends class85 {

    @OriginalMember(owner = "f", name = "Q", descriptor = "I")
    private int field1031 = 0;

    @OriginalMember(owner = "f", name = "db", descriptor = "I")
    private int field1044 = 0;

    @OriginalMember(owner = "f", name = "gb", descriptor = "I")
    private int field1047 = 1;

    @OriginalMember(owner = "f", name = "U", descriptor = "[Loh;")
    public static class138[] field1035 = new class138[256];

    @OriginalMember(owner = "f", name = "ab", descriptor = "Z")
    public static boolean field1041 = false;

    @OriginalMember(owner = "f", name = "bb", descriptor = "[Led;")
    public static class45[] field1042 = new class45[100];

    @OriginalMember(owner = "f", name = "R", descriptor = "Llf;")
    public static class109 field1032 = class35.method275("Ung-Ultige Verbindung mit einem Anmelde)2Server)3", 2);

    @OriginalMember(owner = "f", name = "W", descriptor = "Ltf;")
    public static class181 field1037 = new class181();

    @OriginalMember(owner = "f", name = "eb", descriptor = "Llf;")
    private static class109 field1045 = class35.method275("Loaded wordpack", 2);

    @OriginalMember(owner = "f", name = "fb", descriptor = "Llf;")
    public static class109 field1046 = field1045;

    @OriginalMember(owner = "f", name = "T", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "f", name = "X", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "f", name = "Y", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "f", name = "Z", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "f", name = "cb", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "f", name = "S", descriptor = "Lkf;")
    public static class100 field1033;

    @OriginalMember(owner = "f", name = "V", descriptor = "[I")
    public static int[] field1036;

    @OriginalMember(owner = "f", name = "a", descriptor = "(Lbg;I)V")
    public static final void method342(class18 arg0, int arg1) {
        int var2 = -108 % ((54 - arg1) / 51);
        class163.field3049 = arg0;
        ++field1040;
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        if (arg0 > -49) {
            return null;
        } else {
            int[] var3 = super.field1736.method835(-314, arg1);
            if (super.field1736.field2253) {
                int var4 = class54.field1083[arg1];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; class57.field1152 > var6; ++var6) {
                    int var7 = class47.field980[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var11;
                    if (~this.field1044 != -1) {
                        int var9 = var5 * var5 + var8 * var8 >> 12;
                        int var10 = (int) (4096.0D * Math.sqrt((double) (var9 / 4096)));
                        var11 = (int) ((double) (this.field1047 * var10) * 3.141592653589793D);
                    } else {
                        var11 = (-var4 + var7) * this.field1047;
                    }
                    int var12 = var11 - (var11 & -4096);
                    if (~this.field1031 == -1) {
                        var12 = class126.field2428[var12 >> 4 & 255] - -4096 >> 1;
                    } else if (this.field1031 == 2) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                    var3[var6] = var12;
                }
            }
            ++field1039;
            return var3;
        }
    }

    @OriginalMember(owner = "f", name = "<init>", descriptor = "()V")
    public class51() {
        super(0, true);
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(Z)V")
    public static void method343(boolean arg0) {
        field1042 = null;
        field1036 = null;
        field1033 = null;
        field1035 = null;
        if (!arg0) {
            method343(false);
        }
        field1032 = null;
        field1037 = null;
        field1045 = null;
        field1046 = null;
    }

    @OriginalMember(owner = "f", name = "c", descriptor = "(I)V")
    public final void method199(int arg0) {
        class179.method1217(arg0 ^ 25713);
        if (arg0 != 25614) {
            method342((class18) null, -68);
        }
        ++field1034;
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 3) {
                    this.field1047 = arg2.method598((byte) 95);
                }
            } else {
                this.field1031 = arg2.method598((byte) 113);
            }
        } else {
            this.field1044 = arg2.method598((byte) 93);
        }
        if (arg0 >= -120) {
            method343(false);
        }
        ++field1043;
    }
}
