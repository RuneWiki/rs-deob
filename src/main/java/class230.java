import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class230 extends class89 {

    @OriginalMember(owner = "client!vi", name = "T", descriptor = "Z")
    public static boolean field4030 = false;

    @OriginalMember(owner = "client!vi", name = "V", descriptor = "Lda;")
    public static class275 field4032 = class255.method1672(110, "<col=ffffff>");

    @OriginalMember(owner = "client!vi", name = "Q", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!vi", name = "R", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!vi", name = "S", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!vi", name = "U", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!vi", name = "X", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!vi", name = "Y", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!vi", name = "Z", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!vi", name = "W", descriptor = "Z")
    public static boolean field4033;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "(I)V")
    public static void method1492(int arg0) {
        if (arg0 != 32490) {
            method1492(-116);
        }
        field4032 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1493(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (~arg5 == ~arg6 && arg3 == arg9 && arg4 == arg8 && ~arg1 == ~arg2) {
            class94.method677(arg4, arg0, arg2, arg6, arg9, arg7 + -255);
        } else {
            int var10 = arg9;
            int var11 = arg6;
            int var12 = arg6 * 3;
            int var13 = arg9 * 3;
            int var14 = arg5 * 3;
            int var15 = arg8 * 3;
            int var16 = arg3 * 3;
            int var17 = arg1 * 3;
            int var18 = arg4 - var15 + -arg6 + var14;
            int var19 = arg2 - -var16 + -arg9 + -var17;
            int var20 = -var14 + var15 - var14 + var12;
            int var21 = -var12 + var14;
            int var22 = var16 - var13;
            int var23 = var17 - var16 + -var16 + var13;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var20 * var25;
                int var29 = var19 * var26;
                int var30 = var23 * var25;
                int var31 = var22 * var24;
                int var32 = var21 * var24;
                int var33 = (var29 - -var30 + var31 >> 12) + arg9;
                int var34 = arg6 - -(var27 - -var28 + var32 >> 12);
                class94.method677(var34, arg0, var33, var11, var10, -118);
                var10 = var33;
                var11 = var34;
            }
        }
        ++field4029;
        if (arg7 != 128) {
            method1494(31, -90);
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)I")
    public static final int method1494(int arg0, int arg1) {
        ++field4034;
        int var2 = 49 / ((arg1 - 49) / 62);
        return 255 & arg0;
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(III)I")
    private final int method1495(int arg0, int arg1, int arg2) {
        ++field4028;
        if (arg0 != 15731) {
            return 34;
        } else {
            int var4 = arg2 * 57 + arg1;
            int var5 = var4 << 1 ^ var4;
            return -((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 - -1376312589) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        int[] var3 = super.field1503.method229(arg0, (byte) -121);
        if (arg1) {
            method1492(6);
        }
        if (super.field1503.field664) {
            int var4 = class91.field1552[arg0];
            for (int var5 = 0; ~var5 > ~class65.field1070; ++var5) {
                var3[var5] = this.method1495(15731, class185.field3172[var5], var4) % 4096;
            }
        }
        ++field4031;
        return var3;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class230() {
        super(0, true);
    }
}
