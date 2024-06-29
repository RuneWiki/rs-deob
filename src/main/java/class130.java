import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public abstract class class130 {

    @OriginalMember(owner = "client!m", name = "c", descriptor = "Lqe;")
    public static class179 field2363 = class206.method1380("sl_flags", (byte) 92);

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field2364 = 255;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Lqe;")
    public static class179 field2366 = class206.method1380("Einloggen", (byte) 56);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static final void method827(int arg0) {
        field2362++;
        class48 var1 = class98.field1828;
        synchronized (class98.field1828) {
            class239.field4399++;
            if (arg0 == 1) {
                class6.field137 = class96.field1820;
                if (class95.field1785 < 0) {
                    for (int var2 = 0; var2 < 112; var2++) {
                        class84.field1618[var2] = false;
                    }
                    class95.field1785 = class157.field2852;
                } else {
                    while (class95.field1785 != class157.field2852) {
                        int var3 = class205.field3837[class157.field2852];
                        class157.field2852 = class157.field2852 + 1 & 0x7F;
                        if (var3 >= 0) {
                            class84.field1618[var3] = true;
                        } else {
                            class84.field1618[~var3] = false;
                        }
                    }
                }
                class96.field1820 = class81.field1555;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)I")
    public static final int method828(int arg0, int arg1) {
        field2361++;
        int var2 = arg1 * 6 - 61440;
        if (arg0 == 918232524) {
            int var3 = (arg1 * var2 >> 12) + 40960;
            int var4 = (arg1 * arg1 >> 12) * arg1 >> 12;
            return var3 * var4 >> 12;
        } else {
            return -94;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
    public static void method829(boolean arg0) {
        field2363 = null;
        field2366 = null;
        if (!arg0) {
            method829(false);
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
    public abstract void method572(int arg0);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)I")
    public abstract int method573(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IBI)I")
    public static final int method830(int arg0, byte arg1, int arg2) {
        if (arg1 != -74) {
            return 97;
        }
        int var3 = 0;
        field2365++;
        while (arg0 > 0) {
            arg0--;
            var3 = arg2 & 0x1 | var3 << 1;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIILrb;IJIIII)Z")
    public static final boolean method831(int arg0, int arg1, int arg2, int arg3, class186 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class239.method1548(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }
}
