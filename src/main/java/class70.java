import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class70 implements class20 {

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public int field1074;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public int field1078;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Ljn;")
    public class322 field1075;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public int field1079;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public int field1071;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public int field1073;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Lnha;")
    public class686 field1081;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public int field1076;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Lgca;")
    public static class206 field1080 = new class206();

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field1084 = 0;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field1083 = 0;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "[I")
    public static int[] field1086 = new int[8];

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Lvj;")
    public static class26 field1085 = new class26(8, 1);

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "[Lit;")
    public static class34[] field1088;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "[Lpea;")
    public static class456[] field1087;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)Lvj;")
    public class26 method117(int arg0) {
        if (arg0 == 1) {
            field1072++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
    public static void method653(int arg0) {
        field1086 = null;
        field1085 = null;
        field1087 = null;
        field1088 = null;
        field1080 = null;
        if (arg0 != 8) {
            field1084 = 17;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBIII)V")
    public static final void method654(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        for (class447 var5 = (class447) class19.field197.method3463((byte) -50); var5 != null; var5 = (class447) class19.field197.method3469((byte) 107)) {
            class656.method3694(arg0, arg2, arg3, (byte) 13, var5, arg4);
        }
        field1077++;
        if (arg1 >= -26) {
            return;
        }
        for (class447 var6 = (class447) class680.field9612.method3463((byte) -50); var6 != null; var6 = (class447) class680.field9612.method3469((byte) 107)) {
            byte var12 = 1;
            class228 var13 = var6.field6516.method885(-102);
            if (var6.field6516.field1679 == -1 || var6.field6516.field1598) {
                var12 = 0;
            } else if (var6.field6516.field1679 == var13.field3660 || var6.field6516.field1679 == var13.field3653 || var6.field6516.field1679 == var13.field3670 || var6.field6516.field1679 == var13.field3662) {
                var12 = 2;
            } else if (var6.field6516.field1679 == var13.field3661 || var6.field6516.field1679 == var13.field3656 || var6.field6516.field1679 == var13.field3689 || var6.field6516.field1679 == var13.field3699) {
                var12 = 3;
            }
            if (var6.field6527 != var12) {
                int var14 = class91.method769(124, var6.field6516);
                class504 var15 = var6.field6516.field6688;
                if (var15.field7308 != null) {
                    var15 = var15.method3046(-128, class422.field6216);
                }
                if (var15 == null || var14 == -1) {
                    var6.field6525 = false;
                    var6.field6515 = -1;
                    var6.field6527 = var12;
                } else if (var6.field6515 == var14 && var15.field7356 == var6.field6525) {
                    var6.field6527 = var12;
                    var6.field6522 = var15.field7342;
                } else {
                    boolean var16 = false;
                    if (var6.field6518 == null) {
                        var16 = true;
                    } else {
                        var6.field6522 -= 512;
                        if (var6.field6522 <= 0) {
                            class324.field4793.method2223(var6.field6518);
                            var16 = true;
                            var6.field6518 = null;
                        }
                    }
                    if (var16) {
                        var6.field6515 = var14;
                        var6.field6508 = null;
                        var6.field6527 = var12;
                        var6.field6522 = var15.field7342;
                        var6.field6525 = var15.field7356;
                        var6.field6521 = null;
                    }
                }
            }
            var6.field6511 = var6.field6516.field9477;
            var6.field6503 = var6.field6516.field9477 + (var6.field6516.method878(-5740) << 8);
            var6.field6502 = var6.field6516.field9475;
            var6.field6504 = var6.field6516.field9475 + (var6.field6516.method878(-5740) << 8);
            class656.method3694(arg0, arg2, arg3, (byte) 13, var6, arg4);
        }
        for (class447 var7 = (class447) class261.field4063.method3508((byte) -77); var7 != null; var7 = (class447) class261.field4063.method3520(-1)) {
            byte var8 = 1;
            class228 var9 = var7.field6507.method885(-37);
            if (var7.field6507.field1679 == -1 || var7.field6507.field1598) {
                var8 = 0;
            } else if (var7.field6507.field1679 == var9.field3660 || var7.field6507.field1679 == var9.field3653 || var7.field6507.field1679 == var9.field3670 || var7.field6507.field1679 == var9.field3662) {
                var8 = 2;
            } else if (var7.field6507.field1679 == var9.field3661 || var7.field6507.field1679 == var9.field3656 || var7.field6507.field1679 == var9.field3689 || var7.field6507.field1679 == var9.field3699) {
                var8 = 3;
            }
            if (var7.field6527 != var8) {
                int var10 = class684.method3817(var7.field6507, (byte) -109);
                if (var7.field6515 == var10 && var7.field6525 == var7.field6507.field8105) {
                    var7.field6527 = var8;
                    var7.field6522 = var7.field6507.field8141;
                } else {
                    boolean var11 = false;
                    if (var7.field6518 == null) {
                        var11 = true;
                    } else {
                        var7.field6522 -= 512;
                        if (var7.field6522 <= 0) {
                            class324.field4793.method2223(var7.field6518);
                            var7.field6518 = null;
                            var11 = true;
                        }
                    }
                    if (var11) {
                        var7.field6515 = var10;
                        var7.field6508 = null;
                        var7.field6521 = null;
                        var7.field6527 = var8;
                        var7.field6522 = var7.field6507.field8141;
                        var7.field6525 = var7.field6507.field8105;
                    }
                }
            }
            var7.field6511 = var7.field6507.field9477;
            var7.field6503 = var7.field6507.field9477 + (var7.field6507.method878(-5740) << 8);
            var7.field6502 = var7.field6507.field9475;
            var7.field6504 = var7.field6507.field9475 + (var7.field6507.method878(-5740) << 8);
            class656.method3694(arg0, arg2, arg3, (byte) 13, var7, arg4);
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lnha;Ljn;IIIIIII)V")
    public class70(class686 arg0, class322 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field1082 = arg2;
        this.field1074 = arg7;
        this.field1078 = arg5;
        this.field1075 = arg1;
        this.field1079 = arg3;
        this.field1071 = arg6;
        this.field1073 = arg8;
        this.field1081 = arg0;
        this.field1076 = arg4;
    }
}
