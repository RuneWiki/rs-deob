import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public abstract class class182 extends class508 {

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    private int field2385;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
    public int field2383;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    public int field2382;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "F")
    public float field2381;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    private int field2376;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    public int field2388;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public static int field2378 = 0;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "Lpi;")
    public static class340 field2386 = new class340(14, 1);

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)I")
    public final int method1194(boolean arg0) {
        field2387++;
        if (!arg0) {
            this.field2385 = -93;
        }
        return this.field2385;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)V")
    public static void method1195(byte arg0) {
        field2386 = null;
        if (arg0 != -60) {
            method1195((byte) -5);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BF)V")
    public abstract void method1196(byte arg0, float arg1);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIB)I")
    public static final int method1197(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0 & 0x3;
        field2372++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (arg3 == 78) {
            return var4 == 2 ? 7 - arg2 : arg1;
        } else {
            return -27;
        }
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(B)I")
    public final int method1198(byte arg0) {
        field2389++;
        if (arg0 > -41) {
            this.method1201(-66);
        }
        return this.field2376;
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(B)I")
    public final int method1199(byte arg0) {
        field2379++;
        if (arg0 != 3) {
            field2378 = 36;
        }
        return this.field2383;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1200(byte[] arg0, int arg1) {
        field2375++;
        int var2 = arg0.length;
        if (arg1 != 17916) {
            field2386 = null;
        }
        byte[] var3 = new byte[var2];
        class526.method3113(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)F")
    public final float method1201(int arg0) {
        int var2 = 92 / ((-arg0 - 53) / 39);
        field2377++;
        return this.field2381;
    }

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "(B)I")
    public final int method1202(byte arg0) {
        if (arg0 >= -40) {
            this.field2385 = 28;
        }
        field2373++;
        return this.field2382;
    }

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "(B)I")
    public final int method1203(byte arg0) {
        if (arg0 != -76) {
            field2380 = 72;
        }
        field2374++;
        return this.field2388;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILsj;II)V")
    public static final void method1204(int arg0, class502 arg1, int arg2, int arg3) {
        field2384++;
        if (arg1 == null || class103.field1421.field64 == arg1) {
            return;
        }
        int var4 = arg1.field7377;
        int var5 = arg1.field7389;
        int var6 = arg1.field7390;
        int var7 = (int) arg1.field7388;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg1.field7388;
        if (var6 == 2) {
            class267.field3382 = 0;
            class159.field2091 = arg2;
            class396.field5260++;
            class21.field407 = 2;
            class423.field5829 = arg3;
            class420.method2472((byte) -101, class119.field1666);
            class319.field4112.method560(false, class35.field545 + var4);
            class319.field4112.method598(class439.field6113.method1488((byte) 72, 82) ? 1 : 0, (byte) 123);
            class319.field4112.method609((int) (var8 >>> 32) & Integer.MAX_VALUE, -117);
            class319.field4112.method566(arg0 - 12633, class336.field4299 + var5);
            class270.method1663(7026, var4, var5, var8);
        }
        if (var6 == 57) {
            class423.field5829 = arg3;
            class204.field2669++;
            class159.field2091 = arg2;
            class267.field3382 = 0;
            class21.field407 = 2;
            class420.method2472((byte) -101, class244.field3135);
            class319.field4112.method560(false, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class319.field4112.method560(false, var4 + class35.field545);
            class319.field4112.method594(arg0 ^ 0x8F9, class439.field6113.method1488((byte) 76, 82) ? 1 : 0);
            class319.field4112.method566(-12633, class336.field4299 + var5);
            class270.method1663(7026, var4, var5, var8);
        }
        if (var6 == 1007) {
            class267.field3382 = 0;
            class21.field407 = 2;
            class152.field2041++;
            class423.field5829 = arg3;
            class159.field2091 = arg2;
            class420.method2472((byte) -101, class340.field4338);
            class319.field4112.method560(false, class336.field4299 + var5);
            class319.field4112.method606(class35.field545 + var4, (byte) 89);
            class319.field4112.method594(2297, class439.field6113.method1488((byte) 104, 82) ? 1 : 0);
            class319.field4112.method566(-12633, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class270.method1663(7026, var4, var5, var8);
        }
        if (var6 == 13) {
            class21.field407 = 2;
            class159.field2091 = arg2;
            class459.field6417++;
            class423.field5829 = arg3;
            class267.field3382 = 0;
            class420.method2472((byte) -101, class294.field3804);
            class319.field4112.method566(arg0 - 12633, class37.field573.field5159);
            class319.field4112.method609(class315.field4065, arg0 - 67);
            class319.field4112.method559(class439.field6113.method1488((byte) 118, 82) ? 1 : 0, (byte) 118);
            class319.field4112.method572(arg0 ^ 0xFFFFFF89, class172.field2229);
            class319.field4112.method560(false, class206.field2687);
        }
        if (var6 == 45) {
            class423 var10 = class520.method3091(var5, (byte) 126, var4);
            if (var10 != null) {
                class356.method2082(-1);
                class260 var11 = client.method3037(var10);
                class271.method1667(var11.method1628((byte) -113), var11.field3302, var10, (byte) 26);
                class257.field3252 = class517.method3072(124, var10);
                class195.field2532 = var10.field5799 + "<col=ffffff>";
                if (class257.field3252 == null) {
                    class257.field3252 = "Null";
                }
            }
            return;
        }
        if (var6 == 1011 || var6 == 1006 || var6 == 1010 || var6 == 1003 || var6 == 1002) {
            class256.method1606(var7, 2, var4, var6);
        }
        if (var6 == 21) {
            if (class363.field4685 > 0 && class439.field6113.method1488((byte) 91, 82) && class439.field6113.method1488((byte) 98, 81)) {
                class195.method1264(class37.field573.field6220, arg0, class336.field4299 + var5, class35.field545 + var4);
            } else {
                class185.method1223(var5, true, var4, var7);
                if (var7 == 1) {
                    class319.field4112.method565(-119, -1);
                    class319.field4112.method565(arg0 ^ 0x5A, -1);
                    class319.field4112.method609((int) class244.field3138, -78);
                    class319.field4112.method565(-114, 57);
                    class319.field4112.method565(arg0 + 67, class446.field6192);
                    class319.field4112.method565(-100, class364.field4694);
                    class319.field4112.method565(109, 89);
                    class319.field4112.method609(class37.field573.field6239, -62);
                    class319.field4112.method609(class37.field573.field6241, -62);
                    class319.field4112.method565(-127, 63);
                } else {
                    class423.field5829 = arg3;
                    class21.field407 = 1;
                    class159.field2091 = arg2;
                    class267.field3382 = 0;
                }
                class411.method2431(1, 0, true, 1, ~arg0, var5, var4, 0, -4);
            }
        }
        if (var6 == 1012) {
            class102.field1403++;
            class267.field3382 = 0;
            class159.field2091 = arg2;
            class21.field407 = 2;
            class423.field5829 = arg3;
            class420.method2472((byte) -101, class366.field4703);
            class319.field4112.method609(var7, -114);
        }
        if (var6 == 3 && class310.field4000 == null) {
            class168.method1122(var4, var5, (byte) 58);
            class310.field4000 = class520.method3091(var5, (byte) 126, var4);
            class415.method2440(arg0 ^ 0xA, class310.field4000);
        }
        if (var6 == 10) {
            class518 var12 = class76.field952[var7];
            if (var12 != null) {
                class43.field632++;
                class159.field2091 = arg2;
                class423.field5829 = arg3;
                class21.field407 = 2;
                class267.field3382 = 0;
                class420.method2472((byte) -101, class81.field1012);
                class319.field4112.method598(class439.field6113.method1488((byte) 113, 82) ? 1 : 0, (byte) 125);
                class319.field4112.method560(false, var7);
                class411.method2431(var12.method2342(10804), 0, true, var12.method2342(arg0 + 10804), -1, var12.field5251[0], var12.field5246[0], 0, -2);
            }
        }
        if (var6 == 15) {
            class21.field407 = 2;
            class267.field3382 = 0;
            class423.field5829 = arg3;
            class159.field2091 = arg2;
            class458.field6388++;
            class420.method2472((byte) -101, class23.field421);
            class319.field4112.method594(arg0 ^ 0x8F9, class439.field6113.method1488((byte) 65, 82) ? 1 : 0);
            class319.field4112.method566(-12633, var4 + class35.field545);
            class319.field4112.method606(var7, (byte) -84);
            class319.field4112.method566(arg0 ^ 0xFFFFCEA7, class336.field4299 + var5);
            class52.method312(var5, -18602, var4);
        }
        if (var6 == 4) {
            class295 var13 = class527.field7791[var7];
            if (var13 != null) {
                class267.field3382 = 0;
                class21.field407 = 2;
                class405.field5431++;
                class159.field2091 = arg2;
                class423.field5829 = arg3;
                class420.method2472((byte) -101, class212.field2723);
                class319.field4112.method559(class439.field6113.method1488((byte) 95, 82) ? 1 : 0, (byte) 115);
                class319.field4112.method560(false, var7);
                class411.method2431(var13.method2342(arg0 + 10804), 0, true, var13.method2342(10804), -1, var13.field5251[0], var13.field5246[0], 0, -2);
            }
        }
        if (var6 == 30) {
            class518 var14 = class76.field952[var7];
            if (var14 != null) {
                class267.field3382 = 0;
                class159.field2091 = arg2;
                class292.field3746++;
                class423.field5829 = arg3;
                class21.field407 = 2;
                class420.method2472((byte) -101, class445.field6189);
                class319.field4112.method598(class439.field6113.method1488((byte) 86, 82) ? 1 : 0, (byte) 124);
                class319.field4112.method609(var7, -125);
                class411.method2431(var14.method2342(arg0 ^ 0x2A34), 0, true, var14.method2342(10804), ~arg0, var14.field5251[0], var14.field5246[0], 0, -2);
            }
        }
        if (var6 == 23) {
            class518 var15 = class76.field952[var7];
            if (var15 != null) {
                class159.field2091 = arg2;
                class21.field407 = 2;
                class513.field7544++;
                class423.field5829 = arg3;
                class267.field3382 = 0;
                class420.method2472((byte) -101, class420.field5630);
                class319.field4112.method594(arg0 ^ 0x8F9, class439.field6113.method1488((byte) 90, 82) ? 1 : 0);
                class319.field4112.method609(var7, -99);
                class411.method2431(var15.method2342(10804), 0, true, var15.method2342(10804), -1, var15.field5251[0], var15.field5246[0], 0, -2);
            }
        }
        if (var6 == 12) {
            if (class363.field4685 > 0 && class439.field6113.method1488((byte) 77, 82) && class439.field6113.method1488((byte) 67, 81)) {
                class195.method1264(class37.field573.field6220, arg0, class336.field4299 + var5, class35.field545 + var4);
            } else {
                class21.field407 = 1;
                class267.field3382 = 0;
                class423.field5829 = arg3;
                class109.field1491++;
                class159.field2091 = arg2;
                class420.method2472((byte) -101, class25.field436);
                class319.field4112.method609(class35.field545 + var4, -89);
                class319.field4112.method609(class336.field4299 + var5, -55);
            }
        }
        if (var6 == 5) {
            class21.field407 = 2;
            class267.field3382 = 0;
            class423.field5829 = arg3;
            class159.field2091 = arg2;
            class375.field4868++;
            class420.method2472((byte) -101, class311.field4013);
            class319.field4112.method566(-12633, class206.field2687);
            class319.field4112.method606(class315.field4065, (byte) -111);
            class319.field4112.method571(45194672, class172.field2229);
            class319.field4112.method566(-12633, class35.field545 + var4);
            class319.field4112.method559(class439.field6113.method1488((byte) 92, 82) ? 1 : 0, (byte) 124);
            class319.field4112.method606(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) 126);
            class319.field4112.method606(class336.field4299 + var5, (byte) -84);
            class270.method1663(arg0 + 7026, var4, var5, var8);
        }
        if (var6 == 16) {
            class159.field2091 = arg2;
            class21.field407 = 2;
            class423.field5829 = arg3;
            class523.field7752++;
            class267.field3382 = 0;
            class420.method2472((byte) -101, class97.field1354);
            class319.field4112.method606(var4 + class35.field545, (byte) -92);
            class319.field4112.method560(false, var7);
            class319.field4112.method609(var5 + class336.field4299, -89);
            class319.field4112.method566(-12633, class315.field4065);
            class319.field4112.method560(false, class206.field2687);
            class319.field4112.method559(class439.field6113.method1488((byte) 98, 82) ? 1 : 0, (byte) 113);
            class319.field4112.method607(21, class172.field2229);
            class52.method312(var5, arg0 - 18602, var4);
        }
        if (var6 == 58) {
            class295 var16 = class527.field7791[var7];
            if (var16 != null) {
                class267.field3382 = 0;
                class159.field2091 = arg2;
                class423.field5829 = arg3;
                class21.field407 = 2;
                class125.field1721++;
                class420.method2472((byte) -101, class307.field3950);
                class319.field4112.method565(-85, class439.field6113.method1488((byte) 65, 82) ? 1 : 0);
                class319.field4112.method560(false, var7);
                class411.method2431(var16.method2342(10804), 0, true, var16.method2342(10804), -1, var16.field5251[0], var16.field5246[0], 0, -2);
            }
        }
        if (var6 == 1001) {
            class21.field407 = 2;
            class267.field3382 = 0;
            class159.field2091 = arg2;
            class423.field5829 = arg3;
            class295 var17 = class527.field7791[var7];
            if (var17 != null) {
                class10 var18 = var17.field3831;
                if (var18.field111 != null) {
                    var18 = var18.method63(false, class198.field2555);
                }
                if (var18 != null) {
                    class32.field529++;
                    class420.method2472((byte) -101, class185.field2424);
                    class319.field4112.method609(var18.field104, arg0 - 71);
                }
            }
        }
        if (var6 == 47) {
            class104.field1425++;
            class21.field407 = 2;
            class267.field3382 = 0;
            class423.field5829 = arg3;
            class159.field2091 = arg2;
            class420.method2472((byte) -101, class69.field841);
            class319.field4112.method560(false, class336.field4299 + var5);
            class319.field4112.method609(var7, arg0 ^ 0xFFFFFFB5);
            class319.field4112.method598(class439.field6113.method1488((byte) 118, 82) ? 1 : 0, (byte) 122);
            class319.field4112.method609(class35.field545 + var4, -67);
            class52.method312(var5, -18602, var4);
        }
        if (var6 == 49) {
            class295 var19 = class527.field7791[var7];
            if (var19 != null) {
                class56.field752++;
                class21.field407 = 2;
                class423.field5829 = arg3;
                class267.field3382 = 0;
                class159.field2091 = arg2;
                class420.method2472((byte) -101, class115.field1568);
                class319.field4112.method566(-12633, var7);
                class319.field4112.method559(class439.field6113.method1488((byte) 82, 82) ? 1 : 0, (byte) 110);
                class411.method2431(var19.method2342(10804), 0, true, var19.method2342(arg0 ^ 0x2A34), -1, var19.field5251[0], var19.field5246[0], 0, -2);
            }
        }
        if (var6 == 6) {
            class267.field3382 = 0;
            class274.field3487++;
            class159.field2091 = arg2;
            class21.field407 = 2;
            class423.field5829 = arg3;
            class420.method2472((byte) -101, client.field7520);
            class319.field4112.method560(false, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class319.field4112.method560(false, class336.field4299 + var5);
            class319.field4112.method594(2297, class439.field6113.method1488((byte) 119, 82) ? 1 : 0);
            class319.field4112.method560(false, class35.field545 + var4);
            class270.method1663(arg0 + 7026, var4, var5, var8);
        }
        if (var6 == 11) {
            class518 var20 = class76.field952[var7];
            if (var20 != null) {
                class423.field5829 = arg3;
                class21.field407 = 2;
                class159.field2091 = arg2;
                class267.field3382 = 0;
                class459.field6417++;
                class420.method2472((byte) -101, class294.field3804);
                class319.field4112.method566(-12633, var7);
                class319.field4112.method609(class315.field4065, -58);
                class319.field4112.method559(class439.field6113.method1488((byte) 83, 82) ? 1 : 0, (byte) 111);
                class319.field4112.method572(arg0 - 119, class172.field2229);
                class319.field4112.method560(false, class206.field2687);
                class411.method2431(var20.method2342(10804), 0, true, var20.method2342(10804), arg0 - 1, var20.field5251[0], var20.field5246[0], 0, -2);
            }
        }
        if (var6 == 44) {
            class295 var21 = class527.field7791[var7];
            if (var21 != null) {
                class423.field5829 = arg3;
                class371.field4803++;
                class159.field2091 = arg2;
                class21.field407 = 2;
                class267.field3382 = 0;
                class420.method2472((byte) -101, class319.field4108);
                class319.field4112.method565(96, class439.field6113.method1488((byte) 103, 82) ? 1 : 0);
                class319.field4112.method606(var7, (byte) -112);
                class411.method2431(var21.method2342(10804), 0, true, var21.method2342(10804), -1, var21.field5251[0], var21.field5246[0], 0, -2);
            }
        }
        if (var6 == 1004) {
            class21.field407 = 2;
            class285.field3636++;
            class159.field2091 = arg2;
            class423.field5829 = arg3;
            class267.field3382 = 0;
            class420.method2472((byte) -101, class237.field3084);
            class319.field4112.method609(var7, arg0 - 99);
        }
        if (var6 == 59) {
            class518 var22 = class76.field952[var7];
            if (var22 != null) {
                class331.field4249++;
                class423.field5829 = arg3;
                class159.field2091 = arg2;
                class267.field3382 = 0;
                class21.field407 = 2;
                class420.method2472((byte) -101, class237.field3086);
                class319.field4112.method606(var7, (byte) 121);
                class319.field4112.method559(class439.field6113.method1488((byte) 115, 82) ? 1 : 0, (byte) 112);
                class411.method2431(var22.method2342(10804), 0, true, var22.method2342(arg0 + 10804), -1, var22.field5251[0], var22.field5246[0], 0, -2);
            }
        }
        if (var6 == 46) {
            class423 var23 = class520.method3091(var5, (byte) 126, var4);
            if (var23 != null) {
                class185.method1224(var23, 18);
            }
        }
        if (var6 == 50) {
            class295 var24 = class527.field7791[var7];
            if (var24 != null) {
                class267.field3382 = 0;
                class159.field2091 = arg2;
                class29.field482++;
                class423.field5829 = arg3;
                class21.field407 = 2;
                class420.method2472((byte) -101, class78.field1002);
                class319.field4112.method560(false, var7);
                class319.field4112.method559(class439.field6113.method1488((byte) 96, 82) ? 1 : 0, (byte) 111);
                class411.method2431(var24.method2342(arg0 ^ 0x2A34), 0, true, var24.method2342(arg0 + 10804), arg0 - 1, var24.field5251[0], var24.field5246[0], 0, -2);
            }
        }
        if (var6 == 18 || var6 == 1008) {
            class449.method2663(arg1.field7375, var5, var4, 2, var7);
        }
        if (var6 == 60) {
            class518 var25 = class76.field952[var7];
            if (var25 != null) {
                class103.field1412++;
                class267.field3382 = 0;
                class423.field5829 = arg3;
                class159.field2091 = arg2;
                class21.field407 = 2;
                class420.method2472((byte) -101, class319.field4113);
                class319.field4112.method559(class439.field6113.method1488((byte) 118, 82) ? 1 : 0, (byte) 125);
                class319.field4112.method566(-12633, var7);
                class411.method2431(var25.method2342(10804), 0, true, var25.method2342(arg0 ^ 0x2A34), arg0 - 1, var25.field5251[0], var25.field5246[0], 0, -2);
            }
        }
        if (var6 == 8) {
            class518 var26 = class76.field952[var7];
            if (var26 != null) {
                class21.field407 = 2;
                class414.field5500++;
                class159.field2091 = arg2;
                class267.field3382 = 0;
                class423.field5829 = arg3;
                class420.method2472((byte) -101, class177.field2272);
                class319.field4112.method560(false, var7);
                class319.field4112.method598(class439.field6113.method1488((byte) 68, 82) ? 1 : 0, (byte) 124);
                class411.method2431(var26.method2342(10804), 0, true, var26.method2342(arg0 ^ 0x2A34), -1, var26.field5251[0], var26.field5246[0], 0, -2);
            }
        }
        if (arg0 != 0) {
            field2386 = null;
        }
        if (var6 == 51) {
            class21.field407 = 2;
            class299.field3887++;
            class159.field2091 = arg2;
            class423.field5829 = arg3;
            class267.field3382 = 0;
            class420.method2472((byte) -101, class54.field740);
            class319.field4112.method560(false, var7);
            class319.field4112.method559(class439.field6113.method1488((byte) 95, 82) ? 1 : 0, (byte) 127);
            class319.field4112.method606(class35.field545 + var4, (byte) -89);
            class319.field4112.method566(-12633, class336.field4299 + var5);
            class52.method312(var5, -18602, var4);
        }
        if (var6 == 20) {
            class267.field3382 = 0;
            class248.field3167++;
            class21.field407 = 1;
            class159.field2091 = arg2;
            class423.field5829 = arg3;
            class420.method2472((byte) -101, class353.field4517);
            class319.field4112.method606(class315.field4065, (byte) 70);
            class319.field4112.method560(false, class336.field4299 + var5);
            class319.field4112.method562(35, class172.field2229);
            class319.field4112.method566(-12633, class206.field2687);
            class319.field4112.method566(-12633, class35.field545 + var4);
            class411.method2431(1, 0, true, 1, -1, var5, var4, 0, -4);
        }
        if (var6 == 19) {
            class295 var27 = class527.field7791[var7];
            if (var27 != null) {
                class502.field7386++;
                class159.field2091 = arg2;
                class267.field3382 = 0;
                class21.field407 = 2;
                class423.field5829 = arg3;
                class420.method2472((byte) -101, class179.field2296);
                class319.field4112.method562(-110, class172.field2229);
                class319.field4112.method598(class439.field6113.method1488((byte) 92, 82) ? 1 : 0, (byte) 121);
                class319.field4112.method609(class206.field2687, -85);
                class319.field4112.method609(var7, -82);
                class319.field4112.method560(false, class315.field4065);
                class411.method2431(var27.method2342(arg0 + 10804), 0, true, var27.method2342(arg0 ^ 0x2A34), -1, var27.field5251[0], var27.field5246[0], 0, -2);
            }
        }
        if (var6 == 48) {
            class423.field5829 = arg3;
            class18.field307++;
            class267.field3382 = 0;
            class21.field407 = 2;
            class159.field2091 = arg2;
            class420.method2472((byte) -101, class471.field6879);
            class319.field4112.method566(-12633, class35.field545 + var4);
            class319.field4112.method606(class336.field4299 + var5, (byte) 101);
            class319.field4112.method594(arg0 ^ 0x8F9, class439.field6113.method1488((byte) 114, 82) ? 1 : 0);
            class319.field4112.method606(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) 126);
            class270.method1663(arg0 + 7026, var4, var5, var8);
        }
        if (var6 == 9) {
            class488.field7116++;
            class267.field3382 = 0;
            class423.field5829 = arg3;
            class21.field407 = 2;
            class159.field2091 = arg2;
            class420.method2472((byte) -101, class360.field4663);
            class319.field4112.method609(var7, arg0 ^ 0xFFFFFFB6);
            class319.field4112.method594(arg0 + 2297, class439.field6113.method1488((byte) 74, 82) ? 1 : 0);
            class319.field4112.method609(var4 + class35.field545, -99);
            class319.field4112.method560(false, class336.field4299 + var5);
            class52.method312(var5, -18602, var4);
        }
        if (var6 == 17) {
            class242.field3108++;
            class423.field5829 = arg3;
            class21.field407 = 2;
            class159.field2091 = arg2;
            class267.field3382 = 0;
            class420.method2472((byte) -101, class265.field3361);
            class319.field4112.method559(class439.field6113.method1488((byte) 90, 82) ? 1 : 0, (byte) 117);
            class319.field4112.method609(class35.field545 + var4, -112);
            class319.field4112.method609(var5 + class336.field4299, -114);
            class319.field4112.method606(var7, (byte) -97);
            class52.method312(var5, -18602, var4);
        }
        if (var6 == 25) {
            class518 var28 = class76.field952[var7];
            if (var28 != null) {
                class423.field5829 = arg3;
                class267.field3382 = 0;
                class64.field813++;
                class21.field407 = 2;
                class159.field2091 = arg2;
                class420.method2472((byte) -101, class423.field5783);
                class319.field4112.method560(false, var7);
                class319.field4112.method598(class439.field6113.method1488((byte) 108, 82) ? 1 : 0, (byte) 127);
                class411.method2431(var28.method2342(10804), 0, true, var28.method2342(10804), -1, var28.field5251[0], var28.field5246[0], 0, -2);
            }
        }
        if (var6 == 22) {
            class518 var29 = class76.field952[var7];
            if (var29 != null) {
                class21.field407 = 2;
                class423.field5829 = arg3;
                class301.field3895++;
                class159.field2091 = arg2;
                class267.field3382 = 0;
                class420.method2472((byte) -101, class169.field2212);
                class319.field4112.method606(var7, (byte) 100);
                class319.field4112.method565(-118, class439.field6113.method1488((byte) 127, 82) ? 1 : 0);
                class411.method2431(var29.method2342(10804), 0, true, var29.method2342(10804), -1, var29.field5251[0], var29.field5246[0], 0, -2);
            }
        }
        if (class515.field7573) {
            class356.method2082(-1);
        }
        if (class147.field1944 != null && class486.field7061 == 0) {
            class415.method2440(10, class147.field1944);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIII)V")
    public abstract void method1205(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(IIIIIF)V")
    public class182(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field2385 = arg3;
        this.field2383 = arg1;
        this.field2382 = arg2;
        this.field2381 = arg5;
        this.field2376 = arg4;
        this.field2388 = arg0;
    }
}
