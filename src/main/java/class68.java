import java.util.Calendar;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class68 {

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1614 = new CRC32();

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field1620 = 0;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "Lfc;")
    public static class39 field1619 = class90.method774(" <col=ffffff>(X", -107);

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1622 = Calendar.getInstance();

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "Lfc;")
    public static class39 field1623 = class90.method774(" ", -123);

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "Lfc;")
    private static class39 field1627 = class90.method774("Loading config )2 ", -78);

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Lfc;")
    private static class39 field1624 = class90.method774("Hide", -119);

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "Lfc;")
    private static class39 field1628 = class90.method774("Loading game screen )2 ", -118);

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public static int field1626 = 0;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "Lfc;")
    public static class39 field1629 = field1627;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "Lfc;")
    public static class39 field1625 = field1624;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "Lfc;")
    public static class39 field1630 = field1628;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "Llf;")
    public static class82 field1621;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI[BI)Z", line = 21)
    public static final boolean method640(boolean arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0) {
            field1622 = null;
        }
        field1615++;
        class25 var4 = new class25(arg2);
        int var5 = -1;
        boolean var6 = true;
        label74: while (true) {
            int var7 = var4.method324(false);
            if (var7 == 0) {
                return var6;
            }
            var5 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class35 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var4.method324(false);
                                        if (var17 == 0) {
                                            continue label74;
                                        }
                                        var4.method322((byte) -50);
                                    }
                                    int var10 = var4.method324(false);
                                    if (var10 == 0) {
                                        continue label74;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 >> 6 & 0x3F;
                                    int var12 = var8 & 0x3F;
                                    var13 = var4.method322((byte) -50) >> 2;
                                    var14 = arg3 + var12;
                                    var15 = arg1 + var11;
                                } while (var15 <= 0);
                            } while (var14 <= 0);
                        } while (var15 >= 103);
                    } while (var14 >= 103);
                    var16 = class90.method776(var5, -125);
                } while (var13 == 22 && class74.field1705 && var16.field959 == 0 && var16.field953 != 1 && !var16.field946);
                if (!var16.method407(481)) {
                    var6 = false;
                    class120.field3126++;
                }
                var9 = true;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 107)
    public static final void method641(byte arg0) {
        if (class13.field343 == 1) {
            if (class34.field889 >= 6 && class34.field889 <= 106 && class26.field758 >= 467 && class26.field758 <= 499) {
                class94.field2203 = (class94.field2203 + 1) % 4;
                client.field561 = true;
                class43.field1156++;
                class128.field3242 = true;
                class79.field1794.method393((byte) -14, 11);
                class79.field1794.method326(class94.field2203, (byte) -46);
                class79.field1794.method326(class92.field2164, (byte) -73);
                class79.field1794.method326(class13.field349, (byte) -27);
            }
            if (class34.field889 >= 135 && class34.field889 <= 235 && class26.field758 >= 467 && class26.field758 <= 499) {
                class92.field2164 = (class92.field2164 + 1) % 3;
                class128.field3242 = true;
                client.field561 = true;
                class79.field1794.method393((byte) -14, 11);
                class43.field1156++;
                class79.field1794.method326(class94.field2203, (byte) -70);
                class79.field1794.method326(class92.field2164, (byte) -48);
                class79.field1794.method326(class13.field349, (byte) -40);
            }
            if (class34.field889 >= 273 && class34.field889 <= 373 && class26.field758 >= 467 && class26.field758 <= 499) {
                class128.field3242 = true;
                class43.field1156++;
                class13.field349 = (class13.field349 + 1) % 3;
                client.field561 = true;
                class79.field1794.method393((byte) -14, 11);
                class79.field1794.method326(class94.field2203, (byte) -86);
                class79.field1794.method326(class92.field2164, (byte) -107);
                class79.field1794.method326(class13.field349, (byte) -18);
            }
            if (class34.field889 >= 412 && class34.field889 <= 512 && class26.field758 >= 467 && class26.field758 <= 499) {
                if (class126.field3198 == -1) {
                    class10.method140(true);
                    if (class10.field278 != -1) {
                        class103.field2594 = false;
                        class60.field1466 = class126.field3198 = class10.field278;
                        class107.field2677 = class107.field2693;
                    }
                } else {
                    class28.method346(0, (byte) 81, class3.field100, class107.field2693);
                    if (class136.field3395 != null) {
                        class28.method346(0, (byte) 77, class136.field3395, class107.field2693);
                    }
                }
            }
        }
        int var1 = 21 % ((66 - arg0) / 42);
        field1609++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI)V", line = 185)
    public static final void method642(boolean arg0, int arg1) {
        field1611++;
        if (arg1 == -1 || !class2.field53[arg1]) {
            return;
        }
        class53.field1338.method842(arg1, (byte) 124);
        if (class65.field1571[arg1] == null) {
            return;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < class65.field1571[arg1].length; var3++) {
            if (class65.field1571[arg1][var3] != null) {
                if (class65.field1571[arg1][var3].field2452 == 2) {
                    var2 = false;
                } else {
                    class65.field1571[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class65.field1571[arg1] = null;
        }
        class2.field53[arg1] = false;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)Z", line = 257)
    public static final boolean method643(int arg0, int arg1, int arg2) {
        field1617++;
        if (arg2 == 0 && class31.field872 == arg0) {
            return true;
        }
        if (arg1 < 99) {
            method644(93, -70, -101, -125, 57);
        }
        if (arg2 == 1 && class150.field3715 == arg0) {
            return true;
        } else {
            return (arg2 == 2 || arg2 == 3) && class114.field2998 == arg0;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIII)I", line = 293)
    public static final int method644(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1613++;
        if (arg4 >= -36) {
            method647((byte) -57, -77, null);
        }
        int var5 = 65536 - class40.field1114[arg0 * 1024 / arg2] >> 1;
        return ((65536 - var5) * arg1 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 315)
    public static void method645(int arg0) {
        field1627 = null;
        field1629 = null;
        field1621 = null;
        field1622 = null;
        int var1 = -41 / ((-arg0 - 5) / 60);
        field1628 = null;
        field1619 = null;
        field1624 = null;
        field1630 = null;
        field1614 = null;
        field1625 = null;
        field1623 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)Lfc;", line = 338)
    public static final class39 method646(byte arg0, int arg1) {
        if (arg0 > -53) {
            return null;
        } else {
            field1616++;
            return class137.method1111(new class39[] { class86.method734(arg1 >> 24 & 0xFF, 2218), class61.field1488, class86.method734(arg1 >> 16 & 0xFF, 2218), class61.field1488, class86.method734(arg1 >> 8 & 0xFF, 2218), class61.field1488, class86.method734(arg1 & 0xFF, 2218) }, (byte) -115);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BILq;)V", line = 349)
    public static final void method647(byte arg0, int arg1, class111 arg2) {
        field1610++;
        class124.method1042(arg2.field2916, arg1, arg2.field2909, arg0 - 27339);
        if (arg0 != 126) {
            field1623 = null;
        }
    }
}
