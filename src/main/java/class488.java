import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class488 extends class108 {

    @OriginalMember(owner = "client!vq", name = "M", descriptor = "[Ljava/lang/String;")
    private static final String[] field7373 = new String[] { method3709(method3708("a=AF[")), method3709(method3708("a=AE[")), method3709(method3708("lbA!\u000e")), method3709(method3708("y9\u0003c")), method3709(method3708("a=A\\[")), method3709(method3708("a=AG[")), method3709(method3708("a=AI[")) };

    @OriginalMember(owner = "client!vq", name = "K", descriptor = "I")
    public static int field7368;

    @OriginalMember(owner = "client!vq", name = "D", descriptor = "I")
    public static int field7371;

    @OriginalMember(owner = "client!vq", name = "L", descriptor = "I")
    public static int field7372;

    @OriginalMember(owner = "client!vq", name = "J", descriptor = "Loca;")
    public static class274 field7369;

    @OriginalMember(owner = "client!vq", name = "F", descriptor = "[B")
    private byte[] field7370;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lwq;I)V")
    public static final void method3704(class176 arg0, int arg1) {
        try {
            field7368++;
            if ((arg0.field2805.length - arg0.field2799) >= 1) {
                int var2 = arg0.method1645((byte) -97);
                if (~var2 <= arg1 && var2 <= 1 && (arg0.field2805.length - arg0.field2799) >= 2) {
                    int var3 = arg0.method1687((byte) -73);
                    if ((arg0.field2805.length - arg0.field2799) >= (var3 * 6)) {
                        for (int var4 = 0; var4 < var3; var4++) {
                            int var5 = arg0.method1687((byte) -81);
                            int var6 = arg0.method1622(arg1 - 18711);
                            if (var5 < class380.field6121.length && class335.field5467[var5] && (class655.field9378.method3718(var5, -3292).field4857 != '1' || var6 >= -1 && var6 <= 1)) {
                                class380.field6121[var5] = var6;
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field7373[1] + (arg0 == null ? field7373[3] : field7373[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "()V")
    public class488() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(B)V")
    public static void method3705(byte arg0) {
        try {
            field7369 = null;
            if (arg0 >= -93) {
                method3705((byte) -13);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7373[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BII)V")
    public final void method1008(byte arg0, int arg1, int arg2) {
        try {
            field7372++;
            byte var7 = (byte) ((arg0 >> 1 & 0x7F) + 127);
            int var4 = arg2 * 2;
            if (arg1 == 0) {
                this.field7370[var4++] = var7;
                this.field7370[var4] = var7;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7373[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(JJ)J")
    public static long method3706(long arg0, long arg1) {
        try {
            return arg0 & arg1;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7373[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIBI)[B")
    public final byte[] method3707(int arg0, int arg1, byte arg2, int arg3) {
        try {
            field7371++;
            this.field7370 = new byte[arg0 * 2 * arg1 * arg3];
            this.method521(arg0, (byte) 123, arg3, arg1);
            if (arg2 > -75) {
                method3705((byte) -55);
            }
            return this.field7370;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7373[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3708(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x73);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3709(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 23;
                    break;
                case 1:
                    var10005 = 76;
                    break;
                case 2:
                    var10005 = 111;
                    break;
                case 3:
                    var10005 = 15;
                    break;
                default:
                    var10005 = 115;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
