import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class86 implements Runnable {

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static volatile int field2008 = 0;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Ltd;")
    private static class136 field2015 = class145.method1172("You can(Wt add yourself to your own ignore list", 45);

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Z")
    public static boolean field2010 = false;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Ltd;")
    public static class136 field2014 = class145.method1172("Fehler bei der Verbindung zum Server)3", 45);

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field2012 = 0;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Ltd;")
    public static class136 field2011 = class145.method1172("Neuer Benutzer", 45);

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "Ltd;")
    public static class136 field2023 = class145.method1172("Null", 45);

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "Ltd;")
    public static class136 field2018 = class145.method1172(")2", 45);

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Ltd;")
    private static class136 field2007 = class145.method1172("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ", 45);

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "Ltd;")
    public static class136 field2025 = field2015;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public static int field2026 = 0;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "Ltd;")
    public static class136 field2027 = class145.method1172("Benutzen Sie bitte eine andere Welt)3", 45);

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "Ltd;")
    public static class136 field2024 = field2007;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "Lk;")
    public static class69 field2022 = new class69();

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "Lke;")
    public static class74 field2021;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "[Lnb;")
    public static class92[] field2016;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static final void method639(int arg0) {
        field2017++;
        try {
            if (class145.field3351 == null) {
                class145.field3351 = new class39(class44.field1010, class79.method570(0, new class136[] { class15.field287, class37.field857, class33.field748 }).method1103((byte) -111));
            } else {
                byte[] var1 = class145.field3351.method328(1);
                if (var1 != null) {
                    class127 var2 = new class127(var1);
                    class145.field3356 = var2.method1020(false);
                    class11.field189 = new class11[class145.field3356];
                    for (int var3 = 0; var3 < class145.field3356; var3++) {
                        class11 var4 = class11.field189[var3] = new class11();
                        int var5 = var2.method1020(false);
                        var4.field181 = (var5 & 0x8000) != 0;
                        var4.field182 = var5 & 0x7FFF;
                        var4.field176 = var2.method1010(-14330);
                        var4.field197 = var2.method1028((byte) -92);
                        var4.field185 = var3;
                        var4.field199 = class3.method22(var4.field176, (byte) 29);
                    }
                    class89.method679(class11.field189.length - 1, 0, class107.field2529, 17322, class127.field3021, class11.field189);
                    class145.field3351 = null;
                    class155.field3545 = true;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class145.field3351 = null;
        }
        if (arg0 != 32768) {
            method641(null, false);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)Ltd;")
    public static final class136 method640(int arg0, int arg1) {
        field2019++;
        if (arg0 < 100000) {
            return class79.method570(arg1 - 1, new class136[] { class132.field3116, class19.method140(arg0, -94), class110.field2601 });
        } else if (arg0 < 10000000) {
            return class79.method570(0, new class136[] { class141.field3280, class19.method140(arg0 / 1000, arg1 ^ 0xFFFFFF92), class1.field9, class110.field2601 });
        } else if (arg1 == 1) {
            return class79.method570(0, new class136[] { class61.field1310, class19.method140(arg0 / 1000000, -86), class4.field74, class110.field2601 });
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "run", descriptor = "()V")
    public final void run() {
        field2028++;
        try {
            while (true) {
                class69 var1 = class147.field3383;
                class93 var2;
                synchronized (class147.field3383) {
                    var2 = (class93) class147.field3383.method512(0);
                }
                if (var2 == null) {
                    class9.method42(0, 100L);
                    Object var6 = class7.field127;
                    synchronized (class7.field127) {
                        if (class15.field286 <= 1) {
                            class15.field286 = 0;
                            class7.field127.notifyAll();
                            return;
                        }
                        class15.field286--;
                    }
                } else {
                    if (var2.field2192 == 0) {
                        var2.field2177.method35((int) var2.field2090, var2.field2193.length, (byte) 17, var2.field2193);
                        class69 var4 = class147.field3383;
                        synchronized (class147.field3383) {
                            var2.method674(32);
                        }
                    } else if (var2.field2192 == 1) {
                        var2.field2193 = var2.field2177.method37(-13300, (int) var2.field2090);
                        class69 var3 = class147.field3383;
                        synchronized (class147.field3383) {
                            client.field443.method509(1, var2);
                        }
                    }
                    Object var5 = class7.field127;
                    synchronized (class7.field127) {
                        if (class15.field286 <= 1) {
                            class15.field286 = 0;
                            class7.field127.notifyAll();
                            return;
                        }
                        class15.field286 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class53.method433(var17, false, null);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lke;Z)Ltd;")
    public static final class136 method641(class74 arg0, boolean arg1) {
        field2013++;
        if (class122.method955(129516, class56.method444(arg0, 0)) == 0) {
            return null;
        }
        if (!arg1) {
            field2016 = null;
        }
        if (arg0.field1573 == null || arg0.field1573.method1129(false).method1119(-10511) == 0) {
            return field2010 ? class122.field2819 : null;
        } else {
            return arg0.field1573;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
    public static void method642(int arg0) {
        field2014 = null;
        field2015 = null;
        field2027 = null;
        field2011 = null;
        field2023 = null;
        field2018 = null;
        if (arg0 != 32768) {
            method642(119);
        }
        field2022 = null;
        field2024 = null;
        field2016 = null;
        field2025 = null;
        field2007 = null;
        field2021 = null;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
    public static final void method643(int arg0) {
        field2020++;
        try {
            if (arg0 != -940) {
                field2027 = null;
            }
            if (class155.field3604 == 1) {
                int var1 = class18.field367.method574((byte) 69);
                if (var1 > 0 && class18.field367.method594(false)) {
                    int var2 = var1 - class44.field1019;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class18.field367.method571((byte) 98, var2);
                } else {
                    class18.field367.method599((byte) 100);
                    class18.field367.method577(arg0 ^ 0x1A0A);
                    if (class49.field1128 == null) {
                        class155.field3604 = 0;
                    } else {
                        class155.field3604 = 2;
                    }
                    class139.field3231 = null;
                    client.field459 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class18.field367.method599((byte) 113);
            class139.field3231 = null;
            class49.field1128 = null;
            class155.field3604 = 0;
            client.field459 = null;
        }
    }
}
