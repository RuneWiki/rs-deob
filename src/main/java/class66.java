import java.awt.Canvas;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public abstract class class66 {

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "[S")
    private short[] field1152 = new short[512];

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    private int field1156 = 4;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    private int field1157 = 4;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public int field1149 = 4;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    private int field1160 = 4;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    private int field1155 = 0;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field1153 = 0;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "Z")
    public static boolean field1151 = false;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "F")
    public static float field1161 = 0.0F;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "[F")
    public static float[] field1164 = new float[4];

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "[I")
    public static int[] field1165 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "F")
    public static float field1154;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "[S")
    private short[] field1166;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)V")
    public final void method572(int arg0, int arg1, int arg2, int arg3) {
        field1159++;
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg1];
        int[] var7 = new int[arg2];
        int var8 = 0;
        if (arg0 != -986971124) {
            this.method579(78, false, -126);
        }
        while (var8 < arg3) {
            var5[var8] = (var8 << 12) / arg3;
            var8++;
        }
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var7[var10] = (var10 << 12) / arg2;
        }
        this.method576((byte) 106);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field1149; var14++) {
                        int var15 = this.field1166[var14] << 12;
                        int var16 = var6[var12] * var15 >> 12;
                        int var17 = this.field1157 * var15 >> 12;
                        int var18 = this.field1160 * var15 >> 12;
                        int var19 = this.field1156 * var15 >> 12;
                        int var20 = var5[var13] * var15 >> 12;
                        int var21 = var7[var11] * var15 >> 12;
                        int var22 = this.field1156 * var20;
                        int var23 = this.field1157 * var21;
                        int var24 = this.field1160 * var16;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var24 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var23 >> 12;
                        int var31 = var27 & 0xFF;
                        int var32 = var30 + 1;
                        int var33;
                        if (var19 > var26) {
                            var33 = var26 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        int var34 = var22 & 0xFFF;
                        int var35 = var23 & 0xFFF;
                        int var36;
                        if (var17 <= var32) {
                            var36 = 0;
                        } else {
                            var36 = var32 & 0xFF;
                        }
                        int var37;
                        if (var29 < var18) {
                            var37 = var29 & 0xFF;
                        } else {
                            var37 = 0;
                        }
                        int var38 = var24 & 0xFFF;
                        int var39 = var30 & 0xFF;
                        int var40 = var38 - 4096;
                        short var41 = this.field1152[var39];
                        int var42 = class351.field5332[var34];
                        int var43 = var34 - 4096;
                        short var44 = this.field1152[var36];
                        int var45 = var35 - 4096;
                        int var46 = class351.field5332[var38];
                        int var47 = class351.field5332[var35];
                        short var48 = this.field1152[var37 + var41];
                        short var49 = this.field1152[var37 + var44];
                        short var50 = this.field1152[var31 + var44];
                        short var51 = this.field1152[var31 + var41];
                        int var52 = class428.method2612(this.field1152[var28 + var51], var34, var35, arg0 + 986971119, var38);
                        int var53 = class428.method2612(this.field1152[var33 + var51], var43, var35, arg0 ^ 0x3AD3FBF7, var38);
                        int var54 = ((var53 - var52) * var42 >> 12) + var52;
                        int var55 = class428.method2612(this.field1152[var28 + var48], var34, var35, -5, var40);
                        int var56 = class428.method2612(this.field1152[var33 + var48], var43, var35, -5, var40);
                        int var57 = ((var56 - var55) * var42 >> 12) + var55;
                        int var58 = var54 + ((var57 - var54) * var46 >> 12);
                        int var59 = class428.method2612(this.field1152[var28 + var50], var34, var45, -5, var38);
                        int var60 = class428.method2612(this.field1152[var33 + var50], var43, var45, arg0 + 986971119, var38);
                        int var61 = var59 + ((var60 - var59) * var42 >> 12);
                        int var62 = class428.method2612(this.field1152[var28 + var49], var34, var45, arg0 ^ 0x3AD3FBF7, var40);
                        int var63 = class428.method2612(this.field1152[var33 + var49], var43, var45, -5, var40);
                        int var64 = var62 + ((var63 - var62) * var42 >> 12);
                        int var65 = var61 + ((var64 - var61) * var46 >> 12);
                        this.method579(((var65 - var58) * var47 >> 12) + var58, true, var14);
                    }
                    this.method574(28007);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public static void method573(int arg0) {
        field1164 = null;
        int var1 = 48 / ((arg0 + 58) / 63);
        field1165 = null;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
    public abstract void method574(int arg0);

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V")
    private final void method575(int arg0) {
        field1158++;
        Random var2 = new Random((long) this.field1155);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field1152[var3] = (short) var3;
        }
        if (arg0 != -256) {
            this.field1157 = 8;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class104.method790((byte) 90, var5, var2);
            short var7 = this.field1152[var6];
            this.field1152[var6] = this.field1152[var5];
            this.field1152[var5] = this.field1152[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public abstract void method576(byte arg0);

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)V")
    private final void method577(int arg0) {
        if (arg0 != -18101) {
            return;
        }
        field1150++;
        this.field1166 = new short[this.field1149];
        for (int var2 = 0; var2 < this.field1149; var2++) {
            this.field1166[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILjava/awt/Canvas;)Lpl;")
    public static final class458 method578(int arg0, Canvas arg1) {
        field1162++;
        try {
            Class var2 = Class.forName("wl");
            class458 var3 = (class458) var2.getDeclaredConstructor().newInstance();
            var3.method1419(arg1, 0);
            return arg0 == 24742 ? var3 : null;
        } catch (Throwable var5) {
            class213 var4 = new class213();
            var4.method1419(arg1, arg0 - 24742);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZI)V")
    public abstract void method579(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(IIIII)V")
    public class66(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1155 = arg0;
        this.field1149 = arg1;
        this.field1160 = arg3;
        this.field1156 = arg2;
        this.field1157 = arg4;
        this.method577(-18101);
        this.method575(-256);
    }
}
