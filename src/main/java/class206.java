import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class206 {

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    private int field2881;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public int field2884;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field2875 = new Hashtable();

    @OriginalMember(owner = "client!em", name = "k", descriptor = "Lrg;")
    public static class596 field2883 = new class596(4, 3);

    @OriginalMember(owner = "client!em", name = "o", descriptor = "[I")
    public static int[] field2887 = new int[1];

    @OriginalMember(owner = "client!em", name = "n", descriptor = "Lts;")
    public static class496 field2886 = new class496(14, 1);

    @OriginalMember(owner = "client!em", name = "p", descriptor = "Lts;")
    public static class496 field2888 = new class496(15, 4);

    @OriginalMember(owner = "client!em", name = "q", descriptor = "Lts;")
    public static class496 field2889 = new class496(16, -2);

    @OriginalMember(owner = "client!em", name = "r", descriptor = "Lts;")
    public static class496 field2890 = new class496(17, 0);

    @OriginalMember(owner = "client!em", name = "s", descriptor = "Lts;")
    public static class496 field2891 = new class496(18, -2);

    @OriginalMember(owner = "client!em", name = "t", descriptor = "Lts;")
    public static class496 field2892 = new class496(19, -2);

    @OriginalMember(owner = "client!em", name = "u", descriptor = "Lts;")
    public static class496 field2893 = new class496(20, 6);

    @OriginalMember(owner = "client!em", name = "v", descriptor = "Lts;")
    public static class496 field2894 = new class496(21, 9);

    @OriginalMember(owner = "client!em", name = "w", descriptor = "Lts;")
    public static class496 field2895 = new class496(22, -2);

    @OriginalMember(owner = "client!em", name = "x", descriptor = "Lts;")
    public static class496 field2896 = new class496(23, 4);

    @OriginalMember(owner = "client!em", name = "y", descriptor = "Lts;")
    public static class496 field2897 = new class496(24, -1);

    @OriginalMember(owner = "client!em", name = "z", descriptor = "Lts;")
    public static class496 field2898 = new class496(25, -2);

    @OriginalMember(owner = "client!em", name = "A", descriptor = "Lts;")
    public static class496 field2899 = new class496(26, 0);

    @OriginalMember(owner = "client!em", name = "B", descriptor = "Lts;")
    public static class496 field2900 = new class496(27, 0);

    @OriginalMember(owner = "client!em", name = "C", descriptor = "[Lts;")
    private static class496[] field2901 = new class496[32];

    @OriginalMember(owner = "client!em", name = "D", descriptor = "Z")
    public static boolean field2902;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "J")
    public static long field2885;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)I")
    public static final int method1334(int arg0, int arg1) {
        field2874++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        if (arg0 != -1) {
            method1335(42, null, -78, null, 19);
        }
        return var6 + 1;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I[Ljava/lang/Object;I[II)V")
    public static final void method1335(int arg0, Object[] arg1, int arg2, int[] arg3, int arg4) {
        if (arg4 > arg0) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg0;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var7;
            Object var8 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var8;
            int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
            for (int var10 = arg0; var10 < arg4; var10++) {
                if (var7 + (var9 & var10) > arg3[var10]) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    Object var12 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var12;
                }
            }
            arg3[arg4] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var8;
            method1335(arg0, arg1, 0, arg3, var6 - 1);
            method1335(var6 + 1, arg1, 0, arg3, arg4);
        }
        if (arg2 != 0) {
            field2896 = null;
        }
        field2878++;
    }

    @OriginalMember(owner = "client!em", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2879++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V")
    public static final void method1336(byte arg0) {
        class555.field7483 = false;
        field2880++;
        int var1 = 95 % ((arg0 + 42) / 32);
        class314.method1905(-101);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)I")
    public final int method1337(boolean arg0) {
        if (!arg0) {
            field2883 = null;
        }
        field2873++;
        return this.field2881;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
    public static void method1338(int arg0) {
        field2893 = null;
        field2875 = null;
        field2886 = null;
        field2891 = null;
        field2895 = null;
        field2883 = null;
        field2898 = null;
        field2887 = null;
        field2894 = null;
        field2900 = null;
        field2896 = null;
        field2897 = null;
        field2889 = null;
        field2890 = null;
        field2901 = null;
        field2892 = null;
        field2888 = null;
        if (arg0 < -29) {
            field2899 = null;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lin;II)Ljava/lang/String;")
    public static final String method1339(class78 arg0, int arg1, int arg2) {
        field2877++;
        if (!client.method1679(arg0).method1847(1, arg1) && arg0.field1079 == null) {
            return null;
        } else if (arg0.field1175 == null || arg1 >= arg0.field1175.length || arg0.field1175[arg1] == null || arg0.field1175[arg1].trim().length() == 0) {
            return class314.field4339 ? "Hidden-" + arg1 : null;
        } else if (arg2 == 4) {
            return arg0.field1175[arg1];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(II)V")
    public class206(int arg0, int arg1) {
        this.field2881 = arg0;
        this.field2884 = arg1;
    }

    static {
        class496[] var0 = class408.method2383(50);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2901[var0[var1].field6750] = var0[var1];
        }
        field2902 = false;
    }
}
