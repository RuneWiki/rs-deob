import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class186 {

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public int field2993;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    private int field2985;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "[I")
    public static int[] field2982 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field2987 = -2;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Z")
    public static boolean field2988 = false;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "[J")
    public static long[] field2992 = new long[256];

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Lfr;")
    public static class285 field2990;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2992[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1268(int arg0) {
        class467.field6936 = new class291();
        int var1 = 3 % ((44 - arg0) / 53);
        field2984++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lza;)V", line = 21)
    public static final void method1269(class288 arg0) {
        for (int var1 = class110.field2001; var1 < class138.field2320; var1++) {
            for (int var2 = 0; var2 < class493.field7231; var2++) {
                for (int var3 = 0; var3 < class220.field3464; var3++) {
                    class234 var4 = class518.field7511[var1][var2][var3];
                    if (var4 != null) {
                        class50 var5 = var4.field3610;
                        class50 var6 = var4.field3613;
                        if (var5 != null && var5.method19((byte) 125)) {
                            class463.method2776(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method19((byte) 125)) {
                                class463.method2776(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method18(0, (byte) 93, 0, var5, arg0, false, 0);
                                var6.method12(82);
                            }
                            var5.method12(108);
                        }
                        for (class440 var7 = var4.field3607; var7 != null; var7 = var7.field6528) {
                            class402 var9 = var7.field6530;
                            if (var9 != null && var9.method19((byte) 122)) {
                                class463.method2776(arg0, var9, var1, var2, var3, var9.field6081 + 1 - var9.field6082, var9.field6075 - var9.field6077 + 1);
                                var9.method12(-118);
                            }
                        }
                        class311 var8 = var4.field3619;
                        if (var8 != null && var8.method19((byte) 127)) {
                            class523.method3091(arg0, var8, var1, var2, var3);
                            var8.method12(-109);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIZIIIII)V", line = 102)
    public static final void method1270(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2983++;
        if (arg2) {
            field2992 = null;
        }
        if (arg0 >= class467.field6940 && arg7 <= class43.field600 && arg1 >= class372.field5455 && class216.field3415 >= arg6) {
            class446.method2669(arg3, arg0, arg6, arg5, arg4, arg1, 2, arg7);
        } else {
            class63.method562(arg4, arg3, arg5, arg1, arg0, arg7, arg6, -77);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V", line = 125)
    public static void method1271(byte arg0) {
        field2992 = null;
        field2990 = null;
        field2982 = null;
        if (arg0 >= -124) {
            field2990 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)I", line = 137)
    public final int method1272(int arg0) {
        field2989++;
        return arg0 == 1 ? this.field2985 : 125;
    }

    @OriginalMember(owner = "client!s", name = "toString", descriptor = "()Ljava/lang/String;", line = 148)
    public final String toString() {
        field2986++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(II)V", line = 160)
    public class186(int arg0, int arg1) {
        this.field2993 = arg1;
        this.field2985 = arg0;
    }
}
