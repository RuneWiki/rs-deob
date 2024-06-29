import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class221 extends class183 {

    @OriginalMember(owner = "client!li", name = "T", descriptor = "Ljf;")
    public static class229 field3770 = class212.method1457((byte) 65, " de votre liste d(Wamis)3");

    @OriginalMember(owner = "client!li", name = "U", descriptor = "I")
    public static int field3771 = 0;

    @OriginalMember(owner = "client!li", name = "X", descriptor = "[I")
    public static int[] field3774 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!li", name = "eb", descriptor = "I")
    public static int field3781 = 0;

    @OriginalMember(owner = "client!li", name = "V", descriptor = "I")
    private int field3772;

    @OriginalMember(owner = "client!li", name = "W", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!li", name = "Y", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!li", name = "Z", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!li", name = "ab", descriptor = "I")
    private int field3777;

    @OriginalMember(owner = "client!li", name = "bb", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!li", name = "cb", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!li", name = "db", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!li", name = "fb", descriptor = "I")
    private int field3782;

    @OriginalMember(owner = "client!li", name = "gb", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!li", name = "hb", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(I)V", line = 9)
    public static void method1522(int arg0) {
        if (arg0 != 128) {
            method1525((byte) 62, (class229) null);
        }
        field3770 = null;
        field3774 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIII)Z", line = 20)
    public static final boolean method1523(int arg0, int arg1, int arg2, int arg3) {
        if (!class268.method1889(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class132.field2328[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class331.field5639) {
                    if (!class47.method404(var4, var6, var5)) {
                        return false;
                    }
                    if (!class47.method404(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class47.method404(var4, var7, var5)) {
                        return false;
                    }
                    if (!class47.method404(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class47.method404(var4, var8, var5)) {
                    return false;
                }
                if (!class47.method404(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class61.field1045) {
                    if (!class47.method404(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class47.method404(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class47.method404(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class47.method404(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class47.method404(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class47.method404(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class331.field5639) {
                    if (!class47.method404(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class47.method404(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class47.method404(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class47.method404(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class47.method404(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class47.method404(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class61.field1045) {
                    if (!class47.method404(var4, var6, var5)) {
                        return false;
                    }
                    if (!class47.method404(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class47.method404(var4, var7, var5)) {
                        return false;
                    }
                    if (!class47.method404(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class47.method404(var4, var8, var5)) {
                    return false;
                }
                if (!class47.method404(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class47.method404(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class47.method404(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class47.method404(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class47.method404(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class47.method404(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)V", line = 218)
    private final void method1524(int arg0, byte arg1) {
        if (arg1 == 63) {
            this.field3772 = (arg0 & 0xFF0000) >> 12;
            field3784++;
            this.field3782 = (arg0 & 0xFF) << 4;
            this.field3777 = arg0 >> 4 & 0xFF0;
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V", line = 236)
    public class221() {
        this(0);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BLjf;)Ljf;", line = 240)
    public static final class229 method1525(byte arg0, class229 arg1) {
        field3776++;
        if (arg0 != 70) {
            method1526(21, 38, (byte) -59);
        }
        int var2 = class279.method1958(arg1, 31924);
        return var2 == -1 ? class130.field2306 : class124.field2183.field5618[var2].method1633(class56.field993, (byte) -89, class150.field2602);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILkh;I)V", line = 262)
    public final void method14(int arg0, class14 arg1, int arg2) {
        if (arg2 == 0) {
            this.method1524(arg1.method114(0), (byte) 63);
        }
        if (arg0 >= -43) {
            method1523(47, 1, 28, 2);
        }
        field3773++;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(IIB)V", line = 285)
    public static final void method1526(int arg0, int arg1, byte arg2) {
        int var3 = -122 / ((34 - arg2) / 55);
        for (int var4 = 0; var4 < class113.field2045; var4++) {
            class323 var5 = class122.method874(-2702, var4);
            if (var5 != null) {
                int var6 = var5.field5442;
                if (var6 >= 0 && !class227.field3904.method1516((byte) 111, var6)) {
                    var6 = -1;
                }
                int var7;
                if (var5.field5436 >= 0) {
                    int var11 = var5.field5436;
                    int var12 = (var11 & 0x7F) + arg0;
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 127) {
                        var12 = 127;
                    }
                    int var13 = (arg1 + var11 & 0xFC00) + (var11 & 0x380) + var12;
                    var7 = class227.field3907[class224.method1540(96, var13, -1)];
                } else if (var6 >= 0) {
                    var7 = class227.field3907[class224.method1540(96, class227.field3904.method1509((byte) 127, var6), -1)];
                } else if (var5.field5443 == -1) {
                    var7 = -1;
                } else {
                    int var8 = var5.field5443;
                    int var9 = (var8 & 0x7F) + arg0;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > 127) {
                        var9 = 127;
                    }
                    int var10 = (arg1 + var8 & 0xFC00) + (var8 & 0x380) + var9;
                    var7 = class227.field3907[class224.method1540(96, var10, -1)];
                }
                class48.field869[var4 + 1] = var7;
            }
        }
        field3775++;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(II)[[I", line = 361)
    public final int[][] method12(int arg0, int arg1) {
        field3780++;
        int var3 = -71 % ((18 - arg0) / 61);
        int[][] var4 = this.field3160.method1057(-20449, arg1);
        if (this.field3160.field2689) {
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            for (int var8 = 0; var8 < class22.field393; var8++) {
                var5[var8] = this.field3772;
                var7[var8] = this.field3777;
                var6[var8] = this.field3782;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(II)V", line = 401)
    public static final void method1527(int arg0, int arg1) {
        class63.field1084 = arg0 / arg1;
        field3783++;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIBII)V", line = 415)
    public static final void method1528(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field3779++;
        if (arg5 <= 14) {
            method1522(25);
        }
        if (arg7 < 1 || arg3 < 1 || arg7 > 102 || arg3 > 102) {
            return;
        }
        if (!class110.method781((byte) 127) && (class142.field2464[0][arg7][arg3] & 0x2) == 0) {
            int var8 = arg2;
            if ((class142.field2464[arg2][arg7][arg3] & 0x8) != 0) {
                var8 = 0;
            }
            if (class225.field3852 != var8) {
                return;
            }
        }
        int var9 = arg2;
        if (arg2 < 3 && (class142.field2464[1][arg7][arg3] & 0x2) == 2) {
            var9 = arg2 + 1;
        }
        class321.method2162(var9, class80.field1460[arg2], arg0, arg7, arg3, arg2, (byte) -73);
        if (arg4 >= 0) {
            boolean var10 = class41.field735;
            class41.field735 = true;
            class140.method981(false, arg2, false, class80.field1460[arg2], arg3, arg6, (byte) -48, arg1, var9, arg4, arg7);
            class41.field735 = var10;
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(I)V", line = 477)
    private class221(int arg0) {
        super(0, false);
        this.method1524(arg0, (byte) 63);
    }
}
