import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class337 extends class96 {

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public int field5325 = 0;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "B")
    private byte field5337 = 0;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "Z")
    public boolean field5329 = false;

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "B")
    private byte field5353 = 0;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    private int field5327 = 0;

    @OriginalMember(owner = "client!ac", name = "Z", descriptor = "I")
    private int field5364 = 0;

    @OriginalMember(owner = "client!ac", name = "Y", descriptor = "I")
    private int field5363 = 0;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "[I")
    private int[] field5346;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "[I")
    public int[] field5344;

    @OriginalMember(owner = "client!ac", name = "ab", descriptor = "[I")
    public int[] field5365;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "[I")
    public int[] field5332;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "[I")
    private int[] field5348;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "[S")
    private short[] field5321;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "[Lq;")
    public class79[] field5345;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "[Lje;")
    public class39[] field5326;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "[S")
    private short[] field5328;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "[S")
    private short[] field5333;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "[S")
    private short[] field5347;

    @OriginalMember(owner = "client!ac", name = "S", descriptor = "[S")
    private short[] field5357;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "[F")
    private float[] field5324;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "[F")
    private float[] field5339;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "[S")
    private short[] field5342;

    @OriginalMember(owner = "client!ac", name = "T", descriptor = "[B")
    private byte[] field5358;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "[S")
    private short[] field5335;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "[S")
    private short[] field5322;

    @OriginalMember(owner = "client!ac", name = "R", descriptor = "[S")
    private short[] field5356;

    @OriginalMember(owner = "client!ac", name = "Q", descriptor = "[S")
    private short[] field5355;

    @OriginalMember(owner = "client!ac", name = "W", descriptor = "[B")
    private byte[] field5361;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "[S")
    private short[] field5336;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "Lie;")
    public class284 field5330;

    @OriginalMember(owner = "client!ac", name = "X", descriptor = "Ltd;")
    public class254 field5362;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "Ltd;")
    private class254 field5343;

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "Ltd;")
    private class254 field5354;

    @OriginalMember(owner = "client!ac", name = "bb", descriptor = "Ltd;")
    private class254 field5366;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "Ltd;")
    private class254 field5349;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "S")
    private short field5352;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "S")
    private short field5331;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "[S")
    private short[] field5350;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "[I")
    private int[] field5338;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "Lqm;")
    private static class227 field5341 = new class227(10000);

    @OriginalMember(owner = "client!ac", name = "V", descriptor = "Lac;")
    private static class337 field5360 = new class337();

    @OriginalMember(owner = "client!ac", name = "db", descriptor = "Lac;")
    private static class337 field5368 = new class337();

    @OriginalMember(owner = "client!ac", name = "eb", descriptor = "Lac;")
    private static class337 field5369 = new class337();

    @OriginalMember(owner = "client!ac", name = "fb", descriptor = "Lac;")
    private static class337 field5370 = new class337();

    @OriginalMember(owner = "client!ac", name = "gb", descriptor = "Lac;")
    private static class337 field5371 = new class337();

    @OriginalMember(owner = "client!ac", name = "hb", descriptor = "Lac;")
    private static class337 field5372 = new class337();

    @OriginalMember(owner = "client!ac", name = "nb", descriptor = "[I")
    private static int[] field5378 = new int[1];

    @OriginalMember(owner = "client!ac", name = "pb", descriptor = "Z")
    private static boolean field5380 = false;

    @OriginalMember(owner = "client!ac", name = "sb", descriptor = "[I")
    private static int[] field5383 = new int[1];

    @OriginalMember(owner = "client!ac", name = "jb", descriptor = "F")
    private static float field5374;

    @OriginalMember(owner = "client!ac", name = "kb", descriptor = "F")
    private static float field5375;

    @OriginalMember(owner = "client!ac", name = "lb", descriptor = "F")
    private static float field5376;

    @OriginalMember(owner = "client!ac", name = "mb", descriptor = "F")
    private static float field5377;

    @OriginalMember(owner = "client!ac", name = "qb", descriptor = "F")
    private static float field5381;

    @OriginalMember(owner = "client!ac", name = "tb", descriptor = "F")
    private static float field5384;

    @OriginalMember(owner = "client!ac", name = "ib", descriptor = "I")
    private static int field5373;

    @OriginalMember(owner = "client!ac", name = "ob", descriptor = "I")
    private static int field5379;

    @OriginalMember(owner = "client!ac", name = "rb", descriptor = "I")
    private static int field5382;

    @OriginalMember(owner = "client!ac", name = "U", descriptor = "Lva;")
    private class268 field5359;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "Lbk;")
    private class53 field5334;

    @OriginalMember(owner = "client!ac", name = "cb", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field5367;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "[J")
    private static long[] field5323;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "[[I")
    private int[][] field5340;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "[[I")
    private int[][] field5351;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[IIIIZ)V", line = 8)
    public final void method546(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field5379 = 0;
            field5373 = 0;
            field5382 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field5351.length) {
                    int[] var14 = this.field5351[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field5379 += this.field5344[var16];
                        field5373 += this.field5365[var16];
                        field5382 += this.field5332[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field5379 = field5379 / var11 + var8;
                field5373 = field5373 / var11 + var9;
                field5382 = field5382 / var11 + var10;
            } else {
                field5379 = var8;
                field5373 = var9;
                field5382 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field5351.length) {
                    int[] var22 = this.field5351[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field5344[var24] += var17;
                        this.field5365[var24] += var18;
                        this.field5332[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field5351.length) {
                    int[] var27 = this.field5351[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field5344[var29] -= field5379;
                        this.field5365[var29] -= field5373;
                        this.field5332[var29] -= field5382;
                        if (arg4 != 0) {
                            int var30 = class153.field2438[arg4];
                            int var31 = class153.field2445[arg4];
                            int var32 = this.field5365[var29] * var30 + this.field5344[var29] * var31 + 32767 >> 16;
                            this.field5365[var29] = this.field5365[var29] * var31 + 32767 - this.field5344[var29] * var30 >> 16;
                            this.field5344[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class153.field2438[arg2];
                            int var34 = class153.field2445[arg2];
                            int var35 = this.field5365[var29] * var34 + 32767 - this.field5332[var29] * var33 >> 16;
                            this.field5332[var29] = this.field5365[var29] * var33 + this.field5332[var29] * var34 + 32767 >> 16;
                            this.field5365[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class153.field2438[arg3];
                            int var37 = class153.field2445[arg3];
                            int var38 = this.field5344[var29] * var37 + this.field5332[var29] * var36 + 32767 >> 16;
                            this.field5332[var29] = this.field5332[var29] * var37 + 32767 - this.field5344[var29] * var36 >> 16;
                            this.field5344[var29] = var38;
                        }
                        this.field5344[var29] += field5379;
                        this.field5365[var29] += field5373;
                        this.field5332[var29] += field5382;
                    }
                }
            }
            if (arg5 && this.field5328 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field5351.length) {
                        int[] var41 = this.field5351[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field5346[var43];
                            int var45 = this.field5346[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field5350[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class153.field2438[arg4];
                                    int var49 = class153.field2445[arg4];
                                    int var50 = this.field5333[var47] * var48 + this.field5328[var47] * var49 + 32767 >> 16;
                                    this.field5333[var47] = (short) (this.field5333[var47] * var49 + 32767 - this.field5328[var47] * var48 >> 16);
                                    this.field5328[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class153.field2438[arg2];
                                    int var52 = class153.field2445[arg2];
                                    int var53 = this.field5333[var47] * var52 + 32767 - this.field5347[var47] * var51 >> 16;
                                    this.field5347[var47] = (short) (this.field5347[var47] * var52 + this.field5333[var47] * var51 + 32767 >> 16);
                                    this.field5333[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class153.field2438[arg3];
                                    int var55 = class153.field2445[arg3];
                                    int var56 = this.field5347[var47] * var54 + this.field5328[var47] * var55 + 32767 >> 16;
                                    this.field5347[var47] = (short) (this.field5347[var47] * var55 + 32767 - this.field5328[var47] * var54 >> 16);
                                    this.field5328[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field5354 != null) {
                    this.field5354.field4288 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field5351.length) {
                    int[] var59 = this.field5351[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field5344[var61] -= field5379;
                        this.field5365[var61] -= field5373;
                        this.field5332[var61] -= field5382;
                        this.field5344[var61] = this.field5344[var61] * arg2 >> 7;
                        this.field5365[var61] = this.field5365[var61] * arg3 >> 7;
                        this.field5332[var61] = this.field5332[var61] * arg4 >> 7;
                        this.field5344[var61] += field5379;
                        this.field5365[var61] += field5373;
                        this.field5332[var61] += field5382;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5340 != null && this.field5358 != null) {
                for (int var62 = 0; var62 < var7; var62++) {
                    int var63 = arg1[var62];
                    if (var63 < this.field5340.length) {
                        int[] var64 = this.field5340[var63];
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            int var66 = var64[var65];
                            int var67 = (this.field5358[var66] & 0xFF) + arg2 * 8;
                            if (var67 < 0) {
                                var67 = 0;
                            } else if (var67 > 255) {
                                var67 = 255;
                            }
                            this.field5358[var66] = (byte) var67;
                        }
                        if (var64.length > 0) {
                            this.field5343.field4288 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field5340 != null) {
            for (int var68 = 0; var68 < var7; var68++) {
                int var69 = arg1[var68];
                if (var69 < this.field5340.length) {
                    int[] var70 = this.field5340[var69];
                    for (int var71 = 0; var71 < var70.length; var71++) {
                        int var72 = var70[var71];
                        int var73 = this.field5342[var72] & 0xFFFF;
                        int var74 = var73 >> 10 & 0x3F;
                        int var75 = var73 >> 7 & 0x7;
                        int var76 = var73 & 0x7F;
                        int var77 = arg2 + var74 & 0x3F;
                        int var78 = arg3 / 4 + var75;
                        if (var78 < 0) {
                            var78 = 0;
                        } else if (var78 > 7) {
                            var78 = 7;
                        }
                        int var79 = arg4 + var76;
                        if (var79 < 0) {
                            var79 = 0;
                        } else if (var79 > 127) {
                            var79 = 127;
                        }
                        this.field5342[var72] = (short) (var77 << 10 | var78 << 7 | var79);
                    }
                    if (var70.length > 0) {
                        this.field5343.field4288 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V", line = 415)
    public final void method2346(int arg0) {
        this.field5331 = (short) arg0;
        if (this.field5354 != null) {
            this.field5354.field4288 = false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lch;IJIIIIFF)S", line = 422)
    private final short method2347(class114 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field5346[arg1];
        int var12 = this.field5346[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field5350[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field5323[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field5350[var13] = (short) (this.field5364 + 1);
        field5323[var13] = arg2;
        this.field5328[this.field5364] = (short) arg3;
        this.field5333[this.field5364] = (short) arg4;
        this.field5347[this.field5364] = (short) arg5;
        this.field5357[this.field5364] = (short) arg6;
        this.field5324[this.field5364] = arg7;
        this.field5339[this.field5364] = arg8;
        return (short) (this.field5364++);
    }

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "()V", line = 460)
    public final void method526() {
        for (int var1 = 0; var1 < this.field5325; var1++) {
            int var2 = this.field5332[var1];
            this.field5332[var1] = this.field5344[var1];
            this.field5344[var1] = -var2;
        }
        this.field5330.field4634 = false;
        this.field5362.field4288 = false;
    }

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "()V", line = 475)
    public final void method2348() {
        int var10002;
        if (this.field5348 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field5325; var3++) {
                int var4 = this.field5348[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field5351 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field5351[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field5325) {
                int var7 = this.field5348[var6] & 0xFF;
                this.field5351[var7][var1[var7]++] = var6++;
            }
            this.field5348 = null;
        }
        if (this.field5361 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field5363; var10++) {
            int var11 = this.field5361[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field5340 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field5340[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field5363) {
            int var14 = this.field5361[var13] & 0xFF;
            this.field5340[var14][var8[var14]++] = var13++;
        }
        this.field5361 = null;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "()I", line = 567)
    public final int method520() {
        if (!this.field5330.field4634) {
            this.method2349();
        }
        return this.field5330.field4641;
    }

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "()V", line = 574)
    private final void method2349() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field5327; var9++) {
            int var10 = this.field5344[var9];
            int var11 = this.field5365[var9];
            int var12 = this.field5332[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var10 * var10 + var12 * var12;
            if (var14 > var8) {
                var8 = var14;
            }
        }
        this.field5330.field4640 = (short) var1;
        this.field5330.field4635 = (short) var4;
        this.field5330.field4637 = (short) var2;
        this.field5330.field4636 = (short) var5;
        this.field5330.field4639 = (short) var3;
        this.field5330.field4641 = (short) var6;
        this.field5330.field4638 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field5330.field4634 = true;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([FI)[F", line = 645)
    private static final float[] method2350(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class242.method1846(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZZZ)Lo;", line = 650)
    public final class96 method515(boolean arg0, boolean arg1, boolean arg2) {
        return this.method2354(arg0, arg1, arg2, field5368, field5360);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZZZZZZZ)V", line = 653)
    public final void method2351(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field5337 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field5364 != 0) {
            if (arg6) {
                boolean var8 = !this.field5343.field4288 && (arg1 || arg2 && !class3.field36);
                this.method2377(false, !this.field5362.field4288 && arg0, var8, this.field5354 != null && !this.field5354.field4288 && arg2, !this.field5366.field4288 && arg3);
                if (!this.field5349.field4288 && arg4 && arg1) {
                    this.method2376();
                }
            }
            if (arg0) {
                if (this.field5362.field4288) {
                    if (!this.field5330.field4634) {
                        this.method2349();
                    }
                    this.field5344 = null;
                    this.field5365 = null;
                    this.field5332 = null;
                    this.field5350 = null;
                    this.field5346 = null;
                } else {
                    this.field5353 = (byte) (this.field5353 | 0x1);
                }
            }
            if (arg1) {
                if (this.field5343.field4288) {
                    this.field5342 = null;
                    this.field5358 = null;
                } else {
                    this.field5353 = (byte) (this.field5353 | 0x2);
                }
            }
            if (arg2 && class3.field36) {
                if (this.field5354.field4288) {
                    this.field5328 = null;
                    this.field5333 = null;
                    this.field5347 = null;
                    this.field5357 = null;
                } else {
                    this.field5353 = (byte) (this.field5353 | 0x4);
                }
            }
            if (arg3) {
                if (this.field5366.field4288) {
                    this.field5324 = null;
                    this.field5339 = null;
                } else {
                    this.field5353 = (byte) (this.field5353 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field5349.field4288 && this.field5343.field4288) {
                    this.field5335 = null;
                    this.field5322 = null;
                    this.field5356 = null;
                } else {
                    this.field5353 = (byte) (this.field5353 | 0x10);
                }
            }
            if (arg5) {
                this.field5348 = null;
                this.field5361 = null;
                this.field5351 = (int[][]) null;
                this.field5340 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(SS)V", line = 750)
    public final void method2352(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field5363; var3++) {
            if (this.field5355[var3] == arg0) {
                this.field5355[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class153.field2439.method775(arg0 & 0xFFFF, 69);
            var5 = class153.field2439.method773(false, arg0 & 0xFFFF);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class153.field2439.method775(arg1 & 0xFFFF, -97);
            var7 = class153.field2439.method773(false, arg1 & 0xFFFF);
        }
        if (var4 != var6 || var5 != var7) {
            this.field5343.field4288 = false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "()I", line = 785)
    public final int method547() {
        if (!this.field5330.field4634) {
            this.method2349();
        }
        return this.field5330.field4635;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(III)V", line = 793)
    public final void method512(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5325; var4++) {
            this.field5344[var4] += arg0;
            this.field5365[var4] += arg1;
            this.field5332[var4] += arg2;
        }
        this.field5330.field4634 = false;
        this.field5362.field4288 = false;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V", line = 810)
    public final void method531(int arg0) {
        int var2 = class153.field2438[arg0];
        int var3 = class153.field2445[arg0];
        for (int var4 = 0; var4 < this.field5325; var4++) {
            int var5 = this.field5365[var4] * var3 - this.field5332[var4] * var2 >> 16;
            this.field5332[var4] = this.field5365[var4] * var2 + this.field5332[var4] * var3 >> 16;
            this.field5365[var4] = var5;
        }
        this.field5330.field4634 = false;
        this.field5362.field4288 = false;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ISIB)I", line = 833)
    private static final int method2353(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class153.field2444[class62.method537(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class153.field2439.method775(arg1 & 0xFFFF, 76);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class153.field2439.method773(false, arg1 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var10 & 0xFF00 << 8) + (var11 & 0xFF00);
            }
        }
        return (var4 << 8) + (255 - (arg3 & 0xFF));
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(ZZZ)Lo;", line = 891)
    public final class96 method532(boolean arg0, boolean arg1, boolean arg2) {
        return this.method2354(arg0, arg1, arg2, field5370, field5369);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZZZLac;Lac;)Lo;", line = 894)
    private final class96 method2354(boolean arg0, boolean arg1, boolean arg2, class337 arg3, class337 arg4) {
        arg3.field5325 = this.field5325;
        arg3.field5327 = this.field5327;
        arg3.field5364 = this.field5364;
        arg3.field5363 = this.field5363;
        arg3.field5352 = this.field5352;
        arg3.field5331 = this.field5331;
        arg3.field5337 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
        if (arg3.field5344 == null || arg3.field5344.length < this.field5325) {
            arg3.field5344 = new int[this.field5325 + 100];
            arg3.field5365 = new int[this.field5325 + 100];
            arg3.field5332 = new int[this.field5325 + 100];
        }
        for (int var6 = 0; var6 < this.field5325; var6++) {
            arg3.field5344[var6] = this.field5344[var6];
            arg3.field5365[var6] = this.field5365[var6];
            arg3.field5332[var6] = this.field5332[var6];
        }
        if (arg3.field5362 == null) {
            arg3.field5362 = new class254();
        }
        arg3.field5362.field4288 = false;
        if (arg3.field5330 == null) {
            arg3.field5330 = new class284();
        }
        arg3.field5330.field4634 = false;
        if (arg0) {
            arg3.field5358 = this.field5358;
        } else {
            if (arg4.field5358 == null || arg4.field5358.length < this.field5363) {
                arg4.field5358 = new byte[this.field5363 + 100];
            }
            arg3.field5358 = arg4.field5358;
            for (int var7 = 0; var7 < this.field5363; var7++) {
                arg3.field5358[var7] = this.field5358[var7];
            }
        }
        if (arg1) {
            arg3.field5342 = this.field5342;
        } else {
            if (arg4.field5342 == null || arg4.field5342.length < this.field5363) {
                arg4.field5342 = new short[this.field5363 + 100];
            }
            arg3.field5342 = arg4.field5342;
            for (int var8 = 0; var8 < this.field5363; var8++) {
                arg3.field5342[var8] = this.field5342[var8];
            }
        }
        if (arg0 && arg1) {
            arg3.field5343 = this.field5343;
        } else {
            if (arg4.field5343 == null) {
                arg4.field5343 = new class254();
            }
            arg3.field5343 = arg4.field5343;
            arg3.field5343.field4288 = false;
        }
        if (arg2 || this.field5328 == null) {
            arg3.field5328 = this.field5328;
            arg3.field5333 = this.field5333;
            arg3.field5347 = this.field5347;
            arg3.field5357 = this.field5357;
            arg3.field5354 = this.field5354;
        } else {
            if (arg4.field5328 == null || arg4.field5328.length < this.field5364) {
                arg4.field5328 = new short[this.field5364 + 100];
                arg4.field5333 = new short[this.field5364 + 100];
                arg4.field5347 = new short[this.field5364 + 100];
                arg4.field5357 = new short[this.field5364 + 100];
            }
            arg3.field5328 = arg4.field5328;
            arg3.field5333 = arg4.field5333;
            arg3.field5347 = arg4.field5347;
            arg3.field5357 = arg4.field5357;
            for (int var9 = 0; var9 < this.field5364; var9++) {
                arg3.field5328[var9] = this.field5328[var9];
                arg3.field5333[var9] = this.field5333[var9];
                arg3.field5347[var9] = this.field5347[var9];
                arg3.field5357[var9] = this.field5357[var9];
            }
            if (class3.field36) {
                if (arg4.field5354 == null) {
                    arg4.field5354 = new class254();
                }
                arg3.field5354 = arg4.field5354;
                arg3.field5354.field4288 = false;
            } else {
                arg3.field5354 = null;
            }
        }
        arg3.field5324 = this.field5324;
        arg3.field5339 = this.field5339;
        arg3.field5348 = this.field5348;
        arg3.field5351 = this.field5351;
        arg3.field5335 = this.field5335;
        arg3.field5322 = this.field5322;
        arg3.field5356 = this.field5356;
        arg3.field5355 = this.field5355;
        arg3.field5361 = this.field5361;
        arg3.field5340 = this.field5340;
        arg3.field5366 = this.field5366;
        arg3.field5349 = this.field5349;
        arg3.field5338 = this.field5338;
        arg3.field5350 = this.field5350;
        arg3.field5346 = this.field5346;
        arg3.field1597 = this.field1597;
        arg3.field5321 = this.field5321;
        arg3.field5336 = this.field5336;
        arg3.field5345 = this.field5345;
        arg3.field5326 = this.field5326;
        return arg3;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIFFF)[F", line = 1051)
    private static final float[] method2355(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float var8 = 1.0F;
        float var9 = 0.0F;
        float var10 = (float) arg1 / 32767.0F;
        float var11 = -((float) Math.sqrt((double) (1.0F - var10 * var10)));
        float var12 = 1.0F - var10;
        float var13 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var13 != 0.0F) {
            var8 = (float) (-arg2) / var13;
            var9 = (float) arg0 / var13;
        }
        var7[0] = var8 * var8 * var12 + var10;
        var7[1] = var9 * var11;
        var7[2] = var8 * var9 * var12;
        var7[3] = -var9 * var11;
        var7[4] = var10;
        var7[5] = var8 * var11;
        var7[6] = var8 * var9 * var12;
        var7[7] = -var8 * var11;
        var7[8] = var9 * var9 * var12 + var10;
        float[] var14 = new float[9];
        float var15 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var16 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var17 = 1.0F - var15;
        var14[0] = var15;
        var14[1] = 0.0F;
        var14[2] = var16;
        var14[3] = 0.0F;
        var14[4] = 1.0F;
        var14[5] = 0.0F;
        var14[6] = -var16;
        var14[7] = 0.0F;
        var14[8] = var15;
        float[] var18 = new float[] { var7[6] * var14[2] + var7[0] * var14[0] + var7[3] * var14[1], var7[7] * var14[2] + var7[1] * var14[0] + var7[4] * var14[1], var7[8] * var14[2] + var7[2] * var14[0] + var7[5] * var14[1], var7[6] * var14[5] + var7[0] * var14[3] + var7[3] * var14[4], var7[7] * var14[5] + var7[1] * var14[3] + var7[4] * var14[4], var7[8] * var14[5] + var7[2] * var14[3] + var7[5] * var14[4], var7[6] * var14[8] + var7[0] * var14[6] + var7[3] * var14[7], var7[7] * var14[8] + var7[1] * var14[6] + var7[4] * var14[7], var7[8] * var14[8] + var7[2] * var14[6] + var7[5] * var14[7] };
        var18[0] *= arg4;
        var18[1] *= arg4;
        var18[2] *= arg4;
        var18[3] *= arg5;
        var18[4] *= arg5;
        var18[5] *= arg5;
        var18[6] *= arg6;
        var18[7] *= arg6;
        var18[8] *= arg6;
        return var18;
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "()Z", line = 1119)
    public final boolean method536() {
        if (this.field5351 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field5325; var1++) {
            this.field5344[var1] <<= 0x4;
            this.field5365[var1] <<= 0x4;
            this.field5332[var1] <<= 0x4;
        }
        field5379 = 0;
        field5373 = 0;
        field5382 = 0;
        return true;
    }

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "()V", line = 1141)
    public final void method522() {
        for (int var1 = 0; var1 < this.field5325; var1++) {
            int var2 = this.field5344[var1];
            this.field5344[var1] = this.field5332[var1];
            this.field5332[var1] = -var2;
        }
        this.field5330.field4634 = false;
        this.field5362.field4288 = false;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 1157)
    private static final void method2356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
        int var12 = arg0 - arg3;
        int var13 = arg1 - arg4;
        int var14 = arg2 - arg5;
        float var15 = arg7[2] * (float) var14 + arg7[0] * (float) var12 + arg7[1] * (float) var13;
        float var16 = arg7[5] * (float) var14 + arg7[3] * (float) var12 + arg7[4] * (float) var13;
        float var17 = arg7[8] * (float) var14 + arg7[6] * (float) var12 + arg7[7] * (float) var13;
        float var18;
        float var19;
        if (arg6 == 0) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + 0.5F - var17;
        } else if (arg6 == 1) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + var17 + 0.5F;
        } else if (arg6 == 2) {
            var18 = arg9 + 0.5F - var15;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 3) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 4) {
            var18 = arg11 + var17 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else {
            var18 = arg11 + 0.5F - var17;
            var19 = arg10 + 0.5F - var16;
        }
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        field5381 = var18;
        field5384 = var19;
    }

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "()I", line = 1236)
    public final int method2357() {
        return this.field5331;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lhd;IIIZ)V", line = 1240)
    public final void method879(class161 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class337 var6 = (class337) arg0;
        if (this.field5363 == 0 || var6.field5363 == 0) {
            return;
        }
        int var7 = var6.field5327;
        int[] var8 = var6.field5344;
        int[] var9 = var6.field5365;
        int[] var10 = var6.field5332;
        short[] var11 = var6.field5328;
        short[] var12 = var6.field5333;
        short[] var13 = var6.field5347;
        short[] var14 = var6.field5357;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field5359 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field5359.field4485;
            var16 = this.field5359.field4488;
            var17 = this.field5359.field4487;
            var18 = this.field5359.field4486;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field5359 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field5359.field4485;
            var20 = var6.field5359.field4488;
            var21 = var6.field5359.field4487;
            var22 = var6.field5359.field4486;
        }
        int[] var23 = var6.field5346;
        short[] var24 = var6.field5350;
        if (!var6.field5330.field4634) {
            var6.method2349();
        }
        short var25 = var6.field5330.field4637;
        short var26 = var6.field5330.field4636;
        short var27 = var6.field5330.field4640;
        short var28 = var6.field5330.field4635;
        short var29 = var6.field5330.field4639;
        short var30 = var6.field5330.field4641;
        for (int var31 = 0; var31 < this.field5327; var31++) {
            int var32 = this.field5365[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field5344[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field5332[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field5346[var31];
                        int var37 = this.field5346[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field5350[var38] - 1;
                            if (var35 == -1 || this.field5357[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var15 == null) {
                                            this.field5359 = new class268();
                                            var15 = this.field5359.field4485 = class125.method975(true, this.field5328);
                                            var16 = this.field5359.field4488 = class125.method975(true, this.field5333);
                                            var17 = this.field5359.field4487 = class125.method975(true, this.field5347);
                                            var18 = this.field5359.field4486 = class125.method975(true, this.field5357);
                                        }
                                        if (var19 == null) {
                                            class268 var44 = var6.field5359 = new class268();
                                            var19 = var44.field4485 = class125.method975(true, var11);
                                            var20 = var44.field4488 = class125.method975(true, var12);
                                            var21 = var44.field4487 = class125.method975(true, var13);
                                            var22 = var44.field4486 = class125.method975(true, var14);
                                        }
                                        short var45 = this.field5328[var35];
                                        short var46 = this.field5333[var35];
                                        short var47 = this.field5347[var35];
                                        short var48 = this.field5357[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        short var54 = var12[var40];
                                        short var55 = var13[var40];
                                        short var56 = var14[var40];
                                        int var57 = this.field5346[var31];
                                        int var58 = this.field5346[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field5350[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var53;
                                                var16[var60] += var54;
                                                var17[var60] += var55;
                                                var18[var60] += var56;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIII)Z", line = 1477)
    private final boolean method2358(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V", line = 1493)
    public final void method544(int arg0) {
        int var2 = class153.field2438[arg0];
        int var3 = class153.field2445[arg0];
        for (int var4 = 0; var4 < this.field5325; var4++) {
            int var5 = this.field5344[var4] * var3 + this.field5332[var4] * var2 >> 16;
            this.field5332[var4] = this.field5332[var4] * var3 - this.field5344[var4] * var2 >> 16;
            this.field5344[var4] = var5;
        }
        this.field5330.field4634 = false;
        this.field5362.field4288 = false;
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)V", line = 1512)
    public final void method2359(int arg0) {
        this.field5352 = (short) arg0;
        this.field5343.field4288 = false;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILac;[[I[[IIII)V", line = 1521)
    public final void method2360(int arg0, int arg1, class337 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field5330.field4634) {
            arg2.method2349();
        }
        int var9 = arg2.field5330.field4640 + arg5;
        int var10 = arg2.field5330.field4635 + arg5;
        int var11 = arg2.field5330.field4639 + arg7;
        int var12 = arg2.field5330.field4641 + arg7;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var9 < 0 || var10 + 128 >> 7 >= arg3.length || var11 < 0 || var12 + 128 >> 7 >= arg3[0].length) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg4 == null) {
                return;
            }
            if (var9 < 0 || var10 + 128 >> 7 >= arg4.length || var11 < 0 || var12 + 128 >> 7 >= arg4[0].length) {
                return;
            }
        } else {
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            int var15 = var11 >> 7;
            int var16 = var12 + 127 >> 7;
            if (arg3[var13][var15] == arg6 && arg3[var14][var15] == arg6 && arg3[var13][var16] == arg6 && arg3[var14][var16] == arg6) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var17 = 0; var17 < this.field5327; var17++) {
                int var18 = this.field5344[var17] + arg5;
                int var19 = this.field5332[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field5365[var17] = this.field5365[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field5330.field4637;
            for (int var28 = 0; var28 < this.field5327; var28++) {
                int var29 = (this.field5365[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field5344[var28] + arg5;
                    int var31 = this.field5332[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field5365[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method749(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field5330.field4636 - arg2.field5330.field4637;
            for (int var42 = 0; var42 < this.field5327; var42++) {
                int var43 = this.field5344[var42] + arg5;
                int var44 = this.field5332[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field5365[var42] = var51 + this.field5365[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field5330.field4636 - arg2.field5330.field4637;
            for (int var53 = 0; var53 < this.field5327; var53++) {
                int var54 = this.field5344[var53] + arg5;
                int var55 = this.field5332[var53] + arg7;
                int var56 = var54 & 0x7F;
                int var57 = var55 & 0x7F;
                int var58 = var54 >> 7;
                int var59 = var55 >> 7;
                int var60 = (128 - var56) * arg3[var58][var59] + arg3[var58 + 1][var59] * var56 >> 7;
                int var61 = (128 - var56) * arg3[var58][var59 + 1] + arg3[var58 + 1][var59 + 1] * var56 >> 7;
                int var62 = (128 - var57) * var60 + var57 * var61 >> 7;
                int var63 = (128 - var56) * arg4[var58][var59] + arg4[var58 + 1][var59] * var56 >> 7;
                int var64 = (128 - var56) * arg4[var58][var59 + 1] + arg4[var58 + 1][var59 + 1] * var56 >> 7;
                int var65 = (128 - var57) * var63 + var57 * var64 >> 7;
                int var66 = var62 - var65;
                this.field5365[var53] = ((this.field5365[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field5362.field4288 = false;
        this.field5330.field4634 = false;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "()I", line = 1727)
    public final int method444() {
        if (!this.field5330.field4634) {
            this.method2349();
        }
        return this.field5330.field4637;
    }

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "()V", line = 1734)
    private final void method2361() {
        GL var1 = class42.field627;
        if (this.field5363 == 0) {
            return;
        }
        if (this.field5337 != 0) {
            this.method2377(true, !this.field5362.field4288 && (this.field5337 & 0x1) != 0, !this.field5343.field4288 && (this.field5337 & 0x2) != 0, this.field5354 != null && !this.field5354.field4288 && (this.field5337 & 0x4) != 0, false);
        }
        this.method2377(false, !this.field5362.field4288, !this.field5343.field4288, this.field5354 != null && !this.field5354.field4288, !this.field5366.field4288);
        if (!this.field5349.field4288) {
            this.method2376();
        }
        if (this.field5353 != 0) {
            if ((this.field5353 & 0x1) != 0) {
                this.field5344 = null;
                this.field5365 = null;
                this.field5332 = null;
                this.field5350 = null;
                this.field5346 = null;
            }
            if ((this.field5353 & 0x2) != 0) {
                this.field5342 = null;
                this.field5358 = null;
            }
            if ((this.field5353 & 0x4) != 0) {
                this.field5328 = null;
                this.field5333 = null;
                this.field5347 = null;
                this.field5357 = null;
            }
            if ((this.field5353 & 0x8) != 0) {
                this.field5324 = null;
                this.field5339 = null;
            }
            if ((this.field5353 & 0x10) != 0) {
                this.field5335 = null;
                this.field5322 = null;
                this.field5356 = null;
            }
            this.field5353 = 0;
        }
        class53 var2 = null;
        if (this.field5362.field4291 != null) {
            this.field5362.field4291.method422();
            var2 = this.field5362.field4291;
            var1.glVertexPointer(3, 5126, this.field5362.field4286, (long) this.field5362.field4293);
        }
        if (this.field5343.field4291 != null) {
            if (this.field5343.field4291 != var2) {
                this.field5343.field4291.method422();
                var2 = this.field5343.field4291;
            }
            var1.glColorPointer(4, 5121, this.field5343.field4286, (long) this.field5343.field4293);
        }
        if (class3.field36 && this.field5354.field4291 != null) {
            if (this.field5354.field4291 != var2) {
                this.field5354.field4291.method422();
                var2 = this.field5354.field4291;
            }
            var1.glNormalPointer(5126, this.field5354.field4286, (long) this.field5354.field4293);
        }
        if (this.field5366.field4291 != null) {
            if (this.field5366.field4291 != var2) {
                this.field5366.field4291.method422();
                class53 var3 = this.field5366.field4291;
            }
            var1.glTexCoordPointer(2, 5126, this.field5366.field4286, (long) this.field5366.field4293);
        }
        if (this.field5349.field4291 != null) {
            this.field5349.field4291.method423();
        }
        if (this.field5362.field4291 == null || this.field5343.field4291 == null || class3.field36 && this.field5354.field4291 == null || this.field5366.field4291 == null) {
            if (class42.field645) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field5362.field4291 == null) {
                this.field5362.field4289.position(this.field5362.field4293);
                var1.glVertexPointer(3, 5126, this.field5362.field4286, this.field5362.field4289);
            }
            if (this.field5343.field4291 == null) {
                this.field5343.field4289.position(this.field5343.field4293);
                var1.glColorPointer(4, 5121, this.field5343.field4286, this.field5343.field4289);
            }
            if (class3.field36 && this.field5354.field4291 == null) {
                this.field5354.field4289.position(this.field5354.field4293);
                var1.glNormalPointer(5126, this.field5354.field4286, this.field5354.field4289);
            }
            if (this.field5366.field4291 == null) {
                this.field5366.field4289.position(this.field5366.field4293);
                var1.glTexCoordPointer(2, 5126, this.field5366.field4286, this.field5366.field4289);
            }
        }
        if (this.field5349.field4291 == null && class42.field645) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field5338.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field5338[var5];
            int var7 = this.field5338[var5 + 1];
            short var8 = this.field5355[var6];
            if (var8 == -1) {
                class42.method273(-1);
                class310.method2203(0, 0, -124);
            } else {
                class153.field2439.method762(-118, var8 & 0xFFFF);
            }
            if (this.field5349.field4291 == null) {
                this.field5349.field4289.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field5349.field4289);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "()V", line = 1906)
    public static void method2362() {
        field5323 = null;
        field5341 = null;
        field5367 = null;
        field5360 = null;
        field5368 = null;
        field5369 = null;
        field5370 = null;
        field5371 = null;
        field5372 = null;
        field5383 = null;
        field5378 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIIJILdc;)V", line = 1919)
    public final void method440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class158 arg10) {
        if (this.field5364 == 0) {
            return;
        }
        if (!this.field5330.field4634) {
            this.method2349();
        }
        short var13 = this.field5330.field4638;
        short var14 = this.field5330.field4637;
        short var15 = this.field5330.field4636;
        if (arg10 != null) {
            arg10.method1231(arg0, arg9, arg5, arg6, arg7);
        }
        int var16 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var17 = arg1 * arg6 + arg2 * var16 >> 16;
        int var18 = (arg1 * var15 + arg2 * var13 >> 16) + var17;
        if (var18 <= 50) {
            return;
        }
        int var19 = (-var13 * arg2 + arg1 * var14 >> 16) + var17;
        if (var19 >= 3584) {
            return;
        }
        int var20 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var21 = var13 + var20 << 9;
        if (var21 / var18 <= class45.field702) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class338.field5393) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class241.field3987) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class338.field5385) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class153.field2438[arg0];
            var27 = class153.field2445[arg0];
        }
        if (arg8 > 0L && class275.field4544 && var19 > 0) {
            int var28;
            int var29;
            if (var20 > 0) {
                var28 = var22 / var18;
                var29 = var21 / var19;
            } else {
                var28 = var22 / var19;
                var29 = var21 / var18;
            }
            int var30;
            int var31;
            if (var23 > 0) {
                var30 = var25 / var18;
                var31 = var24 / var19;
            } else {
                var30 = var25 / var19;
                var31 = var24 / var18;
            }
            if (class98.field1623 >= var28 && class98.field1623 <= var29 && class271.field4503 >= var30 && class271.field4503 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field5330.field4640;
                short var37 = this.field5330.field4635;
                short var38 = this.field5330.field4639;
                short var39 = this.field5330.field4641;
                int[] var40 = new int[] { var36, var37, var36, var37, var36, var37, var36, var37 };
                int[] var41 = new int[] { var38, var38, var39, var39, var38, var38, var39, var39 };
                int[] var42 = new int[] { var14, var14, var14, var14, var15, var15, var15, var15 };
                for (int var43 = 0; var43 < 8; var43++) {
                    int var44 = var40[var43];
                    int var45 = var42[var43];
                    int var46 = var41[var43];
                    if (arg0 != 0) {
                        int var47 = var26 * var46 + var27 * var44 >> 16;
                        var46 = var27 * var46 - var26 * var44 >> 16;
                        var44 = var47;
                    }
                    int var48 = arg5 + var44;
                    int var49 = arg6 + var45;
                    int var50 = arg7 + var46;
                    int var51 = arg3 * var50 + arg4 * var48 >> 16;
                    int var52 = arg4 * var50 - arg3 * var48 >> 16;
                    int var54 = arg2 * var49 - arg1 * var52 >> 16;
                    int var55 = arg1 * var49 + arg2 * var52 >> 16;
                    if (var55 > 0) {
                        int var57 = (var51 << 9) / var55;
                        int var58 = (var54 << 9) / var55;
                        if (var57 < var32) {
                            var32 = var57;
                        }
                        if (var57 > var33) {
                            var33 = var57;
                        }
                        if (var58 < var34) {
                            var34 = var58;
                        }
                        if (var58 > var35) {
                            var35 = var58;
                        }
                    }
                }
                if (class98.field1623 >= var32 && class98.field1623 <= var33 && class271.field4503 >= var34 && class271.field4503 <= var35) {
                    if (this.field1597) {
                        class221.field3606[class298.field4775++] = arg8;
                    } else {
                        if (field5383.length < this.field5364) {
                            field5383 = new int[this.field5364];
                            field5378 = new int[this.field5364];
                        }
                        int var59 = 0;
                        label124: while (true) {
                            if (var59 >= this.field5327) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field5363) {
                                        break label124;
                                    }
                                    short var80 = this.field5335[var79];
                                    short var81 = this.field5322[var79];
                                    short var82 = this.field5356[var79];
                                    if (this.method2358(class98.field1623, class271.field4503, field5378[var80], field5378[var81], field5378[var82], field5383[var80], field5383[var81], field5383[var82])) {
                                        class221.field3606[class298.field4775++] = arg8;
                                        break label124;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field5344[var59];
                            int var61 = this.field5365[var59];
                            int var62 = this.field5332[var59];
                            if (arg0 != 0) {
                                int var63 = var26 * var62 + var27 * var60 >> 16;
                                var62 = var27 * var62 - var26 * var60 >> 16;
                                var60 = var63;
                            }
                            int var64 = arg5 + var60;
                            int var65 = arg6 + var61;
                            int var66 = arg7 + var62;
                            int var67 = arg3 * var66 + arg4 * var64 >> 16;
                            int var68 = arg4 * var66 - arg3 * var64 >> 16;
                            int var70 = arg2 * var65 - arg1 * var68 >> 16;
                            int var71 = arg1 * var65 + arg2 * var68 >> 16;
                            if (var71 < 50) {
                                break;
                            }
                            int var73 = (var67 << 9) / var71;
                            int var74 = (var70 << 9) / var71;
                            int var75 = this.field5346[var59];
                            int var76 = this.field5346[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field5350[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field5383[var78] = var73;
                                field5378[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class42.field627;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method2361();
        var83.glPopMatrix();
        if (arg10 != null) {
            arg10.method1222(arg0, arg1, arg2, arg3, arg4, arg9, arg5, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "()V", line = 2201)
    public final void method2363() {
        if (this.field5328 == null) {
            this.method526();
            return;
        }
        for (int var1 = 0; var1 < this.field5325; var1++) {
            int var2 = this.field5332[var1];
            this.field5332[var1] = this.field5344[var1];
            this.field5344[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field5364; var3++) {
            short var4 = this.field5347[var3];
            this.field5347[var3] = this.field5328[var3];
            this.field5328[var3] = (short) (-var4);
        }
        this.field5330.field4634 = false;
        this.field5362.field4288 = false;
        if (this.field5354 != null) {
            this.field5354.field4288 = false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V", line = 4553)
    private class337() {
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lch;IIZ)V", line = 4555)
    public class337(class114 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field1912];
        this.field5346 = new int[arg0.field1886 + 1];
        for (int var6 = 0; var6 < arg0.field1912; var6++) {
            if ((arg0.field1883 == null || arg0.field1883[var6] != 2) && (arg0.field1866 == null || arg0.field1866[var6] == -1 || !class153.field2439.method763(arg0.field1866[var6] & 0xFFFF, false))) {
                var5[this.field5363++] = var6;
                this.field5346[arg0.field1876[var6]]++;
                this.field5346[arg0.field1878[var6]]++;
                this.field5346[arg0.field1892[var6]]++;
            }
        }
        long[] var7 = new long[this.field5363];
        for (int var8 = 0; var8 < this.field5363; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field1866 != null) {
                var14 = arg0.field1866[var9];
                if (var14 != -1) {
                    var12 = class153.field2439.method776(var14 & 0xFFFF, (byte) 40);
                    var13 = class153.field2439.method772(66, var14 & 0xFFFF);
                }
            }
            boolean var15 = arg0.field1909 != null && arg0.field1909[var9] != 0 || var14 != -1 && !class153.field2439.method780(65535, var14 & 0xFFFF);
            if ((arg3 || var15) && arg0.field1900 != null) {
                var10 += arg0.field1900[var9] << 17;
            }
            if (var15) {
                var10 += 65536;
            }
            int var16 = ((var12 & 0xFF) << 8) + var10;
            int var17 = (var13 & 0xFF) + var16;
            int var18 = ((var14 & 0xFFFF) << 16) + var11;
            int var19 = (var8 & 0xFFFF) + var18;
            var7[var8] = ((long) var17 << 32) + (long) var19;
        }
        class226.method1705((byte) 48, var5, var7);
        this.field5325 = arg0.field1886;
        this.field5327 = arg0.field1885;
        this.field5344 = arg0.field1869;
        this.field5365 = arg0.field1916;
        this.field5332 = arg0.field1910;
        this.field5348 = arg0.field1894;
        this.field5321 = arg0.field1911;
        this.field5345 = arg0.field1902;
        this.field5326 = arg0.field1913;
        int var20 = this.field5363 * 3;
        this.field5328 = new short[var20];
        this.field5333 = new short[var20];
        this.field5347 = new short[var20];
        this.field5357 = new short[var20];
        this.field5324 = new float[var20];
        this.field5339 = new float[var20];
        this.field5342 = new short[this.field5363];
        this.field5358 = new byte[this.field5363];
        this.field5335 = new short[this.field5363];
        this.field5322 = new short[this.field5363];
        this.field5356 = new short[this.field5363];
        this.field5355 = new short[this.field5363];
        if (arg0.field1884 != null) {
            this.field5361 = new byte[this.field5363];
        }
        if (arg0.field1865 != null) {
            this.field5336 = new short[this.field5363];
        }
        this.field5330 = new class284();
        this.field5362 = new class254();
        this.field5343 = new class254();
        if (class3.field36) {
            this.field5354 = new class254();
        }
        this.field5366 = new class254();
        this.field5349 = new class254();
        this.field5352 = (short) arg1;
        this.field5331 = (short) arg2;
        this.field5350 = new short[var20];
        field5323 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < this.field5327; var22++) {
            int var23 = this.field5346[var22];
            this.field5346[var22] = var21;
            var21 += var23;
        }
        this.field5346[this.field5327] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field1879 != null) {
            int var28 = arg0.field1880;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field5363; var36++) {
                int var37 = var5[var36];
                if (arg0.field1879[var37] != -1) {
                    int var38 = arg0.field1879[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field1876[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field1878[var37];
                        } else {
                            var40 = arg0.field1892[var37];
                        }
                        int var41 = arg0.field1869[var40];
                        int var42 = arg0.field1916[var40];
                        int var43 = arg0.field1910[var40];
                        if (var41 < var29[var38]) {
                            var29[var38] = var41;
                        }
                        if (var41 > var30[var38]) {
                            var30[var38] = var41;
                        }
                        if (var42 < var31[var38]) {
                            var31[var38] = var42;
                        }
                        if (var42 > var32[var38]) {
                            var32[var38] = var42;
                        }
                        if (var43 < var33[var38]) {
                            var33[var38] = var43;
                        }
                        if (var43 > var34[var38]) {
                            var34[var38] = var43;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var44 = 0; var44 < var28; var44++) {
                byte var45 = arg0.field1901[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field1893[var44];
                        if (var46 == 0) {
                            var47 = 1.0F;
                            var48 = 1.0F;
                        } else if (var46 > 0) {
                            var47 = 1.0F;
                            var48 = (float) var46 / 1024.0F;
                        } else {
                            var48 = 1.0F;
                            var47 = (float) (-var46) / 1024.0F;
                        }
                        var49 = 64.0F / (float) (arg0.field1904[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field1893[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field1904[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field1888[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field1893[var44] / 1024.0F;
                        var49 = (float) arg0.field1904[var44] / 1024.0F;
                        var48 = (float) arg0.field1888[var44] / 1024.0F;
                    }
                    var27[var44] = method2355(arg0.field1874[var44], arg0.field1898[var44], arg0.field1875[var44], arg0.field1873[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field5363; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field1867[var51] & 0xFFFF;
            short var53;
            if (arg0.field1866 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field1866[var51];
            }
            int var54;
            if (arg0.field1879 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field1879[var51];
            }
            int var55;
            if (arg0.field1909 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field1909[var51] & 0xFF;
            }
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            float var60 = 0.0F;
            float var61 = 0.0F;
            byte var62 = 0;
            byte var63 = 0;
            int var64 = 0;
            if (var53 != -1) {
                if (var54 == -1) {
                    var56 = 0.0F;
                    var57 = 1.0F;
                    var58 = 1.0F;
                    var59 = 1.0F;
                    var62 = 1;
                    var60 = 0.0F;
                    var61 = 0.0F;
                    var63 = 2;
                } else {
                    var54 &= 0xFF;
                    byte var65 = arg0.field1901[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field1876[var51];
                        int var67 = arg0.field1878[var51];
                        int var68 = arg0.field1892[var51];
                        short var69 = arg0.field1874[var54];
                        short var70 = arg0.field1898[var54];
                        short var71 = arg0.field1875[var54];
                        float var72 = (float) arg0.field1869[var69];
                        float var73 = (float) arg0.field1916[var69];
                        float var74 = (float) arg0.field1910[var69];
                        float var75 = (float) arg0.field1869[var70] - var72;
                        float var76 = (float) arg0.field1916[var70] - var73;
                        float var77 = (float) arg0.field1910[var70] - var74;
                        float var78 = (float) arg0.field1869[var71] - var72;
                        float var79 = (float) arg0.field1916[var71] - var73;
                        float var80 = (float) arg0.field1910[var71] - var74;
                        float var81 = (float) arg0.field1869[var66] - var72;
                        float var82 = (float) arg0.field1916[var66] - var73;
                        float var83 = (float) arg0.field1910[var66] - var74;
                        float var84 = (float) arg0.field1869[var67] - var72;
                        float var85 = (float) arg0.field1916[var67] - var73;
                        float var86 = (float) arg0.field1910[var67] - var74;
                        float var87 = (float) arg0.field1869[var68] - var72;
                        float var88 = (float) arg0.field1916[var68] - var73;
                        float var89 = (float) arg0.field1910[var68] - var74;
                        float var90 = var76 * var80 - var77 * var79;
                        float var91 = var77 * var78 - var75 * var80;
                        float var92 = var75 * var79 - var76 * var78;
                        float var93 = var79 * var92 - var80 * var91;
                        float var94 = var80 * var90 - var78 * var92;
                        float var95 = var78 * var91 - var79 * var90;
                        float var96 = 1.0F / (var77 * var95 + var75 * var93 + var76 * var94);
                        var56 = (var83 * var95 + var81 * var93 + var82 * var94) * var96;
                        var58 = (var86 * var95 + var84 * var93 + var85 * var94) * var96;
                        var60 = (var89 * var95 + var87 * var93 + var88 * var94) * var96;
                        float var97 = var76 * var92 - var77 * var91;
                        float var98 = var77 * var90 - var75 * var92;
                        float var99 = var75 * var91 - var76 * var90;
                        float var100 = 1.0F / (var80 * var99 + var78 * var97 + var79 * var98);
                        var57 = (var83 * var99 + var81 * var97 + var82 * var98) * var100;
                        var59 = (var86 * var99 + var84 * var97 + var85 * var98) * var100;
                        var61 = (var89 * var99 + var87 * var97 + var88 * var98) * var100;
                    } else {
                        int var101 = arg0.field1876[var51];
                        int var102 = arg0.field1878[var51];
                        int var103 = arg0.field1892[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field1887[var54];
                        float var109 = (float) arg0.field1905[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field1888[var54] & 0xFFFF) / 1024.0F;
                            method2375(arg0.field1869[var101], arg0.field1916[var101], arg0.field1910[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field5375;
                            var57 = field5376;
                            method2375(arg0.field1869[var102], arg0.field1916[var102], arg0.field1910[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field5375;
                            var59 = field5376;
                            method2375(arg0.field1869[var103], arg0.field1916[var103], arg0.field1910[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field5375;
                            var61 = field5376;
                            float var111 = var110 / 2.0F;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > var111) {
                                    var58 -= var110;
                                    var62 = 1;
                                } else if (var56 - var58 > var111) {
                                    var58 += var110;
                                    var62 = 2;
                                }
                                if (var60 - var56 > var111) {
                                    var60 -= var110;
                                    var63 = 1;
                                } else if (var56 - var60 > var111) {
                                    var60 += var110;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > var111) {
                                    var59 -= var110;
                                    var62 = 1;
                                } else if (var57 - var59 > var111) {
                                    var59 += var110;
                                    var62 = 2;
                                }
                                if (var61 - var57 > var111) {
                                    var61 -= var110;
                                    var63 = 1;
                                } else if (var57 - var61 > var111) {
                                    var61 += var110;
                                    var63 = 2;
                                }
                            }
                        } else if (var65 == 2) {
                            float var112 = (float) arg0.field1907[var54] / 256.0F;
                            float var113 = (float) arg0.field1882[var54] / 256.0F;
                            int var114 = arg0.field1869[var102] - arg0.field1869[var101];
                            int var115 = arg0.field1916[var102] - arg0.field1916[var101];
                            int var116 = arg0.field1910[var102] - arg0.field1910[var101];
                            int var117 = arg0.field1869[var103] - arg0.field1869[var101];
                            int var118 = arg0.field1916[var103] - arg0.field1916[var101];
                            int var119 = arg0.field1910[var103] - arg0.field1910[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field1893[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field1904[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field1888[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method2366(var126, var127, var128);
                            method2356(arg0.field1869[var101], arg0.field1916[var101], arg0.field1910[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field5381;
                            var57 = field5384;
                            method2356(arg0.field1869[var102], arg0.field1916[var102], arg0.field1910[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field5381;
                            var59 = field5384;
                            method2356(arg0.field1869[var103], arg0.field1916[var103], arg0.field1910[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field5381;
                            var61 = field5384;
                        } else if (var65 == 3) {
                            method2373(arg0.field1869[var101], arg0.field1916[var101], arg0.field1910[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field5377;
                            var57 = field5374;
                            method2373(arg0.field1869[var102], arg0.field1916[var102], arg0.field1910[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field5377;
                            var59 = field5374;
                            method2373(arg0.field1869[var103], arg0.field1916[var103], arg0.field1910[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field5377;
                            var61 = field5374;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > 0.5F) {
                                    var58--;
                                    var62 = 1;
                                } else if (var56 - var58 > 0.5F) {
                                    var58++;
                                    var62 = 2;
                                }
                                if (var60 - var56 > 0.5F) {
                                    var60--;
                                    var63 = 1;
                                } else if (var56 - var60 > 0.5F) {
                                    var60++;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > 0.5F) {
                                    var59--;
                                    var62 = 1;
                                } else if (var57 - var59 > 0.5F) {
                                    var59++;
                                    var62 = 2;
                                }
                                if (var61 - var57 > 0.5F) {
                                    var61--;
                                    var63 = 1;
                                } else if (var57 - var61 > 0.5F) {
                                    var61++;
                                    var63 = 2;
                                }
                            }
                        }
                    }
                }
            }
            arg0.method889();
            byte var129;
            if (arg0.field1883 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field1883[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field1876[var51];
                class325 var133 = arg0.field1872[var132];
                this.field5335[var50] = this.method2347(arg0, var132, var130, var133.field5161, var133.field5169, var133.field5168, var133.field5166, var56, var57);
                int var134 = arg0.field1878[var51];
                class325 var135 = arg0.field1872[var134];
                this.field5322[var50] = this.method2347(arg0, var134, (long) var62 + var130, var135.field5161, var135.field5169, var135.field5168, var135.field5166, var58, var59);
                int var136 = arg0.field1892[var51];
                class325 var137 = arg0.field1872[var136];
                this.field5356[var50] = this.method2347(arg0, var136, (long) var63 + var130, var137.field5161, var137.field5169, var137.field5168, var137.field5166, var60, var61);
            } else if (var129 == 1) {
                class163 var138 = arg0.field1914[var51];
                long var139 = (long) ((var54 << 2) + (var138.field2582 > 0 ? 1024 : 2048) + (var138.field2583 + 256 << 12) + (var138.field2589 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field5335[var50] = this.method2347(arg0, arg0.field1876[var51], var139, var138.field2582, var138.field2583, var138.field2589, 0, var56, var57);
                this.field5322[var50] = this.method2347(arg0, arg0.field1878[var51], (long) var62 + var139, var138.field2582, var138.field2583, var138.field2589, 0, var58, var59);
                this.field5356[var50] = this.method2347(arg0, arg0.field1892[var51], (long) var63 + var139, var138.field2582, var138.field2583, var138.field2589, 0, var60, var61);
            }
            if (arg0.field1866 == null) {
                this.field5355[var50] = -1;
            } else {
                this.field5355[var50] = arg0.field1866[var51];
            }
            if (this.field5361 != null) {
                this.field5361[var50] = (byte) arg0.field1884[var51];
            }
            this.field5342[var50] = arg0.field1867[var51];
            if (arg0.field1909 != null) {
                this.field5358[var50] = arg0.field1909[var51];
            }
            if (arg0.field1865 != null) {
                this.field5336[var50] = arg0.field1865[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field5363; var143++) {
            short var144 = this.field5355[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field5338 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field5363; var147++) {
            short var148 = this.field5355[var147];
            if (var146 != var148) {
                this.field5338[var145++] = var147;
                var146 = var148;
            }
        }
        this.field5338[var145] = this.field5363;
        field5323 = null;
        this.field5328 = method2370(this.field5328, this.field5364);
        this.field5333 = method2370(this.field5333, this.field5364);
        this.field5347 = method2370(this.field5347, this.field5364);
        this.field5357 = method2370(this.field5357, this.field5364);
        this.field5324 = method2350(this.field5324, this.field5364);
        this.field5339 = method2350(this.field5339, this.field5364);
    }

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "()V", line = 2241)
    public static final void method2364() {
        field5360 = new class337();
        field5368 = new class337();
        field5369 = new class337();
        field5370 = new class337();
        field5371 = new class337();
        field5372 = new class337();
    }

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "()V", line = 2251)
    public final void method2365() {
        if (this.field5328 == null) {
            this.method514();
            return;
        }
        for (int var1 = 0; var1 < this.field5325; var1++) {
            this.field5344[var1] = -this.field5344[var1];
            this.field5332[var1] = -this.field5332[var1];
        }
        for (int var2 = 0; var2 < this.field5364; var2++) {
            this.field5328[var2] = (short) (-this.field5328[var2]);
            this.field5347[var2] = (short) (-this.field5347[var2]);
        }
        this.field5330.field4634 = false;
        this.field5362.field4288 = false;
        if (this.field5354 != null) {
            this.field5354.field4288 = false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "()Z", line = 2284)
    public final boolean method890() {
        return this.field5329 && this.field5344 != null && this.field5328 != null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(FFF)I", line = 2288)
    private static final int method2366(float arg0, float arg1, float arg2) {
        float var3 = arg0 < 0.0F ? -arg0 : arg0;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 > var3 && var4 > var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var5 > var3 && var5 > var4) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)V", line = 2322)
    public final void method529(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field5379 = 0;
            field5373 = 0;
            field5382 = 0;
            for (int var6 = 0; var6 < this.field5325; var6++) {
                field5379 += this.field5344[var6];
                field5373 += this.field5365[var6];
                field5382 += this.field5332[var6];
                var5++;
            }
            if (var5 > 0) {
                field5379 = field5379 / var5 + arg1;
                field5373 = field5373 / var5 + arg2;
                field5382 = field5382 / var5 + arg3;
            } else {
                field5379 = arg1;
                field5373 = arg2;
                field5382 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field5325; var7++) {
                this.field5344[var7] += arg1;
                this.field5365[var7] += arg2;
                this.field5332[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field5325; var8++) {
                this.field5344[var8] -= field5379;
                this.field5365[var8] -= field5373;
                this.field5332[var8] -= field5382;
                if (arg3 != 0) {
                    int var9 = class153.field2438[arg3];
                    int var10 = class153.field2445[arg3];
                    int var11 = this.field5365[var8] * var9 + this.field5344[var8] * var10 + 32767 >> 16;
                    this.field5365[var8] = this.field5365[var8] * var10 + 32767 - this.field5344[var8] * var9 >> 16;
                    this.field5344[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class153.field2438[arg1];
                    int var13 = class153.field2445[arg1];
                    int var14 = this.field5365[var8] * var13 + 32767 - this.field5332[var8] * var12 >> 16;
                    this.field5332[var8] = this.field5365[var8] * var12 + this.field5332[var8] * var13 + 32767 >> 16;
                    this.field5365[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class153.field2438[arg2];
                    int var16 = class153.field2445[arg2];
                    int var17 = this.field5344[var8] * var16 + this.field5332[var8] * var15 + 32767 >> 16;
                    this.field5332[var8] = this.field5332[var8] * var16 + 32767 - this.field5344[var8] * var15 >> 16;
                    this.field5344[var8] = var17;
                }
                this.field5344[var8] += field5379;
                this.field5365[var8] += field5373;
                this.field5332[var8] += field5382;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field5325; var18++) {
                this.field5344[var18] -= field5379;
                this.field5365[var18] -= field5373;
                this.field5332[var18] -= field5382;
                this.field5344[var18] = this.field5344[var18] * arg1 / 128;
                this.field5365[var18] = this.field5365[var18] * arg2 / 128;
                this.field5332[var18] = this.field5332[var18] * arg3 / 128;
                this.field5344[var18] += field5379;
                this.field5365[var18] += field5373;
                this.field5332[var18] += field5382;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field5363; var19++) {
                int var20 = (this.field5358[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field5358[var19] = (byte) var20;
            }
            this.field5343.field4288 = false;
        } else if (arg0 == 7) {
            for (int var21 = 0; var21 < this.field5363; var21++) {
                int var22 = this.field5342[var21] & 0xFFFF;
                int var23 = var22 >> 10 & 0x3F;
                int var24 = var22 >> 7 & 0x7;
                int var25 = var22 & 0x7F;
                int var26 = arg1 + var23 & 0x3F;
                int var27 = arg2 / 4 + var24;
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 7) {
                    var27 = 7;
                }
                int var28 = arg3 + var25;
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 127) {
                    var28 = 127;
                }
                this.field5342[var21] = (short) (var26 << 10 | var27 << 7 | var28);
            }
            this.field5343.field4288 = false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "()I", line = 2516)
    public final int method540() {
        if (!this.field5330.field4634) {
            this.method2349();
        }
        return this.field5330.field4640;
    }

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "()V", line = 2522)
    public final void method2367() {
        if (this.field5328 == null) {
            this.method522();
            return;
        }
        for (int var1 = 0; var1 < this.field5325; var1++) {
            int var2 = this.field5344[var1];
            this.field5344[var1] = this.field5332[var1];
            this.field5332[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field5364; var3++) {
            short var4 = this.field5328[var3];
            this.field5328[var3] = this.field5347[var3];
            this.field5347[var3] = (short) (-var4);
        }
        this.field5330.field4634 = false;
        this.field5362.field4288 = false;
        if (this.field5354 != null) {
            this.field5354.field4288 = false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "()I", line = 2559)
    public final int method2368() {
        return this.field5352;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(SS)V", line = 2565)
    public final void method2369(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field5363; var3++) {
            if (this.field5342[var3] == arg0) {
                this.field5342[var3] = arg1;
            }
        }
        this.field5343.field4288 = false;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIJ)V", line = 2577)
    public final void method534(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field5364 == 0) {
            return;
        }
        GL var10 = class42.field627;
        var10.glPushMatrix();
        if (arg3 != 0) {
            var10.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var10.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var10.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var10.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var10.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method2361();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "()V", line = 2602)
    public final void method545() {
        for (int var1 = 0; var1 < this.field5325; var1++) {
            this.field5344[var1] = this.field5344[var1] + 7 >> 4;
            this.field5365[var1] = this.field5365[var1] + 7 >> 4;
            this.field5332[var1] = this.field5332[var1] + 7 >> 4;
        }
        this.field5330.field4634 = false;
        this.field5362.field4288 = false;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([SI)[S", line = 2616)
    private static final short[] method2370(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class242.method1845(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "()V", line = 2623)
    public final void method2371() {
        for (int var1 = 0; var1 < this.field5325; var1++) {
            this.field5332[var1] = -this.field5332[var1];
        }
        if (this.field5347 != null) {
            for (int var2 = 0; var2 < this.field5364; var2++) {
                this.field5347[var2] = (short) (-this.field5347[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field5363; var3++) {
            short var4 = this.field5335[var3];
            this.field5335[var3] = this.field5356[var3];
            this.field5356[var3] = var4;
        }
        this.field5330.field4634 = false;
        this.field5362.field4288 = false;
        if (this.field5354 != null) {
            this.field5354.field4288 = false;
        }
        this.field5349.field4288 = false;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Llb;)Llb;", line = 2659)
    public final class341 method2372(class341 arg0) {
        if (this.field5364 == 0) {
            return null;
        }
        if (!this.field5330.field4634) {
            this.method2349();
        }
        int var2;
        int var3;
        if (class167.field2663 > 0) {
            var2 = this.field5330.field4640 - (class167.field2663 * this.field5330.field4636 >> 8) >> 3;
            var3 = this.field5330.field4635 - (class167.field2663 * this.field5330.field4637 >> 8) >> 3;
        } else {
            var2 = this.field5330.field4640 - (class167.field2663 * this.field5330.field4637 >> 8) >> 3;
            var3 = this.field5330.field4635 - (class167.field2663 * this.field5330.field4636 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class167.field2658 > 0) {
            var4 = this.field5330.field4639 - (class167.field2658 * this.field5330.field4636 >> 8) >> 3;
            var5 = this.field5330.field4641 - (class167.field2658 * this.field5330.field4637 >> 8) >> 3;
        } else {
            var4 = this.field5330.field4639 - (class167.field2658 * this.field5330.field4637 >> 8) >> 3;
            var5 = this.field5330.field4641 - (class167.field2658 * this.field5330.field4636 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class341 var8;
        if (arg0 == null || arg0.field5444.length < var6 * var7) {
            var8 = new class341(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field4642 = arg0.field4652 = var6;
            arg0.field4644 = arg0.field4649 = var7;
            arg0.method2406();
        }
        var8.field4645 = var2;
        var8.field4650 = var4;
        if (field5383.length < this.field5364) {
            field5383 = new int[this.field5364];
            field5378 = new int[this.field5364];
        }
        for (int var9 = 0; var9 < this.field5327; var9++) {
            int var10 = (this.field5344[var9] - (this.field5365[var9] * class167.field2663 >> 8) >> 3) - var2;
            int var11 = (this.field5332[var9] - (this.field5365[var9] * class167.field2658 >> 8) >> 3) - var4;
            int var12 = this.field5346[var9];
            int var13 = this.field5346[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field5350[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field5383[var15] = var10;
                field5378[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field5363; var16++) {
            if (this.field5358[var16] <= 128) {
                short var17 = this.field5335[var16];
                short var18 = this.field5322[var16];
                short var19 = this.field5356[var16];
                int var20 = field5383[var17];
                int var21 = field5383[var18];
                int var22 = field5383[var19];
                int var23 = field5378[var17];
                int var24 = field5378[var18];
                int var25 = field5378[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class153.method1177(var8.field5444, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)Lhd;", line = 2783)
    public final class161 method892(int arg0, int arg1, int arg2) {
        this.field5329 = false;
        if (this.field5359 != null) {
            this.field5328 = this.field5359.field4485;
            this.field5333 = this.field5359.field4488;
            this.field5347 = this.field5359.field4487;
            this.field5357 = this.field5359.field4486;
            this.field5359 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "()I", line = 2797)
    public final int method539() {
        if (!this.field5330.field4634) {
            this.method2349();
        }
        return this.field5330.field4638;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIII[FIF)V", line = 2804)
    private static final void method2373(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
        int var9 = arg0 - arg3;
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg5;
        float var12 = arg6[2] * (float) var11 + arg6[0] * (float) var9 + arg6[1] * (float) var10;
        float var13 = arg6[5] * (float) var11 + arg6[3] * (float) var9 + arg6[4] * (float) var10;
        float var14 = arg6[8] * (float) var11 + arg6[6] * (float) var9 + arg6[7] * (float) var10;
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
        float var17 = (float) Math.asin((double) (var13 / var15)) / 3.1415927F + arg8 + 0.5F;
        if (arg7 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg7 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field5377 = var16;
        field5374 = var17;
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)V", line = 2852)
    public final void method2374(int arg0) {
        if (this.field5328 == null) {
            this.method544(arg0);
            return;
        }
        int var2 = class153.field2438[arg0];
        int var3 = class153.field2445[arg0];
        for (int var4 = 0; var4 < this.field5325; var4++) {
            int var5 = this.field5344[var4] * var3 + this.field5332[var4] * var2 >> 16;
            this.field5332[var4] = this.field5332[var4] * var3 - this.field5344[var4] * var2 >> 16;
            this.field5344[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field5364; var6++) {
            int var7 = this.field5347[var6] * var2 + this.field5328[var6] * var3 >> 16;
            this.field5347[var6] = (short) (this.field5347[var6] * var3 - this.field5328[var6] * var2 >> 16);
            this.field5328[var6] = (short) var7;
        }
        this.field5330.field4634 = false;
        this.field5362.field4288 = false;
        if (this.field5354 != null) {
            this.field5354.field4288 = false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "()I", line = 2893)
    public final int method542() {
        if (!this.field5330.field4634) {
            this.method2349();
        }
        return this.field5330.field4639;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIII[FFIF)V", line = 2899)
    private static final void method2375(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
        int var10 = arg0 - arg3;
        int var11 = arg1 - arg4;
        int var12 = arg2 - arg5;
        float var13 = arg6[2] * (float) var12 + arg6[0] * (float) var10 + arg6[1] * (float) var11;
        float var14 = arg6[5] * (float) var12 + arg6[3] * (float) var10 + arg6[4] * (float) var11;
        float var15 = arg6[8] * (float) var12 + arg6[6] * (float) var10 + arg6[7] * (float) var11;
        float var16 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var16 = arg7 * var16;
        }
        float var17 = var14 + arg9 + 0.5F;
        if (arg8 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg8 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field5375 = var16;
        field5376 = var17;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 2950)
    public final void method543(int arg0) {
        int var2 = class153.field2438[arg0];
        int var3 = class153.field2445[arg0];
        for (int var4 = 0; var4 < this.field5325; var4++) {
            int var5 = this.field5365[var4] * var2 + this.field5344[var4] * var3 >> 16;
            this.field5365[var4] = this.field5365[var4] * var3 - this.field5344[var4] * var2 >> 16;
            this.field5344[var4] = var5;
        }
        this.field5330.field4634 = false;
        this.field5362.field4288 = false;
    }

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "()V", line = 2974)
    public final void method514() {
        for (int var1 = 0; var1 < this.field5325; var1++) {
            this.field5344[var1] = -this.field5344[var1];
            this.field5332[var1] = -this.field5332[var1];
        }
        this.field5330.field4634 = false;
        this.field5362.field4288 = false;
    }

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "()I", line = 2987)
    public final int method541() {
        if (!this.field5330.field4634) {
            this.method2349();
        }
        return this.field5330.field4636;
    }

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "()V", line = 2996)
    private final void method2376() {
        if (field5341.field3793.length < this.field5363 * 12) {
            field5341 = new class227((this.field5363 + 100) * 12);
        } else {
            field5341.field3760 = 0;
        }
        if (class42.field625) {
            for (int var1 = 0; var1 < this.field5363; var1++) {
                field5341.method1757(this.field5335[var1], -109);
                field5341.method1757(this.field5322[var1], -104);
                field5341.method1757(this.field5356[var1], -112);
            }
        } else {
            for (int var2 = 0; var2 < this.field5363; var2++) {
                field5341.method1754(false, this.field5335[var2]);
                field5341.method1754(false, this.field5322[var2]);
                field5341.method1754(false, this.field5356[var2]);
            }
        }
        if (!class42.field645) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field5341.field3760);
            var5.put(field5341.field3793, 0, field5341.field3760);
            var5.flip();
            this.field5349.field4288 = true;
            this.field5349.field4289 = var5;
            this.field5349.field4291 = null;
            return;
        }
        class53 var3 = new class53();
        ByteBuffer var4 = ByteBuffer.wrap(field5341.field3793, 0, field5341.field3760);
        var3.method421(var4);
        this.field5349.field4288 = true;
        this.field5349.field4289 = null;
        this.field5349.field4291 = var3;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[IIIIZI[I)V", line = 3056)
    public final void method527(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            field5379 = 0;
            field5373 = 0;
            field5382 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field5351.length) {
                    int[] var16 = this.field5351[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field5321 == null || (arg6 & this.field5321[var18]) != 0) {
                            field5379 += this.field5344[var18];
                            field5373 += this.field5365[var18];
                            field5382 += this.field5332[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                field5379 = field5379 / var13 + var10;
                field5373 = field5373 / var13 + var11;
                field5382 = field5382 / var13 + var12;
                field5380 = true;
            } else {
                field5379 = var10;
                field5373 = var11;
                field5382 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 16384 >> 15;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 16384 >> 15;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 16384 >> 15;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field5351.length) {
                    int[] var27 = this.field5351[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field5321 == null || (arg6 & this.field5321[var29]) != 0) {
                            this.field5344[var29] += var22;
                            this.field5365[var29] += var23;
                            this.field5332[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var91 = arg1[var90];
                    if (var91 < this.field5351.length) {
                        int[] var92 = this.field5351[var91];
                        for (int var93 = 0; var93 < var92.length; var93++) {
                            int var94 = var92[var93];
                            if (this.field5321 == null || (arg6 & this.field5321[var94]) != 0) {
                                this.field5344[var94] -= field5379;
                                this.field5365[var94] -= field5373;
                                this.field5332[var94] -= field5382;
                                if (arg4 != 0) {
                                    int var95 = class153.field2438[arg4];
                                    int var96 = class153.field2445[arg4];
                                    int var97 = this.field5365[var94] * var95 + this.field5344[var94] * var96 + 32767 >> 16;
                                    this.field5365[var94] = this.field5365[var94] * var96 + 32767 - this.field5344[var94] * var95 >> 16;
                                    this.field5344[var94] = var97;
                                }
                                if (arg2 != 0) {
                                    int var98 = class153.field2438[arg2];
                                    int var99 = class153.field2445[arg2];
                                    int var100 = this.field5365[var94] * var99 + 32767 - this.field5332[var94] * var98 >> 16;
                                    this.field5332[var94] = this.field5365[var94] * var98 + this.field5332[var94] * var99 + 32767 >> 16;
                                    this.field5365[var94] = var100;
                                }
                                if (arg3 != 0) {
                                    int var101 = class153.field2438[arg3];
                                    int var102 = class153.field2445[arg3];
                                    int var103 = this.field5344[var94] * var102 + this.field5332[var94] * var101 + 32767 >> 16;
                                    this.field5332[var94] = this.field5332[var94] * var102 + 32767 - this.field5344[var94] * var101 >> 16;
                                    this.field5344[var94] = var103;
                                }
                                this.field5344[var94] += field5379;
                                this.field5365[var94] += field5373;
                                this.field5332[var94] += field5382;
                            }
                        }
                    }
                }
                if (arg5 && this.field5328 != null) {
                    for (int var104 = 0; var104 < var9; var104++) {
                        int var105 = arg1[var104];
                        if (var105 < this.field5351.length) {
                            int[] var106 = this.field5351[var105];
                            for (int var107 = 0; var107 < var106.length; var107++) {
                                int var108 = var106[var107];
                                if (this.field5321 == null || (arg6 & this.field5321[var108]) != 0) {
                                    int var109 = this.field5346[var108];
                                    int var110 = this.field5346[var108 + 1];
                                    for (int var111 = var109; var111 < var110; var111++) {
                                        int var112 = this.field5350[var111] - 1;
                                        if (var112 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var113 = class153.field2438[arg4];
                                            int var114 = class153.field2445[arg4];
                                            int var115 = this.field5333[var112] * var113 + this.field5328[var112] * var114 + 32767 >> 16;
                                            this.field5333[var112] = (short) (this.field5333[var112] * var114 + 32767 - this.field5328[var112] * var113 >> 16);
                                            this.field5328[var112] = (short) var115;
                                        }
                                        if (arg2 != 0) {
                                            int var116 = class153.field2438[arg2];
                                            int var117 = class153.field2445[arg2];
                                            int var118 = this.field5333[var112] * var117 + 32767 - this.field5347[var112] * var116 >> 16;
                                            this.field5347[var112] = (short) (this.field5347[var112] * var117 + this.field5333[var112] * var116 + 32767 >> 16);
                                            this.field5333[var112] = (short) var118;
                                        }
                                        if (arg3 != 0) {
                                            int var119 = class153.field2438[arg3];
                                            int var120 = class153.field2445[arg3];
                                            int var121 = this.field5347[var112] * var119 + this.field5328[var112] * var120 + 32767 >> 16;
                                            this.field5347[var112] = (short) (this.field5347[var112] * var120 + 32767 - this.field5328[var112] * var119 >> 16);
                                            this.field5328[var112] = (short) var121;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field5354 != null) {
                        this.field5354.field4288 = false;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (field5380) {
                    int var36 = arg7[6] * field5382 + arg7[0] * field5379 + arg7[3] * field5373 + 16384 >> 15;
                    int var37 = arg7[7] * field5382 + arg7[1] * field5379 + arg7[4] * field5373 + 16384 >> 15;
                    int var38 = arg7[8] * field5382 + arg7[2] * field5379 + arg7[5] * field5373 + 16384 >> 15;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    field5379 = var39;
                    field5373 = var40;
                    field5382 = var41;
                    field5380 = false;
                }
                int[] var42 = new int[9];
                int var43 = class153.field2445[arg2] >> 1;
                int var44 = class153.field2438[arg2] >> 1;
                int var45 = class153.field2445[arg3] >> 1;
                int var46 = class153.field2438[arg3] >> 1;
                int var47 = class153.field2445[arg4] >> 1;
                int var48 = class153.field2438[arg4] >> 1;
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[0] = var45 * var47 + var46 * var50 + 16384 >> 15;
                var42[1] = -var45 * var48 + var46 * var49 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[5] = -var44;
                var42[6] = -var46 * var47 + var45 * var50 + 16384 >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                int var51 = var42[2] * -field5382 + var42[0] * -field5379 + var42[1] * -field5373 + 16384 >> 15;
                int var52 = var42[5] * -field5382 + var42[3] * -field5379 + var42[4] * -field5373 + 16384 >> 15;
                int var53 = var42[8] * -field5382 + var42[6] * -field5379 + var42[7] * -field5373 + 16384 >> 15;
                int var54 = field5379 + var51;
                int var55 = field5373 + var52;
                int var56 = field5382 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var59 = 0; var59 < 3; var59++) {
                        int var60 = 0;
                        for (int var61 = 0; var61 < 3; var61++) {
                            var60 += var42[var58 * 3 + var61] * arg7[var59 * 3 + var61];
                        }
                        var57[var58 * 3 + var59] = var60 + 16384 >> 15;
                    }
                }
                int var62 = var42[2] * var35 + var42[0] * var33 + var42[1] * var34 + 16384 >> 15;
                int var63 = var42[5] * var35 + var42[3] * var33 + var42[4] * var34 + 16384 >> 15;
                int var64 = var42[8] * var35 + var42[6] * var33 + var42[7] * var34 + 16384 >> 15;
                int var65 = var54 + var62;
                int var66 = var55 + var63;
                int var67 = var56 + var64;
                int[] var68 = new int[9];
                for (int var69 = 0; var69 < 3; var69++) {
                    for (int var70 = 0; var70 < 3; var70++) {
                        int var71 = 0;
                        for (int var72 = 0; var72 < 3; var72++) {
                            var71 += arg7[var69 * 3 + var72] * var57[var72 * 3 + var70];
                        }
                        var68[var69 * 3 + var70] = var71 + 16384 >> 15;
                    }
                }
                int var73 = arg7[2] * var67 + arg7[0] * var65 + arg7[1] * var66 + 16384 >> 15;
                int var74 = arg7[5] * var67 + arg7[3] * var65 + arg7[4] * var66 + 16384 >> 15;
                int var75 = arg7[8] * var67 + arg7[6] * var65 + arg7[7] * var66 + 16384 >> 15;
                int var76 = var30 + var73;
                int var77 = var31 + var74;
                int var78 = var32 + var75;
                for (int var79 = 0; var79 < var9; var79++) {
                    int var80 = arg1[var79];
                    if (var80 < this.field5351.length) {
                        int[] var81 = this.field5351[var80];
                        for (int var82 = 0; var82 < var81.length; var82++) {
                            int var83 = var81[var82];
                            if (this.field5321 == null || (arg6 & this.field5321[var83]) != 0) {
                                int var84 = this.field5332[var83] * var68[2] + this.field5365[var83] * var68[1] + this.field5344[var83] * var68[0] + 16384 >> 15;
                                int var85 = this.field5332[var83] * var68[5] + this.field5365[var83] * var68[4] + this.field5344[var83] * var68[3] + 16384 >> 15;
                                int var86 = this.field5332[var83] * var68[8] + this.field5365[var83] * var68[7] + this.field5344[var83] * var68[6] + 16384 >> 15;
                                int var87 = var76 + var84;
                                int var88 = var77 + var85;
                                int var89 = var78 + var86;
                                this.field5344[var83] = var87;
                                this.field5365[var83] = var88;
                                this.field5332[var83] = var89;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field5351.length) {
                        int[] var174 = this.field5351[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field5321 == null || (arg6 & this.field5321[var176]) != 0) {
                                this.field5344[var176] -= field5379;
                                this.field5365[var176] -= field5373;
                                this.field5332[var176] -= field5382;
                                this.field5344[var176] = this.field5344[var176] * arg2 >> 7;
                                this.field5365[var176] = this.field5365[var176] * arg3 >> 7;
                                this.field5332[var176] = this.field5332[var176] * arg4 >> 7;
                                this.field5344[var176] += field5379;
                                this.field5365[var176] += field5373;
                                this.field5332[var176] += field5382;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (field5380) {
                    int var128 = arg7[6] * field5382 + arg7[0] * field5379 + arg7[3] * field5373 + 16384 >> 15;
                    int var129 = arg7[7] * field5382 + arg7[1] * field5379 + arg7[4] * field5373 + 16384 >> 15;
                    int var130 = arg7[8] * field5382 + arg7[2] * field5379 + arg7[5] * field5373 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    field5379 = var131;
                    field5373 = var132;
                    field5382 = var133;
                    field5380 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -field5379 * var134 + 16384 >> 15;
                int var138 = -field5373 * var135 + 16384 >> 15;
                int var139 = -field5382 * var136 + 16384 >> 15;
                int var140 = field5379 + var137;
                int var141 = field5373 + var138;
                int var142 = field5382 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var127 * var136 + 16384 >> 15;
                int var147 = var140 + var144;
                int var148 = var141 + var145;
                int var149 = var142 + var146;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var152 = 0; var152 < 3; var152++) {
                        int var153 = 0;
                        for (int var154 = 0; var154 < 3; var154++) {
                            var153 += arg7[var151 * 3 + var154] * var143[var154 * 3 + var152];
                        }
                        var150[var151 * 3 + var152] = var153 + 16384 >> 15;
                    }
                }
                int var155 = arg7[2] * var149 + arg7[0] * var147 + arg7[1] * var148 + 16384 >> 15;
                int var156 = arg7[5] * var149 + arg7[3] * var147 + arg7[4] * var148 + 16384 >> 15;
                int var157 = arg7[8] * var149 + arg7[6] * var147 + arg7[7] * var148 + 16384 >> 15;
                int var158 = var122 + var155;
                int var159 = var123 + var156;
                int var160 = var124 + var157;
                for (int var161 = 0; var161 < var9; var161++) {
                    int var162 = arg1[var161];
                    if (var162 < this.field5351.length) {
                        int[] var163 = this.field5351[var162];
                        for (int var164 = 0; var164 < var163.length; var164++) {
                            int var165 = var163[var164];
                            if (this.field5321 == null || (arg6 & this.field5321[var165]) != 0) {
                                int var166 = this.field5332[var165] * var150[2] + this.field5365[var165] * var150[1] + this.field5344[var165] * var150[0] + 16384 >> 15;
                                int var167 = this.field5332[var165] * var150[5] + this.field5365[var165] * var150[4] + this.field5344[var165] * var150[3] + 16384 >> 15;
                                int var168 = this.field5332[var165] * var150[8] + this.field5365[var165] * var150[7] + this.field5344[var165] * var150[6] + 16384 >> 15;
                                int var169 = var158 + var166;
                                int var170 = var159 + var167;
                                int var171 = var160 + var168;
                                this.field5344[var165] = var169;
                                this.field5365[var165] = var170;
                                this.field5332[var165] = var171;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5340 != null && this.field5358 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var178 = arg1[var177];
                    if (var178 < this.field5340.length) {
                        int[] var179 = this.field5340[var178];
                        for (int var180 = 0; var180 < var179.length; var180++) {
                            int var181 = var179[var180];
                            if (this.field5336 == null || (arg6 & this.field5336[var181]) != 0) {
                                int var182 = (this.field5358[var181] & 0xFF) + arg2 * 8;
                                if (var182 < 0) {
                                    var182 = 0;
                                } else if (var182 > 255) {
                                    var182 = 255;
                                }
                                this.field5358[var181] = (byte) var182;
                            }
                        }
                        if (var179.length > 0) {
                            this.field5343.field4288 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field5340 != null) {
            for (int var183 = 0; var183 < var9; var183++) {
                int var184 = arg1[var183];
                if (var184 < this.field5340.length) {
                    int[] var185 = this.field5340[var184];
                    for (int var186 = 0; var186 < var185.length; var186++) {
                        int var187 = var185[var186];
                        if (this.field5336 == null || (arg6 & this.field5336[var187]) != 0) {
                            int var188 = this.field5342[var187] & 0xFFFF;
                            int var189 = var188 >> 10 & 0x3F;
                            int var190 = var188 >> 7 & 0x7;
                            int var191 = var188 & 0x7F;
                            int var192 = arg2 + var189 & 0x3F;
                            int var193 = arg3 / 4 + var190;
                            if (var193 < 0) {
                                var193 = 0;
                            } else if (var193 > 7) {
                                var193 = 7;
                            }
                            int var194 = arg4 + var191;
                            if (var194 < 0) {
                                var194 = 0;
                            } else if (var194 > 127) {
                                var194 = 127;
                            }
                            this.field5342[var187] = (short) (var192 << 10 | var193 << 7 | var194);
                        }
                    }
                    if (var185.length > 0) {
                        this.field5343.field4288 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(ZZZ)Lo;", line = 3846)
    public final class96 method518(boolean arg0, boolean arg1, boolean arg2) {
        return this.method2354(arg0, arg1, arg2, field5372, field5371);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZZZZZ)V", line = 3850)
    private final void method2377(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field5362.field4293 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field5343.field4293 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field5354.field4293 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field5366.field4293 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field5341.field3793.length < this.field5364 * var6) {
            field5341 = new class227((this.field5364 + 100) * var6);
        } else {
            field5341.field3760 = 0;
        }
        if (arg1) {
            if (class42.field625) {
                for (int var7 = 0; var7 < this.field5327; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field5344[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field5365[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field5332[var7]);
                    int var11 = this.field5346[var7];
                    int var12 = this.field5346[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field5350[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field5341.field3760 = var6 * var14;
                        field5341.method1757(var8, -124);
                        field5341.method1757(var9, -116);
                        field5341.method1757(var10, -99);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field5327; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field5344[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field5365[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field5332[var15]);
                    int var19 = this.field5346[var15];
                    int var20 = this.field5346[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field5350[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field5341.field3760 = var6 * var22;
                        field5341.method1754(false, var16);
                        field5341.method1754(false, var17);
                        field5341.method1754(false, var18);
                    }
                }
            }
        }
        if (arg2) {
            if (class3.field36) {
                for (int var42 = 0; var42 < this.field5363; var42++) {
                    int var43 = method2353(this.field5342[var42], this.field5355[var42], this.field5352, this.field5358[var42]);
                    field5341.field3760 = this.field5335[var42] * var6 + this.field5343.field4293;
                    field5341.method1757(var43, -108);
                    field5341.field3760 = this.field5322[var42] * var6 + this.field5343.field4293;
                    field5341.method1757(var43, -101);
                    field5341.field3760 = this.field5356[var42] * var6 + this.field5343.field4293;
                    field5341.method1757(var43, -100);
                }
            } else {
                int var23 = (int) class167.field2659[0];
                int var24 = (int) class167.field2659[1];
                int var25 = (int) class167.field2659[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field5352 * 1.3F);
                int var28 = this.field5331 * var26 >> 8;
                for (int var29 = 0; var29 < this.field5363; var29++) {
                    short var30 = this.field5335[var29];
                    short var31 = this.field5357[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field5347[var30] * var25 + this.field5333[var30] * var24 + this.field5328[var30] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field5347[var30] * var25 + this.field5333[var30] * var24 + this.field5328[var30] * var23) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field5357[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field5322[var29];
                    short var34 = this.field5357[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field5347[var33] * var25 + this.field5333[var33] * var24 + this.field5328[var33] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field5347[var33] * var25 + this.field5333[var33] * var24 + this.field5328[var33] * var23) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field5357[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field5356[var29];
                    short var37 = this.field5357[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field5347[var36] * var25 + this.field5333[var36] * var24 + this.field5328[var36] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field5347[var36] * var25 + this.field5333[var36] * var24 + this.field5328[var36] * var23) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field5357[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method2353(this.field5342[var29], this.field5355[var29], var32, this.field5358[var29]);
                    int var40 = method2353(this.field5342[var29], this.field5355[var29], var35, this.field5358[var29]);
                    int var41 = method2353(this.field5342[var29], this.field5355[var29], var38, this.field5358[var29]);
                    field5341.field3760 = var6 * var30 + this.field5343.field4293;
                    field5341.method1757(var39, -120);
                    field5341.field3760 = var6 * var33 + this.field5343.field4293;
                    field5341.method1757(var40, -103);
                    field5341.field3760 = var6 * var36 + this.field5343.field4293;
                    field5341.method1757(var41, -110);
                }
                this.field5328 = null;
                this.field5333 = null;
                this.field5347 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field5331;
            float var45 = 3.0F / (float) (this.field5331 / 2 + this.field5331);
            field5341.field3760 = this.field5354.field4293;
            if (class42.field625) {
                for (int var46 = 0; var46 < this.field5364; var46++) {
                    short var47 = this.field5357[var46];
                    if (var47 == 0) {
                        field5341.method1713(false, (float) this.field5328[var46] * var45);
                        field5341.method1713(false, (float) this.field5333[var46] * var45);
                        field5341.method1713(false, (float) this.field5347[var46] * var45);
                    } else {
                        float var48 = var44 / (float) var47;
                        field5341.method1713(false, (float) this.field5328[var46] * var48);
                        field5341.method1713(false, (float) this.field5333[var46] * var48);
                        field5341.method1713(false, (float) this.field5347[var46] * var48);
                    }
                    field5341.field3760 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field5364; var49++) {
                    short var50 = this.field5357[var49];
                    if (var50 == 0) {
                        field5341.method1738((float) this.field5328[var49] * var45, (byte) -39);
                        field5341.method1738((float) this.field5333[var49] * var45, (byte) -39);
                        field5341.method1738((float) this.field5347[var49] * var45, (byte) -39);
                    } else {
                        float var51 = var44 / (float) var50;
                        field5341.method1738((float) this.field5328[var49] * var51, (byte) -39);
                        field5341.method1738((float) this.field5333[var49] * var51, (byte) -39);
                        field5341.method1738((float) this.field5347[var49] * var51, (byte) -39);
                    }
                    field5341.field3760 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field5341.field3760 = this.field5366.field4293;
            if (class42.field625) {
                for (int var52 = 0; var52 < this.field5364; var52++) {
                    field5341.method1713(false, this.field5324[var52]);
                    field5341.method1713(false, this.field5339[var52]);
                    field5341.field3760 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field5364; var53++) {
                    field5341.method1738(this.field5324[var53], (byte) -39);
                    field5341.method1738(this.field5339[var53], (byte) -39);
                    field5341.field3760 += var6 - 8;
                }
            }
        }
        field5341.field3760 = this.field5364 * var6;
        if (arg0) {
            if (class42.field624) {
                ByteBuffer var54 = ByteBuffer.wrap(field5341.field3793, 0, field5341.field3760);
                if (this.field5334 == null) {
                    this.field5334 = new class53(true);
                    this.field5334.method421(var54);
                } else {
                    this.field5334.method420(var54);
                }
                if (arg1) {
                    this.field5362.field4288 = true;
                    this.field5362.field4289 = null;
                    this.field5362.field4291 = this.field5334;
                    this.field5362.field4286 = var6;
                }
                if (arg2) {
                    this.field5343.field4288 = true;
                    this.field5343.field4289 = null;
                    this.field5343.field4291 = this.field5334;
                    this.field5343.field4286 = var6;
                }
                if (arg3) {
                    this.field5354.field4288 = true;
                    this.field5354.field4289 = null;
                    this.field5354.field4291 = this.field5334;
                    this.field5354.field4286 = var6;
                }
                if (arg4) {
                    this.field5366.field4288 = true;
                    this.field5366.field4289 = null;
                    this.field5366.field4291 = this.field5334;
                    this.field5366.field4286 = var6;
                }
            } else {
                if (field5367 == null || field5367.capacity() < field5341.field3760) {
                    field5367 = ByteBuffer.allocateDirect(var6 * 100 + field5341.field3760);
                } else {
                    field5367.clear();
                }
                field5367.put(field5341.field3793, 0, field5341.field3760);
                field5367.flip();
                if (arg1) {
                    this.field5362.field4288 = true;
                    this.field5362.field4289 = field5367;
                    this.field5362.field4291 = null;
                    this.field5362.field4286 = var6;
                }
                if (arg2) {
                    this.field5343.field4288 = true;
                    this.field5343.field4289 = field5367;
                    this.field5362.field4291 = null;
                    this.field5343.field4286 = var6;
                }
                if (arg3) {
                    this.field5354.field4288 = true;
                    this.field5354.field4289 = field5367;
                    this.field5354.field4291 = null;
                    this.field5354.field4286 = var6;
                }
                if (arg4) {
                    this.field5366.field4288 = true;
                    this.field5366.field4289 = field5367;
                    this.field5366.field4291 = null;
                    this.field5366.field4286 = var6;
                }
            }
        } else if (class42.field645) {
            class53 var55 = new class53();
            ByteBuffer var56 = ByteBuffer.wrap(field5341.field3793, 0, field5341.field3760);
            var55.method421(var56);
            if (arg1) {
                this.field5362.field4288 = true;
                this.field5362.field4289 = null;
                this.field5362.field4291 = var55;
                this.field5362.field4286 = var6;
            }
            if (arg2) {
                this.field5343.field4288 = true;
                this.field5343.field4289 = null;
                this.field5343.field4291 = var55;
                this.field5343.field4286 = var6;
            }
            if (arg3) {
                this.field5354.field4288 = true;
                this.field5354.field4289 = null;
                this.field5354.field4291 = var55;
                this.field5354.field4286 = var6;
            }
            if (arg4) {
                this.field5366.field4288 = true;
                this.field5366.field4289 = null;
                this.field5366.field4291 = var55;
                this.field5366.field4286 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field5341.field3760);
            var57.put(field5341.field3793, 0, field5341.field3760);
            var57.flip();
            if (arg1) {
                this.field5362.field4288 = true;
                this.field5362.field4289 = var57;
                this.field5362.field4291 = null;
                this.field5362.field4286 = var6;
            }
            if (arg2) {
                this.field5343.field4288 = true;
                this.field5343.field4289 = var57;
                this.field5362.field4291 = null;
                this.field5343.field4286 = var6;
            }
            if (arg3) {
                this.field5354.field4288 = true;
                this.field5354.field4289 = var57;
                this.field5354.field4291 = null;
                this.field5354.field4286 = var6;
            }
            if (arg4) {
                this.field5366.field4288 = true;
                this.field5366.field4289 = var57;
                this.field5366.field4291 = null;
                this.field5366.field4286 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZZZZZZZZZZZ)Lac;", line = 4380)
    public final class337 method2378(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class337 var12 = new class337();
        var12.field5325 = this.field5325;
        var12.field5327 = this.field5327;
        var12.field5364 = this.field5364;
        var12.field5363 = this.field5363;
        if (arg0) {
            var12.field5344 = this.field5344;
            var12.field5332 = this.field5332;
        } else {
            var12.field5344 = class22.method131(this.field5344, 7042);
            var12.field5332 = class22.method131(this.field5332, 7042);
        }
        if (arg1) {
            var12.field5365 = this.field5365;
        } else {
            var12.field5365 = class22.method131(this.field5365, 7042);
        }
        if (arg0 && arg1) {
            var12.field5362 = this.field5362;
            var12.field5330 = this.field5330;
        } else {
            var12.field5362 = new class254();
            var12.field5330 = new class284();
        }
        if (arg2) {
            var12.field5342 = this.field5342;
        } else {
            var12.field5342 = class125.method975(true, this.field5342);
        }
        if (arg3) {
            var12.field5358 = this.field5358;
        } else {
            var12.field5358 = class51.method399((byte) 126, this.field5358);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class3.field36) {
            var12.field5343 = new class254();
        } else {
            var12.field5343 = this.field5343;
        }
        if (arg5) {
            var12.field5328 = this.field5328;
            var12.field5333 = this.field5333;
            var12.field5347 = this.field5347;
            var12.field5357 = this.field5357;
        } else {
            var12.field5328 = class125.method975(true, this.field5328);
            var12.field5333 = class125.method975(true, this.field5333);
            var12.field5347 = class125.method975(true, this.field5347);
            var12.field5357 = class125.method975(true, this.field5357);
        }
        if (!class3.field36) {
            var12.field5354 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field5354 = this.field5354;
        } else {
            var12.field5354 = new class254();
        }
        if (arg8) {
            var12.field5324 = this.field5324;
            var12.field5339 = this.field5339;
            var12.field5366 = this.field5366;
        } else {
            var12.field5324 = class10.method40(this.field5324, true);
            var12.field5339 = class10.method40(this.field5339, true);
            var12.field5366 = new class254();
        }
        if (arg9) {
            var12.field5335 = this.field5335;
            var12.field5322 = this.field5322;
            var12.field5356 = this.field5356;
            var12.field5349 = this.field5349;
        } else {
            var12.field5335 = class125.method975(true, this.field5335);
            var12.field5322 = class125.method975(true, this.field5322);
            var12.field5356 = class125.method975(true, this.field5356);
            var12.field5349 = new class254();
        }
        if (arg10) {
            var12.field5355 = this.field5355;
        } else {
            var12.field5355 = class125.method975(true, this.field5355);
        }
        var12.field5348 = this.field5348;
        var12.field5351 = this.field5351;
        var12.field5361 = this.field5361;
        var12.field5340 = this.field5340;
        var12.field5338 = this.field5338;
        var12.field5350 = this.field5350;
        var12.field5346 = this.field5346;
        var12.field5352 = this.field5352;
        var12.field5331 = this.field5331;
        var12.field5345 = this.field5345;
        var12.field5326 = this.field5326;
        var12.field5321 = this.field5321;
        var12.field5336 = this.field5336;
        return var12;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(III)V", line = 4527)
    public final void method521(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5325; var4++) {
            this.field5344[var4] = this.field5344[var4] * arg0 >> 7;
            this.field5365[var4] = this.field5365[var4] * arg1 >> 7;
            this.field5332[var4] = this.field5332[var4] * arg2 >> 7;
        }
        this.field5330.field4634 = false;
        this.field5362.field4288 = false;
    }
}
