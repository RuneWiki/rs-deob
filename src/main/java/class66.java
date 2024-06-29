import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class66 extends class117 {

    @OriginalMember(owner = "client!jd", name = "S", descriptor = "Lie;")
    public class61 field1713 = new class61();

    @OriginalMember(owner = "client!jd", name = "fb", descriptor = "Lqb;")
    public class113 field1726 = new class113();

    @OriginalMember(owner = "client!jd", name = "I", descriptor = "Lqe;")
    private class116 field1703;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "Lkd;")
    public static class73 field1701 = class126.method1070((byte) -66, "An:");

    @OriginalMember(owner = "client!jd", name = "P", descriptor = "[I")
    public static int[] field1710 = new int[100];

    @OriginalMember(owner = "client!jd", name = "R", descriptor = "Lkd;")
    public static class73 field1712 = class126.method1070((byte) -66, "backbase1");

    @OriginalMember(owner = "client!jd", name = "X", descriptor = "Lkd;")
    private static class73 field1718 = class126.method1070((byte) -66, "Login");

    @OriginalMember(owner = "client!jd", name = "N", descriptor = "I")
    public static int field1708 = 0;

    @OriginalMember(owner = "client!jd", name = "ab", descriptor = "Lkd;")
    private static class73 field1721 = class126.method1070((byte) -66, "button near the top of that page)3");

    @OriginalMember(owner = "client!jd", name = "Q", descriptor = "Lkd;")
    public static class73 field1711 = field1718;

    @OriginalMember(owner = "client!jd", name = "Y", descriptor = "Lkd;")
    public static class73 field1719 = class126.method1070((byte) -66, "Privater Chat");

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "[Lkd;")
    public static class73[] field1715 = new class73[20];

    @OriginalMember(owner = "client!jd", name = "Z", descriptor = "I")
    public static int field1720 = 0;

    @OriginalMember(owner = "client!jd", name = "O", descriptor = "Lkd;")
    public static class73 field1709 = field1721;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!jd", name = "K", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!jd", name = "L", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!jd", name = "M", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!jd", name = "W", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!jd", name = "bb", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!jd", name = "db", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!jd", name = "eb", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!jd", name = "gb", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!jd", name = "cb", descriptor = "Lq;")
    public static class111 field1723;

    @OriginalMember(owner = "client!jd", name = "J", descriptor = "Lqc;")
    public static class114 field1704;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public final void method470(int arg0) {
        this.field1726.method470(arg0);
        field1717++;
        for (class99 var2 = (class99) this.field1713.method514((byte) -79); var2 != null; var2 = (class99) this.field1713.method517(-70)) {
            if (!this.field1703.method994(false, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field2476 >= var3) {
                        this.method550(var2, var3, (byte) 87);
                        var2.field2476 -= var3;
                        break;
                    }
                    this.method550(var2, var2.field2476, (byte) 55);
                    var3 -= var2.field2476;
                } while (!this.field1703.method993(-28666, var2, 0, null, var3));
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "()Lqf;")
    public final class117 method468() {
        field1707++;
        class99 var1 = (class99) this.field1713.method514((byte) -79);
        if (var1 == null) {
            return null;
        } else if (var1.field2464 == null) {
            return this.method454();
        } else {
            return var1.field2464;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "()I")
    public final int method447() {
        field1714++;
        return 0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([III)V")
    public final void method463(int[] arg0, int arg1, int arg2) {
        this.field1726.method463(arg0, arg1, arg2);
        field1706++;
        for (class99 var4 = (class99) this.field1713.method514((byte) -79); var4 != null; var4 = (class99) this.field1713.method517(-96)) {
            if (!this.field1703.method994(false, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field2476 >= var6) {
                        this.method544(arg0, 18, var5, var4, var5 + var6, var6);
                        var4.field2476 -= var6;
                        break;
                    }
                    this.method544(arg0, 18, var5, var4, var5 + var6, var4.field2476);
                    var5 += var4.field2476;
                    var6 -= var4.field2476;
                } while (!this.field1703.method993(-28666, var4, var5, arg0, var6));
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([IIILob;II)V")
    private final void method544(int[] arg0, int arg1, int arg2, class99 arg3, int arg4, int arg5) {
        if ((this.field1703.field2916[arg3.field2471] & 0x4) != 0 && arg3.field2483 < 0) {
            int var7 = this.field1703.field2954[arg3.field2471] / class48.field1282;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field2478) / var7;
                if (var8 > arg5) {
                    arg3.field2478 += arg5 * var7;
                    break;
                }
                arg5 -= var8;
                arg3.field2464.method463(arg0, arg2, var8);
                arg3.field2478 += var7 * var8 - 1048576;
                arg2 += var8;
                class56 var9 = arg3.field2464;
                int var10 = class48.field1282 / 100;
                int var11 = 262144 / var7;
                if (var11 < var10) {
                    var10 = var11;
                }
                if (this.field1703.field2945[arg3.field2471] == 0) {
                    arg3.field2464 = class56.method451(arg3.field2468, var9.method486(), var9.method474(), var9.method461());
                } else {
                    arg3.field2464 = class56.method451(arg3.field2468, var9.method486(), 0, var9.method461());
                    this.field1703.method990(arg3.field2485.field2703[arg3.field2465] < 0, 79, arg3);
                    arg3.field2464.method457(var10, var9.method474());
                }
                if (arg3.field2485.field2703[arg3.field2465] < 0) {
                    arg3.field2464.method455(-1);
                }
                var9.method487(var10);
                var9.method463(arg0, arg2, arg4 - arg2);
                if (var9.method488()) {
                    this.field1726.method922(var9);
                }
            }
        }
        field1705++;
        arg3.field2464.method463(arg0, arg2, arg5);
        if (arg1 != 18) {
            field1712 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
    public static void method545(int arg0) {
        field1704 = null;
        int var1 = -34 % ((-arg0 - 65) / 58);
        field1718 = null;
        field1701 = null;
        field1712 = null;
        field1715 = null;
        field1721 = null;
        field1709 = null;
        field1710 = null;
        field1711 = null;
        field1723 = null;
        field1719 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILqc;IIIIB)V")
    public static final void method546(int arg0, int arg1, class114 arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field1700++;
        if (arg3 >= 0 && arg3 < 104 && arg5 >= 0 && arg5 < 104) {
            class55.field1482[arg4][arg3][arg5] = 0;
            while (true) {
                int var8 = arg2.method957((byte) 106);
                if (var8 == 0) {
                    if (arg4 == 0) {
                        class55.field1484[0][arg3][arg5] = -class9.method93(arg3 + arg1 + 932731, arg0 + arg5 + 556238, false) * 8;
                    } else {
                        class55.field1484[arg4][arg3][arg5] = class55.field1484[arg4 - 1][arg3][arg5] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg2.method957((byte) 109);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg4 == 0) {
                        class55.field1484[0][arg3][arg5] = -var9 * 8;
                    } else {
                        class55.field1484[arg4][arg3][arg5] = class55.field1484[arg4 - 1][arg3][arg5] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class86.field2163[arg4][arg3][arg5] = arg2.method966((byte) 91);
                    class1.field100[arg4][arg3][arg5] = (byte) ((var8 - 2) / 4);
                    class116.field2958[arg4][arg3][arg5] = (byte) class149.method1189(arg6 + var8 - 2, 3);
                } else if (var8 <= 81) {
                    class55.field1482[arg4][arg3][arg5] = (byte) (var8 - 49);
                } else {
                    class12.field400[arg4][arg3][arg5] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg2.method957((byte) 122);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg2.method957((byte) 12);
                    break;
                }
                if (var10 <= 49) {
                    arg2.method957((byte) 100);
                }
            }
        }
        if (arg7 != 4) {
            field1710 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IJ)V")
    public static final void method547(int arg0, long arg1) {
        field1702++;
        try {
            if (arg0 != -105) {
                method548(null, -58);
            }
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "()Lqf;")
    public final class117 method454() {
        field1716++;
        class99 var1;
        do {
            var1 = (class99) this.field1713.method517(-52);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2464 == null);
        return var1.field2464;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lee;I)V")
    public static final void method548(class34 arg0, int arg1) {
        field1725++;
        if (class105.field2615 == 1) {
            short var2 = 280;
            if (class103.field2570 >= var2 && class103.field2570 <= var2 + 14 && class42.field1134 >= 4 && class42.field1134 <= 18) {
                class37.method298(true, 0, 0);
                return;
            }
            if (class103.field2570 >= var2 + 15 && var2 + 80 >= class103.field2570 && class42.field1134 >= 4 && class42.field1134 <= 18) {
                class37.method298(true, 0, 1);
                return;
            }
            short var3 = 390;
            if (var3 <= class103.field2570 && var3 + 14 >= class103.field2570 && class42.field1134 >= 4 && class42.field1134 <= 18) {
                class37.method298(true, 1, 0);
                return;
            }
            if (class103.field2570 >= var3 + 15 && var3 + 80 >= class103.field2570 && class42.field1134 >= 4 && class42.field1134 <= 18) {
                class37.method298(true, 1, 1);
                return;
            }
            short var4 = 500;
            if (var4 <= class103.field2570 && class103.field2570 <= var4 + 14 && class42.field1134 >= 4 && class42.field1134 <= 18) {
                class37.method298(true, 2, 0);
                return;
            }
            if (var4 + 15 <= class103.field2570 && class103.field2570 <= var4 + 80 && class42.field1134 >= 4 && class42.field1134 <= 18) {
                class37.method298(true, 2, 1);
                return;
            }
            short var5 = 610;
            if (class103.field2570 >= var5 && class103.field2570 <= var5 + 14 && class42.field1134 >= 4 && class42.field1134 <= 18) {
                class37.method298(true, 3, 0);
                return;
            }
            if (class103.field2570 >= var5 + 15 && class103.field2570 <= var5 + 80 && class42.field1134 >= 4 && class42.field1134 <= 18) {
                class37.method298(true, 3, 1);
                return;
            }
            if (class103.field2570 >= 708 && class42.field1134 >= 4 && class103.field2570 <= 758 && class42.field1134 <= 20) {
                class34.field945 = false;
                class77.field1964.method841(0, 0);
                class111.field2760.method841(382, 0);
                class82.field2061.method208(382 - class82.field2061.field772 / 2, 18);
                return;
            }
            if (class114.field2875 != -1) {
                class151 var6 = class99.field2500[class114.field2875];
                if (class50.field1362 == var6.field3734) {
                    byte[] var7 = class32.method258(-97, new class73[] { var6.field3731, class81.field2049 }).method612(4);
                    class26.field753 = new String(var7, 0, var7.length);
                    class34.field945 = false;
                    if (class50.field1353 != 0) {
                        class50.field1353 = 0;
                        class22.field630 = 443;
                        class81.field2047 = 43594;
                        class32.field891 = 43594;
                    }
                    class115.field2906 = var6.field3738;
                    class77.field1964.method841(0, 0);
                    class111.field2760.method841(382, 0);
                    class82.field2061.method208(382 - class82.field2061.field772 / 2, 18);
                    return;
                }
                class73 var8 = class32.method258(-85, new class73[] { class51.field1380, var6.field3731, class81.field2049, class9.field290, class64.field1688, class78.method676(class77.field1971 ? 1 : 0, -84), class120.field3061, class78.method676(class109.field2673, -6), class111.field2716, class78.method676(class92.field2375, -29) });
                try {
                    arg0.getAppletContext().showDocument(var8.method614(123), "_self");
                } catch (Exception var10) {
                }
            }
        }
        int var9 = -45 / ((arg1 - 71) / 54);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lkd;ILq;ILkd;IZ)V")
    public static final void method549(class73 arg0, int arg1, class111 arg2, int arg3, class73 arg4, int arg5, boolean arg6) {
        int var7 = arg2.method905(arg0, (byte) -72);
        int var8 = arg2.method902(arg3 ^ arg3, var7, arg4);
        field1699++;
        class114.method941(arg1, arg6, arg2, var8, var7, 60, arg5);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lob;IB)V")
    private final void method550(class99 arg0, int arg1, byte arg2) {
        field1722++;
        if ((this.field1703.field2916[arg0.field2471] & 0x4) != 0 && arg0.field2483 < 0) {
            int var4 = this.field1703.field2954[arg0.field2471] / class48.field1282;
            int var5 = (var4 + 1048575 - arg0.field2478) / var4;
            arg0.field2478 = arg1 * var4 + arg0.field2478 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field1703.field2945[arg0.field2471] == 0) {
                    arg0.field2464 = class56.method451(arg0.field2468, arg0.field2464.method486(), arg0.field2464.method474(), arg0.field2464.method461());
                } else {
                    arg0.field2464 = class56.method451(arg0.field2468, arg0.field2464.method486(), 0, arg0.field2464.method461());
                    this.field1703.method990(arg0.field2485.field2703[arg0.field2465] < 0, 84, arg0);
                }
                if (arg0.field2485.field2703[arg0.field2465] < 0) {
                    arg0.field2464.method455(-1);
                }
                arg1 = arg0.field2478 / var4;
            }
        }
        arg0.field2464.method470(arg1);
        int var6 = -49 / ((arg2 + 11) / 57);
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lqe;)V")
    public class66(class116 arg0) {
        this.field1703 = arg0;
    }
}
