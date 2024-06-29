import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class38 extends class146 {

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
    public int field901;

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "Lec;")
    private static class32 field909 = class73.method594("Members object", true);

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "Lec;")
    private static class32 field906 = class73.method594("You need a members account to login to this world)3", true);

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "Lec;")
    public static class32 field904 = field909;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "[I")
    public static int[] field917 = new int[1000];

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "[Lec;")
    public static class32[] field915 = new class32[8];

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "Lec;")
    public static class32 field916 = field906;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "Lec;")
    public static class32 field913 = class73.method594("(U2", true);

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "Lec;")
    public static class32 field903 = class73.method594("<col=ff9040>", true);

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "Lec;")
    private static class32 field918 = class73.method594("green:", true);

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "Lec;")
    public static class32 field911 = class73.method594("W-=hlen Sie eine Welt", true);

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "Lec;")
    public static class32 field919 = field918;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "Lec;")
    public static class32 field907 = field918;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "Lpe;")
    public static class109 field910 = new class109();

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "Lld;")
    public static class80 field920 = new class80();

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "Lec;")
    public static class32 field921 = class73.method594("(U4", true);

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "I")
    public static int field922 = 0;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "I")
    public static int field925 = 0;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "Lec;")
    public static class32 field923 = class73.method594("0(U", true);

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "Lja;")
    public static class63 field926 = new class63(260);

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "Lec;")
    public static class32 field928 = class73.method594(" <col=ffffff>", true);

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "Lec;")
    public static class32 field927 = class73.method594("au", true);

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "Lga;")
    public static class44 field924;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "Lnf;")
    public static class96 field914;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)V")
    public static final void method316(int arg0, int arg1, int arg2) {
        if (arg0 > -46) {
            field913 = null;
        }
        if (class158.field3640 != 0 && arg1 != -1) {
            class154.method1197(class98.field2270, -1, arg1, class158.field3640, false, 0);
            class112.field2623 = true;
        }
        field900++;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
    public class38() {
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)Lta;")
    public static final class133 method317(int arg0, int arg1) {
        class133 var2 = (class133) class94.field2172.method486(-28825, (long) arg0);
        field908++;
        if (var2 != null) {
            return var2;
        }
        int var3 = -22 % ((arg1 - 63) / 63);
        byte[] var4 = class41.field971.method206(13, arg0, -83);
        class133 var5 = new class133();
        var5.field3072 = arg0;
        if (var4 != null) {
            var5.method1015(0, new class66(var4));
        }
        class94.field2172.method485((long) arg0, (byte) -118, var5);
        return var5;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
    public static void method318(boolean arg0) {
        field920 = null;
        field926 = null;
        field919 = null;
        field903 = null;
        field911 = null;
        field914 = null;
        field909 = null;
        if (!arg0) {
            return;
        }
        field906 = null;
        field918 = null;
        field927 = null;
        field923 = null;
        field916 = null;
        field915 = null;
        field917 = null;
        field904 = null;
        field924 = null;
        field910 = null;
        field907 = null;
        field913 = null;
        field928 = null;
        field921 = null;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(I)V")
    public class38(int arg0) {
        this.field901 = arg0;
    }
}
