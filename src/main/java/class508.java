import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public abstract class class508 {

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
    private int field7356 = 0;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public int field7357 = 4;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "[S")
    private short[] field7355 = new short[512];

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
    private int field7358 = 4;

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "I")
    private int field7365 = 4;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
    private int field7359 = 4;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
    public static int field7361 = 0;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
    public static int field7352 = 0;

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "I")
    public static int field7367 = -1;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "I")
    public static int field7362;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "I")
    public static int field7363;

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "I")
    public static int field7364;

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "I")
    public static int field7366;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "Lwc;")
    public static class49 field7360;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "[Lvk;")
    public static class250[] field7354;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "[S")
    private short[] field7353;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V")
    public abstract void method556(byte arg0);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIB)V")
    public abstract void method554(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
    public abstract void method559(int arg0);

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(B)V")
    private final void method3025(byte arg0) {
        int var2 = -108 / ((-arg0 - 35) / 60);
        field7366++;
        Random var3 = new Random((long) this.field7356);
        for (int var4 = 0; var4 < 255; var4++) {
            this.field7355[var4] = (short) var4;
        }
        for (int var5 = 0; var5 < 255; var5++) {
            int var6 = 255 - var5;
            int var7 = class477.method2908((byte) -12, var3, var6);
            short var8 = this.field7355[var7];
            this.field7355[var7] = this.field7355[var6];
            this.field7355[var6] = this.field7355[var6 + 256] = var8;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIII)V")
    public final void method3026(int arg0, int arg1, int arg2, int arg3) {
        field7363++;
        int[] var5 = new int[arg1];
        int[] var6 = new int[arg0];
        if (arg3 > -55) {
            this.method559(40);
        }
        for (int var7 = 0; var7 < arg1; var7++) {
            var5[var7] = (var7 << 12) / arg1;
        }
        int[] var8 = new int[arg2];
        for (int var9 = 0; var9 < arg0; var9++) {
            var6[var9] = (var9 << 12) / arg0;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var8[var10] = (var10 << 12) / arg2;
        }
        this.method556((byte) 124);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg0; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field7357; var14++) {
                        int var15 = this.field7353[var14] << 12;
                        int var16 = this.field7359 * var15 >> 12;
                        int var17 = var6[var12] * var15 >> 12;
                        int var18 = var8[var11] * var15 >> 12;
                        int var19 = this.field7358 * var15 >> 12;
                        int var20 = var5[var13] * var15 >> 12;
                        int var21 = this.field7365 * var15 >> 12;
                        int var22 = this.field7359 * var17;
                        int var23 = this.field7365 * var20;
                        int var24 = this.field7358 * var18;
                        int var25 = var23 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var22 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var24 >> 12;
                        int var31 = var28 & 0xFF;
                        int var32 = var30 + 1;
                        int var33 = var23 & 0xFFF;
                        int var34 = var30 & 0xFF;
                        int var35;
                        if (var32 < var19) {
                            var35 = var32 & 0xFF;
                        } else {
                            var35 = 0;
                        }
                        int var36 = var22 & 0xFFF;
                        int var37;
                        if (var29 >= var16) {
                            var37 = 0;
                        } else {
                            var37 = var29 & 0xFF;
                        }
                        int var38 = var24 & 0xFFF;
                        int var39;
                        if (var21 <= var26) {
                            var39 = 0;
                        } else {
                            var39 = var26 & 0xFF;
                        }
                        int var40 = class109.field1467[var33];
                        int var41 = class109.field1467[var38];
                        int var42 = var38 - 4096;
                        int var43 = var33 - 4096;
                        int var44 = var36 - 4096;
                        int var45 = class109.field1467[var36];
                        short var46 = this.field7355[var35];
                        short var47 = this.field7355[var34];
                        short var48 = this.field7355[var37 + var46];
                        short var49 = this.field7355[var31 + var47];
                        short var50 = this.field7355[var31 + var46];
                        short var51 = this.field7355[var37 + var47];
                        int var52 = class352.method2062(var36, this.field7355[var27 + var49], var38, 10673, var33);
                        int var53 = class352.method2062(var36, this.field7355[var39 + var49], var38, 10673, var43);
                        int var54 = var52 + ((var53 - var52) * var40 >> 12);
                        int var55 = class352.method2062(var44, this.field7355[var27 + var51], var38, 10673, var33);
                        int var56 = class352.method2062(var44, this.field7355[var39 + var51], var38, 10673, var43);
                        int var57 = ((var56 - var55) * var40 >> 12) + var55;
                        int var58 = ((var57 - var54) * var45 >> 12) + var54;
                        int var59 = class352.method2062(var36, this.field7355[var27 + var50], var42, 10673, var33);
                        int var60 = class352.method2062(var36, this.field7355[var39 + var50], var42, 10673, var43);
                        int var61 = ((var60 - var59) * var40 >> 12) + var59;
                        int var62 = class352.method2062(var44, this.field7355[var27 + var48], var42, 10673, var33);
                        int var63 = class352.method2062(var44, this.field7355[var39 + var48], var42, 10673, var43);
                        int var64 = ((var63 - var62) * var40 >> 12) + var62;
                        int var65 = ((var64 - var61) * var45 >> 12) + var61;
                        this.method554(var14, ((var65 - var58) * var41 >> 12) + var58, (byte) -120);
                    }
                    this.method559(-4096);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(IIB)B")
    public static final byte method3027(int arg0, int arg1, byte arg2) {
        if (arg2 <= 107) {
            return -8;
        }
        field7362++;
        if (arg1 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(B)V")
    private final void method3028(byte arg0) {
        this.field7353 = new short[this.field7357];
        field7364++;
        if (arg0 <= 36) {
            this.method554(85, 114, (byte) -125);
        }
        for (int var2 = 0; var2 < this.field7357; var2++) {
            this.field7353[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V")
    public static void method3029(int arg0) {
        field7360 = null;
        if (arg0 != 255) {
            method3027(-33, 106, (byte) 13);
        }
        field7354 = null;
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(IIIII)V")
    public class508(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7365 = arg2;
        this.field7359 = arg3;
        this.field7356 = arg0;
        this.field7358 = arg4;
        this.field7357 = arg1;
        this.method3028((byte) 114);
        this.method3025((byte) -128);
    }
}
