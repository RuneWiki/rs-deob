import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class64 extends class407 {

    @OriginalMember(owner = "client!ps", name = "s", descriptor = "Lam;")
    public class455 field803 = new class455();

    @OriginalMember(owner = "client!ps", name = "H", descriptor = "Lpo;")
    public class398 field818 = new class398();

    @OriginalMember(owner = "client!ps", name = "z", descriptor = "Lri;")
    private class75 field810;

    @OriginalMember(owner = "client!ps", name = "u", descriptor = "Lmt;")
    public static class276 field805 = new class276(0, 2, 2, 1);

    @OriginalMember(owner = "client!ps", name = "A", descriptor = "Ldv;")
    public static class477 field811 = new class477();

    @OriginalMember(owner = "client!ps", name = "G", descriptor = "Lam;")
    public static class455 field817 = new class455();

    @OriginalMember(owner = "client!ps", name = "r", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!ps", name = "t", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!ps", name = "v", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!ps", name = "w", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!ps", name = "x", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!ps", name = "y", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!ps", name = "B", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!ps", name = "C", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!ps", name = "E", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!ps", name = "F", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!ps", name = "D", descriptor = "[I")
    public static int[] field814;

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "(I)V", line = 3)
    public static final void method510(int arg0) {
        field807++;
        for (int var1 = 0; var1 < class140.field1843.length; var1++) {
            for (int var3 = 0; var3 < class140.field1843[var1].length; var3++) {
                class140.field1843[var1][var3] = class43.field497;
            }
        }
        int var2 = 106 / ((arg0 - 57) / 58);
    }

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "()Lcv;", line = 29)
    public final class407 method511() {
        field816++;
        class301 var1;
        do {
            var1 = (class301) this.field803.method2660((byte) 67);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4394 == null);
        return var1.field4394;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "([III)V", line = 50)
    public final void method512(int[] arg0, int arg1, int arg2) {
        field812++;
        this.field818.method512(arg0, arg1, arg2);
        for (class301 var4 = (class301) this.field803.method2655(15152); var4 != null; var4 = (class301) this.field803.method2660((byte) 67)) {
            if (!this.field810.method564(-16781, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field4403 >= var5) {
                        this.method515(var5, var4, var5 + var6, var6, 8292, arg0);
                        var4.field4403 -= var5;
                        break;
                    }
                    this.method515(var4.field4403, var4, var5 + var6, var6, 8292, arg0);
                    var6 += var4.field4403;
                    var5 -= var4.field4403;
                } while (!this.field810.method578(false, var4, var6, var5, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZC)Z", line = 88)
    public static final boolean method513(boolean arg0, char arg1) {
        if (arg0) {
            return true;
        } else {
            field802++;
            return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)V", line = 99)
    public static final void method514(int arg0, int arg1) {
        field804++;
        if (arg0 == -1) {
            class502.field7096 = arg1;
            class273.field4036.method1096((byte) -80);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILss;III[I)V", line = 117)
    private final void method515(int arg0, class301 arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if (arg4 != 8292) {
            field805 = null;
        }
        if ((this.field810.field955[arg1.field4395] & 0x4) != 0 && arg1.field4413 < 0) {
            int var7 = this.field810.field928[arg1.field4395] / class289.field4225;
            while (true) {
                int var8 = (1048575 - (arg1.field4398 - var7)) / var7;
                if (var8 > arg0) {
                    arg1.field4398 += arg0 * var7;
                    break;
                }
                arg1.field4394.method512(arg5, arg3, var8);
                arg0 -= var8;
                arg1.field4398 += var7 * var8 - 1048576;
                arg3 += var8;
                int var9 = class289.field4225 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class238 var11 = arg1.field4394;
                if (this.field810.field975[arg1.field4395] == 0) {
                    arg1.field4394 = class238.method1476(arg1.field4401, var11.method1501(), var11.method1468(), var11.method1502());
                } else {
                    arg1.field4394 = class238.method1476(arg1.field4401, var11.method1501(), 0, var11.method1502());
                    this.field810.method574(arg1, arg4 ^ 0xFFFFDFE7, arg1.field4412.field4043[arg1.field4390] < 0);
                    arg1.field4394.method1487(var9, var11.method1468());
                }
                if (arg1.field4412.field4043[arg1.field4390] < 0) {
                    arg1.field4394.method1488(-1);
                }
                var11.method1493(var9);
                var11.method512(arg5, arg3, arg2 - arg3);
                if (var11.method1470()) {
                    this.field818.method2309(var11);
                }
            }
        }
        field808++;
        arg1.field4394.method512(arg5, arg3, arg0);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)V", line = 181)
    public static void method516(byte arg0) {
        field814 = null;
        field805 = null;
        field817 = null;
        if (arg0 == -21) {
            field811 = null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lss;II)V", line = 197)
    private final void method517(class301 arg0, int arg1, int arg2) {
        if ((this.field810.field955[arg0.field4395] & 0x4) != 0 && arg0.field4413 < 0) {
            int var4 = this.field810.field928[arg0.field4395] / class289.field4225;
            int var5 = (var4 + 1048575 - arg0.field4398) / var4;
            arg0.field4398 = arg2 * var4 + arg0.field4398 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field810.field975[arg0.field4395] == 0) {
                    arg0.field4394 = class238.method1476(arg0.field4401, arg0.field4394.method1501(), arg0.field4394.method1468(), arg0.field4394.method1502());
                } else {
                    arg0.field4394 = class238.method1476(arg0.field4401, arg0.field4394.method1501(), 0, arg0.field4394.method1502());
                    this.field810.method574(arg0, arg1 ^ 0xFFFFFFA4, arg0.field4412.field4043[arg0.field4390] < 0);
                }
                if (arg0.field4412.field4043[arg0.field4390] < 0) {
                    arg0.field4394.method1488(-1);
                }
                arg2 = arg0.field4398 / var4;
            }
        }
        field809++;
        arg0.field4394.method519(arg2);
        if (arg1 != 2) {
            method513(false, (char) 65435);
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "()I", line = 237)
    public final int method518() {
        field806++;
        return 0;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V", line = 245)
    public final void method519(int arg0) {
        field815++;
        this.field818.method519(arg0);
        for (class301 var2 = (class301) this.field803.method2655(15152); var2 != null; var2 = (class301) this.field803.method2660((byte) 67)) {
            if (!this.field810.method564(-16781, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field4403) {
                        this.method517(var2, 2, var3);
                        var2.field4403 -= var3;
                        break;
                    }
                    this.method517(var2, 2, var2.field4403);
                    var3 -= var2.field4403;
                } while (!this.field810.method578(false, var2, 0, var3, null));
            }
        }
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "()Lcv;", line = 280)
    public final class407 method520() {
        field813++;
        class301 var1 = (class301) this.field803.method2655(15152);
        if (var1 == null) {
            return null;
        } else if (var1.field4394 == null) {
            return this.method511();
        } else {
            return var1.field4394;
        }
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lri;)V", line = 319)
    public class64(class75 arg0) {
        this.field810 = arg0;
    }
}
