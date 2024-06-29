import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class173 extends class175 {

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "I")
    private int field2887 = 5;

    @OriginalMember(owner = "client!k", name = "X", descriptor = "I")
    private int field2893 = 2;

    @OriginalMember(owner = "client!k", name = "V", descriptor = "I")
    private int field2892 = 0;

    @OriginalMember(owner = "client!k", name = "M", descriptor = "I")
    private int field2883 = 2048;

    @OriginalMember(owner = "client!k", name = "bb", descriptor = "[B")
    private byte[] field2897 = new byte[512];

    @OriginalMember(owner = "client!k", name = "cb", descriptor = "I")
    private int field2898 = 5;

    @OriginalMember(owner = "client!k", name = "Y", descriptor = "[S")
    private short[] field2894 = new short[512];

    @OriginalMember(owner = "client!k", name = "ab", descriptor = "I")
    private int field2896 = 1;

    @OriginalMember(owner = "client!k", name = "R", descriptor = "Lij;")
    private static class50 field2888 = class78.method578(124, "Started 3d library");

    @OriginalMember(owner = "client!k", name = "T", descriptor = "Lij;")
    public static class50 field2890 = field2888;

    @OriginalMember(owner = "client!k", name = "L", descriptor = "Lpe;")
    public static class100 field2882 = new class100(64);

    @OriginalMember(owner = "client!k", name = "fb", descriptor = "Lij;")
    private static class50 field2901 = class78.method578(124, "Loading textures )2 ");

    @OriginalMember(owner = "client!k", name = "gb", descriptor = "Lij;")
    public static class50 field2902 = field2901;

    @OriginalMember(owner = "client!k", name = "ib", descriptor = "I")
    public static int field2904 = 0;

    @OriginalMember(owner = "client!k", name = "K", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!k", name = "N", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!k", name = "O", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!k", name = "P", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!k", name = "S", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!k", name = "U", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!k", name = "Z", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!k", name = "db", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!k", name = "eb", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!k", name = "hb", descriptor = "Lda;")
    public static class22 field2903;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "(I)V")
    public final void method44(int arg0) {
        if (arg0 == 0) {
            this.field2897 = class48.method358(50, this.field2892);
            this.method1193((byte) 6);
            ++field2884;
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
    public class173() {
        super(0, true);
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(B)V")
    public static final void method1191(byte arg0) {
        ++field2891;
        if (arg0 == -2) {
            int var1 = class46.field843 + class239.field4067.field3990;
            if (!class46.field846[96]) {
                if (!class46.field846[97]) {
                    class188.field3103 /= 2;
                } else {
                    class188.field3103 += (-class188.field3103 + 24) / 2;
                }
            } else {
                class188.field3103 += (-class188.field3103 + -24) / 2;
            }
            class160.field2758 += class188.field3103 / 2;
            int var2 = class207.field3443 + class239.field4067.field4027;
            if (class46.field846[98]) {
                class118.field2077 += (-class118.field2077 + 12) / 2;
            } else if (class46.field846[99]) {
                class118.field2077 += (-12 - class118.field2077) / 2;
            } else {
                class118.field2077 /= 2;
            }
            class19.field406 += class118.field2077 / 2;
            if (~(-var1 + class17.field376) > 499 || -var1 + class17.field376 > 500 || ~(-var2 + class161.field2768) > 499 || ~(-var2 + class161.field2768) < -501) {
                class161.field2768 = var2;
                class17.field376 = var1;
            }
            if (class161.field2768 != var2) {
                class161.field2768 += (-class161.field2768 + var2) / 16;
            }
            if (~class17.field376 != ~var1) {
                class17.field376 += (-class17.field376 + var1) / 16;
            }
            class3.method20(-126);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1192(int arg0, byte[] arg1) {
        ++field2899;
        if (arg0 <= 57) {
            return null;
        } else {
            int var2 = arg1.length;
            byte[] var3 = new byte[var2];
            class105.method792(arg1, 0, var3, 0, var2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!k", name = "e", descriptor = "(B)V")
    private final void method1193(byte arg0) {
        int var2 = -72 % ((65 - arg0) / 50);
        ++field2889;
        Random var3 = new Random((long) this.field2892);
        this.field2894 = new short[512];
        if (this.field2883 > 0) {
            for (int var4 = 0; var4 < 512; ++var4) {
                this.field2894[var4] = (short) class63.method494(var3, -32752, this.field2883);
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        if (!arg0) {
            method1197(27);
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field2898 = arg2.method1487(255);
                                }
                            } else {
                                this.field2887 = arg2.method1487(255);
                            }
                        } else {
                            this.field2896 = arg2.method1487(255);
                        }
                    } else {
                        this.field2893 = arg2.method1487(255);
                    }
                } else {
                    this.field2883 = arg2.method1441(91);
                }
            } else {
                this.field2892 = arg2.method1487(255);
            }
        } else {
            this.field2887 = this.field2898 = arg2.method1487(255);
        }
        ++field2886;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        int[] var3 = super.field2941.method1427(-21281, arg0);
        if (arg1 != -27746) {
            return null;
        } else {
            ++field2895;
            if (super.field2941.field3565) {
                int var4 = class29.field616[arg0] * this.field2898 + 2048;
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; class211.field3514 > var7; ++var7) {
                    class86.field1663 = Integer.MAX_VALUE;
                    class219.field3656 = Integer.MAX_VALUE;
                    class260.field4531 = Integer.MAX_VALUE;
                    class216.field3570 = Integer.MAX_VALUE;
                    int var8 = 2048 - -(class129.field2272[var7] * this.field2887);
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    for (int var11 = var5 - 1; ~var11 >= ~var6; ++var11) {
                        int var13 = 255 & this.field2897[(var11 >= this.field2898 ? -this.field2898 + var11 : var11) & 255];
                        for (int var14 = var9 + -1; ~var10 <= ~var14; ++var14) {
                            int var15 = 2 * (this.field2897[(~this.field2887 >= ~var14 ? -this.field2887 + var14 : var14) + var13 & 255] & 255);
                            int var27 = var15 + 1;
                            int var16 = var8 - (this.field2894[var15] - -(var14 << 12));
                            int var17 = var4 - this.field2894[var27] - (var11 << 12);
                            int var18 = this.field2896;
                            int var19;
                            if (~var18 != -2) {
                                if (~var18 != -4) {
                                    if (~var18 != -5) {
                                        if (~var18 != -6) {
                                            if (~var18 == -3) {
                                                var19 = (var17 >= 0 ? var17 : -var17) + (var16 >= 0 ? var16 : -var16);
                                            } else {
                                                var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                            }
                                        } else {
                                            int var20 = var16 * var16;
                                            int var21 = var17 * var17;
                                            var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                        }
                                    } else {
                                        int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)));
                                        int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)));
                                        int var24 = var22 - -var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = ~var16 <= -1 ? var16 : -var16;
                                    int var26 = ~var17 <= -1 ? var17 : -var17;
                                    var19 = ~var26 <= ~var25 ? var26 : var25;
                                }
                            } else {
                                var19 = var16 * var16 - -(var17 * var17) >> 12;
                            }
                            if (~var19 > ~class216.field3570) {
                                class86.field1663 = class219.field3656;
                                class219.field3656 = class260.field4531;
                                class260.field4531 = class216.field3570;
                                class216.field3570 = var19;
                            } else if (var19 >= class260.field4531) {
                                if (~class219.field3656 >= ~var19) {
                                    if (var19 < class86.field1663) {
                                        class86.field1663 = var19;
                                    }
                                } else {
                                    class86.field1663 = class219.field3656;
                                    class219.field3656 = var19;
                                }
                            } else {
                                class86.field1663 = class219.field3656;
                                class219.field3656 = class260.field4531;
                                class260.field4531 = var19;
                            }
                        }
                    }
                    int var12 = this.field2893;
                    if (~var12 != -1) {
                        if (~var12 != -2) {
                            if (var12 != 3) {
                                if (var12 != 4) {
                                    if (var12 == 2) {
                                        var3[var7] = -class216.field3570 + class260.field4531;
                                    }
                                } else {
                                    var3[var7] = class86.field1663;
                                }
                            } else {
                                var3[var7] = class219.field3656;
                            }
                        } else {
                            var3[var7] = class260.field4531;
                        }
                    } else {
                        var3[var7] = class216.field3570;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(II)V")
    public static final void method1194(int arg0, int arg1) {
        ++field2900;
        for (class199 var2 = (class199) class232.field3896.method446(1); var2 != null; var2 = (class199) class232.field3896.method448((byte) 54)) {
            if (~((long) arg0) == ~(var2.field635 >> 48 & 65535L)) {
                var2.method267(112);
            }
        }
        if (arg1 <= 64) {
            field2888 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BI[B)I")
    public static final int method1195(byte arg0, int arg1, byte[] arg2) {
        ++field2885;
        int var3 = 10 % ((arg0 - 26) / 52);
        return class5.method36(0, arg2, false, arg1);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIILaa;IJ)Z")
    public static final boolean method1196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class16 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class45.method342(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!k", name = "g", descriptor = "(I)V")
    public static void method1197(int arg0) {
        field2890 = null;
        field2901 = null;
        field2903 = null;
        if (arg0 == 2) {
            field2902 = null;
            field2888 = null;
            field2882 = null;
        }
    }
}
