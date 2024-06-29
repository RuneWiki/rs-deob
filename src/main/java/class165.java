import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class165 {

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public int field2979 = -1;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Lqe;")
    public static class179 field2980 = class206.method1380("Art", (byte) 71);

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Lqe;")
    private static class179 field2983 = class206.method1380("Unable to connect)3", (byte) -33);

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Lqe;")
    public static class179 field2987 = field2983;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Lqe;")
    public static class179 field2986 = field2983;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Lqe;")
    public static class179 field2985 = class206.method1380("Registrierter Benutzer", (byte) 60);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public int field2978;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public int field2981;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public int field2988;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public int field2989;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public int field2990;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public int field2991;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public int field2992;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public int field2993;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Leh;")
    public static class52 field2984;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
    public static void method1058(boolean arg0) {
        field2986 = null;
        field2980 = null;
        field2987 = null;
        if (!arg0) {
            field2986 = null;
        }
        field2985 = null;
        field2984 = null;
        field2983 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V")
    public static final void method1059(int arg0, int arg1) {
        class197 var2 = class229.field4232[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class197 var4 = class229.field4232[var3][arg0][arg1] = class229.field4232[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3661--;
                for (int var5 = 0; var5 < var4.field3662; var5++) {
                    class167 var6 = var4.field3672[var5];
                    if ((var6.field3014 >> 29 & 0x3L) == 2L && var6.field3006 == arg0 && var6.field3018 == arg1) {
                        var6.field3013--;
                    }
                }
            }
        }
        if (class229.field4232[0][arg0][arg1] == null) {
            class229.field4232[0][arg0][arg1] = new class197(0, arg0, arg1);
        }
        class229.field4232[0][arg0][arg1].field3677 = var2;
        class229.field4232[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static final void method1060(byte arg0) {
        class28.field617.method1297((byte) 89);
        field2994++;
        class115.field2172.method1339((byte) 89);
        class207.field3862.method1297((byte) 89);
        if (arg0 <= 113) {
            method1060((byte) 27);
        }
    }
}
