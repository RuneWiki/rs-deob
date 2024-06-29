import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class53 extends class5 {

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "I")
    public int field1073 = 0;

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "[Z")
    public static boolean[] field1066 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "Led;")
    public static class43 field1067 = class191.method1219("Gegenstand f-Ur Mitglieder", false);

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "Led;")
    public static class43 field1068 = class191.method1219("::noclip", false);

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "Led;")
    public static class43 field1072 = class191.method1219("sl_arrows", false);

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!fe", name = "J", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljg;B)V")
    public final void method321(class89 arg0, byte arg1) {
        field1064++;
        if (arg1 < 19) {
            return;
        }
        while (true) {
            int var3 = arg0.method538((byte) 107);
            if (var3 == 0) {
                return;
            }
            this.method323(var3, -6, arg0);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBI)V")
    public static final void method322(int arg0, byte arg1, int arg2) {
        field1065++;
        if (class41.field799 < 2 && class161.field3259 == 0 && !class174.field3464) {
            return;
        }
        class43 var3;
        if (class161.field3259 == 1 && class41.field799 < 2) {
            var3 = class167.method1036(new class43[] { class200.field3930, class97.field1881, class193.field3740, class163.field3267 }, true);
        } else if (class174.field3464 && class41.field799 < 2) {
            var3 = class167.method1036(new class43[] { class137.field2852, class97.field1881, class29.field534, class163.field3267 }, true);
        } else {
            var3 = class170.method1080(-1, class41.field799 - 1);
        }
        if (class41.field799 > 2) {
            var3 = class167.method1036(new class43[] { var3, class95.field1865, class30.method161(class41.field799 - 2, 10), class39.field745 }, true);
        }
        if (arg1 < 40) {
            method324(4);
        }
        int var4 = class118.field2294.method951(var3, arg0 + 4, arg2 + 15, 16777215, 0, class147.field3010, class122.field2447);
        class200.method1306(arg0 + 4, 15, arg2, class118.field2294.method952(var3) + var4, 0);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILjg;)V")
    private final void method323(int arg0, int arg1, class89 arg2) {
        if (~arg0 == arg1) {
            this.field1073 = arg2.method555(arg1 - 1113627090);
        }
        field1069++;
    }

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "(I)V")
    public static void method324(int arg0) {
        field1067 = null;
        field1072 = null;
        field1068 = null;
        if (arg0 != 15) {
            method322(-39, (byte) 88, 1);
        }
        field1066 = null;
    }
}
