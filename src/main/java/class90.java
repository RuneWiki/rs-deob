import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class90 {

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "Lch;")
    private class38 field1270;

    @OriginalMember(owner = "client!lba", name = "g", descriptor = "Lcj;")
    private class443 field1276;

    @OriginalMember(owner = "client!lba", name = "s", descriptor = "I")
    public int field1288;

    @OriginalMember(owner = "client!lba", name = "o", descriptor = "I")
    private int field1284;

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "[B")
    public byte[] field1275;

    @OriginalMember(owner = "client!lba", name = "p", descriptor = "I")
    private int field1285;

    @OriginalMember(owner = "client!lba", name = "k", descriptor = "I")
    private int field1280;

    @OriginalMember(owner = "client!lba", name = "q", descriptor = "I")
    private int field1286;

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "[I")
    public static int[] field1273 = new int[3];

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!lba", name = "h", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!lba", name = "i", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!lba", name = "j", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!lba", name = "l", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!lba", name = "m", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!lba", name = "r", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!lba", name = "t", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!lba", name = "n", descriptor = "[[Ljfa;")
    private class702[][] field1283;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(BLr;II)V")
    public final void method697(byte arg0, class704 arg1, int arg2, int arg3) {
        field1274++;
        class416 var5 = (class416) arg1;
        int var6 = var5.field5914 + arg2 + 1;
        int var7 = var5.field5909 + arg3 + 1;
        int var8 = this.field1288 * var6 + var7;
        int var9 = 0;
        if (arg0 != 35) {
            return;
        }
        int var10 = var5.field5913;
        int var11 = var5.field5918;
        int var12 = this.field1288 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var9 += var11 * var13;
            var10 -= var13;
            var6 = 1;
            var8 += this.field1288 * var13;
        }
        int var14 = 0;
        if (this.field1284 <= (var6 + var10)) {
            int var15 = var6 + var10 + 1 - this.field1284;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var8 += var16;
            var14 += var16;
            var7 = 1;
            var11 -= var16;
            var12 += var16;
            var9 += var16;
        }
        if ((var7 + var11) >= this.field1288) {
            int var17 = var11 + var7 + 1 - this.field1288;
            var11 -= var17;
            var12 += var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class589.method3466(var8, var5.field5907, var11, -11477, var14, var9, var10, var12, this.field1275);
            this.method701(var7, (byte) 102, var11, var10, var6);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IILr;I)V")
    public final void method698(int arg0, int arg1, class704 arg2, int arg3) {
        field1271++;
        class416 var5 = (class416) arg2;
        int var6 = var5.field5909 + arg0 + 1;
        int var7 = var5.field5914 + arg3 + 1;
        int var8 = var6 + (this.field1288 * var7);
        int var9 = 0;
        if (arg1 != 24864) {
            return;
        }
        int var10 = var5.field5913;
        int var11 = var5.field5918;
        int var12 = this.field1288 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += this.field1288 * var14;
            var9 += var11 * var14;
            var10 -= var14;
            var7 = 1;
        }
        if (this.field1284 <= var7 + var10) {
            int var15 = var7 - (-var10 - 1) - this.field1284;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var12 += var16;
            var9 += var16;
            var13 += var16;
            var8 += var16;
            var11 -= var16;
            var6 = 1;
        }
        if (var6 + var11 >= this.field1288) {
            int var17 = var6 + var11 + 1 - this.field1288;
            var12 += var17;
            var11 -= var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class181.method1280(this.field1275, var11, (byte) 117, var8, var12, var5.field5907, var10, var13, var9);
            this.method701(var6, (byte) -92, var11, var10, var7);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "([[ZIIBIZ)V")
    public final void method699(boolean[][] arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5) {
        field1281++;
        this.field1270.method299(true, false);
        this.field1270.method308(0, false);
        this.field1270.method355(1, (byte) -57);
        if (arg3 > -105) {
            return;
        }
        this.field1270.method411(17024, 1);
        this.field1270.method223(false, false, false, -2);
        float var7 = 1.0F / (float) (this.field1270.field596 * 128);
        if (arg5) {
            for (int var8 = 0; var8 < this.field1286; var8++) {
                int var9 = var8 << this.field1285;
                int var10 = var8 + 1 << this.field1285;
                label145: for (int var11 = 0; var11 < this.field1280; var11++) {
                    if (this.field1283[var11][var8] != null) {
                        int var12 = var11 << this.field1285;
                        int var13 = var11 + 1 << this.field1285;
                        for (int var14 = var12; var14 < var13; var14++) {
                            if ((var14 - arg1) >= (-arg2) && (var14 - arg1) <= arg2) {
                                for (int var15 = var9; var15 < var10; var15++) {
                                    if ((var15 - arg4) >= (-arg2) && arg2 >= (var15 - arg4) && arg0[var14 + arg2 - arg1][var15 + arg2 - arg4]) {
                                        class417 var16 = this.field1270.method381((byte) 42);
                                        var16.method2522(var7, 1.0F, 124, var7);
                                        var16.method849(-var11, -var8, 0);
                                        this.field1270.method238(124, class549.field7982);
                                        this.field1283[var11][var8].method3943(-1);
                                        continue label145;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field1286; var17++) {
                int var18 = var17 << this.field1285;
                int var19 = var17 + 1 << this.field1285;
                for (int var20 = 0; var20 < this.field1280; var20++) {
                    class702 var21 = this.field1283[var20][var17];
                    if (var21 != null) {
                        class33 var22 = this.field1270.method361(-38, var21.field9901 * 3);
                        Buffer var23 = var22.method177(true, (byte) -109);
                        if (var23 != null) {
                            Stream var24 = this.field1270.method325((byte) -120, var23);
                            int var25 = 0;
                            int var26 = var20 << this.field1285;
                            int var27 = var20 + 1 << this.field1285;
                            for (int var28 = var18; var28 < var19; var28++) {
                                if (-arg2 <= var28 - arg4 && (var28 - arg4) <= arg2) {
                                    int var30 = this.field1276.field4679 * var28 + var26;
                                    for (int var31 = var26; var31 < var27; var31++) {
                                        if (-arg2 <= var31 - arg1 && (var31 - arg1) <= arg2 && arg0[arg2 + var31 - arg1][arg2 + var28 - arg4]) {
                                            short[] var32 = this.field1276.field6306[var30];
                                            if (var32 != null) {
                                                if (Stream.method2551()) {
                                                    for (int var34 = 0; var34 < var32.length; var34++) {
                                                        var25++;
                                                        var24.method2561(var32[var34] & 0xFFFF);
                                                    }
                                                } else {
                                                    for (int var33 = 0; var33 < var32.length; var33++) {
                                                        var24.method2560(var32[var33] & 0xFFFF);
                                                        var25++;
                                                    }
                                                }
                                            }
                                        }
                                        var30++;
                                    }
                                }
                            }
                            var24.method2554();
                            if (var22.method178((byte) -105) && var25 > 0) {
                                class417 var29 = this.field1270.method381((byte) 42);
                                var29.method2522(var7, 1.0F, 124, var7);
                                var29.method849(-var20, -var17, 0);
                                this.field1270.method238(117, class549.field7982);
                                var21.method3946(-1, var22, var25 / 3);
                            }
                        }
                    }
                }
            }
        }
        this.field1270.method389((byte) -2);
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V")
    public final void method700(int arg0) {
        this.field1283 = new class702[this.field1280][this.field1286];
        field1277++;
        if (arg0 != 128) {
            this.method700(-92);
        }
        for (int var2 = 0; var2 < this.field1286; var2++) {
            for (int var3 = 0; var3 < this.field1280; var3++) {
                this.field1283[var3][var2] = new class702(this.field1270, this, this.field1276, var3, var2, this.field1285, var3 * 128 + 1, var2 * 128 - -1);
                if (this.field1283[var3][var2].field9901 == 0) {
                    this.field1283[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IBIII)V")
    private final void method701(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1289++;
        if (this.field1283 == null) {
            return;
        }
        int var6 = arg0 - 1 >> 7;
        int var7 = arg2 + arg0 - 1 - 1 >> 7;
        int var8 = 115 / ((-arg1 - 17) / 39);
        int var9 = arg4 - 1 >> 7;
        int var10 = arg3 + arg4 - 1 - 1 >> 7;
        for (int var11 = var6; var11 <= var7; var11++) {
            class702[] var12 = this.field1283[var11];
            for (int var13 = var9; var13 <= var10; var13++) {
                if (var12[var13] != null) {
                    var12[var13].field9896 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)V")
    public static void method702(int arg0) {
        field1273 = null;
        if (arg0 > -11) {
            method703(null, -22);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public static final void method703(Canvas arg0, int arg1) {
        field1272++;
        if (arg1 != -6993) {
            field1273 = null;
        }
        Dimension var2 = arg0.getSize();
        class56.method545(var2.width, var2.height, 0);
        if (class270.field3833 == 1) {
            class301.field4129.method314(arg0, class222.field3279, class492.field7090);
        } else {
            class301.field4129.method314(arg0, class271.field3851, class327.field4442);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IZI)Z")
    public static final boolean method704(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field1279 = -10;
        }
        field1278++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIILr;)Z")
    public final boolean method705(int arg0, int arg1, int arg2, class704 arg3) {
        field1282++;
        class416 var5 = (class416) arg3;
        int var6 = var5.field5914 + arg2 + 1;
        int var7 = var5.field5909 + arg0 + 1;
        int var8 = this.field1288 * var6 + var7;
        int var9 = var5.field5913;
        int var10 = 44 % ((-arg1 - 19) / 44);
        int var11 = var5.field5918;
        int var12 = this.field1288 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var9 -= var13;
            var8 += this.field1288 * var13;
            var6 = 1;
        }
        if (this.field1284 <= var6 + var9) {
            int var14 = var9 + var6 + 1 - this.field1284;
            var9 -= var14;
        }
        if (var7 <= 0) {
            int var15 = 1 - var7;
            var11 -= var15;
            var12 += var15;
            var8 += var15;
            var7 = 1;
        }
        if (this.field1288 <= var7 + var11) {
            int var16 = var7 + var11 + 1 - this.field1288;
            var11 -= var16;
            var12 += var16;
        }
        if (var11 > 0 && var9 > 0) {
            byte var17 = 8;
            int var18 = (var17 - 1) * this.field1288 + var12;
            return class136.method970(this.field1275, var11, 11364, var18, var17, var8, var9);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(Lch;Lcj;)V")
    public class90(class38 arg0, class443 arg1) {
        this.field1270 = arg0;
        this.field1276 = arg1;
        this.field1288 = (this.field1276.field4679 * this.field1276.field4675 >> this.field1270.field588) + 2;
        this.field1284 = (this.field1276.field4675 * this.field1276.field4672 >> this.field1270.field588) + 2;
        this.field1275 = new byte[this.field1288 * this.field1284];
        this.field1285 = this.field1270.field588 + 7 - this.field1276.field4674;
        this.field1280 = this.field1276.field4679 >> this.field1285;
        this.field1286 = this.field1276.field4672 >> this.field1285;
    }
}
