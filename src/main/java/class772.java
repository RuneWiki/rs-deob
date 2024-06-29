import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class772 extends class437 {

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field11314;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11316 = new String[] { method5573(method5572("u\u000e'\nJ")), method5573(method5572("u\u000e'w\u000bt\u0005}uJ")), method5573(method5572("u\u000e'\tJ")) };

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public static int field11312 = 0;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
    public static int field11311;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    public static int field11313;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public static int field11315;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public final void method5570(byte arg0) {
        try {
            this.field11314.method5093();
            field11315++;
            if (arg0 != -92) {
                this.field11314 = null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11316[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)Z")
    public static final boolean method5571(byte arg0, int arg1) {
        try {
            field11313++;
            if (arg1 == 20 || arg1 == 11 || arg1 == 60 || arg1 == 17 || arg1 == 2) {
                return true;
            } else if (arg1 == 52 || arg1 == 1003) {
                return true;
            } else {
                if (arg0 != -54) {
                    method5571((byte) -74, 1);
                }
                return false;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11316[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V")
    public class772(int arg0) {
        try {
            this.field11314 = new NativeHeap(arg0);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11316[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5572(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x62);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5573(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 26;
                    break;
                case 1:
                    var10005 = 108;
                    break;
                case 2:
                    var10005 = 9;
                    break;
                case 3:
                    var10005 = 75;
                    break;
                default:
                    var10005 = 98;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
