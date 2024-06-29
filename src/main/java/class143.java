import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class143 {

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field2707 = 0;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "Lhh;")
    private static class163 field2703 = class137.method1065("Allocating memory", 17);

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Lhh;")
    public static class163 field2706 = class137.method1065("headicons_pk", 17);

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Lhh;")
    public static class163 field2704 = field2703;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "Lmi;")
    public static class128 field2708 = new class128();

    @OriginalMember(owner = "client!h", name = "l", descriptor = "Lhh;")
    private static class163 field2712 = class137.method1065("skill)2", 17);

    @OriginalMember(owner = "client!h", name = "m", descriptor = "Lhh;")
    public static class163 field2713 = field2712;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "[Lvf;")
    public static class71[] field2711;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIZI)V")
    public static final void method1086(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        int var8 = 2048 - arg0 & 0x7FF;
        int var9 = 2048 - arg3 & 0x7FF;
        if (arg6) {
            method1089(38, -120, 57, 106, 41);
        }
        field2709++;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg4;
        if (var8 != 0) {
            int var13 = class98.field1839[var8];
            var11 = -arg4 * var13 >> 16;
            int var14 = class98.field1843[var8];
            var12 = arg4 * var14 >> 16;
        }
        if (var9 != 0) {
            int var15 = class98.field1839[var9];
            var10 = var12 * var15 >> 16;
            int var16 = class98.field1843[var9];
            var12 = var12 * var16 >> 16;
        }
        class191.field3490 = arg1 - var11;
        class13.field201 = arg0;
        class63.field1072 = arg3;
        class88.field1636 = arg5 - var12;
        class123.field2367 = arg2 - var10;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
    public static void method1087(boolean arg0) {
        field2704 = null;
        field2711 = null;
        if (!arg0) {
            field2711 = null;
        }
        field2713 = null;
        field2708 = null;
        field2703 = null;
        field2712 = null;
        field2706 = null;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(IIIIIIZI)V")
    public static final void method1088(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        int var8 = arg0;
        field2710++;
        int var9 = 0;
        if (!arg6) {
            return;
        }
        int var10 = 0;
        int var11 = arg5 - arg2;
        int var12 = arg0 - arg2;
        int var13 = arg5 * arg5;
        int var14 = arg0 * arg0;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg0 << 1;
        int var22 = (1 - var21) * var13 + var17;
        int var23 = var14 - ((var21 - 1) * var18);
        int var24 = var12 << 1;
        int var25 = (1 - var24) * var15 + var19;
        int var26 = var16 - (var24 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var17 * 3;
        int var31 = var16 << 2;
        int var32 = var19 * 3;
        int var33 = (var24 - 3) * var20;
        int var34 = (var21 - 3) * var18;
        int var35 = var28;
        int var36 = (arg0 - 1) * var27;
        int var37 = var31;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class85.field1605[arg4];
        class227.method1585(arg7 - arg5, (byte) -66, arg3, var39, arg7 - var11);
        class227.method1585(arg7 - var11, (byte) -66, arg1, var39, arg7 + var11);
        class227.method1585(arg7 + var11, (byte) -66, arg3, var39, arg7 + arg5);
        while (var8 > 0) {
            if (var22 < 0) {
                while (var22 < 0) {
                    var10++;
                    var23 += var35;
                    var35 += var28;
                    var22 += var30;
                    var30 += var28;
                }
            }
            if (var23 < 0) {
                var23 += var35;
                var22 += var30;
                var30 += var28;
                var35 += var28;
                var10++;
            }
            var23 += -var34;
            var22 += -var36;
            var34 -= var27;
            var36 -= var27;
            boolean var40 = var8 <= var12;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var37 += var31;
                        var25 += var32;
                        var9++;
                        var32 += var31;
                    }
                }
                if (var26 < 0) {
                    var25 += var32;
                    var26 += var37;
                    var9++;
                    var32 += var31;
                    var37 += var31;
                }
                var26 += -var33;
                var33 -= var29;
                var25 += -var38;
                var38 -= var29;
            }
            var8--;
            int var41 = arg4 + var8;
            int var42 = arg4 - var8;
            int var43 = arg7 + var10;
            int var44 = arg7 - var10;
            if (var40) {
                int var45 = arg7 + var9;
                int var46 = arg7 - var9;
                class227.method1585(var44, (byte) -66, arg3, class85.field1605[var42], var46);
                class227.method1585(var46, (byte) -66, arg1, class85.field1605[var42], var45);
                class227.method1585(var45, (byte) -66, arg3, class85.field1605[var42], var43);
                class227.method1585(var44, (byte) -66, arg3, class85.field1605[var41], var46);
                class227.method1585(var46, (byte) -66, arg1, class85.field1605[var41], var45);
                class227.method1585(var45, (byte) -66, arg3, class85.field1605[var41], var43);
            } else {
                class227.method1585(var44, (byte) -66, arg3, class85.field1605[var42], var43);
                class227.method1585(var44, (byte) -66, arg3, class85.field1605[var41], var43);
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)V")
    public static final void method1089(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class191.field3499.field1541 = 0;
        field2705++;
        class191.field3499.method655(0, 145);
        class191.field3499.method655(0, arg2);
        class191.field3499.method655(0, arg3);
        class191.field3499.method631(arg4, -1);
        class191.field3499.method631(arg0, -1);
        class58.field955 = 0;
        class244.field4321 = -3;
        class31.field481 = 1;
        if (arg1 >= -104) {
            method1087(true);
        }
        class75.field1403 = 0;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IILvg;[B)V")
    public static final void method1090(int arg0, int arg1, class262 arg2, byte[] arg3) {
        class103 var4 = new class103();
        var4.field1981 = arg3;
        var4.field1979 = 0;
        var4.field2641 = (long) arg0;
        field2701++;
        var4.field1976 = arg2;
        if (arg1 != -572085439) {
            return;
        }
        class128 var5 = class250.field4395;
        synchronized (class250.field4395) {
            class250.field4395.method1018((byte) 82, var4);
        }
        class133.method1047(-44);
    }
}
