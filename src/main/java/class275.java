import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class275 extends class26 {

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "[I")
    private int[] field3948;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "[B")
    public byte[] field3936;

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "[B")
    public byte[] field3951;

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "[B")
    public byte[] field3947;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "[Lsi;")
    public class84[] field3945;

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "[S")
    public short[] field3950;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "[Lpb;")
    public class168[] field3939;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
    public int field3940;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
    public static int field3937 = -1;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
    public static int field3943 = 0;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "Lfh;")
    public static class140 field3949;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIILf;)V", line = 5)
    public static final void method1862(int arg0, int arg1, int arg2, class239 arg3) {
        field3938++;
        if ((arg1 & 0x1) != 0) {
            int var4 = class240.field3490.method2046((byte) 98);
            int var5 = class240.field3490.method2096((byte) -122);
            arg3.method2292(class313.field4603, 0, var5, var4);
            arg3.field4880 = class313.field4603 + 300;
            arg3.field4917 = class240.field3490.method2056(106);
        }
        if ((arg1 & 0x2) != 0) {
            int var6 = class240.field3490.method2083((byte) -15);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = class240.field3490.method2096((byte) -122);
            class99.method711(arg3, var6, var7, -1);
        }
        if ((arg1 & 0x8) != 0) {
            int var8 = class240.field3490.method2056(81);
            byte[] var9 = new byte[var8];
            class299 var10 = new class299(var9);
            class240.field3490.method2067(-1427401272, 0, var9, var8);
            class29.field334[arg0] = var10;
            arg3.method1695(var10, (byte) 71);
        }
        if ((arg1 & 0x4) != 0) {
            arg3.field4909 = class240.field3490.method2102((byte) -119);
            arg3.field4895 = class240.field3490.method2083((byte) -96);
        }
        if ((arg1 & 0x800) != 0) {
            int var11 = class240.field3490.method2090(-128);
            int[] var12 = new int[var11];
            int[] var13 = new int[var11];
            int[] var14 = new int[var11];
            for (int var15 = 0; var15 < var11; var15++) {
                int var16 = class240.field3490.method2083((byte) -59);
                if (var16 == 65535) {
                    var16 = -1;
                }
                var12[var15] = var16;
                var13[var15] = class240.field3490.method2072(-115);
                var14[var15] = class240.field3490.method2055(-66);
            }
            class131.method1003(var14, arg3, -121, var13, var12);
        }
        if ((arg1 & 0x10) != 0) {
            arg3.field4864 = class240.field3490.method2060(-12482);
            if (arg3.field4864.charAt(0) == '~') {
                arg3.field4864 = arg3.field4864.substring(1);
                class88.method641(arg3.method1698((byte) -122), 2, false, arg3.field4864);
            } else if (class359.field5616 == arg3) {
                class88.method641(arg3.method1698((byte) -122), 2, false, arg3.field4864);
            }
            arg3.field4887 = 0;
            arg3.field4865 = 0;
            arg3.field4918 = 150;
        }
        if ((arg1 & 0x20) != 0) {
            int var17 = class240.field3490.method2097((byte) 120);
            int var18 = class240.field3490.method2090(-128);
            boolean var19 = (var17 & 0x8000) != 0;
            int var20 = class240.field3490.method2072(-118);
            int var21 = class240.field3490.field4351;
            if (arg3.field3475 != null && arg3.field3480 != null) {
                long var22 = class201.method1476(-123, arg3.field3475);
                boolean var24 = false;
                if (var18 <= 1) {
                    if (!var19 && (class78.field1006 && !class94.field1231 || class226.field3249)) {
                        var24 = true;
                    } else {
                        for (int var25 = 0; var25 < class116.field1511; var25++) {
                            if (class234.field3356[var25] == var22) {
                                var24 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var24 && class93.field1204 == 0) {
                    class118.field1537.field4351 = 0;
                    int var26 = -1;
                    class240.field3490.method2101(-21764, var20, class118.field1537.field4350, 0);
                    class118.field1537.field4351 = 0;
                    String var27;
                    if (var19) {
                        var17 &= 0x7FFF;
                        class271 var28 = class195.method1412(73, class118.field1537);
                        var26 = var28.field3883;
                        var27 = var28.field3882.method860(-105, class118.field1537);
                    } else {
                        var27 = class281.method1905(method1866(false, class1.method3(32767, class118.field1537)));
                    }
                    arg3.field4864 = var27.trim();
                    arg3.field4887 = var17 & 0xFF;
                    arg3.field4918 = 150;
                    arg3.field4865 = var17 >> 8;
                    if (var18 == 2) {
                        class65.method474("<img=1>" + arg3.method1698((byte) -122), var26, (String) null, var19 ? 17 : 1, var27, 0);
                    } else if (var18 == 1) {
                        class65.method474("<img=0>" + arg3.method1698((byte) -122), var26, (String) null, var19 ? 17 : 1, var27, 0);
                    } else {
                        class65.method474(arg3.method1698((byte) -122), var26, (String) null, var19 ? 17 : 2, var27, 0);
                    }
                }
            }
            class240.field3490.field4351 = var21 + var20;
        }
        if ((arg1 & 0x100) != 0) {
            int var29 = class240.field3490.method2102((byte) -111);
            int var30 = class240.field3490.method2062(-25795);
            boolean var31 = true;
            if (var29 == 65535) {
                var29 = -1;
            }
            if (var29 != -1 && arg3.field4839 != -1 && class207.method1516(class234.method1664(-128, var29).field169, 118).field4638 < class207.method1516(class234.method1664(-128, arg3.field4839).field169, 127).field4638) {
                var31 = false;
            }
            if (var31) {
                arg3.field4857 = 1;
                arg3.field4851 = var30 >> 16;
                arg3.field4848 = 0;
                arg3.field4921 = 0;
                arg3.field4868 = (var30 & 0xFFFF) + class313.field4603;
                if (class313.field4603 < arg3.field4868) {
                    arg3.field4921 = -1;
                }
                arg3.field4839 = var29;
                if (arg3.field4839 != -1 && class313.field4603 == arg3.field4868) {
                    int var32 = class234.method1664(-128, arg3.field4839).field169;
                    if (var32 != -1) {
                        class314 var33 = class207.method1516(var32, 121);
                        if (var33 != null && var33.field4631 != null) {
                            class296.method2025(var33, arg3.field4893, arg3.field4855, 0, class359.field5616 == arg3, false);
                        }
                    }
                }
            }
        }
        if ((arg1 & 0x40) != 0) {
            arg3.field4870 = class240.field3490.method2097((byte) 120);
            if (arg3.field4870 == 65535) {
                arg3.field4870 = -1;
            }
        }
        if ((arg1 & 0x200) != 0) {
            arg3.field4853 = class240.field3490.method2090(-128);
            arg3.field4928 = class240.field3490.method2096((byte) -122);
            arg3.field4908 = class240.field3490.method2072(-95);
            arg3.field4920 = class240.field3490.method2090(-128);
            arg3.field4929 = class240.field3490.method2055(-66) + class313.field4603;
            arg3.field4846 = class240.field3490.method2055(-66) + class313.field4603;
            arg3.field4901 = class240.field3490.method2056(71);
            arg3.field4845 = 1;
            arg3.field4925 = 0;
        }
        int var34 = 66 / ((arg2 - 50) / 59);
        if ((arg1 & 0x400) != 0) {
            int var35 = class240.field3490.method2046((byte) 98);
            int var36 = class240.field3490.method2096((byte) -122);
            arg3.method2292(class313.field4603, 0, var36, var35);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([ILjk;I[B)Z", line = 280)
    public final boolean method1863(int[] arg0, class82 arg1, int arg2, byte[] arg3) {
        field3935++;
        int var5 = -61 % ((-arg2 - 85) / 40);
        boolean var6 = true;
        int var7 = 0;
        class168 var8 = null;
        for (int var9 = 0; var9 < 128; var9++) {
            if (arg3 == null || arg3[var9] != 0) {
                int var10 = this.field3948[var9];
                if (var10 != 0) {
                    if (var7 != var10) {
                        var7 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var8 = arg1.method610(3414, arg0, var10 >> 2);
                        } else {
                            var8 = arg1.method607(arg0, 47, var10 >> 2);
                        }
                        if (var8 == null) {
                            var6 = false;
                        }
                    }
                    if (var8 != null) {
                        this.field3939[var9] = var8;
                        this.field3948[var9] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V", line = 335)
    public static void method1864(int arg0) {
        field3949 = null;
        if (arg0 > -37) {
            method1862(34, -2, -85, (class239) null);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(CZ)C", line = 357)
    private static final char method1865(char arg0, boolean arg1) {
        field3946++;
        if (arg0 == 'µ' || arg0 == 'ƒ') {
            return arg0;
        } else {
            return (char) (arg1 ? 65515 : Character.toTitleCase(arg0));
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 374)
    public static final String method1866(boolean arg0, String arg1) {
        int var2 = arg1.length();
        if (arg0) {
            return (String) null;
        }
        char[] var3 = new char[var2];
        field3942++;
        byte var4 = 2;
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = method1865(var6, false);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V", line = 442)
    public final void method1867(boolean arg0) {
        if (!arg0) {
            this.method1867(false);
        }
        field3944++;
        this.field3948 = null;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V", line = 453)
    public class275() {
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "([B)V", line = 455)
    public class275(byte[] arg0) {
        this.field3948 = new int[128];
        int var2 = 0;
        this.field3936 = new byte[128];
        this.field3951 = new byte[128];
        this.field3947 = new byte[128];
        this.field3945 = new class84[128];
        this.field3950 = new short[128];
        this.field3939 = new class168[128];
        class299 var3 = new class299(arg0);
        while (var3.field4350[var3.field4351 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method2104(124);
        }
        var2++;
        var3.field4351++;
        int var6 = var3.field4351;
        var3.field4351 += var2;
        int var7;
        for (var7 = 0; var3.field4350[var3.field4351 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method2104(111);
        }
        var7++;
        var3.field4351++;
        int var10 = 0;
        int var11 = var3.field4351;
        var3.field4351 += var7;
        while (var3.field4350[var3.field4351 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method2104(113);
        }
        var10++;
        var3.field4351++;
        byte[] var14 = new byte[var10];
        int var16;
        if (var10 > 1) {
            int var15 = 1;
            var16 = 2;
            var14[1] = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method2096((byte) -122);
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var15 >= var18) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var10;
        }
        class84[] var19 = new class84[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class84 var21 = var19[var20] = new class84();
            int var22 = var3.method2096((byte) -122);
            if (var22 > 0) {
                var21.field1087 = new byte[var22 * 2];
            }
            int var23 = var3.method2096((byte) -122);
            if (var23 > 0) {
                var21.field1084 = new byte[var23 * 2 + 2];
                var21.field1084[1] = 64;
            }
        }
        int var24 = var3.method2096((byte) -122);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        int var26 = var3.method2096((byte) -122);
        int var27 = 0;
        byte[] var28 = var26 <= 0 ? null : new byte[var26 * 2];
        while (var3.field4350[var3.field4351 + var27] != 0) {
            var27++;
        }
        byte[] var29 = new byte[var27];
        for (int var30 = 0; var30 < var27; var30++) {
            var29[var30] = var3.method2104(101);
        }
        var3.field4351++;
        var27++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method2096((byte) -122);
            this.field3950[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method2096((byte) -122);
            this.field3950[var34] = (short) (this.field3950[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var36 >= var29.length) {
                    var35 = -1;
                } else {
                    var35 = var29[var36++];
                }
                var37 = var3.method2076(false);
            }
            this.field3950[var38] = (short) (this.field3950[var38] + class335.method2339(32768, var37 - 1 << 14));
            this.field3948[var38] = var37;
            var35--;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3948[var42] != 0) {
                if (var39 == 0) {
                    var41 = var3.field4350[var6++] - 1;
                    if (var40 >= var4.length) {
                        var39 = -1;
                    } else {
                        var39 = var4[var40++];
                    }
                }
                this.field3936[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3948[var46] != 0) {
                if (var45 == 0) {
                    if (var8.length <= var44) {
                        var45 = -1;
                    } else {
                        var45 = var8[var44++];
                    }
                    var43 = var3.field4350[var11++] + 16 << 2;
                }
                this.field3947[var46] = (byte) var43;
                var45--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class84 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field3948[var50] != 0) {
                if (var47 == 0) {
                    var49 = var19[var14[var48]];
                    if (var12.length > var48) {
                        var47 = var12[var48++];
                    } else {
                        var47 = -1;
                    }
                }
                var47--;
                this.field3945[var50] = var49;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var51 == 0) {
                if (var29.length <= var52) {
                    var51 = -1;
                } else {
                    var51 = var29[var52++];
                }
                if (this.field3948[var54] > 0) {
                    var53 = var3.method2096((byte) -122) + 1;
                }
            }
            this.field3951[var54] = (byte) var53;
            var51--;
        }
        this.field3940 = var3.method2096((byte) -122) + 1;
        for (int var55 = 0; var55 < var16; var55++) {
            class84 var56 = var19[var55];
            if (var56.field1087 != null) {
                for (int var57 = 1; var57 < var56.field1087.length; var57 += 2) {
                    var56.field1087[var57] = var3.method2104(123);
                }
            }
            if (var56.field1084 != null) {
                for (int var58 = 3; var58 < (var56.field1084.length - 2); var58 += 2) {
                    var56.field1084[var58] = var3.method2104(100);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method2104(112);
            }
        }
        if (var28 != null) {
            for (int var60 = 1; var60 < var28.length; var60 += 2) {
                var28[var60] = var3.method2104(111);
            }
        }
        for (int var61 = 0; var61 < var16; var61++) {
            class84 var62 = var19[var61];
            if (var62.field1084 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field1084.length; var64 += 2) {
                    var63 += var3.method2096((byte) -122) + 1;
                    var62.field1084[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var16; var65++) {
            class84 var66 = var19[var65];
            if (var66.field1087 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field1087.length; var68 += 2) {
                    var67 = var3.method2096((byte) -122) + var67 + 1;
                    var66.field1087[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method2096((byte) -122);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var69 + var3.method2096((byte) -122) + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field3951[var73] = (byte) (this.field3951[var73] * var72 + 32 >> 6);
            }
            for (int var74 = 2; var74 < var25.length; var74 += 2) {
                byte var75 = var25[var74 + 1];
                byte var76 = var25[var74];
                int var77 = (var76 - var71) / 2 + (var76 - var71) * var72;
                for (int var78 = var71; var78 < var76; var78++) {
                    int var79 = class240.method1704(var76 - var71, 20244, var77);
                    this.field3951[var78] = (byte) (this.field3951[var78] * var79 + 32 >> 6);
                    var77 += var75 - var72;
                }
                var72 = var75;
                var71 = var76;
            }
            Object var80 = null;
            for (int var81 = var71; var81 < 128; var81++) {
                this.field3951[var81] = (byte) (this.field3951[var81] * var72 + 32 >> 6);
            }
        }
        if (var28 != null) {
            int var82 = var3.method2096((byte) -122);
            var28[0] = (byte) var82;
            for (int var83 = 2; var83 < var28.length; var83 += 2) {
                var82 -= -var3.method2096((byte) -122) - 1;
                var28[var83] = (byte) var82;
            }
            int var84 = var28[1] << 1;
            byte var85 = var28[0];
            for (int var86 = 0; var86 < var85; var86++) {
                int var87 = (this.field3947[var86] & 0xFF) + var84;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field3947[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var28.length > var88) {
                byte var89 = var28[var88];
                int var90 = var28[var88 + 1] << 1;
                var88 += 2;
                int var91 = (var89 - var85) / 2 + (var89 - var85) * var84;
                for (int var92 = var85; var92 < var89; var92++) {
                    int var93 = class240.method1704(var89 - var85, 20244, var91);
                    var91 += var90 - var84;
                    int var94 = (this.field3947[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field3947[var92] = (byte) var94;
                }
                var85 = var89;
                var84 = var90;
            }
            Object var95 = null;
            for (int var96 = var85; var96 < 128; var96++) {
                int var97 = (this.field3947[var96] & 0xFF) + var84;
                if (var97 < 0) {
                    var97 = 0;
                }
                if (var97 > 128) {
                    var97 = 128;
                }
                this.field3947[var96] = (byte) var97;
            }
        }
        for (int var98 = 0; var98 < var16; var98++) {
            var19[var98].field1078 = var3.method2096((byte) -122);
        }
        for (int var99 = 0; var99 < var16; var99++) {
            class84 var100 = var19[var99];
            if (var100.field1087 != null) {
                var100.field1079 = var3.method2096((byte) -122);
            }
            if (var100.field1084 != null) {
                var100.field1089 = var3.method2096((byte) -122);
            }
            if (var100.field1078 > 0) {
                var100.field1074 = var3.method2096((byte) -122);
            }
        }
        for (int var101 = 0; var101 < var16; var101++) {
            var19[var101].field1086 = var3.method2096((byte) -122);
        }
        for (int var102 = 0; var102 < var16; var102++) {
            class84 var103 = var19[var102];
            if (var103.field1086 > 0) {
                var103.field1075 = var3.method2096((byte) -122);
            }
        }
        for (int var104 = 0; var104 < var16; var104++) {
            class84 var105 = var19[var104];
            if (var105.field1075 > 0) {
                var105.field1083 = var3.method2096((byte) -122);
            }
        }
    }
}
