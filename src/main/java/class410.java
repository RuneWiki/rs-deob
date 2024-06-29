import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class410 extends class456 {

    @OriginalMember(owner = "client!nl", name = "Q", descriptor = "I")
    private int field5936 = 32768;

    @OriginalMember(owner = "client!nl", name = "K", descriptor = "Lct;")
    public static class285 field5930 = new class285(76, 2);

    @OriginalMember(owner = "client!nl", name = "T", descriptor = "[I")
    public static int[] field5939 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!nl", name = "S", descriptor = "Lai;")
    public static class322 field5938 = new class322();

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!nl", name = "J", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!nl", name = "L", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!nl", name = "M", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!nl", name = "N", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!nl", name = "O", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!nl", name = "P", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!nl", name = "R", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)[[I")
    public final int[][] method212(int arg0, int arg1) {
        ++field5928;
        if (arg0 != 0) {
            this.method210(39, (byte) -19, (class446) null);
        }
        int[][] var3 = super.field6468.method1090(-2, arg1);
        if (super.field6468.field2227) {
            int[] var4 = this.method2707(arg1, -31797, 1);
            int[] var5 = this.method2707(arg1, -31797, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; class156.field2169 > var9; ++var9) {
                int var10 = (var4[var9] * 255 & 1044911) >> 12;
                int var11 = var5[var9] * this.field5936 >> 12;
                int var12 = class489.field6853[var10] * var11 >> 12;
                int var13 = class346.field5288[var10] * var11 >> 12;
                int var14 = var9 - -(var12 >> 12) & class428.field6112;
                int var15 = class493.field6947 & (var13 >> 12) + arg1;
                int[][] var16 = this.method2709(false, var15, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "(I)V")
    public static final void method2446(int arg0) {
        if (arg0 != 16) {
            field5930 = null;
        }
        for (class146 var1 = (class146) class451.field6377.method2456(32101); var1 != null; var1 = (class146) class451.field6377.method2461(arg0 + 285)) {
            if (class85.method688(var1.field2056, (byte) 111)) {
                class423.method2494(arg0 + 32211, var1);
            }
        }
        ++field5934;
        if (~class186.field2817 != -2) {
            class247.method1579(class99.field1414, class330.field4935, -2472, class432.field6144, class450.field6355);
            int var2 = class131.field1828.method3(class473.field6624.method2036(class4.field85, (byte) -21), (byte) 92);
            for (class146 var3 = (class146) class451.field6377.method2456(32101); var3 != null; var3 = (class146) class451.field6377.method2461(301)) {
                int var4 = class270.method1757(var3, false);
                if (var2 < var4) {
                    var2 = var4;
                }
            }
            class330.field4935 = var2 + 8;
            class450.field6355 = (class486.field6828 ? 26 : 22) + class186.field2817 * 16;
        } else {
            class166.field2335 = false;
            class247.method1579(class99.field1414, class330.field4935, -2472, class432.field6144, class450.field6355);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IBLre;)V")
    public final void method210(int arg0, byte arg1, class446 arg2) {
        if (arg1 != 55) {
            this.method653(false);
        }
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field6486 = ~arg2.method2628(49152) == -2;
            }
        } else {
            this.field5936 = arg2.method2631(arg1 + 2475) << 4;
        }
        ++field5937;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)[I")
    public final int[] method33(int arg0, int arg1) {
        ++field5929;
        if (arg0 != -1) {
            return null;
        } else {
            int[] var3 = super.field6466.method2533(true, arg1);
            if (super.field6466.field6153) {
                int[] var4 = this.method2707(arg1, arg0 ^ 31796, 1);
                int[] var5 = this.method2707(arg1, -31797, 2);
                for (int var6 = 0; var6 < class156.field2169; ++var6) {
                    int var7 = 255 & var4[var6] >> 4;
                    int var8 = var5[var6] * this.field5936 >> 12;
                    int var9 = class489.field6853[var7] * var8 >> 12;
                    int var10 = class346.field5288[var7] * var8 >> 12;
                    int var11 = class428.field6112 & var6 - -(var9 >> 12);
                    int var12 = arg1 - -(var10 >> 12) & class493.field6947;
                    int[] var13 = this.method2707(var12, -31797, 0);
                    var3[var6] = var13[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V")
    public static void method2447(byte arg0) {
        if (arg0 < 29) {
            method2446(-89);
        }
        field5939 = null;
        field5930 = null;
        field5938 = null;
    }

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "(I)Llk;")
    public static final class290 method2448(int arg0) {
        if (arg0 != -26390) {
            field5930 = null;
        }
        ++field5933;
        if (class189.field2885 != null && class110.field1562 != null) {
            class110.field1562.method858((byte) 99, class189.field2885);
            class290 var1 = (class290) class110.field1562.method857(16986);
            if (var1 == null) {
                return null;
            } else {
                class94 var2 = class189.field2877.method1111(var1.field4401, -13516);
                return var2 != null && var2.field1331 && var2.method727(-1, class189.field2876) ? var1 : class360.method2207(-124);
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BI)V")
    public static final void method2449(byte arg0, int arg1) {
        class132.field1843 = 3;
        class163.field2270 = 100;
        class346.field5287 = -1;
        ++field5935;
        class47.field685 = arg1;
        if (arg0 > -98) {
            method2448(126);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)V")
    public final void method653(boolean arg0) {
        if (arg0) {
            ++field5931;
            class154.method1056(122);
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
    public class410() {
        super(3, false);
    }
}
