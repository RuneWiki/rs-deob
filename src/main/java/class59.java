import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class59 {

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "Lok;")
    public static class41 field842 = class137.method956("Lade Wordpack )2 ", 45);

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "[I")
    public static int[] field845 = new int[1000];

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "Lok;")
    public static class41 field853 = class137.method956("3D)2Softwarebibliothek gestartet)3", 45);

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "Lok;")
    public static class41 field857 = class137.method956(" steht bereits auf Ihrer Ignorieren)2Liste(Q", 45);

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "Lok;")
    public static class41 field855 = class137.method956("welle2:", 45);

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "Lok;")
    public static class41 field849 = class137.method956(")4a=", 45);

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "J")
    public long field844;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Llh;")
    public class59 field841;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "Llh;")
    public class59 field856;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "[I")
    public static int[] field843;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "[I")
    public static int[] field859;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIIIIBI)V", line = 5)
    public static final void method413(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        if (arg1 == arg3 && arg0 == arg2 && arg6 == arg9 && arg4 == arg7) {
            class5.method16(arg5, arg6, arg7, 94, arg0, arg3);
        } else {
            int var10 = arg3;
            int var11 = arg0;
            int var12 = arg3 * 3;
            int var13 = arg0 * 3;
            int var14 = arg1 * 3;
            int var15 = arg9 * 3;
            int var16 = arg2 * 3;
            int var17 = arg4 * 3;
            int var18 = arg6 + var14 - var15 - arg3;
            int var19 = arg7 - var17 - (arg0 - var16);
            int var20 = var12 + var15 - var14 - var14;
            int var21 = var13 + var17 - var16 - var16;
            int var22 = var14 - var12;
            int var23 = var16 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var20 * var25;
                int var29 = var19 * var26;
                int var30 = var22 * var24;
                int var31 = var23 * var24;
                int var32 = var21 * var25;
                int var33 = (var29 + var32 + var31 >> 12) + arg0;
                int var34 = (var28 + var30 + var27 >> 12) + arg3;
                class5.method16(arg5, var34, var33, 112, var11, var10);
                var10 = var34;
                var11 = var33;
            }
        }
        field852++;
        if (arg8 >= -46) {
            method422(73, -19, 73, 124, -85, -48, -125);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)Z", line = 80)
    public final boolean method414(int arg0) {
        if (arg0 != 2) {
            method420((byte) -26);
        }
        field839++;
        return this.field856 != null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Llb;I)Lri;", line = 95)
    public static final class286 method415(class112 arg0, int arg1) {
        if (arg1 >= -85) {
            method416((byte) -62);
        }
        field848++;
        return new class286(arg0.method771(-67), arg0.method771(-87), arg0.method771(-101), arg0.method771(-60), arg0.method757(11997), arg0.method757(11997), arg0.method792(2));
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V", line = 111)
    public static final void method416(byte arg0) {
        class164.field2597.method839(11892);
        int var1 = class164.field2597.method849(1, 38);
        field847++;
        if (var1 == 0) {
            return;
        }
        int var2 = class164.field2597.method849(2, 38);
        if (var2 == 0) {
            class241.field3853[class85.field1239++] = 2047;
        } else if (var2 == 1) {
            int var3 = class164.field2597.method849(3, 38);
            class62.field913.method1903(false, var3, 28);
            int var4 = class164.field2597.method849(1, 38);
            if (var4 == 1) {
                class241.field3853[class85.field1239++] = 2047;
            }
        } else {
            if (arg0 >= -48) {
                method413(-88, 126, -43, 107, -26, 35, -9, -101, (byte) -103, -47);
            }
            if (var2 == 2) {
                int var9 = class164.field2597.method849(3, 38);
                class62.field913.method1903(true, var9, -107);
                int var10 = class164.field2597.method849(3, 38);
                class62.field913.method1903(true, var10, 55);
                int var11 = class164.field2597.method849(1, 38);
                if (var11 == 1) {
                    class241.field3853[class85.field1239++] = 2047;
                }
            } else if (var2 == 3) {
                class55.field807 = class164.field2597.method849(2, 38);
                int var5 = class164.field2597.method849(1, 38);
                if (var5 == 1) {
                    class241.field3853[class85.field1239++] = 2047;
                }
                int var6 = class164.field2597.method849(7, 38);
                int var7 = class164.field2597.method849(7, 38);
                int var8 = class164.field2597.method849(1, 38);
                class62.field913.method1756(var6, var7, var8 == 1, -1);
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)I", line = 189)
    public static final int method417(int arg0) {
        if (arg0 == 6) {
            field851++;
            return 6;
        } else {
            return -50;
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V", line = 201)
    public final void method418(int arg0) {
        field846++;
        if (this.field856 == null) {
            return;
        }
        this.field856.field841 = this.field841;
        this.field841.field856 = this.field856;
        this.field841 = null;
        this.field856 = null;
        if (arg0 != 6971) {
            field842 = (class41) null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([FB)[F", line = 220)
    public static final float[] method419(float[] arg0, byte arg1) {
        field858++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != -84) {
            field855 = (class41) null;
        }
        float[] var2 = new float[arg0.length];
        class21.method147(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V", line = 253)
    public static void method420(byte arg0) {
        field855 = null;
        field857 = null;
        field845 = null;
        field842 = null;
        if (arg0 >= -33) {
            field855 = (class41) null;
        }
        field853 = null;
        field849 = null;
        field859 = null;
        field843 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZ)V", line = 277)
    public static final void method421(int arg0, boolean arg1) {
        field840++;
        byte[][] var2;
        byte var3;
        if (class166.field2625 && arg1) {
            var2 = class62.field902;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class14.field187;
        }
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = (class110.field1557[var5] >> 8) * 64 - class88.field1300;
            int var7 = (class110.field1557[var5] & 0xFF) * 64 - class55.field809;
            byte[] var8 = var2[var5];
            if (var8 != null) {
                class234.method1685(arg0 ^ 0xFFFFAED3);
                class193.method1387(var7, (class235.field3766 - 6) * 8, class222.field3548, var8, (class133.field1990 - 6) * 8, arg0 ^ 0x3E, var6, arg1);
            }
        }
        if (arg0 != 2) {
            field855 = (class41) null;
        }
        for (int var9 = 0; var9 < var4; var9++) {
            int var10 = (class110.field1557[var9] >> 8) * 64 - class88.field1300;
            int var11 = (class110.field1557[var9] & 0xFF) * 64 - class55.field809;
            byte[] var12 = var2[var9];
            if (var12 == null && class235.field3766 < 800) {
                class234.method1685(-20783);
                for (int var13 = 0; var13 < var3; var13++) {
                    class133.method935(var11, 64, 64, var10, var13, (byte) 79);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIII)V", line = 349)
    public static final void method422(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field854++;
        int var7 = -7 % ((38 - arg6) / 57);
        class212.method1496(-125, arg3);
        int var8 = arg3 - arg1;
        int var9 = arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var10 = 0;
        int var11 = -arg3;
        int var12 = -var8;
        int var13 = var8;
        if (class15.field192 <= arg5 && class237.field3801 >= arg5) {
            int[] var14 = class239.field3829[arg5];
            int var15 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg2 - arg3);
            int var16 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg2 + arg3);
            int var17 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg2 - var8);
            int var18 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg2 + var8);
            class269.method1908(19, var14, arg4, var17, var15);
            class269.method1908(19, var14, arg0, var18, var17);
            class269.method1908(19, var14, arg4, var16, var18);
        }
        int var19 = -1;
        int var20 = -1;
        while (var10 < var9) {
            var20 += 2;
            var19 += 2;
            var11 += var20;
            var12 += var19;
            if (var12 >= 0 && var13 >= 1) {
                var13--;
                class207.field3354[var13] = var10;
                var12 -= var13 << 1;
            }
            var10++;
            if (var11 >= 0) {
                var9--;
                int var21 = arg5 + var9;
                var11 -= var9 << 1;
                int var22 = arg5 - var9;
                if (var21 >= class15.field192 && var22 <= class237.field3801) {
                    if (var9 >= var8) {
                        int var23 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg2 + var10);
                        int var24 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg2 - var10);
                        if (var21 <= class237.field3801) {
                            class269.method1908(19, class239.field3829[var21], arg4, var23, var24);
                        }
                        if (var22 >= class15.field192) {
                            class269.method1908(19, class239.field3829[var22], arg4, var23, var24);
                        }
                    } else {
                        int var25 = class207.field3354[var9];
                        int var26 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg2 + var10);
                        int var27 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg2 - var10);
                        int var28 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg2 + var25);
                        int var29 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg2 - var25);
                        if (var21 <= class237.field3801) {
                            int[] var30 = class239.field3829[var21];
                            class269.method1908(19, var30, arg4, var29, var27);
                            class269.method1908(19, var30, arg0, var28, var29);
                            class269.method1908(19, var30, arg4, var26, var28);
                        }
                        if (var22 >= class15.field192) {
                            int[] var31 = class239.field3829[var22];
                            class269.method1908(19, var31, arg4, var29, var27);
                            class269.method1908(19, var31, arg0, var28, var29);
                            class269.method1908(19, var31, arg4, var26, var28);
                        }
                    }
                }
            }
            int var32 = arg5 - var10;
            int var33 = arg5 + var10;
            if (var33 >= class15.field192 && var32 <= class237.field3801) {
                int var34 = arg2 + var9;
                int var35 = arg2 - var9;
                if (class273.field4449 <= var34 && class153.field2439 >= var35) {
                    int var36 = class109.method733(class273.field4449, class153.field2439, (byte) 16, var34);
                    int var37 = class109.method733(class273.field4449, class153.field2439, (byte) 16, var35);
                    if (var10 < var8) {
                        int var38 = var13 < var10 ? class207.field3354[var10] : var13;
                        int var39 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg2 + var38);
                        int var40 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg2 - var38);
                        if (var33 <= class237.field3801) {
                            int[] var41 = class239.field3829[var33];
                            class269.method1908(19, var41, arg4, var40, var37);
                            class269.method1908(19, var41, arg0, var39, var40);
                            class269.method1908(19, var41, arg4, var36, var39);
                        }
                        if (class15.field192 <= var32) {
                            int[] var42 = class239.field3829[var32];
                            class269.method1908(19, var42, arg4, var40, var37);
                            class269.method1908(19, var42, arg0, var39, var40);
                            class269.method1908(19, var42, arg4, var36, var39);
                        }
                    } else {
                        if (class237.field3801 >= var33) {
                            class269.method1908(19, class239.field3829[var33], arg4, var36, var37);
                        }
                        if (class15.field192 <= var32) {
                            class269.method1908(19, class239.field3829[var32], arg4, var36, var37);
                        }
                    }
                }
            }
        }
    }
}
