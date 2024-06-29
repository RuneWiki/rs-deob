import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class5 {

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "Lfh;")
    private class172 field83;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "Loi;")
    private class282 field72;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "Lhf;")
    private class174 field64;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field65 = 0;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "Llc;")
    private static class143 field75 = class66.method374("Select", -1);

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "Llc;")
    public static class143 field68 = field75;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "Lng;")
    public static class139 field74 = new class139(4);

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "Llc;")
    public static class143 field82 = class66.method374("hitmarks", -1);

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "Llc;")
    public static class143 field81 = class66.method374("(Y", -1);

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "F")
    public static float field80;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "Lh;")
    private class190 field71;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "[Ldh;")
    private class146[] field77;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    public final void method19(int arg0) {
        field78++;
        if (this.field77 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field77.length; var2++) {
            if (this.field77[var2] != null) {
                this.field77[var2].method943((byte) -128);
            }
        }
        if (arg0 != -30735) {
            field79 = 55;
        }
        for (int var3 = 0; var3 < this.field77.length; var3++) {
            if (this.field77[var3] != null) {
                this.field77[var3].method929(92);
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
    public static void method20(int arg0) {
        field81 = null;
        if (arg0 != 0) {
            method25(58, -74);
        }
        field68 = null;
        field75 = null;
        field74 = null;
        field82 = null;
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)Z")
    public final boolean method21(int arg0) {
        field66++;
        if (this.field71 != null) {
            return true;
        }
        if (this.field64 == null) {
            if (this.field72.method1854(20)) {
                return false;
            }
            this.field64 = this.field72.method1863(255, 255, true, -10618, (byte) 0);
        }
        if (this.field64.field1054) {
            return false;
        } else {
            this.field71 = new class190(this.field64.method326(arg0 ^ arg0));
            this.field77 = new class146[(this.field71.field3465.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILi;)V")
    public static final void method22(int arg0, class187 arg1) {
        field76++;
        class124 var2 = (class124) class285.field5001.method1294(false);
        int var3 = -77 % ((43 - arg0) / 61);
        while (var2 != null) {
            if (var2.field2164 == arg1) {
                if (var2.field2171 != null) {
                    class86.field1578.method1000(var2.field2171);
                    var2.field2171 = null;
                }
                var2.method349(0);
                return;
            }
            var2 = (class124) class285.field5001.method1292((byte) 108);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZILka;Lka;I)Ldh;")
    private final class146 method23(boolean arg0, int arg1, class164 arg2, class164 arg3, int arg4) {
        field69++;
        if (this.field71 == null) {
            throw new RuntimeException();
        }
        this.field71.field3487 = arg4 * 8 + 5;
        if (this.field71.field3487 >= this.field71.field3465.length) {
            throw new RuntimeException();
        } else if (this.field77[arg4] == null) {
            if (arg1 != 11257) {
                method25(21, 94);
            }
            int var6 = this.field71.method1269(arg1 ^ 0x2BA3);
            int var7 = this.field71.method1269(87);
            class146 var8 = new class146(arg4, arg2, arg3, this.field72, this.field83, var6, var7, arg0);
            this.field77[arg4] = var8;
            return var8;
        } else {
            return this.field77[arg4];
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lka;Lka;II)Ldh;")
    public final class146 method24(class164 arg0, class164 arg1, int arg2, int arg3) {
        field67++;
        return arg3 == 32217 ? this.method23(true, 11257, arg0, arg1, arg2) : null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)Lrk;")
    public static final class153 method25(int arg0, int arg1) {
        field70++;
        class153 var2 = (class153) class224.field4065.method1168((long) arg1, (byte) 96);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class252.field4540.method41(-18328, 5, arg1);
        if (arg0 < 108) {
            field82 = null;
        }
        class153 var4 = new class153();
        if (var3 != null) {
            var4.method1013(true, new class190(var3));
        }
        class224.field4065.method1163(var4, (long) arg1, 0);
        return var4;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIIIILqk;IZJ)Z")
    public static final boolean method26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class51 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class83.field1503 == class192.field3535;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class36.field621 || var24 >= class56.field1091) {
                    return false;
                }
                class120 var25 = class7.field122[arg0][var15][var24];
                if (var25 != null && var25.field2134 >= 5) {
                    return false;
                }
            }
        }
        class211 var16 = new class211();
        var16.field3928 = arg11;
        var16.field3915 = arg0;
        var16.field3929 = arg5;
        var16.field3930 = arg6;
        var16.field3927 = arg7;
        var16.field3916 = arg8;
        var16.field3932 = arg9;
        var16.field3931 = arg1;
        var16.field3919 = arg2;
        var16.field3933 = arg1 + arg3 - 1;
        var16.field3918 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class7.field122[var22][var17][var20] == null) {
                        class7.field122[var22][var17][var20] = new class120(var22, var17, var20);
                    }
                }
                class120 var23 = class7.field122[arg0][var17][var20];
                var23.field2144[var23.field2134] = var16;
                var23.field2128[var23.field2134] = var21;
                var23.field2122 |= var21;
                var23.field2134++;
                if (var13 && class185.field3365[var17][var20] != 0) {
                    var14 = class185.field3365[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class185.field3365[var18][var19] == 0) {
                        class185.field3365[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class229.field4190[class182.field3248++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIZIIII)V")
    public static final void method27(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field73++;
        if (class66.field1233 == arg5 && class272.field4854 == arg3 && class225.field4075 == arg1 || class21.method149((byte) -57)) {
            return;
        }
        class225.field4075 = arg1;
        class66.field1233 = arg5;
        class272.field4854 = arg3;
        if (arg4 != -11) {
            field65 = 117;
        }
        if (class21.method149((byte) -57)) {
            class225.field4075 = 0;
        }
        if (arg2) {
            class43.method271(28, arg4 ^ 0x20);
        } else {
            class43.method271(25, -73);
        }
        class236.method1593(16777215, true, class243.field4365);
        int var7 = class148.field2733;
        class148.field2733 = (arg5 - 6) * 8;
        int var8 = class141.field2466;
        class141.field2466 = arg3 * 8 - 48;
        class47.field929 = class266.method1773(class272.field4854 * 8, (byte) -127, class66.field1233 * 8);
        int var9 = class141.field2466 - var8;
        int var10 = class148.field2733 - var7;
        int var11 = class141.field2466;
        int var12 = class148.field2733;
        class242.field4350 = null;
        if (arg2) {
            class212.field3945 = 0;
            for (int var13 = 0; var13 < 32768; var13++) {
                class187 var14 = class259.field4648[var13];
                if (var14 != null) {
                    var14.field4108 -= var9 * 128;
                    var14.field4178 -= var10 * 128;
                    if (var14.field4178 >= 0 && var14.field4178 <= 13184 && var14.field4108 >= 0 && var14.field4108 <= 13184) {
                        for (int var15 = 0; var15 < 10; var15++) {
                            var14.field4148[var15] -= var10;
                            var14.field4115[var15] -= var9;
                        }
                        class56.field1093[class212.field3945++] = var13;
                    } else {
                        class259.field4648[var13].field3384 = null;
                        class259.field4648[var13] = null;
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < 32768; var16++) {
                class187 var32 = class259.field4648[var16];
                if (var32 != null) {
                    for (int var33 = 0; var33 < 10; var33++) {
                        var32.field4148[var33] -= var10;
                        var32.field4115[var33] -= var9;
                    }
                    var32.field4108 -= var9 * 128;
                    var32.field4178 -= var10 * 128;
                }
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class32 var30 = class6.field97[var17];
            if (var30 != null) {
                for (int var31 = 0; var31 < 10; var31++) {
                    var30.field4148[var31] -= var10;
                    var30.field4115[var31] -= var9;
                }
                var30.field4178 -= var10 * 128;
                var30.field4108 -= var9 * 128;
            }
        }
        class170.field3044 = arg1;
        byte var18 = 104;
        byte var19 = 0;
        class229.field4195.method216(false, arg6, arg0, -119);
        byte var20 = 0;
        byte var21 = 1;
        if (var10 < 0) {
            var19 = 103;
            var18 = -1;
            var21 = -1;
        }
        byte var22 = 104;
        byte var23 = 1;
        if (var9 < 0) {
            var23 = -1;
            var20 = 103;
            var22 = -1;
        }
        for (int var24 = var19; var24 != var18; var24 += var21) {
            for (int var26 = var20; var26 != var22; var26 += var23) {
                int var27 = var26 + var9;
                int var28 = var24 + var10;
                for (int var29 = 0; var29 < 4; var29++) {
                    if (var28 >= 0 && var27 >= 0 && var28 < 104 && var27 < 104) {
                        class130.field2306[var29][var24][var26] = class130.field2306[var29][var28][var27];
                    } else {
                        class130.field2306[var29][var24][var26] = null;
                    }
                }
            }
        }
        for (class249 var25 = (class249) class57.field1107.method1294(false); var25 != null; var25 = (class249) class57.field1107.method1292((byte) 66)) {
            var25.field4502 -= var10;
            var25.field4494 -= var9;
            if (var25.field4502 < 0 || var25.field4494 < 0 || var25.field4502 >= 104 || var25.field4494 >= 104) {
                var25.method349(0);
            }
        }
        class187.field3388 = 0;
        if (class177.field3170 != 0) {
            class177.field3170 -= var10;
            class123.field2154 -= var9;
        }
        class192.field3539 = -1;
        if (arg2) {
            class245.field4389 -= var9;
            class154.field2776 -= var9 * 128;
            class155.field2793 -= var10;
            class167.field2992 -= var10 * 128;
            class206.field3751 -= var10;
            class218.field3985 -= var9;
        } else {
            class21.field349 = 1;
        }
        class59.field1139.method1293(false);
        class140.field2446.method1293(false);
        class125.method759();
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Loi;Lfh;)V")
    public class5(class282 arg0, class172 arg1) {
        this.field83 = arg1;
        this.field72 = arg0;
        if (!this.field72.method1854(20)) {
            this.field64 = this.field72.method1863(255, 255, true, -10618, (byte) 0);
        }
    }
}
