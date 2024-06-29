import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public abstract class class45 {

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    private int field538 = 4;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "[S")
    private short[] field547 = new short[512];

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    private int field543 = 4;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    private int field548 = 0;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    private int field546 = 4;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public int field550 = 4;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field539 = 0;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "F")
    public static float field545;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "[S")
    private short[] field541;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    private final void method416(int arg0) {
        field540++;
        this.field541 = new short[this.field550];
        if (arg0 != 2) {
            this.field546 = -2;
        }
        for (int var2 = 0; var2 < this.field550; var2++) {
            this.field541[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)V")
    public abstract void method417(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
    public static final void method418(byte arg0) {
        int var1 = 74 / ((arg0 + 18) / 57);
        class173.field2569.method1068(0);
        field542++;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V")
    public abstract void method419(int arg0);

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)V")
    private final void method420(byte arg0) {
        field544++;
        Random var2 = new Random((long) this.field548);
        int var3 = -79 % ((-arg0 - 77) / 39);
        for (int var4 = 0; var4 < 255; var4++) {
            this.field547[var4] = (short) var4;
        }
        for (int var5 = 0; var5 < 255; var5++) {
            int var6 = 255 - var5;
            int var7 = class367.method2213(-837693600, var6, var2);
            short var8 = this.field547[var7];
            this.field547[var7] = this.field547[var6];
            this.field547[var6] = this.field547[var6 + 256] = var8;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IBII)V")
    public final void method421(int arg0, byte arg1, int arg2, int arg3) {
        field549++;
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg2];
        for (int var7 = 0; var7 < arg3; var7++) {
            var5[var7] = (var7 << 12) / arg3;
        }
        int[] var8 = new int[arg0];
        for (int var9 = 0; var9 < arg2; var9++) {
            var6[var9] = (var9 << 12) / arg2;
        }
        for (int var10 = 0; var10 < arg0; var10++) {
            var8[var10] = (var10 << 12) / arg0;
        }
        this.method422(true);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field550; var14++) {
                        int var15 = this.field541[var14] << 12;
                        int var16 = this.field538 * var15 >> 12;
                        int var17 = var8[var11] * var15 >> 12;
                        int var18 = this.field546 * var15 >> 12;
                        int var19 = var5[var13] * var15 >> 12;
                        int var20 = this.field543 * var15 >> 12;
                        int var21 = var6[var12] * var15 >> 12;
                        int var22 = this.field538 * var21;
                        int var23 = this.field543 * var17;
                        int var24 = this.field546 * var19;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var22 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var28 & 0xFF;
                        int var31 = var23 >> 12;
                        int var32 = var31 + 1;
                        int var33;
                        if (var26 >= var18) {
                            var33 = 0;
                        } else {
                            var33 = var26 & 0xFF;
                        }
                        int var34 = var22 & 0xFFF;
                        int var35 = var24 & 0xFFF;
                        int var36 = var31 & 0xFF;
                        int var37 = var23 & 0xFFF;
                        int var38;
                        if (var29 < var16) {
                            var38 = var29 & 0xFF;
                        } else {
                            var38 = 0;
                        }
                        int var39;
                        if (var20 > var32) {
                            var39 = var32 & 0xFF;
                        } else {
                            var39 = 0;
                        }
                        int var40 = var35 - 4096;
                        int var41 = class235.field3331[var37];
                        short var42 = this.field547[var39];
                        short var43 = this.field547[var36];
                        int var44 = class235.field3331[var35];
                        int var45 = var34 - 4096;
                        int var46 = class235.field3331[var34];
                        int var47 = var37 - 4096;
                        short var48 = this.field547[var38 + var42];
                        short var49 = this.field547[var38 + var43];
                        short var50 = this.field547[var30 + var42];
                        short var51 = this.field547[var30 + var43];
                        int var52 = class359.method2151((byte) -116, var34, var37, this.field547[var27 + var51], var35);
                        int var53 = class359.method2151((byte) 120, var34, var37, this.field547[var33 + var51], var40);
                        int var54 = ((var53 - var52) * var44 >> 12) + var52;
                        int var55 = class359.method2151((byte) 34, var45, var37, this.field547[var27 + var49], var35);
                        int var56 = class359.method2151((byte) 102, var45, var37, this.field547[var33 + var49], var40);
                        int var57 = var55 + ((var56 - var55) * var44 >> 12);
                        int var58 = var54 + ((var57 - var54) * var46 >> 12);
                        int var59 = class359.method2151((byte) 66, var34, var47, this.field547[var27 + var50], var35);
                        int var60 = class359.method2151((byte) 97, var34, var47, this.field547[var33 + var50], var40);
                        int var61 = var59 + ((var60 - var59) * var44 >> 12);
                        int var62 = class359.method2151((byte) -104, var45, var47, this.field547[var27 + var48], var35);
                        int var63 = class359.method2151((byte) -93, var45, var47, this.field547[var33 + var48], var40);
                        int var64 = var62 + ((var63 - var62) * var44 >> 12);
                        int var65 = ((var64 - var61) * var46 >> 12) + var61;
                        this.method417(var14, 0, var58 + ((var65 - var58) * var41 >> 12));
                    }
                    this.method419(arg1 - 24227);
                }
            }
        }
        if (arg1 != 90) {
            this.field543 = 62;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V")
    public abstract void method422(boolean arg0);

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(IIIII)V")
    public class45(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field543 = arg4;
        this.field546 = arg2;
        this.field550 = arg1;
        this.field548 = arg0;
        this.field538 = arg3;
        this.method416(2);
        this.method420((byte) -127);
    }
}
