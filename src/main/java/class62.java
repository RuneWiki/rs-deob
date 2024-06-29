import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class62 {

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "Z")
    public static boolean field836 = false;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
    public static int field840 = 0;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "[Lin;")
    public static class182[] field842;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "Lij;")
    public static class316 field841;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "Lea;")
    public static class58 field844;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "[I")
    public static int[] field843;

    static {
        new class368((String) null, "geschickt werden.", (String) null, (String) null);
        field842 = new class182[14];
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V", line = 3)
    public static void method501(int arg0) {
        field843 = null;
        field844 = null;
        field841 = null;
        field842 = null;
        if (arg0 != 0) {
            field836 = false;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(BC)C", line = 16)
    public static final char method502(byte arg0, char arg1) {
        field838++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else if (arg1 == 'œ') {
            return 'e';
        } else {
            int var2 = -1 % ((arg0 + 25) / 50);
            return '\u0000';
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIFIIIZII)[[I", line = 45)
    public static final int[][] method503(int arg0, int arg1, float arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field837++;
        int[][] var9 = new int[arg8][arg3];
        class319 var10 = new class319();
        var10.field4355 = (int) (arg2 * 4096.0F);
        var10.field4348 = arg5;
        var10.field4347 = arg6;
        if (arg1 != 28482) {
            method503(-8, 48, -1.1957016F, -15, -106, -104, false, -5, -2);
        }
        var10.field4346 = arg7;
        var10.field4343 = arg4;
        var10.method113(arg1 ^ 0x6F41);
        class119.method926(arg8, arg3, 209268044);
        for (int var11 = 0; var11 < arg8; var11++) {
            var10.method1949(var9[var11], var11, 4);
        }
        return var9;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(BI)V", line = 77)
    public static final void method504(byte arg0, int arg1) {
        class408 var2 = class120.field1820;
        synchronized (class120.field1820) {
            class120.field1820.method2531(arg1, 112);
        }
        if (arg0 < 26) {
            method504((byte) -6, -128);
        }
        field839++;
    }
}
