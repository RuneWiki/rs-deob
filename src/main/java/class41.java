import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class41 extends class4 {

    @OriginalMember(owner = "client!fe", name = "gb", descriptor = "[Lpe;")
    public class109[] field967;

    @OriginalMember(owner = "client!fe", name = "cb", descriptor = "I")
    public static int field963 = 0;

    @OriginalMember(owner = "client!fe", name = "ab", descriptor = "Loa;")
    public static class98 field961 = class38.method349(255, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!fe", name = "Y", descriptor = "Loa;")
    public static class98 field959 = null;

    @OriginalMember(owner = "client!fe", name = "hb", descriptor = "Loa;")
    public static class98 field968 = class38.method349(255, "Einloggen");

    @OriginalMember(owner = "client!fe", name = "ib", descriptor = "Loa;")
    public static class98 field969 = class38.method349(255, "Sprites geladen)3");

    @OriginalMember(owner = "client!fe", name = "fb", descriptor = "Loa;")
    private static class98 field966 = class38.method349(255, "Loading ignore list");

    @OriginalMember(owner = "client!fe", name = "Z", descriptor = "Loa;")
    public static class98 field960 = class38.method349(255, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!fe", name = "X", descriptor = "Loa;")
    public static class98 field958 = field966;

    @OriginalMember(owner = "client!fe", name = "bb", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!fe", name = "db", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!fe", name = "eb", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!fe", name = "lb", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!fe", name = "jb", descriptor = "J")
    public static long field970;

    @OriginalMember(owner = "client!fe", name = "kb", descriptor = "Lle;")
    public static class81 field971;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILwb;I)V")
    public static final void method355(int arg0, class148 arg1, int arg2) {
        field962++;
        if (arg0 == 20141) {
            class130.method1056(arg2, arg1.field3667, arg1.field3657, (byte) 90);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
    public static final void method356(boolean arg0) {
        class5.field84 = 0;
        field965++;
        int var1 = (class73.field1536.field3657 >> 7) + class21.field470;
        int var2 = (class73.field1536.field3667 >> 7) + class71.field1479;
        if (!arg0) {
            field963 = 36;
        }
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class5.field84 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class5.field84 = 1;
        }
        if (class5.field84 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class5.field84 = 0;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Z")
    public final boolean method357(int arg0, int arg1) {
        if (arg1 < 108) {
            field971 = null;
        }
        field964++;
        return this.field967[arg0].field2459;
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(B)V")
    public static final void method358(byte arg0) {
        class36.field890.method174(false);
        field972++;
        int var1 = class36.field890.method175(arg0 + 13, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class36.field890.method175(-17, 2);
        if (var2 == 0) {
            class96.field2205[class74.field1603++] = 2047;
        } else if (var2 == 1) {
            int var3 = class36.field890.method175(-124, 3);
            class73.field1536.method1182(false, (byte) 103, var3);
            int var4 = class36.field890.method175(-51, 1);
            if (var4 == 1) {
                class96.field2205[class74.field1603++] = 2047;
            }
        } else {
            if (arg0 != 57) {
                field968 = null;
            }
            if (var2 == 2) {
                int var5 = class36.field890.method175(-122, 3);
                class73.field1536.method1182(true, (byte) 82, var5);
                int var6 = class36.field890.method175(-26, 3);
                class73.field1536.method1182(true, (byte) 75, var6);
                int var7 = class36.field890.method175(-124, 1);
                if (var7 == 1) {
                    class96.field2205[class74.field1603++] = 2047;
                }
            } else if (var2 == 3) {
                int var8 = class36.field890.method175(-119, 1);
                class114.field2572 = class36.field890.method175(arg0 ^ 0xFFFFFFB0, 2);
                int var9 = class36.field890.method175(-3, 7);
                int var10 = class36.field890.method175(-119, 1);
                if (var10 == 1) {
                    class96.field2205[class74.field1603++] = 2047;
                }
                int var11 = class36.field890.method175(arg0 + 70, 7);
                class73.field1536.method1180(128, var8 == 1, var11, var9);
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Ltb;Ltb;IZ)V")
    public class41(class130 arg0, class130 arg1, int arg2, boolean arg3) {
        class63 var5 = new class63();
        int var6 = arg0.method1062(arg2, (byte) 59);
        this.field967 = new class109[var6];
        int[] var7 = arg0.method1061(arg2, 256);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1058(arg2, -73, var7[var8]);
            int var10 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            class96 var11 = (class96) var5.method512(78);
            class96 var12 = null;
            while (var11 != null) {
                if (var11.field2197 == var10) {
                    var12 = var11;
                    break;
                }
                var11 = (class96) var5.method513(-93);
            }
            if (var12 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1059((byte) -9, 0, var10);
                } else {
                    var13 = arg1.method1059((byte) -9, var10, 0);
                }
                var12 = new class96(var10, var13);
                var5.method508(93, var12);
            }
            this.field967[var7[var8]] = new class109(var9, var12);
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)V")
    public static void method359(boolean arg0) {
        field959 = null;
        field960 = null;
        field969 = null;
        field961 = null;
        field958 = null;
        field966 = null;
        field968 = null;
        field971 = null;
        if (arg0) {
            method359(false);
        }
    }
}
