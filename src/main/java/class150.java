import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class150 extends class273 {

    @OriginalMember(owner = "client!ib", name = "hb", descriptor = "I")
    private int field2796 = 0;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "I")
    private int field2784 = 0;

    @OriginalMember(owner = "client!ib", name = "kb", descriptor = "I")
    private int field2799 = 0;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "Ljd;")
    public static class86 field2781 = class122.method868("Weiter", true);

    @OriginalMember(owner = "client!ib", name = "db", descriptor = "I")
    public static int field2792 = 0;

    @OriginalMember(owner = "client!ib", name = "ib", descriptor = "Ljd;")
    public static class86 field2797 = class122.method868("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", true);

    @OriginalMember(owner = "client!ib", name = "pb", descriptor = "I")
    public static volatile int field2804 = -1;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "I")
    private int field2782;

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "I")
    private int field2783;

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "I")
    private int field2788;

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "I")
    private int field2789;

    @OriginalMember(owner = "client!ib", name = "bb", descriptor = "I")
    private int field2790;

    @OriginalMember(owner = "client!ib", name = "cb", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!ib", name = "eb", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!ib", name = "fb", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!ib", name = "jb", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!ib", name = "lb", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!ib", name = "mb", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!ib", name = "nb", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!ib", name = "ob", descriptor = "I")
    private int field2803;

    @OriginalMember(owner = "client!ib", name = "qb", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!ib", name = "gb", descriptor = "Lod;")
    public static class90 field2795;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)Z")
    public static final boolean method1064(int arg0) {
        ++field2800;
        try {
            if (~(++class176.field3203) < -1501) {
                if (class248.field4415 != null) {
                    class248.field4415.method207((byte) 99);
                    class248.field4415 = null;
                    class30.method194(arg0 + 1);
                    return true;
                } else if (class21.field545 < 1) {
                    class161.field3024 = 0;
                    ++class21.field545;
                    if (~class260.field4648 == ~class179.field3233) {
                        class260.field4648 = class187.field3314;
                    } else {
                        class260.field4648 = class179.field3233;
                    }
                    class176.field3203 = 0;
                    return false;
                } else {
                    class30.method194(arg0 ^ 1);
                    return true;
                }
            } else if (class161.field3024 != arg0) {
                if (class161.field3024 != 1) {
                    if (class161.field3024 == 2) {
                        if (class248.field4415.method208(arg0 + -11084) < 1) {
                            return false;
                        } else {
                            class155.field2938 <<= 8;
                            class155.field2938 += class248.field4415.method204(-30290);
                            class161.field3024 = 3;
                            class257.field4560 = new byte[class155.field2938];
                            class257.field4560[0] = (byte) (class155.field2938 >> 8);
                            class257.field4560[1] = (byte) class1.method5(class155.field2938, 255);
                            return false;
                        }
                    } else {
                        int var1 = class248.field4415.method208(-11084);
                        if (~var1 > -2) {
                            return false;
                        } else {
                            class248.field4415.method210(class257.field4560, (byte) -85, class204.field3690, var1);
                            class204.field3690 += var1;
                            if (~class155.field2938 < ~class204.field3690) {
                                return false;
                            } else {
                                int var2 = 0;
                                class161.method1171(0, class257.field4560);
                                class209.field3783 = new class239[class122.field2359];
                                for (int var3 = class82.field1609; var3 <= class190.field3375; ++var3) {
                                    class239 var4 = class50.method383((byte) -121, var3);
                                    if (var4 != null) {
                                        class209.field3783[var2++] = var4;
                                    }
                                }
                                class248.field4415.method207((byte) 100);
                                class248.field4415 = null;
                                class30.method194(arg0 + 1);
                                return true;
                            }
                        }
                    }
                } else if (class183.field3266.field613 == 2) {
                    throw new IOException();
                } else if (~class183.field3266.field613 != -2) {
                    return false;
                } else {
                    class248.field4415 = new class31((Socket) class183.field3266.field611, class157.field2954);
                    class183.field3266 = null;
                    class36.field809.field3565 = 0;
                    int var5 = 0;
                    if (class83.field1616) {
                        var5 = class203.field3680;
                    }
                    class36.field809.method1388(-114, 125);
                    class36.field809.method1406(arg0 ^ 1472534024, var5);
                    class248.field4415.method209(class36.field809.field3547, 4900, class36.field809.field3565, 0);
                    if (class25.field601 != null) {
                        class25.field601.method355((byte) 81);
                    }
                    if (class76.field1517 != null) {
                        class76.field1517.method355((byte) 74);
                    }
                    class155.field2938 = class248.field4415.method204(arg0 ^ -30290);
                    if (class25.field601 != null) {
                        class25.field601.method355((byte) 77);
                    }
                    if (class76.field1517 != null) {
                        class76.field1517.method355((byte) 71);
                    }
                    class161.field3024 = 2;
                    return false;
                }
            } else if (class86.field1665 > -5000L + class253.method1711((byte) -106)) {
                return true;
            } else {
                class86.field1665 = class253.method1711((byte) -62);
                class183.field3266 = class157.field2954.method1715(class217.field3909, class260.field4648, true);
                class161.field3024 = 1;
                return false;
            }
        } catch (IOException var6) {
            if (class248.field4415 != null) {
                class248.field4415.method207((byte) 109);
                class248.field4415 = null;
            }
            if (~class21.field545 > -2) {
                class161.field3024 = 0;
                if (~class260.field4648 == ~class179.field3233) {
                    class260.field4648 = class187.field3314;
                } else {
                    class260.field4648 = class179.field3233;
                }
                class176.field3203 = 0;
                ++class21.field545;
                return false;
            } else {
                class30.method194(1);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
    public class150() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        ++field2798;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field2784 = (arg1.method1412((byte) 124) << 12) / 100;
                }
            } else {
                this.field2796 = (arg1.method1412((byte) 108) << 12) / 100;
            }
        } else {
            this.field2799 = arg1.method1421((byte) -70);
        }
        if (arg2 > -16) {
            this.method1067(48, -85, -128, (byte) 113);
        }
    }

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)V")
    public static void method1065(int arg0) {
        field2781 = null;
        field2797 = null;
        if (arg0 != -27757) {
            field2795 = null;
        }
        field2795 = null;
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(B)V")
    public static final void method1066(byte arg0) {
        class81.field1592.method703((byte) 122);
        ++field2793;
        int var1 = 12 / ((-92 - arg0) / 32);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIB)V")
    private final void method1067(int arg0, int arg1, int arg2, byte arg3) {
        ++field2791;
        int var5 = 12 / ((arg3 - -50) / 61);
        int var6 = ~arg1 > ~arg0 ? arg0 : arg1;
        int var7 = var6 < arg2 ? arg2 : var6;
        int var8 = arg0 < arg1 ? arg0 : arg1;
        int var9 = arg2 >= var8 ? var8 : arg2;
        int var10 = -var9 + var7;
        this.field2783 = (var7 + var9) / 2;
        if (~var10 < -1) {
            int var11 = (-arg0 + var7 << 12) / var10;
            int var12 = (-arg2 + var7 << 12) / var10;
            int var13 = (-arg1 + var7 << 12) / var10;
            if (~arg0 != ~var7) {
                if (~arg1 != ~var7) {
                    this.field2790 = arg0 == var9 ? var13 + 12288 : 20480 - var11;
                } else {
                    this.field2790 = ~arg2 == ~var9 ? var11 + 4096 : 12288 - var12;
                }
            } else {
                this.field2790 = arg1 != var9 ? -var13 + 4096 : 20480 - -var12;
            }
            this.field2790 /= 6;
        } else {
            this.field2790 = 0;
        }
        if (this.field2783 > 0 && this.field2783 < 4096) {
            this.field2803 = (var10 << 12) / (~this.field2783 >= -2049 ? this.field2783 * 2 : 8192 - this.field2783 * 2);
        } else {
            this.field2803 = 0;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)[[I")
    public final int[][] method29(int arg0, byte arg1) {
        int var3 = -22 / ((arg1 - 12) / 58);
        int[][] var4 = super.field4787.method1657(arg0, (byte) -99);
        if (super.field4787.field4355) {
            int[][] var5 = this.method1859(arg0, 0, 3);
            int[] var6 = var5[1];
            int[] var7 = var5[0];
            int[] var8 = var5[2];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int[] var11 = var4[0];
            for (int var12 = 0; var12 < class176.field3200; ++var12) {
                this.method1067(var7[var12], var6[var12], var8[var12], (byte) -119);
                this.field2803 += this.field2796;
                if (~this.field2803 > -1) {
                    this.field2803 = 0;
                }
                this.field2783 += this.field2784;
                if (~this.field2803 < -4097) {
                    this.field2803 = 4096;
                }
                if (this.field2783 < 0) {
                    this.field2783 = 0;
                }
                if (this.field2783 > 4096) {
                    this.field2783 = 4096;
                }
                for (this.field2790 += this.field2799; ~this.field2790 > -1; this.field2790 += 4096) {
                }
                while (this.field2790 > 4096) {
                    this.field2790 -= 4096;
                }
                this.method1070(this.field2783, this.field2790, -3, this.field2803);
                var11[var12] = this.field2788;
                var9[var12] = this.field2789;
                var10[var12] = this.field2782;
            }
        }
        ++field2801;
        return var4;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBLjd;)V")
    public static final void method1068(int arg0, byte arg1, class86 arg2) {
        ++field2785;
        class86 var3 = arg2.method586(122).method608((byte) 49);
        boolean var4 = false;
        if (arg1 < -87) {
            for (int var5 = 0; ~var5 > ~class209.field3786; ++var5) {
                class224 var6 = class186.field3294[class142.field2689[var5]];
                if (var6 != null && var6.field4029 != null && var6.field4029.method631(12508, var3)) {
                    var4 = true;
                    class48.method375(1, 0, false, class124.field2412.field707[0], var6.field707[0], 0, 0, 2, var6.field705[0], class124.field2412.field705[0], 1, -24761);
                    if (arg0 != 1) {
                        if (arg0 == 4) {
                            ++class129.field2471;
                            class36.field809.method1356(199, true);
                            class36.field809.method1396(class142.field2689[var5], -718541592);
                        } else if (~arg0 != -6) {
                            if (arg0 != 6) {
                                if (arg0 == 7) {
                                    class36.field809.method1356(133, true);
                                    class36.field809.method1418(127, class142.field2689[var5]);
                                    ++class41.field934;
                                }
                            } else {
                                ++class21.field541;
                                class36.field809.method1356(84, true);
                                class36.field809.method1428((byte) 13, class142.field2689[var5]);
                            }
                        } else {
                            ++class144.field2726;
                            class36.field809.method1356(109, true);
                            class36.field809.method1418(117, class142.field2689[var5]);
                        }
                    } else {
                        ++class116.field2202;
                        class36.field809.method1356(248, true);
                        class36.field809.method1396(class142.field2689[var5], -718541592);
                    }
                    break;
                }
            }
            if (!var4) {
                class58.method423(class109.method783(2, new class86[] { class268.field4725, var3 }), false, 0, class56.field1155);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)V")
    public static final void method1069(int arg0, int arg1) {
        ++field2802;
        class263.field4665.method693(6, arg0);
        if (arg1 != 2312) {
            field2795 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V")
    private final void method1070(int arg0, int arg1, int arg2, int arg3) {
        ++field2786;
        int var5 = arg0 > 2048 ? -(arg0 * arg3 >> 12) + arg0 + arg3 : (arg3 + 4096) * arg0 >> 12;
        if (var5 <= 0) {
            this.field2788 = this.field2789 = this.field2782 = arg0;
        } else {
            int var6 = arg1 * 6;
            int var7 = arg0 - -arg0 + -var5;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = var5 - var13;
            if (var9 != 0) {
                if (var9 != 1) {
                    if (~var9 != -3) {
                        if (var9 != 3) {
                            if (var9 != 4) {
                                if (var9 == 5) {
                                    this.field2782 = var15;
                                    this.field2789 = var7;
                                    this.field2788 = var5;
                                }
                            } else {
                                this.field2782 = var5;
                                this.field2789 = var7;
                                this.field2788 = var14;
                            }
                        } else {
                            this.field2788 = var7;
                            this.field2789 = var15;
                            this.field2782 = var5;
                        }
                    } else {
                        this.field2789 = var5;
                        this.field2788 = var7;
                        this.field2782 = var14;
                    }
                } else {
                    this.field2782 = var7;
                    this.field2789 = var5;
                    this.field2788 = var15;
                }
            } else {
                this.field2788 = var5;
                this.field2789 = var14;
                this.field2782 = var7;
            }
        }
        if (arg2 != -3) {
            this.method29(-107, (byte) -120);
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(II)Lua;")
    public static final class112 method1071(int arg0, int arg1) {
        ++field2794;
        class112 var2 = (class112) class3.field35.method395((long) arg1, (byte) 115);
        if (var2 != null) {
            return var2;
        } else {
            int var3 = -29 / ((arg0 - 4) / 52);
            byte[] var4 = class105.field2011.method1084((byte) -125, 26, arg1);
            class112 var5 = new class112();
            if (var4 != null) {
                var5.method786((byte) 119, new class200(var4));
            }
            class3.field35.method398((long) arg1, (byte) 116, var5);
            return var5;
        }
    }
}
