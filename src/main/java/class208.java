import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class208 extends class115 {

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
    public static int field3519 = 3353893;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "Ljava/lang/String;")
    public static String field3517 = "wave:";

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "I")
    public int field3523;

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "Ljava/lang/String;")
    public String field3524;

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "Ljava/lang/String;")
    public String field3525;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "[[Lhg;")
    public static class207[][] field3515;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)V")
    public static final void method1459(int arg0, byte arg1) {
        ++field3520;
        int var2 = 78 / ((arg1 - -44) / 45);
        class195.field3119.method98(1, arg0);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLhg;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1460(byte arg0, class207 arg1, String arg2) {
        if (~arg2.indexOf("%") != 0) {
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
                                                if (~var7 == 0) {
                                                    while (true) {
                                                        int var8 = arg2.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label56;
                                                        }
                                                        String var9 = "";
                                                        if (class11.field199 != null) {
                                                            if (class11.field199.field3089 == null) {
                                                                var9 = class137.method1015(arg0 + 352, class11.field199.field3087);
                                                            } else {
                                                                var9 = (String) class11.field199.field3089;
                                                            }
                                                        }
                                                        arg2 = arg2.substring(0, var8) + var9 + arg2.substring(var8 - -4);
                                                    }
                                                }
                                                arg2 = arg2.substring(0, var7) + class194.method1386(class180.method1313(arg0 + -28081, arg1, 4), true) + arg2.substring(var7 - -2);
                                            }
                                        }
                                        arg2 = arg2.substring(0, var6) + class194.method1386(class180.method1313(-28178, arg1, 3), true) + arg2.substring(var6 + 2);
                                    }
                                }
                                arg2 = arg2.substring(0, var5) + class194.method1386(class180.method1313(-28178, arg1, 2), true) + arg2.substring(var5 + 2);
                            }
                        }
                        arg2 = arg2.substring(0, var4) + class194.method1386(class180.method1313(-28178, arg1, 1), true) + arg2.substring(var4 + 2);
                    }
                }
                arg2 = arg2.substring(0, var3) + class194.method1386(class180.method1313(arg0 + -28081, arg1, 0), true) + arg2.substring(var3 + 2);
            }
        }
        ++field3518;
        if (arg0 != -97) {
            field3519 = -49;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIZJ)Ljava/lang/String;")
    public static final String method1461(int arg0, int arg1, int arg2, boolean arg3, long arg4) {
        char var6 = ',';
        ++field3516;
        char var7 = '.';
        if (arg2 <= 75) {
            field3519 = 68;
        }
        boolean var8 = false;
        StringBuffer var9 = new StringBuffer(26);
        if (arg0 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (~arg4 > -1L) {
            var8 = true;
            arg4 = -arg4;
        }
        if (arg1 > 0) {
            for (int var10 = 0; ~arg1 < ~var10; ++var10) {
                int var11 = (int) arg4;
                arg4 /= 10L;
                var9.append((char) (var11 + 48 + -((int) arg4 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        if (~arg0 == -3) {
            var7 = 160;
        }
        while (true) {
            int var13 = (int) arg4;
            arg4 /= 10L;
            var9.append((char) (var13 + 48 - (int) arg4 * 10));
            if (~arg4 == -1L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg3) {
                ++var12;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(B)V")
    public static void method1462(byte arg0) {
        if (arg0 == 8) {
            field3517 = null;
            field3515 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILaj;)V")
    public static final void method1463(int arg0, class151 arg1) {
        if (arg0 != 0) {
            field3515 = null;
        }
        ++field3521;
        class29.field493 = arg1;
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)Lec;")
    public final class301 method1464(int arg0) {
        ++field3514;
        if (arg0 != 0) {
            method1462((byte) 97);
        }
        return class248.field4150[super.field1949];
    }
}
