import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class216 extends class107 {

    @OriginalMember(owner = "client!ia", name = "bb", descriptor = "I")
    private int field3760 = 4096;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
    private int field3748 = 0;

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "Lak;")
    public static class135 field3755 = new class135(64);

    @OriginalMember(owner = "client!ia", name = "ab", descriptor = "I")
    public static int field3759 = 1;

    @OriginalMember(owner = "client!ia", name = "db", descriptor = "Lpj;")
    public static class237 field3762 = class33.method353("Weiter", 58);

    @OriginalMember(owner = "client!ia", name = "eb", descriptor = "Lpj;")
    public static class237 field3763 = class33.method353("rect_debug=", 124);

    @OriginalMember(owner = "client!ia", name = "fb", descriptor = "I")
    public static int field3764 = 0;

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "F")
    public static float field3757;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!ia", name = "cb", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
    public class216() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(B)[Lnf;")
    public static final class155[] method1450(byte arg0) {
        if (arg0 > -78) {
            return null;
        } else {
            ++field3754;
            class155[] var1 = new class155[class92.field1668];
            for (int var2 = 0; class92.field1668 > var2; ++var2) {
                var1[var2] = new class154(class52.field1094, class43.field944, class252.field4341[var2], class226.field3868[var2], class174.field3060[var2], class175.field3063[var2], class127.field2221[var2], class139.field2398);
            }
            class190.method1291((byte) 103);
            return var1;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)[[I")
    public final int[][] method240(byte arg0, int arg1) {
        ++field3758;
        int var3 = 31 / ((26 - arg0) / 45);
        int[][] var4 = super.field1903.method634(arg1, 13012);
        if (super.field1903.field1551) {
            int[][] var5 = this.method802(3, arg1, 0);
            int[] var6 = var5[1];
            int[] var7 = var5[0];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class106.field1862; ++var12) {
                int var13 = var6[var12];
                int var14 = var7[var12];
                int var15 = var8[var12];
                if (~this.field3748 >= ~var14) {
                    if (this.field3760 < var14) {
                        var9[var12] = this.field3760;
                    } else {
                        var9[var12] = var14;
                    }
                } else {
                    var9[var12] = this.field3748;
                }
                if (var13 >= this.field3748) {
                    if (~var13 < ~this.field3760) {
                        var10[var12] = this.field3760;
                    } else {
                        var10[var12] = var13;
                    }
                } else {
                    var10[var12] = this.field3748;
                }
                if (~var15 <= ~this.field3748) {
                    if (this.field3760 < var15) {
                        var11[var12] = this.field3760;
                    } else {
                        var11[var12] = var15;
                    }
                } else {
                    var11[var12] = this.field3748;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IJ)V")
    public static final void method1451(int arg0, long arg1) {
        ++field3749;
        if (~arg1 != -1L) {
            if (arg0 == -22574) {
                for (int var3 = 0; ~var3 > ~class221.field3810; ++var3) {
                    if (class144.field2601[var3] == arg1) {
                        --class221.field3810;
                        ++class134.field2341;
                        for (int var4 = var3; var4 < class221.field3810; ++var4) {
                            class152.field2694[var4] = class152.field2694[var4 + 1];
                            class71.field1399[var4] = class71.field1399[var4 + 1];
                            class13.field213[var4] = class13.field213[var4 + 1];
                            class144.field2601[var4] = class144.field2601[var4 - -1];
                            class195.field3402[var4] = class195.field3402[var4 + 1];
                            class180.field3163[var4] = class180.field3163[var4 + 1];
                        }
                        class20.field381 = class3.field31;
                        class223.field3830.method368(29, 195);
                        class223.field3830.method292(105, arg1);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lac;IIIIIIZ)V")
    public static final void method1452(class132 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field2334.length;
        for (int var9 = 0; var9 < var8; ++var9) {
            int var22 = arg0.field2334[var9] - class249.field4311;
            int var23 = arg0.field2322[var9] - class32.field696;
            int var24 = arg0.field2333[var9] - class101.field1800;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field2336 != null) {
                class132.field2332[var9] = var25;
                class132.field2325[var9] = var28;
                class132.field2324[var9] = var29;
            }
            class132.field2320[var9] = (var25 << 9) / var29 + class150.field2664;
            class132.field2326[var9] = (var28 << 9) / var29 + class150.field2669;
        }
        class150.field2672 = 0;
        int var10 = arg0.field2331.length;
        for (int var11 = 0; var11 < var10; ++var11) {
            int var12 = arg0.field2331[var11];
            int var13 = arg0.field2319[var11];
            int var14 = arg0.field2330[var11];
            int var15 = class132.field2320[var12];
            int var16 = class132.field2320[var13];
            int var17 = class132.field2320[var14];
            int var18 = class132.field2326[var12];
            int var19 = class132.field2326[var13];
            int var20 = class132.field2326[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class247.field4304 && class190.method1287(class8.field152 + class150.field2664, class227.field3886 + class150.field2669, var18, var19, var20, var15, var16, var17)) {
                    class23.field428 = arg5;
                    class129.field2260 = arg6;
                }
                if (!arg7) {
                    class150.field2667 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class150.field2678 || var16 > class150.field2678 || var17 > class150.field2678) {
                        class150.field2667 = true;
                    }
                    if (arg0.field2336 != null && arg0.field2336[var11] != -1) {
                        if (class59.field1207) {
                            if (arg0.field2329) {
                                class150.method1029(var18, var19, var20, var15, var16, var17, arg0.field2317[var11], arg0.field2327[var11], arg0.field2318[var11], class132.field2332[0], class132.field2332[1], class132.field2332[3], class132.field2325[0], class132.field2325[1], class132.field2325[3], class132.field2324[0], class132.field2324[1], class132.field2324[3], arg0.field2336[var11]);
                            } else {
                                class150.method1029(var18, var19, var20, var15, var16, var17, arg0.field2317[var11], arg0.field2327[var11], arg0.field2318[var11], class132.field2332[var12], class132.field2332[var13], class132.field2332[var14], class132.field2325[var12], class132.field2325[var13], class132.field2325[var14], class132.field2324[var12], class132.field2324[var13], class132.field2324[var14], arg0.field2336[var11]);
                            }
                        } else {
                            int var21 = class150.field2674.method80((byte) -110, arg0.field2336[var11]);
                            class150.method1015(var18, var19, var20, var15, var16, var17, class47.method438(var21, arg0.field2317[var11]), class47.method438(var21, arg0.field2327[var11]), class47.method438(var21, arg0.field2318[var11]));
                        }
                    } else if (arg0.field2317[var11] != 12345678) {
                        class150.method1015(var18, var19, var20, var15, var16, var17, arg0.field2317[var11], arg0.field2327[var11], arg0.field2318[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(B)V")
    public static void method1453(byte arg0) {
        field3755 = null;
        field3762 = null;
        field3763 = null;
        if (arg0 > -96) {
            field3757 = -0.5877243F;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1454(byte arg0, byte[] arg1) {
        class32 var2 = new class32(arg1);
        int var3 = var2.method316((byte) -82);
        if (arg0 != 50) {
            return null;
        } else {
            ++field3753;
            int var4 = var2.method319((byte) -18);
            if (~var4 > -1 || class64.field1282 != 0 && class64.field1282 < var4) {
                throw new RuntimeException();
            } else if (var3 == 0) {
                byte[] var5 = new byte[var4];
                var2.method308(var5, 0, var4, 0);
                return var5;
            } else {
                int var6 = var2.method319((byte) -18);
                if (var6 >= 0 && (~class64.field1282 == -1 || var6 <= class64.field1282)) {
                    byte[] var7 = new byte[var6];
                    if (~var3 == -2) {
                        class161.method1136(var7, var6, arg1, var4, 9);
                    } else {
                        class20.field377.method193(var7, var2, -14);
                    }
                    return var7;
                } else {
                    throw new RuntimeException();
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        if (arg2 != -32513) {
            this.field3748 = 122;
        }
        ++field3752;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field1897 = ~arg0.method316((byte) 109) == -2;
                }
            } else {
                this.field3760 = arg0.method339(-16777216);
            }
        } else {
            this.field3748 = arg0.method339(-16777216);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)V")
    public static final void method1455(int arg0, int arg1, int arg2, int arg3) {
        ++field3750;
        class270 var4 = class202.method1368(-15, arg2, arg0);
        var4.method1793(13);
        var4.field4619 = arg3;
        var4.field4628 = arg1;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        if (arg0 != -17) {
            this.field3748 = 42;
        }
        int[] var3 = super.field1921.method1388(arg1, (byte) -26);
        if (super.field1921.field3539) {
            int[] var4 = this.method797(0, arg1, (byte) 119);
            for (int var5 = 0; ~var5 > ~class106.field1862; ++var5) {
                int var6 = var4[var5];
                if (~this.field3748 >= ~var6) {
                    if (var6 <= this.field3760) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field3760;
                    }
                } else {
                    var3[var5] = this.field3748;
                }
            }
        }
        ++field3751;
        return var3;
    }
}
