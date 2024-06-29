import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class149 {

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "Z")
    public boolean field2329;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "Z")
    public static boolean field2331 = false;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Ljf;")
    public class216 field2321;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "Ljf;")
    public class216 field2325;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "Z")
    public boolean field2322;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "[I")
    public static int[] field2330;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "[Lw;")
    public static class300[] field2327;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)Llr;", line = 5)
    public static final class754 method1105(int arg0, int arg1, int arg2) {
        class186 var3 = class80.field1136[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2830;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 16)
    public static final void method1106(int arg0) {
        field2323++;
        class725.field10118 = 200;
        class340.field4943 = (int) ((double) class194.field2946 * 34.46D);
        class340.field4943 <<= 0x2;
        if (arg0 != -3) {
            field2330 = null;
        }
        if (class736.field10316.method475()) {
            class340.field4943 += 512;
        }
        class120.method867(arg0 ^ 0xFFFFFF95, false);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)Z", line = 34)
    public final boolean method1107(byte arg0) {
        if (arg0 == -44) {
            field2333++;
            return this.field2322 && !this.field2329;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/io/File;Z[BI)V", line = 46)
    public static final void method1108(File arg0, boolean arg1, byte[] arg2, int arg3) throws IOException {
        if (!arg1) {
            method1109(-36, -118, -23, -79, (byte) 59, 17);
        }
        field2326++;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
        try {
            var4.readFully(arg2, 0, arg3);
        } catch (EOFException var5) {
        }
        var4.close();
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIBI)Z", line = 63)
    public static final boolean method1109(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field2320++;
        for (int var6 = arg0; var6 <= arg1; var6++) {
            for (int var7 = arg5; var7 <= arg3; var7++) {
                if (class740.field10379[var6][var7] == arg2 && class426.field6326[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        if (arg4 < 51) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V", line = 96)
    public final void method1110(int arg0) {
        field2334++;
        if (this.field2321 != null) {
            this.field2321.method1284(true);
        }
        this.field2322 = false;
        if (arg0 != 512) {
            this.method1107((byte) 112);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lvd;IILvd;)V", line = 111)
    public static final void method1111(class39 arg0, int arg1, int arg2, class39 arg3) {
        class74.field1033 = arg3;
        field2324++;
        class228.field3354 = arg0;
        if (arg1 >= -9) {
            method1105(89, 36, 111);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILdh;[II)Lbn;", line = 128)
    public static final class445 method1112(int arg0, class322 arg1, int[] arg2, int arg3) {
        field2328++;
        if (arg3 != -3) {
            return null;
        }
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        float[][] var7 = null;
        if (arg1.field4597 != null) {
            int var8 = arg1.field4582;
            int[] var9 = new int[var8];
            int[] var10 = new int[var8];
            int[] var11 = new int[var8];
            int[] var12 = new int[var8];
            int[] var13 = new int[var8];
            int[] var14 = new int[var8];
            for (int var15 = 0; var15 < var8; var15++) {
                var9[var15] = Integer.MAX_VALUE;
                var10[var15] = -2147483647;
                var11[var15] = Integer.MAX_VALUE;
                var12[var15] = -2147483647;
                var13[var15] = Integer.MAX_VALUE;
                var14[var15] = -2147483647;
            }
            var5 = new int[var8];
            var7 = new float[var8][];
            for (int var16 = 0; var16 < arg0; var16++) {
                int var23 = arg2[var16];
                if (arg1.field4597[var23] != -1) {
                    int var24 = arg1.field4597[var23] & 0xFF;
                    for (int var25 = 0; var25 < 3; var25++) {
                        short var26;
                        if (var25 == 0) {
                            var26 = arg1.field4567[var23];
                        } else if (var25 == 1) {
                            var26 = arg1.field4563[var23];
                        } else {
                            var26 = arg1.field4572[var23];
                        }
                        int var27 = arg1.field4561[var26];
                        int var28 = arg1.field4564[var26];
                        int var29 = arg1.field4553[var26];
                        if (var27 < var9[var24]) {
                            var9[var24] = var27;
                        }
                        if (var27 > var10[var24]) {
                            var10[var24] = var27;
                        }
                        if (var11[var24] > var28) {
                            var11[var24] = var28;
                        }
                        if (var28 > var12[var24]) {
                            var12[var24] = var28;
                        }
                        if (var29 < var13[var24]) {
                            var13[var24] = var29;
                        }
                        if (var14[var24] < var29) {
                            var14[var24] = var29;
                        }
                    }
                }
            }
            var4 = new int[var8];
            var6 = new int[var8];
            for (int var17 = 0; var17 < var8; var17++) {
                byte var18 = arg1.field4558[var17];
                if (var18 > 0) {
                    var4[var17] = (var9[var17] + var10[var17]) / 2;
                    var5[var17] = (var11[var17] + var12[var17]) / 2;
                    var6[var17] = (var13[var17] + var14[var17]) / 2;
                    float var20;
                    float var21;
                    float var22;
                    if (var18 == 1) {
                        int var19 = arg1.field4560[var17];
                        if (var19 == 0) {
                            var20 = 1.0F;
                            var21 = 1.0F;
                        } else if (var19 <= 0) {
                            var20 = (float) (-var19) / 1024.0F;
                            var21 = 1.0F;
                        } else {
                            var21 = (float) var19 / 1024.0F;
                            var20 = 1.0F;
                        }
                        var22 = 64.0F / (float) arg1.field4566[var17];
                    } else if (var18 == 2) {
                        var21 = 64.0F / (float) arg1.field4588[var17];
                        var20 = 64.0F / (float) arg1.field4560[var17];
                        var22 = 64.0F / (float) arg1.field4566[var17];
                    } else {
                        var22 = (float) arg1.field4566[var17] / 1024.0F;
                        var20 = (float) arg1.field4560[var17] / 1024.0F;
                        var21 = (float) arg1.field4588[var17] / 1024.0F;
                    }
                    var7[var17] = class455.method2783(var21, arg1.field4580[var17], var22, class493.method2943(255, arg1.field4554[var17]), arg1.field4594[var17], class513.method3033(arg3, -115), var20, arg1.field4601[var17]);
                }
            }
        }
        return new class445(var4, var5, var6, var7);
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V", line = 307)
    public static void method1113(int arg0) {
        field2330 = null;
        field2327 = null;
        if (arg0 != -3) {
            method1112(-122, null, null, -124);
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Z)V", line = 318)
    public class149(boolean arg0) {
        this.field2329 = arg0;
    }
}
