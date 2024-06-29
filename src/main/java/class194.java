import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class194 {

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "I")
    public int field2593 = 128;

    @OriginalMember(owner = "client!vda", name = "k", descriptor = "I")
    public int field2602 = 128;

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "I")
    public int field2596;

    @OriginalMember(owner = "client!vda", name = "m", descriptor = "I")
    public int field2604;

    @OriginalMember(owner = "client!vda", name = "j", descriptor = "I")
    public int field2601;

    @OriginalMember(owner = "client!vda", name = "h", descriptor = "I")
    public int field2599;

    @OriginalMember(owner = "client!vda", name = "g", descriptor = "I")
    public static int field2598 = 1;

    @OriginalMember(owner = "client!vda", name = "l", descriptor = "[I")
    public static int[] field2603 = new int[32];

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!vda", name = "f", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!vda", name = "i", descriptor = "I")
    public static int field2600;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vda", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field2605;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method1334(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2594++;
        if (arg2 != -8) {
            method1338(-117);
        }
        if (arg6 < 0 || arg0 < 0 || arg6 >= (class597.field8132 - 1) || class628.field8800 - 1 <= arg0) {
            return;
        }
        if (class626.field8501 == null) {
            return;
        }
        if (arg3 != 0) {
            if (arg3 == 1) {
                class392 var8 = (class392) class471.method2772(arg5, arg6, arg0);
                if (var8 != null) {
                    if (!(var8 instanceof class4)) {
                        int var9 = var8.method31(arg2 - 23348);
                        if (arg1 != 4 && arg1 != 5) {
                            if (arg1 != 6) {
                                if (arg1 == 7) {
                                    class727.method4048(arg0, 4, (arg4 + 2 & 0x3) + 4, var9, arg2 + 7, arg6, arg7, arg3, arg5);
                                } else if (arg1 == 8) {
                                    class727.method4048(arg0, 4, arg4 + 4, var9, arg2 + 7, arg6, arg7, arg3, arg5);
                                    class727.method4048(arg0, 4, (arg4 + 2 & 0x3) + 4, var9, arg2 ^ 0x7, arg6, arg7, arg3, arg5);
                                    return;
                                }
                                return;
                            }
                            class727.method4048(arg0, 4, arg4 + 4, var9, arg2 + 7, arg6, arg7, arg3, arg5);
                            return;
                        }
                        class727.method4048(arg0, 4, arg4, var9, -1, arg6, arg7, arg3, arg5);
                        return;
                    }
                    ((class4) var8).field36.method3064(arg7, false);
                    return;
                }
            } else if (arg3 == 2) {
                class392 var10 = (class392) class771.method4264(arg5, arg6, arg0, field2605 == null ? (field2605 = method1340("he")) : field2605);
                if (var10 != null) {
                    if (arg1 == 11) {
                        arg1 = 10;
                    }
                    if (!(var10 instanceof class282)) {
                        class727.method4048(arg0, arg1, arg4, var10.method31(-23356), -1, arg6, arg7, arg3, arg5);
                        return;
                    }
                    ((class282) var10).field4158.method3064(arg7, false);
                    return;
                }
            } else if (arg3 == 3) {
                class392 var11 = (class392) class119.method988(arg5, arg6, arg0);
                if (var11 == null) {
                    return;
                }
                if (var11 instanceof class518) {
                    ((class518) var11).field7087.method3064(arg7, false);
                    return;
                }
                class727.method4048(arg0, arg1, arg4, var11.method31(arg2 ^ 0x5B3C), -1, arg6, arg7, arg3, arg5);
            } else {
                return;
            }
            return;
        }
        class392 var12 = (class392) class94.method752(arg5, arg6, arg0);
        class392 var13 = (class392) class56.method404(arg5, arg6, arg0);
        if (var12 != null && arg1 != 2) {
            if (var12 instanceof class8) {
                ((class8) var12).field100.method3064(arg7, false);
            } else {
                class727.method4048(arg0, arg1, arg4, var12.method31(-23356), -1, arg6, arg7, arg3, arg5);
            }
        }
        if (var13 == null) {
            return;
        }
        if (var13 instanceof class8) {
            ((class8) var13).field100.method3064(arg7, false);
            return;
        }
        class727.method4048(arg0, arg1, arg4, var13.method31(-23356), -1, arg6, arg7, arg3, arg5);
        return;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Laj;II)Leia;")
    public static final class255 method1335(class333 arg0, int arg1, int arg2) {
        field2600++;
        if (arg1 != -5707) {
            field2598 = -10;
        }
        byte[] var3 = arg0.method2114(arg2, false);
        return var3 == null ? null : new class255(var3);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lvda;B)V")
    public final void method1336(class194 arg0, byte arg1) {
        this.field2602 = arg0.field2602;
        this.field2604 = arg0.field2604;
        this.field2596 = arg0.field2596;
        field2595++;
        if (arg1 == -41) {
            this.field2601 = arg0.field2601;
            this.field2593 = arg0.field2593;
            this.field2599 = arg0.field2599;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Z)Lvda;")
    public final class194 method1337(boolean arg0) {
        field2597++;
        if (arg0) {
            method1334(-13, -70, (byte) -36, -29, -42, 7, 45, 84);
        }
        return new class194(this.field2596, this.field2593, this.field2602, this.field2599, this.field2604, this.field2601);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V")
    public static void method1338(int arg0) {
        if (arg0 > 61) {
            field2603 = null;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1339(int arg0, String arg1) {
        field2592++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var2 < var3 && class501.method2900((byte) 123, arg1.charAt(var2))) {
            var2++;
        }
        while (var2 < var3 && class501.method2900((byte) 122, arg1.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class418.method2579(arg0 - 9417, var7)) {
                char var8 = class782.method4318((byte) 109, var7);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (arg0 != 18123) {
            return null;
        } else if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(I)V")
    public class194(int arg0) {
        this.field2596 = arg0;
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(IIIIII)V")
    private class194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2604 = arg4;
        this.field2601 = arg5;
        this.field2599 = arg3;
        this.field2596 = arg0;
        this.field2593 = arg1;
        this.field2602 = arg2;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1340(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2603[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
