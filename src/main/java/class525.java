import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class525 extends class90 {

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "[I")
    public static int[] field7135 = new int[64];

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "Ljia;")
    public static class645 field7137 = new class645();

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field7131;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field7134;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field7136;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "Lpi;")
    public class525 field7133;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "Lpi;")
    public class525 field7138;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public static final void method2986(byte arg0) {
        class276.field3827.method273(126);
        int var1 = 27 % ((-arg0 - 17) / 59);
        field7134++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public final void method2987(int arg0) {
        field7131++;
        if (this.field7138 == null) {
            return;
        }
        this.field7138.field7133 = this.field7133;
        int var2 = 49 / ((58 - arg0) / 59);
        this.field7133.field7138 = this.field7138;
        this.field7138 = null;
        this.field7133 = null;
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(B)V")
    public static void method2988(byte arg0) {
        field7137 = null;
        if (arg0 == -24) {
            field7135 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIILha;)V")
    public static final void method2989(int arg0, int arg1, int arg2, int arg3, int arg4, class66 arg5) {
        field7136++;
        arg5.method512(arg2, arg1, arg0 + arg2, arg1 + arg4);
        arg5.method472(arg3 ^ 0x6458, arg4, arg2, arg0, -16777216, arg1);
        if (class394.field5442 < 100) {
            return;
        }
        if (arg3 != 4) {
            field7137 = null;
        }
        float var6 = (float) class64.field911 / (float) class64.field901;
        int var7 = arg0;
        int var8 = arg4;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg0 * var6);
        } else {
            var7 = (int) ((float) arg4 / var6);
        }
        int var9 = (arg0 - var7) / 2 + arg2;
        int var10 = (arg4 - var8) / 2 + arg1;
        if (class642.field8890 == null || class642.field8890.method220() != arg0 || class642.field8890.method214() != arg4) {
            class64.method451(class64.field907, class64.field914 + class64.field911, class64.field907 + class64.field901, class64.field914, var9, var10, var7 + var9, var8 + var10);
            class64.method446(arg5);
            class642.field8890 = arg5.method523(var9, var10, var7, var8, false);
        }
        class642.field8890.method3430(var9, var10);
        int var11 = class474.field6419 * var7 / class64.field901;
        int var12 = class220.field3223 * var8 / class64.field911;
        int var13 = class157.field2557 * var7 / class64.field901 + var9;
        int var14 = var8 + var10 - (class121.field2199 * var8 / class64.field911) - var12;
        int var15 = -1996554240;
        if (class403.field5534 == class177.field2797) {
            var15 = -1996488705;
        }
        arg5.method537(var13, var14, var11, var12, var15, 1);
        arg5.method519(var13, var14, var11, var12, var15, 0);
        if (class439.field5965 <= 0) {
            return;
        }
        int var16;
        if (class299.field4116 > 50) {
            var16 = 500 - (class299.field4116 * 5);
        } else {
            var16 = class299.field4116 * 5;
        }
        for (class508 var17 = (class508) class64.field888.method3589((byte) -128); var17 != null; var17 = (class508) class64.field888.method3591(0)) {
            class393 var18 = class64.field882.method4031(36, var17.field6973);
            if (class5.method39(var18, false)) {
                if (class769.field10607 == var17.field6973) {
                    int var19 = var17.field6978 * var7 / class64.field901 + var9;
                    int var20 = (class64.field911 - var17.field6984) * var8 / class64.field911 + var10;
                    arg5.method472(25692, 4, var19 - 2, 4, var16 << 24 | 0xFFFF00, var20 - 2);
                } else if (class428.field5845 != -1 && class428.field5845 == var18.field5430) {
                    int var21 = var17.field6978 * var7 / class64.field901 + var9;
                    int var22 = (class64.field911 - var17.field6984) * var8 / class64.field911 + var10;
                    arg5.method472(25692, 4, var21 - 2, 4, var16 << 24 | 0xFFFF00, var22 - 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)I")
    public static final int method2990(int arg0, byte arg1) {
        if (arg1 != 82) {
            method2990(-49, (byte) 98);
        }
        field7132++;
        return arg0 >>> 7;
    }
}
