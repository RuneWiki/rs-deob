import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class557 {

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public int field8291;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Lrda;")
    private class690 field8294;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8295 = new String[] { method4182(method4181("ggFW;mc\u0004X(f*")), method4182(method4181("x,F\u001f/")), method4182(method4181("mw\u0004]")), method4182(method4181("ggF\r;mk\u001c\u000fz")) };

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field8290 = 0;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field8292 = 1401;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field8293;

    @OriginalMember(owner = "client!de", name = "finalize", descriptor = "()V", line = 10)
    protected final void finalize() throws Throwable {
        try {
            this.field8294.method5053(0, this.field8291);
            field8293++;
            super.finalize();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8295[0] + ')');
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lrda;II)V", line = 26)
    public class557(class690 arg0, int arg1, int arg2) {
        try {
            this.field8291 = arg2;
            this.field8294 = arg0;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8295[3] + (arg0 == null ? field8295[2] : field8295[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!de", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4181(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x52);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!de", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4182(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 3;
                    break;
                case 1:
                    var10005 = 2;
                    break;
                case 2:
                    var10005 = 104;
                    break;
                case 3:
                    var10005 = 49;
                    break;
                default:
                    var10005 = 82;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
