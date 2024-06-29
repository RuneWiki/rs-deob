import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public abstract class class289 extends class308 {

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "I")
    public static int field4807 = 0;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "I")
    public int field4802;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
    public int field4803;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    public int field4804;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    public int field4805;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
    public int field4811;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
    public int field4812;

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "[[B")
    public static byte[][] field4808;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BIIII)V", line = 11)
    public final void method2046(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field4813++;
        int var6 = this.field4805 << 3;
        int var7 = (arg3 << 4) + (var6 & 0xF);
        int var8 = this.field4812 << 3;
        int var9 = (arg1 << 4) + (var8 & 0xF);
        this.method956(var6, var8, var7, var9, arg2, arg4);
        if (arg0 < 38) {
            method2051(-106);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIBII)I", line = 28)
    public static final int method2047(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field4806++;
        if (class52.field799) {
            arg4 = 1000000;
            class52.field799 = false;
        }
        class52 var5 = class236.field3742[arg1][arg0];
        float var6 = var5.field794;
        int var7 = var5.field793;
        float var8 = var5.field791;
        int var9 = var5.field779;
        float var10 = ((float) arg3 * 0.1F + 0.7F) * var5.field790;
        int var11 = var5.field785;
        if (!class96.field1398) {
            var11 = 0;
        }
        class35 var12 = var5.field783;
        float var13 = var5.field781;
        float var14 = var5.field786;
        float var15 = var5.field782;
        if (arg2 != 69) {
            return 115;
        }
        if (class120.field1777 != var7 || class101.field1456 != var10 || class90.field1303 != var6 || class172.field2699 != var8 || class287.field4789 != var9 || class167.field2635 != var11 || client.field2073 != var12 || class91.field1315 != var15 || class94.field1371 != var14 || class150.field2414 != var13) {
            class325.field5331 = class185.field2869;
            class311.field5056 = class154.field2497;
            class315.field5202 = class228.field3578;
            class8.field106 = class246.field3917;
            class179.field2787 = class121.field1807;
            class318.field5241 = class131.field2001;
            class124.field1848 = class61.field935;
            class223.field3447 = class345.field5529;
            class141.field2278 = class223.field3449;
            class343.field5517 = class3.field18;
            if (class101.field1458 == null || class141.field2278 == class101.field1458) {
                class101.field1458 = new class35();
            }
            class150.field2414 = var13;
            class90.field1303 = var6;
            client.field2073 = var12;
            class94.field1371 = var14;
            class91.field1315 = var15;
            class101.field1456 = var10;
            class287.field4789 = var9;
            class167.field2635 = var11;
            class83.field1200 = 0;
            class172.field2699 = var8;
            class120.field1777 = var7;
        }
        if (class83.field1200 < 65536) {
            class83.field1200 += arg4 * 250;
            if (class83.field1200 >= 65536) {
                class61.field935 = class167.field2635;
                class83.field1200 = 65536;
                class345.field5529 = class150.field2414;
                class141.field2278 = null;
                class185.field2869 = class91.field1315;
                class121.field1807 = class120.field1777;
                class223.field3449 = client.field2073;
                class3.field18 = class172.field2699;
                class154.field2497 = class94.field1371;
                class246.field3917 = class90.field1303;
                class131.field2001 = class287.field4789;
                class228.field3578 = class101.field1456;
            } else {
                int var16 = class83.field1200 >> 8;
                int var17 = 65536 - class83.field1200 >> 8;
                class121.field1807 = ((class179.field2787 & 0xFF00) * var17 + (class120.field1777 & 0xFF00) * var16 & 0xFF0000) + ((class179.field2787 & 0xFF00FF) * var17 + (class120.field1777 & 0xFF00FF) * var16 & 0xFF00FF00) >> 8;
                class131.field2001 = ((class318.field5241 & 0xFF00FF) * var17 + ((class287.field4789 & 0xFF00FF) * var16) & 0xFF00FF00) + ((class318.field5241 & 0xFF00) * var17 + (class287.field4789 & 0xFF00) * var16 & 0xFF0000) >> 8;
                float var18 = (float) (65536 - class83.field1200) / 65536.0F;
                float var19 = (float) class83.field1200 / 65536.0F;
                class3.field18 = class343.field5517 * var18 + class172.field2699 * var19;
                class185.field2869 = class91.field1315 * var19 + class325.field5331 * var18;
                class246.field3917 = class90.field1303 * var19 + class8.field106 * var18;
                class154.field2497 = class94.field1371 * var19 + class311.field5056 * var18;
                class228.field3578 = class315.field5202 * var18 + class101.field1456 * var19;
                class61.field935 = class167.field2635 * var16 + class124.field1848 * var17 >> 8;
                class345.field5529 = class223.field3447 * var18 + class150.field2414 * var19;
                if (client.field2073 != class141.field2278) {
                    if (class141.field2278 == null || client.field2073 == null) {
                        class223.field3449 = null;
                    } else {
                        class223.field3449 = class101.field1458.method294(class141.field2278, client.field2073, (float) class83.field1200 / 65536.0F);
                    }
                }
            }
        }
        return class131.field2001;
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)V", line = 153)
    public static void method2048(int arg0) {
        field4808 = (byte[][]) null;
        int var1 = 78 / ((arg0 - 91) / 33);
    }

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "(I)V", line = 161)
    public static final void method2049(int arg0) {
        class273.field4493 = arg0;
        for (int var1 = 0; var1 < class263.field4155; var1++) {
            for (int var2 = 0; var2 < class163.field2590; var2++) {
                if (class264.field4230[arg0][var1][var2] == null) {
                    class264.field4230[arg0][var1][var2] = new class50(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V", line = 201)
    public static final void method2050(byte arg0) {
        field4810++;
        int[] var1 = new int[class6.field82];
        int var2 = 0;
        for (int var3 = 0; var3 < class6.field82; var3++) {
            class109 var4 = class322.method2311(var3, -104);
            if (var4.field1597 >= 0 || var4.field1623 >= 0) {
                var1[var2++] = var3;
            }
        }
        class116.field1693 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            class116.field1693[var5] = var1[var5];
        }
        if (arg0 != -74) {
            method2051(-42);
        }
    }

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "(I)V", line = 248)
    public static final void method2051(int arg0) {
        class293.field4849 = null;
        if (arg0 != 27953) {
            method2048(-52);
        }
        class94.field1377 = null;
        class125.field1872 = null;
        class280.field4612 = null;
        field4809++;
        class339.field5456 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V")
    public abstract void method945(int arg0, int arg1);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIII)V")
    public abstract void method959(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(III)V")
    public abstract void method946(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)V")
    public abstract void method966(int arg0, int arg1);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIII)V")
    public abstract void method956(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIII)V")
    public abstract void method961(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(II)V")
    public abstract void method963(int arg0, int arg1);
}
