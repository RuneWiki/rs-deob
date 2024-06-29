import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class465 extends class669 {

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "Z")
    public static boolean field6521 = false;

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "I")
    public static int field6524 = 0;

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "Ljr;")
    public static class112 field6523 = new class112(8);

    @OriginalMember(owner = "client!bg", name = "I", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!bg", name = "J", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!bg", name = "K", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!bg", name = "H", descriptor = "[Ls;")
    public static class281[] field6517;

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(IIIIIF)V")
    public class465(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IBII)V")
    public final void method1432(int arg0, byte arg1, int arg2, int arg3) {
        super.field9124 = arg2;
        super.field9119 = arg3;
        if (arg1 == 70) {
            ++field6525;
            super.field9133 = arg0;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(III)I")
    public static final int method2737(int arg0, int arg1, int arg2) {
        if (~arg1 > ~arg2) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        if (arg0 != -21806) {
            method2738((byte) -128, (class469) null, (byte[][]) null);
        }
        ++field6520;
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLvaa;[[B)V")
    public static final void method2738(byte arg0, class469 arg1, byte[][] arg2) {
        ++field6518;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = 67 % ((arg0 - 14) / 47);
        int var5 = arg2.length;
        for (int var6 = 0; var5 > var6; ++var6) {
            byte[] var11 = arg2[var6];
            if (var11 != null) {
                class215 var12 = new class215(var11);
                int var13 = class199.field2905[var6] >> 8;
                int var14 = 255 & class199.field2905[var6];
                int var15 = var13 * 64 + -class221.field3177;
                int var16 = var14 * 64 + -class367.field5236;
                class15.method120(false);
                arg1.method1726(var12, var15, class19.field295, class367.field5236, class221.field3177, var16, (byte) 110);
                arg1.method2759(var16, class272.field3822, var12, var3, var15, (byte) -126);
                if (!arg1.field3671 && class59.field1172 / 8 == var13 && ~(class531.field7322 / 8) == ~var14 && ~var3[0] != 0) {
                    class318.field4390 = class132.field2230.method3665(var3[2], var3[3], var3[1], -66, class744.field9996, var3[0]);
                    class681.field9221 = var3[4];
                }
            }
        }
        for (int var7 = 0; ~var5 < ~var7; ++var7) {
            int var8 = (class199.field2905[var7] >> 8) * 64 - class221.field3177;
            int var9 = (255 & class199.field2905[var7]) * 64 + -class367.field5236;
            byte[] var10 = arg2[var7];
            if (var10 == null && class531.field7322 < 800) {
                class15.method120(false);
                arg1.method1733(var9, 64, 64, 125, var8);
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V")
    public static void method2739(byte arg0) {
        if (arg0 != 9) {
            field6523 = null;
        }
        field6523 = null;
        field6517 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IF)V")
    public final void method1436(int arg0, float arg1) {
        super.field9121 = arg1;
        if (arg0 != -1) {
            field6523 = null;
        }
        ++field6519;
    }
}
