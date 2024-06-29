import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class201 {

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field3233 = 0;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3234 = " has logged in.";

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "[I")
    public static int[] field3232 = new int[100];

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field3237 = 0;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field3238 = 1;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method1352(int arg0) {
        if (arg0 != 71) {
            method1354(-78, -66, (byte) -87, 21, 55);
        }
        field3232 = null;
        field3234 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lli;III)V")
    public static final void method1353(class197 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class236.field3769) {
            class99 var4 = class273.field4415[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field1491 != null && var4.field1491.field185.method1092()) {
                arg0.method1069(var4.field1491.field185, 128, 0, 0, true);
            }
        }
        if (arg3 < class236.field3769) {
            class99 var5 = class273.field4415[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field1491 != null && var5.field1491.field185.method1092()) {
                arg0.method1069(var5.field1491.field185, 0, 0, 128, true);
            }
        }
        if (arg2 < class236.field3769 && arg3 < class77.field1061) {
            class99 var6 = class273.field4415[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field1491 != null && var6.field1491.field185.method1092()) {
                arg0.method1069(var6.field1491.field185, 128, 0, 128, true);
            }
        }
        if (arg2 < class236.field3769 && arg3 > 0) {
            class99 var7 = class273.field4415[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field1491 != null && var7.field1491.field185.method1092()) {
                arg0.method1069(var7.field1491.field185, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIBII)V")
    public static final void method1354(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3231++;
        class266.field4320 = class225.field3569 * arg4 / arg3;
        class237.field3791 = -1;
        class150.field2407 = -1;
        if (arg2 == -46) {
            class122.field2048 = class183.field2927 * arg1 / arg0;
            class26.method180(55);
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
    public static final void method1355(int arg0) {
        if (class255.field4069.toLowerCase().indexOf("microsoft") == -1) {
            class274.field4420[46] = 72;
            class274.field4420[45] = 26;
            class274.field4420[61] = 27;
            class274.field4420[92] = 74;
            if (class255.field4086 == null) {
                class274.field4420[192] = 58;
                class274.field4420[222] = 59;
            } else {
                class274.field4420[520] = 59;
                class274.field4420[192] = 28;
                class274.field4420[222] = 58;
            }
            class274.field4420[44] = 71;
            class274.field4420[59] = 57;
            class274.field4420[47] = 73;
            class274.field4420[91] = 42;
            class274.field4420[93] = 43;
        } else {
            class274.field4420[187] = 27;
            class274.field4420[190] = 72;
            class274.field4420[223] = 28;
            class274.field4420[189] = 26;
            class274.field4420[188] = 71;
            class274.field4420[219] = 42;
            class274.field4420[220] = 74;
            class274.field4420[192] = 58;
            class274.field4420[222] = 59;
            class274.field4420[191] = 73;
            class274.field4420[186] = 57;
            class274.field4420[221] = 43;
        }
        if (arg0 != 192) {
            field3232 = null;
        }
        field3235++;
    }
}
