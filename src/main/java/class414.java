import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class414 extends class101 {

    @OriginalMember(owner = "client!lp", name = "r", descriptor = "I")
    private int field5942;

    @OriginalMember(owner = "client!lp", name = "q", descriptor = "I")
    public int field5941;

    @OriginalMember(owner = "client!lp", name = "D", descriptor = "I")
    private int field5954;

    @OriginalMember(owner = "client!lp", name = "y", descriptor = "I")
    private int field5949;

    @OriginalMember(owner = "client!lp", name = "x", descriptor = "I")
    public int field5948;

    @OriginalMember(owner = "client!lp", name = "s", descriptor = "I")
    public int field5943;

    @OriginalMember(owner = "client!lp", name = "z", descriptor = "I")
    public int field5950;

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
    private int field5938;

    @OriginalMember(owner = "client!lp", name = "w", descriptor = "I")
    private int field5947;

    @OriginalMember(owner = "client!lp", name = "t", descriptor = "Lbp;")
    public static class408 field5944 = new class408();

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!lp", name = "p", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!lp", name = "u", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!lp", name = "v", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!lp", name = "A", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!lp", name = "B", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!lp", name = "C", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I[IBI)V", line = 3)
    public final void method2553(int arg0, int[] arg1, byte arg2, int arg3) {
        arg1[2] = this.field5954 + arg0 - this.field5941;
        if (arg2 < 29) {
            this.field5950 = 78;
        }
        arg1[1] = arg3 + this.field5938 - this.field5948;
        arg1[0] = this.field5942;
        field5951++;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lpu;Lha;IIII)V", line = 19)
    public static final void method2554(class589 arg0, class65 arg1, int arg2, int arg3, int arg4, int arg5) {
        field5946++;
        class532 var6 = class159.field2194.method396(arg0.field7855, (byte) -104);
        if (var6.field7247 == -1) {
            return;
        }
        if (arg4 != -24334) {
            method2554(null, null, 81, 58, -24, -45);
        }
        int var7;
        if (arg0.field7904) {
            int var8 = arg0.field7872 + arg2;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class147 var9 = var6.method3046(var7, -14563, arg0.field7908, arg1);
        if (var9 == null) {
            return;
        }
        int var10 = arg0.field7940;
        int var11 = arg0.field7943;
        if ((var7 & 0x1) == 1) {
            var10 = arg0.field7943;
            var11 = arg0.field7940;
        }
        int var12 = var9.method1096();
        int var13 = var9.method1106();
        if (var6.field7253) {
            var12 = var10 * 4;
            var13 = var11 * 4;
        }
        if (var6.field7248 == 0) {
            var9.method1101(arg5, arg3 + 4 - (var11 * 4), var12, var13);
        } else {
            var9.method1104(arg5, arg3 + 4 - var11 * 4, var12, var13, 0, var6.field7248 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I[III)V", line = 75)
    public final void method2555(int arg0, int[] arg1, int arg2, int arg3) {
        arg1[0] = 0;
        if (arg3 <= 112) {
            this.method2559(-15, (byte) 68, -62);
        }
        arg1[1] = this.field5948 + arg0 - this.field5938;
        field5953++;
        arg1[2] = this.field5941 + arg2 - this.field5954;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V", line = 105)
    public static void method2556(byte arg0) {
        int var1 = 87 / ((-arg0 - 65) / 48);
        field5944 = null;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIII)Z", line = 114)
    public final boolean method2557(int arg0, int arg1, int arg2, int arg3) {
        field5940++;
        if (arg2 >= -124) {
            this.method2557(-76, 32, 81, -56);
        }
        return this.field5942 == arg3 && arg1 >= this.field5938 && this.field5949 >= arg1 && this.field5954 <= arg0 && this.field5947 >= arg0;
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(III)Z", line = 129)
    public final boolean method2558(int arg0, int arg1, int arg2) {
        field5952++;
        if (arg2 == 26642) {
            return arg1 >= this.field5948 && arg1 <= this.field5943 && arg0 >= this.field5941 && this.field5950 >= arg0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IBI)Z", line = 144)
    public final boolean method2559(int arg0, byte arg1, int arg2) {
        int var4 = 35 / ((14 - arg1) / 33);
        field5945++;
        return arg0 >= this.field5938 && this.field5949 >= arg0 && this.field5954 <= arg2 && arg2 <= this.field5947;
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(IIII)Z", line = 161)
    public static final boolean method2560(int arg0, int arg1, int arg2, int arg3) {
        field5939++;
        class481.field6661.method975(arg2, arg1, arg0, class280.field4139);
        int var4 = class280.field4139[2];
        if (var4 < 50) {
            return false;
        } else {
            class280.field4139[0] = class148.field2080 + (class280.field4139[0] * class566.field7575 / var4);
            class280.field4139[arg3] = class10.field168 + (class280.field4139[1] * class562.field7545 / var4);
            class280.field4139[2] = var4;
            return true;
        }
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(IIIIIIIII)V", line = 178)
    public class414(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field5942 = arg0;
        this.field5941 = arg6;
        this.field5954 = arg2;
        this.field5949 = arg3;
        this.field5948 = arg5;
        this.field5943 = arg7;
        this.field5950 = arg8;
        this.field5938 = arg1;
        this.field5947 = arg4;
    }
}
