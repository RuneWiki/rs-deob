import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class253 extends class326 {

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field4017 = 0;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "Z")
    public static boolean field4016 = false;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field4021 = 0;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    public static int field4023 = 0;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "Lnm;")
    public static class221 field4020;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V", line = 8)
    public static void method1792(int arg0) {
        if (arg0 <= 59) {
            field4023 = -91;
        }
        field4020 = null;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V", line = 32)
    public static final void method1793(int arg0) {
        class290.field4817.method644((byte) -44);
        field4019++;
        int var1 = -13 / ((-arg0 - 79) / 32);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BLjava/lang/String;Lsi;)Ljava/lang/String;", line = 48)
    public static final String method1794(byte arg0, String arg1, class264 arg2) {
        field4015++;
        if (arg1.indexOf("%") != -1) {
            label57: while (true) {
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
                                                            break label57;
                                                        }
                                                        String var9 = "";
                                                        if (class249.field3966 != null) {
                                                            if (class249.field3966.field2538 == null) {
                                                                var9 = class204.method1394(class249.field3966.field2541, 0);
                                                            } else {
                                                                var9 = (String) class249.field3966.field2538;
                                                            }
                                                        }
                                                        arg1 = arg1.substring(0, var8) + var9 + arg1.substring(var8 + 4);
                                                    }
                                                }
                                                arg1 = arg1.substring(0, var7) + class94.method626(class129.method841((byte) -61, arg2, 4), true) + arg1.substring(var7 + 2);
                                            }
                                        }
                                        arg1 = arg1.substring(0, var6) + class94.method626(class129.method841((byte) -48, arg2, 3), true) + arg1.substring(var6 + 2);
                                    }
                                }
                                arg1 = arg1.substring(0, var5) + class94.method626(class129.method841((byte) -61, arg2, 2), true) + arg1.substring(var5 + 2);
                            }
                        }
                        arg1 = arg1.substring(0, var4) + class94.method626(class129.method841((byte) -60, arg2, 1), true) + arg1.substring(var4 + 2);
                    }
                }
                arg1 = arg1.substring(0, var3) + class94.method626(class129.method841((byte) -26, arg2, 0), true) + arg1.substring(var3 + 2);
            }
        }
        if (arg0 >= -125) {
            field4017 = 75;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V", line = 139)
    public static final void method1795(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 2) {
            field4023 = 92;
        }
        field4018++;
        if (arg4 >= class33.field505 && class278.field4586 >= arg4) {
            int var5 = class34.method288(3, arg1, class341.field5494, class196.field3001);
            int var6 = class34.method288(3, arg2, class341.field5494, class196.field3001);
            class266.method1878(arg4, var6, var5, arg3, (byte) 89);
        }
    }
}
