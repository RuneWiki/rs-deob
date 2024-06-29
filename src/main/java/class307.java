import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public abstract class class307 {

    @OriginalMember(owner = "client!ks", name = "k", descriptor = "I")
    private int field4462 = 4;

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "I")
    private int field4460 = 4;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
    private int field4452 = 4;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "I")
    private int field4457 = 0;

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "I")
    public int field4459 = 4;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "[S")
    private short[] field4458 = new short[512];

    @OriginalMember(owner = "client!ks", name = "o", descriptor = "Z")
    public static boolean field4466 = false;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "Ldg;")
    public static class288 field4454 = new class288(16);

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!ks", name = "l", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!ks", name = "m", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!ks", name = "n", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "Lmn;")
    public static class251 field4456;

    @OriginalMember(owner = "client!ks", name = "j", descriptor = "[S")
    private short[] field4461;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIZZII)V", line = 5)
    public static final void method1862(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
        if (arg1 < 1) {
            arg1 = 1;
        }
        field4464++;
        if (arg0 < 1) {
            arg0 = 1;
        }
        int var6 = arg0 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class26.field313 - class242.field3523) * var6 / 100 + class242.field3523;
        if (class228.field3285 > var7) {
            var7 = class228.field3285;
        } else if (class189.field2703 < var7) {
            var7 = class189.field2703;
        }
        int var8 = var7 * 512 * arg0 / (arg1 * 334);
        if (class140.field1835 > var8) {
            short var12 = class140.field1835;
            var7 = arg1 * var12 * 334 / (arg0 * 512);
            if (var7 > class189.field2703) {
                var7 = class189.field2703;
                int var13 = arg0 * 512 * var7 / (var12 * 334);
                int var14 = (arg1 - var13) / 2;
                if (arg2) {
                    class385.field5414.method295();
                    class385.field5414.method1794(var14, arg5, -16777216, arg0, 91, arg4);
                    class385.field5414.method1794(var14, arg5, -16777216, arg0, 87, arg1 + arg4 - var14);
                }
                arg1 -= var14 * 2;
                arg4 += var14;
            }
        } else if (class453.field6344 < var8) {
            short var9 = class453.field6344;
            var7 = arg1 * var9 * 334 / (arg0 * 512);
            if (class228.field3285 > var7) {
                var7 = class228.field3285;
                int var10 = var9 * 334 * arg1 / (var7 * 512);
                int var11 = (arg0 - var10) / 2;
                if (arg2) {
                    class385.field5414.method295();
                    class385.field5414.method1794(arg1, arg5, -16777216, var11, 116, arg4);
                    class385.field5414.method1794(arg1, arg5 + arg0 - var11, -16777216, var11, 108, arg4);
                }
                arg5 += var11;
                arg0 -= var11 * 2;
            }
        }
        if (arg3) {
            return;
        }
        class409.field5789 = arg0 * var7 / 334;
        class211.field3056 = (short) arg1;
        class325.field4748 = (short) arg0;
        class426.field5985 = arg4;
        class528.field7757 = arg5;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)V", line = 98)
    private final void method1863(boolean arg0) {
        field4465++;
        this.field4461 = new short[this.field4459];
        if (arg0) {
            this.field4462 = 87;
        }
        for (int var2 = 0; var2 < this.field4459; var2++) {
            this.field4461[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIB)V", line = 120)
    public final void method1864(int arg0, int arg1, int arg2, byte arg3) {
        field4453++;
        int var5 = 32 % ((-arg3 - 70) / 38);
        int[] var6 = new int[arg2];
        int[] var7 = new int[arg1];
        int[] var8 = new int[arg0];
        for (int var9 = 0; var9 < arg2; var9++) {
            var6[var9] = (var9 << 12) / arg2;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var7[var10] = (var10 << 12) / arg1;
        }
        for (int var11 = 0; var11 < arg0; var11++) {
            var8[var11] = (var11 << 12) / arg0;
        }
        this.method625((byte) 105);
        for (int var12 = 0; var12 < arg0; var12++) {
            for (int var13 = 0; var13 < arg1; var13++) {
                for (int var14 = 0; var14 < arg2; var14++) {
                    for (int var15 = 0; var15 < this.field4459; var15++) {
                        int var16 = this.field4461[var15] << 12;
                        int var17 = this.field4462 * var16 >> 12;
                        int var18 = var8[var12] * var16 >> 12;
                        int var19 = var6[var14] * var16 >> 12;
                        int var20 = this.field4452 * var16 >> 12;
                        int var21 = var7[var13] * var16 >> 12;
                        int var22 = this.field4460 * var16 >> 12;
                        int var23 = this.field4452 * var18;
                        int var24 = this.field4460 * var19;
                        int var25 = this.field4462 * var21;
                        int var26 = var24 >> 12;
                        int var27 = var26 + 1;
                        int var28 = var26 & 0xFF;
                        int var29 = var25 >> 12;
                        int var30 = var29 + 1;
                        int var31 = var23 >> 12;
                        int var32 = var29 & 0xFF;
                        int var33 = var31 + 1;
                        int var34 = var25 & 0xFFF;
                        int var35 = var31 & 0xFF;
                        int var36;
                        if (var17 <= var30) {
                            var36 = 0;
                        } else {
                            var36 = var30 & 0xFF;
                        }
                        int var37 = var23 & 0xFFF;
                        int var38 = var24 & 0xFFF;
                        int var39;
                        if (var27 < var22) {
                            var39 = var27 & 0xFF;
                        } else {
                            var39 = 0;
                        }
                        int var40;
                        if (var33 < var20) {
                            var40 = var33 & 0xFF;
                        } else {
                            var40 = 0;
                        }
                        int var41 = class226.field3254[var34];
                        int var42 = var37 - 4096;
                        short var43 = this.field4458[var40];
                        int var44 = class226.field3254[var37];
                        int var45 = class226.field3254[var38];
                        short var46 = this.field4458[var35];
                        int var47 = var34 - 4096;
                        int var48 = var38 - 4096;
                        short var49 = this.field4458[var32 + var46];
                        short var50 = this.field4458[var36 + var43];
                        short var51 = this.field4458[var36 + var46];
                        short var52 = this.field4458[var32 + var43];
                        int var53 = class26.method167(var37, var38, (byte) 115, var34, this.field4458[var28 + var49]);
                        int var54 = class26.method167(var37, var48, (byte) 120, var34, this.field4458[var39 + var49]);
                        int var55 = ((var54 - var53) * var45 >> 12) + var53;
                        int var56 = class26.method167(var37, var38, (byte) 122, var47, this.field4458[var28 + var51]);
                        int var57 = class26.method167(var37, var48, (byte) 112, var47, this.field4458[var39 + var51]);
                        int var58 = ((var57 - var56) * var45 >> 12) + var56;
                        int var59 = class26.method167(var42, var38, (byte) 111, var34, this.field4458[var28 + var52]);
                        int var60 = var55 + ((var58 - var55) * var41 >> 12);
                        int var61 = class26.method167(var42, var48, (byte) 117, var34, this.field4458[var39 + var52]);
                        int var62 = var59 + ((var61 - var59) * var45 >> 12);
                        int var63 = class26.method167(var42, var38, (byte) 116, var47, this.field4458[var28 + var50]);
                        int var64 = class26.method167(var42, var48, (byte) 125, var47, this.field4458[var39 + var50]);
                        int var65 = ((var64 - var63) * var45 >> 12) + var63;
                        int var66 = ((var65 - var62) * var41 >> 12) + var62;
                        this.method629(((var66 - var60) * var44 >> 12) + var60, 255, var15);
                    }
                    this.method626((byte) 90);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V", line = 299)
    public static void method1865(int arg0) {
        if (arg0 != 26903) {
            field4454 = null;
        }
        field4454 = null;
        field4456 = null;
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(IIIII)V", line = 369)
    public class307(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4457 = arg0;
        this.field4462 = arg3;
        this.field4459 = arg1;
        this.field4452 = arg4;
        this.field4460 = arg2;
        this.method1863(false);
        this.method1866(true);
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(Z)V", line = 324)
    private final void method1866(boolean arg0) {
        field4463++;
        Random var2 = new Random((long) this.field4457);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field4458[var3] = (short) var3;
        }
        if (!arg0) {
            this.method1863(true);
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class119.method802(0, var5, var2);
            short var7 = this.field4458[var6];
            this.field4458[var6] = this.field4458[var5];
            this.field4458[var5] = this.field4458[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(III)V")
    public abstract void method629(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
    public abstract void method626(byte arg0);

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)V")
    public abstract void method625(byte arg0);
}
