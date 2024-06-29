import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class194 extends class202 {

    @OriginalMember(owner = "client!gh", name = "O", descriptor = "Lnc;")
    public class9 field3362;

    @OriginalMember(owner = "client!gh", name = "P", descriptor = "Lsb;")
    public static class98 field3363 = class47.method368("details", 0);

    @OriginalMember(owner = "client!gh", name = "X", descriptor = "[I")
    public static int[] field3371 = new int[2];

    @OriginalMember(owner = "client!gh", name = "W", descriptor = "Lsb;")
    private static class98 field3370 = class47.method368("Location", 0);

    @OriginalMember(owner = "client!gh", name = "R", descriptor = "I")
    public static int field3365 = -1;

    @OriginalMember(owner = "client!gh", name = "T", descriptor = "Lsb;")
    public static class98 field3367 = field3370;

    @OriginalMember(owner = "client!gh", name = "Q", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!gh", name = "S", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!gh", name = "U", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!gh", name = "V", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!gh", name = "N", descriptor = "Lac;")
    public static class188 field3361;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(III)V")
    public static final void method1337(int arg0, int arg1, int arg2) {
        field3368++;
        int var3 = arg0;
        if (arg0 > 25) {
            var3 = 25;
        }
        arg0--;
        int var4 = class138.field2462[arg0];
        int var5 = class205.field3508[arg0];
        if (arg1 == 0) {
            class18.field334++;
            class237.field4084.method490(219, arg2 ^ 0xFFFFD6E4);
            class237.field4084.method1477(var3 + var3 + 3, arg2 ^ 0xFFFFBE0A);
        }
        if (arg1 == 1) {
            class237.field4084.method490(34, -110);
            class220.field3802++;
            class237.field4084.method1477(var3 + var3 + 3 + 14, -26755);
        }
        if (arg1 == 2) {
            class106.field1883++;
            class237.field4084.method490(100, arg2 - 10695);
            class237.field4084.method1477(var3 + var3 + 3, arg2 + -37370);
        }
        class250.field4387 = class205.field3508[0];
        class95.field1646 = class138.field2462[0];
        if (arg2 != 10615) {
            return;
        }
        for (int var6 = 1; var6 < var3; var6++) {
            arg0--;
            class237.field4084.method1449((byte) 92, class205.field3508[arg0] - var5);
            class237.field4084.method1477(class138.field2462[arg0] - var4, -26755);
        }
        class237.field4084.method1493(class182.field3143 + var4, false);
        class237.field4084.method1464(class189.field3277 + var5, -128);
        class237.field4084.method1449((byte) 70, class107.field1915[82] ? 1 : 0);
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(III)Z")
    public static final boolean method1338(int arg0, int arg1, int arg2) {
        class21 var3 = class125.method929(arg0, (byte) -96);
        if (arg2 != 192) {
            method1339(23);
        }
        field3366++;
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method228(arg1, -86);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public static final void method1339(int arg0) {
        field3364++;
        if (arg0 > -81) {
            method1339(57);
        }
        if (class5.field72.toLowerCase().indexOf("microsoft") != -1) {
            class190.field3289[189] = 26;
            class190.field3289[186] = 57;
            class190.field3289[222] = 59;
            class190.field3289[187] = 27;
            class190.field3289[192] = 58;
            class190.field3289[221] = 43;
            class190.field3289[191] = 73;
            class190.field3289[223] = 28;
            class190.field3289[220] = 74;
            class190.field3289[219] = 42;
            class190.field3289[188] = 71;
            class190.field3289[190] = 72;
            return;
        }
        class190.field3289[93] = 43;
        class190.field3289[91] = 42;
        class190.field3289[92] = 74;
        class190.field3289[47] = 73;
        class190.field3289[59] = 57;
        if (class5.field85 == null) {
            class190.field3289[192] = 58;
            class190.field3289[222] = 59;
        } else {
            class190.field3289[192] = 28;
            class190.field3289[520] = 59;
            class190.field3289[222] = 58;
        }
        class190.field3289[44] = 71;
        class190.field3289[45] = 26;
        class190.field3289[61] = 27;
        class190.field3289[46] = 72;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
    public static void method1340(boolean arg0) {
        field3370 = null;
        field3361 = null;
        field3371 = null;
        if (arg0) {
            field3367 = null;
            field3363 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lnc;)V")
    public class194(class9 arg0) {
        this.field3362 = arg0;
    }
}
