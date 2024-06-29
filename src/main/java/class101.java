import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class101 extends class170 {

    @OriginalMember(owner = "client!vf", name = "W", descriptor = "I")
    private int field1812 = 5;

    @OriginalMember(owner = "client!vf", name = "Y", descriptor = "I")
    private int field1814 = 5;

    @OriginalMember(owner = "client!vf", name = "cb", descriptor = "I")
    private int field1818 = 1;

    @OriginalMember(owner = "client!vf", name = "eb", descriptor = "I")
    private int field1820 = 0;

    @OriginalMember(owner = "client!vf", name = "X", descriptor = "I")
    private int field1813 = 2;

    @OriginalMember(owner = "client!vf", name = "fb", descriptor = "[S")
    private short[] field1821 = new short[512];

    @OriginalMember(owner = "client!vf", name = "ab", descriptor = "I")
    private int field1816 = 2048;

    @OriginalMember(owner = "client!vf", name = "lb", descriptor = "[B")
    private byte[] field1827 = new byte[512];

    @OriginalMember(owner = "client!vf", name = "nb", descriptor = "Lqk;")
    public static class207 field1829 = class24.method212(255, "(U2");

    @OriginalMember(owner = "client!vf", name = "Z", descriptor = "Lbf;")
    public static class199 field1815 = new class199(4);

    @OriginalMember(owner = "client!vf", name = "rb", descriptor = "Lqk;")
    public static class207 field1833 = class24.method212(255, ",Mcran)2titre ouvert");

    @OriginalMember(owner = "client!vf", name = "bb", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!vf", name = "db", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!vf", name = "hb", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!vf", name = "ib", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!vf", name = "jb", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!vf", name = "kb", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!vf", name = "mb", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!vf", name = "pb", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!vf", name = "gb", descriptor = "Lgb;")
    public static class147 field1822;

    @OriginalMember(owner = "client!vf", name = "ob", descriptor = "Lta;")
    public static class254 field1830;

    @OriginalMember(owner = "client!vf", name = "qb", descriptor = "Lpk;")
    public static class99 field1832;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        if (arg0 != -30) {
            this.method31((byte) 4, -126);
        }
        ++field1823;
        int[] var3 = super.field3001.method1538(arg0 ^ -104, arg1);
        if (super.field3001.field3835) {
            int var4 = class282.field4964[arg1] * this.field1814 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; ~class88.field1595 < ~var7; ++var7) {
                class106.field1879 = Integer.MAX_VALUE;
                class26.field538 = Integer.MAX_VALUE;
                class40.field807 = Integer.MAX_VALUE;
                class220.field4000 = Integer.MAX_VALUE;
                int var8 = class68.field1211[var7] * this.field1812 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                    int var13 = 255 & this.field1827[255 & (~this.field1814 < ~var11 ? var11 : var11 - this.field1814)];
                    for (int var14 = var9 - 1; var14 <= var10; ++var14) {
                        int var15 = (this.field1827[var13 + (this.field1812 > var14 ? var14 : var14 - this.field1812) & 255] & 255) * 2;
                        int var27 = var15 + 1;
                        int var16 = var8 + -this.field1821[var15] + -(var14 << 12);
                        int var17 = -(var11 << 12) - this.field1821[var27] + var4;
                        int var18 = this.field1818;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (~var18 != -5) {
                                    if (~var18 != -6) {
                                        if (~var18 == -3) {
                                            var19 = (var16 >= 0 ? var16 : -var16) + (var17 < 0 ? -var17 : var17);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 - -var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)));
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)));
                                    int var24 = var22 - -var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 < 0 ? -var16 : var16;
                                int var26 = var17 < 0 ? -var17 : var17;
                                var19 = ~var25 < ~var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class220.field4000 <= var19) {
                            if (class40.field807 > var19) {
                                class106.field1879 = class26.field538;
                                class26.field538 = class40.field807;
                                class40.field807 = var19;
                            } else if (class26.field538 <= var19) {
                                if (~class106.field1879 < ~var19) {
                                    class106.field1879 = var19;
                                }
                            } else {
                                class106.field1879 = class26.field538;
                                class26.field538 = var19;
                            }
                        } else {
                            class106.field1879 = class26.field538;
                            class26.field538 = class40.field807;
                            class40.field807 = class220.field4000;
                            class220.field4000 = var19;
                        }
                    }
                }
                int var12 = this.field1813;
                if (var12 != 0) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (~var12 != -5) {
                                if (var12 == 2) {
                                    var3[var7] = class40.field807 - class220.field4000;
                                }
                            } else {
                                var3[var7] = class106.field1879;
                            }
                        } else {
                            var3[var7] = class26.field538;
                        }
                    } else {
                        var3[var7] = class40.field807;
                    }
                } else {
                    var3[var7] = class220.field4000;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    public class101() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILqk;I)V")
    public static final void method739(int arg0, class207 arg1, int arg2) {
        ++field1825;
        class207 var3 = arg1.method1432((byte) 108).method1423(113);
        boolean var4 = false;
        for (int var5 = 0; ~class31.field629 < ~var5; ++var5) {
            class14 var6 = class169.field2953[class10.field149[var5]];
            if (var6 != null && var6.field209 != null && var6.field209.method1462(var3, true)) {
                class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 1, var6.field5022[0], 0, 0, false, var6.field5074[0], 0, 1, 2);
                if (~arg0 != -2) {
                    if (~arg0 != -5) {
                        if (~arg0 != -6) {
                            if (arg0 != 6) {
                                if (~arg0 == -8) {
                                    ++class207.field3666;
                                    class261.field4645.method767(224, (byte) 115);
                                    class261.field4645.method1042(class10.field149[var5], -106);
                                }
                            } else {
                                class261.field4645.method767(192, (byte) 106);
                                class261.field4645.method1042(class10.field149[var5], -109);
                                ++class244.field4429;
                            }
                        } else {
                            class261.field4645.method767(195, (byte) 38);
                            class261.field4645.method1083(false, class10.field149[var5]);
                            ++class5.field72;
                        }
                    } else {
                        ++class71.field1261;
                        class261.field4645.method767(70, (byte) 69);
                        class261.field4645.method1033((byte) 16, class10.field149[var5]);
                    }
                } else {
                    ++class1.field22;
                    class261.field4645.method767(79, (byte) 50);
                    class261.field4645.method1042(class10.field149[var5], -122);
                }
                var4 = true;
                break;
            }
        }
        if (arg2 > -121) {
            method741(-1);
        }
        if (!var4) {
            class71.method511(23692, class100.field1800, 0, class105.method757(false, new class207[] { class261.field4658, var3 }));
        }
    }

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "(I)V")
    private final void method740(int arg0) {
        ++field1824;
        Random var2 = new Random((long) this.field1820);
        this.field1821 = new short[512];
        if (arg0 != 17694278) {
            this.method31((byte) -127, 1);
        }
        if (~this.field1816 < -1) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field1821[var3] = (short) class93.method667(this.field1816, 15901, var2);
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "(I)V")
    public static void method741(int arg0) {
        field1830 = null;
        field1822 = null;
        field1815 = null;
        field1829 = null;
        field1833 = null;
        field1832 = null;
        if (arg0 != 0) {
            method741(-68);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field1814 = arg0.method1045((byte) -83);
                                }
                            } else {
                                this.field1812 = arg0.method1045((byte) 79);
                            }
                        } else {
                            this.field1818 = arg0.method1045((byte) -117);
                        }
                    } else {
                        this.field1813 = arg0.method1045((byte) -21);
                    }
                } else {
                    this.field1816 = arg0.method1050(1272006568);
                }
            } else {
                this.field1820 = arg0.method1045((byte) -54);
            }
        } else {
            this.field1812 = this.field1814 = arg0.method1045((byte) 115);
        }
        ++field1828;
        if (arg1 != 5877) {
            this.method740(55);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILv;)V")
    public static final void method742(int arg0, class149 arg1) {
        ++field1826;
        int var2 = 49 / ((arg0 - -49) / 60);
        while (true) {
            while (arg1.field2568.length > arg1.field2593) {
                boolean var3 = false;
                int var4 = 0;
                int var5 = 0;
                if (~arg1.method1045((byte) -108) == -2) {
                    var3 = true;
                    var4 = arg1.method1045((byte) -98);
                    var5 = arg1.method1045((byte) 75);
                }
                int var6 = arg1.method1045((byte) 96);
                int var7 = arg1.method1045((byte) -114);
                int var8 = var6 * 64 + -class198.field3473;
                int var9 = class70.field1253 + -1 + -(var7 * 64) - -class111.field1932;
                if (var8 >= 0 && ~(var9 + -63) <= -1 && var8 + 63 < class197.field3463 && var9 < class70.field1253) {
                    int var10 = var8 >> 6;
                    int var11 = var9 >> 6;
                    for (int var12 = 0; var12 < 64; ++var12) {
                        for (int var13 = 0; ~var13 > -65; ++var13) {
                            if (!var3 || var12 >= var4 * 8 && var4 * 8 - -8 > var12 && ~var13 <= ~(var5 * 8) && var5 * 8 + 8 > var13) {
                                byte var14 = arg1.method1084((byte) 49);
                                if (var14 != 0) {
                                    if (class72.field1327[var10][var11] == null) {
                                        class72.field1327[var10][var11] = new byte[4096];
                                    }
                                    class72.field1327[var10][var11][(-var13 + 63 << 6) + var12] = var14;
                                    byte var15 = arg1.method1084((byte) 49);
                                    if (class161.field2854[var10][var11] == null) {
                                        class161.field2854[var10][var11] = new byte[4096];
                                    }
                                    class161.field2854[var10][var11][(-var13 + 63 << 6) + var12] = var15;
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; (var3 ? 64 : 4096) > var16; ++var16) {
                        byte var17 = arg1.method1084((byte) 49);
                        if (var17 != 0) {
                            ++arg1.field2593;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V")
    public final void method50(int arg0) {
        this.field1827 = class199.method1377(this.field1820, (byte) -22);
        ++field1817;
        if (arg0 < 14) {
            method742(21, (class149) null);
        }
        this.method740(17694278);
    }
}
