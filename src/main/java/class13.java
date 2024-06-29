import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class13 {

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field379 = -1;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "[I")
    public static int[] field380 = new int[2048];

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field382 = 0;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field383 = 0;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "[I")
    public static int[] field386 = new int[50];

    @OriginalMember(owner = "client!c", name = "i", descriptor = "[Ljd;")
    public static class58[] field387 = new class58[4];

    @OriginalMember(owner = "client!c", name = "j", descriptor = "Lad;")
    private static class5 field388 = class88.method674("M", 105);

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Lad;")
    public static class5 field385 = field388;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "Lrd;")
    public static class106 field389;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "Luc;")
    public static class123 field384;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "[[I")
    public static int[][] field390;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 3)
    public static final void method117(int arg0) {
        field381++;
        int var1 = 61 % ((57 - arg0) / 32);
        client.field494.method885(-96);
        class104.field2531 = class114.method906(class104.field2531);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V", line = 31)
    public static void method118(int arg0) {
        field384 = null;
        field390 = null;
        field387 = null;
        field388 = null;
        field385 = null;
        field386 = null;
        field380 = null;
        field389 = null;
        if (arg0 != 2048) {
            field383 = -40;
        }
    }
}
