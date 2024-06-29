import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class269 implements Runnable {

    @OriginalMember(owner = "client!br", name = "e", descriptor = "Lcn;")
    private class356 field3710 = new class356();

    @OriginalMember(owner = "client!br", name = "g", descriptor = "I")
    public int field3712 = 0;

    @OriginalMember(owner = "client!br", name = "k", descriptor = "Z")
    private boolean field3716 = false;

    @OriginalMember(owner = "client!br", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field3718;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "[I")
    public static int[] field3709;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "Lar;")
    public static class479 field3717;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3719;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!br", name = "f", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!br", name = "h", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!br", name = "i", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!br", name = "j", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!br", name = "o", descriptor = "Lmg;")
    public static class101 field3720;

    @OriginalMember(owner = "client!br", name = "p", descriptor = "Lya;")
    public static class38 field3721;

    static {
        new class466("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
        field3709 = new int[99];
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field3709[var1] = var0 / 4;
        }
        field3717 = new class479();
        field3719 = new Color[] { new Color(16777215), new Color(16777215) };
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IB[BLva;)Lmo;", line = 5)
    public final class526 method1605(int arg0, byte arg1, byte[] arg2, class343 arg3) {
        field3713++;
        class526 var5 = new class526();
        var5.field115 = arg0;
        var5.field7790 = arg2;
        var5.field2600 = false;
        if (arg1 > -3) {
            field3721 = null;
        }
        var5.field7786 = arg3;
        var5.field7784 = 2;
        this.method1610(var5, -43);
        return var5;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V", line = 24)
    public static void method1606(int arg0) {
        field3717 = null;
        if (arg0 >= 43) {
            field3721 = null;
            field3709 = null;
            field3719 = null;
            field3720 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IILva;)Lmo;", line = 40)
    public final class526 method1607(int arg0, int arg1, class343 arg2) {
        field3715++;
        class526 var4 = new class526();
        var4.field2600 = false;
        var4.field115 = arg1;
        var4.field7784 = 3;
        if (arg0 == -4300) {
            var4.field7786 = arg2;
            this.method1610(var4, 90);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ILva;I)Lmo;", line = 65)
    public final class526 method1608(int arg0, class343 arg1, int arg2) {
        int var4 = 28 / ((arg0 - 1) / 57);
        field3708++;
        class526 var5 = new class526();
        var5.field7784 = 1;
        class356 var6 = this.field3710;
        synchronized (this.field3710) {
            class526 var7 = (class526) this.field3710.method2130(false);
            while (true) {
                if (var7 == null) {
                    break;
                }
                if (((long) arg2) == var7.field115 && var7.field7786 == arg1 && var7.field7784 == 2) {
                    var5.field2597 = false;
                    var5.field7790 = var7.field7790;
                    return var5;
                }
                var7 = (class526) this.field3710.method2131(true);
            }
        }
        var5.field7790 = arg1.method2040(true, arg2);
        var5.field2597 = false;
        var5.field2600 = true;
        return var5;
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Ldr;)V", line = 238)
    public class269(class504 arg0) {
        class56 var2 = arg0.method2971(this, 5, 0);
        while (var2.field667 == 0) {
            class157.method1046(-128, 10L);
        }
        if (var2.field667 == 2) {
            throw new RuntimeException();
        }
        this.field3718 = (Thread) var2.field670;
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V", line = 103)
    public final void method1609(int arg0) {
        this.field3716 = true;
        field3711++;
        class356 var2 = this.field3710;
        synchronized (this.field3710) {
            this.field3710.notifyAll();
            int var3 = 10 % ((-arg0 - 41) / 48);
        }
        try {
            this.field3718.join();
        } catch (InterruptedException var4) {
        }
        this.field3718 = null;
    }

    @OriginalMember(owner = "client!br", name = "run", descriptor = "()V", line = 121)
    public final void run() {
        while (!this.field3716) {
            class356 var1 = this.field3710;
            class526 var2;
            synchronized (this.field3710) {
                var2 = (class526) this.field3710.method2128(1339);
                if (var2 == null) {
                    try {
                        this.field3710.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field3712--;
            }
            try {
                if (var2.field7784 == 2) {
                    var2.field7786.method2038(-820524600, var2.field7790, var2.field7790.length, (int) var2.field115);
                } else if (var2.field7784 == 3) {
                    var2.field7790 = var2.field7786.method2040(true, (int) var2.field115);
                }
            } catch (Exception var7) {
                class320.method1861(var7, (byte) -74, null);
            }
            var2.field2597 = false;
        }
        field3714++;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Lmo;I)V", line = 193)
    private final void method1610(class526 arg0, int arg1) {
        class356 var3 = this.field3710;
        synchronized (this.field3710) {
            this.field3710.method2127((byte) -125, arg0);
            this.field3712++;
            int var4 = -21 % ((50 - arg1) / 38);
            this.field3710.notifyAll();
        }
        field3707++;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(BIIIIIIIII)V", line = 207)
    public static final void method1611(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3706++;
        if (arg1 < 128 || arg7 < 128 || (class527.field7799 * 128 - 256) < arg1 || arg7 > (class422.field6182 - 2) * 128) {
            class52.field637[0] = class52.field637[1] = -1;
            return;
        }
        int var10 = 117 / ((arg0 + 25) / 50);
        int var11 = class242.method1465(109, arg9, arg7, arg1) - arg2;
        class450.field6623.method188(arg5, 0, 0);
        field3721.method299(class450.field6623);
        field3721.method256(arg1, var11, arg7, class52.field637);
        class450.field6623.method188(-arg5, 0, 0);
        field3721.method299(class450.field6623);
    }
}
