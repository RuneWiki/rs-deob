import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kka")
public class class518 extends class766 {

    @OriginalMember(owner = "client!kka", name = "n", descriptor = "I")
    public int field7112;

    @OriginalMember(owner = "client!kka", name = "o", descriptor = "I")
    public int field7113;

    @OriginalMember(owner = "client!kka", name = "u", descriptor = "I")
    public static int field7119 = 0;

    @OriginalMember(owner = "client!kka", name = "p", descriptor = "I")
    public static int field7114 = 0;

    @OriginalMember(owner = "client!kka", name = "w", descriptor = "Lin;")
    public static class380 field7121 = new class380(103, 10);

    @OriginalMember(owner = "client!kka", name = "x", descriptor = "F")
    public static float field7122;

    @OriginalMember(owner = "client!kka", name = "r", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!kka", name = "s", descriptor = "I")
    public static int field7117;

    @OriginalMember(owner = "client!kka", name = "t", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!kka", name = "v", descriptor = "I")
    public static int field7120;

    @OriginalMember(owner = "client!kka", name = "q", descriptor = "Ljava/applet/Applet;")
    public static Applet field7115;

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(III)Z")
    public static final boolean method3030(int arg0, int arg1, int arg2) {
        field7116++;
        if (arg2 > -64) {
            field7115 = null;
        }
        return (class451.method2656(arg1, arg0, (byte) -46) | class535.method3111((byte) 58, arg1, arg0) | class732.method4057(false, arg0, arg1)) & class564.method3283(arg0, -14896, arg1);
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(I)V")
    public static final void method3031(int arg0) {
        field7118++;
        class639 var1 = (class639) class248.field3573.method3731((byte) -113);
        if (arg0 != 512) {
            method3034((byte) 90, -78, -16, 10, -128);
        }
        while (var1 != null) {
            class316 var2 = var1.field9008;
            if (class594.field8494 > var2.field4475) {
                var1.method4237(arg0 - 513);
                var2.method1923(arg0 - 29202);
            } else if (var2.field4476 <= class594.field8494) {
                var2.method1922(-1);
                if (var2.field4509 > 0) {
                    class647 var3 = (class647) class486.field6697.method4253((long) (var2.field4509 - 1), -1);
                    if (var3 != null) {
                        class506 var4 = var3.field9191;
                        if (var4.field10347 >= 0 && class192.field2891 * 512 > var4.field10347 && var4.field10350 >= 0 && var4.field10350 < class456.field6225 * 512) {
                            var2.method1919(var4.field10350, class577.method3399(var4.field10350, var4.field10347, -8724, var2.field10361) - var2.field4472, class594.field8494, var4.field10347, (byte) 70);
                        }
                    }
                }
                if (var2.field4509 < 0) {
                    int var5 = -var2.field4509 - 1;
                    class21 var6;
                    if (class541.field7492 == var5) {
                        var6 = class719.field10041;
                    } else {
                        var6 = class588.field8451[var5];
                    }
                    if (var6 != null && var6.field10347 >= 0 && class192.field2891 * 512 > var6.field10347 && var6.field10350 >= 0 && class456.field6225 * 512 > var6.field10350) {
                        var2.method1919(var6.field10350, class577.method3399(var6.field10350, var6.field10347, -8724, var2.field10361) - var2.field4472, class594.field8494, var6.field10347, (byte) -67);
                    }
                }
                var2.method1920(arg0 ^ 0xFFFFFDFF, class662.field9326);
                class630.method3597(var2, true);
            }
            var1 = (class639) class248.field3573.method3729((byte) -121);
        }
    }

    @OriginalMember(owner = "client!kka", name = "<init>", descriptor = "(II)V")
    public class518(int arg0, int arg1) {
        this.field7112 = arg0;
        this.field7113 = arg1;
    }

    @OriginalMember(owner = "client!kka", name = "b", descriptor = "(I)V")
    public static void method3032(int arg0) {
        field7115 = null;
        int var1 = 126 % ((arg0 + 30) / 62);
        field7121 = null;
    }

    @OriginalMember(owner = "client!kka", name = "b", descriptor = "(III)Z")
    public static final boolean method3033(int arg0, int arg1, int arg2) {
        field7120++;
        if (arg1 >= -90) {
            field7121 = null;
        }
        if (class533.method3100(2048, arg2, arg0)) {
            return class630.method3598(arg0, (byte) -128, arg2) | (arg0 & 0xB000) != 0 | class131.method1102(arg2, -3157, arg0) ? true : (arg2 & 0x37) == 0 & (class637.method3628(true, arg2, arg0) | class377.method2273(-15, arg2, arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(BIIII)V")
    public static final void method3034(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class421 var5 = (class421) class628.field8911.method3731((byte) -106); var5 != null; var5 = (class421) class628.field8911.method3729((byte) 18)) {
            class228.method1548(arg0 - 89, arg3, arg4, arg1, var5, arg2);
        }
        field7117++;
        for (class421 var6 = (class421) class254.field3641.method3731((byte) -113); var6 != null; var6 = (class421) class254.field3641.method3729((byte) -117)) {
            byte var12 = 1;
            class31 var13 = var6.field5846.method1783(true);
            if (var6.field5846.field4040 == -1 || var6.field5846.field4109) {
                var12 = 0;
            } else if (var6.field5846.field4040 == var13.field388 || var6.field5846.field4040 == var13.field347 || var6.field5846.field4040 == var13.field385 || var6.field5846.field4040 == var13.field355) {
                var12 = 2;
            } else if (var6.field5846.field4040 == var13.field344 || var6.field5846.field4040 == var13.field368 || var6.field5846.field4040 == var13.field359 || var6.field5846.field4040 == var13.field341) {
                var12 = 3;
            }
            if (var6.field5839 != var12) {
                int var14 = class396.method2358(true, var6.field5846);
                class179 var15 = var6.field5846.field6964;
                if (var15.field2683 != null) {
                    var15 = var15.method1304(class578.field8328, -25917);
                }
                if (var15 == null || var14 == -1) {
                    var6.field5862 = -1;
                    var6.field5833 = false;
                    var6.field5839 = var12;
                } else if (var6.field5862 == var14 && var15.field2743 == var6.field5833) {
                    var6.field5853 = var15.field2672;
                    var6.field5839 = var12;
                } else {
                    boolean var16 = false;
                    if (var6.field5835 == null) {
                        var16 = true;
                    } else {
                        var6.field5853 -= 512;
                        if (var6.field5853 <= 0) {
                            class234.field3399.method4220(var6.field5835);
                            var6.field5835 = null;
                            var16 = true;
                        }
                    }
                    if (var16) {
                        var6.field5839 = var12;
                        var6.field5853 = var15.field2672;
                        var6.field5833 = var15.field2743;
                        var6.field5866 = null;
                        var6.field5862 = var14;
                        var6.field5854 = null;
                    }
                }
            }
            var6.field5855 = var6.field5846.field10347;
            var6.field5845 = var6.field5846.field10347 + (var6.field5846.method209(true) << 8);
            var6.field5849 = var6.field5846.field10350;
            var6.field5848 = var6.field5846.field10350 + (var6.field5846.method209(true) << 8);
            class228.method1548(arg0 ^ 0xFFFFFFD9, arg3, arg4, arg1, var6, arg2);
        }
        if (arg0 != -22) {
            return;
        }
        for (class421 var7 = (class421) class221.field3243.method4254((byte) 8); var7 != null; var7 = (class421) class221.field3243.method4251(arg0 - 101)) {
            byte var8 = 1;
            class31 var9 = var7.field5858.method1783(true);
            if (var7.field5858.field4040 == -1 || var7.field5858.field4109) {
                var8 = 0;
            } else if (var7.field5858.field4040 == var9.field388 || var7.field5858.field4040 == var9.field347 || var7.field5858.field4040 == var9.field385 || var7.field5858.field4040 == var9.field355) {
                var8 = 2;
            } else if (var7.field5858.field4040 == var9.field344 || var7.field5858.field4040 == var9.field368 || var7.field5858.field4040 == var9.field359 || var7.field5858.field4040 == var9.field341) {
                var8 = 3;
            }
            if (var7.field5839 != var8) {
                int var10 = class679.method3817(var7.field5858, 0);
                if (var7.field5862 == var10 && var7.field5858.field245 == var7.field5833) {
                    var7.field5853 = var7.field5858.field220;
                    var7.field5839 = var8;
                } else {
                    boolean var11 = false;
                    if (var7.field5835 == null) {
                        var11 = true;
                    } else {
                        var7.field5853 -= 512;
                        if (var7.field5853 <= 0) {
                            class234.field3399.method4220(var7.field5835);
                            var7.field5835 = null;
                            var11 = true;
                        }
                    }
                    if (var11) {
                        var7.field5833 = var7.field5858.field245;
                        var7.field5839 = var8;
                        var7.field5853 = var7.field5858.field220;
                        var7.field5854 = null;
                        var7.field5866 = null;
                        var7.field5862 = var10;
                    }
                }
            }
            var7.field5855 = var7.field5858.field10347;
            var7.field5845 = var7.field5858.field10347 + (var7.field5858.method209(true) << 8);
            var7.field5849 = var7.field5858.field10350;
            var7.field5848 = var7.field5858.field10350 + (var7.field5858.method209(true) << 8);
            class228.method1548(116, arg3, arg4, arg1, var7, arg2);
        }
    }
}
