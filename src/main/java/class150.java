import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class150 extends class202 {

    @OriginalMember(owner = "client!af", name = "N", descriptor = "I")
    public int field2759 = 0;

    @OriginalMember(owner = "client!af", name = "S", descriptor = "I")
    public int field2764 = 0;

    @OriginalMember(owner = "client!af", name = "T", descriptor = "I")
    public int field2765 = -1;

    @OriginalMember(owner = "client!af", name = "Z", descriptor = "I")
    public int field2771 = 12800;

    @OriginalMember(owner = "client!af", name = "V", descriptor = "I")
    public int field2767 = 12800;

    @OriginalMember(owner = "client!af", name = "cb", descriptor = "Z")
    public boolean field2774 = true;

    @OriginalMember(owner = "client!af", name = "U", descriptor = "I")
    public int field2766;

    @OriginalMember(owner = "client!af", name = "W", descriptor = "Lsb;")
    public class98 field2768;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "Lsb;")
    public class98 field2763;

    @OriginalMember(owner = "client!af", name = "Y", descriptor = "I")
    public int field2770;

    @OriginalMember(owner = "client!af", name = "eb", descriptor = "Lvf;")
    public class48 field2776;

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "[I")
    public static int[] field2762 = new int[100];

    @OriginalMember(owner = "client!af", name = "X", descriptor = "[Lsb;")
    public static class98[] field2769 = new class98[200];

    @OriginalMember(owner = "client!af", name = "O", descriptor = "Llb;")
    public static class190 field2760 = new class190(64);

    @OriginalMember(owner = "client!af", name = "P", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!af", name = "ab", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!af", name = "bb", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!af", name = "db", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIILda;I)V")
    public static final void method1106(int arg0, int arg1, int arg2, class21 arg3, int arg4) {
        field2761++;
        int var5 = 71 / ((-arg2 - 39) / 34);
        for (class60 var6 = (class60) class82.field1448.method371((byte) 61); var6 != null; var6 = (class60) class82.field1448.method370(true)) {
            if (var6.field988 == arg1 && arg4 * 128 == var6.field994 && arg0 * 128 == var6.field1003 && var6.field993.field404 == arg3.field404) {
                if (var6.field997 != null) {
                    class36.field606.method1213(var6.field997);
                    var6.field997 = null;
                }
                if (var6.field984 != null) {
                    class36.field606.method1213(var6.field984);
                    var6.field984 = null;
                }
                var6.method1611((byte) -126);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public final void method1107(int arg0) {
        this.field2771 = 12800;
        field2773++;
        this.field2759 = 0;
        this.field2764 = 0;
        this.field2767 = arg0;
        for (class109 var2 = (class109) this.field2776.method371((byte) 61); var2 != null; var2 = (class109) this.field2776.method370(true)) {
            if (this.field2764 < var2.field1946) {
                this.field2764 = var2.field1946;
            }
            if (this.field2759 < var2.field1942) {
                this.field2759 = var2.field1942;
            }
            if (this.field2771 > var2.field1941) {
                this.field2771 = var2.field1941;
            }
            if (var2.field1945 < this.field2767) {
                this.field2767 = var2.field1945;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIII)V")
    public static final void method1108(int arg0, int arg1, int arg2, int arg3) {
        class215.field3670 = new class71[arg0][arg1][arg2];
        class244.field4248 = new int[arg0][arg1 + 1][arg2 + 1];
        class21.method226(false);
        class211.field3610 = arg1;
        class72.field1194 = arg2;
        class86.field1512 = new int[arg0][arg1 + 1][arg2 + 1];
        class45.method360();
        class171.field3012 = arg3;
        class171.field3020 = new boolean[class171.field3012 + class171.field3012 + 1][class171.field3012 + class171.field3012 + 1];
        class31.field551 = new boolean[class171.field3012 + class171.field3012 + 2][class171.field3012 + class171.field3012 + 2];
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZB)V")
    public static final void method1109(boolean arg0, byte arg1) {
        if (arg1 < 7) {
            method1109(false, (byte) -128);
        }
        for (class60 var2 = (class60) class82.field1448.method371((byte) 61); var2 != null; var2 = (class60) class82.field1448.method370(true)) {
            if (var2.field997 != null) {
                class36.field606.method1213(var2.field997);
                var2.field997 = null;
            }
            if (var2.field984 != null) {
                class36.field606.method1213(var2.field984);
                var2.field984 = null;
            }
            var2.method1611((byte) 105);
        }
        if (arg0) {
            for (class60 var3 = (class60) class2.field38.method371((byte) 61); var3 != null; var3 = (class60) class2.field38.method370(true)) {
                if (var3.field997 != null) {
                    class36.field606.method1213(var3.field997);
                    var3.field997 = null;
                }
                var3.method1611((byte) -29);
            }
            for (class60 var4 = (class60) class34.field594.method1514((byte) 112); var4 != null; var4 = (class60) class34.field594.method1515(125)) {
                if (var4.field997 != null) {
                    class36.field606.method1213(var4.field997);
                    var4.field997 = null;
                }
                var4.method1611((byte) -126);
            }
        }
        field2772++;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
    public static void method1110(int arg0) {
        field2762 = null;
        field2760 = null;
        if (arg0 != 1) {
            method1111(-50, -25, -112, 87, 97, 42, 41, 113, (class119) null, 101, true, 101L);
        }
        field2769 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIIILsc;IZJ)Z")
    public static final boolean method1111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class119 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class87.field1547 == class78.field1393;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class211.field3610 || var24 >= class72.field1194) {
                    return false;
                }
                class71 var25 = class31.field553[arg0][var15][var24];
                if (var25 != null && var25.field1149 >= 5) {
                    return false;
                }
            }
        }
        class14 var16 = new class14();
        var16.field260 = arg11;
        var16.field254 = arg0;
        var16.field275 = arg5;
        var16.field267 = arg6;
        var16.field259 = arg7;
        var16.field273 = arg8;
        var16.field257 = arg9;
        var16.field268 = arg1;
        var16.field256 = arg2;
        var16.field255 = arg1 + arg3 - 1;
        var16.field277 = arg2 + arg4 - 1;
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
                    if (class31.field553[var22][var17][var20] == null) {
                        class31.field553[var22][var17][var20] = new class71(var22, var17, var20);
                    }
                }
                class71 var23 = class31.field553[arg0][var17][var20];
                var23.field1140[var23.field1149] = var16;
                var23.field1159[var23.field1149] = var21;
                var23.field1153 |= var21;
                var23.field1149++;
                if (var13 && class238.field4101[var17][var20] != 0) {
                    var14 = class238.field4101[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class238.field4101[var18][var19] == 0) {
                        class238.field4101[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class105.field1877[class198.field3406++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IBI)Z")
    public final boolean method1112(int arg0, byte arg1, int arg2) {
        int var4 = -113 % ((arg1 - 51) / 33);
        field2775++;
        if (this.field2767 > arg2 || arg2 > this.field2764 || arg0 < this.field2771 || this.field2759 < arg0) {
            return false;
        }
        for (class109 var5 = (class109) this.field2776.method371((byte) 61); var5 != null; var5 = (class109) this.field2776.method370(true)) {
            if (var5.method827(arg0, -21990, arg2)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lsb;Lsb;IIIZ)V")
    public class150(class98 arg0, class98 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field2766 = arg3;
        this.field2768 = arg1;
        this.field2763 = arg0;
        this.field2774 = arg5;
        this.field2770 = arg2;
        this.field2765 = arg4;
        this.field2776 = new class48();
    }
}
