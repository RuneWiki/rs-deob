import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class89 {

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Liha;")
    public class29 field1324 = new class29(20);

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Liha;")
    private class29 field1329 = new class29(64);

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "Lgda;")
    public class58 field1321;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "Lgda;")
    private class58 field1325;

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1333 = new String[] { method881(method880("fn\u001bj")), method881(method880("s5Y(B")), method881(method880("z}Y:Vfr\u00038\u0017")), method881(method880("z}YB\u0017")), method881(method880("z}YE\u0017")), method881(method880("z}YC\u0017")), method881(method880("z}Y@\u0017")), method881(method880("z}YA\u0017")), method881(method880("z}YG\u0017")), method881(method880("z}YD\u0017")) };

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1328 = "";

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "[I")
    public static int[] field1327 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)V")
    public final void method873(int arg0, byte arg1) {
        try {
            field1331++;
            class29 var3 = this.field1329;
            synchronized (this.field1329) {
                this.field1329.method294(arg0, -630);
            }
            class29 var4 = this.field1324;
            synchronized (this.field1324) {
                this.field1324.method294(arg0, -630);
            }
            if (arg1 <= 51) {
                method877((byte) 22);
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field1333[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)V")
    public static final void method874(int arg0, int arg1) {
        try {
            field1330++;
            class494.field7429 = arg1;
            class289.field4640.method304(arg0 - 3455);
            if (arg0 != 3456) {
                field1327 = null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1333[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public final void method875(int arg0) {
        try {
            class29 var2 = this.field1329;
            synchronized (this.field1329) {
                this.field1329.method298(5);
            }
            field1322++;
            if (arg0 > -4) {
                this.field1325 = null;
            }
            class29 var3 = this.field1324;
            synchronized (this.field1324) {
                this.field1324.method298(5);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field1333[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
    public final void method876(int arg0) {
        try {
            field1332++;
            class29 var2 = this.field1329;
            synchronized (this.field1329) {
                this.field1329.method304(arg0 + 3562);
                if (arg0 != -3561) {
                    field1327 = null;
                }
            }
            class29 var3 = this.field1324;
            synchronized (this.field1324) {
                this.field1324.method304(1);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field1333[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public static void method877(byte arg0) {
        try {
            int var1 = -52 % ((-arg0 - 15) / 61);
            field1328 = null;
            field1327 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1333[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;IZZ)V")
    public static final void method878(String arg0, int arg1, boolean arg2, boolean arg3) {
        try {
            field1323++;
            class164.method1547(!arg3);
            if (arg1 == 0) {
                class662.field9437 = class114.method1098(class442.field6902, class177.field2861, class623.field8996.field6352.method3687(true) * 2, 0, class259.field3910, 0);
                if (arg0 != null) {
                    class662.field9437.method182(0);
                    class49 var4 = class588.method4319(0, class242.field3745, 0, class685.field9908);
                    class64 var5 = class662.field9437.method184(var4, class174.method1613(class550.field8065, class685.field9908, 0), true);
                    class592.method4345(true);
                    class567.method4167(true, (byte) 116, class662.field9437, var4, arg0, var5);
                }
            } else {
                class63 var6 = null;
                if (arg0 != null) {
                    var6 = class114.method1098(class442.field6902, class177.field2861, 0, 0, class259.field3910, 0);
                    var6.method182(0);
                    class49 var7 = class588.method4319(0, class242.field3745, 0, class685.field9908);
                    class64 var8 = var6.method184(var7, class174.method1613(class550.field8065, class685.field9908, 0), true);
                    class592.method4345(true);
                    class567.method4167(true, (byte) 127, var6, var7, arg0, var8);
                }
                boolean var26 = false;
                label253: {
                    try {
                        var26 = true;
                        class662.field9437 = class114.method1098(class442.field6902, class177.field2861, class623.field8996.field6352.method3687(true) * 2, arg1, class259.field3910, 0);
                        if (arg0 != null) {
                            var6.method182(0);
                            class49 var9 = class588.method4319(0, class242.field3745, 0, class685.field9908);
                            class64 var10 = var6.method184(var9, class174.method1613(class550.field8065, class685.field9908, 0), true);
                            class592.method4345(true);
                            class567.method4167(true, (byte) 124, var6, var9, arg0, var10);
                        }
                        if (class662.field9437.method152()) {
                            boolean var11 = true;
                            try {
                                var11 = class372.field6038.field11008 > 256;
                            } catch (Throwable var30) {
                            }
                            class437 var12;
                            if (var11) {
                                var12 = class662.field9437.method228(146800640);
                            } else {
                                var12 = class662.field9437.method228(104857600);
                            }
                            class662.field9437.method157(var12);
                            var26 = false;
                        } else {
                            var26 = false;
                        }
                        break label253;
                    } catch (Throwable var31) {
                        int var13 = class623.field8996.field6379.method4132(true);
                        if (var13 == 2) {
                            class554.field8108 = true;
                        }
                        class623.field8996.method3244(22733, class623.field8996.field6379, 0);
                        method878(arg0, var13, arg2, true);
                        Object var10000 = null;
                        var26 = false;
                    } finally {
                        if (var26) {
                            Object var18 = null;
                            if (var6 != null) {
                                try {
                                    var6.method668(-4369);
                                } catch (Throwable var27) {
                                }
                            }
                        }
                    }
                    if (var6 != null) {
                        try {
                            var6.method668(-4369);
                        } catch (Throwable var28) {
                        }
                    }
                    return;
                }
                Object var17 = null;
                if (var6 != null) {
                    try {
                        var6.method668(-4369);
                    } catch (Throwable var29) {
                    }
                }
            }
            class623.field8996.field6379.method4136(1, !arg2);
            class623.field8996.method3244(22733, class623.field8996.field6379, arg1);
            class513.method3854(arg3);
            class662.field9437.method270(10000);
            class662.field9437.method149(32);
            class400.field6321 = class662.field9437.method257();
            class461.field7105 = class662.field9437.method257();
            class279.method2394(-10660);
            class662.field9437.method246(class623.field8996.field6390.method4033(true) == 1);
            if (class662.field9437.method241()) {
                class410.method3288(class623.field8996.field6351.method2935(true) == 1, (byte) -110);
            }
            class334.method2817(class126.field1823 >> 3, class169.field2725 >> 3, class662.field9437, (byte) 50);
            class262.method2282(true);
            class746.field10999 = false;
            class550.field8069 = true;
            class333.field5443 = null;
            class44.method452(1);
        } catch (RuntimeException var33) {
            throw class590.method4333(var33, field1333[5] + (arg0 == null ? field1333[0] : field1333[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI)Lkw;")
    public final class260 method879(byte arg0, int arg1) {
        try {
            field1326++;
            class29 var3 = this.field1329;
            class260 var4;
            synchronized (this.field1329) {
                var4 = (class260) this.field1329.method302(-94, (long) arg1);
                if (arg0 <= 81) {
                    this.field1324 = null;
                }
            }
            if (var4 != null) {
                return var4;
            }
            class58 var5 = this.field1325;
            byte[] var6;
            synchronized (this.field1325) {
                var6 = this.field1325.method604((byte) -123, arg1, 46);
            }
            class260 var7 = new class260();
            var7.field3932 = this;
            if (var6 != null) {
                var7.method2188(0, new class176(var6));
            }
            class29 var8 = this.field1329;
            synchronized (this.field1329) {
                this.field1329.method295(false, (long) arg1, var7);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field1333[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lpo;ILgda;Lgda;)V")
    public class89(class585 arg0, int arg1, class58 arg2, class58 arg3) {
        try {
            this.field1321 = arg3;
            this.field1325 = arg2;
            this.field1325.method580(100, 46);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field1333[2] + (arg0 == null ? field1333[0] : field1333[1]) + ',' + arg1 + ',' + (arg2 == null ? field1333[0] : field1333[1]) + ',' + (arg3 == null ? field1333[0] : field1333[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method880(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method881(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 8;
                    break;
                case 1:
                    var10005 = 27;
                    break;
                case 2:
                    var10005 = 119;
                    break;
                case 3:
                    var10005 = 6;
                    break;
                default:
                    var10005 = 63;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
