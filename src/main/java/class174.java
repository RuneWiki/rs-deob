import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public class class174 extends OutputStream {

    @OriginalMember(owner = "client!pha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2414 = new String[] { method1539(method1538("3\u0000@)\u00031\u0001Ub\\")), method1539(method1538("8F\u000f)\t")), method1539(method1538("-\u001dMk")), method1539(method1538("3\u0000@)5k")), method1539(method1538("3\u0000@)6k")) };

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!pha", name = "d", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!pha", name = "c", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!pha", name = "b", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(FIIZIIIII)[[I", line = 4)
    public static final int[][] method1536(float arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            field2410++;
            int var9 = -42 / ((-arg5 - 64) / 58);
            int[][] var10 = new int[arg6][arg8];
            class424 var11 = new class424();
            var11.field6251 = arg3;
            var11.field6260 = arg2;
            var11.field6249 = arg4;
            var11.field6246 = (int) (arg0 * 4096.0F);
            var11.field6254 = arg7;
            var11.method437(27132);
            class383.method3069(arg6, 71, arg8);
            for (int var12 = 0; var12 < arg6; var12++) {
                var11.method3273(var12, true, var10[var12]);
            }
            return var10;
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field2414[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!pha", name = "write", descriptor = "(I)V", line = 34)
    public final void write(int arg0) throws IOException {
        try {
            field2413++;
            throw new IOException();
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2414[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(Lc;IILha;II)V", line = 52)
    public static final void method1537(class198 arg0, int arg1, int arg2, class66 arg3, int arg4, int arg5) {
        try {
            field2411++;
            class709 var6 = class617.field9073.method4604((byte) -124, arg0.field3060);
            if (var6.field10268 != -1) {
                if (arg0.field3049) {
                    int var15 = arg0.field3069 + arg5;
                    arg5 = var15 & 0x3;
                } else {
                    arg5 = 0;
                }
                class581 var7 = var6.method5175(false, arg5, arg0.field3072, arg3);
                if (var7 != null) {
                    int var8 = arg0.field3093;
                    int var9 = -115 % ((arg2 + 9) / 53);
                    int var10 = arg0.field3087;
                    if ((arg5 & 0x1) == 1) {
                        var10 = arg0.field3093;
                        var8 = arg0.field3087;
                    }
                    int var11 = var7.method988();
                    int var12 = var7.method997();
                    if (var6.field10276) {
                        var11 = var8 * 4;
                        var12 = var10 * 4;
                    }
                    if (var6.field10270 == 0) {
                        var7.method4344(arg1, arg4 - ((var10 - 1) * 4), var11, var12);
                    } else {
                        var7.method4343(arg1, -(var10 * 4) - (-arg4 - 4), var11, var12, 0, var6.field10270 | 0xFF000000, 1);
                    }
                }
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field2414[3] + (arg0 == null ? field2414[2] : field2414[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field2414[2] : field2414[1]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!pha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1538(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x74);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1539(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 67;
                    break;
                case 1:
                    var10005 = 104;
                    break;
                case 2:
                    var10005 = 33;
                    break;
                case 3:
                    var10005 = 7;
                    break;
                default:
                    var10005 = 116;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
