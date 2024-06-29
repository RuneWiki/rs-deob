import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class110 {

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Z")
    public boolean field1484 = true;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public int field1495 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    private int field1501 = -1;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public int field1502 = -1;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    private int field1505 = -1;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "Z")
    public boolean field1489 = false;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "I")
    public int field1517 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    private int field1486 = -1;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "[Ljava/lang/String;")
    public String[] field1510 = new String[5];

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    public int field1511 = -1;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    private int field1509 = -1;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "Z")
    public boolean field1522 = true;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "Z")
    public boolean field1493 = true;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "I")
    public int field1520 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "I")
    public int field1527 = -1;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public int field1490 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    private int field1524 = -1;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "I")
    public int field1514 = 0;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "I")
    public int field1530 = -1;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public int field1492;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    private int field1494;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    private int field1503;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    private int field1504;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public int field1506;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    private int field1508;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    public int field1516;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "I")
    public int field1519;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "I")
    public int field1523;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    public int field1525;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "Ldq;")
    private class90 field1498;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Ljava/lang/String;")
    public String field1487;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "Ljava/lang/String;")
    public String field1515;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "[I")
    public int[] field1500;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field1488;

    static {
        new class409("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lat;I)V", line = 4)
    public final void method777(class256 arg0, int arg1) {
        field1496++;
        if (arg1 != 29021) {
            return;
        }
        while (true) {
            int var3 = arg0.method1738((byte) 52);
            if (var3 == 0) {
                return;
            }
            this.method786(arg0, var3, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BZ)V", line = 27)
    public static final void method778(byte arg0, boolean arg1) {
        field1518++;
        class319.field4713 = 0;
        class13.field223 = 0;
        class103.method699(20276);
        if (arg0 > -15) {
            return;
        }
        class166.method1095(false, arg1);
        class441.method2706(-2301);
        for (int var2 = 0; var2 < class13.field223; var2++) {
            int var4 = class169.field2212[var2];
            if (class388.field5665 != class364.field5260[var4].field720) {
                if (class364.field5260[var4].field369.method2142(0)) {
                    class373.method2371(class364.field5260[var4], (byte) -60);
                }
                class364.field5260[var4].method273((class327) null, -27397);
                class364.field5260[var4] = null;
            }
        }
        if (class35.field496 != class22.field306.field3762) {
            throw new RuntimeException("gnp1 pos:" + class22.field306.field3762 + " psize:" + class35.field496);
        }
        for (int var3 = 0; var3 < class14.field231; var3++) {
            if (class364.field5260[class301.field4380[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class14.field231);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 89)
    public final void method779(int arg0) {
        if (arg0 != -6) {
            return;
        }
        if (this.field1500 != null) {
            for (int var2 = 0; var2 < this.field1500.length; var2 += 2) {
                if (this.field1500[var2] < this.field1495) {
                    this.field1495 = this.field1500[var2];
                } else if (this.field1500[var2] > this.field1520) {
                    this.field1520 = this.field1500[var2];
                }
                if (this.field1490 > this.field1500[var2 + 1]) {
                    this.field1490 = this.field1500[var2 + 1];
                } else if (this.field1517 < this.field1500[var2 + 1]) {
                    this.field1517 = this.field1500[var2 + 1];
                }
            }
        }
        field1521++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZIZII)V", line = 130)
    public static final void method780(boolean arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg3 != 19381) {
            field1488 = null;
        }
        class146.method1014(arg4, class223.field3277.length - 1, arg2, arg0, 0, arg1, true);
        field1485++;
        class241.field3581 = null;
        class388.field5681 = 0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZBLfp;)Lae;", line = 145)
    public final class285 method781(boolean arg0, byte arg1, class9 arg2) {
        field1526++;
        int var4 = arg0 ? this.field1511 : this.field1502;
        int var5 = arg2.field120 << 29 | var4;
        class285 var6 = (class285) class318.field4665.method2310((byte) -125, (long) var5);
        int var7 = -116 / ((arg1 - 11) / 32);
        if (var6 != null) {
            return var6;
        } else if (class241.field3580.method708(var4, (byte) -89)) {
            class144 var8 = class144.method991(class241.field3580, var4, 0);
            if (var8 != null) {
                var6 = arg2.method100(var8, true);
                class318.field4665.method2299(true, var6, (long) var5);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lct;Lct;I)V", line = 176)
    public static final void method782(class104 arg0, class104 arg1, int arg2) {
        class328.field4891 = arg0;
        field1528++;
        class57.field693 = arg1;
        class328.field4891.method734(84, 3);
        if (arg2 != 0) {
            method790(-23);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BII)I", line = 195)
    public final int method783(byte arg0, int arg1, int arg2) {
        field1513++;
        if (this.field1498 == null) {
            return arg1;
        }
        class13 var4 = (class13) this.field1498.method609((long) arg2, 81);
        if (arg0 < 122) {
            this.field1503 = 37;
        }
        return var4 == null ? arg1 : var4.field214;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lfp;B)Lae;", line = 218)
    public final class285 method784(class9 arg0, byte arg1) {
        field1491++;
        if (arg1 != -111) {
            return null;
        }
        class285 var3 = (class285) class318.field4665.method2310((byte) -128, (long) (arg0.field120 << 29 | this.field1509 | 0x20000));
        if (var3 != null) {
            return var3;
        }
        class241.field3580.method708(this.field1509, (byte) -99);
        class144 var4 = class144.method991(class241.field3580, this.field1509, 0);
        if (var4 != null) {
            var3 = arg0.method100(var4, true);
            class318.field4665.method2299(true, var3, (long) (this.field1509 | 0x20000 | arg0.field120 << 29));
        }
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lct;I)V", line = 252)
    public static final void method785(class104 arg0, int arg1) {
        class343.field5046 = arg0;
        field1507++;
        class180.field2553 = class343.field5046.method734(104, arg1);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lat;IB)V", line = 281)
    private final void method786(class256 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field1502 = arg0.method1767(1930493576);
        } else if (arg1 == 2) {
            this.field1511 = arg0.method1767(1930493576);
        } else if (arg1 == 3) {
            this.field1487 = arg0.method1715(true);
        } else if (arg1 == 4) {
            this.field1525 = arg0.method1725((byte) 0);
        } else if (arg1 == 5) {
            this.field1527 = arg0.method1725((byte) 0);
        } else if (arg1 == 6) {
            this.field1514 = arg0.method1738((byte) 105);
        } else if (arg1 == 7) {
            int var12 = arg0.method1738((byte) 111);
            if ((var12 & 0x2) == 2) {
                this.field1489 = true;
            }
            if ((var12 & 0x1) == 0) {
                this.field1522 = false;
            }
        } else if (arg1 == 8) {
            this.field1493 = arg0.method1738((byte) -107) == 1;
        } else if (arg1 == 9) {
            this.field1524 = arg0.method1767(1930493576);
            if (this.field1524 == 65535) {
                this.field1524 = -1;
            }
            this.field1505 = arg0.method1767(1930493576);
            if (this.field1505 == 65535) {
                this.field1505 = -1;
            }
            this.field1503 = arg0.method1746(20972);
            this.field1508 = arg0.method1746(20972);
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1510[arg1 - 10] = arg0.method1715(true);
        } else if (arg1 == 15) {
            int var10 = arg0.method1738((byte) -31);
            this.field1500 = new int[var10 * 2];
            for (int var11 = 0; var11 < var10 * 2; var11++) {
                this.field1500[var11] = arg0.method1747((byte) 12);
            }
            this.field1523 = arg0.method1746(20972);
            this.field1492 = arg0.method1746(20972);
        } else if (arg1 == 16) {
            this.field1484 = false;
        } else if (arg1 == 17) {
            this.field1515 = arg0.method1715(true);
        } else if (arg1 == 18) {
            this.field1509 = arg0.method1767(1930493576);
        } else if (arg1 == 19) {
            this.field1530 = arg0.method1767(1930493576);
        } else if (arg1 == 20) {
            this.field1501 = arg0.method1767(1930493576);
            if (this.field1501 == 65535) {
                this.field1501 = -1;
            }
            this.field1486 = arg0.method1767(1930493576);
            if (this.field1486 == 65535) {
                this.field1486 = -1;
            }
            this.field1504 = arg0.method1746(20972);
            this.field1494 = arg0.method1746(20972);
        } else if (arg1 == 21) {
            this.field1519 = arg0.method1746(20972);
        } else if (arg1 == 22) {
            this.field1516 = arg0.method1746(20972);
        } else if (arg1 == 249) {
            int var4 = arg0.method1738((byte) -105);
            if (this.field1498 == null) {
                int var5 = class289.method1938((byte) 103, var4);
                this.field1498 = new class90(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1738((byte) -59) == 1;
                int var8 = arg0.method1725((byte) 0);
                class264 var9;
                if (var7) {
                    var9 = new class82(arg0.method1715(true));
                } else {
                    var9 = new class13(arg0.method1746(20972));
                }
                this.field1498.method606(1, var9, (long) var8);
            }
        }
        field1512++;
        if (arg2 > -115) {
            this.field1495 = -64;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V", line = 470)
    public static final void method787(int arg0) {
        field1497++;
        try {
            if (class82.field1008 == 1) {
                int var1 = class456.field6750.method2773(0);
                if (var1 > 0 && class456.field6750.method2787(78)) {
                    int var2 = var1 - class182.field2563;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class456.field6750.method2764(9411, var2);
                    return;
                }
                class456.field6750.method2772(-78);
                class456.field6750.method2786(122);
                class270.field4005 = null;
                class195.field2752 = null;
                if (class286.field4209 == null) {
                    class82.field1008 = 0;
                } else {
                    class82.field1008 = 2;
                }
            }
            int var3 = -90 % ((50 - arg0) / 51);
        } catch (Exception var5) {
            var5.printStackTrace();
            class456.field6750.method2772(-95);
            class82.field1008 = 0;
            class195.field2752 = null;
            class286.field4209 = null;
            class270.field4005 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)Z", line = 515)
    public final boolean method788(byte arg0) {
        if (arg0 != -123) {
            return false;
        }
        field1529++;
        if (this.field1505 == -1 && this.field1524 == -1) {
            return true;
        }
        boolean var2 = false;
        int var3;
        if (this.field1505 == -1) {
            var3 = class294.method1954(arg0 + 126, this.field1524);
        } else {
            var3 = class31.field426[this.field1505];
        }
        if (var3 < this.field1503 || this.field1508 < var3) {
            return false;
        } else if (this.field1486 == -1 && this.field1501 == -1) {
            return true;
        } else {
            boolean var4 = false;
            int var5;
            if (this.field1486 == -1) {
                var5 = class294.method1954(arg0 ^ 0xFFFFFF86, this.field1501);
            } else {
                var5 = class31.field426[this.field1486];
            }
            return this.field1504 <= var5 && this.field1494 >= var5;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;", line = 570)
    public final String method789(String arg0, int arg1, int arg2) {
        if (arg2 < 108) {
            return null;
        }
        field1499++;
        if (this.field1498 == null) {
            return arg0;
        } else {
            class82 var4 = (class82) this.field1498.method609((long) arg1, 111);
            return var4 == null ? arg0 : var4.field1011;
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V", line = 594)
    public static void method790(int arg0) {
        field1488 = null;
        if (arg0 < 3) {
            field1488 = null;
        }
    }
}
