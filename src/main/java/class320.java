import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class320 extends class134 {

    @OriginalMember(owner = "client!vw", name = "s", descriptor = "I")
    private int field5211 = -1;

    @OriginalMember(owner = "client!vw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5215 = new String[] { method2742(method2741("dP!~b")), method2742(method2741("|RcV")), method2742(method2741("i\t!\u00147")), method2742(method2741("dP!yb")), method2742(method2741("dP!{b")), method2742(method2741("dP!xb")) };

    @OriginalMember(owner = "client!vw", name = "w", descriptor = "Lhl;")
    public static class556 field5207 = new class556(70, 0);

    @OriginalMember(owner = "client!vw", name = "q", descriptor = "Liha;")
    public static class29 field5210 = new class29(8);

    @OriginalMember(owner = "client!vw", name = "u", descriptor = "I")
    public static int field5213 = 0;

    @OriginalMember(owner = "client!vw", name = "v", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!vw", name = "t", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!vw", name = "p", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!vw", name = "r", descriptor = "[I")
    public static int[] field5214;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILwq;)V", line = 4)
    public final void method102(int arg0, class176 arg1) {
        try {
            this.field5211 = arg1.method1687((byte) -110);
            field5209++;
            int var3 = -75 % ((83 - arg0) / 34);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5215[0] + arg0 + ',' + (arg1 == null ? field5215[1] : field5215[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(I)V", line = 17)
    public static final void method2739(int arg0) {
        try {
            field5212++;
            class22.field216 = arg0;
            class348.field5640 = arg0;
            class694.field10009 = arg0;
            class741.field10913 = arg0;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5215[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lsca;I)V", line = 34)
    public final void method100(class47 arg0, int arg1) {
        try {
            field5208++;
            if (arg1 >= -81) {
                this.method100(null, 79);
            }
            arg0.method477(this.field5211, -3132);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5215[3] + (arg0 == null ? field5215[1] : field5215[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(B)V", line = 50)
    public static void method2740(byte arg0) {
        try {
            field5207 = null;
            if (arg0 > 62) {
                field5214 = null;
                field5210 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5215[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2741(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2742(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 18;
                    break;
                case 1:
                    var10005 = 39;
                    break;
                case 2:
                    var10005 = 15;
                    break;
                case 3:
                    var10005 = 58;
                    break;
                default:
                    var10005 = 74;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
