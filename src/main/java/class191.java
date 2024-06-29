import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class191 extends class214 {

    @OriginalMember(owner = "client!el", name = "P", descriptor = "Z")
    public static boolean field2723 = true;

    @OriginalMember(owner = "client!el", name = "O", descriptor = "Ldu;")
    public static class479 field2722 = new class479();

    @OriginalMember(owner = "client!el", name = "S", descriptor = "[I")
    public static int[] field2726 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!el", name = "J", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!el", name = "K", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!el", name = "L", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!el", name = "M", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!el", name = "N", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!el", name = "Q", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!el", name = "R", descriptor = "Lom;")
    public static class110 field2725;

    // $FF: synthetic field
    @OriginalMember(owner = "client!el", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field2727;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1227(int arg0, String arg1) {
        field2724++;
        for (int var2 = 0; var2 < class468.field6561.length; var2++) {
            if (class468.field6561[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        if (arg0 != 10106) {
            field2725 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIZIII)V")
    public static final void method1228(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field2718++;
        if (arg7 >= 0 && arg3 >= 0 && class200.field2875 - 1 > arg7 && arg3 < (class422.field5811 - 1)) {
            if (class455.field6293 == null) {
                return;
            }
            if (arg5 == 0) {
                class278 var8 = (class278) class37.method309(arg6, arg7, arg3);
                class278 var9 = (class278) class184.method1204(arg6, arg7, arg3);
                if (var8 != null && arg0 != 2) {
                    if ((var8 instanceof class131)) {
                        ((class131) var8).field1852.method639(arg1, 116);
                    } else {
                        class347.method2070(arg7, arg5, arg0, var8.method211(arg4), arg2, (byte) 126, arg3, arg1, arg6);
                    }
                }
                if (var9 != null) {
                    if ((var9 instanceof class131)) {
                        ((class131) var9).field1852.method639(arg1, 115);
                    } else {
                        class347.method2070(arg7, arg5, arg0, var9.method211(true), arg2, (byte) -87, arg3, arg1, arg6);
                    }
                }
            } else if (arg5 == 1) {
                class278 var10 = (class278) class245.method1528(arg6, arg7, arg3);
                if (var10 != null) {
                    if ((var10 instanceof class24)) {
                        ((class24) var10).field441.method639(arg1, 119);
                    } else {
                        int var11 = var10.method211(arg4);
                        if (arg0 == 4 || arg0 == 5) {
                            class347.method2070(arg7, arg5, 4, var11, arg2, (byte) 83, arg3, arg1, arg6);
                        } else if (arg0 == 6) {
                            class347.method2070(arg7, arg5, 4, var11, arg2 + 4, (byte) 82, arg3, arg1, arg6);
                        } else if (arg0 == 7) {
                            class347.method2070(arg7, arg5, 4, var11, (arg2 + 2 & 0x3) + 4, (byte) -87, arg3, arg1, arg6);
                        } else if (arg0 == 8) {
                            class347.method2070(arg7, arg5, 4, var11, arg2 + 4, (byte) 89, arg3, arg1, arg6);
                            class347.method2070(arg7, arg5, 4, var11, (arg2 + 2 & 0x3) + 4, (byte) -100, arg3, arg1, arg6);
                        }
                    }
                }
            } else if (arg5 == 2) {
                class278 var13 = (class278) class75.method518(arg6, arg7, arg3, field2727 == null ? (field2727 = method1233("wk")) : field2727);
                if (var13 != null) {
                    if (arg0 == 11) {
                        arg0 = 10;
                    }
                    if (var13 instanceof class30) {
                        ((class30) var13).field492.method639(arg1, 117);
                    } else {
                        class347.method2070(arg7, arg5, arg0, var13.method211(true), arg2, (byte) -100, arg3, arg1, arg6);
                    }
                }
            } else if (arg5 == 3) {
                class278 var12 = (class278) class292.method1807(arg6, arg7, arg3);
                if (var12 != null) {
                    if ((var12 instanceof class119)) {
                        ((class119) var12).field1675.method639(arg1, 117);
                    } else {
                        class347.method2070(arg7, arg5, arg0, var12.method211(true), arg2, (byte) -82, arg3, arg1, arg6);
                    }
                }
            }
        }
        if (!arg4) {
            field2723 = false;
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
    public class191() {
        super(0, true);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BI)[I")
    public final int[] method14(byte arg0, int arg1) {
        field2717++;
        if (arg0 != 123) {
            this.method14((byte) -118, 42);
        }
        return class436.field5989;
    }

    @OriginalMember(owner = "client!el", name = "f", descriptor = "(I)V")
    public static void method1229(int arg0) {
        field2725 = null;
        field2726 = null;
        field2722 = null;
        if (arg0 < 29) {
            field2725 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "g", descriptor = "(I)V")
    public static final void method1230(int arg0) {
        if (arg0 > -119) {
            return;
        }
        field2720++;
        int[] var1 = new int[class58.field918.field692];
        int var2 = 0;
        for (int var3 = 0; var3 < class58.field918.field692; var3++) {
            class164 var5 = class58.field918.method344(var3, 31757);
            if (var5.field2350 >= 0 || var5.field2389 >= 0) {
                var1[var2++] = var3;
            }
        }
        class490.field6905 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class490.field6905[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(Z)Lji;")
    public static final class163 method1231(boolean arg0) {
        field2721++;
        if (class379.field5366 == null || class37.field633 == null) {
            return null;
        }
        class37.field633.method2580((byte) -98, class379.field5366);
        class163 var1 = (class163) class37.field633.method2581(true);
        if (var1 == null) {
            return null;
        } else {
            class442 var2 = class379.field5358.method85(var1.field2342, arg0);
            return var2 != null && var2.field6088 && var2.method2571(arg0, class379.field5360) ? var1 : class215.method1361(16);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IILms;)Ljava/lang/String;")
    public static final String method1232(int arg0, int arg1, class363 arg2) {
        if (arg0 != 735) {
            field2722 = null;
        }
        field2719++;
        if (!client.method2321(arg2).method470(arg1, 3021) && arg2.field5197 == null) {
            return null;
        } else if (arg2.field5196 == null || arg1 >= arg2.field5196.length || arg2.field5196[arg1] == null || arg2.field5196[arg1].trim().length() == 0) {
            return class443.field6112 ? "Hidden-" + arg1 : null;
        } else {
            return arg2.field5196[arg1];
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1233(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
