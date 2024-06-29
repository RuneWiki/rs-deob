import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class171 extends class115 {

    @OriginalMember(owner = "client!ug", name = "U", descriptor = "Lub;")
    public static class227 field2865 = class257.method1749("Eingabeprozedur geladen)3", 17263);

    @OriginalMember(owner = "client!ug", name = "W", descriptor = "I")
    public static int field2867 = 0;

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "I")
    public static int field2856 = 1;

    @OriginalMember(owner = "client!ug", name = "V", descriptor = "Lrb;")
    public static class254 field2866 = new class254(5);

    @OriginalMember(owner = "client!ug", name = "Y", descriptor = "Z")
    public static boolean field2869 = false;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    public int field2857;

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!ug", name = "R", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!ug", name = "T", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!ug", name = "X", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!ug", name = "S", descriptor = "Lub;")
    public class227 field2863;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "Lnh;")
    public static class57 field2855;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(B)I")
    public final int method1086(byte arg0) {
        int var2 = -125 / ((arg0 - 56) / 43);
        ++field2852;
        return (int) (super.field1113 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZI)V")
    public static final void method1087(int arg0, boolean arg1, int arg2) {
        ++field2859;
        if (!arg1) {
            method1090(26, -37, 122, 69, true);
        }
        long var3 = (long) ((arg0 << 16) + arg2);
        class214 var5 = (class214) class140.field2420.method1298(-104, var3);
        if (var5 != null) {
            class100.field1750.method218(var5, (byte) 99);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IJ)V")
    public static final void method1088(int arg0, long arg1) {
        ++field2861;
        if (arg1 > 0L) {
            if (~(arg1 % 10L) == -1L) {
                class208.method1330(arg1 - 1L, 109);
                class208.method1330(1L, 40);
            } else {
                class208.method1330(arg1, -120);
            }
            if (arg0 < 78) {
                field2868 = 68;
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
    public final void method1089(int arg0) {
        super.field2112 |= Long.MIN_VALUE;
        ++field2860;
        if (this.method1094(27) == 0L) {
            class177.field2978.method217(29, this);
        }
        int var2 = 18 / ((arg0 - 55) / 36);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIZ)I")
    public static final int method1090(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!arg4) {
            field2855 = null;
        }
        int var5 = 65536 - class62.field1143[arg3 * 1024 / arg0] >> 1;
        ++field2864;
        return ((-var5 + 65536) * arg1 >> 16) + (arg2 * var5 >> 16);
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(B)I")
    public final int method1091(byte arg0) {
        int var2 = -118 / ((37 - arg0) / 41);
        ++field2858;
        return (int) super.field1113;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
    public static void method1092(int arg0) {
        field2866 = null;
        field2855 = null;
        if (arg0 == 65536) {
            field2865 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(IB)V")
    public static final void method1093(int arg0, byte arg1) {
        class165.field2771.method1727(true, arg0);
        class31.field499.method1727(true, arg0);
        ++field2853;
        if (arg1 >= -80) {
            method1087(-40, true, 99);
        }
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)J")
    public final long method1094(int arg0) {
        ++field2862;
        int var2 = 5 / ((arg0 - -45) / 52);
        return super.field2112 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(II)V")
    public class171(int arg0, int arg1) {
        super.field1113 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(B)V")
    public final void method1095(byte arg0) {
        super.field2112 = 500L + class12.method57(-103) | Long.MIN_VALUE & super.field2112;
        ++field2854;
        if (arg0 >= 70) {
            class60.field1111.method217(29, this);
        }
    }
}
