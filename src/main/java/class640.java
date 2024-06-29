import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class640 {

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "Lee;")
    private class703 field8615;

    @OriginalMember(owner = "client!jaa", name = "k", descriptor = "Lqq;")
    private class501 field8623;

    @OriginalMember(owner = "client!jaa", name = "p", descriptor = "I")
    public int field8628;

    @OriginalMember(owner = "client!jaa", name = "s", descriptor = "I")
    private int field8631;

    @OriginalMember(owner = "client!jaa", name = "q", descriptor = "[B")
    public byte[] field8629;

    @OriginalMember(owner = "client!jaa", name = "l", descriptor = "I")
    private int field8624;

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "I")
    private int field8616;

    @OriginalMember(owner = "client!jaa", name = "h", descriptor = "I")
    private int field8620;

    @OriginalMember(owner = "client!jaa", name = "m", descriptor = "I")
    public static int field8625 = -1;

    @OriginalMember(owner = "client!jaa", name = "j", descriptor = "Lmw;")
    public static class517 field8622 = new class517(28, 2);

    @OriginalMember(owner = "client!jaa", name = "t", descriptor = "Lgm;")
    public static class134 field8632 = new class134("WTI", "office", "_wti", 5);

    @OriginalMember(owner = "client!jaa", name = "u", descriptor = "[I")
    public static int[] field8633 = new int[256];

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "I")
    public static int field8613;

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "I")
    public static int field8618;

    @OriginalMember(owner = "client!jaa", name = "g", descriptor = "I")
    public static int field8619;

    @OriginalMember(owner = "client!jaa", name = "i", descriptor = "I")
    public static int field8621;

    @OriginalMember(owner = "client!jaa", name = "n", descriptor = "I")
    public static int field8626;

    @OriginalMember(owner = "client!jaa", name = "o", descriptor = "I")
    public static int field8627;

    @OriginalMember(owner = "client!jaa", name = "r", descriptor = "I")
    public static int field8630;

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "Ljb;")
    public static class519 field8614;

    @OriginalMember(owner = "client!jaa", name = "v", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field8634;

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "[[Ldb;")
    private class341[][] field8617;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Z)V")
    public final void method3521(boolean arg0) {
        field8619++;
        this.field8617 = new class341[this.field8616][this.field8620];
        int var2 = 0;
        if (arg0) {
            return;
        }
        while (var2 < this.field8620) {
            for (int var3 = 0; var3 < this.field8616; var3++) {
                this.field8617[var3][var2] = new class341(this.field8615, this, this.field8623, var3, var2, this.field8624, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field8617[var3][var2].field4760 == 0) {
                    this.field8617[var3][var2] = null;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;)Ljava/lang/String;")
    public static final String method3522(String arg0, String arg1, byte arg2, String arg3) {
        if (arg2 != 22) {
            method3526(-82);
        }
        field8626++;
        for (int var4 = arg3.indexOf(arg1); var4 != -1; var4 = arg3.indexOf(arg1, var4 + arg0.length())) {
            arg3 = arg3.substring(0, var4) + arg0 + arg3.substring(var4 + arg1.length());
        }
        return arg3;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIII)V")
    private final void method3523(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8630++;
        if (this.field8617 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg2 + arg0 - 1 - 1 >> 7;
        int var8 = arg3 - 1 >> 7;
        int var9 = arg4 + arg3 - 1 - 1 >> 7;
        if (arg1 != 18707) {
            this.method3524(null, 60, 80, 112);
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class341[] var11 = this.field8617[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field4773 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lr;III)V")
    public final void method3524(class195 arg0, int arg1, int arg2, int arg3) {
        field8627++;
        class122 var5 = (class122) arg0;
        int var6 = var5.field1691 + arg2 + 1;
        int var7 = var5.field1680 + arg3 + 1;
        int var8 = var6 + (this.field8628 * var7);
        int var9 = 0;
        int var10 = var5.field1690;
        int var11 = var5.field1682;
        if (arg1 != 256) {
            this.field8623 = null;
        }
        int var12 = this.field8628 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var9 += var11 * var14;
            var8 += this.field8628 * var14;
            var7 = 1;
            var10 -= var14;
        }
        if (var7 + var10 >= this.field8631) {
            int var15 = var7 + 1 - (this.field8631 - var10);
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var12 += var16;
            var9 += var16;
            var13 += var16;
            var8 += var16;
            var6 = 1;
            var11 -= var16;
        }
        if (this.field8628 <= (var6 + var11)) {
            int var17 = var6 + var11 + 1 - this.field8628;
            var11 -= var17;
            var12 += var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class246.method1528(var9, var10, var5.field1686, this.field8629, var11, var12, var13, 0, var8);
            this.method3523(var11, 18707, var6, var7, var10);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IILr;I)V")
    public final void method3525(int arg0, int arg1, class195 arg2, int arg3) {
        field8618++;
        class122 var5 = (class122) arg2;
        int var6 = var5.field1691 + arg1 + 1;
        int var7 = var5.field1680 + arg3 + 1;
        int var8 = this.field8628 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field1690;
        int var11 = var5.field1682;
        int var12 = this.field8628 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var10 -= var13;
            var8 += this.field8628 * var13;
            var9 += var11 * var13;
            var7 = 1;
        }
        int var14 = 0;
        if (this.field8631 <= var7 + var10) {
            int var15 = var10 + var7 + 1 - this.field8631;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var14 += var16;
            var8 += var16;
            var11 -= var16;
            var12 += var16;
            var9 += var16;
            var6 = 1;
        }
        if ((var6 + var11) >= this.field8628) {
            int var17 = var6 + var11 + 1 - this.field8628;
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (arg0 == 19583 && var11 > 0 && var10 > 0) {
            class487.method2847(var5.field1686, var10, 3, var14, var12, var8, var9, this.field8629, var11);
            this.method3523(var11, arg0 ^ 0x56C, var6, var7, var10);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V")
    public static void method3526(int arg0) {
        field8632 = null;
        field8622 = null;
        field8633 = null;
        field8634 = null;
        field8614 = null;
        if (arg0 > -86) {
            method3526(-119);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "([[ZZIIII)V")
    public final void method3527(boolean[][] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field8613++;
        this.field8615.method3894(16544, false);
        this.field8615.method3849((byte) 54, false);
        if (arg4 != 23749) {
            this.method3525(-48, -106, null, -71);
        }
        this.field8615.method3893(-57, 1);
        this.field8615.method3871(arg4 - 23749, 1);
        this.field8615.method3863(false, -2, 27016, false);
        float var7 = 1.0F / (float) (this.field8615.field9568 * 128);
        if (arg1) {
            for (int var8 = 0; var8 < this.field8620; var8++) {
                int var9 = var8 << this.field8624;
                int var10 = var8 + 1 << this.field8624;
                label145: for (int var11 = 0; var11 < this.field8616; var11++) {
                    if (this.field8617[var11][var8] != null) {
                        int var12 = var11 << this.field8624;
                        int var13 = var11 + 1 << this.field8624;
                        for (int var14 = var12; var14 < var13; var14++) {
                            if (-arg2 <= var14 - arg3 && var14 - arg3 <= arg2) {
                                for (int var15 = var9; var15 < var10; var15++) {
                                    if ((var15 - arg5) >= (-arg2) && (var15 - arg5) <= arg2 && arg0[var14 - (arg3 - arg2)][var15 + arg2 - arg5]) {
                                        class532 var16 = this.field8615.method3877(arg4 ^ 0x5CC6);
                                        var16.method3080(var7, var7, 1.0F, (byte) -89);
                                        var16.method818(-var11, -var8, 0);
                                        this.field8615.method3883((byte) 72, class525.field7284);
                                        this.field8617[var11][var8].method2174(31);
                                        continue label145;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field8620; var17++) {
                int var18 = var17 << this.field8624;
                int var19 = var17 + 1 << this.field8624;
                for (int var20 = 0; var20 < this.field8616; var20++) {
                    class341 var21 = this.field8617[var20][var17];
                    if (var21 != null) {
                        class118 var22 = this.field8615.method3892(2, var21.field4760 * 3);
                        Buffer var23 = var22.method847(-120, true);
                        if (var23 != null) {
                            Stream var24 = this.field8615.method3889(0, var23);
                            int var25 = 0;
                            int var26 = var20 << this.field8624;
                            int var27 = var20 + 1 << this.field8624;
                            for (int var28 = var18; var28 < var19; var28++) {
                                if (var28 - arg5 >= -arg2 && var28 - arg5 <= arg2) {
                                    int var30 = this.field8623.field4174 * var28 + var26;
                                    for (int var31 = var26; var31 < var27; var31++) {
                                        if ((-arg2) <= (var31 - arg3) && arg2 >= (var31 - arg3) && arg0[arg2 + var31 - arg3][var28 + arg2 - arg5]) {
                                            short[] var32 = this.field8623.field7037[var30];
                                            if (var32 != null) {
                                                if (Stream.method3798()) {
                                                    for (int var33 = 0; var33 < var32.length; var33++) {
                                                        var24.method3795(var32[var33] & 0xFFFF);
                                                        var25++;
                                                    }
                                                } else {
                                                    for (int var34 = 0; var34 < var32.length; var34++) {
                                                        var24.method3804(var32[var34] & 0xFFFF);
                                                        var25++;
                                                    }
                                                }
                                            }
                                        }
                                        var30++;
                                    }
                                }
                            }
                            var24.method3797();
                            if (var22.method849(18579) && var25 > 0) {
                                class532 var29 = this.field8615.method3877(3);
                                var29.method3080(var7, var7, 1.0F, (byte) -89);
                                var29.method818(-var20, -var17, 0);
                                this.field8615.method3883((byte) 61, class525.field7284);
                                var21.method2170(var22, var25 / 3, arg4 ^ 0x5CC5);
                            }
                        }
                    }
                }
            }
        }
        this.field8615.method3878((byte) 86);
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(Lr;III)Z")
    public final boolean method3528(class195 arg0, int arg1, int arg2, int arg3) {
        field8621++;
        class122 var5 = (class122) arg0;
        int var6 = var5.field1691 + arg3 + 1;
        int var7 = var5.field1680 + arg2 + 1;
        int var8 = this.field8628 * var7 + var6;
        int var9 = var5.field1690;
        int var10 = var5.field1682;
        int var11 = this.field8628 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var7 = 1;
            var9 -= var12;
            var8 += this.field8628 * var12;
        }
        if (this.field8631 <= var7 + var9) {
            int var13 = var7 + 1 - (this.field8631 - var9);
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var11 += var14;
            var6 = 1;
            var10 -= var14;
            var8 += var14;
        }
        if ((var6 + var10) >= this.field8628) {
            int var15 = var6 - (-var10 - 1) - this.field8628;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (arg1 + var16) * this.field8628 + var11;
            return class643.method3540(var17, var9, var8, arg1 + 57, this.field8629, var10, var16);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Lee;Lqq;)V")
    public class640(class703 arg0, class501 arg1) {
        this.field8615 = arg0;
        this.field8623 = arg1;
        this.field8628 = (this.field8623.field4177 * this.field8623.field4174 >> this.field8615.field9577) + 2;
        this.field8631 = (this.field8623.field4177 * this.field8623.field4173 >> this.field8615.field9577) + 2;
        this.field8629 = new byte[this.field8631 * this.field8628];
        this.field8624 = this.field8615.field9577 + 7 - this.field8623.field4179;
        this.field8616 = this.field8623.field4174 >> this.field8624;
        this.field8620 = this.field8623.field4173 >> this.field8624;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field8633[var0] = var1;
        }
    }
}
