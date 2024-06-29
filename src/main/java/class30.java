import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class30 extends class155 {

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "B")
    private byte field412 = 0;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "Z")
    public boolean field425 = false;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    private int field421 = 0;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
    private int field430 = 0;

    @OriginalMember(owner = "client!wc", name = "V", descriptor = "B")
    private byte field446 = 0;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public int field407 = 0;

    @OriginalMember(owner = "client!wc", name = "U", descriptor = "[I")
    private int[] field445;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "[I")
    public int[] field427;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "[I")
    public int[] field422;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "[I")
    public int[] field418;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "[I")
    private int[] field411;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "[Lbf;")
    public class228[] field408;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "[Lmh;")
    public class276[] field436;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "[S")
    private short[] field416;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "[S")
    private short[] field437;

    @OriginalMember(owner = "client!wc", name = "Y", descriptor = "[S")
    private short[] field449;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "[S")
    private short[] field414;

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "[F")
    private float[] field432;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "[F")
    private float[] field415;

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "[S")
    private short[] field434;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "[B")
    private byte[] field413;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "[S")
    private short[] field429;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "[S")
    private short[] field431;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "[S")
    private short[] field433;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "[S")
    private short[] field417;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "[B")
    private byte[] field426;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "Lsk;")
    public class274 field428;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "Log;")
    public class284 field419;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "Log;")
    private class284 field435;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "Log;")
    private class284 field438;

    @OriginalMember(owner = "client!wc", name = "R", descriptor = "Log;")
    private class284 field442;

    @OriginalMember(owner = "client!wc", name = "W", descriptor = "Log;")
    private class284 field447;

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "S")
    private short field440;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "S")
    private short field423;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "[S")
    private short[] field410;

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "[I")
    private int[] field439;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "Lbc;")
    private static class153 field409 = new class153(10000);

    @OriginalMember(owner = "client!wc", name = "X", descriptor = "Lwc;")
    private static class30 field448 = new class30();

    @OriginalMember(owner = "client!wc", name = "ab", descriptor = "Lwc;")
    private static class30 field451 = new class30();

    @OriginalMember(owner = "client!wc", name = "bb", descriptor = "Lwc;")
    private static class30 field452 = new class30();

    @OriginalMember(owner = "client!wc", name = "cb", descriptor = "Lwc;")
    private static class30 field453 = new class30();

    @OriginalMember(owner = "client!wc", name = "lb", descriptor = "[I")
    private static int[] field462 = new int[1];

    @OriginalMember(owner = "client!wc", name = "gb", descriptor = "[I")
    private static int[] field457 = new int[1];

    @OriginalMember(owner = "client!wc", name = "db", descriptor = "F")
    private static float field454;

    @OriginalMember(owner = "client!wc", name = "fb", descriptor = "F")
    private static float field456;

    @OriginalMember(owner = "client!wc", name = "hb", descriptor = "F")
    private static float field458;

    @OriginalMember(owner = "client!wc", name = "jb", descriptor = "F")
    private static float field460;

    @OriginalMember(owner = "client!wc", name = "kb", descriptor = "F")
    private static float field461;

    @OriginalMember(owner = "client!wc", name = "mb", descriptor = "F")
    private static float field463;

    @OriginalMember(owner = "client!wc", name = "eb", descriptor = "I")
    private static int field455;

    @OriginalMember(owner = "client!wc", name = "ib", descriptor = "I")
    private static int field459;

    @OriginalMember(owner = "client!wc", name = "nb", descriptor = "I")
    private static int field464;

    @OriginalMember(owner = "client!wc", name = "S", descriptor = "Lod;")
    private class213 field443;

    @OriginalMember(owner = "client!wc", name = "T", descriptor = "Lej;")
    private class46 field444;

    @OriginalMember(owner = "client!wc", name = "Z", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field450;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "[J")
    private static long[] field424;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "[[I")
    private int[][] field420;

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "[[I")
    private int[][] field441;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "()I", line = 7)
    public final int method186() {
        if (!this.field428.field4614) {
            this.method197();
        }
        return this.field428.field4616;
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)V", line = 15)
    public final void method187(int arg0) {
        this.field423 = (short) arg0;
        if (this.field438 != null) {
            this.field438.field4772 = false;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZZZZZZZZZZZ)Lwc;", line = 24)
    public final class30 method188(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class30 var12 = new class30();
        var12.field407 = this.field407;
        var12.field421 = this.field421;
        var12.field430 = this.field430;
        if (arg0) {
            var12.field427 = this.field427;
            var12.field418 = this.field418;
        } else {
            var12.field427 = class15.method88(-88, this.field427);
            var12.field418 = class15.method88(-93, this.field418);
        }
        if (arg1) {
            var12.field422 = this.field422;
        } else {
            var12.field422 = class15.method88(-118, this.field422);
        }
        if (arg0 && arg1) {
            var12.field419 = this.field419;
            var12.field428 = this.field428;
        } else {
            var12.field419 = new class284();
            var12.field428 = new class274();
        }
        if (arg2) {
            var12.field434 = this.field434;
        } else {
            var12.field434 = class200.method1402(true, this.field434);
        }
        if (arg3) {
            var12.field413 = this.field413;
        } else {
            var12.field413 = class45.method333(12, this.field413);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class75.field1303) {
            var12.field435 = new class284();
        } else {
            var12.field435 = this.field435;
        }
        if (arg5) {
            var12.field416 = this.field416;
            var12.field437 = this.field437;
            var12.field449 = this.field449;
            var12.field414 = this.field414;
        } else {
            var12.field416 = class200.method1402(true, this.field416);
            var12.field437 = class200.method1402(true, this.field437);
            var12.field449 = class200.method1402(true, this.field449);
            var12.field414 = class200.method1402(true, this.field414);
        }
        if (!class75.field1303) {
            var12.field438 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field438 = this.field438;
        } else {
            var12.field438 = new class284();
        }
        if (arg8) {
            var12.field432 = this.field432;
            var12.field415 = this.field415;
            var12.field442 = this.field442;
        } else {
            var12.field432 = class127.method893(false, this.field432);
            var12.field415 = class127.method893(false, this.field415);
            var12.field442 = new class284();
        }
        if (arg9) {
            var12.field429 = this.field429;
            var12.field431 = this.field431;
            var12.field433 = this.field433;
            var12.field447 = this.field447;
        } else {
            var12.field429 = class200.method1402(true, this.field429);
            var12.field431 = class200.method1402(true, this.field431);
            var12.field433 = class200.method1402(true, this.field433);
            var12.field447 = new class284();
        }
        if (arg10) {
            var12.field417 = this.field417;
        } else {
            var12.field417 = class200.method1402(true, this.field417);
        }
        var12.field411 = this.field411;
        var12.field441 = this.field441;
        var12.field426 = this.field426;
        var12.field420 = this.field420;
        var12.field439 = this.field439;
        var12.field410 = this.field410;
        var12.field445 = this.field445;
        var12.field440 = this.field440;
        var12.field423 = this.field423;
        var12.field408 = this.field408;
        var12.field436 = this.field436;
        return var12;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I[IIIIZ)V", line = 165)
    private final void method189(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field455 = 0;
            field459 = 0;
            field464 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field441.length) {
                    int[] var14 = this.field441[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field455 += this.field427[var16];
                        field459 += this.field422[var16];
                        field464 += this.field418[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field455 = field455 / var11 + var8;
                field459 = field459 / var11 + var9;
                field464 = field464 / var11 + var10;
            } else {
                field455 = var8;
                field459 = var9;
                field464 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field441.length) {
                    int[] var22 = this.field441[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field427[var24] += var17;
                        this.field422[var24] += var18;
                        this.field418[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field441.length) {
                    int[] var27 = this.field441[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field427[var29] -= field455;
                        this.field422[var29] -= field459;
                        this.field418[var29] -= field464;
                        if (arg4 != 0) {
                            int var30 = class102.field1813[arg4];
                            int var31 = class102.field1819[arg4];
                            int var32 = this.field427[var29] * var31 + this.field422[var29] * var30 + 32767 >> 16;
                            this.field422[var29] = this.field422[var29] * var31 + 32767 - this.field427[var29] * var30 >> 16;
                            this.field427[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class102.field1813[arg2];
                            int var34 = class102.field1819[arg2];
                            int var35 = this.field422[var29] * var34 + 32767 - this.field418[var29] * var33 >> 16;
                            this.field418[var29] = this.field422[var29] * var33 + this.field418[var29] * var34 + 32767 >> 16;
                            this.field422[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class102.field1813[arg3];
                            int var37 = class102.field1819[arg3];
                            int var38 = this.field427[var29] * var37 + this.field418[var29] * var36 + 32767 >> 16;
                            this.field418[var29] = this.field418[var29] * var37 + 32767 - this.field427[var29] * var36 >> 16;
                            this.field427[var29] = var38;
                        }
                        this.field427[var29] += field455;
                        this.field422[var29] += field459;
                        this.field418[var29] += field464;
                    }
                }
            }
            if (arg5 && this.field416 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field441.length) {
                        int[] var41 = this.field441[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field445[var43];
                            int var45 = this.field445[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field410[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class102.field1813[arg4];
                                    int var49 = class102.field1819[arg4];
                                    int var50 = this.field437[var47] * var48 + this.field416[var47] * var49 + 32767 >> 16;
                                    this.field437[var47] = (short) (this.field437[var47] * var49 + 32767 - this.field416[var47] * var48 >> 16);
                                    this.field416[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class102.field1813[arg2];
                                    int var52 = class102.field1819[arg2];
                                    int var53 = this.field437[var47] * var52 + 32767 - this.field449[var47] * var51 >> 16;
                                    this.field449[var47] = (short) (this.field449[var47] * var52 + this.field437[var47] * var51 + 32767 >> 16);
                                    this.field437[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class102.field1813[arg3];
                                    int var55 = class102.field1819[arg3];
                                    int var56 = this.field449[var47] * var54 + this.field416[var47] * var55 + 32767 >> 16;
                                    this.field449[var47] = (short) (this.field449[var47] * var55 + 32767 - this.field416[var47] * var54 >> 16);
                                    this.field416[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field438 != null) {
                    this.field438.field4772 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field441.length) {
                    int[] var59 = this.field441[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field427[var61] -= field455;
                        this.field422[var61] -= field459;
                        this.field418[var61] -= field464;
                        this.field427[var61] = this.field427[var61] * arg2 >> 7;
                        this.field422[var61] = this.field422[var61] * arg3 >> 7;
                        this.field418[var61] = this.field418[var61] * arg4 >> 7;
                        this.field427[var61] += field455;
                        this.field422[var61] += field459;
                        this.field418[var61] += field464;
                    }
                }
            }
        } else if (arg0 == 5 && this.field420 != null && this.field413 != null) {
            for (int var62 = 0; var62 < var7; var62++) {
                int var63 = arg1[var62];
                if (var63 < this.field420.length) {
                    int[] var64 = this.field420[var63];
                    for (int var65 = 0; var65 < var64.length; var65++) {
                        int var66 = var64[var65];
                        int var67 = (this.field413[var66] & 0xFF) + arg2 * 8;
                        if (var67 < 0) {
                            var67 = 0;
                        } else if (var67 > 255) {
                            var67 = 255;
                        }
                        this.field413[var66] = (byte) var67;
                    }
                    if (var64.length > 0) {
                        this.field435.field4772 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lpb;ILpb;I[IZ)V", line = 508)
    public final void method190(class290 arg0, int arg1, class290 arg2, int arg3, int[] arg4, boolean arg5) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method198(arg0, arg1, arg5);
            return;
        }
        class148 var7 = arg0.field4878[arg1];
        class148 var8 = arg2.field4878[arg3];
        class159 var9 = var7.field2512;
        for (int var10 = 0; var10 < this.field407; var10++) {
            this.field427[var10] <<= 0x4;
            this.field422[var10] <<= 0x4;
            this.field418[var10] <<= 0x4;
        }
        field455 = 0;
        field459 = 0;
        field464 = 0;
        byte var11 = 0;
        int var20 = var11 + 1;
        int var12 = arg4[var11];
        for (int var13 = 0; var13 < var7.field2516; var13++) {
            short var14 = var7.field2518[var13];
            while (var14 > var12) {
                var12 = arg4[var20++];
            }
            if (var12 != var14 || var9.field2758[var14] == 0) {
                if (var7.field2514[var13] != -1) {
                    this.method189(0, var9.field2749[var7.field2514[var13]], 0, 0, 0, arg5);
                }
                this.method189(var9.field2758[var14], var9.field2749[var14], var7.field2521[var13], var7.field2522[var13], var7.field2513[var13], arg5);
            }
        }
        field455 = 0;
        field459 = 0;
        field464 = 0;
        byte var15 = 0;
        int var21 = var15 + 1;
        int var16 = arg4[var15];
        for (int var17 = 0; var17 < var8.field2516; var17++) {
            short var18 = var8.field2518[var17];
            while (var18 > var16) {
                var16 = arg4[var21++];
            }
            if (var16 == var18 || var9.field2758[var18] == 0) {
                if (var8.field2514[var17] != -1) {
                    this.method189(0, var9.field2749[var8.field2514[var17]], 0, 0, 0, arg5);
                }
                this.method189(var9.field2758[var18], var9.field2749[var18], var8.field2521[var17], var8.field2522[var17], var8.field2513[var17], arg5);
            }
        }
        for (int var19 = 0; var19 < this.field407; var19++) {
            this.field427[var19] >>= 0x4;
            this.field422[var19] >>= 0x4;
            this.field418[var19] >>= 0x4;
        }
        this.field428.field4614 = false;
        this.field419.field4772 = false;
    }

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "()V", line = 605)
    private final void method191() {
        GL var1 = class147.field2479;
        if (this.field430 == 0) {
            return;
        }
        if (this.field446 != 0) {
            this.method205(true, !this.field419.field4772 && (this.field446 & 0x1) != 0, !this.field435.field4772 && (this.field446 & 0x2) != 0, this.field438 != null && !this.field438.field4772 && (this.field446 & 0x4) != 0, false);
        }
        this.method205(false, !this.field419.field4772, !this.field435.field4772, this.field438 != null && !this.field438.field4772, !this.field442.field4772);
        if (!this.field447.field4772) {
            this.method232();
        }
        if (this.field412 != 0) {
            if ((this.field412 & 0x1) != 0) {
                this.field427 = null;
                this.field422 = null;
                this.field418 = null;
                this.field410 = null;
                this.field445 = null;
            }
            if ((this.field412 & 0x2) != 0) {
                this.field434 = null;
                this.field413 = null;
            }
            if ((this.field412 & 0x4) != 0) {
                this.field416 = null;
                this.field437 = null;
                this.field449 = null;
                this.field414 = null;
            }
            if ((this.field412 & 0x8) != 0) {
                this.field432 = null;
                this.field415 = null;
            }
            if ((this.field412 & 0x10) != 0) {
                this.field429 = null;
                this.field431 = null;
                this.field433 = null;
            }
            this.field412 = 0;
        }
        class46 var2 = null;
        if (this.field419.field4761 != null) {
            this.field419.field4761.method337();
            var2 = this.field419.field4761;
            var1.glVertexPointer(3, 5126, this.field419.field4778, (long) this.field419.field4766);
        }
        if (this.field435.field4761 != null) {
            if (this.field435.field4761 != var2) {
                this.field435.field4761.method337();
                var2 = this.field435.field4761;
            }
            var1.glColorPointer(4, 5121, this.field435.field4778, (long) this.field435.field4766);
        }
        if (class75.field1303 && this.field438.field4761 != null) {
            if (this.field438.field4761 != var2) {
                this.field438.field4761.method337();
                var2 = this.field438.field4761;
            }
            var1.glNormalPointer(5126, this.field438.field4778, (long) this.field438.field4766);
        }
        if (this.field442.field4761 != null) {
            if (this.field442.field4761 != var2) {
                this.field442.field4761.method337();
                class46 var3 = this.field442.field4761;
            }
            var1.glTexCoordPointer(2, 5126, this.field442.field4778, (long) this.field442.field4766);
        }
        if (this.field447.field4761 != null) {
            this.field447.field4761.method335();
        }
        if (this.field419.field4761 == null || this.field435.field4761 == null || class75.field1303 && this.field438.field4761 == null || this.field442.field4761 == null) {
            if (class147.field2510) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field419.field4761 == null) {
                this.field419.field4769.position(this.field419.field4766);
                var1.glVertexPointer(3, 5126, this.field419.field4778, this.field419.field4769);
            }
            if (this.field435.field4761 == null) {
                this.field435.field4769.position(this.field435.field4766);
                var1.glColorPointer(4, 5121, this.field435.field4778, this.field435.field4769);
            }
            if (class75.field1303 && this.field438.field4761 == null) {
                this.field438.field4769.position(this.field438.field4766);
                var1.glNormalPointer(5126, this.field438.field4778, this.field438.field4769);
            }
            if (this.field442.field4761 == null) {
                this.field442.field4769.position(this.field442.field4766);
                var1.glTexCoordPointer(2, 5126, this.field442.field4778, this.field442.field4769);
            }
        }
        if (this.field447.field4761 == null && class147.field2510) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field439.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field439[var5];
            int var7 = this.field439[var5 + 1];
            short var8 = this.field417[var6];
            if (var8 == -1) {
                class147.method1002(-1);
                class171.method1211(0, 0, false);
            } else {
                class102.field1821.method621(128, var8 & 0xFFFF);
            }
            if (this.field447.field4761 == null) {
                this.field447.field4769.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field447.field4769);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lrm;IIIZ)V", line = 779)
    public final void method192(class175 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class30 var6 = (class30) arg0;
        if (this.field430 == 0 || var6.field430 == 0) {
            return;
        }
        int var7 = var6.field407;
        int[] var8 = var6.field427;
        int[] var9 = var6.field422;
        int[] var10 = var6.field418;
        short[] var11 = var6.field416;
        short[] var12 = var6.field437;
        short[] var13 = var6.field449;
        short[] var14 = var6.field414;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field443 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field443.field3725;
            var16 = this.field443.field3724;
            var17 = this.field443.field3723;
            var18 = this.field443.field3722;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field443 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field443.field3725;
            var20 = var6.field443.field3724;
            var21 = var6.field443.field3723;
            var22 = var6.field443.field3722;
        }
        int[] var23 = var6.field445;
        short[] var24 = var6.field410;
        if (!var6.field428.field4614) {
            var6.method197();
        }
        short var25 = var6.field428.field4618;
        short var26 = var6.field428.field4615;
        short var27 = var6.field428.field4617;
        short var28 = var6.field428.field4616;
        short var29 = var6.field428.field4619;
        short var30 = var6.field428.field4612;
        for (int var31 = 0; var31 < this.field407; var31++) {
            int var32 = this.field422[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field427[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field418[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field445[var31];
                        int var37 = this.field445[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field410[var38] - 1;
                            if (var35 == -1 || this.field414[var35] != 0) {
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
                                            this.field443 = new class213();
                                            var15 = this.field443.field3725 = class200.method1402(true, this.field416);
                                            var16 = this.field443.field3724 = class200.method1402(true, this.field437);
                                            var17 = this.field443.field3723 = class200.method1402(true, this.field449);
                                            var18 = this.field443.field3722 = class200.method1402(true, this.field414);
                                        }
                                        if (var19 == null) {
                                            class213 var44 = var6.field443 = new class213();
                                            var19 = var44.field3725 = class200.method1402(true, var11);
                                            var20 = var44.field3724 = class200.method1402(true, var12);
                                            var21 = var44.field3723 = class200.method1402(true, var13);
                                            var22 = var44.field3722 = class200.method1402(true, var14);
                                        }
                                        short var45 = this.field416[var35];
                                        short var46 = this.field437[var35];
                                        short var47 = this.field449[var35];
                                        short var48 = this.field414[var35];
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
                                        int var57 = this.field445[var31];
                                        int var58 = this.field445[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field410[var59] - 1;
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

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V", line = 3764)
    private class30() {
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lwl;IIZ)V", line = 3766)
    public class30(class174 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field2993];
        this.field445 = new int[arg0.field2992 + 1];
        for (int var6 = 0; var6 < arg0.field2993; var6++) {
            if ((arg0.field2991 == null || arg0.field2991[var6] != 2) && (arg0.field3025 == null || arg0.field3025[var6] == -1 || !class102.field1821.method619(arg0.field3025[var6] & 0xFFFF, false))) {
                var5[this.field430++] = var6;
                this.field445[arg0.field2986[var6]]++;
                this.field445[arg0.field3022[var6]]++;
                this.field445[arg0.field3014[var6]]++;
            }
        }
        long[] var7 = new long[this.field430];
        for (int var8 = 0; var8 < this.field430; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field3025 != null) {
                var14 = arg0.field3025[var9];
                if (var14 != -1) {
                    var12 = class102.field1821.method628(127, var14 & 0xFFFF);
                    var13 = class102.field1821.method622(255, var14 & 0xFFFF);
                }
            }
            boolean var15 = arg0.field3019 != null && arg0.field3019[var9] != 0 || var14 != -1 && !class102.field1821.method626(255, var14 & 0xFFFF);
            if ((arg3 || var15) && arg0.field3021 != null) {
                var10 += arg0.field3021[var9] << 17;
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
        class193.method1344(false, var7, var5);
        this.field407 = arg0.field2992;
        this.field427 = arg0.field3030;
        this.field422 = arg0.field3002;
        this.field418 = arg0.field3027;
        this.field411 = arg0.field3020;
        this.field408 = arg0.field3033;
        this.field436 = arg0.field3016;
        int var20 = this.field430 * 3;
        this.field416 = new short[var20];
        this.field437 = new short[var20];
        this.field449 = new short[var20];
        this.field414 = new short[var20];
        this.field432 = new float[var20];
        this.field415 = new float[var20];
        this.field434 = new short[this.field430];
        this.field413 = new byte[this.field430];
        this.field429 = new short[this.field430];
        this.field431 = new short[this.field430];
        this.field433 = new short[this.field430];
        this.field417 = new short[this.field430];
        if (arg0.field3024 != null) {
            this.field426 = new byte[this.field430];
        }
        this.field428 = new class274();
        this.field419 = new class284();
        this.field435 = new class284();
        if (class75.field1303) {
            this.field438 = new class284();
        }
        this.field442 = new class284();
        this.field447 = new class284();
        this.field440 = (short) arg1;
        this.field423 = (short) arg2;
        this.field410 = new short[var20];
        field424 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < arg0.field2992; var22++) {
            int var23 = this.field445[var22];
            this.field445[var22] = var21;
            var21 += var23;
        }
        this.field445[arg0.field2992] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field3011 != null) {
            int var28 = arg0.field2995;
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
            for (int var36 = 0; var36 < this.field430; var36++) {
                int var37 = var5[var36];
                if (arg0.field3011[var37] != -1) {
                    int var38 = arg0.field3011[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field2986[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field3022[var37];
                        } else {
                            var40 = arg0.field3014[var37];
                        }
                        int var41 = arg0.field3030[var40];
                        int var42 = arg0.field3002[var40];
                        int var43 = arg0.field3027[var40];
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
                byte var45 = arg0.field3005[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field3003[var44];
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
                        var49 = 64.0F / (float) (arg0.field3006[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field3003[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field3006[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field3023[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field3003[var44] / 1024.0F;
                        var49 = (float) arg0.field3006[var44] / 1024.0F;
                        var48 = (float) arg0.field3023[var44] / 1024.0F;
                    }
                    var27[var44] = method208(arg0.field3008[var44], arg0.field3013[var44], arg0.field2984[var44], arg0.field3004[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field430; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field3000[var51] & 0xFFFF;
            short var53;
            if (arg0.field3025 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field3025[var51];
            }
            int var54;
            if (arg0.field3011 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field3011[var51];
            }
            int var55;
            if (arg0.field3019 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field3019[var51] & 0xFF;
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
                    byte var65 = arg0.field3005[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field2986[var51];
                        int var67 = arg0.field3022[var51];
                        int var68 = arg0.field3014[var51];
                        short var69 = arg0.field3008[var54];
                        short var70 = arg0.field3013[var54];
                        short var71 = arg0.field2984[var54];
                        float var72 = (float) arg0.field3030[var69];
                        float var73 = (float) arg0.field3002[var69];
                        float var74 = (float) arg0.field3027[var69];
                        float var75 = (float) arg0.field3030[var70] - var72;
                        float var76 = (float) arg0.field3002[var70] - var73;
                        float var77 = (float) arg0.field3027[var70] - var74;
                        float var78 = (float) arg0.field3030[var71] - var72;
                        float var79 = (float) arg0.field3002[var71] - var73;
                        float var80 = (float) arg0.field3027[var71] - var74;
                        float var81 = (float) arg0.field3030[var66] - var72;
                        float var82 = (float) arg0.field3002[var66] - var73;
                        float var83 = (float) arg0.field3027[var66] - var74;
                        float var84 = (float) arg0.field3030[var67] - var72;
                        float var85 = (float) arg0.field3002[var67] - var73;
                        float var86 = (float) arg0.field3027[var67] - var74;
                        float var87 = (float) arg0.field3030[var68] - var72;
                        float var88 = (float) arg0.field3002[var68] - var73;
                        float var89 = (float) arg0.field3027[var68] - var74;
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
                        int var101 = arg0.field2986[var51];
                        int var102 = arg0.field3022[var51];
                        int var103 = arg0.field3014[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field2983[var54];
                        float var109 = (float) arg0.field2988[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field3023[var54] & 0xFFFF) / 1024.0F;
                            method229(arg0.field3030[var101], arg0.field3002[var101], arg0.field3027[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field463;
                            var57 = field461;
                            method229(arg0.field3030[var102], arg0.field3002[var102], arg0.field3027[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field463;
                            var59 = field461;
                            method229(arg0.field3030[var103], arg0.field3002[var103], arg0.field3027[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field463;
                            var61 = field461;
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
                            float var112 = (float) arg0.field3007[var54] / 256.0F;
                            float var113 = (float) arg0.field3001[var54] / 256.0F;
                            int var114 = arg0.field3030[var102] - arg0.field3030[var101];
                            int var115 = arg0.field3002[var102] - arg0.field3002[var101];
                            int var116 = arg0.field3027[var102] - arg0.field3027[var101];
                            int var117 = arg0.field3030[var103] - arg0.field3030[var101];
                            int var118 = arg0.field3002[var103] - arg0.field3002[var101];
                            int var119 = arg0.field3027[var103] - arg0.field3027[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field3003[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field3006[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field3023[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method227(var126, var127, var128);
                            method221(arg0.field3030[var101], arg0.field3002[var101], arg0.field3027[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field454;
                            var57 = field460;
                            method221(arg0.field3030[var102], arg0.field3002[var102], arg0.field3027[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field454;
                            var59 = field460;
                            method221(arg0.field3030[var103], arg0.field3002[var103], arg0.field3027[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field454;
                            var61 = field460;
                        } else if (var65 == 3) {
                            method226(arg0.field3030[var101], arg0.field3002[var101], arg0.field3027[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field456;
                            var57 = field458;
                            method226(arg0.field3030[var102], arg0.field3002[var102], arg0.field3027[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field456;
                            var59 = field458;
                            method226(arg0.field3030[var103], arg0.field3002[var103], arg0.field3027[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field456;
                            var61 = field458;
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
            arg0.method1230();
            byte var129;
            if (arg0.field2991 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field2991[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field2986[var51];
                class244 var133 = arg0.field3028[var132];
                this.field429[var50] = this.method211(arg0, var132, var130, var133.field4235, var133.field4241, var133.field4237, var133.field4239, var56, var57);
                int var134 = arg0.field3022[var51];
                class244 var135 = arg0.field3028[var134];
                this.field431[var50] = this.method211(arg0, var134, (long) var62 + var130, var135.field4235, var135.field4241, var135.field4237, var135.field4239, var58, var59);
                int var136 = arg0.field3014[var51];
                class244 var137 = arg0.field3028[var136];
                this.field433[var50] = this.method211(arg0, var136, (long) var63 + var130, var137.field4235, var137.field4241, var137.field4237, var137.field4239, var60, var61);
            } else if (var129 == 1) {
                class218 var138 = arg0.field3010[var51];
                long var139 = (long) ((var54 << 2) + (var138.field3789 > 0 ? 1024 : 2048) + (var138.field3790 + 256 << 12) + (var138.field3784 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field429[var50] = this.method211(arg0, arg0.field2986[var51], var139, var138.field3789, var138.field3790, var138.field3784, 0, var56, var57);
                this.field431[var50] = this.method211(arg0, arg0.field3022[var51], (long) var62 + var139, var138.field3789, var138.field3790, var138.field3784, 0, var58, var59);
                this.field433[var50] = this.method211(arg0, arg0.field3014[var51], (long) var63 + var139, var138.field3789, var138.field3790, var138.field3784, 0, var60, var61);
            }
            if (arg0.field3025 == null) {
                this.field417[var50] = -1;
            } else {
                this.field417[var50] = arg0.field3025[var51];
            }
            if (this.field426 != null) {
                this.field426[var50] = (byte) arg0.field3024[var51];
            }
            this.field434[var50] = arg0.field3000[var51];
            if (arg0.field3019 != null) {
                this.field413[var50] = arg0.field3019[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field430; var143++) {
            short var144 = this.field417[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field439 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field430; var147++) {
            short var148 = this.field417[var147];
            if (var146 != var148) {
                this.field439[var145++] = var147;
                var146 = var148;
            }
        }
        this.field439[var145] = this.field430;
        field424 = null;
        this.field416 = method200(this.field416, this.field421);
        this.field437 = method200(this.field437, this.field421);
        this.field449 = method200(this.field449, this.field421);
        this.field414 = method200(this.field414, this.field421);
        this.field432 = method203(this.field432, this.field421);
        this.field415 = method203(this.field415, this.field421);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIIJ)V", line = 1019)
    public final void method193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field421 == 0) {
            return;
        }
        GL var10 = class147.field2479;
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
        this.method191();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "()I", line = 1043)
    public final int method194() {
        if (!this.field428.field4614) {
            this.method197();
        }
        return this.field428.field4619;
    }

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "()V", line = 1049)
    public final void method195() {
        if (this.field416 == null) {
            this.method210();
            return;
        }
        for (int var1 = 0; var1 < this.field407; var1++) {
            int var2 = this.field427[var1];
            this.field427[var1] = this.field418[var1];
            this.field418[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field421; var3++) {
            short var4 = this.field416[var3];
            this.field416[var3] = this.field449[var3];
            this.field449[var3] = (short) (-var4);
        }
        this.field428.field4614 = false;
        this.field419.field4772 = false;
        if (this.field438 != null) {
            this.field438.field4772 = false;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(ZZ)Lpa;", line = 1087)
    public final class155 method196(boolean arg0, boolean arg1) {
        return this.method242(arg0, arg1, field453, field452);
    }

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "()V", line = 1092)
    private final void method197() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field407; var9++) {
            int var10 = this.field427[var9];
            int var11 = this.field422[var9];
            int var12 = this.field418[var9];
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
        this.field428.field4617 = (short) var1;
        this.field428.field4616 = (short) var4;
        this.field428.field4618 = (short) var2;
        this.field428.field4615 = (short) var5;
        this.field428.field4619 = (short) var3;
        this.field428.field4612 = (short) var6;
        this.field428.field4613 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field428.field4614 = true;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lpb;IZ)V", line = 1162)
    public final void method198(class290 arg0, int arg1, boolean arg2) {
        if (this.field441 == null || arg1 == -1) {
            return;
        }
        class148 var4 = arg0.field4878[arg1];
        class159 var5 = var4.field2512;
        for (int var6 = 0; var6 < this.field407; var6++) {
            this.field427[var6] <<= 0x4;
            this.field422[var6] <<= 0x4;
            this.field418[var6] <<= 0x4;
        }
        field455 = 0;
        field459 = 0;
        field464 = 0;
        for (int var7 = 0; var7 < var4.field2516; var7++) {
            short var8 = var4.field2518[var7];
            if (var4.field2514[var7] != -1) {
                this.method189(0, var5.field2749[var4.field2514[var7]], 0, 0, 0, arg2);
            }
            this.method189(var5.field2758[var8], var5.field2749[var8], var4.field2521[var7], var4.field2522[var7], var4.field2513[var7], arg2);
        }
        for (int var9 = 0; var9 < this.field407; var9++) {
            this.field427[var9] >>= 0x4;
            this.field422[var9] >>= 0x4;
            this.field418[var9] >>= 0x4;
        }
        this.field428.field4614 = false;
        this.field419.field4772 = false;
    }

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "()V", line = 1219)
    public static void method199() {
        field424 = null;
        field409 = null;
        field450 = null;
        field448 = null;
        field451 = null;
        field452 = null;
        field453 = null;
        field457 = null;
        field462 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([SI)[S", line = 1231)
    private static final short[] method200(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class190.method1326(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "()V", line = 1238)
    public final void method201() {
        for (int var1 = 0; var1 < this.field407; var1++) {
            this.field427[var1] = -this.field427[var1];
            this.field418[var1] = -this.field418[var1];
        }
        this.field428.field4614 = false;
        this.field419.field4772 = false;
    }

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "()V", line = 1250)
    public final void method202() {
        int var10002;
        if (this.field411 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field407; var3++) {
                int var4 = this.field411[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field441 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field441[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field407) {
                int var7 = this.field411[var6] & 0xFF;
                this.field441[var7][var1[var7]++] = var6++;
            }
            this.field411 = null;
        }
        if (this.field426 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field430; var10++) {
            int var11 = this.field426[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field420 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field420[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field430) {
            int var14 = this.field426[var13] & 0xFF;
            this.field420[var14][var8[var14]++] = var13++;
        }
        this.field426 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([FI)[F", line = 1344)
    private static final float[] method203(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class190.method1325(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(III)V", line = 1352)
    public final void method204(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field407; var4++) {
            this.field427[var4] = this.field427[var4] * arg0 >> 7;
            this.field422[var4] = this.field422[var4] * arg1 >> 7;
            this.field418[var4] = this.field418[var4] * arg2 >> 7;
        }
        this.field428.field4614 = false;
        this.field419.field4772 = false;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZZZZZ)V", line = 1367)
    private final void method205(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field419.field4766 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field435.field4766 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field438.field4766 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field442.field4766 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field409.field2598.length < this.field421 * var6) {
            field409 = new class153((this.field421 + 100) * var6);
        } else {
            field409.field2611 = 0;
        }
        if (arg1) {
            if (class147.field2482) {
                for (int var7 = 0; var7 < this.field407; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field427[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field422[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field418[var7]);
                    int var11 = this.field445[var7];
                    int var12 = this.field445[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field410[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field409.field2611 = var6 * var14;
                        field409.method1065(178808912, var8);
                        field409.method1065(178808912, var9);
                        field409.method1065(178808912, var10);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field407; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field427[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field422[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field418[var15]);
                    int var19 = this.field445[var15];
                    int var20 = this.field445[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field410[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field409.field2611 = var6 * var22;
                        field409.method1063(var16, 4);
                        field409.method1063(var17, 4);
                        field409.method1063(var18, 4);
                    }
                }
            }
        }
        if (arg2) {
            if (class75.field1303) {
                for (int var42 = 0; var42 < this.field430; var42++) {
                    int var43 = method215(this.field434[var42], this.field417[var42], this.field440, this.field413[var42]);
                    field409.field2611 = this.field429[var42] * var6 + this.field435.field4766;
                    field409.method1065(178808912, var43);
                    field409.field2611 = this.field431[var42] * var6 + this.field435.field4766;
                    field409.method1065(178808912, var43);
                    field409.field2611 = this.field433[var42] * var6 + this.field435.field4766;
                    field409.method1065(178808912, var43);
                }
            } else {
                int var23 = (int) class85.field1529[0];
                int var24 = (int) class85.field1529[1];
                int var25 = (int) class85.field1529[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field440 * 1.3F);
                int var28 = this.field423 * var26 >> 8;
                for (int var29 = 0; var29 < this.field430; var29++) {
                    short var30 = this.field429[var29];
                    short var31 = this.field414[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field449[var30] * var25 + this.field437[var30] * var24 + this.field416[var30] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field449[var30] * var25 + this.field437[var30] * var24 + this.field416[var30] * var23) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field414[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field431[var29];
                    short var34 = this.field414[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field449[var33] * var25 + this.field437[var33] * var24 + this.field416[var33] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field449[var33] * var25 + this.field437[var33] * var24 + this.field416[var33] * var23) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field414[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field433[var29];
                    short var37 = this.field414[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field449[var36] * var25 + this.field437[var36] * var24 + this.field416[var36] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field449[var36] * var25 + this.field437[var36] * var24 + this.field416[var36] * var23) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field414[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method215(this.field434[var29], this.field417[var29], var32, this.field413[var29]);
                    int var40 = method215(this.field434[var29], this.field417[var29], var35, this.field413[var29]);
                    int var41 = method215(this.field434[var29], this.field417[var29], var38, this.field413[var29]);
                    field409.field2611 = var6 * var30 + this.field435.field4766;
                    field409.method1065(178808912, var39);
                    field409.field2611 = var6 * var33 + this.field435.field4766;
                    field409.method1065(178808912, var40);
                    field409.field2611 = var6 * var36 + this.field435.field4766;
                    field409.method1065(178808912, var41);
                }
                this.field416 = null;
                this.field437 = null;
                this.field449 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field423;
            float var45 = 3.0F / (float) (this.field423 / 2 + this.field423);
            field409.field2611 = this.field438.field4766;
            if (class147.field2482) {
                for (int var46 = 0; var46 < this.field421; var46++) {
                    short var47 = this.field414[var46];
                    if (var47 == 0) {
                        field409.method1047((float) this.field416[var46] * var45, -68);
                        field409.method1047((float) this.field437[var46] * var45, -81);
                        field409.method1047((float) this.field449[var46] * var45, -101);
                    } else {
                        float var48 = var44 / (float) var47;
                        field409.method1047((float) this.field416[var46] * var48, -61);
                        field409.method1047((float) this.field437[var46] * var48, -55);
                        field409.method1047((float) this.field449[var46] * var48, -54);
                    }
                    field409.field2611 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field421; var49++) {
                    short var50 = this.field414[var49];
                    if (var50 == 0) {
                        field409.method1081((float) this.field416[var49] * var45, true);
                        field409.method1081((float) this.field437[var49] * var45, true);
                        field409.method1081((float) this.field449[var49] * var45, true);
                    } else {
                        float var51 = var44 / (float) var50;
                        field409.method1081((float) this.field416[var49] * var51, true);
                        field409.method1081((float) this.field437[var49] * var51, true);
                        field409.method1081((float) this.field449[var49] * var51, true);
                    }
                    field409.field2611 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field409.field2611 = this.field442.field4766;
            if (class147.field2482) {
                for (int var52 = 0; var52 < this.field421; var52++) {
                    field409.method1047(this.field432[var52], -53);
                    field409.method1047(this.field415[var52], -52);
                    field409.field2611 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field421; var53++) {
                    field409.method1081(this.field432[var53], true);
                    field409.method1081(this.field415[var53], true);
                    field409.field2611 += var6 - 8;
                }
            }
        }
        field409.field2611 = this.field421 * var6;
        if (arg0) {
            if (class147.field2487) {
                ByteBuffer var54 = ByteBuffer.wrap(field409.field2598, 0, field409.field2611);
                if (this.field444 == null) {
                    this.field444 = new class46(true);
                    this.field444.method338(var54);
                } else {
                    this.field444.method334(var54);
                }
                if (arg1) {
                    this.field419.field4772 = true;
                    this.field419.field4769 = null;
                    this.field419.field4761 = this.field444;
                    this.field419.field4778 = var6;
                }
                if (arg2) {
                    this.field435.field4772 = true;
                    this.field435.field4769 = null;
                    this.field435.field4761 = this.field444;
                    this.field435.field4778 = var6;
                }
                if (arg3) {
                    this.field438.field4772 = true;
                    this.field438.field4769 = null;
                    this.field438.field4761 = this.field444;
                    this.field438.field4778 = var6;
                }
                if (arg4) {
                    this.field442.field4772 = true;
                    this.field442.field4769 = null;
                    this.field442.field4761 = this.field444;
                    this.field442.field4778 = var6;
                }
            } else {
                if (field450 == null || field450.capacity() < field409.field2611) {
                    field450 = ByteBuffer.allocateDirect(var6 * 100 + field409.field2611);
                } else {
                    field450.clear();
                }
                field450.put(field409.field2598, 0, field409.field2611);
                field450.flip();
                if (arg1) {
                    this.field419.field4772 = true;
                    this.field419.field4769 = field450;
                    this.field419.field4761 = null;
                    this.field419.field4778 = var6;
                }
                if (arg2) {
                    this.field435.field4772 = true;
                    this.field435.field4769 = field450;
                    this.field419.field4761 = null;
                    this.field435.field4778 = var6;
                }
                if (arg3) {
                    this.field438.field4772 = true;
                    this.field438.field4769 = field450;
                    this.field438.field4761 = null;
                    this.field438.field4778 = var6;
                }
                if (arg4) {
                    this.field442.field4772 = true;
                    this.field442.field4769 = field450;
                    this.field442.field4761 = null;
                    this.field442.field4778 = var6;
                }
            }
        } else if (class147.field2510) {
            class46 var55 = new class46();
            ByteBuffer var56 = ByteBuffer.wrap(field409.field2598, 0, field409.field2611);
            var55.method338(var56);
            if (arg1) {
                this.field419.field4772 = true;
                this.field419.field4769 = null;
                this.field419.field4761 = var55;
                this.field419.field4778 = var6;
            }
            if (arg2) {
                this.field435.field4772 = true;
                this.field435.field4769 = null;
                this.field435.field4761 = var55;
                this.field435.field4778 = var6;
            }
            if (arg3) {
                this.field438.field4772 = true;
                this.field438.field4769 = null;
                this.field438.field4761 = var55;
                this.field438.field4778 = var6;
            }
            if (arg4) {
                this.field442.field4772 = true;
                this.field442.field4769 = null;
                this.field442.field4761 = var55;
                this.field442.field4778 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field409.field2611);
            var57.put(field409.field2598, 0, field409.field2611);
            var57.flip();
            if (arg1) {
                this.field419.field4772 = true;
                this.field419.field4769 = var57;
                this.field419.field4761 = null;
                this.field419.field4778 = var6;
            }
            if (arg2) {
                this.field435.field4772 = true;
                this.field435.field4769 = var57;
                this.field419.field4761 = null;
                this.field435.field4778 = var6;
            }
            if (arg3) {
                this.field438.field4772 = true;
                this.field438.field4769 = var57;
                this.field438.field4761 = null;
                this.field438.field4778 = var6;
            }
            if (arg4) {
                this.field442.field4772 = true;
                this.field442.field4769 = var57;
                this.field442.field4761 = null;
                this.field442.field4778 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "()V", line = 1897)
    public final void method206() {
        for (int var1 = 0; var1 < this.field407; var1++) {
            this.field418[var1] = -this.field418[var1];
        }
        if (this.field449 != null) {
            for (int var2 = 0; var2 < this.field421; var2++) {
                this.field449[var2] = (short) (-this.field449[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field430; var3++) {
            short var4 = this.field429[var3];
            this.field429[var3] = this.field433[var3];
            this.field433[var3] = var4;
        }
        this.field428.field4614 = false;
        this.field419.field4772 = false;
        if (this.field438 != null) {
            this.field438.field4772 = false;
        }
        this.field447.field4772 = false;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILwc;[[I[[IIII)V", line = 1933)
    public final void method207(int arg0, int arg1, class30 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field428.field4614) {
            arg2.method197();
        }
        int var9 = arg2.field428.field4617 + arg5;
        int var10 = arg2.field428.field4616 + arg5;
        int var11 = arg2.field428.field4619 + arg7;
        int var12 = arg2.field428.field4612 + arg7;
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
            for (int var17 = 0; var17 < this.field407; var17++) {
                int var18 = this.field427[var17] + arg5;
                int var19 = this.field418[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field422[var17] = this.field422[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field428.field4618;
            for (int var28 = 0; var28 < this.field407; var28++) {
                int var29 = (this.field422[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field427[var28] + arg5;
                    int var31 = this.field418[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field422[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method1109(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field428.field4615 - arg2.field428.field4618;
            for (int var42 = 0; var42 < this.field407; var42++) {
                int var43 = this.field427[var42] + arg5;
                int var44 = this.field418[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field422[var42] = var51 + this.field422[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field428.field4615 - arg2.field428.field4618;
            for (int var53 = 0; var53 < this.field407; var53++) {
                int var54 = this.field427[var53] + arg5;
                int var55 = this.field418[var53] + arg7;
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
                this.field422[var53] = ((this.field422[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field419.field4772 = false;
        this.field428.field4614 = false;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIFFF)[F", line = 2131)
    private static final float[] method208(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
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

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIIIJILab;)V", line = 2204)
    public final void method209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class295 arg10) {
        if (this.field421 == 0) {
            return;
        }
        if (!this.field428.field4614) {
            this.method197();
        }
        short var13 = this.field428.field4613;
        short var14 = this.field428.field4618;
        short var15 = this.field428.field4615;
        if (arg10 != null) {
            arg10.method2039(arg0, arg9, arg5, arg6, arg7);
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
        if (var21 / var18 <= class109.field1951) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class287.field4828) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class281.field4722) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class16.field146) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class102.field1813[arg0];
            var27 = class102.field1819[arg0];
        }
        if (arg8 > 0L && class219.field3797 && var19 > 0) {
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
            if (class164.field2873 >= var28 && class164.field2873 <= var29 && class291.field4884 >= var30 && class291.field4884 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field428.field4617;
                short var37 = this.field428.field4616;
                short var38 = this.field428.field4619;
                short var39 = this.field428.field4612;
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
                if (class164.field2873 >= var32 && class164.field2873 <= var33 && class291.field4884 >= var34 && class291.field4884 <= var35) {
                    if (this.field2652) {
                        class160.field2783[class179.field3064++] = arg8;
                    } else {
                        if (field457.length < this.field421) {
                            field457 = new int[this.field421];
                            field462 = new int[this.field421];
                        }
                        int var59 = 0;
                        label124: while (true) {
                            if (var59 >= this.field407) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field430) {
                                        break label124;
                                    }
                                    short var80 = this.field429[var79];
                                    short var81 = this.field431[var79];
                                    short var82 = this.field433[var79];
                                    if (this.method228(class164.field2873, class291.field4884, field462[var80], field462[var81], field462[var82], field457[var80], field457[var81], field457[var82])) {
                                        class160.field2783[class179.field3064++] = arg8;
                                        break label124;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field427[var59];
                            int var61 = this.field422[var59];
                            int var62 = this.field418[var59];
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
                            int var75 = this.field445[var59];
                            int var76 = this.field445[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field410[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field457[var78] = var73;
                                field462[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class147.field2479;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method191();
        var83.glRotatef((float) (-arg0) * 0.17578125F, 0.0F, 1.0F, 0.0F);
        var83.glTranslatef((float) (-arg5), (float) (-arg6), (float) (-arg7));
        if (arg10 != null) {
            arg10.method2027(arg0, arg1, arg2, arg3, arg4, arg9, arg5, arg6, arg7);
        }
        var83.glPopMatrix();
    }

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "()V", line = 2491)
    public final void method210() {
        for (int var1 = 0; var1 < this.field407; var1++) {
            int var2 = this.field427[var1];
            this.field427[var1] = this.field418[var1];
            this.field418[var1] = -var2;
        }
        this.field428.field4614 = false;
        this.field419.field4772 = false;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lwl;IJIIIIFF)S", line = 2506)
    private final short method211(class174 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field445[arg1];
        int var12 = this.field445[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field410[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field424[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field410[var13] = (short) (this.field421 + 1);
        field424[var13] = arg2;
        this.field416[this.field421] = (short) arg3;
        this.field437[this.field421] = (short) arg4;
        this.field449[this.field421] = (short) arg5;
        this.field414[this.field421] = (short) arg6;
        this.field432[this.field421] = arg7;
        this.field415[this.field421] = arg8;
        return (short) (this.field421++);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(SS)V", line = 2543)
    public final void method212(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field430; var3++) {
            if (this.field434[var3] == arg0) {
                this.field434[var3] = arg1;
            }
        }
        this.field435.field4772 = false;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZZZZZZZ)V", line = 2555)
    public final void method213(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field446 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field421 != 0) {
            if (arg6) {
                boolean var8 = !this.field435.field4772 && (arg1 || arg2 && !class75.field1303);
                this.method205(false, !this.field419.field4772 && arg0, var8, this.field438 != null && !this.field438.field4772 && arg2, !this.field442.field4772 && arg3);
                if (!this.field447.field4772 && arg4 && arg1) {
                    this.method232();
                }
            }
            if (arg0) {
                if (this.field419.field4772) {
                    this.field427 = null;
                    this.field422 = null;
                    this.field418 = null;
                    this.field410 = null;
                    this.field445 = null;
                } else {
                    this.field412 = (byte) (this.field412 | 0x1);
                }
            }
            if (arg1) {
                if (this.field435.field4772) {
                    this.field434 = null;
                    this.field413 = null;
                } else {
                    this.field412 = (byte) (this.field412 | 0x2);
                }
            }
            if (arg2 && class75.field1303) {
                if (this.field438.field4772) {
                    this.field416 = null;
                    this.field437 = null;
                    this.field449 = null;
                    this.field414 = null;
                } else {
                    this.field412 = (byte) (this.field412 | 0x4);
                }
            }
            if (arg3) {
                if (this.field442.field4772) {
                    this.field432 = null;
                    this.field415 = null;
                } else {
                    this.field412 = (byte) (this.field412 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field447.field4772 && this.field435.field4772) {
                    this.field429 = null;
                    this.field431 = null;
                    this.field433 = null;
                } else {
                    this.field412 = (byte) (this.field412 | 0x10);
                }
            }
            if (arg5) {
                this.field411 = null;
                this.field426 = null;
                this.field441 = (int[][]) null;
                this.field420 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "()I", line = 2647)
    public final int method214() {
        if (!this.field428.field4614) {
            this.method197();
        }
        return this.field428.field4617;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ISIB)I", line = 2654)
    private static final int method215(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class102.field1805[class318.method2180(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class102.field1821.method632(arg1 & 0xFFFF, (byte) -79);
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
            int var9 = class102.field1821.method634(arg1 & 0xFFFF, 64);
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

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)V", line = 2720)
    public final void method216(int arg0) {
        this.field440 = (short) arg0;
        this.field435.field4772 = false;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V", line = 2725)
    public final void method217(int arg0) {
        int var2 = class102.field1813[arg0];
        int var3 = class102.field1819[arg0];
        for (int var4 = 0; var4 < this.field407; var4++) {
            int var5 = this.field422[var4] * var3 - this.field418[var4] * var2 >> 16;
            this.field418[var4] = this.field422[var4] * var2 + this.field418[var4] * var3 >> 16;
            this.field422[var4] = var5;
        }
        this.field428.field4614 = false;
        this.field419.field4772 = false;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII)V", line = 2745)
    private final void method218(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field455 = 0;
            field459 = 0;
            field464 = 0;
            for (int var6 = 0; var6 < this.field407; var6++) {
                field455 += this.field427[var6];
                field459 += this.field422[var6];
                field464 += this.field418[var6];
                var5++;
            }
            if (var5 > 0) {
                field455 = field455 / var5 + arg1;
                field459 = field459 / var5 + arg2;
                field464 = field464 / var5 + arg3;
            } else {
                field455 = arg1;
                field459 = arg2;
                field464 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field407; var7++) {
                this.field427[var7] += arg1;
                this.field422[var7] += arg2;
                this.field418[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field407; var8++) {
                this.field427[var8] -= field455;
                this.field422[var8] -= field459;
                this.field418[var8] -= field464;
                if (arg3 != 0) {
                    int var9 = class102.field1813[arg3];
                    int var10 = class102.field1819[arg3];
                    int var11 = this.field427[var8] * var10 + this.field422[var8] * var9 + 32767 >> 16;
                    this.field422[var8] = this.field422[var8] * var10 + 32767 - this.field427[var8] * var9 >> 16;
                    this.field427[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class102.field1813[arg1];
                    int var13 = class102.field1819[arg1];
                    int var14 = this.field422[var8] * var13 + 32767 - this.field418[var8] * var12 >> 16;
                    this.field418[var8] = this.field422[var8] * var12 + this.field418[var8] * var13 + 32767 >> 16;
                    this.field422[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class102.field1813[arg2];
                    int var16 = class102.field1819[arg2];
                    int var17 = this.field427[var8] * var16 + this.field418[var8] * var15 + 32767 >> 16;
                    this.field418[var8] = this.field418[var8] * var16 + 32767 - this.field427[var8] * var15 >> 16;
                    this.field427[var8] = var17;
                }
                this.field427[var8] += field455;
                this.field422[var8] += field459;
                this.field418[var8] += field464;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field407; var18++) {
                this.field427[var18] -= field455;
                this.field422[var18] -= field459;
                this.field418[var18] -= field464;
                this.field427[var18] = this.field427[var18] * arg1 / 128;
                this.field422[var18] = this.field422[var18] * arg2 / 128;
                this.field418[var18] = this.field418[var18] * arg3 / 128;
                this.field427[var18] += field455;
                this.field422[var18] += field459;
                this.field418[var18] += field464;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field430; var19++) {
                int var20 = (this.field413[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field413[var19] = (byte) var20;
            }
            this.field435.field4772 = false;
        }
    }

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "()V", line = 2902)
    public final void method219() {
        if (this.field416 == null) {
            this.method201();
            return;
        }
        for (int var1 = 0; var1 < this.field407; var1++) {
            this.field427[var1] = -this.field427[var1];
            this.field418[var1] = -this.field418[var1];
        }
        for (int var2 = 0; var2 < this.field421; var2++) {
            this.field416[var2] = (short) (-this.field416[var2]);
            this.field449[var2] = (short) (-this.field449[var2]);
        }
        this.field428.field4614 = false;
        this.field419.field4772 = false;
        if (this.field438 != null) {
            this.field438.field4772 = false;
        }
    }

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "(I)V", line = 2935)
    public final void method220(int arg0) {
        if (this.field416 == null) {
            this.method240(arg0);
            return;
        }
        int var2 = class102.field1813[arg0];
        int var3 = class102.field1819[arg0];
        for (int var4 = 0; var4 < this.field407; var4++) {
            int var5 = this.field427[var4] * var3 + this.field418[var4] * var2 >> 16;
            this.field418[var4] = this.field418[var4] * var3 - this.field427[var4] * var2 >> 16;
            this.field427[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field421; var6++) {
            int var7 = this.field449[var6] * var2 + this.field416[var6] * var3 >> 16;
            this.field449[var6] = (short) (this.field449[var6] * var3 - this.field416[var6] * var2 >> 16);
            this.field416[var6] = (short) var7;
        }
        this.field428.field4614 = false;
        this.field419.field4772 = false;
        if (this.field438 != null) {
            this.field438.field4772 = false;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 2976)
    private static final void method221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
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
        field454 = var18;
        field460 = var19;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "()I", line = 3054)
    public final int method222() {
        if (!this.field428.field4614) {
            this.method197();
        }
        return this.field428.field4613;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)Lrm;", line = 3060)
    public final class175 method223(int arg0, int arg1, int arg2) {
        this.field425 = false;
        if (this.field443 != null) {
            this.field416 = this.field443.field3725;
            this.field437 = this.field443.field3724;
            this.field449 = this.field443.field3723;
            this.field414 = this.field443.field3722;
            this.field443 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(III)V", line = 3076)
    public final void method224(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field407; var4++) {
            this.field427[var4] += arg0;
            this.field422[var4] += arg1;
            this.field418[var4] += arg2;
        }
        this.field428.field4614 = false;
        this.field419.field4772 = false;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lpb;I)V", line = 3089)
    public final void method225(class290 arg0, int arg1) {
        if (this.field441 == null || arg1 == -1) {
            return;
        }
        class148 var3 = arg0.field4878[arg1];
        class159 var4 = var3.field2512;
        field455 = 0;
        field459 = 0;
        field464 = 0;
        for (int var5 = 0; var5 < var3.field2516; var5++) {
            short var6 = var3.field2518[var5];
            if (var4.field2755[var6]) {
                if (var3.field2514[var5] != -1) {
                    this.method218(0, 0, 0, 0);
                }
                this.method218(var4.field2758[var6], var3.field2521[var5], var3.field2522[var5], var3.field2513[var5]);
            }
        }
        this.field419.field4772 = false;
        this.field428.field4614 = false;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIII[FIF)V", line = 3126)
    private static final void method226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
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
        field456 = var16;
        field458 = var17;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(FFF)I", line = 3171)
    private static final int method227(float arg0, float arg1, float arg2) {
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

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIII)Z", line = 3205)
    private final boolean method228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIII[FFIF)V", line = 3223)
    private static final void method229(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
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
        field463 = var16;
        field461 = var17;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "()V", line = 3270)
    public final void method230() {
        for (int var1 = 0; var1 < this.field407; var1++) {
            int var2 = this.field418[var1];
            this.field418[var1] = this.field427[var1];
            this.field427[var1] = -var2;
        }
        this.field428.field4614 = false;
        this.field419.field4772 = false;
    }

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "()I", line = 3286)
    public final int method231() {
        return this.field423;
    }

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "()V", line = 3290)
    private final void method232() {
        if (field409.field2598.length < this.field421 * 12) {
            field409 = new class153((this.field421 + 100) * 12);
        } else {
            field409.field2611 = 0;
        }
        if (class147.field2482) {
            for (int var1 = 0; var1 < this.field430; var1++) {
                field409.method1065(178808912, this.field429[var1]);
                field409.method1065(178808912, this.field431[var1]);
                field409.method1065(178808912, this.field433[var1]);
            }
        } else {
            for (int var2 = 0; var2 < this.field430; var2++) {
                field409.method1063(this.field429[var2], 4);
                field409.method1063(this.field431[var2], 4);
                field409.method1063(this.field433[var2], 4);
            }
        }
        if (!class147.field2510) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field409.field2611);
            var5.put(field409.field2598, 0, field409.field2611);
            var5.flip();
            this.field447.field4772 = true;
            this.field447.field4769 = var5;
            this.field447.field4761 = null;
            return;
        }
        class46 var3 = new class46();
        ByteBuffer var4 = ByteBuffer.wrap(field409.field2598, 0, field409.field2611);
        var3.method338(var4);
        this.field447.field4772 = true;
        this.field447.field4769 = null;
        this.field447.field4761 = var3;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lti;)Lti;", line = 3349)
    public final class186 method233(class186 arg0) {
        if (this.field421 == 0) {
            return null;
        }
        if (!this.field428.field4614) {
            this.method197();
        }
        int var2;
        int var3;
        if (class85.field1525 > 0) {
            var2 = this.field428.field4617 - (class85.field1525 * this.field428.field4615 >> 8) >> 3;
            var3 = this.field428.field4616 - (class85.field1525 * this.field428.field4618 >> 8) >> 3;
        } else {
            var2 = this.field428.field4617 - (class85.field1525 * this.field428.field4618 >> 8) >> 3;
            var3 = this.field428.field4616 - (class85.field1525 * this.field428.field4615 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class85.field1532 > 0) {
            var4 = this.field428.field4619 - (class85.field1532 * this.field428.field4615 >> 8) >> 3;
            var5 = this.field428.field4612 - (class85.field1532 * this.field428.field4618 >> 8) >> 3;
        } else {
            var4 = this.field428.field4619 - (class85.field1532 * this.field428.field4618 >> 8) >> 3;
            var5 = this.field428.field4612 - (class85.field1532 * this.field428.field4615 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class186 var8;
        if (arg0 == null || arg0.field3139.length < var6 * var7) {
            var8 = new class186(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field3715 = arg0.field3711 = var6;
            arg0.field3721 = arg0.field3718 = var7;
            arg0.method1276();
        }
        var8.field3720 = var2;
        var8.field3709 = var4;
        if (field457.length < this.field421) {
            field457 = new int[this.field421];
            field462 = new int[this.field421];
        }
        for (int var9 = 0; var9 < this.field407; var9++) {
            int var10 = (this.field427[var9] - (this.field422[var9] * class85.field1525 >> 8) >> 3) - var2;
            int var11 = (this.field418[var9] - (this.field422[var9] * class85.field1532 >> 8) >> 3) - var4;
            int var12 = this.field445[var9];
            int var13 = this.field445[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field410[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field457[var15] = var10;
                field462[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field430; var16++) {
            if (this.field413[var16] <= 128) {
                short var17 = this.field429[var16];
                short var18 = this.field431[var16];
                short var19 = this.field433[var16];
                int var20 = field457[var17];
                int var21 = field457[var18];
                int var22 = field457[var19];
                int var23 = field462[var17];
                int var24 = field462[var18];
                int var25 = field462[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class102.method688(var8.field3139, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "()Z", line = 3475)
    public final boolean method234() {
        return this.field425 && this.field427 != null && this.field416 != null;
    }

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "()V", line = 3478)
    public static final void method235() {
        field448 = new class30();
        field451 = new class30();
        field452 = new class30();
        field453 = new class30();
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(SS)V", line = 3486)
    public final void method236(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field430; var3++) {
            if (this.field417[var3] == arg0) {
                this.field417[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class102.field1821.method632(arg0 & 0xFFFF, (byte) -71);
            var5 = class102.field1821.method634(arg0 & 0xFFFF, 64);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class102.field1821.method632(arg1 & 0xFFFF, (byte) -40);
            var7 = class102.field1821.method634(arg1 & 0xFFFF, 64);
        }
        if (var4 != var6 || var5 != var7) {
            this.field435.field4772 = false;
        }
    }

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "()I", line = 3520)
    public final int method237() {
        if (!this.field428.field4614) {
            this.method197();
        }
        return this.field428.field4612;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "()I", line = 3529)
    public final int method238() {
        if (!this.field428.field4614) {
            this.method197();
        }
        return this.field428.field4618;
    }

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "()I", line = 3535)
    public final int method239() {
        return this.field440;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V", line = 3539)
    public final void method240(int arg0) {
        int var2 = class102.field1813[arg0];
        int var3 = class102.field1819[arg0];
        for (int var4 = 0; var4 < this.field407; var4++) {
            int var5 = this.field427[var4] * var3 + this.field418[var4] * var2 >> 16;
            this.field418[var4] = this.field418[var4] * var3 - this.field427[var4] * var2 >> 16;
            this.field427[var4] = var5;
        }
        this.field428.field4614 = false;
        this.field419.field4772 = false;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V", line = 3559)
    public final void method241(int arg0) {
        int var2 = class102.field1813[arg0];
        int var3 = class102.field1819[arg0];
        for (int var4 = 0; var4 < this.field407; var4++) {
            int var5 = this.field427[var4] * var3 + this.field422[var4] * var2 >> 16;
            this.field422[var4] = this.field422[var4] * var3 - this.field427[var4] * var2 >> 16;
            this.field427[var4] = var5;
        }
        this.field428.field4614 = false;
        this.field419.field4772 = false;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZZLwc;Lwc;)Lpa;", line = 3584)
    private final class155 method242(boolean arg0, boolean arg1, class30 arg2, class30 arg3) {
        arg2.field407 = this.field407;
        arg2.field421 = this.field421;
        arg2.field430 = this.field430;
        arg2.field440 = this.field440;
        arg2.field423 = this.field423;
        arg2.field446 = (byte) ((arg0 ? 0 : 2) | 0x1 | (arg1 ? 0 : 4));
        if (arg2.field427 == null || arg2.field427.length < this.field407) {
            arg2.field427 = new int[this.field407 + 100];
            arg2.field422 = new int[this.field407 + 100];
            arg2.field418 = new int[this.field407 + 100];
        }
        for (int var5 = 0; var5 < this.field407; var5++) {
            arg2.field427[var5] = this.field427[var5];
            arg2.field422[var5] = this.field422[var5];
            arg2.field418[var5] = this.field418[var5];
        }
        if (arg2.field419 == null) {
            arg2.field419 = new class284();
        }
        arg2.field419.field4772 = false;
        if (arg2.field428 == null) {
            arg2.field428 = new class274();
        }
        arg2.field428.field4614 = false;
        if (arg0) {
            arg2.field413 = this.field413;
            arg2.field435 = this.field435;
        } else {
            if (arg3.field413 == null || arg3.field413.length < this.field430) {
                arg3.field413 = new byte[this.field430 + 100];
            }
            arg2.field413 = arg3.field413;
            for (int var6 = 0; var6 < this.field430; var6++) {
                arg2.field413[var6] = this.field413[var6];
            }
            if (arg3.field435 == null) {
                arg3.field435 = new class284();
            }
            arg2.field435 = arg3.field435;
            arg2.field435.field4772 = false;
        }
        if (arg1) {
            arg2.field416 = this.field416;
            arg2.field437 = this.field437;
            arg2.field449 = this.field449;
            arg2.field414 = this.field414;
            arg2.field438 = this.field438;
        } else {
            if (arg3.field416 == null || arg3.field416.length < this.field421) {
                arg3.field416 = new short[this.field421 + 100];
                arg3.field437 = new short[this.field421 + 100];
                arg3.field449 = new short[this.field421 + 100];
                arg3.field414 = new short[this.field421 + 100];
            }
            arg2.field416 = arg3.field416;
            arg2.field437 = arg3.field437;
            arg2.field449 = arg3.field449;
            arg2.field414 = arg3.field414;
            for (int var7 = 0; var7 < this.field421; var7++) {
                arg2.field416[var7] = this.field416[var7];
                arg2.field437[var7] = this.field437[var7];
                arg2.field449[var7] = this.field449[var7];
                arg2.field414[var7] = this.field414[var7];
            }
            if (class75.field1303) {
                if (arg3.field438 == null) {
                    arg3.field438 = new class284();
                }
                arg2.field438 = arg3.field438;
                arg2.field438.field4772 = false;
            } else {
                arg2.field438 = null;
            }
        }
        arg2.field432 = this.field432;
        arg2.field415 = this.field415;
        arg2.field411 = this.field411;
        arg2.field441 = this.field441;
        arg2.field434 = this.field434;
        arg2.field429 = this.field429;
        arg2.field431 = this.field431;
        arg2.field433 = this.field433;
        arg2.field417 = this.field417;
        arg2.field426 = this.field426;
        arg2.field420 = this.field420;
        arg2.field442 = this.field442;
        arg2.field447 = this.field447;
        arg2.field439 = this.field439;
        arg2.field410 = this.field410;
        arg2.field445 = this.field445;
        arg2.field2652 = this.field2652;
        arg2.field408 = this.field408;
        arg2.field436 = this.field436;
        return arg2;
    }

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "()V", line = 3717)
    public final void method243() {
        if (this.field416 == null) {
            this.method230();
            return;
        }
        for (int var1 = 0; var1 < this.field407; var1++) {
            int var2 = this.field418[var1];
            this.field418[var1] = this.field427[var1];
            this.field427[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field421; var3++) {
            short var4 = this.field449[var3];
            this.field449[var3] = this.field416[var3];
            this.field416[var3] = (short) (-var4);
        }
        this.field428.field4614 = false;
        this.field419.field4772 = false;
        if (this.field438 != null) {
            this.field438.field4772 = false;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZZ)Lpa;", line = 3759)
    public final class155 method244(boolean arg0, boolean arg1) {
        return this.method242(arg0, arg1, field451, field448);
    }
}
