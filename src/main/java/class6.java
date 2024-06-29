import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class6 extends class129 {

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "Z")
    public boolean field98 = false;

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "Lti;")
    public class167 field103;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
    public int field99;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
    public int field97;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "I")
    public int field104;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "I")
    public int field101;

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "S")
    private short field106;

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "S")
    private short field94;

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "S")
    private short field95;

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "S")
    private short field96;

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "S")
    private short field92;

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "I")
    private int field93;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
    private static int field100 = 12;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
    private int field102;

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "S")
    private short field105;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "()V")
    private final void method37() {
        this.field103.field2787.field3290[this.field105] = null;
        class193.field3291[class193.field3295] = this;
        class193.field3295 = class193.field3295 + 1 & 0x3FF;
        this.field103 = null;
        this.method1308((byte) 64);
        this.method913((byte) 120);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(JI)V")
    public final void method38(long arg0, int arg1) {
        if (this.field103 == null) {
            return;
        }
        this.field106 = (short) (this.field106 - arg1);
        if (this.field106 <= 0) {
            this.method37();
            return;
        }
        int var4 = this.field99 >> field100;
        int var5 = this.field97 >> field100;
        int var6 = this.field104 >> field100;
        class193 var7 = this.field103.field2787;
        class56 var8 = this.field103.field2794;
        if (var8.field872 != 0) {
            if (this.field94 - this.field106 <= var8.field888) {
                int var9 = var8.field911 * arg1 + (this.field102 >> 16 & 0xFF) + (this.field101 >> 8 & 0xFF00);
                int var10 = var8.field895 * arg1 + (this.field102 >> 8 & 0xFF) + (this.field101 & 0xFF00);
                int var11 = var8.field869 * arg1 + (this.field101 & 0xFF << 8) + (this.field102 & 0xFF);
                if (var9 < 0) {
                    var9 = 0;
                } else if (var9 > 65535) {
                    var9 = 65535;
                }
                if (var10 < 0) {
                    var10 = 0;
                } else if (var10 > 65535) {
                    var10 = 65535;
                }
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > 65535) {
                    var11 = 65535;
                }
                this.field101 &= 0xFF000000;
                this.field101 |= ((var11 & 0xFF00) >> 8) + ((var9 & 0xFF00) << 8) + (var10 & 0xFF00);
                this.field102 &= 0xFF000000;
                this.field102 |= (var11 & 0xFF) + ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8);
            }
            if (this.field94 - this.field106 <= var8.field891) {
                int var12 = var8.field882 * arg1 + (this.field102 >> 24 & 0xFF) + (this.field101 >> 16 & 0xFF00);
                if (var12 < 0) {
                    var12 = 0;
                } else if (var12 > 65535) {
                    var12 = 65535;
                }
                this.field101 &= 0xFFFFFF;
                this.field101 |= (var12 & 0xFF00) << 16;
                this.field102 &= 0xFFFFFF;
                this.field102 |= (var12 & 0xFF) << 24;
            }
        }
        if (var8.field860 != -1 && this.field94 - this.field106 <= var8.field851) {
            this.field93 += var8.field883 * arg1;
        }
        int var13 = this.field95;
        int var14 = this.field96;
        int var15 = this.field92;
        boolean var16 = false;
        if (var8.field905 == 1) {
            int var17 = var4 - this.field103.field2795;
            int var18 = var5 - this.field103.field2793;
            int var19 = var6 - this.field103.field2778;
            int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
            long var21 = (long) (var8.field899 * var20 * arg1);
            this.field93 = (int) ((long) this.field93 - ((long) this.field93 * var21 >> 18));
        } else if (var8.field905 == 2) {
            int var23 = var4 - this.field103.field2795;
            int var24 = var5 - this.field103.field2793;
            int var25 = var6 - this.field103.field2778;
            int var26 = var25 * var25 + var23 * var23 + var24 * var24;
            long var27 = (long) (var8.field899 * var26 * arg1);
            this.field93 = (int) ((long) this.field93 - ((long) this.field93 * var27 >> 28));
        }
        class62 var29 = var7.field3309.field3881;
        for (class62 var30 = var29.field1013; var30 != var29; var30 = var30.field1013) {
            class159 var56 = (class159) var30;
            class180 var57 = var56.field2643.field413;
            if (var57.field2996 != 1) {
                int var58 = var4 - var56.field2645;
                int var59 = var5 - var56.field2652;
                int var60 = var6 - var56.field2649;
                long var61 = (long) (var60 * var60 + var58 * var58 + var59 * var59);
                if (var61 <= var57.field3015) {
                    int var63 = (int) Math.sqrt((double) var61);
                    if (var63 == 0) {
                        var63 = 1;
                    }
                    long var64 = (long) (var56.field2648 * var60 + var56.field2640 * var58 + var57.field2999 * var59) * 65535L / (long) (var57.field2997 * var63);
                    if (var64 >= (long) var57.field3016) {
                        int var66 = 0;
                        if (var57.field3012 == 1) {
                            var66 = (var63 >> 4) * var57.field3009;
                        } else if (var57.field3012 == 2) {
                            var66 = (var63 >> 4) * (var63 >> 4) * var57.field3009;
                        }
                        if (var57.field2995 != 0) {
                            int var67 = (var58 << 15) / var63 * var57.field2997;
                            int var68 = (var59 << 15) / var63 * var57.field2997;
                            int var69 = (var60 << 15) / var63 * var57.field2997;
                            if (var57.field3007 == 0) {
                                var13 += arg1 * var67 >> 15;
                                var14 += arg1 * var68 >> 15;
                                var15 += arg1 * var69 >> 15;
                                var16 = true;
                            } else {
                                this.field99 += arg1 * var67 >> 15;
                                this.field97 += arg1 * var68 >> 15;
                                this.field104 += arg1 * var69 >> 15;
                            }
                        } else if (var57.field3007 == 0) {
                            var13 += (var56.field2640 - var66) * arg1;
                            var14 += (var57.field2999 - var66) * arg1;
                            var15 += (var56.field2648 - var66) * arg1;
                            var16 = true;
                        } else {
                            this.field99 += (var56.field2640 - var66) * arg1;
                            this.field97 += (var57.field2999 - var66) * arg1;
                            this.field104 += (var56.field2648 - var66) * arg1;
                        }
                    }
                }
            }
        }
        if (var8.field886 != null) {
            for (int var31 = 0; var31 < var8.field886.length; var31++) {
                class159 var32 = (class159) class193.field3301.method333((byte) 32, (long) var8.field886[var31]);
                while (var32 != null) {
                    class180 var33 = var32.field2643.field413;
                    int var34 = var4 - var32.field2645;
                    int var35 = var5 - var32.field2652;
                    int var36 = var6 - var32.field2649;
                    long var37 = (long) (var36 * var36 + var34 * var34 + var35 * var35);
                    if (var37 > var33.field3015) {
                        var32 = (class159) class193.field3301.method332(-127);
                    } else {
                        int var39 = (int) Math.sqrt((double) var37);
                        if (var39 == 0) {
                            var39 = 1;
                        }
                        long var40 = (long) (var32.field2648 * var36 + var32.field2640 * var34 + var33.field2999 * var35) * 65535L / (long) (var33.field2997 * var39);
                        if (var40 < (long) var33.field3016) {
                            var32 = (class159) class193.field3301.method332(-102);
                        } else {
                            int var42 = 0;
                            if (var33.field3012 == 1) {
                                var42 = (var39 >> 4) * var33.field3009;
                            } else if (var33.field3012 == 2) {
                                var42 = (var39 >> 4) * (var39 >> 4) * var33.field3009;
                            }
                            if (var33.field2995 != 0) {
                                int var43 = (var34 << 15) / var39 * var33.field2997;
                                int var44 = (var35 << 15) / var39 * var33.field2997;
                                int var45 = (var36 << 15) / var39 * var33.field2997;
                                if (var33.field3007 == 0) {
                                    var13 += arg1 * var43 >> 15;
                                    var14 += arg1 * var44 >> 15;
                                    var15 += arg1 * var45 >> 15;
                                    var16 = true;
                                } else {
                                    this.field99 += arg1 * var43 >> 15;
                                    this.field97 += arg1 * var44 >> 15;
                                    this.field104 += arg1 * var45 >> 15;
                                }
                            } else if (var33.field3007 == 0) {
                                var13 += (var32.field2640 - var42) * arg1;
                                var14 += (var33.field2999 - var42) * arg1;
                                var15 += (var32.field2648 - var42) * arg1;
                                var16 = true;
                            } else {
                                this.field99 += (var32.field2640 - var42) * arg1;
                                this.field97 += (var33.field2999 - var42) * arg1;
                                this.field104 += (var32.field2648 - var42) * arg1;
                            }
                            var32 = (class159) class193.field3301.method332(-122);
                        }
                    }
                }
            }
        }
        if (var8.field893 != null) {
            for (int var46 = 0; var46 < var8.field893.length; var46++) {
                class180 var47 = class247.method1704(var8.field893[var46], -5072);
                if (var47.field3007 == 0) {
                    var13 += var47.field3018 * arg1;
                    var14 += var47.field2999 * arg1;
                    var15 += var47.field2992 * arg1;
                    var16 = true;
                } else {
                    this.field99 += var47.field3018 * arg1;
                    this.field97 += var47.field2999 * arg1;
                    this.field104 += var47.field2992 * arg1;
                }
            }
        }
        if (var16) {
            while (true) {
                if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                    this.field95 = (short) var13;
                    this.field96 = (short) var14;
                    this.field92 = (short) var15;
                    break;
                }
                var13 >>= 0x1;
                var14 >>= 0x1;
                var15 >>= 0x1;
                this.field93 <<= 0x1;
            }
        }
        this.field99 = (int) ((long) this.field99 + ((long) this.field95 * (long) this.field93 >> 23) * (long) arg1);
        this.field97 = (int) ((long) this.field97 + ((long) this.field96 * (long) this.field93 >> 23) * (long) arg1);
        this.field104 = (int) ((long) this.field104 + ((long) this.field92 * (long) this.field93 >> 23) * (long) arg1);
        int var48 = this.field99 >> 19;
        int var49 = this.field104 >> 19;
        int var50 = this.field97 >> field100;
        if (var50 > 0 || var50 < -65535 || var48 < 0 || var48 >= class175.field2936 || var49 < 0 || var49 >= class160.field2675) {
            this.method37();
            return;
        }
        int[][][] var51 = class218.field3754;
        int var52 = var51[var7.field3323][var48][var49];
        int var53;
        if (var7.field3323 < 3) {
            var53 = var51[var7.field3323 + 1][var48][var49];
        } else {
            var53 = var51[var7.field3323][var48][var49] - 1024;
        }
        if (var8.field861) {
            if (var8.field884 == -1 && var50 > var52) {
                this.method37();
                return;
            }
            if (var8.field884 >= 0 && var50 > var51[var8.field884][var48][var49]) {
                this.method37();
                return;
            }
            if (var8.field878 == -1 && var50 < var53) {
                this.method37();
                return;
            }
            if (var8.field878 >= 0 && var50 < var51[var8.field878 + 1][var48][var49]) {
                this.method37();
                return;
            }
        }
        if (var48 >= var7.field3322 && var48 <= var7.field3315 && var49 >= var7.field3313 && var49 <= var7.field3317 && var50 <= var7.field3324 && var50 >= var7.field3312) {
            this.field98 = false;
            return;
        }
        this.field98 = true;
        byte var54 = 3;
        if (var50 > var51[1][var48][var49]) {
            var54 = 0;
        } else if (var50 > var51[2][var48][var49]) {
            var54 = 1;
        } else if (var50 > var51[3][var48][var49]) {
            var54 = 2;
        } else if (var50 < var51[3][var48][var49] - 1024) {
            this.method37();
            return;
        }
        class111 var55 = class286.field5048[var54][var48][var49];
        if (var55 == null) {
            var55 = class286.field5048[var54][var48][var49] = new class111(var54, var48, var49);
        }
        if (var55.field1860 == null) {
            var55.field1860 = new class116();
            var55.field1863 = (byte) ((int) (arg0 & 0xFFL));
        } else if ((byte) ((int) (arg0 & 0xFFL)) != var55.field1863) {
            var55.field1860.method832(104);
            var55.field1863 = (byte) ((int) (arg0 & 0xFFL));
        }
        var55.field1860.method833((byte) 18, this);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lti;IIIIIIIII)V")
    public final void method39(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field103 = arg0;
        this.field99 = arg1 << field100;
        this.field97 = arg2 << field100;
        this.field104 = arg3 << field100;
        this.field101 = arg9;
        this.field94 = this.field106 = (short) arg8;
        this.field95 = (short) arg4;
        this.field96 = (short) arg5;
        this.field92 = (short) arg6;
        this.field93 = arg7;
        this.method40();
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "()V")
    private final void method40() {
        int var1 = this.field103.field2787.field3302;
        if (this.field103.field2787.field3290[var1] != null) {
            this.field103.field2787.field3290[var1].method37();
        }
        this.field103.field2787.field3290[var1] = this;
        this.field105 = (short) this.field103.field2787.field3302;
        this.field103.field2787.field3302 = var1 + 1 & 0x1FFF;
        this.field103.field2781.method1676((byte) -126, this);
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lti;IIIIIIIII)V")
    public class6(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field103 = arg0;
        this.field99 = arg1 << field100;
        this.field97 = arg2 << field100;
        this.field104 = arg3 << field100;
        this.field101 = arg9;
        this.field94 = this.field106 = (short) arg8;
        this.field95 = (short) arg4;
        this.field96 = (short) arg5;
        this.field92 = (short) arg6;
        this.field93 = arg7;
        this.method40();
    }
}
