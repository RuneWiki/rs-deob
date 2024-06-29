import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public abstract class class296 {

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    private int field4490 = 4;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public int field4495 = 4;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "[S")
    private short[] field4494 = new short[512];

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    private int field4499 = 4;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    private int field4493 = 0;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    private int field4503 = 4;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field4497;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "Lqg;")
    public static class325 field4491;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "[S")
    private short[] field4502;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    private final void method1910(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field4500++;
        Random var2 = new Random((long) this.field4493);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field4494[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class32.method222(var2, arg0 ^ 0x331D, var5);
            short var7 = this.field4494[var6];
            this.field4494[var6] = this.field4494[var5];
            this.field4494[var5] = this.field4494[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public abstract void method789(byte arg0);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)V")
    public abstract void method790(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(III)Llv;")
    public static final class311 method1911(int arg0, int arg1, int arg2) {
        class234 var3 = class518.field7511[arg0][arg1][arg2];
        return var3 == null || var3.field3619 == null ? null : var3.field3619;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
    private final void method1912(boolean arg0) {
        field4489++;
        this.field4502 = new short[this.field4495];
        for (int var2 = 0; var2 < this.field4495; var2++) {
            this.field4502[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (!arg0) {
            field4498 = -123;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
    public abstract void method791(int arg0);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IC)Z")
    public static final boolean method1913(int arg0, char arg1) {
        field4496++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg0 != 255) {
            field4501 = 115;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class146.field2454;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIII)V")
    public final void method1914(int arg0, int arg1, int arg2, int arg3) {
        field4492++;
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg2];
        for (int var7 = 0; var7 < arg0; var7++) {
            var5[var7] = (var7 << 12) / arg0;
        }
        int[] var8 = new int[arg3];
        for (int var9 = arg1; var9 < arg2; var9++) {
            var6[var9] = (var9 << 12) / arg2;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var8[var10] = (var10 << 12) / arg3;
        }
        this.method791(92);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field4495; var14++) {
                        int var15 = this.field4502[var14] << 12;
                        int var16 = this.field4499 * var15 >> 12;
                        int var17 = this.field4490 * var15 >> 12;
                        int var18 = var8[var11] * var15 >> 12;
                        int var19 = this.field4503 * var15 >> 12;
                        int var20 = var5[var13] * var15 >> 12;
                        int var21 = var6[var12] * var15 >> 12;
                        int var22 = this.field4490 * var20;
                        int var23 = this.field4499 * var21;
                        int var24 = this.field4503 * var18;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var23 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var24 >> 12;
                        int var31 = var28 & 0xFF;
                        int var32 = var30 + 1;
                        int var33;
                        if (var17 > var26) {
                            var33 = var26 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        int var34 = var23 & 0xFFF;
                        int var35 = var24 & 0xFFF;
                        int var36;
                        if (var29 < var16) {
                            var36 = var29 & 0xFF;
                        } else {
                            var36 = 0;
                        }
                        int var37 = var22 & 0xFFF;
                        int var38;
                        if (var32 >= var19) {
                            var38 = 0;
                        } else {
                            var38 = var32 & 0xFF;
                        }
                        int var39 = var30 & 0xFF;
                        short var40 = this.field4494[var39];
                        int var41 = var35 - 4096;
                        int var42 = var37 - 4096;
                        int var43 = class80.field1598[var35];
                        int var44 = var34 - 4096;
                        int var45 = class80.field1598[var34];
                        short var46 = this.field4494[var38];
                        int var47 = class80.field1598[var37];
                        short var48 = this.field4494[var36 + var46];
                        short var49 = this.field4494[var31 + var40];
                        short var50 = this.field4494[var31 + var46];
                        short var51 = this.field4494[var36 + var40];
                        int var52 = class142.method1062(arg1 + 22373, this.field4494[var27 - -var49], var34, var37, var35);
                        int var53 = class142.method1062(22373, this.field4494[var33 + var49], var34, var42, var35);
                        int var54 = ((var53 - var52) * var47 >> 12) + var52;
                        int var55 = class142.method1062(22373, this.field4494[var27 + var51], var44, var37, var35);
                        int var56 = class142.method1062(22373, this.field4494[var33 + var51], var44, var42, var35);
                        int var57 = ((var56 - var55) * var47 >> 12) + var55;
                        int var58 = ((var57 - var54) * var45 >> 12) + var54;
                        int var59 = class142.method1062(arg1 ^ 0x5765, this.field4494[var27 + var50], var34, var37, var41);
                        int var60 = class142.method1062(22373, this.field4494[var33 + var50], var34, var42, var41);
                        int var61 = var59 + ((var60 - var59) * var47 >> 12);
                        int var62 = class142.method1062(arg1 ^ 0x5765, this.field4494[var27 + var48], var44, var37, var41);
                        int var63 = class142.method1062(22373, this.field4494[var33 + var48], var44, var42, var41);
                        int var64 = ((var63 - var62) * var47 >> 12) + var62;
                        int var65 = ((var64 - var61) * var45 >> 12) + var61;
                        this.method790(((var65 - var58) * var43 >> 12) + var58, var14, 0);
                    }
                    this.method789((byte) -101);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
    public static void method1915(int arg0) {
        if (arg0 != 255) {
            method1913(-63, 'A');
        }
        field4497 = null;
        field4491 = null;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(IIIII)V")
    public class296(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4503 = arg4;
        this.field4495 = arg1;
        this.field4493 = arg0;
        this.field4490 = arg2;
        this.field4499 = arg3;
        this.method1912(true);
        this.method1910(-1);
    }

    static {
        new class309("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
        field4497 = new String[200];
    }
}
