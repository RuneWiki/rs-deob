import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class149 {

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Lhh;")
    public static class163 field2807 = class137.method1065("http:)4)4", 17);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Lhh;")
    public static class163 field2801 = class137.method1065("Lade Texturen )2 ", 17);

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field2810 = 0;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "Lhh;")
    public static class163 field2809 = null;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Lv;")
    public static class22 field2805;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lrc;IIIIIIZ)V")
    public static final void method1109(class47 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field793.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field793[var9] - class134.field2601;
            int var23 = arg0.field782[var9] - class127.field2472;
            int var24 = arg0.field778[var9] - class30.field476;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field790 != null) {
                class47.field776[var9] = var25;
                class47.field794[var9] = var28;
                class47.field787[var9] = var29;
            }
            class47.field786[var9] = (var25 << 9) / var29 + class98.field1841;
            class47.field789[var9] = (var28 << 9) / var29 + class98.field1848;
        }
        class98.field1846 = 0;
        int var10 = arg0.field796.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field796[var11];
            int var13 = arg0.field779[var11];
            int var14 = arg0.field788[var11];
            int var15 = class47.field786[var12];
            int var16 = class47.field786[var13];
            int var17 = class47.field786[var14];
            int var18 = class47.field789[var12];
            int var19 = class47.field789[var13];
            int var20 = class47.field789[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class55.field908 && class250.method1710(class98.field1841 + class59.field974, class98.field1848 + class8.field138, var18, var19, var20, var15, var16, var17)) {
                    class13.field211 = arg5;
                    class49.field818 = arg6;
                }
                if (!arg7) {
                    class98.field1842 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class98.field1849 || var16 > class98.field1849 || var17 > class98.field1849) {
                        class98.field1842 = true;
                    }
                    if (arg0.field790 == null || arg0.field790[var11] == -1) {
                        if (arg0.field792[var11] != 12345678) {
                            class98.method778(var18, var19, var20, var15, var16, var17, arg0.field792[var11], arg0.field781[var11], arg0.field783[var11]);
                        }
                    } else if (!class9.field154) {
                        int var21 = class98.field1852.method669(113, arg0.field790[var11]);
                        class98.method778(var18, var19, var20, var15, var16, var17, class246.method1694(var21, arg0.field792[var11]), class246.method1694(var21, arg0.field781[var11]), class246.method1694(var21, arg0.field783[var11]));
                    } else if (arg0.field785) {
                        class98.method784(var18, var19, var20, var15, var16, var17, arg0.field792[var11], arg0.field781[var11], arg0.field783[var11], class47.field776[0], class47.field776[1], class47.field776[3], class47.field794[0], class47.field794[1], class47.field794[3], class47.field787[0], class47.field787[1], class47.field787[3], arg0.field790[var11]);
                    } else {
                        class98.method784(var18, var19, var20, var15, var16, var17, arg0.field792[var11], arg0.field781[var11], arg0.field783[var11], class47.field776[var12], class47.field776[var13], class47.field776[var14], class47.field794[var12], class47.field794[var13], class47.field794[var14], class47.field787[var12], class47.field787[var13], class47.field787[var14], arg0.field790[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method1110(int arg0) {
        field2809 = null;
        field2807 = null;
        if (arg0 >= 51) {
            field2801 = null;
            field2805 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static final void method1111(int arg0) {
        field2808++;
        class119.method937(5, false);
        class6.method43((byte) -103, 5);
        class245.method1686(-1, arg0);
        class82.method661(5, true);
        class69.method480(100, 5);
        class187.method1381((byte) 48, 5);
        class183.method1353(5, arg0 ^ 0xFFFFFF89);
        class103.method818((byte) -48, 5);
        class84.method674(5, -90);
        class43.method319(5, 0);
        class142.method1084(5, 1);
        class233.method1618(2000000, 50);
        class203.method1450(arg0 ^ 0x5, 5);
        class113.method899(-15921, 5);
        class124.field2394.method112(5, 114);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIB)V")
    public static final void method1112(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class182.field3344 = arg3;
        if (arg4 <= 112) {
            method1111(-20);
        }
        class127.field2465 = arg0;
        class252.field4407 = arg1;
        class201.field3593 = arg2;
        field2811++;
    }
}
