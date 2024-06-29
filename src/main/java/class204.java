import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class204 extends class5 {

    @OriginalMember(owner = "client!we", name = "K", descriptor = "I")
    public static int field3970 = 0;

    @OriginalMember(owner = "client!we", name = "M", descriptor = "Led;")
    public static class43 field3971 = class191.method1219("Fertigkeit)2", false);

    @OriginalMember(owner = "client!we", name = "H", descriptor = "I")
    public static int field3967 = 0;

    @OriginalMember(owner = "client!we", name = "V", descriptor = "Led;")
    public static class43 field3980 = class191.method1219("sl_stars", false);

    @OriginalMember(owner = "client!we", name = "S", descriptor = "Led;")
    public static class43 field3977 = class191.method1219("oder ung-Ultiges Passwort)3", false);

    @OriginalMember(owner = "client!we", name = "I", descriptor = "I")
    public int field3968;

    @OriginalMember(owner = "client!we", name = "O", descriptor = "I")
    public int field3973;

    @OriginalMember(owner = "client!we", name = "Q", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!we", name = "T", descriptor = "I")
    public int field3978;

    @OriginalMember(owner = "client!we", name = "U", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!we", name = "W", descriptor = "I")
    public int field3981;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "Led;")
    public class43 field3969;

    @OriginalMember(owner = "client!we", name = "P", descriptor = "[I")
    public int[] field3974;

    @OriginalMember(owner = "client!we", name = "R", descriptor = "[I")
    public int[] field3976;

    @OriginalMember(owner = "client!we", name = "N", descriptor = "[Led;")
    public class43[] field3972;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "(I)V")
    public static void method1315(int arg0) {
        field3980 = null;
        if (arg0 != 0) {
            method1315(73);
        }
        field3971 = null;
        field3977 = null;
    }

    @OriginalMember(owner = "client!we", name = "h", descriptor = "(I)V")
    public static final void method1316(int arg0) {
        field3979++;
        if (!class174.field3464) {
            return;
        }
        if (arg0 != -25301) {
            method1316(112);
        }
        class129 var1 = class133.method858(-1, class58.field1173, class203.field3962);
        if (var1 != null && var1.field2611 != null) {
            class115 var2 = new class115();
            var2.field2238 = var1.field2611;
            var2.field2249 = var1;
            class203.method1311(var2, 3538);
        }
        class174.field3464 = false;
        class43.method265(false, var1);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILga;)V")
    public static final void method1317(int arg0, class58 arg1) {
        class84.field1649 = arg1;
        field3975++;
        if (arg0 >= 112) {
            class148.field3020 = class84.field1649.method344(16, 1);
        }
    }
}
