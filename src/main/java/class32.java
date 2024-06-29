import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public abstract class class32 {

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "[S")
    private short[] field455 = new short[512];

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    private int field457 = 4;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    private int field458 = 4;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    private int field452 = 0;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public int field464 = 4;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    private int field465 = 4;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field453 = 0;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "Llm;")
    public static class347 field456;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "[S")
    private short[] field462;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIII)V", line = 4)
    public final void method213(int arg0, int arg1, int arg2, int arg3) {
        field454++;
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg3];
        int[] var7 = new int[arg1];
        for (int var8 = 0; var8 < arg0; var8++) {
            var5[var8] = (var8 << 12) / arg0;
        }
        for (int var9 = 0; var9 < arg3; var9++) {
            var6[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var7[var10] = (var10 << 12) / arg1;
        }
        if (arg2 != -586576148) {
            return;
        }
        this.method197(arg2 + 586576233);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field464; var14++) {
                        int var15 = this.field462[var14] << 12;
                        int var16 = var5[var13] * var15 >> 12;
                        int var17 = var7[var11] * var15 >> 12;
                        int var18 = var6[var12] * var15 >> 12;
                        int var19 = this.field457 * var15 >> 12;
                        int var20 = this.field465 * var15 >> 12;
                        int var21 = this.field458 * var15 >> 12;
                        int var22 = this.field465 * var16;
                        int var23 = this.field457 * var18;
                        int var24 = this.field458 * var17;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var23 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var24 >> 12;
                        int var31 = var28 & 0xFF;
                        int var32 = var30 + 1;
                        int var33 = var30 & 0xFF;
                        int var34 = var22 & 0xFFF;
                        int var35;
                        if (var29 < var19) {
                            var35 = var29 & 0xFF;
                        } else {
                            var35 = 0;
                        }
                        int var36 = var24 & 0xFFF;
                        int var37;
                        if (var32 >= var21) {
                            var37 = 0;
                        } else {
                            var37 = var32 & 0xFF;
                        }
                        int var38 = var23 & 0xFFF;
                        int var39;
                        if (var26 >= var20) {
                            var39 = 0;
                        } else {
                            var39 = var26 & 0xFF;
                        }
                        int var40 = var34 - 4096;
                        int var41 = class281.field4091[var34];
                        int var42 = var36 - 4096;
                        short var43 = this.field455[var33];
                        int var44 = class281.field4091[var38];
                        short var45 = this.field455[var37];
                        int var46 = class281.field4091[var36];
                        int var47 = var38 - 4096;
                        short var48 = this.field455[var31 + var45];
                        short var49 = this.field455[var31 + var43];
                        short var50 = this.field455[var35 + var45];
                        short var51 = this.field455[var35 + var43];
                        int var52 = class316.method2137(15, var34, var36, var38, this.field455[var27 + var49]);
                        int var53 = class316.method2137(15, var40, var36, var38, this.field455[var39 + var49]);
                        int var54 = var52 + ((var53 - var52) * var41 >> 12);
                        int var55 = class316.method2137(15, var34, var36, var47, this.field455[var27 + var51]);
                        int var56 = class316.method2137(15, var40, var36, var47, this.field455[var39 + var51]);
                        int var57 = ((var56 - var55) * var41 >> 12) + var55;
                        int var58 = class316.method2137(15, var34, var42, var38, this.field455[var27 + var48]);
                        int var59 = ((var57 - var54) * var44 >> 12) + var54;
                        int var60 = class316.method2137(15, var40, var42, var38, this.field455[var39 + var48]);
                        int var61 = ((var60 - var58) * var41 >> 12) + var58;
                        int var62 = class316.method2137(15, var34, var42, var47, this.field455[var27 + var50]);
                        int var63 = class316.method2137(arg2 ^ 0xDD098EE3, var40, var42, var47, this.field455[var39 + var50]);
                        int var64 = ((var63 - var62) * var41 >> 12) + var62;
                        int var65 = ((var64 - var61) * var44 >> 12) + var61;
                        this.method195(var14, (byte) 46, var59 + ((var65 - var59) * var46 >> 12));
                    }
                    this.method199(255);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(IIIII)V", line = 309)
    public class32(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field457 = arg3;
        this.field452 = arg0;
        this.field458 = arg4;
        this.field465 = arg2;
        this.field464 = arg1;
        this.method218((byte) -113);
        this.method216((byte) -106);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V", line = 180)
    public static final void method214(boolean arg0) {
        field460++;
        class321.field4733.method507(-128);
        if (!arg0) {
            method214(false);
        }
        class375.field5452 = 1;
        class129.field1785 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IC)C", line = 207)
    public static final char method215(int arg0, char arg1) {
        field463++;
        if (arg1 == 'µ' || arg1 == 'ƒ') {
            return arg1;
        } else if (arg0 >= -97) {
            return 'T';
        } else {
            return Character.toTitleCase(arg1);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V", line = 221)
    private final void method216(byte arg0) {
        field459++;
        Random var2 = new Random((long) this.field452);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field455[var3] = (short) var3;
        }
        if (arg0 >= -79) {
            this.field464 = 81;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class139.method895(-19416, var2, var5);
            short var7 = this.field455[var6];
            this.field455[var6] = this.field455[var5];
            this.field455[var5] = this.field455[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V", line = 262)
    public static void method217(int arg0) {
        field456 = null;
        if (arg0 < 86) {
            method214(false);
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)V", line = 280)
    private final void method218(byte arg0) {
        this.field462 = new short[this.field464];
        field461++;
        if (arg0 < -108) {
            for (int var2 = 0; var2 < this.field464; var2++) {
                this.field462[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public abstract void method199(int arg0);

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
    public abstract void method197(int arg0);

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IBI)V")
    public abstract void method195(int arg0, byte arg1, int arg2);
}
