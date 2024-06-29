import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class138 extends class171 {

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public int field2290;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    public int field2294;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "I")
    public int field2304;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "I")
    public int field2297;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "Lic;")
    public static class113 field2291 = null;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "I")
    public static int field2299 = -1;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "Lfa;")
    public static class192 field2303;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "[Lok;")
    public static class146[] field2301;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(II)I", line = 6)
    public static int method1013(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(B)V", line = 13)
    public static void method1014(byte arg0) {
        field2301 = null;
        if (arg0 == 7) {
            field2303 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(II)V", line = 41)
    public static final void method1015(int arg0, int arg1) {
        int var2 = 82 / ((arg0 - 37) / 55);
        class309.field5259 = arg1;
        field2296++;
        class198.field3306 = 50;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(B)V", line = 51)
    public static final void method1016(byte arg0) {
        class245.field4053++;
        class47.field820.method1656(200, 16);
        if (arg0 != -120) {
            method1018(76, 122, -102);
        }
        field2302++;
        class47.field820.method361(class32.field616, 1635554120);
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(B)V", line = 65)
    public static final void method1017(byte arg0) {
        class200.field3348 = null;
        if (arg0 != 6) {
            method1014((byte) -90);
        }
        field2298++;
        class243.method1759();
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)I", line = 80)
    public static final int method1018(int arg0, int arg1, int arg2) {
        field2293++;
        if (arg1 > -121) {
            field2299 = -94;
        }
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(III)Z", line = 112)
    public final boolean method1019(int arg0, int arg1, int arg2) {
        field2292++;
        if (arg0 != 200) {
            method1018(-30, 121, 87);
        }
        return arg1 >= this.field2290 && arg1 <= this.field2297 && this.field2304 <= arg2 && arg2 <= this.field2294;
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(II)I", line = 138)
    public static final int method1020(int arg0, int arg1) {
        if (arg0 > -86) {
            method1017((byte) 0);
        }
        field2289++;
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(IIII)V", line = 152)
    public class138(int arg0, int arg1, int arg2, int arg3) {
        this.field2290 = arg0;
        this.field2294 = arg3;
        this.field2304 = arg1;
        this.field2297 = arg2;
    }
}
