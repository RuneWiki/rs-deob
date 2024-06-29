import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class45 {

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field688 = 0;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "[[B")
    public static byte[][] field693 = new byte[50][];

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "[I")
    public static int[] field691 = new int[100];

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "Z")
    public static boolean field687 = true;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 18)
    public static final void method332(int arg0) {
        for (int var1 = arg0; var1 < class203.field3354; var1++) {
            class71 var2 = class208.method1452(var1, 50);
            if (var2 != null && var2.field1186 == 0) {
                class85.field1454[var1] = 0;
                class166.field2711[var1] = 0;
            }
        }
        class179.field2941 = new class97(16);
        field690++;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILsi;I)Z", line = 41)
    public static final boolean method333(int arg0, class66 arg1, int arg2) {
        if (arg0 != 0) {
            method335(36);
        }
        field686++;
        byte[] var3 = arg1.method504(arg2, arg0 ^ 0xFFFFC998);
        if (var3 == null) {
            return false;
        } else {
            class300.method2015(var3, 7612);
            return true;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZLph;)V", line = 66)
    public static final void method334(boolean arg0, class229 arg1) {
        field692++;
        if (class30.field484 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg1.method1634(arg0);
        if (var3 == 0L) {
            return;
        }
        while (class30.field484.length > var2 && class30.field484[var2].field1325 != var3) {
            var2++;
        }
        if (var2 < class30.field484.length && class30.field484[var2] != null) {
            class121.field2033.method37(103, 50);
            class121.field2033.method1208((byte) -6, class30.field484[var2].field1325);
            class118.field1983++;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V", line = 106)
    public static void method335(int arg0) {
        field691 = null;
        field693 = (byte[][]) null;
        if (arg0 != 0) {
            method334(false, (class229) null);
        }
    }
}
