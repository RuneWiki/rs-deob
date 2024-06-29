import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class157 {

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "J")
    public long field3030 = 0L;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Li;")
    public static class88 field3024 = class208.method1425(105, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field3019 = 0;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "Li;")
    public static class88 field3027 = class208.method1425(105, ":duelstake:");

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field3028 = 0;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Lid;")
    public static class92 field3022 = new class92(20);

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    public static int field3037 = 0;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public int field3025;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public int field3026;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public int field3029;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public int field3031;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public int field3033;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Lnc;")
    public class145 field3023;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "Lnc;")
    public class145 field3034;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "[I")
    public static int[] field3036;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static void method1063(int arg0) {
        field3022 = null;
        field3036 = null;
        field3027 = null;
        field3024 = null;
        int var1 = 127 / ((arg0 + 72) / 40);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)J")
    public static final long method1064(int arg0, int arg1, int arg2) {
        class52 var3 = class29.field489[arg0][arg1][arg2];
        return var3 == null || var3.field959 == null ? 0L : var3.field959.field3030;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V")
    public static final void method1065(int arg0, int arg1) {
        class52 var2 = class29.field489[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class52 var4 = class29.field489[var3][arg0][arg1] = class29.field489[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field966--;
                for (int var5 = 0; var5 < var4.field962; var5++) {
                    class108 var6 = var4.field963[var5];
                    if ((var6.field1950 >> 29 & 0x3L) == 2L && var6.field1935 == arg0 && var6.field1938 == arg1) {
                        var6.field1954--;
                    }
                }
            }
        }
        if (class29.field489[0][arg0][arg1] == null) {
            class29.field489[0][arg0][arg1] = new class52(0, arg0, arg1);
        }
        class29.field489[0][arg0][arg1].field951 = var2;
        class29.field489[3][arg0][arg1] = null;
    }
}
