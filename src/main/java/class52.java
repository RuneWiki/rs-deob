import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class52 {

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "Lfc;")
    private class174 field634 = new class174(64);

    @OriginalMember(owner = "client!pv", name = "n", descriptor = "I")
    public int field640 = 0;

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "Loi;")
    private class53 field631;

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
    public int field632;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!pv", name = "l", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!pv", name = "m", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "Lcn;")
    public static class363 field628;

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "[Lun;")
    public static class296[] field629;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V", line = 4)
    public final void method410(byte arg0) {
        field636++;
        class174 var2 = this.field634;
        synchronized (this.field634) {
            this.field634.method1096((byte) -90);
            int var3 = 41 % ((46 - arg0) / 60);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(JB)V", line = 16)
    public static final void method411(long arg0, byte arg1) {
        field633++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg1 <= 103) {
            method417(null, false, -21, -44);
        }
        if ((arg0 % 10L) == 0L) {
            class410.method2423(32767, arg0 - 1L);
            class410.method2423(32767, 1L);
        } else {
            class410.method2423(32767, arg0);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V", line = 40)
    public static void method412(int arg0) {
        field629 = null;
        field628 = null;
        if (arg0 != 89) {
            method412(23);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZIIZJ)Ljava/lang/String;", line = 54)
    public static final String method413(boolean arg0, int arg1, int arg2, boolean arg3, long arg4) {
        field639++;
        char var6 = ',';
        char var7 = '.';
        if (arg2 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg2 == 2) {
            var7 = ' ';
        }
        boolean var8 = arg0;
        if (arg4 < 0L) {
            arg4 = -arg4;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg1 > 0) {
            for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = (int) arg4;
                arg4 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg4 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg4;
            arg4 /= 10L;
            var9.append((char) (var13 + 48 - (int) arg4 * 10));
            if (arg4 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg3) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)V", line = 133)
    public final void method414(int arg0) {
        field638++;
        class174 var2 = this.field634;
        synchronized (this.field634) {
            this.field634.method1095(0);
            if (arg0 != 10) {
                field628 = null;
            }
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(BI)Ld;", line = 147)
    public final class105 method415(byte arg0, int arg1) {
        if (arg0 != -32) {
            field629 = null;
        }
        field635++;
        class174 var3 = this.field634;
        class105 var4;
        synchronized (this.field634) {
            var4 = (class105) this.field634.method1088((long) arg1, (byte) 127);
        }
        if (var4 != null) {
            return var4;
        }
        class53 var5 = this.field631;
        byte[] var6;
        synchronized (this.field631) {
            var6 = this.field631.method426(4, (byte) 9, arg1);
        }
        class105 var7 = new class105();
        var7.field1375 = arg1;
        var7.field1389 = this;
        if (var6 != null) {
            var7.method716((byte) -48, new class403(var6));
        }
        var7.method715((byte) -97);
        class174 var8 = this.field634;
        synchronized (this.field634) {
            this.field634.method1097(19627, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(II)V", line = 183)
    public final void method416(int arg0, int arg1) {
        class174 var3 = this.field634;
        synchronized (this.field634) {
            this.field634.method1087(arg0, arg1);
        }
        field627++;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Ldh;ZII)V", line = 195)
    public static final void method417(class214 arg0, boolean arg1, int arg2, int arg3) {
        field637++;
        if (arg0 == null || class363.field5190.field6378 == arg0) {
            return;
        }
        int var4 = arg0.field3088;
        int var5 = arg0.field3096;
        int var6 = arg0.field3094;
        int var7 = (int) arg0.field3089;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg0.field3089;
        if (var6 == 2) {
            class198.field2815 = arg3;
            class273.field4052 = 2;
            class528.field7751 = arg2;
            class476.field6633 = 0;
            class487.field6786++;
            class61.method498(class243.field3524, 1);
            class30.field357.method2368(class441.field6171 + var4, -31442);
            class30.field357.method2368(var7, -31442);
            class30.field357.method2321(class345.field5009.method870(82, -115) ? 1 : 0, -61);
            class30.field357.method2331(32196, class367.field5241 + var5);
            class191.method1215(61, var5, var4);
        }
        if (var6 == 1001) {
            class273.field4052 = 2;
            class528.field7751 = arg2;
            class476.field6633 = 0;
            class539.field7879++;
            class198.field2815 = arg3;
            class61.method498(class87.field1092, 1);
            class30.field357.method2372(Integer.MAX_VALUE & (int) (var8 >>> 32), -126);
            class30.field357.method2368(var4 + class441.field6171, -31442);
            class30.field357.method2336(var5 + class367.field5241, -119);
            class30.field357.method2375(class345.field5009.method870(82, -121) ? 1 : 0, 3457);
            class176.method1100(var5, var8, var4, (byte) 59);
        }
        if (var6 == 15) {
            class273.field4052 = 2;
            class528.field7751 = arg2;
            class198.field2815 = arg3;
            class476.field6633 = 0;
            class32.field372++;
            class61.method498(class511.field7568, 1);
            class30.field357.method2336(class367.field5241 + var5, -128);
            class30.field357.method2372(var7, -126);
            class30.field357.method2376((byte) 122, class345.field5009.method870(82, -128) ? 1 : 0);
            class30.field357.method2368(class441.field6171 + var4, -31442);
            class191.method1215(97, var5, var4);
        }
        if (var6 == 9) {
            class22 var10 = class378.field5355[var7];
            if (var10 != null) {
                class273.field4052 = 2;
                class22.field285++;
                class476.field6633 = 0;
                class198.field2815 = arg3;
                class528.field7751 = arg2;
                class61.method498(class508.field7514, 1);
                class30.field357.method2321(class345.field5009.method870(82, -120) ? 1 : 0, -70);
                class30.field357.method2331(32196, var7);
                class110.method754(-2, var10.method125((byte) -113), true, 0, 0, var10.field3378[0], var10.method125((byte) -124), 95, var10.field3368[0]);
            }
        }
        if (var6 == 58) {
            class22 var11 = class378.field5355[var7];
            if (var11 != null) {
                class476.field6633 = 0;
                class198.field2815 = arg3;
                class528.field7751 = arg2;
                class273.field4052 = 2;
                class131.field1724++;
                class61.method498(class488.field6821, 1);
                class30.field357.method2336(var7, -114);
                class30.field357.method2375(class345.field5009.method870(82, -117) ? 1 : 0, 3457);
                class110.method754(-2, var11.method125((byte) -86), true, 0, 0, var11.field3378[0], var11.method125((byte) -128), 72, var11.field3368[0]);
            }
        }
        if (var6 == 60) {
            class528.field7751 = arg2;
            class476.field6633 = 0;
            class273.field4052 = 2;
            class227.field3261++;
            class198.field2815 = arg3;
            class61.method498(class69.field877, 1);
            class30.field357.method2368((int) (var8 >>> 32) & Integer.MAX_VALUE, -31442);
            class30.field357.method2340(104, class345.field5009.method870(82, -124) ? 1 : 0);
            class30.field357.method2336(var5 + class367.field5241, -128);
            class30.field357.method2336(class441.field6171 + var4, -117);
            class176.method1100(var5, var8, var4, (byte) 59);
        }
        if (var6 == 3) {
            class378 var12 = (class378) class125.field1687.method2405((long) var7, -65);
            if (var12 != null) {
                class476.field6633 = 0;
                class528.field7751 = arg2;
                class198.field2815 = arg3;
                class429 var13 = var12.field5353;
                class85.field1067++;
                class273.field4052 = 2;
                class61.method498(class280.field4135, 1);
                class30.field357.method2340(-122, class345.field5009.method870(82, -114) ? 1 : 0);
                class30.field357.method2336(var7, -122);
                class110.method754(-2, var13.method125((byte) -122), true, 0, 0, var13.field3378[0], var13.method125((byte) -123), 75, var13.field3368[0]);
            }
        }
        if (var6 == 22) {
            class378 var14 = (class378) class125.field1687.method2405((long) var7, -114);
            if (var14 != null) {
                class304.field4432++;
                class198.field2815 = arg3;
                class429 var15 = var14.field5353;
                class273.field4052 = 2;
                class476.field6633 = 0;
                class528.field7751 = arg2;
                class61.method498(class431.field6074, 1);
                class30.field357.method2331(32196, var7);
                class30.field357.method2340(-105, class345.field5009.method870(82, -120) ? 1 : 0);
                class110.method754(-2, var15.method125((byte) -112), true, 0, 0, var15.field3378[0], var15.method125((byte) -103), 95, var15.field3368[0]);
            }
        }
        if (var6 == 6) {
            if (class208.field3009 > 0 && class345.field5009.method870(82, -115) && class345.field5009.method870(81, -119)) {
                class427.method2530(class367.field5241 + var5, class441.field6171 + var4, 63, class246.field3587.field1904);
            } else {
                class332.method1987(var5, var7, var4, (byte) 116);
                if (var7 == 1) {
                    class30.field357.method2376((byte) 122, -1);
                    class30.field357.method2376((byte) 122, -1);
                    class30.field357.method2372((int) class153.field2204, -126);
                    class30.field357.method2376((byte) 122, 57);
                    class30.field357.method2376((byte) 122, class460.field6441);
                    class30.field357.method2376((byte) 122, class98.field1304);
                    class30.field357.method2376((byte) 122, 89);
                    class30.field357.method2372(class246.field3587.field1896, 66);
                    class30.field357.method2372(class246.field3587.field1899, 0);
                    class30.field357.method2376((byte) 122, 63);
                } else {
                    class273.field4052 = 1;
                    class528.field7751 = arg2;
                    class198.field2815 = arg3;
                    class476.field6633 = 0;
                }
                class110.method754(-4, 1, true, 0, 0, var5, 1, 66, var4);
            }
        }
        if (var6 == 57) {
            class22 var16 = class378.field5355[var7];
            if (var16 != null) {
                class476.field6633 = 0;
                class528.field7751 = arg2;
                class273.field4052 = 2;
                class124.field1685++;
                class198.field2815 = arg3;
                class61.method498(class28.field336, 1);
                class30.field357.method2372(var7, -128);
                class30.field357.method2376((byte) 122, class345.field5009.method870(82, -127) ? 1 : 0);
                class110.method754(-2, var16.method125((byte) -118), true, 0, 0, var16.field3378[0], var16.method125((byte) -104), 98, var16.field3368[0]);
            }
        }
        if (var6 == 51 && class411.field5809 == null) {
            class391.method2268(var5, var4, 1);
            class411.field5809 = class343.method2046(var4, 0, var5);
            class187.method1190(class411.field5809, 99);
        }
        if (var6 == 19) {
            class22 var17 = class378.field5355[var7];
            if (var17 != null) {
                class273.field4052 = 2;
                class528.field7751 = arg2;
                class198.field2815 = arg3;
                class476.field6633 = 0;
                class434.field6103++;
                class61.method498(class8.field120, 1);
                class30.field357.method2321(class345.field5009.method870(82, -125) ? 1 : 0, -57);
                class30.field357.method2336(var7, -123);
                class110.method754(-2, var17.method125((byte) -76), true, 0, 0, var17.field3378[0], var17.method125((byte) -73), 110, var17.field3368[0]);
            }
        }
        if (var6 == 46) {
            class378 var18 = (class378) class125.field1687.method2405((long) var7, -82);
            if (var18 != null) {
                class528.field7751 = arg2;
                class273.field4052 = 2;
                class198.field2815 = arg3;
                class476.field6633 = 0;
                class429 var19 = var18.field5353;
                class406.field5760++;
                class61.method498(class97.field1265, 1);
                class30.field357.method2372(class483.field6724, -8);
                class30.field357.method2340(105, class345.field5009.method870(82, -113) ? 1 : 0);
                class30.field357.method2368(var7, -31442);
                class30.field357.method2368(class235.field3424, -31442);
                class30.field357.method2329(class231.field3397, 498581272);
                class110.method754(-2, var19.method125((byte) -91), true, 0, 0, var19.field3378[0], var19.method125((byte) -95), 108, var19.field3368[0]);
            }
        }
        if (var6 == 23) {
            class476.field6633 = 0;
            class126.field1705++;
            class273.field4052 = 1;
            class528.field7751 = arg2;
            class198.field2815 = arg3;
            class61.method498(class447.field6235, 1);
            class30.field357.method2331(32196, class483.field6724);
            class30.field357.method2372(class367.field5241 + var5, 25);
            class30.field357.method2336(class441.field6171 + var4, -122);
            class30.field357.method2327((byte) -30, class231.field3397);
            class30.field357.method2372(class235.field3424, 97);
            class110.method754(-4, 1, true, 0, 0, var5, 1, 116, var4);
        }
        if (var6 == 50) {
            class22 var20 = class378.field5355[var7];
            if (var20 != null) {
                class476.field6633 = 0;
                class198.field2815 = arg3;
                class528.field7751 = arg2;
                class273.field4052 = 2;
                class117.field1618++;
                class61.method498(class347.field5019, 1);
                class30.field357.method2340(17, class345.field5009.method870(82, -124) ? 1 : 0);
                class30.field357.method2372(var7, 33);
                class110.method754(-2, var20.method125((byte) -78), true, 0, 0, var20.field3378[0], var20.method125((byte) -96), 86, var20.field3368[0]);
            }
        }
        if (!arg1) {
            return;
        }
        if (var6 == 13) {
            class528.field7751 = arg2;
            class476.field6633 = 0;
            class198.field2815 = arg3;
            class273.field4052 = 2;
            class270.field3931++;
            class61.method498(class259.field3838, 1);
            class30.field357.method2372(var7, -126);
            class30.field357.method2372(var4 + class441.field6171, -126);
            class30.field357.method2321(class345.field5009.method870(82, -124) ? 1 : 0, -86);
            class30.field357.method2336(class367.field5241 + var5, -114);
            class191.method1215(104, var5, var4);
        }
        if (var6 == 44) {
            class528.field7751 = arg2;
            class198.field2815 = arg3;
            class234.field3413++;
            class273.field4052 = 2;
            class476.field6633 = 0;
            class61.method498(class329.field4794, 1);
            class30.field357.method2321(class345.field5009.method870(82, -124) ? 1 : 0, -123);
            class30.field357.method2372(class246.field3587.field3289, -128);
            class30.field357.method2336(class483.field6724, -125);
            class30.field357.method2336(class235.field3424, -123);
            class30.field357.method2327((byte) -30, class231.field3397);
        }
        if (var6 == 1006) {
            class198.field2815 = arg3;
            class375.field5326++;
            class476.field6633 = 0;
            class528.field7751 = arg2;
            class273.field4052 = 2;
            class61.method498(class373.field5318, 1);
            class30.field357.method2372(var7, -128);
        }
        if (var6 == 59) {
            class198.field2815 = arg3;
            class528.field7751 = arg2;
            class273.field4052 = 2;
            class476.field6633 = 0;
            class77.field1008++;
            class61.method498(class163.field2414, 1);
            class30.field357.method2372(class367.field5241 + var5, -126);
            class30.field357.method2372(class441.field6171 + var4, -126);
            class30.field357.method2372(var7, 21);
            class30.field357.method2321(class345.field5009.method870(82, -113) ? 1 : 0, -87);
            class191.method1215(71, var5, var4);
        }
        if (var6 == 1008 || var6 == 1003 || var6 == 1012 || var6 == 1011 || var6 == 1007) {
            class261.method1669(var6, var7, var4, true);
        }
        if (var6 == 1002) {
            class198.field2815 = arg3;
            class476.field6633 = 0;
            class528.field7751 = arg2;
            class273.field4052 = 2;
            class208.field3017++;
            class61.method498(class328.field4778, 1);
            class30.field357.method2372(var7, 30);
        }
        if (var6 == 16) {
            class378 var21 = (class378) class125.field1687.method2405((long) var7, -38);
            if (var21 != null) {
                class474.field6597++;
                class476.field6633 = 0;
                class273.field4052 = 2;
                class429 var22 = var21.field5353;
                class198.field2815 = arg3;
                class528.field7751 = arg2;
                class61.method498(class264.field3878, 1);
                class30.field357.method2321(class345.field5009.method870(82, -119) ? 1 : 0, -112);
                class30.field357.method2368(var7, -31442);
                class110.method754(-2, var22.method125((byte) -70), true, 0, 0, var22.field3378[0], var22.method125((byte) -118), 126, var22.field3368[0]);
            }
        }
        if (var6 == 47) {
            class528.field7751 = arg2;
            class273.field4052 = 2;
            class476.field6633 = 0;
            class198.field2815 = arg3;
            class217.field3132++;
            class61.method498(class92.field1172, 1);
            class30.field357.method2331(32196, var4 + class441.field6171);
            class30.field357.method2372(class367.field5241 + var5, 108);
            class30.field357.method2329(class231.field3397, 498581272);
            class30.field357.method2372(class235.field3424, 119);
            class30.field357.method2336(var7, -123);
            class30.field357.method2376((byte) 122, class345.field5009.method870(82, -113) ? 1 : 0);
            class30.field357.method2372(class483.field6724, -128);
            class191.method1215(57, var5, var4);
        }
        if (var6 == 20 || var6 == 1004) {
            class98.method692(arg1, arg0.field3098, var7, var5, var4);
        }
        if (var6 == 8) {
            class476.field6633 = 0;
            class528.field7751 = arg2;
            class198.field2815 = arg3;
            class273.field4052 = 2;
            class183.field2626++;
            class61.method498(class387.field5442, 1);
            class30.field357.method2368(class235.field3424, -31442);
            class30.field357.method2327((byte) -30, class231.field3397);
            class30.field357.method2368(class367.field5241 + var5, -31442);
            class30.field357.method2321(class345.field5009.method870(82, -122) ? 1 : 0, -79);
            class30.field357.method2368(class441.field6171 + var4, -31442);
            class30.field357.method2368((int) (var8 >>> 32) & Integer.MAX_VALUE, -31442);
            class30.field357.method2372(class483.field6724, 41);
            class176.method1100(var5, var8, var4, (byte) 59);
        }
        if (var6 == 11) {
            class150 var23 = class343.method2046(var4, 0, var5);
            if (var23 != null) {
                class235.method1439(-116);
                class496 var24 = client.method1291(var23);
                class225.method1387(var23, var24.field7026, var24.method2886((byte) 107), 34165);
                class380.field5366 = class189.method1204(false, var23);
                if (class380.field5366 == null) {
                    class380.field5366 = "Null";
                }
                class431.field6089 = var23.field2075 + "<col=ffffff>";
            }
            return;
        }
        if (var6 == 5) {
            if (class208.field3009 > 0 && class345.field5009.method870(82, -119) && class345.field5009.method870(81, -119)) {
                class427.method2530(class367.field5241 + var5, class441.field6171 + var4, 63, class246.field3587.field1904);
            } else {
                class476.field6633 = 0;
                class198.field2815 = arg3;
                class528.field7751 = arg2;
                class131.field1730++;
                class273.field4052 = 1;
                class61.method498(class47.field544, 1);
                class30.field357.method2336(class367.field5241 + var5, -114);
                class30.field357.method2372(class441.field6171 + var4, 18);
            }
        }
        if (var6 == 30) {
            class378 var25 = (class378) class125.field1687.method2405((long) var7, -79);
            if (var25 != null) {
                class273.field4052 = 2;
                class429 var26 = var25.field5353;
                class198.field2815 = arg3;
                class449.field6267++;
                class476.field6633 = 0;
                class528.field7751 = arg2;
                class61.method498(class205.field2963, 1);
                class30.field357.method2340(2, class345.field5009.method870(82, -115) ? 1 : 0);
                class30.field357.method2331(32196, var7);
                class110.method754(-2, var26.method125((byte) -83), true, 0, 0, var26.field3378[0], var26.method125((byte) -100), 77, var26.field3368[0]);
            }
        }
        if (var6 == 25) {
            class22 var27 = class378.field5355[var7];
            if (var27 != null) {
                class522.field7684++;
                class476.field6633 = 0;
                class198.field2815 = arg3;
                class273.field4052 = 2;
                class528.field7751 = arg2;
                class61.method498(class194.field2758, 1);
                class30.field357.method2336(var7, -116);
                class30.field357.method2321(class345.field5009.method870(82, -128) ? 1 : 0, -64);
                class110.method754(-2, var27.method125((byte) -106), true, 0, 0, var27.field3378[0], var27.method125((byte) -107), 99, var27.field3368[0]);
            }
        }
        if (var6 == 1009) {
            class198.field2815 = arg3;
            class528.field7751 = arg2;
            class273.field4052 = 2;
            class476.field6633 = 0;
            class378 var28 = (class378) class125.field1687.method2405((long) var7, -66);
            if (var28 != null) {
                class429 var29 = var28.field5353;
                class322 var30 = var29.field6055;
                if (var30.field4693 != null) {
                    var30 = var30.method1939(15964, class163.field2413);
                }
                if (var30 != null) {
                    class359.field5139++;
                    class61.method498(class222.field3188, 1);
                    class30.field357.method2372(var30.field4669, 77);
                }
            }
        }
        if (var6 == 12) {
            class22 var31 = class378.field5355[var7];
            if (var31 != null) {
                class234.field3413++;
                class476.field6633 = 0;
                class198.field2815 = arg3;
                class273.field4052 = 2;
                class528.field7751 = arg2;
                class61.method498(class329.field4794, 1);
                class30.field357.method2321(class345.field5009.method870(82, -116) ? 1 : 0, -124);
                class30.field357.method2372(var7, -12);
                class30.field357.method2336(class483.field6724, -121);
                class30.field357.method2336(class235.field3424, -114);
                class30.field357.method2327((byte) -30, class231.field3397);
                class110.method754(-2, var31.method125((byte) -104), true, 0, 0, var31.field3378[0], var31.method125((byte) -88), 64, var31.field3368[0]);
            }
        }
        if (var6 == 49) {
            class273.field4052 = 2;
            class214.field3091++;
            class476.field6633 = 0;
            class528.field7751 = arg2;
            class198.field2815 = arg3;
            class61.method498(class534.field7830, 1);
            class30.field357.method2372(class367.field5241 + var5, -7);
            class30.field357.method2336(var7, -116);
            class30.field357.method2376((byte) 122, class345.field5009.method870(82, -123) ? 1 : 0);
            class30.field357.method2336(class441.field6171 + var4, -118);
            class191.method1215(90, var5, var4);
        }
        if (var6 == 18) {
            class476.field6633 = 0;
            class528.field7751 = arg2;
            class319.field4602++;
            class273.field4052 = 2;
            class198.field2815 = arg3;
            class61.method498(class232.field3401, 1);
            class30.field357.method2336((int) (var8 >>> 32) & Integer.MAX_VALUE, -124);
            class30.field357.method2321(class345.field5009.method870(82, -124) ? 1 : 0, -79);
            class30.field357.method2368(var5 + class367.field5241, -31442);
            class30.field357.method2336(class441.field6171 + var4, -116);
            class176.method1100(var5, var8, var4, (byte) 59);
        }
        if (var6 == 10) {
            class150 var32 = class343.method2046(var4, 0, var5);
            if (var32 != null) {
                class102.method705(arg1, var32);
            }
        }
        if (var6 == 48) {
            class378 var33 = (class378) class125.field1687.method2405((long) var7, -32);
            if (var33 != null) {
                class198.field2815 = arg3;
                class429 var34 = var33.field5353;
                class273.field4052 = 2;
                class528.field7751 = arg2;
                class232.field3404++;
                class476.field6633 = 0;
                class61.method498(class310.field4519, 1);
                class30.field357.method2340(-41, class345.field5009.method870(82, -128) ? 1 : 0);
                class30.field357.method2331(32196, var7);
                class110.method754(-2, var34.method125((byte) -71), true, 0, 0, var34.field3378[0], var34.method125((byte) -118), 78, var34.field3368[0]);
            }
        }
        if (var6 == 45) {
            class146.field1926++;
            class273.field4052 = 2;
            class198.field2815 = arg3;
            class528.field7751 = arg2;
            class476.field6633 = 0;
            class61.method498(class334.field4848, 1);
            class30.field357.method2372(class441.field6171 + var4, -1);
            class30.field357.method2321(class345.field5009.method870(82, -119) ? 1 : 0, -122);
            class30.field357.method2372((int) (var8 >>> 32) & Integer.MAX_VALUE, 111);
            class30.field357.method2372(class367.field5241 + var5, 66);
            class176.method1100(var5, var8, var4, (byte) 59);
        }
        if (var6 == 21) {
            class22 var35 = class378.field5355[var7];
            if (var35 != null) {
                class528.field7751 = arg2;
                class476.field6633 = 0;
                class198.field2815 = arg3;
                class179.field2563++;
                class273.field4052 = 2;
                class61.method498(class5.field83, 1);
                class30.field357.method2336(var7, -119);
                class30.field357.method2376((byte) 122, class345.field5009.method870(82, -122) ? 1 : 0);
                class110.method754(-2, var35.method125((byte) -104), true, 0, 0, var35.field3378[0], var35.method125((byte) -87), 100, var35.field3368[0]);
            }
        }
        if (var6 == 17) {
            class22 var36 = class378.field5355[var7];
            if (var36 != null) {
                class198.field2815 = arg3;
                class273.field4052 = 2;
                class528.field7751 = arg2;
                class400.field5630++;
                class476.field6633 = 0;
                class61.method498(class534.field7826, 1);
                class30.field357.method2321(class345.field5009.method870(82, -113) ? 1 : 0, -62);
                class30.field357.method2336(var7, -123);
                class110.method754(-2, var36.method125((byte) -126), true, 0, 0, var36.field3378[0], var36.method125((byte) -120), 102, var36.field3368[0]);
            }
        }
        if (var6 == 4) {
            class476.field6633 = 0;
            class528.field7751 = arg2;
            class309.field4494++;
            class273.field4052 = 2;
            class198.field2815 = arg3;
            class61.method498(class350.field5028, 1);
            class30.field357.method2336(var5 + class367.field5241, -123);
            class30.field357.method2376((byte) 122, class345.field5009.method870(82, -128) ? 1 : 0);
            class30.field357.method2368(Integer.MAX_VALUE & (int) (var8 >>> 32), -31442);
            class30.field357.method2336(class441.field6171 + var4, -120);
            class176.method1100(var5, var8, var4, (byte) 59);
        }
        if (class427.field6024) {
            class235.method1439(-101);
        }
        if (class415.field5855 != null && class242.field3522 == 0) {
            class187.method1190(class415.field5855, 99);
        }
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lle;ILoi;)V", line = 937)
    public class52(class205 arg0, int arg1, class53 arg2) {
        this.field631 = arg2;
        this.field632 = this.field631.method435(4, 0);
    }
}
