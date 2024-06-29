import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class170 extends class106 {

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    public int field3098;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "Loc;")
    public static class151 field3091 = class137.method873(2, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "Loc;")
    public static class151 field3092 = class137.method873(2, "Okay");

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "Loc;")
    private static class151 field3100 = class137.method873(2, " from your ignore list first)3");

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "Loc;")
    private static class151 field3101 = class137.method873(2, "Choose Option");

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
    public static int field3095 = 0;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "[Loc;")
    public static class151[] field3103 = new class151[100];

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "Loc;")
    public static class151 field3099 = class137.method873(2, "settings");

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "Loc;")
    public static class151 field3102 = field3100;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "Loc;")
    public static class151 field3094 = field3101;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(JI)V")
    public static final void method1095(long arg0, int arg1) {
        field3097++;
        if (arg0 == 0L) {
            return;
        }
        int var3 = -63 % ((arg1 - 31) / 50);
        for (int var4 = 0; var4 < class32.field658; var4++) {
            if (class224.field3909[var4] == arg0) {
                class180.field3258++;
                class32.field658--;
                for (int var5 = var4; var5 < class32.field658; var5++) {
                    class224.field3909[var5] = class224.field3909[var5 + 1];
                    field3103[var5] = field3103[var5 + 1];
                }
                class75.field1441 = class1.field35;
                class48.field984.method650(-13721, 49);
                class48.field984.method1458((byte) 100, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[Ln;BI[B)V")
    public static final void method1096(int arg0, class138[] arg1, byte arg2, int arg3, byte[] arg4) {
        class229 var5 = new class229(arg4);
        int var6 = -1;
        while (true) {
            int var7 = var5.method1471(-3);
            if (var7 == 0) {
                int var20 = 79 / ((-arg2 - 25) / 61);
                field3096++;
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method1440(19108);
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method1475(255);
                int var14 = var13 >> 2;
                int var15 = arg3 + var11;
                int var16 = var13 & 0x3;
                int var17 = arg0 + var10;
                if (var15 > 0 && var17 > 0 && var15 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((class122.field2191[1][var15][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class138 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg1[var18];
                    }
                    class155.method1017(var6, var16, var15, var12, true, var19, var12, var17, class13.field300, var14, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
    public class170() {
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
    public static void method1097(int arg0) {
        field3091 = null;
        field3102 = null;
        field3099 = null;
        field3094 = null;
        field3092 = null;
        if (arg0 > -93) {
            field3091 = null;
        }
        field3100 = null;
        field3103 = null;
        field3101 = null;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(I)V")
    public class170(int arg0) {
        this.field3098 = arg0;
    }
}
