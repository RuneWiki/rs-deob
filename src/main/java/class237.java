import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class237 {

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "[I")
    public static int[] field3328 = new int[25];

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Lwe;")
    public static class24 field3325 = new class24(50);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)V", line = 3)
    public static final void method1447(byte arg0, int arg1) {
        class75.field1017 = arg1;
        field3324++;
        class24 var2 = class86.field1204;
        synchronized (class86.field1204) {
            if (arg0 != -120) {
                return;
            }
            class86.field1204.method212(-97);
        }
        class24 var3 = class197.field2819;
        synchronized (class197.field2819) {
            class197.field2819.method212(-100);
        }
        class24 var4 = class295.field4257;
        synchronized (class295.field4257) {
            class295.field4257.method212(-109);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIZLnr;Lta;I)V", line = 23)
    public static final void method1448(int arg0, int arg1, boolean arg2, class437 arg3, class404 arg4, int arg5) {
        field3323++;
        class57 var6 = class69.method441((byte) -110, arg4.field6054);
        if (var6.field816 == -1) {
            return;
        }
        int var7;
        if (arg4.field6065) {
            int var8 = arg4.field6041 + arg5;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class243 var9 = var6.method387(arg4.field6068, var7, -31318, arg3);
        if (var9 == null) {
            return;
        }
        int var10 = arg4.field6048;
        int var11 = arg4.field6014;
        if ((var7 & 0x1) == 1) {
            var11 = arg4.field6048;
            var10 = arg4.field6014;
        }
        int var12 = var9.method1088();
        if (arg2) {
            method1449((class259) null, -65);
        }
        int var13 = var9.method1091();
        if (var6.field830) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field820 == 0) {
            var9.method1495(arg1, arg0 + 4 - var11 * 4, var12, var13);
        } else {
            var9.method32(arg1, -(var11 * 4) - (-arg0 - 4), var12, var13, 1, var6.field820 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lmb;I)V", line = 80)
    public static final void method1449(class259 arg0, int arg1) {
        field3327++;
        if (arg0 == null || class373.field5574.field6108 == arg0) {
            return;
        }
        int var2 = arg0.field3779;
        int var3 = arg0.field3776;
        int var4 = arg0.field3777;
        int var5 = (int) arg0.field3772;
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        long var6 = arg0.field3772;
        if (var4 == 59) {
            class194 var8 = class125.field1664[var5];
            if (var8 != null) {
                class161.field2104 = 2;
                client.field3678++;
                class263.field3827 = class420.field6256;
                class110.field1509 = class242.field3390;
                class392.field5883 = 0;
                class232.field3279.method756(0, 94);
                class232.field3279.method1707(-115, class1.field5[82] ? 1 : 0);
                class232.field3279.method1670(var5, (byte) -115);
                class308.method1928(-2, var8.field303[0], 0, 123, var8.field306[0], var8.method130((byte) -78), class100.field1350.field303[0], class100.field1350.field306[0], 0, var8.method130((byte) -126), true);
            }
        }
        if (var4 == 2) {
            class232.field3279.method756(0, 248);
            class110.field1515++;
            class232.field3279.method1704(var3, (byte) 125);
            class232.field3279.method1718(var2, (byte) -121);
            class232.field3279.method1670(var5, (byte) -115);
            class122.field1631 = 0;
            class416.field6207 = class107.method746(var3, -54);
            class367.field5461 = var2;
        }
        if (var4 == 4) {
            class249 var9 = class358.method2355(var2, var3, (byte) -109);
            if (var9 != null) {
                class312.method1951(2878);
                class185 var10 = client.method1572(var9);
                class273.method1748(var10.field2515, var9.field3541, var2, false, var9.field3470, var10.method1149((byte) 101), var3);
                class394.field5921 = 0;
                class191.field2667 = class360.method2364(var9, (byte) 90);
                if (class191.field2667 == null) {
                    class191.field2667 = "Null";
                }
                if (var9.field3522) {
                    class333.field4927 = var9.field3558 + "<col=ffffff>";
                    return;
                }
                class333.field4927 = "<col=00ff00>" + var9.field3540 + "<col=ffffff>";
            }
            return;
        }
        if (var4 == 1007 || var4 == 1002 || var4 == 1010 || var4 == 1003 || var4 == 1004) {
            class198.method1238(var2, -9328, var4, var5);
        }
        if (var4 == 1009) {
            class376.field5680++;
            class161.field2104 = 2;
            class110.field1509 = class242.field3390;
            class392.field5883 = 0;
            class263.field3827 = class420.field6256;
            class232.field3279.method756(0, 142);
            class232.field3279.method1718(var5, (byte) -127);
        }
        if (var4 == 18) {
            class232.field3269++;
            class232.field3279.method756(0, 78);
            class232.field3279.method1704(var3, (byte) 125);
            class232.field3279.method1718(var5, (byte) -120);
            class232.field3279.method1693(class94.field1304, (byte) 98);
            class232.field3279.method1670(var2, (byte) -115);
            class232.field3279.method1716((byte) -98, class300.field4307);
            class122.field1631 = 0;
            class416.field6207 = class107.method746(var3, -4);
            class367.field5461 = var2;
        }
        if (var4 == 1005) {
            class263.field3827 = class420.field6256;
            class110.field1509 = class242.field3390;
            class161.field2104 = 2;
            class442.field6462++;
            class392.field5883 = 0;
            class232.field3279.method756(0, 124);
            class232.field3279.method1706(-12614, var5);
        }
        if (var4 == 49) {
            class194 var11 = class125.field1664[var5];
            if (var11 != null) {
                class161.field2104 = 2;
                class392.field5883 = 0;
                class451.field6580++;
                class110.field1509 = class242.field3390;
                class263.field3827 = class420.field6256;
                class232.field3279.method756(0, 152);
                class232.field3279.method1719(class1.field5[82] ? 1 : 0, 1549190008);
                class232.field3279.method1693(var5, (byte) 74);
                class308.method1928(-2, var11.field303[0], 0, -61, var11.field306[0], var11.method130((byte) -81), class100.field1350.field303[0], class100.field1350.field306[0], 0, var11.method130((byte) -85), true);
            }
        }
        if (var4 == 23) {
            class129 var12 = class23.field408[var5];
            if (var12 != null) {
                class392.field5883 = 0;
                class263.field3827 = class420.field6256;
                class161.field2104 = 2;
                class160.field2095++;
                class110.field1509 = class242.field3390;
                class232.field3279.method756(0, 136);
                class232.field3279.method1693(class91.field1248, (byte) 27);
                class232.field3279.method1716((byte) -55, class73.field990);
                class232.field3279.method1696(true, class1.field5[82] ? 1 : 0);
                class232.field3279.method1706(-12614, class327.field4696);
                class232.field3279.method1670(var5, (byte) -115);
                class308.method1928(-2, var12.field303[0], 0, 101, var12.field306[0], var12.method130((byte) -104), class100.field1350.field303[0], class100.field1350.field306[0], 0, var12.method130((byte) -38), true);
            }
        }
        if (var4 == 16) {
            class194 var13 = class125.field1664[var5];
            if (var13 != null) {
                class263.field3827 = class420.field6256;
                class392.field5883 = 0;
                class393.field5899++;
                class110.field1509 = class242.field3390;
                class161.field2104 = 2;
                class232.field3279.method756(0, 185);
                class232.field3279.method1696(true, class1.field5[82] ? 1 : 0);
                class232.field3279.method1693(var5, (byte) 39);
                class308.method1928(-2, var13.field303[0], 0, 99, var13.field306[0], var13.method130((byte) -102), class100.field1350.field303[0], class100.field1350.field306[0], 0, var13.method130((byte) -53), true);
            }
        }
        if (var4 == 42) {
            class74.field1005++;
            class232.field3279.method756(0, 69);
            class232.field3279.method1704(var3, (byte) 125);
            class232.field3279.method1718(var2, (byte) -122);
            class232.field3279.method1706(-12614, var5);
            class122.field1631 = 0;
            class416.field6207 = class107.method746(var3, -67);
            class367.field5461 = var2;
        }
        if (var4 == 1011) {
            class324.field4660++;
            class263.field3827 = class420.field6256;
            class110.field1509 = class242.field3390;
            class161.field2104 = 2;
            class392.field5883 = 0;
            class232.field3279.method756(0, 143);
            class232.field3279.method1706(-12614, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class232.field3279.method1696(true, class1.field5[82] ? 1 : 0);
            class232.field3279.method1706(-12614, class184.field2482 + var2);
            class232.field3279.method1706(-12614, var3 + class38.field620);
            class18.method128(var2, var3, 25242, var6);
        }
        if (var4 == 11) {
            class312.method1951(2878);
            class249 var14 = class107.method746(var3, -83);
            class91.field1248 = var2;
            class394.field5921 = 1;
            class327.field4696 = var5;
            class73.field990 = var3;
            class392.method2564(-125, var14);
            class66.field939 = "<col=ff9040>" + class166.method1031(var5, false).field2729 + "<col=ffffff>";
            if (class66.field939 == null) {
                class66.field939 = "null";
            }
            return;
        }
        if (var4 == 44) {
            class392.field5883 = 0;
            class161.field2104 = 2;
            class110.field1509 = class242.field3390;
            class263.field3827 = class420.field6256;
            class451.field6575++;
            class232.field3279.method756(0, 159);
            class232.field3279.method1693(class94.field1304, (byte) 122);
            class232.field3279.method1693(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) 97);
            class232.field3279.method1716((byte) -58, class300.field4307);
            class232.field3279.method1718(var2 + class184.field2482, (byte) -126);
            class232.field3279.method1719(class1.field5[82] ? 1 : 0, 1549190008);
            class232.field3279.method1706(-12614, class38.field620 + var3);
            class18.method128(var2, var3, 25242, var6);
        }
        if (var4 == 8) {
            class129 var15 = class23.field408[var5];
            if (var15 != null) {
                class110.field1509 = class242.field3390;
                class263.field3827 = class420.field6256;
                class392.field5883 = 0;
                class161.field2104 = 2;
                class126.field1676++;
                class232.field3279.method756(0, 207);
                class232.field3279.method1670(var5, (byte) -115);
                class232.field3279.method1719(class1.field5[82] ? 1 : 0, 1549190008);
                class308.method1928(-2, var15.field303[0], 0, -87, var15.field306[0], var15.method130((byte) -121), class100.field1350.field303[0], class100.field1350.field306[0], 0, var15.method130((byte) -64), true);
            }
        }
        if (var4 == 10) {
            class194 var16 = class125.field1664[var5];
            if (var16 != null) {
                class106.field1427++;
                class392.field5883 = 0;
                class110.field1509 = class242.field3390;
                class161.field2104 = 2;
                class263.field3827 = class420.field6256;
                class232.field3279.method756(0, 141);
                class232.field3279.method1707(72, class1.field5[82] ? 1 : 0);
                class232.field3279.method1693(var5, (byte) 119);
                class308.method1928(-2, var16.field303[0], 0, 14, var16.field306[0], var16.method130((byte) -38), class100.field1350.field303[0], class100.field1350.field306[0], 0, var16.method130((byte) -93), true);
            }
        }
        if (var4 == 38) {
            class232.field3279.method756(0, 205);
            class41.field644++;
            class232.field3279.method1704(var3, (byte) 125);
            class249 var17 = class107.method746(var3, -58);
            if (var17.field3494 != null && var17.field3494[0][0] == 5) {
                int var18 = var17.field3494[0][1];
                if (class192.field2668[var18] != var17.field3574[0]) {
                    class192.field2668[var18] = var17.field3574[0];
                    class413.method2681((byte) 102, var18);
                }
            }
        }
        if (var4 == 25) {
            class194 var19 = class125.field1664[var5];
            if (var19 != null) {
                class214.field3049++;
                class263.field3827 = class420.field6256;
                class161.field2104 = 2;
                class392.field5883 = 0;
                class110.field1509 = class242.field3390;
                class232.field3279.method756(0, 79);
                class232.field3279.method1687(-29012, class1.field5[82] ? 1 : 0);
                class232.field3279.method1670(class94.field1304, (byte) -115);
                class232.field3279.method1692(113414280, class300.field4307);
                class232.field3279.method1718(var5, (byte) -117);
                class308.method1928(-2, var19.field303[0], 0, 114, var19.field306[0], var19.method130((byte) -32), class100.field1350.field303[0], class100.field1350.field306[0], 0, var19.method130((byte) -103), true);
            }
        }
        if (var4 == 47) {
            class263.field3827 = class420.field6256;
            class198.field2835++;
            class161.field2104 = 2;
            class110.field1509 = class242.field3390;
            class392.field5883 = 0;
            class232.field3279.method756(0, 26);
            class232.field3279.method1693(class184.field2482 + var2, (byte) 109);
            class232.field3279.method1706(-12614, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class232.field3279.method1706(-12614, var3 + class38.field620);
            class232.field3279.method1707(-111, class1.field5[82] ? 1 : 0);
            class18.method128(var2, var3, 25242, var6);
        }
        if (var4 == 40) {
            class220.method1365(0, false);
        }
        if (var4 == 20) {
            class194 var20 = class125.field1664[var5];
            if (var20 != null) {
                class110.field1509 = class242.field3390;
                class392.field5883 = 0;
                class161.field2104 = 2;
                class263.field3827 = class420.field6256;
                class115.field1561++;
                class232.field3279.method756(0, 128);
                class232.field3279.method1718(var5, (byte) -128);
                class232.field3279.method1696(true, class1.field5[82] ? 1 : 0);
                class308.method1928(-2, var20.field303[0], 0, 103, var20.field306[0], var20.method130((byte) -67), class100.field1350.field303[0], class100.field1350.field306[0], 0, var20.method130((byte) -51), true);
            }
        }
        if (var4 == 45) {
            class110.field1509 = class242.field3390;
            class161.field2104 = 2;
            class160.field2091++;
            class263.field3827 = class420.field6256;
            class392.field5883 = 0;
            class232.field3279.method756(0, 190);
            class232.field3279.method1719(class1.field5[82] ? 1 : 0, 1549190008);
            class232.field3279.method1718(class38.field620 + var3, (byte) -121);
            class232.field3279.method1693(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) 72);
            class232.field3279.method1693(class184.field2482 + var2, (byte) 61);
            class18.method128(var2, var3, 25242, var6);
        }
        if (var4 == 14) {
            class129 var21 = class23.field408[var5];
            if (var21 != null) {
                class263.field3827 = class420.field6256;
                class392.field5883 = 0;
                class161.field2104 = 2;
                class72.field976++;
                class110.field1509 = class242.field3390;
                class232.field3279.method756(0, 38);
                class232.field3279.method1670(var5, (byte) -115);
                class232.field3279.method1707(-110, class1.field5[82] ? 1 : 0);
                class308.method1928(-2, var21.field303[0], 0, -108, var21.field306[0], var21.method130((byte) -52), class100.field1350.field303[0], class100.field1350.field306[0], 0, var21.method130((byte) -92), true);
            }
        }
        if (var4 == 46) {
            class142.field1870++;
            class110.field1509 = class242.field3390;
            class161.field2104 = 2;
            class263.field3827 = class420.field6256;
            class392.field5883 = 0;
            class232.field3279.method756(0, 194);
            class232.field3279.method1706(-12614, class38.field620 + var3);
            class232.field3279.method1718(var5, (byte) -120);
            class232.field3279.method1706(-12614, var2 + class184.field2482);
            class232.field3279.method1707(-117, class1.field5[82] ? 1 : 0);
            class93.method571(0, var3, var2);
        }
        if (var4 == 32) {
            class392.field5883 = 0;
            class263.field3827 = class420.field6256;
            class306.field4367++;
            class161.field2104 = 2;
            class110.field1509 = class242.field3390;
            class232.field3279.method756(0, 40);
            class232.field3279.method1693(class38.field620 + var3, (byte) 115);
            class232.field3279.method1706(-12614, class327.field4696);
            class232.field3279.method1704(class73.field990, (byte) 125);
            class232.field3279.method1706(-12614, var5);
            class232.field3279.method1693(class91.field1248, (byte) 125);
            class232.field3279.method1706(-12614, class184.field2482 + var2);
            class232.field3279.method1696(true, class1.field5[82] ? 1 : 0);
            class93.method571(0, var3, var2);
        }
        if (var4 == 57) {
            if (class227.field3206 > 0 && class1.field5[82] && class1.field5[81]) {
                class110.method767(class193.field2688, class38.field620 + var3, class184.field2482 + var2, 63);
            } else {
                class129.method883(var3, var5, 0, var2);
                if (var5 == 1) {
                    class232.field3279.method1707(-112, -1);
                    class232.field3279.method1707(44, -1);
                    class232.field3279.method1693((int) class170.field2244, (byte) 88);
                    class232.field3279.method1707(2, 57);
                    class232.field3279.method1707(-13, class66.field942);
                    class232.field3279.method1707(9, class59.field858);
                    class232.field3279.method1707(-109, 89);
                    class232.field3279.method1693(class100.field1350.field5284, (byte) 116);
                    class232.field3279.method1693(class100.field1350.field5298, (byte) 77);
                    class232.field3279.method1707(77, 63);
                } else {
                    class392.field5883 = 0;
                    class110.field1509 = class242.field3390;
                    class161.field2104 = 1;
                    class263.field3827 = class420.field6256;
                }
                class308.method1928(-4, var2, 0, 126, var3, 1, class100.field1350.field303[0], class100.field1350.field306[0], 0, 1, true);
            }
        }
        if (var4 == 60) {
            class110.field1509 = class242.field3390;
            class263.field3827 = class420.field6256;
            class161.field2104 = 2;
            class392.field5883 = 0;
            class163.field2117++;
            class232.field3279.method756(0, 174);
            class232.field3279.method1693(class184.field2482 + var2, (byte) 40);
            class232.field3279.method1718(var5, (byte) -124);
            class232.field3279.method1706(-12614, class38.field620 + var3);
            class232.field3279.method1707(-115, class1.field5[82] ? 1 : 0);
            class93.method571(0, var3, var2);
        }
        if (var4 == 22) {
            class394.method2578(var3, var2, -112);
        }
        if (var4 == 1008) {
            class161.field2104 = 2;
            class263.field3827 = class420.field6256;
            class110.field1509 = class242.field3390;
            class392.field5883 = 0;
            class129 var22 = class23.field408[var5];
            if (var22 != null) {
                class373 var23 = var22.field1714;
                if (var23.field5576 != null) {
                    var23 = var23.method2469(true);
                }
                if (var23 != null) {
                    class232.field3279.method756(0, 49);
                    class372.field5526++;
                    class232.field3279.method1670(var23.field5631, (byte) -115);
                }
            }
        }
        if (var4 == 5) {
            class392.field5883 = 0;
            class222.field3148++;
            class110.field1509 = class242.field3390;
            class161.field2104 = 2;
            class263.field3827 = class420.field6256;
            class232.field3279.method756(0, 6);
            class232.field3279.method1707(68, class1.field5[82] ? 1 : 0);
            class232.field3279.method1670(var5, (byte) -115);
            class232.field3279.method1718(class38.field620 + var3, (byte) -121);
            class232.field3279.method1670(var2 + class184.field2482, (byte) -115);
            class93.method571(0, var3, var2);
        }
        if (var4 == 29) {
            class249 var24 = class107.method746(var3, -58);
            boolean var25 = true;
            if (var24.field3608 > 0) {
                var25 = class24.method201(var24, -5241);
            }
            if (var25) {
                class41.field644++;
                class232.field3279.method756(0, 205);
                class232.field3279.method1704(var3, (byte) 126);
            }
        }
        if (var4 == 15) {
            class232.field3279.method756(0, 168);
            class297.field4272++;
            class232.field3279.method1704(var3, (byte) 127);
            class232.field3279.method1670(var2, (byte) -115);
            class232.field3279.method1706(-12614, var5);
            class122.field1631 = 0;
            class416.field6207 = class107.method746(var3, -6);
            class367.field5461 = var2;
        }
        if (var4 == 41) {
            class129 var26 = class23.field408[var5];
            if (var26 != null) {
                class263.field3827 = class420.field6256;
                class161.field2104 = 2;
                class392.field5883 = 0;
                class110.field1509 = class242.field3390;
                class442.field6458++;
                class232.field3279.method756(0, 254);
                class232.field3279.method1718(var5, (byte) -128);
                class232.field3279.method1707(-20, class1.field5[82] ? 1 : 0);
                class308.method1928(-2, var26.field303[0], 0, -32, var26.field306[0], var26.method130((byte) -98), class100.field1350.field303[0], class100.field1350.field306[0], 0, var26.method130((byte) -99), true);
            }
        }
        if (var4 == 36 || var4 == 1006) {
            class434.method2755((byte) 31, arg0.field3780, var3, var5, var2);
        }
        if (var4 == 34) {
            class41.field644++;
            class232.field3279.method756(0, 205);
            class232.field3279.method1704(var3, (byte) 125);
            class249 var27 = class107.method746(var3, -66);
            if (var27.field3494 != null && var27.field3494[0][0] == 5) {
                int var28 = var27.field3494[0][1];
                class192.field2668[var28] = 1 - class192.field2668[var28];
                class413.method2681((byte) 37, var28);
            }
        }
        if (var4 == 39) {
            class392.field5883 = 0;
            class161.field2104 = 2;
            class263.field3827 = class420.field6256;
            class336.field4961++;
            class110.field1509 = class242.field3390;
            class232.field3279.method756(0, 12);
            class232.field3279.method1718(class38.field620 + var3, (byte) -123);
            class232.field3279.method1706(-12614, class184.field2482 + var2);
            class232.field3279.method1707(-28, class1.field5[82] ? 1 : 0);
            class232.field3279.method1670(var5, (byte) -115);
            class93.method571(0, var3, var2);
        }
        if (arg1 < 79) {
            field3325 = null;
        }
        if (var4 == 24 && class371.field5518 == null) {
            class127.method868(false, var3, var2);
            class371.field5518 = class358.method2355(var2, var3, (byte) -101);
            class392.method2564(-117, class371.field5518);
        }
        if (var4 == 48) {
            class232.field3279.method756(0, 111);
            class433.field6387++;
            class232.field3279.method1704(var3, (byte) 125);
            class232.field3279.method1693(var2, (byte) 57);
            class232.field3279.method1706(-12614, var5);
            class122.field1631 = 0;
            class416.field6207 = class107.method746(var3, -22);
            class367.field5461 = var2;
        }
        if (var4 == 50) {
            class110.field1509 = class242.field3390;
            class392.field5883 = 0;
            class263.field3827 = class420.field6256;
            class101.field1365++;
            class161.field2104 = 1;
            class232.field3279.method756(0, 241);
            class232.field3279.method1718(class38.field620 + var3, (byte) -124);
            class232.field3279.method1706(-12614, class184.field2482 + var2);
            class232.field3279.method1711(class300.field4307, -2062);
            class232.field3279.method1670(class94.field1304, (byte) -115);
            class308.method1928(-4, var2, 0, 113, var3, 1, class100.field1350.field303[0], class100.field1350.field306[0], 0, 1, true);
        }
        if (var4 == 12) {
            class110.field1509 = class242.field3390;
            class263.field3827 = class420.field6256;
            class161.field2104 = 2;
            class392.field5883 = 0;
            class235.field3310++;
            class232.field3279.method756(0, 202);
            class232.field3279.method1670(var3 + class38.field620, (byte) -115);
            class232.field3279.method1670(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) -115);
            class232.field3279.method1716((byte) -61, class73.field990);
            class232.field3279.method1718(class327.field4696, (byte) -125);
            class232.field3279.method1718(class91.field1248, (byte) -123);
            class232.field3279.method1670(class184.field2482 + var2, (byte) -115);
            class232.field3279.method1696(true, class1.field5[82] ? 1 : 0);
            class18.method128(var2, var3, 25242, var6);
        }
        if (var4 == 26) {
            class436.field6398++;
            class232.field3279.method756(0, 229);
            class232.field3279.method1704(var3, (byte) 127);
            class232.field3279.method1706(-12614, var5);
            class232.field3279.method1706(-12614, var2);
            class122.field1631 = 0;
            class416.field6207 = class107.method746(var3, -93);
            class367.field5461 = var2;
        }
        if (var4 == 58) {
            class392.field5883 = 0;
            class71.field971++;
            class161.field2104 = 2;
            class263.field3827 = class420.field6256;
            class110.field1509 = class242.field3390;
            class232.field3279.method756(0, 151);
            class232.field3279.method1706(-12614, class184.field2482 + var2);
            class232.field3279.method1693(class38.field620 + var3, (byte) 70);
            class232.field3279.method1707(-114, class1.field5[82] ? 1 : 0);
            class232.field3279.method1670(var5, (byte) -115);
            class93.method571(0, var3, var2);
        }
        if (var4 == 21) {
            class194 var29 = class125.field1664[var5];
            if (var29 != null) {
                class392.field5883 = 0;
                class110.field1509 = class242.field3390;
                class157.field2060++;
                class263.field3827 = class420.field6256;
                class161.field2104 = 2;
                class232.field3279.method756(0, 35);
                class232.field3279.method1693(var5, (byte) 112);
                class232.field3279.method1687(-29012, class1.field5[82] ? 1 : 0);
                class308.method1928(-2, var29.field303[0], 0, 88, var29.field306[0], var29.method130((byte) -108), class100.field1350.field303[0], class100.field1350.field306[0], 0, var29.method130((byte) -82), true);
            }
        }
        if (var4 == 17) {
            if (class227.field3206 > 0 && class1.field5[82] && class1.field5[81]) {
                class110.method767(class193.field2688, class38.field620 + var3, class184.field2482 - -var2, 63);
            } else {
                class84.field1165++;
                class263.field3827 = class420.field6256;
                class392.field5883 = 0;
                class110.field1509 = class242.field3390;
                class161.field2104 = 1;
                class232.field3279.method756(0, 160);
                class232.field3279.method1718(class184.field2482 + var2, (byte) -127);
                class232.field3279.method1670(class38.field620 + var3, (byte) -115);
            }
        }
        if (var4 == 28) {
            class194 var30 = class125.field1664[var5];
            if (var30 != null) {
                class161.field2104 = 2;
                class110.field1509 = class242.field3390;
                class95.field1314++;
                class263.field3827 = class420.field6256;
                class392.field5883 = 0;
                class232.field3279.method756(0, 114);
                class232.field3279.method1693(var5, (byte) 54);
                class232.field3279.method1687(-29012, class1.field5[82] ? 1 : 0);
                class308.method1928(-2, var30.field303[0], 0, -62, var30.field306[0], var30.method130((byte) -45), class100.field1350.field303[0], class100.field1350.field306[0], 0, var30.method130((byte) -67), true);
            }
        }
        if (var4 == 1) {
            class129 var31 = class23.field408[var5];
            if (var31 != null) {
                class110.field1509 = class242.field3390;
                class161.field2104 = 2;
                class263.field3827 = class420.field6256;
                class392.field5883 = 0;
                class398.field5959++;
                class232.field3279.method756(0, 95);
                class232.field3279.method1670(var5, (byte) -115);
                class232.field3279.method1687(-29012, class1.field5[82] ? 1 : 0);
                class308.method1928(-2, var31.field303[0], 0, 87, var31.field306[0], var31.method130((byte) -39), class100.field1350.field303[0], class100.field1350.field306[0], 0, var31.method130((byte) -35), true);
            }
        }
        if (var4 == 7) {
            class110.field1509 = class242.field3390;
            class392.field5883 = 0;
            class263.field3827 = class420.field6256;
            class437.field6411++;
            class161.field2104 = 2;
            class232.field3279.method756(0, 54);
            class232.field3279.method1693(class94.field1304, (byte) 119);
            class232.field3279.method1707(-109, class1.field5[82] ? 1 : 0);
            class232.field3279.method1706(-12614, var5);
            class232.field3279.method1706(-12614, var2 + class184.field2482);
            class232.field3279.method1716((byte) -127, class300.field4307);
            class232.field3279.method1693(var3 + class38.field620, (byte) 94);
            class93.method571(0, var3, var2);
        }
        if (var4 == 13) {
            class129 var32 = class23.field408[var5];
            if (var32 != null) {
                class263.field3827 = class420.field6256;
                class339.field4984++;
                class110.field1509 = class242.field3390;
                class161.field2104 = 2;
                class392.field5883 = 0;
                class232.field3279.method756(0, 84);
                class232.field3279.method1670(class94.field1304, (byte) -115);
                class232.field3279.method1693(var5, (byte) 121);
                class232.field3279.method1696(true, class1.field5[82] ? 1 : 0);
                class232.field3279.method1692(113414280, class300.field4307);
                class308.method1928(-2, var32.field303[0], 0, 0, var32.field306[0], var32.method130((byte) -67), class100.field1350.field303[0], class100.field1350.field306[0], 0, var32.method130((byte) -83), true);
            }
        }
        if (var4 == 51) {
            class194 var33 = class125.field1664[var5];
            if (var33 != null) {
                class161.field2104 = 2;
                class17.field194++;
                class110.field1509 = class242.field3390;
                class392.field5883 = 0;
                class263.field3827 = class420.field6256;
                class232.field3279.method756(0, 140);
                class232.field3279.method1670(var5, (byte) -115);
                class232.field3279.method1687(-29012, class1.field5[82] ? 1 : 0);
                class308.method1928(-2, var33.field303[0], 0, 105, var33.field306[0], var33.method130((byte) -82), class100.field1350.field303[0], class100.field1350.field306[0], 0, var33.method130((byte) -33), true);
            }
        }
        if (var4 == 33) {
            class110.field1509 = class242.field3390;
            class307.field4391++;
            class161.field2104 = 2;
            class392.field5883 = 0;
            class263.field3827 = class420.field6256;
            class232.field3279.method756(0, 181);
            class232.field3279.method1718(class184.field2482 + var2, (byte) -127);
            class232.field3279.method1706(-12614, class38.field620 + var3);
            class232.field3279.method1693(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) 113);
            class232.field3279.method1707(47, class1.field5[82] ? 1 : 0);
            class18.method128(var2, var3, 25242, var6);
        }
        if (var4 == 37) {
            class100.field1345++;
            class161.field2104 = 2;
            class110.field1509 = class242.field3390;
            class263.field3827 = class420.field6256;
            class392.field5883 = 0;
            class232.field3279.method756(0, 45);
            class232.field3279.method1693(var2 + class184.field2482, (byte) 27);
            class232.field3279.method1696(true, class1.field5[82] ? 1 : 0);
            class232.field3279.method1670(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) -115);
            class232.field3279.method1670(class38.field620 + var3, (byte) -115);
            class18.method128(var2, var3, 25242, var6);
        }
        if (var4 == 31) {
            class259.field3770++;
            class232.field3279.method756(0, 29);
            class232.field3279.method1704(var3, (byte) 125);
            class232.field3279.method1693(var5, (byte) 45);
            class232.field3279.method1670(var2, (byte) -115);
            class122.field1631 = 0;
            class416.field6207 = class107.method746(var3, -94);
            class367.field5461 = var2;
        }
        if (var4 == 19) {
            class184.field2481++;
            class232.field3279.method756(0, 53);
            class232.field3279.method1704(var3, (byte) 126);
            class232.field3279.method1718(var5, (byte) -127);
            class232.field3279.method1718(var2, (byte) -122);
            class122.field1631 = 0;
            class416.field6207 = class107.method746(var3, -30);
            class367.field5461 = var2;
        }
        if (var4 == 6) {
            class232.field3279.method756(0, 234);
            class325.field4674++;
            class232.field3279.method1704(var3, (byte) 126);
            class232.field3279.method1718(var5, (byte) -125);
            class232.field3279.method1670(var2, (byte) -115);
            class122.field1631 = 0;
            class416.field6207 = class107.method746(var3, -108);
            class367.field5461 = var2;
        }
        if (var4 == 35) {
            class213.field3013++;
            class232.field3279.method756(0, 117);
            class232.field3279.method1704(var3, (byte) 125);
            class232.field3279.method1693(class91.field1248, (byte) 60);
            class232.field3279.method1693(var2, (byte) 118);
            class232.field3279.method1706(-12614, class327.field4696);
            class232.field3279.method1711(class73.field990, -2062);
            class232.field3279.method1670(var5, (byte) -115);
            class122.field1631 = 0;
            class416.field6207 = class107.method746(var3, -64);
            class367.field5461 = var2;
        }
        if (var4 == 3) {
            class232.field3279.method756(0, 189);
            class88.field1234++;
            class232.field3279.method1704(var3, (byte) 125);
            class232.field3279.method1693(var2, (byte) 42);
            class232.field3279.method1706(-12614, var5);
            class122.field1631 = 0;
            class416.field6207 = class107.method746(var3, -41);
            class367.field5461 = var2;
        }
        if (var4 == 1012) {
            class249 var34 = class107.method746(var3, -15);
            if (var34 == null || var34.field3585[var2] < 100000) {
                class232.field3279.method756(0, 124);
                class442.field6462++;
                class232.field3279.method1706(-12614, var5);
            } else {
                class135.method908(var34.field3585[var2] + " x " + class166.method1031(var5, false).field2729, (byte) 53);
            }
            class122.field1631 = 0;
            class416.field6207 = class107.method746(var3, -113);
            class367.field5461 = var2;
        }
        if (var4 == 9) {
            class194 var35 = class125.field1664[var5];
            if (var35 != null) {
                class392.field5883 = 0;
                class110.field1509 = class242.field3390;
                class161.field2104 = 2;
                class93.field1273++;
                class263.field3827 = class420.field6256;
                class232.field3279.method756(0, 138);
                class232.field3279.method1670(var5, (byte) -115);
                class232.field3279.method1707(-108, class1.field5[82] ? 1 : 0);
                class232.field3279.method1670(class91.field1248, (byte) -115);
                class232.field3279.method1706(-12614, class327.field4696);
                class232.field3279.method1704(class73.field990, (byte) 125);
                class308.method1928(-2, var35.field303[0], 0, 99, var35.field306[0], var35.method130((byte) -45), class100.field1350.field303[0], class100.field1350.field306[0], 0, var35.method130((byte) -30), true);
            }
        }
        if (var4 == 30) {
            class232.field3279.method756(0, 66);
            class174.field2271++;
            class232.field3279.method1704(var3, (byte) 125);
            class232.field3279.method1693(var5, (byte) 52);
            class232.field3279.method1718(var2, (byte) -121);
            class122.field1631 = 0;
            class416.field6207 = class107.method746(var3, -5);
            class367.field5461 = var2;
        }
        if (var4 == 43) {
            class129 var36 = class23.field408[var5];
            if (var36 != null) {
                class392.field5883 = 0;
                class110.field1509 = class242.field3390;
                class161.field2104 = 2;
                class263.field3827 = class420.field6256;
                class288.field4182++;
                class232.field3279.method756(0, 217);
                class232.field3279.method1719(class1.field5[82] ? 1 : 0, 1549190008);
                class232.field3279.method1718(var5, (byte) -117);
                class308.method1928(-2, var36.field303[0], 0, -99, var36.field306[0], var36.method130((byte) -99), class100.field1350.field303[0], class100.field1350.field306[0], 0, var36.method130((byte) -76), true);
            }
        }
        if (class394.field5921 != 0) {
            class394.field5921 = 0;
            class392.method2564(-88, class107.method746(class73.field990, -106));
        }
        if (class95.field1307) {
            class312.method1951(2878);
        }
        if (class416.field6207 != null && class122.field1631 == 0) {
            class392.method2564(-109, class416.field6207);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 1124)
    public static void method1450(int arg0) {
        if (arg0 != 42) {
            field3328 = null;
        }
        field3328 = null;
        field3325 = null;
    }
}
