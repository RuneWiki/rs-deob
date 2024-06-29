import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class174 {

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Lsg;")
    public static class30 field3250 = class167.method1221((byte) 33, "<br>");

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Lmc;")
    public static class151 field3246;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(SB)Z")
    public static final boolean method1278(short arg0, byte arg1) {
        field3251++;
        if (arg0 == 38 || arg0 == 16 || arg0 == 7 || arg0 == 58 || arg0 == 25 || arg0 == 49 || arg0 == 19 || arg0 == 24) {
            return true;
        } else if (arg0 == 44 || arg0 == 45 || arg0 == 1003 || arg0 == 1005) {
            return true;
        } else if (arg0 == 1 || arg0 == 10 || arg0 == 11 || arg0 == 5 || arg0 == 31) {
            return true;
        } else if (arg0 == 39 || arg0 == 30 || arg0 == 21 || arg0 == 42 || arg0 == 26 || arg0 == 36) {
            return true;
        } else {
            if (arg1 > -103) {
                method1283((class30) null, 34);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILmc;)V")
    public static final void method1279(int arg0, class151 arg1) {
        class9.field167 = arg1;
        if (arg0 != 58) {
            field3246 = null;
        }
        field3248++;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)Lnb;")
    public static final class265 method1280(int arg0) {
        if (arg0 != 19139) {
            method1281(8, -5, (class30[]) null, (byte) 34);
        }
        field3247++;
        class192 var1 = new class192(class190.field3464, class273.field4774, class142.field2752[0], class37.field895[0], class62.field1329[0], class2.field33[0], class222.field3992[0], class191.field3475);
        class175.method1285((byte) 53);
        return var1;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[Lsg;B)Lsg;")
    public static final class30 method1281(int arg0, int arg1, class30[] arg2, byte arg3) {
        field3245++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg2[arg0 + var5] == null) {
                arg2[arg0 + var5] = class87.field1775;
            }
            var4 += arg2[arg0 + var5].field576;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        if (arg3 != 84) {
            return null;
        }
        for (int var8 = 0; var8 < arg1; var8++) {
            class30 var10 = arg2[arg0 + var8];
            class26.method235(var10.field618, 0, var6, var7, var10.field576);
            var7 += var10.field576;
        }
        class30 var9 = new class30();
        var9.field576 = var4;
        var9.field618 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)Lgj;")
    public static final class192 method1282(boolean arg0) {
        if (!arg0) {
            method1280(-27);
        }
        field3249++;
        class192 var1 = new class192(class190.field3464, class273.field4774, class142.field2752[0], class37.field895[0], class62.field1329[0], class2.field33[0], class222.field3992[0], class191.field3475);
        class175.method1285((byte) 53);
        return var1;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lsg;I)Z")
    public static final boolean method1283(class30 arg0, int arg1) {
        field3254++;
        if (arg0 == null) {
            return false;
        } else if (arg1 >= -82) {
            return false;
        } else {
            for (int var2 = 0; var2 < class141.field2730; var2++) {
                if (arg0.method285(class230.field4093[var2], 0)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public static void method1284(int arg0) {
        field3250 = null;
        if (arg0 == 28250) {
            field3246 = null;
        }
    }
}
