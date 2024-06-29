import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class317 extends class45 {

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "I")
    private int field4768 = 0;

    @OriginalMember(owner = "client!sj", name = "N", descriptor = "I")
    private int field4771 = 4096;

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "Liv;")
    public static class64 field4767 = new class64(26, 16);

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!sj", name = "L", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!sj", name = "M", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lcu;II)V")
    public final void method37(class145 arg0, int arg1, int arg2) {
        ++field4770;
        if (arg1 != -26471) {
            method2062((byte) -93);
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field4771 = arg0.method1069((byte) -82);
            }
        } else {
            this.field4768 = arg0.method1069((byte) -79);
        }
    }

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "(B)V")
    public static final void method2062(byte arg0) {
        ++field4765;
        if (arg0 != 66) {
            field4767 = null;
        }
        int var1 = class409.field6135;
        int[] var2 = class358.field5445;
        for (int var3 = 0; ~var3 > ~var1; ++var3) {
            class256 var7 = class183.field2747[var2[var3]];
            if (var7 != null && var7.field7606 > 0) {
                --var7.field7606;
                if (~var7.field7606 == -1) {
                    var7.field7657 = null;
                }
            }
        }
        for (int var4 = 0; ~var4 > ~class510.field7529; ++var4) {
            int var5 = class148.field2363[var4];
            class255 var6 = class34.field668[var5];
            if (var6 != null && var6.field7606 > 0) {
                --var6.field7606;
                if (var6.field7606 == 0) {
                    var6.field7657 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([ILln;I[I[I)V")
    public static final void method2063(int[] arg0, class256 arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = 0;
        if (arg2 <= -67) {
            while (var5 < arg0.length) {
                int var6 = arg0[var5];
                int var7 = arg4[var5];
                int var8 = arg3[var5];
                int var9 = 0;
                while (~var7 != -1 && arg1.field7592.length > var9) {
                    if (~(var7 & 1) != -1) {
                        if (var6 == -1) {
                            arg1.field7592[var9] = null;
                        } else {
                            class165 var10 = class431.field6419.method1137(-112, var6);
                            int var11 = var10.field2553;
                            class53 var12 = arg1.field7592[var9];
                            if (var12 != null) {
                                if (~var12.field926 == ~var6) {
                                    if (~var11 == -1) {
                                        var12 = arg1.field7592[var9] = null;
                                    } else if (var11 != 1) {
                                        if (var11 == 2) {
                                            var12.field921 = 0;
                                        }
                                    } else {
                                        var12.field922 = var8;
                                        var12.field921 = 0;
                                        var12.field923 = 0;
                                        var12.field927 = 0;
                                        var12.field925 = 1;
                                        class441.method2642((byte) 49, 0, var10, arg1.field6233, class139.field2224 == arg1, arg1.field6228, arg1.field6232);
                                    }
                                } else if (~var10.field2558 <= ~class431.field6419.method1137(114, var12.field926).field2558) {
                                    var12 = arg1.field7592[var9] = null;
                                }
                            }
                            if (var12 == null) {
                                class53 var13 = arg1.field7592[var9] = new class53();
                                var13.field927 = 0;
                                var13.field921 = 0;
                                var13.field925 = 1;
                                var13.field926 = var6;
                                var13.field923 = 0;
                                var13.field922 = var8;
                                class441.method2642((byte) 12, 0, var10, arg1.field6233, class139.field2224 == arg1, arg1.field6228, arg1.field6232);
                            }
                        }
                    }
                    ++var9;
                    var7 >>>= 1;
                }
                ++var5;
            }
            ++field4766;
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
    public class317() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "(B)V")
    public static void method2064(byte arg0) {
        if (arg0 <= 77) {
            field4767 = null;
        }
        field4767 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field4769;
        int[] var3 = super.field854.method863((byte) 12, arg1);
        if (arg0 != 0) {
            field4767 = null;
        }
        if (super.field854.field1928) {
            int[] var4 = this.method434(0, arg1, 118);
            for (int var5 = 0; ~var5 > ~class259.field3768; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field4768 && var6 <= this.field4771 ? 4096 : 0;
            }
        }
        return var3;
    }
}
