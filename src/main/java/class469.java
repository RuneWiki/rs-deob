import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class469 extends class528 {

    @OriginalMember(owner = "client!h", name = "n", descriptor = "Lwj;")
    public static class270 field6850 = null;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public int field6854;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "I")
    public static int field6855;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "I")
    public static int field6859;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "I")
    public static int field6860;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "I")
    public static int field6862;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "I")
    public int field6863;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "I")
    public int field6864;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "I")
    public static int field6865;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "J")
    public long field6857;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "Lmg;")
    public static class101 field6853;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(I)I")
    public final int method2741(int arg0) {
        if (arg0 <= 45) {
            return 106;
        } else {
            field6859++;
            return this.field6863;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)V")
    public static final void method2742(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class76.field1021 = arg0;
        field6860++;
        class424.field6204 = arg4;
        class224.field3193 = arg1;
        if (arg2 != 0) {
            field6853 = null;
        }
        class417.field6057 = arg3;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)V")
    public static final void method2743(int arg0, byte arg1) {
        field6856++;
        if (arg1 != 1) {
            field6850 = null;
        }
        if (arg0 == 37) {
            class350.field5117 = 3.0F;
        } else if (arg0 == 50) {
            class350.field5117 = 4.0F;
        } else if (arg0 == 75) {
            class350.field5117 = 6.0F;
        } else if (arg0 == 100) {
            class350.field5117 = 8.0F;
        } else if (arg0 == 200) {
            class350.field5117 = 16.0F;
        }
        class295.field4056 = -1;
        class295.field4056 = -1;
    }

    @OriginalMember(owner = "client!h", name = "h", descriptor = "(I)V")
    public static final void method2744(int arg0) {
        int var1 = 20 / ((36 - arg0) / 53);
        class147.field2137.method1068(0);
        field6858++;
    }

    @OriginalMember(owner = "client!h", name = "i", descriptor = "(I)V")
    public static void method2745(int arg0) {
        field6853 = null;
        field6850 = null;
        int var1 = -5 / ((-arg0 - 6) / 49);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I[Lem;I)V")
    public static final void method2746(int arg0, class150[] arg1, int arg2) {
        field6851++;
        int var3 = 0;
        int var4 = -31 / ((arg0 + 20) / 40);
        while (var3 < arg1.length) {
            class150 var5 = arg1[var3];
            if (var5 != null) {
                if (var5.field2315 == 0) {
                    if (var5.field2299 != null) {
                        method2746(64, var5.field2299, arg2);
                    }
                    class295 var6 = (class295) class212.field2960.method1492((long) var5.field2277, 6340);
                    if (var6 != null) {
                        class467.method2736(var6.field4055, 9380, arg2);
                    }
                }
                if (arg2 == 0 && var5.field2321 != null) {
                    class437 var7 = new class437();
                    var7.field6390 = var5;
                    var7.field6389 = var5.field2321;
                    class429.method2537(var7);
                }
                if (arg2 == 1 && var5.field2290 != null) {
                    label60: {
                        if (var5.field2248 >= 0) {
                            class150 var8 = class60.method497(var5.field2277, (byte) -127);
                            if (var8 == null || var8.field2299 == null || var5.field2248 >= var8.field2299.length || var8.field2299[var5.field2248] != var5) {
                                break label60;
                            }
                        }
                        class437 var9 = new class437();
                        var9.field6389 = var5.field2290;
                        var9.field6390 = var5;
                        class429.method2537(var9);
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)I")
    public final int method2747(int arg0) {
        field6862++;
        return arg0 == 5 ? this.field6854 : -83;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III)I")
    public static final int method2748(int arg0, int arg1, int arg2) {
        if (arg2 == 2) {
            field6855++;
            return arg0 == 4 || arg0 == 5 ? class211.field2952[arg1 & 0x3] : 256;
        } else {
            return -89;
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)I")
    public final int method2749(int arg0) {
        field6852++;
        if (arg0 != -2257) {
            this.method2747(-36);
        }
        return this.field6864;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIBII)V")
    public static final void method2750(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 < 42) {
            field6850 = null;
        }
        for (int var5 = 0; var5 < class9.field146; var5++) {
            Rectangle var6 = class521.field7729[var5];
            if ((var6.x + var6.width) > arg4 && arg0 + arg4 > var6.x && var6.y + var6.height > arg3 && (arg1 + arg3) > var6.y) {
                class165.field2477[var5] = true;
            }
        }
        field6865++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method2751(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class523.field7736 = arg0;
        class424.field6241 = 0x1 << class523.field7736;
        class131.field1925 = class424.field6241 >> 1;
        class402.field5901 = (int) Math.sqrt((double) (class131.field1925 * class131.field1925 + class131.field1925 * class131.field1925));
        class297.field4082 = class424.field6241 >> 2;
        class295.field4054 = class424.field6241;
        class206.field2881 = arg2;
        class371.field5427 = arg3;
        class110.field1656 = arg4;
        class485.field7086 = new class486[arg1][class206.field2881][class371.field5427];
        class385.field5608 = new class142[arg1];
        if (arg5) {
            class257.field3581 = new int[class206.field2881][class371.field5427];
            class391.field5739 = new byte[class206.field2881][class371.field5427];
            class12.field192 = new byte[class206.field2881][class371.field5427];
            class382.field5586 = new class486[1][class206.field2881][class371.field5427];
            class89.field1302 = new class142[1];
        } else {
            class257.field3581 = null;
            class391.field5739 = null;
            class12.field192 = null;
            class382.field5586 = null;
            class89.field1302 = null;
        }
        if (arg6) {
            class243.field3402 = new long[arg1][arg2][arg3];
            class94.field1451 = new class525[65535];
            class37.field466 = new boolean[65535];
            class510.field7569 = 0;
        } else {
            class243.field3402 = null;
            class94.field1451 = null;
            class37.field466 = null;
            class510.field7569 = 0;
        }
        class11.method52(false);
        class271.field3736 = new class310[1000];
        class273.field3759 = 0;
        class59.field718 = new class310[1000];
        class405.field5948 = 0;
        class371.field5429 = new int[arg1][class206.field2881 + 1][class371.field5427 + 1];
        class420.field6132 = new class116[5000];
        class304.field4159 = 0;
        class457.field6712 = new boolean[class110.field1656 + class110.field1656 + 1][class110.field1656 + class110.field1656 + 1];
        class414.field6042 = new boolean[class110.field1656 + class110.field1656 + 2][class110.field1656 + class110.field1656 + 2];
        class361.field5270 = null;
    }

    @OriginalMember(owner = "client!h", name = "g", descriptor = "(I)J")
    public final long method2752(int arg0) {
        if (arg0 != 260) {
            this.method2741(-101);
        }
        field6861++;
        return this.field6857;
    }
}
