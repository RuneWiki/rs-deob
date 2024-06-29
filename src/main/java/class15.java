import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class15 extends class177 {

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
    private int field169 = -1;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "Lta;")
    public static class197 field173 = new class197(4);

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "[I")
    public static int[] field179 = new int[50];

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "I")
    public static int field177 = 0;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "I")
    private int field170;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "Llb;")
    public static class211 field180;

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "Ljl;")
    public static class265 field176;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "[I")
    private int[] field171;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)I", line = 6)
    public final int method111(int arg0) {
        field175++;
        int var2 = 98 / ((arg0 - 74) / 40);
        return this.field169;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lgd;IIIII)V", line = 19)
    public static final void method112(class310 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class136.field2126 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class39.field589) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class210.field3312 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class99 var14 = class250.field3746[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class41.field612[var11][var12 + 1][var13] + class41.field612[var11][var12][var13] + class41.field612[var11][var12][var13 + 1] + class41.field612[var11][var12 + 1][var13 + 1]) / 4 - (class41.field612[arg1][arg2 + 1][arg3] + class41.field612[arg1][arg2][arg3] + class41.field612[arg1][arg2][arg3 + 1] + class41.field612[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class10 var16 = var14.field1486;
                                    if (var16 != null) {
                                        if (var16.field98.method386()) {
                                            arg0.method400(var16.field98, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field94 != null && var16.field94.method386()) {
                                            arg0.method400(var16.field94, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field1488; var17++) {
                                        class91 var18 = var14.field1471[var17];
                                        if (var18 != null && var18.field1326.method386() && (var18.field1329 == var12 || var7 == var12) && (var18.field1323 == var13 || var9 == var13)) {
                                            int var19 = var18.field1317 + 1 - var18.field1329;
                                            int var20 = var18.field1319 + 1 - var18.field1323;
                                            arg0.method400(var18.field1326, (var18.field1329 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field1323 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V", line = 114)
    public static final void method113(int arg0) {
        field166++;
        int var1 = 102 % ((arg0 + 91) / 34);
        class102.field1579.method1428(10935);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lhb;II)V", line = 124)
    public final void method97(class35 arg0, int arg1, int arg2) {
        if (arg1 != -18061) {
            method112((class310) null, -114, 65, -2, -40, -50);
        }
        field172++;
        if (arg2 == 0) {
            this.field169 = arg0.method300(-1394191632);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIII)V", line = 140)
    public static final void method114(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class278.field4269[0].method589(arg3, arg4);
        field164++;
        class278.field4269[1].method589(arg3, arg2 + arg4 - 16);
        int var6 = (arg2 - 32) * arg2 / arg5;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg2 - var6 - 32) * arg1 / (arg5 - arg2);
        if (class36.field534) {
            class194.method1413(arg3, arg4 + 16, 16, arg2 - 32, class124.field1966);
            class194.method1413(arg3, arg4 + var7 + 16, 16, var6, class298.field4669);
            class194.method1404(arg3, arg4 + var7 + 16, var6, class189.field3014);
            class194.method1404(arg3 + 1, arg4 + 16 + var7, var6, class189.field3014);
            class194.method1408(arg3, arg4 + var7 + 16, 16, class189.field3014);
            class194.method1408(arg3, arg4 + var7 + 17, 16, class189.field3014);
            class194.method1404(arg3 + 15, arg4 + 16 + var7, var6, class4.field23);
            class194.method1404(arg3 + 14, arg4 - -17 - -var7, var6 - 1, class4.field23);
            class194.method1408(arg3, arg4 + var6 + var7 + 15, 16, class4.field23);
            class194.method1408(arg3 + 1, arg4 - -14 + var7 + var6, 15, class4.field23);
        } else {
            class168.method1224(arg3, arg4 + 16, 16, arg2 - 32, class124.field1966);
            class168.method1224(arg3, arg4 + var7 + 16, 16, var6, class298.field4669);
            class168.method1222(arg3, arg4 + var7 + 16, var6, class189.field3014);
            class168.method1222(arg3 + 1, arg4 + 16 - -var7, var6, class189.field3014);
            class168.method1242(arg3, var7 + arg4 + 16, 16, class189.field3014);
            class168.method1242(arg3, arg4 + var7 + 17, 16, class189.field3014);
            class168.method1222(arg3 + 15, var7 + 16 + arg4, var6, class4.field23);
            class168.method1222(arg3 + 14, arg4 - -var7 + 17, var6 - 1, class4.field23);
            class168.method1242(arg3, var7 + arg4 + var6 + 15, 16, class4.field23);
            class168.method1242(arg3 + 1, arg4 + 14 - -var6 + var7, 15, class4.field23);
        }
        if (arg0 < 57) {
            method114(-106, 31, -55, 29, 36, 35);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V", line = 187)
    public final void method115(boolean arg0) {
        super.method115(arg0);
        if (!arg0) {
            field178++;
            this.field171 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)V", line = 202)
    public static final void method116(boolean arg0) {
        if (class319.field4972 != -1) {
            class302.method2117(class319.field4972, (byte) 127);
        }
        for (int var1 = 0; var1 < class112.field1762; var1++) {
            if (class40.field597[var1]) {
                class238.field3621[var1] = true;
            }
            class98.field1450[var1] = class40.field597[var1];
            class40.field597[var1] = false;
        }
        if (class36.field534) {
            class142.field2186 = true;
        }
        class231.field3574 = -1;
        class210.field3299 = class312.field4852;
        class73.field1047 = null;
        if (arg0) {
            field180 = (class211) null;
        }
        class99.field1467 = -1;
        if (class319.field4972 != -1) {
            class112.field1762 = 0;
            class35.method296((byte) 9);
        }
        field165++;
        if (class36.field534) {
            class194.method1405();
        } else {
            class168.method1235();
        }
        class88.field1297 = 0;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V", line = 323)
    public class15() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(II)[[I", line = 252)
    public final int[][] method99(int arg0, int arg1) {
        if (arg1 != -23387) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field2645.method1456(arg0, (byte) -113);
        if (this.field2645.field3203 && this.method118((byte) -52)) {
            int[] var4 = var3[0];
            int var5 = (class282.field4361 == this.field167 ? arg0 : this.field167 * arg0 / class282.field4361) * this.field170;
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class287.field4415 == this.field170) {
                for (int var11 = 0; var11 < class287.field4415; var11++) {
                    int var12 = this.field171[var5++];
                    var7[var11] = class142.method1078(4080, var12 << 4);
                    var6[var11] = class142.method1078(4080, var12 >> 4);
                    var4[var11] = class142.method1078(4080, var12 >> 12);
                }
            } else {
                for (int var8 = 0; var8 < class287.field4415; var8++) {
                    int var9 = this.field170 * var8 / class287.field4415;
                    int var10 = this.field171[var5 + var9];
                    var7[var8] = class142.method1078(var10 << 4, 4080);
                    var6[var8] = class142.method1078(4080, var10 >> 4);
                    var4[var8] = class142.method1078(var10, 16711680) >> 12;
                }
            }
        }
        field168++;
        return var3;
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(B)V", line = 338)
    public static final void method117(byte arg0) {
        int var1 = -69 % ((21 - arg0) / 57);
        field174++;
        if (!class81.field1136) {
            return;
        }
        class184 var2 = class314.method2167(class249.field3742, class90.field1313, -2421);
        if (var2 != null && var2.field2860 != null) {
            class167 var3 = new class167();
            var3.field2510 = var2.field2860;
            var3.field2518 = var2;
            class272.method1889(1, var3);
        }
        class323.field5016 = -1;
        class81.field1136 = false;
        class133.method1007(var2, 72);
    }

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "(B)Z", line = 367)
    private final boolean method118(byte arg0) {
        field181++;
        if (this.field171 != null) {
            return true;
        } else if (this.field169 >= 0) {
            int var2 = class287.field4415;
            int var3 = class282.field4361;
            int var4 = class244.field3677.method1746(this.field169, (byte) 90) ? 64 : 128;
            this.field171 = class244.field3677.method1742(this.field169, -10062);
            this.field170 = var4;
            this.field167 = var4;
            class153.method1126(var3, var2, -117);
            return this.field171 != null;
        } else {
            int var5 = 127 % ((21 - arg0) / 44);
            return false;
        }
    }

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "(B)V", line = 398)
    public static void method119(byte arg0) {
        field179 = null;
        field173 = null;
        field176 = null;
        if (arg0 == 99) {
            field180 = null;
        }
    }
}
