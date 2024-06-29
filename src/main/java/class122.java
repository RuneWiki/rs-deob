import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class122 {

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Z")
    public static boolean field2216 = false;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "Lli;")
    public static class185 field2217 = class245.method1649("::breakcon", 124);

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "Lli;")
    public static class185 field2218 = class245.method1649(" )2>", -57);

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "[Lcg;")
    public static class34[] field2213;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static void method895(int arg0) {
        if (arg0 < 40) {
            method895(-71);
        }
        field2217 = null;
        field2213 = null;
        field2218 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lp;Z)Lp;")
    public static final class82 method896(class82 arg0, boolean arg1) {
        field2215++;
        if (arg1) {
            method896((class82) null, true);
        }
        class82 var2 = client.method1507(arg0);
        if (var2 == null) {
            var2 = arg0.field1616;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIIILbb;IZJ)Z")
    public static final boolean method897(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class75 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class268.field4747 == class201.field3694;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class264.field4685 || var24 >= field2214) {
                    return false;
                }
                class198 var25 = class153.field2896[arg0][var15][var24];
                if (var25 != null && var25.field3627 >= 5) {
                    return false;
                }
            }
        }
        class49 var16 = new class49();
        var16.field802 = arg11;
        var16.field805 = arg0;
        var16.field794 = arg5;
        var16.field808 = arg6;
        var16.field815 = arg7;
        var16.field800 = arg8;
        var16.field804 = arg9;
        var16.field816 = arg1;
        var16.field796 = arg2;
        var16.field812 = arg1 + arg3 - 1;
        var16.field793 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class153.field2896[var22][var17][var20] == null) {
                        class153.field2896[var22][var17][var20] = new class198(var22, var17, var20);
                    }
                }
                class198 var23 = class153.field2896[arg0][var17][var20];
                var23.field3646[var23.field3627] = var16;
                var23.field3638[var23.field3627] = var21;
                var23.field3647 |= var21;
                var23.field3627++;
                if (var13 && class125.field2242[var17][var20] != 0) {
                    var14 = class125.field2242[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class125.field2242[var18][var19] == 0) {
                        class125.field2242[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class281.field4969[class276.field4884++] = var16;
        }
        return true;
    }
}
