import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class486 {

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "F")
    public float field7203 = 1.0F;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "F")
    public float field7199 = 1.0F;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "F")
    public float field7206 = 0.25F;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "F")
    public float field7192;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public int field7197;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "F")
    public float field7189;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public int field7193;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public int field7196;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public int field7201;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Llo;")
    public class539 field7191;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "F")
    public float field7202;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public int field7204;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public int field7190;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field7200 = 0;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field7194;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field7198;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method2909(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class10.field179 = arg0;
        class264.field3697 = 0x1 << class10.field179;
        class251.field3501 = class264.field3697 >> 1;
        class448.field6749 = (int) Math.sqrt((double) (class251.field3501 * class251.field3501 + class251.field3501 * class251.field3501));
        class430.field6554 = class264.field3697 >> 2;
        class32.field468 = class264.field3697;
        class533.field7842 = arg2;
        class475.field7051 = arg3;
        class28.field408 = arg4;
        class453.field6825 = new class452[arg1][class533.field7842][class475.field7051];
        class414.field6317 = new class23[arg1];
        if (arg5) {
            class374.field5693 = new int[class533.field7842][class475.field7051];
            class113.field1574 = new byte[class533.field7842][class475.field7051];
            class236.field3344 = new short[class533.field7842][class475.field7051];
            class35.field516 = new class452[1][class533.field7842][class475.field7051];
            class71.field988 = new class23[1];
        } else {
            class374.field5693 = null;
            class113.field1574 = null;
            class236.field3344 = null;
            class35.field516 = null;
            class71.field988 = null;
        }
        if (arg6) {
            class411.field6251 = new long[arg1][arg2][arg3];
            class514.field7556 = new class189[65535];
            class375.field5703 = new boolean[65535];
            class401.field6115 = 0;
        } else {
            class411.field6251 = null;
            class514.field7556 = null;
            class375.field5703 = null;
            class401.field6115 = 0;
        }
        class300.method1906(false);
        class306.field4446 = new class370[1000];
        class526.field7715 = 0;
        class194.field2601 = new class370[1000];
        class300.field4404 = 0;
        class162.field2116 = new int[arg1][class533.field7842 + 1][class475.field7051 + 1];
        class1.field8 = new class140[5000];
        class527.field7728 = 0;
        class203.field2720 = new boolean[class28.field408 + class28.field408 + 1][class28.field408 + class28.field408 + 1];
        class474.field7039 = new boolean[class28.field408 + class28.field408 + 2][class28.field408 + class28.field408 + 2];
        class463.field6923 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lcf;ZZI)V")
    public static final void method2910(class436 arg0, boolean arg1, boolean arg2, int arg3) {
        field7205++;
        int var4 = arg0.field6598;
        int var5 = (int) arg0.field35;
        arg0.method25(-13489);
        if (arg2) {
            class138.method927((byte) 120, var4);
        }
        class84.method575(var4, (byte) -57);
        class282 var6 = class21.method194(-126, var5);
        if (var6 != null) {
            class206.method1385(arg3 ^ 0x2, var6);
        }
        class184.method1246((byte) -55);
        if (!arg1 && class337.field5232 != -1) {
            class480.method2853(false, class337.field5232, 1);
        }
        class353 var7 = new class353(class312.field4570);
        for (class436 var8 = (class436) var7.method2265(arg3); var8 != null; var8 = (class436) var7.method2269(0)) {
            if (!var8.method24(arg3 ^ 0xFFFF9BEE)) {
                var8 = (class436) var7.method2265(0);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field6603 == 3) {
                int var9 = (int) var8.field35;
                if ((var9 >>> 16) == var4) {
                    method2910(var8, arg1, true, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILee;)Z")
    public final boolean method2911(int arg0, class486 arg1) {
        if (arg0 != 8) {
            this.field7190 = 114;
        }
        field7198++;
        return this.field7193 == arg1.field7193 && this.field7192 == arg1.field7192 && this.field7202 == arg1.field7202 && this.field7189 == arg1.field7189 && this.field7206 == arg1.field7206 && this.field7203 == arg1.field7203 && this.field7199 == arg1.field7199 && this.field7196 == arg1.field7196 && this.field7204 == arg1.field7204 && this.field7191 == arg1.field7191;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lnj;B)V")
    public final void method2912(class164 arg0, byte arg1) {
        field7195++;
        if (arg1 != 33) {
            this.field7197 = 0;
        }
        this.field7203 = (float) (arg0.method1087(false) * 8) / 255.0F;
        this.field7206 = (float) (arg0.method1087(false) * 8) / 255.0F;
        this.field7199 = (float) (arg0.method1087(false) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class486() {
        this.field7192 = 1.1523438F;
        this.field7197 = -50;
        this.field7189 = 1.2F;
        this.field7193 = class1.field7;
        this.field7196 = class27.field385;
        this.field7201 = -50;
        this.field7191 = class230.field3296;
        this.field7202 = 0.69921875F;
        this.field7204 = 0;
        this.field7190 = -60;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lnj;)V")
    public class486(class164 arg0) {
        int var2 = arg0.method1087(false);
        if (class203.field2716.method549((byte) -123, class378.field5771) && class456.field6845.method811() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field7193 = class1.field7;
            } else {
                this.field7193 = arg0.method1099(45);
            }
            if ((var2 & 0x2) == 0) {
                this.field7192 = 1.1523438F;
            } else {
                this.field7192 = (float) arg0.method1074(-635989152) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field7202 = 0.69921875F;
            } else {
                this.field7202 = (float) arg0.method1074(-635989152) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field7189 = 1.2F;
            } else {
                this.field7189 = (float) arg0.method1074(-635989152) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1099(-128);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1074(-635989152);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1074(-635989152);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1074(-635989152);
            }
            this.field7202 = 0.69921875F;
            this.field7192 = 1.1523438F;
            this.field7193 = class1.field7;
            this.field7189 = 1.2F;
        }
        if ((var2 & 0x10) == 0) {
            this.field7190 = -60;
            this.field7201 = -50;
            this.field7197 = -50;
        } else {
            this.field7201 = arg0.method1056(1024);
            this.field7190 = arg0.method1056(1024);
            this.field7197 = arg0.method1056(1024);
        }
        if ((var2 & 0x20) == 0) {
            this.field7196 = class27.field385;
        } else {
            this.field7196 = arg0.method1099(70);
        }
        if ((var2 & 0x40) == 0) {
            this.field7204 = 0;
        } else {
            this.field7204 = arg0.method1074(-635989152);
        }
        if ((var2 & 0x80) == 0) {
            this.field7191 = class230.field3296;
        } else {
            int var3 = arg0.method1074(-635989152);
            int var4 = arg0.method1074(-635989152);
            int var5 = arg0.method1074(-635989152);
            int var6 = arg0.method1074(-635989152);
            int var7 = arg0.method1074(-635989152);
            int var8 = arg0.method1074(-635989152);
            this.field7191 = class419.method2561(false, var7, var4, var5, var3, var8, var6);
        }
    }
}
