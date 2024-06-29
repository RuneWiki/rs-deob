import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class268 {

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    private int field3393;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    private int field3386;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Leq;")
    public class357 field3390;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Z")
    private boolean field3389;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public int field3388;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Lmq;")
    public static class78 field3392 = new class78(4, -1);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BILet;I)V")
    public static final void method1607(byte arg0, int arg1, class718 arg2, int arg3) {
        if (arg0 != -16) {
            method1610(50);
        }
        field3387++;
        if (arg2 == null || class565.field7906.field7718 == arg2) {
            return;
        }
        int var4 = arg2.field10136;
        int var5 = arg2.field10130;
        int var6 = arg2.field10134;
        int var7 = (int) arg2.field10137;
        long var8 = arg2.field10137;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        if (var6 == 46) {
            class546 var10 = class447.field6287[var7];
            if (var10 != null) {
                class426.field6054 = 2;
                class145.field1721++;
                class125.field1499 = arg3;
                class260.field3300 = arg1;
                class747.field10445 = 0;
                class650 var11 = class314.method1837(class744.field10386, true, class625.field8727);
                var11.field8928.method1101(class563.field7893, arg0 ^ 0xFFFFFF0F);
                var11.field8928.method1134(111955568, class333.field4297.method2924(-30303, 82) ? 1 : 0);
                var11.field8928.method1101(var7, 255);
                var11.field8928.method1112(class545.field7651, -120);
                var11.field8928.method1116(class210.field2693, arg0 ^ 0xFFFFDA93);
                class108.method745(var11, arg0 - 55);
                class140.method867(0, 0, true, (byte) 50, var10.method253((byte) -27), -2, var10.field426[0], var10.method253((byte) -27), var10.field435[0]);
            }
        }
        if (var6 == 16) {
            class546 var12 = class447.field6287[var7];
            if (var12 != null) {
                class224.field2958++;
                class426.field6054 = 2;
                class125.field1499 = arg3;
                class747.field10445 = 0;
                class260.field3300 = arg1;
                class650 var13 = class314.method1837(class154.field1885, true, class625.field8727);
                var13.field8928.method1157(var7, (byte) 123);
                var13.field8928.method1134(111955568, class333.field4297.method2924(-30303, 82) ? 1 : 0);
                class108.method745(var13, -34);
                class140.method867(0, 0, true, (byte) 50, var12.method253((byte) -27), -2, var12.field426[0], var12.method253((byte) -27), var12.field435[0]);
            }
        }
        if (var6 == 10) {
            class426.field6054 = 1;
            class430.field6097++;
            class260.field3300 = arg1;
            class125.field1499 = arg3;
            class747.field10445 = 0;
            class650 var14 = class314.method1837(class174.field2268, true, class625.field8727);
            var14.field8928.method1112(class545.field7651, -125);
            var14.field8928.method1124((byte) 106, class63.field851 + var4);
            var14.field8928.method1116(class563.field7893, 9571);
            var14.field8928.method1101(class210.field2693, 255);
            var14.field8928.method1101(class753.field10509 + var5, arg0 + 271);
            class108.method745(var14, -85);
            class140.method867(0, 0, true, (byte) 50, 1, -4, var5, 1, var4);
        }
        if (var6 == 1007 || var6 == 1008 || var6 == 1009 || var6 == 1006 || var6 == 1004) {
            class290.method1748(var7, var4, 126, var6);
        }
        if (var6 == 5) {
            class518.field7290++;
            class125.field1499 = arg3;
            class747.field10445 = 0;
            class426.field6054 = 2;
            class260.field3300 = arg1;
            class650 var15 = class314.method1837(class11.field124, true, class625.field8727);
            var15.field8928.method1092(arg0 + 1905513352, class545.field7651);
            var15.field8928.method1124((byte) 106, class563.field7893);
            var15.field8928.method1124((byte) 106, class210.field2693);
            var15.field8928.method1121((byte) -106, class333.field4297.method2924(arg0 - 30287, 82) ? 1 : 0);
            var15.field8928.method1116(Integer.MAX_VALUE & (int) (var8 >>> 32), 9571);
            var15.field8928.method1124((byte) 106, class63.field851 + var4);
            var15.field8928.method1101(var5 + class753.field10509, 255);
            class108.method745(var15, -44);
            class358.method2199((byte) 75, var4, var5, var8);
        }
        if (var6 == 2) {
            class546 var16 = class447.field6287[var7];
            if (var16 != null) {
                class125.field1499 = arg3;
                class260.field3300 = arg1;
                class426.field6054 = 2;
                class297.field3853++;
                class747.field10445 = 0;
                class650 var17 = class314.method1837(class222.field2915, true, class625.field8727);
                var17.field8928.method1121((byte) -93, class333.field4297.method2924(-30303, 82) ? 1 : 0);
                var17.field8928.method1124((byte) 106, var7);
                class108.method745(var17, -43);
                class140.method867(0, 0, true, (byte) 50, var16.method253((byte) -27), -2, var16.field426[0], var16.method253((byte) -27), var16.field435[0]);
            }
        }
        if (var6 == 1012) {
            class747.field10445 = 0;
            class426.field6054 = 2;
            class125.field1499 = arg3;
            class260.field3300 = arg1;
            class247 var18 = (class247) class563.field7875.method3248((long) var7, 0);
            if (var18 != null) {
                class124 var19 = var18.field3158;
                class155 var20 = var19.field1486;
                if (var20.field1929 != null) {
                    var20 = var20.method968((byte) -76, class461.field6637);
                }
                if (var20 != null) {
                    class414.field5842++;
                    class650 var21 = class314.method1837(class666.field9122, true, class625.field8727);
                    var21.field8928.method1157(var20.field1920, (byte) 121);
                    class108.method745(var21, -104);
                }
            }
        }
        if (var6 == 50) {
            class426.field6054 = 2;
            class125.field1499 = arg3;
            class260.field3300 = arg1;
            class649.field8914++;
            class747.field10445 = 0;
            class650 var22 = class314.method1837(class682.field9342, true, class625.field8727);
            var22.field8928.method1124((byte) 106, class63.field851 + var4);
            var22.field8928.method1157(class753.field10509 + var5, (byte) 110);
            var22.field8928.method1116(Integer.MAX_VALUE & (int) (var8 >>> 32), 9571);
            var22.field8928.method1121((byte) -84, class333.field4297.method2924(arg0 - 30287, 82) ? 1 : 0);
            class108.method745(var22, arg0);
            class358.method2199((byte) 126, var4, var5, var8);
        }
        if (var6 == 48) {
            if (class408.field5753 > 0 && class333.field4297.method2924(-30303, 82) && class333.field4297.method2924(-30303, 81)) {
                class311.method1815(class63.field851 + var4, 63, class339.field4374.field5779, class753.field10509 + var5);
            } else {
                class650 var23 = class51.method424(var5, 116, var7, var4);
                if (var7 == 1) {
                    var23.field8928.method1141(-1, -63);
                    var23.field8928.method1141(-1, arg0 ^ 0x32);
                    var23.field8928.method1157((int) class748.field10471, (byte) 116);
                    var23.field8928.method1141(57, arg0 ^ 0x6D);
                    var23.field8928.method1141(class10.field112, 88);
                    var23.field8928.method1141(class3.field16, -112);
                    var23.field8928.method1141(89, arg0 - 38);
                    var23.field8928.method1157(class339.field4374.field5790, (byte) 112);
                    var23.field8928.method1157(class339.field4374.field5784, (byte) 126);
                    var23.field8928.method1141(63, arg0 ^ 0xFFFFFF99);
                } else {
                    class426.field6054 = 1;
                    class747.field10445 = 0;
                    class125.field1499 = arg3;
                    class260.field3300 = arg1;
                }
                class108.method745(var23, arg0 - 101);
                class140.method867(0, 0, true, (byte) 50, 1, -4, var5, 1, var4);
            }
        }
        if (var6 == 17) {
            class247 var24 = (class247) class563.field7875.method3248((long) var7, 0);
            if (var24 != null) {
                class426.field6054 = 2;
                class124 var25 = var24.field3158;
                class290.field3700++;
                class747.field10445 = 0;
                class260.field3300 = arg1;
                class125.field1499 = arg3;
                class650 var26 = class314.method1837(class298.field3863, true, class625.field8727);
                var26.field8928.method1132(112, class333.field4297.method2924(-30303, 82) ? 1 : 0);
                var26.field8928.method1157(var7, (byte) 114);
                class108.method745(var26, -13);
                class140.method867(0, 0, true, (byte) 50, var25.method253((byte) -27), -2, var25.field426[0], var25.method253((byte) -27), var25.field435[0]);
            }
        }
        if (var6 == 9) {
            class426.field6054 = 2;
            class747.field10445 = 0;
            class125.field1499 = arg3;
            class260.field3300 = arg1;
            class397.field5518++;
            class650 var27 = class314.method1837(class505.field7122, true, class625.field8727);
            var27.field8928.method1116(class753.field10509 + var5, 9571);
            var27.field8928.method1101(var7, 255);
            var27.field8928.method1116(class63.field851 + var4, 9571);
            var27.field8928.method1141(class333.field4297.method2924(-30303, 82) ? 1 : 0, -93);
            class108.method745(var27, -14);
            class66.method500(arg0 ^ 0x38D6, var4, var5);
        }
        if (var6 == 1003) {
            class260.field3300 = arg1;
            class125.field1499 = arg3;
            class426.field6054 = 2;
            class237.field3067++;
            class747.field10445 = 0;
            class650 var28 = class314.method1837(class159.field2045, true, class625.field8727);
            var28.field8928.method1132(arg0 + 128, class333.field4297.method2924(-30303, 82) ? 1 : 0);
            var28.field8928.method1124((byte) 106, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var28.field8928.method1157(var5 + class753.field10509, (byte) 113);
            var28.field8928.method1101(var4 + class63.field851, arg0 + 271);
            class108.method745(var28, -21);
            class358.method2199((byte) 20, var4, var5, var8);
        }
        if (var6 == 21 || var6 == 1011) {
            class107.method738(var5, var7, -127, arg2.field10124, var4);
        }
        if (var6 == 60) {
            class247 var29 = (class247) class563.field7875.method3248((long) var7, arg0 + 16);
            if (var29 != null) {
                class260.field3300 = arg1;
                class747.field10445 = 0;
                class604.field8377++;
                class124 var30 = var29.field3158;
                class426.field6054 = 2;
                class125.field1499 = arg3;
                class650 var31 = class314.method1837(class604.field8391, true, class625.field8727);
                var31.field8928.method1124((byte) 106, var7);
                var31.field8928.method1141(class333.field4297.method2924(arg0 ^ 0x7651, 82) ? 1 : 0, arg0 + 91);
                class108.method745(var31, -72);
                class140.method867(0, 0, true, (byte) 50, var30.method253((byte) -27), -2, var30.field426[0], var30.method253((byte) -27), var30.field435[0]);
            }
        }
        if (var6 == 6) {
            class546 var32 = class447.field6287[var7];
            if (var32 != null) {
                class747.field10445 = 0;
                class426.field6054 = 2;
                class125.field1499 = arg3;
                class260.field3300 = arg1;
                class57.field816++;
                class650 var33 = class314.method1837(class118.field1444, true, class625.field8727);
                var33.field8928.method1134(111955568, class333.field4297.method2924(-30303, 82) ? 1 : 0);
                var33.field8928.method1157(var7, (byte) 115);
                class108.method745(var33, arg0 ^ 0x14);
                class140.method867(0, 0, true, (byte) 50, var32.method253((byte) -27), -2, var32.field426[0], var32.method253((byte) -27), var32.field435[0]);
            }
        }
        if (var6 == 12) {
            class747.field10445 = 0;
            class260.field3300 = arg1;
            class125.field1499 = arg3;
            class618.field8632++;
            class426.field6054 = 2;
            class650 var34 = class314.method1837(class271.field3430, true, class625.field8727);
            var34.field8928.method1124((byte) 106, var7);
            var34.field8928.method1134(arg0 + 111955584, class333.field4297.method2924(arg0 ^ 0x7651, 82) ? 1 : 0);
            var34.field8928.method1116(class753.field10509 + var5, 9571);
            var34.field8928.method1116(class63.field851 + var4, 9571);
            class108.method745(var34, arg0 ^ 0x5F);
            class66.method500(-14554, var4, var5);
        }
        if (var6 == 19) {
            class260.field3300 = arg1;
            class125.field1499 = arg3;
            class52.field767++;
            class426.field6054 = 2;
            class747.field10445 = 0;
            class650 var35 = class314.method1837(class476.field6804, true, class625.field8727);
            var35.field8928.method1134(arg0 ^ 0xF953B180, class333.field4297.method2924(arg0 - 30287, 82) ? 1 : 0);
            var35.field8928.method1101(class63.field851 + var4, 255);
            var35.field8928.method1157(var7, (byte) 119);
            var35.field8928.method1101(class753.field10509 + var5, 255);
            class108.method745(var35, -27);
            class66.method500(-14554, var4, var5);
        }
        if (var6 == 3) {
            class260.field3300 = arg1;
            class177.field2287++;
            class747.field10445 = 0;
            class125.field1499 = arg3;
            class426.field6054 = 2;
            class650 var36 = class314.method1837(class239.field3083, true, class625.field8727);
            var36.field8928.method1124((byte) 106, var5 + class753.field10509);
            var36.field8928.method1124((byte) 106, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var36.field8928.method1124((byte) 106, var4 + class63.field851);
            var36.field8928.method1132(arg0 + 142, class333.field4297.method2924(arg0 ^ 0x7651, 82) ? 1 : 0);
            class108.method745(var36, -90);
            class358.method2199((byte) 43, var4, var5, var8);
        }
        if (var6 == 58) {
            class247 var37 = (class247) class563.field7875.method3248((long) var7, 0);
            if (var37 != null) {
                class625.field8712++;
                class747.field10445 = 0;
                class260.field3300 = arg1;
                class125.field1499 = arg3;
                class124 var38 = var37.field3158;
                class426.field6054 = 2;
                class650 var39 = class314.method1837(class704.field9934, true, class625.field8727);
                var39.field8928.method1157(class563.field7893, (byte) 116);
                var39.field8928.method1147(23689, class545.field7651);
                var39.field8928.method1157(var7, (byte) 116);
                var39.field8928.method1121((byte) -99, class333.field4297.method2924(arg0 - 30287, 82) ? 1 : 0);
                var39.field8928.method1101(class210.field2693, 255);
                class108.method745(var39, -102);
                class140.method867(0, 0, true, (byte) 50, var38.method253((byte) -27), -2, var38.field426[0], var38.method253((byte) -27), var38.field435[0]);
            }
        }
        if (var6 == 57) {
            class546 var40 = class447.field6287[var7];
            if (var40 != null) {
                class125.field1499 = arg3;
                class260.field3300 = arg1;
                class747.field10440++;
                class426.field6054 = 2;
                class747.field10445 = 0;
                class650 var41 = class314.method1837(class48.field710, true, class625.field8727);
                var41.field8928.method1132(121, class333.field4297.method2924(-30303, 82) ? 1 : 0);
                var41.field8928.method1124((byte) 106, var7);
                class108.method745(var41, -110);
                class140.method867(0, 0, true, (byte) 50, var40.method253((byte) -27), -2, var40.field426[0], var40.method253((byte) -27), var40.field435[0]);
            }
        }
        if (var6 == 59 && class419.field5958 == null) {
            class15.method193((byte) -77, var5, var4);
            class419.field5958 = class611.method3340(var4, var5, arg0 ^ 0x72);
            class663.method3591(16886, class419.field5958);
        }
        if (var6 == 45) {
            class546 var42 = class447.field6287[var7];
            if (var42 != null) {
                class260.field3300 = arg1;
                class747.field10445 = 0;
                class667.field9124++;
                class426.field6054 = 2;
                class125.field1499 = arg3;
                class650 var43 = class314.method1837(class657.field9027, true, class625.field8727);
                var43.field8928.method1101(var7, 255);
                var43.field8928.method1134(111955568, class333.field4297.method2924(-30303, 82) ? 1 : 0);
                class108.method745(var43, -98);
                class140.method867(0, 0, true, (byte) 50, var42.method253((byte) -27), -2, var42.field426[0], var42.method253((byte) -27), var42.field435[0]);
            }
        }
        if (var6 == 11) {
            class460 var44 = class611.method3340(var4, var5, -125);
            if (var44 != null) {
                class498.method2890(-121, var44);
            }
        }
        if (var6 == 15) {
            class247 var45 = (class247) class563.field7875.method3248((long) var7, arg0 ^ 0xFFFFFFF0);
            if (var45 != null) {
                class125.field1499 = arg3;
                class260.field3300 = arg1;
                class747.field10445 = 0;
                class576.field8036++;
                class426.field6054 = 2;
                class124 var46 = var45.field3158;
                class650 var47 = class314.method1837(class497.field7029, true, class625.field8727);
                var47.field8928.method1132(125, class333.field4297.method2924(-30303, 82) ? 1 : 0);
                var47.field8928.method1157(var7, (byte) 114);
                class108.method745(var47, arg0 - 64);
                class140.method867(0, 0, true, (byte) 50, var46.method253((byte) -27), -2, var46.field426[0], var46.method253((byte) -27), var46.field435[0]);
            }
        }
        if (var6 == 30) {
            class460 var48 = class611.method3340(var4, var5, -87);
            if (var48 != null) {
                class463.method2742((byte) 88);
                class28 var49 = client.method715(var48);
                class758.method4216(var49.field466, -11302, var48, var49.method291(54));
                class556.field7800 = class58.method456(5, var48);
                class741.field10370 = var48.field6576 + "<col=ffffff>";
                if (class556.field7800 == null) {
                    class556.field7800 = "Null";
                }
            }
            return;
        }
        if (var6 == 49) {
            if (class408.field5753 > 0 && class333.field4297.method2924(arg0 ^ 0x7651, 82) && class333.field4297.method2924(-30303, 81)) {
                class311.method1815(class63.field851 + var4, arg0 + 79, class339.field4374.field5779, class753.field10509 + var5);
            } else {
                class426.field6054 = 1;
                class747.field10445 = 0;
                class125.field1499 = arg3;
                class169.field2224++;
                class260.field3300 = arg1;
                class650 var50 = class314.method1837(class74.field990, true, class625.field8727);
                var50.field8928.method1157(class753.field10509 + var5, (byte) 126);
                var50.field8928.method1157(class63.field851 + var4, (byte) 125);
                class108.method745(var50, arg0 - 76);
            }
        }
        if (var6 == 44) {
            class642.field8867++;
            class125.field1499 = arg3;
            class747.field10445 = 0;
            class260.field3300 = arg1;
            class426.field6054 = 2;
            class650 var51 = class314.method1837(class108.field1335, true, class625.field8727);
            var51.field8928.method1132(114, class333.field4297.method2924(-30303, 82) ? 1 : 0);
            var51.field8928.method1157(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) 121);
            var51.field8928.method1116(var4 + class63.field851, 9571);
            var51.field8928.method1101(var5 + class753.field10509, arg0 ^ 0xFFFFFF0F);
            class108.method745(var51, -119);
            class358.method2199((byte) 41, var4, var5, var8);
        }
        if (var6 == 23) {
            class125.field1499 = arg3;
            class11.field121++;
            class426.field6054 = 2;
            class747.field10445 = 0;
            class260.field3300 = arg1;
            class650 var52 = class314.method1837(class393.field5483, true, class625.field8727);
            var52.field8928.method1116(class753.field10509 + var5, 9571);
            var52.field8928.method1124((byte) 106, var7);
            var52.field8928.method1157(var4 + class63.field851, (byte) 117);
            var52.field8928.method1141(class333.field4297.method2924(-30303, 82) ? 1 : 0, 68);
            class108.method745(var52, -109);
            class66.method500(-14554, var4, var5);
        }
        if (var6 == 13) {
            class546 var53 = class447.field6287[var7];
            if (var53 != null) {
                class125.field1499 = arg3;
                class449.field6311++;
                class260.field3300 = arg1;
                class747.field10445 = 0;
                class426.field6054 = 2;
                class650 var54 = class314.method1837(class83.field1077, true, class625.field8727);
                var54.field8928.method1157(var7, (byte) 115);
                var54.field8928.method1141(class333.field4297.method2924(arg0 ^ 0x7651, 82) ? 1 : 0, 61);
                class108.method745(var54, -64);
                class140.method867(0, 0, true, (byte) 50, var53.method253((byte) -27), -2, var53.field426[0], var53.method253((byte) -27), var53.field435[0]);
            }
        }
        if (var6 == 1002) {
            class426.field6054 = 2;
            class125.field1499 = arg3;
            class33.field517++;
            class747.field10445 = 0;
            class260.field3300 = arg1;
            class650 var55 = class314.method1837(class676.field9187, true, class625.field8727);
            var55.field8928.method1157(var7, (byte) 111);
            class108.method745(var55, arg0 ^ 0x5C);
        }
        if (var6 == 22) {
            class247 var56 = (class247) class563.field7875.method3248((long) var7, arg0 + 16);
            if (var56 != null) {
                class124 var57 = var56.field3158;
                class426.field6054 = 2;
                class125.field1499 = arg3;
                class747.field10445 = 0;
                class260.field3300 = arg1;
                class452.field6338++;
                class650 var58 = class314.method1837(class294.field3839, true, class625.field8727);
                var58.field8928.method1101(var7, arg0 + 271);
                var58.field8928.method1141(class333.field4297.method2924(-30303, 82) ? 1 : 0, -121);
                class108.method745(var58, arg0 - 78);
                class140.method867(0, 0, true, (byte) 50, var57.method253((byte) -27), -2, var57.field426[0], var57.method253((byte) -27), var57.field435[0]);
            }
        }
        if (var6 == 4) {
            class747.field10445 = 0;
            class125.field1499 = arg3;
            class426.field6054 = 2;
            class260.field3300 = arg1;
            class554.field7783++;
            class650 var59 = class314.method1837(class250.field3178, true, class625.field8727);
            var59.field8928.method1157(class753.field10509 + var5, (byte) 112);
            var59.field8928.method1116(var7, 9571);
            var59.field8928.method1101(var4 + class63.field851, arg0 ^ 0xFFFFFF0F);
            var59.field8928.method1141(class333.field4297.method2924(-30303, 82) ? 1 : 0, -62);
            class108.method745(var59, -71);
            class66.method500(-14554, var4, var5);
        }
        if (var6 == 18) {
            class546 var60 = class447.field6287[var7];
            if (var60 != null) {
                class426.field6054 = 2;
                class747.field10445 = 0;
                class125.field1499 = arg3;
                class201.field2565++;
                class260.field3300 = arg1;
                class650 var61 = class314.method1837(class336.field4325, true, class625.field8727);
                var61.field8928.method1124((byte) 106, var7);
                var61.field8928.method1132(122, class333.field4297.method2924(-30303, 82) ? 1 : 0);
                class108.method745(var61, arg0 - 17);
                class140.method867(0, 0, true, (byte) 50, var60.method253((byte) -27), -2, var60.field426[0], var60.method253((byte) -27), var60.field435[0]);
            }
        }
        if (var6 == 51) {
            class747.field10445 = 0;
            class125.field1499 = arg3;
            class260.field3300 = arg1;
            class426.field6054 = 2;
            class704.field9926++;
            class650 var62 = class314.method1837(class111.field1360, true, class625.field8727);
            var62.field8928.method1121((byte) -91, class333.field4297.method2924(arg0 ^ 0x7651, 82) ? 1 : 0);
            var62.field8928.method1101(var5 + class753.field10509, 255);
            var62.field8928.method1124((byte) 106, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            var62.field8928.method1101(var4 + class63.field851, arg0 + 271);
            class108.method745(var62, -107);
            class358.method2199((byte) 84, var4, var5, var8);
        }
        if (var6 == 8) {
            class247 var63 = (class247) class563.field7875.method3248((long) var7, 0);
            if (var63 != null) {
                class426.field6054 = 2;
                class124 var64 = var63.field3158;
                class747.field10445 = 0;
                class524.field7411++;
                class260.field3300 = arg1;
                class125.field1499 = arg3;
                class650 var65 = class314.method1837(class373.field5244, true, class625.field8727);
                var65.field8928.method1157(var7, (byte) 112);
                var65.field8928.method1121((byte) -83, class333.field4297.method2924(-30303, 82) ? 1 : 0);
                class108.method745(var65, -107);
                class140.method867(0, 0, true, (byte) 50, var64.method253((byte) -27), -2, var64.field426[0], var64.method253((byte) -27), var64.field435[0]);
            }
        }
        if (var6 == 25) {
            class125.field1499 = arg3;
            class747.field10445 = 0;
            class260.field3300 = arg1;
            class426.field6054 = 2;
            class200.field2557++;
            class650 var66 = class314.method1837(class666.field9121, true, class625.field8727);
            var66.field8928.method1124((byte) 106, class753.field10509 + var5);
            var66.field8928.method1112(class545.field7651, arg0 ^ 0x71);
            var66.field8928.method1157(var7, (byte) 117);
            var66.field8928.method1116(class210.field2693, 9571);
            var66.field8928.method1157(class563.field7893, (byte) 125);
            var66.field8928.method1134(arg0 ^ 0xF953B180, class333.field4297.method2924(arg0 - 30287, 82) ? 1 : 0);
            var66.field8928.method1116(class63.field851 + var4, arg0 ^ 0xFFFFDA93);
            class108.method745(var66, arg0 ^ 0x42);
            class66.method500(arg0 - 14538, var4, var5);
        }
        if (var6 == 1010) {
            class426.field6054 = 2;
            class531.field7479++;
            class125.field1499 = arg3;
            class747.field10445 = 0;
            class260.field3300 = arg1;
            class650 var67 = class314.method1837(class270.field3420, true, class625.field8727);
            var67.field8928.method1157(var7, (byte) 125);
            class108.method745(var67, -20);
        }
        if (var6 == 47) {
            class125.field1499 = arg3;
            class426.field6054 = 2;
            class747.field10445 = 0;
            class145.field1721++;
            class260.field3300 = arg1;
            class650 var68 = class314.method1837(class744.field10386, true, class625.field8727);
            var68.field8928.method1101(class563.field7893, 255);
            var68.field8928.method1134(111955568, class333.field4297.method2924(-30303, 82) ? 1 : 0);
            var68.field8928.method1101(class339.field4374.field354, 255);
            var68.field8928.method1112(class545.field7651, -118);
            var68.field8928.method1116(class210.field2693, 9571);
            class108.method745(var68, -7);
        }
        if (var6 == 20) {
            class546 var69 = class447.field6287[var7];
            if (var69 != null) {
                class260.field3300 = arg1;
                class747.field10445 = 0;
                class234.field3025++;
                class426.field6054 = 2;
                class125.field1499 = arg3;
                class650 var70 = class314.method1837(class138.field1655, true, class625.field8727);
                var70.field8928.method1121((byte) -95, class333.field4297.method2924(-30303, 82) ? 1 : 0);
                var70.field8928.method1124((byte) 106, var7);
                class108.method745(var70, -39);
                class140.method867(0, 0, true, (byte) 50, var69.method253((byte) -27), -2, var69.field426[0], var69.method253((byte) -27), var69.field435[0]);
            }
        }
        if (class138.field1656) {
            class463.method2742((byte) 88);
        }
        if (class542.field7639 != null && class623.field8702 == 0) {
            class663.method3591(16886, class542.field7639);
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
    public abstract void method1608(int arg0);

    @OriginalMember(owner = "client!pc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field3385++;
        this.field3390.method2175(this.field3393, this.field3388, 1);
        super.finalize();
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[BI)V")
    public final void method1609(int arg0, byte[] arg1, int arg2) {
        field3391++;
        if (arg2 != 1949) {
            method1610(88);
        }
        this.method1608(23188);
        if (this.field3393 < arg0) {
            OpenGL.glBufferDataARBub(this.field3386, arg0, arg1, 0, this.field3389 ? 35040 : 35044);
            this.field3390.field4974 += arg0 - this.field3393;
            this.field3393 = arg0;
        } else {
            OpenGL.glBufferSubDataARBub(this.field3386, 0, arg0, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
    public static void method1610(int arg0) {
        field3392 = null;
        if (arg0 != -32028) {
            field3392 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Leq;I[BIZ)V")
    public class268(class357 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field3393 = arg3;
        this.field3386 = arg1;
        this.field3390 = arg0;
        this.field3389 = arg4;
        OpenGL.glGenBuffersARB(1, class673.field9168, 0);
        this.field3388 = class673.field9168[0];
        this.method1608(23188);
        OpenGL.glBufferDataARBub(arg1, this.field3393, arg2, 0, this.field3389 ? 35040 : 35044);
        this.field3390.field4974 += this.field3393;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Leq;ILjaclib/memory/Buffer;IZ)V")
    public class268(class357 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field3390 = arg0;
        this.field3386 = arg1;
        this.field3393 = arg3;
        this.field3389 = arg4;
        OpenGL.glGenBuffersARB(1, class673.field9168, 0);
        this.field3388 = class673.field9168[0];
        this.method1608(23188);
        OpenGL.glBufferDataARBa(arg1, this.field3393, arg2.getAddress(), this.field3389 ? 35040 : 35044);
        this.field3390.field4974 += this.field3393;
    }
}
