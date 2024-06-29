import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class363 {

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "[I")
    public int[] field5270;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "[I")
    public int[] field5268;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "[I")
    public int[] field5271;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "[I")
    public int[] field5267;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "[S")
    public short[] field5272;

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "[S")
    public short[] field5264;

    @OriginalMember(owner = "client!vq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5274 = new String[] { method2893(method2892("t}yV8")), method2893(method2892("t}y+yle#)8")), method2893(method2892("y\"y9m")), method2893(method2892("ly;{")) };

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "I")
    public static int field5266 = 0;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "Lmv;")
    public static class125 field5265 = new class125(24, -1);

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "J")
    public static long field5273 = 0L;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "Lvn;")
    public static class328 field5269;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V", line = 16)
    public static void method2891(int arg0) {
        try {
            if (arg0 < -53) {
                field5269 = null;
                field5265 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5274[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lpga;)V", line = 29)
    public class363(class371 arg0) {
        try {
            this.field5270 = new int[2];
            this.field5268 = new int[2];
            this.field5271 = new int[3];
            this.field5267 = new int[3];
            this.field5267[1] = arg0.field5433;
            this.field5267[0] = arg0.field5398;
            this.field5267[2] = arg0.field5412;
            this.field5271[0] = arg0.field5408;
            this.field5271[1] = arg0.field5384;
            this.field5271[2] = arg0.field5380;
            this.field5270[1] = arg0.field5424;
            this.field5270[0] = arg0.field5382;
            this.field5268[1] = arg0.field5375;
            this.field5268[0] = arg0.field5425;
            if (arg0.field5364 != null) {
                this.field5272 = new short[arg0.field5364.length];
                class569.method4241(arg0.field5364, 0, this.field5272, 0, this.field5272.length);
            }
            if (arg0.field5422 != null) {
                this.field5264 = new short[arg0.field5422.length];
                class569.method4241(arg0.field5422, 0, this.field5264, 0, this.field5264.length);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5274[1] + (arg0 == null ? field5274[3] : field5274[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!vq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2892(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x10);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2893(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 2;
                    break;
                case 1:
                    var10005 = 12;
                    break;
                case 2:
                    var10005 = 87;
                    break;
                case 3:
                    var10005 = 23;
                    break;
                default:
                    var10005 = 16;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
