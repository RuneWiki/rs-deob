import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class307 extends class115 {

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "Z")
    public boolean field5457 = true;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "Z")
    public static boolean field5448 = true;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
    public static int field5444 = -1;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "I")
    public static int field5446 = 0;

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "Lud;")
    private static class279 field5451 = class130.method1024("You can(Wt add yourself to your own ignore list)3", 255);

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "Lgf;")
    public static class8 field5460 = null;

    @OriginalMember(owner = "client!gd", name = "Z", descriptor = "Lud;")
    public static class279 field5466 = field5451;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!gd", name = "X", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "Lok;")
    public static class149 field5456;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "[I")
    private int[] field5455;

    @OriginalMember(owner = "client!gd", name = "ab", descriptor = "[I")
    public int[] field5467;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "[Lud;")
    private class279[] field5458;

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "[[I")
    private int[][] field5465;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)I", line = 6)
    public final int method2178(int arg0, int arg1, int arg2) {
        if (arg0 >= -69) {
            this.field5458 = (class279[]) null;
        }
        field5443++;
        if (this.field5455 == null || arg1 < 0 || arg1 > this.field5455.length) {
            return -1;
        } else if (this.field5465[arg1] == null || arg2 < 0 || this.field5465[arg1].length < arg2) {
            return -1;
        } else {
            return this.field5465[arg1][arg2];
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)I", line = 28)
    public final int method2179(int arg0) {
        field5454++;
        if (this.field5455 == null) {
            return 0;
        } else if (arg0 == 0) {
            return this.field5455.length;
        } else {
            return 9;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)Lud;", line = 52)
    public final class279 method2180(int arg0) {
        field5441++;
        class279 var2 = class247.method1774(80, 4);
        if (this.field5458 == null) {
            return class215.field3784;
        }
        var2.method1971(this.field5458[0], true);
        for (int var3 = 1; var3 < this.field5458.length; var3++) {
            var2.method1971(class67.field1330, true);
            var2.method1971(this.field5458[var3], true);
        }
        return arg0 <= 13 ? (class279) null : var2.method1992(-119);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(BLud;)I", line = 86)
    public static final int method2181(byte arg0, class279 arg1) {
        field5447++;
        if (arg0 != 91) {
            field5446 = 83;
        }
        for (int var2 = 0; var2 < class293.field5225.length; var2++) {
            if (class293.field5225[var2].method2010(arg1, (byte) 112)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lok;II)Lri;", line = 109)
    public static final class68 method2182(class149 arg0, int arg1, int arg2) {
        field5449++;
        byte[] var3 = arg0.method1160(arg2, 74);
        int var4 = -33 % ((-arg1 - 44) / 60);
        return var3 == null ? null : new class68(var3);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)I", line = 131)
    public final int method2183(int arg0, int arg1) {
        if (arg1 <= 41) {
            return -124;
        } else {
            field5452++;
            return this.field5455 == null || arg0 < 0 || this.field5455.length < arg0 ? -1 : this.field5455[arg0];
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([ILvh;I)V", line = 149)
    public final void method2184(int[] arg0, class53 arg1, int arg2) {
        field5442++;
        if (this.field5455 == null) {
            return;
        }
        if (arg2 != -24557) {
            this.method2187(-68, -65, (class53) null);
        }
        for (int var4 = 0; this.field5455.length > var4 && var4 < arg0.length; var4++) {
            int var5 = class205.field3638[this.method2183(var4, arg2 ^ 0xFFFFA077)];
            if (var5 > 0) {
                arg1.method463(var5, (long) arg0[var4], 127);
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V", line = 177)
    public static void method2185(int arg0) {
        field5456 = null;
        field5451 = null;
        if (arg0 == 0) {
            field5466 = null;
            field5460 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILvh;)Lud;", line = 191)
    public final class279 method2186(int arg0, class53 arg1) {
        class279 var3 = class247.method1774(80, 4);
        if (this.field5455 != null) {
            for (int var4 = 0; var4 < this.field5455.length; var4++) {
                var3.method1971(this.field5458[var4], true);
                var3.method1971(class205.method1522(this.field5455[var4], arg1.method452(0, class124.field2241[this.field5455[var4]]), this.field5465[var4], true), true);
            }
        }
        field5463++;
        int var5 = -79 / ((82 - arg0) / 35);
        var3.method1971(this.field5458[this.field5458.length - 1], true);
        return var3.method1992(-123);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILvh;)V", line = 233)
    private final void method2187(int arg0, int arg1, class53 arg2) {
        if (arg0 != 60) {
            return;
        }
        field5453++;
        if (arg1 == 1) {
            this.field5458 = arg2.method467((byte) -16).method1978(60, 0);
        } else if (arg1 == 2) {
            int var4 = arg2.method483(-104);
            this.field5467 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5467[var5] = arg2.method468(28214);
            }
        } else if (arg1 == 3) {
            int var6 = arg2.method483(-101);
            this.field5455 = new int[var6];
            this.field5465 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method468(28214);
                this.field5455[var7] = var8;
                this.field5465[var7] = new int[class138.field2482[var8]];
                for (int var9 = 0; var9 < class138.field2482[var8]; var9++) {
                    this.field5465[var7][var9] = arg2.method468(arg0 + 28154);
                }
            }
        } else if (arg1 == 4) {
            this.field5457 = false;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lbd;B)V", line = 300)
    public static final void method2188(class305 arg0, byte arg1) {
        field5464++;
        class253.field4519 = 3;
        class70.method616((byte) 88, true);
        class162.field2929 = true;
        class239.field4218 = 0;
        class3.field105 = 127;
        class198.field3536 = true;
        class29.field685 = true;
        class113.field2073 = 255;
        class232.field4062 = 0;
        class220.field3883 = true;
        class126.field2340 = true;
        class68.field1335 = true;
        class86.field1614 = true;
        class171.field3086 = 2;
        class221.field3901 = true;
        class141.field2566 = 0;
        class80.field1525 = true;
        class202.field3608 = true;
        class289.field5158 = true;
        class303 var2 = null;
        class41.field875 = 127;
        class236.field4121 = 0;
        if (class274.field4867 < 96) {
            class208.method1530(0);
        } else {
            class208.method1530(2);
        }
        if (arg1 <= 19) {
            return;
        }
        class292.field5204 = false;
        class283.field5062 = 0;
        class39.field853 = false;
        class293.field5224 = 0;
        class50.field1029 = 0;
        class177.field3185 = false;
        field5448 = true;
        try {
            class206 var3 = arg0.method2166("runescape", (byte) 46);
            while (var3.field3655 == 0) {
                class204.method1510(1L, 1);
            }
            if (var3.field3655 == 1) {
                var2 = (class303) var3.field3657;
                int var4 = 0;
                byte[] var5 = new byte[(int) var2.method2147((byte) 109)];
                while (var5.length > var4) {
                    int var6 = var2.method2144(var5.length - var4, var5, var4, (byte) -114);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                    var4 += var6;
                }
                class231.method1674(new class53(var5), (byte) -100);
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method2149(true);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIIIIII)V", line = 383)
    public static final void method2189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == arg4 && arg2 == arg8 && arg1 == arg7 && arg6 == arg9) {
            class312.method2215(arg9, arg1, arg3, arg0, 107, arg2);
        } else {
            int var10 = arg0;
            int var11 = arg0 * 3;
            int var12 = arg2;
            int var13 = arg2 * 3;
            int var14 = arg4 * 3;
            int var15 = arg6 * 3;
            int var16 = arg8 * 3;
            int var17 = arg7 * 3;
            int var18 = arg1 + var14 - var17 - arg0;
            int var19 = arg9 + var16 - var15 - arg2;
            int var20 = var17 + var11 - var14 - var14;
            int var21 = var15 - var16 - (var16 - var13);
            int var22 = var14 - var11;
            int var23 = var16 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var29 + var31 + var27 >> 12) + arg0;
                int var34 = arg2 + (var28 + var32 + var30 >> 12);
                class312.method2215(var34, var33, arg3, var10, arg5 ^ 0x5D, var12);
                var12 = var34;
                var10 = var33;
            }
        }
        field5462++;
        if (arg5 != 3) {
            field5448 = true;
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V", line = 469)
    public final void method2190(int arg0) {
        if (this.field5467 != null) {
            for (int var2 = 0; var2 < this.field5467.length; var2++) {
                this.field5467[var2] = class301.method2139(this.field5467[var2], 32768);
            }
        }
        field5459++;
        if (arg0 != 32768) {
            method2188((class305) null, (byte) -83);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lvh;I)V", line = 493)
    public final void method2191(class53 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field5445++;
        while (true) {
            int var3 = arg0.method483(-128);
            if (var3 == 0) {
                return;
            }
            this.method2187(60, var3, arg0);
        }
    }
}
