import java.awt.Frame;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public abstract class class558 {

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
    private int field7794 = 4;

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "I")
    private int field7802 = 0;

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "I")
    public int field7800 = 4;

    @OriginalMember(owner = "client!ht", name = "j", descriptor = "I")
    private int field7803 = 4;

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "[S")
    private short[] field7798 = new short[512];

    @OriginalMember(owner = "client!ht", name = "k", descriptor = "I")
    private int field7804 = 4;

    @OriginalMember(owner = "client!ht", name = "m", descriptor = "Lei;")
    public static class331 field7806 = new class331();

    @OriginalMember(owner = "client!ht", name = "u", descriptor = "Lim;")
    public static class353 field7814 = null;

    @OriginalMember(owner = "client!ht", name = "w", descriptor = "I")
    public static int field7816 = 0;

    @OriginalMember(owner = "client!ht", name = "t", descriptor = "I")
    public static int field7813 = -1;

    @OriginalMember(owner = "client!ht", name = "s", descriptor = "Lbv;")
    public static class568 field7812 = new class568();

    @OriginalMember(owner = "client!ht", name = "y", descriptor = "[I")
    public static int[] field7818 = new int[256];

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "I")
    public static int field7795;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "I")
    public static int field7796;

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "I")
    public static int field7799;

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "I")
    public static int field7801;

    @OriginalMember(owner = "client!ht", name = "l", descriptor = "I")
    public static int field7805;

    @OriginalMember(owner = "client!ht", name = "o", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!ht", name = "q", descriptor = "I")
    public static int field7810;

    @OriginalMember(owner = "client!ht", name = "r", descriptor = "I")
    public static int field7811;

    @OriginalMember(owner = "client!ht", name = "x", descriptor = "I")
    public static int field7817;

    @OriginalMember(owner = "client!ht", name = "n", descriptor = "Lkr;")
    public static class329 field7807;

    @OriginalMember(owner = "client!ht", name = "p", descriptor = "Lkr;")
    public static class329 field7809;

    @OriginalMember(owner = "client!ht", name = "v", descriptor = "Ljava/awt/Frame;")
    public static Frame field7815;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ht", name = "A", descriptor = "Ljava/lang/Class;")
    public static Class field7820;

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "[S")
    private short[] field7797;

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "[[I")
    public static int[][] field7819;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(BLjq;Z)V")
    public static final void method3136(byte arg0, class447 arg1, boolean arg2) {
        field7799++;
        int var3 = arg1.field6294 == 0 ? arg1.field6330 : arg1.field6294;
        if (arg0 <= 72) {
            return;
        }
        int var4 = arg1.field6309 == 0 ? arg1.field6218 : arg1.field6309;
        class374.method2288(arg1.field6229, arg2, var3, class508.field7087[arg1.field6229 >> 16], var4, 0);
        if (arg1.field6194 != null) {
            class374.method2288(arg1.field6229, arg2, var3, arg1.field6194, var4, 0);
        }
        class496 var5 = (class496) class523.field7289.method3476((long) arg1.field6229, (byte) 28);
        if (var5 != null) {
            class153.method831(var4, false, arg2, var5.field6914, var3);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
    private final void method3137(int arg0) {
        field7801++;
        this.field7797 = new short[this.field7800];
        for (int var2 = 0; var2 < this.field7800; var2++) {
            this.field7797[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 != -14506) {
            field7810 = 116;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIII)V")
    public final void method3138(int arg0, int arg1, int arg2, int arg3) {
        field7805++;
        if (arg0 != 1036486092) {
            return;
        }
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg2];
        for (int var7 = 0; var7 < arg3; var7++) {
            var5[var7] = (var7 << 12) / arg3;
        }
        int[] var8 = new int[arg1];
        for (int var9 = 0; var9 < arg2; var9++) {
            var6[var9] = (var9 << 12) / arg2;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var8[var10] = (var10 << 12) / arg1;
        }
        this.method2181(86);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field7800; var14++) {
                        int var15 = this.field7797[var14] << 12;
                        int var16 = this.field7794 * var15 >> 12;
                        int var17 = this.field7803 * var15 >> 12;
                        int var18 = this.field7804 * var15 >> 12;
                        int var19 = var5[var13] * var15 >> 12;
                        int var20 = var8[var11] * var15 >> 12;
                        int var21 = var6[var12] * var15 >> 12;
                        int var22 = this.field7803 * var20;
                        int var23 = this.field7794 * var19;
                        int var24 = this.field7804 * var21;
                        int var25 = var23 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var24 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var27 & 0xFF;
                        int var31 = var22 >> 12;
                        int var32 = var31 + 1;
                        int var33;
                        if (var16 > var26) {
                            var33 = var26 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        int var34 = var31 & 0xFF;
                        int var35;
                        if (var29 < var18) {
                            var35 = var29 & 0xFF;
                        } else {
                            var35 = 0;
                        }
                        int var36 = var22 & 0xFFF;
                        int var37 = var23 & 0xFFF;
                        int var38;
                        if (var17 <= var32) {
                            var38 = 0;
                        } else {
                            var38 = var32 & 0xFF;
                        }
                        int var39 = var24 & 0xFFF;
                        int var40 = var36 - 4096;
                        int var41 = class554.field7749[var39];
                        int var42 = class554.field7749[var37];
                        int var43 = var39 - 4096;
                        short var44 = this.field7798[var34];
                        short var45 = this.field7798[var38];
                        int var46 = var37 - 4096;
                        int var47 = class554.field7749[var36];
                        short var48 = this.field7798[var35 + var45];
                        short var49 = this.field7798[var35 + var44];
                        short var50 = this.field7798[var30 + var45];
                        short var51 = this.field7798[var30 + var44];
                        int var52 = class184.method1126(var37, var39, this.field7798[var28 + var51], (byte) -128, var36);
                        int var53 = class184.method1126(var46, var39, this.field7798[var33 + var51], (byte) 93, var36);
                        int var54 = var52 + ((var53 - var52) * var42 >> 12);
                        int var55 = class184.method1126(var37, var43, this.field7798[var28 + var49], (byte) -1, var36);
                        int var56 = class184.method1126(var46, var43, this.field7798[var33 + var49], (byte) -1, var36);
                        int var57 = ((var56 - var55) * var42 >> 12) + var55;
                        int var58 = var54 + ((var57 - var54) * var41 >> 12);
                        int var59 = class184.method1126(var37, var39, this.field7798[var28 + var50], (byte) 33, var40);
                        int var60 = class184.method1126(var46, var39, this.field7798[var33 + var50], (byte) 47, var40);
                        int var61 = var59 + ((var60 - var59) * var42 >> 12);
                        int var62 = class184.method1126(var37, var43, this.field7798[var28 + var48], (byte) -121, var40);
                        int var63 = class184.method1126(var46, var43, this.field7798[var33 + var48], (byte) -126, var40);
                        int var64 = ((var63 - var62) * var42 >> 12) + var62;
                        int var65 = ((var64 - var61) * var41 >> 12) + var61;
                        this.method2179(((var65 - var58) * var47 >> 12) + var58, 83, var14);
                    }
                    this.method2177(false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)V")
    private final void method3139(byte arg0) {
        field7795++;
        Random var2 = new Random((long) this.field7802);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field7798[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class585.method3373(var2, true, var5);
            short var7 = this.field7798[var6];
            this.field7798[var6] = this.field7798[var5];
            this.field7798[var5] = this.field7798[var5 + 256] = var7;
        }
        if (arg0 >= -45) {
            this.method2177(false);
        }
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)V")
    public abstract void method2181(int arg0);

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method3140(String arg0, byte arg1) {
        if (arg1 != -46) {
            method3140(null, (byte) 90);
        }
        field7796++;
        return class445.method2589(-30877, field7820 == null ? (field7820 = method3142("dba")) : field7820, arg0);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Z)V")
    public abstract void method2177(boolean arg0);

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(III)V")
    public abstract void method2179(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(Z)V")
    public static void method3141(boolean arg0) {
        field7819 = null;
        if (!arg0) {
            method3141(false);
        }
        field7812 = null;
        field7809 = null;
        field7807 = null;
        field7818 = null;
        field7806 = null;
        field7814 = null;
        field7815 = null;
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(IIIII)V")
    public class558(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7804 = arg3;
        this.field7803 = arg4;
        this.field7802 = arg0;
        this.field7800 = arg1;
        this.field7794 = arg2;
        this.method3137(-14506);
        this.method3139((byte) -100);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3142(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
