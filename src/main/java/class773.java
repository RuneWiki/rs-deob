import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public class class773 extends class123 {

    @OriginalMember(owner = "client!oha", name = "r", descriptor = "Ljia;")
    public class645 field10697 = new class645();

    @OriginalMember(owner = "client!oha", name = "y", descriptor = "Lbt;")
    public class48 field10704 = new class48();

    @OriginalMember(owner = "client!oha", name = "t", descriptor = "Lpt;")
    private class558 field10699;

    @OriginalMember(owner = "client!oha", name = "n", descriptor = "Lvl;")
    public static class15 field10693 = new class15(78, 0);

    @OriginalMember(owner = "client!oha", name = "w", descriptor = "Lfja;")
    public static class783 field10702 = new class783(129, 0);

    @OriginalMember(owner = "client!oha", name = "x", descriptor = "[I")
    public static int[] field10703 = new int[32];

    @OriginalMember(owner = "client!oha", name = "m", descriptor = "I")
    public static int field10692;

    @OriginalMember(owner = "client!oha", name = "o", descriptor = "I")
    public static int field10694;

    @OriginalMember(owner = "client!oha", name = "q", descriptor = "I")
    public static int field10696;

    @OriginalMember(owner = "client!oha", name = "s", descriptor = "I")
    public static int field10698;

    @OriginalMember(owner = "client!oha", name = "u", descriptor = "I")
    public static int field10700;

    @OriginalMember(owner = "client!oha", name = "v", descriptor = "I")
    public static int field10701;

    @OriginalMember(owner = "client!oha", name = "z", descriptor = "I")
    public static int field10705;

    @OriginalMember(owner = "client!oha", name = "p", descriptor = "Lgj;")
    public static class662 field10695;

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "(I)V", line = 4)
    public static void method4254(int arg0) {
        field10703 = null;
        field10695 = null;
        field10702 = null;
        if (arg0 == 4) {
            field10693 = null;
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(IILmja;)V", line = 17)
    private final void method4255(int arg0, int arg1, class443 arg2) {
        if ((this.field10699.field7891[arg2.field6001] & 0x4) != 0 && arg2.field5993 < 0) {
            int var4 = this.field10699.field7895[arg2.field6001] / class55.field782;
            int var5 = (var4 + 1048575 - arg2.field5997) / var4;
            arg2.field5997 = arg2.field5997 + (arg0 * var4) & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field10699.field7903[arg2.field6001] == 0) {
                    arg2.field5992 = class161.method1234(arg2.field6008, arg2.field5992.method1258(), arg2.field5992.method1261(), arg2.field5992.method1259());
                } else {
                    arg2.field5992 = class161.method1234(arg2.field6008, arg2.field5992.method1258(), 0, arg2.field5992.method1259());
                    this.field10699.method3238(95, arg2.field5998.field6843[arg2.field6005] < 0, arg2);
                }
                if (arg2.field5998.field6843[arg2.field6005] < 0) {
                    arg2.field5992.method1237(-1);
                }
                arg0 = arg2.field5997 / var4;
            }
        }
        field10701++;
        arg2.field5992.method351(arg0);
        if (arg1 != 1048575) {
            field10693 = null;
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(IBLmja;[III)V", line = 57)
    private final void method4256(int arg0, byte arg1, class443 arg2, int[] arg3, int arg4, int arg5) {
        if ((this.field10699.field7891[arg2.field6001] & 0x4) != 0 && arg2.field5993 < 0) {
            int var7 = this.field10699.field7895[arg2.field6001] / class55.field782;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field5997) / var7;
                if (arg5 < var8) {
                    arg2.field5997 += arg5 * var7;
                    break;
                }
                arg2.field5992.method356(arg3, arg4, var8);
                arg4 += var8;
                arg5 -= var8;
                arg2.field5997 += var7 * var8 - 1048576;
                int var9 = class55.field782 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class161 var11 = arg2.field5992;
                if (this.field10699.field7903[arg2.field6001] == 0) {
                    arg2.field5992 = class161.method1234(arg2.field6008, var11.method1258(), var11.method1261(), var11.method1259());
                } else {
                    arg2.field5992 = class161.method1234(arg2.field6008, var11.method1258(), 0, var11.method1259());
                    this.field10699.method3238(70, arg2.field5998.field6843[arg2.field6005] < 0, arg2);
                    arg2.field5992.method1260(var9, var11.method1261());
                }
                if (arg2.field5998.field6843[arg2.field6005] < 0) {
                    arg2.field5992.method1237(-1);
                }
                var11.method1264(var9);
                var11.method356(arg3, arg4, arg0 - arg4);
                if (var11.method1262()) {
                    this.field10704.method350(var11);
                }
            }
        }
        field10700++;
        if (arg1 <= 99) {
            this.field10699 = null;
        }
        arg2.field5992.method356(arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "()Lri;", line = 120)
    public final class123 method355() {
        field10705++;
        class443 var1;
        do {
            var1 = (class443) this.field10697.method3591(0);
            if (var1 == null) {
                return null;
            }
        } while (var1.field5992 == null);
        return var1.field5992;
    }

    @OriginalMember(owner = "client!oha", name = "c", descriptor = "()I", line = 143)
    public final int method354() {
        field10692++;
        return 0;
    }

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "([III)V", line = 155)
    public final void method356(int[] arg0, int arg1, int arg2) {
        field10698++;
        this.field10704.method356(arg0, arg1, arg2);
        for (class443 var4 = (class443) this.field10697.method3589((byte) -127); var4 != null; var4 = (class443) this.field10697.method3591(0)) {
            if (!this.field10699.method3218(var4, (byte) 97)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field6014 >= var6) {
                        this.method4256(var5 + var6, (byte) 116, var4, arg0, var5, var6);
                        var4.field6014 -= var6;
                        break;
                    }
                    this.method4256(var5 + var6, (byte) 121, var4, arg0, var5, var4.field6014);
                    var6 -= var4.field6014;
                    var5 += var4.field6014;
                } while (!this.field10699.method3209(arg0, var6, var5, var4, -5));
            }
        }
    }

    @OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(Lpt;)V", line = 266)
    public class773(class558 arg0) {
        this.field10699 = arg0;
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V", line = 200)
    public final void method351(int arg0) {
        field10694++;
        this.field10704.method351(arg0);
        for (class443 var2 = (class443) this.field10697.method3589((byte) -127); var2 != null; var2 = (class443) this.field10697.method3591(0)) {
            if (!this.field10699.method3218(var2, (byte) 97)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field6014) {
                        this.method4255(var3, 1048575, var2);
                        var2.field6014 -= var3;
                        break;
                    }
                    this.method4255(var2.field6014, 1048575, var2);
                    var3 -= var2.field6014;
                } while (!this.field10699.method3209(null, var3, 0, var2, -5));
            }
        }
    }

    @OriginalMember(owner = "client!oha", name = "d", descriptor = "()Lri;", line = 233)
    public final class123 method362() {
        field10696++;
        class443 var1 = (class443) this.field10697.method3589((byte) -128);
        if (var1 == null) {
            return null;
        } else if (var1.field5992 == null) {
            return this.method355();
        } else {
            return var1.field5992;
        }
    }
}
