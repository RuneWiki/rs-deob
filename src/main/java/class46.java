import java.util.Random;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class46 extends class3 {

    @OriginalMember(owner = "client!eg", name = "K", descriptor = "I")
    private int field664 = 0;

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "I")
    private int field666 = 204;

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "I")
    private int field672 = 1024;

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "I")
    private int field660 = 409;

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
    private int field674 = 8;

    @OriginalMember(owner = "client!eg", name = "T", descriptor = "I")
    private int field673 = 4;

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "I")
    private int field659 = 81;

    @OriginalMember(owner = "client!eg", name = "X", descriptor = "I")
    private int field677 = 1024;

    @OriginalMember(owner = "client!eg", name = "I", descriptor = "[Ldb;")
    public static class146[] field662 = new class146[14];

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "Z")
    public static boolean field670 = false;

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
    private int field668;

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!eg", name = "W", descriptor = "I")
    private int field676;

    @OriginalMember(owner = "client!eg", name = "Y", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!eg", name = "Z", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!eg", name = "ab", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!eg", name = "bb", descriptor = "I")
    private int field681;

    @OriginalMember(owner = "client!eg", name = "cb", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!eg", name = "V", descriptor = "[I")
    private int[] field675;

    @OriginalMember(owner = "client!eg", name = "L", descriptor = "[[I")
    private int[][] field665;

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "[[I")
    private int[][] field671;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(BI)Z", line = 5)
    public static final boolean method347(byte arg0, int arg1) {
        field678++;
        byte var2 = 0;
        if (arg0 <= 62) {
            field670 = false;
        }
        byte var3 = 0;
        if (class113.field1655 == null) {
            if (class245.field3886 || class211.field3219 == null) {
                class113.field1655 = new class137(512, 512);
            } else {
                class113.field1655 = (class137) class211.field3219;
            }
            int[] var4 = class113.field1655.field2172;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; var7 < (104 - var3 - 1); var7++) {
                int var8 = (var3 + 103 - var7) * 512 * 4 + 24628;
                for (int var9 = var2 + 1; var9 < 104 - var2 - 1; var9++) {
                    if ((class148.field2392[arg1][var9][var7] & 0x18) == 0) {
                        class300.method2115(var4, var8, 512, arg1, var9, var7);
                    }
                    if (arg1 < 3 && (class148.field2392[arg1 + 1][var9][var7] & 0x8) != 0) {
                        class300.method2115(var4, var8, 512, arg1 + 1, var9, var7);
                    }
                    var8 += 4;
                }
            }
            class143.field2294 = 0;
            for (int var10 = 0; var10 < 104; var10++) {
                for (int var11 = 0; var11 < 104; var11++) {
                    long var12 = class13.method96(arg1, var2 + var10, var3 + var11);
                    if (var12 == 0L) {
                        var12 = class113.method743(arg1, var2 + var10, var3 + var11);
                    }
                    if (var12 == 0L) {
                        var12 = class47.method355(arg1, var2 + var10, var3 + var11);
                    }
                    if (var12 == 0L) {
                        var12 = class23.method200(arg1, var2 + var10, var3 + var11);
                    }
                    if (var12 != 0L) {
                        class126 var14 = class165.method1155((byte) -125, (int) (var12 >>> 32) & Integer.MAX_VALUE);
                        if (!var14.field1948 || class312.field5106) {
                            int var15 = var14.field1903;
                            if (var14.field1949 != null) {
                                for (int var16 = 0; var16 < var14.field1949.length; var16++) {
                                    if (var14.field1949[var16] != -1) {
                                        class126 var17 = class165.method1155((byte) 70, var14.field1949[var16]);
                                        if (var17.field1903 >= 0) {
                                            var15 = var17.field1903;
                                        }
                                    }
                                }
                            }
                            if (var15 >= 0) {
                                boolean var18 = false;
                                class312 var19 = class165.method1150(var15, (byte) 116);
                                if (var19 != null && var19.field5068) {
                                    var18 = true;
                                }
                                int var20 = var2 + var10;
                                int var21 = var11 + var3;
                                if (var18) {
                                    int[][] var22 = class124.field1860[arg1].field2491;
                                    for (int var23 = 0; var23 < 10; var23++) {
                                        int var24 = (int) (Math.random() * 4.0D);
                                        if (var24 == 0 && var20 > 0 && var10 - 3 < var20 && (var22[var20 - 1][var21] & 0x2C0108) == 0) {
                                            var20--;
                                        }
                                        if (var24 == 1 && var20 < 103 && var10 + 3 > var20 && (var22[var20 + 1][var21] & 0x2C0180) == 0) {
                                            var20++;
                                        }
                                        if (var24 == 2 && var21 > 0 && var21 > (var11 - 3) && (var22[var20][var21 - 1] & 0x2C0102) == 0) {
                                            var21--;
                                        }
                                        if (var24 == 3 && var21 < 103 && var11 + 3 > var21 && (var22[var20][var21 + 1] & 0x2C0120) == 0) {
                                            var21++;
                                        }
                                    }
                                }
                                class39.field569[class143.field2294] = var14.field1924;
                                class113.field1662[class143.field2294] = var20 - var2;
                                class328.field5368[class143.field2294] = var21 - var3;
                                class143.field2294++;
                            }
                        }
                    }
                }
            }
        }
        int var25 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10;
        class113.field1655.method958();
        int var26 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var27 = 1; var27 < 103; var27++) {
            for (int var28 = 1; var28 < 103; var28++) {
                if ((class148.field2392[arg1][var28 + var2][var3 + var27] & 0x18) == 0 && !class116.method756(var26, var28, var27, var25, (byte) -125, var3, arg1, var2)) {
                    if (class245.field3886) {
                        class317.field5228 = null;
                    } else {
                        class92.field1331.method1169(0);
                    }
                    return false;
                }
                if (arg1 < 3 && (class148.field2392[arg1 + 1][var2 + var28][var3 + var27] & 0x8) != 0 && !class116.method756(var26, var28, var27, var25, (byte) -125, var3, arg1 + 1, var2)) {
                    if (class245.field3886) {
                        class317.field5228 = null;
                    } else {
                        class92.field1331.method1169(0);
                    }
                    return false;
                }
            }
        }
        if (class245.field3886) {
            int[] var29 = class113.field1655.field2172;
            int var30 = var29.length;
            for (int var31 = 0; var31 < var30; var31++) {
                if (var29[var31] == 0) {
                    var29[var31] = 1;
                }
            }
            class211.field3219 = new class232(class113.field1655);
        } else {
            class211.field3219 = class113.field1655;
        }
        if (class245.field3886) {
            class317.field5228 = null;
        } else {
            class92.field1331.method1169(0);
        }
        class113.field1655 = null;
        return true;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lfh;IZ)V", line = 261)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        if (arg2) {
            method351((Object[]) null, (int[]) null, -103);
        }
        if (arg1 == 0) {
            this.field673 = arg0.method2224(-119);
        } else if (arg1 == 1) {
            this.field674 = arg0.method2224(-125);
        } else if (arg1 == 2) {
            this.field660 = arg0.method2250(-1613178296);
        } else if (arg1 == 3) {
            this.field666 = arg0.method2250(-1613178296);
        } else if (arg1 == 4) {
            this.field672 = arg0.method2250(-1613178296);
        } else if (arg1 == 5) {
            this.field664 = arg0.method2250(-1613178296);
        } else if (arg1 == 6) {
            this.field659 = arg0.method2250(-1613178296);
        } else if (arg1 == 7) {
            this.field677 = arg0.method2250(-1613178296);
        }
        field667++;
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(B)V", line = 346)
    public final void method20(byte arg0) {
        field661++;
        this.method350(-1);
        int var2 = -6 / ((-arg0 - 20) / 58);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "()V", line = 359)
    public static final void method348() {
        GL var0 = class245.field3884;
        var0.glDisableClientState(32886);
        class245.method1740(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class245.method1713();
        for (int var1 = 0; var1 < class308.field5020[0].length; var1++) {
            class226 var2 = class308.field5020[0][var1];
            if (var2.field3535 >= 0 && class305.method2134(class272.field4467.method399(var2.field3535, 84), -7)) {
                var0.glColor4fv(class132.method859(-22535, var2.field3540), 0);
                float var3 = 201.5F - (var2.field3548 ? 1.0F : 0.5F);
                var2.method1537(class264.field4230, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class245.method1723();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class245.method1724();
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V", line = 512)
    public class46() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "(B)V", line = 403)
    public static void method349(byte arg0) {
        field662 = null;
        int var1 = 24 / ((34 - arg0) / 57);
    }

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "(I)V", line = 413)
    private final void method350(int arg0) {
        Random var2 = new Random((long) this.field674);
        this.field671 = new int[this.field674][this.field673];
        this.field676 = 4096 / this.field674;
        this.field665 = new int[this.field674][this.field673 + 1];
        this.field668 = 4096 / this.field673;
        int var3 = this.field668 / 2;
        this.field675 = new int[this.field674 + 1];
        this.field681 = this.field659 / 2;
        int var4 = this.field676 / 2;
        field679++;
        this.field675[0] = 0;
        int var5 = 0;
        if (arg0 != -1) {
            this.field671 = (int[][]) ((int[][]) null);
        }
        while (this.field674 > var5) {
            if (var5 > 0) {
                int var6 = this.field676;
                int var7 = (class4.method33(false, var2, 4096) - 2048) * this.field666 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field675[var5] = this.field675[var5 - 1] + var8;
            }
            this.field665[var5][0] = 0;
            for (int var9 = 0; var9 < this.field673; var9++) {
                if (var9 > 0) {
                    int var10 = this.field668;
                    int var11 = (class4.method33(false, var2, 4096) - 2048) * this.field660 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field665[var5][var9] = this.field665[var5][var9 - 1] + var12;
                }
                this.field671[var5][var9] = this.field677 <= 0 ? 4096 : 4096 - class4.method33(false, var2, this.field677);
            }
            this.field665[var5][this.field673] = 4096;
            var5++;
        }
        this.field675[this.field674] = 4096;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "([Ljava/lang/Object;[II)V", line = 491)
    public static final void method351(Object[] arg0, int[] arg1, int arg2) {
        field682++;
        int var3 = -125 % ((28 - arg2) / 60);
        class37.method305(arg0, arg1, arg1.length - 1, (byte) 63, 0);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lsi;IIBZ)V", line = 527)
    public static final void method352(class264 arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        field663++;
        int var5 = arg0.field4236;
        int var6 = arg0.field4223;
        if (arg0.field4182 == 0) {
            arg0.field4236 = arg0.field4262;
        } else if (arg0.field4182 == 1) {
            arg0.field4236 = arg2 - arg0.field4262;
        } else if (arg0.field4182 == 2) {
            arg0.field4236 = arg0.field4262 * arg2 >> 14;
        } else if (arg0.field4182 == 3) {
            if (arg0.field4350 == 2) {
                arg0.field4236 = (arg0.field4262 - 1) * arg0.field4342 + arg0.field4262 * 32;
            } else if (arg0.field4350 == 7) {
                arg0.field4236 = arg0.field4262 * 12 + ((arg0.field4262 - 1) * arg0.field4342);
            }
        }
        if (arg0.field4335 == 0) {
            arg0.field4223 = arg0.field4188;
        } else if (arg0.field4335 == 1) {
            arg0.field4223 = arg1 - arg0.field4188;
        } else if (arg0.field4335 == 2) {
            arg0.field4223 = arg0.field4188 * arg1 >> 14;
        } else if (arg0.field4335 == 3) {
            if (arg0.field4350 == 2) {
                arg0.field4223 = arg0.field4188 * 32 + ((arg0.field4188 - 1) * arg0.field4322);
            } else if (arg0.field4350 == 7) {
                arg0.field4223 = (arg0.field4188 - 1) * arg0.field4322 + arg0.field4188 * 115;
            }
        }
        if (arg0.field4335 == 4) {
            arg0.field4223 = arg0.field4292 * arg0.field4236 / arg0.field4232;
        }
        if (arg3 > -43) {
            field662 = (class146[]) null;
        }
        if (arg0.field4182 == 4) {
            arg0.field4236 = arg0.field4232 * arg0.field4223 / arg0.field4292;
        }
        if (class172.field2693 && (client.method898(arg0).field1155 != 0 || arg0.field4350 == 0)) {
            if (arg0.field4236 < 5 && arg0.field4223 < 5) {
                arg0.field4236 = 5;
                arg0.field4223 = 5;
            } else {
                if (arg0.field4236 <= 0) {
                    arg0.field4236 = 5;
                }
                if (arg0.field4223 <= 0) {
                    arg0.field4223 = 5;
                }
            }
        }
        if (arg0.field4233 == 1337) {
            class41.field633 = arg0;
        }
        if (arg4 && arg0.field4180 != null && (arg0.field4223 != var6 || arg0.field4236 != var5)) {
            class190 var7 = new class190();
            var7.field2940 = arg0.field4180;
            var7.field2937 = arg0;
            class268.field4420.method1077(16711935, var7);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)[I", line = 634)
    public final int[] method25(byte arg0, int arg1) {
        field669++;
        if (arg0 < 57) {
            this.field673 = 84;
        }
        int[] var3 = this.field21.method1258(arg1, 0);
        if (this.field21.field2808) {
            int var4 = 0;
            int var5;
            for (var5 = class159.field2546[arg1] + this.field664; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field674 && this.field675[var4] <= var5) {
                var4++;
            }
            boolean var6 = (var4 & 0x1) == 0;
            int var7 = var4 - 1;
            int var8 = this.field675[var4];
            int var9 = this.field675[var4 - 1];
            if ((this.field681 + var9) < var5 && var8 - this.field681 > var5) {
                for (int var10 = 0; var10 < class326.field5342; var10++) {
                    int var11 = 0;
                    int var12 = var6 ? this.field672 : -this.field672;
                    int var13;
                    for (var13 = (this.field668 * var12 >> 12) + class163.field2591[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (var11 < this.field673 && this.field665[var7][var11] <= var13) {
                        var11++;
                    }
                    int var14 = this.field665[var7][var11];
                    int var15 = var11 - 1;
                    int var16 = this.field665[var7][var15];
                    if (this.field681 + var16 < var13 && var13 < (var14 - this.field681)) {
                        var3[var10] = this.field671[var7][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class298.method2106(var3, 0, class326.field5342, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(III)V", line = 730)
    public static final void method353(int arg0, int arg1, int arg2) {
        if (class326.field5342 != arg2) {
            class163.field2591 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class163.field2591[var3] = (var3 << 12) / arg2;
            }
            class326.field5342 = arg2;
            class54.field809 = arg2 * 32;
            class5.field70 = arg2 - 1;
        }
        field680++;
        if (class308.field5010 != arg0) {
            if (class326.field5342 == arg0) {
                class159.field2546 = class163.field2591;
            } else {
                class159.field2546 = new int[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    class159.field2546[var4] = (var4 << 12) / arg0;
                }
            }
            class129.field1970 = arg0 - 1;
            class308.field5010 = arg0;
        }
        if (arg1 != -1) {
            field662 = (class146[]) null;
        }
    }
}
