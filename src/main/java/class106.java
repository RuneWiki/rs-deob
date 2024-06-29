import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class106 {

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "J")
    public long field1718 = 0L;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "Lsc;")
    private static class181 field1728 = class149.method967(255, "Created gameworld");

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
    public static int field1737 = 0;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "Lsc;")
    public static class181 field1734 = field1728;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public int field1719;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public int field1721;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public int field1722;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public int field1723;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public int field1727;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public int field1733;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
    public int field1736;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "Laf;")
    public class208 field1726;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "Laf;")
    public class208 field1735;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static void method709(int arg0) {
        field1734 = null;
        field1728 = null;
        if (arg0 != 0) {
            method710(-21);
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
    public static final void method710(int arg0) {
        class131.field2177 = 0;
        class33.field534 = false;
        field1730++;
        class141.field2275.field3933 = 0;
        class52.field812 = -1;
        class203.field3506 = 0;
        class100.field1680 = -1;
        class76.field1223.field3933 = 0;
        class210.field3612 = 0;
        class182.field3211 = -1;
        class138.field2259 = -1;
        class108.field1772 = 0;
        class25.field439 = 0;
        class102.field1701 = 0;
        for (int var1 = 0; var1 < class39.field602.length; var1++) {
            if (class39.field602[var1] != null) {
                class39.field602[var1].field2658 = -1;
            }
        }
        for (int var2 = 0; var2 < class129.field2140.length; var2++) {
            if (class129.field2140[var2] != null) {
                class129.field2140[var2].field2658 = -1;
            }
        }
        class52.method391(32);
        if (arg0 <= 77) {
            return;
        }
        class110.field1792 = 1;
        class92.method612(30, 255);
        for (int var3 = 0; var3 < 100; var3++) {
            class61.field943[var3] = true;
        }
        class144.field2333.method1682(-27);
        class115.method763((byte) 102);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I[Ljc;III[BZIIII)V")
    public static final void method711(int arg0, class8[] arg1, int arg2, int arg3, int arg4, byte[] arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        field1732++;
        byte var11;
        if (arg6) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        if (!arg6) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if ((arg10 + var12) > 0 && (arg10 + var12) < 103 && (arg8 + var13) > 0 && arg8 + var13 < 103) {
                        arg1[arg2].field142[arg10 + var12][arg8 + var13] = class5.method43(arg1[arg2].field142[arg10 + var12][arg8 + var13], -16777217);
                    }
                }
            }
        }
        class230 var14 = new class230(arg5);
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg9 == var15 && var16 >= arg4 && (arg4 + 8) > var16 && var17 >= arg0 && var17 < arg0 + 8) {
                        class12.method123(class57.method417(arg7, 12884, var17 & 0x7, var16 & 0x7) + arg10, 0, arg2, arg6, 0, arg7, arg8 + class127.method823(arg7, var17 & 0x7, var16 & 0x7, (byte) -30), var14, (byte) 82);
                    } else {
                        class12.method123(-1, 0, 0, arg6, 0, 0, -1, var14, (byte) 82);
                    }
                }
            }
        }
        if (arg3 >= -117) {
            field1728 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIII)I")
    public static final int method712(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 & 0x3;
        field1720++;
        if ((arg4 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg2;
            arg2 = var8;
        }
        if (arg5 == var7) {
            return arg1;
        } else if (var7 == 1) {
            return arg3;
        } else if (var7 == 2) {
            return 7 + 1 - arg1 - arg0;
        } else {
            return 7 + 1 - arg2 - arg3;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IB)Lsc;")
    public static final class181 method713(int arg0, byte arg1) {
        field1729++;
        if (arg1 == -58) {
            return class63.field970[arg0].method1226(-458531486) > 0 ? class175.method1164(new class181[] { class161.field2749[arg0], class235.field4089, class63.field970[arg0] }, (byte) 123) : class161.field2749[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BIII)I")
    public static final int method714(byte arg0, int arg1, int arg2, int arg3) {
        field1731++;
        if ((class70.field1129[arg3][arg2][arg1] & 0x8) != 0) {
            return 0;
        } else if (arg3 <= 0 || (class70.field1129[1][arg2][arg1] & 0x2) == 0) {
            if (arg0 < 116) {
                field1737 = -70;
            }
            return arg3;
        } else {
            return arg3 - 1;
        }
    }
}
