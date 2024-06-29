import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public abstract class class14 {

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "[I")
    public static int[] field303 = new int[4096];

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "Lgd;")
    public static class325 field306 = new class325(50);

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "Ljava/lang/String;")
    public static String field308 = "flash3:";

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "Ltk;")
    public static class266 field305;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "Lbn;")
    public static class72 field301;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "[[B")
    public static byte[][] field307;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)Z", line = 16)
    public static final boolean method182(int arg0) {
        field304++;
        int var1 = 30 % ((arg0 - 54) / 59);
        return class182.field2882 == 0 ? class20.field370.method1442((byte) -82) : true;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V", line = 30)
    public static void method183(int arg0) {
        field303 = null;
        field306 = null;
        if (arg0 < -14) {
            field305 = null;
            field307 = (byte[][]) null;
            field308 = null;
            field301 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)I", line = 53)
    public static final int method185(int arg0, int arg1) {
        field302++;
        return arg0 == 127 ? arg1 & 0x7F : -60;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
    public abstract void method181(byte arg0);

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZII)I")
    public abstract int method184(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)J")
    public abstract long method186(byte arg0);
}
