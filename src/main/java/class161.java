import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class161 extends class36 {

    @OriginalMember(owner = "client!l", name = "m", descriptor = "Lmb;")
    public class160 field2831 = new class160();

    @OriginalMember(owner = "client!l", name = "C", descriptor = "Lpe;")
    public class244 field2847 = new class244();

    @OriginalMember(owner = "client!l", name = "q", descriptor = "Lvj;")
    private class115 field2835;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Z")
    public static boolean field2832 = true;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static int field2836 = 0;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "I")
    public static int field2845 = 0;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    public static int field2844 = -1;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "()Lf;")
    public final class36 method211() {
        field2838++;
        class90 var1 = (class90) this.field2831.method1151(114);
        if (var1 == null) {
            return null;
        } else if (var1.field1600 == null) {
            return this.method215();
        } else {
            return var1.field1600;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIILtg;)V")
    public static final void method1163(int arg0, int arg1, int arg2, class181 arg3) {
        field2846++;
        if (arg3.field3294 == 0) {
            arg3.field3189 = arg3.field3248;
        } else if (arg3.field3294 == 1) {
            arg3.field3189 = (arg1 - arg3.field3252) / 2 + arg3.field3248;
        } else if (arg3.field3294 == 2) {
            arg3.field3189 = arg1 - arg3.field3248 - arg3.field3252;
        } else if (arg3.field3294 == 3) {
            arg3.field3189 = arg3.field3248 * arg1 >> 14;
        } else if (arg3.field3294 == 4) {
            arg3.field3189 = (arg3.field3248 * arg1 >> 14) + (arg1 - arg3.field3252) / 2;
        } else {
            arg3.field3189 = arg1 - arg3.field3252 - (arg3.field3248 * arg1 >> 14);
        }
        if (arg3.field3351 == 0) {
            arg3.field3214 = arg3.field3253;
        } else if (arg3.field3351 == 1) {
            arg3.field3214 = (arg2 - arg3.field3270) / 2 + arg3.field3253;
        } else if (arg3.field3351 == 2) {
            arg3.field3214 = arg2 - arg3.field3270 - arg3.field3253;
        } else if (arg3.field3351 == 3) {
            arg3.field3214 = arg3.field3253 * arg2 >> 14;
        } else if (arg3.field3351 == 4) {
            arg3.field3214 = (arg3.field3253 * arg2 >> 14) + (arg2 - arg3.field3270) / 2;
        } else {
            arg3.field3214 = arg2 - arg3.field3270 - (arg3.field3253 * arg2 >> 14);
        }
        int var4 = -108 % ((arg0 - 22) / 39);
        if (!class252.field4546) {
            return;
        }
        if (client.method1109(arg3).field3646 == 0 && arg3.field3289 != 0) {
            return;
        }
        if (arg3.field3214 < 0) {
            arg3.field3214 = 0;
        } else if (arg3.field3270 + arg3.field3214 > arg2) {
            arg3.field3214 = arg2 - arg3.field3270;
        }
        if (arg3.field3189 < 0) {
            arg3.field3189 = 0;
            return;
        }
        if ((arg3.field3189 + arg3.field3252) > arg1) {
            arg3.field3189 = arg1 - arg3.field3252;
            return;
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "()I")
    public final int method214() {
        field2833++;
        return 0;
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "()Lf;")
    public final class36 method215() {
        field2841++;
        class90 var1;
        do {
            var1 = (class90) this.field2831.method1159(45);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1600 == null);
        return var1.field1600;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([III)V")
    public final void method209(int[] arg0, int arg1, int arg2) {
        field2837++;
        this.field2847.method209(arg0, arg1, arg2);
        for (class90 var4 = (class90) this.field2831.method1151(123); var4 != null; var4 = (class90) this.field2831.method1159(56)) {
            if (!this.field2835.method851(false, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1613) {
                        this.method1164(arg0, var5, var4, var6, var5 + var6, false);
                        var4.field1613 -= var6;
                        break;
                    }
                    this.method1164(arg0, var5, var4, var4.field1613, var5 + var6, false);
                    var6 -= var4.field1613;
                    var5 += var4.field1613;
                } while (!this.field2835.method846(arg0, var4, var6, (byte) 101, var5));
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([IILbb;IIZ)V")
    private final void method1164(int[] arg0, int arg1, class90 arg2, int arg3, int arg4, boolean arg5) {
        if ((this.field2835.field2012[arg2.field1598] & 0x4) != 0 && arg2.field1597 < 0) {
            int var7 = this.field2835.field2033[arg2.field1598] / class140.field2443;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field1605) / var7;
                if (arg3 < var8) {
                    arg2.field1605 += arg3 * var7;
                    break;
                }
                arg3 -= var8;
                int var9 = 262144 / var7;
                arg2.field1600.method209(arg0, arg1, var8);
                int var10 = class140.field2443 / 100;
                if (var10 > var9) {
                    var10 = var9;
                }
                arg1 += var8;
                arg2.field1605 += var7 * var8 - 1048576;
                class59 var11 = arg2.field1600;
                if (this.field2835.field2020[arg2.field1598] == 0) {
                    arg2.field1600 = class59.method364(arg2.field1615, var11.method370(), var11.method377(), var11.method350());
                } else {
                    arg2.field1600 = class59.method364(arg2.field1615, var11.method370(), 0, var11.method350());
                    this.field2835.method853(arg2, 127, arg2.field1602.field3489[arg2.field1612] < 0);
                    arg2.field1600.method349(var10, var11.method377());
                }
                if (arg2.field1602.field3489[arg2.field1612] < 0) {
                    arg2.field1600.method361(-1);
                }
                var11.method363(var10);
                var11.method209(arg0, arg1, arg4 - arg1);
                if (var11.method343()) {
                    this.field2847.method1658(var11);
                }
            }
        }
        if (!arg5) {
            arg2.field1600.method209(arg0, arg1, arg3);
            field2840++;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)[Lwh;")
    public static final class193[] method1165(boolean arg0) {
        class193[] var1 = new class193[class245.field4415];
        if (!arg0) {
            field2832 = false;
        }
        for (int var2 = 0; var2 < class245.field4415; var2++) {
            var1[var2] = new class173(class153.field2693, class226.field4044, class169.field2974[var2], class67.field1230[var2], class246.field4435[var2], class42.field663[var2], class255.field4614[var2], class248.field4475);
        }
        field2839++;
        class50.method276((byte) 120);
        return var1;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
    public final void method213(int arg0) {
        this.field2847.method213(arg0);
        field2843++;
        for (class90 var2 = (class90) this.field2831.method1151(115); var2 != null; var2 = (class90) this.field2831.method1159(126)) {
            if (!this.field2835.method851(false, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field1613 >= var3) {
                        this.method1166(true, var3, var2);
                        var2.field1613 -= var3;
                        break;
                    }
                    this.method1166(true, var2.field1613, var2);
                    var3 -= var2.field1613;
                } while (!this.field2835.method846((int[]) null, var2, var3, (byte) 101, 0));
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZILbb;)V")
    private final void method1166(boolean arg0, int arg1, class90 arg2) {
        field2842++;
        if ((this.field2835.field2012[arg2.field1598] & 0x4) != 0 && arg2.field1597 < 0) {
            int var4 = this.field2835.field2033[arg2.field1598] / class140.field2443;
            int var5 = (var4 + 1048575 - arg2.field1605) / var4;
            arg2.field1605 = arg1 * var4 + arg2.field1605 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field2835.field2020[arg2.field1598] == 0) {
                    arg2.field1600 = class59.method364(arg2.field1615, arg2.field1600.method370(), arg2.field1600.method377(), arg2.field1600.method350());
                } else {
                    arg2.field1600 = class59.method364(arg2.field1615, arg2.field1600.method370(), 0, arg2.field1600.method350());
                    this.field2835.method853(arg2, 127, arg2.field1602.field3489[arg2.field1612] < 0);
                }
                if (arg2.field1602.field3489[arg2.field1612] < 0) {
                    arg2.field1600.method361(-1);
                }
                arg1 = arg2.field1605 / var4;
            }
        }
        if (arg0) {
            arg2.field1600.method213(arg1);
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lvj;)V")
    public class161(class115 arg0) {
        this.field2835 = arg0;
    }
}
