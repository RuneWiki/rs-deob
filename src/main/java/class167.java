import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class167 extends class23 {

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
    private int field3208 = 0;

    @OriginalMember(owner = "client!pd", name = "gb", descriptor = "I")
    private int field3220 = 0;

    @OriginalMember(owner = "client!pd", name = "ob", descriptor = "I")
    private int field3228 = 0;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "[J")
    public static long[] field3205 = new long[100];

    @OriginalMember(owner = "client!pd", name = "eb", descriptor = "Li;")
    public static class88 field3218 = class208.method1425(105, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!pd", name = "ib", descriptor = "Lwi;")
    public static class248 field3222 = new class248();

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    private int field3209;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
    private int field3210;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
    private int field3211;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
    private int field3212;

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "I")
    private int field3215;

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!pd", name = "db", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!pd", name = "hb", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!pd", name = "mb", descriptor = "I")
    private int field3226;

    @OriginalMember(owner = "client!pd", name = "nb", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!pd", name = "pb", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!pd", name = "lb", descriptor = "Lud;")
    public static class222 field3225;

    @OriginalMember(owner = "client!pd", name = "kb", descriptor = "Lcf;")
    public static class29 field3224;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "Lgi;")
    public static class75 field3207;

    @OriginalMember(owner = "client!pd", name = "fb", descriptor = "[Llj;")
    public static class130[] field3219;

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "[Z")
    public static boolean[] field3213;

    @OriginalMember(owner = "client!pd", name = "jb", descriptor = "[[B")
    public static byte[][] field3223;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I[Lgd;II)V")
    public static final void method1145(int arg0, class70[] arg1, int arg2, int arg3) {
        ++field3221;
        if (arg3 > arg0) {
            int var4 = arg0 + -1;
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg3 + 1;
            class70 var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            while (var4 < var6) {
                boolean var8 = true;
                do {
                    --var6;
                    for (int var9 = 0; ~var9 > -5; ++var9) {
                        int var10;
                        int var11;
                        if (class27.field461[var9] != 2) {
                            if (class27.field461[var9] == 1) {
                                var10 = var7.field1255;
                                if (var10 == -1 && ~class89.field1687[var9] == -2) {
                                    var10 = 2001;
                                }
                                var11 = arg1[var6].field1255;
                                if (var11 == -1 && ~class89.field1687[var9] == -2) {
                                    var11 = 2001;
                                }
                            } else if (class27.field461[var9] == 3) {
                                var11 = !arg1[var6].field1257 ? 0 : 1;
                                var10 = var7.field1257 ? 1 : 0;
                            } else {
                                var11 = arg1[var6].field1261;
                                var10 = var7.field1261;
                            }
                        } else {
                            var11 = arg1[var6].field1258;
                            var10 = var7.field1258;
                        }
                        if (~var10 != ~var11) {
                            if ((class89.field1687[var9] != 1 || ~var11 >= ~var10) && (class89.field1687[var9] != 0 || ~var11 <= ~var10)) {
                                var8 = false;
                            }
                            break;
                        }
                        if (var9 == 3) {
                            var8 = false;
                        }
                    }
                } while (var8);
                boolean var12 = true;
                do {
                    ++var4;
                    for (int var13 = 0; var13 < 4; ++var13) {
                        int var14;
                        int var15;
                        if (~class27.field461[var13] != -3) {
                            if (class27.field461[var13] != 1) {
                                if (~class27.field461[var13] == -4) {
                                    var14 = !arg1[var4].field1257 ? 0 : 1;
                                    var15 = !var7.field1257 ? 0 : 1;
                                } else {
                                    var14 = arg1[var4].field1261;
                                    var15 = var7.field1261;
                                }
                            } else {
                                var14 = arg1[var4].field1255;
                                if (~var14 == 0 && ~class89.field1687[var13] == -2) {
                                    var14 = 2001;
                                }
                                var15 = var7.field1255;
                                if (var15 == -1 && class89.field1687[var13] == 1) {
                                    var15 = 2001;
                                }
                            }
                        } else {
                            var14 = arg1[var4].field1258;
                            var15 = var7.field1258;
                        }
                        if (~var14 != ~var15) {
                            if ((class89.field1687[var13] != 1 || var14 >= var15) && (~class89.field1687[var13] != -1 || ~var14 >= ~var15)) {
                                var12 = false;
                            }
                            break;
                        }
                        if (~var13 == -4) {
                            var12 = false;
                        }
                    }
                } while (var12);
                if (~var6 < ~var4) {
                    class70 var16 = arg1[var4];
                    arg1[var4] = arg1[var6];
                    arg1[var6] = var16;
                }
            }
            method1145(arg0, arg1, 1, var6);
            method1145(var6 + 1, arg1, 1, arg3);
        }
        if (arg2 != 1) {
            method1146((byte) -32);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        ++field3217;
        if (arg1 != -3) {
            this.method1148(121, 29, 96, 18);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field3208 = (arg0.method324(116) << 12) / 100;
                }
            } else {
                this.field3220 = (arg0.method324(112) << 12) / 100;
            }
        } else {
            this.field3228 = arg0.method334((byte) -73);
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(IB)[[I")
    public final int[][] method7(int arg0, byte arg1) {
        int[][] var3 = super.field364.method1541(true, arg0);
        if (super.field364.field4312) {
            int[][] var4 = this.method121(0, (byte) -105, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class70.field1276; ++var11) {
                this.method1149(var5[var11], var6[var11], 2, var7[var11]);
                this.field3215 += this.field3208;
                if (~this.field3215 > -1) {
                    this.field3215 = 0;
                }
                for (this.field3211 += this.field3228; this.field3211 < 0; this.field3211 += 4096) {
                }
                if (~this.field3215 < -4097) {
                    this.field3215 = 4096;
                }
                while (this.field3211 > 4096) {
                    this.field3211 -= 4096;
                }
                this.field3209 += this.field3220;
                if (this.field3209 < 0) {
                    this.field3209 = 0;
                }
                if (this.field3209 > 4096) {
                    this.field3209 = 4096;
                }
                this.method1148(this.field3209, this.field3211, 6, this.field3215);
                var8[var11] = this.field3212;
                var9[var11] = this.field3210;
                var10[var11] = this.field3226;
            }
        }
        ++field3229;
        if (arg1 != 13) {
            field3224 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)V")
    public static final void method1146(byte arg0) {
        for (int var1 = 0; ~class55.field1041 < ~var1; ++var1) {
            int var3 = class25.field402[var1];
            class191 var4 = class225.field4225[var3];
            if (var4 != null) {
                class77.method514(var4.field3684.field2351, var4, 24550);
            }
        }
        int var2 = -66 % ((26 - arg0) / 38);
        ++field3216;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class167() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V")
    public static void method1147(int arg0) {
        field3207 = null;
        field3218 = null;
        field3225 = null;
        field3222 = null;
        field3223 = null;
        field3205 = null;
        if (arg0 != 2) {
            field3218 = null;
        }
        field3213 = null;
        field3224 = null;
        field3219 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)V")
    private final void method1148(int arg0, int arg1, int arg2, int arg3) {
        ++field3214;
        if (arg2 != 6) {
            field3213 = null;
        }
        int var5 = arg3 > 2048 ? arg3 - -arg0 + -(arg0 * arg3 >> 12) : (4096 - -arg0) * arg3 >> 12;
        if (var5 > 0) {
            int var6 = arg3 - -arg3 + -var5;
            int var7 = arg1 * 6;
            int var8 = (var5 - var6 << 12) / var5;
            int var9 = var7 >> 12;
            int var10 = -(var9 << 12) + var7;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = -var13 + var5;
            int var15 = var6 + var13;
            if (var9 == 0) {
                this.field3210 = var15;
                this.field3226 = var6;
                this.field3212 = var5;
                return;
            }
            if (~var9 == -2) {
                this.field3226 = var6;
                this.field3210 = var5;
                this.field3212 = var14;
                return;
            }
            if (~var9 == -3) {
                this.field3226 = var15;
                this.field3210 = var5;
                this.field3212 = var6;
                return;
            }
            if (~var9 == -4) {
                this.field3212 = var6;
                this.field3226 = var5;
                this.field3210 = var14;
                return;
            }
            if (var9 == 4) {
                this.field3212 = var15;
                this.field3226 = var5;
                this.field3210 = var6;
                return;
            }
            if (var9 == 5) {
                this.field3212 = var5;
                this.field3210 = var6;
                this.field3226 = var14;
                return;
            }
        } else {
            this.field3212 = this.field3210 = this.field3226 = arg3;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(IIII)V")
    private final void method1149(int arg0, int arg1, int arg2, int arg3) {
        ++field3206;
        int var5 = arg0 >= arg1 ? arg0 : arg1;
        int var6 = ~var5 <= ~arg3 ? var5 : arg3;
        int var7 = arg0 > arg1 ? arg1 : arg0;
        int var8 = var7 <= arg3 ? var7 : arg3;
        this.field3215 = (var6 + var8) / arg2;
        int var9 = -var8 + var6;
        if (var9 <= 0) {
            this.field3211 = 0;
        } else {
            int var10 = (-arg0 + var6 << 12) / var9;
            int var11 = (-arg1 + var6 << 12) / var9;
            int var12 = (var6 - arg3 << 12) / var9;
            if (~arg1 != ~var6) {
                if (arg0 == var6) {
                    this.field3211 = arg3 == var8 ? var11 + 4096 : 12288 - var12;
                } else {
                    this.field3211 = arg1 == var8 ? var10 + 12288 : -var11 + 20480;
                }
            } else {
                this.field3211 = ~arg0 != ~var8 ? 4096 - var10 : var12 + 20480;
            }
            this.field3211 /= 6;
        }
        if (this.field3215 > 0 && ~this.field3215 > -4097) {
            this.field3209 = (var9 << 12) / (~this.field3215 >= -2049 ? this.field3215 * 2 : -(this.field3215 * 2) + 8192);
        } else {
            this.field3209 = 0;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)Leb;")
    public static final class47 method1150(int arg0, int arg1) {
        class47 var2 = (class47) class1.field2.method666((long) arg0, 0);
        if (arg1 > -107) {
            field3218 = null;
        }
        ++field3227;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class202.field3851.method941((byte) 56, class201.method1381(arg0, 255), class188.method1316((byte) 52, arg0));
            class47 var4 = new class47();
            if (var3 != null) {
                var4.method355((byte) 33, new class46(var3));
            }
            class1.field2.method664((long) arg0, var4, false);
            return var4;
        }
    }
}
