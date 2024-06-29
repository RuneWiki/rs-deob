import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class228 extends class23 {

    @OriginalMember(owner = "client!jm", name = "Z", descriptor = "I")
    private int field3757 = 409;

    @OriginalMember(owner = "client!jm", name = "ib", descriptor = "[I")
    private int[] field3766 = new int[3];

    @OriginalMember(owner = "client!jm", name = "db", descriptor = "I")
    private int field3761 = 4096;

    @OriginalMember(owner = "client!jm", name = "nb", descriptor = "I")
    private int field3771 = 4096;

    @OriginalMember(owner = "client!jm", name = "ob", descriptor = "I")
    private int field3772 = 4096;

    @OriginalMember(owner = "client!jm", name = "gb", descriptor = "Lqd;")
    public static class40 field3764 = class147.method1106("", (byte) -118);

    @OriginalMember(owner = "client!jm", name = "jb", descriptor = "I")
    public static int field3767 = 1;

    @OriginalMember(owner = "client!jm", name = "lb", descriptor = "I")
    public static int field3769 = 1;

    @OriginalMember(owner = "client!jm", name = "hb", descriptor = "Lqd;")
    public static class40 field3765 = class147.method1106("Lade Konfiguration )2 ", (byte) -113);

    @OriginalMember(owner = "client!jm", name = "kb", descriptor = "Lpl;")
    public static class186 field3768 = new class186(64);

    @OriginalMember(owner = "client!jm", name = "Y", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!jm", name = "ab", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!jm", name = "bb", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!jm", name = "cb", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!jm", name = "eb", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!jm", name = "fb", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!jm", name = "mb", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!jm", name = "pb", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!jm", name = "qb", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!jm", name = "rb", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!jm", name = "sb", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "(I)V", line = 4)
    public static void method1595(int arg0) {
        field3765 = null;
        if (arg0 == 30606) {
            field3764 = null;
            field3768 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)[[I", line = 19)
    public final int[][] method17(int arg0, int arg1) {
        if (arg0 < 30) {
            method1597(59, (byte) -70);
        }
        field3758++;
        int[][] var3 = this.field417.method1251(arg1, 123);
        if (this.field417.field2751) {
            int[][] var4 = this.method173(0, arg1, (byte) -123);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class52.field1007; var11++) {
                int var12 = var5[var11];
                int var13 = var12 - this.field3766[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > this.field3757) {
                    var7[var11] = var12;
                    var10[var11] = var6[var11];
                    var9[var11] = var8[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field3766[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field3757 < var15) {
                        var7[var11] = var12;
                        var10[var11] = var14;
                        var9[var11] = var8[var11];
                    } else {
                        int var16 = var8[var11];
                        int var17 = var16 - this.field3766[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field3757 >= var17) {
                            var7[var11] = this.field3761 * var12 >> 12;
                            var10[var11] = this.field3771 * var14 >> 12;
                            var9[var11] = this.field3772 * var16 >> 12;
                        } else {
                            var7[var11] = var12;
                            var10[var11] = var14;
                            var9[var11] = var16;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "(I)I", line = 109)
    public static final int method1596(int arg0) {
        if (arg0 == 1) {
            field3756++;
            return ((class105.field1854 == 0 ? 0 : 1) << 22) + ((class90.field1636 == 0 ? 0 : 1) << 21) + ((class94.field1698 == 0 ? 0 : 1) << 20) + ((class142.field2387 ? 1 : 0) << 19) + ((class1.field8 ? 1 : 0) << 13) + ((class285.field4804 & 0x3) << 11) + ((class104.field1847 ? 1 : 0) << 9) + ((class223.field3704 ? 1 : 0) << 8) + ((class194.field3131 ? 1 : 0) << 4) + ((class254.field4211 ? 1 : 0) << 3) + ((class162.field2692 & 0x7) + ((class217.field3623 ? 1 : 0) << 5) - -((class81.field1429 ? 1 : 0) << 6) + ((class250.field4144 ? 1 : 0) << 7) + ((class96.field1728 ? 1 : 0) << 10) - (-((class178.field2929 ? 1 : 0) << 15) - ((class206.field3287 ? 1 : 0) << 16)));
        } else {
            return 78;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IB)Z", line = 129)
    public static final boolean method1597(int arg0, byte arg1) {
        field3770++;
        if (arg1 >= -122) {
            method1600((class258) null, -53);
        }
        return arg0 == 198 || arg0 == 230 || arg0 == 156 || arg0 == 140 || arg0 == 223;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILsd;)V", line = 149)
    public final void method23(int arg0, int arg1, class26 arg2) {
        field3763++;
        if (arg1 != 0) {
            return;
        }
        if (arg0 == 0) {
            this.field3757 = arg2.method197(-1);
        } else if (arg0 == 1) {
            this.field3772 = arg2.method197(-1);
        } else if (arg0 == 2) {
            this.field3771 = arg2.method197(-1);
        } else if (arg0 == 3) {
            this.field3761 = arg2.method197(-1);
        } else if (arg0 == 4) {
            int var5 = arg2.method244(arg1 ^ 0xFFFF97A9);
            this.field3766[2] = class276.method1923(var5 >> 12, 0);
            this.field3766[0] = class276.method1923(var5, 16711680) << 4;
            this.field3766[1] = class276.method1923(4080, var5 >> 4);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIII)V", line = 217)
    public static final void method1598(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg4 - arg3;
        field3762++;
        int var7 = arg2 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                class236.method1632(arg3, arg4, arg1, arg5, -105);
            }
        } else if (var6 == 0) {
            class168.method1257(arg1, arg2, arg3, 29685, arg5);
        } else {
            if (arg0 != -18921) {
                field3769 = -127;
            }
            int var8 = (var6 << 12) / var7;
            int var9 = arg3 - (arg5 * var8 >> 12);
            int var10;
            int var11;
            if (arg2 < class125.field2164) {
                var11 = var9 + (class125.field2164 * var8 >> 12);
                var10 = class125.field2164;
            } else if (class48.field941 >= arg2) {
                var10 = arg2;
                var11 = arg4;
            } else {
                var11 = (class48.field941 * var8 >> 12) + var9;
                var10 = class48.field941;
            }
            int var12;
            int var13;
            if (arg5 < class125.field2164) {
                var13 = (class125.field2164 * var8 >> 12) + var9;
                var12 = class125.field2164;
            } else if (class48.field941 < arg5) {
                var12 = class48.field941;
                var13 = var9 + (class48.field941 * var8 >> 12);
            } else {
                var12 = arg5;
                var13 = arg3;
            }
            if (var11 < class220.field3664) {
                var10 = (class220.field3664 - var9 << 12) / var8;
                var11 = class220.field3664;
            } else if (class72.field1275 < var11) {
                var10 = (class72.field1275 - var9 << 12) / var8;
                var11 = class72.field1275;
            }
            if (class220.field3664 > var13) {
                var13 = class220.field3664;
                var12 = (class220.field3664 - var9 << 12) / var8;
            } else if (var13 > class72.field1275) {
                var12 = (class72.field1275 - var9 << 12) / var8;
                var13 = class72.field1275;
            }
            class229.method1604(var12, 1, var10, arg1, var13, var11);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IBII)I", line = 315)
    public static final int method1599(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field3776++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            if (arg1 <= 108) {
                method1597(-51, (byte) 89);
            }
            return arg3;
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V", line = 341)
    public class228() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lve;I)I", line = 349)
    public static final int method1600(class258 arg0, int arg1) {
        if (arg1 != 1) {
            field3765 = (class40) null;
        }
        field3759++;
        int var2 = arg0.field4298;
        if (arg0.field1533 == arg0.field1514) {
            var2 = arg0.field4327;
        } else if (arg0.field1514 == arg0.field1511) {
            var2 = arg0.field4315;
        }
        return var2;
    }
}
