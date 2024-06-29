import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class163 extends class99 {

    @OriginalMember(owner = "client!u", name = "S", descriptor = "Lr;")
    public static class66 field2917 = class93.method641(43, "::fpsoff");

    @OriginalMember(owner = "client!u", name = "W", descriptor = "I")
    public static int field2921 = 0;

    @OriginalMember(owner = "client!u", name = "bb", descriptor = "I")
    public static int field2926 = -2;

    @OriginalMember(owner = "client!u", name = "ab", descriptor = "[I")
    public static int[] field2925 = new int[32];

    @OriginalMember(owner = "client!u", name = "cb", descriptor = "Lr;")
    public static class66 field2927 = class93.method641(43, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!u", name = "U", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!u", name = "V", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!u", name = "X", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!u", name = "Y", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!u", name = "Z", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!u", name = "db", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(IB)Z")
    public static final boolean method1096(int arg0, byte arg1) {
        ++field2916;
        if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else {
            if (arg1 > -34) {
                field2921 = 46;
            }
            return ~arg0 > -130 || ~arg0 < -160;
        }
    }

    @OriginalMember(owner = "client!u", name = "g", descriptor = "(I)V")
    public static final void method1097(int arg0) {
        for (class217 var1 = (class217) class259.field4539.method873((byte) 76); var1 != null; var1 = (class217) class259.field4539.method870((byte) 58)) {
            if (var1.field3743) {
                var1.method1397(31506);
            }
        }
        if (arg0 != 2) {
            method1101(-53);
        }
        for (class217 var2 = (class217) class222.field3784.method873((byte) 76); var2 != null; var2 = (class217) class222.field3784.method870((byte) 60)) {
            if (var2.field3743) {
                var2.method1397(arg0 + 31504);
            }
        }
        ++field2922;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(II)I")
    public static final int method1098(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        if (arg0 != -61) {
            return null;
        } else {
            int[] var3 = super.field1943.method749(false, arg1);
            if (super.field1943.field2147) {
                int[] var4 = this.method682(0, arg1, 29149);
                int[] var5 = this.method682(1, arg1, 29149);
                int[] var6 = this.method682(2, arg1, 29149);
                for (int var7 = 0; var7 < class199.field3432; ++var7) {
                    int var8 = var6[var7];
                    if (var8 == 4096) {
                        var3[var7] = var4[var7];
                    } else if (~var8 != -1) {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                }
            }
            ++field2920;
            return var3;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method37(int arg0, boolean arg1) {
        if (!arg1) {
            this.method37(-2, true);
        }
        int[][] var3 = super.field1946.method823(arg0, (byte) -118);
        if (super.field1946.field2297) {
            int[] var4 = this.method682(2, arg0, 29149);
            int[][] var5 = this.method683(-67, 0, arg0);
            int[][] var6 = this.method683(-114, 1, arg0);
            int[] var7 = var3[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class199.field3432 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (~var17 == -1) {
                        var8[var16] = var13[var16];
                        var9[var16] = var14[var16];
                        var7[var16] = var15[var16];
                    } else {
                        int var18 = 4096 - var17;
                        var8[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var9[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var7[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                    }
                } else {
                    var8[var16] = var10[var16];
                    var9[var16] = var11[var16];
                    var7[var16] = var12[var16];
                }
            }
        }
        ++field2928;
        return var3;
    }

    @OriginalMember(owner = "client!u", name = "h", descriptor = "(I)Z")
    public static final boolean method1099(int arg0) {
        ++field2918;
        if (arg0 != 0) {
            field2925 = null;
        }
        try {
            if (~class73.field1453 == -3) {
                if (client.field1647 == null) {
                    client.field1647 = class104.method719(class244.field4263, class54.field948, class246.field4292);
                    if (client.field1647 == null) {
                        return false;
                    }
                }
                if (class200.field3453 == null) {
                    class200.field3453 = new class133(class41.field678, class79.field1558);
                }
                if (class7.field62.method283((byte) -70, client.field1647, class200.field3453, 22050, class174.field3065)) {
                    class7.field62.method284((byte) 84);
                    class7.field62.method288((byte) -126, class248.field4334);
                    class7.field62.method310(class242.field4225, true, client.field1647);
                    class244.field4263 = null;
                    client.field1647 = null;
                    class73.field1453 = 0;
                    class200.field3453 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class7.field62.method298(73);
            class244.field4263 = null;
            client.field1647 = null;
            class73.field1453 = 0;
            class200.field3453 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!u", name = "i", descriptor = "(I)V")
    public static void method1100(int arg0) {
        field2917 = null;
        field2927 = null;
        if (arg0 != -26774) {
            method1098(-65, -93);
        }
        field2925 = null;
    }

    @OriginalMember(owner = "client!u", name = "j", descriptor = "(I)V")
    public static final void method1101(int arg0) {
        class176.field3105 = 0;
        class102.field1991 = -1;
        class129.field2400 = -1;
        class263.field4618 = 0;
        ++field2923;
        class61.field1033 = 0;
        class77.field1527 = -1;
        class156.field2777 = 0;
        class115.field2177 = false;
        class184.field3212 = -1;
        class35.field517 = 0;
        if (arg0 == 2) {
            class32.field481 = 0;
            class28.field412.field4335 = 0;
            class84.field1627.field4335 = 0;
            for (int var1 = 0; ~class59.field988.length < ~var1; ++var1) {
                if (class59.field988[var1] != null) {
                    class59.field988[var1].field2041 = -1;
                }
            }
            for (int var2 = 0; class178.field3112.length > var2; ++var2) {
                if (class178.field3112[var2] != null) {
                    class178.field3112[var2].field2041 = -1;
                }
            }
            class230.method1501(arg0 ^ 126);
            class167.field2995 = 1;
            class112.method755(30, (byte) -68);
            for (int var3 = 0; ~var3 > -101; ++var3) {
                class255.field4485[var3] = true;
            }
            class98.field1912.method864(105);
            class77.method551((byte) -118);
        }
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(B)V")
    public static final void method1102(byte arg0) {
        class98.field1911 = null;
        class96.field1866 = null;
        class8.field88 = null;
        class140.field2595 = 0;
        class80.field1573 = null;
        class209.field3627 = null;
        ++field2919;
        class9.field98 = null;
        class129.field2408 = null;
        class96.field1862 = null;
        class234.field4087 = null;
        class154.field2752 = null;
        class255.field4480 = null;
        class189.field3279.method864(arg0 ^ 5);
        class145.field2643 = null;
        class189.field3280 = null;
        class178.field3122 = null;
        class82.field1598 = null;
        class49.field883 = null;
        class224.field3812 = null;
        class263.field4621 = null;
        class20.field270 = null;
        class240.field4169 = null;
        if (arg0 != 108) {
            method1096(-15, (byte) 46);
        }
        class69.field1398 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            method1099(111);
        }
        if (arg1 == 0) {
            super.field1938 = arg0.method1677(arg2 + -6676) == 1;
        }
        ++field2915;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
    public class163() {
        super(3, false);
    }
}
