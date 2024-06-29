import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public abstract class class337 {

    @OriginalMember(owner = "client!an", name = "b", descriptor = "[S")
    private short[] field5220 = new short[512];

    @OriginalMember(owner = "client!an", name = "h", descriptor = "I")
    private int field5226 = 4;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "I")
    private int field5228 = 4;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "I")
    public int field5230 = 4;

    @OriginalMember(owner = "client!an", name = "n", descriptor = "I")
    private int field5232 = 0;

    @OriginalMember(owner = "client!an", name = "o", descriptor = "I")
    private int field5233 = 4;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "I")
    public static int field5229 = 127;

    @OriginalMember(owner = "client!an", name = "p", descriptor = "Ltl;")
    public static class222 field5234 = new class222(64);

    @OriginalMember(owner = "client!an", name = "t", descriptor = "I")
    public static int field5238 = 0;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!an", name = "r", descriptor = "Lkb;")
    public static class39 field5236;

    @OriginalMember(owner = "client!an", name = "s", descriptor = "Z")
    public static boolean field5237;

    @OriginalMember(owner = "client!an", name = "q", descriptor = "[Lug;")
    public static class321[] field5235;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "[S")
    private short[] field5227;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IBII)V", line = 7)
    public final void method2318(int arg0, byte arg1, int arg2, int arg3) {
        field5224++;
        int var5 = -44 / ((23 - arg1) / 52);
        int[] var6 = new int[arg3];
        int[] var7 = new int[arg2];
        int[] var8 = new int[arg0];
        for (int var9 = 0; var9 < arg0; var9++) {
            var8[var9] = (var9 << 12) / arg0;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var7[var10] = (var10 << 12) / arg2;
        }
        for (int var11 = 0; var11 < arg3; var11++) {
            var6[var11] = (var11 << 12) / arg3;
        }
        this.method97(1);
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = 0; var13 < arg2; var13++) {
                for (int var14 = 0; var14 < arg0; var14++) {
                    for (int var15 = 0; var15 < this.field5230; var15++) {
                        int var16 = this.field5227[var15] << 12;
                        int var17 = var7[var13] * var16 >> 12;
                        int var18 = this.field5233 * var17;
                        int var19 = this.field5233 * var16 >> 12;
                        int var20 = var6[var12] * var16 >> 12;
                        int var21 = var8[var14] * var16 >> 12;
                        int var22 = var18 >> 12;
                        int var23 = this.field5228 * var20;
                        int var24 = var22 + 1;
                        int var25 = var22 & 0xFF;
                        int var26;
                        if (var24 >= var19) {
                            var26 = 0;
                        } else {
                            var26 = var24 & 0xFF;
                        }
                        int var27 = this.field5226 * var16 >> 12;
                        int var28 = var18 & 0xFFF;
                        int var29 = var28 - 4096;
                        int var30 = class231.field3692[var28];
                        int var31 = this.field5228 * var16 >> 12;
                        int var32 = this.field5226 * var21;
                        int var33 = var32 >> 12;
                        int var34 = var33 + 1;
                        int var35 = var32 & 0xFFF;
                        int var36;
                        if (var34 >= var27) {
                            var36 = 0;
                        } else {
                            var36 = var34 & 0xFF;
                        }
                        int var37 = var35 - 4096;
                        int var38 = var23 >> 12;
                        int var39 = var38 + 1;
                        int var40 = class231.field3692[var35];
                        int var41 = var23 & 0xFFF;
                        int var42 = var33 & 0xFF;
                        int var43 = var38 & 0xFF;
                        short var44 = this.field5220[var43];
                        short var45 = this.field5220[var26 + var44];
                        int var46 = class231.field3692[var41];
                        short var47 = this.field5220[var25 + var44];
                        int var48 = var41 - 4096;
                        int var49;
                        if (var31 <= var39) {
                            var49 = 0;
                        } else {
                            var49 = var39 & 0xFF;
                        }
                        short var50 = this.field5220[var49];
                        short var51 = this.field5220[var26 + var50];
                        short var52 = this.field5220[var25 + var50];
                        int var53 = class206.method1509(var35, var41, true, var28, this.field5220[var42 + var47]);
                        int var54 = class206.method1509(var37, var41, true, var28, this.field5220[var36 + var47]);
                        int var55 = ((var54 - var53) * var40 >> 12) + var53;
                        int var56 = class206.method1509(var35, var41, true, var29, this.field5220[var42 + var45]);
                        int var57 = class206.method1509(var37, var41, true, var29, this.field5220[var36 + var45]);
                        int var58 = ((var57 - var56) * var40 >> 12) + var56;
                        int var59 = ((var58 - var55) * var30 >> 12) + var55;
                        int var60 = class206.method1509(var35, var48, true, var28, this.field5220[var42 + var52]);
                        int var61 = class206.method1509(var37, var48, true, var28, this.field5220[var36 + var52]);
                        int var62 = ((var61 - var60) * var40 >> 12) + var60;
                        int var63 = class206.method1509(var35, var48, true, var29, this.field5220[var42 + var51]);
                        int var64 = class206.method1509(var37, var48, true, var29, this.field5220[var36 + var51]);
                        int var65 = ((var64 - var63) * var40 >> 12) + var63;
                        int var66 = ((var65 - var62) * var30 >> 12) + var62;
                        this.method98(var59 + ((var66 - var59) * var46 >> 12), true, var15);
                    }
                    this.method94(-11780);
                }
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IB)Lsf;", line = 172)
    public static final class116 method2319(int arg0, byte arg1) {
        field5225++;
        class116 var2 = (class116) class282.field4452.method768((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        if (arg1 >= -93) {
            method2323((byte) 64);
        }
        byte[] var3 = class187.field3038.method250(true, class79.method582(-103, arg0), class111.method771((byte) -119, arg0));
        class116 var4 = new class116();
        if (var3 != null) {
            var4.method815((byte) -112, new class192(var3));
        }
        class282.field4452.method770(var4, 0, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V", line = 196)
    private final void method2320(byte arg0) {
        this.field5227 = new short[this.field5230];
        if (arg0 != 30) {
            field5235 = (class321[]) null;
        }
        field5231++;
        for (int var2 = 0; var2 < this.field5230; var2++) {
            this.field5227[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V", line = 218)
    private final void method2321(int arg0) {
        Random var2 = new Random((long) this.field5232);
        field5221++;
        for (int var3 = 0; var3 < 255; var3++) {
            this.field5220[var3] = (short) var3;
        }
        if (arg0 <= 98) {
            method2322((byte) -110, (String) null);
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class66.method434(var5, var2, -27852);
            short var7 = this.field5220[var6];
            this.field5220[var6] = this.field5220[var5];
            this.field5220[var5] = this.field5220[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BLjava/lang/String;)I", line = 258)
    public static final int method2322(byte arg0, String arg1) {
        field5222++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class198.field3247; var2++) {
            if (arg1.equalsIgnoreCase(class239.field3773[var2])) {
                return var2;
            }
        }
        if (arg0 <= 97) {
            return 33;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(IIIII)V", line = 395)
    public class337(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5226 = arg2;
        this.field5230 = arg1;
        this.field5232 = arg0;
        this.field5228 = arg4;
        this.field5233 = arg3;
        this.method2320((byte) 30);
        this.method2321(121);
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(B)V", line = 299)
    public static void method2323(byte arg0) {
        field5235 = null;
        field5236 = null;
        field5234 = null;
        if (arg0 != -127) {
            field5236 = (class39) null;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IB[Ljava/lang/String;I)Ljava/lang/String;", line = 330)
    public static final String method2324(int arg0, byte arg1, String[] arg2, int arg3) {
        field5223++;
        if (arg3 == 0) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg2[arg0];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = 0;
            int var6 = arg0 + arg3;
            for (int var7 = arg0; var7 < var6; var7++) {
                String var8 = arg2[var7];
                if (var8 == null) {
                    var5 += 4;
                } else {
                    var5 += var8.length();
                }
            }
            if (arg1 < 26) {
                return (String) null;
            }
            StringBuffer var9 = new StringBuffer(var5);
            for (int var10 = arg0; var10 < var6; var10++) {
                String var11 = arg2[var10];
                if (var11 == null) {
                    var9.append("null");
                } else {
                    var9.append(var11);
                }
            }
            return var9.toString();
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V")
    public abstract void method97(int arg0);

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(I)V")
    public abstract void method94(int arg0);

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IZI)V")
    public abstract void method98(int arg0, boolean arg1, int arg2);
}
