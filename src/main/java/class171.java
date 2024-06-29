import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class171 extends class237 {

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public int field2703;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public int field2709;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
    public static int field2711 = 0;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
    public static int field2714 = -1;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field2706 = 0;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
    public static int field2715 = -1;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "Ltc;")
    public static class134 field2722 = new class134();

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)Z")
    public final boolean method1163(int arg0) {
        if (arg0 == 30071) {
            field2712++;
            return ((this.field2703 & 0x1BEC5727) >> 28) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIILwb;)V")
    public static final void method1164(int arg0, int arg1, int arg2, class123 arg3) {
        field2708++;
        if (arg1 != 1) {
            method1178(111);
        }
        if (class34.field437 < 2 && class32.field432 == 0 && !class247.field4076) {
            return;
        }
        String var4 = class83.method460(arg1 ^ 0xFFFFFFD3);
        if (arg3 == null) {
            int var6 = class280.field4439.method686(var4, arg0 + 4, arg2 - -15, 16777215, 0, class278.field4427, class201.field3183);
            class225.method1589(arg2, 15, arg0 + 4, 0, var6 + class280.field4439.method692(var4));
            return;
        }
        class109 var5 = arg3.method800(50, class258.field4179);
        if (var5 == null) {
            var5 = class280.field4439;
        }
        var5.method699(var4, arg0, arg2, arg3.field1879, arg3.field1809, arg3.field1779, arg3.field1792, arg3.field1868, arg3.field1876, class278.field4427, class201.field3183, class278.field4421);
        class225.method1589(class278.field4421[1], class278.field4421[3], class278.field4421[0], 0, class278.field4421[2]);
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)Z")
    public final boolean method1165(int arg0) {
        field2702++;
        if (arg0 < 19) {
            return false;
        } else {
            return (this.field2703 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZ)Z")
    public final boolean method1166(int arg0, boolean arg1) {
        field2717++;
        if (arg1) {
            return (this.field2703 >> arg0 + 1 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILlh;[I[I[I)V")
    public static final void method1167(int arg0, class200 arg1, int[] arg2, int[] arg3, int[] arg4) {
        int var5 = 0;
        if (arg0 > -125) {
            method1169((byte) 58, (class200) null);
        }
        while (arg4.length > var5) {
            int var6 = arg4[var5];
            int var7 = arg3[var5];
            int var8 = arg2[var5];
            for (int var9 = 0; var7 != 0 && arg1.field3839.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field3839[var9] = null;
                    } else {
                        class165 var10 = class208.method1458((byte) 96, var6);
                        int var11 = var10.field2647;
                        class201 var12 = arg1.field3839[var9];
                        if (var12 != null) {
                            if (var12.field3180 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field3839[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3187 = 0;
                                    var12.field3177 = 0;
                                    var12.field3188 = var8;
                                    var12.field3184 = 1;
                                    var12.field3178 = 0;
                                    class221.method1562(0, arg1.field3820, arg1.field3818, var10, (byte) 47, false);
                                } else if (var11 == 2) {
                                    var12.field3178 = 0;
                                }
                            } else if (var10.field2646 >= class208.method1458((byte) 109, var12.field3180).field2646) {
                                var12 = arg1.field3839[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class201 var13 = arg1.field3839[var9] = new class201();
                            var13.field3178 = 0;
                            var13.field3177 = 0;
                            var13.field3180 = var6;
                            var13.field3187 = 0;
                            var13.field3188 = var8;
                            var13.field3184 = 1;
                            class221.method1562(0, arg1.field3820, arg1.field3818, var10, (byte) 47, false);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
            var5++;
        }
        field2713++;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)I")
    public final int method1168(byte arg0) {
        if (arg0 < 81) {
            return 51;
        } else {
            field2704++;
            return (this.field2703 & 0x1F2BB6) >> 18;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLlh;)V")
    public static final void method1169(byte arg0, class200 arg1) {
        if (arg0 >= -105) {
            field2711 = -119;
        }
        field2721++;
        for (class210 var2 = (class210) class21.field280.method1802(43); var2 != null; var2 = (class210) class21.field280.method1815(0)) {
            if (var2.field3372 == arg1) {
                if (var2.field3353 != null) {
                    class191.field3082.method1951(var2.field3353);
                    var2.field3353 = null;
                }
                var2.method1673(14510);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(II)V")
    public class171(int arg0, int arg1) {
        this.field2703 = arg0;
        this.field2709 = arg1;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lbl;I)V")
    public static final void method1170(class259 arg0, int arg1) {
        class210 var2 = (class210) class200.field3160.method708(class185.method1296((byte) -103, arg0.field4208), 120);
        if (arg1 != -1) {
            field2711 = -105;
        }
        field2716++;
        if (var2 == null) {
            return;
        }
        if (var2.field3353 != null) {
            class191.field3082.method1951(var2.field3353);
            var2.field3353 = null;
        }
        var2.method1673(14510);
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)I")
    public final int method1171(int arg0) {
        if (arg0 > -66) {
            field2711 = -34;
        }
        field2720++;
        return class291.method1956(this.field2703, 127);
    }

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "(I)Z")
    public final boolean method1172(int arg0) {
        if (arg0 != 1) {
            field2722 = null;
        }
        field2707++;
        return (this.field2703 & 0x6315D0C3) >> 30 != 0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V")
    public static void method1173(boolean arg0) {
        if (!arg0) {
            field2722 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)Z")
    public final boolean method1174(byte arg0) {
        if (arg0 <= 77) {
            field2722 = null;
        }
        field2718++;
        return (this.field2703 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "(I)Z")
    public final boolean method1175(int arg0) {
        field2705++;
        if (arg0 == 25946) {
            return (this.field2703 >> 22 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "(I)Z")
    public final boolean method1176(int arg0) {
        field2719++;
        if (arg0 != 4) {
            this.field2709 = 105;
        }
        return (this.field2703 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "(I)Z")
    public final boolean method1177(int arg0) {
        field2723++;
        int var2 = 37 % ((arg0 - 27) / 52);
        return ((this.field2703 & 0x3782D9) >> 21) != 0;
    }

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "(I)V")
    public static final void method1178(int arg0) {
        class189.field3067.method1699(arg0);
        field2710++;
    }
}
