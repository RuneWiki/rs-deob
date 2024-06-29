import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class506 {

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "[I")
    private int[] field7403;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "[I")
    private int[] field7396;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
    public static int field7400;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    private int field7391;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    private int field7392;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    public static int field7393;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    private int field7394;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
    private int field7395;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
    public static int field7397;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "I")
    public static int field7402;

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "I")
    public static int field7404;

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "I")
    public static int field7405;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lpf;ILnf;II)V")
    public static final void method2999(class487 arg0, int arg1, class28 arg2, int arg3, int arg4) {
        field7401++;
        byte var5 = -1;
        if ((arg1 & 0x8000) != 0) {
            var5 = arg2.method1890(128);
        }
        if ((arg1 & 0x40000) != 0) {
            arg0.field177 = arg2.method1834(-123);
            arg0.field158 = arg2.method1862(63);
            arg0.field209 = arg2.method1894(-2018);
            arg0.field156 = (byte) arg2.method1845(-128);
            arg0.field241 = class28.field417 + arg2.method1837((byte) -18);
            arg0.field185 = class28.field417 + arg2.method1837((byte) -18);
        }
        if (~(arg1 & 0x100) != arg3) {
            int var6 = arg2.method1844(arg3 - 120);
            arg0.field207 = arg2.method1889(-12);
            arg0.field228 = arg2.method1876((byte) -121);
            arg0.field197 = var6 & 0x7FFF;
            arg0.field245 = (var6 & 0x8000) != 0;
            arg0.field244 = arg0.field207 + arg0.field197 + class28.field417;
        }
        if ((arg1 & 0x200) != 0) {
            arg0.field218 = arg2.method1871(45);
            if (arg0.field218.charAt(0) == '~') {
                arg0.field218 = arg0.field218.substring(1);
                class9.method68(arg0.method2885(true, arg3 ^ 0x5A), 0, 2, -1, arg0.field218, arg0.method2883(false, -91));
            } else if (class81.field1158 == arg0) {
                class9.method68(arg0.method2885(true, -72), 0, 2, arg3, arg0.field218, arg0.method2883(false, -111));
            }
            arg0.field157 = 0;
            arg0.field234 = 150;
            arg0.field178 = 0;
        }
        if ((arg1 & 0x400) != 0) {
            arg0.field7046 = arg2.method1889(-118) == 1;
        }
        if ((arg1 & 0x2000) != 0) {
            arg0.field170 = arg2.method1890(128);
            arg0.field184 = arg2.method1862(102);
            arg0.field183 = arg2.method1894(-2018);
            arg0.field221 = arg2.method1894(arg3 ^ 0x7E1);
            arg0.field160 = arg2.method1837((byte) -18) + class28.field417;
            arg0.field181 = arg2.method1844(arg3 ^ 0x71) + class28.field417;
            arg0.field190 = arg2.method1889(31);
            if (arg0.field7020) {
                arg0.field170 += arg0.field7025;
                arg0.field265 = 0;
                arg0.field221 += arg0.field7019;
                arg0.field183 += arg0.field7025;
                arg0.field184 += arg0.field7019;
            } else {
                arg0.field170 += arg0.field263[0];
                arg0.field265 = 1;
                arg0.field184 += arg0.field257[0];
                arg0.field183 += arg0.field263[0];
                arg0.field221 += arg0.field257[0];
            }
            arg0.field264 = 0;
        }
        if ((arg1 & 0x80) != 0) {
            arg0.field7003 = arg2.method1837((byte) -18);
            if (arg0.field265 == 0) {
                arg0.method110(arg0.field7003, (byte) -115);
                arg0.field7003 = -1;
            }
        }
        if ((arg1 & 0x20) != 0) {
            int var7 = arg2.method1844(-108);
            if (var7 == 65535) {
                var7 = -1;
            }
            arg0.field202 = var7;
        }
        if ((arg1 & 0x2) != 0) {
            int var8 = arg2.method1889(-124);
            byte[] var9 = new byte[var8];
            class319 var10 = new class319(var9);
            arg2.method1853(-1341, var9, 0, var8);
            class161.field2438[arg4] = var10;
            arg0.method2892((byte) 53, var10);
        }
        if ((arg1 & 0x10) != 0) {
            int var11 = arg2.method1877(119);
            int var12 = arg2.method1889(126);
            arg0.method120(class28.field417, 4, var11, var12);
            arg0.field238 = class28.field417 + 300;
            arg0.field189 = arg2.method1869(-81);
        }
        if ((arg1 & 0x1) != 0) {
            int var13 = arg2.method1844(-113);
            if (var13 == 65535) {
                var13 = -1;
            }
            int var14 = arg2.method1869(-117);
            class113.method854(var14, arg0, var13, (byte) -73);
        }
        if ((arg1 & 0x40) != 0) {
            class195.field2829[arg4] = arg2.method1862(arg3 + 76);
        }
        if ((arg1 & 0x10000) != 0) {
            int var15 = arg2.method1882(-18851);
            int var16 = arg2.method1848((byte) 107);
            if (var15 == 65535) {
                var15 = -1;
            }
            int var17 = arg2.method1869(-110);
            arg0.method103(true, arg3 ^ 0xFFFFFFBA, var17, var15, var16);
        }
        if ((arg1 & 0x4) != 0) {
            int var18 = arg2.method1844(-126);
            int var19 = arg2.method1876((byte) -123);
            int var20 = arg2.method1876((byte) -125);
            int var21 = arg2.field4360;
            boolean var22 = (var18 & 0x8000) != 0;
            if (arg0.field7036 != null && arg0.field7015 != null) {
                boolean var23 = false;
                if (var19 <= 1) {
                    if (!var22 && !(!class355.field5134 || class345.field4970) || class185.field2739) {
                        var23 = true;
                    } else if (class95.method772(0, arg0.field7036)) {
                        var23 = true;
                    }
                }
                if (!var23 && class422.field6142 == 0) {
                    class228.field3200.field4360 = 0;
                    arg2.method1887(0, class228.field3200.field4336, var20, true);
                    class228.field3200.field4360 = 0;
                    int var24 = -1;
                    String var26;
                    if (var22) {
                        var18 &= 0x7FFF;
                        class104 var25 = class279.method1616(class228.field3200, true);
                        var24 = var25.field1706;
                        var26 = var25.field1709.method1071(class228.field3200, -122);
                    } else {
                        var26 = class112.method850(-63, class38.method265(class228.field3200, -75));
                    }
                    arg0.field218 = var26.trim();
                    arg0.field234 = 150;
                    arg0.field178 = var18 >> 8;
                    arg0.field157 = var18 & 0xFF;
                    int var27;
                    if (var19 == 1 || var19 == 2) {
                        var27 = var22 ? 17 : 1;
                    } else {
                        var27 = var22 ? 17 : 2;
                    }
                    if (var19 == 2) {
                        class365.method2184(0, var26, null, arg3 ^ 0x7D, var27, var24, "<img=1>" + arg0.method2885(true, -78), "<img=1>" + arg0.method2883(false, -81));
                    } else if (var19 == 1) {
                        class365.method2184(0, var26, null, -109, var27, var24, "<img=0>" + arg0.method2885(true, -84), "<img=0>" + arg0.method2883(false, -83));
                    } else {
                        class365.method2184(0, var26, null, arg3 - 100, var27, var24, arg0.method2885(true, -104), arg0.method2883(false, -64));
                    }
                }
            }
            arg2.field4360 = var20 + var21;
        }
        if ((arg1 & 0x20000) != 0) {
            int var28 = arg2.method1845(-128);
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            for (int var32 = 0; var32 < var28; var32++) {
                int var33 = arg2.method1882(arg3 ^ 0x49A2);
                if (var33 == 65535) {
                    var33 = -1;
                }
                var29[var32] = var33;
                var30[var32] = arg2.method1869(-81);
                var31[var32] = arg2.method1865(class373.method2233(arg3, 83));
            }
            class192.method1272(var29, var30, var31, (byte) -22, arg0);
        }
        if ((arg1 & 0x1000) != 0) {
            int var34 = arg2.method1865(-116);
            if (var34 == 65535) {
                var34 = -1;
            }
            int var35 = arg2.method1836(arg3 ^ 0xFFFFFFFB);
            int var36 = arg2.method1876((byte) -128);
            arg0.method103(false, arg3 ^ 0xFFFFFFAF, var36, var34, var35);
        }
        if ((arg1 & 0x4000) != 0) {
            int var37 = class28.field417;
            int var38 = arg2.method1877(127);
            int var39 = arg2.method1889(-122);
            arg0.method120(var37, 4, var38, var39);
        }
        if (!arg0.field7020) {
            return;
        }
        if (var5 == 127) {
            arg0.method2888((byte) -98, arg0.field7019, arg0.field7025);
            return;
        }
        byte var40;
        if (var5 == -1) {
            var40 = class195.field2829[arg4];
        } else {
            var40 = var5;
        }
        arg0.method2889(arg0.field7025, arg0.field7019, -125, var40);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
    private final void method3000(byte arg0) {
        field7399++;
        if (arg0 <= 107) {
            method3002(null, (byte) -30, true, 1);
        }
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
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var4 + var67;
            int var69 = var63 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var70 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            int var76 = var73 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field7396[var11 + 7] + var2;
            int var38 = this.field7396[var11 + 2] + var7;
            int var39 = this.field7396[var11 + 1] + var8;
            int var40 = this.field7396[var11] + var9;
            int var41 = this.field7396[var11 + 4] + var5;
            int var42 = this.field7396[var11 + 6] + var3;
            int var43 = this.field7396[var11 + 3] + var6;
            int var44 = this.field7396[var11 + 5] + var4;
            int var45 = var40 ^ var39 << 11;
            int var46 = var43 + var45;
            int var47 = var38 + var39;
            int var48 = var47 ^ var38 >>> 2;
            int var49 = var41 + var48;
            int var50 = var38 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var46 + var49;
            int var53 = var44 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var6 + var42;
            int var55 = var49 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var5 + var37;
            int var57 = var53 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var56;
            var3 = var59 ^ var56 << 8;
            int var60 = var56 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field7403[var11] = var9;
            this.field7403[var11 + 1] = var8;
            this.field7403[var11 + 2] = var7;
            this.field7403[var11 + 3] = var6;
            this.field7403[var11 + 4] = var5;
            this.field7403[var11 + 5] = var4;
            this.field7403[var11 + 6] = var3;
            this.field7403[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field7403[var12 + 1] + var8;
            int var14 = this.field7403[var12 + 7] + var2;
            int var15 = this.field7403[var12] + var9;
            int var16 = this.field7403[var12 + 2] + var7;
            int var17 = this.field7403[var12 + 6] + var3;
            int var18 = this.field7403[var12 + 4] + var5;
            int var19 = this.field7403[var12 + 5] + var4;
            int var20 = this.field7403[var12 + 3] + var6;
            int var21 = var15 ^ var13 << 11;
            int var22 = var20 + var21;
            int var23 = var13 + var16;
            int var24 = var23 ^ var16 >>> 2;
            int var25 = var18 + var24;
            int var26 = var16 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var22 + var25;
            int var29 = var19 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var25 + var29;
            int var31 = var6 + var17;
            var5 = var30 ^ var29 << 10;
            int var32 = var5 + var14;
            int var33 = var29 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var31 + var32;
            int var35 = var4 + var21;
            var3 = var34 ^ var32 << 8;
            int var36 = var32 + var35;
            var8 = var3 + var24;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field7403[var12] = var9;
            this.field7403[var12 + 1] = var8;
            this.field7403[var12 + 2] = var7;
            this.field7403[var12 + 3] = var6;
            this.field7403[var12 + 4] = var5;
            this.field7403[var12 + 5] = var4;
            this.field7403[var12 + 6] = var3;
            this.field7403[var12 + 7] = var2;
        }
        this.method3003((byte) 99);
        this.field7391 = 256;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)I")
    public final int method3001(int arg0) {
        if (this.field7391 == 0) {
            this.method3003((byte) 97);
            this.field7391 = 256;
        }
        if (arg0 > -104) {
            field7397 = 92;
        }
        field7398++;
        return this.field7396[--this.field7391];
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Ljava/lang/String;BZI)Z")
    public static final boolean method3002(String arg0, byte arg1, boolean arg2, int arg3) {
        field7393++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        if (arg1 != -110) {
            field7405 = 21;
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg3) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if (var10 / arg3 != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(B)V")
    private final void method3003(byte arg0) {
        field7402++;
        if (arg0 < 84) {
            this.field7394 = 47;
        }
        this.field7394 += ++this.field7395;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field7403[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field7392 ^= this.field7392 << 13;
                } else {
                    this.field7392 ^= this.field7392 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field7392 ^= this.field7392 << 2;
            } else {
                this.field7392 ^= this.field7392 >>> 16;
            }
            this.field7392 += this.field7403[var2 + 128 & 0xFF];
            int var4;
            this.field7403[var2] = var4 = this.field7403[class375.method2245(1020, var3) >> 2] + this.field7394 + this.field7392;
            this.field7396[var2] = this.field7394 = var3 + this.field7403[class375.method2245(255, var4 >> 8 >> 2)];
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)Lbp;")
    public static final class63 method3004(int arg0, int arg1, int arg2) {
        class532 var3 = class103.field1632[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7833;
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)I")
    public final int method3005(int arg0) {
        field7404++;
        if (arg0 != 0) {
            this.method3005(-104);
        }
        if (this.field7391 == 0) {
            this.method3003((byte) 98);
            this.field7391 = 256;
        }
        return this.field7396[this.field7391 - 1];
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "()V")
    private class506() {
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "([I)V")
    public class506(int[] arg0) {
        this.field7403 = new int[256];
        this.field7396 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field7396[var2] = arg0[var2];
        }
        this.method3000((byte) 115);
    }

    static {
        new class157("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
        field7400 = -1;
    }
}
