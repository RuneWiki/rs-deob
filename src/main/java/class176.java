import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public abstract class class176 {

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "Ltl;")
    public static class59 field2887 = class85.method639("; version=1; path=)4; domain=", 9588);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Ltl;")
    public static class59 field2882 = class85.method639(":trade:", 9588);

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "Ltl;")
    public static class59 field2893 = class85.method639("Benutzeroberfl-=che geladen)3", 9588);

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "[I")
    public static int[] field2891 = new int[] { 4, 4, 1, 2, 6, 4, 2, 50, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field2888 = 0;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "Lme;")
    public static class295 field2885;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "[Ltl;")
    public static class59[] field2889;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)I", line = 13)
    public static final int method1305(int arg0, int arg1) {
        field2886++;
        if (arg1 != 255) {
            method1306(-118, (byte) 42);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)V", line = 25)
    public static final void method1306(int arg0, byte arg1) {
        field2883++;
        class22 var2 = (class22) class238.field3969.method685((long) arg0, 128);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < var2.field297.length; var3++) {
            var2.field297[var3] = -1;
            var2.field294[var3] = 0;
        }
        if (arg1 < 87) {
            field2888 = 103;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lfg;IIIZ)V", line = 52)
    public void method1307(class176 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2894++;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V", line = 67)
    public static void method1308(byte arg0) {
        field2889 = null;
        field2887 = null;
        field2885 = null;
        if (arg0 > 55) {
            field2893 = null;
            field2882 = null;
            field2891 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)Lfg;", line = 83)
    public class176 method1309(int arg0, int arg1, int arg2) {
        field2892++;
        return this;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "()Z", line = 114)
    public boolean method1310() {
        field2884++;
        return false;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IBIII)V", line = 127)
    public void method1311(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2890++;
        int var6 = 73 % ((arg1 - 42) / 42);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "()I")
    public abstract int method152();

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);
}
