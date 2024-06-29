import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public abstract class class55 {

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field896 = 0;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "Lka;")
    public static class253 field897 = new class253(64);

    @OriginalMember(owner = "client!df", name = "h", descriptor = "Lp;")
    public static class280 field903 = class18.method140((byte) -119, "cookieprefix");

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field901 = 2;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "Ltg;")
    public static class180 field904;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "[I")
    public static int[] field907;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "[[Z")
    public static boolean[][] field905;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "[[[B")
    public static byte[][][] field902;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "[[[B")
    public static byte[][][] field906;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IB)V")
    public abstract void method400(int arg0, byte arg1);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BI)I")
    public abstract int method401(byte arg0, int arg1);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)[B")
    public abstract byte[] method402(int arg0, int arg1);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(JB)V")
    public static final void method403(long arg0, byte arg1) {
        field899++;
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1 < 82) {
            method404(112);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static void method404(int arg0) {
        field907 = null;
        field897 = null;
        field902 = null;
        field906 = null;
        field903 = null;
        field905 = null;
        field904 = null;
        if (arg0 != 0) {
            method405(-3, 94);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(II)V")
    public static final void method405(int arg0, int arg1) {
        class162 var2 = class220.field3787[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class162 var4 = class220.field3787[var3][arg0][arg1] = class220.field3787[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2834--;
                for (int var5 = 0; var5 < var4.field2841; var5++) {
                    class160 var6 = var4.field2845[var5];
                    if ((var6.field2805 >> 29 & 0x3L) == 2L && var6.field2814 == arg0 && var6.field2796 == arg1) {
                        var6.field2802--;
                    }
                }
            }
        }
        if (class220.field3787[0][arg0][arg1] == null) {
            class220.field3787[0][arg0][arg1] = new class162(0, arg0, arg1);
        }
        class220.field3787[0][arg0][arg1].field2842 = var2;
        class220.field3787[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)I")
    public static final int method406(int arg0, int arg1, int arg2) {
        field898++;
        if (arg0 != -9325) {
            return -45;
        }
        class201 var3 = (class201) class103.field1708.method150((long) arg1, -118);
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && var3.field3520.length > arg2) {
            return var3.field3520[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)Lki;")
    public abstract class62 method407(int arg0);
}
