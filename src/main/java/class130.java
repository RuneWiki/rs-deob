import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class130 extends class70 {

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "I")
    public int field3092 = 0;

    @OriginalMember(owner = "client!se", name = "O", descriptor = "[I")
    public int[] field3083 = new int[5];

    @OriginalMember(owner = "client!se", name = "cb", descriptor = "[Ls;")
    public class125[] field3096 = new class125[5];

    @OriginalMember(owner = "client!se", name = "fb", descriptor = "I")
    public int field3099;

    @OriginalMember(owner = "client!se", name = "U", descriptor = "I")
    public int field3088;

    @OriginalMember(owner = "client!se", name = "lb", descriptor = "I")
    public int field3105;

    @OriginalMember(owner = "client!se", name = "db", descriptor = "I")
    public int field3097;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "I")
    public static int field3080 = 0;

    @OriginalMember(owner = "client!se", name = "T", descriptor = "I")
    public static int field3087 = 0;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "Lqf;")
    private static class117 field3079 = class72.method514(109, "Enter name of player to delete from list");

    @OriginalMember(owner = "client!se", name = "bb", descriptor = "[Z")
    public static boolean[] field3095 = new boolean[112];

    @OriginalMember(owner = "client!se", name = "G", descriptor = "Lqf;")
    public static class117 field3075 = field3079;

    @OriginalMember(owner = "client!se", name = "pb", descriptor = "I")
    public static int field3109 = 0;

    @OriginalMember(owner = "client!se", name = "nb", descriptor = "Lqf;")
    public static class117 field3107 = class72.method514(116, "mapfunction");

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!se", name = "I", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!se", name = "P", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    public int field3086;

    @OriginalMember(owner = "client!se", name = "X", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "I")
    public int field3093;

    @OriginalMember(owner = "client!se", name = "ab", descriptor = "I")
    public int field3094;

    @OriginalMember(owner = "client!se", name = "ib", descriptor = "I")
    public int field3102;

    @OriginalMember(owner = "client!se", name = "mb", descriptor = "I")
    public int field3106;

    @OriginalMember(owner = "client!se", name = "ob", descriptor = "I")
    public int field3108;

    @OriginalMember(owner = "client!se", name = "N", descriptor = "Loe;")
    public class102 field3082;

    @OriginalMember(owner = "client!se", name = "M", descriptor = "Lqa;")
    public class112 field3081;

    @OriginalMember(owner = "client!se", name = "gb", descriptor = "Lsd;")
    public class129 field3100;

    @OriginalMember(owner = "client!se", name = "V", descriptor = "Lse;")
    public class130 field3089;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "Lwd;")
    public static class153 field3078;

    @OriginalMember(owner = "client!se", name = "jb", descriptor = "La;")
    public class1 field3103;

    @OriginalMember(owner = "client!se", name = "R", descriptor = "Lgf;")
    public class48 field3085;

    @OriginalMember(owner = "client!se", name = "W", descriptor = "Ljd;")
    public class66 field3090;

    @OriginalMember(owner = "client!se", name = "eb", descriptor = "Z")
    public boolean field3098;

    @OriginalMember(owner = "client!se", name = "hb", descriptor = "Z")
    public boolean field3101;

    @OriginalMember(owner = "client!se", name = "kb", descriptor = "Z")
    public boolean field3104;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)V")
    public static final void method1012(int arg0, int arg1) {
        field3084++;
        if (!class26.method201(arg0, 314356016)) {
            return;
        }
        class89[] var2 = class141.field3426[arg0];
        int var3 = -31 % ((5 - arg1) / 63);
        for (int var4 = 0; var4 < var2.length; var4++) {
            class89 var5 = var2[var4];
            if (var5 != null) {
                var5.field2083 = 0;
                var5.field2111 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(II)Lnf;")
    public static final class96 method1013(int arg0, int arg1) {
        if (arg1 > -72) {
            field3080 = -43;
        }
        field3073++;
        class96 var2 = (class96) class135.field3222.method247(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class72.field1587.method458(false, arg0, 12);
        class96 var4 = new class96();
        if (var3 != null) {
            var4.method758(true, new class77(var3));
        }
        var4.method752((byte) 110);
        class135.field3222.method248((long) arg0, (byte) -128, var4);
        return var4;
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(II)Lqf;")
    public static final class117 method1014(int arg0, int arg1) {
        field3091++;
        int var2 = 41 % ((11 - arg0) / 37);
        return arg1 < 999999999 ? class79.method614(15591, arg1) : class15.field220;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(III)V")
    public class130(int arg0, int arg1, int arg2) {
        this.field3099 = arg2;
        this.field3105 = this.field3088 = arg0;
        this.field3097 = arg1;
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(I)V")
    public static final void method1015(int arg0) {
        int var1 = 122 / ((arg0 + 14) / 63);
        for (int var2 = -1; var2 < class66.field1387; var2++) {
            int var6;
            if (var2 == -1) {
                var6 = 2047;
            } else {
                var6 = class20.field326[var2];
            }
            class21 var7 = class149.field3709[var6];
            if (var7 != null && var7.field2001 > 0) {
                var7.field2001--;
                if (var7.field2001 == 0) {
                    var7.field1957 = null;
                }
            }
        }
        for (int var3 = 0; var3 < class25.field483; var3++) {
            int var4 = class150.field3724[var3];
            class58 var5 = class72.field1533[var4];
            if (var5 != null && var5.field2001 > 0) {
                var5.field2001--;
                if (var5.field2001 == 0) {
                    var5.field1957 = null;
                }
            }
        }
        field3077++;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
    public static void method1016(byte arg0) {
        if (arg0 != -115) {
            return;
        }
        field3078 = null;
        field3095 = null;
        field3079 = null;
        field3107 = null;
        field3075 = null;
    }
}
