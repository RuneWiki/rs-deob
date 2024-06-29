import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class410 {

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "Ljava/lang/String;")
    public String field5857;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "Ljava/lang/String;")
    public String field5866;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "Ljava/lang/String;")
    public String field5860;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "Lq;")
    public static class152 field5865;

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "Lvo;")
    public static class345 field5867;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)I", line = 4)
    public static final int method2448(int arg0, int arg1, int arg2) {
        if (arg2 < arg0) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        field5859++;
        if (arg1 != 0) {
            method2452((byte) -120);
        }
        while (arg0 != 0) {
            int var4 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V", line = 36)
    public static void method2449(int arg0) {
        field5865 = null;
        if (arg0 == 25216) {
            field5867 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIZ)I", line = 52)
    public static final int method2450(int arg0, int arg1, boolean arg2) {
        field5856++;
        double var3 = Math.log((double) arg1) / Math.log(2.0D);
        if (arg2) {
            return 16;
        } else {
            double var5 = Math.log((double) arg0) / Math.log(2.0D);
            double var7 = (var3 - var5) * Math.random() + var5;
            return (int) (Math.pow(2.0D, var7) + 0.5D);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIBIIII)V", line = 72)
    public static final void method2451(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field5864++;
        int var7 = class367.method2203(class198.field3084, class627.field8931, arg3, true);
        int var8 = class367.method2203(class198.field3084, class627.field8931, arg5, true);
        int var9 = class367.method2203(class512.field7620, class94.field1398, arg6, true);
        int var10 = class367.method2203(class512.field7620, class94.field1398, arg4, true);
        int var11 = class367.method2203(class198.field3084, class627.field8931, arg0 + arg3, true);
        int var12 = class367.method2203(class198.field3084, class627.field8931, arg5 - arg0, true);
        for (int var13 = var7; var13 < var11; var13++) {
            class223.method1484(class657.field9275[var13], var10, -106, arg1, var9);
        }
        if (arg2 > -71) {
            method2450(97, -6, true);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class223.method1484(class657.field9275[var14], var10, -93, arg1, var9);
        }
        int var15 = class367.method2203(class512.field7620, class94.field1398, arg0 + arg6, true);
        int var16 = class367.method2203(class512.field7620, class94.field1398, arg4 - arg0, true);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class657.field9275[var17];
            class223.method1484(var18, var15, -110, arg1, var9);
            class223.method1484(var18, var10, -127, arg1, var16);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V", line = 125)
    public static final void method2452(byte arg0) {
        class33.field471.method3896(3);
        field5862++;
        class29.field404 = 0;
        if (arg0 <= 107) {
            method2449(22);
        }
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 136)
    public class410(String arg0, String arg1, String arg2) {
        this.field5857 = arg2;
        this.field5866 = arg0;
        this.field5860 = arg1;
    }
}
