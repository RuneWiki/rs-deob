import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class40 {

    @OriginalMember(owner = "client!di", name = "c", descriptor = "[I")
    public static int[] field796 = new int[] { 0, 0, 0, 0, 10, 6, 0, 0, 2, -1, 0, 0, 0, 0, -2, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 10, 2, 0, 0, 6, 0, -2, 0, -1, 0, 4, 0, 0, -1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 8, 0, 0, 0, 0, 0, 0, 24, 0, 0, 0, 7, 0, 0, 7, 0, 4, -2, 0, 0, 0, 0, 0, 0, 0, -2, 0, 5, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 5, 0, 0, 0, 6, 0, -2, 2, -2, 0, 4, 4, 0, 2, 4, 0, 0, 0, 0, 0, -1, -2, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 6, 0, 6, 15, 0, 3, 0, -1, 0, 0, 0, 0, 0, 20, 0, 0, 6, 0, 12, 0, -2, 0, 0, 3, 0, 0, 3, 0, 0, 7, 6, 0, -1, 0, 0, 0, 0, 6, 6, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, -2, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, -2, 0, 5, 6, 5, 0, 0, 0, 3, 0, 0, 0, 0, -2, -1, 2, 6, 2, 0, 6, 2, 0, 0, 7, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!di", name = "d", descriptor = "Lob;")
    private static class141 field797 = class175.method1195(40, " more options");

    @OriginalMember(owner = "client!di", name = "b", descriptor = "Lob;")
    public static class141 field795 = field797;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "Lvc;")
    public static class212 field800 = new class212(30);

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field802 = 0;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "Lpi;")
    public static class158 field803 = new class158();

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static void method262(int arg0) {
        field803 = null;
        field797 = null;
        field795 = null;
        field796 = null;
        field800 = null;
        if (arg0 != -1155) {
            field795 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)J")
    public static final long method263(int arg0, int arg1, int arg2) {
        class153 var3 = class131.field2506[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field2933; var4++) {
            class9 var5 = var3.field2935[var4];
            if ((var5.field141 >> 29 & 0x3L) == 2L && var5.field156 == arg1 && var5.field143 == arg2) {
                return var5.field141;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(III)I")
    public static final int method264(int arg0, int arg1, int arg2) {
        class136 var3 = (class136) class96.field1894.method792((long) arg1, 22346);
        field798++;
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && arg0 < var3.field2586.length) {
            return arg2 == 0 ? var3.field2586[arg0] : -93;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILpe;)V")
    public static final void method265(int arg0, class154 arg1) {
        field801++;
        if (arg0 != 0) {
            field796 = null;
        }
        class118.field2293 = arg1;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lpe;Lpe;ZLi;B)V")
    public static final void method266(class154 arg0, class154 arg1, boolean arg2, class80 arg3, byte arg4) {
        class67.field1295 = arg1;
        int var5 = 8 / ((-arg4 - 25) / 54);
        class47.field905 = arg2;
        field794++;
        class24.field455 = arg0;
        int var6 = class67.field1295.method1063(-3853) - 1;
        class66.field1282 = var6 * 256 + class67.field1295.method1058(var6, (byte) -59);
        class152.field2917 = arg3;
    }
}
