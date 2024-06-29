import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class122 {

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "Lat;")
    private class412 field1686;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Lo;")
    public static class332 field1681 = new class332("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field1687 = 0;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Ltl;")
    public static class400 field1684 = new class400(4);

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "S")
    public static short field1688 = 32767;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public static int field1689 = 0;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lfi;")
    private class35 field1680;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Lui;")
    public static class451 field1678;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
    public static void method855(byte arg0) {
        field1678 = null;
        field1684 = null;
        field1681 = null;
        if (arg0 != -103) {
            method861(108, -6, 121, 31, -80, 61);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method856(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field1679++;
        int var8 = arg5 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class303.field4508 - class386.field5703) * var8 / 100 + class386.field5703;
        int var10 = arg0 * var9 >> 8;
        int var11 = 16384 - arg3 & 0x3FFF;
        int var12 = 16384 - arg2 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class172.field2450[var11] * -var10 >> 15;
            var15 = class172.field2456[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class172.field2450[var12] * var15 >> 15;
            var15 = class172.field2456[var12] * var15 >> 15;
        }
        class433.field6156 = arg2;
        class200.field3027 = arg4 - var15;
        class68.field920 = arg1 - var13;
        class283.field4287 = arg3;
        if (arg7 < 34) {
            field1687 = 84;
        }
        class344.field5191 = arg6 - var14;
        class32.field425 = 0;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)Lfi;")
    public final class35 method857(int arg0) {
        field1682++;
        if (arg0 != 16986) {
            field1689 = 70;
        }
        class35 var2 = this.field1686.field5951.field434;
        if (this.field1686.field5951 == var2) {
            this.field1680 = null;
            return null;
        } else {
            this.field1680 = var2.field434;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLat;)V")
    public final void method858(byte arg0, class412 arg1) {
        field1675++;
        if (arg0 == 99) {
            this.field1686 = arg1;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
    public static final void method859(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 << 3;
        int var5 = arg2 << 3;
        field1685++;
        int var6 = arg0 << 3;
        class384.field5682 = (float) var5;
        if (arg1 >= -117) {
            return;
        }
        class412.field5953 = (float) var6;
        if (class469.field6596 == 2) {
            class433.field6156 = var5;
            class283.field4287 = var6;
            class32.field425 = var4;
        }
        class100.method770(true);
        class380.field5645 = true;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
    public class122() {
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lat;)V")
    public class122(class412 arg0) {
        this.field1686 = arg0;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)Lfi;")
    public final class35 method860(int arg0) {
        if (arg0 != 0) {
            this.method858((byte) 6, (class412) null);
        }
        field1683++;
        class35 var2 = this.field1680;
        if (this.field1686.field5951 == var2) {
            this.field1680 = null;
            return null;
        } else {
            this.field1680 = var2.field434;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)I")
    public static final int method861(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1676++;
        if (class479.field6745 == null) {
            return 0;
        }
        if (arg0 < 3) {
            int var6 = arg1 >> 7;
            int var7 = arg5 >> 7;
            if (arg3 < 0 || arg2 < 0 || (class379.field5642 - 1) < arg3 || arg2 > (class456.field6477 - 1)) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || class379.field5642 - 1 < var6 || class456.field6477 - 1 < var7) {
                return 0;
            }
            boolean var8 = (class246.field3532[1][arg1 >> 7][arg5 >> 7] & 0x2) != 0;
            if ((arg1 & 0x7F) == 0) {
                boolean var9 = (class246.field3532[1][var6 - 1][arg5 >> 7] & 0x2) != 0;
                boolean var10 = (class246.field3532[1][var6][arg5 >> 7] & 0x2) != 0;
                if (var10 != var9) {
                    var8 = (class246.field3532[1][arg3][arg2] & 0x2) != 0;
                }
            }
            if ((arg5 & 0x7F) == 0) {
                boolean var11 = (class246.field3532[1][arg1 >> 7][var7 - 1] & 0x2) != 0;
                boolean var12 = (class246.field3532[1][arg1 >> 7][var7] & 0x2) != 0;
                if (var12 != var11) {
                    var8 = (class246.field3532[1][arg3][arg2] & 0x2) != 0;
                }
            }
            if (var8) {
                arg0++;
            }
        }
        if (arg4 != 0) {
            field1689 = -17;
        }
        return class479.field6745[arg0].method204(arg1, arg5);
    }
}
