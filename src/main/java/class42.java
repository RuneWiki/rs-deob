import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class42 extends class214 {

    @OriginalMember(owner = "client!mv", name = "L", descriptor = "[S")
    private short[] field728 = new short[512];

    @OriginalMember(owner = "client!mv", name = "J", descriptor = "I")
    private int field726 = 0;

    @OriginalMember(owner = "client!mv", name = "E", descriptor = "I")
    private int field721 = 5;

    @OriginalMember(owner = "client!mv", name = "D", descriptor = "[B")
    private byte[] field720 = new byte[512];

    @OriginalMember(owner = "client!mv", name = "H", descriptor = "I")
    private int field724 = 1;

    @OriginalMember(owner = "client!mv", name = "G", descriptor = "I")
    private int field723 = 2048;

    @OriginalMember(owner = "client!mv", name = "I", descriptor = "I")
    private int field725 = 2;

    @OriginalMember(owner = "client!mv", name = "Q", descriptor = "I")
    private int field733 = 5;

    @OriginalMember(owner = "client!mv", name = "F", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!mv", name = "K", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!mv", name = "M", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!mv", name = "N", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!mv", name = "O", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!mv", name = "P", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "(I)V")
    public final void method65(int arg0) {
        ++field731;
        if (arg0 >= 48) {
            this.field720 = class103.method851(this.field726, (byte) -71);
            this.method452(118);
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IILei;B)V")
    public static final void method451(int arg0, int arg1, class180 arg2, byte arg3) {
        ++field730;
        if (class32.field304) {
            int var4 = 0;
            int var5 = -41 % ((arg3 - 16) / 53);
            for (class208 var6 = (class208) arg2.field3055.method3772(true); var6 != null; var6 = (class208) arg2.field3055.method3780(23774)) {
                int var11 = class271.method1785((byte) 109, var6);
                if (~var11 < ~var4) {
                    var4 = var11;
                }
            }
            var4 += 8;
            class304.field4621 = (class207.field3468 ? 26 : 22) + arg2.field3056 * 16;
            int var7 = arg2.field3056 * 16 + 21;
            int var8 = class713.field10029 + class662.field9427;
            if (var4 + var8 > class660.field9408) {
                var8 = class713.field10029 - var4;
            }
            if (var8 < 0) {
                var8 = 0;
            }
            int var9 = !class207.field3468 ? 31 : 33;
            int var10 = arg0 + 13 + -var9;
            if (class412.field6066 < var7 + var10) {
                var10 = -var7 + class412.field6066;
            }
            if (~var10 > -1) {
                var10 = 0;
            }
            class598.field8460 = var8;
            class265.field4129 = var4;
            class85.field1258 = var10;
            class74.field1107 = arg2;
        }
    }

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "(I)V")
    private final void method452(int arg0) {
        if (arg0 > 111) {
            ++field722;
            Random var2 = new Random((long) this.field726);
            this.field728 = new short[512];
            if (~this.field723 < -1) {
                for (int var3 = 0; ~var3 > -513; ++var3) {
                    this.field728[var3] = (short) class721.method3975(this.field723, var2, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        ++field729;
        int[] var3 = super.field3544.method3869(arg0, -116);
        if (super.field3544.field9836) {
            int var4 = 2048 - -(class131.field2138[arg0] * this.field733);
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; class626.field8787 > var7; ++var7) {
                class569.field8082 = Integer.MAX_VALUE;
                class247.field3962 = Integer.MAX_VALUE;
                class458.field6645 = Integer.MAX_VALUE;
                class364.field5574 = Integer.MAX_VALUE;
                int var8 = 2048 - -(class592.field8328[var7] * this.field721);
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                    int var13 = 255 & this.field720[255 & (this.field733 > var11 ? var11 : -this.field733 + var11)];
                    for (int var14 = var9 + -1; var14 <= var10; ++var14) {
                        int var15 = (this.field720[255 & (this.field721 > var14 ? var14 : -this.field721 + var14) + var13] & 255) * 2;
                        int var27 = var15 + 1;
                        int var16 = -this.field728[var15] + -(var14 << 12) + var8;
                        int var17 = -this.field728[var27] + var4 + -(var11 << 12);
                        int var18 = this.field724;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (~var18 != -5) {
                                    if (~var18 != -6) {
                                        if (~var18 == -3) {
                                            var19 = (~var16 <= -1 ? var16 : -var16) - -(~var17 > -1 ? -var17 : var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var21 - -var20) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var17 >= 0 ? var17 : -var17;
                                int var26 = var16 < 0 ? -var16 : var16;
                                var19 = var26 <= var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (var19 < class364.field5574) {
                            class569.field8082 = class247.field3962;
                            class247.field3962 = class458.field6645;
                            class458.field6645 = class364.field5574;
                            class364.field5574 = var19;
                        } else if (class458.field6645 <= var19) {
                            if (~class247.field3962 < ~var19) {
                                class569.field8082 = class247.field3962;
                                class247.field3962 = var19;
                            } else if (var19 < class569.field8082) {
                                class569.field8082 = var19;
                            }
                        } else {
                            class569.field8082 = class247.field3962;
                            class247.field3962 = class458.field6645;
                            class458.field6645 = var19;
                        }
                    }
                }
                int var12 = this.field725;
                if (var12 != 0) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (var12 == 2) {
                                    var3[var7] = -class364.field5574 + class458.field6645;
                                }
                            } else {
                                var3[var7] = class569.field8082;
                            }
                        } else {
                            var3[var7] = class247.field3962;
                        }
                    } else {
                        var3[var7] = class458.field6645;
                    }
                } else {
                    var3[var7] = class364.field5574;
                }
            }
        }
        if (arg1 != 5) {
            this.field733 = 36;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILofa;I)V")
    public final void method59(int arg0, class301 arg1, int arg2) {
        ++field732;
        if (arg0 <= 92) {
            field727 = 127;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field733 = arg1.method1987(-18);
                                }
                            } else {
                                this.field721 = arg1.method1987(-39);
                            }
                        } else {
                            this.field724 = arg1.method1987(-117);
                        }
                    } else {
                        this.field725 = arg1.method1987(-25);
                    }
                } else {
                    this.field723 = arg1.method1989((byte) -105);
                }
            } else {
                this.field726 = arg1.method1987(-100);
            }
        } else {
            this.field721 = this.field733 = arg1.method1987(-29);
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z[[[BIBIIZ)V")
    public static final void method453(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg0 ? 1 : 0;
        class641.field9058 = 0;
        class8.field77 = 0;
        ++class245.field3946;
        if ((arg5 & 2) == 0) {
            for (class668 var8 = class335.field4904[var7]; var8 != null; var8 = var8.field9472) {
                if (!class515.method3084(var8, arg0, arg1, arg2, arg3)) {
                    class313.method2060(var8);
                    if (var8.field9480 != -1) {
                        class563.field7976[class641.field9058++] = var8;
                    }
                }
            }
        }
        if ((arg5 & 1) == 0) {
            for (class668 var9 = class231.field3722[var7]; var9 != null; var9 = var9.field9472) {
                if (!class515.method3084(var9, arg0, arg1, arg2, arg3)) {
                    class313.method2060(var9);
                    if (var9.field9480 != -1) {
                        class553.field7883[class8.field77++] = var9;
                    }
                }
            }
            for (class668 var10 = class24.field240[var7]; var10 != null; var10 = var10.field9472) {
                if (!class515.method3084(var10, arg0, arg1, arg2, arg3)) {
                    if (var10.method86(0)) {
                        class313.method2060(var10);
                        if (var10.field9480 != -1) {
                            class553.field7883[class8.field77++] = var10;
                        }
                    } else {
                        class313.method2060(var10);
                        if (var10.field9480 != -1) {
                            class563.field7976[class641.field9058++] = var10;
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var11 = 0; var11 < class266.field4132; ++var11) {
                    if (!class515.method3084(class81.field1166[var11], arg0, arg1, arg2, arg3)) {
                        class313.method2060(class81.field1166[var11]);
                        if (class81.field1166[var11].field9480 != -1) {
                            if (class81.field1166[var11].method86(0)) {
                                class553.field7883[class8.field77++] = class81.field1166[var11];
                            } else {
                                class563.field7976[class641.field9058++] = class81.field1166[var11];
                            }
                        }
                    }
                }
            }
        }
        if (class641.field9058 > 0) {
            class315.method2074(class563.field7976, 0, class641.field9058 - 1);
            for (int var12 = 0; var12 < class641.field9058; ++var12) {
                class443.method2715(class563.field7976[var12], true, arg6);
            }
        }
        if (class532.field7660) {
            class478.field6933.method339(0, (class759[]) null);
        }
        if ((arg5 & 2) == 0) {
            for (int var13 = class719.field10080; var13 < class386.field5782; ++var13) {
                if (var13 >= arg2 && arg1 != null) {
                    int var14 = class52.field838.length;
                    if (class52.field838.length + class51.field822 > field727) {
                        var14 -= class52.field838.length + class51.field822 - field727;
                    }
                    int var15 = class52.field838[0].length;
                    if (class52.field838[0].length + class398.field5922 > class54.field870) {
                        var15 -= class52.field838[0].length + class398.field5922 - class54.field870;
                    }
                    boolean[][] var16 = class135.field2156;
                    if (class656.field9336) {
                        if (class238.field3835) {
                            var16 = class314.field4726[var13];
                        }
                        for (int var17 = class121.field1866; var17 < var14; ++var17) {
                            int var18 = class51.field822 + var17 - class121.field1866;
                            for (int var19 = class472.field6845; var19 < var15; ++var19) {
                                var16[var17][var19] = false;
                                if (class52.field838[var17][var19]) {
                                    int var20 = class398.field5922 + var19 - class472.field6845;
                                    for (int var21 = var13; var21 >= 0; --var21) {
                                        if (class488.field7062[var21][var18][var20] != null && class488.field7062[var21][var18][var20].field1766 == var13) {
                                            if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class429.method2671(var13, (byte) -115, var18, var20)) {
                                                var16[var17][var19] = true;
                                                break;
                                            }
                                            var16[var17][var19] = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class238.field3835) {
                        if (arg4 >= 0) {
                            class211.field3511[var13].method630(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
                        } else {
                            class211.field3511[var13].method628(0, 0, 0, (boolean[][]) null, false, arg5);
                        }
                        for (int var22 = 0; var22 < class23.field228; ++var22) {
                            class222.field3605[var22].method1686(new class32(var13 + 1), (byte) 102);
                        }
                    } else if (arg4 >= 0) {
                        class211.field3511[var13].method630(class336.field4923, class63.field996, class155.field2405, class135.field2156, false, arg4, arg5);
                    } else {
                        class211.field3511[var13].method628(class336.field4923, class63.field996, class155.field2405, class135.field2156, false, arg5);
                    }
                } else {
                    int var23 = class52.field838.length;
                    if (class52.field838.length + class51.field822 > field727) {
                        var23 -= class52.field838.length + class51.field822 - field727;
                    }
                    int var24 = class52.field838[0].length;
                    if (class52.field838[0].length + class398.field5922 > class54.field870) {
                        var24 -= class52.field838[0].length + class398.field5922 - class54.field870;
                    }
                    boolean[][] var25 = class135.field2156;
                    if (class656.field9336) {
                        if (class238.field3835) {
                            var25 = class314.field4726[var13];
                        }
                        for (int var26 = class121.field1866; var26 < var23; ++var26) {
                            int var27 = class51.field822 + var26 - class121.field1866;
                            for (int var28 = class472.field6845; var28 < var24; ++var28) {
                                if (class52.field838[var26][var28] && !class429.method2671(var13, (byte) -60, var27, class398.field5922 + var28 - class472.field6845)) {
                                    var25[var26][var28] = true;
                                } else {
                                    var25[var26][var28] = false;
                                }
                            }
                        }
                    }
                    if (class238.field3835) {
                        if (arg4 >= 0) {
                            class211.field3511[var13].method630(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
                        } else {
                            class211.field3511[var13].method628(0, 0, 0, (boolean[][]) null, false, arg5);
                        }
                        for (int var29 = 0; var29 < class23.field228; ++var29) {
                            class222.field3605[var29].method1686(new class32(var13 + 1), (byte) 127);
                        }
                    } else if (arg4 >= 0) {
                        class211.field3511[var13].method630(class336.field4923, class63.field996, class155.field2405, class135.field2156, true, arg4, arg5);
                    } else {
                        class211.field3511[var13].method628(class336.field4923, class63.field996, class155.field2405, class135.field2156, true, arg5);
                    }
                }
            }
        }
        if (class8.field77 > 0) {
            class54.method505(class553.field7883, 0, class8.field77 - 1);
            for (int var30 = 0; var30 < class8.field77; ++var30) {
                class443.method2715(class553.field7883[var30], true, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "()V")
    public class42() {
        super(0, true);
    }
}
