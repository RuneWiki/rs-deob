import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class130 extends class434 {

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field1526;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1527 = new String[] { method1133(method1132("89`\\5")), method1133(method1132("89`Y5")), method1133(method1132("89`!t<::#5")), method1133(method1132(")}`3`")), method1133(method1132("<&\"q")), method1133(method1132("89`_5")) };

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "Ltl;")
    public static class645 field1523 = new class645(0, 0);

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "Lwq;")
    public static class178 field1524 = new class178(20);

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V", line = 4)
    public static void method1128(int arg0) {
        try {
            field1523 = null;
            if (arg0 != 0) {
                field1524 = null;
            }
            field1524 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1527[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "()V", line = 16)
    public static final void method1129() {
        class675.field9785 = class675.field9788;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[FI)[F", line = 19)
    public static final float[] method1130(int arg0, float[] arg1, int arg2) {
        try {
            field1525++;
            float[] var3 = new float[arg2];
            class467.method3550(arg1, 0, var3, 0, arg2);
            return arg0 == 5049 ? var3 : null;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1527[5] + arg0 + ',' + (arg1 == null ? field1527[4] : field1527[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V", line = 41)
    public final void method1131(int arg0) {
        try {
            this.field1526.method5096();
            field1522++;
            int var2 = -83 / ((-arg0 - 41) / 47);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1527[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I)V", line = 51)
    public class130(int arg0) {
        try {
            this.field1526 = new NativeHeap(arg0);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1527[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1132(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1133(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 82;
                    break;
                case 1:
                    var10005 = 83;
                    break;
                case 2:
                    var10005 = 78;
                    break;
                case 3:
                    var10005 = 29;
                    break;
                default:
                    var10005 = 29;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
