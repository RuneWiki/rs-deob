import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public abstract class class190 {

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public int field3205 = 4;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    private int field3209 = 0;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    private int field3208 = 4;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    private int field3212 = 4;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "[S")
    private short[] field3218 = new short[512];

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    private int field3217 = 4;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "[C")
    public static char[] field3210 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public static int field3213 = 0;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3206 = null;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "Z")
    public static boolean field3215;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "[S")
    private short[] field3211;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    private final void method1333(int arg0) {
        this.field3211 = new short[this.field3205];
        field3207++;
        if (arg0 != 1348944044) {
            this.method12(true, -75, 90);
        }
        for (int var2 = 0; var2 < this.field3205; var2++) {
            this.field3211[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
    public abstract void method15(byte arg0);

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
    public static void method1334(int arg0) {
        field3206 = null;
        if (arg0 <= 24) {
            field3213 = 50;
        }
        field3210 = null;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V")
    private final void method1335(int arg0) {
        field3216++;
        Random var2 = new Random((long) this.field3209);
        for (int var3 = arg0; var3 < 255; var3++) {
            this.field3218[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class477.method2873(var2, -111, var5);
            short var7 = this.field3218[var6];
            this.field3218[var6] = this.field3218[var5];
            this.field3218[var5] = this.field3218[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)V")
    public abstract void method16(int arg0);

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIII)V")
    public final void method1336(int arg0, int arg1, int arg2, int arg3) {
        field3214++;
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg1];
        for (int var7 = 0; var7 < arg0; var7++) {
            var5[var7] = (var7 << 12) / arg0;
        }
        int[] var8 = new int[arg2];
        if (arg3 != 732) {
            this.field3209 = 36;
        }
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var8[var10] = (var10 << 12) / arg2;
        }
        this.method15((byte) 70);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field3205; var14++) {
                        int var15 = this.field3211[var14] << 12;
                        int var16 = this.field3217 * var15 >> 12;
                        int var17 = var5[var13] * var15 >> 12;
                        int var18 = var6[var12] * var15 >> 12;
                        int var19 = var8[var11] * var15 >> 12;
                        int var20 = this.field3212 * var15 >> 12;
                        int var21 = this.field3208 * var15 >> 12;
                        int var22 = this.field3217 * var18;
                        int var23 = this.field3208 * var19;
                        int var24 = this.field3212 * var17;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var22 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var23 >> 12;
                        int var31 = var27 & 0xFF;
                        int var32 = var30 + 1;
                        int var33;
                        if (var20 > var26) {
                            var33 = var26 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        int var34 = var23 & 0xFFF;
                        int var35 = var22 & 0xFFF;
                        int var36 = var24 & 0xFFF;
                        int var37 = var30 & 0xFF;
                        int var38;
                        if (var16 <= var29) {
                            var38 = 0;
                        } else {
                            var38 = var29 & 0xFF;
                        }
                        int var39;
                        if (var21 <= var32) {
                            var39 = 0;
                        } else {
                            var39 = var32 & 0xFF;
                        }
                        short var40 = this.field3218[var37];
                        int var41 = var34 - 4096;
                        short var42 = this.field3218[var39];
                        int var43 = class443.field6511[var36];
                        int var44 = class443.field6511[var35];
                        int var45 = var35 - 4096;
                        int var46 = var36 - 4096;
                        int var47 = class443.field6511[var34];
                        short var48 = this.field3218[var38 + var42];
                        short var49 = this.field3218[var31 + var40];
                        short var50 = this.field3218[var31 + var42];
                        short var51 = this.field3218[var38 + var40];
                        int var52 = class364.method2282(var36, var34, var35, this.field3218[var28 + var49], arg3 ^ 0xFFFFFD74);
                        int var53 = class364.method2282(var46, var34, var35, this.field3218[var33 + var49], arg3 - 843);
                        int var54 = var52 + ((var53 - var52) * var43 >> 12);
                        int var55 = class364.method2282(var36, var34, var45, this.field3218[var28 + var51], arg3 ^ 0xFFFFFD45);
                        int var56 = class364.method2282(var46, var34, var45, this.field3218[var33 + var51], -119);
                        int var57 = ((var56 - var55) * var43 >> 12) + var55;
                        int var58 = ((var57 - var54) * var44 >> 12) + var54;
                        int var59 = class364.method2282(var36, var41, var35, this.field3218[var28 + var50], -119);
                        int var60 = class364.method2282(var46, var41, var35, this.field3218[var33 + var50], -94);
                        int var61 = ((var60 - var59) * var43 >> 12) + var59;
                        int var62 = class364.method2282(var36, var41, var45, this.field3218[var28 + var48], arg3 - 855);
                        int var63 = class364.method2282(var46, var41, var45, this.field3218[var33 + var48], arg3 - 856);
                        int var64 = var62 + ((var63 - var62) * var43 >> 12);
                        int var65 = var61 + ((var64 - var61) * var44 >> 12);
                        this.method12(false, var58 + ((var65 - var58) * var47 >> 12), var14);
                    }
                    this.method16(8217);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZII)V")
    public abstract void method12(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(IIIII)V")
    public class190(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3209 = arg0;
        this.field3212 = arg2;
        this.field3205 = arg1;
        this.field3208 = arg4;
        this.field3217 = arg3;
        this.method1333(1348944044);
        this.method1335(0);
    }
}
