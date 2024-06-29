import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class144 extends class99 {

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
    private int field2620 = 1;

    @OriginalMember(owner = "client!og", name = "Y", descriptor = "I")
    private int field2628 = 1;

    @OriginalMember(owner = "client!og", name = "W", descriptor = "I")
    private int field2626 = 204;

    @OriginalMember(owner = "client!og", name = "cb", descriptor = "I")
    public static int field2632 = 0;

    @OriginalMember(owner = "client!og", name = "Z", descriptor = "Lr;")
    private static class66 field2629 = class93.method641(43, "Take");

    @OriginalMember(owner = "client!og", name = "ab", descriptor = "Lr;")
    public static class66 field2630 = class93.method641(43, "overlay2");

    @OriginalMember(owner = "client!og", name = "U", descriptor = "I")
    public static int field2624 = 0;

    @OriginalMember(owner = "client!og", name = "ib", descriptor = "Lr;")
    public static class66 field2638 = class93.method641(43, "Freie Welt");

    @OriginalMember(owner = "client!og", name = "V", descriptor = "Lr;")
    public static class66 field2625 = field2629;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!og", name = "X", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!og", name = "bb", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!og", name = "db", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!og", name = "fb", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!og", name = "gb", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!og", name = "hb", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "Lcj;")
    public static class28 field2622;

    @OriginalMember(owner = "client!og", name = "eb", descriptor = "Lcj;")
    public static class28 field2634;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(II)Lr;")
    public static final class66 method989(int arg0, int arg1) {
        ++field2621;
        if (arg1 != 0) {
            field2634 = null;
        }
        return class138.method947(10, false, (byte) 125, arg0);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field2626 = arg0.method1674(1355769544);
                }
            } else {
                this.field2620 = arg0.method1677(-6677);
            }
        } else {
            this.field2628 = arg0.method1677(-6677);
        }
        if (arg2 != -1) {
            method991(111, (byte[]) null);
        }
        ++field2623;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class144() {
        super(0, true);
    }

    @OriginalMember(owner = "client!og", name = "g", descriptor = "(I)V")
    public static void method990(int arg0) {
        if (arg0 != 0) {
            field2624 = 92;
        }
        field2622 = null;
        field2638 = null;
        field2629 = null;
        field2634 = null;
        field2625 = null;
        field2630 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I[B)V")
    public static final void method991(int arg0, byte[] arg1) {
        ++field2627;
        class249 var2 = new class249(arg1);
        var2.field4335 = arg1.length - 2;
        class249.field4397 = var2.method1674(1355769544);
        class36.field541 = new int[class249.field4397];
        class214.field3677 = new byte[class249.field4397][];
        class44.field777 = new byte[class249.field4397][];
        class231.field4029 = new int[class249.field4397];
        class199.field3443 = new int[class249.field4397];
        class49.field876 = new boolean[class249.field4397];
        class2.field25 = new int[class249.field4397];
        var2.field4335 = arg1.length + -7 - class249.field4397 * 8;
        class11.field125 = var2.method1674(arg0 ^ 1355767464);
        class54.field950 = var2.method1674(arg0 ^ 1355767464);
        int var3 = (var2.method1677(-6677) & 255) - -1;
        for (int var4 = 0; ~class249.field4397 < ~var4; ++var4) {
            class36.field541[var4] = var2.method1674(class109.method741(arg0, 1355767464));
        }
        for (int var5 = 0; class249.field4397 > var5; ++var5) {
            class231.field4029[var5] = var2.method1674(class109.method741(arg0, 1355767464));
        }
        for (int var6 = 0; ~class249.field4397 < ~var6; ++var6) {
            class2.field25[var6] = var2.method1674(arg0 + 1355755112);
        }
        for (int var7 = 0; class249.field4397 > var7; ++var7) {
            class199.field3443[var7] = var2.method1674(1355769544);
        }
        if (arg0 != 14432) {
            field2638 = null;
        }
        var2.field4335 = arg1.length + -7 - (var3 + -1) * 3 + -(class249.field4397 * 8);
        class136.field2517 = new int[var3];
        for (int var8 = 1; ~var8 > ~var3; ++var8) {
            class136.field2517[var8] = var2.method1648((byte) 118);
            if (class136.field2517[var8] == 0) {
                class136.field2517[var8] = 1;
            }
        }
        var2.field4335 = 0;
        for (int var9 = 0; ~var9 > ~class249.field4397; ++var9) {
            int var10 = class2.field25[var9];
            int var11 = class199.field3443[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            boolean var15 = false;
            class44.field777[var9] = var14;
            class214.field3677[var9] = var13;
            int var16 = var2.method1677(-6677);
            if ((1 & var16) == 0) {
                for (int var17 = 0; ~var12 < ~var17; ++var17) {
                    var14[var17] = var2.method1682(3390);
                }
                if (~(2 & var16) != -1) {
                    for (int var18 = 0; var12 > var18; ++var18) {
                        byte var19 = var13[var18] = var2.method1682(3390);
                        var15 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label101: while (true) {
                    if (var10 <= var20) {
                        if (~(2 & var16) == -1) {
                            break;
                        }
                        int var21 = 0;
                        while (true) {
                            if (~var10 >= ~var21) {
                                break label101;
                            }
                            for (int var22 = 0; var22 < var11; ++var22) {
                                byte var23 = var13[var21 - -(var10 * var22)] = var2.method1682(3390);
                                var15 |= ~var23 != 0;
                            }
                            ++var21;
                        }
                    }
                    for (int var24 = 0; ~var11 < ~var24; ++var24) {
                        var14[var10 * var24 + var20] = var2.method1682(3390);
                    }
                    ++var20;
                }
            }
            class49.field876[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        if (arg0 != -61) {
            return null;
        } else {
            int[] var3 = super.field1943.method749(false, arg1);
            if (super.field1943.field2147) {
                for (int var4 = 0; ~var4 > ~class199.field3432; ++var4) {
                    int var5 = class10.field120[var4];
                    int var6 = this.field2628 * var5 >> 12;
                    int var7 = var5 % (4096 / this.field2628) * this.field2628;
                    int var8 = class19.field261[arg1];
                    int var9 = this.field2620 * var8 >> 12;
                    int var10 = var8 % (4096 / this.field2620) * this.field2620;
                    if (var10 < this.field2626) {
                        for (var6 -= var9; var6 < 0; var6 += 4) {
                        }
                        while (~var6 < -4) {
                            var6 -= 4;
                        }
                        if (~var6 != -2) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (this.field2626 > var7) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (var7 < this.field2626) {
                        int var11;
                        for (var11 = var6 - var9; ~var11 > -1; var11 += 4) {
                        }
                        while (~var11 < -4) {
                            var11 -= 4;
                        }
                        if (~var11 < -1) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    var3[var4] = 4096;
                }
            }
            ++field2633;
            return var3;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIZII)V")
    public static final void method992(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        class145.field2659 = arg5;
        ++field2636;
        class101.field1973 = arg4;
        class30.field454 = arg0;
        if (!arg3) {
            method989(20, -89);
        }
        class99.field1950 = arg1;
        class259.field4560 = arg2;
        if (class145.field2659 >= 100) {
            int var6 = class259.field4560 * 128 + 64;
            int var7 = class101.field1973 * 128 + 64;
            int var8 = class45.method327(var6, class196.field3401, var7, false) + -class99.field1950;
            int var9 = -class192.field3330 + var7;
            int var10 = -class134.field2494 + var8;
            int var11 = var6 - class207.field3597;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class253.field4435 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 2047;
            class250.field4410 = (int) (Math.atan2((double) var11, (double) var9) * -325.949D) & 2047;
            if (class253.field4435 < 128) {
                class253.field4435 = 128;
            }
            if (~class253.field4435 < -384) {
                class253.field4435 = 383;
            }
        }
        class167.field2995 = 2;
    }
}
