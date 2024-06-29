import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class554 extends class502 {

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "[Lc;")
    public static class200[] field7827 = new class200[14];

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "Leaa;")
    public static class528 field7830 = new class528();

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field7821;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field7822;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public static int field7823;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public static int field7824;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field7825;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field7826;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public static int field7828;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    public static int field7829;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "Lrh;")
    public static class280 field7831;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "[[[B")
    public static byte[][][] field7832;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILgj;)V", line = 3)
    public static final void method3189(int arg0, class662 arg1) {
        class393.field5397 = arg1.method3738(-1, "hitmarks");
        ++field7829;
        class271.field3795 = arg1.method3738(-1, "hitbar_default");
        class433.field5894 = arg1.method3738(-1, "timerbar_default");
        class538.field7315 = arg1.method3738(-1, "headicons_pk");
        class252.field3537 = arg1.method3738(-1, "headicons_prayer");
        class60.field832 = arg1.method3738(-1, "hint_headicons");
        class636.field8787 = arg1.method3738(-1, "hint_mapmarkers");
        class256.field3598 = arg1.method3738(-1, "mapflag");
        class629.field8746 = arg1.method3738(-1, "cross");
        if (arg0 != 1) {
            field7830 = null;
        }
        class766.field10573 = arg1.method3738(-1, "mapdots");
        class173.field2759 = arg1.method3738(-1, "scrollbar");
        class45.field697 = arg1.method3738(arg0 + -2, "name_icons");
        class112.field2111 = arg1.method3738(arg0 ^ -2, "floorshadows");
        class38.field640 = arg1.method3738(-1, "compass");
        class492.field6721 = arg1.method3738(-1, "otherlevel");
        class628.field8734 = arg1.method3738(arg0 + -2, "hint_mapedge");
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V", line = 31)
    public static final void method3190(int arg0) {
        ++field7824;
        if (class676.field9430 == null) {
            class676.field9430 = class337.method2107((byte) 7);
            class256.field3596 = class676.field9430[0];
            class537.field7296 = class197.method1423(arg0 + 19019);
        }
        if (arg0 != -19018) {
            field7831 = null;
        }
        if (class695.field9619 == null) {
            class139.method1141(12);
        }
        class337 var1 = class256.field3596;
        int var2 = class196.method1422(arg0 ^ -19000);
        if (class256.field3596 != var1) {
            if (class337.field4567 != class256.field3596) {
                class776.field10716 = var1.field4542.method3566((byte) 118, class464.field6309);
                class494.field6771 = var1.field4547;
                if (class256.field3596.field4544) {
                    class776.field10716 = class776.field10716 + var1.field4547 + "%";
                }
                if (class256.field3596.field4548 || var1.field4548) {
                    class537.field7296 = class197.method1423(1);
                }
            } else {
                class695.field9619 = null;
                class139.method1142(2, 3);
            }
        } else {
            class776.field10716 = class256.field3596.field4543.method3566((byte) 115, class464.field6309);
            if (class256.field3596.field4548) {
                class494.field6771 = (-class256.field3596.field4534 + class256.field3596.field4547) * var2 / 100 + class256.field3596.field4534;
            }
            if (class256.field3596.field4544) {
                class776.field10716 = class776.field10716 + class494.field6771 + "%";
            }
        }
        if (class695.field9619 != null) {
            class695.field9619.method3410(class776.field10716, class256.field3596, -93, class537.field7296, class494.field6771);
            if (class323.field4423 != null) {
                for (int var3 = class650.field8978 + 1; class323.field4423.length > var3; ++var3) {
                    if (class323.field4423[var3].method876(true) >= 100 && ~(var3 + -1) == ~class650.field8978 && ~class753.field10398 <= -2 && class695.field9619.method3420(5037)) {
                        try {
                            class323.field4423[var3].method880(-123);
                        } catch (Exception var4) {
                            class323.field4423 = null;
                            return;
                        }
                        class695.field9619.method3417(arg0 + 19028, class323.field4423[var3]);
                        ++class650.field8978;
                        if (class650.field8978 >= class323.field4423.length + -1 && ~class323.field4423.length < -2) {
                            class650.field8978 = !class210.field3139.method1174(arg0 ^ -19018) ? -1 : 0;
                        }
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)I", line = 127)
    public final int method3191(byte arg0) {
        ++field7828;
        if (arg0 < 49) {
            field7827 = null;
        }
        return super.field6865;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)I", line = 138)
    public final int method55(int arg0) {
        ++field7825;
        if (arg0 != -2) {
            this.method57(-49, -119);
        }
        return 0;
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(II)V", line = 153)
    public final void method52(int arg0, int arg1) {
        ++field7823;
        if (arg1 != 0) {
            method3193(14, 87, (byte[]) null, 113);
        }
        super.field6865 = arg0;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)I", line = 164)
    public final int method57(int arg0, int arg1) {
        ++field7822;
        if (arg1 != 0) {
            field7832 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)V", line = 177)
    public static void method3192(byte arg0) {
        if (arg0 < 34) {
            method3190(38);
        }
        field7827 = null;
        field7832 = null;
        field7831 = null;
        field7830 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II[BI)Ljava/lang/String;", line = 190)
    public static final String method3193(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field7826;
        char[] var4 = new char[arg3];
        int var5 = 0;
        if (arg0 != 258048) {
            return null;
        } else {
            int var6 = arg1;
            int var7 = arg1 + arg3;
            while (var7 > var6) {
                int var8 = arg2[var6++] & 255;
                int var9;
                if (var8 >= 128) {
                    if (~var8 <= -193) {
                        if (var8 < 224) {
                            if (var7 > var6 && (192 & arg2[var6]) == 128) {
                                var9 = (31 & var8) << 6 | arg2[var6++] & 63;
                                if (~var9 > -129) {
                                    var9 = 65533;
                                }
                            } else {
                                var9 = 65533;
                            }
                        } else if (~var8 > -241) {
                            if (~(var6 + 1) > ~var7 && ~(arg2[var6] & 192) == -129 && (192 & arg2[var6 + 1]) == 128) {
                                var9 = (15 & var8) << 12 | (63 & arg2[var6++]) << 6 | 63 & arg2[var6++];
                                if (~var9 > -2049) {
                                    var9 = 65533;
                                }
                            } else {
                                var9 = 65533;
                            }
                        } else if (~var8 <= -249) {
                            var9 = 65533;
                        } else if (~var7 < ~(var6 + 2) && ~(arg2[var6] & 192) == -129 && (192 & arg2[var6 + 1]) == 128 && ~(192 & arg2[var6 - -2]) == -129) {
                            int var10 = 1835008 & var8 << 18 | 258048 & arg2[var6++] << 12 | (arg2[var6++] & 63) << 6 | arg2[var6++] & 63;
                            if (~var10 <= -65537 && ~var10 >= -1114112) {
                                var9 = 65533;
                            } else {
                                var9 = 65533;
                            }
                        } else {
                            var9 = 65533;
                        }
                    } else {
                        var9 = 65533;
                    }
                } else if (~var8 == -1) {
                    var9 = 65533;
                } else {
                    var9 = var8;
                }
                var4[var5++] = (char) var9;
            }
            return new String(var4, 0, var5);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V", line = 280)
    public final void method58(boolean arg0) {
        if (super.field6865 != 1 && super.field6865 != 0) {
            super.field6865 = this.method55(-2);
        }
        if (!arg0) {
            method3190(48);
        }
        ++field7821;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(ILeka;)V", line = 294)
    public class554(int arg0, class492 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Leka;)V", line = 297)
    public class554(class492 arg0) {
        super(arg0);
    }
}
