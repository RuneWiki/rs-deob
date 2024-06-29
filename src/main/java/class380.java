import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class380 {

    @OriginalMember(owner = "client!br", name = "a", descriptor = "Lcv;")
    private class18 field5789 = new class18();

    @OriginalMember(owner = "client!br", name = "b", descriptor = "Lpg;")
    public static class492 field5790 = new class492(105, 1);

    @OriginalMember(owner = "client!br", name = "k", descriptor = "Lcm;")
    public static class449 field5799 = new class449(28, 8);

    @OriginalMember(owner = "client!br", name = "o", descriptor = "[[Z")
    public static boolean[][] field5803 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!br", name = "c", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!br", name = "e", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!br", name = "f", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!br", name = "g", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!br", name = "h", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!br", name = "i", descriptor = "I")
    public static int field5797;

    @OriginalMember(owner = "client!br", name = "j", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!br", name = "m", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!br", name = "p", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "Lcv;")
    private class18 field5800;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "[[[Ldr;")
    public static class420[][][] field5802;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Lcv;I)V", line = 4)
    public final void method2353(class18 arg0, int arg1) {
        if (arg1 != -9798) {
            return;
        }
        field5793++;
        if (arg0.field280 != null) {
            arg0.method142(arg1 ^ 0xFFFFD9BA);
        }
        arg0.field279 = this.field5789;
        arg0.field280 = this.field5789.field280;
        arg0.field280.field279 = arg0;
        arg0.field279.field280 = arg0;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)I", line = 22)
    public final int method2354(int arg0) {
        field5796++;
        int var2 = 0;
        for (class18 var3 = this.field5789.field279; var3 != this.field5789; var3 = var3.field279) {
            var2++;
        }
        return arg0 > -1 ? 119 : var2;
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V", line = 47)
    public static void method2355(int arg0) {
        if (arg0 <= 18) {
            field5790 = null;
        }
        field5803 = null;
        field5790 = null;
        field5802 = null;
        field5799 = null;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(BZ)V", line = 60)
    public static final void method2356(byte arg0, boolean arg1) {
        field5798++;
        while (class486.field7134.method2080((byte) -67, class461.field6755) >= 15) {
            int var2 = class486.field7134.method2084((byte) -118, 15);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            if (class151.field2174[var2] == null) {
                class151.field2174[var2] = new class194();
                class151.field2174[var2].field5254 = var2;
                var3 = true;
            }
            class194 var4 = class151.field2174[var2];
            class259.field3609[class25.field411++] = var2;
            var4.field5330 = class405.field6116;
            if (var4.field2768 != null && var4.field2768.method2129(arg0 + 5017)) {
                class394.method2423(var4, -78);
            }
            int var5;
            if (arg1) {
                var5 = class486.field7134.method2084((byte) -118, 8);
                if (var5 > 127) {
                    var5 -= 256;
                }
            } else {
                var5 = class486.field7134.method2084((byte) -118, 5);
                if (var5 > 15) {
                    var5 -= 32;
                }
            }
            int var6;
            if (arg1) {
                var6 = class486.field7134.method2084((byte) -118, 8);
                if (var6 > 127) {
                    var6 -= 256;
                }
            } else {
                var6 = class486.field7134.method2084((byte) -118, 5);
                if (var6 > 15) {
                    var6 -= 32;
                }
            }
            int var7 = class486.field7134.method2084((byte) -118, 2);
            int var8 = class486.field7134.method2084((byte) -118, 1);
            if (var8 == 1) {
                class35.field578[class209.field2966++] = var2;
            }
            int var9 = (class486.field7134.method2084((byte) -118, 3) + 4 & 0x58C00007) << 11;
            var4.method1364(class410.field6175.method1216(class486.field7134.method2084((byte) -118, 14), false), arg0 ^ 0xFFFFFFC7);
            int var10 = class486.field7134.method2084((byte) -118, 1);
            var4.method2180(var4.field2768.field5083, (byte) 0);
            var4.field5245 = var4.field2768.field5099 << 3;
            if (var4.field5245 == 0) {
                var4.method2184(0, 14839);
            } else if (var3) {
                var4.method2184(var9, 14839);
            }
            var4.method1366(var4.method2091(arg0 - 15263), var7, class339.field5365.field5344[0] + var5, class339.field5365.field5339[0] + var6, var10 == 1, 31883);
            if (var4.field2768.method2129(arg0 ^ 0x13B9)) {
                class242.method1617(var4, var4.field5339[0], (byte) -108, var4.field5344[0], null, 0, null, var4.field2210);
            }
        }
        class486.field7134.method2085(7);
        if (arg0 != 18) {
            field5802 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(III)Llf;", line = 167)
    public static final class383 method2357(int arg0, int arg1, int arg2) {
        class420 var3 = field5802[arg0][arg1][arg2];
        return var3 == null || var3.field6260 == null ? null : var3.field6260;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(B)Lcv;", line = 176)
    public final class18 method2358(byte arg0) {
        field5794++;
        if (arg0 < 49) {
            return null;
        }
        class18 var2 = this.field5789.field279;
        if (this.field5789 == var2) {
            this.field5800 = null;
            return null;
        } else {
            this.field5800 = var2.field279;
            return var2;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)Z", line = 196)
    public final boolean method2359(boolean arg0) {
        if (arg0) {
            field5797++;
            return this.field5789.field279 == this.field5789;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V", line = 282)
    public class380() {
        this.field5789.field280 = this.field5789;
        this.field5789.field279 = this.field5789;
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(I)Lcv;", line = 222)
    public final class18 method2360(int arg0) {
        if (arg0 > -112) {
            field5790 = null;
        }
        field5791++;
        class18 var2 = this.field5789.field280;
        if (this.field5789 == var2) {
            this.field5800 = null;
            return null;
        } else {
            this.field5800 = var2.field280;
            return var2;
        }
    }

    @OriginalMember(owner = "client!br", name = "d", descriptor = "(I)Lcv;", line = 246)
    public final class18 method2361(int arg0) {
        field5801++;
        class18 var2 = this.field5789.field279;
        if (this.field5789 == var2) {
            return null;
        } else {
            var2.method142(arg0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(B)V", line = 262)
    public final void method2362(byte arg0) {
        field5792++;
        while (true) {
            class18 var2 = this.field5789.field279;
            if (this.field5789 == var2) {
                this.field5800 = null;
                if (arg0 <= 75) {
                    this.method2361(-101);
                    return;
                } else {
                    return;
                }
            }
            var2.method142(0);
        }
    }

    @OriginalMember(owner = "client!br", name = "e", descriptor = "(I)Lcv;", line = 292)
    public final class18 method2363(int arg0) {
        field5795++;
        class18 var2 = this.field5800;
        if (this.field5789 == var2) {
            this.field5800 = null;
            return null;
        }
        if (arg0 != 31844) {
            this.method2361(-107);
        }
        this.field5800 = var2.field279;
        return var2;
    }
}
