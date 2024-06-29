import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class699 extends class435 {

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public static int field9898;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public static int field9899;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    public int field9900;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    public int field9901;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
    public static int field9902;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    public static int field9903;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
    public static int field9904;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
    public static int field9905;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
    public static int field9907;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
    public static int field9910;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    public static int field9911;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
    public static int field9912;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "Lwe;")
    public static class115 field9897;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "Lvh;")
    public class125 field9909;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "Lsj;")
    public class373 field9908;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "Ljava/awt/Frame;")
    public static Frame field9906;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ph", name = "G", descriptor = "Ljava/lang/Class;")
    public static Class field9913;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3936(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IBLvo;)Lf;", line = 4)
    public static final class257 method3926(int arg0, byte arg1, class345 arg2) {
        field9903++;
        int var3 = -2 / ((-arg1 - 59) / 58);
        class257 var4 = (class257) class190.field2967.method941((long) arg0, 0);
        if (var4 == null) {
            if (class501.field7450) {
                var4 = class637.field9048.method772(class628.method3537(arg2, arg0), true);
            } else {
                var4 = class475.method2782(arg2.method2086(1024, arg0), -77);
            }
            class190.field2967.method949((long) arg0, true, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BIIII)V", line = 30)
    public static final void method3927(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field9899++;
        int var5 = 0;
        int var6 = arg3;
        int var7 = -arg3;
        if (arg0 >= -105) {
            method3934(-114);
        }
        class223.method1484(class657.field9275[arg2], arg3 + arg4, -94, arg1, arg4 - arg3);
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class657.field9275[arg2 + var6];
                int[] var10 = class657.field9275[arg2 - var6];
                int var11 = arg4 + var5;
                int var12 = arg4 - var5;
                class223.method1484(var9, var11, -118, arg1, var12);
                class223.method1484(var10, var11, -128, arg1, var12);
            }
            int var13 = arg4 + var6;
            int var14 = arg4 - var6;
            int[] var15 = class657.field9275[arg2 + var5];
            int[] var16 = class657.field9275[arg2 - var5];
            class223.method1484(var15, var13, -123, arg1, var14);
            class223.method1484(var16, var13, -124, arg1, var14);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V", line = 86)
    public static final void method3928(boolean arg0) {
        if (arg0) {
            class541.field7946 = class667.field9371;
            class687.field9745 = class340.field4723;
        } else {
            class541.field7946 = class608.field8743;
            class687.field9745 = class621.field8841;
        }
        class596.field8626 = class541.field7946.length;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V", line = 101)
    public static final void method3929(int arg0) {
        field9902++;
        class180.field2849 = true;
        if (arg0 < 54) {
            method3935(66, -110, -17, -90, 113, -73, 115, 14);
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V", line = 113)
    public static void method3930(int arg0) {
        if (arg0 <= -49) {
            field9906 = null;
            field9897 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)Z", line = 125)
    public static final boolean method3931(int arg0, int arg1) {
        if (arg1 != 17) {
            field9905 = 64;
        }
        field9907++;
        return arg0 >= 12 && arg0 <= 17;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V", line = 139)
    public final void method3932(int arg0) {
        field9898++;
        if (class10.field130 < class407.field5836.length && arg0 == -1) {
            class407.field5836[class10.field130++] = this;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIBI)Z", line = 154)
    public static final boolean method3933(int arg0, int arg1, byte arg2, int arg3) {
        field9904++;
        class394 var4 = (class394) class454.method2636(arg3, arg1, arg0);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class508.method3025(1157, var4);
        }
        if (arg2 > -109) {
            method3926(75, (byte) -63, null);
        }
        class394 var6 = (class394) class31.method286(arg3, arg1, arg0, field9913 == null ? (field9913 = method3936("sw")) : field9913);
        if (var6 != null) {
            var5 &= class508.method3025(1157, var6);
        }
        class394 var7 = (class394) class415.method2469(arg3, arg1, arg0);
        if (var7 != null) {
            var5 &= class508.method3025(1157, var7);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)Z", line = 182)
    public static final boolean method3934(int arg0) {
        if (arg0 != -27206) {
            field9905 = -10;
        }
        field9910++;
        return class419.field5959;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIII)V", line = 193)
    public static final void method3935(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9911++;
        int var8 = class367.method2203(class198.field3084, class627.field8931, arg7, true);
        int var9 = class367.method2203(class198.field3084, class627.field8931, arg4, true);
        int var10 = class367.method2203(class512.field7620, class94.field1398, arg3, true);
        int var11 = class367.method2203(class512.field7620, class94.field1398, arg6, true);
        int var12 = class367.method2203(class198.field3084, class627.field8931, arg2 + arg7, true);
        int var13 = class367.method2203(class198.field3084, class627.field8931, arg4 - arg2, true);
        for (int var14 = var8; var14 < var12; var14++) {
            class223.method1484(class657.field9275[var14], var11, -89, arg0, var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class223.method1484(class657.field9275[var15], var11, -82, arg0, var10);
        }
        int var16 = class367.method2203(class512.field7620, class94.field1398, arg2 + arg3, true);
        int var17 = class367.method2203(class512.field7620, class94.field1398, arg6 - arg2, true);
        int var18 = var12;
        if (arg1 > -127) {
            method3926(-86, (byte) -91, null);
        }
        while (var18 <= var13) {
            int[] var19 = class657.field9275[var18];
            class223.method1484(var19, var16, -104, arg0, var10);
            class223.method1484(var19, var17, -93, arg5, var16);
            class223.method1484(var19, var11, -79, arg0, var17);
            var18++;
        }
    }
}
