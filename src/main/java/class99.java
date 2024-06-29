import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class99 {

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "Z")
    public boolean field2295 = true;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public int field2286;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public int field2287;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public int field2283;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public int field2284;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public int field2289;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public int field2278;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "Lsc;")
    private static class128 field2281 = class129.method1017(false, "Press (Wchange your password(W on front page)3");

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "[Lsc;")
    public static class128[] field2288 = new class128[1000];

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "Lsc;")
    private static class128 field2282 = class129.method1017(false, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "Lsc;")
    public static class128 field2291 = field2282;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "Lsc;")
    public static class128 field2285 = field2281;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "[Lsc;")
    public static class128[] field2294 = new class128[1000];

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "Lsb;")
    public static class127 field2280 = new class127(4096);

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
    public static int field2297 = 0;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method758(int arg0, byte[] arg1) {
        field2293++;
        int var2 = arg1.length;
        if (arg0 == -2) {
            byte[] var3 = new byte[var2];
            class101.method768(arg1, 0, var3, 0, var2);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method759(boolean arg0, byte[] arg1) {
        field2296++;
        if (!arg0) {
            field2288 = null;
        }
        class86 var2 = new class86(arg1);
        int var3 = var2.method646(-15447);
        int var4 = var2.method666(1183700424);
        if (var4 < 0 || class94.field2215 != 0 && class94.field2215 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method642((byte) -35, 0, var4, var7);
            return var7;
        } else {
            int var5 = var2.method666(1183700424);
            if (var5 < 0 || class94.field2215 != 0 && class94.field2215 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class38.method272(var6, var5, arg1, var4, 9);
            } else {
                class90.field2054.method1215(!arg0, var6, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public static void method760(byte arg0) {
        field2281 = null;
        field2288 = null;
        field2282 = null;
        int var1 = -62 / ((51 - arg0) / 61);
        field2285 = null;
        field2291 = null;
        field2280 = null;
        field2294 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIII)I")
    public static final int method761(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field2292++;
        if (arg3 == var4) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2286 = arg0;
        this.field2287 = arg4;
        this.field2283 = arg3;
        this.field2284 = arg1;
        this.field2289 = arg5;
        this.field2278 = arg2;
        this.field2295 = arg6;
    }
}
