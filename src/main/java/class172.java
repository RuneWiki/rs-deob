import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class172 {

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "[I")
    public static int[] field2914 = new int[100];

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public int field2908;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public int field2913;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public int field2915;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "[[[I")
    public static int[][][] field2911;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)I")
    public static int method1232(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILig;B)V")
    private final void method1233(int arg0, class136 arg1, byte arg2) {
        if (arg2 != 99) {
            return;
        }
        field2918++;
        if (arg0 == 1) {
            this.field2913 = arg1.method996(65280);
            this.field2915 = arg1.method1012(4);
            this.field2908 = arg1.method1012(4);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lig;Z)V")
    public final void method1234(class136 arg0, boolean arg1) {
        if (!arg1) {
            field2912 = 94;
        }
        field2916++;
        while (true) {
            int var3 = arg0.method1012(4);
            if (var3 == 0) {
                return;
            }
            this.method1233(var3, arg0, (byte) 99);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
    public static void method1235(int arg0) {
        if (arg0 != 32768) {
            field2911 = null;
        }
        field2914 = null;
        field2911 = null;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)Lij;")
    public static final class258 method1236(int arg0, int arg1) {
        field2910++;
        class258 var2 = (class258) class211.field3386.method1518((long) arg0, -100);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class164.field2668.method900(0, arg0 & 0x7FFF, false);
        } else {
            var3 = class252.field4005.method900(0, arg0, false);
        }
        class258 var4 = new class258();
        if (var3 != null) {
            var4.method1720(0, new class136(var3));
        }
        if (arg0 >= 32768) {
            var4.method1725(109);
        }
        int var5 = 93 % ((-arg1 - 42) / 51);
        class211.field3386.method1514(false, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZIII)Ljava/lang/String;")
    public static final String method1237(boolean arg0, int arg1, int arg2, int arg3) {
        field2909++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg0 && arg2 >= 0) {
            int var4 = arg2 / arg1;
            int var5 = 2;
            while (var4 != 0) {
                var4 /= arg1;
                var5++;
            }
            char[] var6 = new char[var5];
            var6[0] = '+';
            if (arg3 < 91) {
                field2911 = null;
            }
            for (int var7 = var5 - 1; var7 > 0; var7--) {
                int var8 = arg2;
                arg2 /= arg1;
                int var9 = var8 - arg1 * arg2;
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg2, arg1);
        }
    }
}
