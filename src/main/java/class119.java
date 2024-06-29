import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class119 implements Runnable {

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "[Lfa;")
    public volatile class192[] field1925 = new class192[2];

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Z")
    public volatile boolean field1923 = false;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Z")
    public volatile boolean field1921 = false;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Lhd;")
    public static class117 field1920 = new class117(64);

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "Lok;")
    private static class146 field1928 = class235.method1724(-12908, "Thu");

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "Lok;")
    private static class146 field1929 = class235.method1724(-12908, "Sat");

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "Lok;")
    private static class146 field1926 = class235.method1724(-12908, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "Lok;")
    private static class146 field1930 = class235.method1724(-12908, "Tue");

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "Lok;")
    private static class146 field1934 = class235.method1724(-12908, "Wed");

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "Lok;")
    private static class146 field1936 = class235.method1724(-12908, "Fri");

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "Lok;")
    public static class146 field1937 = field1926;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "Z")
    public static boolean field1935 = false;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "Z")
    public static boolean field1927 = true;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "Lok;")
    private static class146 field1933 = class235.method1724(-12908, "Mon");

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
    public static int field1938 = 0;

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "Lok;")
    private static class146 field1940 = class235.method1724(-12908, "Sun");

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "[Lok;")
    public static class146[] field1931 = new class146[] { field1940, field1933, field1930, field1934, field1928, field1936, field1929 };

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "Lml;")
    public class129 field1922;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "Lhj;")
    public static class28 field1939;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 20)
    public static final void method813(int arg0) {
        if (arg0 > -117) {
            method814((class264) null, (class146) null, 24);
        }
        field1919++;
        if (class124.field2029 == 2) {
            if (class263.field4372 == class258.field4295 && class250.field4183 == class218.field3612) {
                class124.field2029 = 0;
                if (class115.field1851 && class113.field1813[81] && class45.field763 > 2) {
                    class279.method2024(class45.field763 - 2, (byte) -117);
                } else {
                    class279.method2024(class45.field763 - 1, (byte) -115);
                }
            }
        } else if (class263.field4372 == class120.field1974 && class250.field4183 == class215.field3542) {
            class124.field2029 = 0;
            if (class115.field1851 && class113.field1813[81] && class45.field763 > 2) {
                class279.method2024(class45.field763 - 2, (byte) -113);
            } else {
                class279.method2024(class45.field763 - 1, (byte) -106);
            }
        } else {
            class218.field3612 = class215.field3542;
            class258.field4295 = class120.field1974;
            class124.field2029 = 2;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lr;Lok;I)Lok;", line = 91)
    public static final class146 method814(class264 arg0, class146 arg1, int arg2) {
        field1917++;
        if (arg2 != 23870) {
            field1939 = (class28) null;
        }
        if (arg1.method1081(class207.field3467, -1) == -1) {
            return arg1;
        }
        while (true) {
            int var3 = arg1.method1081(class312.field5309, -1);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg1.method1081(class225.field3757, arg2 - 23871);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg1.method1081(class115.field1855, -1);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg1.method1081(class241.field4003, -1);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg1.method1081(class196.field3268, -1);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg1.method1081(class309.field5251, -1);
                                                    if (var8 == -1) {
                                                        return arg1;
                                                    }
                                                    class146 var9 = class161.field2740;
                                                    if (class187.field3110 != null) {
                                                        var9 = class168.method1299(class187.field3110.field4267, arg2 - 89805486);
                                                        try {
                                                            if (class187.field3110.field4269 != null) {
                                                                byte[] var10 = ((String) class187.field3110.field4269).getBytes("ISO-8859-1");
                                                                var9 = class316.method2210(1, var10.length, var10, 0);
                                                            }
                                                        } catch (UnsupportedEncodingException var12) {
                                                        }
                                                    }
                                                    arg1 = class112.method758(126, new class146[] { arg1.method1078(0, var8, false), var9, arg1.method1111(123, var8 + 4) });
                                                }
                                            }
                                            arg1 = class112.method758(-36, new class146[] { arg1.method1078(0, var7, false), class262.method1894(class110.method746(4, (byte) -96, arg0), false), arg1.method1111(124, var7 + 2) });
                                        }
                                    }
                                    arg1 = class112.method758(-51, new class146[] { arg1.method1078(0, var6, false), class262.method1894(class110.method746(3, (byte) -102, arg0), false), arg1.method1111(arg2 ^ 0x5D49, var6 + 2) });
                                }
                            }
                            arg1 = class112.method758(-105, new class146[] { arg1.method1078(0, var5, false), class262.method1894(class110.method746(2, (byte) -102, arg0), false), arg1.method1111(122, var5 + 2) });
                        }
                    }
                    arg1 = class112.method758(122, new class146[] { arg1.method1078(0, var4, false), class262.method1894(class110.method746(1, (byte) -81, arg0), false), arg1.method1111(-96, var4 + 2) });
                }
            }
            arg1 = class112.method758(123, new class146[] { arg1.method1078(0, var3, false), class262.method1894(class110.method746(0, (byte) -77, arg0), false), arg1.method1111(arg2 ^ 0x5D43, var3 + 2) });
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILok;)V", line = 190)
    public static final void method815(int arg0, class146 arg1) {
        class57.method451(false, -82);
        field1918++;
        class148.method1140((byte) 6, arg1);
        if (arg0 != -3) {
            field1934 = (class146) null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "run", descriptor = "()V", line = 204)
    public final void run() {
        this.field1921 = true;
        try {
            while (!this.field1923) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class192 var2 = this.field1925[var1];
                    if (var2 != null) {
                        var2.method1478(16384);
                    }
                }
                class281.method2041((byte) 102, 10L);
                class23.method165(this.field1922, (Object) null, (byte) -114);
            }
        } catch (Exception var7) {
            class245.method1771(var7, (String) null, 0);
        } finally {
            this.field1921 = false;
        }
        field1924++;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V", line = 244)
    public static void method816(int arg0) {
        field1920 = null;
        field1940 = null;
        field1939 = null;
        field1934 = null;
        field1931 = null;
        field1930 = null;
        field1937 = null;
        field1933 = null;
        field1929 = null;
        field1926 = null;
        field1936 = null;
        int var1 = 57 % ((57 - arg0) / 60);
        field1928 = null;
    }
}
