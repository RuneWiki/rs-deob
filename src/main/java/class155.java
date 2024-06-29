import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class155 extends class161 {

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
    public int field2711 = 0;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    public int field2709 = -1;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2714 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "Lp;")
    public static class280 field2719 = class18.method140((byte) -120, "Chargement des textures )2 ");

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    public int field2702;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public int field2703;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public int field2705;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
    public int field2706;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
    public int field2707;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public int field2708;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
    public int field2710;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "I")
    public int field2712;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "I")
    public int field2713;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
    public int field2716;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)V")
    public static final void method1106(int arg0) {
        class162.field2856.method1481(false);
        field2717++;
        int var1 = 101 / ((arg0 + 46) / 48);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ltg;Ltg;I)I")
    public static final int method1107(class180 arg0, class180 arg1, int arg2) {
        field2715++;
        int var3 = 0;
        if (arg2 != 3514) {
            method1109(false);
        }
        if (arg0.method1262(class259.field4586, (byte) 93)) {
            var3++;
        }
        if (arg0.method1262(class51.field837, (byte) 93)) {
            var3++;
        }
        if (arg0.method1262(class106.field1762, (byte) 93)) {
            var3++;
        }
        if (arg1.method1262(class259.field4586, (byte) 93)) {
            var3++;
        }
        if (arg1.method1262(class51.field837, (byte) 93)) {
            var3++;
        }
        if (arg1.method1262(class106.field1762, (byte) 93)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)J")
    public static final long method1108(int arg0, int arg1, int arg2) {
        class162 var3 = class220.field3787[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field2841; var4++) {
            class160 var5 = var3.field2845[var4];
            if ((var5.field2805 >> 29 & 0x3L) == 2L && var5.field2814 == arg1 && var5.field2796 == arg2) {
                return var5.field2805;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V")
    public static final void method1109(boolean arg0) {
        field2718++;
        for (class23 var1 = (class23) class13.field259.method651(12916); var1 != null; var1 = (class23) class13.field259.method643(11066)) {
            if (var1.field421) {
                var1.method174((byte) -107);
            }
        }
        for (class23 var2 = (class23) class38.field678.method651(12916); var2 != null; var2 = (class23) class38.field678.method643(11066)) {
            if (var2.field421) {
                var2.method174((byte) -83);
            }
        }
        if (arg0) {
            method1106(-98);
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(Z)V")
    public static void method1110(boolean arg0) {
        if (arg0) {
            method1109(false);
        }
        field2714 = null;
        field2719 = null;
    }
}
