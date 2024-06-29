import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!fa")
public class class11 {

    @OriginalMember(owner = "mapview!fa", name = "d", descriptor = "Lv;")
    public static class40 field117 = class24.method170("overlay2)3dat", (byte) -123);

    @OriginalMember(owner = "mapview!fa", name = "f", descriptor = "Lv;")
    public static class40 field119 = class24.method170("mapfunction", (byte) -90);

    @OriginalMember(owner = "mapview!fa", name = "e", descriptor = "Lv;")
    public static class40 field118 = class24.method170("Requesting", (byte) 28);

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "[I")
    public static int[] field116;

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "[[Lma;")
    public static class23[][] field115;

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(I)V", line = 28)
    public static void method67(int arg0) {
        field117 = null;
        field115 = null;
        field119 = null;
        field118 = null;
        field116 = null;
        if (arg0 != -32471) {
            method67(65);
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Z[B)[B", line = 46)
    public static final byte[] method68(boolean arg0, byte[] arg1) {
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        if (!arg0) {
            field118 = null;
        }
        class28.method192(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Lo;ILv;Lo;Lv;)Lea;", line = 78)
    public static final class10 method69(class26 arg0, int arg1, class40 arg2, class26 arg3, class40 arg4) {
        if (arg1 != -5998) {
            method68(false, null);
        }
        int var5 = arg3.method184(arg2, -20310);
        int var6 = arg3.method185(var5, (byte) 98, arg4);
        return class27.method191(arg0, arg3, 24380, var6, var5);
    }
}
