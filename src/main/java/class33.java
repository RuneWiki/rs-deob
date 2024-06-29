import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class33 extends class488 {

    @OriginalMember(owner = "client!waa", name = "j", descriptor = "[I")
    public static int[] field449 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!waa", name = "i", descriptor = "I")
    public static int field448 = 0;

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "Z")
    public static boolean field444 = false;

    @OriginalMember(owner = "client!waa", name = "g", descriptor = "[Lmb;")
    public static class285[] field446 = new class285[14];

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!waa", name = "f", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!waa", name = "h", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(BIII)Lhn;")
    public static final class85 method298(byte arg0, int arg1, int arg2, int arg3) {
        field447++;
        class184 var4 = class277.field4051[arg2][arg1][arg3];
        if (var4 == null) {
            return null;
        }
        class85 var5 = null;
        int var6 = -1;
        if (arg0 != 12) {
            return null;
        }
        for (class277 var7 = var4.field2675; var7 != null; var7 = var7.field4045) {
            class360 var8 = var7.field4044;
            if (var8 instanceof class85) {
                class85 var9 = (class85) var8;
                int var10 = var9.method781((byte) -109) * 64 - 4;
                int var11 = var9.field5108 - var10 >> 7;
                int var12 = var9.field5109 - var10 >> 7;
                int var13 = var9.field5108 + var10 >> 7;
                int var14 = var9.field5109 + var10 >> 7;
                if (var11 <= arg1 && var12 <= arg3 && var13 >= arg1 && var14 >= arg3) {
                    int var15 = (var13 - (arg1 - 1)) * (var14 + 1 - arg3);
                    if (var6 < var15) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)V")
    public static void method299(byte arg0) {
        field449 = null;
        field446 = null;
        if (arg0 < 114) {
            field446 = null;
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(ZILtv;)Lgaa;")
    public static final class277 method300(boolean arg0, int arg1, class360 arg2) {
        field443++;
        class277 var3;
        if (class596.field8490 == null) {
            var3 = new class277();
        } else {
            var3 = class596.field8490;
            class596.field8490 = class596.field8490.field4045;
            class413.field6112--;
            var3.field4045 = null;
        }
        var3.field4049 = arg1;
        if (arg0) {
            field444 = true;
        }
        var3.field4044 = arg2;
        return var3;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIB)Z")
    public static final boolean method301(int arg0, int arg1, byte arg2) {
        if (arg2 == -99) {
            field445++;
            return (arg0 & 0x100) != 0;
        } else {
            return true;
        }
    }
}
