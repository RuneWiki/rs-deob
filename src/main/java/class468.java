import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class468 extends class134 {

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field7193 = new String[] { method3614(method3613("RJNaR")), method3614(method3613("_\u000eN\f\u0007")), method3614(method3613("JU\fN")), method3614(method3613("RJNcR")), method3614(method3613("RJN`R")), method3614(method3613("RJNfR")) };

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "B")
    private byte field7180;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "B")
    private byte field7182;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "B")
    private byte field7186;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "B")
    private byte field7188;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "F")
    public static float field7189;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    public static int field7181;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public static int field7187;

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
    public static int field7191;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
    public static int field7192;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "Z")
    private boolean field7185;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "[Loe;")
    public static class210[] field7183;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lsca;I)V", line = 3)
    public final void method100(class47 arg0, int arg1) {
        try {
            arg0.field555 = this.field7182;
            arg0.field543 = this.field7186;
            arg0.field533 = this.field7180;
            if (arg1 > -81) {
                this.field7188 = 40;
            }
            field7190++;
            arg0.field570 = this.field7188;
            arg0.field541 = this.field7185;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7193[0] + (arg0 == null ? field7193[2] : field7193[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZLdp;)Z", line = 25)
    public static final boolean method3611(boolean arg0, class3 arg1) {
        try {
            field7191++;
            class362 var2 = class370.field5999.method4002(127, arg1.method32((byte) -95));
            if (var2.field5907 == -1) {
                return true;
            }
            class57 var3 = class179.field2874.method3724(var2.field5907, (byte) -100);
            if (var3.field705 == -1) {
                return true;
            } else if (arg0) {
                return true;
            } else {
                return var3.method573(-34);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7193[4] + arg0 + ',' + (arg1 == null ? field7193[2] : field7193[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILwq;)V", line = 46)
    public final void method102(int arg0, class176 arg1) {
        try {
            int var3 = 125 % ((83 - arg0) / 34);
            this.field7185 = arg1.method1645((byte) -122) == 1;
            field7184++;
            this.field7180 = arg1.method1672(-4);
            this.field7186 = arg1.method1672(-119);
            this.field7182 = arg1.method1672(-70);
            this.field7188 = arg1.method1672(118);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7193[5] + arg0 + ',' + (arg1 == null ? field7193[2] : field7193[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V", line = 63)
    public static void method3612(byte arg0) {
        try {
            field7183 = null;
            if (arg0 != 94) {
                field7189 = 1.5442159F;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7193[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3613(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3614(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 36;
                    break;
                case 1:
                    var10005 = 32;
                    break;
                case 2:
                    var10005 = 96;
                    break;
                case 3:
                    var10005 = 34;
                    break;
                default:
                    var10005 = 122;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
