import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class720 {

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public int field10158;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Lkf;")
    public static class720 field10156 = new class720(1);

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Lkf;")
    public static class720 field10160 = new class720(2);

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Lkf;")
    public static class720 field10162 = new class720(4);

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "Lkf;")
    public static class720 field10164 = new class720(1);

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "Lkf;")
    public static class720 field10165 = new class720(2);

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Lkf;")
    public static class720 field10166 = new class720(4);

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "Lkf;")
    public static class720 field10167 = new class720(2);

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "Lkf;")
    public static class720 field10168 = new class720(4);

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field10157;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field10159;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field10161;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field10163;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field10169;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 4)
    public static final void method4038(int arg0) {
        for (class656 var1 = (class656) class734.field10265.method1952(-55); var1 != null; var1 = (class656) class734.field10265.method1952(-113)) {
            class306.method1789(var1, 103);
        }
        field10163++;
        int var2;
        int var3;
        if (class674.field9500.field5113.method3798(0) == 1) {
            var3 = 0;
            var2 = 3;
        } else {
            var2 = class183.field2654;
            var3 = class183.field2654;
        }
        client.method2673();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method2676();
            client.method2671(var4);
            client.method2677(var4);
        }
        client.method2679();
        if (arg0 < 35) {
            field10169 = -66;
        }
        client.method2689();
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIIIIII)V", line = 47)
    public static final void method4039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 == arg4 && arg3 == arg9 && arg1 == arg5 && arg6 == arg8) {
            class128.method823(arg4, arg9, arg6, arg0, arg1, (byte) -19);
        } else {
            int var10 = arg4;
            int var11 = arg9;
            int var12 = arg4 * 3;
            int var13 = arg9 * 3;
            int var14 = arg2 * 3;
            int var15 = arg3 * 3;
            int var16 = arg5 * 3;
            int var17 = arg8 * 3;
            int var18 = arg1 + var14 - arg4 - var16;
            int var19 = arg6 + var15 - var17 - arg9;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 - (-var29 - var31) >> 12) + arg4;
                int var34 = (var28 + var30 + var32 >> 12) + arg9;
                class128.method823(var10, var11, var34, arg0, var33, (byte) -19);
                var10 = var33;
                var11 = var34;
            }
        }
        field10161++;
        if (arg7 != 4) {
            method4038(73);
        }
    }

    @OriginalMember(owner = "client!kf", name = "toString", descriptor = "()Ljava/lang/String;", line = 125)
    public final String toString() {
        field10157++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ld;ILwu;)V", line = 137)
    public static final void method4040(class268 arg0, int arg1, class557 arg2) {
        class674.field9505 = arg0;
        if (arg1 >= 116) {
            field10159++;
            class88.field1211 = arg2;
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(I)V", line = 148)
    private class720(int arg0) {
        this.field10158 = arg0;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V", line = 163)
    public static void method4041(byte arg0) {
        field10156 = null;
        field10168 = null;
        field10167 = null;
        field10164 = null;
        if (arg0 != -81) {
            field10166 = null;
        }
        field10162 = null;
        field10160 = null;
        field10165 = null;
        field10166 = null;
    }
}
