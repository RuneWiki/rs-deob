import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public abstract class class183 {

    @OriginalMember(owner = "client!b", name = "a", descriptor = "[I")
    public static int[] field2496 = new int[25];

    @OriginalMember(owner = "client!b", name = "d", descriptor = "[I")
    public static int[] field2499 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!b", name = "b", descriptor = "Lkn;")
    public static class442 field2497 = new class442("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Lem;")
    public static class123 field2498;

    // $FF: synthetic field
    @OriginalMember(owner = "client!b", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field2501;

    // $FF: synthetic method
    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1199(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IBLuo;IIIIII)V", line = 9)
    public static final void method1196(int arg0, byte arg1, class345 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 != 15) {
            method1196(-63, (byte) 87, (class345) null, 14, -81, 39, -10, 97, 70);
        }
        field2500++;
        class193 var9 = (class193) class244.method1655(arg5, arg0, arg8);
        if (var9 != null) {
            class64 var10 = class375.method2395((byte) 82, var9.method689((byte) -83));
            int var11 = var9.method672(17011) & 0x3;
            int var12 = var9.method684(arg1 - 13741);
            if (var10.field871 == -1) {
                int var13 = arg7;
                if (var10.field922 > 0) {
                    var13 = arg4;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg2.method2181(4, arg1 ^ 0xFFFFA3C4, var13, arg6, arg3);
                    } else if (var11 == 1) {
                        arg2.method2189((byte) -101, 4, arg6, var13, arg3);
                    } else if (var11 == 2) {
                        arg2.method2181(4, -23605, var13, arg6, arg3 + 3);
                    } else if (var11 == 3) {
                        arg2.method2189((byte) -115, 4, arg6 + 3, var13, arg3);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg2.method2182(arg3, arg6, 1, var13, -118, 1);
                    } else if (var11 == 1) {
                        arg2.method2182(arg3 + 3, arg6, 1, var13, arg1 ^ 0xFFFFFF99, 1);
                    } else if (var11 == 2) {
                        arg2.method2182(arg3 + 3, arg6 - -3, 1, var13, arg1 ^ 0xFFFFFFA7, 1);
                    } else if (var11 == 3) {
                        arg2.method2182(arg3, arg6 + 3, 1, var13, 45, 1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg2.method2189((byte) -107, 4, arg6, var13, arg3);
                    } else if (var11 == 1) {
                        arg2.method2181(4, -23605, var13, arg6, arg3 + 3);
                    } else if (var11 == 2) {
                        arg2.method2189((byte) -93, 4, arg6 + 3, var13, arg3);
                    } else if (var11 == 3) {
                        arg2.method2181(4, -23605, var13, arg6, arg3);
                    }
                }
            } else {
                class280.method1833(var11, arg3, arg6, (byte) -67, arg2, var10);
            }
        }
        class193 var14 = (class193) class139.method952(arg5, arg0, arg8, field2501 == null ? (field2501 = method1199("sc")) : field2501);
        if (var14 != null) {
            class64 var15 = class375.method2395((byte) 25, var14.method689((byte) -83));
            int var16 = var14.method672(17011) & 0x3;
            int var17 = var14.method684(-13726);
            if (var15.field871 != -1) {
                class280.method1833(var16, arg3, arg6, (byte) 49, arg2, var15);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field922 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg2.method2187(arg6 + 3, arg6, arg3 + 3, arg3, (byte) -113, var18);
                } else {
                    arg2.method2187(arg6, arg6 + 3, arg3 + 3, arg3, (byte) 57, var18);
                }
            }
        }
        class193 var19 = (class193) class19.method259(arg5, arg0, arg8);
        if (var19 == null) {
            return;
        }
        class64 var20 = class375.method2395((byte) 57, var19.method689((byte) -83));
        int var21 = var19.method672(17011) & 0x3;
        if (var20.field871 != -1) {
            class280.method1833(var21, arg3, arg6, (byte) -96, arg2, var20);
            return;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V", line = 149)
    public static void method1197(byte arg0) {
        if (arg0 != -51) {
            field2498 = null;
        }
        field2499 = null;
        field2497 = null;
        field2498 = null;
        field2496 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public abstract void method1194(byte arg0);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)I")
    public abstract int method1195(int arg0, byte arg1);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)J")
    public abstract long method1198(int arg0);
}
