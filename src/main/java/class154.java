import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class154 {

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
    private int field2991 = 0;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    private int field2974;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "[Lg;")
    private class67[] field2973;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "Li;")
    private static class88 field2976 = class208.method1425(105, "Loaded fonts");

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "Li;")
    public static class88 field2975 = class208.method1425(105, "huffman");

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field2971 = 0;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "Li;")
    private static class88 field2978 = class208.method1425(105, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "Li;")
    public static class88 field2972 = class208.method1425(105, "Lade)3)3)3");

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "Li;")
    public static class88 field2990 = field2978;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Li;")
    public static class88 field2966 = class208.method1425(105, "Benutzername: ");

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "Li;")
    public static class88 field2988 = field2976;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "Li;")
    public static class88 field2970 = field2978;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "Z")
    public static boolean field2982 = true;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "J")
    private long field2987;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "Ldg;")
    public static class41 field2968;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "Lg;")
    private class67 field2983;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "Lg;")
    private class67 field2992;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2977;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "[Lrc;")
    public static class188[] field2984;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "[[[I")
    public static int[][][] field2981;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Lg;")
    public final class67 method1049(int arg0) {
        this.field2991 = arg0;
        field2967++;
        return this.method1050((byte) -73);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)Lg;")
    public final class67 method1050(byte arg0) {
        field2989++;
        if (arg0 != -73) {
            method1055(70);
        }
        if (this.field2991 > 0 && this.field2973[this.field2991 - 1] != this.field2992) {
            class67 var2 = this.field2992;
            this.field2992 = var2.field1220;
            return var2;
        }
        while (this.field2974 > this.field2991) {
            class67 var3 = this.field2973[this.field2991++].field1220;
            if (this.field2973[this.field2991 - 1] != var3) {
                this.field2992 = var3.field1220;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IJ)Lg;")
    public final class67 method1051(int arg0, long arg1) {
        this.field2987 = arg1;
        field2985++;
        class67 var4 = this.field2973[(int) (arg1 & (long) (this.field2974 + arg0))];
        for (this.field2983 = var4.field1220; this.field2983 != var4; this.field2983 = this.field2983.field1220) {
            if (this.field2983.field1219 == arg1) {
                class67 var5 = this.field2983;
                this.field2983 = this.field2983.field1220;
                return var5;
            }
        }
        this.field2983 = null;
        return null;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V")
    public static final void method1052(byte arg0) {
        if (arg0 >= -113) {
            method1052((byte) 87);
        }
        class141.field2608.method134(50);
        field2969++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method1053(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = arg6;
        field2979++;
        int var10 = 0;
        int var11 = arg2 - arg4;
        int var12 = arg6 - arg4;
        int var13 = arg2 * arg2;
        int var14 = arg6 * arg6;
        int var15 = var12 * var12;
        int var16 = 92 / ((22 - arg5) / 48);
        int var17 = var14 << 1;
        int var18 = var11 * var11;
        int var19 = var13 << 1;
        int var20 = var18 << 1;
        int var21 = var15 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var22) * var18 + var21;
        int var24 = arg6 << 1;
        int var25 = var14 - (var24 - 1) * var19;
        int var26 = (1 - var24) * var13 + var17;
        int var27 = var15 - (var22 - 1) * var20;
        int var28 = var14 << 2;
        int var29 = var13 << 2;
        int var30 = var17 * 3;
        int var31 = var15 << 2;
        int var32 = var18 << 2;
        int var33 = var21 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (var24 - 3) * var19;
        int var37 = var31;
        if (class49.field919 <= arg0 && class18.field279 >= arg0) {
            int[] var38 = class3.field42[arg0];
            int var39 = class156.method1060(class67.field1207, class12.field183, -113, arg7 - arg2);
            int var40 = class156.method1060(class67.field1207, class12.field183, -119, arg7 + arg2);
            int var41 = class156.method1060(class67.field1207, class12.field183, -112, arg7 - var11);
            int var42 = class156.method1060(class67.field1207, class12.field183, -114, arg7 + var11);
            class230.method1536(var39, arg1, -7, var41, var38);
            class230.method1536(var41, arg3, -7, var42, var38);
            class230.method1536(var42, arg1, -7, var40, var38);
        }
        int var43 = (var12 - 1) * var32;
        int var44 = (arg6 - 1) * var29;
        while (var9 > 0) {
            if (var26 < 0) {
                while (var26 < 0) {
                    var26 += var30;
                    var30 += var28;
                    var8++;
                    var25 += var35;
                    var35 += var28;
                }
            }
            boolean var45 = var12 >= var9;
            var9--;
            int var46 = arg0 + var9;
            int var47 = arg0 - var9;
            if (var45) {
                if (var23 < 0) {
                    while (var23 < 0) {
                        var27 += var37;
                        var23 += var33;
                        var33 += var31;
                        var10++;
                        var37 += var31;
                    }
                }
                if (var27 < 0) {
                    var27 += var37;
                    var10++;
                    var23 += var33;
                    var33 += var31;
                    var37 += var31;
                }
                var27 += -var34;
                var23 += -var43;
                var34 -= var32;
                var43 -= var32;
            }
            if (var25 < 0) {
                var25 += var35;
                var35 += var28;
                var26 += var30;
                var30 += var28;
                var8++;
            }
            var25 += -var36;
            var26 += -var44;
            var44 -= var29;
            var36 -= var29;
            if (var46 >= class49.field919 && class18.field279 >= var47) {
                int var48 = class156.method1060(class67.field1207, class12.field183, -114, arg7 + var8);
                int var49 = class156.method1060(class67.field1207, class12.field183, -105, arg7 - var8);
                if (var45) {
                    int var50 = class156.method1060(class67.field1207, class12.field183, -115, arg7 + var10);
                    int var51 = class156.method1060(class67.field1207, class12.field183, -109, arg7 - var10);
                    if (var47 >= class49.field919) {
                        int[] var52 = class3.field42[var47];
                        class230.method1536(var49, arg1, -7, var51, var52);
                        class230.method1536(var51, arg3, -7, var50, var52);
                        class230.method1536(var50, arg1, -7, var48, var52);
                    }
                    if (class18.field279 >= var46) {
                        int[] var53 = class3.field42[var46];
                        class230.method1536(var49, arg1, -7, var51, var53);
                        class230.method1536(var51, arg3, -7, var50, var53);
                        class230.method1536(var50, arg1, -7, var48, var53);
                    }
                } else {
                    if (var47 >= class49.field919) {
                        class230.method1536(var49, arg1, -7, var48, class3.field42[var47]);
                    }
                    if (class18.field279 >= var46) {
                        class230.method1536(var49, arg1, -7, var48, class3.field42[var46]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(JLg;I)V")
    public final void method1054(long arg0, class67 arg1, int arg2) {
        if (arg1.field1212 != null) {
            arg1.method460(true);
        }
        field2986++;
        class67 var5 = this.field2973[(int) (arg0 & (long) (this.field2974 + arg2))];
        arg1.field1219 = arg0;
        arg1.field1212 = var5.field1212;
        arg1.field1220 = var5;
        arg1.field1212.field1220 = arg1;
        arg1.field1220.field1212 = arg1;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
    public static void method1055(int arg0) {
        field2988 = null;
        field2981 = null;
        field2968 = null;
        field2984 = null;
        field2978 = null;
        field2976 = null;
        field2990 = null;
        if (arg0 != -1) {
            return;
        }
        field2970 = null;
        field2977 = null;
        field2972 = null;
        field2966 = null;
        field2975 = null;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)Lg;")
    public final class67 method1056(int arg0) {
        field2980++;
        if (this.field2983 == null) {
            return null;
        }
        class67 var2 = this.field2973[(int) (this.field2987 & (long) (this.field2974 - 1))];
        if (arg0 != 3) {
            this.method1050((byte) 76);
        }
        while (this.field2983 != var2) {
            if (this.field2983.field1219 == this.field2987) {
                class67 var3 = this.field2983;
                this.field2983 = this.field2983.field1220;
                return var3;
            }
            this.field2983 = this.field2983.field1220;
        }
        this.field2983 = null;
        return null;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V")
    public class154(int arg0) {
        this.field2974 = arg0;
        this.field2973 = new class67[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class67 var3 = this.field2973[var2] = new class67();
            var3.field1212 = var3;
            var3.field1220 = var3;
        }
    }
}
