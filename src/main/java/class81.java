import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class81 extends class17 {

    @OriginalMember(owner = "client!wd", name = "bb", descriptor = "I")
    private int field1261 = 409;

    @OriginalMember(owner = "client!wd", name = "kb", descriptor = "I")
    private int field1270 = 4096;

    @OriginalMember(owner = "client!wd", name = "nb", descriptor = "[I")
    private int[] field1273 = new int[3];

    @OriginalMember(owner = "client!wd", name = "jb", descriptor = "I")
    private int field1269 = 4096;

    @OriginalMember(owner = "client!wd", name = "hb", descriptor = "I")
    private int field1267 = 4096;

    @OriginalMember(owner = "client!wd", name = "gb", descriptor = "I")
    public static int field1266 = 0;

    @OriginalMember(owner = "client!wd", name = "db", descriptor = "Lsf;")
    public static class108 field1263 = class140.method973(255, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!wd", name = "mb", descriptor = "[I")
    public static int[] field1272 = new int[256];

    @OriginalMember(owner = "client!wd", name = "pb", descriptor = "Lsf;")
    public static class108 field1275 = class140.method973(255, "lila:");

    @OriginalMember(owner = "client!wd", name = "lb", descriptor = "Lsf;")
    public static class108 field1271 = class140.method973(255, "; Expires=");

    @OriginalMember(owner = "client!wd", name = "ab", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!wd", name = "cb", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!wd", name = "eb", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!wd", name = "ob", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!wd", name = "ib", descriptor = "Lse;")
    public static class12 field1268;

    @OriginalMember(owner = "client!wd", name = "fb", descriptor = "Lik;")
    public static class262 field1265;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(Z)I", line = 11)
    public static final int method547(boolean arg0) {
        field1274++;
        if (arg0) {
            return class26.field398 == 0 ? 0 : class106.field1837[class26.field398].method218();
        } else {
            return -42;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZI)[[I", line = 25)
    public final int[][] method122(boolean arg0, int arg1) {
        if (arg0) {
            this.field1270 = 91;
        }
        field1260++;
        int[][] var3 = this.field224.method2081(arg1, -47);
        if (this.field224.field5106) {
            int[][] var4 = this.method111(3, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var4[1];
            for (int var11 = 0; var11 < class116.field2008; var11++) {
                int var12 = var5[var11];
                int var13 = var12 - this.field1273[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field1261 >= var13) {
                    int var14 = var10[var11];
                    int var15 = var14 - this.field1273[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 <= this.field1261) {
                        int var16 = var6[var11];
                        int var17 = var16 - this.field1273[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field1261 < var17) {
                            var7[var11] = var12;
                            var8[var11] = var14;
                            var9[var11] = var16;
                        } else {
                            var7[var11] = this.field1267 * var12 >> 12;
                            var8[var11] = this.field1270 * var14 >> 12;
                            var9[var11] = this.field1269 * var16 >> 12;
                        }
                    } else {
                        var7[var11] = var12;
                        var8[var11] = var14;
                        var9[var11] = var6[var11];
                    }
                } else {
                    var7[var11] = var12;
                    var8[var11] = var10[var11];
                    var9[var11] = var6[var11];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIBIIII)V", line = 121)
    public static final void method548(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 96) {
            return;
        }
        field1264++;
        if (class260.field4593 <= (arg0 - arg3) && class79.field1202 >= arg0 + arg3 && arg5 - arg3 >= class266.field4677 && class166.field2984 >= (arg3 + arg5)) {
            class98.method676(arg4, arg2 ^ 0xFFFFFFE7, arg6, arg5, arg0, arg1, arg3);
        } else {
            class155.method1082(arg4, arg1, (byte) -34, arg6, arg5, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V", line = 152)
    public class81() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)V", line = 156)
    public static void method549(byte arg0) {
        field1265 = null;
        field1263 = null;
        field1275 = null;
        field1271 = null;
        field1268 = null;
        if (arg0 == -125) {
            field1272 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 201)
    public static final void method550(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class320.field5489 * 128) {
            arg0 = class320.field5489 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class325.field5535 * 128) {
            arg2 = class325.field5535 * 128 - 1;
        }
        class109.field1912 = class263.field4653[arg3];
        class273.field4803 = class263.field4649[arg3];
        class195.field3522 = class263.field4653[arg4];
        class61.field980 = class263.field4649[arg4];
        class1.field10 = arg0;
        class260.field4592 = arg1;
        class311.field5381 = arg2;
        class209.field3730 = arg0 / 128;
        class131.field2237 = arg2 / 128;
        class269.field4719 = class209.field3730 - class288.field5040;
        if (class269.field4719 < 0) {
            class269.field4719 = 0;
        }
        class62.field992 = class131.field2237 - class288.field5040;
        if (class62.field992 < 0) {
            class62.field992 = 0;
        }
        class64.field1024 = class288.field5040 + class209.field3730;
        if (class64.field1024 > class320.field5489) {
            class64.field1024 = class320.field5489;
        }
        class14.field188 = class288.field5040 + class131.field2237;
        if (class14.field188 > class325.field5535) {
            class14.field188 = class325.field5535;
        }
        short var15;
        if (class231.field4051) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class288.field5040 + class288.field5040 + 2; var16++) {
            for (int var17 = 0; var17 < class288.field5040 + class288.field5040 + 2; var17++) {
                int var18 = (var16 - class288.field5040 << 7) - (class1.field10 & 0x7F);
                int var19 = (var17 - class288.field5040 << 7) - (class311.field5381 & 0x7F);
                int var20 = class209.field3730 + var16 - class288.field5040;
                int var21 = class131.field2237 + var17 - class288.field5040;
                if (var20 >= 0 && var21 >= 0 && var20 < class320.field5489 && var21 < class325.field5535) {
                    int var22;
                    if (class105.field1819 == null) {
                        var22 = class104.field1809[0][var20][var21] + 128 - class260.field4592;
                    } else {
                        var22 = class105.field1819[0][var20][var21] + 128 - class260.field4592;
                    }
                    int var23 = class104.field1809[3][var20][var21] - class260.field4592 - 1000;
                    class211.field3773[var16][var17] = class62.method435(var18, var23, var22, var19, var15);
                } else {
                    class211.field3773[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class288.field5040 + class288.field5040 + 1; var24++) {
            for (int var25 = 0; var25 < class288.field5040 + class288.field5040 + 1; var25++) {
                class78.field1179[var24][var25] = class211.field3773[var24][var25] || class211.field3773[var24 + 1][var25] || class211.field3773[var24][var25 + 1] || class211.field3773[var24 + 1][var25 + 1];
            }
        }
        class240.field4180 = arg6;
        class132.field2259 = arg7;
        class270.field4729 = arg8;
        class215.field3832 = arg9;
        class330.field5642 = arg10;
        class39.method266();
        if (class206.field3701 != null) {
            class1.method2(true);
            class207.method1446(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class231.field4051) {
                class1.field18 = false;
                class59.method403(0, (byte) -106, 0);
                class217.method1493((float[]) null);
                class267.method1938();
            }
            class1.method2(false);
        }
        class207.method1446(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLrm;I)V", line = 338)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        field1262++;
        if (arg0 != -114) {
            this.method114((byte) -66, (class249) null, 39);
        }
        if (arg2 == 0) {
            this.field1261 = arg1.method1712(-1);
        } else if (arg2 == 1) {
            this.field1269 = arg1.method1712(-1);
        } else if (arg2 == 2) {
            this.field1270 = arg1.method1712(-1);
        } else if (arg2 == 3) {
            this.field1267 = arg1.method1712(-1);
        } else if (arg2 == 4) {
            int var5 = arg1.method1749(false);
            this.field1273[2] = class162.method1118(var5 >> 12, 0);
            this.field1273[1] = class162.method1118(var5 >> 4, 4080);
            this.field1273[0] = class162.method1118(16711680, var5) << 4;
        }
    }
}
