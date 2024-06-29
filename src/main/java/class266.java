import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class266 {

    @OriginalMember(owner = "client!th", name = "c", descriptor = "F")
    public float field3397 = 0.25F;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "F")
    public float field3403 = 1.0F;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "F")
    public float field3412 = 1.0F;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public int field3399;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "F")
    public float field3410;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public int field3408;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public int field3401;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "F")
    public float field3398;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public int field3409;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public int field3407;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "F")
    public float field3396;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public int field3402;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "Lrn;")
    public class307 field3411;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "Lbv;")
    public static class568 field3405 = new class568();

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lge;I)V")
    public final void method1636(class551 arg0, int arg1) {
        if (arg1 != 0) {
            this.field3409 = -80;
        }
        this.field3403 = (float) (arg0.method3045(-125) * 8) / 255.0F;
        field3406++;
        this.field3397 = (float) (arg0.method3045(-126) * 8) / 255.0F;
        this.field3412 = (float) (arg0.method3045(arg1 ^ 0xFFFFFF81) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BLth;)Z")
    public final boolean method1637(byte arg0, class266 arg1) {
        field3395++;
        if (arg0 == -51) {
            return this.field3409 == arg1.field3409 && this.field3398 == arg1.field3398 && this.field3410 == arg1.field3410 && this.field3396 == arg1.field3396 && this.field3397 == arg1.field3397 && this.field3403 == arg1.field3403 && this.field3412 == arg1.field3412 && this.field3407 == arg1.field3407 && this.field3402 == arg1.field3402 && this.field3411 == arg1.field3411;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZZ)V")
    public static final void method1638(boolean arg0, boolean arg1) {
        class153.method831(class604.field8711, !arg0, arg1, class126.field1565, class502.field6955);
        if (!arg0) {
            field3405 = null;
        }
        field3400++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(JI)V")
    public static final void method1639(long arg0, int arg1) {
        field3404++;
        int var3 = -98 % ((arg1 - 10) / 53);
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static void method1640(int arg0) {
        if (arg0 != -1) {
            field3405 = null;
        }
        field3405 = null;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class266() {
        this.field3399 = -60;
        this.field3410 = 0.69921875F;
        this.field3408 = -50;
        this.field3401 = -50;
        this.field3398 = 1.1523438F;
        this.field3409 = class235.field3008;
        this.field3407 = class370.field5162;
        this.field3396 = 1.2F;
        this.field3402 = 0;
        this.field3411 = class449.field6353;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lge;)V")
    public class266(class551 arg0) {
        int var2 = arg0.method3045(-125);
        if (class501.field6954.method3152(-119, class428.field5845) && class453.field6425.method914() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field3409 = class235.field3008;
            } else {
                this.field3409 = arg0.method3048(-4);
            }
            if ((var2 & 0x2) == 0) {
                this.field3398 = 1.1523438F;
            } else {
                this.field3398 = (float) arg0.method3090(-124) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field3410 = 0.69921875F;
            } else {
                this.field3410 = (float) arg0.method3090(-114) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field3396 = 1.2F;
            } else {
                this.field3396 = (float) arg0.method3090(-121) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method3048(-4);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method3090(-81);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method3090(-125);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method3090(-106);
            }
            this.field3409 = class235.field3008;
            this.field3410 = 0.69921875F;
            this.field3398 = 1.1523438F;
            this.field3396 = 1.2F;
        }
        if ((var2 & 0x10) == 0) {
            this.field3408 = -50;
            this.field3399 = -60;
            this.field3401 = -50;
        } else {
            this.field3401 = arg0.method3087(true);
            this.field3399 = arg0.method3087(true);
            this.field3408 = arg0.method3087(true);
        }
        if ((var2 & 0x20) == 0) {
            this.field3407 = class370.field5162;
        } else {
            this.field3407 = arg0.method3048(-4);
        }
        if ((var2 & 0x40) == 0) {
            this.field3402 = 0;
        } else {
            this.field3402 = arg0.method3090(-104);
        }
        if ((var2 & 0x80) == 0) {
            this.field3411 = class449.field6353;
        } else {
            int var3 = arg0.method3090(-109);
            int var4 = arg0.method3090(-103);
            int var5 = arg0.method3090(-90);
            int var6 = arg0.method3090(-122);
            int var7 = arg0.method3090(-107);
            int var8 = arg0.method3090(-108);
            this.field3411 = class155.method839(var6, var7, var8, var4, var5, var3, -89);
        }
    }

    static {
        new class344("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
    }
}
