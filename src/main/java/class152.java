import java.awt.Graphics;
import java.util.Date;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class152 extends class198 {

    @OriginalMember(owner = "client!w", name = "I", descriptor = "I")
    private int field2356 = 2;

    @OriginalMember(owner = "client!w", name = "R", descriptor = "I")
    private int field2365 = 5;

    @OriginalMember(owner = "client!w", name = "V", descriptor = "I")
    private int field2369 = 0;

    @OriginalMember(owner = "client!w", name = "S", descriptor = "I")
    private int field2366 = 1;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "I")
    private int field2361 = 5;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "[B")
    private byte[] field2359 = new byte[512];

    @OriginalMember(owner = "client!w", name = "Y", descriptor = "[S")
    private short[] field2372 = new short[512];

    @OriginalMember(owner = "client!w", name = "W", descriptor = "I")
    private int field2370 = 2048;

    @OriginalMember(owner = "client!w", name = "ab", descriptor = "I")
    public static int field2374 = 0;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "[Lak;")
    public static class146[] field2358 = new class146[14];

    @OriginalMember(owner = "client!w", name = "Z", descriptor = "I")
    public static int field2373 = 0;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "J")
    public static long field2363 = 0L;

    @OriginalMember(owner = "client!w", name = "bb", descriptor = "I")
    public static int field2375 = -1;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!w", name = "O", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!w", name = "U", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!w", name = "X", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!w", name = "cb", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!w", name = "db", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!w", name = "eb", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!w", name = "fb", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!w", name = "T", descriptor = "[I")
    public static int[] field2367;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        if (!arg0) {
            field2375 = 6;
        }
        ++field2357;
        int[] var3 = super.field3134.method36(arg1, 30672);
        if (super.field3134.field69) {
            int var4 = 2048 - -(class42.field591[arg1] * this.field2365);
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class42.field590; ++var7) {
                class211.field3383 = Integer.MAX_VALUE;
                class242.field3830 = Integer.MAX_VALUE;
                class178.field2763 = Integer.MAX_VALUE;
                class111.field1694 = Integer.MAX_VALUE;
                int var8 = field2367[var7] * this.field2361 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                    int var13 = this.field2359[(~var11 <= ~this.field2365 ? -this.field2365 + var11 : var11) & 255] & 255;
                    for (int var14 = var9 - 1; ~var14 >= ~var10; ++var14) {
                        int var15 = 2 * (this.field2359[(var14 >= this.field2361 ? -this.field2361 + var14 : var14) + var13 & 255] & 255);
                        int var27 = var15 + 1;
                        int var16 = var8 + -this.field2372[var15] + -(var14 << 12);
                        int var17 = var4 - (var11 << 12) - this.field2372[var27];
                        int var18 = this.field2366;
                        int var19;
                        if (~var18 != -2) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (~var18 == -3) {
                                            var19 = (~var16 <= -1 ? var16 : -var16) - -(~var17 > -1 ? -var17 : var17);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var17 <= -1 ? var17 : -var17;
                                int var26 = ~var16 > -1 ? -var16 : var16;
                                var19 = ~var25 <= ~var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~var19 > ~class111.field1694) {
                            class211.field3383 = class242.field3830;
                            class242.field3830 = class178.field2763;
                            class178.field2763 = class111.field1694;
                            class111.field1694 = var19;
                        } else if (~class178.field2763 >= ~var19) {
                            if (var19 >= class242.field3830) {
                                if (~class211.field3383 < ~var19) {
                                    class211.field3383 = var19;
                                }
                            } else {
                                class211.field3383 = class242.field3830;
                                class242.field3830 = var19;
                            }
                        } else {
                            class211.field3383 = class242.field3830;
                            class242.field3830 = class178.field2763;
                            class178.field2763 = var19;
                        }
                    }
                }
                int var12 = this.field2356;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (~var12 != -5) {
                                if (var12 == 2) {
                                    var3[var7] = -class111.field1694 + class178.field2763;
                                }
                            } else {
                                var3[var7] = class211.field3383;
                            }
                        } else {
                            var3[var7] = class242.field3830;
                        }
                    } else {
                        var3[var7] = class178.field2763;
                    }
                } else {
                    var3[var7] = class111.field1694;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1002(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!w", name = "g", descriptor = "(I)V")
    private final void method1003(int arg0) {
        ++field2362;
        if (arg0 != -513) {
            field2376 = -56;
        }
        Random var2 = new Random((long) this.field2369);
        this.field2372 = new short[512];
        if (~this.field2370 < -1) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field2372[var3] = (short) class79.method524(this.field2370, 107, var2);
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(B)V")
    public final void method142(byte arg0) {
        ++field2377;
        this.field2359 = class65.method418(this.field2369, (byte) -119);
        int var2 = -102 % ((arg0 - -46) / 47);
        this.method1003(-513);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field2365 = arg1.method1420((byte) 0);
                                }
                            } else {
                                this.field2361 = arg1.method1420((byte) 0);
                            }
                        } else {
                            this.field2366 = arg1.method1420((byte) 0);
                        }
                    } else {
                        this.field2356 = arg1.method1420((byte) 0);
                    }
                } else {
                    this.field2370 = arg1.method1419(117);
                }
            } else {
                this.field2369 = arg1.method1420((byte) 0);
            }
        } else {
            this.field2361 = this.field2365 = arg1.method1420((byte) 0);
        }
        ++field2379;
        int var5 = 122 % ((60 - arg0) / 61);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIILtd;)Z")
    public static final boolean method1004(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class74 arg6) {
        ++field2368;
        if (arg5 != 48) {
            method1006(-16);
        }
        class184 var7 = class182.method1209((byte) -104, arg6.field1089);
        if (~var7.field2864 == 0) {
            return true;
        } else {
            int var8;
            if (!arg6.field1124) {
                var8 = 0;
            } else {
                int var9 = arg6.field1087 + arg1;
                var8 = var9 & 3;
            }
            class5 var10 = var7.method1225(arg6.field1145, (byte) 105, var8);
            if (var10 == null) {
                return false;
            } else {
                int var11 = arg6.field1151;
                int var12 = arg6.field1169;
                if (~(1 & var8) == -2) {
                    var11 = arg6.field1169;
                    var12 = arg6.field1151;
                }
                int var13 = var10.field1682;
                int var14 = var10.field1680;
                if (var7.field2867) {
                    var14 = var12 * 4;
                    var13 = var11 * 4;
                }
                if (~var7.field2859 != -1) {
                    var10.method22(arg0 * 4 + 48, (-arg4 + -var11 + 104) * 4 + 48, var14, var13, var7.field2859);
                } else {
                    var10.method25(arg0 * 4 + 48, 48 - -((-arg4 + 104 - var11) * 4), var14, var13);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method1005(long arg0, byte arg1) {
        class183.field2836.setTime(new Date(arg0));
        ++field2364;
        int var3 = class183.field2836.get(7);
        int var4 = class183.field2836.get(5);
        int var5 = class183.field2836.get(2);
        int var6 = class183.field2836.get(1);
        int var7 = 75 / ((63 - arg1) / 47);
        int var8 = class183.field2836.get(11);
        int var9 = class183.field2836.get(12);
        int var10 = class183.field2836.get(13);
        return class194.field3066[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + class60.field920[var5] + "-" + var6 + " " + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!w", name = "h", descriptor = "(I)V")
    public static void method1006(int arg0) {
        field2358 = null;
        field2367 = null;
        if (arg0 != -2) {
            method1002(55, -103, -51, 121, -41, -122, 94, 8);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZLjava/lang/String;B)V")
    public static final void method1007(boolean arg0, String arg1, byte arg2) {
        ++field2378;
        byte var3 = 4;
        if (arg2 == -121) {
            int var4 = var3 + 6;
            int var5 = 6 - -var3;
            int var6 = class48.field667.method734(arg1, 250);
            int var7 = 13 * class48.field667.method750(arg1, 250);
            class62.method380(-var3 + var4, var5 - var3, var3 + var6 + var3, var3 + var7 + var3, 0);
            class62.method389(-var3 + var4, -var3 + var5, var3 + var6 + var3, var3 + var7 + var3, 16777215);
            class48.field667.method727(arg1, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
            class208.method1473(-var3 + var4, (byte) 95, var3 + var7 + var3, -var3 + var5, var3 + var6 + var3);
            if (!arg0) {
                class311.method2112(var5, 26, var6, var7, var4);
            } else {
                try {
                    Graphics var8 = class113.field1701.getGraphics();
                    class301.field4942.method116(var8, 0, 0, (byte) 77);
                } catch (Exception var9) {
                    class113.field1701.repaint();
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
    public static final byte[] method1008(boolean arg0, int arg1, Object arg2) {
        ++field2371;
        if (arg2 == null) {
            return null;
        } else {
            if (arg1 > -104) {
                method1006(69);
            }
            if (arg2 instanceof byte[]) {
                byte[] var3 = (byte[]) arg2;
                return arg0 ? class223.method1556(var3, (byte) -101) : var3;
            } else if (arg2 instanceof class197) {
                class197 var4 = (class197) arg2;
                return var4.method856(1);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
    public class152() {
        super(0, true);
    }
}
