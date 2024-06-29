import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class66 {

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "Lak;")
    public static class234 field854 = new class234("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "Lak;")
    public static class234 field855 = new class234("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!iv", name = "k", descriptor = "Lsu;")
    public static class143 field860 = new class143();

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!iv", name = "l", descriptor = "Lya;")
    public static class38 field861;

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "Lul;")
    public static class406 field857;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "[B")
    public byte[] field852;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "[S")
    public short[] field851;

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "[S")
    public short[] field856;

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "[S")
    public short[] field858;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(III)B")
    public static final byte method560(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            return -108;
        }
        field853++;
        if (arg2 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IILkk;ZI)V")
    public static final void method561(int arg0, int arg1, class129 arg2, boolean arg3, int arg4) {
        field850++;
        class376 var5 = arg2.method948(arg3);
        int var6 = arg2.field1901 - arg2.field1949.field1788 & 0x3FFF;
        if (arg4 == -1) {
            if (var6 != 0 || arg2.field1913 > 25) {
                if (arg0 < 0 && var5.field5656 != -1) {
                    arg2.field1925 = var5.field5656;
                } else if (arg0 <= 0 || var5.field5634 == -1) {
                    arg2.field1925 = var5.field5661;
                } else {
                    arg2.field1925 = var5.field5634;
                }
                arg2.field1926 = false;
            } else if (!arg2.field1926 || !var5.method2363((byte) -33, arg2.field1925)) {
                arg2.field1925 = var5.method2362(false);
                arg2.field1926 = arg2.field1925 != -1;
            }
        } else if (arg2.field1968 != -1 && var6 >= 10240 || var6 <= 2048) {
            int var7 = class484.field6971[arg1] - arg2.field1949.field1788 & 0x3FFF;
            arg2.field1926 = false;
            if (arg4 == 2 && var5.field5662 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field5673 != -1) {
                    arg2.field1925 = var5.field5673;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field5650 != -1) {
                    arg2.field1925 = var5.field5650;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field5672 == -1) {
                    arg2.field1925 = var5.field5662;
                } else {
                    arg2.field1925 = var5.field5672;
                }
            } else if (arg4 == 0 && var5.field5652 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field5648 != -1) {
                    arg2.field1925 = var5.field5648;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field5638 != -1) {
                    arg2.field1925 = var5.field5638;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field5643 == -1) {
                    arg2.field1925 = var5.field5652;
                } else {
                    arg2.field1925 = var5.field5643;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field5663 != -1) {
                arg2.field1925 = var5.field5663;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field5675 != -1) {
                arg2.field1925 = var5.field5675;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field5633 == -1) {
                arg2.field1925 = var5.field5661;
            } else {
                arg2.field1925 = var5.field5633;
            }
        } else if (var6 == 0 && arg2.field1913 <= 25) {
            arg2.field1926 = false;
            if (arg4 == 2 && var5.field5662 != -1) {
                arg2.field1925 = var5.field5662;
            } else if (arg4 == 0 && var5.field5652 != -1) {
                arg2.field1925 = var5.field5652;
            } else {
                arg2.field1925 = var5.field5661;
            }
        } else {
            arg2.field1926 = false;
            if (arg4 == 2 && var5.field5662 != -1) {
                if (arg0 < 0 && var5.field5664 != -1) {
                    arg2.field1925 = var5.field5664;
                } else if (arg0 <= 0 || var5.field5683 == -1) {
                    arg2.field1925 = var5.field5662;
                } else {
                    arg2.field1925 = var5.field5683;
                }
            } else if (arg4 == 0 && var5.field5652 != -1) {
                if (arg0 < 0 && var5.field5658 != -1) {
                    arg2.field1925 = var5.field5658;
                } else if (arg0 <= 0 || var5.field5653 == -1) {
                    arg2.field1925 = var5.field5652;
                } else {
                    arg2.field1925 = var5.field5653;
                }
            } else if (arg0 < 0 && var5.field5676 != -1) {
                arg2.field1925 = var5.field5676;
            } else if (arg0 <= 0 || var5.field5646 == -1) {
                arg2.field1925 = var5.field5661;
            } else {
                arg2.field1925 = var5.field5646;
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)V")
    public static void method562(byte arg0) {
        field855 = null;
        field854 = null;
        field861 = null;
        field860 = null;
        field857 = null;
        int var1 = -53 / ((arg0 + 31) / 50);
    }
}
