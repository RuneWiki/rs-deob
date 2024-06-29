import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class127 {

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field3046 = 78;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Lhb;")
    private static class44 field3055 = class102.method810("Unexpected loginserver response)3", -28606);

    @OriginalMember(owner = "client!w", name = "c", descriptor = "[[I")
    public static int[][] field3045 = new int[104][104];

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Lhb;")
    public static class44 field3056 = class102.method810("Name des Gegenstands eingeben:", -28606);

    @OriginalMember(owner = "client!w", name = "s", descriptor = "Lhb;")
    public static class44 field3061 = field3055;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "Lhb;")
    public static class44 field3064 = class102.method810("@or3@", -28606);

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Lhb;")
    public static class44 field3062 = class102.method810("Hierhin gehen", -28606);

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public static int field3066 = 500;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "J")
    public long field3057;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "Lw;")
    public class127 field3059;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "Lw;")
    public class127 field3060;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "Lfb;")
    public static class33 field3043;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Lne;")
    public static class83 field3051;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Lne;")
    public static class83 field3053;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "Lpc;")
    public static class93 field3047;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "[I")
    public static int[] field3048;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 3)
    public final void method948(int arg0) {
        field3065++;
        if (this.field3060 == null) {
            return;
        }
        this.field3060.field3059 = this.field3059;
        this.field3059.field3060 = this.field3060;
        this.field3059 = null;
        int var2 = -66 % ((3 - arg0) / 59);
        this.field3060 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V", line = 25)
    public static void method949(byte arg0) {
        field3056 = null;
        field3053 = null;
        field3051 = null;
        field3047 = null;
        field3045 = null;
        if (arg0 >= -5) {
            method950(46);
        }
        field3064 = null;
        field3048 = null;
        field3062 = null;
        field3061 = null;
        field3055 = null;
        field3043 = null;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)Z", line = 45)
    public static final boolean method950(int arg0) {
        field3063++;
        if (arg0 != -29360) {
            field3051 = null;
        }
        return class103.field2635 != null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)I", line = 63)
    public static final int method951(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 45 / ((-arg1 - 12) / 53);
        field3049++;
        int var5 = 256 - arg2;
        return ((arg0 & 0xFF00) * arg2 + (arg3 & 0xFF00) * var5 & 0xFF0000) + ((arg0 & 0xFF00FF) * arg2 + (arg3 & 0xFF00FF) * var5 & 0xFF00FF00) >> 8;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BLhb;)V", line = 78)
    public static final void method952(byte arg0, class44 arg1) {
        field3054++;
        if (arg1 == null || arg1.method414((byte) 65) == 0) {
            class102.field2602 = 0;
            return;
        }
        class44 var2 = arg1;
        class44[] var3 = new class44[100];
        int var4 = 0;
        if (arg0 >= -121) {
            method954(false);
        }
        while (true) {
            int var5 = var2.method381(32, false);
            if (var5 == -1) {
                class44 var6 = var2.method384(true);
                if (var6.method414((byte) 61) > 0) {
                    var3[var4++] = var6.method391((byte) -56);
                }
                class102.field2602 = 0;
                label49: for (int var7 = 0; var7 < class95.field2417; var7++) {
                    class80 var8 = class42.method358(0, var7);
                    if (var8.field2037 == -1 && var8.field2004 != null) {
                        class44 var9 = var8.field2004.method391((byte) -56);
                        for (int var10 = 0; var10 < var4; var10++) {
                            if (var9.method388(0, var3[var10]) == -1) {
                                continue label49;
                            }
                        }
                        class120.field2924[class102.field2602] = var9;
                        class40.field908[class102.field2602] = var7;
                        class102.field2602++;
                        if (class120.field2924.length <= class102.field2602) {
                            return;
                        }
                    }
                }
                return;
            }
            class44 var11 = var2.method396((byte) -76, 0, var5).method384(true);
            if (var11.method414((byte) 113) > 0) {
                var3[var4++] = var11.method391((byte) -56);
            }
            var2 = var2.method380(var5 + 1, (byte) 114);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)Z", line = 187)
    public final boolean method953(boolean arg0) {
        if (arg0) {
            field3058++;
            return this.field3060 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V", line = 211)
    public static final void method954(boolean arg0) {
        if (arg0) {
            field3052++;
            class53.field1324.method335((byte) -127);
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)I", line = 231)
    public static final int method955(int arg0) {
        field3044++;
        return arg0 == 5 ? 5 : -38;
    }
}
