import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class235 {

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "Lob;")
    public static class131 field3766 = new class131(5000);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Ldl;")
    public static class123 field3767;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3773;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "[[B")
    public static byte[][] field3770;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "[[[I")
    public static int[][][] field3772;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lbd;IIII)V")
    public static final void method1593(class186 arg0, int arg1, int arg2, int arg3, int arg4) {
        field3768++;
        if (class149.field2227 == arg0 || class245.field3920 >= 400) {
            return;
        }
        String var11;
        if (arg0.field2926 == 0) {
            boolean var5 = true;
            if (class149.field2227.field2940 != -1 && arg0.field2940 != -1) {
                int var6 = arg0.field2940 <= class149.field2227.field2940 ? arg0.field2940 : class149.field2227.field2940;
                int var7 = arg0.field2917 < class149.field2227.field2917 ? class149.field2227.field2917 : arg0.field2917;
                int var8 = var7 * 10 / 100 + var6 + 5;
                int var9 = class149.field2227.field2917 - arg0.field2917;
                if (var9 < 0) {
                    var9 = -var9;
                }
                if (var8 < var9) {
                    var5 = false;
                }
            }
            String var10 = class80.field1151 == 1 ? class35.field450 : class241.field3861;
            if (arg0.field2917 >= arg0.field2930) {
                var11 = arg0.method1291(16) + (var5 ? class186.method1294(class149.field2227.field2917, arg0.field2917, 3930) : "<col=ffffff>") + " (" + var10 + arg0.field2917 + ")";
            } else {
                var11 = arg0.method1291(16) + (var5 ? class186.method1294(class149.field2227.field2917, arg0.field2917, 3930) : "<col=ffffff>") + " (" + var10 + arg0.field2917 + "+" + (arg0.field2930 - arg0.field2917) + ")";
            }
        } else {
            var11 = arg0.method1291(16) + " (" + class16.field189 + arg0.field2926 + ")";
        }
        if (class66.field921 == 1) {
            class244.method1647(class218.field3547, 0, arg1, class68.field956, arg3, (long) arg4, (short) 12, class53.field736 + " -> <col=ffffff>" + var11);
            class125.field1861++;
        } else if (!class45.field572) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class84.field1318[var12] != null) {
                    class249.field3985++;
                    short var13 = 0;
                    if (class80.field1151 == 0 && class84.field1318[var12].equalsIgnoreCase(class262.field4238)) {
                        if (class149.field2227.field2917 < arg0.field2917) {
                            var13 = 2000;
                        }
                        if (class149.field2227.field2936 != 0 && arg0.field2936 != 0) {
                            if (class149.field2227.field2936 == arg0.field2936) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class105.field1625[var12]) {
                        var13 = 2000;
                    }
                    boolean var14 = false;
                    short var15 = class250.field4011[var12];
                    short var16 = (short) (var13 + var15);
                    class244.method1647(class84.field1318[var12], 0, arg1, class8.field119[var12], arg3, (long) arg4, var16, "<col=ffffff>" + var11);
                }
            }
        } else if ((class207.field3238 & 0x8) != 0) {
            class244.method1647(class30.field399, 0, arg1, class23.field291, arg3, (long) arg4, (short) 1, class155.field2307 + " -> <col=ffffff>" + var11);
            class203.field3172++;
        }
        for (int var17 = 0; var17 < class245.field3920; var17++) {
            if (class2.field21[var17] == 49) {
                class19.field225[var17] = "<col=ffffff>" + var11;
                break;
            }
        }
        if (arg2 > -30) {
            field3766 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIII)I")
    public static final int method1594(int arg0, int arg1, int arg2, int arg3) {
        field3771++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg2;
        }
        if (arg3 < 69) {
            method1598((String) null, (byte) -89);
        }
        if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 & 0x3;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg6;
            arg6 = var8;
        }
        field3769++;
        if (arg1 != -3) {
            method1594(25, 38, 12, 27);
        }
        if (var7 == 0) {
            return arg2;
        } else if (var7 == 1) {
            return 7 + 1 - arg4 - arg0;
        } else if (var7 == 2) {
            return 1 + 7 - (arg6 + arg2);
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method1596(int arg0) {
        field3767 = null;
        field3772 = null;
        field3770 = null;
        int var1 = -40 % ((-arg0 - 54) / 47);
        field3773 = null;
        field3766 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/String;Lef;I)Ljava/lang/String;")
    public static final String method1597(String arg0, class214 arg1, int arg2) {
        field3764++;
        if (arg2 >= -121) {
            field3772 = null;
        }
        if (arg0.indexOf("%") == -1) {
            return arg0;
        }
        while (true) {
            int var3 = arg0.indexOf("%1");
            if (var3 == -1) {
                while (true) {
                    int var4 = arg0.indexOf("%2");
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg0.indexOf("%3");
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg0.indexOf("%4");
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg0.indexOf("%5");
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg0.indexOf("%dns");
                                                    if (var8 == -1) {
                                                        return arg0;
                                                    }
                                                    String var9 = "";
                                                    if (class107.field1653 != null) {
                                                        if (class107.field1653.field3249 == null) {
                                                            var9 = class147.method971(class107.field1653.field3245, -125);
                                                        } else {
                                                            var9 = (String) class107.field1653.field3249;
                                                        }
                                                    }
                                                    arg0 = arg0.substring(0, var8) + var9 + arg0.substring(var8 + 4);
                                                }
                                            }
                                            arg0 = arg0.substring(0, var7) + class34.method269(class204.method1399((byte) -61, 4, arg1), 250) + arg0.substring(var7 + 2);
                                        }
                                    }
                                    arg0 = arg0.substring(0, var6) + class34.method269(class204.method1399((byte) -61, 3, arg1), 250) + arg0.substring(var6 + 2);
                                }
                            }
                            arg0 = arg0.substring(0, var5) + class34.method269(class204.method1399((byte) -61, 2, arg1), 250) + arg0.substring(var5 + 2);
                        }
                    }
                    arg0 = arg0.substring(0, var4) + class34.method269(class204.method1399((byte) -61, 1, arg1), 250) + arg0.substring(var4 + 2);
                }
            }
            arg0 = arg0.substring(0, var3) + class34.method269(class204.method1399((byte) -61, 0, arg1), 250) + arg0.substring(var3 + 2);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1598(String arg0, byte arg1) {
        field3765++;
        int var2 = 48 / ((arg1 + 61) / 63);
        class195.method1353(101, false);
        class78.method527(arg0, 185);
    }
}
