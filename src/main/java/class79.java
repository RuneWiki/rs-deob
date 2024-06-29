import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class79 extends class173 {

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "Lsc;")
    public class165 field1618 = new class165();

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "Lqe;")
    public class149 field1619 = new class149();

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "Lg;")
    private class56 field1613;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "Lsd;")
    private static class166 field1611 = class135.method935("Loaded config", 0);

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "Lsd;")
    public static class166 field1612 = field1611;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "Ld;")
    public static class29 field1606 = new class29(32);

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "I")
    public static int field1622 = 255;

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "Lsd;")
    private static class166 field1621 = class135.method935("Loading interfaces )2 ", 0);

    @OriginalMember(owner = "client!ig", name = "N", descriptor = "Lsd;")
    public static class166 field1624 = class135.method935("<col=ffffff>", 0);

    @OriginalMember(owner = "client!ig", name = "M", descriptor = "Lsd;")
    public static class166 field1623 = field1621;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!ig", name = "O", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "([III)V")
    public final void method311(int[] arg0, int arg1, int arg2) {
        field1625++;
        this.field1619.method311(arg0, arg1, arg2);
        for (class43 var4 = (class43) this.field1618.method1109((byte) -76); var4 != null; var4 = (class43) this.field1618.method1115((byte) -75)) {
            if (!this.field1613.method464(var4, true)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field770) {
                        this.method646(var4, arg0, var5, -73, var6, var5 + var6);
                        var4.field770 -= var6;
                        break;
                    }
                    this.method646(var4, arg0, var5, -126, var4.field770, var5 + var6);
                    var5 += var4.field770;
                    var6 -= var4.field770;
                } while (!this.field1613.method453(var6, var4, arg0, var5, (byte) -41));
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)I")
    public static final int method645(int arg0, int arg1, int arg2) {
        field1617++;
        int var3 = arg2 - 1 & arg0 >> 31;
        if (arg1 != -31889) {
            method649(null, 40, 43, null, -2, null);
        }
        return ((arg0 >>> 31) + arg0) % arg2 + var3;
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "()Ltb;")
    public final class173 method312() {
        field1620++;
        class43 var1 = (class43) this.field1618.method1109((byte) -68);
        if (var1 == null) {
            return null;
        } else if (var1.field767 == null) {
            return this.method304();
        } else {
            return var1.field767;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lee;[IIIII)V")
    private final void method646(class43 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5) {
        field1614++;
        if ((this.field1613.field1102[arg0.field768] & 0x4) != 0 && arg0.field786 < 0) {
            int var7 = this.field1613.field1045[arg0.field768] / class161.field3075;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field771) / var7;
                if (arg4 < var8) {
                    arg0.field771 += arg4 * var7;
                    break;
                }
                arg4 -= var8;
                int var9 = 262144 / var7;
                arg0.field767.method311(arg1, arg2, var8);
                arg2 += var8;
                arg0.field771 += var7 * var8 - 1048576;
                int var10 = class161.field3075 / 100;
                if (var10 > var9) {
                    var10 = var9;
                }
                class44 var11 = arg0.field767;
                if (this.field1613.field1077[arg0.field768] == 0) {
                    arg0.field767 = class44.method298(arg0.field769, var11.method321(), var11.method320(), var11.method314());
                } else {
                    arg0.field767 = class44.method298(arg0.field769, var11.method321(), 0, var11.method314());
                    this.field1613.method468(arg0.field760.field3223[arg0.field766] < 0, arg0, (byte) -113);
                    arg0.field767.method334(var10, var11.method320());
                }
                if (arg0.field760.field3223[arg0.field766] < 0) {
                    arg0.field767.method329(-1);
                }
                var11.method322(var10);
                var11.method311(arg1, arg2, arg5 - arg2);
                if (var11.method332()) {
                    this.field1619.method1012(var11);
                }
            }
        }
        if (arg3 >= -34) {
            this.method312();
        }
        arg0.field767.method311(arg1, arg2, arg4);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "()I")
    public final int method313() {
        field1610++;
        return 0;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "()Ltb;")
    public final class173 method304() {
        field1607++;
        class43 var1;
        do {
            var1 = (class43) this.field1618.method1115((byte) -49);
            if (var1 == null) {
                return null;
            }
        } while (var1.field767 == null);
        return var1.field767;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZBLf;II)V")
    public static final void method647(int arg0, boolean arg1, byte arg2, class47 arg3, int arg4, int arg5) {
        field1609++;
        class81.field1655 = arg3;
        if (arg2 < 3) {
            method648((byte) -51);
        }
        class153.field2952 = 1;
        class34.field649 = 10000;
        class143.field2781 = arg4;
        class4.field88 = arg1;
        class81.field1657 = arg5;
        class58.field1182 = arg0;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
    public static void method648(byte arg0) {
        if (arg0 != 39) {
            method648((byte) -1);
        }
        field1623 = null;
        field1621 = null;
        field1606 = null;
        field1611 = null;
        field1612 = null;
        field1624 = null;
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V")
    public final void method327(int arg0) {
        this.field1619.method327(arg0);
        field1608++;
        for (class43 var2 = (class43) this.field1618.method1109((byte) -121); var2 != null; var2 = (class43) this.field1618.method1115((byte) 93)) {
            if (!this.field1613.method464(var2, true)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field770) {
                        this.method650(var2, (byte) 116, var3);
                        var2.field770 -= var3;
                        break;
                    }
                    this.method650(var2, (byte) 121, var2.field770);
                    var3 -= var2.field770;
                } while (!this.field1613.method453(var3, var2, null, 0, (byte) -123));
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([Lph;II[II[I)V")
    public static final void method649(class143[] arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5) {
        field1616++;
        if (arg2 < arg1) {
            int var6 = arg2 - 1;
            int var7 = arg1 + 1;
            int var8 = (arg1 + arg2) / 2;
            class143 var9 = arg0[var8];
            arg0[var8] = arg0[arg2];
            arg0[arg2] = var9;
            while (var6 < var7) {
                boolean var10 = true;
                do {
                    var7--;
                    for (int var11 = 0; var11 < 4; var11++) {
                        int var12;
                        int var13;
                        if (arg5[var11] == 2) {
                            var12 = var9.field2785;
                            var13 = arg0[var7].field2785;
                        } else if (arg5[var11] == 1) {
                            var13 = arg0[var7].field2783;
                            if (var13 == -1 && arg3[var11] == 1) {
                                var13 = 2001;
                            }
                            var12 = var9.field2783;
                            if (var12 == -1 && arg3[var11] == 1) {
                                var12 = 2001;
                            }
                        } else if (arg5[var11] == 3) {
                            var12 = var9.field2776 ? 1 : 0;
                            var13 = arg0[var7].field2776 ? 1 : 0;
                        } else {
                            var12 = var9.field2770;
                            var13 = arg0[var7].field2770;
                        }
                        if (var12 != var13) {
                            if ((arg3[var11] != 1 || var12 >= var13) && (arg3[var11] != 0 || var12 <= var13)) {
                                var10 = false;
                            }
                            break;
                        }
                        if (var11 == 3) {
                            var10 = false;
                        }
                    }
                } while (var10);
                boolean var14 = true;
                do {
                    var6++;
                    for (int var15 = 0; var15 < 4; var15++) {
                        int var16;
                        int var17;
                        if (arg5[var15] == 2) {
                            var17 = arg0[var6].field2785;
                            var16 = var9.field2785;
                        } else if (arg5[var15] == 1) {
                            var16 = var9.field2783;
                            var17 = arg0[var6].field2783;
                            if (var16 == -1 && arg3[var15] == 1) {
                                var16 = 2001;
                            }
                            if (var17 == -1 && arg3[var15] == 1) {
                                var17 = 2001;
                            }
                        } else if (arg5[var15] == 3) {
                            var16 = var9.field2776 ? 1 : 0;
                            var17 = arg0[var6].field2776 ? 1 : 0;
                        } else {
                            var16 = var9.field2770;
                            var17 = arg0[var6].field2770;
                        }
                        if (var16 != var17) {
                            if ((arg3[var15] != 1 || var17 >= var16) && (arg3[var15] != 0 || var16 >= var17)) {
                                var14 = false;
                            }
                            break;
                        }
                        if (var15 == 3) {
                            var14 = false;
                        }
                    }
                } while (var14);
                if (var6 < var7) {
                    class143 var18 = arg0[var6];
                    arg0[var6] = arg0[var7];
                    arg0[var7] = var18;
                }
            }
            method649(arg0, var7, arg2, arg3, 8989, arg5);
            method649(arg0, arg1, var7 + 1, arg3, 8989, arg5);
        }
        if (arg4 != 8989) {
            field1611 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lee;BI)V")
    private final void method650(class43 arg0, byte arg1, int arg2) {
        field1615++;
        if ((this.field1613.field1102[arg0.field768] & 0x4) != 0 && arg0.field786 < 0) {
            int var4 = this.field1613.field1045[arg0.field768] / class161.field3075;
            int var5 = (var4 + 1048575 - arg0.field771) / var4;
            arg0.field771 = arg0.field771 + arg2 * var4 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field1613.field1077[arg0.field768] == 0) {
                    arg0.field767 = class44.method298(arg0.field769, arg0.field767.method321(), arg0.field767.method320(), arg0.field767.method314());
                } else {
                    arg0.field767 = class44.method298(arg0.field769, arg0.field767.method321(), 0, arg0.field767.method314());
                    this.field1613.method468(arg0.field760.field3223[arg0.field766] < 0, arg0, (byte) -117);
                }
                if (arg0.field760.field3223[arg0.field766] < 0) {
                    arg0.field767.method329(-1);
                }
                arg2 = arg0.field771 / var4;
            }
        }
        arg0.field767.method327(arg2);
        int var6 = 125 / ((83 - arg1) / 32);
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lg;)V")
    public class79(class56 arg0) {
        this.field1613 = arg0;
    }
}
