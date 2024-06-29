import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class42 {

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    public int field694;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public int field688;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public int field685;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public int field683;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "[I")
    public static int[] field682 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "[I")
    public static int[] field687 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "Z")
    public static boolean field690 = false;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "Lqm;")
    public static class222 field686;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "Llh;")
    public static class22 field691;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "[[Lfg;")
    public static class204[][] field684;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)V", line = 6)
    public static final void method326(int arg0, int arg1, int arg2) {
        class289.field4941[arg0] = arg1;
        field693++;
        class66 var3 = (class66) class196.field3339.method1151((long) arg0, 0);
        if (var3 == null) {
            class66 var4 = new class66(class154.method1114(true) + 500L);
            class196.field3339.method1149(var4, (long) arg0, -53);
        } else {
            var3.field1312 = class154.method1114(true) + 500L;
        }
        if (arg2 >= -124) {
            field687 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BI)Ld;", line = 56)
    public static final class135 method327(byte arg0, int arg1) {
        field689++;
        class135 var2 = (class135) class165.field2896.method1194((long) arg1, (byte) -122);
        if (arg0 != -33) {
            return (class135) null;
        } else if (var2 == null) {
            byte[] var3 = class253.field4418.method1580(arg0 ^ 0xFFFFFFDF, arg1, 4);
            class135 var4 = new class135();
            if (var3 != null) {
                var4.method962(true, arg1, new class13(var3));
            }
            class165.field2896.method1190(12669, var4, (long) arg1);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V", line = 92)
    public class42() {
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 96)
    public static void method328(int arg0) {
        field686 = null;
        field687 = null;
        field691 = null;
        if (arg0 <= -86) {
            field682 = null;
            field684 = (class204[][]) null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lfm;)V", line = 108)
    public class42(class42 arg0) {
        this.field694 = arg0.field694;
        this.field688 = arg0.field688;
        this.field685 = arg0.field685;
        this.field683 = arg0.field683;
    }
}
