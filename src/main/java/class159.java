import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class159 extends class259 {

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
    private int field2977 = 1638;

    @OriginalMember(owner = "client!vc", name = "db", descriptor = "I")
    private int field2987 = 4;

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
    private int field2976 = 0;

    @OriginalMember(owner = "client!vc", name = "ab", descriptor = "[B")
    private byte[] field2984 = new byte[512];

    @OriginalMember(owner = "client!vc", name = "hb", descriptor = "I")
    private int field2991 = 4;

    @OriginalMember(owner = "client!vc", name = "kb", descriptor = "Z")
    private boolean field2994 = true;

    @OriginalMember(owner = "client!vc", name = "mb", descriptor = "I")
    private int field2996 = 4;

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "Lsg;")
    public static class30 field2978 = class167.method1221((byte) 33, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!vc", name = "nb", descriptor = "Lsg;")
    public static class30 field2997 = class167.method1221((byte) 33, "0");

    @OriginalMember(owner = "client!vc", name = "cb", descriptor = "F")
    public static float field2986;

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!vc", name = "X", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!vc", name = "Y", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!vc", name = "Z", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!vc", name = "bb", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!vc", name = "eb", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!vc", name = "fb", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!vc", name = "gb", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!vc", name = "jb", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!vc", name = "ob", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!vc", name = "pb", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "[S")
    private short[] field2980;

    @OriginalMember(owner = "client!vc", name = "lb", descriptor = "[S")
    private short[] field2995;

    @OriginalMember(owner = "client!vc", name = "ib", descriptor = "[[B")
    public static byte[][] field2992;

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
    public class159() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II[I)V")
    private final void method1179(int arg0, int arg1, int[] arg2) {
        ++field2988;
        int var4 = class154.field2910[arg1] * this.field2991;
        if (arg0 <= 13) {
            this.field2994 = false;
        }
        if (~this.field2987 != -2) {
            short var5 = this.field2980[0];
            if (~var5 < -9 || var5 < -8) {
                int var6 = this.field2995[0] << 12;
                int var7 = this.field2991 * var6 >> 12;
                int var8 = var4 * var6 >> 12;
                int var9 = this.field2996 * var6 >> 12;
                int var10 = var8 >> 12;
                int var11 = var8 & 4095;
                int var12 = var10 + 1;
                int var13 = class64.field1414[var11];
                int var14 = 255 & this.field2984[255 & var10];
                if (var12 >= var7) {
                    var12 = 0;
                }
                int var15 = this.field2984[255 & var12] & 255;
                for (int var16 = 0; var16 < class223.field3999; ++var16) {
                    int var36 = class29.field558[var16] * this.field2996;
                    int var37 = this.method1182(var6 * var36 >> 12, var15, var14, var9, 27653, var11, var13);
                    arg2[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; this.field2987 > var17; ++var17) {
                short var18 = this.field2980[var17];
                if (var18 > 8 || ~var18 > 7) {
                    int var19 = this.field2995[var17] << 12;
                    int var20 = this.field2991 * var19 >> 12;
                    int var21 = this.field2996 * var19 >> 12;
                    int var22 = var4 * var19 >> 12;
                    int var23 = var22 >> 12;
                    int var24 = 255 & this.field2984[var23 & 255];
                    int var25 = var22 & 4095;
                    int var26 = var23 - -1;
                    if (var20 <= var26) {
                        var26 = 0;
                    }
                    int var27 = class64.field1414[var25];
                    int var28 = this.field2984[var26 & 255] & 255;
                    if (this.field2994 && ~(this.field2987 - 1) == ~var17) {
                        for (int var29 = 0; ~class223.field3999 < ~var29; ++var29) {
                            int var30 = class29.field558[var29] * this.field2996;
                            int var31 = this.method1182(var19 * var30 >> 12, var28, var24, var21, 27653, var25, var27);
                            int var32 = (var18 * var31 >> 12) + arg2[var29];
                            arg2[var29] = 2048 - -(var32 >> 1);
                        }
                    } else {
                        for (int var33 = 0; ~var33 > ~class223.field3999; ++var33) {
                            int var34 = class29.field558[var33] * this.field2996;
                            int var35 = this.method1182(var19 * var34 >> 12, var28, var24, var21, 27653, var25, var27);
                            arg2[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            int var38 = this.field2995[0] << 12;
            int var39 = this.field2991 * var38 >> 12;
            int var40 = this.field2996 * var38 >> 12;
            short var41 = this.field2980[0];
            int var42 = var4 * var38 >> 12;
            int var43 = var42 >> 12;
            int var44 = var42 & 4095;
            int var45 = class64.field1414[var44];
            int var46 = var43 - -1;
            int var47 = this.field2984[255 & var43] & 255;
            if (~var46 <= ~var39) {
                var46 = 0;
            }
            int var48 = 255 & this.field2984[255 & var46];
            if (!this.field2994) {
                for (int var49 = 0; ~class223.field3999 < ~var49; ++var49) {
                    int var50 = class29.field558[var49] * this.field2996;
                    int var51 = this.method1182(var38 * var50 >> 12, var48, var47, var40, 27653, var44, var45);
                    arg2[var49] = var41 * var51 >> 12;
                }
            } else {
                for (int var52 = 0; var52 < class223.field3999; ++var52) {
                    int var53 = class29.field558[var52] * this.field2996;
                    int var54 = this.method1182(var38 * var53 >> 12, var48, var47, var40, 27653, var44, var45);
                    int var55 = var41 * var54 >> 12;
                    arg2[var52] = 2048 - -(var55 >> 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "(I)V")
    private final void method1180(int arg0) {
        if (this.field2977 <= 0) {
            if (this.field2980 != null && ~this.field2980.length == ~this.field2987) {
                this.field2995 = new short[this.field2987];
                for (int var2 = 0; ~this.field2987 < ~var2; ++var2) {
                    this.field2995[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field2995 = new short[this.field2987];
            this.field2980 = new short[this.field2987];
            for (int var3 = 0; ~this.field2987 < ~var3; ++var3) {
                this.field2980[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field2977 / 4096.0F), (double) var3)));
                this.field2995[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field2990;
        if (arg0 != 255) {
            field2992 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)V")
    public static void method1181(boolean arg0) {
        field2997 = null;
        field2992 = null;
        if (!arg0) {
            method1181(false);
        }
        field2978 = null;
    }

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)V")
    public final void method11(int arg0) {
        this.field2984 = class117.method903(512, this.field2976);
        this.method1180(255);
        ++field2993;
        if (arg0 <= 11) {
            field2978 = null;
        }
        for (int var2 = this.field2987 + -1; var2 >= 1; --var2) {
            short var3 = this.field2980[var2];
            if (var3 > 8) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field2987;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIII)I")
    private final int method1182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2989;
        int var8 = arg5 + -4096;
        int var9 = arg0 >> 12;
        int var10 = arg0 & 4095;
        if (arg4 != 27653) {
            return -67;
        } else {
            int var11 = var9 + 1;
            if (~var11 <= ~arg3) {
                var11 = 0;
            }
            int var12 = class64.field1414[var10];
            int var13 = var11 & 255;
            int var14 = var9 & 255;
            int var15 = 3 & this.field2984[arg2 + var14];
            int var16;
            if (var15 <= 1) {
                var16 = var15 != 0 ? -var10 + arg5 : arg5 + var10;
            } else {
                var16 = var15 != 2 ? -arg5 + -var10 : -arg5 + var10;
            }
            int var17 = 3 & this.field2984[var13 - -arg2];
            int var18 = var10 + -4096;
            int var19;
            if (~var17 < -2) {
                var19 = ~var17 == -3 ? -arg5 + var18 : -arg5 + -var18;
            } else {
                var19 = ~var17 != -1 ? -var18 + arg5 : arg5 + var18;
            }
            int var20 = ((-var16 + var19) * var12 >> 12) + var16;
            int var21 = 3 & this.field2984[arg1 + var14];
            int var22;
            if (~var21 < -2) {
                var22 = ~var21 != -3 ? -var8 + -var10 : var10 - var8;
            } else {
                var22 = var21 == 0 ? var10 - -var8 : -var10 + var8;
            }
            int var23 = this.field2984[var13 - -arg1] & 3;
            int var24;
            if (var23 > 1) {
                var24 = var23 != 2 ? -var8 + -var18 : -var8 + var18;
            } else {
                var24 = ~var23 != -1 ? var8 - var18 : var8 + var18;
            }
            int var25 = ((-var22 + var24) * var12 >> 12) + var22;
            return var20 - -((-var20 + var25) * arg6 >> 12);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        if (arg1 != -1586849108) {
            this.method17(-25, false);
        }
        ++field2979;
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field2987 = arg2.method63((byte) 90);
            } else {
                if (~arg0 != -3) {
                    if (arg0 == 3) {
                        this.field2996 = this.field2991 = arg2.method63((byte) 87);
                        return;
                    }
                    if (arg0 == 4) {
                        this.field2976 = arg2.method63((byte) 124);
                        return;
                    }
                    if (~arg0 == -6) {
                        this.field2996 = arg2.method63((byte) 95);
                        return;
                    }
                    if (~arg0 == -7) {
                        this.field2991 = arg2.method63((byte) 49);
                        return;
                    }
                } else {
                    this.field2977 = arg2.method74(101);
                    if (~this.field2977 > -1) {
                        this.field2980 = new short[this.field2987];
                        for (int var5 = 0; var5 < this.field2987; ++var5) {
                            this.field2980[var5] = (short) arg2.method74(108);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field2994 = ~arg2.method63((byte) 79) == -2;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method1183(boolean arg0, byte[] arg1) {
        ++field2982;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        if (!arg0) {
            return null;
        } else {
            class26.method235(arg1, 0, var3, 0, var2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        ++field2985;
        int[] var3 = super.field4581.method1841(18, arg0);
        if (super.field4581.field4729) {
            this.method1179(34, arg0, var3);
        }
        if (arg1) {
            this.field2995 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIZ)I")
    public static final int method1184(int arg0, int arg1, boolean arg2) {
        ++field2983;
        class109 var3 = (class109) class208.field3730.method1168(-3, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (~arg1 == 0) {
            return 0;
        } else {
            if (!arg2) {
                method1183(true, (byte[]) null);
            }
            int var4 = 0;
            for (int var5 = 0; ~var3.field2199.length < ~var5; ++var5) {
                if (~var3.field2195[var5] == ~arg1) {
                    var4 += var3.field2199[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1185(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class53.field1186 * arg3 + class273.field4795 * arg0 >> 16;
        int var6 = class273.field4795 * arg3 - class53.field1186 * arg0 >> 16;
        int var7 = class149.field2837 * arg1 + class14.field273 * var6 >> 16;
        int var8 = class14.field273 * arg1 - class149.field2837 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class149.field2837 * arg2 + class14.field273 * var6 >> 16;
        int var12 = class14.field273 * arg2 - class149.field2837 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class204.field3663 && var13 < class204.field3663) {
            return false;
        } else if (var9 > class64.field1426 && var13 > class64.field1426) {
            return false;
        } else if (var10 < class180.field3337 && var14 < class180.field3337) {
            return false;
        } else {
            return var10 <= class21.field380 || var14 <= class21.field380;
        }
    }

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "(I)V")
    public static final void method1186(int arg0) {
        ++field2981;
        class260 var1 = class81.field1737;
        synchronized (class81.field1737) {
            ++class170.field3202;
            class76.field1680 = class36.field876;
            if (~class98.field1985 <= -1) {
                while (class98.field1985 != class69.field1570) {
                    int var2 = class20.field371[class69.field1570];
                    class69.field1570 = class69.field1570 + 1 & 127;
                    if (var2 >= 0) {
                        class41.field1016[var2] = true;
                    } else {
                        class41.field1016[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; ++var3) {
                    class41.field1016[var3] = false;
                }
                class98.field1985 = class69.field1570;
            }
            class36.field876 = class104.field2105;
            int var4 = -6 % (arg0 / 51);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLbi;)V")
    public static final void method1187(byte arg0, class66 arg1) {
        ++field2999;
        class123.field2416 = 3;
        class108.method858(true, -27822);
        class180.field3333 = false;
        class185.field3392 = true;
        class22.field409 = 2;
        class197.field3569 = true;
        class82.field1755 = 0;
        if (arg0 < 97) {
            method1181(true);
        }
        class90.field1818 = 0;
        class261.field4610 = true;
        class40.field998 = 0;
        class117.field2316 = 0;
        class113.field2240 = true;
        class238.field4243 = true;
        class169.field3184 = 127;
        class169.field3185 = 127;
        class246.field4382 = 255;
        class39.field928 = true;
        class224.field4020 = 0;
        class171 var2 = null;
        class209.field3755 = true;
        class177.field3277 = true;
        class50.field1136 = true;
        class104.field2102 = true;
        class142.field2749 = true;
        try {
            class27 var3 = arg1.method601("runescape", -54);
            while (var3.field493 == 0) {
                class160.method1191(1L, 0);
            }
            if (var3.field493 == 1) {
                var2 = (class171) var3.field492;
                byte[] var4 = new byte[(int) var2.method1257(true)];
                int var6;
                for (int var5 = 0; ~var4.length < ~var5; var5 += var6) {
                    var6 = var2.method1260(var4.length + -var5, -1, var4, var5);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                class21.method199(new class8(var4), (byte) 109);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1258(4222);
            }
        } catch (Exception var7) {
        }
    }
}
