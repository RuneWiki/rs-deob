import java.io.UnsupportedEncodingException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class268 extends class252 {

    @OriginalMember(owner = "client!ch", name = "bb", descriptor = "I")
    private int field4771 = 4096;

    @OriginalMember(owner = "client!ch", name = "cb", descriptor = "I")
    private int field4772 = 0;

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "[J")
    public static long[] field4767 = new long[500];

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "I")
    public static int field4765 = 1;

    @OriginalMember(owner = "client!ch", name = "gb", descriptor = "I")
    public static int field4776 = 0;

    @OriginalMember(owner = "client!ch", name = "ab", descriptor = "Ljd;")
    public static class85 field4770 = class221.method1499("Cabbage", (byte) 103);

    @OriginalMember(owner = "client!ch", name = "hb", descriptor = "Ljava/util/Random;")
    public static Random field4777 = new Random();

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!ch", name = "Z", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!ch", name = "db", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!ch", name = "eb", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!ch", name = "fb", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "J")
    public static long field4766;

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "[Lfg;")
    public static class12[] field4768;

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "[S")
    public static short[] field4764;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        ++field4773;
        if (arg1 != -123) {
            method1845(true, (byte) -86);
        }
        int[][] var3 = super.field4350.method155(arg0, false);
        if (super.field4350.field338) {
            int[][] var4 = this.method1737(0, 3, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            int[] var9 = var4[1];
            int[] var10 = var3[0];
            for (int var11 = 0; class5.field63 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var9[var11];
                if (this.field4772 <= var12) {
                    if (~var12 < ~this.field4771) {
                        var10[var11] = this.field4771;
                    } else {
                        var10[var11] = var12;
                    }
                } else {
                    var10[var11] = this.field4772;
                }
                if (~this.field4772 < ~var14) {
                    var8[var11] = this.field4772;
                } else if (this.field4771 >= var14) {
                    var8[var11] = var14;
                } else {
                    var8[var11] = this.field4771;
                }
                if (var13 >= this.field4772) {
                    if (~var13 < ~this.field4771) {
                        var7[var11] = this.field4771;
                    } else {
                        var7[var11] = var13;
                    }
                } else {
                    var7[var11] = this.field4772;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        if (arg1 != -55) {
            return null;
        } else {
            ++field4775;
            int[] var3 = super.field4356.method868(arg0, (byte) 125);
            if (super.field4356.field2258) {
                int[] var4 = this.method1742((byte) 8, 0, arg0);
                for (int var5 = 0; var5 < class5.field63; ++var5) {
                    int var6 = var4[var5];
                    if (~this.field4772 >= ~var6) {
                        if (~var6 >= ~this.field4771) {
                            var3[var5] = var6;
                        } else {
                            var3[var5] = this.field4771;
                        }
                    } else {
                        var3[var5] = this.field4772;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    public class268() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljd;ILjb;)Ljd;")
    public static final class85 method1844(class85 arg0, int arg1, class255 arg2) {
        ++field4769;
        int var3 = -69 / ((arg1 - -13) / 36);
        if (arg0.method607(class267.field4747, false) != -1) {
            while (true) {
                int var4 = arg0.method607(class154.field2665, false);
                if (~var4 == 0) {
                    while (true) {
                        int var5 = arg0.method607(class7.field85, false);
                        if (var5 == -1) {
                            while (true) {
                                int var6 = arg0.method607(class77.field1428, false);
                                if (var6 == -1) {
                                    while (true) {
                                        int var7 = arg0.method607(class172.field2979, false);
                                        if (var7 == -1) {
                                            while (true) {
                                                int var8 = arg0.method607(class131.field2294, false);
                                                if (~var8 == 0) {
                                                    while (true) {
                                                        int var9 = arg0.method607(class163.field2808, false);
                                                        if (~var9 == 0) {
                                                            return arg0;
                                                        }
                                                        class85 var10 = class100.field1795;
                                                        if (class181.field3099 != null) {
                                                            var10 = class150.method977((byte) 111, class181.field3099.field1295);
                                                            try {
                                                                if (class181.field3099.field1292 != null) {
                                                                    byte[] var11 = ((String) class181.field3099.field1292).getBytes("ISO-8859-1");
                                                                    var10 = class116.method817(var11.length, var11, (byte) -39, 0);
                                                                }
                                                            } catch (UnsupportedEncodingException var12) {
                                                            }
                                                        }
                                                        arg0 = class172.method1150(new class85[] { arg0.method636(var9, 0, true), var10, arg0.method611((byte) -97, var9 - -4) }, 0);
                                                    }
                                                }
                                                arg0 = class172.method1150(new class85[] { arg0.method636(var8, 0, true), class263.method1806(class86.method643((byte) 86, 4, arg2), 124), arg0.method611((byte) -97, var8 + 2) }, 0);
                                            }
                                        }
                                        arg0 = class172.method1150(new class85[] { arg0.method636(var7, 0, true), class263.method1806(class86.method643((byte) 119, 3, arg2), 125), arg0.method611((byte) -97, var7 - -2) }, 0);
                                    }
                                }
                                arg0 = class172.method1150(new class85[] { arg0.method636(var6, 0, true), class263.method1806(class86.method643((byte) 96, 2, arg2), 123), arg0.method611((byte) -97, var6 + 2) }, 0);
                            }
                        }
                        arg0 = class172.method1150(new class85[] { arg0.method636(var5, 0, true), class263.method1806(class86.method643((byte) 125, 1, arg2), 123), arg0.method611((byte) -97, var5 + 2) }, 0);
                    }
                }
                arg0 = class172.method1150(new class85[] { arg0.method636(var4, 0, true), class263.method1806(class86.method643((byte) 122, 0, arg2), 126), arg0.method611((byte) -97, var4 + 2) }, 0);
            }
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZB)V")
    public static final void method1845(boolean arg0, byte arg1) {
        ++field4763;
        class24.field351 = arg0;
        class245.field4185 = !class121.method833((byte) -85);
        if (arg1 > -21) {
            field4766 = 116L;
        }
    }

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "(I)V")
    public static void method1846(int arg0) {
        field4777 = null;
        field4767 = null;
        field4768 = null;
        field4764 = null;
        field4770 = null;
        if (arg0 != 23263) {
            method1846(-128);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field4338 = ~arg0.method1711((byte) -67) == -2;
                }
            } else {
                this.field4771 = arg0.method1694((byte) -100);
            }
        } else {
            this.field4772 = arg0.method1694((byte) -100);
        }
        if (arg2 == -99) {
            ++field4774;
        }
    }
}
