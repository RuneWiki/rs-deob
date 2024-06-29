import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class51 {

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "Z")
    public static boolean field534 = false;

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "I")
    public static int field536 = 0;

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "Lhda;")
    public static class750 field535 = new class750(8, 1);

    @OriginalMember(owner = "client!aea", name = "g", descriptor = "Lvea;")
    public static class276 field537 = new class276(2, 4, 4, 0);

    @OriginalMember(owner = "client!aea", name = "h", descriptor = "[I")
    public static int[] field538 = new int[1];

    @OriginalMember(owner = "client!aea", name = "k", descriptor = "Lrga;")
    public static class242 field541 = null;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!aea", name = "j", descriptor = "Lsha;")
    public static class728 field540;

    @OriginalMember(owner = "client!aea", name = "i", descriptor = "Z")
    public static boolean field539;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIILsba;Laa;IBLufa;)V", line = 3)
    public static final void method301(int arg0, int arg1, int arg2, class218 arg3, class487 arg4, int arg5, byte arg6, class680 arg7) {
        field532++;
        if (arg7 == null) {
            return;
        }
        int var8;
        if (class8.field57 == 4) {
            var8 = (int) class183.field2237 & 0x3FFF;
        } else {
            var8 = (int) class183.field2237 + class514.field6956 & 0x3FFF;
        }
        int var9 = Math.max(arg3.field2781 / 2, arg3.field2718 / 2) + 10;
        int var10 = arg5 * arg5 + (arg1 * arg1);
        if ((var9 * var9) < var10) {
            return;
        }
        int var11 = class15.field113[var8];
        if (arg6 != -24) {
            field537 = null;
        }
        int var12 = class15.field115[var8];
        if (class8.field57 != 4) {
            var11 = var11 * 256 / (class283.field3747 + 256);
            var12 = var12 * 256 / (class283.field3747 + 256);
        }
        int var13 = arg1 * var11 + (arg5 * var12) >> 14;
        int var14 = arg1 * var12 - (arg5 * var11) >> 14;
        arg7.method672(var13 + (arg3.field2781 / 2 + arg2 - arg7.method666() / 2), -var14 + arg3.field2718 / 2 + arg0 + -(arg7.method663() / 2), arg4, arg2, arg0);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)V", line = 49)
    public static final void method302(byte arg0) {
        field533++;
        if (class287.field3824 == class200.field2376) {
            return;
        }
        if (arg0 != 99) {
            method302((byte) -1);
        }
        try {
            class679.method3851("tbrefresh", class58.field623, -26978);
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)V", line = 75)
    public static void method303(int arg0) {
        if (arg0 != 10) {
            field540 = null;
        }
        field537 = null;
        field540 = null;
        field535 = null;
        field538 = null;
        field541 = null;
    }
}
