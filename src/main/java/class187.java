import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public abstract class class187 {

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    private int field2740 = 4;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    private int field2739 = 4;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "[S")
    private short[] field2741 = new short[512];

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public int field2743 = 4;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    private int field2736 = 0;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    private int field2742 = 4;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field2744 = 0;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field2748 = new String[100];

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Laa;")
    public static class76 field2738 = new class76(45, 4);

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "[I")
    public static int[] field2752 = new int[500];

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Laa;")
    public static class76 field2751 = new class76(48, 8);

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "Lgn;")
    public static class526 field2753 = new class526(8, 4);

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "Z")
    public static boolean field2754 = false;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "[S")
    private short[] field2735;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII)V", line = 5)
    public final void method1257(int arg0, int arg1, int arg2, int arg3) {
        field2737++;
        int[] var5 = new int[arg0];
        if (arg2 > -110) {
            this.field2742 = 54;
        }
        int[] var6 = new int[arg1];
        for (int var7 = 0; var7 < arg0; var7++) {
            var5[var7] = (var7 << 12) / arg0;
        }
        int[] var8 = new int[arg3];
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var8[var10] = (var10 << 12) / arg3;
        }
        this.method1022(127);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field2743; var14++) {
                        int var15 = this.field2735[var14] << 12;
                        int var16 = this.field2739 * var15 >> 12;
                        int var17 = this.field2740 * var15 >> 12;
                        int var18 = var8[var11] * var15 >> 12;
                        int var19 = var5[var13] * var15 >> 12;
                        int var20 = this.field2742 * var15 >> 12;
                        int var21 = var6[var12] * var15 >> 12;
                        int var22 = this.field2742 * var19;
                        int var23 = this.field2739 * var18;
                        int var24 = this.field2740 * var21;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var24 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var23 >> 12;
                        int var31 = var28 & 0xFF;
                        int var32 = var30 + 1;
                        int var33 = var22 & 0xFFF;
                        int var34;
                        if (var17 <= var29) {
                            var34 = 0;
                        } else {
                            var34 = var29 & 0xFF;
                        }
                        int var35 = var30 & 0xFF;
                        int var36;
                        if (var20 > var26) {
                            var36 = var26 & 0xFF;
                        } else {
                            var36 = 0;
                        }
                        int var37 = var23 & 0xFFF;
                        int var38;
                        if (var32 < var16) {
                            var38 = var32 & 0xFF;
                        } else {
                            var38 = 0;
                        }
                        int var39 = var24 & 0xFFF;
                        int var40 = var39 - 4096;
                        int var41 = var37 - 4096;
                        int var42 = var33 - 4096;
                        int var43 = class512.field7507[var39];
                        int var44 = class512.field7507[var33];
                        int var45 = class512.field7507[var37];
                        short var46 = this.field2741[var38];
                        short var47 = this.field2741[var35];
                        short var48 = this.field2741[var34 + var47];
                        short var49 = this.field2741[var31 + var47];
                        short var50 = this.field2741[var34 + var46];
                        short var51 = this.field2741[var31 + var46];
                        int var52 = class165.method1156(this.field2741[var27 + var49], -1, var39, var37, var33);
                        int var53 = class165.method1156(this.field2741[var36 + var49], -1, var39, var37, var42);
                        int var54 = var52 + ((var53 - var52) * var44 >> 12);
                        int var55 = class165.method1156(this.field2741[var27 + var48], -1, var40, var37, var33);
                        int var56 = class165.method1156(this.field2741[var36 + var48], -1, var40, var37, var42);
                        int var57 = ((var56 - var55) * var44 >> 12) + var55;
                        int var58 = class165.method1156(this.field2741[var27 + var51], -1, var39, var41, var33);
                        int var59 = ((var57 - var54) * var43 >> 12) + var54;
                        int var60 = class165.method1156(this.field2741[var36 + var51], -1, var39, var41, var42);
                        int var61 = ((var60 - var58) * var44 >> 12) + var58;
                        int var62 = class165.method1156(this.field2741[var27 + var50], -1, var40, var41, var33);
                        int var63 = class165.method1156(this.field2741[var36 + var50], -1, var40, var41, var42);
                        int var64 = ((var63 - var62) * var44 >> 12) + var62;
                        int var65 = ((var64 - var61) * var43 >> 12) + var61;
                        this.method1020((byte) 30, var14, ((var65 - var59) * var45 >> 12) + var59);
                    }
                    this.method1024(-5861);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 174)
    private final void method1258(int arg0) {
        field2746++;
        Random var2 = new Random((long) this.field2736);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field2741[var3] = (short) var3;
        }
        int var4 = 0;
        if (arg0 != -29267) {
            return;
        }
        while (var4 < 255) {
            int var5 = 255 - var4;
            int var6 = class363.method2166(22591, var5, var2);
            short var7 = this.field2741[var6];
            this.field2741[var6] = this.field2741[var5];
            this.field2741[var5] = this.field2741[var5 + 256] = var7;
            var4++;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V", line = 212)
    private final void method1259(int arg0) {
        if (arg0 >= -50) {
            this.method1020((byte) -55, 24, 48);
        }
        this.field2735 = new short[this.field2743];
        field2745++;
        for (int var2 = 0; var2 < this.field2743; var2++) {
            this.field2735[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(IIIII)V", line = 310)
    public class187(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2743 = arg1;
        this.field2742 = arg2;
        this.field2736 = arg0;
        this.field2740 = arg3;
        this.field2739 = arg4;
        this.method1259(-65);
        this.method1258(-29267);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILok;)I", line = 259)
    public static final int method1260(int arg0, class74 arg1) {
        field2749++;
        int var2 = 0;
        if (arg0 != -902853748) {
            return -13;
        }
        if (arg1.method551(-57, class219.field3143)) {
            var2++;
        }
        if (arg1.method551(-9, class455.field6675)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V", line = 293)
    public static void method1261(boolean arg0) {
        field2753 = null;
        if (arg0) {
            field2754 = false;
        }
        field2748 = null;
        field2738 = null;
        field2751 = null;
        field2752 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BII)V")
    public abstract void method1020(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
    public abstract void method1024(int arg0);

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
    public abstract void method1022(int arg0);
}
