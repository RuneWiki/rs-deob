import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class21 extends class221 {

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
    public int field303 = 0;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "B")
    private byte field283 = 0;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "Z")
    public boolean field306 = false;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    private int field308 = 0;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "B")
    private byte field297 = 0;

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "I")
    private int field324 = 0;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
    private int field318 = 0;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "[I")
    private int[] field301;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "[I")
    public int[] field310;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "[I")
    public int[] field299;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "[I")
    public int[] field305;

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "[I")
    private int[] field321;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "[S")
    private short[] field319;

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "[S")
    private short[] field325;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "[S")
    private short[] field294;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "[S")
    private short[] field298;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "[S")
    private short[] field311;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "[F")
    private float[] field300;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "[F")
    private float[] field313;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "[S")
    private short[] field286;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "[B")
    private byte[] field312;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "[S")
    private short[] field295;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "[S")
    private short[] field304;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "[S")
    private short[] field282;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "[S")
    private short[] field284;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "[B")
    private byte[] field309;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "[S")
    private short[] field289;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "Lfj;")
    public class36 field314;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "Ljk;")
    public class345 field285;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "Ljk;")
    private class345 field287;

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "Ljk;")
    private class345 field320;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "Ljk;")
    private class345 field317;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "Ljk;")
    private class345 field291;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "S")
    private short field288;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "S")
    private short field292;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "[S")
    private short[] field293;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "[I")
    private int[] field296;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "Lkh;")
    private static class166 field302 = new class166(10000);

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "Lic;")
    private static class21 field323 = new class21();

    @OriginalMember(owner = "client!ic", name = "bb", descriptor = "Lic;")
    private static class21 field326 = new class21();

    @OriginalMember(owner = "client!ic", name = "cb", descriptor = "Lic;")
    private static class21 field327 = new class21();

    @OriginalMember(owner = "client!ic", name = "db", descriptor = "Lic;")
    private static class21 field328 = new class21();

    @OriginalMember(owner = "client!ic", name = "eb", descriptor = "Lic;")
    private static class21 field329 = new class21();

    @OriginalMember(owner = "client!ic", name = "fb", descriptor = "Lic;")
    private static class21 field330 = new class21();

    @OriginalMember(owner = "client!ic", name = "hb", descriptor = "[I")
    private static int[] field332 = new int[1];

    @OriginalMember(owner = "client!ic", name = "pb", descriptor = "Z")
    private static boolean field340 = false;

    @OriginalMember(owner = "client!ic", name = "qb", descriptor = "[I")
    private static int[] field341 = new int[1];

    @OriginalMember(owner = "client!ic", name = "gb", descriptor = "F")
    private static float field331;

    @OriginalMember(owner = "client!ic", name = "ib", descriptor = "F")
    private static float field333;

    @OriginalMember(owner = "client!ic", name = "kb", descriptor = "F")
    private static float field335;

    @OriginalMember(owner = "client!ic", name = "lb", descriptor = "F")
    private static float field336;

    @OriginalMember(owner = "client!ic", name = "mb", descriptor = "F")
    private static float field337;

    @OriginalMember(owner = "client!ic", name = "rb", descriptor = "F")
    private static float field342;

    @OriginalMember(owner = "client!ic", name = "jb", descriptor = "I")
    private static int field334;

    @OriginalMember(owner = "client!ic", name = "nb", descriptor = "I")
    private static int field338;

    @OriginalMember(owner = "client!ic", name = "ob", descriptor = "I")
    private static int field339;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "Lmg;")
    private class113 field316;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "Lgg;")
    private class49 field315;

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field322;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "[J")
    private static long[] field307;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "[[I")
    private int[][] field281;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "[[I")
    private int[][] field290;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "()V", line = 10)
    public final void method159() {
        for (int var1 = 0; var1 < this.field303; var1++) {
            this.field310[var1] = this.field310[var1] + 7 >> 4;
            this.field299[var1] = this.field299[var1] + 7 >> 4;
            this.field305[var1] = this.field305[var1] + 7 >> 4;
        }
        this.field314.field552 = false;
        this.field285.field5347 = false;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(III)V", line = 25)
    public final void method160(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field303; var4++) {
            this.field310[var4] += arg0;
            this.field299[var4] += arg1;
            this.field305[var4] += arg2;
        }
        this.field314.field552 = false;
        this.field285.field5347 = false;
    }

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "()V", line = 41)
    private final void method161() {
        GL var1 = class94.field1473;
        if (this.field318 == 0) {
            return;
        }
        if (this.field283 != 0) {
            this.method166(true, !this.field285.field5347 && (this.field283 & 0x1) != 0, !this.field287.field5347 && (this.field283 & 0x2) != 0, this.field320 != null && !this.field320.field5347 && (this.field283 & 0x4) != 0, false);
        }
        this.method166(false, !this.field285.field5347, !this.field287.field5347, this.field320 != null && !this.field320.field5347, !this.field317.field5347);
        if (!this.field291.field5347) {
            this.method187();
        }
        if (this.field297 != 0) {
            if ((this.field297 & 0x1) != 0) {
                this.field310 = null;
                this.field299 = null;
                this.field305 = null;
                this.field293 = null;
                this.field301 = null;
            }
            if ((this.field297 & 0x2) != 0) {
                this.field286 = null;
                this.field312 = null;
            }
            if ((this.field297 & 0x4) != 0) {
                this.field325 = null;
                this.field294 = null;
                this.field298 = null;
                this.field311 = null;
            }
            if ((this.field297 & 0x8) != 0) {
                this.field300 = null;
                this.field313 = null;
            }
            if ((this.field297 & 0x10) != 0) {
                this.field295 = null;
                this.field304 = null;
                this.field282 = null;
            }
            this.field297 = 0;
        }
        class113 var2 = null;
        if (this.field285.field5356 != null) {
            this.field285.field5356.method837();
            var2 = this.field285.field5356;
            var1.glVertexPointer(3, 5126, this.field285.field5346, (long) this.field285.field5350);
        }
        if (this.field287.field5356 != null) {
            if (this.field287.field5356 != var2) {
                this.field287.field5356.method837();
                var2 = this.field287.field5356;
            }
            var1.glColorPointer(4, 5121, this.field287.field5346, (long) this.field287.field5350);
        }
        if (class208.field3191 && this.field320.field5356 != null) {
            if (this.field320.field5356 != var2) {
                this.field320.field5356.method837();
                var2 = this.field320.field5356;
            }
            var1.glNormalPointer(5126, this.field320.field5346, (long) this.field320.field5350);
        }
        if (this.field317.field5356 != null) {
            if (this.field317.field5356 != var2) {
                this.field317.field5356.method837();
                class113 var3 = this.field317.field5356;
            }
            var1.glTexCoordPointer(2, 5126, this.field317.field5346, (long) this.field317.field5350);
        }
        if (this.field291.field5356 != null) {
            this.field291.field5356.method840();
        }
        if (this.field285.field5356 == null || this.field287.field5356 == null || class208.field3191 && this.field320.field5356 == null || this.field317.field5356 == null) {
            if (class94.field1507) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field285.field5356 == null) {
                this.field285.field5351.position(this.field285.field5350);
                var1.glVertexPointer(3, 5126, this.field285.field5346, this.field285.field5351);
            }
            if (this.field287.field5356 == null) {
                this.field287.field5351.position(this.field287.field5350);
                var1.glColorPointer(4, 5121, this.field287.field5346, this.field287.field5351);
            }
            if (class208.field3191 && this.field320.field5356 == null) {
                this.field320.field5351.position(this.field320.field5350);
                var1.glNormalPointer(5126, this.field320.field5346, this.field320.field5351);
            }
            if (this.field317.field5356 == null) {
                this.field317.field5351.position(this.field317.field5350);
                var1.glTexCoordPointer(2, 5126, this.field317.field5346, this.field317.field5351);
            }
        }
        if (this.field291.field5356 == null && class94.field1507) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field296.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field296[var5];
            int var7 = this.field296[var5 + 1];
            short var8 = this.field284[var6];
            if (var8 == -1) {
                class94.method698(-1);
                class37.method313(0, 0, 0);
            } else {
                class15.field207.method2083(32612, var8 & 0xFFFF);
            }
            if (this.field291.field5356 == null) {
                this.field291.field5351.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field291.field5351);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "()Z", line = 212)
    public final boolean method162() {
        return this.field306 && this.field310 != null && this.field325 != null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(SS)V", line = 217)
    public final void method163(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field318; var3++) {
            if (this.field284[var3] == arg0) {
                this.field284[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class15.field207.method2088(arg0 & 0xFFFF, (byte) 80);
            var5 = class15.field207.method2082(255, arg0 & 0xFFFF);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class15.field207.method2088(arg1 & 0xFFFF, (byte) 96);
            var7 = class15.field207.method2082(255, arg1 & 0xFFFF);
        }
        if (var4 != var6 || var5 != var7) {
            this.field287.field5347 = false;
        }
    }

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "()Z", line = 251)
    public final boolean method164() {
        if (this.field290 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field303; var1++) {
            this.field310[var1] <<= 0x4;
            this.field299[var1] <<= 0x4;
            this.field305[var1] <<= 0x4;
        }
        field334 = 0;
        field338 = 0;
        field339 = 0;
        return true;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(FFF)I", line = 272)
    private static final int method165(float arg0, float arg1, float arg2) {
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

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZZZZZ)V", line = 308)
    private final void method166(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field285.field5350 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field287.field5350 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field320.field5350 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field317.field5350 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field302.field2500.length < this.field324 * var6) {
            field302 = new class166((this.field324 + 100) * var6);
        } else {
            field302.field2532 = 0;
        }
        if (arg1) {
            if (class94.field1512) {
                for (int var7 = 0; var7 < this.field308; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field310[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field299[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field305[var7]);
                    int var11 = this.field301[var7];
                    int var12 = this.field301[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field293[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field302.field2532 = var6 * var14;
                        field302.method1174((byte) -32, var8);
                        field302.method1174((byte) -32, var9);
                        field302.method1174((byte) -32, var10);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field308; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field310[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field299[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field305[var15]);
                    int var19 = this.field301[var15];
                    int var20 = this.field301[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field293[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field302.field2532 = var6 * var22;
                        field302.method1169(var16, 30148);
                        field302.method1169(var17, 30148);
                        field302.method1169(var18, 30148);
                    }
                }
            }
        }
        if (arg2) {
            if (class208.field3191) {
                for (int var42 = 0; var42 < this.field318; var42++) {
                    int var43 = method201(this.field286[var42], this.field284[var42], this.field288, this.field312[var42]);
                    field302.field2532 = this.field295[var42] * var6 + this.field287.field5350;
                    field302.method1174((byte) -32, var43);
                    field302.field2532 = this.field304[var42] * var6 + this.field287.field5350;
                    field302.method1174((byte) -32, var43);
                    field302.field2532 = this.field282[var42] * var6 + this.field287.field5350;
                    field302.method1174((byte) -32, var43);
                }
            } else {
                int var23 = (int) class250.field3947[0];
                int var24 = (int) class250.field3947[1];
                int var25 = (int) class250.field3947[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field288 * 1.3F);
                int var28 = this.field292 * var26 >> 8;
                for (int var29 = 0; var29 < this.field318; var29++) {
                    short var30 = this.field295[var29];
                    short var31 = this.field311[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field298[var30] * var25 + this.field325[var30] * var23 + this.field294[var30] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field298[var30] * var25 + this.field325[var30] * var23 + this.field294[var30] * var24) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field311[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field304[var29];
                    short var34 = this.field311[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field298[var33] * var25 + this.field325[var33] * var23 + this.field294[var33] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field298[var33] * var25 + this.field325[var33] * var23 + this.field294[var33] * var24) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field311[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field282[var29];
                    short var37 = this.field311[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field298[var36] * var25 + this.field325[var36] * var23 + this.field294[var36] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field298[var36] * var25 + this.field325[var36] * var23 + this.field294[var36] * var24) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field311[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method201(this.field286[var29], this.field284[var29], var32, this.field312[var29]);
                    int var40 = method201(this.field286[var29], this.field284[var29], var35, this.field312[var29]);
                    int var41 = method201(this.field286[var29], this.field284[var29], var38, this.field312[var29]);
                    field302.field2532 = var6 * var30 + this.field287.field5350;
                    field302.method1174((byte) -32, var39);
                    field302.field2532 = var6 * var33 + this.field287.field5350;
                    field302.method1174((byte) -32, var40);
                    field302.field2532 = var6 * var36 + this.field287.field5350;
                    field302.method1174((byte) -32, var41);
                }
                this.field325 = null;
                this.field294 = null;
                this.field298 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field292;
            float var45 = 3.0F / (float) (this.field292 / 2 + this.field292);
            field302.field2532 = this.field320.field5350;
            if (class94.field1512) {
                for (int var46 = 0; var46 < this.field324; var46++) {
                    short var47 = this.field311[var46];
                    if (var47 == 0) {
                        field302.method1160(1, (float) this.field325[var46] * var45);
                        field302.method1160(1, (float) this.field294[var46] * var45);
                        field302.method1160(1, (float) this.field298[var46] * var45);
                    } else {
                        float var48 = var44 / (float) var47;
                        field302.method1160(1, (float) this.field325[var46] * var48);
                        field302.method1160(1, (float) this.field294[var46] * var48);
                        field302.method1160(1, (float) this.field298[var46] * var48);
                    }
                    field302.field2532 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field324; var49++) {
                    short var50 = this.field311[var49];
                    if (var50 == 0) {
                        field302.method1144((byte) -109, (float) this.field325[var49] * var45);
                        field302.method1144((byte) -125, (float) this.field294[var49] * var45);
                        field302.method1144((byte) -106, (float) this.field298[var49] * var45);
                    } else {
                        float var51 = var44 / (float) var50;
                        field302.method1144((byte) -109, (float) this.field325[var49] * var51);
                        field302.method1144((byte) -103, (float) this.field294[var49] * var51);
                        field302.method1144((byte) -123, (float) this.field298[var49] * var51);
                    }
                    field302.field2532 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field302.field2532 = this.field317.field5350;
            if (class94.field1512) {
                for (int var52 = 0; var52 < this.field324; var52++) {
                    field302.method1160(1, this.field300[var52]);
                    field302.method1160(1, this.field313[var52]);
                    field302.field2532 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field324; var53++) {
                    field302.method1144((byte) -111, this.field300[var53]);
                    field302.method1144((byte) -111, this.field313[var53]);
                    field302.field2532 += var6 - 8;
                }
            }
        }
        field302.field2532 = this.field324 * var6;
        if (arg0) {
            if (class94.field1495) {
                ByteBuffer var54 = ByteBuffer.wrap(field302.field2500, 0, field302.field2532);
                if (this.field316 == null) {
                    this.field316 = new class113(true);
                    this.field316.method841(var54);
                } else {
                    this.field316.method838(var54);
                }
                if (arg1) {
                    this.field285.field5347 = true;
                    this.field285.field5351 = null;
                    this.field285.field5356 = this.field316;
                    this.field285.field5346 = var6;
                }
                if (arg2) {
                    this.field287.field5347 = true;
                    this.field287.field5351 = null;
                    this.field287.field5356 = this.field316;
                    this.field287.field5346 = var6;
                }
                if (arg3) {
                    this.field320.field5347 = true;
                    this.field320.field5351 = null;
                    this.field320.field5356 = this.field316;
                    this.field320.field5346 = var6;
                }
                if (arg4) {
                    this.field317.field5347 = true;
                    this.field317.field5351 = null;
                    this.field317.field5356 = this.field316;
                    this.field317.field5346 = var6;
                }
            } else {
                if (field322 == null || field322.capacity() < field302.field2532) {
                    field322 = ByteBuffer.allocateDirect(var6 * 100 + field302.field2532);
                } else {
                    field322.clear();
                }
                field322.put(field302.field2500, 0, field302.field2532);
                field322.flip();
                if (arg1) {
                    this.field285.field5347 = true;
                    this.field285.field5351 = field322;
                    this.field285.field5356 = null;
                    this.field285.field5346 = var6;
                }
                if (arg2) {
                    this.field287.field5347 = true;
                    this.field287.field5351 = field322;
                    this.field285.field5356 = null;
                    this.field287.field5346 = var6;
                }
                if (arg3) {
                    this.field320.field5347 = true;
                    this.field320.field5351 = field322;
                    this.field320.field5356 = null;
                    this.field320.field5346 = var6;
                }
                if (arg4) {
                    this.field317.field5347 = true;
                    this.field317.field5351 = field322;
                    this.field317.field5356 = null;
                    this.field317.field5346 = var6;
                }
            }
        } else if (class94.field1507) {
            class113 var55 = new class113();
            ByteBuffer var56 = ByteBuffer.wrap(field302.field2500, 0, field302.field2532);
            var55.method841(var56);
            if (arg1) {
                this.field285.field5347 = true;
                this.field285.field5351 = null;
                this.field285.field5356 = var55;
                this.field285.field5346 = var6;
            }
            if (arg2) {
                this.field287.field5347 = true;
                this.field287.field5351 = null;
                this.field287.field5356 = var55;
                this.field287.field5346 = var6;
            }
            if (arg3) {
                this.field320.field5347 = true;
                this.field320.field5351 = null;
                this.field320.field5356 = var55;
                this.field320.field5346 = var6;
            }
            if (arg4) {
                this.field317.field5347 = true;
                this.field317.field5351 = null;
                this.field317.field5356 = var55;
                this.field317.field5346 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field302.field2532);
            var57.put(field302.field2500, 0, field302.field2532);
            var57.flip();
            if (arg1) {
                this.field285.field5347 = true;
                this.field285.field5351 = var57;
                this.field285.field5356 = null;
                this.field285.field5346 = var6;
            }
            if (arg2) {
                this.field287.field5347 = true;
                this.field287.field5351 = var57;
                this.field285.field5356 = null;
                this.field287.field5346 = var6;
            }
            if (arg3) {
                this.field320.field5347 = true;
                this.field320.field5351 = var57;
                this.field320.field5356 = null;
                this.field320.field5346 = var6;
            }
            if (arg4) {
                this.field317.field5347 = true;
                this.field317.field5351 = var57;
                this.field317.field5356 = null;
                this.field317.field5346 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILic;[[I[[IIII)V", line = 836)
    public final void method167(int arg0, int arg1, class21 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field314.field552) {
            arg2.method198();
        }
        int var9 = arg2.field314.field555 + arg5;
        int var10 = arg2.field314.field557 + arg5;
        int var11 = arg2.field314.field553 + arg7;
        int var12 = arg2.field314.field551 + arg7;
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
            for (int var17 = 0; var17 < this.field308; var17++) {
                int var18 = this.field310[var17] + arg5;
                int var19 = this.field305[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field299[var17] = this.field299[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field314.field554;
            for (int var28 = 0; var28 < this.field308; var28++) {
                int var29 = (this.field299[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field310[var28] + arg5;
                    int var31 = this.field305[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field299[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method1571(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field314.field550 - arg2.field314.field554;
            for (int var42 = 0; var42 < this.field308; var42++) {
                int var43 = this.field310[var42] + arg5;
                int var44 = this.field305[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field299[var42] = var51 + this.field299[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field314.field550 - arg2.field314.field554;
            for (int var53 = 0; var53 < this.field308; var53++) {
                int var54 = this.field310[var53] + arg5;
                int var55 = this.field305[var53] + arg7;
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
                this.field299[var53] = ((this.field299[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field285.field5347 = false;
        this.field314.field552 = false;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIIIJILvh;)V", line = 1034)
    public final void method75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class64 arg10) {
        if (this.field324 == 0) {
            return;
        }
        if (!this.field314.field552) {
            this.method198();
        }
        short var13 = this.field314.field556;
        short var14 = this.field314.field554;
        short var15 = this.field314.field550;
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
        if (var21 / var18 <= class325.field5062) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class5.field50) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class91.field1445) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class53.field899) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class15.field204[arg0];
            var27 = class15.field216[arg0];
        }
        if (arg8 > 0L && class232.field3668 && var19 > 0) {
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
            if (class179.field2700 >= var28 && class179.field2700 <= var29 && class111.field1728 >= var30 && class111.field1728 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field314.field555;
                short var37 = this.field314.field557;
                short var38 = this.field314.field553;
                short var39 = this.field314.field551;
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
                if (class179.field2700 >= var32 && class179.field2700 <= var33 && class111.field1728 >= var34 && class111.field1728 <= var35) {
                    if (this.field3534) {
                        class176.field2674[class315.field4903++] = arg8;
                    } else {
                        if (field341.length < this.field324) {
                            field341 = new int[this.field324];
                            field332 = new int[this.field324];
                        }
                        int var59 = 0;
                        label118: while (true) {
                            if (var59 >= this.field308) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field318) {
                                        break label118;
                                    }
                                    short var80 = this.field295[var79];
                                    short var81 = this.field304[var79];
                                    short var82 = this.field282[var79];
                                    if (this.method192(class179.field2700, class111.field1728, field332[var80], field332[var81], field332[var82], field341[var80], field341[var81], field341[var82])) {
                                        class176.field2674[class315.field4903++] = arg8;
                                        break label118;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field310[var59];
                            int var61 = this.field299[var59];
                            int var62 = this.field305[var59];
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
                            int var75 = this.field301[var59];
                            int var76 = this.field301[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field293[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field341[var78] = var73;
                                field332[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class94.field1473;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method161();
        var83.glPopMatrix();
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V", line = 1309)
    public final void method168(int arg0) {
        int var2 = class15.field204[arg0];
        int var3 = class15.field216[arg0];
        for (int var4 = 0; var4 < this.field303; var4++) {
            int var5 = this.field310[var4] * var3 + this.field299[var4] * var2 >> 16;
            this.field299[var4] = this.field299[var4] * var3 - this.field310[var4] * var2 >> 16;
            this.field310[var4] = var5;
        }
        this.field314.field552 = false;
        this.field285.field5347 = false;
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V", line = 1328)
    public final void method169(int arg0) {
        this.field288 = (short) arg0;
        this.field287.field5347 = false;
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V", line = 1332)
    public final void method170(int arg0) {
        if (this.field325 == null) {
            this.method185(arg0);
            return;
        }
        int var2 = class15.field204[arg0];
        int var3 = class15.field216[arg0];
        for (int var4 = 0; var4 < this.field303; var4++) {
            int var5 = this.field310[var4] * var3 + this.field305[var4] * var2 >> 16;
            this.field305[var4] = this.field305[var4] * var3 - this.field310[var4] * var2 >> 16;
            this.field310[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field324; var6++) {
            int var7 = this.field325[var6] * var3 + this.field298[var6] * var2 >> 16;
            this.field298[var6] = (short) (this.field298[var6] * var3 - this.field325[var6] * var2 >> 16);
            this.field325[var6] = (short) var7;
        }
        this.field314.field552 = false;
        this.field285.field5347 = false;
        if (this.field320 != null) {
            this.field320.field5347 = false;
        }
    }

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "()I", line = 1373)
    public final int method171() {
        if (!this.field314.field552) {
            this.method198();
        }
        return this.field314.field556;
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "()I", line = 1379)
    public final int method172() {
        if (!this.field314.field552) {
            this.method198();
        }
        return this.field314.field553;
    }

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "()I", line = 1386)
    public final int method173() {
        if (!this.field314.field552) {
            this.method198();
        }
        return this.field314.field555;
    }

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "()V", line = 1392)
    public final void method174() {
        if (this.field325 == null) {
            this.method181();
            return;
        }
        for (int var1 = 0; var1 < this.field303; var1++) {
            int var2 = this.field305[var1];
            this.field305[var1] = this.field310[var1];
            this.field310[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field324; var3++) {
            short var4 = this.field298[var3];
            this.field298[var3] = this.field325[var3];
            this.field325[var3] = (short) (-var4);
        }
        this.field314.field552 = false;
        this.field285.field5347 = false;
        if (this.field320 != null) {
            this.field320.field5347 = false;
        }
    }

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "()I", line = 1429)
    public final int method175() {
        if (!this.field314.field552) {
            this.method198();
        }
        return this.field314.field551;
    }

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "()V", line = 1435)
    public static void method176() {
        field307 = null;
        field302 = null;
        field322 = null;
        field323 = null;
        field326 = null;
        field327 = null;
        field328 = null;
        field329 = null;
        field330 = null;
        field341 = null;
        field332 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lin;)Lin;", line = 1449)
    public final class168 method177(class168 arg0) {
        if (this.field324 == 0) {
            return null;
        }
        if (!this.field314.field552) {
            this.method198();
        }
        int var2;
        int var3;
        if (class250.field3945 > 0) {
            var2 = this.field314.field555 - (class250.field3945 * this.field314.field550 >> 8) >> 3;
            var3 = this.field314.field557 - (class250.field3945 * this.field314.field554 >> 8) >> 3;
        } else {
            var2 = this.field314.field555 - (class250.field3945 * this.field314.field554 >> 8) >> 3;
            var3 = this.field314.field557 - (class250.field3945 * this.field314.field550 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class250.field3955 > 0) {
            var4 = this.field314.field553 - (class250.field3955 * this.field314.field550 >> 8) >> 3;
            var5 = this.field314.field551 - (class250.field3955 * this.field314.field554 >> 8) >> 3;
        } else {
            var4 = this.field314.field553 - (class250.field3955 * this.field314.field554 >> 8) >> 3;
            var5 = this.field314.field551 - (class250.field3955 * this.field314.field550 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class168 var8;
        if (arg0 == null || arg0.field2555.length < var6 * var7) {
            var8 = new class168(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field3977 = arg0.field3972 = var6;
            arg0.field3975 = arg0.field3980 = var7;
            arg0.method1211();
        }
        var8.field3981 = var2;
        var8.field3973 = var4;
        if (field341.length < this.field324) {
            field341 = new int[this.field324];
            field332 = new int[this.field324];
        }
        for (int var9 = 0; var9 < this.field308; var9++) {
            int var10 = (this.field310[var9] - (this.field299[var9] * class250.field3945 >> 8) >> 3) - var2;
            int var11 = (this.field305[var9] - (this.field299[var9] * class250.field3955 >> 8) >> 3) - var4;
            int var12 = this.field301[var9];
            int var13 = this.field301[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field293[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field341[var15] = var10;
                field332[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field318; var16++) {
            if (this.field312[var16] <= 128) {
                short var17 = this.field295[var16];
                short var18 = this.field304[var16];
                short var19 = this.field282[var16];
                int var20 = field341[var17];
                int var21 = field341[var18];
                int var22 = field341[var19];
                int var23 = field332[var17];
                int var24 = field332[var18];
                int var25 = field332[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class15.method129(var8.field2555, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ld;IJIIIIFF)S", line = 1573)
    private final short method178(class42 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field301[arg1];
        int var12 = this.field301[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field293[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field307[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field293[var13] = (short) (this.field324 + 1);
        field307[var13] = arg2;
        this.field325[this.field324] = (short) arg3;
        this.field294[this.field324] = (short) arg4;
        this.field298[this.field324] = (short) arg5;
        this.field311[this.field324] = (short) arg6;
        this.field300[this.field324] = arg7;
        this.field313[this.field324] = arg8;
        return (short) (this.field324++);
    }

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "()V", line = 1608)
    public final void method179() {
        if (this.field325 == null) {
            this.method213();
            return;
        }
        for (int var1 = 0; var1 < this.field303; var1++) {
            this.field310[var1] = -this.field310[var1];
            this.field305[var1] = -this.field305[var1];
        }
        for (int var2 = 0; var2 < this.field324; var2++) {
            this.field325[var2] = (short) (-this.field325[var2]);
            this.field298[var2] = (short) (-this.field298[var2]);
        }
        this.field314.field552 = false;
        this.field285.field5347 = false;
        if (this.field320 != null) {
            this.field320.field5347 = false;
        }
    }

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "()V", line = 1645)
    public final void method180() {
        for (int var1 = 0; var1 < this.field303; var1++) {
            int var2 = this.field310[var1];
            this.field310[var1] = this.field305[var1];
            this.field305[var1] = -var2;
        }
        this.field314.field552 = false;
        this.field285.field5347 = false;
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "()V", line = 1661)
    public final void method181() {
        for (int var1 = 0; var1 < this.field303; var1++) {
            int var2 = this.field305[var1];
            this.field305[var1] = this.field310[var1];
            this.field310[var1] = -var2;
        }
        this.field314.field552 = false;
        this.field285.field5347 = false;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZZZZZZZ)V", line = 1675)
    public final void method182(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field283 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field324 != 0) {
            if (arg6) {
                boolean var8 = !this.field287.field5347 && (arg1 || arg2 && !class208.field3191);
                this.method166(false, !this.field285.field5347 && arg0, var8, this.field320 != null && !this.field320.field5347 && arg2, !this.field317.field5347 && arg3);
                if (!this.field291.field5347 && arg4 && arg1) {
                    this.method187();
                }
            }
            if (arg0) {
                if (this.field285.field5347) {
                    if (!this.field314.field552) {
                        this.method198();
                    }
                    this.field310 = null;
                    this.field299 = null;
                    this.field305 = null;
                    this.field293 = null;
                    this.field301 = null;
                } else {
                    this.field297 = (byte) (this.field297 | 0x1);
                }
            }
            if (arg1) {
                if (this.field287.field5347) {
                    this.field286 = null;
                    this.field312 = null;
                } else {
                    this.field297 = (byte) (this.field297 | 0x2);
                }
            }
            if (arg2 && class208.field3191) {
                if (this.field320.field5347) {
                    this.field325 = null;
                    this.field294 = null;
                    this.field298 = null;
                    this.field311 = null;
                } else {
                    this.field297 = (byte) (this.field297 | 0x4);
                }
            }
            if (arg3) {
                if (this.field317.field5347) {
                    this.field300 = null;
                    this.field313 = null;
                } else {
                    this.field297 = (byte) (this.field297 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field291.field5347 && this.field287.field5347) {
                    this.field295 = null;
                    this.field304 = null;
                    this.field282 = null;
                } else {
                    this.field297 = (byte) (this.field297 | 0x10);
                }
            }
            if (arg5) {
                this.field321 = null;
                this.field309 = null;
                this.field290 = (int[][]) null;
                this.field281 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "()I", line = 1771)
    public final int method183() {
        if (!this.field314.field552) {
            this.method198();
        }
        return this.field314.field550;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lwb;IIIZ)V", line = 1778)
    public final void method184(class253 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class21 var6 = (class21) arg0;
        if (this.field318 == 0 || var6.field318 == 0) {
            return;
        }
        int var7 = var6.field308;
        int[] var8 = var6.field310;
        int[] var9 = var6.field299;
        int[] var10 = var6.field305;
        short[] var11 = var6.field325;
        short[] var12 = var6.field294;
        short[] var13 = var6.field298;
        short[] var14 = var6.field311;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field315 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field315.field795;
            var16 = this.field315.field794;
            var17 = this.field315.field793;
            var18 = this.field315.field792;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field315 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field315.field795;
            var20 = var6.field315.field794;
            var21 = var6.field315.field793;
            var22 = var6.field315.field792;
        }
        int[] var23 = var6.field301;
        short[] var24 = var6.field293;
        if (!var6.field314.field552) {
            var6.method198();
        }
        short var25 = var6.field314.field554;
        short var26 = var6.field314.field550;
        short var27 = var6.field314.field555;
        short var28 = var6.field314.field557;
        short var29 = var6.field314.field553;
        short var30 = var6.field314.field551;
        for (int var31 = 0; var31 < this.field308; var31++) {
            int var32 = this.field299[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field310[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field305[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field301[var31];
                        int var37 = this.field301[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field293[var38] - 1;
                            if (var35 == -1 || this.field311[var35] != 0) {
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
                                            this.field315 = new class49();
                                            var15 = this.field315.field795 = class227.method1606(0, this.field325);
                                            var16 = this.field315.field794 = class227.method1606(0, this.field294);
                                            var17 = this.field315.field793 = class227.method1606(0, this.field298);
                                            var18 = this.field315.field792 = class227.method1606(0, this.field311);
                                        }
                                        if (var19 == null) {
                                            class49 var44 = var6.field315 = new class49();
                                            var19 = var44.field795 = class227.method1606(0, var11);
                                            var20 = var44.field794 = class227.method1606(0, var12);
                                            var21 = var44.field793 = class227.method1606(0, var13);
                                            var22 = var44.field792 = class227.method1606(0, var14);
                                        }
                                        short var45 = this.field325[var35];
                                        short var46 = this.field294[var35];
                                        short var47 = this.field298[var35];
                                        short var48 = this.field311[var35];
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
                                        int var57 = this.field301[var31];
                                        int var58 = this.field301[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field293[var59] - 1;
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

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V", line = 2019)
    public final void method185(int arg0) {
        int var2 = class15.field204[arg0];
        int var3 = class15.field216[arg0];
        for (int var4 = 0; var4 < this.field303; var4++) {
            int var5 = this.field310[var4] * var3 + this.field305[var4] * var2 >> 16;
            this.field305[var4] = this.field305[var4] * var3 - this.field310[var4] * var2 >> 16;
            this.field310[var4] = var5;
        }
        this.field314.field552 = false;
        this.field285.field5347 = false;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZZZLic;Lic;)Lwi;", line = 2040)
    private final class221 method186(boolean arg0, boolean arg1, boolean arg2, class21 arg3, class21 arg4) {
        arg3.field303 = this.field303;
        arg3.field308 = this.field308;
        arg3.field324 = this.field324;
        arg3.field318 = this.field318;
        arg3.field288 = this.field288;
        arg3.field292 = this.field292;
        arg3.field283 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
        if (arg3.field310 == null || arg3.field310.length < this.field303) {
            arg3.field310 = new int[this.field303 + 100];
            arg3.field299 = new int[this.field303 + 100];
            arg3.field305 = new int[this.field303 + 100];
        }
        for (int var6 = 0; var6 < this.field303; var6++) {
            arg3.field310[var6] = this.field310[var6];
            arg3.field299[var6] = this.field299[var6];
            arg3.field305[var6] = this.field305[var6];
        }
        if (arg3.field285 == null) {
            arg3.field285 = new class345();
        }
        arg3.field285.field5347 = false;
        if (arg3.field314 == null) {
            arg3.field314 = new class36();
        }
        arg3.field314.field552 = false;
        if (arg0) {
            arg3.field312 = this.field312;
        } else {
            if (arg4.field312 == null || arg4.field312.length < this.field318) {
                arg4.field312 = new byte[this.field318 + 100];
            }
            arg3.field312 = arg4.field312;
            for (int var7 = 0; var7 < this.field318; var7++) {
                arg3.field312[var7] = this.field312[var7];
            }
        }
        if (arg1) {
            arg3.field286 = this.field286;
        } else {
            if (arg4.field286 == null || arg4.field286.length < this.field318) {
                arg4.field286 = new short[this.field318 + 100];
            }
            arg3.field286 = arg4.field286;
            for (int var8 = 0; var8 < this.field318; var8++) {
                arg3.field286[var8] = this.field286[var8];
            }
        }
        if (arg0 && arg1) {
            arg3.field287 = this.field287;
        } else {
            if (arg4.field287 == null) {
                arg4.field287 = new class345();
            }
            arg3.field287 = arg4.field287;
            arg3.field287.field5347 = false;
        }
        if (arg2 || this.field325 == null) {
            arg3.field325 = this.field325;
            arg3.field294 = this.field294;
            arg3.field298 = this.field298;
            arg3.field311 = this.field311;
            arg3.field320 = this.field320;
        } else {
            if (arg4.field325 == null || arg4.field325.length < this.field324) {
                arg4.field325 = new short[this.field324 + 100];
                arg4.field294 = new short[this.field324 + 100];
                arg4.field298 = new short[this.field324 + 100];
                arg4.field311 = new short[this.field324 + 100];
            }
            arg3.field325 = arg4.field325;
            arg3.field294 = arg4.field294;
            arg3.field298 = arg4.field298;
            arg3.field311 = arg4.field311;
            for (int var9 = 0; var9 < this.field324; var9++) {
                arg3.field325[var9] = this.field325[var9];
                arg3.field294[var9] = this.field294[var9];
                arg3.field298[var9] = this.field298[var9];
                arg3.field311[var9] = this.field311[var9];
            }
            if (class208.field3191) {
                if (arg4.field320 == null) {
                    arg4.field320 = new class345();
                }
                arg3.field320 = arg4.field320;
                arg3.field320.field5347 = false;
            } else {
                arg3.field320 = null;
            }
        }
        arg3.field300 = this.field300;
        arg3.field313 = this.field313;
        arg3.field321 = this.field321;
        arg3.field290 = this.field290;
        arg3.field295 = this.field295;
        arg3.field304 = this.field304;
        arg3.field282 = this.field282;
        arg3.field284 = this.field284;
        arg3.field309 = this.field309;
        arg3.field281 = this.field281;
        arg3.field317 = this.field317;
        arg3.field291 = this.field291;
        arg3.field296 = this.field296;
        arg3.field293 = this.field293;
        arg3.field301 = this.field301;
        arg3.field3534 = this.field3534;
        arg3.field319 = this.field319;
        arg3.field289 = this.field289;
        return arg3;
    }

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "()V", line = 2194)
    private final void method187() {
        if (field302.field2500.length < this.field318 * 12) {
            field302 = new class166((this.field318 + 100) * 12);
        } else {
            field302.field2532 = 0;
        }
        if (class94.field1512) {
            for (int var1 = 0; var1 < this.field318; var1++) {
                field302.method1174((byte) -32, this.field295[var1]);
                field302.method1174((byte) -32, this.field304[var1]);
                field302.method1174((byte) -32, this.field282[var1]);
            }
        } else {
            for (int var2 = 0; var2 < this.field318; var2++) {
                field302.method1169(this.field295[var2], 30148);
                field302.method1169(this.field304[var2], 30148);
                field302.method1169(this.field282[var2], 30148);
            }
        }
        if (!class94.field1507) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field302.field2532);
            var5.put(field302.field2500, 0, field302.field2532);
            var5.flip();
            this.field291.field5347 = true;
            this.field291.field5351 = var5;
            this.field291.field5356 = null;
            return;
        }
        class113 var3 = new class113();
        ByteBuffer var4 = ByteBuffer.wrap(field302.field2500, 0, field302.field2532);
        var3.method841(var4);
        this.field291.field5347 = true;
        this.field291.field5351 = null;
        this.field291.field5356 = var3;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZZZZZZZZZZZ)Lic;", line = 2253)
    public final class21 method188(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class21 var12 = new class21();
        var12.field303 = this.field303;
        var12.field308 = this.field308;
        var12.field324 = this.field324;
        var12.field318 = this.field318;
        if (arg0) {
            var12.field310 = this.field310;
            var12.field305 = this.field305;
        } else {
            var12.field310 = class204.method1445(true, this.field310);
            var12.field305 = class204.method1445(true, this.field305);
        }
        if (arg1) {
            var12.field299 = this.field299;
        } else {
            var12.field299 = class204.method1445(true, this.field299);
        }
        if (arg0 && arg1) {
            var12.field285 = this.field285;
            var12.field314 = this.field314;
        } else {
            var12.field285 = new class345();
            var12.field314 = new class36();
        }
        if (arg2) {
            var12.field286 = this.field286;
        } else {
            var12.field286 = class227.method1606(0, this.field286);
        }
        if (arg3) {
            var12.field312 = this.field312;
        } else {
            var12.field312 = class136.method989(-23, this.field312);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class208.field3191) {
            var12.field287 = new class345();
        } else {
            var12.field287 = this.field287;
        }
        if (arg5) {
            var12.field325 = this.field325;
            var12.field294 = this.field294;
            var12.field298 = this.field298;
            var12.field311 = this.field311;
        } else {
            var12.field325 = class227.method1606(0, this.field325);
            var12.field294 = class227.method1606(0, this.field294);
            var12.field298 = class227.method1606(0, this.field298);
            var12.field311 = class227.method1606(0, this.field311);
        }
        if (!class208.field3191) {
            var12.field320 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field320 = this.field320;
        } else {
            var12.field320 = new class345();
        }
        if (arg8) {
            var12.field300 = this.field300;
            var12.field313 = this.field313;
            var12.field317 = this.field317;
        } else {
            var12.field300 = class59.method467(this.field300, 0);
            var12.field313 = class59.method467(this.field313, 0);
            var12.field317 = new class345();
        }
        if (arg9) {
            var12.field295 = this.field295;
            var12.field304 = this.field304;
            var12.field282 = this.field282;
            var12.field291 = this.field291;
        } else {
            var12.field295 = class227.method1606(0, this.field295);
            var12.field304 = class227.method1606(0, this.field304);
            var12.field282 = class227.method1606(0, this.field282);
            var12.field291 = new class345();
        }
        if (arg10) {
            var12.field284 = this.field284;
        } else {
            var12.field284 = class227.method1606(0, this.field284);
        }
        var12.field321 = this.field321;
        var12.field290 = this.field290;
        var12.field309 = this.field309;
        var12.field281 = this.field281;
        var12.field296 = this.field296;
        var12.field293 = this.field293;
        var12.field301 = this.field301;
        var12.field288 = this.field288;
        var12.field292 = this.field292;
        var12.field319 = this.field319;
        var12.field289 = this.field289;
        return var12;
    }

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "()V", line = 2392)
    public final void method189() {
        if (this.field325 == null) {
            this.method180();
            return;
        }
        for (int var1 = 0; var1 < this.field303; var1++) {
            int var2 = this.field310[var1];
            this.field310[var1] = this.field305[var1];
            this.field305[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field324; var3++) {
            short var4 = this.field325[var3];
            this.field325[var3] = this.field298[var3];
            this.field298[var3] = (short) (-var4);
        }
        this.field314.field552 = false;
        this.field285.field5347 = false;
        if (this.field320 != null) {
            this.field320.field5347 = false;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "()I", line = 2429)
    public final int method76() {
        if (!this.field314.field552) {
            this.method198();
        }
        return this.field314.field554;
    }

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "()V", line = 2438)
    public final void method190() {
        for (int var1 = 0; var1 < this.field303; var1++) {
            this.field305[var1] = -this.field305[var1];
        }
        if (this.field298 != null) {
            for (int var2 = 0; var2 < this.field324; var2++) {
                this.field298[var2] = (short) (-this.field298[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field318; var3++) {
            short var4 = this.field295[var3];
            this.field295[var3] = this.field282[var3];
            this.field282[var3] = var4;
        }
        this.field314.field552 = false;
        this.field285.field5347 = false;
        if (this.field320 != null) {
            this.field320.field5347 = false;
        }
        this.field291.field5347 = false;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZZZ)Lwi;", line = 2474)
    public final class221 method191(boolean arg0, boolean arg1, boolean arg2) {
        return this.method186(arg0, arg1, arg2, field328, field327);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIII)Z", line = 2477)
    private final boolean method192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "()V", line = 2493)
    public final void method193() {
        int var10002;
        if (this.field321 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field303; var3++) {
                int var4 = this.field321[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field290 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field290[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field303) {
                int var7 = this.field321[var6] & 0xFF;
                this.field290[var7][var1[var7]++] = var6++;
            }
            this.field321 = null;
        }
        if (this.field309 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field318; var10++) {
            int var11 = this.field309[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field281 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field281[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field318) {
            int var14 = this.field309[var13] & 0xFF;
            this.field281[var14][var8[var14]++] = var13++;
        }
        this.field309 = null;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(ZZZ)Lwi;", line = 2585)
    public final class221 method194(boolean arg0, boolean arg1, boolean arg2) {
        return this.method186(arg0, arg1, arg2, field326, field323);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[IIIIZ)V", line = 2590)
    public final void method195(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field334 = 0;
            field338 = 0;
            field339 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field290.length) {
                    int[] var14 = this.field290[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field334 += this.field310[var16];
                        field338 += this.field299[var16];
                        field339 += this.field305[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field334 = field334 / var11 + var8;
                field338 = field338 / var11 + var9;
                field339 = field339 / var11 + var10;
            } else {
                field334 = var8;
                field338 = var9;
                field339 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field290.length) {
                    int[] var22 = this.field290[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field310[var24] += var17;
                        this.field299[var24] += var18;
                        this.field305[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field290.length) {
                    int[] var27 = this.field290[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field310[var29] -= field334;
                        this.field299[var29] -= field338;
                        this.field305[var29] -= field339;
                        if (arg4 != 0) {
                            int var30 = class15.field204[arg4];
                            int var31 = class15.field216[arg4];
                            int var32 = this.field310[var29] * var31 + this.field299[var29] * var30 + 32767 >> 16;
                            this.field299[var29] = this.field299[var29] * var31 + 32767 - this.field310[var29] * var30 >> 16;
                            this.field310[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class15.field204[arg2];
                            int var34 = class15.field216[arg2];
                            int var35 = this.field299[var29] * var34 + 32767 - this.field305[var29] * var33 >> 16;
                            this.field305[var29] = this.field305[var29] * var34 + this.field299[var29] * var33 + 32767 >> 16;
                            this.field299[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class15.field204[arg3];
                            int var37 = class15.field216[arg3];
                            int var38 = this.field310[var29] * var37 + this.field305[var29] * var36 + 32767 >> 16;
                            this.field305[var29] = this.field305[var29] * var37 + 32767 - this.field310[var29] * var36 >> 16;
                            this.field310[var29] = var38;
                        }
                        this.field310[var29] += field334;
                        this.field299[var29] += field338;
                        this.field305[var29] += field339;
                    }
                }
            }
            if (arg5 && this.field325 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field290.length) {
                        int[] var41 = this.field290[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field301[var43];
                            int var45 = this.field301[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field293[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class15.field204[arg4];
                                    int var49 = class15.field216[arg4];
                                    int var50 = this.field325[var47] * var49 + this.field294[var47] * var48 + 32767 >> 16;
                                    this.field294[var47] = (short) (this.field294[var47] * var49 + 32767 - this.field325[var47] * var48 >> 16);
                                    this.field325[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class15.field204[arg2];
                                    int var52 = class15.field216[arg2];
                                    int var53 = this.field294[var47] * var52 + 32767 - this.field298[var47] * var51 >> 16;
                                    this.field298[var47] = (short) (this.field298[var47] * var52 + this.field294[var47] * var51 + 32767 >> 16);
                                    this.field294[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class15.field204[arg3];
                                    int var55 = class15.field216[arg3];
                                    int var56 = this.field325[var47] * var55 + this.field298[var47] * var54 + 32767 >> 16;
                                    this.field298[var47] = (short) (this.field298[var47] * var55 + 32767 - this.field325[var47] * var54 >> 16);
                                    this.field325[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field320 != null) {
                    this.field320.field5347 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field290.length) {
                    int[] var59 = this.field290[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field310[var61] -= field334;
                        this.field299[var61] -= field338;
                        this.field305[var61] -= field339;
                        this.field310[var61] = this.field310[var61] * arg2 >> 7;
                        this.field299[var61] = this.field299[var61] * arg3 >> 7;
                        this.field305[var61] = this.field305[var61] * arg4 >> 7;
                        this.field310[var61] += field334;
                        this.field299[var61] += field338;
                        this.field305[var61] += field339;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field281 != null && this.field312 != null) {
                for (int var62 = 0; var62 < var7; var62++) {
                    int var63 = arg1[var62];
                    if (var63 < this.field281.length) {
                        int[] var64 = this.field281[var63];
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            int var66 = var64[var65];
                            int var67 = (this.field312[var66] & 0xFF) + arg2 * 8;
                            if (var67 < 0) {
                                var67 = 0;
                            } else if (var67 > 255) {
                                var67 = 255;
                            }
                            this.field312[var66] = (byte) var67;
                        }
                        if (var64.length > 0) {
                            this.field287.field5347 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field281 != null) {
            for (int var68 = 0; var68 < var7; var68++) {
                int var69 = arg1[var68];
                if (var69 < this.field281.length) {
                    int[] var70 = this.field281[var69];
                    for (int var71 = 0; var71 < var70.length; var71++) {
                        int var72 = var70[var71];
                        int var73 = this.field286[var72] & 0xFFFF;
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
                        this.field286[var72] = (short) (var77 << 10 | var78 << 7 | var79);
                    }
                    if (var70.length > 0) {
                        this.field287.field5347 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIFFF)[F", line = 2999)
    private static final float[] method196(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
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

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(SS)V", line = 3066)
    public final void method197(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field318; var3++) {
            if (this.field286[var3] == arg0) {
                this.field286[var3] = arg1;
            }
        }
        this.field287.field5347 = false;
    }

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "()V", line = 3079)
    private final void method198() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field308; var9++) {
            int var10 = this.field310[var9];
            int var11 = this.field299[var9];
            int var12 = this.field305[var9];
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
        this.field314.field555 = (short) var1;
        this.field314.field557 = (short) var4;
        this.field314.field554 = (short) var2;
        this.field314.field550 = (short) var5;
        this.field314.field553 = (short) var3;
        this.field314.field551 = (short) var6;
        this.field314.field556 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field314.field552 = true;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIIJ)V", line = 3149)
    public final void method199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field324 == 0) {
            return;
        }
        GL var10 = class94.field1473;
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
        this.method161();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)Lwb;", line = 3173)
    public final class253 method200(int arg0, int arg1, int arg2) {
        this.field306 = false;
        if (this.field315 != null) {
            this.field325 = this.field315.field795;
            this.field294 = this.field315.field794;
            this.field298 = this.field315.field793;
            this.field311 = this.field315.field792;
            this.field315 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ISIB)I", line = 3189)
    private static final int method201(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class15.field215[class66.method503(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class15.field207.method2088(arg1 & 0xFFFF, (byte) -92);
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
            int var9 = class15.field207.method2082(255, arg1 & 0xFFFF);
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

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "()V", line = 3248)
    public static final void method202() {
        field323 = new class21();
        field326 = new class21();
        field327 = new class21();
        field328 = new class21();
        field329 = new class21();
        field330 = new class21();
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V", line = 4535)
    private class21() {
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Ld;IIZ)V", line = 4537)
    public class21(class42 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field656];
        this.field301 = new int[arg0.field636 + 1];
        for (int var6 = 0; var6 < arg0.field656; var6++) {
            if ((arg0.field625 == null || arg0.field625[var6] != 2) && (arg0.field623 == null || arg0.field623[var6] == -1 || !class15.field207.method2090(arg0.field623[var6] & 0xFFFF, (byte) 106))) {
                var5[this.field318++] = var6;
                this.field301[arg0.field632[var6]]++;
                this.field301[arg0.field663[var6]]++;
                this.field301[arg0.field615[var6]]++;
            }
        }
        long[] var7 = new long[this.field318];
        for (int var8 = 0; var8 < this.field318; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field623 != null) {
                var14 = arg0.field623[var9];
                if (var14 != -1) {
                    var12 = class15.field207.method2079((byte) 42, var14 & 0xFFFF);
                    var13 = class15.field207.method2089(16871, var14 & 0xFFFF);
                }
            }
            boolean var15 = arg0.field648 != null && arg0.field648[var9] != 0 || var14 != -1 && !class15.field207.method2080(-102, var14 & 0xFFFF);
            if ((arg3 || var15) && arg0.field618 != null) {
                var10 += arg0.field618[var9] << 17;
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
        class191.method1362(125, var7, var5);
        this.field303 = arg0.field636;
        this.field308 = arg0.field633;
        this.field310 = arg0.field646;
        this.field299 = arg0.field660;
        this.field305 = arg0.field630;
        this.field321 = arg0.field649;
        this.field319 = arg0.field620;
        int var20 = this.field318 * 3;
        this.field325 = new short[var20];
        this.field294 = new short[var20];
        this.field298 = new short[var20];
        this.field311 = new short[var20];
        this.field300 = new float[var20];
        this.field313 = new float[var20];
        this.field286 = new short[this.field318];
        this.field312 = new byte[this.field318];
        this.field295 = new short[this.field318];
        this.field304 = new short[this.field318];
        this.field282 = new short[this.field318];
        this.field284 = new short[this.field318];
        if (arg0.field647 != null) {
            this.field309 = new byte[this.field318];
        }
        if (arg0.field622 != null) {
            this.field289 = new short[this.field318];
        }
        this.field314 = new class36();
        this.field285 = new class345();
        this.field287 = new class345();
        if (class208.field3191) {
            this.field320 = new class345();
        }
        this.field317 = new class345();
        this.field291 = new class345();
        this.field288 = (short) arg1;
        this.field292 = (short) arg2;
        this.field293 = new short[var20];
        field307 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < this.field308; var22++) {
            int var23 = this.field301[var22];
            this.field301[var22] = var21;
            var21 += var23;
        }
        this.field301[this.field308] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field658 != null) {
            int var28 = arg0.field657;
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
            for (int var36 = 0; var36 < this.field318; var36++) {
                int var37 = var5[var36];
                if (arg0.field658[var37] != -1) {
                    int var38 = arg0.field658[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field632[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field663[var37];
                        } else {
                            var40 = arg0.field615[var37];
                        }
                        int var41 = arg0.field646[var40];
                        int var42 = arg0.field660[var40];
                        int var43 = arg0.field630[var40];
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
                byte var45 = arg0.field650[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field665[var44];
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
                        var49 = 64.0F / (float) (arg0.field631[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field665[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field631[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field651[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field665[var44] / 1024.0F;
                        var49 = (float) arg0.field631[var44] / 1024.0F;
                        var48 = (float) arg0.field651[var44] / 1024.0F;
                    }
                    var27[var44] = method196(arg0.field645[var44], arg0.field619[var44], arg0.field634[var44], arg0.field661[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field318; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field662[var51] & 0xFFFF;
            short var53;
            if (arg0.field623 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field623[var51];
            }
            int var54;
            if (arg0.field658 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field658[var51];
            }
            int var55;
            if (arg0.field648 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field648[var51] & 0xFF;
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
                    byte var65 = arg0.field650[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field632[var51];
                        int var67 = arg0.field663[var51];
                        int var68 = arg0.field615[var51];
                        short var69 = arg0.field645[var54];
                        short var70 = arg0.field619[var54];
                        short var71 = arg0.field634[var54];
                        float var72 = (float) arg0.field646[var69];
                        float var73 = (float) arg0.field660[var69];
                        float var74 = (float) arg0.field630[var69];
                        float var75 = (float) arg0.field646[var70] - var72;
                        float var76 = (float) arg0.field660[var70] - var73;
                        float var77 = (float) arg0.field630[var70] - var74;
                        float var78 = (float) arg0.field646[var71] - var72;
                        float var79 = (float) arg0.field660[var71] - var73;
                        float var80 = (float) arg0.field630[var71] - var74;
                        float var81 = (float) arg0.field646[var66] - var72;
                        float var82 = (float) arg0.field660[var66] - var73;
                        float var83 = (float) arg0.field630[var66] - var74;
                        float var84 = (float) arg0.field646[var67] - var72;
                        float var85 = (float) arg0.field660[var67] - var73;
                        float var86 = (float) arg0.field630[var67] - var74;
                        float var87 = (float) arg0.field646[var68] - var72;
                        float var88 = (float) arg0.field660[var68] - var73;
                        float var89 = (float) arg0.field630[var68] - var74;
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
                        int var101 = arg0.field632[var51];
                        int var102 = arg0.field663[var51];
                        int var103 = arg0.field615[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field643[var54];
                        float var109 = (float) arg0.field616[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field651[var54] & 0xFFFF) / 1024.0F;
                            method206(arg0.field646[var101], arg0.field660[var101], arg0.field630[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field335;
                            var57 = field336;
                            method206(arg0.field646[var102], arg0.field660[var102], arg0.field630[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field335;
                            var59 = field336;
                            method206(arg0.field646[var103], arg0.field660[var103], arg0.field630[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field335;
                            var61 = field336;
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
                            float var112 = (float) arg0.field642[var54] / 256.0F;
                            float var113 = (float) arg0.field664[var54] / 256.0F;
                            int var114 = arg0.field646[var102] - arg0.field646[var101];
                            int var115 = arg0.field660[var102] - arg0.field660[var101];
                            int var116 = arg0.field630[var102] - arg0.field630[var101];
                            int var117 = arg0.field646[var103] - arg0.field646[var101];
                            int var118 = arg0.field660[var103] - arg0.field660[var101];
                            int var119 = arg0.field630[var103] - arg0.field630[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field665[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field631[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field651[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method165(var126, var127, var128);
                            method215(arg0.field646[var101], arg0.field660[var101], arg0.field630[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field337;
                            var57 = field342;
                            method215(arg0.field646[var102], arg0.field660[var102], arg0.field630[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field337;
                            var59 = field342;
                            method215(arg0.field646[var103], arg0.field660[var103], arg0.field630[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field337;
                            var61 = field342;
                        } else if (var65 == 3) {
                            method207(arg0.field646[var101], arg0.field660[var101], arg0.field630[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field331;
                            var57 = field333;
                            method207(arg0.field646[var102], arg0.field660[var102], arg0.field630[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field331;
                            var59 = field333;
                            method207(arg0.field646[var103], arg0.field660[var103], arg0.field630[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field331;
                            var61 = field333;
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
            arg0.method355();
            byte var129;
            if (arg0.field625 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field625[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field632[var51];
                class120 var133 = arg0.field629[var132];
                this.field295[var50] = this.method178(arg0, var132, var130, var133.field1826, var133.field1839, var133.field1838, var133.field1829, var56, var57);
                int var134 = arg0.field663[var51];
                class120 var135 = arg0.field629[var134];
                this.field304[var50] = this.method178(arg0, var134, (long) var62 + var130, var135.field1826, var135.field1839, var135.field1838, var135.field1829, var58, var59);
                int var136 = arg0.field615[var51];
                class120 var137 = arg0.field629[var136];
                this.field282[var50] = this.method178(arg0, var136, (long) var63 + var130, var137.field1826, var137.field1839, var137.field1838, var137.field1829, var60, var61);
            } else if (var129 == 1) {
                class90 var138 = arg0.field644[var51];
                long var139 = (long) ((var54 << 2) + (var138.field1440 > 0 ? 1024 : 2048) + (var138.field1439 + 256 << 12) + (var138.field1436 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field295[var50] = this.method178(arg0, arg0.field632[var51], var139, var138.field1440, var138.field1439, var138.field1436, 0, var56, var57);
                this.field304[var50] = this.method178(arg0, arg0.field663[var51], (long) var62 + var139, var138.field1440, var138.field1439, var138.field1436, 0, var58, var59);
                this.field282[var50] = this.method178(arg0, arg0.field615[var51], (long) var63 + var139, var138.field1440, var138.field1439, var138.field1436, 0, var60, var61);
            }
            if (arg0.field623 == null) {
                this.field284[var50] = -1;
            } else {
                this.field284[var50] = arg0.field623[var51];
            }
            if (this.field309 != null) {
                this.field309[var50] = (byte) arg0.field647[var51];
            }
            this.field286[var50] = arg0.field662[var51];
            if (arg0.field648 != null) {
                this.field312[var50] = arg0.field648[var51];
            }
            if (arg0.field622 != null) {
                this.field289[var50] = arg0.field622[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field318; var143++) {
            short var144 = this.field284[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field296 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field318; var147++) {
            short var148 = this.field284[var147];
            if (var146 != var148) {
                this.field296[var145++] = var147;
                var146 = var148;
            }
        }
        this.field296[var145] = this.field318;
        field307 = null;
        this.field325 = method203(this.field325, this.field324);
        this.field294 = method203(this.field294, this.field324);
        this.field298 = method203(this.field298, this.field324);
        this.field311 = method203(this.field311, this.field324);
        this.field300 = method216(this.field300, this.field324);
        this.field313 = method216(this.field313, this.field324);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([SI)[S", line = 3261)
    private static final short[] method203(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class343.method2374(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V", line = 3269)
    public final void method204(int arg0) {
        int var2 = class15.field204[arg0];
        int var3 = class15.field216[arg0];
        for (int var4 = 0; var4 < this.field303; var4++) {
            int var5 = this.field299[var4] * var3 - this.field305[var4] * var2 >> 16;
            this.field305[var4] = this.field305[var4] * var3 + this.field299[var4] * var2 >> 16;
            this.field299[var4] = var5;
        }
        this.field314.field552 = false;
        this.field285.field5347 = false;
    }

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "()I", line = 3288)
    public final int method205() {
        if (!this.field314.field552) {
            this.method198();
        }
        return this.field314.field557;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIII[FFIF)V", line = 3299)
    private static final void method206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
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
        field335 = var16;
        field336 = var17;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIII[FIF)V", line = 3344)
    private static final void method207(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
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
        field331 = var16;
        field333 = var17;
    }

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "()I", line = 3388)
    public final int method208() {
        return this.field292;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[IIIIZI[I)V", line = 3392)
    public final void method209(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            field334 = 0;
            field338 = 0;
            field339 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field290.length) {
                    int[] var16 = this.field290[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field319 == null || (arg6 & this.field319[var18]) != 0) {
                            field334 += this.field310[var18];
                            field338 += this.field299[var18];
                            field339 += this.field305[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                field334 = field334 / var13 + var10;
                field338 = field338 / var13 + var11;
                field339 = field339 / var13 + var12;
                field340 = true;
            } else {
                field334 = var10;
                field338 = var11;
                field339 = var12;
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
                if (var26 < this.field290.length) {
                    int[] var27 = this.field290[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field319 == null || (arg6 & this.field319[var29]) != 0) {
                            this.field310[var29] += var22;
                            this.field299[var29] += var23;
                            this.field305[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var91 = arg1[var90];
                    if (var91 < this.field290.length) {
                        int[] var92 = this.field290[var91];
                        for (int var93 = 0; var93 < var92.length; var93++) {
                            int var94 = var92[var93];
                            if (this.field319 == null || (arg6 & this.field319[var94]) != 0) {
                                this.field310[var94] -= field334;
                                this.field299[var94] -= field338;
                                this.field305[var94] -= field339;
                                if (arg4 != 0) {
                                    int var95 = class15.field204[arg4];
                                    int var96 = class15.field216[arg4];
                                    int var97 = this.field310[var94] * var96 + this.field299[var94] * var95 + 32767 >> 16;
                                    this.field299[var94] = this.field299[var94] * var96 + 32767 - this.field310[var94] * var95 >> 16;
                                    this.field310[var94] = var97;
                                }
                                if (arg2 != 0) {
                                    int var98 = class15.field204[arg2];
                                    int var99 = class15.field216[arg2];
                                    int var100 = this.field299[var94] * var99 + 32767 - this.field305[var94] * var98 >> 16;
                                    this.field305[var94] = this.field305[var94] * var99 + this.field299[var94] * var98 + 32767 >> 16;
                                    this.field299[var94] = var100;
                                }
                                if (arg3 != 0) {
                                    int var101 = class15.field204[arg3];
                                    int var102 = class15.field216[arg3];
                                    int var103 = this.field310[var94] * var102 + this.field305[var94] * var101 + 32767 >> 16;
                                    this.field305[var94] = this.field305[var94] * var102 + 32767 - this.field310[var94] * var101 >> 16;
                                    this.field310[var94] = var103;
                                }
                                this.field310[var94] += field334;
                                this.field299[var94] += field338;
                                this.field305[var94] += field339;
                            }
                        }
                    }
                }
                if (arg5 && this.field325 != null) {
                    for (int var104 = 0; var104 < var9; var104++) {
                        int var105 = arg1[var104];
                        if (var105 < this.field290.length) {
                            int[] var106 = this.field290[var105];
                            for (int var107 = 0; var107 < var106.length; var107++) {
                                int var108 = var106[var107];
                                if (this.field319 == null || (arg6 & this.field319[var108]) != 0) {
                                    int var109 = this.field301[var108];
                                    int var110 = this.field301[var108 + 1];
                                    for (int var111 = var109; var111 < var110; var111++) {
                                        int var112 = this.field293[var111] - 1;
                                        if (var112 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var113 = class15.field204[arg4];
                                            int var114 = class15.field216[arg4];
                                            int var115 = this.field325[var112] * var114 + this.field294[var112] * var113 + 32767 >> 16;
                                            this.field294[var112] = (short) (this.field294[var112] * var114 + 32767 - this.field325[var112] * var113 >> 16);
                                            this.field325[var112] = (short) var115;
                                        }
                                        if (arg2 != 0) {
                                            int var116 = class15.field204[arg2];
                                            int var117 = class15.field216[arg2];
                                            int var118 = this.field294[var112] * var117 + 32767 - this.field298[var112] * var116 >> 16;
                                            this.field298[var112] = (short) (this.field298[var112] * var117 + this.field294[var112] * var116 + 32767 >> 16);
                                            this.field294[var112] = (short) var118;
                                        }
                                        if (arg3 != 0) {
                                            int var119 = class15.field204[arg3];
                                            int var120 = class15.field216[arg3];
                                            int var121 = this.field325[var112] * var120 + this.field298[var112] * var119 + 32767 >> 16;
                                            this.field298[var112] = (short) (this.field298[var112] * var120 + 32767 - this.field325[var112] * var119 >> 16);
                                            this.field325[var112] = (short) var121;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field320 != null) {
                        this.field320.field5347 = false;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (field340) {
                    int var36 = arg7[6] * field339 + arg7[0] * field334 + arg7[3] * field338 + 16384 >> 15;
                    int var37 = arg7[7] * field339 + arg7[1] * field334 + arg7[4] * field338 + 16384 >> 15;
                    int var38 = arg7[8] * field339 + arg7[2] * field334 + arg7[5] * field338 + 16384 >> 15;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    field334 = var39;
                    field338 = var40;
                    field339 = var41;
                    field340 = false;
                }
                int[] var42 = new int[9];
                int var43 = class15.field216[arg2] >> 1;
                int var44 = class15.field204[arg2] >> 1;
                int var45 = class15.field216[arg3] >> 1;
                int var46 = class15.field204[arg3] >> 1;
                int var47 = class15.field216[arg4] >> 1;
                int var48 = class15.field204[arg4] >> 1;
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
                int var51 = var42[2] * -field339 + var42[0] * -field334 + var42[1] * -field338 + 16384 >> 15;
                int var52 = var42[5] * -field339 + var42[3] * -field334 + var42[4] * -field338 + 16384 >> 15;
                int var53 = var42[8] * -field339 + var42[6] * -field334 + var42[7] * -field338 + 16384 >> 15;
                int var54 = field334 + var51;
                int var55 = field338 + var52;
                int var56 = field339 + var53;
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
                    if (var80 < this.field290.length) {
                        int[] var81 = this.field290[var80];
                        for (int var82 = 0; var82 < var81.length; var82++) {
                            int var83 = var81[var82];
                            if (this.field319 == null || (arg6 & this.field319[var83]) != 0) {
                                int var84 = this.field305[var83] * var68[2] + this.field310[var83] * var68[0] + this.field299[var83] * var68[1] + 16384 >> 15;
                                int var85 = this.field305[var83] * var68[5] + this.field310[var83] * var68[3] + this.field299[var83] * var68[4] + 16384 >> 15;
                                int var86 = this.field305[var83] * var68[8] + this.field310[var83] * var68[6] + this.field299[var83] * var68[7] + 16384 >> 15;
                                int var87 = var76 + var84;
                                int var88 = var77 + var85;
                                int var89 = var78 + var86;
                                this.field310[var83] = var87;
                                this.field299[var83] = var88;
                                this.field305[var83] = var89;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field290.length) {
                        int[] var174 = this.field290[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field319 == null || (arg6 & this.field319[var176]) != 0) {
                                this.field310[var176] -= field334;
                                this.field299[var176] -= field338;
                                this.field305[var176] -= field339;
                                this.field310[var176] = this.field310[var176] * arg2 >> 7;
                                this.field299[var176] = this.field299[var176] * arg3 >> 7;
                                this.field305[var176] = this.field305[var176] * arg4 >> 7;
                                this.field310[var176] += field334;
                                this.field299[var176] += field338;
                                this.field305[var176] += field339;
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
                if (field340) {
                    int var128 = arg7[6] * field339 + arg7[0] * field334 + arg7[3] * field338 + 16384 >> 15;
                    int var129 = arg7[7] * field339 + arg7[1] * field334 + arg7[4] * field338 + 16384 >> 15;
                    int var130 = arg7[8] * field339 + arg7[2] * field334 + arg7[5] * field338 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    field334 = var131;
                    field338 = var132;
                    field339 = var133;
                    field340 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -field334 * var134 + 16384 >> 15;
                int var138 = -field338 * var135 + 16384 >> 15;
                int var139 = -field339 * var136 + 16384 >> 15;
                int var140 = field334 + var137;
                int var141 = field338 + var138;
                int var142 = field339 + var139;
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
                    if (var162 < this.field290.length) {
                        int[] var163 = this.field290[var162];
                        for (int var164 = 0; var164 < var163.length; var164++) {
                            int var165 = var163[var164];
                            if (this.field319 == null || (arg6 & this.field319[var165]) != 0) {
                                int var166 = this.field305[var165] * var150[2] + this.field310[var165] * var150[0] + this.field299[var165] * var150[1] + 16384 >> 15;
                                int var167 = this.field305[var165] * var150[5] + this.field310[var165] * var150[3] + this.field299[var165] * var150[4] + 16384 >> 15;
                                int var168 = this.field305[var165] * var150[8] + this.field310[var165] * var150[6] + this.field299[var165] * var150[7] + 16384 >> 15;
                                int var169 = var158 + var166;
                                int var170 = var159 + var167;
                                int var171 = var160 + var168;
                                this.field310[var165] = var169;
                                this.field299[var165] = var170;
                                this.field305[var165] = var171;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field281 != null && this.field312 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var178 = arg1[var177];
                    if (var178 < this.field281.length) {
                        int[] var179 = this.field281[var178];
                        for (int var180 = 0; var180 < var179.length; var180++) {
                            int var181 = var179[var180];
                            if (this.field289 == null || (arg6 & this.field289[var181]) != 0) {
                                int var182 = (this.field312[var181] & 0xFF) + arg2 * 8;
                                if (var182 < 0) {
                                    var182 = 0;
                                } else if (var182 > 255) {
                                    var182 = 255;
                                }
                                this.field312[var181] = (byte) var182;
                            }
                        }
                        if (var179.length > 0) {
                            this.field287.field5347 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field281 != null) {
            for (int var183 = 0; var183 < var9; var183++) {
                int var184 = arg1[var183];
                if (var184 < this.field281.length) {
                    int[] var185 = this.field281[var184];
                    for (int var186 = 0; var186 < var185.length; var186++) {
                        int var187 = var185[var186];
                        if (this.field289 == null || (arg6 & this.field289[var187]) != 0) {
                            int var188 = this.field286[var187] & 0xFFFF;
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
                            this.field286[var187] = (short) (var192 << 10 | var193 << 7 | var194);
                        }
                    }
                    if (var185.length > 0) {
                        this.field287.field5347 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(III)V", line = 4184)
    public final void method210(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field303; var4++) {
            this.field310[var4] = this.field310[var4] * arg0 >> 7;
            this.field299[var4] = this.field299[var4] * arg1 >> 7;
            this.field305[var4] = this.field305[var4] * arg2 >> 7;
        }
        this.field314.field552 = false;
        this.field285.field5347 = false;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(ZZZ)Lwi;", line = 4203)
    public final class221 method211(boolean arg0, boolean arg1, boolean arg2) {
        return this.method186(arg0, arg1, arg2, field330, field329);
    }

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "(I)V", line = 4206)
    public final void method212(int arg0) {
        this.field292 = (short) arg0;
        if (this.field320 != null) {
            this.field320.field5347 = false;
        }
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "()V", line = 4214)
    public final void method213() {
        for (int var1 = 0; var1 < this.field303; var1++) {
            this.field310[var1] = -this.field310[var1];
            this.field305[var1] = -this.field305[var1];
        }
        this.field314.field552 = false;
        this.field285.field5347 = false;
    }

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "()I", line = 4226)
    public final int method214() {
        return this.field288;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 4229)
    private static final void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
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
        field337 = var18;
        field342 = var19;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([FI)[F", line = 4311)
    private static final float[] method216(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class343.method2375(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)V", line = 4320)
    public final void method217(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field334 = 0;
            field338 = 0;
            field339 = 0;
            for (int var6 = 0; var6 < this.field303; var6++) {
                field334 += this.field310[var6];
                field338 += this.field299[var6];
                field339 += this.field305[var6];
                var5++;
            }
            if (var5 > 0) {
                field334 = field334 / var5 + arg1;
                field338 = field338 / var5 + arg2;
                field339 = field339 / var5 + arg3;
            } else {
                field334 = arg1;
                field338 = arg2;
                field339 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field303; var7++) {
                this.field310[var7] += arg1;
                this.field299[var7] += arg2;
                this.field305[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field303; var8++) {
                this.field310[var8] -= field334;
                this.field299[var8] -= field338;
                this.field305[var8] -= field339;
                if (arg3 != 0) {
                    int var9 = class15.field204[arg3];
                    int var10 = class15.field216[arg3];
                    int var11 = this.field310[var8] * var10 + this.field299[var8] * var9 + 32767 >> 16;
                    this.field299[var8] = this.field299[var8] * var10 + 32767 - this.field310[var8] * var9 >> 16;
                    this.field310[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class15.field204[arg1];
                    int var13 = class15.field216[arg1];
                    int var14 = this.field299[var8] * var13 + 32767 - this.field305[var8] * var12 >> 16;
                    this.field305[var8] = this.field305[var8] * var13 + this.field299[var8] * var12 + 32767 >> 16;
                    this.field299[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class15.field204[arg2];
                    int var16 = class15.field216[arg2];
                    int var17 = this.field310[var8] * var16 + this.field305[var8] * var15 + 32767 >> 16;
                    this.field305[var8] = this.field305[var8] * var16 + 32767 - this.field310[var8] * var15 >> 16;
                    this.field310[var8] = var17;
                }
                this.field310[var8] += field334;
                this.field299[var8] += field338;
                this.field305[var8] += field339;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field303; var18++) {
                this.field310[var18] -= field334;
                this.field299[var18] -= field338;
                this.field305[var18] -= field339;
                this.field310[var18] = this.field310[var18] * arg1 / 128;
                this.field299[var18] = this.field299[var18] * arg2 / 128;
                this.field305[var18] = this.field305[var18] * arg3 / 128;
                this.field310[var18] += field334;
                this.field299[var18] += field338;
                this.field305[var18] += field339;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field318; var19++) {
                int var20 = (this.field312[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field312[var19] = (byte) var20;
            }
            this.field287.field5347 = false;
        } else if (arg0 == 7) {
            for (int var21 = 0; var21 < this.field318; var21++) {
                int var22 = this.field286[var21] & 0xFFFF;
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
                this.field286[var21] = (short) (var26 << 10 | var27 << 7 | var28);
            }
            this.field287.field5347 = false;
        }
    }
}
