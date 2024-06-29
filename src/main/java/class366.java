import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class366 {

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "F")
    public float field5180 = 1.0F;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "F")
    public float field5187 = 0.25F;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "F")
    public float field5197 = 1.0F;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public int field5193;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "F")
    public float field5181;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public int field5195;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public int field5184;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Lkk;")
    public class149 field5185;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public int field5192;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public int field5191;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public int field5183;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "F")
    public float field5186;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "F")
    public float field5188;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "Lbv;")
    public static class567 field5189 = new class567(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "Lgp;")
    public static class561 field5196;

    static {
        new class567("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Loh;I)V", line = 5)
    public static final void method2208(class549 arg0, int arg1) {
        field5179++;
        if (arg1 != 256) {
            field5189 = null;
        }
        if (class72.field1358 != arg0.field7662) {
            return;
        }
        if (class644.field9367.field5958 == null) {
            arg0.field7696 = 0;
            arg0.field7649 = 0;
            return;
        }
        arg0.field7781 = 150;
        arg0.field7660 = (int) (Math.sin((double) class310.field4553 / 40.0D) * 256.0D) & 0x7FF;
        arg0.field7649 = class323.field4670;
        arg0.field7763 = 5;
        arg0.field7696 = class616.method3492(class644.field9367.field5958, (byte) 116);
        arg0.field7712 = class644.field9367.field1477;
        arg0.field7705 = class644.field9367.field1531;
        arg0.field7632 = class644.field9367.field1505;
        arg0.field7664 = 0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIZJIILjava/lang/String;ZLjava/lang/String;)V", line = 39)
    public static final void method2209(int arg0, int arg1, int arg2, int arg3, boolean arg4, long arg5, int arg6, int arg7, String arg8, boolean arg9, String arg10) {
        field5190++;
        if (!class2.field20 && class480.field6825 < 500) {
            int var12 = arg0 == arg6 ? class185.field2692 : arg0;
            class587 var13 = new class587(arg8, arg10, var12, arg2, arg3, arg5, arg7, arg1, arg4, arg9);
            class432.field6356.method414(var13, (byte) 98);
            class480.field6825++;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V", line = 167)
    public class366() {
        this.field5193 = -50;
        this.field5181 = 1.1523438F;
        this.field5195 = 0;
        this.field5184 = -50;
        this.field5185 = class139.field2188;
        this.field5192 = class616.field8714;
        this.field5191 = class274.field3997;
        this.field5183 = -60;
        this.field5186 = 1.2F;
        this.field5188 = 0.69921875F;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lco;)V", line = 183)
    public class366(class268 arg0) {
        int var2 = arg0.method1738(255);
        if (class202.field2854.method3140(class646.field9388, 2) && class134.field2161.method612() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field5192 = class616.field8714;
            } else {
                this.field5192 = arg0.method1748(-100);
            }
            if ((var2 & 0x2) == 0) {
                this.field5181 = 1.1523438F;
            } else {
                this.field5181 = (float) arg0.method1745(32132) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field5188 = 0.69921875F;
            } else {
                this.field5188 = (float) arg0.method1745(32132) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field5186 = 1.2F;
            } else {
                this.field5186 = (float) arg0.method1745(32132) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1748(100);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1745(32132);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1745(32132);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1745(32132);
            }
            this.field5181 = 1.1523438F;
            this.field5186 = 1.2F;
            this.field5188 = 0.69921875F;
            this.field5192 = class616.field8714;
        }
        if ((var2 & 0x10) == 0) {
            this.field5193 = -50;
            this.field5184 = -50;
            this.field5183 = -60;
        } else {
            this.field5184 = arg0.method1730(13436);
            this.field5183 = arg0.method1730(13436);
            this.field5193 = arg0.method1730(13436);
        }
        if ((var2 & 0x20) == 0) {
            this.field5191 = class274.field3997;
        } else {
            this.field5191 = arg0.method1748(80);
        }
        if ((var2 & 0x40) == 0) {
            this.field5195 = 0;
        } else {
            this.field5195 = arg0.method1745(32132);
        }
        if ((var2 & 0x80) == 0) {
            this.field5185 = class139.field2188;
        } else {
            int var3 = arg0.method1745(32132);
            int var4 = arg0.method1745(32132);
            int var5 = arg0.method1745(32132);
            int var6 = arg0.method1745(32132);
            int var7 = arg0.method1745(32132);
            int var8 = arg0.method1745(32132);
            this.field5185 = class151.method1080(var4, var5, var7, var3, (byte) 60, var6, var8);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 63)
    public static final Class method2210(int arg0, String arg1) throws ClassNotFoundException {
        field5194++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg0 == 150) {
            return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 113)
    public static void method2211(int arg0) {
        field5189 = null;
        field5196 = null;
        if (arg0 != 30259) {
            method2211(-23);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLpb;)Z", line = 127)
    public final boolean method2212(byte arg0, class366 arg1) {
        if (arg0 != -39) {
            this.field5185 = null;
        }
        field5178++;
        return this.field5192 == arg1.field5192 && this.field5181 == arg1.field5181 && this.field5188 == arg1.field5188 && this.field5186 == arg1.field5186 && this.field5187 == arg1.field5187 && this.field5180 == arg1.field5180 && this.field5197 == arg1.field5197 && this.field5191 == arg1.field5191 && this.field5195 == arg1.field5195 && this.field5185 == arg1.field5185;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lco;B)V", line = 145)
    public final void method2213(class268 arg0, byte arg1) {
        int var3 = 87 % ((arg1 + 72) / 41);
        this.field5180 = (float) (arg0.method1738(255) * 8) / 255.0F;
        field5182++;
        this.field5187 = (float) (arg0.method1738(255) * 8) / 255.0F;
        this.field5197 = (float) (arg0.method1738(255) * 8) / 255.0F;
    }
}
