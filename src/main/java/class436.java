import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class436 {

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public int field6580 = -1;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    private int field6574 = 0;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public int field6583 = 128;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "Z")
    public boolean field6581 = true;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "Lbi;")
    public static class104 field6585;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "F")
    public static float field6586;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public int field6572;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public int field6575;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public int field6576;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public int field6578;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "Ldl;")
    public static class48 field6588;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V")
    public static void method2744(boolean arg0) {
        field6588 = null;
        field6585 = null;
        if (!arg0) {
            field6585 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBLhw;)V")
    private final void method2745(int arg0, byte arg1, class208 arg2) {
        if (arg1 != 105) {
            this.field6575 = 31;
        }
        field6579++;
        if (arg0 == 1) {
            this.field6574 = arg2.method1452(3);
            this.method2749(this.field6574, 255);
        } else if (arg0 == 2) {
            this.field6580 = arg2.method1455(-3387);
            if (this.field6580 == 65535) {
                this.field6580 = -1;
            }
        } else if (arg0 == 3) {
            this.field6583 = arg2.method1455(-3387) << 0;
        } else if (arg0 == 4) {
            this.field6581 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lhw;Z)V")
    public final void method2746(class208 arg0, boolean arg1) {
        if (!arg1) {
            method2748(null, -36);
        }
        while (true) {
            int var3 = arg0.method1445(-98);
            if (var3 == 0) {
                field6573++;
                return;
            }
            this.method2745(var3, (byte) 105, arg0);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static final void method2747(int arg0) {
        class307.field4813.method1301(((float) class141.field1911.field6114 * 0.1F + 0.7F) * 1.1523438F);
        field6577++;
        class307.field4813.method1249(class386.field5902, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        class307.field4813.method1297(class271.field4323, -1, 256);
        class307.field4813.method1252(class141.field1909);
        if (arg0 > -71) {
            field6585 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lgi;I)V")
    public static final void method2748(class437 arg0, int arg1) {
        field6584++;
        if (arg1 <= 73) {
            field6588 = null;
        }
        if (class257.field4154 != arg0.field6688) {
            return;
        }
        if (class358.field5565.field5443 == null) {
            arg0.field6755 = 0;
            arg0.field6731 = 0;
            return;
        }
        arg0.field6670 = 150;
        arg0.field6695 = (int) (Math.sin((double) class88.field1278 / 40.0D) * 256.0D) & 0x7FF;
        arg0.field6755 = class528.field7772;
        arg0.field6608 = 5;
        arg0.field6731 = class479.method2964((byte) 113, class358.field5565.field5443);
        arg0.field6659 = class358.field5565.field831;
        arg0.field6605 = class358.field5565.field837;
        arg0.field6610 = 0;
        arg0.field6621 = class358.field5565.field883;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)V")
    private final void method2749(int arg0, int arg1) {
        field6582++;
        double var3 = (double) ((arg0 & 0xFF92B1) >> 16) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & arg0) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        this.field6572 = (int) (var17 * 256.0D);
        this.field6576 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field6572 < 0) {
            this.field6572 = 0;
        } else if (this.field6572 > 255) {
            this.field6572 = 255;
        }
        if (this.field6576 < 0) {
            this.field6576 = 0;
        } else if (this.field6576 > 255) {
            this.field6576 = 255;
        }
        if (var17 > 0.5D) {
            this.field6575 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field6575 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field6575 < 1) {
            this.field6575 = 1;
        }
        this.field6578 = (int) ((double) this.field6575 * var19);
    }

    static {
        new class213("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field6585 = new class104(3, 7);
        field6587 = -1;
    }
}
