import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public abstract class class389 {

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    private int field5431 = 4;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "I")
    private int field5439 = 4;

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "I")
    private int field5440 = 4;

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
    public int field5441 = 4;

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
    private int field5442 = 0;

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "[S")
    private short[] field5445 = new short[512];

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field5436 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "Lfw;")
    public static class55 field5437;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "[S")
    private short[] field5433;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)V")
    public static void method2425(boolean arg0) {
        field5437 = null;
        field5436 = null;
        if (arg0) {
            field5437 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
    public static final void method2426(int arg0) {
        field5443++;
        if (class750.field10477 != null) {
            class750.field10477.method2266(958);
        }
        if (arg0 >= -92) {
            field5432 = 10;
        }
        if (class174.field2538 == null) {
            return;
        }
        while (true) {
            try {
                class174.field2538.join();
                return;
            } catch (InterruptedException var1) {
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V")
    public abstract void method2427(byte arg0);

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)I")
    public static final int method2428(byte arg0) {
        field5444++;
        if (class435.field6079 == 1) {
            return class575.field8149;
        } else {
            int var1 = 103 / ((arg0 + 57) / 62);
            return class546.field7700;
        }
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)V")
    public abstract void method2429(int arg0);

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIII)V")
    public final void method2430(int arg0, int arg1, int arg2, int arg3) {
        field5438++;
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg3];
        for (int var7 = 0; var7 < arg0; var7++) {
            var5[var7] = (var7 << 12) / arg0;
        }
        int[] var8 = new int[arg2];
        for (int var9 = 0; var9 < arg3; var9++) {
            var6[var9] = (var9 << 12) / arg3;
        }
        int var10 = 0;
        if (arg1 <= 99) {
            field5432 = -101;
        }
        while (var10 < arg2) {
            var8[var10] = (var10 << 12) / arg2;
            var10++;
        }
        this.method2429(-22125);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field5441; var14++) {
                        int var15 = this.field5433[var14] << 12;
                        int var16 = this.field5439 * var15 >> 12;
                        int var17 = var5[var13] * var15 >> 12;
                        int var18 = var6[var12] * var15 >> 12;
                        int var19 = var8[var11] * var15 >> 12;
                        int var20 = this.field5440 * var15 >> 12;
                        int var21 = this.field5431 * var15 >> 12;
                        int var22 = this.field5439 * var17;
                        int var23 = this.field5431 * var18;
                        int var24 = this.field5440 * var19;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var23 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var24 >> 12;
                        int var31 = var28 & 0xFF;
                        int var32 = var30 + 1;
                        int var33;
                        if (var20 > var32) {
                            var33 = var32 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        int var34 = var23 & 0xFFF;
                        int var35;
                        if (var16 > var26) {
                            var35 = var26 & 0xFF;
                        } else {
                            var35 = 0;
                        }
                        int var36 = var30 & 0xFF;
                        int var37 = var24 & 0xFFF;
                        int var38;
                        if (var21 > var29) {
                            var38 = var29 & 0xFF;
                        } else {
                            var38 = 0;
                        }
                        int var39 = var22 & 0xFFF;
                        short var40 = this.field5445[var33];
                        int var41 = var39 - 4096;
                        short var42 = this.field5445[var36];
                        int var43 = class199.field2866[var34];
                        int var44 = var34 - 4096;
                        int var45 = class199.field2866[var39];
                        int var46 = class199.field2866[var37];
                        int var47 = var37 - 4096;
                        short var48 = this.field5445[var31 + var40];
                        short var49 = this.field5445[var31 + var42];
                        short var50 = this.field5445[var38 + var42];
                        short var51 = this.field5445[var38 + var40];
                        int var52 = class195.method1368(this.field5445[var27 + var49], var39, (byte) 121, var37, var34);
                        int var53 = class195.method1368(this.field5445[var35 + var49], var41, (byte) 121, var37, var34);
                        int var54 = ((var53 - var52) * var45 >> 12) + var52;
                        int var55 = class195.method1368(this.field5445[var27 + var50], var39, (byte) 121, var37, var44);
                        int var56 = class195.method1368(this.field5445[var35 + var50], var41, (byte) 121, var37, var44);
                        int var57 = ((var56 - var55) * var45 >> 12) + var55;
                        int var58 = class195.method1368(this.field5445[var27 + var48], var39, (byte) 121, var47, var34);
                        int var59 = var54 + ((var57 - var54) * var43 >> 12);
                        int var60 = class195.method1368(this.field5445[var35 + var48], var41, (byte) 121, var47, var34);
                        int var61 = ((var60 - var58) * var45 >> 12) + var58;
                        int var62 = class195.method1368(this.field5445[var27 + var51], var39, (byte) 121, var47, var44);
                        int var63 = class195.method1368(this.field5445[var35 + var51], var41, (byte) 121, var47, var44);
                        int var64 = ((var63 - var62) * var45 >> 12) + var62;
                        int var65 = ((var64 - var61) * var43 >> 12) + var61;
                        this.method2431(var14, 116, var59 + ((var65 - var59) * var46 >> 12));
                    }
                    this.method2427((byte) 106);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)V")
    public abstract void method2431(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(B)V")
    private final void method2432(byte arg0) {
        this.field5433 = new short[this.field5441];
        field5434++;
        for (int var2 = 0; var2 < this.field5441; var2++) {
            this.field5433[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 != -108) {
            method2426(-65);
        }
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(IIIII)V")
    public class389(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5439 = arg2;
        this.field5441 = arg1;
        this.field5440 = arg4;
        this.field5442 = arg0;
        this.field5431 = arg3;
        this.method2432((byte) -108);
        this.method2433((byte) 121);
    }

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "(B)V")
    private final void method2433(byte arg0) {
        field5435++;
        Random var2 = new Random((long) this.field5442);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field5445[var3] = (short) var3;
        }
        int var4 = 0;
        if (arg0 < 105) {
            this.field5439 = -89;
        }
        while (var4 < 255) {
            int var5 = 255 - var4;
            int var6 = class459.method2800(var2, var5, (byte) -44);
            short var7 = this.field5445[var6];
            this.field5445[var6] = this.field5445[var5];
            this.field5445[var5] = this.field5445[var5 + 256] = var7;
            var4++;
        }
    }
}
