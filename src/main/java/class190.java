import java.awt.Color;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public abstract class class190 {

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
    private int field3023 = 0;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
    private int field3026 = 4;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public int field3025 = 4;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
    private int field3028 = 4;

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "I")
    private int field3031 = 4;

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "[S")
    private short[] field3033 = new short[512];

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3024 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!vt", name = "m", descriptor = "Lsk;")
    public static class423 field3035 = new class423("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "F")
    public static float field3029;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!vt", name = "n", descriptor = "[S")
    private short[] field3036;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
    public abstract void method772(int arg0);

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V")
    private final void method1198(int arg0) {
        field3030++;
        Random var2 = new Random((long) this.field3023);
        for (int var3 = arg0; var3 < 255; var3++) {
            this.field3033[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class482.method2911((byte) 45, var5, var2);
            short var7 = this.field3033[var6];
            this.field3033[var6] = this.field3033[var5];
            this.field3033[var5] = this.field3033[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(III)V")
    public abstract void method773(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "(I)V")
    public static void method1199(int arg0) {
        if (arg0 != -29901) {
            method1199(-91);
        }
        field3024 = null;
        field3035 = null;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V")
    public abstract void method770(byte arg0);

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BIII)V")
    public final void method1200(byte arg0, int arg1, int arg2, int arg3) {
        field3027++;
        int[] var5 = new int[arg3];
        int var6 = 3 / ((arg0 + 74) / 52);
        int[] var7 = new int[arg1];
        int[] var8 = new int[arg2];
        for (int var9 = 0; var9 < arg3; var9++) {
            var5[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var7[var10] = (var10 << 12) / arg1;
        }
        for (int var11 = 0; var11 < arg2; var11++) {
            var8[var11] = (var11 << 12) / arg2;
        }
        this.method772(1690691948);
        for (int var12 = 0; var12 < arg2; var12++) {
            for (int var13 = 0; var13 < arg1; var13++) {
                for (int var14 = 0; var14 < arg3; var14++) {
                    for (int var15 = 0; var15 < this.field3025; var15++) {
                        int var16 = this.field3036[var15] << 12;
                        int var17 = this.field3028 * var16 >> 12;
                        int var18 = var7[var13] * var16 >> 12;
                        int var19 = var5[var14] * var16 >> 12;
                        int var20 = this.field3026 * var16 >> 12;
                        int var21 = this.field3031 * var16 >> 12;
                        int var22 = var8[var12] * var16 >> 12;
                        int var23 = this.field3028 * var19;
                        int var24 = this.field3026 * var22;
                        int var25 = this.field3031 * var18;
                        int var26 = var23 >> 12;
                        int var27 = var26 + 1;
                        int var28 = var25 >> 12;
                        int var29 = var26 & 0xFF;
                        int var30 = var28 + 1;
                        int var31 = var24 >> 12;
                        int var32 = var28 & 0xFF;
                        int var33 = var31 + 1;
                        int var34 = var31 & 0xFF;
                        int var35;
                        if (var20 <= var33) {
                            var35 = 0;
                        } else {
                            var35 = var33 & 0xFF;
                        }
                        int var36 = var23 & 0xFFF;
                        int var37;
                        if (var21 > var30) {
                            var37 = var30 & 0xFF;
                        } else {
                            var37 = 0;
                        }
                        int var38 = var25 & 0xFFF;
                        int var39 = var24 & 0xFFF;
                        int var40;
                        if (var17 > var27) {
                            var40 = var27 & 0xFF;
                        } else {
                            var40 = 0;
                        }
                        int var41 = class383.field5580[var36];
                        int var42 = var36 - 4096;
                        int var43 = var38 - 4096;
                        int var44 = class383.field5580[var39];
                        int var45 = var39 - 4096;
                        int var46 = class383.field5580[var38];
                        short var47 = this.field3033[var35];
                        short var48 = this.field3033[var34];
                        short var49 = this.field3033[var37 + var47];
                        short var50 = this.field3033[var32 + var48];
                        short var51 = this.field3033[var37 + var48];
                        short var52 = this.field3033[var32 + var47];
                        int var53 = class369.method2238((byte) -128, this.field3033[var29 + var50], var36, var38, var39);
                        int var54 = class369.method2238((byte) -128, this.field3033[var40 + var50], var42, var38, var39);
                        int var55 = ((var54 - var53) * var41 >> 12) + var53;
                        int var56 = class369.method2238((byte) -128, this.field3033[var29 + var51], var36, var43, var39);
                        int var57 = class369.method2238((byte) -128, this.field3033[var40 + var51], var42, var43, var39);
                        int var58 = var56 + ((var57 - var56) * var41 >> 12);
                        int var59 = ((var58 - var55) * var46 >> 12) + var55;
                        int var60 = class369.method2238((byte) -128, this.field3033[var29 + var52], var36, var38, var45);
                        int var61 = class369.method2238((byte) -128, this.field3033[var40 + var52], var42, var38, var45);
                        int var62 = ((var61 - var60) * var41 >> 12) + var60;
                        int var63 = class369.method2238((byte) -128, this.field3033[var29 + var49], var36, var43, var45);
                        int var64 = class369.method2238((byte) -128, this.field3033[var40 + var49], var42, var43, var45);
                        int var65 = var63 + ((var64 - var63) * var41 >> 12);
                        int var66 = ((var65 - var62) * var46 >> 12) + var62;
                        this.method773(((var66 - var59) * var44 >> 12) + var59, -15478, var15);
                    }
                    this.method770((byte) -95);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "(I)V")
    private final void method1201(int arg0) {
        field3034++;
        this.field3036 = new short[this.field3025];
        if (arg0 != 255) {
            this.field3031 = -63;
        }
        for (int var2 = 0; var2 < this.field3025; var2++) {
            this.field3036[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(IIIII)V")
    public class190(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3023 = arg0;
        this.field3031 = arg3;
        this.field3026 = arg4;
        this.field3028 = arg2;
        this.field3025 = arg1;
        this.method1201(255);
        this.method1198(0);
    }
}
