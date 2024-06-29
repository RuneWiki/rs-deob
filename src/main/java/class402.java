import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public abstract class class402 {

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "[I")
    public static int[] field5672 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

    @OriginalMember(owner = "client!sia", name = "c", descriptor = "Ljn;")
    public static class134 field5673 = new class134(106, 4);

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "D")
    public static double field5671;

    @OriginalMember(owner = "client!sia", name = "d", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!sia", name = "e", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!sia", name = "f", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(B)V", line = 5)
    public static void method2465(byte arg0) {
        field5673 = null;
        if (arg0 == 0) {
            field5672 = null;
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(Loea;Z)I", line = 18)
    public static final int method2466(class612 arg0, boolean arg1) {
        if (arg1) {
            field5671 = 0.5016770103035773D;
        }
        field5676++;
        if (class612.field8613 == arg0) {
            return 5120;
        } else if (class612.field8614 == arg0) {
            return 5122;
        } else if (class612.field8615 == arg0) {
            return 5124;
        } else if (class612.field8616 == arg0) {
            return 5121;
        } else if (class612.field8617 == arg0) {
            return 5123;
        } else if (class612.field8618 == arg0) {
            return 5125;
        } else if (class612.field8619 == arg0) {
            return 5131;
        } else if (class612.field8620 == arg0) {
            return 5126;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IZIII)V", line = 74)
    public static final void method2467(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field5675++;
        if (arg1) {
            field5671 = -1.0817483696954002D;
        }
        if (arg2 != 8 && arg2 != 16) {
            class472 var5 = class59.field688[arg0][arg3][arg4];
            if (var5 != null) {
                if (arg2 == 1) {
                    var5.field6545 = 0;
                } else if (arg2 == 2) {
                    var5.field6550 = 0;
                }
            }
            class207.method1320(-75);
            return;
        }
        for (int var6 = 0; var6 < class141.field1793; var6++) {
            class532 var7 = class758.field10425[var6];
            if (var7.field7319 == arg2 && var7.field7332 == arg3 && var7.field7324 == arg4 || var7.field7329 == arg3 && var7.field7324 == arg4) {
                if (class141.field1793 != var6) {
                    class335.method2123(class758.field10425, var6 + 1, class758.field10425, var6, class758.field10425.length - var6 - 1);
                }
                class141.field1793--;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(III)Z", line = 127)
    public static final boolean method2468(int arg0, int arg1, int arg2) {
        if (arg0 != -19439) {
            field5672 = null;
        }
        field5674++;
        return (arg1 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IB)[B")
    public abstract byte[] method1659(int arg0, byte arg1);

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(II)I")
    public abstract int method1657(int arg0, int arg1);

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "(B)Loga;")
    public abstract class178 method1647(byte arg0);

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(BI)V")
    public abstract void method1649(byte arg0, int arg1);
}
