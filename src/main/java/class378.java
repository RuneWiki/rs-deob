import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class378 {

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public int field5759 = 16777215;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public int field5764 = 8;

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5766 = new String[] { method3048(method3047("g>*lt")), method3048(method3047("jx*\u0001!")), method3048(method3047("reh.")), method3048(method3047("jx*\u0003!")), method3048(method3047("jx*\u0000!")) };

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public int field5756;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public int field5757;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public int field5758;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public int field5762;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public int field5765;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "Z")
    public boolean field5763;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/String;IZI)V")
    public static final void method3044(String arg0, int arg1, boolean arg2, int arg3) {
        try {
            field5760++;
            class769.method5552((byte) -58);
            if (arg3 == 0) {
                class610.field8913 = class289.method2345(class289.field4305.field826.method4430(false) * 2, class502.field7252, 0, 57, class278.field4183, class426.field6273);
                if (arg0 != null) {
                    class610.field8913.method483(0);
                    class578 var13 = class106.method933(0, class647.field9376, (byte) 55, class753.field10953);
                    class67 var14 = class610.field8913.method563(var13, class481.method3673(class383.field5798, class647.field9376, 0), true);
                    class423.method3265((byte) -9);
                    class145.method1227(true, arg0, var14, var13, class610.field8913, (byte) -127);
                }
            } else {
                class66 var4 = null;
                if (arg0 != null) {
                    var4 = class289.method2345(0, class502.field7252, 0, 58, class278.field4183, class426.field6273);
                    var4.method483(0);
                    class578 var5 = class106.method933(0, class647.field9376, (byte) 60, class753.field10953);
                    class67 var6 = var4.method563(var5, class481.method3673(class383.field5798, class647.field9376, 0), true);
                    class423.method3265((byte) -9);
                    class145.method1227(true, arg0, var6, var5, var4, (byte) -123);
                }
                boolean var26 = false;
                label252: {
                    try {
                        var26 = true;
                        class610.field8913 = class289.method2345(class289.field4305.field826.method4430(false) * 2, class502.field7252, arg3, 94, class278.field4183, class426.field6273);
                        if (arg0 != null) {
                            var4.method483(0);
                            class578 var7 = class106.method933(0, class647.field9376, (byte) 95, class753.field10953);
                            class67 var8 = var4.method563(var7, class481.method3673(class383.field5798, class647.field9376, 0), true);
                            class423.method3265((byte) -9);
                            class145.method1227(true, arg0, var8, var7, var4, (byte) -123);
                        }
                        if (class610.field8913.method469()) {
                            boolean var9 = true;
                            try {
                                var9 = class306.field4779.field99 > 256;
                            } catch (Throwable var30) {
                            }
                            class434 var10;
                            if (var9) {
                                var10 = class610.field8913.method475(146800640);
                            } else {
                                var10 = class610.field8913.method475(104857600);
                            }
                            class610.field8913.method515(var10);
                            var26 = false;
                        } else {
                            var26 = false;
                        }
                        break label252;
                    } catch (Throwable var31) {
                        int var11 = class289.field4305.field812.method1610(false);
                        if (var11 == 2) {
                            class234.field3526 = true;
                        }
                        class289.field4305.method655(17, 0, class289.field4305.field812);
                        method3044(arg0, -118, arg2, var11);
                        Object var10000 = null;
                        var26 = false;
                    } finally {
                        if (var26) {
                            Object var18 = null;
                            if (var4 != null) {
                                try {
                                    var4.method579((byte) -60);
                                } catch (Throwable var27) {
                                }
                            }
                        }
                    }
                    if (var4 != null) {
                        try {
                            var4.method579((byte) -60);
                        } catch (Throwable var28) {
                        }
                    }
                    return;
                }
                Object var17 = null;
                if (var4 != null) {
                    try {
                        var4.method579((byte) -60);
                    } catch (Throwable var29) {
                    }
                }
            }
            class289.field4305.field812.method1608(1692039310, !arg2);
            class289.field4305.method655(17, arg3, class289.field4305.field812);
            if (arg1 < -115) {
                class756.method5486((byte) -7);
                class610.field8913.method581(10000);
                class610.field8913.method506(32);
                class272.field4126 = class610.field8913.method517();
                class70.field751 = class610.field8913.method517();
                class54.method404(101);
                class610.field8913.method519(class289.field4305.field847.method1395(false) == 1);
                if (class610.field8913.method561()) {
                    class297.method2510((byte) 113, class289.field4305.field832.method5389(false) == 1);
                }
                class246.method2088((byte) -7, class659.field9506 >> 3, class648.field9378 >> 3, class610.field8913);
                class745.method5429(-6124);
                class470.field6833 = null;
                class28.field344 = false;
                class431.field6338 = true;
                class176.method1543(-125);
            }
        } catch (RuntimeException var33) {
            throw class759.method5498(var33, field5766[1] + (arg0 == null ? field5766[2] : field5766[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILib;)V")
    private final void method3045(int arg0, int arg1, class163 arg2) {
        try {
            field5755++;
            int var4 = 111 / ((arg1 - 2) / 33);
            if (arg0 == 1) {
                this.field5764 = arg2.method1445((byte) 109);
            } else if (arg0 == 2) {
                this.field5763 = true;
            } else if (arg0 == 3) {
                this.field5758 = arg2.method1442(65280);
                this.field5765 = arg2.method1442(65280);
                this.field5762 = arg2.method1442(65280);
            } else if (arg0 == 4) {
                this.field5757 = arg2.method1455((byte) 62);
            } else if (arg0 == 5) {
                this.field5756 = arg2.method1445((byte) 116);
                return;
            } else if (arg0 == 6) {
                this.field5759 = arg2.method1436((byte) 99);
                return;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5766[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field5766[2] : field5766[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lib;I)V")
    public final void method3046(class163 arg0, int arg1) {
        try {
            if (arg1 == 0) {
                while (true) {
                    int var3 = arg0.method1455((byte) 62);
                    if (var3 == 0) {
                        field5761++;
                        return;
                    }
                    this.method3045(var3, 51, arg0);
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5766[3] + (arg0 == null ? field5766[2] : field5766[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3047(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x9);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3048(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 28;
                    break;
                case 1:
                    var10005 = 16;
                    break;
                case 2:
                    var10005 = 4;
                    break;
                case 3:
                    var10005 = 66;
                    break;
                default:
                    var10005 = 9;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
