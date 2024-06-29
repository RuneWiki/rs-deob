import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class257 extends class194 {

    @OriginalMember(owner = "client!vw", name = "Hb", descriptor = "[Leba;")
    public static class511[] field3662 = new class511[0];

    @OriginalMember(owner = "client!vw", name = "T", descriptor = "Lhp;")
    public static class277 field3660 = new class277(20);

    @OriginalMember(owner = "client!vw", name = "Lb", descriptor = "Lea;")
    public static class474 field3666 = new class474("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!vw", name = "Mb", descriptor = "Lkca;")
    public static class73 field3667 = new class73(80, 3);

    @OriginalMember(owner = "client!vw", name = "Gb", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!vw", name = "Ib", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!vw", name = "Jb", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!vw", name = "Kb", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!vw", name = "j", descriptor = "(B)V")
    public static void method1713(byte arg0) {
        field3662 = null;
        field3667 = null;
        if (arg0 == 34) {
            field3666 = null;
            field3660 = null;
        }
    }

    @OriginalMember(owner = "client!vw", name = "k", descriptor = "(B)V")
    public static final void method1714(byte arg0) {
        ++field3665;
        if (~class595.field8694.method2436(class81.field908, 0) == -3) {
            byte var1 = (byte) (255 & class23.field246 + -4);
            int var2 = class23.field246 % class90.field1032;
            for (int var3 = 0; ~var3 > -5; ++var3) {
                for (int var16 = 0; var16 < class30.field349; ++var16) {
                    class399.field6056[var3][var2][var16] = var1;
                }
            }
            if (~class226.field3179 != -4) {
                int var4 = 0;
                if (arg0 <= 8) {
                    field3661 = 93;
                }
                while (~var4 > -3) {
                    class334.field4796[var4] = -1000000;
                    class274.field3847[var4] = 1000000;
                    class455.field6822[var4] = 0;
                    class550.field7845[var4] = 1000000;
                    class448.field6688[var4] = 0;
                    ++var4;
                }
                if (~class236.field3384 != -2) {
                    int var5 = class399.method2547(class207.field2781, class337.field4821, (byte) 84, class226.field3179);
                    if (~(-class100.field1192 + var5) > -3201 && ~(4 & class443.field6617[class226.field3179][class337.field4821 >> 9][class207.field2781 >> 9]) != -1) {
                        class263.method1738(1, false, class337.field4821 >> 9, class431.field6408, class207.field2781 >> 9, (byte) -43);
                        return;
                    }
                } else {
                    if ((class443.field6617[class226.field3179][class439.field6548.field1764 >> 9][class439.field6548.field1768 >> 9] & 4) != 0) {
                        class263.method1738(0, false, class439.field6548.field1764 >> 9, class431.field6408, class439.field6548.field1768 >> 9, (byte) -43);
                    }
                    if (class309.field4550 >= 2560) {
                        return;
                    }
                    int var6 = class337.field4821 >> 9;
                    int var7 = class207.field2781 >> 9;
                    int var8 = class439.field6548.field1764 >> 9;
                    int var9 = class439.field6548.field1768 >> 9;
                    int var10;
                    if (var8 <= var6) {
                        var10 = var6 - var8;
                    } else {
                        var10 = -var6 + var8;
                    }
                    int var11;
                    if (~var9 < ~var7) {
                        var11 = -var7 + var9;
                    } else {
                        var11 = -var9 + var7;
                    }
                    if (~var10 == -1 && var11 == 0 || ~(-class90.field1032) <= ~var10 || class90.field1032 <= var10 || ~(-class30.field349) <= ~var11 || class30.field349 <= var11) {
                        class630.method3607(7, (Throwable) null, "RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class287.field3980 + "," + class250.field3549);
                        return;
                    }
                    if (var10 > var11) {
                        int var12 = var11 * 65536 / var10;
                        int var13 = 32768;
                        while (~var6 != ~var8) {
                            if (var8 <= var6) {
                                if (var8 < var6) {
                                    --var6;
                                }
                            } else {
                                ++var6;
                            }
                            if (~(4 & class443.field6617[class226.field3179][var6][var7]) != -1) {
                                class263.method1738(1, false, var6, class431.field6408, var7, (byte) -43);
                                return;
                            }
                            var13 += var12;
                            if (var13 >= 65536) {
                                if (~var9 >= ~var7) {
                                    if (~var7 < ~var9) {
                                        --var7;
                                    }
                                } else {
                                    ++var7;
                                }
                                var13 -= 65536;
                                if (~(class443.field6617[class226.field3179][var6][var7] & 4) != -1) {
                                    class263.method1738(1, false, var6, class431.field6408, var7, (byte) -43);
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    int var14 = var10 * 65536 / var11;
                    int var15 = 32768;
                    while (~var7 != ~var9) {
                        if (~var7 <= ~var9) {
                            if (~var7 < ~var9) {
                                --var7;
                            }
                        } else {
                            ++var7;
                        }
                        if ((4 & class443.field6617[class226.field3179][var6][var7]) != 0) {
                            class263.method1738(1, false, var6, class431.field6408, var7, (byte) -43);
                            return;
                        }
                        var15 += var14;
                        if (~var15 <= -65537) {
                            if (var6 < var8) {
                                ++var6;
                            } else if (var8 < var6) {
                                --var6;
                            }
                            var15 -= 65536;
                            if (~(4 & class443.field6617[class226.field3179][var6][var7]) != -1) {
                                class263.method1738(1, false, var6, class431.field6408, var7, (byte) -43);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(FB)V")
    public final void method1715(float arg0, byte arg1) {
        ++field3664;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field2622[super.field2610++] = (byte) var3;
        super.field2622[super.field2610++] = (byte) (var3 >> 8);
        if (arg1 != -6) {
            method1714((byte) -37);
        }
        super.field2622[super.field2610++] = (byte) (var3 >> 16);
        super.field2622[super.field2610++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(I)V")
    public class257(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(FI)V")
    public final void method1716(float arg0, int arg1) {
        ++field3663;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field2622[super.field2610++] = (byte) (var3 >> 24);
        super.field2622[super.field2610++] = (byte) (var3 >> 16);
        super.field2622[super.field2610++] = (byte) (var3 >> 8);
        super.field2622[super.field2610++] = (byte) var3;
        if (arg1 >= -69) {
            field3661 = 95;
        }
    }
}
