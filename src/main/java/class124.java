import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public abstract class class124 {

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field2176 = 0;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "Ljf;")
    public static class229 field2179 = class212.method1457((byte) 78, "unzap");

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "[I")
    public static int[] field2178 = new int[100];

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "Ljf;")
    public static class229 field2177 = class212.method1457((byte) 124, "Prendre");

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "Ljf;")
    public static class229 field2184 = class212.method1457((byte) 61, "cookieprefix");

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field2181 = 0;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    public static int field2185 = 0;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "[[B")
    public static byte[][] field2180 = new byte[1000][];

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "Ldj;")
    public static class330 field2183;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "Lkb;")
    public static class35 field2182;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)J", line = 14)
    public static final long method880(int arg0, int arg1, int arg2) {
        class125 var3 = class312.field5246[arg0][arg1][arg2];
        return var3 == null || var3.field2190 == null ? 0L : var3.field2190.field2493;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V", line = 39)
    public static void method881(boolean arg0) {
        if (!arg0) {
            return;
        }
        field2178 = null;
        field2184 = null;
        field2182 = null;
        field2177 = null;
        field2179 = null;
        field2183 = null;
        field2180 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IB)V")
    public abstract void method876(int arg0, byte arg1);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)I")
    public abstract int method877(int arg0, int arg1);

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(II)[B")
    public abstract byte[] method878(int arg0, int arg1);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)Ltm;")
    public abstract class71 method879(int arg0);
}
