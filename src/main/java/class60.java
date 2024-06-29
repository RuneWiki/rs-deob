import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class60 extends class240 {

    @OriginalMember(owner = "client!b", name = "p", descriptor = "J")
    public long field939;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "Lti;")
    public static class222 field941 = new class222();

    @OriginalMember(owner = "client!b", name = "s", descriptor = "Ljava/lang/String;")
    public static String field942 = "wishes to trade with you.";

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    public static int field943 = -1;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "[J")
    public static long[] field944 = new long[256];

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "[[[Lw;")
    public static class272[][][] field946;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILob;IIIIIZ)V", line = 5)
    public static final void method440(int arg0, class292 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field937++;
        if (class168.field2616) {
            class76.field1164 = 32;
        } else {
            class76.field1164 = 0;
        }
        class168.field2616 = arg7;
        if (class260.field4033 != 0) {
            if (arg0 <= arg5 && arg5 < (arg0 + 16) && arg2 >= arg6 && arg2 < arg6 + 16) {
                arg1.field4578 -= 4;
                class143.method1091(arg1, (byte) 115);
            } else if (arg0 <= arg5 && arg5 < (arg0 + 16) && (arg3 + arg6 - 16) <= arg2 && arg2 < arg3 + arg6) {
                arg1.field4578 += 4;
                class143.method1091(arg1, (byte) 58);
            } else if ((arg0 - class76.field1164) <= arg5 && arg5 < arg0 + class76.field1164 + 16 && (arg6 + 16) <= arg2 && arg3 + arg6 - 16 > arg2) {
                int var8 = (arg3 - 32) * arg3 / arg4;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg2 - (var8 / 2) - arg6 - 16;
                int var10 = arg3 - var8 - 32;
                arg1.field4578 = (arg4 - arg3) * var9 / var10;
                class143.method1091(arg1, (byte) 51);
                class168.field2616 = true;
            }
        }
        if (class56.field893 == 0) {
            return;
        }
        int var11 = arg1.field4608;
        if (arg5 >= arg0 - var11 && arg6 <= arg2 && arg5 < arg0 + 16 && arg2 <= (arg3 + arg6)) {
            arg1.field4578 += class56.field893 * 45;
            class143.method1091(arg1, (byte) 53);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(III)Z", line = 65)
    public static final boolean method441(int arg0, int arg1, int arg2) {
        field940++;
        if (arg0 == arg1) {
            arg0 = 10;
        }
        class6 var3 = class28.method190(-108, arg2);
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method33(true, arg0);
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V", line = 82)
    public static void method442(int arg0) {
        if (arg0 == -16) {
            field941 = null;
            field946 = (class272[][][]) null;
            field942 = null;
            field944 = null;
        }
    }

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
            field944[var0] = var1;
        }
        field945 = 0;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(DZ)V", line = 109)
    public static final void method443(double arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        if (class83.field1236 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class312.field4902[var3] = var4 <= 255 ? var4 : 255;
            }
            class83.field1236 = arg0;
        }
        field938++;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V", line = 134)
    public class60() {
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(J)V", line = 137)
    public class60(long arg0) {
        this.field939 = arg0;
    }
}
