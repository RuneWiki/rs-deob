import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class95 {

    @OriginalMember(owner = "client!la", name = "q", descriptor = "Laf;")
    private class68 field1882 = new class68();

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    private int field1877;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    private int field1871;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Lta;")
    private class255 field1866;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field1878 = 0;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Lcc;")
    public static class209 field1869 = method669(95, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "Lwj;")
    public static class6 field1876;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V")
    public final void method662(int arg0, int arg1) {
        field1868++;
        if (arg0 != 32768 || class266.field4774 == null) {
            return;
        }
        for (class265 var3 = (class265) this.field1882.method503(19852); var3 != null; var3 = (class265) this.field1882.method504(64)) {
            if (var3.method934(-1)) {
                if (var3.method935(116) == null) {
                    var3.method269(-214950896);
                    var3.method1796(-87);
                    this.field1877++;
                }
            } else if ((++var3.field4681) > ((long) arg1)) {
                class265 var4 = class266.field4774.method402(-1, var3);
                this.field1866.method1762(var4, var3.field596, (byte) 73);
                class243.method1692(var4, var3, 0);
                var3.method269(arg0 ^ 0xF3309C10);
                var3.method1796(arg0 ^ 0xFFFF7FD3);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static final void method663(byte arg0) {
        field1883++;
        while (client.field2818.method291(class112.field2253, arg0 - 31417) >= 27) {
            int var1 = client.field2818.method289(arg0 ^ 0xFFFFFFAD, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class60.field1207[var1] == null) {
                var2 = true;
                class60.field1207[var1] = new class163();
            }
            class163 var3 = class60.field1207[var1];
            class249.field4492[class219.field3996++] = var1;
            var3.field1512 = class163.field2968;
            if (var3.field2969 != null && var3.field2969.method1644((byte) -77)) {
                class7.method74(-90, var3);
            }
            int var4 = client.field2818.method289(8, 5);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = client.field2818.method289(8, 5);
            int var6 = class161.field2918[client.field2818.method289(8, 3)];
            if (var2) {
                var3.field1570 = var3.field1504 = var6;
            }
            int var7 = client.field2818.method289(8, 1);
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var7 == 1) {
                class211.field3840[class244.field4423++] = var1;
            }
            var3.method1127(-112, class78.method549(71, client.field2818.method289(8, 14)));
            int var8 = client.field2818.method289(8, 1);
            var3.method571((byte) 14, var3.field2969.field4277);
            var3.field1544 = var3.field2969.field4236;
            var3.field1520 = var3.field2969.field4296;
            var3.field1569 = var3.field2969.field4235;
            var3.field1543 = var3.field2969.field4279;
            var3.field1511 = var3.field2969.field4259;
            var3.field1561 = var3.field2969.field4293;
            var3.field1516 = var3.field2969.field4263;
            var3.field1549 = var3.field2969.field4264;
            if (var3.field1516 == 0) {
                var3.field1504 = 0;
            }
            var3.method574(class223.field4069.field1567[0] + var5, var3.method577((byte) 103), var8 == 1, (byte) 122, class223.field4069.field1548[0] + var4);
            if (var3.field2969.method1644((byte) -31)) {
                class114.method810((class218) null, var3.field1567[0], 0, class99.field1937, (byte) 105, var3, var3.field1548[0], (class108) null);
            }
        }
        client.field2818.method297(true);
        if (arg0 != -91) {
            method668(-42, 13, (class49) null);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public final void method664(int arg0) {
        field1872++;
        for (class265 var2 = (class265) this.field1882.method503(19852); var2 != null; var2 = (class265) this.field1882.method504(64)) {
            if (var2.method934(-1)) {
                var2.method269(-214950896);
                var2.method1796(-47);
                this.field1877++;
            }
        }
        int var3 = -118 % ((49 - arg0) / 61);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
    public final void method665(int arg0) {
        if (arg0 != 1) {
            method669(5, (String) null);
        }
        field1881++;
        this.field1882.method506((byte) -92);
        this.field1866.method1757(-29914);
        this.field1877 = this.field1871;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)I")
    public static final int method666(int arg0, int arg1, int arg2) {
        int var3 = -35 / ((arg0 + 60) / 51);
        field1867++;
        int var4 = arg2 >>> 31;
        return (arg2 + var4) / arg1 - var4;
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V")
    public static void method667(int arg0) {
        if (arg0 <= -99) {
            field1876 = null;
            field1869 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILsj;)Lal;")
    public static final class231 method668(int arg0, int arg1, class49 arg2) {
        if (arg1 < 103) {
            return null;
        } else {
            field1875++;
            return class280.method1891(false, arg2, arg0) ? class178.method1231(-102) : null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;)Lcc;")
    public static final class209 method669(int arg0, String arg1) {
        field1874++;
        if (arg0 < 80) {
            field1878 = -122;
        }
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        class209 var4 = new class209();
        var4.field3786 = new byte[var3];
        int var5 = 0;
        while (var5 < var3) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field3786[var4.field3811++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field3786[var4.field3811++] = (byte) var6;
            }
        }
        var4.method1460((byte) 104);
        return var4.method1475((byte) -81);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
    public final Object method670(byte arg0, long arg1) {
        field1884++;
        class265 var4 = (class265) this.field1866.method1755(arg1, (byte) -86);
        if (var4 == null) {
            return null;
        }
        if (arg0 >= -43) {
            this.field1866 = null;
        }
        Object var5 = var4.method935(61);
        if (var5 == null) {
            var4.method269(-214950896);
            var4.method1796(-44);
            this.field1877++;
            return null;
        }
        if (var4.method934(-1)) {
            class193 var6 = new class193(var5);
            this.field1866.method1762(var6, var4.field596, (byte) 73);
            this.field1882.method501(var6, true);
            var6.field4681 = 0L;
            var4.method269(-214950896);
            var4.method1796(-80);
        } else {
            this.field1882.method501(var4, true);
            var4.field4681 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZI)Luk;")
    public static final class97 method671(int arg0, int arg1, boolean arg2, int arg3) {
        field1879++;
        class97 var4 = new class97();
        var4.field1888 = arg1;
        var4.field1895 = arg3;
        class114.field2288.method1762(var4, (long) arg0, (byte) 73);
        if (arg2) {
            method667(-71);
        }
        class69.method512(arg3, 0);
        class42 var5 = class247.method1719(arg0, -8667);
        if (var5 != null) {
            class126.method907(var5, 0);
        }
        if (class86.field1699 != null) {
            class126.method907(class86.field1699, 0);
            class86.field1699 = null;
        }
        int var6 = class98.field1912;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class108.method783((byte) -85, class40.field680[var7])) {
                class264.method1811((byte) 118, var7);
            }
        }
        if (class98.field1912 == 1) {
            class244.field4418 = false;
            class21.method185(class186.field3347, class117.field2349, 0, class111.field2245, class172.field3149);
        } else {
            class21.method185(class186.field3347, class117.field2349, 0, class111.field2245, class172.field3149);
            int var8 = class66.field1269.method1298(class11.field212);
            for (int var9 = 0; var9 < class98.field1912; var9++) {
                int var10 = class66.field1269.method1298(class99.method690(-93, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class117.field2349 = var8 + 8;
            class172.field3149 = class98.field1912 * 15 + 22;
        }
        if (var5 != null) {
            class224.method1580(-19451, false, var5);
        }
        class273.method1860(arg3, -125);
        if (class149.field2727 != -1) {
            class20.method177(true, class149.field2727, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V")
    public static final void method672(int arg0) {
        field1870++;
        if (class192.method1319((byte) -73) != 2) {
            return;
        }
        byte var1 = (byte) (class5.field73 - 4 & 0xFF);
        int var2 = class5.field73 % 104;
        if (arg0 != -2885) {
            field1869 = null;
        }
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class272.field4820[var3][var2][var16] = var1;
            }
        }
        if (class99.field1937 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class88.field1747[var4] = -1000000;
            class21.field402[var4] = 1000000;
            class80.field1490[var4] = 0;
            class118.field2366[var4] = 1000000;
            class191.field3457[var4] = 0;
        }
        if (class16.field334 != 1) {
            int var5 = class94.method661(class103.field1990, arg0 ^ 0xFFFFBF47, class99.field1937, class60.field1213);
            if ((var5 - class183.field3312) < 800 && (class285.field5023[class99.field1937][class60.field1213 >> 7][class103.field1990 >> 7] & 0x4) != 0) {
                class166.method1147(33, false, 1, class106.field2089, class60.field1213 >> 7, class103.field1990 >> 7);
                return;
            }
            return;
        }
        if ((class285.field5023[class99.field1937][class223.field4069.field1571 >> 7][class223.field4069.field1534 >> 7] & 0x4) != 0) {
            class166.method1147(arg0 + 2758, false, 0, class106.field2089, class223.field4069.field1571 >> 7, class223.field4069.field1534 >> 7);
        }
        if (class182.field3304 >= 310) {
            return;
        }
        int var6 = class103.field1990 >> 7;
        int var7 = class223.field4069.field1571 >> 7;
        int var8 = class60.field1213 >> 7;
        int var9;
        if (var7 > var8) {
            var9 = var7 - var8;
        } else {
            var9 = var8 - var7;
        }
        int var10 = class223.field4069.field1534 >> 7;
        int var11;
        if (var6 >= var10) {
            var11 = var6 - var10;
        } else {
            var11 = var10 - var6;
        }
        if (var11 >= var9) {
            int var12 = var9 * 65536 / var11;
            int var13 = 32768;
            while (var6 != var10) {
                if (var6 < var10) {
                    var6++;
                } else if (var6 > var10) {
                    var6--;
                }
                if ((class285.field5023[class99.field1937][var8][var6] & 0x4) != 0) {
                    class166.method1147(arg0 + 2772, false, 1, class106.field2089, var8, var6);
                    return;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    if (var7 > var8) {
                        var8++;
                    } else if (var7 < var8) {
                        var8--;
                    }
                    var13 -= 65536;
                    if ((class285.field5023[class99.field1937][var8][var6] & 0x4) != 0) {
                        class166.method1147(arg0 ^ 0xB3F, false, 1, class106.field2089, var8, var6);
                        return;
                    }
                }
            }
            return;
        }
        int var14 = var11 * 65536 / var9;
        int var15 = 32768;
        while (var7 != var8) {
            if (var8 < var7) {
                var8++;
            } else if (var7 < var8) {
                var8--;
            }
            if ((class285.field5023[class99.field1937][var8][var6] & 0x4) != 0) {
                class166.method1147(-110, false, 1, class106.field2089, var8, var6);
                return;
            }
            var15 += var14;
            if (var15 >= 65536) {
                var15 -= 65536;
                if (var6 < var10) {
                    var6++;
                } else if (var10 < var6) {
                    var6--;
                }
                if ((class285.field5023[class99.field1937][var8][var6] & 0x4) != 0) {
                    class166.method1147(arg0 + 2757, false, 1, class106.field2089, var8, var6);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(JILjava/lang/Object;)V")
    public final void method673(long arg0, int arg1, Object arg2) {
        field1880++;
        this.method674(false, arg0);
        if (this.field1877 == 0) {
            class265 var5 = (class265) this.field1882.method500(31480);
            var5.method269(arg1 ^ 0xCCFF031);
            var5.method1796(-85);
        } else {
            this.field1877--;
        }
        if (arg1 != -5087) {
            this.method670((byte) 70, -94L);
        }
        class193 var6 = new class193(arg2);
        this.field1866.method1762(var6, arg0, (byte) 73);
        this.field1882.method501(var6, true);
        var6.field4681 = 0L;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZJ)V")
    public final void method674(boolean arg0, long arg1) {
        field1873++;
        if (arg0) {
            this.method670((byte) -3, 105L);
        }
        class265 var4 = (class265) this.field1866.method1755(arg1, (byte) -103);
        if (var4 != null) {
            var4.method269(-214950896);
            var4.method1796(-43);
            this.field1877++;
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(I)V")
    public class95(int arg0) {
        this.field1877 = arg0;
        int var2 = 1;
        this.field1871 = arg0;
        while ((var2 + var2) < arg0) {
            var2 += var2;
        }
        this.field1866 = new class255(var2);
    }
}
