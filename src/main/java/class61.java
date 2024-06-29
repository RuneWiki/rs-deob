import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class61 extends class196 {

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
    public int field801 = 12800;

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "I")
    public int field806 = 12800;

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "I")
    public int field807 = -1;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "Z")
    public boolean field803 = true;

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "I")
    public int field815 = -1;

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
    public int field811 = 0;

    @OriginalMember(owner = "client!mg", name = "W", descriptor = "I")
    public int field824 = 0;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "Ljava/lang/String;")
    public String field814;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
    public int field818;

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "I")
    public int field810;

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "Ljava/lang/String;")
    public String field809;

    @OriginalMember(owner = "client!mg", name = "U", descriptor = "Lom;")
    public class156 field822;

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "I")
    public static int field821 = 0;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "Z")
    public static boolean field816 = false;

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "F")
    public static float field802;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!mg", name = "V", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!mg", name = "X", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "Llm;")
    public static class210 field819;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "Lf;")
    public static class329 field800;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "Lqb;")
    public static class89 field817;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(III)Z", line = 13)
    public final boolean method406(int arg0, int arg1, int arg2) {
        field799++;
        if (this.field806 > arg2 || arg2 > this.field811 || arg1 < this.field801 || this.field824 < arg1) {
            return false;
        }
        if (arg0 != 0) {
            this.field811 = -16;
        }
        for (class40 var4 = (class40) this.field822.method1109(-116); var4 != null; var4 = (class40) this.field822.method1115((byte) 108)) {
            if (var4.method273(arg2, arg1, 1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIZI)V", line = 223)
    public class61(String arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field814 = arg0;
        this.field803 = arg5;
        this.field818 = arg3;
        this.field810 = arg2;
        this.field815 = arg6;
        this.field809 = arg1;
        this.field807 = arg4;
        if (this.field815 == 255) {
            this.field815 = 0;
        }
        this.field822 = new class156();
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V", line = 42)
    public final void method407(boolean arg0) {
        this.field801 = 12800;
        field823++;
        this.field811 = 0;
        this.field806 = 12800;
        this.field824 = 0;
        for (class40 var2 = (class40) this.field822.method1109(-117); var2 != null; var2 = (class40) this.field822.method1115((byte) 111)) {
            if (this.field806 > var2.field493) {
                this.field806 = var2.field493;
            }
            if (var2.field490 < this.field801) {
                this.field801 = var2.field490;
            }
            if (this.field824 < var2.field484) {
                this.field824 = var2.field484;
            }
            if (var2.field485 > this.field811) {
                this.field811 = var2.field485;
            }
        }
        if (arg0) {
            field805 = -44;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BIIII)V", line = 82)
    public static final void method408(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -34) {
            field819 = (class210) null;
        }
        field808++;
        if (class157.field2357 <= arg4 && class184.field2761 >= arg4) {
            int var5 = class222.method1553(class166.field2494, (byte) -118, arg1, class185.field2769);
            int var6 = class222.method1553(class166.field2494, (byte) -69, arg2, class185.field2769);
            class202.method1383((byte) -34, arg4, arg3, var6, var5);
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V", line = 118)
    public static void method409(byte arg0) {
        if (arg0 != -86) {
            method408((byte) -28, -73, -32, 81, -47);
        }
        field800 = null;
        field819 = null;
        field817 = null;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)V", line = 130)
    public static final void method410(int arg0, int arg1) {
        class70.field921.method2174(-12634, arg0);
        field820++;
        class160.field2397.method2174(-12634, arg0);
        class177.field2626.method2174(-12634, arg0);
        if (arg1 != -2130) {
            method409((byte) -2);
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(Z)I", line = 156)
    public static final int method411(boolean arg0) {
        if (!arg0) {
            method411(false);
        }
        field812++;
        return ((class272.field4183 == 0 ? 0 : 1) << 22) + ((class287.field4341 == 0 ? 0 : 1) << 20) + ((class197.field2968 ? 1 : 0) << 16) + ((class45.field569 ? 1 : 0) << 15) + ((class292.field4447 ? 1 : 0) << 13) + (class284.field4298 & 0x3 << 11) + ((class233.field3506 ? 1 : 0) << 9) + ((class210.field3171 ? 1 : 0) << 8) + ((class97.field1467 ? 1 : 0) << 7) + ((class170.field2549 ? 1 : 0) << 5) + ((class272.field4167 & 0x7) + (((class212.field3227 ? 1 : 0) << 3) - (-((client.field1945 ? 1 : 0) << 4) + -((class151.field2274 ? 1 : 0) << 6) + -((class130.field2019 ? 1 : 0) << 10)) - (-((class178.field2630 ? 1 : 0) << 19) - ((class115.field1760 == 0 ? 0 : 1) << 21))) - -(class18.method117() << 23));
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(II)V", line = 178)
    public static final void method412(int arg0, int arg1) {
        field825++;
        if (!class36.field442) {
            arg0 = -1;
        }
        if (class270.field4141 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class274 var2 = class318.method2178(true, arg0);
            class127 var3 = var2.method1932((byte) -92);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class274.field4200.method1772(var3.field3527, -91, new Point(var2.field4195, var2.field4196), var3.method934(), class315.field4764, var3.field3535);
                class270.field4141 = arg0;
            }
        }
        if (arg0 == -1 && class270.field4141 != -1) {
            class274.field4200.method1772(-1, arg1 ^ -1243164167, new Point(), (int[]) null, class315.field4764, -1);
            class270.field4141 = -1;
        }
        if (arg1 != 1243164233) {
            field813 = 86;
        }
    }
}
