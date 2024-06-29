import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class220 extends class427 {

    @OriginalMember(owner = "client!sca", name = "s", descriptor = "Lfea;")
    public class47 field3300 = new class47();

    @OriginalMember(owner = "client!sca", name = "E", descriptor = "Llq;")
    public class9 field3312 = new class9();

    @OriginalMember(owner = "client!sca", name = "t", descriptor = "Ltda;")
    private class16 field3301;

    @OriginalMember(owner = "client!sca", name = "y", descriptor = "Lhf;")
    public static class573 field3306 = new class573(2);

    @OriginalMember(owner = "client!sca", name = "D", descriptor = "I")
    public static int field3311 = 0;

    @OriginalMember(owner = "client!sca", name = "C", descriptor = "[B")
    public static byte[] field3310 = new byte[2048];

    @OriginalMember(owner = "client!sca", name = "o", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!sca", name = "q", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!sca", name = "r", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!sca", name = "u", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!sca", name = "v", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!sca", name = "w", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!sca", name = "x", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!sca", name = "z", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!sca", name = "B", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!sca", name = "A", descriptor = "Lgp;")
    public static class561 field3308;

    @OriginalMember(owner = "client!sca", name = "p", descriptor = "[I")
    public static int[] field3297;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "()Lps;", line = 3)
    public final class427 method45() {
        field3299++;
        class35 var1 = (class35) this.field3300.method427(true);
        if (var1 == null) {
            return null;
        } else if (var1.field471 == null) {
            return this.method36();
        } else {
            return var1.field471;
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z)V", line = 20)
    public static void method1471(boolean arg0) {
        field3297 = null;
        field3310 = null;
        field3308 = null;
        if (!arg0) {
            method1474((byte) -122, null);
        }
        field3306 = null;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IILpc;)V", line = 33)
    private final void method1472(int arg0, int arg1, class35 arg2) {
        if (arg1 < 104) {
            this.field3301 = null;
        }
        field3302++;
        if ((this.field3301.field185[arg2.field479] & 0x4) != 0 && arg2.field488 < 0) {
            int var4 = this.field3301.field187[arg2.field479] / class604.field8591;
            int var5 = (var4 + 1048575 - arg2.field467) / var4;
            arg2.field467 = arg0 * var4 + arg2.field467 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field3301.field198[arg2.field479] == 0) {
                    arg2.field471 = class320.method1969(arg2.field478, arg2.field471.method1963(), arg2.field471.method1981(), arg2.field471.method1994());
                } else {
                    arg2.field471 = class320.method1969(arg2.field478, arg2.field471.method1963(), 0, arg2.field471.method1994());
                    this.field3301.method192(arg2, arg2.field486.field3325[arg2.field475] < 0, -1);
                }
                if (arg2.field486.field3325[arg2.field475] < 0) {
                    arg2.field471.method1975(-1);
                }
                arg0 = arg2.field467 / var4;
            }
        }
        arg2.field471.method48(arg0);
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V", line = 79)
    public final void method48(int arg0) {
        field3304++;
        this.field3312.method48(arg0);
        for (class35 var2 = (class35) this.field3300.method427(true); var2 != null; var2 = (class35) this.field3300.method420(false)) {
            if (!this.field3301.method175(false, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field481 >= var3) {
                        this.method1472(var3, 112, var2);
                        var2.field481 -= var3;
                        break;
                    }
                    this.method1472(var2.field481, 110, var2);
                    var3 -= var2.field481;
                } while (!this.field3301.method183(var2, 0, var3, null, (byte) -24));
            }
        }
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "([III)V", line = 116)
    public final void method38(int[] arg0, int arg1, int arg2) {
        field3307++;
        this.field3312.method38(arg0, arg1, arg2);
        for (class35 var4 = (class35) this.field3300.method427(true); var4 != null; var4 = (class35) this.field3300.method420(false)) {
            if (!this.field3301.method175(false, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field481) {
                        this.method1473(var5 + var6, var5, false, arg0, var4, var6);
                        var4.field481 -= var6;
                        break;
                    }
                    this.method1473(var5 + var6, var5, false, arg0, var4, var4.field481);
                    var6 -= var4.field481;
                    var5 += var4.field481;
                } while (!this.field3301.method183(var4, var5, var6, arg0, (byte) -24));
            }
        }
    }

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "()Lps;", line = 155)
    public final class427 method36() {
        field3305++;
        class35 var1;
        do {
            var1 = (class35) this.field3300.method420(false);
            if (var1 == null) {
                return null;
            }
        } while (var1.field471 == null);
        return var1.field471;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIZ[ILpc;I)V", line = 176)
    private final void method1473(int arg0, int arg1, boolean arg2, int[] arg3, class35 arg4, int arg5) {
        if ((this.field3301.field185[arg4.field479] & 0x4) != 0 && arg4.field488 < 0) {
            int var7 = this.field3301.field187[arg4.field479] / class604.field8591;
            while (true) {
                int var8 = (1048575 - (arg4.field467 - var7)) / var7;
                if (arg5 < var8) {
                    arg4.field467 += arg5 * var7;
                    break;
                }
                arg4.field471.method38(arg3, arg1, var8);
                arg5 -= var8;
                arg4.field467 += var7 * var8 - 1048576;
                arg1 += var8;
                int var9 = class604.field8591 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class320 var11 = arg4.field471;
                if (this.field3301.field198[arg4.field479] == 0) {
                    arg4.field471 = class320.method1969(arg4.field478, var11.method1963(), var11.method1981(), var11.method1994());
                } else {
                    arg4.field471 = class320.method1969(arg4.field478, var11.method1963(), 0, var11.method1994());
                    this.field3301.method192(arg4, arg4.field486.field3325[arg4.field475] < 0, -1);
                    arg4.field471.method1993(var9, var11.method1981());
                }
                if (arg4.field486.field3325[arg4.field475] < 0) {
                    arg4.field471.method1975(-1);
                }
                var11.method1962(var9);
                var11.method38(arg3, arg1, arg0 - arg1);
                if (var11.method1970()) {
                    this.field3312.method37(var11);
                }
            }
        }
        if (arg2) {
            this.method48(-48);
        }
        field3296++;
        arg4.field471.method38(arg3, arg1, arg5);
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "()I", line = 238)
    public final int method39() {
        field3303++;
        return 0;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 246)
    public static final boolean method1474(byte arg0, String arg1) {
        field3298++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 != -119) {
            field3306 = null;
        }
        for (int var2 = 0; var2 < class404.field6020; var2++) {
            if (arg1.equalsIgnoreCase(class534.field7454[var2])) {
                return true;
            }
        }
        return arg1.equalsIgnoreCase(class644.field9367.field5958);
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Ltda;)V", line = 299)
    public class220(class16 arg0) {
        this.field3301 = arg0;
    }
}
