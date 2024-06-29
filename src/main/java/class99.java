import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class99 {

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field1551 = -1;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "[Ls;")
    public static class94[] field1555 = new class94[500];

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field1559 = 0;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field1553 = 0;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "Luf;")
    public static class168 field1563 = class148.method1019(-1720, "::fps ");

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public int field1549;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public int field1554;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public int field1558;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public int field1561;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Ldk;")
    public static class241 field1550;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V", line = 4)
    public static void method739(boolean arg0) {
        field1550 = null;
        field1563 = null;
        field1555 = null;
        if (arg0) {
            field1553 = 101;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)V", line = 18)
    public static final void method740(byte arg0, int arg1) {
        if (arg0 != -62) {
            field1559 = 33;
        }
        class54.field675 = 1000 / arg1;
        field1557++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILdk;Ldk;II)Lcb;", line = 29)
    public static final class33 method741(int arg0, class241 arg1, class241 arg2, int arg3, int arg4) {
        field1556++;
        if (class28.method148(arg0, arg1, arg4, -38)) {
            if (arg3 >= -18) {
                field1563 = (class168) null;
            }
            return class289.method1991(arg2.method1647(arg0, (byte) 119, arg4), (byte) -31);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIBI)I", line = 65)
    public static final int method742(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = class173.field2822[class246.method1692(arg0, arg1)];
        field1562++;
        if (arg3 > 0) {
            int var5 = class173.field2815.method507(arg3 & 0xFFFF, false);
            if (var5 != 0) {
                int var6;
                if (arg1 < 0) {
                    var6 = 0;
                } else if (arg1 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg1 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var7 = 256 - var5;
                    var4 = ((var6 & 0xFF00FF) * var5 + ((var4 & 0xFF00FF) * var7) & 0xFF00FF00) + ((var4 & 0xFF00) * var7 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class173.field2815.method508(46, arg3 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = (var4 >> 8 & 0xFF) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = (var4 >> 16 & 0xFF) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var11 << 8 & 0xFF008A) + (var10 & 0xFF00);
            }
        }
        int var13 = 117 % ((65 - arg2) / 36);
        return var4;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIBIIIII)V", line = 135)
    public static final void method743(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1564++;
        int var9 = arg1 - arg0;
        int var10 = arg4 - arg2;
        int var11 = (arg7 - arg8 << 16) / var9;
        if (arg3 < 15) {
            field1559 = 8;
        }
        int var12 = (arg6 - arg5 << 16) / var10;
        class266.method1853(0, arg4, false, arg8, arg0, 0, var11, arg5, var12, arg2, arg1);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIILg;III)V", line = 153)
    public static final void method744(int arg0, int arg1, int arg2, class242 arg3, int arg4, int arg5, int arg6) {
        field1552++;
        int var7 = arg5 * arg5 + (arg4 * arg4);
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg3.field3989 / 2, arg3.field4057 / 2);
        if (var7 > (var8 * var8)) {
            var8 -= 10;
            int var9 = class71.field959 + class45.field551 & 0x7FF;
            int var10 = class173.field2818[var9];
            int var11 = class173.field2812[var9];
            int var12 = var11 * 256 / (class70.field934 + 256);
            int var13 = var10 * 256 / (class70.field934 + 256);
            int var14 = arg4 * var12 + arg5 * var13 >> 16;
            int var15 = arg4 * var13 - (arg5 * var12) >> 16;
            double var16 = Math.atan2((double) var14, (double) var15);
            int var18 = (int) (Math.sin(var16) * (double) var8);
            int var19 = (int) ((double) var8 * Math.cos(var16));
            ((class258) class57.field745[arg2]).method1770(240, 240, (arg3.field3989 / 2 + arg1 + var18) * 16, (arg3.field4057 / 2 + arg0 - var19) * 16, (int) (var16 * 10430.378D), 4096);
        } else {
            class12.method46(class150.field2318[arg2], arg0, arg4, arg3, arg1, 848605840, arg5);
        }
        if (arg6 != 7966) {
            field1550 = (class241) null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Luf;IZLuf;Luf;)V", line = 215)
    public static final void method745(class168 arg0, int arg1, boolean arg2, class168 arg3, class168 arg4) {
        field1560++;
        class40.method223(arg0, -1, arg4, arg1, (byte) -118, arg3);
        if (arg2) {
            method745((class168) null, -8, true, (class168) null, (class168) null);
        }
    }
}
