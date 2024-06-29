import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class225 extends class206 {

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "[I")
    public static int[] field3917 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "Lmh;")
    public static class62 field3920 = class201.method1405(true, "<col=ffff00>");

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "B")
    public byte field3924;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public int field3919;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "Lmh;")
    public class62 field3921;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "Lmh;")
    public class62 field3922;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "[Lbi;")
    public static class225[] field3923;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lmh;Lsg;B)Lmh;", line = 17)
    public static final class62 method1594(class62 arg0, class191 arg1, byte arg2) {
        field3925++;
        if (arg0.method457(-27773, class74.field1197) == -1) {
            return arg2 < 114 ? (class62) null : arg0;
        }
        while (true) {
            int var3 = arg0.method457(-27773, class308.field5291);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg0.method457(-27773, class205.field3455);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg0.method457(-27773, class298.field5080);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg0.method457(-27773, class278.field4773);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg0.method457(-27773, class39.field611);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg0.method457(-27773, class307.field5278);
                                                    if (var8 == -1) {
                                                        return arg2 < 114 ? (class62) null : arg0;
                                                    }
                                                    class62 var9 = class275.field4694;
                                                    if (class195.field3286 != null) {
                                                        var9 = class250.method1736((byte) -122, class195.field3286.field2320);
                                                        try {
                                                            if (class195.field3286.field2323 != null) {
                                                                byte[] var10 = ((String) class195.field3286.field2323).getBytes("ISO-8859-1");
                                                                var9 = class266.method1833(0, var10.length, var10, 0);
                                                            }
                                                        } catch (UnsupportedEncodingException var12) {
                                                        }
                                                    }
                                                    arg0 = class254.method1772(new class62[] { arg0.method429(var8, 0, true), var9, arg0.method407(var8 + 4, 15552) }, 0);
                                                }
                                            }
                                            arg0 = class254.method1772(new class62[] { arg0.method429(var7, 0, true), class198.method1383(client.method2055(-19, 4, arg1), 71), arg0.method407(var7 + 2, 15552) }, 0);
                                        }
                                    }
                                    arg0 = class254.method1772(new class62[] { arg0.method429(var6, 0, true), class198.method1383(client.method2055(-19, 3, arg1), 63), arg0.method407(var6 + 2, 15552) }, 0);
                                }
                            }
                            arg0 = class254.method1772(new class62[] { arg0.method429(var5, 0, true), class198.method1383(client.method2055(-19, 2, arg1), 115), arg0.method407(var5 + 2, 15552) }, 0);
                        }
                    }
                    arg0 = class254.method1772(new class62[] { arg0.method429(var4, 0, true), class198.method1383(client.method2055(-19, 1, arg1), 97), arg0.method407(var4 + 2, 15552) }, 0);
                }
            }
            arg0 = class254.method1772(new class62[] { arg0.method429(var3, 0, true), class198.method1383(client.method2055(-19, 0, arg1), 74), arg0.method407(var3 + 2, 15552) }, 0);
        }
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(B)V", line = 126)
    public static final void method1595(byte arg0) {
        if (class114.field1915 < 0) {
            class90.field1422 = -1;
            class103.field1696 = -1;
            class114.field1915 = 0;
        }
        field3918++;
        if (class114.field1915 > class184.field2955) {
            class103.field1696 = -1;
            class90.field1422 = -1;
            class114.field1915 = class184.field2955;
        }
        if (arg0 < 14) {
            field3923 = (class225[]) null;
        }
        if (class282.field4813 < 0) {
            class103.field1696 = -1;
            class282.field4813 = 0;
            class90.field1422 = -1;
        }
        if (class248.field4219 < class282.field4813) {
            class90.field1422 = -1;
            class103.field1696 = -1;
            class282.field4813 = class248.field4219;
        }
    }

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(B)V", line = 165)
    public static void method1596(byte arg0) {
        field3923 = null;
        field3917 = null;
        if (arg0 < 111) {
            field3920 = (class62) null;
        }
        field3920 = null;
    }
}
