import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class79 {

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "Z")
    public boolean field1229 = false;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public int field1222 = 0;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public int field1230 = 0;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field1218 = -1;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "Lma;")
    private static class5 field1226 = class12.method119("Loaded textures", (byte) 78);

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "Lma;")
    private static class5 field1231 = class12.method119("Players", (byte) 95);

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "Lma;")
    public static class5 field1233 = class12.method119("hint_mapmarkers", (byte) 127);

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "Lma;")
    public static class5 field1232 = field1231;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "Lma;")
    public static class5 field1234 = class12.method119("Lade Sprites )2 ", (byte) 126);

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "Lma;")
    public static class5 field1227 = field1226;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "Lwk;")
    public class54 field1228;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field1225;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lma;BLeb;)Lma;", line = 9)
    public static final class5 method541(class5 arg0, byte arg1, class253 arg2) {
        field1219++;
        if (arg1 < 123) {
            return (class5) null;
        } else if (arg0.method73(-5069, class18.field310) == -1) {
            return arg0;
        } else {
            while (true) {
                int var3 = arg0.method73(-5069, class165.field2525);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg0.method73(-5069, class257.field4406);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.method73(-5069, class166.field2531);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg0.method73(-5069, class62.field978);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg0.method73(-5069, class91.field1386);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg0.method73(-5069, class114.field1697);
                                                        if (var8 == -1) {
                                                            return arg0;
                                                        }
                                                        class5 var9 = class250.field4145;
                                                        if (class197.field3137 != null) {
                                                            var9 = class153.method967(-113, class197.field3137.field498);
                                                            try {
                                                                if (class197.field3137.field496 != null) {
                                                                    byte[] var10 = ((String) class197.field3137.field496).getBytes("ISO-8859-1");
                                                                    var9 = class101.method645(var10, true, 0, var10.length);
                                                                }
                                                            } catch (UnsupportedEncodingException var12) {
                                                            }
                                                        }
                                                        arg0 = class288.method1940((byte) 71, new class5[] { arg0.method76(0, 0, var8), var9, arg0.method78(-24938, var8 + 4) });
                                                    }
                                                }
                                                arg0 = class288.method1940((byte) 111, new class5[] { arg0.method76(0, 0, var7), class216.method1437(false, class192.method1260(4, -22729, arg2)), arg0.method78(-24938, var7 + 2) });
                                            }
                                        }
                                        arg0 = class288.method1940((byte) 110, new class5[] { arg0.method76(0, 0, var6), class216.method1437(false, class192.method1260(3, -22729, arg2)), arg0.method78(-24938, var6 + 2) });
                                    }
                                }
                                arg0 = class288.method1940((byte) 88, new class5[] { arg0.method76(0, 0, var5), class216.method1437(false, class192.method1260(2, -22729, arg2)), arg0.method78(-24938, var5 + 2) });
                            }
                        }
                        arg0 = class288.method1940((byte) 126, new class5[] { arg0.method76(0, 0, var4), class216.method1437(false, class192.method1260(1, -22729, arg2)), arg0.method78(-24938, var4 + 2) });
                    }
                }
                arg0 = class288.method1940((byte) 93, new class5[] { arg0.method76(0, 0, var3), class216.method1437(false, class192.method1260(0, -22729, arg2)), arg0.method78(-24938, var3 + 2) });
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BZ)V", line = 110)
    public static final void method542(byte arg0, boolean arg1) {
        class29.field474 = arg1;
        if (arg0 < 80) {
            field1234 = (class5) null;
        }
        field1223++;
        class185.field2886 = !class152.method956((byte) -83);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)V", line = 122)
    public static void method543(boolean arg0) {
        field1232 = null;
        field1233 = null;
        field1226 = null;
        field1231 = null;
        field1227 = null;
        if (!arg0) {
            field1232 = (class5) null;
        }
        field1234 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lfl;B)V", line = 159)
    public static final void method544(class299 arg0, byte arg1) {
        int var2 = class156.field2314;
        int var3 = var2 * 956 / 503;
        class234.field3869.method721((class255.field4362 - var3) / 2, 0, var3, var2);
        class151.field2189.method525(class255.field4362 / 2 - (class151.field2189.field1163 / 2), 18);
        int var4 = 40 / ((arg1 - 42) / 32);
        arg0.method2019(class24.field414, class255.field4362 / 2, class156.field2314 / 2 - 26, 16777215, -1);
        field1224++;
        int var5 = class156.field2314 / 2 - 18;
        class124.method823(class255.field4362 / 2 - 152, var5, 304, 34, 9179409);
        class124.method823(class255.field4362 / 2 - 151, var5 + 1, 302, 32, 0);
        class124.method826(class255.field4362 / 2 - 150, var5 - -2, class279.field4730 * 3, 30, 9179409);
        class124.method826(class255.field4362 / 2 + (class279.field4730 * 3) - 150, var5 - -2, 300 - class279.field4730 * 3, 30, 0);
        arg0.method2019(class228.field3775, class255.field4362 / 2, class156.field2314 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)V", line = 187)
    public static final void method545(int arg0, int arg1) {
        class142.field2088 = -1;
        class174.field2656 = arg1;
        class171.field2629 = null;
        class106.field1579 = 1;
        class15.field274 = arg0;
        field1220++;
        class100.field1487 = 0;
        class33.field509 = false;
    }
}
