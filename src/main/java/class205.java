import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public abstract class class205 {

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public int field3263 = 4;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    private int field3261 = 4;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    private int field3267 = 0;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "[S")
    private short[] field3262 = new short[512];

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    private int field3269 = 4;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    private int field3268 = 4;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "Lch;")
    public static class133 field3259 = new class133(64);

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "Lqd;")
    public static class40 field3272 = class147.method1106("<img=1>", (byte) -97);

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
    public static int field3274 = 0;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "J")
    public static long field3271;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "[S")
    private short[] field3264;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "[[[B")
    public static byte[][][] field3270;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 10)
    public static final void method1440(int arg0) {
        field3266++;
        if (arg0 != 1891963564) {
            field3272 = (class40) null;
        }
        class263.field4394.method1349(true);
        class209.field3340.method1349(true);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V", line = 23)
    private final void method1441(byte arg0) {
        this.field3264 = new short[this.field3263];
        for (int var2 = 0; var2 < this.field3263; var2++) {
            this.field3264[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        int var3 = 2 / ((arg0 + 32) / 54);
        field3265++;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V", line = 43)
    public static void method1442(boolean arg0) {
        field3272 = null;
        if (arg0) {
            method1442(false);
        }
        field3270 = (byte[][][]) null;
        field3259 = null;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(IIIII)V", line = 324)
    public class205(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3263 = arg1;
        this.field3261 = arg3;
        this.field3268 = arg2;
        this.field3267 = arg0;
        this.field3269 = arg4;
        this.method1441((byte) -106);
        this.method1444((byte) 125);
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(B)V", line = 81)
    private final void method1444(byte arg0) {
        Random var2 = new Random((long) this.field3267);
        int var3 = 0;
        if (arg0 < 72) {
            this.method1446(-117, -35, (byte) 6, 52);
        }
        while (var3 < 255) {
            this.field3262[var3] = (short) var3;
            var3++;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class110.method830((byte) -80, var2, var5);
            short var7 = this.field3262[var6];
            this.field3262[var6] = this.field3262[var5];
            this.field3262[var5] = this.field3262[var5 + 256] = var7;
        }
        field3273++;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIBI)V", line = 142)
    public final void method1446(int arg0, int arg1, byte arg2, int arg3) {
        field3258++;
        int var5 = 46 / ((arg2 - 7) / 36);
        int[] var6 = new int[arg0];
        for (int var7 = 0; var7 < arg0; var7++) {
            var6[var7] = (var7 << 12) / arg0;
        }
        int[] var8 = new int[arg1];
        int[] var9 = new int[arg3];
        for (int var10 = 0; var10 < arg3; var10++) {
            var9[var10] = (var10 << 12) / arg3;
        }
        for (int var11 = 0; var11 < arg1; var11++) {
            var8[var11] = (var11 << 12) / arg1;
        }
        this.method1443((byte) 73);
        for (int var12 = 0; var12 < arg1; var12++) {
            for (int var13 = 0; var13 < arg3; var13++) {
                for (int var14 = 0; var14 < arg0; var14++) {
                    for (int var15 = 0; var15 < this.field3263; var15++) {
                        int var16 = this.field3264[var15] << 12;
                        int var17 = this.field3268 * var16 >> 12;
                        int var18 = var8[var12] * var16 >> 12;
                        int var19 = this.field3261 * var16 >> 12;
                        int var20 = var6[var14] * var16 >> 12;
                        int var21 = this.field3268 * var20;
                        int var22 = var9[var13] * var16 >> 12;
                        int var23 = this.field3269 * var16 >> 12;
                        int var24 = this.field3261 * var22;
                        int var25 = var24 >> 12;
                        int var26 = var24 & 0xFFF;
                        int var27 = this.field3269 * var18;
                        int var28 = var25 + 1;
                        int var29;
                        if (var19 <= var28) {
                            var29 = 0;
                        } else {
                            var29 = var28 & 0xFF;
                        }
                        int var30 = class186.field3000[var26];
                        int var31 = var21 >> 12;
                        int var32 = var26 - 4096;
                        int var33 = var21 & 0xFFF;
                        int var34 = var31 + 1;
                        int var35 = var25 & 0xFF;
                        int var36;
                        if (var17 > var34) {
                            var36 = var34 & 0xFF;
                        } else {
                            var36 = 0;
                        }
                        int var37 = class186.field3000[var33];
                        int var38 = var33 - 4096;
                        int var39 = var27 >> 12;
                        int var40 = var39 + 1;
                        int var41;
                        if (var40 >= var23) {
                            var41 = 0;
                        } else {
                            var41 = var40 & 0xFF;
                        }
                        short var42 = this.field3262[var41];
                        short var43 = this.field3262[var29 + var42];
                        int var44 = var31 & 0xFF;
                        int var45 = var27 & 0xFFF;
                        short var46 = this.field3262[var35 + var42];
                        int var47 = class186.field3000[var45];
                        int var48 = var39 & 0xFF;
                        short var49 = this.field3262[var48];
                        int var50 = var45 - 4096;
                        short var51 = this.field3262[var29 + var49];
                        short var52 = this.field3262[var35 + var49];
                        int var53 = class126.method945(this.field3262[var44 + var52], var26, var33, 123, var45);
                        int var54 = class126.method945(this.field3262[var36 + var52], var26, var38, 106, var45);
                        int var55 = ((var54 - var53) * var37 >> 12) + var53;
                        int var56 = class126.method945(this.field3262[var44 + var51], var32, var33, 123, var45);
                        int var57 = class126.method945(this.field3262[var36 + var51], var32, var38, -45, var45);
                        int var58 = var56 + ((var57 - var56) * var37 >> 12);
                        int var59 = class126.method945(this.field3262[var44 + var46], var26, var33, 124, var50);
                        int var60 = class126.method945(this.field3262[var36 + var46], var26, var38, -99, var50);
                        int var61 = ((var58 - var55) * var30 >> 12) + var55;
                        int var62 = ((var60 - var59) * var37 >> 12) + var59;
                        int var63 = class126.method945(this.field3262[var43 + var44], var32, var33, 107, var50);
                        int var64 = class126.method945(this.field3262[var36 + var43], var32, var38, 110, var50);
                        int var65 = ((var64 - var63) * var37 >> 12) + var63;
                        int var66 = ((var65 - var62) * var30 >> 12) + var62;
                        this.method1447(56, var15, var61 + ((var66 - var61) * var47 >> 12));
                    }
                    this.method1445((byte) -115);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)V")
    public abstract void method1443(byte arg0);

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(B)V")
    public abstract void method1445(byte arg0);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)V")
    public abstract void method1447(int arg0, int arg1, int arg2);
}
