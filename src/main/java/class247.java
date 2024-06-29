import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class247 {

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    private int field3544 = -1;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "Z")
    public boolean field3538 = true;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    private int field3535;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "Lpga;")
    private class174 field3549;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    private int field3551;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Llea;")
    private class573 field3539;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    private int field3548;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Lwi;")
    private class504 field3537;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "Ltj;")
    private class690 field3550;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Lkaa;")
    private class700 field3540;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "[S")
    private static short[] field3541 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "[S")
    private static short[] field3543 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "[S")
    private static short[] field3542 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "[S")
    private static short[] field3546 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "[[S")
    public static short[][] field3536 = new short[][] { field3542, field3541, field3546, field3543 };

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "Lsv;")
    public static class570 field3554 = new class570(30, 0);

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "Ljava/lang/String;")
    public static String field3558 = null;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "Ljava/lang/String;")
    public static String field3556;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "Ljava/lang/String;")
    public static String field3557;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "[Lhd;")
    public static class346[] field3547;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public final void method1641(int arg0) {
        if (arg0 < -43) {
            field3555++;
            this.method1644(this.field3548, 0, this.field3550);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II[BI)V")
    public final void method1642(int arg0, int arg1, byte[] arg2, int arg3) {
        this.field3540.method2600(-8525, arg2, arg0 * this.field3539.method3335(arg1, -79), arg1);
        field3552++;
        this.method1644(arg0, 0, this.field3540);
        if (arg3 < 61) {
            this.field3544 = -16;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
    public static void method1643(int arg0) {
        field3556 = null;
        field3536 = null;
        field3546 = null;
        field3543 = null;
        field3557 = null;
        field3558 = null;
        field3541 = null;
        field3542 = null;
        field3547 = null;
        field3554 = null;
        if (arg0 != 28933) {
            method1643(109);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILtj;)V")
    private final void method1644(int arg0, int arg1, class690 arg2) {
        field3553++;
        if (arg0 != 0) {
            this.method1645(-86);
            this.field3539.method3384(this.field3537, (byte) 85);
            this.field3539.method3339(-110, arg0, arg1, arg2, 4);
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Llea;Lpga;Lal;IIIII)V")
    public class247(class573 arg0, class174 arg1, class195 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field3535 = arg7;
        this.field3549 = arg1;
        this.field3551 = arg6;
        this.field3539 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field5808 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field2910[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field3548 = var10;
        if (var10 <= 0) {
            this.field3537 = null;
        } else {
            class431 var14 = new class431(var10 * 2);
            if (this.field3539.field8231) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field5808 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field2910[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method2546(true, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field5808 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field2910[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method2582((byte) -107, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field3550 = this.field3539.method3333(var14.field6002, false, (byte) -124, 5123, var14.field5983);
            this.field3540 = new class700(this.field3539, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
    private final void method1645(int arg0) {
        field3545++;
        if (!this.field3538) {
            return;
        }
        this.field3538 = false;
        byte[] var2 = this.field3549.field2617;
        byte[] var3 = this.field3539.field8281;
        int var4 = 0;
        int var5 = this.field3549.field2623;
        int var6 = this.field3549.field2623 * this.field3535 + this.field3551;
        if (arg0 > -62) {
            this.method1644(-56, 106, null);
        }
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field3537 != null && this.field3544 == var4) {
            this.field3538 = false;
            return;
        }
        this.field3544 = var4;
        int var8 = 0;
        int var9 = this.field3551 + (this.field3535 * var5);
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
            var9 += this.field3549.field2623 - 128;
        }
        if (this.field3537 == null) {
            this.field3537 = new class504(this.field3539, 3553, 6406, 128, 128, false, this.field3539.field8281, 6406, false);
            this.field3537.method2952(false, false, false);
            this.field3537.method2266(80, true);
        } else {
            this.field3537.method2950(128, (byte) 125, 6406, false, 0, this.field3539.field8281, 0, 0, 0, 128);
        }
    }

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = "Unknown";
        try {
            var1 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = "Unknown";
        try {
            var2 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var9) {
        }
        field3556 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field3557 = var3.toLowerCase();
        String var4 = "Unknown";
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = "~/";
        try {
            var5 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
    }
}
