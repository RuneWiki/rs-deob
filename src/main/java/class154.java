import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class154 extends class194 {

    @OriginalMember(owner = "client!s", name = "w", descriptor = "I")
    private int field2172;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    private int field2166;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    private int field2165;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    private int field2169;

    @OriginalMember(owner = "client!s", name = "C", descriptor = "I")
    private int field2178;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    private int field2164;

    @OriginalMember(owner = "client!s", name = "B", descriptor = "I")
    private int field2177;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "I")
    private int field2171;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "I")
    public static int field2170 = 0;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "Lng;")
    public static class190 field2168 = new class190(64);

    @OriginalMember(owner = "client!s", name = "E", descriptor = "[B")
    public static byte[] field2180 = new byte[32896];

    @OriginalMember(owner = "client!s", name = "F", descriptor = "Ljava/lang/String;")
    public static String field2181;

    @OriginalMember(owner = "client!s", name = "G", descriptor = "Ljava/lang/String;")
    public static String field2182;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!s", name = "x", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!s", name = "A", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!s", name = "D", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!s", name = "H", descriptor = "[Llf;")
    public static class130[] field2183;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
    public static void method1036(byte arg0) {
        field2183 = null;
        field2182 = null;
        field2181 = null;
        field2180 = null;
        if (arg0 <= 18) {
            field2180 = null;
        }
        field2168 = null;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2172 = arg3;
        this.field2166 = arg5;
        this.field2165 = arg6;
        this.field2169 = arg4;
        this.field2178 = arg7;
        this.field2164 = arg0;
        this.field2177 = arg2;
        this.field2171 = arg1;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method1037(int arg0, int arg1, int arg2, Class arg3) {
        class142 var4 = class5.field79[arg0][arg1][arg2];
        if (var4 != null) {
            for (class218 var5 = var4.field2043; var5 != null; var5 = var5.field2884) {
                class430 var6 = var5.field2882;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field6182 == arg1 && var6.field6186 == arg2) {
                    class442.method2765(var6);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V")
    public static final void method1038(int arg0) {
        if (class64.field993 != null) {
            class64.field993.method1478(arg0 ^ 8);
        }
        ++field2174;
        if (class326.field4451 != null) {
            class326.field4451.method1478(8);
        }
        if (arg0 != 0) {
            method1040(-18, -82);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BII)V")
    public final void method1039(byte arg0, int arg1, int arg2) {
        int var4 = -64 % ((arg0 - 9) / 39);
        ++field2173;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(II)V")
    public static final void method1040(int arg0, int arg1) {
        class109.field1607 = arg0;
        if (arg1 < 61) {
            method1040(113, -77);
        }
        ++field2175;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(III)V")
    public final void method1041(int arg0, int arg1, int arg2) {
        ++field2179;
        if (arg2 != 0) {
            this.method1041(26, 6, 66);
        }
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(III)V")
    public final void method1042(int arg0, int arg1, int arg2) {
        ++field2176;
        int var4 = this.field2164 * arg2 >> 12;
        int var5 = this.field2171 * arg1 >> 12;
        int var6 = this.field2177 * arg2 >> 12;
        int var7 = this.field2172 * arg1 >> 12;
        if (arg0 == 0) {
            int var8 = this.field2169 * arg2 >> 12;
            int var9 = this.field2166 * arg1 >> 12;
            int var10 = this.field2165 * arg2 >> 12;
            int var11 = this.field2178 * arg1 >> 12;
            class233.method1469(super.field2686, -127, var7, var6, var9, var11, var4, var10, var8, var5);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; ++var1) {
            for (int var2 = 0; var1 >= var2; ++var2) {
                field2180[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + (var2 * var2 - -65535)) / 65535.0F))));
            }
        }
        field2181 = "Loading...";
        field2182 = " ";
    }
}
