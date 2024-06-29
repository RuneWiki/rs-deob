import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class8 extends class28 {

    @OriginalMember(owner = "client!ag", name = "M", descriptor = "Lqe;")
    private class179 field253 = class66.field1341;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "Lqe;")
    public static class179 field239 = class206.method1380(":duelfriend:", (byte) 68);

    @OriginalMember(owner = "client!ag", name = "C", descriptor = "Lqe;")
    private static class179 field244 = class206.method1380("slide:", (byte) -128);

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "[Lee;")
    public static class49[] field242 = new class49[256];

    @OriginalMember(owner = "client!ag", name = "I", descriptor = "Lqe;")
    private static class179 field249 = class206.method1380("No response from server)3", (byte) -2);

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "Lqe;")
    public static class179 field241 = field244;

    @OriginalMember(owner = "client!ag", name = "J", descriptor = "Lqe;")
    public static class179 field250 = field249;

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "Lqe;")
    public static class179 field254 = field244;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!ag", name = "D", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!ag", name = "E", descriptor = "I")
    public int field246;

    @OriginalMember(owner = "client!ag", name = "H", descriptor = "I")
    public int field248;

    @OriginalMember(owner = "client!ag", name = "K", descriptor = "I")
    private int field251;

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!ag", name = "G", descriptor = "Lnc;")
    private class144 field247;

    @OriginalMember(owner = "client!ag", name = "B", descriptor = "Leh;")
    public static class52 field243;

    @OriginalMember(owner = "client!ag", name = "L", descriptor = "Leh;")
    public static class52 field252;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)I")
    public final int method50(int arg0, byte arg1) {
        field240++;
        if (this.field247 == null) {
            return this.field251;
        }
        if (arg1 != -57) {
            this.method51(-6, (byte) -34, null);
        }
        class43 var3 = (class43) this.field247.method909(-1, (long) arg0);
        return var3 == null ? this.field251 : var3.field931;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IBLra;)V")
    private final void method51(int arg0, byte arg1, class185 arg2) {
        field238++;
        if (arg1 != -18) {
            field241 = null;
        }
        if (arg0 == 1) {
            this.field248 = arg2.method1243(3);
        } else if (arg0 == 2) {
            this.field246 = arg2.method1243(3);
        } else if (arg0 == 3) {
            this.field253 = arg2.method1242(-97);
        } else if (arg0 == 4) {
            this.field251 = arg2.method1231(-4898);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg2.method1252(arg1 ^ 0xFFFFFFEC);
            this.field247 = new class144(class125.method789(arg1 - 105, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1231(-4898);
                class89 var7;
                if (arg0 == 5) {
                    var7 = new class123(arg2.method1242(-99));
                } else {
                    var7 = new class43(arg2.method1231(-4898));
                }
                this.field247.method914((long) var6, var7, true);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLra;)V")
    public final void method52(byte arg0, class185 arg1) {
        if (arg0 <= 56) {
            return;
        }
        field255++;
        while (true) {
            int var3 = arg1.method1243(3);
            if (var3 == 0) {
                return;
            }
            this.method51(var3, (byte) -18, arg1);
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
    public static void method53(int arg0) {
        field250 = null;
        field254 = null;
        field239 = null;
        field252 = null;
        field244 = null;
        field249 = null;
        field242 = null;
        if (arg0 >= -44) {
            field244 = null;
        }
        field243 = null;
        field241 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V")
    public static final void method54(int arg0, int arg1) {
        field245++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class2.field21[arg0];
        int var3 = class109.field2038[arg0];
        int var4 = class23.field552[arg0];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = (int) class238.field4389[arg0];
        long var6 = class238.field4389[arg0];
        if (var4 == 1004) {
            class190.field3540++;
            class163.method1046(var2, var6, arg1 ^ 0xD9, var3);
            class81.field1564.method70((byte) -62, 23);
            class81.field1564.method1222((byte) -94, class2.field26 + var2);
            class81.field1564.method1222((byte) -112, class141.field2582 + var3);
            class81.field1564.method1222((byte) -87, (int) (var6 >>> 32) & Integer.MAX_VALUE);
        }
        if (var4 == 26) {
            class6 var8 = class87.method580(var3, arg1 ^ 0xFD);
            boolean var9 = true;
            if (var8.field220 > 0) {
                var9 = class226.method1483(112, var8);
            }
            if (var9) {
                class237.field4381++;
                class81.field1564.method70((byte) -62, 85);
                class81.field1564.method1229((byte) -98, var3);
            }
        }
        if (var4 == 58) {
            class15.field413++;
            class163.method1046(var2, var6, 115, var3);
            class81.field1564.method70((byte) -62, 236);
            class81.field1564.method1222((byte) -116, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class81.field1564.method1222((byte) -126, class141.field2582 + var3);
            class81.field1564.method1222((byte) -93, class2.field26 + var2);
        }
        if (var4 == 49) {
            class177.field3223++;
            boolean var10 = class190.method1278(2, var2, 0, var3, 107, false, 0, class61.field1298.field3160[0], 0, 0, class61.field1298.field3200[0], 0);
            if (!var10) {
                class190.method1278(2, var2, 0, var3, 90, false, 0, class61.field1298.field3160[0], 1, 0, class61.field1298.field3200[0], 1);
            }
            class42.field909 = 2;
            class98.field1838 = class68.field1361;
            class36.field799 = class175.field3141;
            class52.field1095 = 0;
            class81.field1564.method70((byte) -62, 70);
            class81.field1564.method1246(class2.field26 + var2, 91);
            class81.field1564.method1236(-26162, var5);
            class81.field1564.method1246(class167.field3024, 123);
            class81.field1564.method1233((byte) -63, class56.field1233);
            class81.field1564.method1246(class141.field2582 + var3, arg1 ^ 0xE7);
        }
        if (var4 == 6) {
            class115 var12 = class23.field554[var5];
            if (var12 != null) {
                class190.method1278(2, var12.field3200[0], 0, var12.field3160[0], 46, false, 0, class61.field1298.field3160[0], 1, 0, class61.field1298.field3200[0], 1);
                class98.field1838 = class68.field1361;
                class42.field909 = 2;
                class36.field799 = class175.field3141;
                class217.field4013++;
                class52.field1095 = 0;
                class81.field1564.method70((byte) -62, 63);
                class81.field1564.method1229((byte) -71, class56.field1233);
                class81.field1564.method1208(-28417, var5);
                class81.field1564.method1246(class167.field3024, arg1 - 83);
            }
        }
        if (var4 == 1007) {
            class52.field1095 = 0;
            class42.field909 = 2;
            class36.field799 = class175.field3141;
            class98.field1838 = class68.field1361;
            class239.field4398++;
            class81.field1564.method70((byte) -62, 79);
            class81.field1564.method1236(arg1 ^ 0xFFFF997A, var5);
        }
        if (var4 == 35) {
            class167.field3001++;
            class81.field1564.method70((byte) -62, 159);
            class81.field1564.method1222((byte) -92, var2);
            class81.field1564.method1233((byte) 79, var3);
            class81.field1564.method1222((byte) -80, var5);
            class108.field2017 = 0;
            class208.field3895 = class87.method580(var3, arg1 - 131);
            class175.field3132 = var2;
        }
        if (var4 == 17) {
            class115 var13 = class23.field554[var5];
            if (var13 != null) {
                class190.method1278(2, var13.field3200[0], 0, var13.field3160[0], 51, false, 0, class61.field1298.field3160[0], 1, 0, class61.field1298.field3200[0], 1);
                class98.field1838 = class68.field1361;
                class94.field1766++;
                class36.field799 = class175.field3141;
                class42.field909 = 2;
                class52.field1095 = 0;
                class81.field1564.method70((byte) -62, 247);
                class81.field1564.method1236(-26162, var5);
            }
        }
        if (var4 == 46) {
            class113.field2125++;
            class81.field1564.method70((byte) -62, 59);
            class81.field1564.method1236(-26162, var2);
            class81.field1564.method1208(-28417, var5);
            class81.field1564.method1201(var3, -93);
            class108.field2017 = 0;
            class208.field3895 = class87.method580(var3, 112);
            class175.field3132 = var2;
        }
        if (var4 == 19) {
            class198.method1322(16777216);
            class6 var14 = class87.method580(var3, 51);
            class71.field1419 = var5;
            class73.field1436 = var3;
            class172.field3086 = 1;
            class208.field3912 = var2;
            class139.method880(var14, arg1 - 61);
            class114.field2139 = class78.method502((byte) -101, new class179[] { class207.field3866, class131.method835((byte) -20, var5).field418, class2.field24 });
            if (class114.field2139 == null) {
                class114.field2139 = class22.field540;
            }
            return;
        }
        if (var4 == 45) {
            class70.field1412++;
            boolean var15 = class190.method1278(2, var2, 0, var3, 113, false, 0, class61.field1298.field3160[0], 0, 0, class61.field1298.field3200[0], 0);
            if (!var15) {
                class190.method1278(2, var2, 0, var3, 60, false, 0, class61.field1298.field3160[0], 1, 0, class61.field1298.field3200[0], 1);
            }
            class52.field1095 = 0;
            class98.field1838 = class68.field1361;
            class36.field799 = class175.field3141;
            class42.field909 = 2;
            class81.field1564.method70((byte) -62, 125);
            class81.field1564.method1208(-28417, class208.field3912);
            class81.field1564.method1208(-28417, class2.field26 + var2);
            class81.field1564.method1229((byte) -64, class73.field1436);
            class81.field1564.method1246(var3 + class141.field2582, arg1 + -80);
            class81.field1564.method1222((byte) -84, var5);
            class81.field1564.method1208(-28417, class71.field1419);
        }
        if (var4 == 50) {
            class6 var17 = class227.method1485(var2, var3, (byte) 126);
            if (var17 != null) {
                class198.method1322(16777216);
                class88.method584(class226.method1479(arg1 - 105, class159.method1026(var17, arg1 + -1493540500)), 6, var3, var2);
                class172.field3086 = 0;
                class195.field3630 = class108.method708(-32755, var17);
                if (class195.field3630 == null) {
                    class195.field3630 = class69.field1390;
                }
                if (var17.field108) {
                    class187.field3487 = class78.method502((byte) -108, new class179[] { var17.field198, class2.field24 });
                    return;
                }
                class187.field3487 = class78.method502((byte) -116, new class179[] { class134.field2464, var17.field189, class2.field24 });
            }
            return;
        }
        if (var4 == 29) {
            class81.field1564.method70((byte) -62, 32);
            class56.field1229++;
            class81.field1564.method1229((byte) -119, var3);
            class81.field1564.method1236(-26162, var5);
            class81.field1564.method1222((byte) -118, var2);
            class108.field2017 = 0;
            class208.field3895 = class87.method580(var3, 43);
            class175.field3132 = var2;
        }
        if (var4 == 14 && class120.field2249 == null) {
            class198.method1320(var3, 0, var2);
            class120.field2249 = class227.method1485(var2, var3, (byte) 121);
            class139.method880(class120.field2249, arg1 ^ 0xCE);
        }
        if (var4 == 3) {
            class115 var18 = class23.field554[var5];
            if (var18 != null) {
                class180.field3339++;
                class190.method1278(2, var18.field3200[0], 0, var18.field3160[0], arg1 ^ 0xD8, false, 0, class61.field1298.field3160[0], 1, 0, class61.field1298.field3200[0], 1);
                class42.field909 = 2;
                class52.field1095 = 0;
                class98.field1838 = class68.field1361;
                class36.field799 = class175.field3141;
                class81.field1564.method70((byte) -62, 180);
                class81.field1564.method1208(arg1 ^ 0xFFFF904B, var5);
            }
        }
        if (var4 == 32) {
            class115 var19 = class23.field554[var5];
            if (var19 != null) {
                class34.field763++;
                class190.method1278(2, var19.field3200[0], 0, var19.field3160[0], 101, false, 0, class61.field1298.field3160[0], 1, 0, class61.field1298.field3200[0], 1);
                class98.field1838 = class68.field1361;
                class42.field909 = 2;
                class52.field1095 = 0;
                class36.field799 = class175.field3141;
                class81.field1564.method70((byte) -62, 35);
                class81.field1564.method1222((byte) -115, var5);
            }
        }
        if (var4 == 21) {
            class115 var20 = class23.field554[var5];
            if (var20 != null) {
                class190.method1278(2, var20.field3200[0], 0, var20.field3160[0], 25, false, 0, class61.field1298.field3160[0], 1, 0, class61.field1298.field3200[0], 1);
                class66.field1348++;
                class52.field1095 = 0;
                class36.field799 = class175.field3141;
                class42.field909 = 2;
                class98.field1838 = class68.field1361;
                class81.field1564.method70((byte) -62, 239);
                class81.field1564.method1246(var5, -77);
            }
        }
        if (var4 == 47) {
            class188 var21 = class53.field1152[var5];
            if (var21 != null) {
                class49.field1040++;
                class190.method1278(2, var21.field3200[0], 0, var21.field3160[0], 106, false, 0, class61.field1298.field3160[0], 1, 0, class61.field1298.field3200[0], 1);
                class52.field1095 = 0;
                class98.field1838 = class68.field1361;
                class42.field909 = 2;
                class36.field799 = class175.field3141;
                class81.field1564.method70((byte) -62, 209);
                class81.field1564.method1208(-28417, var5);
            }
        }
        if (var4 == 1001) {
            class98.field1838 = class68.field1361;
            class36.field799 = class175.field3141;
            class42.field909 = 2;
            class52.field1095 = 0;
            class188 var22 = class53.field1152[var5];
            if (var22 != null) {
                class180 var23 = var22.field3496;
                if (var23.field3305 != null) {
                    var23 = var23.method1179((byte) 64);
                }
                if (var23 != null) {
                    class81.field1564.method70((byte) -62, 233);
                    class81.field1564.method1208(-28417, var23.field3324);
                    class173.field3096++;
                }
            }
        }
        if (var4 == 42) {
            class188 var24 = class53.field1152[var5];
            if (var24 != null) {
                class190.method1278(2, var24.field3200[0], 0, var24.field3160[0], 94, false, 0, class61.field1298.field3160[0], 1, 0, class61.field1298.field3200[0], 1);
                class42.field909 = 2;
                class190.field3535++;
                class36.field799 = class175.field3141;
                class98.field1838 = class68.field1361;
                class52.field1095 = 0;
                class81.field1564.method70((byte) -62, 228);
                class81.field1564.method1233((byte) 66, class73.field1436);
                class81.field1564.method1222((byte) -114, class71.field1419);
                class81.field1564.method1222((byte) -95, class208.field3912);
                class81.field1564.method1236(-26162, var5);
            }
        }
        if (var4 == 40) {
            class115 var25 = class23.field554[var5];
            if (var25 != null) {
                class190.method1278(2, var25.field3200[0], 0, var25.field3160[0], 28, false, 0, class61.field1298.field3160[0], 1, 0, class61.field1298.field3200[0], 1);
                class98.field1838 = class68.field1361;
                class52.field1095 = 0;
                class42.field909 = 2;
                class36.field799 = class175.field3141;
                class116.field2194++;
                class81.field1564.method70((byte) -62, 183);
                class81.field1564.method1222((byte) -102, var5);
            }
        }
        if (var4 == 33) {
            class188 var26 = class53.field1152[var5];
            if (var26 != null) {
                class190.method1278(2, var26.field3200[0], 0, var26.field3160[0], arg1 - 64, false, 0, class61.field1298.field3160[0], 1, 0, class61.field1298.field3200[0], 1);
                class98.field1838 = class68.field1361;
                class42.field909 = 2;
                class195.field3626++;
                class36.field799 = class175.field3141;
                class52.field1095 = 0;
                class81.field1564.method70((byte) -62, 220);
                class81.field1564.method1236(-26162, var5);
            }
        }
        if (var4 == 23) {
            class115 var27 = class23.field554[var5];
            if (var27 != null) {
                class190.method1278(2, var27.field3200[0], 0, var27.field3160[0], 48, false, 0, class61.field1298.field3160[0], 1, 0, class61.field1298.field3200[0], 1);
                class182.field3362++;
                class98.field1838 = class68.field1361;
                class42.field909 = 2;
                class52.field1095 = 0;
                class36.field799 = class175.field3141;
                class81.field1564.method70((byte) -62, 121);
                class81.field1564.method1216((byte) 112, class73.field1436);
                class81.field1564.method1208(-28417, var5);
                class81.field1564.method1236(-26162, class208.field3912);
                class81.field1564.method1246(class71.field1419, arg1 ^ 0xC6);
            }
        }
        if (var4 == 15) {
            class81.field1564.method70((byte) -62, 118);
            class81.field1564.method1246(class167.field3024, 89);
            class38.field827++;
            class81.field1564.method1229((byte) -87, class56.field1233);
            class81.field1564.method1216((byte) 112, var3);
            class81.field1564.method1236(arg1 ^ 0xFFFF997A, var2);
        }
        if (var4 == 37) {
            class61.field1293++;
            boolean var28 = class190.method1278(2, var2, 0, var3, 109, false, 0, class61.field1298.field3160[0], 0, 0, class61.field1298.field3200[0], 0);
            if (!var28) {
                class190.method1278(2, var2, 0, var3, 66, false, 0, class61.field1298.field3160[0], 1, 0, class61.field1298.field3200[0], 1);
            }
            class52.field1095 = 0;
            class42.field909 = 2;
            class98.field1838 = class68.field1361;
            class36.field799 = class175.field3141;
            class81.field1564.method70((byte) -62, 218);
            class81.field1564.method1246(var5, -49);
            class81.field1564.method1246(class2.field26 + var2, 121);
            class81.field1564.method1208(-28417, class141.field2582 + var3);
        }
        if (var4 == 57 && class163.method1046(var2, var6, 119, var3)) {
            class112.field2100++;
            class81.field1564.method70((byte) -62, 66);
            class81.field1564.method1246((int) (var6 >>> 32) & Integer.MAX_VALUE, 119);
            class81.field1564.method1236(-26162, class208.field3912);
            class81.field1564.method1208(-28417, class71.field1419);
            class81.field1564.method1236(-26162, var2 + class2.field26);
            class81.field1564.method1222((byte) -78, class141.field2582 + var3);
            class81.field1564.method1233((byte) -6, class73.field1436);
        }
        if (var4 == 1006) {
            class98.field1838 = class68.field1361;
            class36.field799 = class175.field3141;
            class124.field2287++;
            class52.field1095 = 0;
            class42.field909 = 2;
            class81.field1564.method70((byte) -62, 116);
            class81.field1564.method1208(arg1 - 28597, var5);
        }
        if (var4 == 38) {
            class163.method1046(var2, var6, 117, var3);
            class98.field1830++;
            class81.field1564.method70((byte) -62, 221);
            class81.field1564.method1236(-26162, class141.field2582 + var3);
            class81.field1564.method1236(-26162, class2.field26 + var2);
            class81.field1564.method1222((byte) -79, Integer.MAX_VALUE & (int) (var6 >>> 32));
        }
        if (var4 == 28) {
            class81.field1564.method70((byte) -62, 69);
            class81.field1564.method1201(class56.field1233, 117);
            class175.field3191++;
            class81.field1564.method1246(var5, 124);
            class81.field1564.method1236(-26162, class167.field3024);
            class81.field1564.method1229((byte) -89, var3);
            class81.field1564.method1236(-26162, var2);
            class108.field2017 = 0;
            class208.field3895 = class87.method580(var3, arg1 - 128);
            class175.field3132 = var2;
        }
        if (var4 == 13) {
            class188 var30 = class53.field1152[var5];
            if (var30 != null) {
                class190.method1278(2, var30.field3200[0], 0, var30.field3160[0], 126, false, 0, class61.field1298.field3160[0], 1, 0, class61.field1298.field3200[0], 1);
                class52.field1095 = 0;
                class36.field799 = class175.field3141;
                class132.field2403++;
                class98.field1838 = class68.field1361;
                class42.field909 = 2;
                class81.field1564.method70((byte) -62, 151);
                class81.field1564.method1208(-28417, var5);
            }
        }
        if (var4 == 44) {
            boolean var31 = class190.method1278(2, var2, 0, var3, 39, false, 0, class61.field1298.field3160[0], 0, 0, class61.field1298.field3200[0], 0);
            if (!var31) {
                class190.method1278(2, var2, 0, var3, 45, false, 0, class61.field1298.field3160[0], 1, 0, class61.field1298.field3200[0], 1);
            }
            class52.field1095 = 0;
            class36.field799 = class175.field3141;
            class180.field3306++;
            class42.field909 = 2;
            class98.field1838 = class68.field1361;
            class81.field1564.method70((byte) -62, 94);
            class81.field1564.method1208(arg1 ^ 0xFFFF904B, var2 + class2.field26);
            class81.field1564.method1236(-26162, class141.field2582 + var3);
            class81.field1564.method1246(var5, -102);
        }
        if (var4 == 22) {
            class80.field1538++;
            class81.field1564.method70((byte) -62, 111);
            class81.field1564.method1201(var3, -97);
            class81.field1564.method1236(-26162, var2);
            class81.field1564.method1236(arg1 ^ 0xFFFF997A, var5);
            class108.field2017 = 0;
            class208.field3895 = class87.method580(var3, 88);
            class175.field3132 = var2;
        }
        if (var4 == 48) {
            class188 var33 = class53.field1152[var5];
            if (var33 != null) {
                class155.field2785++;
                class190.method1278(2, var33.field3200[0], 0, var33.field3160[0], arg1 ^ 0xF1, false, 0, class61.field1298.field3160[0], 1, 0, class61.field1298.field3200[0], 1);
                class36.field799 = class175.field3141;
                class52.field1095 = 0;
                class42.field909 = 2;
                class98.field1838 = class68.field1361;
                class81.field1564.method70((byte) -62, 97);
                class81.field1564.method1246(var5, -100);
            }
        }
        if (var4 == 25) {
            class149.field2687++;
            class81.field1564.method70((byte) -62, 143);
            class81.field1564.method1236(arg1 - 26342, var5);
            class81.field1564.method1201(var3, 120);
            class81.field1564.method1222((byte) -87, var2);
            class108.field2017 = 0;
            class208.field3895 = class87.method580(var3, arg1 - 53);
            class175.field3132 = var2;
        }
        if (var4 == 36) {
            class81.field1564.method70((byte) -62, 85);
            class81.field1564.method1229((byte) -124, var3);
            class237.field4381++;
            class6 var34 = class87.method580(var3, 116);
            if (var34.field72 != null && var34.field72[0][0] == 5) {
                int var35 = var34.field72[0][1];
                class14.field355[var35] = 1 - class14.field355[var35];
                class38.method250(var35, -13);
            }
        }
        if (var4 == 7) {
            class212.method1403(arg1 ^ 0x9E);
        }
        if (var4 == 20) {
            class115 var36 = class23.field554[var5];
            if (var36 != null) {
                class190.method1278(2, var36.field3200[0], 0, var36.field3160[0], 20, false, 0, class61.field1298.field3160[0], 1, 0, class61.field1298.field3200[0], 1);
                class98.field1838 = class68.field1361;
                class238.field4390++;
                class52.field1095 = 0;
                class42.field909 = 2;
                class36.field799 = class175.field3141;
                class81.field1564.method70((byte) -62, 112);
                class81.field1564.method1208(-28417, var5);
            }
        }
        if (var4 == 1002) {
            class6 var37 = class87.method580(var3, 48);
            if (var37 == null || var37.field68[var2] < 100000) {
                class81.field1564.method70((byte) -62, 79);
                class81.field1564.method1236(arg1 ^ 0xFFFF997A, var5);
                class239.field4398++;
            } else {
                class189.method1276(0, (byte) 1, class78.method502((byte) -90, new class179[] { class148.method949((byte) -14, var37.field68[var2]), class22.field546, class131.method835((byte) -20, var5).field418 }), class207.field3868);
            }
            class108.field2017 = 0;
            class208.field3895 = class87.method580(var3, 107);
            class175.field3132 = var2;
        }
        if (var4 == 30) {
            class171.field3067++;
            boolean var38 = class190.method1278(2, var2, 0, var3, arg1 ^ 0xFA, false, 0, class61.field1298.field3160[0], 0, 0, class61.field1298.field3200[0], 0);
            if (!var38) {
                class190.method1278(2, var2, 0, var3, 33, false, 0, class61.field1298.field3160[0], 1, 0, class61.field1298.field3200[0], 1);
            }
            class98.field1838 = class68.field1361;
            class52.field1095 = 0;
            class42.field909 = 2;
            class36.field799 = class175.field3141;
            class81.field1564.method70((byte) -62, 156);
            class81.field1564.method1246(var5, 95);
            class81.field1564.method1222((byte) -105, var2 + class2.field26);
            class81.field1564.method1222((byte) -105, var3 + class141.field2582);
        }
        if (var4 == 10) {
            class119.method765(class49.field1038, var2, var3);
        }
        if (var4 == 51) {
            class81.field1564.method70((byte) -62, 88);
            class61.field1295++;
            class81.field1564.method1216((byte) 112, var3);
            class81.field1564.method1222((byte) -93, var2);
            class81.field1564.method1246(var5, 102);
            class108.field2017 = 0;
            class208.field3895 = class87.method580(var3, 81);
            class175.field3132 = var2;
        }
        if (var4 == 9 || var4 == 1003) {
            class9.method58(var3, var2, var5, class23.field567[arg0], arg1 + 20767);
        }
        if (var4 == 24) {
            class237.field4381++;
            class81.field1564.method70((byte) -62, 85);
            class81.field1564.method1229((byte) -80, var3);
            class6 var40 = class87.method580(var3, arg1 ^ 0xD7);
            if (var40.field72 != null && var40.field72[0][0] == 5) {
                int var41 = var40.field72[0][1];
                if (class14.field355[var41] != var40.field76[0]) {
                    class14.field355[var41] = var40.field76[0];
                    class38.method250(var41, 110);
                }
            }
        }
        if (arg1 != 180) {
            field252 = null;
        }
        if (var4 == 18) {
            class81.field1564.method70((byte) -62, 246);
            class150.field2695++;
            class81.field1564.method1222((byte) -93, var2);
            class81.field1564.method1222((byte) -89, class71.field1419);
            class81.field1564.method1216((byte) 112, class73.field1436);
            class81.field1564.method1222((byte) -124, var5);
            class81.field1564.method1222((byte) -103, class208.field3912);
            class81.field1564.method1229((byte) -96, var3);
            class108.field2017 = 0;
            class208.field3895 = class87.method580(var3, 94);
            class175.field3132 = var2;
        }
        if (var4 == 2 && class163.method1046(var2, var6, arg1 ^ 0xD9, var3)) {
            class81.field1564.method70((byte) -62, 113);
            class81.field1564.method1236(-26162, class141.field2582 + var3);
            class81.field1564.method1236(arg1 - 26342, class2.field26 + var2);
            class222.field4096++;
            class81.field1564.method1222((byte) -76, class167.field3024);
            class81.field1564.method1222((byte) -77, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class81.field1564.method1201(class56.field1233, 20);
        }
        if (var4 == 43) {
            class187.field3478++;
            class81.field1564.method70((byte) -62, 193);
            class81.field1564.method1246(var2, -118);
            class81.field1564.method1222((byte) -103, var5);
            class81.field1564.method1216((byte) 112, var3);
            class108.field2017 = 0;
            class208.field3895 = class87.method580(var3, arg1 ^ 0xCD);
            class175.field3132 = var2;
        }
        if (var4 == 31) {
            class188 var42 = class53.field1152[var5];
            if (var42 != null) {
                class190.method1278(2, var42.field3200[0], 0, var42.field3160[0], 62, false, 0, class61.field1298.field3160[0], 1, 0, class61.field1298.field3200[0], 1);
                class42.field909 = 2;
                class208.field3916++;
                class36.field799 = class175.field3141;
                class52.field1095 = 0;
                class98.field1838 = class68.field1361;
                class81.field1564.method70((byte) -62, 47);
                class81.field1564.method1208(-28417, var5);
                class81.field1564.method1246(class167.field3024, -66);
                class81.field1564.method1233((byte) 69, class56.field1233);
            }
        }
        if (var4 == 8) {
            class231.field4259++;
            boolean var43 = class190.method1278(2, var2, 0, var3, arg1 ^ 0xA3, false, 0, class61.field1298.field3160[0], 0, 0, class61.field1298.field3200[0], 0);
            if (!var43) {
                class190.method1278(2, var2, 0, var3, 42, false, 0, class61.field1298.field3160[0], 1, 0, class61.field1298.field3200[0], 1);
            }
            class42.field909 = 2;
            class52.field1095 = 0;
            class98.field1838 = class68.field1361;
            class36.field799 = class175.field3141;
            class81.field1564.method70((byte) -62, 138);
            class81.field1564.method1222((byte) -92, var2 + class2.field26);
            class81.field1564.method1208(arg1 ^ 0xFFFF904B, var3 + class141.field2582);
            class81.field1564.method1246(var5, arg1 - 236);
        }
        if (var4 == 11) {
            class115 var45 = class23.field554[var5];
            if (var45 != null) {
                class190.method1278(2, var45.field3200[0], 0, var45.field3160[0], 119, false, 0, class61.field1298.field3160[0], 1, 0, class61.field1298.field3200[0], 1);
                class42.field909 = 2;
                class198.field3691++;
                class98.field1838 = class68.field1361;
                class52.field1095 = 0;
                class36.field799 = class175.field3141;
                class81.field1564.method70((byte) -62, 89);
                class81.field1564.method1246(var5, 120);
            }
        }
        if (var4 == 34) {
            class178.field3228++;
            class81.field1564.method70((byte) -62, 114);
            class81.field1564.method1229((byte) -74, var3);
            class81.field1564.method1246(var5, -70);
            class81.field1564.method1246(var2, 99);
            class108.field2017 = 0;
            class208.field3895 = class87.method580(var3, arg1 - 115);
            class175.field3132 = var2;
        }
        if (var4 == 41) {
            class189.field3529++;
            class81.field1564.method70((byte) -62, 219);
            class81.field1564.method1208(-28417, var2);
            class81.field1564.method1236(arg1 - 26342, var5);
            class81.field1564.method1201(var3, arg1 - 298);
            class108.field2017 = 0;
            class208.field3895 = class87.method580(var3, 49);
            class175.field3132 = var2;
        }
        if (var4 == 1) {
            class115 var46 = class23.field554[var5];
            if (var46 != null) {
                class190.method1278(2, var46.field3200[0], 0, var46.field3160[0], 91, false, 0, class61.field1298.field3160[0], 1, 0, class61.field1298.field3200[0], 1);
                class219.field4053++;
                class98.field1838 = class68.field1361;
                class42.field909 = 2;
                class36.field799 = class175.field3141;
                class52.field1095 = 0;
                class81.field1564.method70((byte) -62, 240);
                class81.field1564.method1246(var5, 99);
            }
        }
        if (var4 == 16) {
            class81.field1564.method70((byte) -62, 152);
            class3.field39++;
            class81.field1564.method1208(-28417, var5);
            class81.field1564.method1208(-28417, var2);
            class81.field1564.method1229((byte) -118, var3);
            class108.field2017 = 0;
            class208.field3895 = class87.method580(var3, 78);
            class175.field3132 = var2;
        }
        if (var4 == 4) {
            class78.field1508++;
            boolean var47 = class190.method1278(2, var2, 0, var3, 35, false, 0, class61.field1298.field3160[0], 0, 0, class61.field1298.field3200[0], 0);
            if (!var47) {
                class190.method1278(2, var2, 0, var3, arg1 ^ 0xFC, false, 0, class61.field1298.field3160[0], 1, 0, class61.field1298.field3200[0], 1);
            }
            class42.field909 = 2;
            class52.field1095 = 0;
            class98.field1838 = class68.field1361;
            class36.field799 = class175.field3141;
            class81.field1564.method70((byte) -62, 184);
            class81.field1564.method1222((byte) -128, class141.field2582 + var3);
            class81.field1564.method1246(var5, -101);
            class81.field1564.method1246(class2.field26 + var2, -108);
        }
        if (var4 == 5) {
            class163.method1046(var2, var6, 115, var3);
            class81.field1564.method70((byte) -62, 196);
            class151.field2716++;
            class81.field1564.method1246(class141.field2582 + var3, -87);
            class81.field1564.method1236(-26162, class2.field26 + var2);
            class81.field1564.method1246(Integer.MAX_VALUE & (int) (var6 >>> 32), -71);
        }
        if (var4 == 12) {
            class188 var49 = class53.field1152[var5];
            if (var49 != null) {
                class190.method1278(2, var49.field3200[0], 0, var49.field3160[0], arg1 ^ 0xCF, false, 0, class61.field1298.field3160[0], 1, 0, class61.field1298.field3200[0], 1);
                class98.field1838 = class68.field1361;
                class36.field799 = class175.field3141;
                class52.field1095 = 0;
                class70.field1413++;
                class42.field909 = 2;
                class81.field1564.method70((byte) -62, 108);
                class81.field1564.method1208(-28417, var5);
            }
        }
        if (var4 == 39) {
            class163.method1046(var2, var6, 117, var3);
            class81.field1564.method70((byte) -62, 213);
            class81.field1564.method1222((byte) -116, class2.field26 + var2);
            class81.field1564.method1246(Integer.MAX_VALUE & (int) (var6 >>> 32), 113);
            class81.field1564.method1236(arg1 - 26342, var3 - -class141.field2582);
            class178.field3236++;
        }
        if (class172.field3086 != 0) {
            class172.field3086 = 0;
            class139.method880(class87.method580(class73.field1436, 126), 105);
        }
        if (class163.field2940) {
            class198.method1322(arg1 + 16777036);
        }
        if (class208.field3895 != null && class108.field2017 == 0) {
            class139.method880(class208.field3895, 126);
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)Lqe;")
    public final class179 method55(int arg0, int arg1) {
        field256++;
        if (this.field247 == null) {
            return this.field253;
        }
        class123 var3 = (class123) this.field247.method909(-1, (long) arg0);
        if (var3 == null) {
            return this.field253;
        } else {
            if (arg1 != 0) {
                this.field251 = 98;
            }
            return var3.field2282;
        }
    }
}
