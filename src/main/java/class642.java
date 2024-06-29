import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class642 {

    @OriginalMember(owner = "client!jaa", name = "g", descriptor = "Laj;")
    private class333 field8907;

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "Laj;")
    private class333 field8902;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "I")
    public static int field8901;

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "I")
    public static int field8906;

    @OriginalMember(owner = "client!jaa", name = "h", descriptor = "I")
    public static int field8908;

    @OriginalMember(owner = "client!jaa", name = "i", descriptor = "I")
    public static int field8909;

    @OriginalMember(owner = "client!jaa", name = "j", descriptor = "I")
    public static int field8910;

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "Lup;")
    private class292 field8905;

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "Lfs;")
    public static class582 field8904;

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "Lqn;")
    public static class70 field8903;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lnba;B)Lww;", line = 6)
    public final class762 method3563(class316 arg0, byte arg1) {
        field8901++;
        if (arg0 == null) {
            return null;
        }
        class546 var3 = arg0.method1557((byte) -103);
        if (class503.field6971 == var3) {
            return new class229((class241) arg0);
        }
        int var4 = 115 % ((arg1 - 6) / 54);
        if (class788.field10848 == var3) {
            return new class611(this.method3566(80), (class284) arg0);
        } else if (class522.field7160 == var3) {
            return new class645(this.field8907, (class780) arg0);
        } else if (class59.field818 == var3) {
            return new class684(this.field8907, (class443) arg0);
        } else if (class193.field2588 == var3) {
            return new class331(this.field8907, this.field8902, (class444) arg0);
        } else if (class148.field2077 == var3) {
            return new class3(this.field8907, this.field8902, (class592) arg0);
        } else if (class10.field159 == var3) {
            return new class756(this.field8907, this.field8902, (class731) arg0);
        } else if (class537.field7304 == var3) {
            return new class472(this.field8907, this.field8902, (class286) arg0);
        } else if (class52.field752 == var3) {
            return new class452(this.field8907, (class306) arg0);
        } else if (class178.field2374 == var3) {
            return new class614(this.field8907, this.field8902, (class770) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V", line = 59)
    public static void method3564(int arg0) {
        field8904 = null;
        field8903 = null;
        int var1 = 67 % ((arg0 + 21) / 60);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B)V", line = 69)
    public static final void method3565(byte arg0) {
        field8908++;
        if (arg0 <= 124 || class73.field1031 == null) {
            return;
        }
        for (int var1 = 0; var1 < class73.field1031.length; var1++) {
            for (int var2 = 0; var2 < class73.field1031[var1].length; var2++) {
                class73.field1031[var1][var2] = class452.field6287;
            }
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)Lup;", line = 104)
    private final class292 method3566(int arg0) {
        field8910++;
        if (this.field8905 == null) {
            this.field8905 = new class292();
        }
        int var2 = 26 % ((-arg0 - 37) / 44);
        return this.field8905;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZIIIIII)V", line = 118)
    public static final void method3567(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg0 ? class712.field9959.field1321.method3352(119) : class712.field9959.field1275.method3352(33)) != 0 && arg2 != 0 && class393.field5800 < 50 && arg4 != -1) {
            class729.field10120[class393.field5800++] = new class720((byte) (arg0 ? 3 : 2), arg4, arg2, arg1, arg5, 0, arg6, null);
        }
        field8906++;
        int var7 = -88 % ((arg3 - 38) / 52);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "([BII)[B", line = 134)
    public static final byte[] method3568(byte[] arg0, int arg1, int arg2) {
        field8909++;
        byte[] var3 = new byte[arg1];
        class278.method1796(arg0, arg2, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Laj;Laj;)V", line = 145)
    public class642(class333 arg0, class333 arg1) {
        this.field8907 = arg0;
        this.field8902 = arg1;
    }
}
