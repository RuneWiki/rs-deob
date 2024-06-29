import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class113 extends class170 {

    @OriginalMember(owner = "client!da", name = "R", descriptor = "I")
    private int field1896 = 4096;

    @OriginalMember(owner = "client!da", name = "W", descriptor = "I")
    private int field1901 = 0;

    @OriginalMember(owner = "client!da", name = "V", descriptor = "I")
    private int field1900 = 16;

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "I")
    private int field1904 = 0;

    @OriginalMember(owner = "client!da", name = "ab", descriptor = "I")
    private int field1905 = 2000;

    @OriginalMember(owner = "client!da", name = "S", descriptor = "Lmh;")
    public static class128 field1897 = class22.method156(123, "::errortest");

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "Lmh;")
    public static class128 field1903 = class22.method156(124, "; Max)2Age=");

    @OriginalMember(owner = "client!da", name = "T", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!da", name = "U", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!da", name = "X", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIIII)V", line = 9)
    public static final void method684(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class150 var6 = class182.field3184[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field2581;
        if (var7 != null) {
            int var8 = var7.field1072;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class48 var10 = var6.field2587;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field973;
        int var12 = var10.field972;
        int var13 = var10.field962;
        int var14 = var10.field974;
        int[] var15 = class302.field5121[var11];
        int[] var16 = class278.field4799[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V", line = 100)
    public class113() {
        super(0, true);
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V", line = 129)
    public static void method685(int arg0) {
        field1897 = null;
        field1903 = null;
        if (arg0 != 3) {
            field1903 = (class128) null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)[I", line = 146)
    public final int[] method69(byte arg0, int arg1) {
        if (arg0 != 85) {
            field1897 = (class128) null;
        }
        field1902++;
        int[] var3 = this.field2977.method1838(false, arg1);
        if (this.field2977.field4552) {
            int var4 = this.field1896 >> 1;
            int[][] var5 = this.field2977.method1840(109);
            Random var6 = new Random((long) this.field1904);
            for (int var7 = 0; var7 < this.field1905; var7++) {
                int var8 = this.field1896 <= 0 ? this.field1901 : this.field1901 - (var4 - class103.method638((byte) 15, this.field1896, var6));
                int var9 = class103.method638((byte) 15, class185.field3225, var6);
                int var10 = var8 >> 4 & 0xFF;
                int var11 = class103.method638((byte) 15, class12.field390, var6);
                int var12 = var9 + (class61.field1151[var10] * this.field1900 >> 12);
                int var13 = (class109.field1853[var10] * this.field1900 >> 12) + var11;
                int var14 = var12 - var9;
                int var15 = var13 - var11;
                if (var14 != 0 || var15 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var15 > var14;
                    if (var16) {
                        int var17 = var9;
                        var9 = var11;
                        int var18 = var12;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var12 < var9) {
                        int var19 = var9;
                        var9 = var12;
                        int var20 = var11;
                        var11 = var13;
                        var13 = var20;
                        var12 = var19;
                    }
                    int var21 = var12 - var9;
                    int var22 = var11;
                    int var23 = var13 - var11;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var24 = -var21 / 2;
                    int var25 = 2048 / var21;
                    int var26 = 1024 - (class103.method638((byte) 15, 4096, var6) >> 2);
                    int var27 = var13 > var11 ? 1 : -1;
                    for (int var28 = var9; var28 < var12; var28++) {
                        var24 += var23;
                        int var29 = (var28 - var9) * var25 + var26 + 1024;
                        int var30 = var22 & class297.field5073;
                        if (var24 > 0) {
                            var22 -= -var27;
                            var24 -= var21;
                        }
                        int var31 = var28 & class5.field94;
                        if (var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILbg;B)V", line = 285)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        field1899++;
        if (arg2 != 13) {
            return;
        }
        if (arg0 == 0) {
            this.field1904 = arg1.method1325(7627);
        } else if (arg0 == 1) {
            this.field1905 = arg1.method1308(-119);
        } else if (arg0 == 2) {
            this.field1900 = arg1.method1325(7627);
        } else if (arg0 == 3) {
            this.field1901 = arg1.method1308(-56);
        } else if (arg0 == 4) {
            this.field1896 = arg1.method1308(arg2 - 93);
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V", line = 356)
    public final void method267(int arg0) {
        field1898++;
        class39.method265(6361);
        if (arg0 != -2718) {
            this.method267(-24);
        }
    }
}
