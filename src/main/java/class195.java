import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public abstract class class195 {

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    private int field3040 = 4;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "[S")
    private short[] field3039 = new short[512];

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public int field3044 = 4;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    private int field3045 = 4;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    private int field3050 = 0;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    private int field3047 = 4;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field3035 = 0;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "Lni;")
    public static class202 field3041;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "[I")
    public static int[] field3043;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "[S")
    private short[] field3042;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIIIIIIB)V", line = 20)
    public static final void method1276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        boolean var11;
        if (class286.field4819 > 0 && class286.field4819 % 10 < 5) {
            var11 = true;
        } else {
            var11 = false;
        }
        if (arg10 < 26) {
            method1276(-46, -4, 108, -40, -20, -101, 85, 108, -127, 35, (byte) 118);
        }
        int var12 = arg0 - arg8;
        field3051++;
        int var13 = arg7 - arg4;
        int var14 = 983040 / arg2;
        int var15 = 983040 / arg1;
        for (int var16 = -var14; var16 < var13 + var14; var16++) {
            int var17 = arg2 * var16 + arg6 >> 16;
            int var18 = arg6 + ((var16 + 1) * arg2) >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                int var20 = arg5 + var17;
                int var10000 = arg5 + var18;
                int var22 = arg4 + var16 >> 6;
                if (var22 >= 0 && class278.field4722.length - 1 >= var22) {
                    int[][] var23 = class278.field4722[var22];
                    for (int var24 = -var15; var24 < var12 + var15; var24++) {
                        int var25 = arg1 * var24 + arg9 >> 16;
                        int var26 = (var24 + 1) * arg1 + arg9 >> 16;
                        int var27 = var26 - var25;
                        if (var27 > 0) {
                            int var28 = arg3 + var25;
                            var10000 = arg3 + var26;
                            int var30 = arg8 + var24 >> 6;
                            if (var30 >= 0 && var30 <= var23.length - 1 && var23[var30] != null) {
                                int var31 = (arg8 + var24 & 0x3F << 6) + (var16 + arg4 & 0x3F);
                                int var32 = var23[var30][var31];
                                if (var32 != 0) {
                                    class185 var33 = class77.method536(var32 - 1, 125);
                                    if (var11 && class155.field2303 == var33.field2903) {
                                        class260 var34 = new class260();
                                        var34.field4432 = var33.field2903;
                                        var34.field4427 = var20;
                                        var34.field4440 = var28;
                                        class259.field4422.method1485(-8564, var34);
                                    }
                                    class103.field1535[var33.field2903].method213(var20 - 7, var28 + -7);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class260 var35 = (class260) class259.field4422.method1475(14); var35 != null; var35 = (class260) class259.field4422.method1486(38)) {
            class103.field1535[var35.field4432].method213(var35.field4427 - 7, var35.field4440 + -7);
            class191.method1252(var35.field4427, var35.field4440, 15, 16776960, 128);
            class191.method1252(var35.field4427, var35.field4440, 7, 16777215, 256);
        }
        class259.field4422.method1474((byte) 107);
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(IIIII)V", line = 429)
    public class195(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3045 = arg4;
        this.field3050 = arg0;
        this.field3044 = arg1;
        this.field3040 = arg2;
        this.field3047 = arg3;
        this.method1281(-1);
        this.method1280((byte) -90);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIB)V", line = 152)
    public final void method1277(int arg0, int arg1, int arg2, byte arg3) {
        field3036++;
        if (arg3 != -32) {
            field3041 = (class202) null;
        }
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg2];
        for (int var7 = 0; var7 < arg0; var7++) {
            var5[var7] = (var7 << 12) / arg0;
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var6[var8] = (var8 << 12) / arg2;
        }
        int[] var9 = new int[arg1];
        for (int var10 = 0; var10 < arg1; var10++) {
            var9[var10] = (var10 << 12) / arg1;
        }
        this.method933((byte) -128);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field3044; var14++) {
                        int var15 = this.field3042[var14] << 12;
                        int var16 = var5[var13] * var15 >> 12;
                        int var17 = var6[var12] * var15 >> 12;
                        int var18 = this.field3040 * var16;
                        int var19 = var18 >> 12;
                        int var20 = this.field3047 * var17;
                        int var21 = this.field3047 * var15 >> 12;
                        int var22 = var19 + 1;
                        int var23 = var18 & 0xFFF;
                        int var24 = var9[var11] * var15 >> 12;
                        int var25 = this.field3045 * var24;
                        int var26 = var25 >> 12;
                        int var27 = var25 & 0xFFF;
                        int var28 = var19 & 0xFF;
                        int var29 = var20 >> 12;
                        int var30 = var26 + 1;
                        int var31 = this.field3045 * var15 >> 12;
                        int var32 = class10.field148[var27];
                        int var33 = this.field3040 * var15 >> 12;
                        int var34;
                        if (var31 <= var30) {
                            var34 = 0;
                        } else {
                            var34 = var30 & 0xFF;
                        }
                        int var35 = class10.field148[var23];
                        int var36;
                        if (var33 <= var22) {
                            var36 = 0;
                        } else {
                            var36 = var22 & 0xFF;
                        }
                        int var37 = var20 & 0xFFF;
                        int var38 = var29 + 1;
                        int var39 = class10.field148[var37];
                        int var40 = var29 & 0xFF;
                        int var41 = var37 - 4096;
                        short var42 = this.field3039[var34];
                        short var43 = this.field3039[var40 + var42];
                        int var44 = var23 - 4096;
                        int var45 = var26 & 0xFF;
                        int var46 = var27 - 4096;
                        int var47;
                        if (var21 > var38) {
                            var47 = var38 & 0xFF;
                        } else {
                            var47 = 0;
                        }
                        short var48 = this.field3039[var42 + var47];
                        short var49 = this.field3039[var45];
                        short var50 = this.field3039[var40 + var49];
                        short var51 = this.field3039[var47 + var49];
                        int var52 = class66.method473(var23, this.field3039[var28 + var50], arg3 ^ 0xFFFF8A7F, var27, var37);
                        int var53 = class66.method473(var44, this.field3039[var36 + var50], 30111, var27, var37);
                        int var54 = var52 + ((var53 - var52) * var35 >> 12);
                        int var55 = class66.method473(var23, this.field3039[var28 + var51], 30111, var27, var41);
                        int var56 = class66.method473(var44, this.field3039[var36 + var51], 30111, var27, var41);
                        int var57 = ((var56 - var55) * var35 >> 12) + var55;
                        int var58 = class66.method473(var23, this.field3039[var28 + var43], 30111, var46, var37);
                        int var59 = class66.method473(var44, this.field3039[var36 + var43], 30111, var46, var37);
                        int var60 = var54 + ((var57 - var54) * var39 >> 12);
                        int var61 = var58 + ((var59 - var58) * var35 >> 12);
                        int var62 = class66.method473(var23, this.field3039[var28 + var48], 30111, var46, var41);
                        int var63 = class66.method473(var44, this.field3039[var36 + var48], 30111, var46, var41);
                        int var64 = var62 + ((var63 - var62) * var35 >> 12);
                        int var65 = ((var64 - var61) * var39 >> 12) + var61;
                        this.method931(-1, var14, ((var65 - var60) * var32 >> 12) + var60);
                    }
                    this.method934((byte) -60);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V", line = 320)
    public static void method1278(int arg0) {
        if (arg0 != -1) {
            field3035 = -39;
        }
        field3041 = null;
        field3043 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIBIZIIF)[I", line = 341)
    public static final int[] method1279(int arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5, int arg6, float arg7) {
        field3049++;
        class156 var8 = new class156();
        var8.field2312 = arg4;
        var8.field2321 = arg0;
        var8.field2330 = arg3;
        var8.field2319 = arg5;
        var8.field2326 = (int) (arg7 * 4096.0F);
        int[] var9 = new int[arg6];
        var8.field2315 = arg1;
        var8.method111(127);
        int var10 = 104 % ((67 - arg2) / 37);
        class138.method898(16828, 1, arg6);
        var8.method1003(var9, (byte) -27, 0);
        return var9;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V", line = 371)
    private final void method1280(byte arg0) {
        Random var2 = new Random((long) this.field3050);
        field3048++;
        for (int var3 = 0; var3 < 255; var3++) {
            this.field3039[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class81.method555((byte) -57, var5, var2);
            short var7 = this.field3039[var6];
            this.field3039[var6] = this.field3039[var5];
            this.field3039[var5] = this.field3039[var5 + 256] = var7;
        }
        if (arg0 >= -10) {
            this.method931(57, -58, -77);
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V", line = 408)
    private final void method1281(int arg0) {
        if (arg0 != -1) {
            this.method1281(92);
        }
        field3046++;
        this.field3042 = new short[this.field3044];
        for (int var2 = 0; var2 < this.field3044; var2++) {
            this.field3042[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V", line = 444)
    public static final void method1282(boolean arg0) {
        field3037++;
        class18.field309.method522(63);
        class59.field926.method522(71);
        if (!arg0) {
            method1278(-116);
        }
        class37.field584.method522(124);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public abstract void method934(byte arg0);

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(B)V")
    public abstract void method933(byte arg0);

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V")
    public abstract void method931(int arg0, int arg1, int arg2);
}
