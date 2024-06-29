import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class88 extends class59 {

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "I")
    private int field1733 = 6;

    @OriginalMember(owner = "client!jg", name = "X", descriptor = "[I")
    public static int[] field1736 = new int[32];

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "Lb;")
    public static class11 field1731 = new class11(20);

    @OriginalMember(owner = "client!jg", name = "cb", descriptor = "Lsd;")
    public static class166 field1741 = class135.method935("oder ung-Ultiges Passwort)3", 0);

    @OriginalMember(owner = "client!jg", name = "eb", descriptor = "Lsd;")
    public static class166 field1743 = class135.method935("<img=1>", 0);

    @OriginalMember(owner = "client!jg", name = "db", descriptor = "I")
    public static int field1742 = 0;

    @OriginalMember(owner = "client!jg", name = "fb", descriptor = "Lsd;")
    public static class166 field1744 = class135.method935("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", 0);

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!jg", name = "V", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!jg", name = "W", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!jg", name = "Y", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!jg", name = "Z", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!jg", name = "ab", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!jg", name = "bb", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)V")
    public static final void method695(byte arg0, int arg1) {
        ++field1734;
        if (~client.field520 != ~arg1) {
            if (client.field520 == 0) {
                class11.method66(90);
            }
            if (arg1 == 20 || ~arg1 == -41) {
                class48.field897 = 0;
                class129.field2527 = 0;
                class139.field2725 = 0;
            }
            if (arg1 != 20 && arg1 != 40 && class103.field2018 != null) {
                class103.field2018.method12((byte) 90);
                class103.field2018 = null;
            }
            if (~client.field520 == -26) {
                class82.field1675 = 1;
                class64.field1343 = 1;
                class98.field1867 = 0;
                class125.field2452 = 0;
                class9.field175 = 0;
            }
            if (~arg1 != -6 && ~arg1 != -11 && arg1 != 20) {
                class140.method957(107);
            } else {
                class72.method572(class64.field1337, class3.field33, 54, class114.field2219);
            }
            if (arg0 != -125) {
                field1743 = null;
            }
            client.field520 = arg1;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        ++field1738;
        if (arg1 > -124) {
            this.method41((class53) null, (byte) 114, -48);
        }
        int[] var3 = super.field1219.method721(arg0, -125);
        if (super.field1219.field1816) {
            int[] var4 = this.method499(0, arg0, 0);
            int[] var5 = this.method499(0, arg0, 1);
            for (int var6 = 0; ~class98.field1879 < ~var6; ++var6) {
                var3[var6] = this.method696(119, var4[var6], var5[var6]);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
    public class88() {
        super(2, false);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        if (arg1 < 18) {
            method695((byte) 13, -34);
        }
        ++field1739;
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field1216 = arg0.method400(255) == 1;
            }
        } else {
            this.field1733 = arg0.method400(255);
        }
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(III)I")
    private final int method696(int arg0, int arg1, int arg2) {
        ++field1737;
        int var4 = this.field1733;
        if (~var4 != -2) {
            if (~var4 != -3) {
                if (~var4 != -4) {
                    if (var4 != 4) {
                        if (var4 != 5) {
                            if (~var4 != -7) {
                                if (~var4 != -8) {
                                    if (var4 != 8) {
                                        if (~var4 != -10) {
                                            if (var4 != 10) {
                                                if (~var4 != -12) {
                                                    if (var4 == 12) {
                                                        return arg1 - (-arg2 - -(arg1 * arg2 >> 11));
                                                    } else {
                                                        int var5 = -91 / ((arg0 - 20) / 45);
                                                        return arg1;
                                                    }
                                                } else {
                                                    return arg2 >= arg1 ? -arg1 + arg2 : -arg2 + arg1;
                                                }
                                            } else {
                                                return ~arg1 < ~arg2 ? arg1 : arg2;
                                            }
                                        } else {
                                            return ~arg1 <= ~arg2 ? arg2 : arg1;
                                        }
                                    } else {
                                        return ~arg1 != -1 ? -((-arg2 + 4096 << 12) / arg1) + 4096 : 0;
                                    }
                                } else {
                                    return ~arg1 == -4097 ? 4096 : (arg2 << 12) / (-arg1 + 4096);
                                }
                            } else {
                                return ~arg2 > -2049 ? arg1 * arg2 >> 11 : -((4096 - arg1) * (4096 - arg2) >> 11) + 4096;
                            }
                        } else {
                            return 4096 - ((4096 - arg1) * (-arg2 + 4096) >> 12);
                        }
                    } else {
                        return ~arg2 == -1 ? 4096 : (arg1 << 12) / arg2;
                    }
                } else {
                    return arg1 * arg2 >> 12;
                }
            } else {
                return arg1 - arg2;
            }
        } else {
            return arg1 + arg2;
        }
    }

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "(I)V")
    public static void method697(int arg0) {
        field1741 = null;
        field1731 = null;
        field1744 = null;
        if (arg0 == 23818) {
            field1743 = null;
            field1736 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method37(boolean arg0, int arg1) {
        ++field1735;
        int[][] var3 = super.field1207.method528(72, arg1);
        if (!arg0) {
            field1731 = null;
        }
        if (super.field1207.field1320) {
            int[][] var4 = this.method498(arg1, 0, 0);
            int[][] var5 = this.method498(arg1, 0, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[2];
            int[] var14 = var5[1];
            for (int var15 = 0; var15 < class98.field1879; ++var15) {
                var6[var15] = this.method696(71, var9[var15], var12[var15]);
                var7[var15] = this.method696(87, var10[var15], var14[var15]);
                var8[var15] = this.method696(-76, var11[var15], var13[var15]);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)I")
    public static final int method698(int arg0, int arg1) {
        ++field1732;
        class195 var2 = class180.method1215(arg1, (byte) 118);
        if (arg0 != 0) {
            return -43;
        } else {
            int var3 = var2.field3870;
            int var4 = var2.field3864;
            int var5 = var2.field3863;
            int var6 = class206.field4047[-var5 + var3];
            return class91.field1785[var4] >> var5 & var6;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(BI)Lad;")
    public static final class5 method699(byte arg0, int arg1) {
        ++field1740;
        class5 var2 = (class5) class61.field1243.method64((byte) 28, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 != -61) {
            return null;
        } else {
            byte[] var3 = class54.field1018.method353(1, arg1, -72);
            class5 var4 = new class5();
            if (var3 != null) {
                var4.method30(new class53(var3), arg1, (byte) -53);
            }
            var4.method29(127);
            class61.field1243.method67(var4, 15266, (long) arg1);
            return var4;
        }
    }
}
