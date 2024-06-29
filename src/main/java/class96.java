import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class96 {

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "B")
    private byte field1907;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public int field1897;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public int field1902;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public int field1899;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public int field1909;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public int field1904;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "[Lob;")
    public static class141[] field1895 = new class141[100];

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "Lob;")
    private static class141 field1898 = class175.method1195(40, "Examine");

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "Lob;")
    public static class141 field1896 = field1898;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field1901 = 0;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public static int field1912 = 0;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "Lob;")
    public static class141 field1910 = class175.method1195(40, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Lmd;")
    public static class123 field1894 = new class123(32);

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "Lca;")
    public static class22 field1913;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIII)V")
    public static final void method644(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class31.field617[arg0][arg1 + var4][arg3 + var7] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class31.field617[arg0][arg1][arg3 + var5] = class31.field617[arg0][arg1 - 1][arg3 + var5];
            }
        }
        if (arg3 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class31.field617[arg0][arg1 + var6][arg3] = class31.field617[arg0][arg1 + var6][arg3 - 1];
            }
        }
        if (arg2 != 8) {
            return;
        }
        if (arg1 > 0 && class31.field617[arg0][arg1 - 1][arg3] != 0) {
            class31.field617[arg0][arg1][arg3] = class31.field617[arg0][arg1 - 1][arg3];
        } else if (arg3 > 0 && class31.field617[arg0][arg1][arg3 - 1] != 0) {
            class31.field617[arg0][arg1][arg3] = class31.field617[arg0][arg1][arg3 - 1];
        } else if (arg1 > 0 && arg3 > 0 && class31.field617[arg0][arg1 - 1][arg3 - 1] != 0) {
            class31.field617[arg0][arg1][arg3] = class31.field617[arg0][arg1 - 1][arg3 - 1];
        }
        field1906++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)Lei;")
    public static final class50 method645(byte arg0, int arg1) {
        class50 var2 = (class50) class37.field736.method1383((long) arg1, (byte) -111);
        field1908++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class67.field1295.method1065((byte) 2, class144.method955(-111, arg1), class181.method1223((byte) 33, arg1));
        class50 var4 = new class50();
        var4.field957 = arg1;
        if (var3 != null) {
            var4.method335(new class146(var3), -1);
        }
        var4.method337(0);
        if (arg0 != -61) {
            return null;
        }
        if (var4.field948 != -1) {
            var4.method331(1, method645((byte) -61, var4.field948), method645((byte) -61, var4.field942));
        }
        if (!class47.field905 && var4.field971) {
            var4.field937 = class35.field705;
            var4.field932 = null;
            var4.field981 = 0;
            var4.field952 = null;
            var4.field928 = false;
        }
        class37.field736.method1378(var4, (byte) -29, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public static final void method646(byte arg0) {
        if (arg0 != 26) {
            field1912 = -33;
        }
        if (class176.field3494 != null) {
            class176.field3494.method1089(-2);
        }
        field1903++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static void method647(int arg0) {
        field1894 = null;
        if (arg0 != 21528) {
            method647(63);
        }
        field1898 = null;
        field1895 = null;
        field1913 = null;
        field1910 = null;
        field1896 = null;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)I")
    public final int method648(byte arg0) {
        if (arg0 > -57) {
            this.field1897 = -40;
        }
        field1905++;
        return this.field1907 & 0x7;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method649(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 == -19) {
            field1911++;
            if (class66.method443(true, arg7)) {
                class32.method233(arg6, arg3, (byte) -116, arg2, -1, arg1, arg5, class224.field4232[arg7], arg4);
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)I")
    public final int method650(int arg0) {
        if (arg0 < 39) {
            method646((byte) 106);
        }
        field1900++;
        return (this.field1907 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
    public class96() {
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Log;)V")
    public class96(class146 arg0) {
        this.field1907 = arg0.method1000(1064893128);
        this.field1897 = arg0.method1007(66);
        this.field1902 = arg0.method979(1029109968);
        this.field1899 = arg0.method979(1029109968);
        this.field1909 = arg0.method979(1029109968);
        this.field1904 = arg0.method979(1029109968);
    }
}
