import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class74 implements class51 {

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    private int field1413 = 128;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    private int field1419 = 50;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "Lve;")
    private class225 field1426;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "Lve;")
    private class225 field1417;

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "Lri;")
    private class189 field1430;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "Ldj;")
    private static class44 field1411 = class89.method650(255, ":tradereq:");

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "Ldj;")
    public static class44 field1407 = class89.method650(255, "Die Adresse dieses Computers wurde gesperrt)1");

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "Lri;")
    public static class189 field1416 = new class189(64);

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "Lri;")
    public static class189 field1431 = new class189(100);

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "Ldj;")
    public static class44 field1432 = class89.method650(255, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "Z")
    public static boolean field1433 = false;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "Lve;")
    public static class225 field1427;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "Lgb;")
    public static class69 field1424;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public static final void method571(int arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        field1414++;
        System.exit(1);
        if (arg0 <= 95) {
            field1424 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
    public static final int method572(int arg0, KeyEvent arg1) {
        field1418++;
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else if (arg0 == -1) {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        } else {
            return -28;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
    public static final void method573(int arg0) {
        for (int var1 = -1; var1 < class90.field1702; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class45.field858[var1];
            }
            class24 var3 = class122.field2168[var2];
            if (var3 != null) {
                class103.method761(1, var3, -16934);
            }
        }
        if (arg0 < 82) {
            method575((byte) -64);
        }
        field1404++;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
    public static final void method574(int arg0) {
        class62.field1158 = arg0;
        for (int var1 = 0; var1 < class66.field1205; var1++) {
            for (int var2 = 0; var2 < class21.field355; var2++) {
                if (class32.field567[arg0][var1][var2] == null) {
                    class32.field567[arg0][var1][var2] = new class68(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
    public static void method575(byte arg0) {
        field1432 = null;
        if (arg0 != -50) {
            method573(-79);
        }
        field1427 = null;
        field1431 = null;
        field1411 = null;
        field1416 = null;
        field1424 = null;
        field1407 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BI)Z")
    public final boolean method367(byte arg0, int arg1) {
        field1420++;
        if (this.field1413 == 64 || this.method578(arg1, 0).field973 == 64) {
            return true;
        } else {
            if (arg0 >= -8) {
                field1432 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IJ)V")
    public static final void method576(int arg0, long arg1) {
        field1428++;
        if (arg1 == 0L || arg0 != -30879) {
            return;
        }
        for (int var3 = 0; var3 < class117.field2085; var3++) {
            if (class166.field2848[var3] == arg1) {
                class117.field2085--;
                for (int var4 = var3; var4 < class117.field2085; var4++) {
                    class174.field3026[var4] = class174.field3026[var4 + 1];
                    class37.field657[var4] = class37.field657[var4 + 1];
                    class122.field2161[var4] = class122.field2161[var4 + 1];
                    class166.field2848[var4] = class166.field2848[var4 + 1];
                    class60.field1131[var4] = class60.field1131[var4 + 1];
                }
                class143.field2531 = class66.field1251;
                class200.field3542.method1170(126, (byte) -120);
                class222.field4016++;
                class200.field3542.method536(arg1, 53);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(II)V")
    public final void method577(int arg0, int arg1) {
        field1410++;
        int var3 = -78 / ((-arg1 - 8) / 39);
        for (class54 var4 = (class54) this.field1430.method1182(false); var4 != null; var4 = (class54) this.field1430.method1184((byte) -3)) {
            if (var4.field979) {
                var4.method387(23906, arg0);
                var4.field979 = false;
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)[I")
    public final int[] method366(int arg0, int arg1) {
        if (arg0 != -205) {
            this.field1430 = null;
        }
        field1422++;
        class54 var3 = this.method578(arg1, 0);
        return var3.method392(this, this.field1413, (byte) -74, this.field1417);
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(II)Lei;")
    private final class54 method578(int arg0, int arg1) {
        class54 var3 = (class54) this.field1430.method1178((long) arg0, 14176);
        field1409++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field1426.method1466(arg1, arg0, (byte) -120);
        if (var4 == null) {
            return class60.method453(87);
        } else {
            class66 var5 = new class66(var4);
            class54 var6 = new class54(var5);
            this.field1430.method1183((byte) 114, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)I")
    public final int method369(int arg0, byte arg1) {
        field1423++;
        if (arg1 > -99) {
            field1432 = null;
        }
        return this.method578(arg0, 0).field977;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(IB)Z")
    public final boolean method371(int arg0, byte arg1) {
        field1415++;
        if (arg1 < 126) {
            field1416 = null;
        }
        return this.method578(arg0, 0).field989;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(FBI)[I")
    public final int[] method370(float arg0, byte arg1, int arg2) {
        if (arg1 <= 90) {
            return null;
        } else {
            field1406++;
            class54 var4 = this.method578(arg2, 0);
            var4.field979 = true;
            return var4.method385(this.field1413, arg0, this.field1417, -77, this);
        }
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)Z")
    public static final boolean method579(int arg0) throws IOException {
        field1408++;
        if (class101.field1844 == null) {
            return false;
        }
        int var1 = class101.field1844.method783(true);
        if (var1 == 0) {
            return false;
        }
        if (class42.field779 == -1) {
            class101.field1844.method784(class218.field3957.field1219, 0, 1, (byte) -126);
            class218.field3957.field1195 = 0;
            var1--;
            class42.field779 = class218.field3957.method1164(20);
            class88.field1680 = class220.field3987[class42.field779];
        }
        if (class88.field1680 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class101.field1844.method784(class218.field3957.field1219, 0, 1, (byte) -126);
            class88.field1680 = class218.field3957.field1219[0] & 0xFF;
            var1--;
        }
        if (class88.field1680 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class101.field1844.method784(class218.field3957.field1219, 0, 2, (byte) -128);
            class218.field3957.field1195 = 0;
            class88.field1680 = class218.field3957.method500(116);
        }
        if (var1 < class88.field1680) {
            return false;
        }
        class218.field3957.field1195 = 0;
        class101.field1844.method784(class218.field3957.field1219, 0, class88.field1680, (byte) -127);
        class202.field3622 = class8.field157;
        class218.field3946 = 0;
        class8.field157 = class163.field2822;
        class163.field2822 = class42.field779;
        if (class42.field779 == 22) {
            int var2 = class218.field3957.method531((byte) -19);
            int var3 = class218.field3957.method534(-5738);
            int var4 = class218.field3957.method499(-1020228848);
            class104 var5 = (class104) class129.field2294.method828((long) var4, (byte) -40);
            if (var5 != null) {
                class73.method570(var5, -15535, var5.field1893 != var2);
            }
            class33.method225(var4, var3, var2, -97);
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 123) {
            class108.field1975 = class218.field3957.method506(255);
            class95.field1765 = class218.field3957.method506(arg0 ^ 0xFE);
            class230.field4316 = class218.field3957.method506(255);
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 207) {
            class44 var6 = class218.field3957.method496(true);
            Object[] var7 = new Object[var6.method340(3) + 1];
            for (int var8 = var6.method340(arg0 + 2) - 1; var8 >= 0; var8--) {
                if (var6.method302(arg0 ^ 0xFFFFCF05, var8) == 115) {
                    var7[var8 + 1] = class218.field3957.method496(true);
                } else {
                    var7[var8 + 1] = Integer.valueOf(class218.field3957.method528(true));
                }
            }
            var7[0] = Integer.valueOf(class218.field3957.method528(true));
            class140 var9 = new class140();
            var9.field2506 = var7;
            class150.method972(var9, (byte) -127);
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 223) {
            for (int var10 = 0; var10 < class136.field2435.length; var10++) {
                if (class136.field2435[var10] != class10.field201[var10]) {
                    class136.field2435[var10] = class10.field201[var10];
                    class170.method1080(arg0 ^ 0xFFFFFFDE, var10);
                    class207.field3714[class29.method202(31, class79.field1527++)] = var10;
                }
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 64) {
            class239.method1549((byte) 76, true);
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 255) {
            class42.field779 = -1;
            class198.field3511 = 0;
            return true;
        } else if (class42.field779 == 201) {
            int var11 = class218.field3957.method506(255);
            int var12 = class218.field3957.method506(255);
            int var13 = class218.field3957.method506(255);
            int var14 = class218.field3957.method506(255);
            int var15 = class218.field3957.method500(71);
            class30.field531[var11] = true;
            class147.field2605[var11] = var12;
            class38.field678[var11] = var13;
            class96.field1783[var11] = var14;
            class44.field797[var11] = var15;
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 56) {
            int var16 = class218.field3957.method513(-1020228848);
            class220.field3980 = class83.field1627.method1504((byte) 65, var16);
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 110) {
            for (int var17 = 0; var17 < class93.field1728; var17++) {
                class9 var18 = class55.method393(0, var17);
                if (var18 != null && var18.field192 == 0) {
                    class10.field201[var17] = 0;
                    class136.field2435[var17] = 0;
                }
            }
            class187.method1163((byte) 111);
            class79.field1527 += 32;
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 235) {
            int var19 = class218.field3957.method531((byte) -19);
            int var20 = class218.field3957.method528(true);
            int var21 = class218.field3957.method487(-32674);
            class223 var22 = class213.method1379(var20, -10051);
            class42.field779 = -1;
            var22.field4115 = (var19 << 16) + var21;
            return true;
        } else if (class42.field779 == 215) {
            class44 var23 = class218.field3957.method496(true);
            int var24 = class218.field3957.method512((byte) 54);
            int var25 = class218.field3957.method506(arg0 + 254);
            if (var25 >= 1 && var25 <= 8) {
                if (var23.method330(class166.field2873, true)) {
                    var23 = null;
                }
                class14.field264[var25 - 1] = var23;
                class90.field1708[var25 - 1] = var24 == 0;
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 34) {
            field1412 = class218.field3957.method506(255);
            class166.field2870 = class218.field3957.method506(255);
            while (class218.field3957.field1195 < class88.field1680) {
                class42.field779 = class218.field3957.method506(255);
                class197.method1282(-1);
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 101 || class42.field779 == 176 || class42.field779 == 148 || class42.field779 == 85 || class42.field779 == 90 || class42.field779 == 243 || class42.field779 == 171 || class42.field779 == 19 || class42.field779 == 114 || class42.field779 == 72 || class42.field779 == 16) {
            class197.method1282(-1);
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 96) {
            class103.field1890 = class218.field3957.method496(true);
            class70.method549(class103.field1890, -1);
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 229) {
            int var26 = class218.field3957.method528(true);
            int var27 = class218.field3957.method528(true);
            class104 var28 = (class104) class129.field2294.method828((long) var26, (byte) -40);
            class104 var29 = (class104) class129.field2294.method828((long) var27, (byte) -40);
            if (var29 != null) {
                class73.method570(var29, -15535, var28.field1893 != var29.field1893);
            }
            if (var28 != null) {
                var28.method1148(arg0 ^ 0xFFFFCC60);
                class129.field2294.method830(var28, (long) var27, 1);
            }
            class223 var30 = class213.method1379(var26, arg0 ^ 0xFFFFD8BC);
            if (var30 != null) {
                class225.method1457(arg0 - 122, var30);
            }
            class223 var31 = class213.method1379(var27, -10051);
            if (var31 != null) {
                class225.method1457(78, var31);
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 204) {
            long var32 = class218.field3957.method491((byte) -126);
            long var34 = (long) class218.field3957.method500(arg0 ^ 0x73);
            long var36 = (long) class218.field3957.method480(117);
            int var38 = class218.field3957.method506(arg0 + 254);
            long var39 = (var34 << 32) + var36;
            boolean var41 = false;
            for (int var42 = 0; var42 < 100; var42++) {
                if (class169.field2925[var42] == var39) {
                    var41 = true;
                    break;
                }
            }
            if (var38 <= 1) {
                for (int var43 = 0; var43 < class37.field664; var43++) {
                    if (class154.field2686[var43] == var32) {
                        var41 = true;
                        break;
                    }
                }
            }
            if (!var41 && class230.field4311 == 0) {
                class169.field2925[class171.field2984] = var39;
                class171.field2984 = (class171.field2984 + 1) % 100;
                class44 var44 = class56.method419(class13.method114(class218.field3957, -12769).method322(true));
                if (var38 == 2 || var38 == 3) {
                    class226.method1484(var44, 0, 7, class70.method555(new class44[] { class79.field1525, class38.method263((byte) 3, var32).method320(false) }, -3));
                } else if (var38 == 1) {
                    class226.method1484(var44, 0, 7, class70.method555(new class44[] { class172.field3003, class38.method263((byte) 3, var32).method320(false) }, -3));
                } else {
                    class226.method1484(var44, arg0 ^ 0x1, 3, class38.method263((byte) 3, var32).method320(false));
                }
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 75) {
            int var45 = class218.field3957.method519((byte) 24);
            class44 var46 = class218.field3957.method496(true);
            class223 var47 = class213.method1379(var45, -10051);
            if (!var46.method314(var47.field4071, arg0 ^ 0xFFFFFFBC)) {
                var47.field4071 = var46;
                class225.method1457(82, var47);
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 130) {
            int var48 = class218.field3957.method531((byte) -19);
            if (var48 == 65535) {
                var48 = -1;
            }
            class87.method644(0, var48);
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 133) {
            int var49 = class218.field3957.method482(-1);
            int var50 = class218.field3957.method531((byte) -19);
            if (var50 == 65535) {
                var50 = -1;
            }
            class178.method1125(var49, 126, var50);
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 107) {
            int var51 = class218.field3957.method528(true);
            class223 var52 = class213.method1379(var51, arg0 ^ 0xFFFFD8BC);
            for (int var53 = 0; var53 < var52.field4166.length; var53++) {
                var52.field4166[var53] = -1;
                var52.field4166[var53] = 0;
            }
            class225.method1457(-75, var52);
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 124) {
            class184.method1155(class88.field1680, class83.field1627, class218.field3957, (byte) 75);
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 247) {
            byte[] var54 = new byte[class88.field1680];
            class218.field3957.method1165(var54, (byte) 119, class88.field1680, 0);
            class86.method642(class93.method664(class88.field1680, -39, var54, 0), (byte) 123);
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 2) {
            class59.field1098 = class66.field1251;
            long var55 = class218.field3957.method491((byte) 117);
            if (var55 == 0L) {
                class19.field317 = null;
                class151.field2634 = 0;
                class207.field3721 = null;
                class42.field779 = -1;
                class28.field496 = null;
                return true;
            }
            long var57 = class218.field3957.method491((byte) 12);
            class19.field317 = class38.method263((byte) 3, var57);
            class207.field3721 = class38.method263((byte) 3, var55);
            class1.field3 = class218.field3957.method505(false);
            int var59 = class218.field3957.method506(255);
            if (var59 == 255) {
                class42.field779 = -1;
                return true;
            }
            class151.field2634 = var59;
            class231[] var60 = new class231[100];
            for (int var61 = 0; var61 < class151.field2634; var61++) {
                var60[var61] = new class231();
                var60[var61].field3186 = class218.field3957.method491((byte) 120);
                var60[var61].field4331 = class38.method263((byte) 3, var60[var61].field3186);
                var60[var61].field4330 = class218.field3957.method500(118);
                var60[var61].field4329 = class218.field3957.method505(false);
                var60[var61].field4326 = class218.field3957.method496(true);
                if (class101.field1840 == var60[var61].field3186) {
                    class179.field3103 = var60[var61].field4329;
                }
            }
            boolean var62 = false;
            int var63 = class151.field2634;
            while (var63 > 0) {
                boolean var64 = true;
                var63--;
                for (int var65 = 0; var65 < var63; var65++) {
                    if (var60[var65].field4331.method315((byte) 106, var60[var65 + 1].field4331) > 0) {
                        var64 = false;
                        class231 var66 = var60[var65];
                        var60[var65] = var60[var65 + 1];
                        var60[var65 + 1] = var66;
                    }
                }
                if (var64) {
                    break;
                }
            }
            class42.field779 = -1;
            class28.field496 = var60;
            return true;
        } else if (class42.field779 == 0) {
            class44 var67 = class218.field3957.method496(true);
            if (var67.method310(field1411, 0)) {
                class44 var97 = var67.method318(127, var67.method297(-46, class129.field2308), 0);
                long var98 = var97.method306(-58);
                boolean var100 = false;
                for (int var101 = 0; var101 < class37.field664; var101++) {
                    if (class154.field2686[var101] == var98) {
                        var100 = true;
                        break;
                    }
                }
                if (!var100 && class230.field4311 == 0) {
                    class226.method1484(class135.field2420, 0, 4, var97);
                }
            } else if (var67.method310(class109.field2001, 0)) {
                class44 var68 = var67.method318(127, var67.method297(arg0 - 59, class129.field2308), 0);
                boolean var69 = false;
                long var70 = var68.method306(-58);
                for (int var72 = 0; var72 < class37.field664; var72++) {
                    if (class154.field2686[var72] == var70) {
                        var69 = true;
                        break;
                    }
                }
                if (!var69 && class230.field4311 == 0) {
                    class44 var73 = var67.method318(125, var67.method340(3) - 9, var67.method297(arg0 ^ 0x4D, class129.field2308) - -1);
                    class226.method1484(var73, arg0 - 1, 8, var68);
                }
            } else if (var67.method310(class57.field1076, 0)) {
                class44 var74 = var67.method318(125, var67.method297(61, class129.field2308), 0);
                long var75 = var74.method306(-58);
                boolean var77 = false;
                for (int var78 = 0; var78 < class37.field664; var78++) {
                    if (class154.field2686[var78] == var75) {
                        var77 = true;
                        break;
                    }
                }
                if (!var77 && class230.field4311 == 0) {
                    class226.method1484(class94.field1752, arg0 - 1, 10, var74);
                }
            } else if (var67.method310(class62.field1167, 0)) {
                class44 var96 = var67.method318(126, var67.method297(46, class62.field1167), 0);
                class226.method1484(var96, 0, 11, class94.field1752);
            } else if (var67.method310(class224.field4186, arg0 ^ 0x1)) {
                class44 var79 = var67.method318(arg0 ^ 0x7E, var67.method297(arg0 ^ 0x3D, class224.field4186), 0);
                if (class230.field4311 == 0) {
                    class226.method1484(var79, arg0 ^ 0x1, 12, class94.field1752);
                }
            } else if (var67.method310(class9.field188, 0)) {
                class44 var80 = var67.method318(126, var67.method297(95, class9.field188), 0);
                if (class230.field4311 == 0) {
                    class226.method1484(var80, 0, 13, class94.field1752);
                }
            } else if (var67.method310(class20.field345, 0)) {
                class44 var91 = var67.method318(126, var67.method297(84, class129.field2308), 0);
                boolean var92 = false;
                long var93 = var91.method306(arg0 ^ 0xFFFFFFC7);
                for (int var95 = 0; var95 < class37.field664; var95++) {
                    if (class154.field2686[var95] == var93) {
                        var92 = true;
                        break;
                    }
                }
                if (!var92 && class230.field4311 == 0) {
                    class226.method1484(class94.field1752, 0, 14, var91);
                }
            } else if (var67.method310(class170.field2953, 0)) {
                class44 var81 = var67.method318(arg0 + 124, var67.method297(arg0 ^ 0xFFFFFF8C, class129.field2308), 0);
                long var82 = var81.method306(-58);
                boolean var84 = false;
                for (int var85 = 0; var85 < class37.field664; var85++) {
                    if (class154.field2686[var85] == var82) {
                        var84 = true;
                        break;
                    }
                }
                if (!var84 && class230.field4311 == 0) {
                    class226.method1484(class94.field1752, 0, 15, var81);
                }
            } else if (var67.method310(class156.field2701, 0)) {
                class44 var86 = var67.method318(126, var67.method297(59, class129.field2308), 0);
                long var87 = var86.method306(arg0 - 59);
                boolean var89 = false;
                for (int var90 = 0; var90 < class37.field664; var90++) {
                    if (class154.field2686[var90] == var87) {
                        var89 = true;
                        break;
                    }
                }
                if (!var89 && class230.field4311 == 0) {
                    class226.method1484(class94.field1752, 0, 16, var86);
                }
            } else {
                class226.method1484(var67, 0, 0, class94.field1752);
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 170) {
            class86.field1658 = false;
            for (int var102 = 0; var102 < 5; var102++) {
                class30.field531[var102] = false;
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 66) {
            for (int var103 = 0; var103 < class122.field2168.length; var103++) {
                if (class122.field2168[var103] != null) {
                    class122.field2168[var103].field2243 = -1;
                }
            }
            for (int var104 = 0; var104 < class170.field2960.length; var104++) {
                if (class170.field2960[var104] != null) {
                    class170.field2960[var104].field2243 = -1;
                }
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 177) {
            int var105 = class218.field3957.method500(82);
            int var106 = class218.field3957.method499(arg0 - 1020228849);
            class223 var107 = class213.method1379(var106, -10051);
            if (var107 != null && var107.field4076 == 0) {
                if (var107.field4025 - var107.field4134 < var105) {
                    var105 = var107.field4025 - var107.field4134;
                }
                if (var105 < 0) {
                    var105 = 0;
                }
                if (var107.field4026 != var105) {
                    var107.field4026 = var105;
                    class225.method1457(125, var107);
                }
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 51) {
            int var108 = class218.field3957.method534(arg0 - 5739);
            int var109 = class218.field3957.method529((byte) 123);
            if (var108 == 1) {
                class196.method1274();
                for (int var110 = 0; var110 < 4; var110++) {
                    class73.field1390[var110].method1405(arg0 ^ 0xFFFFFFFA);
                }
                System.gc();
            } else if (var108 == 2) {
                class61.method457((byte) 55);
                System.gc();
                class62.method467(25, (byte) 57);
            }
            class201.field3575 = var109;
            class28.method199(var109, false);
            class17.method143(true);
            class165.method1057(class201.field3575, arg0 ^ 0x27F0);
            for (int var111 = 0; var111 < 100; var111++) {
                class68.field1289[var111] = true;
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 180) {
            int var112 = class218.field3957.method506(255);
            class97 var113 = new class97();
            var113.field1795 = var112 & 0x3F;
            var113.field1787 = class218.field3957.method506(255);
            int var114 = var112 >> 6;
            if (var113.field1787 >= 0 && var113.field1787 < class154.field2676.length) {
                if (var113.field1795 == 1 || var113.field1795 == 10) {
                    var113.field1797 = class218.field3957.method500(43);
                    class218.field3957.field1195 += 3;
                } else if (var113.field1795 >= 2 && var113.field1795 <= 6) {
                    if (var113.field1795 == 2) {
                        var113.field1796 = 64;
                        var113.field1786 = 64;
                    }
                    if (var113.field1795 == 3) {
                        var113.field1786 = 64;
                        var113.field1796 = 0;
                    }
                    if (var113.field1795 == 4) {
                        var113.field1786 = 64;
                        var113.field1796 = 128;
                    }
                    if (var113.field1795 == 5) {
                        var113.field1786 = 0;
                        var113.field1796 = 64;
                    }
                    if (var113.field1795 == 6) {
                        var113.field1786 = 128;
                        var113.field1796 = 64;
                    }
                    var113.field1795 = 2;
                    var113.field1798 = class218.field3957.method500(arg0 + 90);
                    var113.field1790 = class218.field3957.method500(40);
                    var113.field1791 = class218.field3957.method506(255);
                }
                var113.field1789 = class218.field3957.method500(42);
                if (var113.field1789 == 65535) {
                    var113.field1789 = -1;
                }
                class61.field1132[var114] = var113;
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 50) {
            class218.field3955 = class218.field3957.method506(255);
            class42.field779 = -1;
            class143.field2531 = class66.field1251;
            return true;
        } else if (class42.field779 == 162) {
            long var115 = class218.field3957.method491((byte) 99);
            class218.field3957.method505(false);
            long var117 = class218.field3957.method491((byte) 5);
            long var119 = (long) class218.field3957.method500(114);
            long var121 = (long) class218.field3957.method480(103);
            long var123 = (var119 << 32) + var121;
            boolean var125 = false;
            int var126 = class218.field3957.method506(arg0 ^ 0xFE);
            for (int var127 = 0; var127 < 100; var127++) {
                if (class169.field2925[var127] == var123) {
                    var125 = true;
                    break;
                }
            }
            if (var126 <= 1) {
                for (int var128 = 0; var128 < class37.field664; var128++) {
                    if (class154.field2686[var128] == var115) {
                        var125 = true;
                        break;
                    }
                }
            }
            if (!var125 && class230.field4311 == 0) {
                class169.field2925[class171.field2984] = var123;
                class171.field2984 = (class171.field2984 + 1) % 100;
                class44 var129 = class56.method419(class13.method114(class218.field3957, -12769).method322(true));
                if (var126 == 2 || var126 == 3) {
                    class92.method661(class38.method263((byte) 3, var117).method320(false), arg0 ^ 0xFFFFFFFE, var129, class70.method555(new class44[] { class79.field1525, class38.method263((byte) 3, var115).method320(false) }, arg0 - 4), 9);
                } else if (var126 == 1) {
                    class92.method661(class38.method263((byte) 3, var117).method320(false), -1, var129, class70.method555(new class44[] { class172.field3003, class38.method263((byte) 3, var115).method320(false) }, -3), 9);
                } else {
                    class92.method661(class38.method263((byte) 3, var117).method320(false), -1, var129, class38.method263((byte) 3, var115).method320(false), 9);
                }
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 143) {
            class212.method1374((byte) -104);
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 105) {
            int var130 = class218.field3957.method513(-1020228848);
            int var131 = class218.field3957.method487(arg0 - 32675);
            if (var131 == 65535) {
                var131 = -1;
            }
            int var132 = class218.field3957.method487(-32674);
            int var133 = class218.field3957.method499(arg0 ^ 0xC3308B11);
            if (var132 == 65535) {
                var132 = -1;
            }
            for (int var134 = var132; var134 <= var131; var134++) {
                long var135 = ((long) var133 << 32) + (long) var134;
                class183 var137 = class163.field2814.method828(var135, (byte) -40);
                if (var137 != null) {
                    var137.method1148(-13215);
                }
                class163.field2814.method830(new class222(var130), var135, 1);
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 225) {
            boolean var138 = class218.field3957.method534(arg0 - 5739) == 1;
            int var139 = class218.field3957.method528(true);
            class223 var140 = class213.method1379(var139, arg0 ^ 0xFFFFD8BC);
            if (var140.field4173 != var138) {
                var140.field4173 = var138;
                class225.method1457(117, var140);
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 140) {
            long var141 = class218.field3957.method491((byte) -37);
            long var143 = (long) class218.field3957.method500(69);
            long var145 = (long) class218.field3957.method480(106);
            long var147 = (var143 << 32) + var145;
            int var149 = class218.field3957.method506(255);
            int var150 = class218.field3957.method500(102);
            boolean var151 = false;
            for (int var152 = 0; var152 < 100; var152++) {
                if (class169.field2925[var152] == var147) {
                    var151 = true;
                    break;
                }
            }
            if (var149 <= 1) {
                for (int var153 = 0; var153 < class37.field664; var153++) {
                    if (class154.field2686[var153] == var141) {
                        var151 = true;
                        break;
                    }
                }
            }
            if (!var151 && class230.field4311 == 0) {
                class169.field2925[class171.field2984] = var147;
                class171.field2984 = (class171.field2984 + 1) % 100;
                class44 var154 = class63.method473((byte) -106, var150).method436(class218.field3957, (byte) 93);
                if (var149 == 2) {
                    class190.method1191(null, -29786, class70.method555(new class44[] { class79.field1525, class38.method263((byte) 3, var141).method320(false) }, -3), 18, var154, var150);
                } else if (var149 == 1) {
                    class190.method1191(null, -29786, class70.method555(new class44[] { class172.field3003, class38.method263((byte) 3, var141).method320(false) }, -3), 18, var154, var150);
                } else {
                    class190.method1191(null, -29786, class38.method263((byte) 3, var141).method320(false), 18, var154, var150);
                }
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 178) {
            int var155 = class218.field3957.method500(118);
            if (var155 == 65535) {
                var155 = -1;
            }
            int var156 = class218.field3957.method506(255);
            int var157 = class218.field3957.method500(106);
            class66.method521(var157, arg0 ^ 0xFFFFFFFE, var155, var156);
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 181) {
            int var158 = class218.field3957.method528(true);
            class104 var159 = (class104) class129.field2294.method828((long) var158, (byte) -40);
            if (var159 != null) {
                class73.method570(var159, -15535, true);
            }
            if (class10.field215 != null) {
                class225.method1457(arg0 + 89, class10.field215);
                class10.field215 = null;
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 3) {
            int var160 = class218.field3957.method529((byte) 123);
            class52.method376(-60, var160);
            class61.field1144[class29.method202(class13.field261++, 31)] = class29.method202(32767, var160);
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 244) {
            int var161 = class218.field3957.method513(-1020228848);
            int var162 = class218.field3957.method487(-32674);
            if (var162 == 65535) {
                var162 = -1;
            }
            int var163 = class218.field3957.method499(arg0 - 1020228849);
            class223 var164 = class213.method1379(var161, -10051);
            if (var164.field4118) {
                var164.field4024 = var163;
                var164.field4078 = var162;
                class214 var165 = class192.method1227(-31700, var162);
                var164.field4135 = var165.field3892;
                var164.field4081 = var165.field3846;
                if (var164.field4037 > 0) {
                    var164.field4135 = var164.field4135 * 32 / var164.field4037;
                } else if (var164.field4136 > 0) {
                    var164.field4135 = var164.field4135 * 32 / var164.field4136;
                }
                var164.field4133 = var165.field3890;
                var164.field4094 = var165.field3856;
                var164.field4077 = var165.field3850;
                var164.field4036 = var165.field3877;
                class225.method1457(arg0 ^ 0xFFFFFF89, var164);
            } else if (var162 == -1) {
                var164.field4052 = 0;
                class42.field779 = -1;
                return true;
            } else {
                class214 var166 = class192.method1227(-31700, var162);
                var164.field4081 = var166.field3846;
                var164.field4052 = 4;
                var164.field4036 = var166.field3877;
                var164.field4050 = var162;
                var164.field4135 = var166.field3892 * 100 / var163;
                class225.method1457(114, var164);
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 226) {
            int var167 = class218.field3957.method531((byte) -19);
            if (var167 == 65535) {
                var167 = -1;
            }
            int var168 = class218.field3957.method513(arg0 ^ 0xC3308B11);
            class223 var169 = class213.method1379(var168, -10051);
            if (var169.field4052 != 1 || var169.field4050 != var167) {
                var169.field4050 = var167;
                var169.field4052 = 1;
                class225.method1457(112, var169);
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 227) {
            class86.field1658 = true;
            class205.field3677 = class218.field3957.method506(255);
            class223.field4168 = class218.field3957.method506(255);
            class153.field2655 = class218.field3957.method500(78);
            class60.field1126 = class218.field3957.method506(255);
            class211.field3775 = class218.field3957.method506(255);
            if (class211.field3775 >= 100) {
                class102.field1858 = class223.field4168 * 128 + 64;
                class168.field2878 = class205.field3677 * 128 + 64;
                class35.field628 = class40.method278(class102.field1858, class194.field3403, class168.field2878, (byte) 101) - class153.field2655;
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 155) {
            long var170 = class218.field3957.method491((byte) -112);
            int var172 = class218.field3957.method500(72);
            int var173 = class218.field3957.method506(255);
            class44 var174 = class94.field1752;
            if (var172 > 0) {
                var174 = class218.field3957.method496(true);
            }
            class44 var175 = class38.method263((byte) 3, var170).method320(false);
            for (int var176 = 0; var176 < class117.field2085; var176++) {
                if (class166.field2848[var176] == var170) {
                    if (class37.field657[var176] != var172) {
                        class37.field657[var176] = var172;
                        if (var172 > 0) {
                            class226.method1484(class70.method555(new class44[] { var175, class89.field1691 }, -3), 0, 5, class94.field1752);
                        }
                        if (var172 == 0) {
                            class226.method1484(class70.method555(new class44[] { var175, class118.field2105 }, -3), 0, 5, class94.field1752);
                        }
                    }
                    var175 = null;
                    class122.field2161[var176] = var174;
                    class60.field1131[var176] = var173;
                    break;
                }
            }
            if (var175 != null && class117.field2085 < 200) {
                class166.field2848[class117.field2085] = var170;
                class174.field3026[class117.field2085] = var175;
                class37.field657[class117.field2085] = var172;
                class122.field2161[class117.field2085] = var174;
                class60.field1131[class117.field2085] = var173;
                class117.field2085++;
            }
            class143.field2531 = class66.field1251;
            boolean var177 = false;
            int var178 = class117.field2085;
            while (var178 > 0) {
                var178--;
                boolean var179 = true;
                for (int var180 = 0; var180 < var178; var180++) {
                    if (class37.field657[var180] != class186.field3209 && class37.field657[var180 + 1] == class186.field3209 || class37.field657[var180] == 0 && class37.field657[var180 + 1] != 0) {
                        int var181 = class37.field657[var180];
                        class37.field657[var180] = class37.field657[var180 + 1];
                        var179 = false;
                        class37.field657[var180 + 1] = var181;
                        class44 var182 = class122.field2161[var180];
                        class122.field2161[var180] = class122.field2161[var180 + 1];
                        class122.field2161[var180 + 1] = var182;
                        class44 var183 = class174.field3026[var180];
                        class174.field3026[var180] = class174.field3026[var180 + 1];
                        class174.field3026[var180 + 1] = var183;
                        long var184 = class166.field2848[var180];
                        class166.field2848[var180] = class166.field2848[var180 + 1];
                        class166.field2848[var180 + 1] = var184;
                        int var186 = class60.field1131[var180];
                        class60.field1131[var180] = class60.field1131[var180 + 1];
                        class60.field1131[var180 + 1] = var186;
                    }
                }
                if (var179) {
                    break;
                }
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 219) {
            class37.method256((byte) 30);
            class42.field779 = -1;
            return false;
        } else if (class42.field779 == 186) {
            int var187 = class218.field3957.method528(true);
            int var188 = class218.field3957.method500(105);
            if (var187 < -70000) {
                var188 += 32768;
            }
            class223 var189;
            if (var187 < 0) {
                var189 = null;
            } else {
                var189 = class213.method1379(var187, -10051);
            }
            if (var189 != null) {
                for (int var190 = 0; var190 < var189.field4166.length; var190++) {
                    var189.field4166[var190] = 0;
                    var189.field4060[var190] = 0;
                }
            }
            class9.method90(var188, arg0 ^ 0x64);
            int var191 = class218.field3957.method500(arg0 + 89);
            for (int var192 = 0; var192 < var191; var192++) {
                int var193 = class218.field3957.method500(40);
                int var194 = class218.field3957.method504((byte) -124);
                if (var194 == 255) {
                    var194 = class218.field3957.method519((byte) 101);
                }
                if (var189 != null && var192 < var189.field4166.length) {
                    var189.field4166[var192] = var193;
                    var189.field4060[var192] = var194;
                }
                class1.method1(var192, var193 - 1, (byte) -21, var194, var188);
            }
            if (var189 != null) {
                class225.method1457(-103, var189);
            }
            class187.method1163((byte) 111);
            class61.field1144[class29.method202(class13.field261++, 31)] = class29.method202(32767, var188);
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 43) {
            class86.field1658 = true;
            class191.field3297 = class218.field3957.method506(255);
            class120.field2132 = class218.field3957.method506(255);
            class63.field1180 = class218.field3957.method500(52);
            class134.field2397 = class218.field3957.method506(255);
            class145.field2562 = class218.field3957.method506(255);
            if (class145.field2562 >= 100) {
                int var195 = class191.field3297 * 128 + 64;
                int var196 = class120.field2132 * 128 + 64;
                int var197 = class40.method278(var196, class194.field3403, var195, (byte) 101) - class63.field1180;
                int var198 = var196 - class102.field1858;
                int var199 = var197 - class35.field628;
                int var200 = var195 - class168.field2878;
                int var201 = (int) Math.sqrt((double) (var198 * var198 + var200 * var200));
                class199.field3527 = (int) (Math.atan2((double) var199, (double) var201) * 325.949D) & 0x7FF;
                class38.field675 = (int) (-325.949D * Math.atan2((double) var200, (double) var198)) & 0x7FF;
                if (class199.field3527 < 128) {
                    class199.field3527 = 128;
                }
                if (class199.field3527 > 383) {
                    class199.field3527 = 383;
                }
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 248) {
            int var202 = class218.field3957.method506(255);
            if (class218.field3957.method506(arg0 + 254) == 0) {
                class84.field1632[var202] = new class194();
            } else {
                class218.field3957.field1195--;
                class84.field1632[var202] = new class194(class218.field3957);
            }
            class42.field779 = -1;
            class157.field2741 = class66.field1251;
            return true;
        } else if (class42.field779 == 151) {
            long var203 = class218.field3957.method491((byte) -127);
            class218.field3957.method505(false);
            long var205 = class218.field3957.method491((byte) 98);
            long var207 = (long) class218.field3957.method500(126);
            long var209 = (long) class218.field3957.method480(arg0 ^ 0x65);
            long var211 = (var207 << 32) + var209;
            int var213 = class218.field3957.method506(arg0 + 254);
            int var214 = class218.field3957.method500(117);
            boolean var215 = false;
            for (int var216 = 0; var216 < 100; var216++) {
                if (class169.field2925[var216] == var211) {
                    var215 = true;
                    break;
                }
            }
            if (var213 <= 1) {
                for (int var217 = 0; var217 < class37.field664; var217++) {
                    if (class154.field2686[var217] == var203) {
                        var215 = true;
                        break;
                    }
                }
            }
            if (!var215 && class230.field4311 == 0) {
                class169.field2925[class171.field2984] = var211;
                class171.field2984 = (class171.field2984 + 1) % 100;
                class44 var218 = class63.method473((byte) -84, var214).method436(class218.field3957, (byte) 93);
                if (var213 == 2 || var213 == 3) {
                    class190.method1191(class38.method263((byte) 3, var205).method320(false), -29786, class70.method555(new class44[] { class79.field1525, class38.method263((byte) 3, var203).method320(false) }, -3), 20, var218, var214);
                } else if (var213 == 1) {
                    class190.method1191(class38.method263((byte) 3, var205).method320(false), -29786, class70.method555(new class44[] { class172.field3003, class38.method263((byte) 3, var203).method320(false) }, arg0 - 4), 20, var218, var214);
                } else {
                    class190.method1191(class38.method263((byte) 3, var205).method320(false), -29786, class38.method263((byte) 3, var203).method320(false), 20, var218, var214);
                }
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 222) {
            class37.field664 = class88.field1680 / 8;
            for (int var219 = 0; var219 < class37.field664; var219++) {
                class154.field2686[var219] = class218.field3957.method491((byte) -9);
                class157.field2733[var219] = class38.method263((byte) 3, class154.field2686[var219]);
            }
            class143.field2531 = class66.field1251;
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 121) {
            field1412 = class218.field3957.method504((byte) -124);
            class166.field2870 = class218.field3957.method504((byte) -124);
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 246) {
            int var220 = class218.field3957.field1195 + class88.field1680;
            int var221 = class218.field3957.method500(91);
            int var222 = class218.field3957.method500(58);
            if (class201.field3575 != var221) {
                class201.field3575 = var221;
                class28.method199(class201.field3575, false);
                class17.method143(true);
                class165.method1057(class201.field3575, 10225);
                for (int var223 = 0; var223 < 100; var223++) {
                    class68.field1289[var223] = true;
                }
            }
            while (var222-- > 0) {
                int var232 = class218.field3957.method528(true);
                int var233 = class218.field3957.method500(118);
                int var234 = class218.field3957.method506(255);
                class104 var235 = (class104) class129.field2294.method828((long) var232, (byte) -40);
                if (var235 != null && var235.field1893 != var233) {
                    class73.method570(var235, arg0 ^ 0xFFFFC350, true);
                    var235 = null;
                }
                if (var235 == null) {
                    var235 = class33.method225(var232, var234, var233, 83);
                }
                var235.field1898 = true;
            }
            for (class104 var224 = (class104) class129.field2294.method832(112); var224 != null; var224 = (class104) class129.field2294.method829((byte) 97)) {
                if (var224.field1898) {
                    var224.field1898 = false;
                } else {
                    class73.method570(var224, arg0 ^ 0xFFFFC350, true);
                }
            }
            class163.field2814 = new class120(512);
            while (var220 > class218.field3957.field1195) {
                int var225 = class218.field3957.method528(true);
                int var226 = class218.field3957.method500(arg0 + 55);
                int var227 = class218.field3957.method500(73);
                int var228 = class218.field3957.method528(true);
                for (int var229 = var226; var229 <= var227; var229++) {
                    long var230 = ((long) var225 << 32) + ((long) var229);
                    class163.field2814.method830(new class222(var228), var230, 1);
                }
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 138) {
            int var236 = class218.field3957.method500(119);
            int var237 = class218.field3957.method500(arg0 + 72);
            class73.field1384 = var237;
            class62.field1168 = var236;
            class67.method541(2047);
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 109) {
            class187.method1163((byte) 111);
            int var238 = class218.field3957.method534(-5738);
            int var239 = class218.field3957.method528(true);
            int var240 = class218.field3957.method506(255);
            class156.field2716[var238] = var239;
            class136.field2432[var238] = var240;
            class33.field584[var238] = 1;
            for (int var241 = 0; var241 < 98; var241++) {
                if (class222.field4013[var241] <= var239) {
                    class33.field584[var238] = var241 + 2;
                }
            }
            class163.field2820[class29.method202(31, class237.field4399++)] = var238;
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 163) {
            int var242 = class218.field3957.method528(true);
            int var243 = class218.field3957.method531((byte) -19);
            class10.field201[var243] = var242;
            if (class136.field2435[var243] != var242) {
                class136.field2435[var243] = var242;
                class170.method1080(-113, var243);
            }
            class207.field3714[class29.method202(31, class79.field1527++)] = var243;
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 182) {
            long var244 = class218.field3957.method491((byte) -122);
            class44 var246 = class56.method419(class13.method114(class218.field3957, -12769).method322(true));
            class226.method1484(var246, 0, 6, class38.method263((byte) 3, var244).method320(false));
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 81) {
            int var247 = class218.field3957.method500(117);
            if (var247 == 65535) {
                var247 = -1;
            }
            int var248 = class218.field3957.method528(true);
            class223 var249 = class213.method1379(var248, -10051);
            if (var249.field4052 != 2 || var249.field4050 != var247) {
                var249.field4052 = 2;
                var249.field4050 = var247;
                class225.method1457(127, var249);
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 245) {
            class172.field2995 = class218.field3957.method529((byte) 123) * 30;
            class189.field3272 = class66.field1251;
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 23) {
            class102.method755(0, class218.field3957);
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 217) {
            long var250 = class218.field3957.method491((byte) -123);
            boolean var252 = false;
            if ((var250 & Long.MIN_VALUE) != 0L) {
                var252 = true;
            }
            int var253 = class218.field3957.method500(105);
            byte var254 = class218.field3957.method505(false);
            if (var252) {
                if (class151.field2634 == 0) {
                    class42.field779 = -1;
                    return true;
                }
                boolean var255 = false;
                long var256 = var250 & Long.MAX_VALUE;
                int var258;
                for (var258 = 0; var258 < class151.field2634 && (class28.field496[var258].field3186 != var256 || class28.field496[var258].field4330 != var253); var258++) {
                }
                if (var258 < class151.field2634) {
                    while (class151.field2634 - 1 > var258) {
                        class28.field496[var258] = class28.field496[var258 + 1];
                        var258++;
                    }
                    class151.field2634--;
                    class28.field496[class151.field2634] = null;
                }
            } else {
                class44 var259 = class218.field3957.method496(true);
                class231 var260 = new class231();
                var260.field3186 = var250;
                var260.field4331 = class38.method263((byte) 3, var260.field3186);
                var260.field4330 = var253;
                var260.field4329 = var254;
                var260.field4326 = var259;
                int var261;
                for (var261 = class151.field2634 - 1; var261 >= 0; var261--) {
                    int var262 = class28.field496[var261].field4331.method315((byte) 115, var260.field4331);
                    if (var262 == 0) {
                        class28.field496[var261].field4330 = var253;
                        class28.field496[var261].field4329 = var254;
                        class28.field496[var261].field4326 = var259;
                        class59.field1098 = class66.field1251;
                        if (class101.field1840 == var250) {
                            class179.field3103 = var254;
                        }
                        class42.field779 = -1;
                        return true;
                    }
                    if (var262 < 0) {
                        break;
                    }
                }
                if (class28.field496.length <= class151.field2634) {
                    class42.field779 = -1;
                    return true;
                }
                for (int var263 = class151.field2634 - 1; var263 > var261; var263--) {
                    class28.field496[var263 + 1] = class28.field496[var263];
                }
                if (class151.field2634 == 0) {
                    class28.field496 = new class231[100];
                }
                class28.field496[var261 + 1] = var260;
                if (class101.field1840 == var250) {
                    class179.field3103 = var254;
                }
                class151.field2634++;
            }
            class59.field1098 = class66.field1251;
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 63) {
            int var264 = class218.field3957.method513(-1020228848);
            int var265 = class218.field3957.method523(255);
            int var266 = class218.field3957.method533(-2);
            class223 var267 = class213.method1379(var264, -10051);
            var267.field4043 = var267.field4163 = var266;
            var267.field4039 = var267.field4059 = var265;
            var267.field4142 = 0;
            var267.field4110 = 0;
            class225.method1457(arg0 ^ 0xFFFFFFCF, var267);
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 103) {
            int var268 = class218.field3957.method528(true);
            int var269 = class218.field3957.method500(63);
            class223 var270;
            if (var268 >= 0) {
                var270 = class213.method1379(var268, -10051);
            } else {
                var270 = null;
            }
            if (var268 < -70000) {
                var269 += 32768;
            }
            while (class88.field1680 > class218.field3957.field1195) {
                int var271 = class218.field3957.method530((byte) -127);
                int var272 = 0;
                int var273 = class218.field3957.method500(84);
                if (var273 != 0) {
                    var272 = class218.field3957.method506(255);
                    if (var272 == 255) {
                        var272 = class218.field3957.method528(true);
                    }
                }
                if (var270 != null && var271 >= 0 && var270.field4166.length > var271) {
                    var270.field4166[var271] = var273;
                    var270.field4060[var271] = var272;
                }
                class1.method1(var271, var273 - 1, (byte) -21, var272, var269);
            }
            if (var270 != null) {
                class225.method1457(119, var270);
            }
            class187.method1163((byte) 111);
            class61.field1144[class29.method202(class13.field261++, 31)] = class29.method202(32767, var269);
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 166) {
            class239.method1549((byte) 76, false);
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 203) {
            if (class201.field3575 != -1) {
                class5.method36(class201.field3575, true, 0);
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 126) {
            byte var274 = class218.field3957.method535(-1);
            int var275 = class218.field3957.method529((byte) 123);
            class10.field201[var275] = var274;
            if (class136.field2435[var275] != var274) {
                class136.field2435[var275] = var274;
                class170.method1080(-68, var275);
            }
            class207.field3714[class29.method202(31, class79.field1527++)] = var275;
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 41) {
            field1412 = class218.field3957.method504((byte) -124);
            class166.field2870 = class218.field3957.method506(arg0 + 254);
            for (int var276 = class166.field2870; var276 < class166.field2870 + 8; var276++) {
                for (int var278 = field1412; var278 < field1412 + 8; var278++) {
                    if (client.field599[class194.field3403][var276][var278] != null) {
                        client.field599[class194.field3403][var276][var278] = null;
                        class40.method279((byte) -98, var276, var278);
                    }
                }
            }
            for (class132 var277 = (class132) class210.field3754.method1189(0); var277 != null; var277 = (class132) class210.field3754.method1192((byte) -82)) {
                if (class166.field2870 <= var277.field2363 && class166.field2870 + 8 > var277.field2363 && var277.field2371 >= field1412 && var277.field2371 < field1412 + 8 && class194.field3403 == var277.field2367) {
                    var277.field2361 = 0;
                }
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 216) {
            class187.method1163((byte) 111);
            class181.field3158 = class218.field3957.method506(255);
            class189.field3272 = class66.field1251;
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 172) {
            int var279 = class218.field3957.method499(-1020228848);
            class223 var280 = class213.method1379(var279, arg0 ^ 0xFFFFD8BC);
            var280.field4052 = 3;
            var280.field4050 = class96.field1774.field407.method249((byte) 28);
            class225.method1457(113, var280);
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 136) {
            int var281 = class218.field3957.method512((byte) 76);
            int var282 = class218.field3957.method504((byte) -124);
            int var283 = class218.field3957.method512((byte) 51);
            class194.field3403 = var281 >> 1;
            class96.field1774.method854(var283, var282, (byte) -91, (var281 & 0x1) == 1);
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 213) {
            int var284 = class218.field3957.method519((byte) -121);
            int var285 = class218.field3957.method529((byte) 123);
            int var286 = var285 >> 5 & 0x1F;
            int var287 = var285 >> 10 & 0x1F;
            int var288 = var285 & 0x1F;
            int var289 = (var288 << 3) + (var286 << 11) + (var287 << 19);
            class223 var290 = class213.method1379(var284, -10051);
            if (var290.field4080 != var289) {
                var290.field4080 = var289;
                class225.method1457(124, var290);
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 30) {
            if (class88.field1680 == 0) {
                class119.field2122 = class95.field1769;
            } else {
                class119.field2122 = class218.field3957.method496(true);
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 42) {
            long var291 = class218.field3957.method491((byte) -115);
            int var293 = class218.field3957.method500(arg0 + 43);
            class44 var294 = class63.method473((byte) -79, var293).method436(class218.field3957, (byte) 93);
            class190.method1191(null, -29786, class38.method263((byte) 3, var291).method320(false), 19, var294, var293);
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 252) {
            int var295 = class218.field3957.method529((byte) 123);
            int var296 = class218.field3957.method528(true);
            int var297 = class218.field3957.method500(49);
            int var298 = class218.field3957.method529((byte) 123);
            class223 var299 = class213.method1379(var296, arg0 - 10052);
            if (var299.field4036 != var297 || var299.field4081 != var298 || var299.field4135 != var295) {
                var299.field4081 = var298;
                var299.field4036 = var297;
                var299.field4135 = var295;
                class225.method1457(87, var299);
            }
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 209) {
            class115.field2057 = class218.field3957.method506(arg0 ^ 0xFE);
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 188) {
            class187.method1163((byte) 111);
            class72.field1373 = class218.field3957.method514((byte) -60);
            class189.field3272 = class66.field1251;
            class42.field779 = -1;
            return true;
        } else if (class42.field779 == 187) {
            int var300 = class218.field3957.method513(-1020228848);
            int var301 = class218.field3957.method490(arg0 ^ 0xFFFF8001);
            class223 var302 = class213.method1379(var300, -10051);
            if (var302.field4105 != var301 || var301 == -1) {
                var302.field4096 = 0;
                var302.field4105 = var301;
                var302.field4044 = 0;
                class225.method1457(-54, var302);
            }
            class42.field779 = -1;
            return true;
        } else if (arg0 != 1) {
            return true;
        } else if (class42.field779 == 49) {
            class170.method1083(arg0 + 22254);
            class42.field779 = -1;
            return true;
        } else {
            class173.method1099(119, "T1 - " + class42.field779 + "," + class8.field157 + "," + class202.field3622 + " - " + class88.field1680, null);
            class37.method256((byte) 118);
            return true;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V")
    public final void method580(byte arg0) {
        if (arg0 > 49) {
            field1429++;
            this.field1430 = new class189(this.field1419);
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(IB)Z")
    public final boolean method372(int arg0, byte arg1) {
        field1425++;
        return arg1 == 30 ? this.method578(arg0, arg1 - 30).method388(this.field1417, 0, this) : true;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(B)V")
    public static final void method581(byte arg0) {
        field1405++;
        if (arg0 > -83) {
            return;
        }
        if (class46.field869 != null) {
            class46.field869.method1063(-86);
        }
        if (class39.field746 != null) {
            class39.field746.method1063(-98);
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lve;Lve;II)V")
    public class74(class225 arg0, class225 arg1, int arg2, int arg3) {
        this.field1419 = arg2;
        this.field1426 = arg0;
        this.field1413 = arg3;
        this.field1417 = arg1;
        this.field1430 = new class189(this.field1419);
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)Z")
    public final boolean method368(int arg0, int arg1) {
        if (arg0 != 20) {
            field1411 = null;
        }
        field1421++;
        return this.method578(arg1, 0).field976;
    }
}
