import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class180 extends class411 {

    @OriginalMember(owner = "client!vda", name = "r", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field2582;

    @OriginalMember(owner = "client!vda", name = "u", descriptor = "[[I")
    public static int[][] field2585 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!vda", name = "o", descriptor = "Lqca;")
    public static class115 field2579 = new class115(2, 4, 4, 0);

    @OriginalMember(owner = "client!vda", name = "p", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!vda", name = "q", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!vda", name = "s", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!vda", name = "t", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(ZIIIJ)Ljava/lang/String;")
    public static final String method1290(boolean arg0, int arg1, int arg2, int arg3, long arg4) {
        field2580++;
        if (arg1 != -28679) {
            method1290(false, 21, 108, 25, -45L);
        }
        char var6 = ',';
        char var7 = '.';
        if (arg3 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg3 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg4 < 0L) {
            arg4 = -arg4;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg2 > 0) {
            for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = (int) arg4;
                arg4 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg4 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg4;
            arg4 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg4 * 10)));
            if (arg4 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg0) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)V")
    public final void method1291(byte arg0) {
        this.field2582.method3759();
        if (arg0 < -97) {
            field2581++;
        }
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)V")
    public static void method1292(int arg0) {
        field2585 = null;
        field2579 = null;
        if (arg0 != 6482) {
            field2585 = null;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1293(String arg0, int arg1) {
        if (arg1 != 45) {
            method1290(true, 84, 91, 25, 51L);
        }
        field2583++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = class240.method1617(16697, arg0.charAt(var4)) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Ldm;II)I")
    public static final int method1294(class50 arg0, int arg1, int arg2) {
        int var3 = 14 % ((-arg2 - 58) / 49);
        field2584++;
        if (!client.method1943(arg0).method2116((byte) 50, arg1) && arg0.field789 == null) {
            return -1;
        } else if (arg0.field816 == null || arg0.field816.length <= arg1) {
            return -1;
        } else {
            return arg0.field816[arg1];
        }
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(I)V")
    public class180(int arg0) {
        this.field2582 = new NativeHeap(arg0);
    }

    static {
        new class271("", 73);
    }
}
