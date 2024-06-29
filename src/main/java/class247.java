import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class247 {

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "[I")
    private int[] field4202;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "[I")
    private int[] field4195;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field4193 = 0;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "Lca;")
    public static class136 field4197 = new class136();

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "Lmh;")
    public static class62 field4209 = class201.method1405(true, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "Lmh;")
    private static class62 field4210 = class201.method1405(true, "Hidden");

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "Lmh;")
    public static class62 field4211 = field4210;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field4208 = 0;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    private int field4194;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    private int field4205;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    private int field4206;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    private int field4207;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BIIIII)V", line = 16)
    public static final void method1721(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4203++;
        int var6 = arg4 - arg1;
        if (arg0 <= 52) {
            method1722((byte) 26);
        }
        int var7 = arg3 - arg5;
        if (var6 == 0) {
            if (var7 != 0) {
                class277.method1894(arg2, 1, arg5, arg3, arg1);
            }
        } else if (var7 == 0) {
            class229.method1618((byte) -119, arg5, arg4, arg1, arg2);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 < var7;
            if (var8) {
                int var9 = arg1;
                arg1 = arg5;
                int var10 = arg4;
                arg5 = var9;
                arg4 = arg3;
                arg3 = var10;
            }
            if (arg1 > arg4) {
                int var11 = arg1;
                arg1 = arg4;
                int var12 = arg5;
                arg4 = var11;
                arg5 = arg3;
                arg3 = var12;
            }
            int var13 = arg5;
            int var14 = arg3 - arg5;
            if (var14 < 0) {
                var14 = -var14;
            }
            int var15 = arg4 - arg1;
            int var16 = arg5 >= arg3 ? -1 : 1;
            int var17 = -(var15 >> 1);
            if (var8) {
                for (int var18 = arg1; var18 <= arg4; var18++) {
                    class282.field4817[var18][var13] = arg2;
                    var17 += var14;
                    if (var17 > 0) {
                        var17 -= var15;
                        var13 += var16;
                    }
                }
            } else {
                for (int var19 = arg1; var19 <= arg4; var19++) {
                    class282.field4817[var13][var19] = arg2;
                    var17 += var14;
                    if (var17 > 0) {
                        var17 -= var15;
                        var13 += var16;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V", line = 135)
    public static final void method1722(byte arg0) {
        if (arg0 > -68) {
            return;
        }
        field4198++;
        if (class221.field3800 != null) {
            class221.field3800.method854(-16385);
        }
        if (class158.field2537 != null) {
            class158.field2537.method854(-16385);
        }
        class205.method1428(2, 22050, 3, class218.field3770);
        class221.field3800 = class233.method1644((byte) 127, 22050, class243.field4132, class193.field3246, 0);
        class221.field3800.method856(-13346, class113.field1871);
        class158.field2537 = class233.method1644((byte) 127, 2048, class243.field4132, class193.field3246, 1);
        class158.field2537.method856(-13346, class27.field331);
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V", line = 159)
    private final void method1723(byte arg0) {
        field4196++;
        this.field4207 += ++this.field4194;
        if (arg0 != 102) {
            return;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field4202[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field4205 ^= this.field4205 << 13;
                } else {
                    this.field4205 ^= this.field4205 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field4205 ^= this.field4205 << 2;
            } else {
                this.field4205 ^= this.field4205 >>> 16;
            }
            this.field4205 += this.field4202[var2 + 128 & 0xFF];
            int var4;
            this.field4202[var2] = var4 = this.field4207 + this.field4202[class234.method1648(255, var3 >> 2)] + this.field4205;
            this.field4195[var2] = this.field4207 = this.field4202[class234.method1648(261143, var4) >> 8 >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)I", line = 207)
    public final int method1724(int arg0) {
        if (this.field4206-- == 0) {
            this.method1723((byte) 102);
            this.field4206 = 255;
        }
        if (arg0 != 6292) {
            this.method1724(-17);
        }
        field4200++;
        return this.field4195[this.field4206];
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V", line = 233)
    private final void method1725(byte arg0) {
        if (arg0 < 92) {
            field4210 = (class62) null;
        }
        field4204++;
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
            int var15 = var5 + var14;
            int var16 = var7 + var12;
            int var17 = var16 ^ var12 << 8;
            int var18 = var12 + var15;
            var6 = var18 ^ var15 >>> 16;
            int var19 = var4 + var17;
            int var20 = var15 + var19;
            int var21 = var3 + var6;
            var5 = var20 ^ var19 << 10;
            int var22 = var2 + var5;
            int var23 = var19 + var21;
            var4 = var23 ^ var21 >>> 4;
            int var24 = var4 + var11;
            int var25 = var21 + var22;
            var3 = var25 ^ var22 << 8;
            int var26 = var22 + var24;
            var8 = var3 + var14;
            var2 = var26 ^ var24 >>> 9;
            var7 = var2 + var17;
            var9 = var8 + var24;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field4195[var27 + 7] + var2;
            int var29 = this.field4195[var27 + 2] + var7;
            int var30 = this.field4195[var27 + 6] + var3;
            int var31 = this.field4195[var27 + 4] + var5;
            int var32 = this.field4195[var27 + 3] + var6;
            int var33 = this.field4195[var27 + 5] + var4;
            int var34 = this.field4195[var27 + 1] + var8;
            int var35 = this.field4195[var27] + var9;
            int var36 = var35 ^ var34 << 11;
            int var37 = var32 + var36;
            int var38 = var29 + var34;
            int var39 = var38 ^ var29 >>> 2;
            int var40 = var31 + var39;
            int var41 = var29 + var37;
            int var42 = var41 ^ var37 << 8;
            int var43 = var33 + var42;
            int var44 = var37 + var40;
            var6 = var44 ^ var40 >>> 16;
            int var45 = var6 + var30;
            int var46 = var40 + var43;
            var5 = var46 ^ var43 << 10;
            int var47 = var43 + var45;
            int var48 = var5 + var28;
            var4 = var47 ^ var45 >>> 4;
            int var49 = var4 + var36;
            int var50 = var45 + var48;
            var3 = var50 ^ var48 << 8;
            int var51 = var48 + var49;
            var8 = var3 + var39;
            var2 = var51 ^ var49 >>> 9;
            var9 = var8 + var49;
            var7 = var2 + var42;
            this.field4202[var27] = var9;
            this.field4202[var27 + 1] = var8;
            this.field4202[var27 + 2] = var7;
            this.field4202[var27 + 3] = var6;
            this.field4202[var27 + 4] = var5;
            this.field4202[var27 + 5] = var4;
            this.field4202[var27 + 6] = var3;
            this.field4202[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field4202[var52] + var9;
            int var54 = this.field4202[var52 + 6] + var3;
            int var55 = this.field4202[var52 + 7] + var2;
            int var56 = this.field4202[var52 + 2] + var7;
            int var57 = this.field4202[var52 + 3] + var6;
            int var58 = this.field4202[var52 + 5] + var4;
            int var59 = this.field4202[var52 + 4] + var5;
            int var60 = this.field4202[var52 + 1] + var8;
            int var61 = var53 ^ var60 << 11;
            int var62 = var57 + var61;
            int var63 = var56 + var60;
            int var64 = var63 ^ var56 >>> 2;
            int var65 = var56 + var62;
            int var66 = var59 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var58 + var67;
            int var69 = var62 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var6 + var54;
            int var71 = var66 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            int var73 = var5 + var55;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var70 + var73;
            var3 = var74 ^ var73 << 8;
            var8 = var3 + var64;
            int var75 = var4 + var61;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
            this.field4202[var52] = var9;
            this.field4202[var52 + 1] = var8;
            this.field4202[var52 + 2] = var7;
            this.field4202[var52 + 3] = var6;
            this.field4202[var52 + 4] = var5;
            this.field4202[var52 + 5] = var4;
            this.field4202[var52 + 6] = var3;
            this.field4202[var52 + 7] = var2;
        }
        this.method1723((byte) 102);
        this.field4206 = 256;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)Leb;", line = 379)
    public static final class35 method1726(int arg0, byte arg1) {
        field4201++;
        class35 var2 = (class35) class219.field3773.method1396(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class42.field647.method157(arg0, 4, (byte) 19);
        class35 var4 = new class35();
        if (var3 != null) {
            var4.method227(false, arg0, new class92(var3));
        }
        class219.field3773.method1397((long) arg0, var4, true);
        int var5 = -13 / ((-arg1 - 13) / 41);
        return var4;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V", line = 402)
    public static void method1727(int arg0) {
        if (arg0 != 256) {
            method1727(-126);
        }
        field4210 = null;
        field4197 = null;
        field4209 = null;
        field4211 = null;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V", line = 425)
    private class247() {
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "([I)V", line = 443)
    public class247(int[] arg0) {
        this.field4202 = new int[256];
        this.field4195 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field4195[var2] = arg0[var2];
        }
        this.method1725((byte) 122);
    }
}
