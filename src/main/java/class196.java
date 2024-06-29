import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class196 {

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "[Z")
    public static boolean[] field3636 = new boolean[100];

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Lmb;")
    public static class132 field3639 = class166.method1092("<col=00ff00>", 119);

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "[I")
    public static int[] field3637 = new int[25];

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "Lmb;")
    public static class132 field3638 = class166.method1092("Freie Welt", 119);

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "Lmb;")
    public static class132 field3640 = class166.method1092("<col=40ff00>", 113);

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field3641 = -1;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Lmb;")
    public static class132 field3635 = class166.method1092(":", 112);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIII)V")
    public static final void method1244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3634++;
        if (class70.field1162 == arg4 && class22.field318 == arg3 && (class132.field2450 == arg5 || !class66.field1096)) {
            return;
        }
        class70.field1162 = arg4;
        if (arg2 != 128) {
            field3637 = null;
        }
        class22.field318 = arg3;
        class132.field2450 = arg5;
        if (!class66.field1096) {
            class132.field2450 = 0;
        }
        class2.method6(25, (byte) -125);
        class195.method1240(class21.field309, true, 250);
        int var6 = class129.field2389;
        int var7 = class168.field3082;
        class168.field3082 = (arg3 - 6) * 8;
        class129.field2389 = (arg4 - 6) * 8;
        int var8 = class168.field3082 - var7;
        int var9 = class129.field2389 - var6;
        int var10 = class168.field3082;
        int var11 = class129.field2389;
        for (int var12 = 0; var12 < 32768; var12++) {
            class65 var28 = class11.field145[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field703[var29] -= var9;
                    var28.field676[var29] -= var8;
                }
                var28.field723 -= var8 * 128;
                var28.field673 -= var9 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class159 var26 = class68.field1120[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field703[var27] -= var9;
                    var26.field676[var27] -= var8;
                }
                var26.field673 -= var9 * 128;
                var26.field723 -= var8 * 128;
            }
        }
        class139.field2615 = arg5;
        byte var14 = 1;
        byte var15 = 0;
        class210.field3854.method290(arg0, arg1, (byte) -98, false);
        byte var16 = 104;
        if (var9 < 0) {
            var15 = 103;
            var14 = -1;
            var16 = -1;
        }
        byte var17 = 0;
        byte var18 = 104;
        byte var19 = 1;
        if (var8 < 0) {
            var17 = 103;
            var19 = -1;
            var18 = -1;
        }
        for (int var20 = var15; var20 != var16; var20 += var14) {
            for (int var22 = var17; var22 != var18; var22 += var19) {
                int var23 = var8 + var22;
                int var24 = var9 + var20;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var24 >= 0 && var23 >= 0 && var24 < 104 && var23 < 104) {
                        class15.field216[var25][var20][var22] = class15.field216[var25][var24][var23];
                    } else {
                        class15.field216[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class226 var21 = (class226) class84.field1462.method119(true); var21 != null; var21 = (class226) class84.field1462.method125((byte) -98)) {
            var21.field4094 -= var8;
            var21.field4102 -= var9;
            if (var21.field4102 < 0 || var21.field4094 < 0 || var21.field4102 >= 104 || var21.field4094 >= 104) {
                var21.method995((byte) 90);
            }
        }
        class91.field1602 = 0;
        class180.field3313 = false;
        class200.field3700 = -1;
        if (class13.field174 != 0) {
            class13.field174 -= var9;
            class84.field1470 -= var8;
        }
        class181.field3325.method130(12040);
        class200.field3697.method130(12040);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public static void method1245(byte arg0) {
        field3638 = null;
        if (arg0 < 67) {
            return;
        }
        field3637 = null;
        field3640 = null;
        field3639 = null;
        field3635 = null;
        field3636 = null;
    }
}
