import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public abstract class class184 {

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "[I")
    public static int[] field2985 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "[I")
    public static int[] field2989 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "Z")
    public static boolean field2992 = false;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIII)V")
    public abstract void method226(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
    public static void method1204(boolean arg0) {
        if (arg0) {
            field2992 = false;
        }
        field2985 = null;
        field2989 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLjava/lang/String;Leh;)I")
    public static final int method1205(byte arg0, String arg1, class101 arg2) {
        if (arg0 < 63) {
            method1204(false);
        }
        int var3 = arg2.field1762;
        byte[] var4 = class23.method163(arg1, (byte) 55);
        arg2.method672(var4.length, (byte) 92);
        arg2.field1762 += class252.field4132.method1010(var4.length, (byte) 119, arg2.field1730, 0, arg2.field1762, var4);
        field2986++;
        return arg2.field1762 - var3;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ltb;IIIZ)V")
    public void method1206(class184 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2993++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIIIJILgh;)V")
    public abstract void method120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class32 arg10);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public static final void method1207(byte arg0) {
        if (class154.field2576 != null) {
            class154.field2576.method1710(arg0 + 74);
        }
        field2991++;
        if (class259.field4243 != null) {
            class259.field4243.method1710(0);
        }
        class61.method382(2, class61.field1069, 22050, (byte) 9);
        class154.field2576 = class89.method576(arg0 - 19, class127.field2238, 0, class118.field2099, 22050);
        class154.field2576.method1714(50, class114.field2051);
        class259.field4243 = class89.method576(-91, class127.field2238, 1, class118.field2099, 2048);
        class259.field4243.method1714(50, class10.field149);
        if (arg0 != -74) {
            field2994 = -51;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()I")
    public abstract int method110();

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIILdl;IZI)V")
    public static final void method1208(int arg0, int arg1, int arg2, int arg3, class46 arg4, int arg5, boolean arg6, int arg7) {
        if (class239.field3933) {
            class35.field487 = 32;
        } else {
            class35.field487 = 0;
        }
        field2996++;
        class239.field3933 = arg6;
        if (class69.field1131 != 0) {
            if (arg2 >= arg5 && arg2 < (arg5 + 16) && arg7 >= arg1 && (arg1 + 16) > arg7) {
                arg4.field644 -= 4;
                class79.method516(-373, arg4);
            } else if (arg5 <= arg2 && arg5 + 16 > arg2 && arg3 + arg1 - 16 <= arg7 && arg1 + arg3 > arg7) {
                arg4.field644 += 4;
                class79.method516(-373, arg4);
            } else if (arg5 - class35.field487 <= arg2 && arg2 < (class35.field487 + arg5 + 16) && arg7 >= arg1 + 16 && (arg1 + arg3 - 16) > arg7) {
                int var8 = (arg3 - 32) * arg3 / arg0;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg7 - arg1 - var8 / 2 - 16;
                int var10 = arg3 - var8 - 32;
                arg4.field644 = (arg0 - arg3) * var9 / var10;
                class79.method516(-373, arg4);
                class239.field3933 = true;
            }
        }
        if (class25.field387 == 0) {
            return;
        }
        int var11 = arg4.field701;
        if ((arg5 - var11) <= arg2 && arg7 >= arg1 && arg5 + 16 > arg2 && arg7 <= (arg1 + arg3)) {
            arg4.field644 += class25.field387 * 45;
            class79.method516(-373, arg4);
            return;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "()Z")
    public boolean method1209() {
        field2990++;
        return false;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)Ltb;")
    public class184 method1210(int arg0, int arg1, int arg2) {
        field2988++;
        return this;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static final void method1211(int arg0) {
        if (arg0 != -23839) {
            method1208(-14, 103, 4, 39, (class46) null, 101, true, -8);
        }
        int var1 = class183.method1201(118);
        field2997++;
        if (var1 == 0) {
            class158.field2648 = null;
            class169.method1145((byte) -81, 0);
        } else if (var1 == 1) {
            class262.method1741((byte) 0, true);
            class169.method1145((byte) -79, 512);
            if (class229.field3862 != null) {
                class194.method1272(-108);
                return;
            }
        } else {
            class262.method1741((byte) (class71.field1166 - 4 & 0xFF), true);
            class169.method1145((byte) -120, 2);
            return;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V")
    public static final void method1212(byte arg0) {
        if (arg0 != -70) {
            field2985 = null;
        }
        field2987++;
        for (int var1 = 0; var1 < class292.field4664; var1++) {
            int var2 = class60.field1051[var1];
            class288 var3 = class105.field1874[var2];
            int var4 = class248.field4058.method669((byte) 36);
            if ((var4 & 0x80) != 0) {
                var4 += class248.field4058.method669((byte) 36) << 8;
            }
            class163.method1102(var2, var4, (byte) 91, var3);
        }
    }
}
