import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class343 extends class108 {

    @OriginalMember(owner = "client!vv", name = "M", descriptor = "[Ljava/lang/String;")
    private static final String[] field5592 = new String[] { method2885(method2884("\bp\u0019\u0018<")), method2885(method2884("\bp\u0019\u0016<")), method2885(method2884("\u0010s[<")), method2885(method2884("\bp\u0019\u0019<")), method2885(method2884("\u0005(\u0019~i")), method2885(method2884("\bp\u0019\u001a<")) };

    @OriginalMember(owner = "client!vv", name = "D", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!vv", name = "J", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!vv", name = "K", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!vv", name = "L", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!vv", name = "F", descriptor = "[B")
    private byte[] field5589;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIBI)[B", line = 6)
    public final byte[] method2881(int arg0, int arg1, byte arg2, int arg3) {
        try {
            this.field5589 = new byte[arg0 * arg3 * arg1 * 2];
            field5587++;
            if (arg2 > -75) {
                method2883(-77, null);
            }
            this.method521(arg0, (byte) 123, arg3, arg1);
            return this.field5589;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field5592[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lmj;IBI)V", line = 21)
    public static final void method2882(class683 arg0, int arg1, byte arg2, int arg3) {
        try {
            field5590++;
            if (class360.field5806 == null && !class16.field177 && arg0 != null && class260.method2191((byte) -128, arg0) != null) {
                class360.field5806 = arg0;
                class546.field8028 = class260.method2191((byte) -123, arg0);
                class456.field7040 = false;
                class472.field7215 = arg1;
                class504.field7551 = 0;
                class772.field11312 = arg3;
                if (arg2 > 11) {
                    ;
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5592[3] + (arg0 == null ? field5592[2] : field5592[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(BII)V", line = 46)
    public final void method1008(byte arg0, int arg1, int arg2) {
        try {
            if (arg1 != 0) {
                this.field5589 = null;
            }
            field5588++;
            byte var7 = (byte) ((arg0 >> 1 & 0x7F) + 127);
            int var4 = arg2 * 2;
            int var10001 = var4;
            int var8 = var4 + 1;
            this.field5589[var10001] = var7;
            this.field5589[var8] = var7;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field5592[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "()V", line = 63)
    public class343() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(ILmk;)I", line = 66)
    public static final int method2883(int arg0, class59 arg1) {
        try {
            field5591++;
            String var2 = class207.method1869(arg1, (byte) -112);
            int[] var3 = null;
            if (class772.method5571((byte) -54, arg1.field773)) {
                var3 = class229.field3563.method531((int) arg1.field762, (byte) 29).field8476;
            } else if (arg1.field771 != -1) {
                var3 = class229.field3563.method531(arg1.field771, (byte) 121).field8476;
            } else if (class738.method5357(12, arg1.field773)) {
                class19 var4 = (class19) class176.field2797.method737((byte) -39, (long) ((int) arg1.field762));
                if (var4 != null) {
                    class426 var5 = var4.field194;
                    class162 var6 = var5.field6716;
                    if (var6.field2620 != null) {
                        var6 = var6.method1530(-95, class398.field6315);
                    }
                    if (var6 != null) {
                        var3 = var6.field2569;
                    }
                }
            } else if (class252.method2138(-1, arg1.field773)) {
                Object var7 = null;
                class362 var8;
                if (arg1.field773 == 1001) {
                    var8 = class370.field5999.method4002(112, (int) arg1.field762);
                } else {
                    var8 = class370.field5999.method4002(124, (int) (arg1.field762 >>> 32 & 0x7FFFFFFFL));
                }
                if (var8.field5873 != null) {
                    var8 = var8.method2997(arg0 ^ 0x3CF, class398.field6315);
                }
                if (var8 != null) {
                    var3 = var8.field5900;
                }
            }
            if (arg0 != -1002) {
                return -52;
            }
            if (var3 != null) {
                var2 = var2 + class679.method4944(arg0 ^ 0xFFFFFC16, var3);
            }
            int var9 = client.field5163.method500(0, class475.field7238, var2);
            if (arg1.field763) {
                var9 += class351.field5676.method7() + 4;
            }
            return var9;
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field5592[5] + arg0 + ',' + (arg1 == null ? field5592[2] : field5592[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!vv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2884(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x14);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2885(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 126;
                    break;
                case 1:
                    var10005 = 6;
                    break;
                case 2:
                    var10005 = 55;
                    break;
                case 3:
                    var10005 = 80;
                    break;
                default:
                    var10005 = 20;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
