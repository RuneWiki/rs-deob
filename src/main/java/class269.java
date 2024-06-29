import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class269 {

    @OriginalMember(owner = "client!c", name = "f", descriptor = "[I")
    private int[] field4210;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "[I")
    private int[] field4218;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field4205 = 0;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field4215 = 0;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public static int field4217 = -1;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "[I")
    public static int[] field4214 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    private int field4206;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    private int field4212;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    private int field4213;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    private int field4220;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field4209;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Lii;")
    public static final class185 method1797(int arg0, int arg1) {
        class185 var2 = (class185) class13.field203.method263((byte) 126, (long) arg0);
        field4221++;
        if (arg1 != -30718) {
            field4209 = null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class284.field4517.method1538(34, arg0, (byte) 70);
        class185 var4 = new class185();
        if (var3 != null) {
            var4.method1199((byte) 102, new class114(var3), arg0);
        }
        class13.field203.method255((long) arg0, var4, (byte) -125);
        return var4;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)I")
    public static final int method1798(int arg0) {
        field4216++;
        if (arg0 != 6) {
            return 49;
        }
        try {
            if (class40.field596 == 0) {
                if (class283.field4512 > class287.method1928(arg0 + 27326) - 5000L) {
                    return 0;
                }
                class182.field2600 = class163.field2378.method550(class282.field4498, 32606, class88.field1347);
                class72.field1113 = class287.method1928(27332);
                class40.field596 = 1;
            }
            if ((class72.field1113 + 30000L) < class287.method1928(arg0 + 27326)) {
                return class204.method1318(-1, 1000);
            }
            if (class40.field596 == 1) {
                if (class182.field2600.field3588 == 2) {
                    return class204.method1318(arg0 ^ 0xFFFFFFF9, 1001);
                }
                if (class182.field2600.field3588 != 1) {
                    return -1;
                }
                class10.field180 = new class54((Socket) class182.field2600.field3585, class163.field2378);
                class95.field1451.field1673 = 0;
                class182.field2600 = null;
                int var1 = 0;
                if (class56.field862) {
                    var1 = class231.field3448;
                }
                class95.field1451.method775(23, -123);
                class95.field1451.method737(-2645, var1);
                class10.field180.method356((byte) 13, class95.field1451.field1629, 0, class95.field1451.field1673);
                if (class217.field3198 != null) {
                    class217.field3198.method1455(false);
                }
                if (class240.field3599 != null) {
                    class240.field3599.method1455(false);
                }
                int var2 = class10.field180.method358(arg0 ^ 0x7E);
                if (class217.field3198 != null) {
                    class217.field3198.method1455(false);
                }
                if (class240.field3599 != null) {
                    class240.field3599.method1455(false);
                }
                if (var2 != 0) {
                    return class204.method1318(-1, var2);
                }
                class40.field596 = 2;
            }
            if (class40.field596 == 2) {
                if (class10.field180.method357((byte) 29) < 2) {
                    return -1;
                }
                class162.field2355 = class10.field180.method358(arg0 ^ 0x58);
                class162.field2355 <<= 0x8;
                class162.field2355 += class10.field180.method358(74);
                class39.field583 = 0;
                class79.field1220 = new byte[class162.field2355];
                class40.field596 = 3;
            }
            if (class40.field596 != 3) {
                return -1;
            }
            int var3 = class10.field180.method357((byte) 35);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > class162.field2355 - class39.field583) {
                var3 = class162.field2355 - class39.field583;
            }
            class10.field180.method363(class79.field1220, -5942, var3, class39.field583);
            class39.field583 += var3;
            if (class162.field2355 > class39.field583) {
                return -1;
            } else if (class64.method444(arg0 + 104, class79.field1220)) {
                class263.field3960 = new class55[class96.field1459];
                int var4 = 0;
                for (int var5 = class121.field1761; var5 <= class206.field2983; var5++) {
                    class55 var6 = class10.method90(var5, true);
                    if (var6 != null) {
                        class263.field3960[var4++] = var6;
                    }
                }
                class10.field180.method362(false);
                class10.field180 = null;
                class79.field1220 = null;
                class40.field596 = 0;
                class202.field2928 = 0;
                class283.field4512 = class287.method1928(27332);
                return 0;
            } else {
                return class204.method1318(-1, 1002);
            }
        } catch (IOException var7) {
            return class204.method1318(arg0 - 7, 1003);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
    private final void method1799(byte arg0) {
        field4207++;
        if (arg0 != 17) {
            this.method1802((byte) -32);
        }
        this.field4212 += ++this.field4213;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field4210[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field4206 ^= this.field4206 << 13;
                } else {
                    this.field4206 ^= this.field4206 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field4206 ^= this.field4206 << 2;
            } else {
                this.field4206 ^= this.field4206 >>> 16;
            }
            this.field4206 += this.field4210[var2 + 128 & 0xFF];
            int var4;
            this.field4210[var2] = var4 = this.field4210[class184.method1188(var3, 1020) >> 2] + this.field4206 + this.field4212;
            this.field4218[var2] = this.field4212 = var3 + this.field4210[class184.method1188(var4, 261141) >> 8 >> 2];
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIBIII)V")
    public static final void method1800(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        class234.method1542((byte) -127, arg5);
        int var7 = arg5 - arg2;
        int var8 = 0;
        if (var7 < 0) {
            var7 = 0;
        }
        field4211++;
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = -var7;
        int var12 = var7;
        if (arg3 < 59) {
            method1803((byte) 33);
        }
        int var13 = -1;
        if (class93.field1418 <= arg0 && class254.field3857 >= arg0) {
            int[] var14 = class163.field2370[arg0];
            int var15 = class177.method1152(class93.field1412, class142.field2061, arg1 - arg5, 106);
            int var16 = class177.method1152(class93.field1412, class142.field2061, arg1 + arg5, -7);
            int var17 = class177.method1152(class93.field1412, class142.field2061, arg1 - var7, 117);
            int var18 = class177.method1152(class93.field1412, class142.field2061, arg1 + var7, 127);
            class183.method1181(arg4, (byte) -69, var17, var14, var15);
            class183.method1181(arg6, (byte) -69, var18, var14, var17);
            class183.method1181(arg4, (byte) -69, var16, var14, var18);
        }
        int var19 = -1;
        while (var9 > var8) {
            var19 += 2;
            var13 += 2;
            var11 += var19;
            var10 += var13;
            if (var11 >= 0 && var12 >= 1) {
                var12--;
                class288.field4565[var12] = var8;
                var11 -= var12 << 1;
            }
            var8++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg0 - var9;
                int var21 = arg0 + var9;
                if (class93.field1418 <= var21 && class254.field3857 >= var20) {
                    if (var9 < var7) {
                        int var22 = class288.field4565[var9];
                        int var23 = class177.method1152(class93.field1412, class142.field2061, arg1 + var8, 107);
                        int var24 = class177.method1152(class93.field1412, class142.field2061, arg1 - var8, 119);
                        int var25 = class177.method1152(class93.field1412, class142.field2061, arg1 + var22, -85);
                        int var26 = class177.method1152(class93.field1412, class142.field2061, arg1 - var22, 11);
                        if (class254.field3857 >= var21) {
                            int[] var27 = class163.field2370[var21];
                            class183.method1181(arg4, (byte) -69, var26, var27, var24);
                            class183.method1181(arg6, (byte) -69, var25, var27, var26);
                            class183.method1181(arg4, (byte) -69, var23, var27, var25);
                        }
                        if (var20 >= class93.field1418) {
                            int[] var28 = class163.field2370[var20];
                            class183.method1181(arg4, (byte) -69, var26, var28, var24);
                            class183.method1181(arg6, (byte) -69, var25, var28, var26);
                            class183.method1181(arg4, (byte) -69, var23, var28, var25);
                        }
                    } else {
                        int var29 = class177.method1152(class93.field1412, class142.field2061, arg1 + var8, 122);
                        int var30 = class177.method1152(class93.field1412, class142.field2061, arg1 - var8, 21);
                        if (var21 <= class254.field3857) {
                            class183.method1181(arg4, (byte) -69, var29, class163.field2370[var21], var30);
                        }
                        if (var20 >= class93.field1418) {
                            class183.method1181(arg4, (byte) -69, var29, class163.field2370[var20], var30);
                        }
                    }
                }
            }
            int var31 = arg0 - var8;
            int var32 = arg0 + var8;
            if (var32 >= class93.field1418 && var31 <= class254.field3857) {
                int var33 = arg1 + var9;
                int var34 = arg1 - var9;
                if (class93.field1412 <= var33 && class142.field2061 >= var34) {
                    int var35 = class177.method1152(class93.field1412, class142.field2061, var33, -23);
                    int var36 = class177.method1152(class93.field1412, class142.field2061, var34, 127);
                    if (var7 <= var8) {
                        if (var32 <= class254.field3857) {
                            class183.method1181(arg4, (byte) -69, var35, class163.field2370[var32], var36);
                        }
                        if (var31 >= class93.field1418) {
                            class183.method1181(arg4, (byte) -69, var35, class163.field2370[var31], var36);
                        }
                    } else {
                        int var37 = var8 > var12 ? class288.field4565[var8] : var12;
                        int var38 = class177.method1152(class93.field1412, class142.field2061, arg1 + var37, 120);
                        int var39 = class177.method1152(class93.field1412, class142.field2061, arg1 - var37, -126);
                        if (class254.field3857 >= var32) {
                            int[] var40 = class163.field2370[var32];
                            class183.method1181(arg4, (byte) -69, var39, var40, var36);
                            class183.method1181(arg6, (byte) -69, var38, var40, var39);
                            class183.method1181(arg4, (byte) -69, var35, var40, var38);
                        }
                        if (var31 >= class93.field1418) {
                            int[] var41 = class163.field2370[var31];
                            class183.method1181(arg4, (byte) -69, var39, var41, var36);
                            class183.method1181(arg6, (byte) -69, var38, var41, var39);
                            class183.method1181(arg4, (byte) -69, var35, var41, var38);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    private final void method1801(int arg0) {
        field4219++;
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
            int var65 = var5 + var64;
            int var66 = var7 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var62 + var65;
            int var69 = var4 + var67;
            var6 = var68 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var69 + var70;
            var4 = var72 ^ var70 >>> 4;
            int var73 = var4 + var61;
            int var74 = var2 + var5;
            int var75 = var70 + var74;
            var3 = var75 ^ var74 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var74;
            var2 = var76 ^ var73 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var73;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field4218[var11 + 4] + var5;
            int var38 = this.field4218[var11 + 1] + var8;
            int var39 = this.field4218[var11 + 2] + var7;
            int var40 = this.field4218[var11 + 7] + var2;
            int var41 = this.field4218[var11 + 6] + var3;
            int var42 = this.field4218[var11 + 5] + var4;
            int var43 = this.field4218[var11] + var9;
            int var44 = var43 ^ var38 << 11;
            int var45 = this.field4218[var11 + 3] + var6;
            int var46 = var44 + var45;
            int var47 = var38 + var39;
            int var48 = var47 ^ var39 >>> 2;
            int var49 = var37 + var48;
            int var50 = var39 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var42 + var51;
            int var53 = var46 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var49 + var52;
            var5 = var54 ^ var52 << 10;
            int var55 = var5 + var40;
            int var56 = var6 + var41;
            int var57 = var52 + var56;
            var4 = var57 ^ var56 >>> 4;
            int var58 = var4 + var44;
            int var59 = var55 + var56;
            var3 = var59 ^ var55 << 8;
            int var60 = var55 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field4210[var11] = var9;
            this.field4210[var11 + 1] = var8;
            this.field4210[var11 + 2] = var7;
            this.field4210[var11 + 3] = var6;
            this.field4210[var11 + 4] = var5;
            this.field4210[var11 + 5] = var4;
            this.field4210[var11 + 6] = var3;
            this.field4210[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field4210[var12 + 2] + var7;
            int var14 = this.field4210[var12] + var9;
            int var15 = this.field4210[var12 + 1] + var8;
            int var16 = this.field4210[var12 + 4] + var5;
            int var17 = this.field4210[var12 + 5] + var4;
            int var18 = this.field4210[var12 + 7] + var2;
            int var19 = this.field4210[var12 + 3] + var6;
            int var20 = var14 ^ var15 << 11;
            int var21 = var13 + var15;
            int var22 = this.field4210[var12 + 6] + var3;
            int var23 = var19 + var20;
            int var24 = var21 ^ var13 >>> 2;
            int var25 = var16 + var24;
            int var26 = var13 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var17 + var27;
            int var29 = var23 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var6 + var22;
            int var31 = var25 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var28 + var30;
            int var33 = var5 + var18;
            var4 = var32 ^ var30 >>> 4;
            int var34 = var4 + var20;
            int var35 = var30 + var33;
            var3 = var35 ^ var33 << 8;
            int var36 = var33 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field4210[var12] = var9;
            this.field4210[var12 + 1] = var8;
            this.field4210[var12 + 2] = var7;
            this.field4210[var12 + 3] = var6;
            this.field4210[var12 + 4] = var5;
            this.field4210[var12 + 5] = var4;
            this.field4210[var12 + 6] = var3;
            this.field4210[var12 + 7] = var2;
        }
        if (arg0 <= 106) {
            this.method1801(15);
        }
        this.method1799((byte) 17);
        this.field4220 = 256;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)I")
    public final int method1802(byte arg0) {
        field4208++;
        if (this.field4220-- == 0) {
            this.method1799((byte) 17);
            this.field4220 = 255;
        }
        if (arg0 <= 93) {
            this.method1801(-23);
        }
        return this.field4218[this.field4220];
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(B)V")
    public static void method1803(byte arg0) {
        field4214 = null;
        field4209 = null;
        if (arg0 != 24) {
            method1803((byte) 57);
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
    private class269() {
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "([I)V")
    public class269(int[] arg0) {
        this.field4210 = new int[256];
        this.field4218 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field4218[var2] = arg0[var2];
        }
        this.method1801(124);
    }
}
