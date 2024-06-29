import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class555 {

    @OriginalMember(owner = "client!it", name = "o", descriptor = "Lada;")
    private class142 field7657 = new class142();

    @OriginalMember(owner = "client!it", name = "f", descriptor = "[[B")
    public static byte[][] field7648 = new byte[250][];

    @OriginalMember(owner = "client!it", name = "c", descriptor = "J")
    public static long field7645 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!it", name = "g", descriptor = "Z")
    public static boolean field7649 = false;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    public static int field7643;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "I")
    public static int field7647;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!it", name = "i", descriptor = "I")
    public static int field7651;

    @OriginalMember(owner = "client!it", name = "j", descriptor = "I")
    public static int field7652;

    @OriginalMember(owner = "client!it", name = "k", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!it", name = "m", descriptor = "I")
    public static int field7655;

    @OriginalMember(owner = "client!it", name = "p", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!it", name = "q", descriptor = "Lada;")
    private class142 field7659;

    @OriginalMember(owner = "client!it", name = "n", descriptor = "Lso;")
    public static class400 field7656;

    @OriginalMember(owner = "client!it", name = "l", descriptor = "[S")
    public static short[] field7654;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)Lada;")
    public final class142 method3141(int arg0) {
        field7650++;
        if (arg0 != 29291) {
            return null;
        }
        class142 var2 = this.field7657.field2197;
        if (this.field7657 == var2) {
            return null;
        } else {
            var2.method939(83);
            return var2;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)Lada;")
    public final class142 method3142(boolean arg0) {
        field7652++;
        class142 var2 = this.field7657.field2200;
        if (this.field7657 == var2) {
            this.field7659 = null;
            return null;
        }
        if (arg0) {
            this.method3146(false);
        }
        this.field7659 = var2.field2200;
        return var2;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)I")
    public final int method3143(int arg0) {
        field7646++;
        int var2 = arg0;
        for (class142 var3 = this.field7657.field2197; var3 != this.field7657; var3 = var3.field2197) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B)V")
    public final void method3144(byte arg0) {
        if (arg0 != -124) {
            return;
        }
        field7647++;
        while (true) {
            class142 var2 = this.field7657.field2197;
            if (this.field7657 == var2) {
                this.field7659 = null;
                return;
            }
            var2.method939(125);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Lada;I)V")
    public final void method3145(class142 arg0, int arg1) {
        if (arg0.field2200 != null) {
            arg0.method939(arg1 - 2147483543);
        }
        field7651++;
        arg0.field2200 = this.field7657.field2200;
        arg0.field2197 = this.field7657;
        if (arg1 == Integer.MAX_VALUE) {
            arg0.field2200.field2197 = arg0;
            arg0.field2197.field2200 = arg0;
        }
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(Z)Z")
    public final boolean method3146(boolean arg0) {
        if (arg0) {
            this.field7657 = null;
        }
        field7644++;
        return this.field7657.field2197 == this.field7657;
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "(I)Lada;")
    public final class142 method3147(int arg0) {
        field7655++;
        class142 var2 = this.field7659;
        if (this.field7657 == var2) {
            this.field7659 = null;
            return null;
        } else if (arg0 == 16) {
            this.field7659 = var2.field2197;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(BLqa;)V")
    public static final void method3148(byte arg0, class207 arg1) {
        field7658++;
        int var2 = class166.field2389;
        int var3 = class467.field6582;
        int var4 = class228.field3256;
        int var5 = class28.field477 - 3;
        byte var6 = 20;
        if (class401.field5715 == null || class296.field4062 == null) {
            if (class645.field9371.method221(class506.field7063, (byte) -103) && class645.field9371.method221(class385.field5165, (byte) -59)) {
                class401.field5715 = arg1.method1332(class38.method399(class645.field9371, class506.field7063, 0), true);
                class38 var7 = class38.method399(class645.field9371, class385.field5165, 0);
                class296.field4062 = arg1.method1332(var7, true);
                var7.method402();
                class385.field5166 = arg1.method1332(var7, true);
            } else {
                arg1.method1321(var2, var3, var4, var6, 255 - class29.field496 << 24 | class451.field6369, 1);
            }
        }
        if (class401.field5715 != null && class296.field4062 != null) {
            int var8 = (var4 - (class296.field4062.method429() * 2)) / class401.field5715.method429();
            for (int var9 = 0; var9 < var8; var9++) {
                class401.field5715.method497(var2 + class296.field4062.method429() + var9 * class401.field5715.method429(), var3);
            }
            class296.field4062.method497(var2, var3);
            class385.field5166.method497(var4 + var2 - class385.field5166.method429(), var3);
        }
        class515.field7246.method663(-118, -1, var2 + 3, class459.field6463.method739(class173.field2491, 57), var3 + 14, class325.field4374 | 0xFF000000);
        arg1.method1321(var2, var3 + var6, var4, var5 - var6, class451.field6369 | -class29.field496 + 255 << 24, 1);
        int var10 = class602.field8697.method2153((byte) 80);
        int var11 = class602.field8697.method2152(0);
        int var12 = 0;
        int var13 = 72 % ((-arg0 - 27) / 44);
        for (class442 var14 = (class442) class448.field6352.method456((byte) -121); var14 != null; var14 = (class442) class448.field6352.method460((byte) -85)) {
            int var32 = (class210.field2958 - var12 - 1) * 16 + (var3 - (-var6 - 13));
            var12++;
            if (var2 < var10 && var10 < var2 + var4 && (var32 - 13) < var11 && (var32 + 4) > var11 && var14.field6287) {
                arg1.method1321(var2, var32 - 12, var4, 16, 255 - class390.field5520 << 24 | class327.field4391, 1);
            }
        }
        if ((class401.field5720 == null || class80.field1308 == null || class56.field1006 == null) && class645.field9371.method221(class202.field2832, (byte) -70) && class645.field9371.method221(class53.field991, (byte) 126) && class645.field9371.method221(class439.field6251, (byte) -53)) {
            class38 var15 = class38.method399(class645.field9371, class53.field991, 0);
            class80.field1308 = arg1.method1332(var15, true);
            var15.method402();
            class487.field6842 = arg1.method1332(var15, true);
            class401.field5720 = arg1.method1332(class38.method399(class645.field9371, class202.field2832, 0), true);
            class38 var16 = class38.method399(class645.field9371, class439.field6251, 0);
            class56.field1006 = arg1.method1332(var16, true);
            var16.method402();
            class572.field7888 = arg1.method1332(var16, true);
        }
        if (class401.field5720 != null && class80.field1308 != null && class56.field1006 != null) {
            int var17 = (var4 - (class56.field1006.method429() * 2)) / class401.field5720.method429();
            for (int var18 = 0; var18 < var17; var18++) {
                class401.field5720.method497(var2 + class56.field1006.method429() + class401.field5720.method429() * var18, -class401.field5720.method422() + var5 + var3);
            }
            int var19 = (var5 - var6 - class56.field1006.method422()) / class80.field1308.method422();
            for (int var20 = 0; var20 < var19; var20++) {
                class80.field1308.method497(var2, var20 * class80.field1308.method422() + var6 + var3);
                class487.field6842.method497(var2 + var4 - class487.field6842.method429(), class80.field1308.method422() * var20 + var3 + var6);
            }
            class56.field1006.method497(var2, var3 + var5 - class56.field1006.method422());
            class572.field7888.method497((var2 + var4) - class56.field1006.method429(), var5 + (var3 - class56.field1006.method422()));
        }
        int var21 = 0;
        for (class442 var22 = (class442) class448.field6352.method456((byte) -77); var22 != null; var22 = (class442) class448.field6352.method460((byte) -99)) {
            int var23 = (class210.field2958 - var21 - 1) * 16 + var3 - (-var6 - 13);
            int var24 = class325.field4374 | 0xFF000000;
            if (var10 > var2 && var10 < var2 + var4 && var23 - 13 < var11 && var11 < (var23 + 4) && var22.field6287) {
                var24 = class351.field4717 | 0xFF000000;
            }
            int[] var25 = null;
            if (class311.method1946(var22.field6298, 48)) {
                var25 = class181.field2574.method866((int) var22.field6297, (byte) 79).field8892;
            } else if (var22.field6294 != -1) {
                var25 = class181.field2574.method866(var22.field6294, (byte) 79).field8892;
            } else if (class35.method366(var22.field6298, (byte) 2)) {
                class576 var28 = (class576) class278.field3837.method1242(0, (long) ((int) var22.field6297));
                if (var28 != null) {
                    class109 var29 = var28.field7929;
                    class593 var30 = var29.field1669;
                    if (var30.field8532 != null) {
                        var30 = var30.method3516(class189.field2681, 121);
                    }
                    if (var30 != null) {
                        var25 = var30.field8566;
                    }
                }
            } else if (class532.method3060(var22.field6298, 59)) {
                Object var26 = null;
                class364 var27;
                if (var22.field6298 == 1008) {
                    var27 = class18.field227.method1201((byte) 123, (int) var22.field6297);
                } else {
                    var27 = class18.field227.method1201((byte) 93, (int) (var22.field6297 >>> 32 & 0x7FFFFFFFL));
                }
                if (var27.field4904 != null) {
                    var27 = var27.method2183(true, class189.field2681);
                }
                if (var27 != null) {
                    var25 = var27.field4905;
                }
            }
            String var31 = class611.method3576(23974, var22);
            if (var25 != null) {
                var31 = var31 + class387.method2264(true, var25);
            }
            class515.field7246.method667(var24, false, var31, class374.field5033, var23, 0, class160.field2344, var2 + 3);
            var21++;
            if (var22.field6296) {
                class427.field6061.method497(class40.field798.method2810(var31, (byte) 124) + var2 + 5, var23 + -12);
            }
        }
        class294.method1887(class467.field6582, class166.field2389, class228.field3256, class28.field477, -21861);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ILvf;)I")
    public static final int method3149(int arg0, class131 arg1) {
        field7643++;
        if (class583.field8185 == arg1) {
            return 5890;
        } else if (class453.field6402 == arg1) {
            return 34167;
        } else if (class459.field6466 == arg1) {
            return 34168;
        } else if (class610.field8770 == arg1) {
            return 34166;
        } else {
            if (arg0 != 1008) {
                method3151((byte) 4);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!it", name = "d", descriptor = "(I)Lada;")
    public final class142 method3150(int arg0) {
        field7653++;
        if (arg0 != 16) {
            this.method3145(null, 61);
        }
        class142 var2 = this.field7657.field2197;
        if (this.field7657 == var2) {
            this.field7659 = null;
            return null;
        } else {
            this.field7659 = var2.field2197;
            return var2;
        }
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(B)V")
    public static void method3151(byte arg0) {
        field7654 = null;
        int var1 = -14 / ((61 - arg0) / 32);
        field7648 = null;
        field7656 = null;
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "()V")
    public class555() {
        this.field7657.field2200 = this.field7657;
        this.field7657.field2197 = this.field7657;
    }
}
