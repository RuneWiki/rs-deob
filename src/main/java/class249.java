import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class249 extends class213 {

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "Ljava/lang/String;")
    private String field3625 = "null";

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "[Lte;")
    public static class261[] field3618 = new class261[14];

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "Ljava/lang/String;")
    public static String field3623 = "M";

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "I")
    public static int field3614 = 0;

    @OriginalMember(owner = "client!cj", name = "X", descriptor = "J")
    public static long field3638 = 0L;

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "C")
    public char field3615;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "C")
    public char field3626;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
    private int field3617;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "Lmg;")
    public static class288 field3631;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "Lic;")
    private class329 field3630;

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "Lic;")
    public class329 field3637;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)I", line = 7)
    public final int method1738(int arg0, int arg1) {
        field3633++;
        if (this.field3637 == null) {
            return this.field3617;
        }
        class7 var3 = (class7) this.field3637.method2279((long) arg1, -127);
        if (var3 == null) {
            return this.field3617;
        } else if (arg0 == 0) {
            return var3.field67;
        } else {
            return 46;
        }
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V", line = 31)
    private final void method1739(int arg0) {
        this.field3630 = new class329(this.field3637.method2274(0));
        if (arg0 != 14) {
            return;
        }
        for (class29 var2 = (class29) this.field3637.method2277(arg0 ^ 0x33E2); var2 != null; var2 = (class29) this.field3637.method2278((byte) -116)) {
            class115 var3 = new class115(var2.field332, (int) var2.field304);
            this.field3630.method2275(var3, 103, class52.method407((byte) 121, var2.field332));
        }
        field3622++;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILfd;I)V", line = 54)
    private final void method1740(int arg0, class299 arg1, int arg2) {
        if (arg0 != 0) {
            return;
        }
        field3619++;
        if (arg2 == 1) {
            this.field3626 = class114.method841(false, arg1.method2104(122));
        } else if (arg2 == 2) {
            this.field3615 = class114.method841(false, arg1.method2104(97));
        } else if (arg2 == 3) {
            this.field3625 = arg1.method2060(-12482);
        } else if (arg2 == 4) {
            this.field3617 = arg1.method2062(-25795);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method2083((byte) -115);
            this.field3637 = new class329(class262.method1805(var4, (byte) 96));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method2062(arg0 - 25795);
                class26 var7;
                if (arg2 == 5) {
                    var7 = new class29(arg1.method2060(-12482));
                } else {
                    var7 = new class7(arg1.method2062(-25795));
                }
                this.field3637.method2275(var7, 95, (long) var6);
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)Z", line = 115)
    public final boolean method1741(int arg0, int arg1) {
        field3634++;
        if (this.field3637 == null) {
            return false;
        }
        if (this.field3630 == null) {
            this.method1744(1740484738);
        }
        if (arg0 != -3) {
            this.method1738(26, 103);
        }
        class7 var3 = (class7) this.field3630.method2279((long) arg1, 20);
        return var3 != null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)V", line = 140)
    public static final void method1742(boolean arg0, int arg1) {
        if (arg0) {
            if (class233.field3340 != -1) {
                class131.method1005(-1, class233.field3340);
            }
            for (class74 var2 = (class74) class272.field3900.method2277(13292); var2 != null; var2 = (class74) class272.field3900.method2278((byte) -65)) {
                class97.method700(true, var2, arg1 ^ 0x7A);
            }
            class233.field3340 = -1;
            class272.field3900 = new class329(8);
            class341.method2371(-6086);
            class233.field3340 = class286.field4080;
            class313.method2169((byte) 44, false);
            class292.method2001(121);
            class71.method525(true, class233.field3340);
        }
        field3636++;
        class99.field1300 = -1;
        class67.method484(class145.field2022, -77);
        if (arg1 != 2) {
            field3638 = 39L;
        }
        class359.field5616 = new class239();
        class359.field5616.field4893 = 3000;
        class359.field5616.field4855 = 3000;
        if (!class47.field623 && class299.field4362 == 0) {
            class234.method1665((byte) -55, class1.field7);
            class59.method445(10, (byte) 127);
            return;
        }
        if (client.field1631 == 2) {
            class112.field1453 = class55.field712 << 7;
            class248.field3606 = class48.field642 << 7;
        } else {
            class148.method1139((byte) 114);
        }
        if (class47.field623) {
            class96.method696((byte) -72);
        }
        class94.method677(0);
        class59.method445(28, (byte) 95);
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(II)Ljava/lang/String;", line = 207)
    public final String method1743(int arg0, int arg1) {
        field3632++;
        if (this.field3637 == null) {
            return this.field3625;
        }
        class29 var3 = (class29) this.field3637.method2279((long) arg0, -33);
        if (var3 == null) {
            return this.field3625;
        } else {
            if (arg1 != -7) {
                this.field3637 = (class329) null;
            }
            return var3.field332;
        }
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V", line = 227)
    private final void method1744(int arg0) {
        field3629++;
        this.field3630 = new class329(this.field3637.method2274(0));
        if (arg0 == 1740484738) {
            for (class7 var2 = (class7) this.field3637.method2277(13292); var2 != null; var2 = (class7) this.field3637.method2278((byte) -87)) {
                class7 var3 = new class7((int) var2.field304);
                this.field3630.method2275(var3, 122, (long) var2.field67);
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "(I)V", line = 253)
    public static void method1745(int arg0) {
        if (arg0 != 0) {
            method1749((Throwable) null, (String) null);
        }
        field3631 = null;
        field3623 = null;
        field3618 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZLfd;)V", line = 269)
    public final void method1746(boolean arg0, class299 arg1) {
        if (arg0) {
            field3621 = 75;
        }
        while (true) {
            int var3 = arg1.method2096((byte) -122);
            if (var3 == 0) {
                field3627++;
                return;
            }
            this.method1740(0, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILpm;)[Lub;", line = 291)
    public static final class181[] method1747(int arg0, class69 arg1) {
        field3628++;
        if (!arg1.method509((byte) -115)) {
            return new class181[0];
        }
        class188 var2 = arg1.method506(-4785);
        while (var2.field2608 == 0) {
            class177.method1299((byte) 64, 10L);
        }
        if (var2.field2608 == 2) {
            return new class181[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field2606);
        class181[] var4 = new class181[var3.length >> 2];
        if (arg0 != 14) {
            method1742(false, -30);
        }
        for (int var5 = 0; var5 < var4.length; var5++) {
            class181 var6 = new class181();
            var4[var5] = var6;
            var6.field2474 = var3[var5 << 2];
            var6.field2473 = var3[(var5 << 2) + 1];
            var6.field2477 = var3[(var5 << 2) + 2];
            var6.field2475 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 342)
    public final boolean method1748(int arg0, String arg1) {
        field3635++;
        if (arg0 != 25778) {
            this.field3626 = '&';
        }
        if (this.field3637 == null) {
            return false;
        }
        if (this.field3630 == null) {
            this.method1739(arg0 ^ 0x64BC);
        }
        for (class115 var3 = (class115) this.field3630.method2279(class52.method407((byte) 75, arg1), 114); var3 != null; var3 = (class115) this.field3630.method2281((byte) 102)) {
            if (var3.field1483.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lbk;", line = 372)
    public static final class101 method1749(Throwable arg0, String arg1) {
        field3620++;
        class101 var2;
        if ((arg0 instanceof class101)) {
            var2 = (class101) arg0;
            var2.field1318 = var2.field1318 + ' ' + arg1;
        } else {
            var2 = new class101(arg0, arg1);
        }
        return var2;
    }
}
