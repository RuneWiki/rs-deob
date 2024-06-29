import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class338 {

    @OriginalMember(owner = "client!fda", name = "j", descriptor = "F")
    public float field5263 = 1.0F;

    @OriginalMember(owner = "client!fda", name = "q", descriptor = "F")
    public float field5257 = 0.25F;

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "F")
    public float field5273 = 1.0F;

    @OriginalMember(owner = "client!fda", name = "l", descriptor = "I")
    public int field5268;

    @OriginalMember(owner = "client!fda", name = "m", descriptor = "I")
    public int field5267;

    @OriginalMember(owner = "client!fda", name = "s", descriptor = "F")
    public float field5260;

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "I")
    public int field5259;

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
    public int field5258;

    @OriginalMember(owner = "client!fda", name = "o", descriptor = "I")
    public int field5266;

    @OriginalMember(owner = "client!fda", name = "i", descriptor = "F")
    public float field5256;

    @OriginalMember(owner = "client!fda", name = "g", descriptor = "F")
    public float field5272;

    @OriginalMember(owner = "client!fda", name = "r", descriptor = "Lol;")
    public class299 field5262;

    @OriginalMember(owner = "client!fda", name = "p", descriptor = "I")
    public int field5261;

    @OriginalMember(owner = "client!fda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5275 = new String[] { method2820(method2819("Ld\u0001>r")), method2820(method2819("Y?C|")), method2820(method2819("Q.N>M\u001f")), method2820(method2819("Q.N>3^$Fd1\u001f")), method2820(method2819("Q.N>L\u001f")), method2820(method2819("Q.N>K\u001f")), method2820(method2819("Q.N>N\u001f")) };

    @OriginalMember(owner = "client!fda", name = "f", descriptor = "Z")
    public static boolean field5270 = false;

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "Lkia;")
    public static class646 field5264 = new class646(method2820(method2819("`\u001e}S")), method2820(method2819("X,IylR")), method2820(method2819("h8L")), 1);

    @OriginalMember(owner = "client!fda", name = "h", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!fda", name = "n", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!fda", name = "k", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "Lfs;")
    public static class581 field5274;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZIII)I")
    public static final int method2815(boolean arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg1 != -9274) {
                field5270 = true;
            }
            field5269++;
            class495 var4 = class668.method4916(arg2, arg0, 3);
            if (var4 == null) {
                return -1;
            } else if (arg3 >= 0 && arg3 < var4.field7103.length) {
                return var4.field7103[arg3];
            } else {
                return -1;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5275[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)V")
    public static void method2816(byte arg0) {
        try {
            if (arg0 != 57) {
                method2815(true, -20, 68, -19);
            }
            field5274 = null;
            field5264 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5275[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(BLfda;)Z")
    public final boolean method2817(byte arg0, class338 arg1) {
        try {
            field5265++;
            if (arg0 >= -120) {
                field5274 = null;
            }
            return this.field5266 == arg1.field5266 && this.field5272 == arg1.field5272 && this.field5256 == arg1.field5256 && this.field5260 == arg1.field5260 && this.field5257 == arg1.field5257 && this.field5273 == arg1.field5273 && this.field5263 == arg1.field5263 && this.field5258 == arg1.field5258 && this.field5268 == arg1.field5268 && this.field5262 == arg1.field5262;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5275[2] + arg0 + ',' + (arg1 == null ? field5275[1] : field5275[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lib;I)V")
    public final void method2818(class163 arg0, int arg1) {
        try {
            field5271++;
            this.field5273 = (float) (arg0.method1455((byte) 62) * 8) / 255.0F;
            if (arg1 > -96) {
                this.field5262 = null;
            }
            this.field5257 = (float) (arg0.method1455((byte) 62) * 8) / 255.0F;
            this.field5263 = (float) (arg0.method1455((byte) 62) * 8) / 255.0F;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5275[6] + (arg0 == null ? field5275[1] : field5275[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fda", name = "<init>", descriptor = "()V")
    public class338() {
        try {
            this.field5268 = 0;
            this.field5267 = -50;
            this.field5260 = 1.2F;
            this.field5259 = -50;
            this.field5258 = class722.field10456;
            this.field5266 = class7.field76;
            this.field5256 = 0.69921875F;
            this.field5272 = 1.1523438F;
            this.field5262 = class72.field795;
            this.field5261 = -60;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5275[3] + ')');
        }
    }

    @OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(Lib;)V")
    public class338(class163 arg0) {
        try {
            int var2 = arg0.method1455((byte) 62);
            if (class289.field4305.field801.method1028(false) == 1 && class198.field3097.method578() > 0) {
                if ((var2 & 0x1) == 0) {
                    this.field5266 = class7.field76;
                } else {
                    this.field5266 = arg0.method1453((byte) 117);
                }
                if ((var2 & 0x2) == 0) {
                    this.field5272 = 1.1523438F;
                } else {
                    this.field5272 = (float) arg0.method1445((byte) 110) / 256.0F;
                }
                if ((var2 & 0x4) == 0) {
                    this.field5256 = 0.69921875F;
                } else {
                    this.field5256 = (float) arg0.method1445((byte) 123) / 256.0F;
                }
                if ((var2 & 0x8) == 0) {
                    this.field5260 = 1.2F;
                } else {
                    this.field5260 = (float) arg0.method1445((byte) 114) / 256.0F;
                }
            } else {
                if ((var2 & 0x1) != 0) {
                    arg0.method1453((byte) 94);
                }
                if ((var2 & 0x2) != 0) {
                    arg0.method1445((byte) 111);
                }
                if ((var2 & 0x4) != 0) {
                    arg0.method1445((byte) 106);
                }
                if ((var2 & 0x8) != 0) {
                    arg0.method1445((byte) 124);
                }
                this.field5266 = class7.field76;
                this.field5260 = 1.2F;
                this.field5272 = 1.1523438F;
                this.field5256 = 0.69921875F;
            }
            if ((var2 & 0x10) == 0) {
                this.field5267 = -50;
                this.field5261 = -60;
                this.field5259 = -50;
            } else {
                this.field5267 = arg0.method1442(65280);
                this.field5261 = arg0.method1442(65280);
                this.field5259 = arg0.method1442(65280);
            }
            if ((var2 & 0x20) == 0) {
                this.field5258 = class722.field10456;
            } else {
                this.field5258 = arg0.method1453((byte) 111);
            }
            if ((var2 & 0x40) == 0) {
                this.field5268 = 0;
            } else {
                this.field5268 = arg0.method1445((byte) 113);
            }
            if ((var2 & 0x80) == 0) {
                this.field5262 = class72.field795;
            } else {
                int var3 = arg0.method1445((byte) 121);
                int var4 = arg0.method1445((byte) 106);
                int var5 = arg0.method1445((byte) 114);
                int var6 = arg0.method1445((byte) 120);
                int var7 = arg0.method1445((byte) 108);
                int var8 = arg0.method1445((byte) 122);
                this.field5262 = class592.method4413(var7, 31, var4, var8, var6, var3, var5);
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field5275[3] + (arg0 == null ? field5275[1] : field5275[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!fda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2819(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xF);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2820(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 55;
                    break;
                case 1:
                    var10005 = 74;
                    break;
                case 2:
                    var10005 = 47;
                    break;
                case 3:
                    var10005 = 16;
                    break;
                default:
                    var10005 = 15;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
