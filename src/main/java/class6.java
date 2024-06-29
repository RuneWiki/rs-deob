import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!q")
public class class6 {

    @OriginalMember(owner = "mapview!q", name = "d", descriptor = "Lh;")
    public static class15 field96 = class18.method153("Dungeon", 1);

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "[[B")
    public static byte[][] field93 = new byte[1000][];

    @OriginalMember(owner = "mapview!q", name = "f", descriptor = "Lh;")
    public static class15 field98 = class18.method153("details)3dat", 1);

    @OriginalMember(owner = "mapview!q", name = "h", descriptor = "Lh;")
    public static class15 field100 = class18.method153("Combat Training", 1);

    @OriginalMember(owner = "mapview!q", name = "i", descriptor = "Lh;")
    public static class15 field101 = class18.method153("Cookery Shop", 1);

    @OriginalMember(owner = "mapview!q", name = "g", descriptor = "Lh;")
    public static class15 field99 = class18.method153("100(U", 1);

    @OriginalMember(owner = "mapview!q", name = "j", descriptor = "[I")
    public static int[] field102 = new int[128];

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "J")
    public long field94;

    @OriginalMember(owner = "mapview!q", name = "c", descriptor = "Lq;")
    public class6 field95;

    @OriginalMember(owner = "mapview!q", name = "e", descriptor = "Lq;")
    public class6 field97;

    @OriginalMember(owner = "mapview!q", name = "k", descriptor = "[Lh;")
    public static class15[] field103;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(I)V", line = 8)
    public final void method52(int arg0) {
        if (this.field95 == null) {
            return;
        }
        this.field95.field97 = this.field97;
        this.field97.field95 = this.field95;
        if (arg0 == 128) {
            this.field95 = null;
            this.field97 = null;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(ILg;II)[Lma;", line = 32)
    public static final class26[] method53(int arg0, class13 arg1, int arg2, int arg3) {
        if (arg3 != 1000) {
            field93 = null;
        }
        return mapview.method13(true, arg2, arg1, arg0) ? class20.method174(4096) : null;
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(Z)B", line = 65)
    public static final byte method54(boolean arg0) {
        if (arg0) {
            method54(true);
        }
        return class23.field311 == null ? 0 : class23.field311[class15.field220];
    }

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "(I)V", line = 79)
    public static void method55(int arg0) {
        field96 = null;
        field102 = null;
        field99 = null;
        field93 = null;
        field103 = null;
        field101 = null;
        field100 = null;
        if (arg0 != 0) {
            method53(100, null, 62, -51);
        }
        field98 = null;
    }
}
