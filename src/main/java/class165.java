import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class165 extends class398 {

    @OriginalMember(owner = "client!ks", name = "Q", descriptor = "I")
    private int field2222 = 2;

    @OriginalMember(owner = "client!ks", name = "V", descriptor = "I")
    private int field2227 = 5;

    @OriginalMember(owner = "client!ks", name = "K", descriptor = "[B")
    private byte[] field2217 = new byte[512];

    @OriginalMember(owner = "client!ks", name = "T", descriptor = "[S")
    private short[] field2225 = new short[512];

    @OriginalMember(owner = "client!ks", name = "X", descriptor = "I")
    private int field2229 = 0;

    @OriginalMember(owner = "client!ks", name = "Z", descriptor = "I")
    private int field2231 = 1;

    @OriginalMember(owner = "client!ks", name = "S", descriptor = "I")
    private int field2224 = 2048;

    @OriginalMember(owner = "client!ks", name = "ab", descriptor = "I")
    private int field2232 = 5;

    @OriginalMember(owner = "client!ks", name = "W", descriptor = "Ljava/lang/String;")
    public static String field2228 = " has logged in.";

    @OriginalMember(owner = "client!ks", name = "J", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!ks", name = "M", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!ks", name = "N", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!ks", name = "O", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!ks", name = "P", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!ks", name = "R", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!ks", name = "U", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!ks", name = "Y", descriptor = "Lo;")
    public static class392 field2230;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(II)V", line = 6)
    public static final void method1016(int arg0, int arg1) {
        if (arg0 >= 27) {
            ++field2218;
            class263 var2 = class47.method337(8, 0, arg1);
            var2.method1806(false);
        }
    }

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "(I)V", line = 21)
    private final void method1017(int arg0) {
        ++field2216;
        Random var2 = new Random((long) this.field2229);
        this.field2225 = new short[512];
        if (this.field2224 > 0) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field2225[var3] = (short) class139.method895(class399.method2571(arg0, 18903), var2, this.field2224);
            }
        }
        if (arg0 != -513) {
            this.method208((class228) null, 93, 81);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)[I", line = 49)
    public final int[] method95(int arg0, int arg1) {
        ++field2221;
        int[] var3 = super.field5927.method305(arg0, (byte) 114);
        if (arg1 != 0) {
            this.field2225 = null;
        }
        if (super.field5927.field591) {
            int var4 = 2048 - -(class84.field1206[arg0] * this.field2232);
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; class140.field1922 > var7; ++var7) {
                class343.field4961 = Integer.MAX_VALUE;
                class31.field439 = Integer.MAX_VALUE;
                class410.field6064 = Integer.MAX_VALUE;
                class386.field5594 = Integer.MAX_VALUE;
                int var8 = 2048 - -(class375.field5448[var7] * this.field2227);
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                    int var13 = this.field2217[(~this.field2232 < ~var11 ? var11 : -this.field2232 + var11) & 255] & 255;
                    for (int var14 = var9 - 1; var10 >= var14; ++var14) {
                        int var15 = 2 * (this.field2217[255 & var13 + (~var14 <= ~this.field2227 ? -this.field2227 + var14 : var14)] & 255);
                        int var27 = var15 + 1;
                        int var16 = var8 + (-this.field2225[var15] - (var14 << 12));
                        int var17 = -this.field2225[var27] + var4 + -(var11 << 12);
                        int var18 = this.field2231;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (~var18 == -3) {
                                            var19 = (~var16 <= -1 ? var16 : -var16) - -(var17 < 0 ? -var17 : var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)));
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)));
                                    int var24 = var22 - -var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 >= 0 ? var16 : -var16;
                                int var26 = ~var17 > -1 ? -var17 : var17;
                                var19 = var25 > var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (var19 >= class386.field5594) {
                            if (var19 >= class410.field6064) {
                                if (var19 < class31.field439) {
                                    class343.field4961 = class31.field439;
                                    class31.field439 = var19;
                                } else if (~class343.field4961 < ~var19) {
                                    class343.field4961 = var19;
                                }
                            } else {
                                class343.field4961 = class31.field439;
                                class31.field439 = class410.field6064;
                                class410.field6064 = var19;
                            }
                        } else {
                            class343.field4961 = class31.field439;
                            class31.field439 = class410.field6064;
                            class410.field6064 = class386.field5594;
                            class386.field5594 = var19;
                        }
                    }
                }
                int var12 = this.field2222;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (~var12 != -4) {
                            if (~var12 != -5) {
                                if (var12 == 2) {
                                    var3[var7] = -class386.field5594 + class410.field6064;
                                }
                            } else {
                                var3[var7] = class343.field4961;
                            }
                        } else {
                            var3[var7] = class31.field439;
                        }
                    } else {
                        var3[var7] = class410.field6064;
                    }
                } else {
                    var3[var7] = class386.field5594;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lnj;II)V", line = 260)
    public final void method208(class228 arg0, int arg1, int arg2) {
        ++field2220;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field2232 = arg0.method1348(-91);
                                }
                            } else {
                                this.field2227 = arg0.method1348(-100);
                            }
                        } else {
                            this.field2231 = arg0.method1348(arg2 ^ 13088);
                        }
                    } else {
                        this.field2222 = arg0.method1348(arg2 ^ 13073);
                    }
                } else {
                    this.field2224 = arg0.method1343(255);
                }
            } else {
                this.field2229 = arg0.method1348(arg2 + 13041);
            }
        } else {
            this.field2227 = this.field2232 = arg0.method1348(-118);
        }
        if (arg2 != -13132) {
            this.method95(117, -46);
        }
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(Z)V", line = 340)
    public static void method1018(boolean arg0) {
        if (!arg0) {
            field2228 = null;
            field2230 = null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)V", line = 351)
    public final void method209(int arg0) {
        if (arg0 != 16) {
            this.method209(-72);
        }
        ++field2223;
        this.field2217 = class335.method2206(true, this.field2229);
        this.method1017(arg0 + -529);
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "()V", line = 457)
    public class165() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "(I)V", line = 376)
    public static final void method1019(int arg0) {
        while (true) {
            if (~class156.field2120.method3(class300.field4398, true) <= -12) {
                int var1 = class156.field2120.method4(11, (byte) 25);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class206.field2777[var1] == null) {
                        class206.field2777[var1] = new class25();
                        class206.field2777[var1].field4301 = var1;
                        var2 = true;
                        if (class403.field5995[var1] != null) {
                            class206.field2777[var1].method167((byte) -91, class403.field5995[var1]);
                        }
                    }
                    class229.field3071[class65.field861++] = var1;
                    class25 var3 = class206.field2777[var1];
                    var3.field4342 = class28.field418;
                    int var4 = class156.field2120.method4(5, (byte) 25);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = class156.field2120.method4(1, (byte) 25);
                    if (var5 == 1) {
                        class151.field2055[class225.field2964++] = var1;
                    }
                    int var6 = class156.field2120.method4(5, (byte) 25);
                    if (~var6 < -16) {
                        var6 -= 32;
                    }
                    int var7 = class362.field5232[class156.field2120.method4(3, (byte) 25)];
                    int var8 = class156.field2120.method4(1, (byte) 25);
                    if (var2) {
                        var3.method2047(var7, (byte) -120);
                    }
                    var3.method165(class227.field2988.field4362[0] + var4, class227.field2981, ~var8 == -2, class227.field2988.field4360[0] + var6, false);
                    continue;
                }
            }
            ++field2219;
            class156.field2120.method7(arg0 ^ 99);
            if (arg0 != 4) {
                field2226 = 42;
                return;
            }
            return;
        }
    }
}
