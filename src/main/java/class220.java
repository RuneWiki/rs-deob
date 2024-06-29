import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class220 {

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    private int field3105 = -1;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "Z")
    public boolean field3116 = true;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    private int field3114;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "Lpn;")
    private class49 field3107;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    private int field3113;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "Lpg;")
    private class333 field3109;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    private int field3108;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "Lfw;")
    private class337 field3102;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "Ltd;")
    private class379 field3110;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "Lbd;")
    private class142 field3112;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field3101 = 10;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public static int field3106 = 0;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "Lhi;")
    public static class45 field3104 = new class45(6, 1);

    @OriginalMember(owner = "client!al", name = "s", descriptor = "Lkc;")
    public static class157 field3117 = new class157(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
    public static void method1373(byte arg0) {
        field3117 = null;
        if (arg0 == -14) {
            field3104 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method1374(String arg0, byte arg1) {
        field3100++;
        String var2 = class340.method2065(class329.method1942(false, arg0), false);
        if (var2 == null) {
            var2 = "";
        }
        return arg1 == -110 ? var2 : null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILfw;I)V")
    private final void method1375(int arg0, class337 arg1, int arg2) {
        field3099++;
        if (~arg0 != arg2) {
            this.method1377((byte) -50);
            this.field3109.method1977(this.field3112, true);
            this.field3109.method1964(0, (byte) -124, arg1, 4, arg0);
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V")
    public final void method1376(byte arg0) {
        if (arg0 <= 60) {
            method1373((byte) -91);
        }
        field3103++;
        this.method1375(this.field3108, this.field3102, -1);
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(B)V")
    private final void method1377(byte arg0) {
        field3111++;
        if (!this.field3116) {
            return;
        }
        this.field3116 = false;
        byte[] var2 = this.field3107.field701;
        byte[] var3 = this.field3109.field4869;
        int var4 = 0;
        if (arg0 != -50) {
            this.method1376((byte) -31);
        }
        int var5 = this.field3107.field686;
        int var6 = this.field3107.field686 * this.field3113 + this.field3114;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field3112 != null && this.field3105 == var4) {
            this.field3116 = false;
            return;
        }
        this.field3105 = var4;
        int var8 = 0;
        int var9 = this.field3113 * var5 + this.field3114;
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
            var9 += this.field3107.field686 - 128;
        }
        if (this.field3112 == null) {
            this.field3112 = new class142(this.field3109, 3553, 6406, 128, 128, false, this.field3109.field4869, 6406, false);
            this.field3112.method990(false, arg0 + 1074, false);
            this.field3112.method928(arg0 + 167, true);
        } else {
            this.field3112.method996(0, false, 128, 6406, false, 0, 128, 0, 0, this.field3109.field4869);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "([BIII)V")
    public final void method1378(byte[] arg0, int arg1, int arg2, int arg3) {
        this.field3110.method2052(arg1, arg2 * this.field3109.method1995(arg1, true), arg3 ^ 0x415E, arg0);
        if (arg3 != 0) {
            field3101 = 54;
        }
        field3115++;
        this.method1375(arg2, this.field3110, -1);
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lpg;Lpn;Lmr;IIIII)V")
    public class220(class333 arg0, class49 arg1, class163 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field3114 = arg6;
        this.field3107 = arg1;
        this.field3113 = arg7;
        this.field3109 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field125 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field2445[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field3108 = var10;
        if (var10 <= 0) {
            this.field3112 = null;
        } else {
            class319 var14 = new class319(var10 * 2);
            if (this.field3109.field4796) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field125 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field2445[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method1857(561746448, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field125 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field2445[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method1829(0, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field3102 = this.field3109.method2006(var14.field4336, 5123, false, var14.field4360, (byte) 127);
            this.field3110 = new class379(this.field3109, 5123, null, 1);
        }
    }
}
