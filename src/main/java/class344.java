import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public abstract class class344 extends class426 {

    @OriginalMember(owner = "client!n", name = "K", descriptor = "Z")
    public volatile boolean field5140 = true;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "[I")
    public static int[] field5142 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!n", name = "P", descriptor = "I")
    public static int field5145 = 0;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "Z")
    public static boolean field5146 = false;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!n", name = "R", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!n", name = "L", descriptor = "Z")
    public boolean field5141;

    @OriginalMember(owner = "client!n", name = "O", descriptor = "Z")
    public boolean field5144;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "(I)[B")
    public abstract byte[] method880(int arg0);

    @OriginalMember(owner = "client!n", name = "h", descriptor = "(I)I")
    public abstract int method875(int arg0);

    @OriginalMember(owner = "client!n", name = "i", descriptor = "(I)V")
    public static void method2096(int arg0) {
        field5142 = null;
        if (arg0 != -8926) {
            method2099(-67, (class261) null, -7, 10, -90, -7);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
    public static final void method2097(int arg0, int arg1, int arg2) {
        boolean var3 = class277.field4216[0][arg1][arg2] != null && class277.field4216[0][arg1][arg2].field146 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class277.field4216[var4][arg1][arg2] == null) {
                class13 var5 = class277.field4216[var4][arg1][arg2] = new class13(var4, arg1, arg2);
                if (var3) {
                    var5.field150++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(B)V")
    public static final void method2098(byte arg0) {
        field5147++;
        if (arg0 != 71) {
            method2099(19, (class261) null, 18, -95, 47, 51);
        }
        class143.field1909.method1485(-22032);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILdr;IIII)V")
    public static final void method2099(int arg0, class261 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.method436(arg0, arg3, arg0 + arg4, arg2 + arg3);
        field5143++;
        arg1.method1615(arg4, -16777216, arg2, arg0, arg3, (byte) -119);
        if (class425.field6248 < 100) {
            return;
        }
        float var6 = (float) class223.field3403 / (float) class223.field3402;
        int var7 = arg4;
        if (arg5 != -1442514344) {
            return;
        }
        int var8 = arg2;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg4 * var6);
        } else {
            var7 = (int) ((float) arg2 / var6);
        }
        int var9 = (arg2 - var8) / 2 + arg3;
        int var10 = (arg4 - var7) / 2 + arg0;
        if (class429.field6309 == null || class429.field6309.method1227() != arg4 || arg2 != class429.field6309.method1229()) {
            class223.method1358(class223.field3394, class223.field3405 + class223.field3403, class223.field3402 + class223.field3394, class223.field3405, var10, var9, var10 + var7, var8 + var9);
            class223.method1367(arg1);
            class429.field6309 = arg1.method373(var10, var9, var7, var8, false);
        }
        class429.field6309.method1408(var10, var9);
        int var11 = class217.field3301 * var7 / class223.field3402;
        int var12 = class176.field2678 * var8 / class223.field3403;
        int var13 = class405.field6030 * var7 / class223.field3402 + var10;
        int var14 = var9 + var8 - (class100.field1371 * var8 / class223.field3403) - var12;
        int var15 = -1996554240;
        if (class466.field6855 == class17.field253) {
            var15 = -1996488705;
        }
        arg1.method358(var13, var14, var11, var12, var15, 1);
        arg1.method422(var13, var14, var11, var12, var15, 0);
        if (class354.field5228 <= 0) {
            return;
        }
        int var16;
        if (class426.field6263 > 50) {
            var16 = 500 - (class426.field6263 * 5);
        } else {
            var16 = class426.field6263 * 5;
        }
        for (class227 var17 = (class227) class223.field3386.method2514((byte) 61); var17 != null; var17 = (class227) class223.field3386.method2511(-113)) {
            class228 var18 = class20.method125(var17.field3437, arg5 ^ 0xAA04FA7C);
            if (class126.method744(var18, (byte) 127)) {
                if (class327.field4919 == var17.field3437) {
                    int var21 = var10 + (var17.field3442 * var7 / class223.field3402);
                    int var22 = (class223.field3403 - var17.field3434) * var8 / class223.field3403 + var9;
                    arg1.method1615(4, var16 << 24 | 0xFFFF00, 4, var21 - 2, var22 + -2, (byte) -119);
                } else if (class71.field911 != -1 && class71.field911 == var18.field3487) {
                    int var19 = var17.field3442 * var7 / class223.field3402 + var10;
                    int var20 = (class223.field3403 - var17.field3434) * var8 / class223.field3403 + var9;
                    arg1.method1615(4, var16 << 24 | 0xFFFF00, 4, var19 - 2, var20 + -2, (byte) -119);
                }
            }
        }
    }
}
