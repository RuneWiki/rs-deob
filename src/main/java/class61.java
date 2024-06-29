import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public abstract class class61 extends class272 {

    @OriginalMember(owner = "client!er", name = "H", descriptor = "I")
    public int field809;

    @OriginalMember(owner = "client!er", name = "z", descriptor = "I")
    public static int field801 = -1;

    @OriginalMember(owner = "client!er", name = "J", descriptor = "J")
    public static volatile long field811 = 0L;

    @OriginalMember(owner = "client!er", name = "B", descriptor = "Lus;")
    public static class1 field803 = new class1(86, 9);

    @OriginalMember(owner = "client!er", name = "x", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!er", name = "y", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!er", name = "A", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!er", name = "C", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!er", name = "D", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!er", name = "E", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!er", name = "F", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!er", name = "G", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!er", name = "I", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!er", name = "K", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!er", name = "L", descriptor = "[I")
    public static int[] field813;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method375(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field800++;
        if (arg0 != 13663) {
            field803 = null;
        }
        for (int var6 = arg4; var6 <= arg1; var6++) {
            for (int var7 = arg3; var7 <= arg5; var7++) {
                if (class156.field2324[var6][var7] == arg2 && class247.field3658[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lrp;I)Ljd;")
    public static final class139 method376(class276 arg0, int arg1) {
        arg0.method1701(-23121);
        if (arg1 != 1602968994) {
            method375(32, -69, 1, 2, 56, 32);
        }
        field802++;
        int var2 = arg0.method1701(-23121);
        class139 var3 = class281.method1778(var2, -31451);
        var3.field1849 = arg0.method1701(-23121);
        int var4 = arg0.method1701(-23121);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method1701(-23121);
            var3.method21(arg0, (byte) -45, var6);
        }
        var3.method23(arg1 - 1602968987);
        return var3;
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(I)V")
    public static void method377(int arg0) {
        if (arg0 <= 55) {
            method375(39, 84, 61, -15, 28, 125);
        }
        field813 = null;
        field803 = null;
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(B)V")
    public static final void method378(byte arg0) {
        field799++;
        if (arg0 != -85) {
            method384((class276) null, 106);
        }
        class206.field3156 = true;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIZIIIII)V")
    public static final void method379(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field808++;
        int var8 = 0;
        int var9 = arg1;
        int var10 = 0;
        int var11 = arg3 - arg0;
        int var12 = arg1 - arg0;
        int var13 = arg3 * arg3;
        int var14 = arg1 * arg1;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg1 << 1;
        if (arg2) {
            field801 = -46;
        }
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg1 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class128.field1676[arg4];
        class103.method579((byte) 115, arg6 - arg3, -var11 + arg6, arg5, var39);
        class103.method579((byte) 115, arg6 - var11, arg6 + var11, arg7, var39);
        class103.method579((byte) 115, arg6 + var11, arg3 + arg6, arg5, var39);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        var37 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var10++;
                    var33 += var30;
                    var37 += var30;
                }
                var25 += -var38;
                var26 += -var34;
                var34 -= var29;
                var38 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var8++;
                    var35 += var28;
                    var31 += var28;
                }
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var35 += var28;
                var31 += var28;
                var8++;
            }
            var24 += -var32;
            var23 += -var36;
            var36 -= var27;
            var32 -= var27;
            var9--;
            int var41 = arg4 - var9;
            int var42 = arg4 + var9;
            int var43 = arg6 + var8;
            int var44 = arg6 - var8;
            if (var40) {
                int var45 = arg6 + var10;
                int var46 = arg6 - var10;
                class103.method579((byte) 115, var44, var46, arg5, class128.field1676[var41]);
                class103.method579((byte) 115, var46, var45, arg7, class128.field1676[var41]);
                class103.method579((byte) 115, var45, var43, arg5, class128.field1676[var41]);
                class103.method579((byte) 115, var44, var46, arg5, class128.field1676[var42]);
                class103.method579((byte) 115, var46, var45, arg7, class128.field1676[var42]);
                class103.method579((byte) 115, var45, var43, arg5, class128.field1676[var42]);
            } else {
                class103.method579((byte) 115, var44, var43, arg5, class128.field1676[var41]);
                class103.method579((byte) 115, var44, var43, arg5, class128.field1676[var42]);
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "e", descriptor = "(B)Z")
    public abstract boolean method380(byte arg0);

    @OriginalMember(owner = "client!er", name = "f", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method381(byte arg0);

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(I)V")
    public class61(int arg0) {
        this.field809 = arg0;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIB)I")
    public static final int method382(int arg0, int arg1, byte arg2) {
        if (arg2 != 81) {
            field813 = null;
        }
        field806++;
        int var3 = 0;
        while (arg0 > 0) {
            var3 = var3 << 1 | arg1 & 0x1;
            arg1 >>>= 0x1;
            arg0--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BLjava/awt/Canvas;ILwp;)Lnp;")
    public static final class313 method383(byte arg0, Canvas arg1, int arg2, class109 arg3) {
        field805++;
        return arg0 == -74 ? new class108(arg1, arg3, arg2) : null;
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(Lrp;I)Ljava/lang/String;")
    public static final String method384(class276 arg0, int arg1) {
        field807++;
        if (arg1 != 32767) {
            method385(-87);
        }
        return class312.method1929((byte) -127, 32767, arg0);
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(I)V")
    public static final void method385(int arg0) {
        field810++;
        if (arg0 != 26353) {
            field801 = -15;
        }
        class161.method1000(false);
        class135.field1783 = null;
        class305.field4340 = null;
        class286.field4169 = null;
        class207.field3170 = null;
        class453.field6391 = null;
    }
}
