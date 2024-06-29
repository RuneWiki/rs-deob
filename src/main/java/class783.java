import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class783 {

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "F")
    public float field10743 = 0.25F;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "F")
    public float field10741 = 1.0F;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "F")
    public float field10755 = 1.0F;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "F")
    public float field10742;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public int field10745;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public int field10749;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "F")
    public float field10751;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public int field10752;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public int field10750;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public int field10756;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "Lok;")
    public class255 field10757;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public int field10758;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "F")
    public float field10747;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field10746 = 1;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field10748 = 0;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field10744;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field10753;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field10754;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILgga;)V")
    public final void method4302(int arg0, class511 arg1) {
        field10754++;
        if (arg0 > -54) {
            field10746 = -118;
        }
        this.field10741 = (float) (arg1.method3013(-128) * 8) / 255.0F;
        this.field10743 = (float) (arg1.method3013(-97) * 8) / 255.0F;
        this.field10755 = (float) (arg1.method3013(38) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILqf;)Z")
    public final boolean method4303(int arg0, class783 arg1) {
        field10744++;
        int var3 = -126 / ((arg0 - 10) / 56);
        return this.field10745 == arg1.field10745 && this.field10751 == arg1.field10751 && this.field10742 == arg1.field10742 && this.field10747 == arg1.field10747 && this.field10743 == arg1.field10743 && this.field10741 == arg1.field10741 && this.field10755 == arg1.field10755 && this.field10756 == arg1.field10756 && this.field10749 == arg1.field10749 && this.field10757 == arg1.field10757;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Laaa;Z)V")
    public static final void method4304(class253 arg0, boolean arg1) {
        for (int var2 = arg0.field3745; var2 <= arg0.field3754; var2++) {
            for (int var3 = arg0.field3758; var3 <= arg0.field3755; var3++) {
                class472 var4 = class59.field688[arg0.field3467][var2][var3];
                if (var4 != null) {
                    class44 var5 = var4.field6551;
                    class44 var6 = null;
                    while (var5 != null) {
                        if (var5.field465 == arg0) {
                            if (var6 == null) {
                                var4.field6551 = var5.field466;
                            } else {
                                var6.field466 = var5.field466;
                            }
                            var5.method347(-1);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field466;
                    }
                }
            }
        }
        if (!arg1) {
            class543.method3219(arg0);
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class783() {
        this.field10742 = 0.69921875F;
        this.field10745 = class5.field31;
        this.field10749 = 0;
        this.field10751 = 1.1523438F;
        this.field10752 = -60;
        this.field10750 = -50;
        this.field10756 = class248.field3697;
        this.field10757 = class194.field2513;
        this.field10758 = -50;
        this.field10747 = 1.2F;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lgga;)V")
    public class783(class511 arg0) {
        int var2 = arg0.method3013(-3);
        if (class688.field9602.field8528.method677((byte) -98) == 1 && client.field1307.method143() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field10745 = class5.field31;
            } else {
                this.field10745 = arg0.method3008(64);
            }
            if ((var2 & 0x2) == 0) {
                this.field10751 = 1.1523438F;
            } else {
                this.field10751 = (float) arg0.method3002(-1) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field10742 = 0.69921875F;
            } else {
                this.field10742 = (float) arg0.method3002(-1) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field10747 = 1.2F;
            } else {
                this.field10747 = (float) arg0.method3002(-1) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method3008(64);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method3002(-1);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method3002(-1);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method3002(-1);
            }
            this.field10747 = 1.2F;
            this.field10742 = 0.69921875F;
            this.field10745 = class5.field31;
            this.field10751 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field10752 = -60;
            this.field10758 = -50;
            this.field10750 = -50;
        } else {
            this.field10750 = arg0.method3034(1);
            this.field10752 = arg0.method3034(1);
            this.field10758 = arg0.method3034(1);
        }
        if ((var2 & 0x20) == 0) {
            this.field10756 = class248.field3697;
        } else {
            this.field10756 = arg0.method3008(64);
        }
        if ((var2 & 0x40) == 0) {
            this.field10749 = 0;
        } else {
            this.field10749 = arg0.method3002(-1);
        }
        if ((var2 & 0x80) == 0) {
            this.field10757 = class194.field2513;
        } else {
            int var3 = arg0.method3002(-1);
            int var4 = arg0.method3002(-1);
            int var5 = arg0.method3002(-1);
            int var6 = arg0.method3002(-1);
            int var7 = arg0.method3002(-1);
            int var8 = arg0.method3002(-1);
            this.field10757 = class459.method2762(var6, var4, var7, var8, var5, var3, -124);
        }
    }
}
