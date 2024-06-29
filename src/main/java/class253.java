import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class253 {

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "Lwm;")
    private class399 field3881 = new class399(64);

    @OriginalMember(owner = "client!wu", name = "v", descriptor = "Lwm;")
    public class399 field3899 = new class399(50);

    @OriginalMember(owner = "client!wu", name = "w", descriptor = "Ltd;")
    public class318 field3900 = new class318(250);

    @OriginalMember(owner = "client!wu", name = "x", descriptor = "Lcr;")
    private class408 field3901 = new class408();

    @OriginalMember(owner = "client!wu", name = "l", descriptor = "Lph;")
    private class459 field3889;

    @OriginalMember(owner = "client!wu", name = "A", descriptor = "Lqr;")
    private class48 field3904;

    @OriginalMember(owner = "client!wu", name = "k", descriptor = "Lph;")
    public class459 field3888;

    @OriginalMember(owner = "client!wu", name = "p", descriptor = "Z")
    private boolean field3893;

    @OriginalMember(owner = "client!wu", name = "r", descriptor = "I")
    public int field3895;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "I")
    public int field3879;

    @OriginalMember(owner = "client!wu", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field3902;

    @OriginalMember(owner = "client!wu", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field3905;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "Lgh;")
    public static class388 field3885 = null;

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
    public static int field3882 = 0;

    @OriginalMember(owner = "client!wu", name = "m", descriptor = "[Lbv;")
    public static class202[] field3890 = new class202[2048];

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!wu", name = "n", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!wu", name = "o", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!wu", name = "q", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!wu", name = "s", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!wu", name = "t", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!wu", name = "u", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!wu", name = "z", descriptor = "I")
    public int field3903;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V", line = 3)
    public final void method1630(int arg0) {
        field3896++;
        class318 var2 = this.field3900;
        synchronized (this.field3900) {
            if (arg0 != -6769) {
                this.method1632(-51, true);
            }
            this.field3900.method2029(true);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V", line = 17)
    public final void method1631(byte arg0) {
        class399 var2 = this.field3881;
        synchronized (this.field3881) {
            this.field3881.method2477(arg0 - 57);
        }
        if (arg0 != 122) {
            this.field3899 = null;
        }
        field3878++;
        class399 var3 = this.field3899;
        synchronized (this.field3899) {
            this.field3899.method2477(-109);
        }
        class318 var4 = this.field3900;
        synchronized (this.field3900) {
            this.field3900.method2026(-7279);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IZ)V", line = 37)
    public final void method1632(int arg0, boolean arg1) {
        this.field3903 = arg0;
        field3891++;
        class399 var3 = this.field3899;
        synchronized (this.field3899) {
            if (arg1) {
                this.method1642((byte) 24, 41);
            }
            this.field3899.method2475((byte) 67);
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)V", line = 52)
    public final void method1633(int arg0) {
        class399 var2 = this.field3881;
        synchronized (this.field3881) {
            this.field3881.method2475((byte) 67);
        }
        field3897++;
        class399 var3 = this.field3899;
        synchronized (this.field3899) {
            this.field3899.method2475((byte) 67);
        }
        class318 var4 = this.field3900;
        synchronized (this.field3900) {
            if (arg0 == 0) {
                this.field3900.method2029(true);
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(I)V", line = 72)
    public static void method1634(int arg0) {
        field3885 = null;
        if (arg0 > -88) {
            field3882 = -31;
        }
        field3890 = null;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(BZ)V", line = 85)
    public final void method1635(byte arg0, boolean arg1) {
        field3894++;
        if (this.field3893 == arg1) {
            return;
        }
        if (arg0 != 28) {
            this.field3900 = null;
        }
        this.field3893 = arg1;
        this.method1633(arg0 - 28);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)Lds;", line = 100)
    public final class12 method1636(int arg0, int arg1) {
        field3887++;
        class399 var3 = this.field3881;
        class12 var4;
        synchronized (this.field3881) {
            var4 = (class12) this.field3881.method2478(1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class459 var5 = this.field3889;
        byte[] var6;
        synchronized (this.field3889) {
            var6 = this.field3889.method2757(class22.method143(arg0, false), class442.method2633(true, arg0), (byte) -127);
        }
        class12 var7 = new class12();
        var7.field153 = arg0;
        var7.field170 = this;
        var7.field164 = new String[] { null, null, class488.field7184.method1977(this.field3895, -125), null, null };
        var7.field199 = new String[] { null, null, null, null, class459.field6843.method1977(this.field3895, -39) };
        if (var6 != null) {
            var7.method66(false, new class289(var6));
        }
        var7.method79(16);
        if (var7.field163 != -1) {
            var7.method64(this.method1636(var7.field197, -120), 1, this.method1636(var7.field163, -104));
        }
        if (var7.field204 != -1) {
            var7.method81(this.method1636(var7.field204, -106), -2097, this.method1636(var7.field184, -117));
        }
        if (arg1 > -101) {
            return null;
        }
        if (!this.field3893 && var7.field183) {
            var7.field192 = class175.field2846.method1977(this.field3895, 73);
            var7.field199 = this.field3905;
            var7.field196 = null;
            var7.field206 = 0;
            var7.field164 = this.field3902;
            var7.field215 = false;
            if (var7.field159 != null) {
                boolean var8 = false;
                for (class261 var9 = var7.field159.method1615(0); var9 != null; var9 = var7.field159.method1621((byte) -83)) {
                    class247 var10 = this.field3904.method460((int) var9.field3977, -18297);
                    if (var10.field3802) {
                        var9.method1676(true);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field159 = null;
                }
            }
        }
        class399 var11 = this.field3881;
        synchronized (this.field3881) {
            this.field3881.method2472(88, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "(I)V", line = 181)
    public final void method1637(int arg0) {
        class399 var2 = this.field3899;
        synchronized (this.field3899) {
            this.field3899.method2475((byte) 67);
        }
        field3884++;
        if (arg0 <= 100) {
            this.method1630(-67);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILza;IIZZLza;ILla;Lfd;II)Lo;", line = 195)
    public final class24 method1638(int arg0, class288 arg1, int arg2, int arg3, boolean arg4, boolean arg5, class288 arg6, int arg7, class317 arg8, class370 arg9, int arg10, int arg11) {
        field3886++;
        class24 var13 = this.method1640(arg9, arg7, arg0, arg11, arg6, arg3, arg2, 45);
        if (var13 != null) {
            return var13;
        }
        class12 var14 = this.method1636(arg11, -116);
        if (arg7 > 1 && var14.field166 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg7 >= var14.field223[var16] && var14.field223[var16] != 0) {
                    var15 = var14.field166[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method1636(var15, -116);
            }
        }
        int[] var17 = var14.method68(arg6, arg7, arg9, 16184, arg0, arg4, arg3, arg2, arg1, arg8);
        if (var17 == null) {
            return null;
        }
        if (arg10 != 36) {
            field3885 = null;
        }
        class24 var18;
        if (arg5) {
            var18 = arg1.method335(var17, 0, 36, 36, 32);
        } else {
            var18 = arg6.method335(var17, 0, 36, 36, 32);
        }
        if (!arg5) {
            class408 var19 = new class408();
            var19.field6181 = arg6.field4361;
            var19.field6174 = arg7;
            var19.field6176 = arg11;
            var19.field6173 = arg2;
            var19.field6179 = arg0;
            var19.field6177 = arg3;
            var19.field6178 = arg9 != null;
            this.field3900.method2022(1, var18, var19);
        }
        return var18;
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(II)V", line = 272)
    public static final void method1639(int arg0, int arg1) {
        if (arg1 != -16646) {
            field3885 = null;
        }
        field3883++;
        if (class466.field6932 == arg0) {
            return;
        }
        if (class466.field6932 == 0) {
            class96.method862(3);
        }
        if (arg0 == 12) {
            class424.method2580(class339.field5106, (byte) -46, class256.field3934, class405.field6102);
        }
        if (arg0 != 12 && class78.field1560 != null) {
            class78.field1560.method2319((byte) 109);
            class78.field1560 = null;
        }
        if (arg0 == 2) {
            class363.method2228((byte) 23, class471.field6989 != class155.field2523);
        }
        if (arg0 == 6) {
            class390.method2409((byte) -121, class192.field3097 != class155.field2523);
        }
        if (arg0 == 4) {
            class81.method766(class256.field3934, (byte) 80, class339.field5106);
        } else if (arg0 == 5) {
            class424.method2580(class339.field5106, (byte) -82, class256.field3934, class405.field6102);
        } else if (arg0 == 8) {
            class424.method2580(class339.field5106, (byte) -60, class256.field3934, class405.field6102);
        } else if (arg0 == 11) {
            class81.method766(class256.field3934, (byte) -78, class339.field5106);
        }
        if (class457.method2725(false, class466.field6932)) {
            class249.field3845.field6834 = 2;
            class374.field5483.field6834 = 2;
            class444.field6595.field6834 = 2;
            class324.field4929.field6834 = 2;
            class127.field2169.field6834 = 2;
            class100.field1927.field6834 = 2;
            class454.field6753.field6834 = 2;
        }
        if (class457.method2725(false, arg0)) {
            class299.field4527 = 0;
            class429.field6411 = 0;
            class424.field6374 = 1;
            class307.field4652 = 1;
            class105.field1967 = 0;
            class274.method1738((byte) 39, true);
            class249.field3845.field6834 = 1;
            class374.field5483.field6834 = 1;
            class444.field6595.field6834 = 1;
            class324.field4929.field6834 = 1;
            class127.field2169.field6834 = 1;
            class100.field1927.field6834 = 1;
            class454.field6753.field6834 = 1;
        }
        if (arg0 == 10 || arg0 == 2) {
            class41.method253(12);
        }
        if (arg0 == 1) {
            class434.method2604(class455.field6758, class262.field4006, 0);
        } else {
            class443.method2634(4);
        }
        boolean var2 = arg0 == 1 || class464.method2779(arg0, true) || class332.method2097((byte) -65, arg0);
        boolean var3 = class466.field6932 == 1 || class464.method2779(class466.field6932, true) || class332.method2097((byte) -43, class466.field6932);
        if (var2 != var3) {
            if (var2) {
                class273.field4131 = class278.field4198;
                if (class186.field2990.field2560 == 0) {
                    class12.method69(2, true);
                } else {
                    class332.method2103(class202.field3263, 1, class186.field2990.field2560, class278.field4198, 2, 0, false);
                }
                class450.field6699.method1734(false, (byte) 65);
            } else {
                class12.method69(2, true);
                class450.field6699.method1734(true, (byte) 92);
            }
        }
        if (class457.method2725(false, arg0) || arg0 == 12) {
            class262.field4006.method277();
        }
        class466.field6932 = arg0;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lfd;IIILza;III)Lo;", line = 398)
    public final class24 method1640(class370 arg0, int arg1, int arg2, int arg3, class288 arg4, int arg5, int arg6, int arg7) {
        this.field3901.field6178 = arg0 != null;
        field3898++;
        this.field3901.field6179 = arg2;
        this.field3901.field6176 = arg3;
        this.field3901.field6174 = arg1;
        this.field3901.field6173 = arg6;
        this.field3901.field6177 = arg5;
        this.field3901.field6181 = arg4.field4361;
        if (arg7 <= 44) {
            this.method1630(-69);
        }
        return (class24) this.field3900.method2021(0, this.field3901);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIII)V", line = 418)
    public static final void method1641(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3892++;
        if (class186.field2990.field2532 != 0 && arg3 != 0 && class218.field3439 < 50 && arg2 != -1) {
            class276.field4170[class218.field3439++] = new class387((byte) 2, arg2, arg3, arg4, arg0, 0);
        }
        if (arg1 != 1) {
            field3885 = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(BI)V", line = 438)
    public final void method1642(byte arg0, int arg1) {
        class399 var3 = this.field3881;
        synchronized (this.field3881) {
            this.field3881.method2471((byte) 98, arg1);
        }
        field3880++;
        class399 var4 = this.field3899;
        synchronized (this.field3899) {
            int var5 = 49 % ((-arg0 - 62) / 59);
            this.field3899.method2471((byte) 98, arg1);
        }
        class318 var6 = this.field3900;
        synchronized (this.field3900) {
            this.field3900.method2020(arg1, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lkp;IZLqr;Lph;Lph;)V", line = 480)
    public class253(class341 arg0, int arg1, boolean arg2, class48 arg3, class459 arg4, class459 arg5) {
        this.field3889 = arg4;
        this.field3904 = arg3;
        this.field3888 = arg5;
        this.field3893 = arg2;
        this.field3895 = arg1;
        if (this.field3889 == null) {
            this.field3879 = 0;
        } else {
            int var7 = this.field3889.method2759(16460) - 1;
            this.field3879 = var7 * 256 + this.field3889.method2763(var7, -3);
        }
        this.field3902 = new String[] { null, null, class488.field7184.method1977(this.field3895, 55), null, null };
        this.field3905 = new String[] { null, null, null, null, class459.field6843.method1977(this.field3895, -95) };
    }
}
