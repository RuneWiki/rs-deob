import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class422 {

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "[I")
    public static int[] field6001 = new int[25];

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "Lfe;")
    public static class528 field6006 = new class528();

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "Lwo;")
    public static class690 field6009 = new class690(4, -1);

    @OriginalMember(owner = "client!gt", name = "l", descriptor = "Ljava/lang/String;")
    public static String field6010 = "";

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "I")
    public static int field5999;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
    public int field6002;

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "I")
    public int field6007;

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "I")
    public int field6008;

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "[[[S")
    public static short[][][] field6004;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZZ)V", line = 8)
    public static final void method2548(boolean arg0, boolean arg1) {
        field6005++;
        if (arg0) {
            return;
        }
        for (class58 var2 = (class58) class148.field1822.method1132((byte) -116); var2 != null; var2 = (class58) class148.field1822.method1134(8446)) {
            if (var2.field906 != null) {
                class399.field5624.method1805(var2.field906);
                var2.field906 = null;
            }
            if (var2.field914 != null) {
                class399.field5624.method1805(var2.field914);
                var2.field914 = null;
            }
            var2.method3045(!arg0);
        }
        if (!arg1) {
            return;
        }
        for (class58 var3 = (class58) class188.field2301.method1132((byte) 78); var3 != null; var3 = (class58) class188.field2301.method1134(8446)) {
            if (var3.field906 != null) {
                class399.field5624.method1805(var3.field906);
                var3.field906 = null;
            }
            var3.method3045(true);
        }
        for (class58 var4 = (class58) class362.field4820.method3669((byte) 28); var4 != null; var4 = (class58) class362.field4820.method3676((byte) -12)) {
            if (var4.field906 != null) {
                class399.field5624.method1805(var4.field906);
                var4.field906 = null;
            }
            var4.method3045(true);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V", line = 79)
    public static void method2549(int arg0) {
        field6010 = null;
        field6006 = null;
        if (arg0 != 28155) {
            method2548(true, false);
        }
        field6001 = null;
        field6004 = null;
        field6009 = null;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIIIIZII)V", line = 93)
    public static final void method2550(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        field5999++;
        if (!arg7) {
            return;
        }
        class32 var10 = null;
        for (class32 var11 = (class32) class440.field6267.method1132((byte) 85); var11 != null; var11 = (class32) class440.field6267.method1134(8446)) {
            if (var11.field648 == arg2 && var11.field647 == arg6 && var11.field661 == arg9 && var11.field662 == arg5) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class32();
            var10.field647 = arg6;
            var10.field661 = arg9;
            var10.field648 = arg2;
            var10.field662 = arg5;
            if (arg6 >= 0 && arg9 >= 0 && class473.field6604 > arg6 && arg9 < class205.field2465) {
                class69.method624((byte) 79, var10);
            }
            class440.field6267.method1129(var10, 262144);
        }
        var10.field651 = arg8;
        var10.field655 = arg1;
        var10.field657 = arg0;
        var10.field660 = arg4;
        var10.field654 = arg3;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIZ)I", line = 138)
    public static final int method2551(int arg0, int arg1, int arg2, boolean arg3) {
        field6003++;
        if (arg1 == arg2) {
            return arg1;
        }
        int var4 = 128 - arg0;
        if (arg3) {
            return -20;
        } else {
            int var5 = (arg1 & 0x7F) * var4 + (arg2 & 0x7F) * arg0 >> 7;
            int var6 = (arg1 & 0x380) * var4 + (arg2 & 0x380) * arg0 >> 7;
            int var7 = (arg1 & 0xFC00) * var4 + ((arg2 & 0xFC00) * arg0) >> 7;
            return var7 & 0xFC00 | var6 & 0x380 | var5 & 0x7F;
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)Luc;", line = 162)
    public static final class27 method2552(int arg0) {
        field6000++;
        if (arg0 != 18176) {
            method2548(true, false);
        }
        try {
            return (class27) Class.forName("gn").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }
}
