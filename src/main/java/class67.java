import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public abstract class class67 {

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    private int field868 = 4;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    private int field873 = 4;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    private int field876 = 0;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public int field869 = 4;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "[S")
    private short[] field879 = new short[512];

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
    private int field875 = 4;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
    public static int field882 = -1;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "[I")
    public static int[] field880 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    public static int field878 = 0;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "[I")
    public static int[] field881 = new int[1000];

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "Llc;")
    public static class175 field864;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "[S")
    private short[] field867;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "[[[B")
    public static byte[][][] field884;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILlc;Ljava/lang/String;)Lam;", line = 15)
    public static final class269 method416(int arg0, class175 arg1, String arg2) {
        field872++;
        int var3 = arg1.method1179((byte) 39, arg2);
        if (var3 == -1) {
            return new class269(0);
        }
        int[] var4 = arg1.method1187(var3, (byte) 13);
        class269 var5 = new class269(var4.length);
        for (int var6 = arg0; var6 < var5.field4249; var6++) {
            class107 var7 = new class107(arg1.method1199(28815, var4[var6], var3));
            var5.field4251[var6] = var7.method628(false);
            var5.field4242[var6] = var7.method679(-3);
            var5.field4243[var6] = var7.method676(true);
            var5.field4241[var6] = var7.method676(true);
        }
        return var5;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BIII)V", line = 51)
    public final void method417(byte arg0, int arg1, int arg2, int arg3) {
        field866++;
        int[] var5 = new int[arg1];
        int[] var6 = new int[arg3];
        int[] var7 = new int[arg2];
        for (int var8 = 0; var8 < arg1; var8++) {
            var5[var8] = (var8 << 12) / arg1;
        }
        for (int var9 = 0; var9 < arg3; var9++) {
            var6[var9] = (var9 << 12) / arg3;
        }
        int var10 = 0;
        if (arg0 != 15) {
            field878 = 122;
        }
        while (var10 < arg2) {
            var7[var10] = (var10 << 12) / arg2;
            var10++;
        }
        this.method213(76);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field869; var14++) {
                        int var15 = this.field867[var14] << 12;
                        int var16 = this.field868 * var15 >> 12;
                        int var17 = var5[var13] * var15 >> 12;
                        int var18 = this.field868 * var17;
                        int var19 = var18 >> 12;
                        int var20 = var7[var11] * var15 >> 12;
                        int var21 = var19 + 1;
                        int var22;
                        if (var21 >= var16) {
                            var22 = 0;
                        } else {
                            var22 = var21 & 0xFF;
                        }
                        int var23 = this.field873 * var15 >> 12;
                        int var24 = this.field875 * var15 >> 12;
                        int var25 = var19 & 0xFF;
                        int var26 = var18 & 0xFFF;
                        int var27 = var26 - 4096;
                        int var28 = class264.field4158[var26];
                        int var29 = this.field873 * var20;
                        int var30 = var6[var12] * var15 >> 12;
                        int var31 = this.field875 * var30;
                        int var32 = var31 >> 12;
                        int var33 = var29 >> 12;
                        int var34 = var31 & 0xFFF;
                        int var35 = var29 & 0xFFF;
                        int var36 = var32 + 1;
                        int var37 = var33 + 1;
                        int var38 = class264.field4158[var34];
                        int var39 = var34 - 4096;
                        int var40 = class264.field4158[var35];
                        int var41;
                        if (var24 > var36) {
                            var41 = var36 & 0xFF;
                        } else {
                            var41 = 0;
                        }
                        int var42 = var33 & 0xFF;
                        int var43;
                        if (var23 <= var37) {
                            var43 = 0;
                        } else {
                            var43 = var37 & 0xFF;
                        }
                        short var44 = this.field879[var43];
                        int var45 = var35 - 4096;
                        int var46 = var32 & 0xFF;
                        short var47 = this.field879[var41 + var44];
                        short var48 = this.field879[var44 + var46];
                        short var49 = this.field879[var42];
                        short var50 = this.field879[var41 + var49];
                        short var51 = this.field879[var46 + var49];
                        int var52 = class81.method482(this.field879[var25 + var51], arg0 ^ 0xFFFFFF82, var35, var26, var34);
                        int var53 = class81.method482(this.field879[var22 + var51], -110, var35, var27, var34);
                        int var54 = ((var53 - var52) * var28 >> 12) + var52;
                        int var55 = class81.method482(this.field879[var25 + var50], arg0 - 133, var35, var26, var39);
                        int var56 = class81.method482(this.field879[var22 + var50], -110, var35, var27, var39);
                        int var57 = ((var56 - var55) * var28 >> 12) + var55;
                        int var58 = class81.method482(this.field879[var25 + var48], -118, var45, var26, var34);
                        int var59 = ((var57 - var54) * var38 >> 12) + var54;
                        int var60 = class81.method482(this.field879[var22 + var48], -122, var45, var27, var34);
                        int var61 = var58 + ((var60 - var58) * var28 >> 12);
                        int var62 = class81.method482(this.field879[var25 + var47], arg0 - 133, var45, var26, var39);
                        int var63 = class81.method482(this.field879[var22 + var47], -117, var45, var27, var39);
                        int var64 = var62 + ((var63 - var62) * var28 >> 12);
                        int var65 = ((var64 - var61) * var38 >> 12) + var61;
                        this.method212(var59 + ((var65 - var59) * var40 >> 12), var14, arg0 ^ 0x3E);
                    }
                    this.method214(-50);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V", line = 219)
    private final void method418(boolean arg0) {
        field870++;
        Random var2 = new Random((long) this.field876);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field879[var3] = (short) var3;
        }
        if (arg0) {
            return;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class31.method189(var5, 50, var2);
            short var7 = this.field879[var6];
            this.field879[var6] = this.field879[var5];
            this.field879[var5] = this.field879[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(IIIII)V", line = 382)
    public class67(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field875 = arg3;
        this.field868 = arg2;
        this.field869 = arg1;
        this.field873 = arg4;
        this.field876 = arg0;
        this.method423(1484);
        this.method418(false);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I[Lgj;)V", line = 265)
    public static final void method419(int arg0, class245[] arg1) {
        class7.field105[arg0] = arg1;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILp;)Lda;", line = 274)
    public static final class128 method420(int arg0, class107 arg1) {
        field871++;
        arg1.method661(arg0 - 2);
        int var2 = arg1.method661(-1);
        class128 var3 = class159.method1055((byte) -110, var2);
        var3.field1751 = arg1.method661(-1);
        int var4 = arg1.method661(-1);
        if (arg0 != 1) {
            field880 = (int[]) null;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method661(arg0 ^ 0xFFFFFFFE);
            var3.method107(arg1, var6, -87);
        }
        var3.method130(false);
        return var3;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V", line = 309)
    public static void method421(int arg0) {
        field880 = null;
        field864 = null;
        field884 = (byte[][][]) null;
        field881 = null;
        if (arg0 != -2075442228) {
            method419(-49, (class245[]) null);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IC)Z", line = 323)
    public static final boolean method422(int arg0, char arg1) {
        field883++;
        if (arg0 < 62) {
            return true;
        } else {
            return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        }
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)V", line = 351)
    private final void method423(int arg0) {
        if (arg0 != 1484) {
            return;
        }
        field874++;
        this.field867 = new short[this.field869];
        for (int var2 = 0; var2 < this.field869; var2++) {
            this.field867[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public abstract void method214(int arg0);

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
    public abstract void method213(int arg0);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)V")
    public abstract void method212(int arg0, int arg1, int arg2);
}
