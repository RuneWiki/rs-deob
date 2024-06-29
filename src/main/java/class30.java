import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class30 {

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Z")
    public boolean field633 = true;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public int field638;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public int field631;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public int field630;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public int field639;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public int field640;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field632 = -1;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "Lqd;")
    private static class40 field637 = class147.method1106("Loading world list data", (byte) -120);

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "Lqd;")
    public static class40 field641 = field637;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "[[Z")
    public static boolean[][] field634;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V", line = 16)
    public static void method278(byte arg0) {
        if (arg0 > -40) {
            method278((byte) 28);
        }
        field637 = null;
        field641 = null;
        field634 = (boolean[][]) null;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(IIIIIIZ)V", line = 97)
    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field638 = arg3;
        this.field633 = arg6;
        this.field631 = arg5;
        this.field630 = arg4;
        this.field639 = arg2;
        this.field635 = arg1;
        this.field640 = arg0;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZIB)I", line = 35)
    public static final int method279(int arg0, boolean arg1, int arg2, byte arg3) {
        field636++;
        class164 var4 = (class164) class48.field934.method1405((byte) 115, (long) arg2);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field2717.length; var6++) {
            if (var4.field2717[var6] >= 0 && var4.field2717[var6] < class288.field4835) {
                class277 var7 = class165.method1243(-69, var4.field2717[var6]);
                if (var7.field4651 != null) {
                    class270 var8 = (class270) var7.field4651.method1405((byte) 115, (long) arg0);
                    if (var8 != null) {
                        if (arg1) {
                            var5 += var4.field2725[var6] * var8.field4483;
                        } else {
                            var5 += var8.field4483;
                        }
                    }
                }
            }
        }
        if (arg3 >= -120) {
            field637 = (class40) null;
        }
        return var5;
    }
}
