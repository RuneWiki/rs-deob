import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class75 {

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "[I")
    public static int[] field1109 = null;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Ltm;")
    public static class334 field1110 = new class334(5, 4);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILbfa;I[I)V")
    public static final void method680(int arg0, class573 arg1, int arg2, int[] arg3) {
        if (arg1.field1591 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg1.field1591.length; var5++) {
                if (arg1.field1591[var5] != arg3[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg1.field1695 != -1) {
                class82 var6 = class83.field1219.method2358((byte) -115, arg1.field1695);
                int var7 = var6.field1195;
                if (var7 == 1) {
                    arg1.field1611 = 1;
                    arg1.field1600 = 0;
                    arg1.field1686 = arg2;
                    arg1.field1624 = 0;
                    arg1.field1626 = 0;
                    if (!arg1.field1630) {
                        class262.method1747(arg1, arg1.field1626, var6, -26868);
                    }
                }
                if (var7 == 2) {
                    arg1.field1624 = 0;
                }
            }
        }
        field1108++;
        boolean var8 = true;
        for (int var9 = 0; var9 < arg3.length; var9++) {
            if (arg3[var9] != -1) {
                var8 = false;
            }
            if (arg1.field1591 == null || arg1.field1591[var9] == -1 || class83.field1219.method2358((byte) -110, arg3[var9]).field1199 >= class83.field1219.method2358((byte) -121, arg1.field1591[var9]).field1199) {
                arg1.field1686 = arg2;
                arg1.field1591 = arg3;
                break;
            }
        }
        if (var8) {
            arg1.field1686 = arg2;
            arg1.field1591 = arg3;
        }
        if (arg0 != -12503) {
            field1110 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V")
    public static final void method681(int arg0, int arg1) {
        class511.field7416 = 100;
        class214.field3547 = arg1;
        class167.field2913 = arg0;
        class173.field2953 = -1;
        field1111++;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lov;III)V")
    public static final void method682(class668 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class42.field727) {
            class114 var4 = class488.field7062[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field1768 != null && var4.field1768.method92(2)) {
                arg0.method104(false, class382.field5732, class478.field6933, var4.field1768, 0, 0, true);
            }
        }
        if (arg3 < class42.field727) {
            class114 var5 = class488.field7062[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field1768 != null && var5.field1768.method92(2)) {
                arg0.method104(false, 0, class478.field6933, var5.field1768, 0, class382.field5732, true);
            }
        }
        if (arg2 < class42.field727 && arg3 < class54.field870) {
            class114 var6 = class488.field7062[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field1768 != null && var6.field1768.method92(2)) {
                arg0.method104(false, class382.field5732, class478.field6933, var6.field1768, 0, class382.field5732, true);
            }
        }
        if (arg2 < class42.field727 && arg3 > 0) {
            class114 var7 = class488.field7062[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field1768 != null && var7.field1768.method92(2)) {
                arg0.method104(false, class382.field5732, class478.field6933, var7.field1768, 0, -class382.field5732, true);
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method683(int arg0) {
        field1110 = null;
        if (arg0 > -82) {
            field1110 = null;
        }
        field1109 = null;
    }
}
