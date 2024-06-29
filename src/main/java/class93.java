import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class93 {

    @OriginalMember(owner = "client!cea", name = "j", descriptor = "Lkw;")
    private class346 field1335;

    @OriginalMember(owner = "client!cea", name = "g", descriptor = "Lmt;")
    private class410 field1332;

    @OriginalMember(owner = "client!cea", name = "q", descriptor = "I")
    public int field1342;

    @OriginalMember(owner = "client!cea", name = "n", descriptor = "I")
    private int field1339;

    @OriginalMember(owner = "client!cea", name = "h", descriptor = "I")
    private int field1333;

    @OriginalMember(owner = "client!cea", name = "i", descriptor = "[B")
    public byte[] field1334;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "I")
    private int field1326;

    @OriginalMember(owner = "client!cea", name = "l", descriptor = "I")
    private int field1337;

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "[C")
    public static char[] field1328 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!cea", name = "p", descriptor = "Lgr;")
    public static class530 field1341 = new class530(40, -1);

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!cea", name = "d", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!cea", name = "e", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!cea", name = "f", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!cea", name = "o", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!cea", name = "r", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!cea", name = "s", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!cea", name = "m", descriptor = "Llc;")
    public static class435 field1338;

    @OriginalMember(owner = "client!cea", name = "k", descriptor = "[[Ltv;")
    private class78[][] field1336;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)V", line = 3)
    public final void method716(int arg0) {
        int var2 = 53 % ((8 - arg0) / 61);
        this.field1336 = new class78[this.field1326][this.field1337];
        field1330++;
        for (int var3 = 0; var3 < this.field1337; var3++) {
            for (int var4 = 0; var4 < this.field1326; var4++) {
                this.field1336[var4][var3] = new class78(this.field1335, this, this.field1332, var4, var3, this.field1333, var4 * 128 + 1, var3 * 128 - -1);
            }
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IILr;I)Z", line = 35)
    public final boolean method717(int arg0, int arg1, class704 arg2, int arg3) {
        field1327++;
        class256 var5 = (class256) arg2;
        int var6 = var5.field3676 + arg1 + 1;
        int var7 = var5.field3677 + arg0 + 1;
        int var8 = this.field1342 * var7 + var6;
        int var9 = -109 % ((21 - arg3) / 50);
        int var10 = var5.field3672;
        int var11 = var5.field3680;
        int var12 = this.field1342 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var10 -= var13;
            var7 = 1;
            var8 += this.field1342 * var13;
        }
        if (this.field1339 <= (var7 + var10)) {
            int var14 = var7 + var10 + 1 - this.field1339;
            var10 -= var14;
        }
        if (var6 <= 0) {
            int var15 = 1 - var6;
            var6 = 1;
            var11 -= var15;
            var8 += var15;
            var12 += var15;
        }
        if (this.field1342 <= (var6 + var11)) {
            int var16 = var6 + var11 + 1 - this.field1342;
            var12 += var16;
            var11 -= var16;
        }
        if (var11 > 0 && var10 > 0) {
            byte var17 = 8;
            int var18 = (var17 - 1) * this.field1342 + var12;
            return class500.method3041((byte) 15, var17, this.field1334, var11, var18, var8, var10);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIIII)V", line = 107)
    private final void method718(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1343++;
        if (this.field1336 == null) {
            return;
        }
        int var6 = arg4 - 1 >> 7;
        int var7 = arg1 + arg4 - 1 - 1 >> 7;
        int var8 = arg2 - 1 >> 7;
        int var9 = arg2 - (1 - arg0) - 1 >> 7;
        if (arg3 != 402) {
            this.method721(-45, true, null, -121, 101, -106);
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class78[] var11 = this.field1336[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field1118 = true;
            }
        }
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(I)V", line = 148)
    public static void method719(int arg0) {
        field1338 = null;
        if (arg0 != 1) {
            method722(-99, -51);
        }
        field1328 = null;
        field1341 = null;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lr;IBI)V", line = 160)
    public final void method720(class704 arg0, int arg1, byte arg2, int arg3) {
        field1329++;
        class256 var5 = (class256) arg0;
        int var6 = var5.field3676 + arg3 + 1;
        int var7 = var5.field3677 + arg1 + 1;
        int var8 = var6 + (this.field1342 * var7);
        if (arg2 != -55) {
            this.method721(-20, true, null, -31, -34, -102);
        }
        int var9 = 0;
        int var10 = var5.field3672;
        int var11 = var5.field3680;
        int var12 = this.field1342 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var9 += var11 * var14;
            var10 -= var14;
            var7 = 1;
            var8 += this.field1342 * var14;
        }
        if (this.field1339 <= var7 + var10) {
            int var15 = var7 + var10 + 1 - this.field1339;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var9 += var16;
            var8 += var16;
            var13 += var16;
            var6 = 1;
            var11 -= var16;
            var12 += var16;
        }
        if ((var6 + var11) >= this.field1342) {
            int var17 = var6 + var11 + 1 - this.field1342;
            var13 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class705.method3951(var5.field3678, var10, var12, var13, var9, var11, this.field1334, (byte) -51, var8);
            this.method718(var10, var11, var7, 402, var6);
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IZ[[ZIII)V", line = 234)
    public final void method721(int arg0, boolean arg1, boolean[][] arg2, int arg3, int arg4, int arg5) {
        this.field1335.method2142(false, (byte) -115);
        field1344++;
        this.field1335.method2160(false, 65);
        this.field1335.method2176(-2, 78);
        this.field1335.method2120(1, 88);
        this.field1335.method2138(27032, 1);
        float var7 = 1.0F / (float) (this.field1335.field4971 * 128);
        int var8 = 10 / ((78 - arg4) / 42);
        if (arg1) {
            for (int var9 = 0; var9 < this.field1337; var9++) {
                int var10 = var9 << this.field1333;
                int var11 = var9 + 1 << this.field1333;
                label132: for (int var12 = 0; var12 < this.field1326; var12++) {
                    int var13 = var12 << this.field1333;
                    int var14 = var12 + 1 << this.field1333;
                    for (int var15 = var13; var15 < var14; var15++) {
                        if (-arg3 <= var15 - arg0 && arg3 >= (var15 - arg0)) {
                            for (int var16 = var10; var16 < var11; var16++) {
                                if ((-arg3) <= (var16 - arg5) && var16 - arg5 <= arg3 && arg2[var15 + arg3 - arg0][arg3 + var16 - arg5]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var12) / var7, (float) (-var9) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field1336[var12][var9].method646(-73);
                                    continue label132;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field1337; var17++) {
                int var18 = var17 << this.field1333;
                int var19 = var17 + 1 << this.field1333;
                for (int var20 = 0; var20 < this.field1326; var20++) {
                    int var21 = 0;
                    int var22 = var20 << this.field1333;
                    int var23 = var20 + 1 << this.field1333;
                    class212 var24 = this.field1335.field5093;
                    var24.field6864 = 0;
                    for (int var25 = var18; var25 < var19; var25++) {
                        if (-arg3 <= var25 - arg5 && arg3 >= (var25 - arg5)) {
                            int var26 = this.field1332.field4679 * var25 + var22;
                            for (int var27 = var22; var27 < var23; var27++) {
                                if ((var27 - arg0) >= (-arg3) && arg3 >= (var27 - arg0) && arg2[arg3 + var27 - arg0][var25 + arg3 - arg5]) {
                                    short[] var28 = this.field1332.field5844[var26];
                                    if (var28 != null) {
                                        if (this.field1335.field5047) {
                                            for (int var30 = 0; var30 < var28.length; var30++) {
                                                var21++;
                                                var24.method2862(var28[var30] & 0xFFFF, -1166933656);
                                            }
                                        } else {
                                            for (int var29 = 0; var29 < var28.length; var29++) {
                                                var24.method2918(var28[var29] & 0xFFFF, (byte) 48);
                                                var21++;
                                            }
                                        }
                                    }
                                }
                                var26++;
                            }
                        }
                    }
                    if (var21 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var7, var7, 1.0F);
                        OpenGL.glTranslatef((float) (-var20) / var7, (float) (-var17) / var7, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field1336[var20][var17].method642(var21, 512, 5123, var24.field6800);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(II)I", line = 419)
    public static final int method722(int arg0, int arg1) {
        if (arg0 == 8230) {
            field1331++;
            return arg1 >>> 7;
        } else {
            return -44;
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILr;II)V", line = 437)
    public final void method723(int arg0, class704 arg1, int arg2, int arg3) {
        field1340++;
        class256 var5 = (class256) arg1;
        int var6 = var5.field3677 + arg3 + 1;
        int var7 = var5.field3676 + arg0 + 1;
        int var8 = this.field1342 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field3672;
        int var11 = var5.field3680;
        int var12 = this.field1342 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var9 += var11 * var14;
            var10 -= var14;
            var6 = 1;
            var8 += this.field1342 * var14;
        }
        if ((var6 + var10) >= this.field1339) {
            int var15 = var6 - (-var10 - 1) - this.field1339;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var8 += var16;
            var12 += var16;
            var7 = 1;
            var13 += var16;
            var11 -= var16;
            var9 += var16;
        }
        if (this.field1342 <= var7 + var11) {
            int var17 = var7 + var11 + 1 - this.field1342;
            var11 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (arg2 == 21494 && var11 > 0 && var10 > 0) {
            class509.method3101(this.field1334, var8, var12, var5.field3678, var10, var11, 3, var13, var9);
            this.method718(var10, var11, var6, 402, var7);
        }
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lkw;Lmt;)V", line = 513)
    public class93(class346 arg0, class410 arg1) {
        this.field1335 = arg0;
        this.field1332 = arg1;
        this.field1342 = (this.field1332.field4679 * this.field1332.field4675 >> this.field1335.field4970) + 2;
        this.field1339 = (this.field1332.field4675 * this.field1332.field4672 >> this.field1335.field4970) + 2;
        this.field1333 = this.field1335.field4970 + 7 - this.field1332.field4674;
        this.field1334 = new byte[this.field1342 * this.field1339];
        this.field1326 = this.field1332.field4679 >> this.field1333;
        this.field1337 = this.field1332.field4672 >> this.field1333;
    }
}
