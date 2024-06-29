import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class92 {

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1447 = "flash1:";

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "[I")
    public static int[] field1443 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Lul;")
    public static class51 field1445 = new class51(64);

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    private int field1444;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public int field1450;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public int field1453;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Lcg;")
    public static class49 field1446;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBZIIIZ)V", line = 11)
    public static final void method797(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1454++;
        if (arg6) {
            class43.method373();
        }
        if (class120.field2076 != null && (arg0 != 3 || class310.field4913 != arg4 || class318.field5056 != arg3)) {
            class58.method528(class85.field1369, 15270, class120.field2076);
            class120.field2076 = null;
        }
        if (arg0 == 3 && class120.field2076 == null) {
            class120.field2076 = class283.method1931(0, 0, class85.field1369, (byte) -50, arg4, arg3);
            if (class120.field2076 != null) {
                class318.field5056 = arg3;
                class310.field4913 = arg4;
                class88.method774(true, class85.field1369);
            }
        }
        if (arg0 == 3 && class120.field2076 == null) {
            method797(class69.field1133, (byte) -81, true, -1, -1, arg5, true);
        } else if (arg1 < -80) {
            Container var7;
            if (class120.field2076 != null) {
                var7 = class120.field2076;
            } else if (class271.field4321 == null) {
                var7 = class85.field1369.field910;
            } else {
                var7 = class271.field4321;
            }
            class56.field864 = var7.getSize().width;
            class213.field3589 = var7.getSize().height;
            if (class271.field4321 == var7) {
                Insets var8 = class271.field4321.getInsets();
                class213.field3589 -= var8.top + var8.bottom;
                class56.field864 -= var8.right + var8.left;
            }
            if (arg0 < 2) {
                class12.field146 = 0;
                class313.field4973 = 765;
                class101.field1628 = (class56.field864 - 765) / 2;
                class188.field3152 = 503;
            } else {
                class101.field1628 = 0;
                class188.field3152 = class213.field3589;
                class12.field146 = 0;
                class313.field4973 = class56.field864;
            }
            if (arg2) {
                class297.method2026(class42.field616, 1);
                class210.method1566(class42.field616, (byte) -121);
                if (class211.field3564 != null) {
                    class211.field3564.method855(class42.field616, (byte) -115);
                }
                class158.field2789.method268((byte) -79);
                class127.method1063(false, class42.field616);
                class331.method2292(class42.field616, true);
                if (class211.field3564 != null) {
                    class211.field3564.method859(class42.field616, (byte) 58);
                }
            } else {
                if (class43.field680) {
                    class43.method355(class313.field4973, class188.field3152);
                }
                class42.field616.setSize(class313.field4973, class188.field3152);
                if (class271.field4321 == var7) {
                    Insets var9 = class271.field4321.getInsets();
                    class42.field616.setLocation(class101.field1628 + var9.left, class12.field146 + var9.top);
                } else {
                    class42.field616.setLocation(class101.field1628, class12.field146);
                }
            }
            if (arg0 == 0 && arg5 > 0) {
                class43.method358(class42.field616);
            }
            if (arg6 && arg0 > 0) {
                class42.field616.setIgnoreRepaint(true);
                if (!class332.field5283) {
                    class213.method1581();
                    class256.field4119 = null;
                    class256.field4119 = class204.method1528(class313.field4973, (byte) 119, class188.field3152, class42.field616);
                    class47.method415();
                    if (class88.field1397 == 5) {
                        class27.method246(true, class177.field3014, -151);
                    } else {
                        class120.method1019(23516, class30.field437, false);
                    }
                    try {
                        Graphics var10 = class42.field616.getGraphics();
                        class256.field4119.method959(var10, 0, 0, (byte) 118);
                    } catch (Exception var14) {
                    }
                    class324.method2250(17);
                    if (arg5 == 0) {
                        class256.field4119 = class204.method1528(765, (byte) 124, 503, class42.field616);
                    } else {
                        class256.field4119 = null;
                    }
                    class45 var12 = class85.field1369.method531(class158.field2789.getClass(), -26655);
                    while (var12.field709 == 0) {
                        class142.method1149(100L, (byte) 126);
                    }
                    if (var12.field709 == 1) {
                        class332.field5283 = true;
                    }
                }
                if (class332.field5283) {
                    class43.method379(class42.field616, class30.field440 * 2);
                }
            }
            if (class43.field680 || arg0 <= 0) {
                if (arg0 > 0 && arg5 == 0) {
                    class316.field5001.setPriority(5);
                    class256.field4119 = null;
                    class103.method890();
                    ((class153) class62.field953).method1208(200, 255);
                    if (class64.field1001) {
                        class62.method573(0.7F);
                    }
                    if (client.field4377 == null) {
                        client.field4377 = new class36[13][13];
                    }
                    class245.method1710(4, 104, 104);
                    class14.method143(104, 104);
                    class50.method462(25600);
                } else if (arg0 == 0 && arg5 > 0) {
                    class316.field5001.setPriority(1);
                    class256.field4119 = class204.method1528(765, (byte) 91, 503, class42.field616);
                    class103.method889();
                    class65.method621();
                    ((class153) class62.field953).method1208(20, 255);
                    if (class64.field1001) {
                        if (class32.field462 == 1) {
                            class62.method573(0.9F);
                        }
                        if (class32.field462 == 2) {
                            class62.method573(0.8F);
                        }
                        if (class32.field462 == 3) {
                            class62.method573(0.7F);
                        }
                        if (class32.field462 == 4) {
                            class62.method573(0.6F);
                        }
                    }
                    class337.method2377();
                    class50.method462(25600);
                }
                class219.field3651 = !class56.method499(91);
                class65.method632(class313.field4973, class188.field3152);
                if (arg6) {
                    class50.method463(-12877);
                }
                if (arg0 >= 2) {
                    class39.field579 = true;
                } else {
                    class39.field579 = false;
                }
                if (class311.field4933 != -1) {
                    class84.method762(true, 28406);
                }
                if (class279.field4426 != null && (class88.field1397 == 30 || class88.field1397 == 25)) {
                    class225.method1640(16);
                }
                for (int var13 = 0; var13 < 100; var13++) {
                    class272.field4337[var13] = true;
                }
                class57.field890 = true;
            } else {
                method797(0, (byte) -105, true, -1, -1, arg5, true);
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)Lie;", line = 253)
    public static final class97 method798(byte arg0, int arg1) {
        field1449++;
        class97 var2 = (class97) class354.field5601.method467(true, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class39.field588.method441(false, class146.method1168(18, arg1), class100.method862(4096, arg1));
        if (arg0 != 104) {
            return (class97) null;
        }
        class97 var4 = new class97();
        var4.field1522 = arg1;
        if (var3 != null) {
            var4.method826(new class336(var3), -1);
        }
        var4.method834((byte) 120);
        if (var4.field1536) {
            var4.field1511 = false;
            var4.field1575 = 0;
        }
        if (!class324.field5153 && var4.field1587) {
            var4.field1533 = null;
        }
        class354.field5601.method465(var4, (long) arg1, (byte) 107);
        return var4;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)Ln;", line = 293)
    public final class309 method799(byte arg0) {
        field1448++;
        class309 var2 = (class309) class181.field3044.method467(true, (long) this.field1444);
        if (arg0 != -52) {
            method801(-124);
        }
        if (var2 != null) {
            return var2;
        }
        class309 var3 = class28.method259(class318.field5050, false, 0, this.field1444);
        if (var3 != null) {
            class181.field3044.method465(var3, (long) this.field1444, (byte) 73);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lpi;IIZ)V", line = 328)
    private final void method800(class336 arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 == 1) {
            this.field1444 = arg0.method2339((byte) -46);
        } else if (arg1 == 2) {
            this.field1450 = arg0.method2364(-9069);
            this.field1453 = arg0.method2364(-9069);
        }
        if (!arg3) {
            field1446 = (class49) null;
        }
        field1451++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 360)
    public static void method801(int arg0) {
        if (arg0 == 0) {
            field1445 = null;
            field1443 = null;
            field1446 = null;
            field1447 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lpi;IB)V", line = 377)
    public final void method802(class336 arg0, int arg1, byte arg2) {
        while (true) {
            int var4 = arg0.method2364(-9069);
            if (var4 == 0) {
                int var5 = -105 % ((53 - arg2) / 62);
                field1452++;
                return;
            }
            this.method800(arg0, var4, arg1, true);
        }
    }
}
