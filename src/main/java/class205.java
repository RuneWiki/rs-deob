import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class205 extends class260 {

    @OriginalMember(owner = "client!sh", name = "O", descriptor = "I")
    private int field3720 = 2048;

    @OriginalMember(owner = "client!sh", name = "V", descriptor = "[S")
    private short[] field3725 = new short[512];

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "I")
    private int field3718 = 1;

    @OriginalMember(owner = "client!sh", name = "bb", descriptor = "I")
    private int field3731 = 2;

    @OriginalMember(owner = "client!sh", name = "P", descriptor = "I")
    private int field3721 = 5;

    @OriginalMember(owner = "client!sh", name = "ab", descriptor = "I")
    private int field3730 = 0;

    @OriginalMember(owner = "client!sh", name = "Y", descriptor = "[B")
    private byte[] field3728 = new byte[512];

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "I")
    private int field3717 = 5;

    @OriginalMember(owner = "client!sh", name = "X", descriptor = "Loh;")
    public static class263 field3727 = class253.method1681(-125, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!sh", name = "fb", descriptor = "Loh;")
    private static class263 field3735 = class253.method1681(-122, "Hidden");

    @OriginalMember(owner = "client!sh", name = "cb", descriptor = "[Z")
    public static boolean[] field3732 = new boolean[8];

    @OriginalMember(owner = "client!sh", name = "W", descriptor = "Loh;")
    public static class263 field3726 = field3735;

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!sh", name = "R", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!sh", name = "S", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!sh", name = "U", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!sh", name = "eb", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!sh", name = "gb", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!sh", name = "hb", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!sh", name = "Z", descriptor = "Lue;")
    public static class86 field3729;

    @OriginalMember(owner = "client!sh", name = "db", descriptor = "[I")
    public static int[] field3733;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "(I)V")
    public static final void method1417(int arg0) {
        if (arg0 == 0) {
            client.field2750.method830(50);
            class38.field865.method830(50);
            ++field3719;
            class92.field1818.method830(50);
        }
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(B)V")
    private final void method1418(byte arg0) {
        if (arg0 <= -34) {
            Random var2 = new Random((long) this.field3730);
            ++field3737;
            this.field3725 = new short[512];
            if (this.field3720 > 0) {
                for (int var3 = 0; ~var3 > -513; ++var3) {
                    this.field3725[var3] = (short) class256.method1699(var2, 122, this.field3720);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lmj;IIIIIIZ)V")
    public static final void method1419(class110 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field2080.length;
        for (int var9 = 0; var9 < var8; ++var9) {
            int var22 = arg0.field2080[var9] - class43.field940;
            int var23 = arg0.field2065[var9] - class220.field3907;
            int var24 = arg0.field2077[var9] - class1.field5;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field2064 != null) {
                class110.field2075[var9] = var25;
                class110.field2060[var9] = var28;
                class110.field2074[var9] = var29;
            }
            class110.field2078[var9] = (var25 << 9) / var29 + class270.field4756;
            class110.field2062[var9] = (var28 << 9) / var29 + class270.field4757;
        }
        class270.field4766 = 0;
        int var10 = arg0.field2079.length;
        for (int var11 = 0; var11 < var10; ++var11) {
            int var12 = arg0.field2079[var11];
            int var13 = arg0.field2071[var11];
            int var14 = arg0.field2076[var11];
            int var15 = class110.field2078[var12];
            int var16 = class110.field2078[var13];
            int var17 = class110.field2078[var14];
            int var18 = class110.field2062[var12];
            int var19 = class110.field2062[var13];
            int var20 = class110.field2062[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class207.field3745 && class202.method1402(class270.field4756 + class184.field3332, class5.field105 + class270.field4757, var18, var19, var20, var15, var16, var17)) {
                    class142.field2608 = arg5;
                    class90.field1775 = arg6;
                }
                if (!arg7) {
                    class270.field4772 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class270.field4771 || var16 > class270.field4771 || var17 > class270.field4771) {
                        class270.field4772 = true;
                    }
                    if (arg0.field2064 != null && arg0.field2064[var11] != -1) {
                        if (class107.field2028) {
                            if (arg0.field2068) {
                                class270.method1835(var18, var19, var20, var15, var16, var17, arg0.field2061[var11], arg0.field2081[var11], arg0.field2072[var11], class110.field2075[0], class110.field2075[1], class110.field2075[3], class110.field2060[0], class110.field2060[1], class110.field2060[3], class110.field2074[0], class110.field2074[1], class110.field2074[3], arg0.field2064[var11]);
                            } else {
                                class270.method1835(var18, var19, var20, var15, var16, var17, arg0.field2061[var11], arg0.field2081[var11], arg0.field2072[var11], class110.field2075[var12], class110.field2075[var13], class110.field2075[var14], class110.field2060[var12], class110.field2060[var13], class110.field2060[var14], class110.field2074[var12], class110.field2074[var13], class110.field2074[var14], arg0.field2064[var11]);
                            }
                        } else {
                            int var21 = class270.field4764.method60(65535, arg0.field2064[var11]);
                            class270.method1836(var18, var19, var20, var15, var16, var17, class217.method1483(var21, arg0.field2061[var11]), class217.method1483(var21, arg0.field2081[var11]), class217.method1483(var21, arg0.field2072[var11]));
                        }
                    } else if (arg0.field2061[var11] != 12345678) {
                        class270.method1836(var18, var19, var20, var15, var16, var17, arg0.field2061[var11], arg0.field2081[var11], arg0.field2072[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        ++field3723;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field3717 = arg2.method1301(-8317);
                                }
                            } else {
                                this.field3721 = arg2.method1301(-8317);
                            }
                        } else {
                            this.field3718 = arg2.method1301(arg1 + -14018);
                        }
                    } else {
                        this.field3731 = arg2.method1301(arg1 ^ -13882);
                    }
                } else {
                    this.field3720 = arg2.method1294((byte) 3);
                }
            } else {
                this.field3730 = arg2.method1301(-8317);
            }
        } else {
            this.field3721 = this.field3717 = arg2.method1301(-8317);
        }
        if (arg1 != 5701) {
            this.method1418((byte) -121);
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        ++field3724;
        int[] var3 = super.field4511.method304(arg0, false);
        if (arg1 != 255) {
            return null;
        } else {
            if (super.field4511.field1029) {
                int var4 = class275.field4825[arg0] * this.field3717 + 2048;
                int var5 = var4 >> 12;
                int var6 = var5 - -1;
                for (int var7 = 0; var7 < class49.field1052; ++var7) {
                    class191.field3429 = Integer.MAX_VALUE;
                    class146.field2672 = Integer.MAX_VALUE;
                    class50.field1075 = Integer.MAX_VALUE;
                    class66.field1350 = Integer.MAX_VALUE;
                    int var8 = class70.field1409[var7] * this.field3721 + 2048;
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                        int var13 = 255 & this.field3728[(var11 >= this.field3717 ? var11 - this.field3717 : var11) & 255];
                        for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                            int var15 = 2 * (this.field3728[(var14 < this.field3721 ? var14 : -this.field3721 + var14) + var13 & 255] & 255);
                            int var10000 = -(var14 << 12);
                            int var27 = var15 + 1;
                            int var16 = var10000 - this.field3725[var15] + var8;
                            int var17 = -this.field3725[var27] - ((var11 << 12) - var4);
                            int var18 = this.field3718;
                            int var19;
                            if (var18 != 1) {
                                if (~var18 != -4) {
                                    if (~var18 != -5) {
                                        if (~var18 != -6) {
                                            if (~var18 == -3) {
                                                var19 = (~var16 <= -1 ? var16 : -var16) + (~var17 <= -1 ? var17 : -var17);
                                            } else {
                                                var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                            }
                                        } else {
                                            int var20 = var17 * var17;
                                            int var21 = var16 * var16;
                                            var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                        }
                                    } else {
                                        int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                        int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)));
                                        int var24 = var22 + var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = ~var16 <= -1 ? var16 : -var16;
                                    int var26 = ~var17 > -1 ? -var17 : var17;
                                    var19 = var25 <= var26 ? var26 : var25;
                                }
                            } else {
                                var19 = var16 * var16 + var17 * var17 >> 12;
                            }
                            if (~class66.field1350 < ~var19) {
                                class191.field3429 = class146.field2672;
                                class146.field2672 = class50.field1075;
                                class50.field1075 = class66.field1350;
                                class66.field1350 = var19;
                            } else if (class50.field1075 <= var19) {
                                if (~var19 > ~class146.field2672) {
                                    class191.field3429 = class146.field2672;
                                    class146.field2672 = var19;
                                } else if (var19 < class191.field3429) {
                                    class191.field3429 = var19;
                                }
                            } else {
                                class191.field3429 = class146.field2672;
                                class146.field2672 = class50.field1075;
                                class50.field1075 = var19;
                            }
                        }
                    }
                    int var12 = this.field3731;
                    if (var12 != 0) {
                        if (var12 != 1) {
                            if (var12 != 3) {
                                if (var12 != 4) {
                                    if (var12 == 2) {
                                        var3[var7] = -class66.field1350 + class50.field1075;
                                    }
                                } else {
                                    var3[var7] = class191.field3429;
                                }
                            } else {
                                var3[var7] = class146.field2672;
                            }
                        } else {
                            var3[var7] = class50.field1075;
                        }
                    } else {
                        var3[var7] = class66.field1350;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lsi;ILtj;I)V")
    public static final void method1420(class194 arg0, int arg1, class262 arg2, int arg3) {
        ++field3736;
        class111 var4 = new class111();
        var4.field2086 = arg0.method1301(-8317);
        var4.field2082 = arg0.method1266(4);
        var4.field2091 = new int[var4.field2086];
        var4.field2092 = new class235[var4.field2086];
        var4.field2087 = new byte[var4.field2086][][];
        var4.field2085 = new class235[var4.field2086];
        var4.field2089 = new int[var4.field2086];
        var4.field2083 = new int[var4.field2086];
        for (int var5 = 0; var5 < var4.field2086; ++var5) {
            try {
                int var6 = arg0.method1301(-8317);
                if (~var6 != -1 && ~var6 != -2 && var6 != 2) {
                    if (var6 == 3 || ~var6 == -5) {
                        String var7 = new String(arg0.method1320(false).method1753(-1));
                        String var8 = new String(arg0.method1320(false).method1753(-1));
                        int var9 = arg0.method1301(arg1 ^ 17969);
                        String[] var10 = new String[var9];
                        for (int var11 = 0; var9 > var11; ++var11) {
                            var10[var11] = new String(arg0.method1320(false).method1753(-1));
                        }
                        byte[][] var12 = new byte[var9][];
                        if (var6 == 3) {
                            for (int var13 = 0; var13 < var9; ++var13) {
                                int var14 = arg0.method1266(4);
                                var12[var13] = new byte[var14];
                                arg0.method1315(var14, 0, true, var12[var13]);
                            }
                        }
                        Class[] var15 = new Class[var9];
                        var4.field2083[var5] = var6;
                        for (int var16 = 0; var16 < var9; ++var16) {
                            var15[var16] = class214.method1453(var10[var16], -123);
                        }
                        var4.field2092[var5] = arg2.method1727(var15, var8, class214.method1453(var7, 54), 0);
                        var4.field2087[var5] = var12;
                    }
                } else {
                    String var17 = new String(arg0.method1320(false).method1753(-1));
                    String var18 = new String(arg0.method1320(false).method1753(-1));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg0.method1266(arg1 ^ -26186);
                    }
                    var4.field2083[var5] = var6;
                    var4.field2091[var5] = var19;
                    var4.field2085[var5] = arg2.method1735(var18, 24, class214.method1453(var17, -5));
                }
            } catch (ClassNotFoundException var20) {
                var4.field2089[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2089[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2089[var5] = -3;
            } catch (Exception var23) {
                var4.field2089[var5] = -4;
            } catch (Throwable var24) {
                var4.field2089[var5] = -5;
            }
        }
        if (arg1 != -26190) {
            field3735 = null;
        }
        class214.field3807.method1883(var4, (byte) -3);
    }

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "(B)V")
    public static void method1421(byte arg0) {
        field3726 = null;
        field3735 = null;
        if (arg0 > 44) {
            field3732 = null;
            field3727 = null;
            field3733 = null;
            field3729 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
    public class205() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(I)V")
    public final void method88(int arg0) {
        ++field3734;
        if (arg0 <= 81) {
            method1421((byte) -75);
        }
        this.field3728 = class190.method1249(127, this.field3730);
        this.method1418((byte) -110);
    }
}
