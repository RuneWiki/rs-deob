import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class189 extends class134 {

    @OriginalMember(owner = "client!wp", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2994 = new String[] { method1763(method1762("f+<=w")), method1763(method1762("\u007f.~\u0013")), method1763(method1762("ju<Q\"")), method1763(method1762("f+<;w")), method1763(method1762("f+<<w")) };

    @OriginalMember(owner = "client!wp", name = "s", descriptor = "Lmj;")
    public static class683 field2991 = null;

    @OriginalMember(owner = "client!wp", name = "p", descriptor = "F")
    public static float field2989;

    @OriginalMember(owner = "client!wp", name = "t", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!wp", name = "q", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!wp", name = "r", descriptor = "Ljava/lang/String;")
    private String field2992;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "()V", line = 5)
    public static final void method1760() {
        for (int var0 = 0; var0 < class780.field11382.length; var0++) {
            class780.field11382[var0].method3309();
        }
        class780.field11382 = null;
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)V", line = 16)
    public static void method1761(int arg0) {
        try {
            if (arg0 > 25) {
                field2991 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2994[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILwq;)V", line = 35)
    public final void method102(int arg0, class176 arg1) {
        try {
            field2990++;
            this.field2992 = arg1.method1635((byte) 104);
            arg1.method1622(-18712);
            int var3 = -108 % ((83 - arg0) / 34);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2994[3] + arg0 + ',' + (arg1 == null ? field2994[1] : field2994[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lsca;I)V", line = 48)
    public final void method100(class47 arg0, int arg1) {
        try {
            field2993++;
            arg0.field561 = this.field2992;
            if (arg1 < -81) {
                ;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2994[4] + (arg0 == null ? field2994[1] : field2994[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1762(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1763(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 17;
                    break;
                case 1:
                    var10005 = 91;
                    break;
                case 2:
                    var10005 = 18;
                    break;
                case 3:
                    var10005 = 127;
                    break;
                default:
                    var10005 = 95;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
