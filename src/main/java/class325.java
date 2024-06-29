import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class325 extends class257 {

    @OriginalMember(owner = "client!al", name = "y", descriptor = "Ljf;")
    public static class229 field5480 = class212.method1457((byte) 100, "<img=0>");

    @OriginalMember(owner = "client!al", name = "A", descriptor = "I")
    public static int field5482 = 0;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(I)V", line = 9)
    public static void method2187(int arg0) {
        if (arg0 <= 39) {
            method2188(true, -87);
        }
        field5480 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZI)V", line = 24)
    public static final void method2188(boolean arg0, int arg1) {
        field5478++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class229.field3952[arg1];
        int var3 = class18.field282[arg1];
        int var4 = (int) class267.field4579[arg1];
        int var5 = class115.field2063[arg1];
        if (var5 >= 2000) {
            var5 -= 2000;
        }
        long var6 = class267.field4579[arg1];
        if (var5 == 23) {
            class331 var8 = class331.field5637[var4];
            if (var8 != null) {
                class35.field661++;
                class329.method2247(2, false, 1, var8.field2018[0], 0, (byte) -96, 0, class301.field5124.field2018[0], 0, 1, var8.field2017[0], class301.field5124.field2017[0]);
                client.field4465 = 2;
                class141.field2445 = class222.field3791;
                class215.field3697 = 0;
                class52.field904 = class60.field1033;
                class84.field1608.method1397(86, 0);
                class84.field1608.method125(-25369, var4);
            }
        }
        if (var5 == 57) {
            class112.field2024++;
            class311.method2109(var6, var2, 0, var3);
            class84.field1608.method1397(151, 0);
            class84.field1608.method133((byte) 113, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class84.field1608.method106(class213.field3649 + var3, (byte) 35);
            class84.field1608.method106(class258.field4503 + var2, (byte) 106);
        }
        if (var5 == 13) {
            class194.field3361++;
            class84.field1608.method1397(232, 0);
            class84.field1608.method133((byte) -110, var4);
            class84.field1608.method106(var2, (byte) 14);
            class84.field1608.method87(-1649217712, var3);
            class168.field2885 = 0;
            class3.field19 = class96.method662(var3, true);
            class183.field3168 = var2;
        }
        if (var5 == 38) {
            class63.field1078++;
            class84.field1608.method1397(243, 0);
            class84.field1608.method100(var3, 65280);
            class67 var9 = class96.method662(var3, true);
            if (var9.field1206 != null && var9.field1206[0][0] == 5) {
                int var10 = var9.field1206[0][1];
                class286.field4908[var10] = 1 - class286.field4908[var10];
                class329.method2241((byte) -36, var10);
            }
        }
        if (var5 == 15) {
            class84.field1608.method1397(5, 0);
            class84.field1608.method100(var3, 65280);
            class281.field4804++;
            class84.field1608.method144(var4, 0);
            class84.field1608.method144(var2, 0);
            class168.field2885 = 0;
            class3.field19 = class96.method662(var3, true);
            class183.field3168 = var2;
        }
        if (var5 == 14) {
            class71.method523(-34);
            class67 var11 = class96.method662(var3, true);
            class23.field415 = 1;
            class245.field4360 = var4;
            class156.field2669 = var3;
            class110.field1934 = var2;
            class194.method1328((byte) -103, var11);
            class26.field472 = class142.method989(new class229[] { class110.field1944, class113.method799(var4, (byte) 50).field5281, class180.field3119 }, -33);
            if (class26.field472 == null) {
                class26.field472 = class258.field4490;
            }
            return;
        }
        if (var5 == 37) {
            class297.field5076++;
            if (class98.field1739 == 1) {
                class329.method2247(2, false, 1, var2, 0, (byte) -94, 0, class301.field5124.field2018[0], 0, 1, var3, class301.field5124.field2017[0]);
            } else {
                boolean var12 = class329.method2247(2, false, 0, var2, 0, (byte) -37, 0, class301.field5124.field2018[0], 0, 0, var3, class301.field5124.field2017[0]);
                if (!var12) {
                    class329.method2247(2, false, 1, var2, 0, (byte) 88, 0, class301.field5124.field2018[0], 0, 1, var3, class301.field5124.field2017[0]);
                }
            }
            class52.field904 = class60.field1033;
            class215.field3697 = 0;
            class141.field2445 = class222.field3791;
            client.field4465 = 2;
            class84.field1608.method1397(75, 0);
            class84.field1608.method125(-25369, var4);
            class84.field1608.method144(class213.field3649 + var3, 0);
            class84.field1608.method133((byte) 95, class258.field4503 + var2);
        }
        if (var5 == 24) {
            class311.method2109(var6, var2, 0, var3);
            class249.field4381++;
            class84.field1608.method1397(148, 0);
            class84.field1608.method106(var3 + class213.field3649, (byte) 109);
            class84.field1608.method144(class258.field4503 + var2, 0);
            class84.field1608.method125(-25369, Integer.MAX_VALUE & (int) (var6 >>> 32));
        }
        if (var5 == 39) {
            class331 var14 = class331.field5637[var4];
            if (var14 != null) {
                class64.field1097++;
                class329.method2247(2, false, 1, var14.field2018[0], 0, (byte) 112, 0, class301.field5124.field2018[0], 0, 1, var14.field2017[0], class301.field5124.field2017[0]);
                class141.field2445 = class222.field3791;
                class52.field904 = class60.field1033;
                class215.field3697 = 0;
                client.field4465 = 2;
                class84.field1608.method1397(112, 0);
                class84.field1608.method106(var4, (byte) -95);
            }
        }
        if (var5 == 2) {
            class228.field3920++;
            class84.field1608.method1397(102, 0);
            class84.field1608.method109(class156.field2669, -10765);
            class84.field1608.method144(class245.field4360, 0);
            class84.field1608.method133((byte) 119, var2);
            class84.field1608.method106(var4, (byte) 79);
            class84.field1608.method100(var3, 65280);
            class84.field1608.method144(class110.field1934, 0);
            class168.field2885 = 0;
            class3.field19 = class96.method662(var3, true);
            class183.field3168 = var2;
        }
        if (!arg0) {
            return;
        }
        if (var5 == 1) {
            class84.field1608.method1397(123, 0);
            class327.field5495++;
            class84.field1608.method133((byte) 112, var4);
            class84.field1608.method109(var3, -10765);
            class84.field1608.method133((byte) -69, var2);
            class168.field2885 = 0;
            class3.field19 = class96.method662(var3, true);
            class183.field3168 = var2;
        }
        if (var5 == 32) {
            class67 var15 = class96.method662(var3, true);
            boolean var16 = true;
            if (var15.field1296 > 0) {
                var16 = class323.method2178(var15, true);
            }
            if (var16) {
                class63.field1078++;
                class84.field1608.method1397(243, 0);
                class84.field1608.method100(var3, 65280);
            }
        }
        if (var5 == 40) {
            class33 var17 = class192.field3334[var4];
            if (var17 != null) {
                class329.method2247(2, false, 1, var17.field2018[0], 0, (byte) -120, 0, class301.field5124.field2018[0], 0, 1, var17.field2017[0], class301.field5124.field2017[0]);
                class52.field904 = class60.field1033;
                class141.field2445 = class222.field3791;
                client.field4465 = 2;
                class215.field3697 = 0;
                class261.field4538++;
                class84.field1608.method1397(46, 0);
                class84.field1608.method125(-25369, var4);
            }
        }
        if (var5 == 3) {
            class132.field2326++;
            class84.field1608.method1397(149, 0);
            class84.field1608.method87(-1649217712, var3);
            class84.field1608.method125(-25369, var4);
            class84.field1608.method133((byte) -75, var2);
            class168.field2885 = 0;
            class3.field19 = class96.method662(var3, true);
            class183.field3168 = var2;
        }
        if (var5 == 58) {
            class309.field5213++;
            class84.field1608.method1397(119, 0);
            class84.field1608.method87(-1649217712, var3);
            class84.field1608.method144(var2, 0);
            class84.field1608.method144(var4, 0);
            class168.field2885 = 0;
            class3.field19 = class96.method662(var3, true);
            class183.field3168 = var2;
        }
        if (var5 == 34) {
            if (class98.field1739 == 1) {
                class329.method2247(2, false, 1, var2, 0, (byte) 104, 0, class301.field5124.field2018[0], 0, 1, var3, class301.field5124.field2017[0]);
            } else {
                boolean var18 = class329.method2247(2, false, 0, var2, 0, (byte) -73, 0, class301.field5124.field2018[0], 0, 0, var3, class301.field5124.field2017[0]);
                if (!var18) {
                    class329.method2247(2, false, 1, var2, 0, (byte) 89, 0, class301.field5124.field2018[0], 0, 1, var3, class301.field5124.field2017[0]);
                }
            }
            class331.field5635++;
            class141.field2445 = class222.field3791;
            class215.field3697 = 0;
            class52.field904 = class60.field1033;
            client.field4465 = 2;
            class84.field1608.method1397(236, 0);
            class84.field1608.method144(class258.field4503 + var2, 0);
            class84.field1608.method133((byte) -54, var4);
            class84.field1608.method144(var3 + class213.field3649, 0);
        }
        if (var5 == 59) {
            class331 var20 = class331.field5637[var4];
            if (var20 != null) {
                class74.field1406++;
                class329.method2247(2, false, 1, var20.field2018[0], 0, (byte) 82, 0, class301.field5124.field2018[0], 0, 1, var20.field2017[0], class301.field5124.field2017[0]);
                class141.field2445 = class222.field3791;
                class52.field904 = class60.field1033;
                class215.field3697 = 0;
                client.field4465 = 2;
                class84.field1608.method1397(164, 0);
                class84.field1608.method125(-25369, var4);
            }
        }
        if (var5 == 50) {
            class126.field2224++;
            boolean var21 = class329.method2247(2, false, 0, var2, 0, (byte) 85, 0, class301.field5124.field2018[0], 0, 0, var3, class301.field5124.field2017[0]);
            if (!var21) {
                class329.method2247(2, false, 1, var2, 0, (byte) 102, 0, class301.field5124.field2018[0], 0, 1, var3, class301.field5124.field2017[0]);
            }
            class52.field904 = class60.field1033;
            class215.field3697 = 0;
            class141.field2445 = class222.field3791;
            client.field4465 = 2;
            class84.field1608.method1397(90, 0);
            class84.field1608.method133((byte) -111, class258.field4503 + var2);
            class84.field1608.method125(-25369, class157.field2693);
            class84.field1608.method133((byte) -80, class213.field3649 + var3);
            class84.field1608.method87(-1649217712, class232.field4035);
            class84.field1608.method125(-25369, var4);
        }
        if (var5 == 35) {
            class311.method2109(var6, var2, 0, var3);
            class15.field238++;
            class84.field1608.method1397(127, 0);
            class84.field1608.method106(class213.field3649 + var3, (byte) 102);
            class84.field1608.method144(class258.field4503 + var2, 0);
            class84.field1608.method125(-25369, Integer.MAX_VALUE & (int) (var6 >>> 32));
        }
        if (var5 == 45) {
            class60.field1035++;
            class84.field1608.method1397(244, 0);
            class84.field1608.method133((byte) -66, class157.field2693);
            class84.field1608.method109(var3, -10765);
            class84.field1608.method125(-25369, var2);
            class84.field1608.method119((byte) -124, class232.field4035);
        }
        if (var5 == 12) {
            class84.field1608.method1397(117, 0);
            class84.field1608.method125(-25369, var4);
            class144.field2512++;
            class84.field1608.method144(var2, 0);
            class84.field1608.method119((byte) -124, var3);
            class168.field2885 = 0;
            class3.field19 = class96.method662(var3, true);
            class183.field3168 = var2;
        }
        if (var5 == 60) {
            if (class98.field1739 == 1) {
                class329.method2247(2, false, 1, var2, 0, (byte) 114, 0, class301.field5124.field2018[0], 0, 1, var3, class301.field5124.field2017[0]);
            } else {
                boolean var23 = class329.method2247(2, false, 0, var2, 0, (byte) 85, 0, class301.field5124.field2018[0], 0, 0, var3, class301.field5124.field2017[0]);
                if (!var23) {
                    class329.method2247(2, false, 1, var2, 0, (byte) 91, 0, class301.field5124.field2018[0], 0, 1, var3, class301.field5124.field2017[0]);
                }
            }
            class215.field3697 = 0;
            client.field4465 = 2;
            class141.field2445 = class222.field3791;
            class52.field904 = class60.field1033;
            class118.field2106++;
            class84.field1608.method1397(69, 0);
            class84.field1608.method106(var2 + class258.field4503, (byte) -111);
            class84.field1608.method144(var4, 0);
            class84.field1608.method133((byte) 121, class213.field3649 + var3);
        }
        if (var5 == 22) {
            class33 var25 = class192.field3334[var4];
            if (var25 != null) {
                class22.field372++;
                class329.method2247(2, false, 1, var25.field2018[0], 0, (byte) 117, 0, class301.field5124.field2018[0], 0, 1, var25.field2017[0], class301.field5124.field2017[0]);
                class52.field904 = class60.field1033;
                class215.field3697 = 0;
                client.field4465 = 2;
                class141.field2445 = class222.field3791;
                class84.field1608.method1397(216, 0);
                class84.field1608.method144(var4, 0);
            }
        }
        if (var5 == 1007) {
            class67 var26 = class96.method662(var3, true);
            if (var26 == null || var26.field1153[var2] < 100000) {
                class118.field2103++;
                class84.field1608.method1397(77, 0);
                class84.field1608.method106(var4, (byte) 52);
            } else {
                class28.method245((byte) -75, 0, class331.field5638, class142.method989(new class229[] { class84.method607(-61, var26.field1153[var2]), class279.field4787, class113.method799(var4, (byte) 50).field5281 }, -62));
            }
            class168.field2885 = 0;
            class3.field19 = class96.method662(var3, arg0);
            class183.field3168 = var2;
        }
        if (var5 == 28) {
            if (var4 == 0) {
                class93.method649(class16.field254, var2, var3);
            } else if (var4 == 1) {
                if (class200.field3500 > 0 && class84.field1613[82] && class84.field1613[81]) {
                    class93.method648(class16.field254, class213.field3649 + var3, class258.field4503 + var2, false);
                } else if (class329.method2247(1, true, 0, var2, 0, (byte) -109, 0, class301.field5124.field2018[0], 0, 0, var3, class301.field5124.field2017[0])) {
                    class84.field1608.method140(class72.field1381, (byte) 75);
                    class84.field1608.method140(class268.field4602, (byte) 75);
                    class84.field1608.method125(-25369, class229.field3939);
                    class84.field1608.method140(57, (byte) 75);
                    class84.field1608.method140(class213.field3653, (byte) 75);
                    class84.field1608.method140(class102.field1778, (byte) 75);
                    class84.field1608.method140(89, (byte) 75);
                    class84.field1608.method125(-25369, class301.field5124.field1983);
                    class84.field1608.method125(-25369, class301.field5124.field2028);
                    class84.field1608.method140(class194.field3365, (byte) 75);
                    class84.field1608.method140(63, (byte) 75);
                }
            }
        }
        if (var5 == 1001) {
            class215.field3697 = 0;
            class118.field2103++;
            class141.field2445 = class222.field3791;
            class52.field904 = class60.field1033;
            client.field4465 = 2;
            class84.field1608.method1397(77, 0);
            class84.field1608.method106(var4, (byte) 20);
        }
        if (var5 == 1006) {
            class52.field904 = class60.field1033;
            client.field4465 = 2;
            class141.field2445 = class222.field3791;
            class215.field3697 = 0;
            class182.field3142++;
            class84.field1608.method1397(183, 0);
            class84.field1608.method106(var4, (byte) 84);
        }
        if (var5 == 6) {
            class90.field1653++;
            boolean var27 = class329.method2247(2, false, 0, var2, 0, (byte) -118, 0, class301.field5124.field2018[0], 0, 0, var3, class301.field5124.field2017[0]);
            if (!var27) {
                class329.method2247(2, false, 1, var2, 0, (byte) 103, 0, class301.field5124.field2018[0], 0, 1, var3, class301.field5124.field2017[0]);
            }
            class52.field904 = class60.field1033;
            class215.field3697 = 0;
            client.field4465 = 2;
            class141.field2445 = class222.field3791;
            class84.field1608.method1397(50, 0);
            class84.field1608.method133((byte) 116, class110.field1934);
            class84.field1608.method144(class258.field4503 + var2, 0);
            class84.field1608.method100(class156.field2669, 65280);
            class84.field1608.method144(class213.field3649 + var3, 0);
            class84.field1608.method133((byte) -123, var4);
            class84.field1608.method106(class245.field4360, (byte) -94);
        }
        if (var5 == 19 || var5 == 1005) {
            class309.method2101(var2, class143.field2498[arg1], (byte) 28, var4, var3);
        }
        if (var5 == 1004) {
            class52.field904 = class60.field1033;
            class215.field3697 = 0;
            client.field4465 = 2;
            class141.field2445 = class222.field3791;
            class331 var29 = class331.field5637[var4];
            if (var29 != null) {
                class169 var30 = var29.field5631;
                if (var30.field2950 != null) {
                    var30 = var30.method1154((byte) -127);
                }
                if (var30 != null) {
                    class84.field1608.method1397(21, 0);
                    class84.field1608.method106(var30.field2890, (byte) -86);
                    class327.field5498++;
                }
            }
        }
        if (var5 == 44) {
            class67 var31 = class189.method1305(var2, 2048, var3);
            if (var31 != null) {
                class71.method523(-69);
                class292.method2031(var3, (byte) -96, var2, class93.method651((byte) 108, client.method1820(var31)));
                class23.field415 = 0;
                class228.field3916 = class208.method1441((byte) -78, var31);
                if (class228.field3916 == null) {
                    class228.field3916 = class95.field1690;
                }
                if (var31.field1249) {
                    class147.field2550 = class142.method989(new class229[] { var31.field1219, class180.field3119 }, -79);
                } else {
                    class147.field2550 = class142.method989(new class229[] { class126.field2250, var31.field1277, class180.field3119 }, -92);
                }
            }
            return;
        }
        if (var5 == 7 && class311.method2109(var6, var2, 0, var3)) {
            class84.field1608.method1397(217, 0);
            class84.field1608.method106(class213.field3649 + var3, (byte) 19);
            class84.field1608.method144(class258.field4503 + var2, 0);
            class84.field1608.method87(-1649217712, class232.field4035);
            class84.field1608.method133((byte) -52, class157.field2693);
            class122.field2160++;
            class84.field1608.method144((int) (var6 >>> 32) & Integer.MAX_VALUE, 0);
        }
        if (var5 == 20) {
            class33 var32 = class192.field3334[var4];
            if (var32 != null) {
                class329.method2247(2, false, 1, var32.field2018[0], 0, (byte) -96, 0, class301.field5124.field2018[0], 0, 1, var32.field2017[0], class301.field5124.field2017[0]);
                class141.field2445 = class222.field3791;
                class96.field1699++;
                class215.field3697 = 0;
                client.field4465 = 2;
                class52.field904 = class60.field1033;
                class84.field1608.method1397(166, 0);
                class84.field1608.method106(var4, (byte) -104);
            }
        }
        if (var5 == 46) {
            if (var4 == 0) {
                class320.field5424 = true;
                class93.method649(class16.field254, var2, var3);
            } else if (class200.field3500 > 0 && class84.field1613[82] && class84.field1613[81]) {
                class93.method648(class16.field254, class213.field3649 + var3, class258.field4503 + var2, false);
            } else {
                class84.field1608.method1397(186, 0);
                class84.field1608.method144(class213.field3649 + var3, 0);
                class84.field1608.method144(class258.field4503 + var2, 0);
                class273.field4672++;
            }
        }
        if (var5 == 21) {
            class33 var33 = class192.field3334[var4];
            if (var33 != null) {
                class308.field5204++;
                class329.method2247(2, false, 1, var33.field2018[0], 0, (byte) -68, 0, class301.field5124.field2018[0], 0, 1, var33.field2017[0], class301.field5124.field2017[0]);
                class215.field3697 = 0;
                class141.field2445 = class222.field3791;
                class52.field904 = class60.field1033;
                client.field4465 = 2;
                class84.field1608.method1397(13, 0);
                class84.field1608.method125(-25369, var4);
            }
        }
        if (var5 == 51) {
            class331 var34 = class331.field5637[var4];
            if (var34 != null) {
                class329.method2247(2, false, 1, var34.field2018[0], 0, (byte) -97, 0, class301.field5124.field2018[0], 0, 1, var34.field2017[0], class301.field5124.field2017[0]);
                class52.field904 = class60.field1033;
                client.field4452++;
                class141.field2445 = class222.field3791;
                client.field4465 = 2;
                class215.field3697 = 0;
                class84.field1608.method1397(212, 0);
                class84.field1608.method125(-25369, var4);
            }
        }
        if (var5 == 43) {
            class26.field471++;
            class84.field1608.method1397(53, 0);
            class84.field1608.method144(var2, 0);
            class84.field1608.method133((byte) 94, var4);
            class84.field1608.method133((byte) 101, class157.field2693);
            class84.field1608.method109(class232.field4035, -10765);
            class84.field1608.method100(var3, 65280);
            class168.field2885 = 0;
            class3.field19 = class96.method662(var3, true);
            class183.field3168 = var2;
        }
        if (var5 == 9) {
            if (class98.field1739 == 1) {
                class329.method2247(2, false, 1, var2, 0, (byte) 97, 0, class301.field5124.field2018[0], 0, 1, var3, class301.field5124.field2017[0]);
            } else {
                boolean var35 = class329.method2247(2, false, 0, var2, 0, (byte) -89, 0, class301.field5124.field2018[0], 0, 0, var3, class301.field5124.field2017[0]);
                if (!var35) {
                    class329.method2247(2, false, 1, var2, 0, (byte) 83, 0, class301.field5124.field2018[0], 0, 1, var3, class301.field5124.field2017[0]);
                }
            }
            client.field4465 = 2;
            class141.field2445 = class222.field3791;
            class319.field5383++;
            class52.field904 = class60.field1033;
            class215.field3697 = 0;
            class84.field1608.method1397(24, 0);
            class84.field1608.method125(-25369, var2 + class258.field4503);
            class84.field1608.method144(var4, 0);
            class84.field1608.method133((byte) 99, class213.field3649 + var3);
        }
        if (var5 == 36) {
            class33 var37 = class192.field3334[var4];
            if (var37 != null) {
                class329.method2247(2, false, 1, var37.field2018[0], 0, (byte) 122, 0, class301.field5124.field2018[0], 0, 1, var37.field2017[0], class301.field5124.field2017[0]);
                class141.field2445 = class222.field3791;
                class52.field904 = class60.field1033;
                class193.field3343++;
                class215.field3697 = 0;
                client.field4465 = 2;
                class84.field1608.method1397(19, 0);
                class84.field1608.method106(var4, (byte) 85);
            }
        }
        if (var5 == 47 && class208.field3613 == null) {
            class161.method1083(var2, var3, (byte) -85);
            class208.field3613 = class189.method1305(var2, 2048, var3);
            class194.method1328((byte) -77, class208.field3613);
        }
        if (var5 == 26) {
            class33 var38 = class192.field3334[var4];
            if (var38 != null) {
                class42.field745++;
                class329.method2247(2, false, 1, var38.field2018[0], 0, (byte) 118, 0, class301.field5124.field2018[0], 0, 1, var38.field2017[0], class301.field5124.field2017[0]);
                client.field4465 = 2;
                class215.field3697 = 0;
                class141.field2445 = class222.field3791;
                class52.field904 = class60.field1033;
                class84.field1608.method1397(76, 0);
                class84.field1608.method144(var4, 0);
            }
        }
        if (var5 == 42) {
            class331 var39 = class331.field5637[var4];
            if (var39 != null) {
                class194.field3371++;
                class329.method2247(2, false, 1, var39.field2018[0], 0, (byte) -41, 0, class301.field5124.field2018[0], 0, 1, var39.field2017[0], class301.field5124.field2017[0]);
                client.field4465 = 2;
                class141.field2445 = class222.field3791;
                class215.field3697 = 0;
                class52.field904 = class60.field1033;
                class84.field1608.method1397(238, 0);
                class84.field1608.method133((byte) -79, class110.field1934);
                class84.field1608.method133((byte) 118, var4);
                class84.field1608.method106(class245.field4360, (byte) 125);
                class84.field1608.method100(class156.field2669, 65280);
            }
        }
        if (var5 == 29) {
            if (class98.field1739 == 1) {
                class329.method2247(2, false, 1, var2, 0, (byte) -91, 0, class301.field5124.field2018[0], 0, 1, var3, class301.field5124.field2017[0]);
            } else {
                boolean var40 = class329.method2247(2, false, 0, var2, 0, (byte) 95, 0, class301.field5124.field2018[0], 0, 0, var3, class301.field5124.field2017[0]);
                if (!var40) {
                    class329.method2247(2, false, 1, var2, 0, (byte) -67, 0, class301.field5124.field2018[0], 0, 1, var3, class301.field5124.field2017[0]);
                }
            }
            class141.field2445 = class222.field3791;
            client.field4465 = 2;
            class158.field2699++;
            class52.field904 = class60.field1033;
            class215.field3697 = 0;
            class84.field1608.method1397(131, 0);
            class84.field1608.method144(class213.field3649 + var3, 0);
            class84.field1608.method144(var4, 0);
            class84.field1608.method133((byte) -69, class258.field4503 + var2);
        }
        if (var5 == 30) {
            class311.method2109(var6, var2, 0, var3);
            class84.field1608.method1397(22, 0);
            class84.field1608.method144(var2 + class258.field4503, 0);
            class20.field338++;
            class84.field1608.method106(class213.field3649 + var3, (byte) -112);
            class84.field1608.method144((int) (var6 >>> 32) & Integer.MAX_VALUE, 0);
        }
        if (var5 == 10) {
            class97.field1734++;
            class84.field1608.method1397(176, 0);
            class84.field1608.method125(-25369, var4);
            class84.field1608.method100(var3, 65280);
            class84.field1608.method144(var2, 0);
            class168.field2885 = 0;
            class3.field19 = class96.method662(var3, arg0);
            class183.field3168 = var2;
        }
        if (var5 == 5) {
            class84.field1608.method1397(34, 0);
            class140.field2442++;
            class84.field1608.method133((byte) 113, var4);
            class84.field1608.method119((byte) -124, var3);
            class84.field1608.method125(-25369, var2);
            class168.field2885 = 0;
            class3.field19 = class96.method662(var3, true);
            class183.field3168 = var2;
        }
        if (var5 == 1002) {
            class311.method2109(var6, var2, 0, var3);
            class155.field2647++;
            class84.field1608.method1397(161, 0);
            class84.field1608.method144((int) (var6 >>> 32) & Integer.MAX_VALUE, 0);
            class84.field1608.method144(class258.field4503 + var2, 0);
            class84.field1608.method106(class213.field3649 + var3, (byte) -92);
        }
        if (var5 == 16) {
            class33 var42 = class192.field3334[var4];
            if (var42 != null) {
                class275.field4711++;
                class329.method2247(2, false, 1, var42.field2018[0], 0, (byte) -96, 0, class301.field5124.field2018[0], 0, 1, var42.field2017[0], class301.field5124.field2017[0]);
                class141.field2445 = class222.field3791;
                client.field4465 = 2;
                class52.field904 = class60.field1033;
                class215.field3697 = 0;
                class84.field1608.method1397(137, 0);
                class84.field1608.method144(var4, 0);
            }
        }
        if (var5 == 11) {
            class331 var43 = class331.field5637[var4];
            if (var43 != null) {
                class315.field5346++;
                class329.method2247(2, false, 1, var43.field2018[0], 0, (byte) -128, 0, class301.field5124.field2018[0], 0, 1, var43.field2017[0], class301.field5124.field2017[0]);
                class215.field3697 = 0;
                class141.field2445 = class222.field3791;
                class52.field904 = class60.field1033;
                client.field4465 = 2;
                class84.field1608.method1397(38, 0);
                class84.field1608.method125(-25369, var4);
            }
        }
        if (var5 == 18) {
            class331 var44 = class331.field5637[var4];
            if (var44 != null) {
                class22.field374++;
                class329.method2247(2, false, 1, var44.field2018[0], 0, (byte) -104, 0, class301.field5124.field2018[0], 0, 1, var44.field2017[0], class301.field5124.field2017[0]);
                client.field4465 = 2;
                class215.field3697 = 0;
                class141.field2445 = class222.field3791;
                class52.field904 = class60.field1033;
                class84.field1608.method1397(100, 0);
                class84.field1608.method144(class157.field2693, 0);
                class84.field1608.method125(-25369, var4);
                class84.field1608.method119((byte) -123, class232.field4035);
            }
        }
        if (var5 == 31) {
            class33 var45 = class192.field3334[var4];
            if (var45 != null) {
                class329.method2247(2, false, 1, var45.field2018[0], 0, (byte) -37, 0, class301.field5124.field2018[0], 0, 1, var45.field2017[0], class301.field5124.field2017[0]);
                class52.field904 = class60.field1033;
                client.field4465 = 2;
                class215.field3697 = 0;
                class277.field4767++;
                class141.field2445 = class222.field3791;
                class84.field1608.method1397(78, 0);
                class84.field1608.method87(-1649217712, class232.field4035);
                class84.field1608.method125(-25369, var4);
                class84.field1608.method133((byte) -25, class157.field2693);
            }
        }
        if (var5 == 17) {
            class84.field1608.method1397(178, 0);
            class84.field1608.method125(-25369, var4);
            class84.field1608.method144(var2, 0);
            class84.field1608.method109(var3, -10765);
            class134.field2347++;
            class168.field2885 = 0;
            class3.field19 = class96.method662(var3, true);
            class183.field3168 = var2;
        }
        if (var5 == 8) {
            if (var4 == 0) {
                class156.field2666 = true;
                class93.method649(class16.field254, var2, var3);
            } else if (var4 == 1) {
                class84.field1608.method1397(240, 0);
                class84.field1608.method125(-25369, class157.field2693);
                class84.field1608.method125(-25369, class213.field3649 + var3);
                class84.field1608.method144(class258.field4503 + var2, 0);
                class84.field1608.method87(-1649217712, class232.field4035);
                class173.field3014++;
            }
        }
        if (var5 == 25) {
            class33 var46 = class192.field3334[var4];
            if (var46 != null) {
                class329.method2247(2, false, 1, var46.field2018[0], 0, (byte) 106, 0, class301.field5124.field2018[0], 0, 1, var46.field2017[0], class301.field5124.field2017[0]);
                class155.field2640++;
                client.field4465 = 2;
                class141.field2445 = class222.field3791;
                class52.field904 = class60.field1033;
                class215.field3697 = 0;
                class84.field1608.method1397(133, 0);
                class84.field1608.method100(class156.field2669, 65280);
                class84.field1608.method106(class245.field4360, (byte) -111);
                class84.field1608.method133((byte) 100, var4);
                class84.field1608.method125(-25369, class110.field1934);
            }
        }
        if (var5 == 33) {
            class84.field1608.method1397(49, 0);
            class51.field891++;
            class84.field1608.method125(-25369, var2);
            class84.field1608.method144(var4, 0);
            class84.field1608.method87(-1649217712, var3);
            class168.field2885 = 0;
            class3.field19 = class96.method662(var3, true);
            class183.field3168 = var2;
        }
        if (var5 == 4 && class311.method2109(var6, var2, 0, var3)) {
            class134.field2331++;
            class84.field1608.method1397(214, 0);
            class84.field1608.method125(-25369, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class84.field1608.method133((byte) -61, class110.field1934);
            class84.field1608.method133((byte) -22, class258.field4503 + var2);
            class84.field1608.method106(class213.field3649 + var3, (byte) 75);
            class84.field1608.method109(class156.field2669, -10765);
            class84.field1608.method133((byte) -114, class245.field4360);
        }
        if (var5 == 49) {
            class115.method829(-127);
        }
        if (var5 == 41) {
            class33 var47 = class192.field3334[var4];
            if (var47 != null) {
                class329.method2247(2, false, 1, var47.field2018[0], 0, (byte) -83, 0, class301.field5124.field2018[0], 0, 1, var47.field2017[0], class301.field5124.field2017[0]);
                class215.field3697 = 0;
                client.field4465 = 2;
                class141.field2445 = class222.field3791;
                class52.field904 = class60.field1033;
                class52.field917++;
                class84.field1608.method1397(169, 0);
                class84.field1608.method125(-25369, var4);
            }
        }
        if (var5 == 48) {
            class84.field1608.method1397(243, 0);
            class63.field1078++;
            class84.field1608.method100(var3, 65280);
            class67 var48 = class96.method662(var3, true);
            if (var48.field1206 != null && var48.field1206[0][0] == 5) {
                int var49 = var48.field1206[0][1];
                if (class286.field4908[var49] != var48.field1187[0]) {
                    class286.field4908[var49] = var48.field1187[0];
                    class329.method2241((byte) -97, var49);
                }
            }
        }
        if (class23.field415 != 0) {
            class23.field415 = 0;
            class194.method1328((byte) -77, class96.method662(class156.field2669, true));
        }
        if (class273.field4677) {
            class71.method523(-92);
        }
        if (class3.field19 != null && class168.field2885 == 0) {
            class194.method1328((byte) -85, class3.field19);
        }
    }
}
