import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class11 {

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "Lsc;")
    private class347 field80;

    @OriginalMember(owner = "client!daa", name = "e", descriptor = "Lso;")
    public static class468 field84 = new class468(12, 16);

    @OriginalMember(owner = "client!daa", name = "j", descriptor = "[[I")
    public static int[][] field89 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!daa", name = "g", descriptor = "Lpia;")
    public static class94 field86 = new class94(66, 7);

    @OriginalMember(owner = "client!daa", name = "l", descriptor = "[I")
    public static int[] field91 = new int[2];

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!daa", name = "k", descriptor = "Llha;")
    private class623 field90;

    @OriginalMember(owner = "client!daa", name = "h", descriptor = "[I")
    public static int[] field87;

    @OriginalMember(owner = "client!daa", name = "i", descriptor = "[Ls;")
    public static class278[] field88;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)Llha;", line = 5)
    public final class623 method46(byte arg0) {
        field81++;
        class623 var2 = this.field80.field4488.field8923;
        if (this.field80.field4488 == var2) {
            this.field90 = null;
            return null;
        }
        this.field90 = var2.field8923;
        if (arg0 >= -61) {
            method48(-2);
        }
        return var2;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(ZI)I", line = 28)
    public static final int method47(boolean arg0, int arg1) {
        if (!arg0) {
            method47(false, 121);
        }
        field85++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V", line = 40)
    public static void method48(int arg0) {
        field84 = null;
        field91 = null;
        field87 = null;
        field89 = null;
        field86 = null;
        field88 = null;
        if (arg0 != 1) {
            method47(false, -126);
        }
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(B)Llha;", line = 59)
    public final class623 method49(byte arg0) {
        field83++;
        class623 var2 = this.field90;
        if (this.field80.field4488 == var2) {
            this.field90 = null;
            return null;
        }
        this.field90 = var2.field8923;
        if (arg0 >= -16) {
            field87 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Ltp;B)V", line = 84)
    public static final void method50(class532 arg0, byte arg1) {
        field82++;
        if (arg1 >= -94) {
            method47(true, -49);
        }
        if (class659.field9407 == arg0.field7667) {
            class272.field3360[arg0.field7568] = true;
        }
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "()V", line = 107)
    public class11() {
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lsc;)V", line = 115)
    public class11(class347 arg0) {
        this.field80 = arg0;
    }
}
