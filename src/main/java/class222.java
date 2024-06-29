import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class222 extends class194 {

    @OriginalMember(owner = "client!pp", name = "B", descriptor = "I")
    private int field2988;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
    private int field2976;

    @OriginalMember(owner = "client!pp", name = "A", descriptor = "I")
    private int field2987;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
    private int field2975;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "I")
    public static int field2978 = -1;

    @OriginalMember(owner = "client!pp", name = "t", descriptor = "I")
    public static int field2980 = 0;

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "Lng;")
    public static class190 field2977 = new class190(8);

    @OriginalMember(owner = "client!pp", name = "C", descriptor = "[I")
    public static int[] field2989 = new int[5];

    @OriginalMember(owner = "client!pp", name = "s", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!pp", name = "u", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!pp", name = "v", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!pp", name = "w", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!pp", name = "x", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!pp", name = "y", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!pp", name = "z", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(III)V", line = 3)
    public final void method1041(int arg0, int arg1, int arg2) {
        ++field2986;
        if (arg2 != 0) {
            this.method1041(-20, -28, -37);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BII)V", line = 13)
    public final void method1039(byte arg0, int arg1, int arg2) {
        ++field2985;
        int var4 = 18 / ((arg0 - 9) / 39);
    }

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "(I)V", line = 26)
    public static void method1410(int arg0) {
        field2989 = null;
        if (arg0 > -44) {
            method1410(121);
        }
        field2977 = null;
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(IIIIII)V", line = 51)
    public class222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2988 = arg2;
        this.field2976 = arg3;
        this.field2987 = arg0;
        this.field2975 = arg1;
    }

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "(III)V", line = 65)
    public static final void method1411(int arg0, int arg1, int arg2) {
        ++field2982;
        if (arg1 != -1) {
            field2981 = -49;
        }
        class399 var3 = class269.method1655(12, arg2, arg1 + -122);
        var3.method2583((byte) 71);
        var3.field5842 = arg0;
    }

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "(III)V", line = 79)
    public final void method1042(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            method1411(-29, -108, 84);
        }
        ++field2984;
        int var4 = this.field2987 * arg2 >> 12;
        int var5 = this.field2988 * arg2 >> 12;
        int var6 = this.field2975 * arg1 >> 12;
        int var7 = this.field2976 * arg1 >> 12;
        class215.method1377((byte) 79, var4, super.field2686, var5, var6, var7);
    }
}
