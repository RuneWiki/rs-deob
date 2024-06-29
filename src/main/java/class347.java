import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class347 extends class169 {

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "Lfk;")
    public class317 field5516 = new class317();

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "Lkd;")
    public class11 field5519 = new class11();

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "Lue;")
    private class13 field5509;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "F")
    public static float field5517;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "[I")
    public static int[] field5515;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "()Lph;", line = 8)
    public final class169 method81() {
        field5511++;
        class284 var1;
        do {
            var1 = (class284) this.field5516.method2241(-1);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4394 == null);
        return var1.field4394;
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)V", line = 30)
    public static void method2443(int arg0) {
        field5515 = null;
        if (arg0 != -1) {
            field5517 = 0.36062863F;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIILhn;[II)V", line = 40)
    private final void method2444(int arg0, int arg1, int arg2, class284 arg3, int[] arg4, int arg5) {
        if (arg0 != 8405) {
            this.method61();
        }
        if ((this.field5509.field200[arg3.field4390] & 0x4) != 0 && arg3.field4406 < 0) {
            int var7 = this.field5509.field159[arg3.field4390] / class294.field4571;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field4404) / var7;
                if (var8 > arg1) {
                    arg3.field4404 += arg1 * var7;
                    break;
                }
                arg1 -= var8;
                arg3.field4394.method47(arg4, arg5, var8);
                arg3.field4404 += var7 * var8 - 1048576;
                int var9 = class294.field4571 / 100;
                int var10 = 262144 / var7;
                arg5 += var8;
                class7 var11 = arg3.field4394;
                if (var9 > var10) {
                    var9 = var10;
                }
                if (this.field5509.field178[arg3.field4390] == 0) {
                    arg3.field4394 = class7.method51(arg3.field4391, var11.method84(), var11.method53(), var11.method55());
                } else {
                    arg3.field4394 = class7.method51(arg3.field4391, var11.method84(), 0, var11.method55());
                    this.field5509.method141(arg3.field4413.field3653[arg3.field4412] < 0, arg3, arg0 + 862689713);
                    arg3.field4394.method72(var9, var11.method53());
                }
                if (arg3.field4413.field3653[arg3.field4412] < 0) {
                    arg3.field4394.method73(-1);
                }
                var11.method65(var9);
                var11.method47(arg4, arg5, arg2 - arg5);
                if (var11.method66()) {
                    this.field5519.method107(var11);
                }
            }
        }
        field5513++;
        arg3.field4394.method47(arg4, arg5, arg1);
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)V", line = 103)
    public final void method82(int arg0) {
        this.field5519.method82(arg0);
        field5518++;
        for (class284 var2 = (class284) this.field5516.method2244((byte) -125); var2 != null; var2 = (class284) this.field5516.method2241(-1)) {
            if (!this.field5509.method122(107, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field4396) {
                        this.method2445(var3, (byte) 29, var2);
                        var2.field4396 -= var3;
                        break;
                    }
                    this.method2445(var2.field4396, (byte) 29, var2);
                    var3 -= var2.field4396;
                } while (!this.field5509.method130(var2, 0, 6679, var3, (int[]) null));
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "([III)V", line = 143)
    public final void method47(int[] arg0, int arg1, int arg2) {
        field5514++;
        this.field5519.method47(arg0, arg1, arg2);
        for (class284 var4 = (class284) this.field5516.method2244((byte) -126); var4 != null; var4 = (class284) this.field5516.method2241(-1)) {
            if (!this.field5509.method122(71, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field4396 >= var5) {
                        this.method2444(8405, var5, var5 + var6, var4, arg0, var6);
                        var4.field4396 -= var5;
                        break;
                    }
                    this.method2444(8405, var4.field4396, var5 + var6, var4, arg0, var6);
                    var5 -= var4.field4396;
                    var6 += var4.field4396;
                } while (!this.field5509.method130(var4, var6, 6679, var5, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "()Lph;", line = 181)
    public final class169 method61() {
        field5510++;
        class284 var1 = (class284) this.field5516.method2244((byte) -127);
        if (var1 == null) {
            return null;
        } else if (var1.field4394 == null) {
            return this.method81();
        } else {
            return var1.field4394;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBLhn;)V", line = 206)
    private final void method2445(int arg0, byte arg1, class284 arg2) {
        if ((this.field5509.field200[arg2.field4390] & 0x4) != 0 && arg2.field4406 < 0) {
            int var4 = this.field5509.field159[arg2.field4390] / class294.field4571;
            int var5 = (var4 + 1048575 - arg2.field4404) / var4;
            arg2.field4404 = arg0 * var4 + arg2.field4404 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field5509.field178[arg2.field4390] == 0) {
                    arg2.field4394 = class7.method51(arg2.field4391, arg2.field4394.method84(), arg2.field4394.method53(), arg2.field4394.method55());
                } else {
                    arg2.field4394 = class7.method51(arg2.field4391, arg2.field4394.method84(), 0, arg2.field4394.method55());
                    this.field5509.method141(arg2.field4413.field3653[arg2.field4412] < 0, arg2, 862698118);
                }
                if (arg2.field4413.field3653[arg2.field4412] < 0) {
                    arg2.field4394.method73(-1);
                }
                arg0 = arg2.field4404 / var4;
            }
        }
        if (arg1 == 29) {
            field5512++;
            arg2.field4394.method82(arg0);
        }
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "()I", line = 245)
    public final int method88() {
        field5508++;
        return 0;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lue;)V", line = 260)
    public class347(class13 arg0) {
        this.field5509 = arg0;
    }
}
