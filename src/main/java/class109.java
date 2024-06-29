import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class109 extends class43 {

    @OriginalMember(owner = "client!pe", name = "hb", descriptor = "Z")
    private boolean field2624 = false;

    @OriginalMember(owner = "client!pe", name = "lb", descriptor = "I")
    private int field2628 = -1;

    @OriginalMember(owner = "client!pe", name = "sb", descriptor = "Z")
    private volatile boolean field2635 = false;

    @OriginalMember(owner = "client!pe", name = "zb", descriptor = "Lud;")
    private class139 field2642;

    @OriginalMember(owner = "client!pe", name = "wb", descriptor = "Lud;")
    private class139 field2639;

    @OriginalMember(owner = "client!pe", name = "cb", descriptor = "I")
    private int field2619;

    @OriginalMember(owner = "client!pe", name = "gb", descriptor = "[I")
    public static int[] field2623 = new int[32];

    @OriginalMember(owner = "client!pe", name = "tb", descriptor = "Lu;")
    public static class135 field2636;

    @OriginalMember(owner = "client!pe", name = "Ab", descriptor = "Lu;")
    private static class135 field2643;

    @OriginalMember(owner = "client!pe", name = "ub", descriptor = "Lu;")
    public static class135 field2637;

    @OriginalMember(owner = "client!pe", name = "yb", descriptor = "Lu;")
    public static class135 field2641;

    @OriginalMember(owner = "client!pe", name = "xb", descriptor = "Le;")
    public static class29 field2640;

    @OriginalMember(owner = "client!pe", name = "Hb", descriptor = "Lu;")
    public static class135 field2650;

    @OriginalMember(owner = "client!pe", name = "Ib", descriptor = "Lu;")
    public static class135 field2651;

    @OriginalMember(owner = "client!pe", name = "Db", descriptor = "Lu;")
    public static class135 field2646;

    @OriginalMember(owner = "client!pe", name = "Gb", descriptor = "Lu;")
    private static class135 field2649;

    @OriginalMember(owner = "client!pe", name = "Jb", descriptor = "Lu;")
    public static class135 field2652;

    @OriginalMember(owner = "client!pe", name = "Cb", descriptor = "Lu;")
    public static class135 field2645;

    @OriginalMember(owner = "client!pe", name = "db", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!pe", name = "eb", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!pe", name = "fb", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!pe", name = "ib", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!pe", name = "jb", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!pe", name = "kb", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!pe", name = "mb", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!pe", name = "ob", descriptor = "I")
    private int field2631;

    @OriginalMember(owner = "client!pe", name = "pb", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!pe", name = "qb", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!pe", name = "rb", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!pe", name = "vb", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!pe", name = "Bb", descriptor = "I")
    private int field2644;

    @OriginalMember(owner = "client!pe", name = "Eb", descriptor = "Lpe;")
    public static class109 field2647;

    @OriginalMember(owner = "client!pe", name = "Fb", descriptor = "[I")
    public static int[] field2648;

    @OriginalMember(owner = "client!pe", name = "nb", descriptor = "[Z")
    private volatile boolean[] field2630;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILud;Z[BB)V")
    public final void method878(int arg0, class139 arg1, boolean arg2, byte[] arg3, byte arg4) {
        ++field2633;
        if (arg4 != 2) {
            field2643 = null;
        }
        if (this.field2639 == arg1) {
            if (this.field2635) {
                throw new RuntimeException();
            } else if (arg3 == null) {
                class145.method1192(this.field2631, (byte) 0, this.field2619, this, true, -3694, 255);
            } else {
                class63.field1585.reset();
                class63.field1585.update(arg3, 0, arg3.length);
                int var6 = (int) class63.field1585.getValue();
                if (~this.field2631 == ~var6 && ~super.field1024 == ~this.field2644) {
                    this.method326(arg3, (byte) 69);
                    this.method884(-1);
                } else {
                    class145.method1192(this.field2631, (byte) 0, this.field2619, this, true, arg4 + -3696, 255);
                }
            }
        } else {
            if (!arg2 && ~this.field2628 == ~arg0) {
                this.field2635 = true;
            }
            if (arg3 != null && ~arg3.length < -3) {
                class63.field1585.reset();
                class63.field1585.update(arg3, 0, arg3.length + -2);
                int var7 = (int) class63.field1585.getValue();
                int var8 = ((arg3[arg3.length + -2] & 255) << 8) + (arg3[arg3.length - 1] & 255);
                if (super.field1046[arg0] == var7 && super.field1003[arg0] == var8) {
                    this.field2630[arg0] = true;
                    if (arg2) {
                        super.field1047[arg0] = class86.method674(false, arg3, (byte) -108);
                    }
                } else {
                    this.field2630[arg0] = false;
                    if (this.field2624 || arg2) {
                        class145.method1192(super.field1046[arg0], (byte) 2, arg0, this, arg2, arg4 + -3696, this.field2619);
                    }
                }
            } else {
                this.field2630[arg0] = false;
                if (this.field2624 || arg2) {
                    class145.method1192(super.field1046[arg0], (byte) 2, arg0, this, arg2, arg4 ^ -3696, this.field2619);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)I")
    public final int method879(byte arg0) {
        ++field2626;
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; ~super.field1047.length < ~var4; ++var4) {
            if (~super.field1012[var4] < -1) {
                var2 += 100;
                var3 += this.method886(-124, var4);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            int var5 = var3 * 100 / var2;
            if (arg0 != -121) {
                return 111;
            } else {
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lud;Lud;IZZZ)V")
    public class109(class139 arg0, class139 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2642 = arg0;
        this.field2624 = arg5;
        this.field2639 = arg1;
        this.field2619 = arg2;
        class68.method551(this.field2619, this, -32636);
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(II)V")
    public static final void method880(int arg0, int arg1) {
        if (arg1 > -54) {
            method883(101);
        }
        ++field2632;
        int[] var2 = class96.field2336.field268;
        int var3 = var2.length;
        for (int var4 = 0; var3 > var4; ++var4) {
            var2[var4] = 0;
        }
        for (int var5 = 1; ~var5 > -104; ++var5) {
            int var20 = (-var5 + 103) * 512 * 4 + 24628;
            for (int var21 = 1; var21 < 103; ++var21) {
                if ((24 & client.field525[arg0][var21][var5]) == 0) {
                    class100.field2418.method1000(var2, var20, 512, arg0, var21, var5);
                }
                if (~arg0 > -4 && (8 & client.field525[arg0 + 1][var21][var5]) != 0) {
                    class100.field2418.method1000(var2, var20, 512, arg0 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class96.field2336.method63();
        int var6 = (int) (Math.random() * 20.0D) - (-238 - (-10 + ((228 + (int) (20.0D * Math.random()) << 16) - -(-10 + (int) (Math.random() * 20.0D) + 238 << 8))));
        int var7 = (int) (20.0D * Math.random()) + 228 << 16;
        for (int var8 = 1; ~var8 > -104; ++var8) {
            for (int var19 = 1; var19 < 103; ++var19) {
                if ((client.field525[arg0][var19][var8] & 24) == 0) {
                    class138.method1120(var6, arg0, var8, var19, var7, 116);
                }
                if (~arg0 > -4 && ~(client.field525[arg0 + 1][var19][var8] & 8) != -1) {
                    class138.method1120(var6, arg0 + 1, var8, var19, var7, 125);
                }
            }
        }
        class100.field2420 = 0;
        for (int var9 = 0; var9 < 104; ++var9) {
            for (int var10 = 0; var10 < 104; ++var10) {
                int var11 = class100.field2418.method1011(class136.field3301, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 32767;
                    int var13 = class2.method9(false, var12).field2875;
                    if (~var13 <= -1) {
                        int var14 = var9;
                        int var15 = var10;
                        if (~var13 != -23 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && ~var13 != -48 && var13 != 48) {
                            int[][] var16 = class58.field1437[class136.field3301].field2391;
                            for (int var17 = 0; ~var17 > -11; ++var17) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var14 > 0 && var14 > var9 + -3 && ~(var16[var14 + -1][var15] & 19661064) == -1) {
                                    --var14;
                                }
                                if (~var18 == -2 && var14 < 103 && ~var14 > ~(var9 - -3) && ~(var16[var14 + 1][var15] & 19661184) == -1) {
                                    ++var14;
                                }
                                if (~var18 == -3 && var15 > 0 && var15 > var10 + -3 && ~(var16[var14][var15 + -1] & 19661058) == -1) {
                                    --var15;
                                }
                                if (var18 == 3 && var15 < 103 && var15 < var10 + 3 && (19661088 & var16[var14][var15 + 1]) == 0) {
                                    ++var15;
                                }
                            }
                        }
                        class135.field3231[class100.field2420] = class10.field261[var13];
                        class23.field579[class100.field2420] = var14;
                        class148.field3706[class100.field2420] = var15;
                        ++class100.field2420;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ[BIZ)V")
    public final void method881(int arg0, boolean arg1, byte[] arg2, int arg3, boolean arg4) {
        ++field2621;
        if (arg0 == -1) {
            if (!arg4) {
                arg2[arg2.length - 2] = (byte) (super.field1003[arg3] >> 8);
                arg2[arg2.length + -1] = (byte) super.field1003[arg3];
                if (this.field2642 != null) {
                    class96.method794(this.field2642, (byte) 82, arg3, arg2);
                    this.field2630[arg3] = true;
                }
                if (arg1) {
                    super.field1047[arg3] = class86.method674(false, arg2, (byte) -115);
                    return;
                }
            } else {
                if (this.field2635) {
                    throw new RuntimeException();
                }
                if (this.field2639 != null) {
                    class96.method794(this.field2639, (byte) -90, this.field2619, arg2);
                }
                this.method326(arg2, (byte) 69);
                this.method884(-1);
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(II)V")
    public final void method332(int arg0, int arg1) {
        if (this.field2642 != null && this.field2630 != null && this.field2630[arg0]) {
            class152.method1223(-10149, this, this.field2642, arg0);
        } else {
            class145.method1192(super.field1046[arg0], (byte) 2, arg0, this, true, -3694, this.field2619);
        }
        ++field2620;
        if (arg1 > -54) {
            field2637 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)I")
    public final int method882(boolean arg0) {
        ++field2622;
        if (this.field2635) {
            return 100;
        } else if (super.field1047 != null) {
            return 99;
        } else {
            int var2 = class106.method859(arg0, 255, this.field2619);
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(BI)V")
    public final void method323(byte arg0, int arg1) {
        ++field2627;
        if (arg0 < 4) {
            method885(26);
        }
        class139.method1122(arg1, (byte) 51, this.field2619);
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V")
    public static void method883(int arg0) {
        field2652 = null;
        field2646 = null;
        field2643 = null;
        field2640 = null;
        field2637 = null;
        int var1 = 74 / ((-52 - arg0) / 61);
        field2651 = null;
        field2647 = null;
        field2641 = null;
        field2636 = null;
        field2650 = null;
        field2645 = null;
        field2649 = null;
        field2648 = null;
        field2623 = null;
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V")
    private final void method884(int arg0) {
        this.field2630 = new boolean[super.field1047.length];
        ++field2625;
        for (int var2 = 0; this.field2630.length > var2; ++var2) {
            this.field2630[var2] = false;
        }
        if (this.field2642 == null) {
            this.field2635 = true;
        } else {
            this.field2628 = -1;
            for (int var3 = 0; ~var3 > ~this.field2630.length; ++var3) {
                if (~super.field1012[var3] < -1) {
                    class22.method179(var3, this.field2642, 1, this);
                    this.field2628 = var3;
                }
            }
            if (this.field2628 == arg0) {
                this.field2635 = true;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)I")
    public static final int method885(int arg0) {
        ++field2638;
        if (arg0 != 5133) {
            field2647 = null;
        }
        return 6;
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(II)I")
    private final int method886(int arg0, int arg1) {
        ++field2629;
        if (super.field1047[arg1] != null) {
            return 100;
        } else if (this.field2630[arg1]) {
            return 100;
        } else {
            int var3 = -112 / ((-37 - arg0) / 49);
            return class106.method859(true, this.field2619, arg1);
        }
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(III)V")
    public final void method887(int arg0, int arg1, int arg2) {
        if (arg1 == 16422) {
            this.field2644 = arg0;
            ++field2634;
            this.field2631 = arg2;
            if (this.field2639 != null) {
                class152.method1223(-10149, this, this.field2639, this.field2619);
            } else {
                class145.method1192(this.field2631, (byte) 0, this.field2619, this, true, arg1 + -20116, 255);
            }
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; ~var1 > -33; ++var1) {
            field2623[var1] = var0 + -1;
            var0 += var0;
        }
        field2636 = class87.method676((byte) -123, "sl_arrows");
        field2643 = class87.method676((byte) -60, "Moderator option: Mute player for 48 hours: <OFF>");
        field2637 = class87.method676((byte) -111, " x ");
        field2641 = field2643;
        field2640 = new class29(64);
        field2650 = class87.method676((byte) -57, "Die Adresse dieses Computers wurde gesperrt)1");
        field2651 = class87.method676((byte) -73, "Bitte warten Sie eine Minute");
        field2646 = class87.method676((byte) -85, "(Z");
        field2649 = class87.method676((byte) -75, " seconds)3");
        field2652 = class87.method676((byte) -87, "headicons_pk");
        field2645 = field2649;
    }
}
