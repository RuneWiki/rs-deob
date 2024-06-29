import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oja")
public class class646 {

    @OriginalMember(owner = "client!oja", name = "o", descriptor = "[I")
    private int[] field9175;

    @OriginalMember(owner = "client!oja", name = "d", descriptor = "[I")
    private int[] field9184;

    @OriginalMember(owner = "client!oja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9189 = new String[] { method4713(method4712("m\u001f7Op*")), method4713(method4712("m\u001f7O\u000ek\u001b?\u0015\f*")), method4713(method4712("l\u0000:\r")), method4713(method4712("y[xOO")), method4713(method4712("m\u001f7Os*")), method4713(method4712("m\u001f7Oz*")), method4713(method4712("m\u001f7Oq*")), method4713(method4712("m\u001f7Ot*")), method4713(method4712("m\u001f7Ow*")), method4713(method4712("m\u001f7Ov*")), method4713(method4712("m\u001f7Ou*")) };

    @OriginalMember(owner = "client!oja", name = "i", descriptor = "Lmv;")
    public static class125 field9181 = new class125(23, 3);

    @OriginalMember(owner = "client!oja", name = "p", descriptor = "Z")
    public static boolean field9186 = false;

    @OriginalMember(owner = "client!oja", name = "e", descriptor = "I")
    private int field9172;

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "I")
    public static int field9173;

    @OriginalMember(owner = "client!oja", name = "l", descriptor = "I")
    private int field9174;

    @OriginalMember(owner = "client!oja", name = "b", descriptor = "I")
    public static int field9176;

    @OriginalMember(owner = "client!oja", name = "n", descriptor = "I")
    private int field9177;

    @OriginalMember(owner = "client!oja", name = "j", descriptor = "I")
    public static int field9178;

    @OriginalMember(owner = "client!oja", name = "h", descriptor = "I")
    public static int field9179;

    @OriginalMember(owner = "client!oja", name = "q", descriptor = "I")
    public static int field9180;

    @OriginalMember(owner = "client!oja", name = "c", descriptor = "I")
    public static int field9182;

    @OriginalMember(owner = "client!oja", name = "f", descriptor = "I")
    private int field9187;

    @OriginalMember(owner = "client!oja", name = "m", descriptor = "I")
    public static int field9188;

    @OriginalMember(owner = "client!oja", name = "g", descriptor = "Lhha;")
    public static class725 field9183;

    @OriginalMember(owner = "client!oja", name = "k", descriptor = "[[Lvo;")
    public static class782[][] field9185;

    @OriginalMember(owner = "client!oja", name = "e", descriptor = "(I)V")
    public static void method4704(int arg0) {
        try {
            if (arg0 <= 103) {
                method4706(-84);
            }
            field9185 = null;
            field9183 = null;
            field9181 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9189[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oja", name = "b", descriptor = "(B)V")
    public static final void method4705(byte arg0) {
        try {
            class622.field8888++;
            field9176++;
            if (arg0 <= -84) {
                class274 var1 = class375.method2969((byte) 1, class667.field9410, class60.field916.field11100);
                var1.field3885.method5127(class292.field4116, 26108);
                class60.field916.method5608(var1, 29867);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9189[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(I)V")
    public static final void method4706(int arg0) {
        try {
            field9180++;
            int var1 = 0;
            if (class451.field6612 != null) {
                var1 = class451.field6612.field9090.method5665(3);
            }
            if (arg0 < -63) {
                if (var1 == 2) {
                    int var2 = class792.field11523 <= 800 ? class792.field11523 : 800;
                    int var3 = class40.field615 <= 600 ? class40.field615 : 600;
                    class391.field5700 = var2;
                    class349.field5061 = (class792.field11523 - var2) / 2;
                    class232.field3346 = 0;
                    class711.field9998 = var3;
                } else if (var1 == 1) {
                    int var4 = class792.field11523 > 1024 ? 1024 : class792.field11523;
                    class349.field5061 = (class792.field11523 - var4) / 2;
                    class391.field5700 = var4;
                    int var5 = class40.field615 <= 768 ? class40.field615 : 768;
                    class711.field9998 = var5;
                    class232.field3346 = 0;
                } else {
                    class349.field5061 = 0;
                    class711.field9998 = class40.field615;
                    class391.field5700 = class792.field11523;
                    class232.field3346 = 0;
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field9189[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oja", name = "c", descriptor = "(I)I")
    public final int method4707(int arg0) {
        try {
            field9182++;
            if (~this.field9174 == arg0) {
                this.method4708(128);
                this.field9174 = 256;
            }
            return this.field9184[--this.field9174];
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9189[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oja", name = "b", descriptor = "(I)V")
    private final void method4708(int arg0) {
        try {
            field9173++;
            if (arg0 != 128) {
                this.field9172 = -7;
            }
            this.field9177 += ++this.field9172;
            for (int var2 = 0; var2 < 256; var2++) {
                int var3 = this.field9175[var2];
                if ((var2 & 0x2) == 0) {
                    if ((var2 & 0x1) == 0) {
                        this.field9187 ^= this.field9187 << 13;
                    } else {
                        this.field9187 ^= this.field9187 >>> 6;
                    }
                } else if ((var2 & 0x1) == 0) {
                    this.field9187 ^= this.field9187 << 2;
                } else {
                    this.field9187 ^= this.field9187 >>> 16;
                }
                this.field9187 += this.field9175[var2 + 128 & 0xFF];
                int var4;
                this.field9175[var2] = var4 = this.field9187 + this.field9175[class434.method3377(var3, 1020) >> 2] + this.field9177;
                this.field9184[var2] = this.field9177 = this.field9175[class434.method3377(255, var4 >> 8 >> 2)] + var3;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9189[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(B)V")
    public static final void method4709(byte arg0) {
        try {
            field9178++;
            class689.field9642 = 0;
            if (arg0 <= 21) {
                field9185 = null;
            }
            for (int var1 = 0; var1 < 2048; var1++) {
                class320.field4366[var1] = null;
                class176.field2308[var1] = 1;
                class429.field6194[var1] = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9189[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(Z)I")
    public final int method4710(boolean arg0) {
        try {
            if (!arg0) {
                this.method4708(44);
            }
            if (this.field9174 == 0) {
                this.method4708(128);
                this.field9174 = 256;
            }
            field9188++;
            return this.field9184[this.field9174 - 1];
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9189[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oja", name = "d", descriptor = "(I)V")
    private final void method4711(int arg0) {
        try {
            field9179++;
            int var2 = -1640531527;
            int var3 = -1640531527;
            int var4 = -1640531527;
            int var5 = -1640531527;
            int var6 = -1640531527;
            int var7 = -1640531527;
            int var8 = -1640531527;
            int var9 = -1640531527;
            for (int var10 = 0; var10 < 4; var10++) {
                int var11 = var9 ^ var8 << 11;
                int var12 = var6 + var11;
                int var13 = var7 + var8;
                int var14 = var13 ^ var7 >>> 2;
                int var15 = var7 + var12;
                int var16 = var5 + var14;
                int var17 = var15 ^ var12 << 8;
                int var18 = var4 + var17;
                int var19 = var12 + var16;
                var6 = var19 ^ var16 >>> 16;
                int var20 = var16 + var18;
                int var21 = var3 + var6;
                var5 = var20 ^ var18 << 10;
                int var22 = var18 + var21;
                int var23 = var2 + var5;
                var4 = var22 ^ var21 >>> 4;
                int var24 = var21 + var23;
                int var25 = var4 + var11;
                var3 = var24 ^ var23 << 8;
                int var26 = var23 + var25;
                var8 = var3 + var14;
                var2 = var26 ^ var25 >>> 9;
                var7 = var2 + var17;
                var9 = var8 + var25;
            }
            for (int var27 = 0; var27 < 256; var27 += 8) {
                int var28 = this.field9184[var27 + 3] + var6;
                int var29 = this.field9184[var27 + 7] + var2;
                int var30 = this.field9184[var27] + var9;
                int var31 = this.field9184[var27 + 1] + var8;
                int var32 = this.field9184[var27 + 2] + var7;
                int var33 = this.field9184[var27 + 4] + var5;
                int var34 = this.field9184[var27 + 6] + var3;
                int var35 = this.field9184[var27 + 5] + var4;
                int var36 = var30 ^ var31 << 11;
                int var37 = var31 + var32;
                int var38 = var28 + var36;
                int var39 = var37 ^ var32 >>> 2;
                int var40 = var33 + var39;
                int var41 = var32 + var38;
                int var42 = var41 ^ var38 << 8;
                int var43 = var38 + var40;
                int var44 = var35 + var42;
                var6 = var43 ^ var40 >>> 16;
                int var45 = var40 + var44;
                int var46 = var6 + var34;
                var5 = var45 ^ var44 << 10;
                int var47 = var5 + var29;
                int var48 = var44 + var46;
                var4 = var48 ^ var46 >>> 4;
                int var49 = var46 + var47;
                int var50 = var4 + var36;
                var3 = var49 ^ var47 << 8;
                int var51 = var47 + var50;
                var8 = var3 + var39;
                var2 = var51 ^ var50 >>> 9;
                var9 = var8 + var50;
                var7 = var2 + var42;
                this.field9175[var27] = var9;
                this.field9175[var27 + 1] = var8;
                this.field9175[var27 + 2] = var7;
                this.field9175[var27 + 3] = var6;
                this.field9175[var27 + 4] = var5;
                this.field9175[var27 + 5] = var4;
                this.field9175[var27 + 6] = var3;
                this.field9175[var27 + 7] = var2;
            }
            int var52 = 0;
            if (arg0 >= 97) {
                while (var52 < 256) {
                    int var53 = this.field9175[var52 + 5] + var4;
                    int var54 = this.field9175[var52 + 2] + var7;
                    int var55 = this.field9175[var52 + 6] + var3;
                    int var56 = this.field9175[var52 + 7] + var2;
                    int var57 = this.field9175[var52 + 4] + var5;
                    int var58 = this.field9175[var52 + 1] + var8;
                    int var59 = this.field9175[var52] + var9;
                    int var60 = this.field9175[var52 + 3] + var6;
                    int var61 = var59 ^ var58 << 11;
                    int var62 = var60 + var61;
                    int var63 = var54 + var58;
                    int var64 = var63 ^ var54 >>> 2;
                    int var65 = var57 + var64;
                    int var66 = var54 + var62;
                    int var67 = var66 ^ var62 << 8;
                    int var68 = var53 + var67;
                    int var69 = var62 + var65;
                    var6 = var69 ^ var65 >>> 16;
                    int var70 = var6 + var55;
                    int var71 = var65 + var68;
                    var5 = var71 ^ var68 << 10;
                    int var72 = var5 + var56;
                    int var73 = var68 + var70;
                    var4 = var73 ^ var70 >>> 4;
                    int var74 = var70 + var72;
                    int var75 = var4 + var61;
                    var3 = var74 ^ var72 << 8;
                    var8 = var3 + var64;
                    int var76 = var72 + var75;
                    var2 = var76 ^ var75 >>> 9;
                    var9 = var8 + var75;
                    var7 = var2 + var67;
                    this.field9175[var52] = var9;
                    this.field9175[var52 + 1] = var8;
                    this.field9175[var52 + 2] = var7;
                    this.field9175[var52 + 3] = var6;
                    this.field9175[var52 + 4] = var5;
                    this.field9175[var52 + 5] = var4;
                    this.field9175[var52 + 6] = var3;
                    this.field9175[var52 + 7] = var2;
                    var52 += 8;
                }
                this.method4708(128);
                this.field9174 = 256;
            }
        } catch (RuntimeException var78) {
            throw class665.method4799(var78, field9189[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oja", name = "<init>", descriptor = "()V")
    private class646() {
    }

    @OriginalMember(owner = "client!oja", name = "<init>", descriptor = "([I)V")
    public class646(int[] arg0) {
        try {
            this.field9175 = new int[256];
            this.field9184 = new int[256];
            for (int var2 = 0; var2 < arg0.length; var2++) {
                this.field9184[var2] = arg0[var2];
            }
            this.method4711(118);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9189[1] + (arg0 == null ? field9189[2] : field9189[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!oja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4712(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x32);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4713(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 2;
                    break;
                case 1:
                    var10005 = 117;
                    break;
                case 2:
                    var10005 = 86;
                    break;
                case 3:
                    var10005 = 97;
                    break;
                default:
                    var10005 = 50;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
