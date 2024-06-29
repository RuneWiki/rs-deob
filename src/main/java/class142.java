import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class142 extends class171 {

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "I")
    public int field1975;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
    public int field1976;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "[[I")
    public int[][] field1974;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "[I")
    public int[] field1970;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "[Z")
    public boolean[] field1967;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "[I")
    public int[] field1964;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "Lhc;")
    public static class235 field1971;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILhc;)V")
    public static final void method950(int arg0, class235 arg1) {
        int var2 = -21 % ((arg0 - 15) / 61);
        field1968++;
        class17.field181 = arg1;
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)V")
    public static void method951(int arg0) {
        if (arg0 <= -22) {
            field1971 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)V")
    public static final void method952(byte arg0) {
        if (arg0 == 117) {
            class101.field1406.method546(-90762264);
            field1966++;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIB)V")
    public static final void method953(int arg0, int arg1, byte arg2) {
        if (arg2 != 89) {
            field1969 = -76;
        }
        field1965++;
        class119.field1677[arg1] = arg0;
        class248 var3 = (class248) class230.field3487.method23(216, (long) arg1);
        if (var3 == null) {
            class248 var4 = new class248(4611686018427387905L);
            class230.field3487.method20(var4, (long) arg1, 0);
        } else if (var3.field3801 != 4611686018427387905L) {
            var3.field3801 = class223.method1433((byte) -81) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIZZ)V")
    public static final void method954(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field1973++;
        if (!arg6 && class101.field1422 == arg0 && class178.field2495 == arg5 && class281.field4361 == arg4 || class34.method231(arg2 ^ 0x5C4)) {
            return;
        }
        class101.field1422 = arg0;
        class281.field4361 = arg4;
        class178.field2495 = arg5;
        if (class34.method231(120)) {
            class281.field4361 = 0;
        }
        if (arg7) {
            class145.method977(102, 28);
        } else {
            class145.method977(123, 25);
        }
        class22.method165(true, class13.field128, 1);
        int var8 = class37.field565;
        class37.field565 = (arg0 - 6) * 8;
        int var9 = class216.field3255;
        class216.field3255 = arg5 * 8 - 48;
        class20.field285 = class150.method1009(class101.field1422 * 8, class178.field2495 * 8, arg2 - 1290442540);
        class292.field4588 = null;
        int var10 = class216.field3255 - var9;
        int var11 = class37.field565 - var8;
        int var12 = class37.field565;
        int var13 = class216.field3255;
        if (arg7) {
            class92.field1283 = 0;
            for (int var17 = 0; var17 < 32768; var17++) {
                class140 var33 = class119.field1679[var17];
                if (var33 != null) {
                    var33.field4085 -= var10 * 128;
                    var33.field4019 -= var11 * 128;
                    if (var33.field4019 >= 0 && var33.field4019 <= 13184 && var33.field4085 >= 0 && var33.field4085 <= 13184) {
                        for (int var34 = 0; var34 < 10; var34++) {
                            var33.field4076[var34] -= var11;
                            var33.field4032[var34] -= var10;
                        }
                        class194.field2688[class92.field1283++] = var17;
                    } else {
                        class119.field1679[var17].method946((class284) null, -1);
                        class119.field1679[var17] = null;
                    }
                }
            }
        } else {
            for (int var14 = 0; var14 < 32768; var14++) {
                class140 var15 = class119.field1679[var14];
                if (var15 != null) {
                    for (int var16 = 0; var16 < 10; var16++) {
                        var15.field4076[var16] -= var11;
                        var15.field4032[var16] -= var10;
                    }
                    var15.field4085 -= var10 * 128;
                    var15.field4019 -= var11 * 128;
                }
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class88 var31 = class154.field2133[var18];
            if (var31 != null) {
                for (int var32 = 0; var32 < 10; var32++) {
                    var31.field4076[var32] -= var11;
                    var31.field4032[var32] -= var10;
                }
                var31.field4019 -= var11 * 128;
                var31.field4085 -= var10 * 128;
            }
        }
        byte var19 = 104;
        byte var20 = 0;
        class295.field4642 = arg4;
        if (arg2 != 1464) {
            return;
        }
        byte var21 = 1;
        if (var11 < 0) {
            var19 = -1;
            var21 = -1;
            var20 = 103;
        }
        byte var22 = 104;
        class217.field3280.method564(arg1, arg3, (byte) 61, false);
        byte var23 = 1;
        byte var24 = 0;
        if (var10 < 0) {
            var24 = 103;
            var22 = -1;
            var23 = -1;
        }
        for (int var25 = var20; var25 != var19; var25 += var21) {
            for (int var27 = var24; var27 != var22; var27 += var23) {
                int var28 = var11 + var25;
                int var29 = var27 + var10;
                for (int var30 = 0; var30 < 4; var30++) {
                    if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                        class297.field4690[var30][var25][var27] = class297.field4690[var30][var28][var29];
                    } else {
                        class297.field4690[var30][var25][var27] = null;
                    }
                }
            }
        }
        for (class215 var26 = (class215) class41.field607.method990(arg2 - 1543); var26 != null; var26 = (class215) class41.field607.method993(-97)) {
            var26.field3230 -= var11;
            var26.field3232 -= var10;
            if (var26.field3230 < 0 || var26.field3232 < 0 || var26.field3230 >= 104 || var26.field3232 >= 104) {
                var26.method1115(arg2 ^ 0xFFFFFA30);
            }
        }
        if (class234.field3535 != 0) {
            class234.field3535 -= var11;
            class199.field2768 -= var10;
        }
        class84.field1151 = 0;
        if (arg7) {
            class116.field1662 -= var10;
            class89.field1252 -= var10 * 128;
            class290.field4577 -= var11;
            class188.field2600 -= var10;
            class41.field618 -= var11 * 128;
            class178.field2501 -= var11;
        } else {
            class51.field734 = 1;
        }
        class155.field2161 = -1;
        class256.field3914.method989((byte) 51);
        class168.field2318.method989((byte) -91);
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(I[B)V")
    public class142(int arg0, byte[] arg1) {
        this.field1975 = arg0;
        class224 var3 = new class224(arg1);
        this.field1976 = var3.method1453((byte) -127);
        this.field1974 = new int[this.field1976][];
        this.field1970 = new int[this.field1976];
        this.field1967 = new boolean[this.field1976];
        this.field1964 = new int[this.field1976];
        for (int var4 = 0; var4 < this.field1976; var4++) {
            this.field1970[var4] = var3.method1453((byte) -127);
        }
        for (int var5 = 0; var5 < this.field1976; var5++) {
            this.field1967[var5] = var3.method1453((byte) -128) == 1;
        }
        for (int var6 = 0; var6 < this.field1976; var6++) {
            this.field1964[var6] = var3.method1445(false);
        }
        for (int var7 = 0; var7 < this.field1976; var7++) {
            this.field1974[var7] = new int[var3.method1453((byte) -127)];
        }
        for (int var8 = 0; var8 < this.field1976; var8++) {
            for (int var9 = 0; var9 < this.field1974[var8].length; var9++) {
                this.field1974[var8][var9] = var3.method1453((byte) -128);
            }
        }
    }
}
