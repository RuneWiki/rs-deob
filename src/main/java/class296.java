import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public class class296 {

    @OriginalMember(owner = "client!wha", name = "h", descriptor = "[I")
    private int[] field4824;

    @OriginalMember(owner = "client!wha", name = "e", descriptor = "[I")
    private int[] field4828;

    @OriginalMember(owner = "client!wha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4829 = new String[] { method2557(method2556("a8\u000f.")), method2557(method2556("tcMl$")), method2557(method2556("x%\u0002lef#\n6g'")), method2557(method2556("x%\u0002l\u001b'")), method2557(method2556("x%\u0002l\u001a'")), method2557(method2556("x%\u0002l\u001d'")), method2557(method2556("x%\u0002l\u0018'")) };

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "I")
    public static int field4818 = 0;

    @OriginalMember(owner = "client!wha", name = "c", descriptor = "I")
    private int field4819;

    @OriginalMember(owner = "client!wha", name = "f", descriptor = "I")
    private int field4820;

    @OriginalMember(owner = "client!wha", name = "k", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!wha", name = "d", descriptor = "I")
    private int field4822;

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!wha", name = "g", descriptor = "I")
    private int field4825;

    @OriginalMember(owner = "client!wha", name = "j", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!wha", name = "i", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "(I)I", line = 7)
    public final int method2552(int arg0) {
        try {
            field4823++;
            if (this.field4820 == 0) {
                this.method2553(-32);
                this.field4820 = 256;
            }
            if (arg0 < 51) {
                this.method2555(-44);
            }
            return this.field4824[this.field4820 - 1];
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4829[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wha", name = "c", descriptor = "(I)V", line = 28)
    private final void method2553(int arg0) {
        try {
            field4821++;
            this.field4819 += ++this.field4822;
            for (int var2 = 0; var2 < 256; var2++) {
                int var3 = this.field4828[var2];
                if ((var2 & 0x2) == 0) {
                    if ((var2 & 0x1) == 0) {
                        this.field4825 ^= this.field4825 << 13;
                    } else {
                        this.field4825 ^= this.field4825 >>> 6;
                    }
                } else if ((var2 & 0x1) == 0) {
                    this.field4825 ^= this.field4825 << 2;
                } else {
                    this.field4825 ^= this.field4825 >>> 16;
                }
                this.field4825 += this.field4828[var2 + 128 & 0xFF];
                int var4;
                this.field4828[var2] = var4 = this.field4828[class292.method2485(var3, 1020) >> 2] + this.field4825 + this.field4819;
                this.field4824[var2] = this.field4819 = this.field4828[class292.method2485(var4 >> 8, 1020) >> 2] + var3;
            }
            if (arg0 > -3) {
                this.field4822 = 9;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4829[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(B)I", line = 77)
    public final int method2554(byte arg0) {
        try {
            if (arg0 < 123) {
                this.field4828 = null;
            }
            if (this.field4820 == 0) {
                this.method2553(-128);
                this.field4820 = 256;
            }
            field4827++;
            return this.field4824[--this.field4820];
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4829[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)V", line = 94)
    private final void method2555(int arg0) {
        try {
            field4826++;
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
                int var12 = var7 + var8;
                int var13 = var6 + var11;
                int var14 = var12 ^ var7 >>> 2;
                int var15 = var5 + var14;
                int var16 = var7 + var13;
                int var17 = var16 ^ var13 << 8;
                int var18 = var4 + var17;
                int var19 = var13 + var15;
                var6 = var19 ^ var15 >>> 16;
                int var20 = var3 + var6;
                int var21 = var15 + var18;
                var5 = var21 ^ var18 << 10;
                int var22 = var2 + var5;
                int var23 = var18 + var20;
                var4 = var23 ^ var20 >>> 4;
                int var24 = var20 + var22;
                int var25 = var4 + var11;
                var3 = var24 ^ var22 << 8;
                var8 = var3 + var14;
                int var26 = var22 + var25;
                var2 = var26 ^ var25 >>> 9;
                var7 = var2 + var17;
                var9 = var8 + var25;
            }
            for (int var27 = 0; var27 < 256; var27 += 8) {
                int var28 = this.field4824[var27 + 4] + var5;
                int var29 = this.field4824[var27 + 2] + var7;
                int var30 = this.field4824[var27 + 3] + var6;
                int var31 = this.field4824[var27 + 5] + var4;
                int var32 = this.field4824[var27] + var9;
                int var33 = this.field4824[var27 + 6] + var3;
                int var34 = this.field4824[var27 + 1] + var8;
                int var35 = this.field4824[var27 + 7] + var2;
                int var36 = var32 ^ var34 << 11;
                int var37 = var29 + var34;
                int var38 = var30 + var36;
                int var39 = var37 ^ var29 >>> 2;
                int var40 = var29 + var38;
                int var41 = var28 + var39;
                int var42 = var40 ^ var38 << 8;
                int var43 = var31 + var42;
                int var44 = var38 + var41;
                var6 = var44 ^ var41 >>> 16;
                int var45 = var41 + var43;
                int var46 = var6 + var33;
                var5 = var45 ^ var43 << 10;
                int var47 = var5 + var35;
                int var48 = var43 + var46;
                var4 = var48 ^ var46 >>> 4;
                int var49 = var4 + var36;
                int var50 = var46 + var47;
                var3 = var50 ^ var47 << 8;
                var8 = var3 + var39;
                int var51 = var47 + var49;
                var2 = var51 ^ var49 >>> 9;
                var7 = var2 + var42;
                var9 = var8 + var49;
                this.field4828[var27] = var9;
                this.field4828[var27 + 1] = var8;
                this.field4828[var27 + 2] = var7;
                this.field4828[var27 + 3] = var6;
                this.field4828[var27 + 4] = var5;
                this.field4828[var27 + 5] = var4;
                this.field4828[var27 + 6] = var3;
                this.field4828[var27 + 7] = var2;
            }
            if (arg0 == -1124852316) {
                for (int var52 = 0; var52 < 256; var52 += 8) {
                    int var53 = this.field4828[var52 + 2] + var7;
                    int var54 = this.field4828[var52 + 4] + var5;
                    int var55 = this.field4828[var52 + 1] + var8;
                    int var56 = this.field4828[var52 + 3] + var6;
                    int var57 = this.field4828[var52 + 7] + var2;
                    int var58 = this.field4828[var52 + 6] + var3;
                    int var59 = this.field4828[var52 + 5] + var4;
                    int var60 = this.field4828[var52] + var9;
                    int var61 = var60 ^ var55 << 11;
                    int var62 = var53 + var55;
                    int var63 = var56 + var61;
                    int var64 = var62 ^ var53 >>> 2;
                    int var65 = var54 + var64;
                    int var66 = var53 + var63;
                    int var67 = var66 ^ var63 << 8;
                    int var68 = var63 + var65;
                    int var69 = var59 + var67;
                    var6 = var68 ^ var65 >>> 16;
                    int var70 = var6 + var58;
                    int var71 = var65 + var69;
                    var5 = var71 ^ var69 << 10;
                    int var72 = var69 + var70;
                    int var73 = var5 + var57;
                    var4 = var72 ^ var70 >>> 4;
                    int var74 = var70 + var73;
                    int var75 = var4 + var61;
                    var3 = var74 ^ var73 << 8;
                    int var76 = var73 + var75;
                    var8 = var3 + var64;
                    var2 = var76 ^ var75 >>> 9;
                    var7 = var2 + var67;
                    var9 = var8 + var75;
                    this.field4828[var52] = var9;
                    this.field4828[var52 + 1] = var8;
                    this.field4828[var52 + 2] = var7;
                    this.field4828[var52 + 3] = var6;
                    this.field4828[var52 + 4] = var5;
                    this.field4828[var52 + 5] = var4;
                    this.field4828[var52 + 6] = var3;
                    this.field4828[var52 + 7] = var2;
                }
                this.method2553(-42);
                this.field4820 = 256;
            }
        } catch (RuntimeException var78) {
            throw class590.method4333(var78, field4829[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wha", name = "<init>", descriptor = "()V", line = 242)
    private class296() {
    }

    @OriginalMember(owner = "client!wha", name = "<init>", descriptor = "([I)V", line = 244)
    public class296(int[] arg0) {
        try {
            this.field4824 = new int[256];
            this.field4828 = new int[256];
            for (int var2 = 0; var2 < arg0.length; var2++) {
                this.field4824[var2] = arg0[var2];
            }
            this.method2555(-1124852316);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4829[2] + (arg0 == null ? field4829[0] : field4829[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!wha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2556(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x59);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2557(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 15;
                    break;
                case 1:
                    var10005 = 77;
                    break;
                case 2:
                    var10005 = 99;
                    break;
                case 3:
                    var10005 = 66;
                    break;
                default:
                    var10005 = 89;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
