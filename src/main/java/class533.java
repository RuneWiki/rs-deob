import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class533 extends class577 {

    @OriginalMember(owner = "client!mq", name = "o", descriptor = "I")
    public int field7697;

    @OriginalMember(owner = "client!mq", name = "w", descriptor = "I")
    private int field7705;

    @OriginalMember(owner = "client!mq", name = "z", descriptor = "I")
    public int field7708;

    @OriginalMember(owner = "client!mq", name = "p", descriptor = "I")
    public int field7698;

    @OriginalMember(owner = "client!mq", name = "x", descriptor = "I")
    public int field7706;

    @OriginalMember(owner = "client!mq", name = "q", descriptor = "I")
    private int field7699;

    @OriginalMember(owner = "client!mq", name = "s", descriptor = "I")
    private int field7701;

    @OriginalMember(owner = "client!mq", name = "n", descriptor = "I")
    private int field7696;

    @OriginalMember(owner = "client!mq", name = "B", descriptor = "I")
    private int field7710;

    @OriginalMember(owner = "client!mq", name = "l", descriptor = "I")
    public static int field7694;

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
    public static int field7695;

    @OriginalMember(owner = "client!mq", name = "r", descriptor = "I")
    public static int field7700;

    @OriginalMember(owner = "client!mq", name = "t", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!mq", name = "u", descriptor = "I")
    public static int field7703;

    @OriginalMember(owner = "client!mq", name = "v", descriptor = "I")
    public static int field7704;

    @OriginalMember(owner = "client!mq", name = "y", descriptor = "I")
    public static int field7707;

    @OriginalMember(owner = "client!mq", name = "A", descriptor = "I")
    public static int field7709;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 3)
    public static final void method3211(String arg0, boolean arg1) {
        field7704++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class663.method3782((byte) 75, arg0);
        if (var2 == null || arg1) {
            return;
        }
        for (int var3 = 0; var3 < class47.field600; var3++) {
            String var4 = class646.field9032[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class663.method3782((byte) 75, var4);
            if (var5 != null && var5.equals(var2)) {
                class47.field600--;
                for (int var6 = var3; var6 < class47.field600; var6++) {
                    class646.field9032[var6] = class646.field9032[var6 + 1];
                    class31.field431[var6] = class31.field431[var6 + 1];
                    class758.field10440[var6] = class758.field10440[var6 + 1];
                    class550.field7910[var6] = class550.field7910[var6 + 1];
                    class270.field3916[var6] = class270.field3916[var6 + 1];
                }
                class209.field3236++;
                class493.field6979 = class366.field5096;
                class312 var7 = class353.method2245(class87.field971, class126.field1949, (byte) 84);
                var7.field4445.method2952(0, class348.method2204((byte) -82, arg0));
                var7.field4445.method2953(arg0, -28136);
                class208.method1440(var7, 55);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B[III)V", line = 69)
    public final void method3212(byte arg0, int[] arg1, int arg2, int arg3) {
        field7703++;
        if (arg0 >= -66) {
            method3211(null, false);
        }
        arg1[0] = 0;
        arg1[2] = this.field7697 - (this.field7710 - arg2);
        arg1[1] = arg3 - (this.field7701 - this.field7698);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V", line = 82)
    public static final void method3213(int arg0) {
        if (arg0 != -5846) {
            return;
        }
        field7709++;
        if (class776.field10667 == null) {
            return;
        }
        if (class776.field10667.field2089 == 1) {
            class776.field10667 = null;
            return;
        }
        if (class776.field10667.field2089 == 2) {
            class433.method2591(class370.field5131, 2, class210.field3249, -19);
            class776.field10667 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(BILmea;I)V", line = 115)
    public static final void method3214(byte arg0, int arg1, class451 arg2, int arg3) {
        int var4 = 113 / ((-arg0 - 62) / 54);
        field7707++;
        class511 var5 = arg2.method2685(class37.field491, (byte) -85);
        if (var5 == null) {
            return;
        }
        class37.field491.method434(arg3, arg1, arg2.field6290 + arg3, arg2.field6288 + arg1);
        if (class760.field10484 < 3) {
            class488.field6897.method1608((float) arg2.field6290 / 2.0F + (float) arg3, (float) arg2.field6288 / 2.0F + (float) arg1, 4096, (int) (-class758.field10460) & 0x3FFF << 2, var5, arg3, arg1);
        } else {
            class37.field491.method490(-16777216, var5, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIII)Z", line = 147)
    public final boolean method3215(int arg0, int arg1, int arg2, int arg3) {
        field7694++;
        int var5 = -32 % ((44 - arg3) / 57);
        return this.field7699 == arg0 && arg1 >= this.field7701 && this.field7705 >= arg1 && this.field7710 <= arg2 && this.field7696 >= arg2;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I[III)V", line = 161)
    public final void method3216(int arg0, int[] arg1, int arg2, int arg3) {
        field7700++;
        arg1[2] = this.field7710 + arg3 - this.field7697;
        arg1[1] = arg2 + this.field7701 - this.field7698;
        arg1[0] = this.field7699;
        int var5 = -3 / ((arg0 + 16) / 46);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(III)Z", line = 173)
    public final boolean method3217(int arg0, int arg1, int arg2) {
        field7695++;
        if (arg0 != 2) {
            this.method3212((byte) -71, null, -13, 110);
        }
        return arg1 >= this.field7701 && arg1 <= this.field7705 && this.field7710 <= arg2 && arg2 <= this.field7696;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IBI)Z", line = 190)
    public final boolean method3218(int arg0, byte arg1, int arg2) {
        if (arg1 < 87) {
            this.field7701 = 29;
        }
        field7702++;
        return this.field7698 <= arg0 && arg0 <= this.field7706 && arg2 >= this.field7697 && this.field7708 >= arg2;
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(IIIIIIIII)V", line = 210)
    public class533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field7697 = arg6;
        this.field7705 = arg3;
        this.field7708 = arg8;
        this.field7698 = arg5;
        this.field7706 = arg7;
        this.field7699 = arg0;
        this.field7701 = arg1;
        this.field7696 = arg4;
        this.field7710 = arg2;
    }
}
