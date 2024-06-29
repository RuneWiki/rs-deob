import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class132 extends class73 {

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    public int field3151 = -1;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    public int field3160 = 0;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "La;")
    public static class1 field3156 = new class1();

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "Lrd;")
    public static class117 field3166 = class95.method812("Fertigkeit)2", (byte) 8);

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "La;")
    public static class1 field3168 = new class1();

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "[I")
    public static int[] field3170 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "[J")
    public static long[] field3171 = new long[32];

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
    public static int field3172 = 0;

    @OriginalMember(owner = "client!ua", name = "db", descriptor = "Lrd;")
    public static class117 field3174 = class95.method812("Ihr Spielkonto wird bereits benutzt)3", (byte) 8);

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "I")
    public static int field3173 = 0;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
    public int field3152;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "I")
    public int field3153;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
    public int field3155;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    public int field3159;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    public int field3161;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "I")
    public int field3162;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "I")
    public int field3164;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
    public int field3165;

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
    public int field3167;

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "I")
    public int field3169;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)V")
    public static final void method1083(boolean arg0) {
        class67.field1899 = null;
        class109.field2736 = null;
        field3163++;
        class94.field2350 = null;
        class105.field2617 = null;
        class36.field1056 = null;
        if (!arg0) {
            method1085(-30, -54, (byte) 24);
        }
        class127.field3044 = null;
        class35.field1044 = null;
        class61.field1704 = null;
        class21.field606 = null;
        class49.field1412 = null;
        class60.field1686 = null;
        class73.field2049 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZILge;)Lra;")
    public static final class114 method1084(boolean arg0, int arg1, class47 arg2) {
        if (!arg0) {
            field3174 = null;
        }
        field3154++;
        return class148.method1196(arg1, arg2, 0) ? class40.method465(0) : null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIB)I")
    public static final int method1085(int arg0, int arg1, byte arg2) {
        if (arg2 != 48) {
            method1083(true);
        }
        field3157++;
        int var3 = 0;
        while (arg0 > 0) {
            var3 = var3 << 1 | arg1 & 0x1;
            arg0--;
            arg1 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
    public static void method1086(byte arg0) {
        field3171 = null;
        field3168 = null;
        field3174 = null;
        field3156 = null;
        int var1 = -37 % ((arg0 + 8) / 41);
        field3166 = null;
        field3170 = null;
    }
}
