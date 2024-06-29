import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class301 extends class147 {

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    public int field5185;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    public int field5183;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public static int field5184 = 0;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "Z")
    public static boolean field5188 = false;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "[I")
    public static int[] field5190 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
    public static int field5186 = 0;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "Lih;")
    public static class32 field5187 = new class32();

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "I")
    public static int field5193 = -1;

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "Lna;")
    public static class26 field5194 = class69.method505("<col=ffffff>", (byte) -121);

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "Lqf;")
    public static class148 field5192;

    @OriginalMember(owner = "client!qi", name = "C", descriptor = "Lei;")
    public static class195 field5195;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(B)V", line = 6)
    public static void method2116(byte arg0) {
        int var1 = -59 / ((arg0 - 67) / 36);
        field5192 = null;
        field5190 = null;
        field5194 = null;
        field5187 = null;
        field5195 = null;
    }

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "(B)V", line = 25)
    public static final void method2117(byte arg0) {
        field5182++;
        class94.field1533.method1987(3);
        class263.field4299.method1987(3);
        class307.field5291.method1987(3);
        if (arg0 != -108) {
            field5195 = (class195) null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)I", line = 44)
    public static final int method2118(int arg0, int arg1) {
        field5191++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg1 <= arg0) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(II)V", line = 90)
    public class301(int arg0, int arg1) {
        this.field5185 = arg1;
        this.field5183 = arg0;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIBI)I", line = 110)
    public static final int method2119(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field5189++;
        if (arg2 >= -66) {
            method2118(-92, 76);
        }
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return 1023 - arg3;
        }
    }
}
