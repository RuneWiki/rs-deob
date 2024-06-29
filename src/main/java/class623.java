import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class623 extends class134 {

    @OriginalMember(owner = "client!lha", name = "l", descriptor = "I")
    public static int field8920 = 0;

    @OriginalMember(owner = "client!lha", name = "j", descriptor = "I")
    public static int field8918;

    @OriginalMember(owner = "client!lha", name = "m", descriptor = "I")
    public static int field8921;

    @OriginalMember(owner = "client!lha", name = "n", descriptor = "I")
    public static int field8922;

    @OriginalMember(owner = "client!lha", name = "p", descriptor = "I")
    public static int field8924;

    @OriginalMember(owner = "client!lha", name = "q", descriptor = "I")
    public static int field8925;

    @OriginalMember(owner = "client!lha", name = "r", descriptor = "I")
    public static int field8926;

    @OriginalMember(owner = "client!lha", name = "k", descriptor = "J")
    public long field8919;

    @OriginalMember(owner = "client!lha", name = "o", descriptor = "Llha;")
    public class623 field8923;

    @OriginalMember(owner = "client!lha", name = "s", descriptor = "Llha;")
    public class623 field8927;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lha", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field8928;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lha", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field8929;

    // $FF: synthetic method
    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3566(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(IIIIIIBIII)V", line = 3)
    public static final void method3560(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        field8921++;
        if (arg6 != -101) {
            return;
        }
        if (arg4 >= class338.field4355 && class744.field10385 >= arg4 && class338.field4355 <= arg2 && class744.field10385 >= arg2 && arg8 >= class338.field4355 && class744.field10385 >= arg8 && class338.field4355 <= arg9 && arg9 <= class744.field10385 && class224.field2571 <= arg0 && arg0 <= class578.field8182 && class224.field2571 <= arg3 && class578.field8182 >= arg3 && arg7 >= class224.field2571 && class578.field8182 >= arg7 && class224.field2571 <= arg5 && class578.field8182 >= arg5) {
            class441.method2747(arg6 ^ 0xE64C49B7, arg1, arg8, arg5, arg3, arg9, arg4, arg7, arg0, arg2);
        } else {
            class301.method1801(arg1, arg5, arg4, arg9, arg2, arg7, arg3, arg8, arg0, (byte) -120);
        }
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(IIZII)I", line = 22)
    public static final int method3561(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field8926++;
        if (arg2) {
            int var5 = arg0 & 0xF;
            int var6 = var5 >= 8 ? arg1 : arg3;
            int var7 = var5 < 4 ? arg1 : (var5 == 12 || var5 == 14 ? arg3 : arg4);
            return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
        } else {
            return -123;
        }
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(B)V", line = 41)
    public final void method3562(byte arg0) {
        field8925++;
        if (this.field8927 == null) {
            return;
        }
        this.field8927.field8923 = this.field8923;
        this.field8923.field8927 = this.field8927;
        if (arg0 < -41) {
            this.field8927 = null;
            this.field8923 = null;
        }
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(Z)I", line = 61)
    public static final int method3563(boolean arg0) {
        field8924++;
        int var1 = 0;
        Field[] var2 = (field8928 == null ? (field8928 = method3566("gn")) : field8928).getDeclaredFields();
        if (!arg0) {
            method3561(125, 52, false, -71, 5);
        }
        Field[] var3 = var2;
        for (int var4 = 0; var4 < var3.length; var4++) {
            Field var5 = var3[var4];
            if ((field8929 == null ? (field8929 = method3566("qs")) : field8929).isAssignableFrom(var5.getType())) {
                var1++;
            }
        }
        return var1 + 1;
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(Ltp;III)V", line = 92)
    public static final void method3564(class532 arg0, int arg1, int arg2, int arg3) {
        field8922++;
        if (arg3 != 2) {
            field8920 = 6;
        }
        class485 var4 = arg0.method3127(class275.field3370, (byte) -98);
        if (var4 == null) {
            return;
        }
        class275.field3370.method432(arg2, arg1, arg0.field7658 + arg2, arg0.field7573 + arg1);
        if (class125.field1308 >= 3) {
            class275.field3370.method389(-16777216, var4, arg2, arg1);
        } else {
            class451.field6505.method815((float) arg0.field7658 / 2.0F + (float) arg2, (float) arg0.field7573 / 2.0F + (float) arg1, 4096, ((int) (-class227.field2590) & 0x3FFF) << 2, var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "(I)Z", line = 119)
    public final boolean method3565(int arg0) {
        field8918++;
        if (this.field8927 == null) {
            return false;
        } else {
            if (arg0 < 32) {
                method3561(115, -55, true, -78, -54);
            }
            return true;
        }
    }
}
