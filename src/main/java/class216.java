import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class216 extends RuntimeException {

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3572;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "Ljava/lang/String;")
    public String field3568;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field3566 = 1;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "[Lea;")
    public static class197[] field3569 = new class197[4];

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "Lok;")
    public static class146 field3570 = class235.method1724(-12908, "::wm2");

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "Lok;")
    public static class146 field3561 = class235.method1724(-12908, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "Lok;")
    private static class146 field3571 = class235.method1724(-12908, "Members object");

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "Lok;")
    public static class146 field3563 = field3571;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "[I")
    public static int[] field3565;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)Lwg;", line = 13)
    public static final class283 method1603(int arg0, int arg1) {
        field3562++;
        class283 var2 = (class283) class66.field1112.method1511((long) arg0, 103);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class283.field4843.method92(arg0, 0, 0);
        if (var3 == null) {
            return null;
        }
        class283 var4 = new class283();
        class47 var5 = new class47(var3);
        var5.field857 = var5.field860.length - 2;
        int var6 = var5.method379(arg1 + 25931);
        if (arg1 != -25933) {
            method1603(-96, -70);
        }
        int var7 = var5.field860.length - var6 - 2 - 12;
        var5.field857 = var7;
        int var8 = var5.method373((byte) 36);
        var4.field4841 = var5.method379(-2);
        var4.field4854 = var5.method379(-2);
        var4.field4850 = var5.method379(arg1 + 25931);
        var4.field4847 = var5.method379(-2);
        int var9 = var5.method368(-120);
        if (var9 > 0) {
            var4.field4853 = new class118[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method379(arg1 ^ 0x654D);
                class118 var12 = new class118(class272.method1993(var11, arg1 + 26045));
                var4.field4853[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method373((byte) 36);
                    int var14 = var5.method373((byte) 36);
                    var12.method805(new class101(var14), (long) var13, 125);
                }
            }
        }
        var5.field857 = 0;
        int var15 = 0;
        var4.field4848 = var5.method376((byte) 116);
        var4.field4844 = new int[var8];
        var4.field4842 = new class146[var8];
        var4.field4840 = new int[var8];
        while (var5.field857 < var7) {
            int var16 = var5.method379(-2);
            if (var16 == 3) {
                var4.field4842[var15] = var5.method337(-1);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field4844[var15] = var5.method368(-123);
            } else {
                var4.field4844[var15] = var5.method373((byte) 36);
            }
            var4.field4840[var15++] = var16;
        }
        class66.field1112.method1509((long) arg0, 98, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V", line = 104)
    public static void method1604(int arg0) {
        field3570 = null;
        field3571 = null;
        field3563 = null;
        field3569 = null;
        int var1 = 49 / ((-arg0 - 12) / 45);
        field3561 = null;
        field3565 = null;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)Ltg;", line = 118)
    public static final class307 method1605(int arg0) {
        field3564++;
        int var1 = class238.field3967[0] * class150.field2562[0];
        byte[] var2 = class17.field353[0];
        class307 var6;
        if (class110.field1763[arg0]) {
            byte[] var3 = class63.field1089[0];
            int[] var4 = new int[var1];
            for (int var5 = 0; var5 < var1; var5++) {
                var4[var5] = class138.method1013(class94.field1514[class82.method582(255, var2[var5])], class82.method582(var3[var5], 255) << 24);
            }
            var6 = new class233(class177.field3006, class242.field4027, class226.field3776[0], class23.field424[0], class238.field3967[0], class150.field2562[0], var4);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class94.field1514[class82.method582(255, var2[var8])];
            }
            var6 = new class307(class177.field3006, class242.field4027, class226.field3776[0], class23.field424[0], class238.field3967[0], class150.field2562[0], var7);
        }
        class301.method2122((byte) 0);
        return var6;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIBI)V", line = 168)
    public static final void method1606(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 > -68) {
            field3561 = (class146) null;
        }
        field3567++;
        for (int var6 = arg0; var6 <= arg1; var6++) {
            class40.method281(arg2, arg3, class81.field1297[var6], arg5, 7);
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 218)
    public class216(Throwable arg0, String arg1) {
        this.field3572 = arg0;
        this.field3568 = arg1;
    }
}
