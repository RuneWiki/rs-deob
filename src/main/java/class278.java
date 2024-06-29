import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class278 {

    @OriginalMember(owner = "client!jda", name = "k", descriptor = "F")
    public float field4134 = 1.0F;

    @OriginalMember(owner = "client!jda", name = "o", descriptor = "F")
    public float field4138 = 1.0F;

    @OriginalMember(owner = "client!jda", name = "l", descriptor = "F")
    public float field4135 = 0.25F;

    @OriginalMember(owner = "client!jda", name = "t", descriptor = "I")
    public int field4143;

    @OriginalMember(owner = "client!jda", name = "s", descriptor = "I")
    public int field4142;

    @OriginalMember(owner = "client!jda", name = "g", descriptor = "I")
    public int field4130;

    @OriginalMember(owner = "client!jda", name = "f", descriptor = "F")
    public float field4129;

    @OriginalMember(owner = "client!jda", name = "q", descriptor = "F")
    public float field4140;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "I")
    public int field4124;

    @OriginalMember(owner = "client!jda", name = "h", descriptor = "I")
    public int field4131;

    @OriginalMember(owner = "client!jda", name = "n", descriptor = "Llh;")
    public class125 field4137;

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "F")
    public float field4125;

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "I")
    public int field4126;

    @OriginalMember(owner = "client!jda", name = "j", descriptor = "[I")
    public static int[] field4133 = new int[2];

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "Lqp;")
    public static class586 field4127 = new class586(7, 7);

    @OriginalMember(owner = "client!jda", name = "r", descriptor = "Lnj;")
    public static class487 field4141 = new class487(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!jda", name = "u", descriptor = "Lqu;")
    public static class364 field4144 = new class364(41, -1);

    @OriginalMember(owner = "client!jda", name = "e", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!jda", name = "m", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!jda", name = "p", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!jda", name = "i", descriptor = "Ldda;")
    public static class597 field4132;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)V", line = 7)
    public static void method1753(int arg0) {
        field4127 = null;
        field4133 = null;
        int var1 = 24 / ((arg0 - 60) / 50);
        field4141 = null;
        field4132 = null;
        field4144 = null;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(BLed;IILr;I)V", line = 24)
    public static final void method1754(byte arg0, class115 arg1, int arg2, int arg3, class520 arg4, int arg5) {
        field4139++;
        if (arg4 != null) {
            arg1.method706(arg4.method1986(), arg2, arg4.method1982(), arg4.method1954(), arg4.method1971(), false, arg3, arg4.method1958(), arg4.method1981(), arg5, arg4.method1968());
            if (arg0 != 53) {
                method1753(6);
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lps;I)V", line = 46)
    public final void method1755(class428 arg0, int arg1) {
        field4136++;
        this.field4134 = (float) (arg0.method2561((byte) 112) * 8) / 255.0F;
        this.field4135 = (float) (arg1 * arg0.method2561((byte) 122)) / 255.0F;
        this.field4138 = (float) (arg0.method2561((byte) -44) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "()V", line = 95)
    public class278() {
        this.field4143 = class239.field3492;
        this.field4142 = -60;
        this.field4130 = -50;
        this.field4129 = 0.69921875F;
        this.field4140 = 1.1523438F;
        this.field4124 = 0;
        this.field4131 = class228.field3347;
        this.field4137 = class445.field6487;
        this.field4125 = 1.2F;
        this.field4126 = -50;
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Lps;)V", line = 111)
    public class278(class428 arg0) {
        int var2 = arg0.method2561((byte) 126);
        if (class94.field1158.method130(-27423, class239.field3499) && class604.field8896.method994() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field4131 = class228.field3347;
            } else {
                this.field4131 = arg0.method2589(-11179);
            }
            if ((var2 & 0x2) == 0) {
                this.field4140 = 1.1523438F;
            } else {
                this.field4140 = (float) arg0.method2620(21) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field4129 = 0.69921875F;
            } else {
                this.field4129 = (float) arg0.method2620(84) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field4125 = 1.2F;
            } else {
                this.field4125 = (float) arg0.method2620(103) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2589(-11179);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2620(68);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2620(107);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2620(34);
            }
            this.field4129 = 0.69921875F;
            this.field4140 = 1.1523438F;
            this.field4131 = class228.field3347;
            this.field4125 = 1.2F;
        }
        if ((var2 & 0x10) == 0) {
            this.field4142 = -60;
            this.field4130 = -50;
            this.field4126 = -50;
        } else {
            this.field4130 = arg0.method2622((byte) 126);
            this.field4142 = arg0.method2622((byte) 127);
            this.field4126 = arg0.method2622((byte) 124);
        }
        if ((var2 & 0x20) == 0) {
            this.field4143 = class239.field3492;
        } else {
            this.field4143 = arg0.method2589(-11179);
        }
        if ((var2 & 0x40) == 0) {
            this.field4124 = 0;
        } else {
            this.field4124 = arg0.method2620(15);
        }
        if ((var2 & 0x80) == 0) {
            this.field4137 = class445.field6487;
        } else {
            int var3 = arg0.method2620(84);
            int var4 = arg0.method2620(79);
            int var5 = arg0.method2620(79);
            int var6 = arg0.method2620(96);
            int var7 = arg0.method2620(102);
            int var8 = arg0.method2620(107);
            this.field4137 = class21.method97(var3, var5, var7, var6, var8, var4, (byte) -97);
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILjda;)Z", line = 65)
    public final boolean method1756(int arg0, class278 arg1) {
        field4128++;
        if (arg0 != 2) {
            this.field4135 = 1.3849803F;
        }
        return this.field4131 == arg1.field4131 && this.field4140 == arg1.field4140 && this.field4129 == arg1.field4129 && this.field4125 == arg1.field4125 && this.field4135 == arg1.field4135 && this.field4134 == arg1.field4134 && this.field4138 == arg1.field4138 && this.field4143 == arg1.field4143 && this.field4124 == arg1.field4124 && this.field4137 == arg1.field4137;
    }
}
