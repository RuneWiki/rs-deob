import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class27 extends class243 {

    @OriginalMember(owner = "client!qaa", name = "E", descriptor = "I")
    private int field198 = 4;

    @OriginalMember(owner = "client!qaa", name = "L", descriptor = "I")
    private int field204 = 4;

    @OriginalMember(owner = "client!qaa", name = "D", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!qaa", name = "F", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!qaa", name = "G", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!qaa", name = "I", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!qaa", name = "J", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!qaa", name = "K", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        ++field199;
        if (arg0 > -76) {
            this.method1(84, (class611) null, (byte) 25);
        }
        int[][] var3 = super.field3156.method3306(arg1, 0);
        if (super.field3156.field8335) {
            int var4 = class687.field9628 / this.field198;
            int var5 = class676.field9444 / this.field204;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method1457(0, 24431, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method1457(class676.field9444 * var7 / var5, 24431, 0);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; class687.field9628 > var14; ++var14) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class687.field9628 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ILaa;IILsba;IJII)V")
    public static final void method103(int arg0, class487 arg1, int arg2, int arg3, class218 arg4, int arg5, long arg6, int arg7, int arg8) {
        ++field200;
        int var10 = arg2 * arg2 + arg3 * arg3;
        if ((long) var10 <= arg6) {
            if (arg8 != 4) {
                method105(-62, -95, (byte) 36);
            }
            int var11 = Math.min(arg4.field2781 / 2, arg4.field2718 / 2);
            if (~var10 >= ~(var11 * var11)) {
                class51.method301(arg5, arg2, arg7, arg4, arg1, arg3, (byte) -24, class634.field8819[arg0]);
            } else {
                var11 -= 10;
                int var12;
                if (class8.field57 == 4) {
                    var12 = 16383 & (int) class183.field2237;
                } else {
                    var12 = 16383 & (int) class183.field2237 + class514.field6956;
                }
                int var13 = class15.field113[var12];
                int var14 = class15.field115[var12];
                if (class8.field57 != 4) {
                    var13 = var13 * 256 / (class283.field3747 - -256);
                    var14 = var14 * 256 / (class283.field3747 + 256);
                }
                int var15 = arg2 * var13 - -(arg3 * var14) >> 14;
                int var16 = arg2 * var14 + -(arg3 * var13) >> 14;
                double var17 = Math.atan2((double) var15, (double) var16);
                int var19 = (int) (Math.sin(var17) * (double) var11);
                int var20 = (int) (Math.cos(var17) * (double) var11);
                class685.field9612[arg0].method3857((float) arg4.field2781 / 2.0F + (float) arg7 + (float) var19, (float) arg4.field2718 / 2.0F + (float) arg5 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
            }
        }
    }

    @OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "()V")
    public class27() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ILji;B)V")
    public final void method1(int arg0, class611 arg1, byte arg2) {
        ++field202;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field204 = arg1.method3428((byte) 37);
            }
        } else {
            this.field198 = arg1.method3428((byte) 9);
        }
        if (arg2 > -92) {
            this.field204 = -70;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZLeda;)V")
    public static final void method104(boolean arg0, class103 arg1) {
        ++field203;
        class387.field5466.method725(arg1, -20911);
        if (arg0) {
            method105(-65, -93, (byte) 41);
        }
        arg1.field1386 = arg1.field1379.field8520;
        class758.field10572 += arg1.field1386;
        arg1.field1379.field8520 = 0;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(II)[I")
    public final int[] method5(int arg0, int arg1) {
        ++field201;
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (super.field3164.field9250) {
            int var4 = class687.field9628 / this.field198;
            int var5 = class676.field9444 / this.field204;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method1462(class676.field9444 * var6 / var5, 0, 0);
            } else {
                var7 = this.method1462(0, 0, arg0 + -255);
            }
            for (int var8 = 0; class687.field9628 > var8; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class687.field9628 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        if (arg0 != 255) {
            this.field204 = 9;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(IIB)Z")
    public static final boolean method105(int arg0, int arg1, byte arg2) {
        ++field197;
        if (arg2 >= -64) {
            return true;
        } else {
            return ~(arg0 & 32) != -1;
        }
    }
}
