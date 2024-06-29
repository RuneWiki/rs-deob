import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class276 {

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "Ltl;")
    public static class222 field4371 = new class222(64);

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "F")
    public static float field4367;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "Lmn;")
    public static class177 field4375;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "[[[B")
    public static byte[][][] field4374;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IB)V", line = 11)
    public static final void method1966(int arg0, byte arg1) {
        field4368++;
        class40.method278(0);
        class239.method1695(arg1 ^ 0x52);
        int var2 = class160.method1113(arg0, (byte) -107).field2203;
        if (var2 == 0) {
            return;
        }
        if (arg1 != 82) {
            method1971(13, (String) null, (class160) null);
        }
        int var3 = class29.field422[arg0];
        if (var2 == 5) {
            class181.field2915 = var3;
        }
        if (var2 == 9) {
            class131.field1932 = var3;
        }
        if (var2 == 6) {
            class48.field665 = var3;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)[B", line = 43)
    public static final synchronized byte[] method1967(int arg0, int arg1) {
        field4369++;
        if (arg1 == 100 && class324.field5056 > 0) {
            byte[] var2 = class107.field1611[--class324.field5056];
            class107.field1611[class324.field5056] = null;
            return var2;
        } else if (arg1 == 5000 && class280.field4415 > 0) {
            byte[] var3 = class341.field5314[--class280.field4415];
            class341.field5314[class280.field4415] = null;
            return var3;
        } else if (arg1 == 30000 && class164.field2662 > 0) {
            byte[] var4 = class232.field3715[--class164.field2662];
            class232.field3715[class164.field2662] = null;
            return var4;
        } else if (arg0 == 0) {
            return new byte[arg1];
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 79)
    public static void method1968(int arg0) {
        if (arg0 >= -16) {
            field4374 = (byte[][][]) ((byte[][][]) null);
        }
        field4375 = null;
        field4371 = null;
        field4374 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lpi;", line = 92)
    public static final class325 method1969(Throwable arg0, String arg1) {
        field4373++;
        class325 var2;
        if ((arg0 instanceof class325)) {
            var2 = (class325) arg0;
            var2.field5073 = var2.field5073 + ' ' + arg1;
        } else {
            var2 = new class325(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)Lpn;", line = 121)
    public static final class208 method1970(int arg0, int arg1) {
        field4370++;
        class208 var2 = (class208) class312.field4849.method1619((long) arg0, 74);
        if (var2 != null) {
            return var2;
        }
        int var3 = 54 / ((6 - arg1) / 62);
        byte[] var4 = class64.field852.method250(true, 34, arg0);
        class208 var5 = new class208();
        if (var4 != null) {
            var5.method1519(new class192(var4), arg0, (byte) -80);
        }
        class312.field4849.method1621((long) arg0, 71, var5);
        return var5;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/lang/String;Lok;)Ljava/lang/String;", line = 145)
    public static final String method1971(int arg0, String arg1, class160 arg2) {
        int var3 = -81 % ((-arg0 - 57) / 58);
        field4372++;
        if (arg1.indexOf("%") == -1) {
            return arg1;
        }
        while (true) {
            int var4 = arg1.indexOf("%1");
            if (var4 == -1) {
                while (true) {
                    int var5 = arg1.indexOf("%2");
                    if (var5 == -1) {
                        while (true) {
                            int var6 = arg1.indexOf("%3");
                            if (var6 == -1) {
                                while (true) {
                                    int var7 = arg1.indexOf("%4");
                                    if (var7 == -1) {
                                        while (true) {
                                            int var8 = arg1.indexOf("%5");
                                            if (var8 == -1) {
                                                while (true) {
                                                    int var9 = arg1.indexOf("%dns");
                                                    if (var9 == -1) {
                                                        return arg1;
                                                    }
                                                    String var10 = "";
                                                    if (class49.field669 != null) {
                                                        if (class49.field669.field3490 == null) {
                                                            var10 = class176.method1236(class49.field669.field3492, (byte) 10);
                                                        } else {
                                                            var10 = (String) class49.field669.field3490;
                                                        }
                                                    }
                                                    arg1 = arg1.substring(0, var9) + var10 + arg1.substring(var9 + 4);
                                                }
                                            }
                                            arg1 = arg1.substring(0, var8) + class155.method1077(class241.method1708(115, arg2, 4), 98) + arg1.substring(var8 + 2);
                                        }
                                    }
                                    arg1 = arg1.substring(0, var7) + class155.method1077(class241.method1708(32, arg2, 3), -77) + arg1.substring(var7 + 2);
                                }
                            }
                            arg1 = arg1.substring(0, var6) + class155.method1077(class241.method1708(-107, arg2, 2), 117) + arg1.substring(var6 + 2);
                        }
                    }
                    arg1 = arg1.substring(0, var5) + class155.method1077(class241.method1708(39, arg2, 1), -114) + arg1.substring(var5 + 2);
                }
            }
            arg1 = arg1.substring(0, var4) + class155.method1077(class241.method1708(-106, arg2, 0), 68) + arg1.substring(var4 + 2);
        }
    }
}
