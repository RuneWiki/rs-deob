import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public abstract class class426 extends class476 {

    @OriginalMember(owner = "client!ft", name = "k", descriptor = "Lpg;")
    public class333 field6193;

    @OriginalMember(owner = "client!ft", name = "r", descriptor = "I")
    public static int field6200 = -1;

    @OriginalMember(owner = "client!ft", name = "p", descriptor = "Lhi;")
    public static class45 field6198 = new class45(19, -1);

    @OriginalMember(owner = "client!ft", name = "t", descriptor = "Lrb;")
    public static class283 field6202 = new class283(3, 10);

    @OriginalMember(owner = "client!ft", name = "v", descriptor = "[[I")
    public static int[][] field6204 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!ft", name = "j", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!ft", name = "l", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!ft", name = "m", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!ft", name = "n", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!ft", name = "o", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!ft", name = "s", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!ft", name = "u", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!ft", name = "w", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!ft", name = "q", descriptor = "Z")
    public boolean field6199;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IB)V")
    public abstract void method625(int arg0, byte arg1);

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)Z")
    public abstract boolean method627(int arg0);

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(B)I")
    public int method626(byte arg0) {
        field6197++;
        if (arg0 != -2) {
            field6205 = -118;
        }
        return 0;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILbd;ILbd;)V")
    public abstract void method624(int arg0, class142 arg1, int arg2, class142 arg3);

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)Z")
    public final boolean method2540(int arg0) {
        if (arg0 < 64) {
            this.method625(-51, (byte) 114);
        }
        field6196++;
        return this.field6199;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B[[BLpu;)V")
    public static final void method2541(byte arg0, byte[][] arg1, class177 arg2) {
        if (arg0 > -69) {
            field6202 = null;
        }
        field6201++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg2.field17; var4++) {
            class287.method1649(841283500);
            for (int var5 = 0; var5 < class9.field111 >> 3; var5++) {
                for (int var6 = 0; var6 < class192.field2809 >> 3; var6++) {
                    int var7 = class93.field1520[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg2.field29 || var8 == 0) {
                            int var9 = (var7 & 0x7) >> 1;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class463.field6689.length; var13++) {
                                if (class463.field6689[var13] == var12 && arg1[var13] != null) {
                                    class319 var14 = new class319(arg1[var13]);
                                    arg2.method3(var4, class264.field3553, var8, var10, var9, var11, var5 * 8, (byte) -107, var6 * 8, var14);
                                    arg2.method1211(var10, var8, var14, var11, class275.field3737, var3[0] == -1 ? var3 : null, var5 * 8, var9, var4, 83, var6 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class284.field3854 = class90.field1454.method1562(0, var3[2], var3[1], class215.field3058, var3[0], var3[3]);
            class316.field4298 = var3[4];
        }
    }

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "(B)V")
    public static void method2542(byte arg0) {
        if (arg0 >= -33) {
            method2545((byte) 101, 113);
        }
        field6204 = null;
        field6202 = null;
        field6198 = null;
    }

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "(B)Z")
    public final boolean method2543(byte arg0) {
        if (arg0 >= -125) {
            field6203 = -35;
        }
        field6195++;
        return false;
    }

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "(I)V")
    public abstract void method621(int arg0);

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "(I)I")
    public final int method2544(int arg0) {
        if (arg0 != 9) {
            this.method626((byte) -1);
        }
        field6194++;
        return 1;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZII)V")
    public abstract void method622(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "(B)Z")
    public abstract boolean method630(byte arg0);

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(BI)V")
    public static final void method2545(byte arg0, int arg1) {
        if (arg0 <= 77) {
            field6205 = -23;
        }
        field6191++;
        if (class80.field1133 == null || arg1 > class80.field1133.length) {
            class80.field1133 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lpg;)V")
    public class426(class333 arg0) {
        this.field6193 = arg0;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(BLdk;)I")
    public static final int method2546(byte arg0, class421 arg1) {
        if (arg0 != 20) {
            method2546((byte) -60, null);
        }
        field6192++;
        int var2 = 0;
        if (arg1.method2517(class222.field3143, (byte) -127)) {
            var2++;
        }
        if (arg1.method2517(class84.field1290, (byte) -128)) {
            var2++;
        }
        return var2;
    }
}
