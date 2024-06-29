import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class8 extends class79 {

    @OriginalMember(owner = "client!j", name = "A", descriptor = "I")
    public int field165;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    public int field163;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "[F")
    public static float[] field160 = new float[4];

    @OriginalMember(owner = "client!j", name = "w", descriptor = "Z")
    public static boolean field161 = false;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "Lsd;")
    public static class278 field167;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V", line = 27)
    public static void method90(int arg0) {
        int var1 = -92 % ((-arg0 - 65) / 58);
        field160 = null;
        field167 = null;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V", line = 38)
    public static final void method91(int arg0) {
        field168++;
        if (class282.field4656.toLowerCase().indexOf("microsoft") == -1) {
            class55.field882[44] = 71;
            class55.field882[45] = 26;
            class55.field882[47] = 73;
            class55.field882[59] = 57;
            class55.field882[91] = 42;
            class55.field882[61] = 27;
            class55.field882[46] = 72;
            class55.field882[92] = 74;
            if (class282.field4657 == null) {
                class55.field882[192] = 58;
                class55.field882[222] = 59;
            } else {
                class55.field882[520] = 59;
                class55.field882[222] = 58;
                class55.field882[192] = 28;
            }
            class55.field882[93] = 43;
        } else {
            class55.field882[187] = 27;
            class55.field882[221] = 43;
            class55.field882[223] = 28;
            class55.field882[192] = 58;
            class55.field882[220] = 74;
            class55.field882[222] = 59;
            class55.field882[191] = 73;
            class55.field882[188] = 71;
            class55.field882[219] = 42;
            class55.field882[189] = 26;
            class55.field882[190] = 72;
            class55.field882[186] = 57;
        }
        if (arg0 != 222) {
            field160 = (float[]) null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V", line = 90)
    public static final void method92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 <= 37) {
            return;
        }
        int var6 = arg0 - arg1;
        int var7 = arg4 - arg2;
        field166++;
        if (var6 == 0) {
            if (var7 != 0) {
                class104.method687(arg1, 0, arg2, arg4, arg5);
            }
        } else if (var7 == 0) {
            class287.method1922(arg2, arg1, arg0, (byte) 6, arg5);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg2 - (arg1 * var8 >> 12);
            int var10;
            int var11;
            if (class79.field1226 > arg1) {
                var11 = class79.field1226;
                var10 = (class79.field1226 * var8 >> 12) + var9;
            } else if (arg1 <= class59.field957) {
                var10 = arg2;
                var11 = arg1;
            } else {
                var11 = class59.field957;
                var10 = var9 + (class59.field957 * var8 >> 12);
            }
            if (var10 < class108.field1650) {
                var11 = (class108.field1650 - var9 << 12) / var8;
                var10 = class108.field1650;
            } else if (var10 > class236.field3800) {
                var10 = class236.field3800;
                var11 = (class236.field3800 - var9 << 12) / var8;
            }
            int var12;
            int var13;
            if (arg0 < class79.field1226) {
                var12 = class79.field1226;
                var13 = var9 + (class79.field1226 * var8 >> 12);
            } else if (arg0 <= class59.field957) {
                var12 = arg0;
                var13 = arg4;
            } else {
                var13 = (class59.field957 * var8 >> 12) + var9;
                var12 = class59.field957;
            }
            if (var13 < class108.field1650) {
                var13 = class108.field1650;
                var12 = (class108.field1650 - var9 << 12) / var8;
            } else if (class236.field3800 < var13) {
                var12 = (class236.field3800 - var9 << 12) / var8;
                var13 = class236.field3800;
            }
            class37.method290(var13, var10, var12, var11, 110, arg5);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lsd;I)V", line = 193)
    public static final void method93(class278 arg0, int arg1) {
        if (arg1 != -1821474996) {
            return;
        }
        field162++;
        class272.field4477.method143(-95, 0);
        class1.field19.method246(382 - class1.field19.field1243 / 2, 18);
        if (class214.field3407 != 0 && class214.field3407 != 5) {
            return;
        }
        byte var2 = 20;
        arg0.method1835(class118.field1781, 382, 245 - var2, 16777215, -1);
        int var3 = 253 - var2;
        class121.method813(230, var3, 304, 34, 9179409);
        class121.method813(231, var3 + 1, 302, 32, 0);
        class121.method811(232, var3 + 2, class158.field2517 * 3, 30, 9179409);
        class121.method811(class158.field2517 * 3 + 232, var3 + 2, 300 - (class158.field2517 * 3), 30, 0);
        arg0.method1835(class253.field4082, 382, 276 - var2, 16777215, -1);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(II)V", line = 230)
    public class8(int arg0, int arg1) {
        this.field165 = arg1;
        this.field163 = arg0;
    }
}
