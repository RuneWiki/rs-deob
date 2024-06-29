import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class102 extends class215 {

    @OriginalMember(owner = "client!jl", name = "N", descriptor = "I")
    private int field1372 = 0;

    @OriginalMember(owner = "client!jl", name = "S", descriptor = "I")
    private int field1377 = 2000;

    @OriginalMember(owner = "client!jl", name = "W", descriptor = "I")
    private int field1381 = 0;

    @OriginalMember(owner = "client!jl", name = "T", descriptor = "I")
    private int field1378 = 16;

    @OriginalMember(owner = "client!jl", name = "Q", descriptor = "I")
    private int field1375 = 4096;

    @OriginalMember(owner = "client!jl", name = "R", descriptor = "Z")
    public static boolean field1376 = false;

    @OriginalMember(owner = "client!jl", name = "X", descriptor = "[I")
    public static int[] field1382 = new int[25];

    @OriginalMember(owner = "client!jl", name = "Z", descriptor = "[Ljava/lang/String;")
    public static String[] field1384 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!jl", name = "P", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!jl", name = "U", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!jl", name = "V", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!jl", name = "Y", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!jl", name = "O", descriptor = "Leh;")
    public static class137 field1373;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "(I)Lda;")
    public static final class25 method621(int arg0) {
        if (arg0 != 19739) {
            return null;
        } else {
            ++field1374;
            try {
                return (class25) Class.forName("jc").newInstance();
            } catch (Throwable var1) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        if (arg1 != 255) {
            method622(125);
        }
        ++field1380;
        int[] var3 = super.field3445.method1755(arg0, (byte) 106);
        if (super.field3445.field4163) {
            int var4 = this.field1375 >> 1;
            int[][] var5 = super.field3445.method1752((byte) -91);
            Random var6 = new Random((long) this.field1381);
            for (int var7 = 0; ~var7 > ~this.field1377; ++var7) {
                int var8 = this.field1375 <= 0 ? this.field1372 : this.field1372 - -class40.method222(this.field1375, 37, var6) + -var4;
                int var9 = class40.method222(class244.field4015, 83, var6);
                int var10 = class40.method222(class80.field998, 37, var6);
                int var11 = var8 >> 4 & 255;
                int var12 = var9 - -(class36.field468[var11] * this.field1378 >> 12);
                int var13 = -var9 + var12;
                int var14 = (class177.field2810[var11] * this.field1378 >> 12) + var10;
                int var15 = var14 - var10;
                if (var13 != 0 || ~var15 != -1) {
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var13 < var15;
                    if (var16) {
                        int var17 = var9;
                        var9 = var10;
                        var10 = var17;
                        int var18 = var12;
                        var12 = var14;
                        var14 = var18;
                    }
                    if (var12 < var9) {
                        int var19 = var9;
                        int var20 = var10;
                        var9 = var12;
                        var12 = var19;
                        var10 = var14;
                        var14 = var20;
                    }
                    int var21 = -var9 + var12;
                    int var22 = var10;
                    int var23 = -var10 + var14;
                    int var24 = -var21 / 2;
                    int var25 = 2048 / var21;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var26 = ~var10 <= ~var14 ? -1 : 1;
                    int var27 = 1024 - (class40.method222(4096, -108, var6) >> 2);
                    for (int var28 = var9; var12 > var28; ++var28) {
                        int var29 = (var28 - var9) * var25 + var27 + 1024;
                        var24 += var23;
                        int var30 = var22 & class83.field1026;
                        int var31 = class118.field1673 & var28;
                        if (~var24 < -1) {
                            var22 += var26;
                            var24 += -var21;
                        }
                        if (!var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)V")
    public final void method331(byte arg0) {
        if (arg0 == -49) {
            class247.method1716(256);
            ++field1383;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            this.field1375 = arg2.method549(arg0 + -1521146093);
                        }
                    } else {
                        this.field1372 = arg2.method549(arg0 + -1521146093);
                    }
                } else {
                    this.field1378 = arg2.method584(255);
                }
            } else {
                this.field1377 = arg2.method549(255);
            }
        } else {
            this.field1381 = arg2.method584(255);
        }
        ++field1379;
        if (arg0 != 1521146348) {
            field1382 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "(I)V")
    public static void method622(int arg0) {
        field1382 = null;
        int var1 = 80 % ((arg0 - -31) / 48);
        field1373 = null;
        field1384 = null;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
    public class102() {
        super(0, true);
    }
}
