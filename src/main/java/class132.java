import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class132 extends class37 {

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "Lhb;")
    public static class318 field2031 = new class318(200);

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "[S")
    public static short[] field2033 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public static int field2036 = 0;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
    public static volatile int field2035 = 0;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V", line = 7)
    public static final void method971(byte arg0) {
        class247.field3683 = 0;
        class170.field2555 = -3;
        class129.field2002 = -1;
        class144.field2174 = 1;
        if (arg0 != 48) {
            method975(118, 39);
        }
        class29.field396 = 0;
        class216.field3256 = 0;
        class194.field2904 = false;
        field2028++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)V", line = 28)
    public static final void method972(byte arg0, int arg1) {
        field2029++;
        int var2 = 14 % ((arg0 + 52) / 36);
        class42.field516.method2174(-12634, arg1);
        class223.field3396.method2174(-12634, arg1);
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V", line = 42)
    public static void method973(int arg0) {
        if (arg0 == -30028) {
            field2033 = null;
            field2031 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)Ljl;", line = 63)
    public static final class112 method974(int arg0, int arg1) {
        class112 var2 = (class112) class211.field3215.method2180((long) arg1, (byte) 31);
        field2030++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class257.field3889.method1441(arg0, (byte) -44, arg1);
        class112 var4 = new class112(var3);
        var4.method621(class73.field948, (int[]) null);
        class211.field3215.method2175((long) arg1, var4, 66);
        return var4;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(II)I", line = 85)
    public static final int method975(int arg0, int arg1) {
        if (arg0 != 255) {
            field2031 = (class318) null;
        }
        field2027++;
        return arg1 & 0xFF;
    }
}
