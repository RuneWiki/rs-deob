import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class94 {

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "J")
    public long field1641 = 0L;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Ldc;")
    public static class37 field1638 = class185.method1233((byte) 86, ")3runescape)3com");

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static volatile int field1643 = 0;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field1642 = -1;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public static int field1644 = 0;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "Ldc;")
    private static class37 field1654 = class185.method1233((byte) 86, "Checking for updates )2 ");

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "Ldc;")
    public static class37 field1655 = field1654;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "Lgg;")
    public static class72 field1647 = new class72();

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "Ldc;")
    public static class37 field1657 = class185.method1233((byte) 86, "");

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public int field1636;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public int field1637;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public int field1639;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public int field1640;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public int field1645;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
    public int field1646;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public int field1648;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public int field1649;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public int field1650;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
    public int field1651;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "I")
    public int field1652;

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "Lwa;")
    public static class238 field1658;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "Lia;")
    public class88 field1653;

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "[I")
    public static int[] field1656;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static void method632(int arg0) {
        field1647 = null;
        field1654 = null;
        field1658 = null;
        field1655 = null;
        if (arg0 == 0) {
            field1657 = null;
            field1656 = null;
            field1638 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIILia;JLia;Lia;)V")
    public static final void method633(int arg0, int arg1, int arg2, int arg3, class88 arg4, long arg5, class88 arg6, class88 arg7) {
        class105 var9 = new class105();
        var9.field1816 = arg4;
        var9.field1817 = arg1 * 128 + 64;
        var9.field1818 = arg2 * 128 + 64;
        var9.field1815 = arg3;
        var9.field1823 = arg5;
        var9.field1814 = arg6;
        var9.field1830 = arg7;
        int var10 = 0;
        class18 var11 = class180.field3354[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field290; var12++) {
                class94 var13 = var11.field289[var12];
                if ((var13.field1641 & 0x400000L) == 4194304L) {
                    int var14 = var13.field1653.method5();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1821 = -var10;
        if (class180.field3354[arg0][arg1][arg2] == null) {
            class180.field3354[arg0][arg1][arg2] = new class18(arg0, arg1, arg2);
        }
        class180.field3354[arg0][arg1][arg2].field287 = var9;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI)V")
    public static final void method634(boolean arg0, int arg1) {
        field1635++;
        class117 var2 = (class117) class41.field831.method1047((byte) 122, (long) arg1);
        if (arg0) {
            method633(-96, 122, 115, -40, null, 22L, null, null);
        }
        if (var2 != null) {
            var2.method433(0);
        }
    }
}
