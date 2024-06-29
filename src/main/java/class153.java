import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class153 {

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2532 = "";

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "[Z")
    public static boolean[] field2536 = new boolean[100];

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public static void method1133(boolean arg0) {
        if (!arg0) {
            field2532 = null;
            field2536 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZ)[B")
    public static final synchronized byte[] method1134(int arg0, boolean arg1) {
        if (!arg1) {
            field2536 = null;
        }
        field2534++;
        if (arg0 == 100 && class296.field4686 > 0) {
            byte[] var2 = class235.field3800[--class296.field4686];
            class235.field3800[class296.field4686] = null;
            return var2;
        } else if (arg0 == 5000 && class12.field152 > 0) {
            byte[] var3 = class109.field1570[--class12.field152];
            class109.field1570[class12.field152] = null;
            return var3;
        } else if (arg0 == 30000 && class41.field578 > 0) {
            byte[] var4 = class168.field2709[--class41.field578];
            class168.field2709[class41.field578] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILce;ILce;Z)I")
    public static final int method1135(int arg0, class223 arg1, int arg2, class223 arg3, boolean arg4) {
        field2533++;
        if (arg2 == 1) {
            int var5 = arg3.field2616;
            int var6 = arg1.field2616;
            if (!arg4) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg2 == 2) {
            return class247.method1782(arg3.method1598((byte) -105).field4485, 2, arg1.method1598((byte) -92).field4485, class48.field701);
        } else if (arg2 == 3) {
            if (arg3.field3570.equals("-")) {
                if (arg1.field3570.equals("-")) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field3570.equals("-")) {
                return arg4 ? 1 : -1;
            } else {
                return class247.method1782(arg3.field3570, 2, arg1.field3570, class48.field701);
            }
        } else if (arg2 == 4) {
            if (arg3.method1195(8482)) {
                return arg1.method1195(8482) ? 0 : 1;
            } else if (arg1.method1195(8482)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 5) {
            if (arg3.method1192(false)) {
                return arg1.method1192(false) ? 0 : 1;
            } else if (arg1.method1192(false)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 6) {
            if (arg3.method1191(arg0 - 139)) {
                return arg1.method1191(arg0 - 137) ? 0 : 1;
            } else if (arg1.method1191(-125)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 != 11) {
            return 44;
        } else if (arg2 != 7) {
            return arg3.field3569 - arg1.field3569;
        } else if (arg3.method1190(true)) {
            return arg1.method1190(true) ? 0 : 1;
        } else if (arg1.method1190(true)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)V")
    public static final void method1136(int arg0, int arg1, int arg2) {
        class201 var3 = class94.method738(arg2 - 74, arg1, 5);
        var3.method1477(arg2);
        var3.field3226 = arg0;
        field2529++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIILlc;)Lsi;")
    public static final class204 method1137(int arg0, int arg1, int arg2, class86 arg3) {
        field2535++;
        if (arg0 == -18624) {
            return class156.method1155(arg1, arg3, 77, arg2) ? class166.method1221(83) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)V")
    public static final void method1138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2530++;
        if (arg1 != -30001) {
            method1136(-49, 13, -117);
        }
        if (arg0 == arg3) {
            class33.method254(arg4, arg3, (byte) 123, arg2, arg5);
        } else if (class272.field4374 <= arg2 - arg3 && class211.field3386 >= arg2 + arg3 && class207.field3328 <= (arg4 - arg0) && class228.field3657 >= arg4 + arg0) {
            class143.method1024(arg0, arg4, arg3, 59, arg5, arg2);
        } else {
            class119.method871(arg2, arg3, arg4, arg0, arg5, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
    public static final void method1139(byte arg0) {
        field2531++;
        if (arg0 >= -24) {
            method1140(-70, 20);
        }
        class78.field1127.method1558(-23);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)Lgb;")
    public static final class150 method1140(int arg0, int arg1) {
        field2537++;
        class150 var2 = (class150) class114.field1650.method310(arg0 - 24201, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class254.field4197.method643(arg1, 11, false);
        class150 var4 = new class150();
        if (arg0 != 11) {
            return null;
        }
        if (var3 != null) {
            var4.method1066(29795, new class152(var3));
        }
        class114.field1650.method312((long) arg1, var4, (byte) -78);
        return var4;
    }
}
