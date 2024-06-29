import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class23 {

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Leh;")
    private static class47 field445 = class195.method1282((byte) -4, "Loaded input handler");

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Leh;")
    public static class47 field448 = class195.method1282((byte) -4, ")4lang)4de");

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Leh;")
    private static class47 field450 = class195.method1282((byte) -4, "Attack");

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Leh;")
    public static class47 field446 = field450;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Leh;")
    public static class47 field453 = class195.method1282((byte) -4, "scape main");

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Leh;")
    public static class47 field455 = field445;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "Leh;")
    public static class47 field461 = class195.method1282((byte) -4, "(U0a )2 via: ");

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field457 = 0;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "[[[I")
    public static int[][][] field463 = new int[4][13][13];

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "Leh;")
    public static class47 field462 = class195.method1282((byte) -4, "T");

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)Lgf;")
    public static final class61 method224(int arg0, int arg1) {
        field460++;
        if (arg1 != 484111152) {
            return null;
        }
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class51.field986[var2] == null || class51.field986[var2][var3] == null) {
            boolean var4 = class57.method493(var2, 2093369712);
            if (!var4) {
                return null;
            }
        }
        return class51.field986[var2][var3];
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field456++;
        if (arg4 >= 1 && arg1 >= 1 && arg4 <= 102 && arg1 <= 102) {
            if (class204.field4029 && class196.field3827 != arg2) {
                return;
            }
            long var8 = 0L;
            if (arg0 == 0) {
                var8 = class92.method743(arg2, arg4, arg1);
            }
            boolean var10 = true;
            boolean var11 = false;
            if (arg0 == 1) {
                var8 = class53.method471(arg2, arg4, arg1);
            }
            if (arg0 == 2) {
                var8 = class197.method1296(arg2, arg4, arg1);
            }
            if (arg0 == 3) {
                var8 = class85.method703(arg2, arg4, arg1);
            }
            boolean var12 = false;
            if (var8 != 0L) {
                int var13 = (int) var8 >> 14 & 0x1F;
                int var14 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
                int var15 = (int) var8 >> 20 & 0x3;
                if (arg0 == 0) {
                    class98.method797(arg2, arg4, arg1);
                    class202 var16 = class99.method806(0, var14);
                    if (var16.field3969 != 0) {
                        class54.field1043[arg2].method323(arg4, var16.field3962, var13, -119, var15, arg1);
                    }
                }
                if (arg0 == 1) {
                    class96.method772(arg2, arg4, arg1);
                }
                if (arg0 == 2) {
                    class84.method700(arg2, arg4, arg1);
                    class202 var17 = class99.method806(0, var14);
                    if (var17.field3980 + arg4 > 103 || var17.field3980 + arg1 > 103 || arg4 + var17.field3949 > 103 || var17.field3949 + arg1 > 103) {
                        return;
                    }
                    if (var17.field3969 != 0) {
                        class54.field1043[arg2].method310(arg4, -2, var17.field3949, var17.field3980, arg1, var17.field3962, var15);
                    }
                }
                if (arg0 == 3) {
                    class141.method1016(arg2, arg4, arg1);
                    class202 var18 = class99.method806(arg5 ^ 0x67, var14);
                    if (var18.field3969 == 1) {
                        class54.field1043[arg2].method318((byte) -78, arg1, arg4);
                    }
                }
            }
            if (arg7 >= 0) {
                int var19 = arg2;
                if (arg2 < 3 && (class182.field3490[1][arg4][arg1] & 0x2) == 2) {
                    var19 = arg2 + 1;
                }
                class202.method1321(var19, arg7, class54.field1043[arg2], arg3, arg2, 18414, arg4, arg6, arg1);
            }
        }
        if (arg5 != 103) {
            field453 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lah;II)Z")
    public static final boolean method226(class9 arg0, int arg1, int arg2) {
        field454++;
        byte[] var3 = arg0.method72(arg1, (byte) -98);
        if (var3 == null) {
            return false;
        } else if (arg2 == 2) {
            class82.method694(true, var3);
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static final void method227(int arg0) {
        if (class147.field2881 != null) {
            class27 var1 = class147.field2881;
            synchronized (class147.field2881) {
                class147.field2881 = null;
            }
        }
        field459++;
        if (arg0 != 6547) {
            field461 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method228(String arg0, int arg1) throws ClassNotFoundException {
        field452++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        }
        if (arg1 != 4809) {
            method226(null, 36, -114);
        }
        if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public static final void method229(int arg0) {
        if (arg0 < 12) {
            return;
        }
        for (int var1 = -1; var1 < class130.field2575; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class146.field2853[var1];
            }
            class32 var3 = class40.field795[var2];
            if (var3 != null) {
                class2.method5(var3, (byte) -118, 1);
            }
        }
        field449++;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
    public static final void method230(int arg0) {
        field444++;
        class76.field1643++;
        class60.field1174.method657(arg0 + 28181, 140);
        class60.field1174.method600(arg0 ^ 0x7F58, 0L);
        if (arg0 != 1) {
            method225(8, -13, -2, -17, -99, 97, 13, -113);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
    public static void method231(boolean arg0) {
        field455 = null;
        field462 = null;
        field450 = null;
        field445 = null;
        if (arg0) {
            field445 = null;
        }
        field453 = null;
        field461 = null;
        field446 = null;
        field448 = null;
        field463 = null;
    }
}
