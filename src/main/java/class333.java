import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class333 {

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Lph;")
    public static class114 field4426 = new class114(260);

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field4427 = new String[100];

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Lal;")
    public static class369 field4429;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILfd;Ljava/lang/String;)Ljava/lang/String;", line = 9)
    public static final String method1896(int arg0, class194 arg1, String arg2) {
        if (arg2.indexOf("%") != -1) {
            label56: while (true) {
                int var3 = arg2.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label56;
                                                        }
                                                        String var9 = "";
                                                        if (class179.field2244 != null) {
                                                            if (class179.field2244.field4126 == null) {
                                                                var9 = class83.method450(class179.field2244.field4124, -119);
                                                            } else {
                                                                var9 = (String) class179.field2244.field4126;
                                                            }
                                                        }
                                                        arg2 = arg2.substring(0, var8) + var9 + arg2.substring(var8 + 4);
                                                    }
                                                }
                                                arg2 = arg2.substring(0, var7) + class315.method1825(class71.method407(29042, 4, arg1), 34) + arg2.substring(var7 + 2);
                                            }
                                        }
                                        arg2 = arg2.substring(0, var6) + class315.method1825(class71.method407(29042, 3, arg1), 34) + arg2.substring(var6 + 2);
                                    }
                                }
                                arg2 = arg2.substring(0, var5) + class315.method1825(class71.method407(29042, 2, arg1), 34) + arg2.substring(var5 + 2);
                            }
                        }
                        arg2 = arg2.substring(0, var4) + class315.method1825(class71.method407(29042, 1, arg1), arg0 + 30) + arg2.substring(var4 + 2);
                    }
                }
                arg2 = arg2.substring(0, var3) + class315.method1825(class71.method407(arg0 ^ 0x7176, 0, arg1), arg0 + 30) + arg2.substring(var3 + 2);
            }
        }
        if (arg0 != 4) {
            method1896(-122, (class194) null, (String) null);
        }
        field4425++;
        return arg2;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 98)
    public static void method1897(int arg0) {
        field4426 = null;
        field4429 = null;
        int var1 = 95 / ((-arg0 - 38) / 43);
        field4427 = null;
    }
}
