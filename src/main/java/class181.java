import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class181 extends class110 {

    @OriginalMember(owner = "client!sk", name = "F", descriptor = "I")
    private final int field3116;

    @OriginalMember(owner = "client!sk", name = "J", descriptor = "I")
    private final int field3120;

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "I")
    private final int field3119;

    @OriginalMember(owner = "client!sk", name = "B", descriptor = "I")
    private final int field3112;

    @OriginalMember(owner = "client!sk", name = "L", descriptor = "I")
    private final int field3122;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    private final int field3102;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    private final int field3100;

    @OriginalMember(owner = "client!sk", name = "M", descriptor = "I")
    private final int field3123;

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "Lda;")
    private static class275 field3111 = class255.method1672(119, " from your ignore list first)3");

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "Z")
    public static boolean field3099 = false;

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "[J")
    public static long[] field3110 = new long[32];

    @OriginalMember(owner = "client!sk", name = "G", descriptor = "[I")
    public static int[] field3117 = new int[2048];

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "I")
    public static int field3118 = 0;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "[[B")
    public static byte[][] field3105 = new byte[50][];

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "Lda;")
    public static class275 field3109 = field3111;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "[S")
    public static short[] field3115 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "Lma;")
    public static class105 field3103;

    @OriginalMember(owner = "client!sk", name = "K", descriptor = "Lia;")
    public static class260 field3121;

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3116 = arg4;
        this.field3120 = arg3;
        this.field3119 = arg1;
        this.field3112 = arg7;
        this.field3122 = arg5;
        this.field3102 = arg2;
        this.field3100 = arg0;
        this.field3123 = arg6;
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V")
    public static void method1211(int arg0) {
        if (arg0 == 0) {
            field3110 = null;
            field3111 = null;
            field3105 = null;
            field3115 = null;
            field3117 = null;
            field3121 = null;
            field3103 = null;
            field3109 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIB)V")
    public final void method165(int arg0, int arg1, byte arg2) {
        ++field3114;
        if (arg2 != -53) {
            method1211(-45);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IJ)Lda;")
    public static final class275 method1212(int arg0, long arg1) {
        ++field3104;
        if (~arg1 < -1L && arg1 < 6582952005840035281L) {
            if (arg1 % 37L == (long) arg0) {
                return null;
            } else {
                int var3 = 0;
                long var4 = arg1;
                while (~var4 != -1L) {
                    var4 /= 37L;
                    ++var3;
                }
                byte[] var6 = new byte[var3];
                while (~arg1 != -1L) {
                    long var8 = arg1;
                    arg1 /= 37L;
                    --var3;
                    var6[var3] = class86.field1460[(int) (-(arg1 * 37L) + var8)];
                }
                class275 var7 = new class275();
                var7.field4749 = var6;
                var7.field4752 = var6.length;
                return var7;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLma;I)Z")
    public static final boolean method1213(byte arg0, class105 arg1, int arg2) {
        ++field3108;
        byte[] var3 = arg1.method760(0, arg2);
        if (var3 == null) {
            return false;
        } else {
            class93.method672(var3, (byte) -39);
            if (arg0 < 102) {
                field3105 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BII)V")
    public final void method162(byte arg0, int arg1, int arg2) {
        ++field3106;
        int var4 = this.field3100 * arg1 >> 12;
        int var5 = this.field3119 * arg2 >> 12;
        int var6 = this.field3102 * arg1 >> 12;
        int var7 = this.field3116 * arg1 >> 12;
        int var8 = this.field3120 * arg2 >> 12;
        int var9 = this.field3122 * arg2 >> 12;
        int var10 = this.field3123 * arg1 >> 12;
        int var11 = this.field3112 * arg2 >> 12;
        class54.method346(var11, var5, var9, super.field1942, var4, var7, var6, -70, var8, var10);
        int var12 = 65 / ((arg0 - 48) / 42);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)I")
    public static final int method1214(int arg0, int arg1) {
        int var7 = arg0 - 1;
        ++field3107;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        if (arg1 != -1) {
            field3109 = null;
        }
        return var6 + 1;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)Ln;")
    public static final class93 method1215(int arg0, int arg1) {
        ++field3098;
        class93 var2 = (class93) class261.field4538.method990((long) arg1, (byte) 96);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class133.field2370.method775(4, arg1, -24799);
            class93 var4 = new class93();
            if (var3 != null) {
                var4.method668(arg1, -102, new class85(var3));
            }
            class261.field4538.method986(arg0 ^ arg0, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(III)V")
    public final void method164(int arg0, int arg1, int arg2) {
        if (arg2 != 32768) {
            field3118 = -26;
        }
        ++field3113;
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(III)J")
    public static final long method1216(int arg0, int arg1, int arg2) {
        class3 var3 = class235.field4101[arg0][arg1][arg2];
        return var3 != null && var3.field50 != null ? var3.field50.field2426 : 0L;
    }
}
