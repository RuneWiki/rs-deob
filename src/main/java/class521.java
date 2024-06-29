import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class521 {

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "Lpi;")
    private class345 field7649 = new class345();

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field7648 = 64;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "Z")
    public static boolean field7659 = false;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "Ljo;")
    public static class382 field7662 = new class382(8);

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "F")
    public static float field7667;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field7651;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field7652;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field7655;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field7657;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public static int field7660;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public static int field7661;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    public static int field7665;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "Lya;")
    public static class11 field7669;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "Lpi;")
    private class345 field7663;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "Lsm;")
    public static class477 field7664;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "[I")
    public static int[] field7670;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "[[I")
    public static int[][] field7668;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)I")
    public final int method3082(byte arg0) {
        field7658++;
        int var2 = 0;
        if (arg0 != 92) {
            field7668 = null;
        }
        for (class345 var3 = this.field7649.field5323; var3 != this.field7649; var3 = var3.field5323) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)Lpi;")
    public final class345 method3083(int arg0) {
        if (arg0 != 25761) {
            field7670 = null;
        }
        field7654++;
        class345 var2 = this.field7649.field5324;
        if (this.field7649 == var2) {
            this.field7663 = null;
            return null;
        } else {
            this.field7663 = var2.field5324;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method3084(String arg0, int arg1) {
        field7661++;
        if (arg1 < 54) {
            method3093(-123);
        }
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)V")
    public final void method3085(byte arg0) {
        if (arg0 != 48) {
            this.method3089(-36);
        }
        while (true) {
            class345 var2 = this.field7649.field5323;
            if (this.field7649 == var2) {
                field7650++;
                this.field7663 = null;
                return;
            }
            var2.method2096((byte) 102);
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)Z")
    public final boolean method3086(int arg0) {
        field7665++;
        if (arg0 != -2389) {
            method3091('}', (byte) 95);
        }
        return this.field7649.field5323 == this.field7649;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ldr;I)V")
    public static final void method3087(class293 arg0, int arg1) {
        field7653++;
        arg0.method1826(arg1 + 30272);
        int var2 = 0;
        for (int var3 = 0; var3 < class146.field2203; var3++) {
            int var15 = class457.field6694[var3];
            if ((class225.field3184[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    class225.field3184[var15] = (byte) class390.method2340(class225.field3184[var15], 2);
                    var2--;
                } else {
                    int var16 = arg0.method1823(1, arg1 ^ 0x33C6);
                    if (var16 == 0) {
                        var2 = class364.method2178(arg0, -111);
                        class225.field3184[var15] = (byte) class390.method2340(class225.field3184[var15], 2);
                    } else {
                        class9.method37(0, arg0, var15);
                    }
                }
            }
        }
        arg0.method1818(82);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg0.method1826(arg1 ^ 0x7640);
        for (int var4 = 0; var4 < class146.field2203; var4++) {
            int var13 = class457.field6694[var4];
            if ((class225.field3184[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    class225.field3184[var13] = (byte) class390.method2340(class225.field3184[var13], 2);
                    var2--;
                } else {
                    int var14 = arg0.method1823(1, 13255);
                    if (var14 == 0) {
                        var2 = class364.method2178(arg0, -118);
                        class225.field3184[var13] = (byte) class390.method2340(class225.field3184[var13], 2);
                    } else {
                        class9.method37(0, arg0, var13);
                    }
                }
            }
        }
        arg0.method1818(-85);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg0.method1826(30273);
        for (int var5 = 0; var5 < class42.field550; var5++) {
            int var11 = class42.field552[var5];
            if ((class225.field3184[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class225.field3184[var11] = (byte) class390.method2340(class225.field3184[var11], 2);
                } else {
                    int var12 = arg0.method1823(1, 13255);
                    if (var12 == 0) {
                        var2 = class364.method2178(arg0, arg1 - 112);
                        class225.field3184[var11] = (byte) class390.method2340(class225.field3184[var11], 2);
                    } else if (class151.method1089(arg0, arg1 ^ 0xFFFFE1F8, var11)) {
                        class225.field3184[var11] = (byte) class390.method2340(class225.field3184[var11], 2);
                    }
                }
            }
        }
        arg0.method1818(-110);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg0.method1826(30273);
        for (int var6 = 0; var6 < class42.field550; var6++) {
            int var9 = class42.field552[var6];
            if ((class225.field3184[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class225.field3184[var9] = (byte) class390.method2340(class225.field3184[var9], 2);
                } else {
                    int var10 = arg0.method1823(1, 13255);
                    if (var10 == 0) {
                        var2 = class364.method2178(arg0, -127);
                        class225.field3184[var9] = (byte) class390.method2340(class225.field3184[var9], 2);
                    } else if (class151.method1089(arg0, -7687, var9)) {
                        class225.field3184[var9] = (byte) class390.method2340(class225.field3184[var9], 2);
                    }
                }
            }
        }
        arg0.method1818(84);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class42.field550 = 0;
        class146.field2203 = 0;
        for (int var7 = arg1; var7 < 2048; var7++) {
            class225.field3184[var7] = (byte) (class225.field3184[var7] >> 1);
            class480 var8 = class83.field1327[var7];
            if (var8 == null) {
                class42.field552[class42.field550++] = var7;
            } else {
                class457.field6694[class146.field2203++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(B)Lpi;")
    public final class345 method3088(byte arg0) {
        field7657++;
        class345 var2 = this.field7663;
        if (arg0 != -65) {
            return null;
        } else if (this.field7649 == var2) {
            this.field7663 = null;
            return null;
        } else {
            this.field7663 = var2.field5323;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)Lpi;")
    public final class345 method3089(int arg0) {
        field7652++;
        class345 var2 = this.field7649.field5323;
        if (this.field7649 == var2) {
            this.field7663 = null;
            return null;
        } else {
            this.field7663 = var2.field5323;
            int var3 = 61 % ((-arg0 - 36) / 45);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)Lpi;")
    public final class345 method3090(int arg0) {
        field7660++;
        if (arg0 != 2) {
            field7664 = null;
        }
        class345 var2 = this.field7649.field5323;
        if (this.field7649 == var2) {
            return null;
        } else {
            var2.method2096((byte) 99);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(CB)Z")
    public static final boolean method3091(char arg0, byte arg1) {
        field7655++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class72.method506(arg0, (byte) 75)) {
            return true;
        } else {
            char[] var2 = class407.field6143;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var8 = var2[var3];
                if (arg0 == var8) {
                    return true;
                }
            }
            char[] var4 = class23.field346;
            int var5 = -9 / ((arg1 + 58) / 34);
            for (int var6 = 0; var6 < var4.length; var6++) {
                char var7 = var4[var6];
                if (arg0 == var7) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
    public static final void method3092(boolean arg0) {
        field7666++;
        if (class461.field6721 != null) {
            return;
        }
        class461.field6721 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) ((var3 & 0xFDE5) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if (var8 < 0.5D) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - (var6 * var8);
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if (var4 * 2.0D < 1.0D) {
                    var12 = var16;
                } else if ((var4 * 3.0D < 2.0D)) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var24 * 6.0D < 1.0D) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if ((var24 * 2.0D < 1.0D)) {
                    var14 = var16;
                } else if (var24 * 3.0D < 2.0D) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var33 << 8) + ((var32 << 16) + var34);
            class461.field6721[var3] = var35;
        }
        if (!arg0) {
            field7664 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(I)V")
    public static void method3093(int arg0) {
        field7664 = null;
        field7662 = null;
        if (arg0 != 0) {
            method3093(93);
        }
        field7668 = null;
        field7670 = null;
        field7669 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILpi;)V")
    public final void method3094(int arg0, class345 arg1) {
        field7656++;
        if (arg1.field5324 != null) {
            arg1.method2096((byte) 117);
        }
        arg1.field5324 = this.field7649.field5324;
        if (arg0 != -2713) {
            this.field7649 = null;
        }
        arg1.field5323 = this.field7649;
        arg1.field5324.field5323 = arg1;
        arg1.field5323.field5324 = arg1;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
    public class521() {
        this.field7649.field5324 = this.field7649;
        this.field7649.field5323 = this.field7649;
    }
}
