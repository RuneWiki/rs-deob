import java.awt.Font;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class119 extends class5 {

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "Lcd;")
    public class19 field2628 = new class19();

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "Lse;")
    public class130 field2642 = new class130();

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "Lie;")
    private class61 field2640;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "Lpe;")
    public static class109 field2634 = class141.method1120("p12_full", 0);

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "Lpe;")
    public static class109 field2631 = class141.method1120(" )2>", 0);

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "Lpe;")
    public static class109 field2641 = class141.method1120("ams", 0);

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "Lpe;")
    private static class109 field2639 = class141.method1120("FULL", 0);

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "Lpe;")
    public static class109 field2630 = field2639;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "Lpe;")
    private static class109 field2646 = class141.method1120("Your account is already logged in)3", 0);

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "Lpe;")
    public static class109 field2636 = field2646;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2643 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "Lpe;")
    private static class109 field2649 = class141.method1120("Members only world", 0);

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "Lpe;")
    public static class109 field2647 = field2649;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "Z")
    public static boolean field2651 = false;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "Lna;")
    public static class91 field2650;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "Ljava/awt/Font;")
    public static Font field2648;

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "[Lk;")
    public static class69[] field2632;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
    public final void method49(int arg0) {
        this.field2642.method49(arg0);
        field2644++;
        for (class157 var2 = (class157) this.field2628.method195((byte) 116); var2 != null; var2 = (class157) this.field2628.method198((byte) -87)) {
            if (!this.field2640.method466(-1, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3629) {
                        this.method972(4, var2, var3);
                        var2.field3629 -= var3;
                        break;
                    }
                    this.method972(4, var2, var2.field3629);
                    var3 -= var2.field3629;
                } while (!this.field2640.method465(0, (byte) 114, var2, null, var3));
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "()Lad;")
    public final class5 method53() {
        class157 var1 = (class157) this.field2628.method195((byte) 127);
        field2633++;
        if (var1 == null) {
            return null;
        } else if (var1.field3610 == null) {
            return this.method50();
        } else {
            return var1.field3610;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILwd;I)V")
    private final void method972(int arg0, class157 arg1, int arg2) {
        if ((arg0 & this.field2640.field1193[arg1.field3616]) != 0 && arg1.field3607 < 0) {
            int var4 = this.field2640.field1239[arg1.field3616] / class127.field2816;
            int var5 = (var4 + 1048575 - arg1.field3633) / var4;
            arg1.field3633 = arg1.field3633 + arg2 * var4 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field2640.field1203[arg1.field3616] == 0) {
                    arg1.field3610 = class30.method299(arg1.field3639, arg1.field3610.method306(), arg1.field3610.method301(), arg1.field3610.method294());
                } else {
                    arg1.field3610 = class30.method299(arg1.field3639, arg1.field3610.method306(), 0, arg1.field3610.method294());
                    this.field2640.method480(1747466310, arg1, arg1.field3638.field2823[arg1.field3612] < 0);
                }
                if (arg1.field3638.field2823[arg1.field3612] < 0) {
                    arg1.field3610.method317(-1);
                }
                arg2 = arg1.field3633 / var4;
            }
        }
        arg1.field3610.method49(arg2);
        field2638++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()I")
    public final int method47() {
        field2645++;
        return 0;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([ILwd;IIII)V")
    private final void method973(int[] arg0, class157 arg1, int arg2, int arg3, int arg4, int arg5) {
        if ((this.field2640.field1193[arg1.field3616] & 0x4) != 0 && arg1.field3607 < 0) {
            int var7 = this.field2640.field1239[arg1.field3616] / class127.field2816;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field3633) / var7;
                if (arg2 < var8) {
                    arg1.field3633 += arg2 * var7;
                    break;
                }
                arg2 -= var8;
                arg1.field3610.method48(arg0, arg3, var8);
                arg3 += var8;
                int var9 = class127.field2816 / 100;
                arg1.field3633 += var7 * var8 - 1048576;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class30 var11 = arg1.field3610;
                if (this.field2640.field1203[arg1.field3616] == 0) {
                    arg1.field3610 = class30.method299(arg1.field3639, var11.method306(), var11.method301(), var11.method294());
                } else {
                    arg1.field3610 = class30.method299(arg1.field3639, var11.method306(), 0, var11.method294());
                    this.field2640.method480(1747466310, arg1, arg1.field3638.field2823[arg1.field3612] < 0);
                    arg1.field3610.method315(var9, var11.method301());
                }
                if (arg1.field3638.field2823[arg1.field3612] < 0) {
                    arg1.field3610.method317(-1);
                }
                var11.method307(var9);
                var11.method48(arg0, arg3, arg5 - arg3);
                if (var11.method313()) {
                    this.field2642.method1049(var11);
                }
            }
        }
        arg1.field3610.method48(arg0, arg3, arg2);
        field2635++;
        if (arg4 < 56) {
            field2651 = false;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "()Lad;")
    public final class5 method50() {
        field2637++;
        class157 var1;
        do {
            var1 = (class157) this.field2628.method198((byte) -125);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3610 == null);
        return var1.field3610;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([III)V")
    public final void method48(int[] arg0, int arg1, int arg2) {
        field2629++;
        this.field2642.method48(arg0, arg1, arg2);
        for (class157 var4 = (class157) this.field2628.method195((byte) 103); var4 != null; var4 = (class157) this.field2628.method198((byte) -125)) {
            if (!this.field2640.method466(-1, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3629) {
                        this.method973(arg0, var4, var6, var5, 105, var5 + var6);
                        var4.field3629 -= var6;
                        break;
                    }
                    this.method973(arg0, var4, var4.field3629, var5, 59, var5 + var6);
                    var5 += var4.field3629;
                    var6 -= var4.field3629;
                } while (!this.field2640.method465(var5, (byte) 110, var4, arg0, var6));
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
    public static void method974(int arg0) {
        field2646 = null;
        field2639 = null;
        field2631 = null;
        field2636 = null;
        field2649 = null;
        if (arg0 != -25418) {
            method974(44);
        }
        field2647 = null;
        field2630 = null;
        field2648 = null;
        field2634 = null;
        field2632 = null;
        field2641 = null;
        field2650 = null;
        field2643 = null;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lie;)V")
    public class119(class61 arg0) {
        this.field2640 = arg0;
    }
}
