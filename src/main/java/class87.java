import java.awt.Color;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class87 extends class194 {

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
    private int field1001 = 16;

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "I")
    private int field1002 = 2000;

    @OriginalMember(owner = "client!jl", name = "T", descriptor = "I")
    private int field1012 = 4096;

    @OriginalMember(owner = "client!jl", name = "U", descriptor = "I")
    private int field1013 = 0;

    @OriginalMember(owner = "client!jl", name = "O", descriptor = "I")
    private int field1007 = 0;

    @OriginalMember(owner = "client!jl", name = "N", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1006 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!jl", name = "Q", descriptor = "Lcq;")
    public static class72 field1009 = new class72("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!jl", name = "V", descriptor = "Lcq;")
    public static class72 field1014 = new class72("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!jl", name = "K", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!jl", name = "L", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!jl", name = "M", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!jl", name = "P", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!jl", name = "R", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!jl", name = "S", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "(I)V", line = 6)
    public final void method280(int arg0) {
        ++field1008;
        int var2 = -109 % ((28 - arg0) / 63);
        class141.method911(-7448);
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V", line = 16)
    public class87() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)[I", line = 20)
    public final int[] method55(int arg0, int arg1) {
        int var3 = -49 / ((57 - arg1) / 46);
        ++field1004;
        int[] var4 = super.field2292.method1781(arg0, false);
        if (super.field2292.field3708) {
            int var5 = this.field1012 >> 1;
            int[][] var6 = super.field2292.method1780((byte) 105);
            Random var7 = new Random((long) this.field1013);
            for (int var8 = 0; this.field1002 > var8; ++var8) {
                int var9 = ~this.field1012 >= -1 ? this.field1007 : this.field1007 - (-class174.method1096(-20548, var7, this.field1012) + var5);
                int var10 = (var9 & 4092) >> 4;
                int var11 = class174.method1096(-20548, var7, class138.field1579);
                int var12 = class174.method1096(-20548, var7, class250.field3286);
                int var13 = (class296.field3949[var10] * this.field1001 >> 12) + var11;
                int var14 = (class298.field3977[var10] * this.field1001 >> 12) + var12;
                int var15 = -var12 + var14;
                int var16 = -var11 + var13;
                if (var16 != 0 || ~var15 != -1) {
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var17 = var16 < var15;
                    if (var17) {
                        int var18 = var11;
                        var11 = var12;
                        int var19 = var13;
                        var13 = var14;
                        var12 = var18;
                        var14 = var19;
                    }
                    if (var13 < var11) {
                        int var20 = var11;
                        int var21 = var12;
                        var11 = var13;
                        var12 = var14;
                        var13 = var20;
                        var14 = var21;
                    }
                    int var22 = var12;
                    int var23 = var13 - var11;
                    int var24 = var14 - var12;
                    int var25 = -var23 / 2;
                    int var26 = 2048 / var23;
                    int var27 = -(class174.method1096(-20548, var7, 4096) >> 2) + 1024;
                    if (var24 < 0) {
                        var24 = -var24;
                    }
                    int var28 = var14 <= var12 ? -1 : 1;
                    for (int var29 = var11; var29 < var13; ++var29) {
                        int var30 = (-var11 + var29) * var26 + 1024 + var27;
                        int var31 = var29 & class442.field6113;
                        int var32 = var22 & class210.field2551;
                        if (!var17) {
                            var6[var31][var32] = var30;
                        } else {
                            var6[var32][var31] = var30;
                        }
                        var25 += var24;
                        if (~var25 < -1) {
                            var22 += var28;
                            var25 -= var23;
                        }
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)V", line = 165)
    public static void method538(byte arg0) {
        field1014 = null;
        field1006 = null;
        field1009 = null;
        if (arg0 != -124) {
            method538((byte) -42);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILki;)V", line = 177)
    public static final void method539(int arg0, class204 arg1) {
        ++field1005;
        arg1.field2449 = false;
        if (~arg1.field2394 != 0) {
            class156 var2 = class430.method2621((byte) -115, arg1.field2394);
            if (var2 != null && var2.field1821 != null) {
                label306: {
                    ++arg1.field2455;
                    if (~var2.field1821.length < ~arg1.field2420 && ~arg1.field2455 < ~var2.field1817[arg1.field2420]) {
                        ++arg1.field2420;
                        ++arg1.field2457;
                        arg1.field2455 = 1;
                        class325.method2038(arg1.field1516, arg1.field1514, class143.field1684 == arg1, var2, arg1.field2420, (byte) -100);
                    }
                    if (arg1.field2420 >= var2.field1821.length) {
                        arg1.field2455 = 0;
                        arg1.field2420 = 0;
                        if (arg1.field2423) {
                            arg1.field2394 = arg1.method1250(77).method2673(arg0 ^ 4317);
                            if (~arg1.field2394 == 0) {
                                arg1.field2423 = false;
                                break label306;
                            }
                            var2 = class430.method2621((byte) -32, arg1.field2394);
                        }
                        class325.method2038(arg1.field1516, arg1.field1514, class143.field1684 == arg1, var2, arg1.field2420, (byte) -100);
                    }
                    arg1.field2457 = arg1.field2420 + 1;
                    if (var2.field1821.length <= arg1.field2457) {
                        arg1.field2457 = 0;
                    }
                }
            } else {
                arg1.field2394 = -1;
                arg1.field2423 = false;
            }
        }
        if (~arg1.field2467 != 0 && ~class106.field1273 <= ~arg1.field2417) {
            class167 var3 = class179.method1124((byte) -42, arg1.field2467);
            int var4 = var3.field1935;
            if (~var4 == 0) {
                arg1.field2467 = -1;
            } else {
                label308: {
                    class156 var5 = class430.method2621((byte) -115, var4);
                    if (var3.field1937) {
                        if (~var5.field1814 == -4) {
                            if (~arg1.field2491 < -1 && class106.field1273 >= arg1.field2454 && arg1.field2446 < class106.field1273) {
                                arg1.field2467 = -1;
                                break label308;
                            }
                        } else if (var5.field1814 == 1 && ~arg1.field2491 < -1 && arg1.field2454 <= class106.field1273 && class106.field1273 > arg1.field2446) {
                            arg1.field2417 = class106.field1273 + 1;
                            break label308;
                        }
                    }
                    if (var5 != null && var5.field1821 != null) {
                        if (arg1.field2464 < 0) {
                            arg1.field2464 = 0;
                            class325.method2038(arg1.field1516, arg1.field1514, class143.field1684 == arg1, var5, 0, (byte) -100);
                        }
                        ++arg1.field2430;
                        if (~var5.field1821.length < ~arg1.field2464 && var5.field1817[arg1.field2464] < arg1.field2430) {
                            arg1.field2430 = 1;
                            ++arg1.field2464;
                            class325.method2038(arg1.field1516, arg1.field1514, class143.field1684 == arg1, var5, arg1.field2464, (byte) -100);
                        }
                        if (arg1.field2464 >= var5.field1821.length) {
                            if (var3.field1937) {
                                ++arg1.field2403;
                                arg1.field2464 -= var5.field1801;
                                if (arg1.field2403 < var5.field1805) {
                                    if (arg1.field2464 >= 0 && var5.field1821.length > arg1.field2464) {
                                        class325.method2038(arg1.field1516, arg1.field1514, class143.field1684 == arg1, var5, arg1.field2464, (byte) -100);
                                    } else {
                                        arg1.field2467 = -1;
                                    }
                                } else {
                                    arg1.field2467 = -1;
                                }
                            } else {
                                arg1.field2467 = -1;
                            }
                        }
                        arg1.field2404 = arg1.field2464 + 1;
                        if (arg1.field2404 >= var5.field1821.length) {
                            if (!var3.field1937) {
                                arg1.field2404 = -1;
                            } else {
                                arg1.field2404 -= var5.field1801;
                                if (arg1.field2403 + 1 < var5.field1805) {
                                    if (~arg1.field2404 > -1 || ~var5.field1821.length >= ~arg1.field2404) {
                                        arg1.field2404 = -1;
                                    }
                                } else {
                                    arg1.field2404 = -1;
                                }
                            }
                        }
                    } else {
                        arg1.field2467 = -1;
                    }
                }
            }
        }
        if (~arg1.field2400 != 0 && arg1.field2432 <= 1) {
            class156 var6 = class430.method2621((byte) -59, arg1.field2400);
            if (~var6.field1814 != -4) {
                if (var6.field1814 == 1 && arg1.field2491 > 0 && ~arg1.field2454 >= ~class106.field1273 && ~arg1.field2446 > ~class106.field1273) {
                    arg1.field2432 = 2;
                }
            } else if (arg1.field2491 > 0 && class106.field1273 >= arg1.field2454 && ~arg1.field2446 > ~class106.field1273) {
                arg1.field2400 = -1;
            }
        }
        if (arg1.field2400 != -1 && arg1.field2432 == 0) {
            class156 var7 = class430.method2621((byte) -26, arg1.field2400);
            if (var7 != null && var7.field1821 != null) {
                ++arg1.field2411;
                if (~var7.field1821.length < ~arg1.field2441 && ~var7.field1817[arg1.field2441] > ~arg1.field2411) {
                    ++arg1.field2441;
                    arg1.field2411 = 1;
                    class325.method2038(arg1.field1516, arg1.field1514, class143.field1684 == arg1, var7, arg1.field2441, (byte) -100);
                }
                if (arg1.field2441 >= var7.field1821.length) {
                    arg1.field2441 -= var7.field1801;
                    ++arg1.field2398;
                    if (var7.field1805 > arg1.field2398) {
                        if (~arg1.field2441 <= -1 && ~arg1.field2441 > ~var7.field1821.length) {
                            class325.method2038(arg1.field1516, arg1.field1514, class143.field1684 == arg1, var7, arg1.field2441, (byte) -100);
                        } else {
                            arg1.field2400 = -1;
                        }
                    } else {
                        arg1.field2400 = -1;
                    }
                }
                arg1.field2429 = arg1.field2441 + 1;
                if (~arg1.field2429 <= ~var7.field1821.length) {
                    arg1.field2429 -= var7.field1801;
                    if (~var7.field1805 < ~(arg1.field2398 - -1)) {
                        if (arg1.field2429 < 0 || ~arg1.field2429 <= ~var7.field1821.length) {
                            arg1.field2429 = -1;
                        }
                    } else {
                        arg1.field2429 = -1;
                    }
                }
                arg1.field2449 = var7.field1819;
            } else {
                arg1.field2400 = -1;
            }
        }
        if (arg0 != -4279) {
            method538((byte) -116);
        }
        if (arg1.field2432 > 0) {
            --arg1.field2432;
        }
        for (int var8 = 0; var8 < arg1.field2435.length; ++var8) {
            class265 var9 = arg1.field2435[var8];
            if (var9 != null) {
                if (~var9.field3415 < -1) {
                    --var9.field3415;
                } else {
                    class156 var10 = class430.method2621((byte) -116, var9.field3407);
                    if (var10 != null && var10.field1821 != null) {
                        ++var9.field3412;
                        if (var10.field1821.length > var9.field3411 && ~var10.field1817[var9.field3411] > ~var9.field3412) {
                            var9.field3412 = 1;
                            ++var9.field3411;
                            class325.method2038(arg1.field1516, arg1.field1514, class143.field1684 == arg1, var10, var9.field3411, (byte) -100);
                        }
                        if (~var10.field1821.length >= ~var9.field3411) {
                            ++var9.field3413;
                            var9.field3411 -= var10.field1801;
                            if (~var10.field1805 >= ~var9.field3413) {
                                arg1.field2435[var8] = null;
                            } else if (~var9.field3411 <= -1 && ~var9.field3411 > ~var10.field1821.length) {
                                class325.method2038(arg1.field1516, arg1.field1514, class143.field1684 == arg1, var10, var9.field3411, (byte) -100);
                            } else {
                                arg1.field2435[var8] = null;
                            }
                        }
                        var9.field3409 = var9.field3411 + 1;
                        if (~var10.field1821.length >= ~var9.field3409) {
                            var9.field3409 -= var10.field1801;
                            if (var10.field1805 <= var9.field3413 + 1) {
                                var9.field3409 = -1;
                            } else if (var9.field3409 < 0 || ~var9.field3409 <= ~var10.field1821.length) {
                                var9.field3409 = -1;
                            }
                        }
                    } else {
                        arg1.field2435[var8] = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILaq;)Ljava/lang/String;", line = 492)
    public static final String method540(int arg0, class453 arg1) {
        ++field1011;
        if (~client.method2696(arg1).method2257((byte) 97) == -1) {
            return null;
        } else {
            if (arg0 <= 40) {
                field1006 = null;
            }
            if (arg1.field6451 != null && arg1.field6451.trim().length() != 0) {
                return arg1.field6451;
            } else {
                return class186.field2151 ? "Hidden-use" : null;
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IILbg;)V", line = 526)
    public final void method54(int arg0, int arg1, class242 arg2) {
        int var4 = 11 % ((52 - arg1) / 61);
        ++field1010;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 == -5) {
                            this.field1012 = arg2.method1587((byte) -102);
                        }
                    } else {
                        this.field1007 = arg2.method1587((byte) -102);
                    }
                } else {
                    this.field1001 = arg2.method1563(-128);
                }
            } else {
                this.field1002 = arg2.method1587((byte) -102);
            }
        } else {
            this.field1013 = arg2.method1563(-128);
        }
    }
}
