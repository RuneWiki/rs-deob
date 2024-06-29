import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class25 {

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "J")
    public long field272;

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "Lvf;")
    private class159 field273;

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field280 = new String[] { method277(method276("Qw7B")), method277(method276("Vpu\u0012\u0010Qk/\u0010Q")), method277(method276("D,u\u0000\u0004")), method277(method276("VpulQ")), method277(method276("VpuoQ")), method277(method276("VpuH\u0010Qc7G\u0003Z*")) };

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "Lhl;")
    public static class556 field274 = new class556(119, 16);

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "[[I")
    public static int[][] field276 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "[I")
    public static int[] field275 = new int[1];

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "Lvn;")
    public static class330 field279 = new class330(85, 8);

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V", line = 3)
    public static final void method274(int arg0) {
        try {
            class551.field8082.method304(arg0 - 22900);
            field278++;
            class104.field1524.method304(1);
            class303.field4880.method304(1);
            class37.field426.method304(1);
            if (arg0 != 22901) {
                field274 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field280[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V", line = 20)
    public static void method275(int arg0) {
        try {
            field276 = null;
            field279 = null;
            if (arg0 != -25274) {
                field277 = 7;
            }
            field274 = null;
            field275 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field280[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ir", name = "finalize", descriptor = "()V", line = 35)
    protected final void finalize() throws Throwable {
        try {
            field271++;
            this.field273.method1495(this.field272, true);
            super.finalize();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field280[5] + ')');
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lvf;J[Llo;)V", line = 45)
    public class25(class159 arg0, long arg1, class789[] arg2) {
        try {
            this.field272 = arg1;
            this.field273 = arg0;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field280[1] + (arg0 == null ? field280[0] : field280[2]) + ',' + arg1 + ',' + (arg2 == null ? field280[0] : field280[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method276(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x79);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method277(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 63;
                    break;
                case 1:
                    var10005 = 2;
                    break;
                case 2:
                    var10005 = 91;
                    break;
                case 3:
                    var10005 = 46;
                    break;
                default:
                    var10005 = 121;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
