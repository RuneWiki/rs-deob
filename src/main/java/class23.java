import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class23 {

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field329 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public int field323;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public int field325;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public int field326;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "J")
    public long field322;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Lhc;")
    public static class235 field324;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Lsa;")
    public class268 field328;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public static void method167(byte arg0) {
        field329 = null;
        int var1 = -12 / ((arg0 - 12) / 49);
        field324 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I")
    public static final int method168(int arg0, int arg1) {
        if (arg0 == 874807368) {
            field327++;
            return arg1 >>> 8;
        } else {
            return -31;
        }
    }
}
