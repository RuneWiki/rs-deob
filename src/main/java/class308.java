import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public abstract class class308 {

    @OriginalMember(owner = "client!tha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4843 = new String[] { method2615(method2614("\u001bQ\u0010$/G")), method2615(method2614("\u0014\u0017_$\u0016")), method2615(method2614("\u0001L\u001df")), method2615(method2614("\u001bQ\u0010$(G")), method2615(method2614("\u001bQ\u0010$.G")) };

    @OriginalMember(owner = "client!tha", name = "e", descriptor = "Z")
    public static boolean field4836 = false;

    @OriginalMember(owner = "client!tha", name = "f", descriptor = "I")
    public static int field4840 = 0;

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!tha", name = "d", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "I")
    public int field4841;

    @OriginalMember(owner = "client!tha", name = "c", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!tha", name = "g", descriptor = "Ljava/lang/String;")
    public String field4837;

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(FFIIFLjf;IFII[BIIF)V", line = 14)
    public static final void method2611(float arg0, float arg1, int arg2, int arg3, float arg4, class227 arg5, int arg6, float arg7, int arg8, int arg9, byte[] arg10, int arg11, int arg12, float arg13) {
        try {
            field4838++;
            int var14 = arg2 * arg11;
            float[] var15 = new float[var14];
            for (int var16 = arg9; var16 < arg6; var16++) {
                arg5.method1964(arg13 / (float) arg8, arg0 * 127.0F, arg3, 1, arg11, 0, arg2, arg1 / (float) arg2, arg8, var15, arg7 / (float) arg11);
                int var17 = arg12;
                arg0 *= arg4;
                arg13 *= 2.0F;
                arg1 *= 2.0F;
                arg7 *= 2.0F;
                for (int var18 = 0; var18 < var14; var18++) {
                    arg10[var17] = (byte) ((int) ((float) arg10[var17] + var15[var18]));
                    var17++;
                }
            }
            int var19 = arg12;
            for (int var20 = 0; var20 < var14; var20++) {
                arg10[var19] = (byte) (arg10[var19] + 127);
                var19++;
            }
        } catch (RuntimeException var22) {
            throw class759.method5498(var22, field4843[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field4843[2] : field4843[1]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 == null ? field4843[2] : field4843[1]) + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
        }
    }

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "(B)V", line = 62)
    public static final void method2612(byte arg0) {
        try {
            class76.field879++;
            field4842++;
            class280 var1 = class610.method4508(class554.field8253, class279.field4190, (byte) 18);
            var1.field4197.method1428((byte) -24, 0);
            class106.method934((byte) 53, var1);
            if (arg0 != 66) {
                field4840 = 83;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4843[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(I)Ljava/net/Socket;", line = 77)
    public final Socket method2613(int arg0) throws IOException {
        try {
            field4839++;
            if (arg0 != -21675) {
                method2611(0.25140506F, -1.0753866F, 58, -87, 1.5621123F, null, -18, -1.2586614F, -43, 115, null, -97, 41, 0.62323105F);
            }
            return new Socket(this.field4837, this.field4841);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4843[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(B)Ljava/net/Socket;")
    public abstract Socket method2610(byte arg0) throws IOException;

    @OriginalMember(owner = "client!tha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2614(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2615(char[] arg0) {
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
                    var10005 = 57;
                    break;
                case 2:
                    var10005 = 113;
                    break;
                case 3:
                    var10005 = 10;
                    break;
                default:
                    var10005 = 107;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
