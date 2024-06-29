import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class747 extends class434 {

    @OriginalMember(owner = "client!dw", name = "s", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field10863;

    @OriginalMember(owner = "client!dw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10867 = new String[] { method5442(method5441("\u000b\u0013a\u001c(\u0001\r;\u001ei")), method5442(method5441("\u000b\u0013abi")), method5442(method5441("\u000b\u0013aai")) };

    @OriginalMember(owner = "client!dw", name = "p", descriptor = "I")
    public static int field10861 = 2;

    @OriginalMember(owner = "client!dw", name = "r", descriptor = "[F")
    public static float[] field10866 = new float[4];

    @OriginalMember(owner = "client!dw", name = "n", descriptor = "I")
    public static int field10864;

    @OriginalMember(owner = "client!dw", name = "o", descriptor = "Lvd;")
    public static class42 field10865;

    @OriginalMember(owner = "client!dw", name = "q", descriptor = "Lmfa;")
    public static class642 field10862;

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(I)V", line = 10)
    public class747(int arg0) {
        try {
            this.field10863 = new NativeHeap(arg0);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10867[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V", line = 19)
    public final void method5439(int arg0) {
        try {
            if (arg0 == 28177) {
                this.field10863.method5096();
                field10864++;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10867[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)V", line = 31)
    public static void method5440(int arg0) {
        try {
            field10866 = null;
            field10865 = null;
            if (arg0 == 0) {
                field10862 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10867[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5441(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x41);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5442(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 111;
                    break;
                case 1:
                    var10005 = 100;
                    break;
                case 2:
                    var10005 = 79;
                    break;
                case 3:
                    var10005 = 32;
                    break;
                default:
                    var10005 = 65;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
