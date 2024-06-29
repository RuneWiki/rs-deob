import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class234 {

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "F")
    public float field3467 = 0.25F;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "F")
    public float field3468 = 1.0F;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "F")
    public float field3472 = 1.0F;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public int field3469;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    public int field3484;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public int field3479;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public int field3478;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "F")
    public float field3465;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public int field3475;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "F")
    public float field3471;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Ltl;")
    public class436 field3476;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "F")
    public float field3464;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public int field3474;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Lri;")
    public static class73 field3466 = new class73(2, 6);

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "Lso;")
    public static class327 field3483 = new class327(9, 7);

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "[[B")
    public static byte[][] field3482;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static final void method1592(int arg0) {
        if (arg0 != -1) {
            method1593(0.89634985F, -0.35849828F, -4, -1.4954356F);
        }
        field3480++;
        class499.field7355 = new class123();
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(FFIF)F")
    public static final float method1593(float arg0, float arg1, int arg2, float arg3) {
        if (arg2 != -14002) {
            field3466 = null;
        }
        field3470++;
        return (arg1 - arg0) * arg3 + arg0;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ldh;I)V")
    public final void method1594(class209 arg0, int arg1) {
        if (arg1 != 0) {
            this.field3476 = null;
        }
        field3477++;
        this.field3472 = (float) (arg0.method1428(32122) * 8) / 255.0F;
        this.field3467 = (float) (arg0.method1428(arg1 ^ 0x7D7A) * 8) / 255.0F;
        this.field3468 = (float) (arg0.method1428(32122) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILrb;)Z")
    public final boolean method1595(int arg0, class234 arg1) {
        field3481++;
        if (arg0 == 128) {
            return this.field3475 == arg1.field3475 && this.field3471 == arg1.field3471 && this.field3464 == arg1.field3464 && this.field3465 == arg1.field3465 && this.field3467 == arg1.field3467 && this.field3472 == arg1.field3472 && this.field3468 == arg1.field3468 && this.field3478 == arg1.field3478 && this.field3479 == arg1.field3479 && this.field3476 == arg1.field3476;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILjava/lang/Object;I)[B")
    public static final byte[] method1596(int arg0, int arg1, Object arg2, int arg3) {
        field3473++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var4 = (byte[]) arg2;
            return class90.method525(false, arg1, arg0, var4);
        } else if (arg2 instanceof class91) {
            class91 var5 = (class91) arg2;
            return var5.method527(-36, arg0, arg1);
        } else if (arg3 <= 53) {
            return null;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public static void method1597(int arg0) {
        if (arg0 <= -16) {
            field3466 = null;
            field3483 = null;
            field3482 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class234() {
        this.field3469 = -60;
        this.field3484 = -50;
        this.field3479 = 0;
        this.field3478 = class26.field279;
        this.field3465 = 1.2F;
        this.field3475 = class241.field3562;
        this.field3471 = 1.1523438F;
        this.field3476 = class251.field3732;
        this.field3464 = 0.69921875F;
        this.field3474 = -50;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Ldh;)V")
    public class234(class209 arg0) {
        int var2 = arg0.method1428(32122);
        if (class426.field6401.method392(-2, class170.field2529) && class33.field345.method1056() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field3475 = class241.field3562;
            } else {
                this.field3475 = arg0.method1452(65280);
            }
            if ((var2 & 0x2) == 0) {
                this.field3471 = 1.1523438F;
            } else {
                this.field3471 = (float) arg0.method1450((byte) 121) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field3464 = 0.69921875F;
            } else {
                this.field3464 = (float) arg0.method1450((byte) 94) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field3465 = 1.2F;
            } else {
                this.field3465 = (float) arg0.method1450((byte) 98) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1452(65280);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1450((byte) 54);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1450((byte) 40);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1450((byte) 34);
            }
            this.field3475 = class241.field3562;
            this.field3465 = 1.2F;
            this.field3464 = 0.69921875F;
            this.field3471 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field3469 = -60;
            this.field3474 = -50;
            this.field3484 = -50;
        } else {
            this.field3474 = arg0.method1447(29480);
            this.field3469 = arg0.method1447(29480);
            this.field3484 = arg0.method1447(29480);
        }
        if ((var2 & 0x20) == 0) {
            this.field3478 = class26.field279;
        } else {
            this.field3478 = arg0.method1452(65280);
        }
        if ((var2 & 0x40) == 0) {
            this.field3479 = 0;
        } else {
            this.field3479 = arg0.method1450((byte) 44);
        }
        if ((var2 & 0x80) == 0) {
            this.field3476 = class251.field3732;
        } else {
            int var3 = arg0.method1450((byte) 120);
            int var4 = arg0.method1450((byte) 62);
            int var5 = arg0.method1450((byte) 73);
            int var6 = arg0.method1450((byte) 70);
            int var7 = arg0.method1450((byte) 59);
            int var8 = arg0.method1450((byte) 122);
            this.field3476 = class522.method3095(var6, var3, -98, var5, var4, var7, var8);
        }
    }
}
