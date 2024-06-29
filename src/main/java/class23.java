import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class23 extends class29 {

    @OriginalMember(owner = "client!da", name = "jb", descriptor = "I")
    public static int field663 = 127;

    @OriginalMember(owner = "client!da", name = "lb", descriptor = "Z")
    public static boolean field665 = false;

    @OriginalMember(owner = "client!da", name = "qb", descriptor = "Lwd;")
    private static class150 field670 = class2.method9(true, "Please reload this page)3");

    @OriginalMember(owner = "client!da", name = "nb", descriptor = "Lwd;")
    public static class150 field667 = field670;

    @OriginalMember(owner = "client!da", name = "ob", descriptor = "Lwd;")
    private static class150 field668 = class2.method9(true, "Close");

    @OriginalMember(owner = "client!da", name = "gb", descriptor = "Lwd;")
    public static class150 field660 = field668;

    @OriginalMember(owner = "client!da", name = "fb", descriptor = "I")
    public int field659;

    @OriginalMember(owner = "client!da", name = "hb", descriptor = "I")
    public int field661;

    @OriginalMember(owner = "client!da", name = "ib", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!da", name = "kb", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!da", name = "mb", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!da", name = "pb", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!da", name = "rb", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZIIII)V")
    public static final void method187(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            field670 = null;
        }
        for (class68 var5 = (class68) class130.field3059.method702((byte) -119); var5 != null; var5 = (class68) class130.field3059.method698(-1610612736)) {
            if (var5.field1717 != -1 || var5.field1703 != null) {
                int var6 = 0;
                if (var5.field1699 < arg3) {
                    var6 += arg3 - var5.field1699;
                } else if (arg3 < var5.field1710) {
                    var6 += var5.field1710 - arg3;
                }
                if (arg2 > var5.field1708) {
                    var6 += arg2 - var5.field1708;
                } else if (arg2 < var5.field1713) {
                    var6 += var5.field1713 - arg2;
                }
                if (var6 - 64 > var5.field1698 || field663 == 0 || var5.field1716 != arg1) {
                    if (var5.field1705 != null) {
                        class146.field3541.method660(var5.field1705);
                        var5.field1705 = null;
                    }
                    if (var5.field1718 != null) {
                        class146.field3541.method660(var5.field1718);
                        var5.field1718 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field1698 - var6) * field663 / var5.field1698;
                    if (var5.field1705 != null) {
                        var5.field1705.method825(var7);
                    } else if (var5.field1717 >= 0) {
                        class44 var8 = class44.method339(class107.field2437, var5.field1717, 0);
                        if (var8 != null) {
                            class115 var9 = var8.method341().method808(class38.field1038);
                            class117 var10 = class117.method845(var9, 100, var7);
                            var10.method838(-1);
                            class146.field3541.method662(var10);
                            var5.field1705 = var10;
                        }
                    }
                    if (var5.field1718 != null) {
                        var5.field1718.method825(var7);
                        if (!var5.field1718.method675((byte) 57)) {
                            var5.field1718 = null;
                        }
                    } else if (var5.field1703 != null && (var5.field1709 -= arg4) <= 0) {
                        int var11 = (int) (Math.random() * (double) var5.field1703.length);
                        class44 var12 = class44.method339(class107.field2437, var5.field1703[var11], 0);
                        if (var12 != null) {
                            class115 var13 = var12.method341().method808(class38.field1038);
                            class117 var14 = class117.method845(var13, 100, var7);
                            var14.method838(0);
                            class146.field3541.method662(var14);
                            var5.field1709 = (int) (Math.random() * (double) (var5.field1714 - var5.field1712)) + var5.field1712;
                            var5.field1718 = var14;
                        }
                    }
                }
            }
        }
        field666++;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(Z)V")
    public static void method188(boolean arg0) {
        field660 = null;
        field670 = null;
        if (arg0) {
            field667 = null;
        }
        field668 = null;
        field667 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
    public static final void method189(int arg0, int arg1, int arg2) {
        if (arg0 <= 115) {
            return;
        }
        int[] var3 = new int[4];
        field664++;
        int[] var4 = new int[4];
        int var5 = 1;
        var4[0] = arg1;
        var3[0] = arg2;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class146.field3524[var6] != arg1) {
                var4[var5] = class146.field3524[var6];
                var3[var5] = class95.field2198[var6];
                var5++;
            }
        }
        class146.field3524 = var4;
        class95.field2198 = var3;
        class11.method76(0, class128.field3047, class146.field3524, class128.field3047.length - 1, class95.field2198, -95);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)Lbe;")
    public final class13 method12(boolean arg0) {
        if (!arg0) {
            this.field661 = -110;
        }
        field669++;
        return class4.method26((byte) 96, this.field659).method168((byte) 7, this.field661);
    }
}
