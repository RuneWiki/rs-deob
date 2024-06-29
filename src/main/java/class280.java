import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class280 extends class181 {

    @OriginalMember(owner = "client!od", name = "w", descriptor = "J")
    public long field4300;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field4297 = new String[500];

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field4307 = -1;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "Ljava/lang/String;")
    public static String field4302 = "K";

    @OriginalMember(owner = "client!od", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4298 = "cyan:";

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "Lpk;")
    public static class237 field4305;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public static final boolean method1859(String arg0, boolean arg1) {
        field4301++;
        if (arg0 == null) {
            return false;
        }
        int var2 = 0;
        if (!arg1) {
            field4298 = null;
        }
        while (class3.field36 > var2) {
            if (arg0.equalsIgnoreCase(class22.field368[var2])) {
                return true;
            }
            var2++;
        }
        return arg0.equalsIgnoreCase(class185.field2687.field3488);
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
    public static void method1860(int arg0) {
        if (arg0 <= 107) {
            method1863(false, false);
        }
        field4302 = null;
        field4305 = null;
        field4297 = null;
        field4298 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1861(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4303++;
        if (arg7 >= 1 && arg1 >= 1 && arg7 <= 102 && arg1 <= 102) {
            if (!class101.method741(-6425) && (class247.field3844[0][arg7][arg1] & 0x2) == 0) {
                int var8 = arg5;
                if ((class247.field3844[arg5][arg7][arg1] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class51.field832 != var8) {
                    return;
                }
            }
            int var9 = arg5;
            if (arg5 < 3 && (class247.field3844[1][arg7][arg1] & 0x2) == 2) {
                var9 = arg5 + 1;
            }
            class152.method1035(class243.field3763[arg5], arg5, -125, arg7, var9, arg1, arg3);
            if (arg6 >= 0) {
                boolean var10 = class127.field1867;
                class127.field1867 = true;
                class177.method1169(true, arg6, false, arg1, arg2, arg7, false, arg4, arg5, var9, class243.field3763[arg5]);
                class127.field1867 = var10;
            }
        }
        if (arg0 != -2278) {
            field4305 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lsc;")
    public static final class18 method1862(Throwable arg0, String arg1) {
        field4304++;
        class18 var2;
        if (arg0 instanceof class18) {
            var2 = (class18) arg0;
            var2.field321 = var2.field321 + ' ' + arg1;
        } else {
            var2 = new class18(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZZ)I")
    public static final int method1863(boolean arg0, boolean arg1) {
        long var2 = class257.method1736(14361);
        field4296++;
        for (class280 var4 = arg1 ? (class280) class47.field797.method315((byte) -71) : (class280) class47.field797.method310(-68); var4 != null; var4 = (class280) class47.field797.method310(-87)) {
            if ((var4.field4300 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field4300 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field2628;
                    class166.field2447[var5] = class234.field3607[var5];
                    var4.method1193(110);
                    return var5;
                }
                var4.method1193(124);
            }
        }
        if (arg0) {
            return -1;
        } else {
            return -16;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III)J")
    public static final long method1864(int arg0, int arg1, int arg2) {
        class201 var3 = class3.field40[arg0][arg1][arg2];
        return var3 == null || var3.field3033 == null ? 0L : var3.field3033.field534;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
    public class280() {
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(J)V")
    public class280(long arg0) {
        this.field4300 = arg0;
    }
}
