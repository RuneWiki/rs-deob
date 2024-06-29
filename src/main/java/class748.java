import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class748 extends class437 {

    @OriginalMember(owner = "client!pca", name = "z", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field11035;

    @OriginalMember(owner = "client!pca", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field11045 = new String[] { method5444(method5443("\u001c[$`\u007fD")), method5444(method5443("\u001c[$`zD")), method5444(method5443("\u001c[$`yD")), method5444(method5443("\u001c[$`\u0004\u0005V,:\u0006D")), method5444(method5443("\u001c[$`~D")) };

    @OriginalMember(owner = "client!pca", name = "t", descriptor = "I")
    public static int field11033 = 0;

    @OriginalMember(owner = "client!pca", name = "r", descriptor = "Ljava/lang/String;")
    public static String field11039 = "";

    @OriginalMember(owner = "client!pca", name = "y", descriptor = "Lhl;")
    public static class556 field11038 = new class556(28, 6);

    @OriginalMember(owner = "client!pca", name = "v", descriptor = "I")
    public static int field11041 = 0;

    @OriginalMember(owner = "client!pca", name = "x", descriptor = "J")
    public static long field11043 = 0L;

    @OriginalMember(owner = "client!pca", name = "s", descriptor = "I")
    public static int field11034;

    @OriginalMember(owner = "client!pca", name = "w", descriptor = "I")
    public static int field11036;

    @OriginalMember(owner = "client!pca", name = "q", descriptor = "I")
    public static int field11037;

    @OriginalMember(owner = "client!pca", name = "u", descriptor = "I")
    public static int field11044;

    @OriginalMember(owner = "client!pca", name = "p", descriptor = "Lgda;")
    public static class58 field11040;

    @OriginalMember(owner = "client!pca", name = "A", descriptor = "Leb;")
    public static class654 field11042;

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "(I)Lwq;", line = 4)
    public static final class176 method5439(int arg0) {
        try {
            field11034++;
            class176 var1 = class471.method3622(1);
            var1.method1683(0L, -61);
            var1.method1681(class442.field6893, 23137);
            var1.method1683(field11043, -33);
            if (arg0 != -10) {
                method5439(-39);
            }
            var1.method1683(class648.field9292, 107);
            var1.method1659(0, class85.field1279, class326.field5328);
            return var1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11045[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V", line = 23)
    public final void method5440(int arg0) {
        try {
            field11037++;
            this.field11035.method5093();
            if (arg0 != -8) {
                field11040 = null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11045[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(II)Z", line = 35)
    public static final boolean method5441(int arg0, int arg1) {
        try {
            field11036++;
            if (arg0 == -10) {
                return arg1 == 7 || arg1 == 9;
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11045[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(I)V", line = 51)
    public class748(int arg0) {
        try {
            this.field11035 = new NativeHeap(arg0);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11045[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(I)V", line = 59)
    public static void method5442(int arg0) {
        try {
            field11040 = null;
            field11042 = null;
            if (arg0 <= 19) {
                method5441(-91, -111);
            }
            field11039 = null;
            field11038 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11045[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5443(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x38);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5444(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 108;
                    break;
                case 1:
                    var10005 = 56;
                    break;
                case 2:
                    var10005 = 69;
                    break;
                case 3:
                    var10005 = 78;
                    break;
                default:
                    var10005 = 56;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
