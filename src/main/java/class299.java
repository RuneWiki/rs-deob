import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class299 extends class19 {

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "B")
    private byte field5316 = 0;

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "B")
    private byte field5312 = 0;

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
    private int field5320 = 0;

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "I")
    private int field5321 = 0;

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "I")
    public int field5323 = 0;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "Z")
    public boolean field5301 = false;

    @OriginalMember(owner = "client!eg", name = "I", descriptor = "[I")
    private int[] field5315;

    @OriginalMember(owner = "client!eg", name = "L", descriptor = "[I")
    public int[] field5317;

    @OriginalMember(owner = "client!eg", name = "Y", descriptor = "[I")
    public int[] field5330;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "[I")
    public int[] field5299;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "[I")
    private int[] field5304;

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "[S")
    private short[] field5318;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "[S")
    private short[] field5319;

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "[S")
    private short[] field5313;

    @OriginalMember(owner = "client!eg", name = "X", descriptor = "[S")
    private short[] field5329;

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "[S")
    private short[] field5307;

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "[F")
    private float[] field5326;

    @OriginalMember(owner = "client!eg", name = "V", descriptor = "[F")
    private float[] field5327;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "[S")
    private short[] field5300;

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "[B")
    private byte[] field5324;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "[S")
    private short[] field5303;

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "[S")
    private short[] field5305;

    @OriginalMember(owner = "client!eg", name = "Z", descriptor = "[S")
    private short[] field5331;

    @OriginalMember(owner = "client!eg", name = "E", descriptor = "[S")
    private short[] field5311;

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "[B")
    private byte[] field5314;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "[S")
    private short[] field5297;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "Lmf;")
    public class47 field5302;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "Lla;")
    public class137 field5295;

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "Lla;")
    private class137 field5322;

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "Lla;")
    private class137 field5309;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "Lla;")
    private class137 field5306;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "Lla;")
    private class137 field5292;

    @OriginalMember(owner = "client!eg", name = "ab", descriptor = "S")
    private short field5332;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "S")
    private short field5293;

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "[S")
    private short[] field5308;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "[I")
    private int[] field5298;

    @OriginalMember(owner = "client!eg", name = "W", descriptor = "Lvh;")
    private static class53 field5328 = new class53(10000);

    @OriginalMember(owner = "client!eg", name = "db", descriptor = "Leg;")
    private static class299 field5335 = new class299();

    @OriginalMember(owner = "client!eg", name = "eb", descriptor = "Leg;")
    private static class299 field5336 = new class299();

    @OriginalMember(owner = "client!eg", name = "fb", descriptor = "Leg;")
    private static class299 field5337 = new class299();

    @OriginalMember(owner = "client!eg", name = "gb", descriptor = "Leg;")
    private static class299 field5338 = new class299();

    @OriginalMember(owner = "client!eg", name = "hb", descriptor = "Leg;")
    private static class299 field5339 = new class299();

    @OriginalMember(owner = "client!eg", name = "ib", descriptor = "Leg;")
    private static class299 field5340 = new class299();

    @OriginalMember(owner = "client!eg", name = "ob", descriptor = "[I")
    private static int[] field5346 = new int[1];

    @OriginalMember(owner = "client!eg", name = "tb", descriptor = "Z")
    private static boolean field5351 = false;

    @OriginalMember(owner = "client!eg", name = "jb", descriptor = "[I")
    private static int[] field5341 = new int[1];

    @OriginalMember(owner = "client!eg", name = "mb", descriptor = "F")
    private static float field5344;

    @OriginalMember(owner = "client!eg", name = "nb", descriptor = "F")
    private static float field5345;

    @OriginalMember(owner = "client!eg", name = "qb", descriptor = "F")
    private static float field5348;

    @OriginalMember(owner = "client!eg", name = "rb", descriptor = "F")
    private static float field5349;

    @OriginalMember(owner = "client!eg", name = "sb", descriptor = "F")
    private static float field5350;

    @OriginalMember(owner = "client!eg", name = "ub", descriptor = "F")
    private static float field5352;

    @OriginalMember(owner = "client!eg", name = "kb", descriptor = "I")
    private static int field5342;

    @OriginalMember(owner = "client!eg", name = "lb", descriptor = "I")
    private static int field5343;

    @OriginalMember(owner = "client!eg", name = "pb", descriptor = "I")
    private static int field5347;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "Lmk;")
    private class288 field5296;

    @OriginalMember(owner = "client!eg", name = "bb", descriptor = "Lib;")
    private class95 field5333;

    @OriginalMember(owner = "client!eg", name = "cb", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field5334;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "[J")
    private static long[] field5294;

    @OriginalMember(owner = "client!eg", name = "D", descriptor = "[[I")
    private int[][] field5310;

    @OriginalMember(owner = "client!eg", name = "T", descriptor = "[[I")
    private int[][] field5325;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZZZZZ)V", line = 6)
    private final void method2105(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field5295.field2472 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field5322.field2472 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field5309.field2472 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field5306.field2472 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field5328.field1168.length < this.field5320 * var6) {
            field5328 = new class53((this.field5320 + 100) * var6);
        } else {
            field5328.field1142 = 0;
        }
        if (arg1) {
            if (class97.field1808) {
                for (int var7 = 0; var7 < this.field5323; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field5317[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field5330[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field5299[var7]);
                    int var11 = this.field5315[var7];
                    int var12 = this.field5315[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field5308[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field5328.field1142 = var6 * var14;
                        field5328.method444((byte) 46, var8);
                        field5328.method444((byte) 46, var9);
                        field5328.method444((byte) 46, var10);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field5323; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field5317[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field5330[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field5299[var15]);
                    int var19 = this.field5315[var15];
                    int var20 = this.field5315[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field5308[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field5328.field1142 = var6 * var22;
                        field5328.method484((byte) -102, var16);
                        field5328.method484((byte) -63, var17);
                        field5328.method484((byte) -57, var18);
                    }
                }
            }
        }
        if (arg2) {
            if (class126.field2340) {
                for (int var42 = 0; var42 < this.field5321; var42++) {
                    int var43 = method2130(this.field5300[var42], this.field5311[var42], this.field5332, this.field5324[var42]);
                    field5328.field1142 = this.field5303[var42] * var6 + this.field5322.field2472;
                    field5328.method444((byte) 46, var43);
                    field5328.field1142 = this.field5305[var42] * var6 + this.field5322.field2472;
                    field5328.method444((byte) 46, var43);
                    field5328.field1142 = this.field5331[var42] * var6 + this.field5322.field2472;
                    field5328.method444((byte) 46, var43);
                }
            } else {
                int var23 = (int) class219.field3880[0];
                int var24 = (int) class219.field3880[1];
                int var25 = (int) class219.field3880[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field5332 * 1.3F);
                int var28 = this.field5293 * var26 >> 8;
                for (int var29 = 0; var29 < this.field5321; var29++) {
                    short var30 = this.field5303[var29];
                    short var31 = this.field5307[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field5329[var30] * var25 + this.field5319[var30] * var23 + this.field5313[var30] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field5329[var30] * var25 + this.field5319[var30] * var23 + this.field5313[var30] * var24) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field5307[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field5305[var29];
                    short var34 = this.field5307[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field5329[var33] * var25 + this.field5319[var33] * var23 + this.field5313[var33] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field5329[var33] * var25 + this.field5319[var33] * var23 + this.field5313[var33] * var24) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field5307[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field5331[var29];
                    short var37 = this.field5307[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field5329[var36] * var25 + this.field5319[var36] * var23 + this.field5313[var36] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field5329[var36] * var25 + this.field5319[var36] * var23 + this.field5313[var36] * var24) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field5307[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method2130(this.field5300[var29], this.field5311[var29], var32, this.field5324[var29]);
                    int var40 = method2130(this.field5300[var29], this.field5311[var29], var35, this.field5324[var29]);
                    int var41 = method2130(this.field5300[var29], this.field5311[var29], var38, this.field5324[var29]);
                    field5328.field1142 = var6 * var30 + this.field5322.field2472;
                    field5328.method444((byte) 46, var39);
                    field5328.field1142 = var6 * var33 + this.field5322.field2472;
                    field5328.method444((byte) 46, var40);
                    field5328.field1142 = var6 * var36 + this.field5322.field2472;
                    field5328.method444((byte) 46, var41);
                }
                this.field5319 = null;
                this.field5313 = null;
                this.field5329 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field5293;
            float var45 = 3.0F / (float) (this.field5293 / 2 + this.field5293);
            field5328.field1142 = this.field5309.field2472;
            if (class97.field1808) {
                for (int var46 = 0; var46 < this.field5320; var46++) {
                    short var47 = this.field5307[var46];
                    if (var47 == 0) {
                        field5328.method451((byte) 58, (float) this.field5319[var46] * var45);
                        field5328.method451((byte) -123, (float) this.field5313[var46] * var45);
                        field5328.method451((byte) 54, (float) this.field5329[var46] * var45);
                    } else {
                        float var48 = var44 / (float) var47;
                        field5328.method451((byte) 62, (float) this.field5319[var46] * var48);
                        field5328.method451((byte) -109, (float) this.field5313[var46] * var48);
                        field5328.method451((byte) -123, (float) this.field5329[var46] * var48);
                    }
                    field5328.field1142 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field5320; var49++) {
                    short var50 = this.field5307[var49];
                    if (var50 == 0) {
                        field5328.method459(false, (float) this.field5319[var49] * var45);
                        field5328.method459(false, (float) this.field5313[var49] * var45);
                        field5328.method459(false, (float) this.field5329[var49] * var45);
                    } else {
                        float var51 = var44 / (float) var50;
                        field5328.method459(false, (float) this.field5319[var49] * var51);
                        field5328.method459(false, (float) this.field5313[var49] * var51);
                        field5328.method459(false, (float) this.field5329[var49] * var51);
                    }
                    field5328.field1142 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field5328.field1142 = this.field5306.field2472;
            if (class97.field1808) {
                for (int var52 = 0; var52 < this.field5320; var52++) {
                    field5328.method451((byte) 96, this.field5326[var52]);
                    field5328.method451((byte) 93, this.field5327[var52]);
                    field5328.field1142 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field5320; var53++) {
                    field5328.method459(false, this.field5326[var53]);
                    field5328.method459(false, this.field5327[var53]);
                    field5328.field1142 += var6 - 8;
                }
            }
        }
        field5328.field1142 = this.field5320 * var6;
        if (arg0) {
            if (class97.field1806) {
                ByteBuffer var54 = ByteBuffer.wrap(field5328.field1168, 0, field5328.field1142);
                if (this.field5296 == null) {
                    this.field5296 = new class288(true);
                    this.field5296.method2055(var54);
                } else {
                    this.field5296.method2057(var54);
                }
                if (arg1) {
                    this.field5295.field2475 = true;
                    this.field5295.field2473 = null;
                    this.field5295.field2470 = this.field5296;
                    this.field5295.field2474 = var6;
                }
                if (arg2) {
                    this.field5322.field2475 = true;
                    this.field5322.field2473 = null;
                    this.field5322.field2470 = this.field5296;
                    this.field5322.field2474 = var6;
                }
                if (arg3) {
                    this.field5309.field2475 = true;
                    this.field5309.field2473 = null;
                    this.field5309.field2470 = this.field5296;
                    this.field5309.field2474 = var6;
                }
                if (arg4) {
                    this.field5306.field2475 = true;
                    this.field5306.field2473 = null;
                    this.field5306.field2470 = this.field5296;
                    this.field5306.field2474 = var6;
                }
            } else {
                if (field5334 == null || field5334.capacity() < field5328.field1142) {
                    field5334 = ByteBuffer.allocateDirect(var6 * 100 + field5328.field1142);
                } else {
                    field5334.clear();
                }
                field5334.put(field5328.field1168, 0, field5328.field1142);
                field5334.flip();
                if (arg1) {
                    this.field5295.field2475 = true;
                    this.field5295.field2473 = field5334;
                    this.field5295.field2470 = null;
                    this.field5295.field2474 = var6;
                }
                if (arg2) {
                    this.field5322.field2475 = true;
                    this.field5322.field2473 = field5334;
                    this.field5295.field2470 = null;
                    this.field5322.field2474 = var6;
                }
                if (arg3) {
                    this.field5309.field2475 = true;
                    this.field5309.field2473 = field5334;
                    this.field5309.field2470 = null;
                    this.field5309.field2474 = var6;
                }
                if (arg4) {
                    this.field5306.field2475 = true;
                    this.field5306.field2473 = field5334;
                    this.field5306.field2470 = null;
                    this.field5306.field2474 = var6;
                }
            }
        } else if (class97.field1814) {
            class288 var55 = new class288();
            ByteBuffer var56 = ByteBuffer.wrap(field5328.field1168, 0, field5328.field1142);
            var55.method2055(var56);
            if (arg1) {
                this.field5295.field2475 = true;
                this.field5295.field2473 = null;
                this.field5295.field2470 = var55;
                this.field5295.field2474 = var6;
            }
            if (arg2) {
                this.field5322.field2475 = true;
                this.field5322.field2473 = null;
                this.field5322.field2470 = var55;
                this.field5322.field2474 = var6;
            }
            if (arg3) {
                this.field5309.field2475 = true;
                this.field5309.field2473 = null;
                this.field5309.field2470 = var55;
                this.field5309.field2474 = var6;
            }
            if (arg4) {
                this.field5306.field2475 = true;
                this.field5306.field2473 = null;
                this.field5306.field2470 = var55;
                this.field5306.field2474 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field5328.field1142);
            var57.put(field5328.field1168, 0, field5328.field1142);
            var57.flip();
            if (arg1) {
                this.field5295.field2475 = true;
                this.field5295.field2473 = var57;
                this.field5295.field2470 = null;
                this.field5295.field2474 = var6;
            }
            if (arg2) {
                this.field5322.field2475 = true;
                this.field5322.field2473 = var57;
                this.field5295.field2470 = null;
                this.field5322.field2474 = var6;
            }
            if (arg3) {
                this.field5309.field2475 = true;
                this.field5309.field2473 = var57;
                this.field5309.field2470 = null;
                this.field5309.field2474 = var6;
            }
            if (arg4) {
                this.field5306.field2475 = true;
                this.field5306.field2473 = var57;
                this.field5306.field2470 = null;
                this.field5306.field2474 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "()I", line = 540)
    public final int method162() {
        if (!this.field5302.field967) {
            this.method2123();
        }
        return this.field5302.field964;
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "()I", line = 549)
    public final int method160() {
        if (!this.field5302.field967) {
            this.method2123();
        }
        return this.field5302.field969;
    }

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "()I", line = 556)
    public final int method2106() {
        return this.field5293;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIIIIJILlb;)V", line = 559)
    public final void method186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class208 arg10) {
        if (this.field5320 == 0) {
            return;
        }
        if (!this.field5302.field967) {
            this.method2123();
        }
        short var13 = this.field5302.field964;
        short var14 = this.field5302.field968;
        short var15 = this.field5302.field965;
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
        if (var21 / var18 <= class12.field383) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class141.field2568) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class222.field3936) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class16.field518) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class27.field654[arg0];
            var27 = class27.field642[arg0];
        }
        if (arg8 > 0L && class271.field4830 && var19 > 0) {
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
            if (class309.field5480 >= var28 && class309.field5480 <= var29 && class244.field4333 >= var30 && class244.field4333 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field5302.field966;
                short var37 = this.field5302.field969;
                short var38 = this.field5302.field963;
                short var39 = this.field5302.field962;
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
                if (class309.field5480 >= var32 && class309.field5480 <= var33 && class244.field4333 >= var34 && class244.field4333 <= var35) {
                    if (this.field566) {
                        class161.field2913[class130.field2377++] = arg8;
                    } else {
                        if (field5341.length < this.field5320) {
                            field5341 = new int[this.field5320];
                            field5346 = new int[this.field5320];
                        }
                        int var59 = 0;
                        label118: while (true) {
                            if (var59 >= this.field5323) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field5321) {
                                        break label118;
                                    }
                                    short var80 = this.field5303[var79];
                                    short var81 = this.field5305[var79];
                                    short var82 = this.field5331[var79];
                                    if (this.method2131(class309.field5480, class244.field4333, field5346[var80], field5346[var81], field5346[var82], field5341[var80], field5341[var81], field5341[var82])) {
                                        class161.field2913[class130.field2377++] = arg8;
                                        break label118;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field5317[var59];
                            int var61 = this.field5330[var59];
                            int var62 = this.field5299[var59];
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
                            int var75 = this.field5315[var59];
                            int var76 = this.field5315[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field5308[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field5341[var78] = var73;
                                field5346[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class97.field1801;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method2128();
        var83.glRotatef((float) (-arg0) * 0.17578125F, 0.0F, 1.0F, 0.0F);
        var83.glTranslatef((float) (-arg5), (float) (-arg6), (float) (-arg7));
        var83.glPopMatrix();
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(SS)V", line = 835)
    public final void method2107(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field5321; var3++) {
            if (this.field5300[var3] == arg0) {
                this.field5300[var3] = arg1;
            }
        }
        this.field5322.field2475 = false;
    }

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "()I", line = 847)
    public final int method175() {
        if (!this.field5302.field967) {
            this.method2123();
        }
        return this.field5302.field962;
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V", line = 853)
    public final void method2108(int arg0) {
        if (this.field5319 == null) {
            this.method182(arg0);
            return;
        }
        int var2 = class27.field654[arg0];
        int var3 = class27.field642[arg0];
        for (int var4 = 0; var4 < this.field5323; var4++) {
            int var5 = this.field5317[var4] * var3 + this.field5299[var4] * var2 >> 16;
            this.field5299[var4] = this.field5299[var4] * var3 - this.field5317[var4] * var2 >> 16;
            this.field5317[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field5320; var6++) {
            int var7 = this.field5329[var6] * var2 + this.field5319[var6] * var3 >> 16;
            this.field5329[var6] = (short) (this.field5329[var6] * var3 - this.field5319[var6] * var2 >> 16);
            this.field5319[var6] = (short) var7;
        }
        this.field5302.field967 = false;
        this.field5295.field2475 = false;
        if (this.field5309 != null) {
            this.field5309.field2475 = false;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V", line = 895)
    public final void method181(int arg0) {
        int var2 = class27.field654[arg0];
        int var3 = class27.field642[arg0];
        for (int var4 = 0; var4 < this.field5323; var4++) {
            int var5 = this.field5330[var4] * var3 - this.field5299[var4] * var2 >> 16;
            this.field5299[var4] = this.field5330[var4] * var2 + this.field5299[var4] * var3 >> 16;
            this.field5330[var4] = var5;
        }
        this.field5302.field967 = false;
        this.field5295.field2475 = false;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZZZ)Lga;", line = 914)
    public final class19 method159(boolean arg0, boolean arg1, boolean arg2) {
        return this.method2122(arg0, arg1, arg2, field5336, field5335);
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "()I", line = 917)
    public final int method184() {
        if (!this.field5302.field967) {
            this.method2123();
        }
        return this.field5302.field968;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I[IIIIZ)V", line = 924)
    public final void method171(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field5342 = 0;
            field5347 = 0;
            field5343 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field5325.length) {
                    int[] var14 = this.field5325[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field5342 += this.field5317[var16];
                        field5347 += this.field5330[var16];
                        field5343 += this.field5299[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field5342 = field5342 / var11 + var8;
                field5347 = field5347 / var11 + var9;
                field5343 = field5343 / var11 + var10;
            } else {
                field5342 = var8;
                field5347 = var9;
                field5343 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field5325.length) {
                    int[] var22 = this.field5325[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field5317[var24] += var17;
                        this.field5330[var24] += var18;
                        this.field5299[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field5325.length) {
                    int[] var27 = this.field5325[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field5317[var29] -= field5342;
                        this.field5330[var29] -= field5347;
                        this.field5299[var29] -= field5343;
                        if (arg4 != 0) {
                            int var30 = class27.field654[arg4];
                            int var31 = class27.field642[arg4];
                            int var32 = this.field5330[var29] * var30 + this.field5317[var29] * var31 + 32767 >> 16;
                            this.field5330[var29] = this.field5330[var29] * var31 + 32767 - this.field5317[var29] * var30 >> 16;
                            this.field5317[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class27.field654[arg2];
                            int var34 = class27.field642[arg2];
                            int var35 = this.field5330[var29] * var34 + 32767 - this.field5299[var29] * var33 >> 16;
                            this.field5299[var29] = this.field5330[var29] * var33 + this.field5299[var29] * var34 + 32767 >> 16;
                            this.field5330[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class27.field654[arg3];
                            int var37 = class27.field642[arg3];
                            int var38 = this.field5317[var29] * var37 + this.field5299[var29] * var36 + 32767 >> 16;
                            this.field5299[var29] = this.field5299[var29] * var37 + 32767 - this.field5317[var29] * var36 >> 16;
                            this.field5317[var29] = var38;
                        }
                        this.field5317[var29] += field5342;
                        this.field5330[var29] += field5347;
                        this.field5299[var29] += field5343;
                    }
                }
            }
            if (arg5 && this.field5319 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field5325.length) {
                        int[] var41 = this.field5325[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field5315[var43];
                            int var45 = this.field5315[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field5308[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class27.field654[arg4];
                                    int var49 = class27.field642[arg4];
                                    int var50 = this.field5319[var47] * var49 + this.field5313[var47] * var48 + 32767 >> 16;
                                    this.field5313[var47] = (short) (this.field5313[var47] * var49 + 32767 - this.field5319[var47] * var48 >> 16);
                                    this.field5319[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class27.field654[arg2];
                                    int var52 = class27.field642[arg2];
                                    int var53 = this.field5313[var47] * var52 + 32767 - this.field5329[var47] * var51 >> 16;
                                    this.field5329[var47] = (short) (this.field5329[var47] * var52 + this.field5313[var47] * var51 + 32767 >> 16);
                                    this.field5313[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class27.field654[arg3];
                                    int var55 = class27.field642[arg3];
                                    int var56 = this.field5329[var47] * var54 + this.field5319[var47] * var55 + 32767 >> 16;
                                    this.field5329[var47] = (short) (this.field5329[var47] * var55 + 32767 - this.field5319[var47] * var54 >> 16);
                                    this.field5319[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field5309 != null) {
                    this.field5309.field2475 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field5325.length) {
                    int[] var59 = this.field5325[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field5317[var61] -= field5342;
                        this.field5330[var61] -= field5347;
                        this.field5299[var61] -= field5343;
                        this.field5317[var61] = this.field5317[var61] * arg2 >> 7;
                        this.field5330[var61] = this.field5330[var61] * arg3 >> 7;
                        this.field5299[var61] = this.field5299[var61] * arg4 >> 7;
                        this.field5317[var61] += field5342;
                        this.field5330[var61] += field5347;
                        this.field5299[var61] += field5343;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5310 != null && this.field5324 != null) {
                for (int var62 = 0; var62 < var7; var62++) {
                    int var63 = arg1[var62];
                    if (var63 < this.field5310.length) {
                        int[] var64 = this.field5310[var63];
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            int var66 = var64[var65];
                            int var67 = (this.field5324[var66] & 0xFF) + arg2 * 8;
                            if (var67 < 0) {
                                var67 = 0;
                            } else if (var67 > 255) {
                                var67 = 255;
                            }
                            this.field5324[var66] = (byte) var67;
                        }
                        if (var64.length > 0) {
                            this.field5322.field2475 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field5310 != null) {
            for (int var68 = 0; var68 < var7; var68++) {
                int var69 = arg1[var68];
                if (var69 < this.field5310.length) {
                    int[] var70 = this.field5310[var69];
                    for (int var71 = 0; var71 < var70.length; var71++) {
                        int var72 = var70[var71];
                        int var73 = this.field5300[var72] & 0xFFFF;
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
                        this.field5300[var72] = (short) (var77 << 10 | var78 << 7 | var79);
                    }
                    if (var70.length > 0) {
                        this.field5322.field2475 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "()I", line = 1331)
    public final int method173() {
        if (!this.field5302.field967) {
            this.method2123();
        }
        return this.field5302.field963;
    }

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "()V", line = 1339)
    public final void method169() {
        for (int var1 = 0; var1 < this.field5323; var1++) {
            this.field5317[var1] = -this.field5317[var1];
            this.field5299[var1] = -this.field5299[var1];
        }
        this.field5302.field967 = false;
        this.field5295.field2475 = false;
    }

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "()V", line = 1352)
    public static final void method2109() {
        field5335 = new class299();
        field5336 = new class299();
        field5337 = new class299();
        field5338 = new class299();
        field5339 = new class299();
        field5340 = new class299();
    }

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "()V", line = 1360)
    public final void method2110() {
        if (this.field5319 == null) {
            this.method183();
            return;
        }
        for (int var1 = 0; var1 < this.field5323; var1++) {
            int var2 = this.field5317[var1];
            this.field5317[var1] = this.field5299[var1];
            this.field5299[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field5320; var3++) {
            short var4 = this.field5319[var3];
            this.field5319[var3] = this.field5329[var3];
            this.field5329[var3] = (short) (-var4);
        }
        this.field5302.field967 = false;
        this.field5295.field2475 = false;
        if (this.field5309 != null) {
            this.field5309.field2475 = false;
        }
    }

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "()I", line = 1399)
    public final int method2111() {
        return this.field5332;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZZZZZZZZZZZ)Leg;", line = 1403)
    public final class299 method2112(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class299 var12 = new class299();
        var12.field5323 = this.field5323;
        var12.field5320 = this.field5320;
        var12.field5321 = this.field5321;
        if (arg0) {
            var12.field5317 = this.field5317;
            var12.field5299 = this.field5299;
        } else {
            var12.field5317 = class3.method20(-98, this.field5317);
            var12.field5299 = class3.method20(-123, this.field5299);
        }
        if (arg1) {
            var12.field5330 = this.field5330;
        } else {
            var12.field5330 = class3.method20(-126, this.field5330);
        }
        if (arg0 && arg1) {
            var12.field5295 = this.field5295;
            var12.field5302 = this.field5302;
        } else {
            var12.field5295 = new class137();
            var12.field5302 = new class47();
        }
        if (arg2) {
            var12.field5300 = this.field5300;
        } else {
            var12.field5300 = class79.method659(this.field5300, -86);
        }
        if (arg3) {
            var12.field5324 = this.field5324;
        } else {
            var12.field5324 = class38.method346((byte) -89, this.field5324);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class126.field2340) {
            var12.field5322 = new class137();
        } else {
            var12.field5322 = this.field5322;
        }
        if (arg5) {
            var12.field5319 = this.field5319;
            var12.field5313 = this.field5313;
            var12.field5329 = this.field5329;
            var12.field5307 = this.field5307;
        } else {
            var12.field5319 = class79.method659(this.field5319, -118);
            var12.field5313 = class79.method659(this.field5313, -126);
            var12.field5329 = class79.method659(this.field5329, -68);
            var12.field5307 = class79.method659(this.field5307, -38);
        }
        if (!class126.field2340) {
            var12.field5309 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field5309 = this.field5309;
        } else {
            var12.field5309 = new class137();
        }
        if (arg8) {
            var12.field5326 = this.field5326;
            var12.field5327 = this.field5327;
            var12.field5306 = this.field5306;
        } else {
            var12.field5326 = class84.method726(this.field5326, -125);
            var12.field5327 = class84.method726(this.field5327, -126);
            var12.field5306 = new class137();
        }
        if (arg9) {
            var12.field5303 = this.field5303;
            var12.field5305 = this.field5305;
            var12.field5331 = this.field5331;
            var12.field5292 = this.field5292;
        } else {
            var12.field5303 = class79.method659(this.field5303, -54);
            var12.field5305 = class79.method659(this.field5305, -119);
            var12.field5331 = class79.method659(this.field5331, -89);
            var12.field5292 = new class137();
        }
        if (arg10) {
            var12.field5311 = this.field5311;
        } else {
            var12.field5311 = class79.method659(this.field5311, -103);
        }
        var12.field5304 = this.field5304;
        var12.field5325 = this.field5325;
        var12.field5314 = this.field5314;
        var12.field5310 = this.field5310;
        var12.field5298 = this.field5298;
        var12.field5308 = this.field5308;
        var12.field5315 = this.field5315;
        var12.field5332 = this.field5332;
        var12.field5293 = this.field5293;
        var12.field5318 = this.field5318;
        var12.field5297 = this.field5297;
        return var12;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljj;IJIIIIFF)S", line = 1541)
    private final short method2113(class148 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field5315[arg1];
        int var12 = this.field5315[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field5308[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field5294[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field5308[var13] = (short) (this.field5320 + 1);
        field5294[var13] = arg2;
        this.field5319[this.field5320] = (short) arg3;
        this.field5313[this.field5320] = (short) arg4;
        this.field5329[this.field5320] = (short) arg5;
        this.field5307[this.field5320] = (short) arg6;
        this.field5326[this.field5320] = arg7;
        this.field5327[this.field5320] = arg8;
        return (short) (this.field5320++);
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(ZZZ)Lga;", line = 1577)
    public final class19 method176(boolean arg0, boolean arg1, boolean arg2) {
        return this.method2122(arg0, arg1, arg2, field5340, field5339);
    }

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "()V", line = 1580)
    public final void method2114() {
        if (this.field5319 == null) {
            this.method185();
            return;
        }
        for (int var1 = 0; var1 < this.field5323; var1++) {
            int var2 = this.field5299[var1];
            this.field5299[var1] = this.field5317[var1];
            this.field5317[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field5320; var3++) {
            short var4 = this.field5329[var3];
            this.field5329[var3] = this.field5319[var3];
            this.field5319[var3] = (short) (-var4);
        }
        this.field5302.field967 = false;
        this.field5295.field2475 = false;
        if (this.field5309 != null) {
            this.field5309.field2475 = false;
        }
    }

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "()V", line = 1617)
    private final void method2115() {
        if (field5328.field1168.length < this.field5320 * 12) {
            field5328 = new class53((this.field5320 + 100) * 12);
        } else {
            field5328.field1142 = 0;
        }
        if (class97.field1808) {
            for (int var1 = 0; var1 < this.field5321; var1++) {
                field5328.method444((byte) 46, this.field5303[var1]);
                field5328.method444((byte) 46, this.field5305[var1]);
                field5328.method444((byte) 46, this.field5331[var1]);
            }
        } else {
            for (int var2 = 0; var2 < this.field5321; var2++) {
                field5328.method484((byte) -55, this.field5303[var2]);
                field5328.method484((byte) -94, this.field5305[var2]);
                field5328.method484((byte) -52, this.field5331[var2]);
            }
        }
        if (!class97.field1814) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field5328.field1142);
            var5.put(field5328.field1168, 0, field5328.field1142);
            var5.flip();
            this.field5292.field2475 = true;
            this.field5292.field2473 = var5;
            this.field5292.field2470 = null;
            return;
        }
        class288 var3 = new class288();
        ByteBuffer var4 = ByteBuffer.wrap(field5328.field1168, 0, field5328.field1142);
        var3.method2055(var4);
        this.field5292.field2475 = true;
        this.field5292.field2473 = null;
        this.field5292.field2470 = var3;
    }

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "()V", line = 1678)
    public final void method185() {
        for (int var1 = 0; var1 < this.field5323; var1++) {
            int var2 = this.field5299[var1];
            this.field5299[var1] = this.field5317[var1];
            this.field5317[var1] = -var2;
        }
        this.field5302.field967 = false;
        this.field5295.field2475 = false;
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(ZZZ)Lga;", line = 1692)
    public final class19 method187(boolean arg0, boolean arg1, boolean arg2) {
        return this.method2122(arg0, arg1, arg2, field5338, field5337);
    }

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "()V", line = 1696)
    public static void method2116() {
        field5294 = null;
        field5328 = null;
        field5334 = null;
        field5335 = null;
        field5336 = null;
        field5337 = null;
        field5338 = null;
        field5339 = null;
        field5340 = null;
        field5341 = null;
        field5346 = null;
    }

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "()V", line = 1709)
    public final void method2117() {
        if (this.field5319 == null) {
            this.method169();
            return;
        }
        for (int var1 = 0; var1 < this.field5323; var1++) {
            this.field5317[var1] = -this.field5317[var1];
            this.field5299[var1] = -this.field5299[var1];
        }
        for (int var2 = 0; var2 < this.field5320; var2++) {
            this.field5319[var2] = (short) (-this.field5319[var2]);
            this.field5329[var2] = (short) (-this.field5329[var2]);
        }
        this.field5302.field967 = false;
        this.field5295.field2475 = false;
        if (this.field5309 != null) {
            this.field5309.field2475 = false;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILeg;[[I[[IIII)V", line = 1742)
    public final void method2118(int arg0, int arg1, class299 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field5302.field967) {
            arg2.method2123();
        }
        int var9 = arg2.field5302.field966 + arg5;
        int var10 = arg2.field5302.field969 + arg5;
        int var11 = arg2.field5302.field963 + arg7;
        int var12 = arg2.field5302.field962 + arg7;
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
            for (int var17 = 0; var17 < this.field5323; var17++) {
                int var18 = this.field5317[var17] + arg5;
                int var19 = this.field5299[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field5330[var17] = this.field5330[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field5302.field968;
            for (int var28 = 0; var28 < this.field5323; var28++) {
                int var29 = (this.field5330[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field5317[var28] + arg5;
                    int var31 = this.field5299[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field5330[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method168(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field5302.field965 - arg2.field5302.field968;
            for (int var42 = 0; var42 < this.field5323; var42++) {
                int var43 = this.field5317[var42] + arg5;
                int var44 = this.field5299[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field5330[var42] = var51 + this.field5330[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field5302.field965 - arg2.field5302.field968;
            for (int var53 = 0; var53 < this.field5323; var53++) {
                int var54 = this.field5317[var53] + arg5;
                int var55 = this.field5299[var53] + arg7;
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
                this.field5330[var53] = ((this.field5330[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field5295.field2475 = false;
        this.field5302.field967 = false;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIII[FFIF)V", line = 1941)
    private static final void method2119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
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
        field5344 = var16;
        field5352 = var17;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 1985)
    private static final void method2120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
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
        field5349 = var18;
        field5345 = var19;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lsf;IIIZ)V", line = 2064)
    public final void method894(class108 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class299 var6 = (class299) arg0;
        if (this.field5321 == 0 || var6.field5321 == 0) {
            return;
        }
        int var7 = var6.field5323;
        int[] var8 = var6.field5317;
        int[] var9 = var6.field5330;
        int[] var10 = var6.field5299;
        short[] var11 = var6.field5319;
        short[] var12 = var6.field5313;
        short[] var13 = var6.field5329;
        short[] var14 = var6.field5307;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field5333 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field5333.field1774;
            var16 = this.field5333.field1776;
            var17 = this.field5333.field1775;
            var18 = this.field5333.field1773;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field5333 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field5333.field1774;
            var20 = var6.field5333.field1776;
            var21 = var6.field5333.field1775;
            var22 = var6.field5333.field1773;
        }
        int[] var23 = var6.field5315;
        short[] var24 = var6.field5308;
        if (!var6.field5302.field967) {
            var6.method2123();
        }
        short var25 = var6.field5302.field968;
        short var26 = var6.field5302.field965;
        short var27 = var6.field5302.field966;
        short var28 = var6.field5302.field969;
        short var29 = var6.field5302.field963;
        short var30 = var6.field5302.field962;
        for (int var31 = 0; var31 < this.field5323; var31++) {
            int var32 = this.field5330[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field5317[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field5299[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field5315[var31];
                        int var37 = this.field5315[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field5308[var38] - 1;
                            if (var35 == -1 || this.field5307[var35] != 0) {
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
                                            this.field5333 = new class95();
                                            var15 = this.field5333.field1774 = class79.method659(this.field5319, -63);
                                            var16 = this.field5333.field1776 = class79.method659(this.field5313, -63);
                                            var17 = this.field5333.field1775 = class79.method659(this.field5329, -105);
                                            var18 = this.field5333.field1773 = class79.method659(this.field5307, -111);
                                        }
                                        if (var19 == null) {
                                            class95 var44 = var6.field5333 = new class95();
                                            var19 = var44.field1774 = class79.method659(var11, -52);
                                            var20 = var44.field1776 = class79.method659(var12, -29);
                                            var21 = var44.field1775 = class79.method659(var13, -112);
                                            var22 = var44.field1773 = class79.method659(var14, -26);
                                        }
                                        short var45 = this.field5319[var35];
                                        short var46 = this.field5313[var35];
                                        short var47 = this.field5329[var35];
                                        short var48 = this.field5307[var35];
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
                                        int var57 = this.field5315[var31];
                                        int var58 = this.field5315[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field5308[var59] - 1;
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

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V", line = 2302)
    public final void method182(int arg0) {
        int var2 = class27.field654[arg0];
        int var3 = class27.field642[arg0];
        for (int var4 = 0; var4 < this.field5323; var4++) {
            int var5 = this.field5317[var4] * var3 + this.field5299[var4] * var2 >> 16;
            this.field5299[var4] = this.field5299[var4] * var3 - this.field5317[var4] * var2 >> 16;
            this.field5317[var4] = var5;
        }
        this.field5302.field967 = false;
        this.field5295.field2475 = false;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "()Z", line = 2324)
    public final boolean method895() {
        return this.field5301 && this.field5317 != null && this.field5319 != null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "([FI)[F", line = 2329)
    private static final float[] method2121(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class25.method224(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V", line = 2335)
    public final void method166(int arg0) {
        int var2 = class27.field654[arg0];
        int var3 = class27.field642[arg0];
        for (int var4 = 0; var4 < this.field5323; var4++) {
            int var5 = this.field5330[var4] * var2 + this.field5317[var4] * var3 >> 16;
            this.field5330[var4] = this.field5330[var4] * var3 - this.field5317[var4] * var2 >> 16;
            this.field5317[var4] = var5;
        }
        this.field5302.field967 = false;
        this.field5295.field2475 = false;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZZZLeg;Leg;)Lga;", line = 2354)
    private final class19 method2122(boolean arg0, boolean arg1, boolean arg2, class299 arg3, class299 arg4) {
        arg3.field5323 = this.field5323;
        arg3.field5320 = this.field5320;
        arg3.field5321 = this.field5321;
        arg3.field5332 = this.field5332;
        arg3.field5293 = this.field5293;
        arg3.field5316 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
        if (arg3.field5317 == null || arg3.field5317.length < this.field5323) {
            arg3.field5317 = new int[this.field5323 + 100];
            arg3.field5330 = new int[this.field5323 + 100];
            arg3.field5299 = new int[this.field5323 + 100];
        }
        for (int var6 = 0; var6 < this.field5323; var6++) {
            arg3.field5317[var6] = this.field5317[var6];
            arg3.field5330[var6] = this.field5330[var6];
            arg3.field5299[var6] = this.field5299[var6];
        }
        if (arg3.field5295 == null) {
            arg3.field5295 = new class137();
        }
        arg3.field5295.field2475 = false;
        if (arg3.field5302 == null) {
            arg3.field5302 = new class47();
        }
        arg3.field5302.field967 = false;
        if (arg0) {
            arg3.field5324 = this.field5324;
        } else {
            if (arg4.field5324 == null || arg4.field5324.length < this.field5321) {
                arg4.field5324 = new byte[this.field5321 + 100];
            }
            arg3.field5324 = arg4.field5324;
            for (int var7 = 0; var7 < this.field5321; var7++) {
                arg3.field5324[var7] = this.field5324[var7];
            }
        }
        if (arg1) {
            arg3.field5300 = this.field5300;
        } else {
            if (arg4.field5300 == null || arg4.field5300.length < this.field5321) {
                arg4.field5300 = new short[this.field5321 + 100];
            }
            arg3.field5300 = arg4.field5300;
            for (int var8 = 0; var8 < this.field5321; var8++) {
                arg3.field5300[var8] = this.field5300[var8];
            }
        }
        if (arg0 && arg1) {
            arg3.field5322 = this.field5322;
        } else {
            if (arg4.field5322 == null) {
                arg4.field5322 = new class137();
            }
            arg3.field5322 = arg4.field5322;
            arg3.field5322.field2475 = false;
        }
        if (arg2 || this.field5319 == null) {
            arg3.field5319 = this.field5319;
            arg3.field5313 = this.field5313;
            arg3.field5329 = this.field5329;
            arg3.field5307 = this.field5307;
            arg3.field5309 = this.field5309;
        } else {
            if (arg4.field5319 == null || arg4.field5319.length < this.field5320) {
                arg4.field5319 = new short[this.field5320 + 100];
                arg4.field5313 = new short[this.field5320 + 100];
                arg4.field5329 = new short[this.field5320 + 100];
                arg4.field5307 = new short[this.field5320 + 100];
            }
            arg3.field5319 = arg4.field5319;
            arg3.field5313 = arg4.field5313;
            arg3.field5329 = arg4.field5329;
            arg3.field5307 = arg4.field5307;
            for (int var9 = 0; var9 < this.field5320; var9++) {
                arg3.field5319[var9] = this.field5319[var9];
                arg3.field5313[var9] = this.field5313[var9];
                arg3.field5329[var9] = this.field5329[var9];
                arg3.field5307[var9] = this.field5307[var9];
            }
            if (class126.field2340) {
                if (arg4.field5309 == null) {
                    arg4.field5309 = new class137();
                }
                arg3.field5309 = arg4.field5309;
                arg3.field5309.field2475 = false;
            } else {
                arg3.field5309 = null;
            }
        }
        arg3.field5326 = this.field5326;
        arg3.field5327 = this.field5327;
        arg3.field5304 = this.field5304;
        arg3.field5325 = this.field5325;
        arg3.field5303 = this.field5303;
        arg3.field5305 = this.field5305;
        arg3.field5331 = this.field5331;
        arg3.field5311 = this.field5311;
        arg3.field5314 = this.field5314;
        arg3.field5310 = this.field5310;
        arg3.field5306 = this.field5306;
        arg3.field5292 = this.field5292;
        arg3.field5298 = this.field5298;
        arg3.field5308 = this.field5308;
        arg3.field5315 = this.field5315;
        arg3.field566 = this.field566;
        arg3.field5318 = this.field5318;
        arg3.field5297 = this.field5297;
        return arg3;
    }

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "()Z", line = 2506)
    public final boolean method189() {
        if (this.field5325 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field5323; var1++) {
            this.field5317[var1] <<= 0x4;
            this.field5330[var1] <<= 0x4;
            this.field5299[var1] <<= 0x4;
        }
        field5342 = 0;
        field5347 = 0;
        field5343 = 0;
        return true;
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(III)V", line = 2532)
    public final void method170(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5323; var4++) {
            this.field5317[var4] += arg0;
            this.field5330[var4] += arg1;
            this.field5299[var4] += arg2;
        }
        this.field5302.field967 = false;
        this.field5295.field2475 = false;
    }

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "()V", line = 2547)
    public final void method163() {
        for (int var1 = 0; var1 < this.field5323; var1++) {
            this.field5317[var1] = this.field5317[var1] + 7 >> 4;
            this.field5330[var1] = this.field5330[var1] + 7 >> 4;
            this.field5299[var1] = this.field5299[var1] + 7 >> 4;
        }
        this.field5302.field967 = false;
        this.field5295.field2475 = false;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I[IIIIZI[I)V", line = 2561)
    public final void method165(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            field5342 = 0;
            field5347 = 0;
            field5343 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field5325.length) {
                    int[] var16 = this.field5325[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field5318 == null || (arg6 & this.field5318[var18]) != 0) {
                            field5342 += this.field5317[var18];
                            field5347 += this.field5330[var18];
                            field5343 += this.field5299[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                field5342 = field5342 / var13 + var10;
                field5347 = field5347 / var13 + var11;
                field5343 = field5343 / var13 + var12;
                field5351 = true;
            } else {
                field5342 = var10;
                field5347 = var11;
                field5343 = var12;
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
                if (var26 < this.field5325.length) {
                    int[] var27 = this.field5325[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field5318 == null || (arg6 & this.field5318[var29]) != 0) {
                            this.field5317[var29] += var22;
                            this.field5330[var29] += var23;
                            this.field5299[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var91 = arg1[var90];
                    if (var91 < this.field5325.length) {
                        int[] var92 = this.field5325[var91];
                        for (int var93 = 0; var93 < var92.length; var93++) {
                            int var94 = var92[var93];
                            if (this.field5318 == null || (arg6 & this.field5318[var94]) != 0) {
                                this.field5317[var94] -= field5342;
                                this.field5330[var94] -= field5347;
                                this.field5299[var94] -= field5343;
                                if (arg4 != 0) {
                                    int var95 = class27.field654[arg4];
                                    int var96 = class27.field642[arg4];
                                    int var97 = this.field5330[var94] * var95 + this.field5317[var94] * var96 + 32767 >> 16;
                                    this.field5330[var94] = this.field5330[var94] * var96 + 32767 - this.field5317[var94] * var95 >> 16;
                                    this.field5317[var94] = var97;
                                }
                                if (arg2 != 0) {
                                    int var98 = class27.field654[arg2];
                                    int var99 = class27.field642[arg2];
                                    int var100 = this.field5330[var94] * var99 + 32767 - this.field5299[var94] * var98 >> 16;
                                    this.field5299[var94] = this.field5330[var94] * var98 + this.field5299[var94] * var99 + 32767 >> 16;
                                    this.field5330[var94] = var100;
                                }
                                if (arg3 != 0) {
                                    int var101 = class27.field654[arg3];
                                    int var102 = class27.field642[arg3];
                                    int var103 = this.field5317[var94] * var102 + this.field5299[var94] * var101 + 32767 >> 16;
                                    this.field5299[var94] = this.field5299[var94] * var102 + 32767 - this.field5317[var94] * var101 >> 16;
                                    this.field5317[var94] = var103;
                                }
                                this.field5317[var94] += field5342;
                                this.field5330[var94] += field5347;
                                this.field5299[var94] += field5343;
                            }
                        }
                    }
                }
                if (arg5 && this.field5319 != null) {
                    for (int var104 = 0; var104 < var9; var104++) {
                        int var105 = arg1[var104];
                        if (var105 < this.field5325.length) {
                            int[] var106 = this.field5325[var105];
                            for (int var107 = 0; var107 < var106.length; var107++) {
                                int var108 = var106[var107];
                                if (this.field5318 == null || (arg6 & this.field5318[var108]) != 0) {
                                    int var109 = this.field5315[var108];
                                    int var110 = this.field5315[var108 + 1];
                                    for (int var111 = var109; var111 < var110; var111++) {
                                        int var112 = this.field5308[var111] - 1;
                                        if (var112 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var113 = class27.field654[arg4];
                                            int var114 = class27.field642[arg4];
                                            int var115 = this.field5319[var112] * var114 + this.field5313[var112] * var113 + 32767 >> 16;
                                            this.field5313[var112] = (short) (this.field5313[var112] * var114 + 32767 - this.field5319[var112] * var113 >> 16);
                                            this.field5319[var112] = (short) var115;
                                        }
                                        if (arg2 != 0) {
                                            int var116 = class27.field654[arg2];
                                            int var117 = class27.field642[arg2];
                                            int var118 = this.field5313[var112] * var117 + 32767 - this.field5329[var112] * var116 >> 16;
                                            this.field5329[var112] = (short) (this.field5329[var112] * var117 + this.field5313[var112] * var116 + 32767 >> 16);
                                            this.field5313[var112] = (short) var118;
                                        }
                                        if (arg3 != 0) {
                                            int var119 = class27.field654[arg3];
                                            int var120 = class27.field642[arg3];
                                            int var121 = this.field5329[var112] * var119 + this.field5319[var112] * var120 + 32767 >> 16;
                                            this.field5329[var112] = (short) (this.field5329[var112] * var120 + 32767 - this.field5319[var112] * var119 >> 16);
                                            this.field5319[var112] = (short) var121;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field5309 != null) {
                        this.field5309.field2475 = false;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (field5351) {
                    int var36 = arg7[6] * field5343 + arg7[0] * field5342 + arg7[3] * field5347 + 16384 >> 15;
                    int var37 = arg7[7] * field5343 + arg7[1] * field5342 + arg7[4] * field5347 + 16384 >> 15;
                    int var38 = arg7[8] * field5343 + arg7[2] * field5342 + arg7[5] * field5347 + 16384 >> 15;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    field5342 = var39;
                    field5347 = var40;
                    field5343 = var41;
                    field5351 = false;
                }
                int[] var42 = new int[9];
                int var43 = class27.field642[arg2] >> 1;
                int var44 = class27.field654[arg2] >> 1;
                int var45 = class27.field642[arg3] >> 1;
                int var46 = class27.field654[arg3] >> 1;
                int var47 = class27.field642[arg4] >> 1;
                int var48 = class27.field654[arg4] >> 1;
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
                int var51 = var42[2] * -field5343 + var42[0] * -field5342 + var42[1] * -field5347 + 16384 >> 15;
                int var52 = var42[5] * -field5343 + var42[3] * -field5342 + var42[4] * -field5347 + 16384 >> 15;
                int var53 = var42[8] * -field5343 + var42[6] * -field5342 + var42[7] * -field5347 + 16384 >> 15;
                int var54 = field5342 + var51;
                int var55 = field5347 + var52;
                int var56 = field5343 + var53;
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
                    if (var80 < this.field5325.length) {
                        int[] var81 = this.field5325[var80];
                        for (int var82 = 0; var82 < var81.length; var82++) {
                            int var83 = var81[var82];
                            if (this.field5318 == null || (arg6 & this.field5318[var83]) != 0) {
                                int var84 = this.field5299[var83] * var68[2] + this.field5330[var83] * var68[1] + this.field5317[var83] * var68[0] + 16384 >> 15;
                                int var85 = this.field5299[var83] * var68[5] + this.field5330[var83] * var68[4] + this.field5317[var83] * var68[3] + 16384 >> 15;
                                int var86 = this.field5299[var83] * var68[8] + this.field5330[var83] * var68[7] + this.field5317[var83] * var68[6] + 16384 >> 15;
                                int var87 = var76 + var84;
                                int var88 = var77 + var85;
                                int var89 = var78 + var86;
                                this.field5317[var83] = var87;
                                this.field5330[var83] = var88;
                                this.field5299[var83] = var89;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field5325.length) {
                        int[] var174 = this.field5325[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field5318 == null || (arg6 & this.field5318[var176]) != 0) {
                                this.field5317[var176] -= field5342;
                                this.field5330[var176] -= field5347;
                                this.field5299[var176] -= field5343;
                                this.field5317[var176] = this.field5317[var176] * arg2 >> 7;
                                this.field5330[var176] = this.field5330[var176] * arg3 >> 7;
                                this.field5299[var176] = this.field5299[var176] * arg4 >> 7;
                                this.field5317[var176] += field5342;
                                this.field5330[var176] += field5347;
                                this.field5299[var176] += field5343;
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
                if (field5351) {
                    int var128 = arg7[6] * field5343 + arg7[0] * field5342 + arg7[3] * field5347 + 16384 >> 15;
                    int var129 = arg7[7] * field5343 + arg7[1] * field5342 + arg7[4] * field5347 + 16384 >> 15;
                    int var130 = arg7[8] * field5343 + arg7[2] * field5342 + arg7[5] * field5347 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    field5342 = var131;
                    field5347 = var132;
                    field5343 = var133;
                    field5351 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -field5342 * var134 + 16384 >> 15;
                int var138 = -field5347 * var135 + 16384 >> 15;
                int var139 = -field5343 * var136 + 16384 >> 15;
                int var140 = field5342 + var137;
                int var141 = field5347 + var138;
                int var142 = field5343 + var139;
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
                    if (var162 < this.field5325.length) {
                        int[] var163 = this.field5325[var162];
                        for (int var164 = 0; var164 < var163.length; var164++) {
                            int var165 = var163[var164];
                            if (this.field5318 == null || (arg6 & this.field5318[var165]) != 0) {
                                int var166 = this.field5299[var165] * var150[2] + this.field5330[var165] * var150[1] + this.field5317[var165] * var150[0] + 16384 >> 15;
                                int var167 = this.field5299[var165] * var150[5] + this.field5330[var165] * var150[4] + this.field5317[var165] * var150[3] + 16384 >> 15;
                                int var168 = this.field5299[var165] * var150[8] + this.field5330[var165] * var150[7] + this.field5317[var165] * var150[6] + 16384 >> 15;
                                int var169 = var158 + var166;
                                int var170 = var159 + var167;
                                int var171 = var160 + var168;
                                this.field5317[var165] = var169;
                                this.field5330[var165] = var170;
                                this.field5299[var165] = var171;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5310 != null && this.field5324 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var178 = arg1[var177];
                    if (var178 < this.field5310.length) {
                        int[] var179 = this.field5310[var178];
                        for (int var180 = 0; var180 < var179.length; var180++) {
                            int var181 = var179[var180];
                            if (this.field5297 == null || (arg6 & this.field5297[var181]) != 0) {
                                int var182 = (this.field5324[var181] & 0xFF) + arg2 * 8;
                                if (var182 < 0) {
                                    var182 = 0;
                                } else if (var182 > 255) {
                                    var182 = 255;
                                }
                                this.field5324[var181] = (byte) var182;
                            }
                        }
                        if (var179.length > 0) {
                            this.field5322.field2475 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field5310 != null) {
            for (int var183 = 0; var183 < var9; var183++) {
                int var184 = arg1[var183];
                if (var184 < this.field5310.length) {
                    int[] var185 = this.field5310[var184];
                    for (int var186 = 0; var186 < var185.length; var186++) {
                        int var187 = var185[var186];
                        if (this.field5297 == null || (arg6 & this.field5297[var187]) != 0) {
                            int var188 = this.field5300[var187] & 0xFFFF;
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
                            this.field5300[var187] = (short) (var192 << 10 | var193 << 7 | var194);
                        }
                    }
                    if (var185.length > 0) {
                        this.field5322.field2475 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "()V", line = 3352)
    private final void method2123() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field5323; var9++) {
            int var10 = this.field5317[var9];
            int var11 = this.field5330[var9];
            int var12 = this.field5299[var9];
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
        this.field5302.field966 = (short) var1;
        this.field5302.field969 = (short) var4;
        this.field5302.field968 = (short) var2;
        this.field5302.field965 = (short) var5;
        this.field5302.field963 = (short) var3;
        this.field5302.field962 = (short) var6;
        this.field5302.field964 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field5302.field967 = true;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(III)V", line = 3423)
    public final void method164(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5323; var4++) {
            this.field5317[var4] = this.field5317[var4] * arg0 >> 7;
            this.field5330[var4] = this.field5330[var4] * arg1 >> 7;
            this.field5299[var4] = this.field5299[var4] * arg2 >> 7;
        }
        this.field5302.field967 = false;
        this.field5295.field2475 = false;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIFFF)[F", line = 3439)
    private static final float[] method2124(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float[] var8 = new float[9];
        float var9 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var10 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var11 = 1.0F - var9;
        var7[0] = var9;
        var7[1] = 0.0F;
        var7[2] = var10;
        var7[3] = 0.0F;
        var7[4] = 1.0F;
        var7[5] = 0.0F;
        var7[6] = -var10;
        var7[7] = 0.0F;
        var7[8] = var9;
        float[] var12 = new float[9];
        float var13 = 1.0F;
        float var14 = 0.0F;
        float var15 = (float) arg1 / 32767.0F;
        float var16 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var17 = 1.0F - var15;
        float var18 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var18 == 0.0F && var15 == 0.0F) {
            var8 = var7;
        } else {
            if (var18 != 0.0F) {
                var13 = (float) (-arg2) / var18;
                var14 = (float) arg0 / var18;
            }
            var12[0] = var13 * var13 * var17 + var15;
            var12[1] = var14 * var16;
            var12[2] = var13 * var14 * var17;
            var12[3] = -var14 * var16;
            var12[4] = var15;
            var12[5] = var13 * var16;
            var12[6] = var13 * var14 * var17;
            var12[7] = -var13 * var16;
            var12[8] = var14 * var14 * var17 + var15;
            var8[0] = var7[2] * var12[6] + var7[0] * var12[0] + var7[1] * var12[3];
            var8[1] = var7[2] * var12[7] + var7[0] * var12[1] + var7[1] * var12[4];
            var8[2] = var7[2] * var12[8] + var7[0] * var12[2] + var7[1] * var12[5];
            var8[3] = var7[5] * var12[6] + var7[3] * var12[0] + var7[4] * var12[3];
            var8[4] = var7[5] * var12[7] + var7[3] * var12[1] + var7[4] * var12[4];
            var8[5] = var7[5] * var12[8] + var7[3] * var12[2] + var7[4] * var12[5];
            var8[6] = var7[8] * var12[6] + var7[6] * var12[0] + var7[7] * var12[3];
            var8[7] = var7[8] * var12[7] + var7[6] * var12[1] + var7[7] * var12[4];
            var8[8] = var7[8] * var12[8] + var7[6] * var12[2] + var7[7] * var12[5];
        }
        var8[0] *= arg4;
        var8[1] *= arg4;
        var8[2] *= arg4;
        var8[3] *= arg5;
        var8[4] *= arg5;
        var8[5] *= arg5;
        var8[6] *= arg6;
        var8[7] *= arg6;
        var8[8] *= arg6;
        return var8;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIII[FIF)V", line = 3512)
    private static final void method2125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
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
        field5350 = var16;
        field5348 = var17;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZZZZZZZ)V", line = 3555)
    public final void method2126(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field5316 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field5320 != 0) {
            if (arg6) {
                boolean var8 = !this.field5322.field2475 && (arg1 || arg2 && !class126.field2340);
                this.method2105(false, !this.field5295.field2475 && arg0, var8, this.field5309 != null && !this.field5309.field2475 && arg2, !this.field5306.field2475 && arg3);
                if (!this.field5292.field2475 && arg4 && arg1) {
                    this.method2115();
                }
            }
            if (arg0) {
                if (this.field5295.field2475) {
                    if (!this.field5302.field967) {
                        this.method2123();
                    }
                    this.field5317 = null;
                    this.field5330 = null;
                    this.field5299 = null;
                    this.field5308 = null;
                    this.field5315 = null;
                } else {
                    this.field5312 = (byte) (this.field5312 | 0x1);
                }
            }
            if (arg1) {
                if (this.field5322.field2475) {
                    this.field5300 = null;
                    this.field5324 = null;
                } else {
                    this.field5312 = (byte) (this.field5312 | 0x2);
                }
            }
            if (arg2 && class126.field2340) {
                if (this.field5309.field2475) {
                    this.field5319 = null;
                    this.field5313 = null;
                    this.field5329 = null;
                    this.field5307 = null;
                } else {
                    this.field5312 = (byte) (this.field5312 | 0x4);
                }
            }
            if (arg3) {
                if (this.field5306.field2475) {
                    this.field5326 = null;
                    this.field5327 = null;
                } else {
                    this.field5312 = (byte) (this.field5312 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field5292.field2475 && this.field5322.field2475) {
                    this.field5303 = null;
                    this.field5305 = null;
                    this.field5331 = null;
                } else {
                    this.field5312 = (byte) (this.field5312 | 0x10);
                }
            }
            if (arg5) {
                this.field5304 = null;
                this.field5314 = null;
                this.field5325 = (int[][]) null;
                this.field5310 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)Lsf;", line = 3652)
    public final class108 method893(int arg0, int arg1, int arg2) {
        this.field5301 = false;
        if (this.field5333 != null) {
            this.field5319 = this.field5333.field1774;
            this.field5313 = this.field5333.field1776;
            this.field5329 = this.field5333.field1775;
            this.field5307 = this.field5333.field1773;
            this.field5333 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "(I)V", line = 3667)
    public final void method2127(int arg0) {
        this.field5332 = (short) arg0;
        this.field5322.field2475 = false;
    }

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "()V", line = 3672)
    private final void method2128() {
        GL var1 = class97.field1801;
        if (this.field5321 == 0) {
            return;
        }
        if (this.field5316 != 0) {
            this.method2105(true, !this.field5295.field2475 && (this.field5316 & 0x1) != 0, !this.field5322.field2475 && (this.field5316 & 0x2) != 0, this.field5309 != null && !this.field5309.field2475 && (this.field5316 & 0x4) != 0, false);
        }
        this.method2105(false, !this.field5295.field2475, !this.field5322.field2475, this.field5309 != null && !this.field5309.field2475, !this.field5306.field2475);
        if (!this.field5292.field2475) {
            this.method2115();
        }
        if (this.field5312 != 0) {
            if ((this.field5312 & 0x1) != 0) {
                this.field5317 = null;
                this.field5330 = null;
                this.field5299 = null;
                this.field5308 = null;
                this.field5315 = null;
            }
            if ((this.field5312 & 0x2) != 0) {
                this.field5300 = null;
                this.field5324 = null;
            }
            if ((this.field5312 & 0x4) != 0) {
                this.field5319 = null;
                this.field5313 = null;
                this.field5329 = null;
                this.field5307 = null;
            }
            if ((this.field5312 & 0x8) != 0) {
                this.field5326 = null;
                this.field5327 = null;
            }
            if ((this.field5312 & 0x10) != 0) {
                this.field5303 = null;
                this.field5305 = null;
                this.field5331 = null;
            }
            this.field5312 = 0;
        }
        class288 var2 = null;
        if (this.field5295.field2470 != null) {
            this.field5295.field2470.method2058();
            var2 = this.field5295.field2470;
            var1.glVertexPointer(3, 5126, this.field5295.field2474, (long) this.field5295.field2472);
        }
        if (this.field5322.field2470 != null) {
            if (this.field5322.field2470 != var2) {
                this.field5322.field2470.method2058();
                var2 = this.field5322.field2470;
            }
            var1.glColorPointer(4, 5121, this.field5322.field2474, (long) this.field5322.field2472);
        }
        if (class126.field2340 && this.field5309.field2470 != null) {
            if (this.field5309.field2470 != var2) {
                this.field5309.field2470.method2058();
                var2 = this.field5309.field2470;
            }
            var1.glNormalPointer(5126, this.field5309.field2474, (long) this.field5309.field2472);
        }
        if (this.field5306.field2470 != null) {
            if (this.field5306.field2470 != var2) {
                this.field5306.field2470.method2058();
                class288 var3 = this.field5306.field2470;
            }
            var1.glTexCoordPointer(2, 5126, this.field5306.field2474, (long) this.field5306.field2472);
        }
        if (this.field5292.field2470 != null) {
            this.field5292.field2470.method2056();
        }
        if (this.field5295.field2470 == null || this.field5322.field2470 == null || class126.field2340 && this.field5309.field2470 == null || this.field5306.field2470 == null) {
            if (class97.field1814) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field5295.field2470 == null) {
                this.field5295.field2473.position(this.field5295.field2472);
                var1.glVertexPointer(3, 5126, this.field5295.field2474, this.field5295.field2473);
            }
            if (this.field5322.field2470 == null) {
                this.field5322.field2473.position(this.field5322.field2472);
                var1.glColorPointer(4, 5121, this.field5322.field2474, this.field5322.field2473);
            }
            if (class126.field2340 && this.field5309.field2470 == null) {
                this.field5309.field2473.position(this.field5309.field2472);
                var1.glNormalPointer(5126, this.field5309.field2474, this.field5309.field2473);
            }
            if (this.field5306.field2470 == null) {
                this.field5306.field2473.position(this.field5306.field2472);
                var1.glTexCoordPointer(2, 5126, this.field5306.field2474, this.field5306.field2473);
            }
        }
        if (this.field5292.field2470 == null && class97.field1814) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field5298.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field5298[var5];
            int var7 = this.field5298[var5 + 1];
            short var8 = this.field5311[var6];
            if (var8 == -1) {
                class97.method803(-1);
                class162.method1279(0, 0, 0);
            } else {
                class27.field656.method324(var8 & 0xFFFF, true);
            }
            if (this.field5292.field2470 == null) {
                this.field5292.field2473.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field5292.field2473);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "([SI)[S", line = 3844)
    private static final short[] method2129(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class25.method220(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ISIB)I", line = 3850)
    private static final int method2130(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class27.field645[class242.method1737(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class27.field656.method325(arg1 & 0xFFFF, 255);
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
            int var9 = class27.field656.method326(-124, arg1 & 0xFFFF);
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

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V", line = 4492)
    private class299() {
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Ljj;IIZ)V", line = 4543)
    public class299(class148 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field2664];
        this.field5315 = new int[arg0.field2661 + 1];
        for (int var6 = 0; var6 < arg0.field2664; var6++) {
            if ((arg0.field2684 == null || arg0.field2684[var6] != 2) && (arg0.field2665 == null || arg0.field2665[var6] == -1 || !class27.field656.method315(arg0.field2665[var6] & 0xFFFF, 128))) {
                var5[this.field5321++] = var6;
                this.field5315[arg0.field2678[var6]]++;
                this.field5315[arg0.field2644[var6]]++;
                this.field5315[arg0.field2670[var6]]++;
            }
        }
        long[] var7 = new long[this.field5321];
        for (int var8 = 0; var8 < this.field5321; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field2665 != null) {
                var14 = arg0.field2665[var9];
                if (var14 != -1) {
                    var12 = class27.field656.method322(255, var14 & 0xFFFF);
                    var13 = class27.field656.method320(var14 & 0xFFFF, false);
                }
            }
            boolean var15 = arg0.field2654 != null && arg0.field2654[var9] != 0 || var14 != -1 && !class27.field656.method319(41, var14 & 0xFFFF);
            if ((arg3 || var15) && arg0.field2691 != null) {
                var10 += arg0.field2691[var9] << 17;
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
        class176.method1366(var7, var5, 0);
        this.field5323 = arg0.field2661;
        this.field5317 = arg0.field2650;
        this.field5330 = arg0.field2692;
        this.field5299 = arg0.field2676;
        this.field5304 = arg0.field2656;
        this.field5318 = arg0.field2660;
        int var20 = this.field5321 * 3;
        this.field5319 = new short[var20];
        this.field5313 = new short[var20];
        this.field5329 = new short[var20];
        this.field5307 = new short[var20];
        this.field5326 = new float[var20];
        this.field5327 = new float[var20];
        this.field5300 = new short[this.field5321];
        this.field5324 = new byte[this.field5321];
        this.field5303 = new short[this.field5321];
        this.field5305 = new short[this.field5321];
        this.field5331 = new short[this.field5321];
        this.field5311 = new short[this.field5321];
        if (arg0.field2673 != null) {
            this.field5314 = new byte[this.field5321];
        }
        if (arg0.field2671 != null) {
            this.field5297 = new short[this.field5321];
        }
        this.field5302 = new class47();
        this.field5295 = new class137();
        this.field5322 = new class137();
        if (class126.field2340) {
            this.field5309 = new class137();
        }
        this.field5306 = new class137();
        this.field5292 = new class137();
        this.field5332 = (short) arg1;
        this.field5293 = (short) arg2;
        this.field5308 = new short[var20];
        field5294 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < arg0.field2661; var22++) {
            int var23 = this.field5315[var22];
            this.field5315[var22] = var21;
            var21 += var23;
        }
        this.field5315[arg0.field2661] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field2646 != null) {
            int var28 = arg0.field2663;
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
            for (int var36 = 0; var36 < this.field5321; var36++) {
                int var37 = var5[var36];
                if (arg0.field2646[var37] != -1) {
                    int var38 = arg0.field2646[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field2678[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field2644[var37];
                        } else {
                            var40 = arg0.field2670[var37];
                        }
                        int var41 = arg0.field2650[var40];
                        int var42 = arg0.field2692[var40];
                        int var43 = arg0.field2676[var40];
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
                byte var45 = arg0.field2683[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field2690[var44];
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
                        var49 = 64.0F / (float) (arg0.field2688[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field2690[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field2688[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field2657[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field2690[var44] / 1024.0F;
                        var49 = (float) arg0.field2688[var44] / 1024.0F;
                        var48 = (float) arg0.field2657[var44] / 1024.0F;
                    }
                    var27[var44] = method2124(arg0.field2677[var44], arg0.field2655[var44], arg0.field2693[var44], arg0.field2648[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field5321; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field2666[var51] & 0xFFFF;
            short var53;
            if (arg0.field2665 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field2665[var51];
            }
            int var54;
            if (arg0.field2646 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field2646[var51];
            }
            int var55;
            if (arg0.field2654 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field2654[var51] & 0xFF;
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
                    byte var65 = arg0.field2683[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field2678[var51];
                        int var67 = arg0.field2644[var51];
                        int var68 = arg0.field2670[var51];
                        short var69 = arg0.field2677[var54];
                        short var70 = arg0.field2655[var54];
                        short var71 = arg0.field2693[var54];
                        float var72 = (float) arg0.field2650[var69];
                        float var73 = (float) arg0.field2692[var69];
                        float var74 = (float) arg0.field2676[var69];
                        float var75 = (float) arg0.field2650[var70] - var72;
                        float var76 = (float) arg0.field2692[var70] - var73;
                        float var77 = (float) arg0.field2676[var70] - var74;
                        float var78 = (float) arg0.field2650[var71] - var72;
                        float var79 = (float) arg0.field2692[var71] - var73;
                        float var80 = (float) arg0.field2676[var71] - var74;
                        float var81 = (float) arg0.field2650[var66] - var72;
                        float var82 = (float) arg0.field2692[var66] - var73;
                        float var83 = (float) arg0.field2676[var66] - var74;
                        float var84 = (float) arg0.field2650[var67] - var72;
                        float var85 = (float) arg0.field2692[var67] - var73;
                        float var86 = (float) arg0.field2676[var67] - var74;
                        float var87 = (float) arg0.field2650[var68] - var72;
                        float var88 = (float) arg0.field2692[var68] - var73;
                        float var89 = (float) arg0.field2676[var68] - var74;
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
                        int var101 = arg0.field2678[var51];
                        int var102 = arg0.field2644[var51];
                        int var103 = arg0.field2670[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field2679[var54];
                        float var109 = (float) arg0.field2645[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field2657[var54] & 0xFFFF) / 1024.0F;
                            method2119(arg0.field2650[var101], arg0.field2692[var101], arg0.field2676[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field5344;
                            var57 = field5352;
                            method2119(arg0.field2650[var102], arg0.field2692[var102], arg0.field2676[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field5344;
                            var59 = field5352;
                            method2119(arg0.field2650[var103], arg0.field2692[var103], arg0.field2676[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field5344;
                            var61 = field5352;
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
                            float var112 = (float) arg0.field2667[var54] / 256.0F;
                            float var113 = (float) arg0.field2675[var54] / 256.0F;
                            int var114 = arg0.field2650[var102] - arg0.field2650[var101];
                            int var115 = arg0.field2692[var102] - arg0.field2692[var101];
                            int var116 = arg0.field2676[var102] - arg0.field2676[var101];
                            int var117 = arg0.field2650[var103] - arg0.field2650[var101];
                            int var118 = arg0.field2692[var103] - arg0.field2692[var101];
                            int var119 = arg0.field2676[var103] - arg0.field2676[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field2690[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field2688[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field2657[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method2136(var126, var127, var128);
                            method2120(arg0.field2650[var101], arg0.field2692[var101], arg0.field2676[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field5349;
                            var57 = field5345;
                            method2120(arg0.field2650[var102], arg0.field2692[var102], arg0.field2676[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field5349;
                            var59 = field5345;
                            method2120(arg0.field2650[var103], arg0.field2692[var103], arg0.field2676[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field5349;
                            var61 = field5345;
                        } else if (var65 == 3) {
                            method2125(arg0.field2650[var101], arg0.field2692[var101], arg0.field2676[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field5350;
                            var57 = field5348;
                            method2125(arg0.field2650[var102], arg0.field2692[var102], arg0.field2676[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field5350;
                            var59 = field5348;
                            method2125(arg0.field2650[var103], arg0.field2692[var103], arg0.field2676[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field5350;
                            var61 = field5348;
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
            arg0.method1152();
            byte var129;
            if (arg0.field2684 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field2684[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field2678[var51];
                class59 var133 = arg0.field2651[var132];
                this.field5303[var50] = this.method2113(arg0, var132, var130, var133.field1240, var133.field1245, var133.field1248, var133.field1253, var56, var57);
                int var134 = arg0.field2644[var51];
                class59 var135 = arg0.field2651[var134];
                this.field5305[var50] = this.method2113(arg0, var134, (long) var62 + var130, var135.field1240, var135.field1245, var135.field1248, var135.field1253, var58, var59);
                int var136 = arg0.field2670[var51];
                class59 var137 = arg0.field2651[var136];
                this.field5331[var50] = this.method2113(arg0, var136, (long) var63 + var130, var137.field1240, var137.field1245, var137.field1248, var137.field1253, var60, var61);
            } else if (var129 == 1) {
                class220 var138 = arg0.field2686[var51];
                long var139 = (long) ((var54 << 2) + (var138.field3887 > 0 ? 1024 : 2048) + (var138.field3885 + 256 << 12) + (var138.field3882 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field5303[var50] = this.method2113(arg0, arg0.field2678[var51], var139, var138.field3887, var138.field3885, var138.field3882, 0, var56, var57);
                this.field5305[var50] = this.method2113(arg0, arg0.field2644[var51], (long) var62 + var139, var138.field3887, var138.field3885, var138.field3882, 0, var58, var59);
                this.field5331[var50] = this.method2113(arg0, arg0.field2670[var51], (long) var63 + var139, var138.field3887, var138.field3885, var138.field3882, 0, var60, var61);
            }
            if (arg0.field2665 == null) {
                this.field5311[var50] = -1;
            } else {
                this.field5311[var50] = arg0.field2665[var51];
            }
            if (this.field5314 != null) {
                this.field5314[var50] = (byte) arg0.field2673[var51];
            }
            this.field5300[var50] = arg0.field2666[var51];
            if (arg0.field2654 != null) {
                this.field5324[var50] = arg0.field2654[var51];
            }
            if (arg0.field2671 != null) {
                this.field5297[var50] = arg0.field2671[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field5321; var143++) {
            short var144 = this.field5311[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field5298 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field5321; var147++) {
            short var148 = this.field5311[var147];
            if (var146 != var148) {
                this.field5298[var145++] = var147;
                var146 = var148;
            }
        }
        this.field5298[var145] = this.field5321;
        field5294 = null;
        this.field5319 = method2129(this.field5319, this.field5320);
        this.field5313 = method2129(this.field5313, this.field5320);
        this.field5329 = method2129(this.field5329, this.field5320);
        this.field5307 = method2129(this.field5307, this.field5320);
        this.field5326 = method2121(this.field5326, this.field5320);
        this.field5327 = method2121(this.field5327, this.field5320);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIIII)Z", line = 3922)
    private final boolean method2131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(SS)V", line = 3939)
    public final void method2132(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field5321; var3++) {
            if (this.field5311[var3] == arg0) {
                this.field5311[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class27.field656.method325(arg0 & 0xFFFF, 255);
            var5 = class27.field656.method326(22, arg0 & 0xFFFF);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class27.field656.method325(arg1 & 0xFFFF, 255);
            var7 = class27.field656.method326(-79, arg1 & 0xFFFF);
        }
        if (var4 != var6 || var5 != var7) {
            this.field5322.field2475 = false;
        }
    }

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "()I", line = 3974)
    public final int method180() {
        if (!this.field5302.field967) {
            this.method2123();
        }
        return this.field5302.field966;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIIIJ)V", line = 3981)
    public final void method161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field5320 == 0) {
            return;
        }
        GL var10 = class97.field1801;
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
        this.method2128();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "()V", line = 4004)
    public final void method2133() {
        int var10002;
        if (this.field5304 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field5323; var3++) {
                int var4 = this.field5304[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field5325 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field5325[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field5323) {
                int var7 = this.field5304[var6] & 0xFF;
                this.field5325[var7][var1[var7]++] = var6++;
            }
            this.field5304 = null;
        }
        if (this.field5314 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field5321; var10++) {
            int var11 = this.field5314[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field5310 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field5310[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field5321) {
            int var14 = this.field5314[var13] & 0xFF;
            this.field5310[var14][var8[var14]++] = var13++;
        }
        this.field5314 = null;
    }

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "(I)V", line = 4098)
    public final void method2134(int arg0) {
        this.field5293 = (short) arg0;
        if (this.field5309 != null) {
            this.field5309.field2475 = false;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lg;)Lg;", line = 4112)
    public final class158 method2135(class158 arg0) {
        if (this.field5320 == 0) {
            return null;
        }
        if (!this.field5302.field967) {
            this.method2123();
        }
        int var2;
        int var3;
        if (class219.field3872 > 0) {
            var2 = this.field5302.field966 - (class219.field3872 * this.field5302.field965 >> 8) >> 3;
            var3 = this.field5302.field969 - (class219.field3872 * this.field5302.field968 >> 8) >> 3;
        } else {
            var2 = this.field5302.field966 - (class219.field3872 * this.field5302.field968 >> 8) >> 3;
            var3 = this.field5302.field969 - (class219.field3872 * this.field5302.field965 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class219.field3873 > 0) {
            var4 = this.field5302.field963 - (class219.field3873 * this.field5302.field965 >> 8) >> 3;
            var5 = this.field5302.field962 - (class219.field3873 * this.field5302.field968 >> 8) >> 3;
        } else {
            var4 = this.field5302.field963 - (class219.field3873 * this.field5302.field968 >> 8) >> 3;
            var5 = this.field5302.field962 - (class219.field3873 * this.field5302.field965 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class158 var8;
        if (arg0 == null || arg0.field2891.length < var6 * var7) {
            var8 = new class158(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field1036 = arg0.field1041 = var6;
            arg0.field1033 = arg0.field1027 = var7;
            arg0.method1245();
        }
        var8.field1034 = var2;
        var8.field1028 = var4;
        if (field5341.length < this.field5320) {
            field5341 = new int[this.field5320];
            field5346 = new int[this.field5320];
        }
        for (int var9 = 0; var9 < this.field5323; var9++) {
            int var10 = (this.field5317[var9] - (this.field5330[var9] * class219.field3872 >> 8) >> 3) - var2;
            int var11 = (this.field5299[var9] - (this.field5330[var9] * class219.field3873 >> 8) >> 3) - var4;
            int var12 = this.field5315[var9];
            int var13 = this.field5315[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field5308[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field5341[var15] = var10;
                field5346[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field5321; var16++) {
            if (this.field5324[var16] <= 128) {
                short var17 = this.field5303[var16];
                short var18 = this.field5305[var16];
                short var19 = this.field5331[var16];
                int var20 = field5341[var17];
                int var21 = field5341[var18];
                int var22 = field5341[var19];
                int var23 = field5346[var17];
                int var24 = field5346[var18];
                int var25 = field5346[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class27.method233(var8.field2891, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(FFF)I", line = 4238)
    private static final int method2136(float arg0, float arg1, float arg2) {
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

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "()V", line = 4279)
    public final void method183() {
        for (int var1 = 0; var1 < this.field5323; var1++) {
            int var2 = this.field5317[var1];
            this.field5317[var1] = this.field5299[var1];
            this.field5299[var1] = -var2;
        }
        this.field5302.field967 = false;
        this.field5295.field2475 = false;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIII)V", line = 4293)
    public final void method158(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field5342 = 0;
            field5347 = 0;
            field5343 = 0;
            for (int var6 = 0; var6 < this.field5323; var6++) {
                field5342 += this.field5317[var6];
                field5347 += this.field5330[var6];
                field5343 += this.field5299[var6];
                var5++;
            }
            if (var5 > 0) {
                field5342 = field5342 / var5 + arg1;
                field5347 = field5347 / var5 + arg2;
                field5343 = field5343 / var5 + arg3;
            } else {
                field5342 = arg1;
                field5347 = arg2;
                field5343 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field5323; var7++) {
                this.field5317[var7] += arg1;
                this.field5330[var7] += arg2;
                this.field5299[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field5323; var8++) {
                this.field5317[var8] -= field5342;
                this.field5330[var8] -= field5347;
                this.field5299[var8] -= field5343;
                if (arg3 != 0) {
                    int var9 = class27.field654[arg3];
                    int var10 = class27.field642[arg3];
                    int var11 = this.field5330[var8] * var9 + this.field5317[var8] * var10 + 32767 >> 16;
                    this.field5330[var8] = this.field5330[var8] * var10 + 32767 - this.field5317[var8] * var9 >> 16;
                    this.field5317[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class27.field654[arg1];
                    int var13 = class27.field642[arg1];
                    int var14 = this.field5330[var8] * var13 + 32767 - this.field5299[var8] * var12 >> 16;
                    this.field5299[var8] = this.field5330[var8] * var12 + this.field5299[var8] * var13 + 32767 >> 16;
                    this.field5330[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class27.field654[arg2];
                    int var16 = class27.field642[arg2];
                    int var17 = this.field5317[var8] * var16 + this.field5299[var8] * var15 + 32767 >> 16;
                    this.field5299[var8] = this.field5299[var8] * var16 + 32767 - this.field5317[var8] * var15 >> 16;
                    this.field5317[var8] = var17;
                }
                this.field5317[var8] += field5342;
                this.field5330[var8] += field5347;
                this.field5299[var8] += field5343;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field5323; var18++) {
                this.field5317[var18] -= field5342;
                this.field5330[var18] -= field5347;
                this.field5299[var18] -= field5343;
                this.field5317[var18] = this.field5317[var18] * arg1 / 128;
                this.field5330[var18] = this.field5330[var18] * arg2 / 128;
                this.field5299[var18] = this.field5299[var18] * arg3 / 128;
                this.field5317[var18] += field5342;
                this.field5330[var18] += field5347;
                this.field5299[var18] += field5343;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field5321; var19++) {
                int var20 = (this.field5324[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field5324[var19] = (byte) var20;
            }
            this.field5322.field2475 = false;
        } else if (arg0 == 7) {
            for (int var21 = 0; var21 < this.field5321; var21++) {
                int var22 = this.field5300[var21] & 0xFFFF;
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
                this.field5300[var21] = (short) (var26 << 10 | var27 << 7 | var28);
            }
            this.field5322.field2475 = false;
        }
    }

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "()V", line = 4497)
    public final void method2137() {
        for (int var1 = 0; var1 < this.field5323; var1++) {
            this.field5299[var1] = -this.field5299[var1];
        }
        if (this.field5329 != null) {
            for (int var2 = 0; var2 < this.field5320; var2++) {
                this.field5329[var2] = (short) (-this.field5329[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field5321; var3++) {
            short var4 = this.field5303[var3];
            this.field5303[var3] = this.field5331[var3];
            this.field5331[var3] = var4;
        }
        this.field5302.field967 = false;
        this.field5295.field2475 = false;
        if (this.field5309 != null) {
            this.field5309.field2475 = false;
        }
        this.field5292.field2475 = false;
    }
}
