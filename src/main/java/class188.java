import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class188 {

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "[Lsk;")
    public static class203[] field3049 = new class203[0];

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field3051 = 2;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field3056 = 0;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public int field3053;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public int field3054;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public int field3055;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "J")
    public long field3050;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "Lqk;")
    public class2 field3057;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public static void method1342(int arg0) {
        if (arg0 != 0) {
            field3056 = -54;
        }
        field3049 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lag;Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1343(class211 arg0, String arg1, int arg2) {
        if (arg2 != 0) {
            method1344(true);
        }
        if (arg1.indexOf("%") != -1) {
            label56: while (true) {
                int var3 = arg1.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label56;
                                                        }
                                                        String var9 = "";
                                                        if (class67.field1110 != null) {
                                                            if (class67.field1110.field2817 == null) {
                                                                var9 = class185.method1330(class67.field1110.field2815, false);
                                                            } else {
                                                                var9 = (String) class67.field1110.field2817;
                                                            }
                                                        }
                                                        arg1 = arg1.substring(0, var8) + var9 + arg1.substring(var8 + 4);
                                                    }
                                                }
                                                arg1 = arg1.substring(0, var7) + class206.method1446(class141.method994(4, arg0, (byte) 32), (byte) -98) + arg1.substring(var7 + 2);
                                            }
                                        }
                                        arg1 = arg1.substring(0, var6) + class206.method1446(class141.method994(3, arg0, (byte) 32), (byte) -98) + arg1.substring(var6 + 2);
                                    }
                                }
                                arg1 = arg1.substring(0, var5) + class206.method1446(class141.method994(2, arg0, (byte) 32), (byte) -98) + arg1.substring(var5 + 2);
                            }
                        }
                        arg1 = arg1.substring(0, var4) + class206.method1446(class141.method994(1, arg0, (byte) 32), (byte) -98) + arg1.substring(var4 + 2);
                    }
                }
                arg1 = arg1.substring(0, var3) + class206.method1446(class141.method994(0, arg0, (byte) 32), (byte) -98) + arg1.substring(var3 + 2);
            }
        }
        field3052++;
        return arg1;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V")
    public static final void method1344(boolean arg0) {
        if (arg0) {
            class218.field3584 = class267.field4301;
            class267.field4304 = class26.field324;
        } else {
            class218.field3584 = class243.field3862;
            class267.field4304 = class148.field2320;
        }
        class183.field3013 = class218.field3584.length;
    }
}
