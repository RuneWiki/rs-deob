import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class550 {

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    private int field8098 = -1;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "Z")
    public boolean field8109 = true;

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "Luca;")
    private class287 field8113;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
    private int field8110;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    private int field8095;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "Lpga;")
    private class152 field8102;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    private int field8097;

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "Laaa;")
    private class227 field8112;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "Lre;")
    private class290 field8105;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "Loj;")
    private class588 field8101;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "[I")
    public static int[] field8100 = new int[1];

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "F")
    public static float field8103;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public static int field8099;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public static int field8104;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public static int field8106;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
    public static int field8107;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
    public static int field8111;

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "I")
    public static int field8114;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "Lkca;")
    public static class370 field8096;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "Z")
    public static boolean field8108;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 7)
    public static void method3208(int arg0) {
        if (arg0 == 25454) {
            field8096 = null;
            field8100 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V", line = 18)
    private final void method3209(int arg0) {
        field8104++;
        if (!this.field8109) {
            return;
        }
        this.field8109 = false;
        byte[] var2 = this.field8102.field2141;
        byte[] var3 = this.field8113.field4171;
        int var4 = arg0;
        int var5 = this.field8102.field2135;
        int var6 = this.field8102.field2135 * this.field8110 + this.field8095;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field8112 != null && this.field8098 == var4) {
            this.field8109 = false;
            return;
        }
        this.field8098 = var4;
        int var8 = 0;
        int var9 = this.field8095 + (this.field8110 * var5);
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var9] == 0) {
                    int var12 = 0;
                    if (var2[var9 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var9] != 0) {
                        var12++;
                    }
                    var3[var8++] = (byte) (var12 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field8102.field2135 - 128;
        }
        if (this.field8112 == null) {
            this.field8112 = new class227(this.field8113, 3553, 6406, 128, 128, false, this.field8113.field4171, 6406, false);
            this.field8112.method1424(10242, false, false);
            this.field8112.method2924(true, -57);
        } else {
            this.field8112.method1423(0, 0, 0, 128, 128, this.field8113.field4171, 0, 6406, false, -2);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILre;I)V", line = 122)
    private final void method3210(int arg0, class290 arg1, int arg2) {
        field8106++;
        if (arg2 != 0) {
            this.method3209(arg0);
            this.field8113.method1709((byte) -46, this.field8112);
            this.field8113.method1702(4, 0, arg2, 28498, arg1);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I[BIB)V", line = 138)
    public final void method3211(int arg0, byte[] arg1, int arg2, byte arg3) {
        this.field8101.method1791(this.field8113.method1742(true, arg2) * arg0, arg1, arg2, arg3 ^ 0x1E);
        field8111++;
        if (arg3 != 71) {
            this.method3214(-10);
        }
        this.method3210(arg3 ^ 0x47, this.field8101, arg0);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IILlr;)V", line = 153)
    public static final void method3212(int arg0, int arg1, class311 arg2) {
        class345.field5103 = false;
        field8114++;
        class440.field6397 = 0;
        class566.method3264((byte) -103, arg2);
        class448.method2645(arg2, 114);
        if (arg1 >= -72) {
            method3212(103, 56, null);
        }
        if (class345.field5103) {
            System.out.println("---endgpp---");
        }
        if (arg2.field7956 != arg0) {
            throw new RuntimeException("gpi1 pos:" + arg2.field7956 + " psize:" + arg0);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "([Ljava/lang/Object;[JI)V", line = 174)
    public static final void method3213(Object[] arg0, long[] arg1, int arg2) {
        class309.method1926(arg1.length - 1, 0, false, arg1, arg0);
        field8099++;
        if (arg2 != -69) {
            method3208(64);
        }
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)V", line = 193)
    public final void method3214(int arg0) {
        this.method3210(arg0 + 582, this.field8105, this.field8097);
        field8107++;
        if (arg0 != -582) {
            this.method3210(-83, null, -106);
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Luca;Lpga;Lvfa;IIIII)V", line = 219)
    public class550(class287 arg0, class152 arg1, class436 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field8113 = arg0;
        this.field8110 = arg7;
        this.field8095 = arg6;
        this.field8102 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field9628 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field6341[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field8097 = var10;
        if (var10 <= 0) {
            this.field8112 = null;
        } else {
            class540 var14 = new class540(var10 * 2);
            if (this.field8113.field4060) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field9628 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field6341[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method3162(-2003712696, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field9628 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field6341[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method3120(var23[var24] & 0xFFFF, -23026);
                            }
                        }
                    }
                }
            }
            this.field8105 = this.field8113.method1719(var14.field7956, false, var14.field7952, 5123, 0);
            this.field8101 = new class588(this.field8113, 5123, null, 1);
        }
    }
}
