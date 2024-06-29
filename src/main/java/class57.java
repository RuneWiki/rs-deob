import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class57 extends class344 {

    @OriginalMember(owner = "client!wo", name = "Q", descriptor = "I")
    public static int field725 = -1;

    @OriginalMember(owner = "client!wo", name = "L", descriptor = "Lpn;")
    public static class72 field720 = new class72(19, 4);

    @OriginalMember(owner = "client!wo", name = "S", descriptor = "[S")
    public static short[] field727 = new short[256];

    @OriginalMember(owner = "client!wo", name = "M", descriptor = "B")
    public byte field721;

    @OriginalMember(owner = "client!wo", name = "H", descriptor = "I")
    public int field716;

    @OriginalMember(owner = "client!wo", name = "I", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!wo", name = "J", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!wo", name = "K", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!wo", name = "N", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!wo", name = "P", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!wo", name = "R", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!wo", name = "O", descriptor = "Lvt;")
    public class179 field723;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZI)V")
    public static final void method292(int arg0, boolean arg1, int arg2) {
        ++field722;
        class458 var3 = class230.method1272((byte) -128, arg1, arg0);
        if (var3 != null) {
            if (arg2 != -5339) {
                field720 = null;
            }
            var3.method702((byte) -114);
        }
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)V")
    public static final void method293(int arg0) {
        ++field724;
        if (class204.method1109(false) == 2) {
            byte var1 = (byte) (255 & class154.field1858 + -4);
            if (arg0 == -28753) {
                int var2 = class154.field1858 % class159.field1895;
                for (int var3 = 0; ~var3 > -5; ++var3) {
                    for (int var16 = 0; var16 < class289.field4316; ++var16) {
                        class276.field3945[var3][var2][var16] = var1;
                    }
                }
                if (~class100.field1217 != -4) {
                    for (int var4 = 0; var4 < 2; ++var4) {
                        class181.field2330[var4] = -1000000;
                        class208.field2885[var4] = 1000000;
                        class173.field2087[var4] = 0;
                        class188.field2548[var4] = 1000000;
                        class52.field682[var4] = 0;
                    }
                    if (class358.field5167 != 1) {
                        int var5 = class375.method2264(arg0 ^ 30298, class351.field5047, class100.field1217, class58.field734);
                        if (var5 - class427.field6145 < 800 && (4 & class140.field1686[class100.field1217][class58.field734 >> 7][class351.field5047 >> 7]) != 0) {
                            class283.method1774(class293.field4356, class58.field734 >> 7, false, class351.field5047 >> 7, 1, 1);
                            return;
                        }
                    } else {
                        if ((4 & class140.field1686[class100.field1217][class19.field258.field1008 >> 7][class19.field258.field1005 >> 7]) != 0) {
                            class283.method1774(class293.field4356, class19.field258.field1008 >> 7, false, class19.field258.field1005 >> 7, 1, 0);
                        }
                        if (~class120.field1490 <= -2561) {
                            return;
                        }
                        int var6 = class58.field734 >> 7;
                        int var7 = class351.field5047 >> 7;
                        int var8 = class19.field258.field1008 >> 7;
                        int var9 = class19.field258.field1005 >> 7;
                        int var10;
                        if (~var6 > ~var8) {
                            var10 = -var6 + var8;
                        } else {
                            var10 = var6 - var8;
                        }
                        int var11;
                        if (var9 > var7) {
                            var11 = -var7 + var9;
                        } else {
                            var11 = -var9 + var7;
                        }
                        if (~var10 == -1 && var11 == 0 || ~(-class159.field1895) <= ~var10 || ~var10 <= ~class159.field1895 || ~(-class289.field4316) <= ~var11 || ~var11 <= ~class289.field4316) {
                            class144.method678((Throwable) null, true, "RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class93.field1163 + "," + class349.field5023);
                            return;
                        }
                        if (~var11 <= ~var10) {
                            int var12 = var10 * 65536 / var11;
                            int var13 = 32768;
                            while (~var7 != ~var9) {
                                if (var7 >= var9) {
                                    if (var9 < var7) {
                                        --var7;
                                    }
                                } else {
                                    ++var7;
                                }
                                if ((class140.field1686[class100.field1217][var6][var7] & 4) != 0) {
                                    class283.method1774(class293.field4356, var6, false, var7, 1, 1);
                                    return;
                                }
                                var13 += var12;
                                if (var13 >= 65536) {
                                    if (~var8 < ~var6) {
                                        ++var6;
                                    } else if (var6 > var8) {
                                        --var6;
                                    }
                                    var13 -= 65536;
                                    if ((class140.field1686[class100.field1217][var6][var7] & 4) != 0) {
                                        class283.method1774(class293.field4356, var6, false, var7, 1, 1);
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                        int var14 = var11 * 65536 / var10;
                        int var15 = 32768;
                        while (var6 != var8) {
                            if (var8 > var6) {
                                ++var6;
                            } else if (var6 > var8) {
                                --var6;
                            }
                            if ((4 & class140.field1686[class100.field1217][var6][var7]) != 0) {
                                class283.method1774(class293.field4356, var6, false, var7, 1, 1);
                                return;
                            }
                            var15 += var14;
                            if (var15 >= 65536) {
                                if (var7 < var9) {
                                    ++var7;
                                } else if (~var7 < ~var9) {
                                    --var7;
                                }
                                var15 -= 65536;
                                if ((class140.field1686[class100.field1217][var6][var7] & 4) != 0) {
                                    class283.method1774(class293.field4356, var6, false, var7, 1, 1);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "(B)[B")
    public final byte[] method294(byte arg0) {
        ++field717;
        if (!super.field4927 && ~this.field723.field2206 <= ~(this.field723.field2159.length + -this.field721)) {
            if (arg0 <= 1) {
                method297(false);
            }
            return this.field723.field2159;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)I")
    public final int method295(int arg0) {
        if (arg0 != 5) {
            this.method294((byte) -71);
        }
        ++field719;
        return this.field723 == null ? 0 : this.field723.field2206 * 100 / (this.field723.field2159.length + -this.field721);
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(Z)V")
    public static final void method296(boolean arg0) {
        ++field718;
        class190.method1037((byte) -121, class46.field597);
        int var1 = (class58.field734 >> 10) - -(class93.field1163 >> 3);
        class100.field1217 = class19.field258.field994 = 0;
        int var2 = (class351.field5047 >> 10) - -(class349.field5023 >> 3);
        class19.field258.method1082(8, 8, (byte) -125);
        byte var3 = 18;
        class458.field6451 = new byte[var3][];
        class170.field2017 = new int[var3];
        class420.field6064 = new byte[var3][];
        class16.field215 = new byte[var3][];
        client.field3938 = new int[var3];
        class46.field602 = new byte[var3][];
        class78.field933 = new int[var3];
        class217.field3034 = new int[var3];
        class382.field5430 = new int[var3];
        class216.field2981 = new int[var3];
        class327.field4711 = new int[var3][4];
        class247.field3482 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (-(class159.field1895 >> 4) + var1) / 8; ~var5 >= ~(((class159.field1895 >> 4) + var1) / 8); ++var5) {
            for (int var7 = (-(class289.field4316 >> 4) + var2) / 8; ~(((class289.field4316 >> 4) + var2) / 8) <= ~var7; ++var7) {
                int var8 = (var5 << 8) + var7;
                class217.field3034[var4] = var8;
                class78.field933[var4] = class242.field3319.method2761(0, "m" + var5 + "_" + var7);
                client.field3938[var4] = class242.field3319.method2761(0, "l" + var5 + "_" + var7);
                class382.field5430[var4] = class242.field3319.method2761(0, "n" + var5 + "_" + var7);
                class170.field2017[var4] = class242.field3319.method2761(0, "um" + var5 + "_" + var7);
                class216.field2981[var4] = class242.field3319.method2761(0, "ul" + var5 + "_" + var7);
                if (~class382.field5430[var4] == 0) {
                    class78.field933[var4] = -1;
                    client.field3938[var4] = -1;
                    class170.field2017[var4] = -1;
                    class216.field2981[var4] = -1;
                }
                ++var4;
            }
        }
        for (int var6 = var4; ~class382.field5430.length < ~var6; ++var6) {
            class382.field5430[var6] = -1;
            class78.field933[var6] = -1;
            client.field3938[var6] = -1;
            class170.field2017[var6] = -1;
            class216.field2981[var6] = -1;
        }
        class199.method1088(false, var2, arg0, var1, !arg0);
    }

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "(Z)V")
    public static void method297(boolean arg0) {
        field720 = null;
        if (arg0) {
            field720 = null;
        }
        field727 = null;
    }

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "(I)V")
    public static final void method298(int arg0) {
        class196.method1074();
        ++field726;
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class174.field2093[var1].method2534(-2);
        }
        if (arg0 < 31) {
            field725 = -66;
        }
        class255.method1567(-1);
        class247.method1505(94);
        System.gc();
    }
}
