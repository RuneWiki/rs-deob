import jaggl.OpenGL;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class278 {

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "[I")
    private int[] field3836;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "[I")
    private int[] field3840;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "Ldea;")
    public static class205 field3837 = new class205(64);

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Lej;")
    public static class104 field3841 = new class104("Loading JAGDX - ", "Lade JAGDX - ", "Chargement JAGDX - ", "Carregando JAGDX - ");

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "Lml;")
    public static class325 field3849 = new class325(1, 5);

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "[I")
    public static int[] field3854 = new int[25];

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    private int field3843;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    private int field3848;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    private int field3850;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    private int field3852;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public static int field3853;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bb", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field3855;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public static void method1785(int arg0) {
        if (arg0 == -257) {
            field3841 = null;
            field3849 = null;
            field3837 = null;
            field3854 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
    private final void method1786(boolean arg0) {
        field3846++;
        this.field3852 += ++this.field3850;
        int var2 = 0;
        if (!arg0) {
            return;
        }
        while (var2 < 256) {
            int var3 = this.field3836[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3848 ^= this.field3848 << 13;
                } else {
                    this.field3848 ^= this.field3848 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3848 ^= this.field3848 << 2;
            } else {
                this.field3848 ^= this.field3848 >>> 16;
            }
            this.field3848 += this.field3836[var2 + 128 & 0xFF];
            int var4;
            this.field3836[var2] = var4 = this.field3852 + this.field3836[class589.method3454(1020, var3) >> 2] + this.field3848;
            this.field3840[var2] = this.field3852 = this.field3836[class589.method3454(261197, var4) >> 8 >> 2] + var3;
            var2++;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II[FIIII)V")
    public static final void method1787(int arg0, int arg1, float[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field3845++;
        if (arg6 > 0 && !class130.method886(1, arg6)) {
            throw new IllegalArgumentException("");
        } else if (arg1 == 1051103841) {
            if (arg3 > 0 && !class130.method886(arg1 ^ 0x3EA69260, arg3)) {
                throw new IllegalArgumentException("");
            }
            int var7 = class23.method261(2941, arg5);
            int var8 = 0;
            int var9 = arg6 >= arg3 ? arg3 : arg6;
            int var10 = arg6 >> 1;
            int var11 = arg3 >> 1;
            float[] var12 = arg2;
            float[] var13 = new float[var7 * var11 * var10];
            while (true) {
                OpenGL.glTexImage2Df(arg4, var8, arg0, arg6, arg3, 0, arg5, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg6 * var7;
                float[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            float var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                var13 = var12;
                arg3 = var11;
                var12 = var15;
                arg6 = var10;
                var8++;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var10 >>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
    public static final void method1788(int arg0) {
        field3853++;
        try {
            if (arg0 != 0) {
                method1787(57, -119, null, -104, -22, -112, -94);
            }
            Method var1 = (field3855 == null ? (field3855 = method1795("java.lang.Runtime")) : field3855).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class252.field3493 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)I")
    public final int method1789(int arg0) {
        field3839++;
        if (arg0 != -10160) {
            return -26;
        }
        if (this.field3843 == 0) {
            this.method1786(true);
            this.field3843 = 256;
        }
        return this.field3840[this.field3843 - 1];
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)I")
    public final int method1790(int arg0) {
        if (this.field3843 == 0) {
            this.method1786(true);
            this.field3843 = 256;
        }
        field3838++;
        return arg0 == 256 ? this.field3840[--this.field3843] : -42;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    private final void method1791(byte arg0) {
        field3844++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var7 + var62;
            int var66 = var5 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var62 + var66;
            int var69 = var4 + var67;
            var6 = var68 ^ var66 >>> 16;
            int var70 = var3 + var6;
            int var71 = var66 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var69 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var73;
            var3 = var75 ^ var73 << 8;
            int var76 = var73 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        if (arg0 != -87) {
            method1792(true, true, true);
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3840[var11 + 7] + var2;
            int var38 = this.field3840[var11 + 3] + var6;
            int var39 = this.field3840[var11 + 4] + var5;
            int var40 = this.field3840[var11 + 5] + var4;
            int var41 = this.field3840[var11] + var9;
            int var42 = this.field3840[var11 + 6] + var3;
            int var43 = this.field3840[var11 + 2] + var7;
            int var44 = this.field3840[var11 + 1] + var8;
            int var45 = var41 ^ var44 << 11;
            int var46 = var43 + var44;
            int var47 = var38 + var45;
            int var48 = var46 ^ var43 >>> 2;
            int var49 = var43 + var47;
            int var50 = var39 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var47 + var50;
            int var53 = var40 + var51;
            var6 = var52 ^ var50 >>> 16;
            int var54 = var50 + var53;
            int var55 = var6 + var42;
            var5 = var54 ^ var53 << 10;
            int var56 = var5 + var37;
            int var57 = var53 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var55 + var56;
            int var59 = var4 + var45;
            var3 = var58 ^ var56 << 8;
            int var60 = var56 + var59;
            var8 = var3 + var48;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field3836[var11] = var9;
            this.field3836[var11 + 1] = var8;
            this.field3836[var11 + 2] = var7;
            this.field3836[var11 + 3] = var6;
            this.field3836[var11 + 4] = var5;
            this.field3836[var11 + 5] = var4;
            this.field3836[var11 + 6] = var3;
            this.field3836[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3836[var12 + 2] + var7;
            int var14 = this.field3836[var12] + var9;
            int var15 = this.field3836[var12 + 7] + var2;
            int var16 = this.field3836[var12 + 1] + var8;
            int var17 = this.field3836[var12 + 5] + var4;
            int var18 = this.field3836[var12 + 3] + var6;
            int var19 = this.field3836[var12 + 4] + var5;
            int var20 = this.field3836[var12 + 6] + var3;
            int var21 = var14 ^ var16 << 11;
            int var22 = var13 + var16;
            int var23 = var18 + var21;
            int var24 = var22 ^ var13 >>> 2;
            int var25 = var13 + var23;
            int var26 = var19 + var24;
            int var27 = var25 ^ var23 << 8;
            int var28 = var17 + var27;
            int var29 = var23 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var6 + var20;
            int var31 = var26 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var5 + var15;
            int var33 = var28 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var30 + var32;
            int var35 = var4 + var21;
            var3 = var34 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field3836[var12] = var9;
            this.field3836[var12 + 1] = var8;
            this.field3836[var12 + 2] = var7;
            this.field3836[var12 + 3] = var6;
            this.field3836[var12 + 4] = var5;
            this.field3836[var12 + 5] = var4;
            this.field3836[var12 + 6] = var3;
            this.field3836[var12 + 7] = var2;
        }
        this.method1786(true);
        this.field3843 = 256;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZZZ)V")
    public static final void method1792(boolean arg0, boolean arg1, boolean arg2) {
        field3851++;
        if (arg0) {
            class316.field4244--;
            if (class316.field4244 == 0) {
                class118.field1940 = null;
            }
        }
        if (arg1) {
            class109.field1683--;
            if (class109.field1683 == 0) {
                class439.field6243 = null;
            }
        }
        if (arg2) {
            field3837 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB[BI)I")
    public static final int method1793(int arg0, byte arg1, byte[] arg2, int arg3) {
        field3847++;
        int var4 = -1;
        int var5 = arg0;
        int var6 = 99 % ((25 - arg1) / 47);
        while (arg3 > var5) {
            var4 = class178.field2555[(arg2[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
            var5++;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V")
    public static final void method1794(int arg0) {
        if (arg0 >= -50) {
            return;
        }
        if (class479.field6759 != null) {
            class479.field6759.method1284((byte) -70);
            class16.field214 = null;
            class479.field6759 = null;
        }
        field3842++;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
    private class278() {
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "([I)V")
    public class278(int[] arg0) {
        this.field3836 = new int[256];
        this.field3840 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3840[var2] = arg0[var2];
        }
        this.method1791((byte) -87);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1795(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
