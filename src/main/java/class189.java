import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class189 {

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "[I")
    private int[] field3130;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "[I")
    private int[] field3127;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "Lij;")
    public static class50 field3126 = class78.method578(124, "::gc");

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "Lij;")
    public static class50 field3124 = class78.method578(127, "k");

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    private int field3120;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    private int field3128;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    private int field3131;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    private int field3134;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public static final void method1271(int arg0) {
        if (arg0 != -31530) {
            return;
        }
        field3121++;
        for (int var1 = 0; var1 < class170.field2855; var1++) {
            int var2 = class249.field4322[var1];
            class53 var3 = class41.field764[var2];
            int var4 = class119.field2109.method1487(arg0 + 31785);
            if ((var4 & 0x20) != 0) {
                int var5 = class119.field2109.method1487(255);
                int var6 = class119.field2109.method1487(255);
                var3.method1604(var6, class244.field4245, var5, -98);
            }
            if ((var4 & 0x2) != 0) {
                if (var3.field959.method481(-119)) {
                    class190.method1282(var3, arg0 + 58792);
                }
                var3.field959 = class8.method48(-21178, class119.field2109.method1465((byte) -112));
                var3.field4010 = var3.field959.field1197;
                var3.field3977 = var3.field959.field1133;
                var3.field3976 = var3.field959.field1138;
                var3.field3974 = var3.field959.field1166;
                var3.field3965 = var3.field959.field1193;
                var3.field3975 = var3.field959.field1140;
                var3.field3986 = var3.field959.field1159;
                var3.field4000 = var3.field959.field1192;
                var3.field3968 = var3.field959.field1174;
                if (var3.field959.method481(arg0 + 31566)) {
                    class121.method881(var3, 0, (class187) null, true, var3.field3980[0], (class243) null, class201.field3312, var3.field3978[0]);
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field3995 = class119.field2109.method1490((byte) -118);
                if (var3.field3995 == 65535) {
                    var3.field3995 = -1;
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field3966 = class119.field2109.method1490((byte) -118);
                int var7 = class119.field2109.method1450((byte) 123);
                var3.field3973 = 0;
                var3.field4014 = 0;
                var3.field4025 = var7 >> 16;
                if (var3.field3966 == 65535) {
                    var3.field3966 = -1;
                }
                var3.field3997 = (var7 & 0xFFFF) + class244.field4245;
                if (class244.field4245 < var3.field3997) {
                    var3.field3973 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field4030 = class119.field2109.method1469((byte) -115);
                var3.field4017 = 100;
            }
            if ((var4 & 0x1) != 0) {
                int var8 = class119.field2109.method1441(71);
                int var9 = class119.field2109.method1448((byte) -2);
                if (var8 == 65535) {
                    var8 = -1;
                }
                class35.method280(var9, var8, var3, false);
            }
            if ((var4 & 0x4) != 0) {
                var3.field3971 = class119.field2109.method1483(arg0 + 57823);
                var3.field4001 = class119.field2109.method1483(26293);
            }
            if ((var4 & 0x40) != 0) {
                int var10 = class119.field2109.method1448((byte) -2);
                int var11 = class119.field2109.method1462(-128);
                var3.method1604(var11, class244.field4245, var10, -97);
                var3.field4016 = class244.field4245 + 300;
                var3.field3999 = class119.field2109.method1462(arg0 ^ 0x7B41);
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
    private final void method1272(int arg0) {
        field3133++;
        if (arg0 != 4) {
            return;
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
            int var63 = var62 ^ var7 >>> 2;
            int var64 = var5 + var63;
            int var65 = var6 + var61;
            int var66 = var7 + var65;
            int var67 = var66 ^ var65 << 8;
            int var68 = var64 + var65;
            int var69 = var4 + var67;
            var6 = var68 ^ var64 >>> 16;
            int var70 = var3 + var6;
            int var71 = var64 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var69 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var70 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var8 = var3 + var63;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3130[var11 + 5] + var4;
            int var38 = this.field3130[var11] + var9;
            int var39 = this.field3130[var11 + 6] + var3;
            int var40 = this.field3130[var11 + 3] + var6;
            int var41 = this.field3130[var11 + 2] + var7;
            int var42 = this.field3130[var11 + 7] + var2;
            int var43 = this.field3130[var11 + 4] + var5;
            int var44 = this.field3130[var11 + 1] + var8;
            int var45 = var38 ^ var44 << 11;
            int var46 = var40 + var45;
            int var47 = var41 + var44;
            int var48 = var47 ^ var41 >>> 2;
            int var49 = var43 + var48;
            int var50 = var41 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var46 + var49;
            int var53 = var37 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var49 + var53;
            var5 = var54 ^ var53 << 10;
            int var55 = var5 + var42;
            int var56 = var6 + var39;
            int var57 = var53 + var56;
            var4 = var57 ^ var56 >>> 4;
            int var58 = var55 + var56;
            int var59 = var4 + var45;
            var3 = var58 ^ var55 << 8;
            int var60 = var55 + var59;
            var2 = var60 ^ var59 >>> 9;
            var8 = var3 + var48;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field3127[var11] = var9;
            this.field3127[var11 + 1] = var8;
            this.field3127[var11 + 2] = var7;
            this.field3127[var11 + 3] = var6;
            this.field3127[var11 + 4] = var5;
            this.field3127[var11 + 5] = var4;
            this.field3127[var11 + 6] = var3;
            this.field3127[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3127[var12 + 5] + var4;
            int var14 = this.field3127[var12 + 4] + var5;
            int var15 = this.field3127[var12] + var9;
            int var16 = this.field3127[var12 + 2] + var7;
            int var17 = this.field3127[var12 + 7] + var2;
            int var18 = this.field3127[var12 + 6] + var3;
            int var19 = this.field3127[var12 + 3] + var6;
            int var20 = this.field3127[var12 + 1] + var8;
            int var21 = var15 ^ var20 << 11;
            int var22 = var16 + var20;
            int var23 = var19 + var21;
            int var24 = var22 ^ var16 >>> 2;
            int var25 = var14 + var24;
            int var26 = var16 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var23 + var25;
            var6 = var28 ^ var25 >>> 16;
            int var29 = var13 + var27;
            int var30 = var6 + var18;
            int var31 = var25 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var5 + var17;
            int var33 = var29 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var8 = var3 + var24;
            var9 = var8 + var34;
            this.field3127[var12] = var9;
            this.field3127[var12 + 1] = var8;
            this.field3127[var12 + 2] = var7;
            this.field3127[var12 + 3] = var6;
            this.field3127[var12 + 4] = var5;
            this.field3127[var12 + 5] = var4;
            this.field3127[var12 + 6] = var3;
            this.field3127[var12 + 7] = var2;
        }
        this.method1278((byte) 120);
        this.field3134 = 256;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZLwd;Lij;)I")
    public static final int method1273(boolean arg0, class217 arg1, class50 arg2) {
        field3132++;
        if (arg0) {
            field3124 = null;
        }
        int var3 = arg1.field3581;
        arg1.method1489(arg2.field898, 0);
        arg1.field3581 += class151.field2629.method1243(arg1.field3581, (byte) 51, arg1.field3633, 0, arg2.field909, arg2.field898);
        return arg1.field3581 - var3;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
    public static void method1274(byte arg0) {
        field3126 = null;
        if (arg0 >= -69) {
            method1273(true, (class217) null, (class50) null);
        }
        field3124 = null;
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)I")
    public final int method1275(int arg0) {
        if (arg0 == this.field3134--) {
            this.method1278((byte) 126);
            this.field3134 = 255;
        }
        field3123++;
        return this.field3130[this.field3134];
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BII[Lce;IZ)V")
    public static final void method1276(byte arg0, int arg1, int arg2, class10[] arg3, int arg4, boolean arg5) {
        if (arg0 != -20) {
            method1273(false, (class217) null, (class50) null);
        }
        field3119++;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            class10 var7 = arg3[var6];
            if (var7 != null && var7.field149 == arg1) {
                class108.method801(arg4, arg2, arg5, var7, (byte) 102);
                class5.method31(arg4, var7, arg2, (byte) 6);
                if (var7.field156 > (var7.field138 - var7.field243)) {
                    var7.field156 = var7.field138 - var7.field243;
                }
                if (var7.field156 < 0) {
                    var7.field156 = 0;
                }
                if (var7.field292 - var7.field242 < var7.field239) {
                    var7.field239 = var7.field292 - var7.field242;
                }
                if (var7.field239 < 0) {
                    var7.field239 = 0;
                }
                if (var7.field227 == 0) {
                    class254.method1716(arg0 ^ 0xCEA9633C, arg5, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I[B)V")
    public static final void method1277(int arg0, byte[] arg1) {
        field3122++;
        class217 var2 = new class217(arg1);
        var2.field3581 = arg1.length - 2;
        class190.field3151 = var2.method1441(68);
        class31.field628 = new byte[class190.field3151][];
        class20.field421 = new int[class190.field3151];
        class2.field27 = new int[class190.field3151];
        class46.field836 = new int[class190.field3151];
        class240.field4132 = new boolean[class190.field3151];
        class164.field2805 = new int[class190.field3151];
        class174.field2911 = new byte[class190.field3151][];
        var2.field3581 = arg1.length - (class190.field3151 * 8) - 7;
        class89.field1707 = var2.method1441(-15);
        class116.field2024 = var2.method1441(123);
        int var3 = (var2.method1487(255) & 0xFF) + 1;
        for (int var4 = 0; var4 < class190.field3151; var4++) {
            class20.field421[var4] = var2.method1441(class201.method1339(arg0, -81));
        }
        for (int var5 = 0; var5 < class190.field3151; var5++) {
            class2.field27[var5] = var2.method1441(-27);
        }
        for (int var6 = 0; var6 < class190.field3151; var6++) {
            class46.field836[var6] = var2.method1441(class201.method1339(arg0, -29));
        }
        for (int var7 = 0; var7 < class190.field3151; var7++) {
            class164.field2805[var7] = var2.method1441(class201.method1339(arg0, 114));
        }
        var2.field3581 = arg1.length - (class190.field3151 * 8) - ((var3 + -1) * 3) - 7;
        class114.field1996 = new int[var3];
        for (int var8 = arg0; var8 < var3; var8++) {
            class114.field1996[var8] = var2.method1447(-12);
            if (class114.field1996[var8] == 0) {
                class114.field1996[var8] = 1;
            }
        }
        var2.field3581 = 0;
        for (int var9 = 0; var9 < class190.field3151; var9++) {
            int var10 = class164.field2805[var9];
            int var11 = class46.field836[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class31.field628[var9] = var13;
            byte[] var14 = new byte[var12];
            boolean var15 = false;
            class174.field2911[var9] = var14;
            int var16 = var2.method1487(255);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method1444((byte) -66);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var14[var18] = var2.method1444((byte) -102);
                        var15 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label97: while (true) {
                    if (var20 >= var11) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var21 = 0;
                        while (true) {
                            if (var11 <= var21) {
                                break label97;
                            }
                            for (int var22 = 0; var22 < var10; var22++) {
                                byte var23 = var14[var11 * var22 + var21] = var2.method1444((byte) -95);
                                var15 |= var23 != -1;
                            }
                            var21++;
                        }
                    }
                    for (int var24 = 0; var24 < var10; var24++) {
                        var13[var11 * var24 + var20] = var2.method1444((byte) -107);
                    }
                    var20++;
                }
            }
            class240.field4132[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V")
    private final void method1278(byte arg0) {
        this.field3131 += ++this.field3120;
        field3125++;
        if (arg0 <= 105) {
            method1271(-37);
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field3127[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3128 ^= this.field3128 << 13;
                } else {
                    this.field3128 ^= this.field3128 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3128 ^= this.field3128 << 2;
            } else {
                this.field3128 ^= this.field3128 >>> 16;
            }
            this.field3128 += this.field3127[var2 + 128 & 0xFF];
            int var4;
            this.field3127[var2] = var4 = this.field3131 + this.field3128 + this.field3127[class51.method413(255, var3 >> 2)];
            this.field3130[var2] = this.field3131 = var3 + this.field3127[class51.method413(var4, 261146) >> 8 >> 2];
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
    private class189() {
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "([I)V")
    public class189(int[] arg0) {
        this.field3130 = new int[256];
        this.field3127 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3130[var2] = arg0[var2];
        }
        this.method1272(4);
    }
}
