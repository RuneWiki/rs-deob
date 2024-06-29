import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public abstract class class165 {

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
    public int field2492 = 4;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
    private int field2489 = 4;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
    private int field2497 = 0;

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "I")
    private int field2496 = 4;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
    private int field2499 = 4;

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "[S")
    private short[] field2498 = new short[512];

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "J")
    public static long field2495 = 0L;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "Lpu;")
    public static class179 field2488 = new class179("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "[S")
    private short[] field2490;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)V")
    public abstract void method1001(boolean arg0);

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIII)V")
    public final void method1177(int arg0, int arg1, int arg2, int arg3) {
        field2491++;
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg0];
        for (int var7 = 0; var7 < arg2; var7++) {
            var5[var7] = (var7 << 12) / arg2;
        }
        int[] var8 = new int[arg1];
        if (arg3 != 17152) {
            this.method1178(73);
        }
        for (int var9 = 0; var9 < arg0; var9++) {
            var6[var9] = (var9 << 12) / arg0;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var8[var10] = (var10 << 12) / arg1;
        }
        this.method996(-7782);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg0; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field2492; var14++) {
                        int var15 = this.field2490[var14] << 12;
                        int var16 = var6[var12] * var15 >> 12;
                        int var17 = this.field2499 * var15 >> 12;
                        int var18 = this.field2489 * var15 >> 12;
                        int var19 = this.field2496 * var15 >> 12;
                        int var20 = var5[var13] * var15 >> 12;
                        int var21 = var8[var11] * var15 >> 12;
                        int var22 = this.field2499 * var16;
                        int var23 = this.field2496 * var21;
                        int var24 = this.field2489 * var20;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var22 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var28 & 0xFF;
                        int var31 = var23 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var22 & 0xFFF;
                        int var34 = var31 & 0xFF;
                        int var35;
                        if (var18 <= var26) {
                            var35 = 0;
                        } else {
                            var35 = var26 & 0xFF;
                        }
                        int var36;
                        if (var29 >= var17) {
                            var36 = 0;
                        } else {
                            var36 = var29 & 0xFF;
                        }
                        int var37;
                        if (var19 > var32) {
                            var37 = var32 & 0xFF;
                        } else {
                            var37 = 0;
                        }
                        int var38 = var23 & 0xFFF;
                        int var39 = var24 & 0xFFF;
                        short var40 = this.field2498[var37];
                        int var41 = var38 - 4096;
                        int var42 = class501.field7283[var38];
                        short var43 = this.field2498[var34];
                        int var44 = var39 - 4096;
                        int var45 = class501.field7283[var39];
                        int var46 = var33 - 4096;
                        int var47 = class501.field7283[var33];
                        short var48 = this.field2498[var36 + var43];
                        short var49 = this.field2498[var30 + var40];
                        short var50 = this.field2498[var30 + var43];
                        short var51 = this.field2498[var36 + var40];
                        int var52 = class284.method1912(this.field2498[var27 + var50], var33, -9, var39, var38);
                        int var53 = class284.method1912(this.field2498[var35 + var50], var33, arg3 - 17161, var44, var38);
                        int var54 = ((var53 - var52) * var45 >> 12) + var52;
                        int var55 = class284.method1912(this.field2498[var27 + var48], var46, -9, var39, var38);
                        int var56 = class284.method1912(this.field2498[var35 + var48], var46, -9, var44, var38);
                        int var57 = ((var56 - var55) * var45 >> 12) + var55;
                        int var58 = class284.method1912(this.field2498[var27 + var49], var33, -9, var39, var41);
                        int var59 = var54 + ((var57 - var54) * var47 >> 12);
                        int var60 = class284.method1912(this.field2498[var35 + var49], var33, -9, var44, var41);
                        int var61 = ((var60 - var58) * var45 >> 12) + var58;
                        int var62 = class284.method1912(this.field2498[var27 + var51], var46, -9, var39, var41);
                        int var63 = class284.method1912(this.field2498[var35 + var51], var46, -9, var44, var41);
                        int var64 = ((var63 - var62) * var45 >> 12) + var62;
                        int var65 = ((var64 - var61) * var47 >> 12) + var61;
                        this.method997(-10656, ((var65 - var59) * var42 >> 12) + var59, var14);
                    }
                    this.method1001(false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
    public abstract void method996(int arg0);

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)V")
    private final void method1178(int arg0) {
        field2494++;
        Random var2 = new Random((long) this.field2497);
        if (arg0 > -11) {
            return;
        }
        for (int var3 = 0; var3 < 255; var3++) {
            this.field2498[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class58.method378(false, var5, var2);
            short var7 = this.field2498[var6];
            this.field2498[var6] = this.field2498[var5];
            this.field2498[var5] = this.field2498[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(III)V")
    public abstract void method997(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(Z)V")
    private final void method1179(boolean arg0) {
        if (!arg0) {
            return;
        }
        field2493++;
        this.field2490 = new short[this.field2492];
        for (int var2 = 0; var2 < this.field2492; var2++) {
            this.field2490[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
    public static void method1180(byte arg0) {
        if (arg0 != -124) {
            field2488 = null;
        }
        field2488 = null;
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(IIIII)V")
    public class165(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2492 = arg1;
        this.field2497 = arg0;
        this.field2489 = arg2;
        this.field2499 = arg3;
        this.field2496 = arg4;
        this.method1179(true);
        this.method1178(-46);
    }
}
