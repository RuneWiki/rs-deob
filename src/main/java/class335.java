import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public abstract class class335 {

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    private int field5213 = 4;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    private int field5217 = 0;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
    public int field5224 = 4;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "[S")
    private short[] field5221 = new short[512];

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
    private int field5226 = 4;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "I")
    private int field5230 = 4;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field5215 = 20;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "F")
    public static float field5222;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "[S")
    private short[] field5214;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIBIIII)V", line = 6)
    public static final void method2360(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != -48) {
            method2365(-93, (byte) -126);
        }
        field5225++;
        int var8 = class251.method1840((byte) 107, class261.field3911, class326.field4901, arg6);
        int var9 = class251.method1840((byte) 107, class261.field3911, class326.field4901, arg7);
        int var10 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg5);
        int var11 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg4);
        int var12 = class251.method1840((byte) 107, class261.field3911, class326.field4901, arg1 + arg6);
        int var13 = class251.method1840((byte) 107, class261.field3911, class326.field4901, arg7 - arg1);
        for (int var14 = var8; var14 < var12; var14++) {
            class329.method2285(var10, class274.field4158[var14], (byte) 102, var11, arg2);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class329.method2285(var10, class274.field4158[var15], (byte) -90, var11, arg2);
        }
        int var16 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg5 + arg1);
        int var17 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg4 - arg1);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class274.field4158[var18];
            class329.method2285(var10, var19, (byte) 121, var16, arg2);
            class329.method2285(var16, var19, (byte) 115, var17, arg0);
            class329.method2285(var17, var19, (byte) -123, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)Lmn;", line = 60)
    public static final class110 method2361(int arg0, int arg1) {
        field5228++;
        if (arg1 != -2) {
            field5222 = -0.22938132F;
        }
        class110 var2 = (class110) class119.field1683.method551(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class290.field4386.method2520(arg0, 0, (byte) -25);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class110 var4 = class35.method262(var3, (byte) -123);
            class119.field1683.method547((long) arg0, -1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V", line = 85)
    private final void method2362(int arg0) {
        if (arg0 != 1) {
            this.method931(-22, (byte) 97, 79);
        }
        field5223++;
        this.field5214 = new short[this.field5224];
        for (int var2 = 0; var2 < this.field5224; var2++) {
            this.field5214[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(IIIII)V", line = 400)
    public class335(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5213 = arg4;
        this.field5230 = arg2;
        this.field5226 = arg3;
        this.field5224 = arg1;
        this.field5217 = arg0;
        this.method2362(1);
        this.method2363((byte) -76);
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(B)V", line = 118)
    private final void method2363(byte arg0) {
        field5229++;
        Random var2 = new Random((long) this.field5217);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field5221[var3] = (short) var3;
        }
        if (arg0 != -76) {
            this.method937((byte) -66);
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class127.method943((byte) -111, var2, var5);
            short var7 = this.field5221[var6];
            this.field5221[var6] = this.field5221[var5];
            this.field5221[var5] = this.field5221[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BIII)V", line = 159)
    public final void method2364(byte arg0, int arg1, int arg2, int arg3) {
        field5232++;
        if (arg0 != 115) {
            method2365(-125, (byte) 4);
        }
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg1];
        int[] var7 = new int[arg3];
        for (int var8 = 0; var8 < arg3; var8++) {
            var7[var8] = (var8 << 12) / arg3;
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5[var9] = (var9 << 12) / arg2;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var6[var10] = (var10 << 12) / arg1;
        }
        this.method937((byte) -114);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field5224; var14++) {
                        int var15 = this.field5214[var14] << 12;
                        int var16 = var7[var13] * var15 >> 12;
                        int var17 = this.field5230 * var16;
                        int var18 = this.field5230 * var15 >> 12;
                        int var19 = var17 >> 12;
                        int var20 = this.field5226 * var15 >> 12;
                        int var21 = var5[var12] * var15 >> 12;
                        int var22 = this.field5226 * var21;
                        int var23 = var17 & 0xFFF;
                        int var24 = var23 - 4096;
                        int var25 = this.field5213 * var15 >> 12;
                        int var26 = class131.field1909[var23];
                        int var27 = var6[var11] * var15 >> 12;
                        int var28 = var22 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var22 & 0xFFF;
                        int var31 = var28 & 0xFF;
                        int var32 = var19 + 1;
                        int var33 = this.field5213 * var27;
                        int var34 = var30 - 4096;
                        int var35 = var33 >> 12;
                        int var36 = class131.field1909[var30];
                        int var37 = var33 & 0xFFF;
                        int var38 = var19 & 0xFF;
                        int var39 = var35 + 1;
                        int var40 = class131.field1909[var37];
                        int var41;
                        if (var29 >= var20) {
                            var41 = 0;
                        } else {
                            var41 = var29 & 0xFF;
                        }
                        int var42 = var35 & 0xFF;
                        int var43;
                        if (var32 < var18) {
                            var43 = var32 & 0xFF;
                        } else {
                            var43 = 0;
                        }
                        int var44;
                        if (var39 >= var25) {
                            var44 = 0;
                        } else {
                            var44 = var39 & 0xFF;
                        }
                        short var45 = this.field5221[var44];
                        short var46 = this.field5221[var41 + var45];
                        short var47 = this.field5221[var31 + var45];
                        short var48 = this.field5221[var42];
                        short var49 = this.field5221[var41 + var48];
                        short var50 = this.field5221[var31 + var48];
                        int var51 = class132.method953(var30, var23, (byte) 121, var37, this.field5221[var38 + var50]);
                        int var52 = class132.method953(var30, var24, (byte) -23, var37, this.field5221[var43 + var50]);
                        int var53 = var37 - 4096;
                        int var54 = ((var52 - var51) * var26 >> 12) + var51;
                        int var55 = class132.method953(var34, var23, (byte) -99, var37, this.field5221[var38 + var49]);
                        int var56 = class132.method953(var34, var24, (byte) -3, var37, this.field5221[var43 + var49]);
                        int var57 = ((var56 - var55) * var26 >> 12) + var55;
                        int var58 = class132.method953(var30, var23, (byte) 121, var53, this.field5221[var38 + var47]);
                        int var59 = class132.method953(var30, var24, (byte) -62, var53, this.field5221[var43 + var47]);
                        int var60 = ((var57 - var54) * var36 >> 12) + var54;
                        int var61 = ((var59 - var58) * var26 >> 12) + var58;
                        int var62 = class132.method953(var34, var23, (byte) 122, var53, this.field5221[var38 + var46]);
                        int var63 = class132.method953(var34, var24, (byte) 125, var53, this.field5221[var43 + var46]);
                        int var64 = var62 + ((var63 - var62) * var26 >> 12);
                        int var65 = var61 + ((var64 - var61) * var36 >> 12);
                        this.method931(((var65 - var60) * var40 >> 12) + var60, (byte) 118, var14);
                    }
                    this.method932((byte) -124);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)I", line = 330)
    public static final int method2365(int arg0, byte arg1) {
        field5220++;
        if (arg0 > 0) {
            return 1;
        } else if (arg1 == -83) {
            return arg0 < 0 ? -1 : 0;
        } else {
            return 43;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)V", line = 349)
    public static final void method2366(boolean arg0) {
        if (arg0) {
            field5222 = 1.5427415F;
        }
        class356.field5456.method462(24);
        class116.field1649.method462(24);
        field5227++;
    }

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "(B)V", line = 377)
    public static final void method2367(byte arg0) {
        if (arg0 < 6) {
            field5216 = 20;
        }
        class126.field1833.method458((byte) -111);
        class361.field5735.method458((byte) 122);
        field5231++;
        class235.field3533.method458((byte) 127);
    }

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "(B)V", line = 416)
    public static final void method2368(byte arg0) {
        class314.field4673.method462(24);
        field5218++;
        if (arg0 <= 111) {
            field5216 = -59;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
    public abstract void method932(byte arg0);

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IBI)V")
    public abstract void method931(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(B)V")
    public abstract void method937(byte arg0);
}
