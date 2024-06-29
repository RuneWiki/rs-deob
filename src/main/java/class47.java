import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class47 extends class86 {

    @OriginalMember(owner = "client!ge", name = "bb", descriptor = "Lad;")
    public class5 field957 = new class5();

    @OriginalMember(owner = "client!ge", name = "db", descriptor = "Lfb;")
    public class38 field959 = new class38();

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "Lud;")
    private class141 field943;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "Lqf;")
    public static class117 field946 = class72.method514(118, "Fertigkeit)2");

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "I")
    public static int field949 = -1;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
    public static int field950 = 1;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "Lqf;")
    public static class117 field952 = class72.method514(115, "<col=ffffff>");

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "Lqf;")
    public static class117 field954 = class72.method514(123, "<col=ffb000>");

    @OriginalMember(owner = "client!ge", name = "cb", descriptor = "I")
    public static int field958 = 0;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!ge", name = "Z", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!ge", name = "ab", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "Ljb;")
    public static class64 field945;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "()I")
    public final int method49() {
        field955++;
        return 0;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)Lr;")
    public static final class118 method337(boolean arg0) {
        field956++;
        class118 var1 = new class118();
        var1.field2833 = class3.field58[0];
        var1.field2832 = class42.field840[0];
        if (!arg0) {
            method338(50, null, null, null);
        }
        var1.field2836 = class99.field2384;
        var1.field2830 = class132.field3122;
        var1.field2835 = class21.field354[0];
        var1.field2831 = class144.field3536;
        var1.field2837 = class41.field806[0];
        var1.field2834 = class116.field2758[0];
        class73.method525(-21572);
        return var1;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILqf;Lqf;Ljb;)[Lma;")
    public static final class84[] method338(int arg0, class117 arg1, class117 arg2, class64 arg3) {
        if (arg0 >= -44) {
            method337(true);
        }
        field948++;
        int var4 = arg3.method447((byte) 28, arg2);
        int var5 = arg3.method449(true, var4, arg1);
        return class147.method1176(var5, arg3, var4, -17461);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILf;III[I)V")
    private final void method339(int arg0, class36 arg1, int arg2, int arg3, int arg4, int[] arg5) {
        field942++;
        if ((this.field943.field3415[arg1.field764] & 0x4) != 0 && arg1.field746 < 0) {
            int var7 = this.field943.field3364[arg1.field764] / class82.field1879;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field779) / var7;
                if (arg0 < var8) {
                    arg1.field779 += arg0 * var7;
                    break;
                }
                arg0 -= var8;
                int var9 = 262144 / var7;
                arg1.field749.method81(arg5, arg3, var8);
                class9 var10 = arg1.field749;
                arg3 += var8;
                arg1.field779 += var7 * var8 - 1048576;
                int var11 = class82.field1879 / 100;
                if (var11 > var9) {
                    var11 = var9;
                }
                if (this.field943.field3375[arg1.field764] == 0) {
                    arg1.field749 = class9.method66(arg1.field748, var10.method65(), var10.method75(), var10.method46());
                } else {
                    arg1.field749 = class9.method66(arg1.field748, var10.method65(), 0, var10.method46());
                    this.field943.method1118(arg1, arg1.field762.field1449[arg1.field761] < 0, true);
                    arg1.field749.method77(var11, var10.method75());
                }
                if (arg1.field762.field1449[arg1.field761] < 0) {
                    arg1.field749.method42(-1);
                }
                var10.method56(var11);
                var10.method81(arg5, arg3, arg2 - arg3);
                if (var10.method61()) {
                    this.field959.method283(var10);
                }
            }
        }
        arg1.field749.method81(arg5, arg3, arg0);
        if (arg4 != 1048575) {
            this.method70();
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "()Lmc;")
    public final class86 method86() {
        field944++;
        class36 var1;
        do {
            var1 = (class36) this.field957.method25((byte) -126);
            if (var1 == null) {
                return null;
            }
        } while (var1.field749 == null);
        return var1.field749;
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)V")
    public final void method64(int arg0) {
        field953++;
        this.field959.method64(arg0);
        for (class36 var2 = (class36) this.field957.method27(18823); var2 != null; var2 = (class36) this.field957.method25((byte) -127)) {
            if (!this.field943.method1115((byte) 88, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field766) {
                        this.method341(var2, var3, -122);
                        var2.field766 -= var3;
                        break;
                    }
                    this.method341(var2, var2.field766, -110);
                    var3 -= var2.field766;
                } while (!this.field943.method1096(var3, null, var2, (byte) -19, 0));
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)V")
    public static void method340(int arg0) {
        field945 = null;
        field946 = null;
        field954 = null;
        field952 = null;
        if (arg0 != -1) {
            method340(91);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lf;II)V")
    private final void method341(class36 arg0, int arg1, int arg2) {
        if ((this.field943.field3415[arg0.field764] & 0x4) != 0 && arg0.field746 < 0) {
            int var4 = this.field943.field3364[arg0.field764] / class82.field1879;
            int var5 = (var4 + 1048575 - arg0.field779) / var4;
            arg0.field779 = arg1 * var4 + arg0.field779 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field943.field3375[arg0.field764] == 0) {
                    arg0.field749 = class9.method66(arg0.field748, arg0.field749.method65(), arg0.field749.method75(), arg0.field749.method46());
                } else {
                    arg0.field749 = class9.method66(arg0.field748, arg0.field749.method65(), 0, arg0.field749.method46());
                    this.field943.method1118(arg0, arg0.field762.field1449[arg0.field761] < 0, true);
                }
                if (arg0.field762.field1449[arg0.field761] < 0) {
                    arg0.field749.method42(-1);
                }
                arg1 = arg0.field779 / var4;
            }
        }
        field941++;
        arg0.field749.method64(arg1);
        if (arg2 >= -104) {
            this.method86();
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "()Lmc;")
    public final class86 method70() {
        field947++;
        class36 var1 = (class36) this.field957.method27(18823);
        if (var1 == null) {
            return null;
        } else if (var1.field749 == null) {
            return this.method86();
        } else {
            return var1.field749;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([III)V")
    public final void method81(int[] arg0, int arg1, int arg2) {
        this.field959.method81(arg0, arg1, arg2);
        field951++;
        for (class36 var4 = (class36) this.field957.method27(18823); var4 != null; var4 = (class36) this.field957.method25((byte) -128)) {
            if (!this.field943.method1115((byte) 88, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field766 >= var6) {
                        this.method339(var6, var4, var5 + var6, var5, 1048575, arg0);
                        var4.field766 -= var6;
                        break;
                    }
                    this.method339(var4.field766, var4, var5 + var6, var5, 1048575, arg0);
                    var5 += var4.field766;
                    var6 -= var4.field766;
                } while (!this.field943.method1096(var6, arg0, var4, (byte) -19, var5));
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lud;)V")
    public class47(class141 arg0) {
        this.field943 = arg0;
    }
}
