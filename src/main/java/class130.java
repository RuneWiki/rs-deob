import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class130 extends class13 {

    @OriginalMember(owner = "client!se", name = "I", descriptor = "Lec;")
    public class32 field2986 = class132.field3037;

    @OriginalMember(owner = "client!se", name = "P", descriptor = "I")
    public int field2993 = 0;

    @OriginalMember(owner = "client!se", name = "O", descriptor = "Ljd;")
    public static class66 field2992 = new class66(new byte[5000]);

    @OriginalMember(owner = "client!se", name = "V", descriptor = "Lec;")
    public static class32 field2999 = class73.method594("<col=ffffff>", true);

    @OriginalMember(owner = "client!se", name = "W", descriptor = "Lec;")
    public static class32 field3000 = class73.method594("RuneScape wurde aktualisiert(Q", true);

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "I")
    public static int field3003 = -1;

    @OriginalMember(owner = "client!se", name = "T", descriptor = "Lec;")
    private static class32 field2997 = class73.method594("purple:", true);

    @OriginalMember(owner = "client!se", name = "cb", descriptor = "I")
    public static int field3006 = 1;

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "Lec;")
    public static class32 field3002 = field2997;

    @OriginalMember(owner = "client!se", name = "S", descriptor = "Lec;")
    public static class32 field2996 = field2997;

    @OriginalMember(owner = "client!se", name = "eb", descriptor = "Lec;")
    public static class32 field3008 = class73.method594("Ausw-=hlen", true);

    @OriginalMember(owner = "client!se", name = "gb", descriptor = "Lec;")
    private static class32 field3010 = class73.method594("as it was used to break our rules)3", true);

    @OriginalMember(owner = "client!se", name = "bb", descriptor = "Lec;")
    public static class32 field3005 = field3010;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!se", name = "R", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!se", name = "U", descriptor = "I")
    public int field2998;

    @OriginalMember(owner = "client!se", name = "X", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!se", name = "ab", descriptor = "I")
    public int field3004;

    @OriginalMember(owner = "client!se", name = "db", descriptor = "I")
    public int field3007;

    @OriginalMember(owner = "client!se", name = "fb", descriptor = "Led;")
    public static class33 field3009;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "[I")
    public int[] field2987;

    @OriginalMember(owner = "client!se", name = "M", descriptor = "[I")
    public int[] field2990;

    @OriginalMember(owner = "client!se", name = "N", descriptor = "[Lec;")
    public class32[] field2991;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljd;I)V")
    public final void method1001(class66 arg0, int arg1) {
        if (arg1 != -23866) {
            return;
        }
        while (true) {
            int var3 = arg0.method533(arg1 + 24121);
            if (var3 == 0) {
                field2988++;
                return;
            }
            this.method1005(var3, -3, arg0);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIB)Lf;")
    public static final class36 method1002(int arg0, int arg1, byte arg2) {
        field2985++;
        if (arg2 != -29) {
            method1004(-82, true, null, null);
        }
        class36 var3 = class128.method993(arg1, arg2 ^ 0xFFFFFF85);
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field755 == null || var3.field755.length <= arg0) {
            return null;
        } else {
            return var3.field755[arg0];
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static void method1003(byte arg0) {
        field3008 = null;
        field3000 = null;
        if (arg0 != 12) {
            field3005 = null;
        }
        field2996 = null;
        field2997 = null;
        field3005 = null;
        field3010 = null;
        field3002 = null;
        field2999 = null;
        field3009 = null;
        field2992 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZLtb;Lga;)V")
    public static final void method1004(int arg0, boolean arg1, class134 arg2, class44 arg3) {
        field2994++;
        class142 var4 = new class142();
        var4.field3326 = arg0;
        var4.field3256 = arg3;
        var4.field3245 = 1;
        var4.field3247 = arg2;
        class157 var5 = class2.field18;
        synchronized (class2.field18) {
            class2.field18.method1216(var4, (byte) 50);
        }
        class111.method877((byte) -53);
        if (arg1) {
            field3005 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IILjd;)V")
    private final void method1005(int arg0, int arg1, class66 arg2) {
        if (arg1 != -3) {
            method1004(69, false, null, null);
        }
        if (arg0 == 1) {
            this.field3007 = arg2.method533(arg1 + 258);
        } else if (arg0 == 2) {
            this.field3004 = arg2.method533(255);
        } else if (arg0 == 3) {
            this.field2986 = arg2.method556(1347418632);
        } else if (arg0 == 4) {
            this.field2998 = arg2.method539(true);
        } else if (arg0 == 5) {
            this.field2993 = arg2.method532(0);
            this.field2991 = new class32[this.field2993];
            this.field2987 = new int[this.field2993];
            for (int var4 = 0; var4 < this.field2993; var4++) {
                this.field2987[var4] = arg2.method539(true);
                this.field2991[var4] = arg2.method556(1347418632);
            }
        } else if (arg0 == 6) {
            this.field2993 = arg2.method532(arg1 + 3);
            this.field2990 = new int[this.field2993];
            this.field2987 = new int[this.field2993];
            for (int var5 = 0; var5 < this.field2993; var5++) {
                this.field2987[var5] = arg2.method539(true);
                this.field2990[var5] = arg2.method539(true);
            }
        }
        field2995++;
    }
}
