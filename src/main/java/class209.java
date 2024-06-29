import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class209 extends class260 {

    @OriginalMember(owner = "client!ot", name = "m", descriptor = "I")
    private int field2947;

    @OriginalMember(owner = "client!ot", name = "v", descriptor = "I")
    private int field2956;

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "I")
    private int field2943;

    @OriginalMember(owner = "client!ot", name = "u", descriptor = "I")
    private int field2955;

    @OriginalMember(owner = "client!ot", name = "r", descriptor = "Lbv;")
    public static class567 field2952 = new class567("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!ot", name = "k", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!ot", name = "l", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!ot", name = "n", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!ot", name = "o", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!ot", name = "p", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!ot", name = "q", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!ot", name = "s", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!ot", name = "t", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!ot", name = "w", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IBI)V")
    public final void method32(int arg0, byte arg1, int arg2) {
        ++field2948;
        int var4 = this.field2943 * arg0 >> 12;
        int var5 = this.field2956 * arg0 >> 12;
        int var6 = this.field2955 * arg2 >> 12;
        if (arg1 < 6) {
            method1339(-107, -112);
        }
        int var7 = this.field2947 * arg2 >> 12;
        class399.method2440((byte) -35, super.field3778, super.field3782, var4, var5, var7, super.field3783, var6);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(III)V")
    public final void method30(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            ++field2944;
        }
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(IIIIIII)V")
    public class209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2947 = arg3;
        this.field2956 = arg2;
        this.field2943 = arg0;
        this.field2955 = arg1;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZLjava/awt/Component;)Laq;")
    public static final class645 method1336(boolean arg0, Component arg1) {
        if (arg0) {
            method1339(84, 82);
        }
        ++field2951;
        return new class361(arg1);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IB)I")
    public static final int method1337(int arg0, byte arg1) {
        if (arg1 < 121) {
            field2952 = null;
        }
        ++field2946;
        if (arg0 != 6407 && arg0 != 34843 && arg0 != 34837) {
            if (arg0 != 6408 && arg0 != 34842 && ~arg0 != -34837) {
                if (~arg0 != -6407 && arg0 != 34844) {
                    if (~arg0 != -6410 && ~arg0 != -34847) {
                        if (~arg0 != -6411 && ~arg0 != -34848) {
                            if (arg0 == 6402) {
                                return 6402;
                            } else {
                                throw new IllegalArgumentException("");
                            }
                        } else {
                            return 6410;
                        }
                    } else {
                        return 6409;
                    }
                } else {
                    return 6406;
                }
            } else {
                return 6408;
            }
        } else {
            return 6407;
        }
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)V")
    public static void method1338(int arg0) {
        field2952 = null;
        if (arg0 != 2027846796) {
            field2952 = null;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)I")
    public static final int method1339(int arg0, int arg1) {
        ++field2950;
        if (arg0 != 201943431) {
            field2957 = -114;
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(III)V")
    public static final void method1340(int arg0, int arg1, int arg2) {
        ++field2949;
        if (arg0 != 34843) {
            method1336(true, (Component) null);
        }
        if (class78.field1412 != class640.field9282) {
            if (!class233.method1521(arg2, (byte) -128, 0, -3, 0, arg1, 1, false, 1)) {
                class233.method1521(arg2, (byte) -123, 0, -2, 0, arg1, 1, false, 1);
            }
        } else if (!class233.method1521(arg2, (byte) -99, 0, -2, 0, arg1, 1, false, 1)) {
            class233.method1521(arg2, (byte) -112, 0, -3, 0, arg1, 1, false, 1);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIII)V")
    public static final void method1341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2954;
        int var6 = class34.method306(class222.field3350, arg4, class409.field6071, (byte) 85);
        int var7 = class34.method306(class222.field3350, arg0, class409.field6071, (byte) 111);
        int var8 = class34.method306(class183.field2638, arg1, class268.field3911, (byte) 87);
        int var9 = class34.method306(class183.field2638, arg3, class268.field3911, (byte) 84);
        int var10 = var6;
        if (arg2 <= 25) {
            method1341(-66, 74, 56, -14, -17, 112);
        }
        while (~var10 >= ~var7) {
            class614.method3490(arg5, var8, -94, class495.field6944[var10], var9);
            ++var10;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZII)V")
    public final void method33(boolean arg0, int arg1, int arg2) {
        ++field2945;
        int var4 = this.field2943 * arg1 >> 12;
        int var5 = this.field2956 * arg1 >> 12;
        if (arg0) {
            this.field2956 = -87;
        }
        int var6 = this.field2955 * arg2 >> 12;
        int var7 = this.field2947 * arg2 >> 12;
        class32.method297(var4, var6, (byte) 123, var5, var7, super.field3778);
    }
}
