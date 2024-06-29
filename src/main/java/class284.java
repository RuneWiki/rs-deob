import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class284 extends class206 {

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "Lid;")
    public class226 field5009 = new class226();

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "Lgh;")
    public class212 field5018 = new class212();

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "Lol;")
    private class108 field5003;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "Leg;")
    public static class37 field5007 = class174.method1167(" )4 ", 107);

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "Lmg;")
    public static class53 field5008 = new class53(64);

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "Leg;")
    public static class37 field5015 = class174.method1167("Suche nach Updates )2 ", -33);

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "Leg;")
    public static class37 field5017 = class174.method1167("Interfaces charg-Bes", 99);

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!pg", name = "O", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "([III)V")
    public final void method391(int[] arg0, int arg1, int arg2) {
        field5013++;
        this.field5018.method391(arg0, arg1, arg2);
        for (class170 var4 = (class170) this.field5009.method1566(-3); var4 != null; var4 = (class170) this.field5009.method1570(3)) {
            if (!this.field5003.method727(var4, -123)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field2845) {
                        this.method1900(false, var6, arg0, var5 + var6, var4, var5);
                        var4.field2845 -= var5;
                        break;
                    }
                    this.method1900(false, var6, arg0, var5 + var6, var4, var4.field2845);
                    var5 -= var4.field2845;
                    var6 += var4.field2845;
                } while (!this.field5003.method728(var4, arg0, 112, var6, var5));
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "()Lj;")
    public final class206 method395() {
        field5002++;
        class170 var1;
        do {
            var1 = (class170) this.field5009.method1570(3);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2841 == null);
        return var1.field2841;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI[IILqd;I)V")
    private final void method1900(boolean arg0, int arg1, int[] arg2, int arg3, class170 arg4, int arg5) {
        if (arg0) {
            this.field5009 = null;
        }
        field5005++;
        if ((this.field5003.field1733[arg4.field2839] & 0x4) != 0 && arg4.field2852 < 0) {
            int var7 = this.field5003.field1687[arg4.field2839] / class215.field3720;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field2856) / var7;
                if (var8 > arg5) {
                    arg4.field2856 += arg5 * var7;
                    break;
                }
                arg4.field2841.method391(arg2, arg1, var8);
                int var9 = class215.field3720 / 100;
                arg4.field2856 += var7 * var8 - 1048576;
                arg5 -= var8;
                arg1 += var8;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class57 var11 = arg4.field2841;
                if (this.field5003.field1711[arg4.field2839] == 0) {
                    arg4.field2841 = class57.method385(arg4.field2838, var11.method369(), var11.method373(), var11.method384());
                } else {
                    arg4.field2841 = class57.method385(arg4.field2838, var11.method369(), 0, var11.method384());
                    this.field5003.method725(arg4, -1, ~arg4.field2846.field695[arg4.field2842] > -1);
                    arg4.field2841.method388(var9, var11.method373());
                }
                if (arg4.field2846.field695[arg4.field2842] < 0) {
                    arg4.field2841.method406(-1);
                }
                var11.method381(var9);
                var11.method391(arg2, arg1, arg3 - arg1);
                if (var11.method374()) {
                    this.field5018.method1512(var11);
                }
            }
        }
        arg4.field2841.method391(arg2, arg1, arg5);
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V")
    public static void method1901(byte arg0) {
        field5015 = null;
        field5008 = null;
        field5017 = null;
        if (arg0 == -66) {
            field5007 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
    public final void method394(int arg0) {
        this.field5018.method394(arg0);
        for (class170 var2 = (class170) this.field5009.method1566(-3); var2 != null; var2 = (class170) this.field5009.method1570(3)) {
            if (!this.field5003.method727(var2, -110)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2845) {
                        this.method1902(var3, 0, var2);
                        var2.field2845 -= var3;
                        break;
                    }
                    this.method1902(var2.field2845, 0, var2);
                    var3 -= var2.field2845;
                } while (!this.field5003.method728(var2, (int[]) null, 83, 0, var3));
            }
        }
        field5010++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILqd;)V")
    private final void method1902(int arg0, int arg1, class170 arg2) {
        if ((this.field5003.field1733[arg2.field2839] & 0x4) != arg1 && arg2.field2852 < 0) {
            int var4 = this.field5003.field1687[arg2.field2839] / class215.field3720;
            int var5 = (var4 + 1048575 - arg2.field2856) / var4;
            arg2.field2856 = arg0 * var4 + arg2.field2856 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field5003.field1711[arg2.field2839] == 0) {
                    arg2.field2841 = class57.method385(arg2.field2838, arg2.field2841.method369(), arg2.field2841.method373(), arg2.field2841.method384());
                } else {
                    arg2.field2841 = class57.method385(arg2.field2838, arg2.field2841.method369(), 0, arg2.field2841.method384());
                    this.field5003.method725(arg2, -1, arg2.field2846.field695[arg2.field2842] < 0);
                }
                if (arg2.field2846.field695[arg2.field2842] < 0) {
                    arg2.field2841.method406(-1);
                }
                arg0 = arg2.field2856 / var4;
            }
        }
        field5011++;
        arg2.field2841.method394(arg0);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "()Lj;")
    public final class206 method411() {
        field5004++;
        class170 var1 = (class170) this.field5009.method1566(-3);
        if (var1 == null) {
            return null;
        } else if (var1.field2841 == null) {
            return this.method395();
        } else {
            return var1.field2841;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILeg;IJIII)V")
    public static final void method1903(int arg0, class37 arg1, int arg2, long arg3, int arg4, int arg5, int arg6) {
        class187 var8 = new class187(128);
        var8.method1292(arg0, (byte) -64);
        field5012++;
        var8.method1294((int) (Math.random() * 99999.0D), -26655);
        var8.method1294(525, -26655);
        var8.method1256(arg3, (byte) 84);
        var8.method1272(arg0 + 27852, (int) (Math.random() * 9.9999999E7D));
        var8.method1289(arg1, -126);
        var8.method1272(27862, (int) (Math.random() * 9.9999999E7D));
        var8.method1294(class40.field641, -26655);
        var8.method1292(arg6, (byte) -64);
        var8.method1292(arg5, (byte) -64);
        var8.method1272(arg0 + 27852, (int) (Math.random() * 9.9999999E7D));
        var8.method1294(arg2, arg0 - 26665);
        var8.method1294(arg4, -26655);
        var8.method1272(arg0 + 27852, (int) (Math.random() * 9.9999999E7D));
        var8.method1247(class238.field4230, class173.field2906, arg0 + 917525142);
        class273.field4778.field3169 = 0;
        class273.field4778.method1292(122, (byte) -64);
        class273.field4778.method1292(var8.field3169, (byte) -64);
        class273.field4778.method1259(var8.field3175, -121, 0, var8.field3169);
        class79.field1223 = 1;
        class25.field354 = 0;
        class235.field4056 = -3;
        class35.field509 = 0;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "()I")
    public final int method396() {
        field5001++;
        return 0;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lol;)V")
    public class284(class108 arg0) {
        this.field5003 = arg0;
    }
}
