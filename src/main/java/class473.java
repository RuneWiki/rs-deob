import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class473 {

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "Lkv;")
    private class180 field6590;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "Lwd;")
    private class183 field6587;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "Lwt;")
    private class207 field6592;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "Lwm;")
    private class403 field6580;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "Llw;")
    public static class479 field6588;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "[Lib;")
    private class108[] field6589;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZLwk;Lwk;I)Lib;", line = 3)
    private final class108 method2730(int arg0, boolean arg1, class97 arg2, class97 arg3, int arg4) {
        field6581++;
        if (this.field6580 == null) {
            throw new RuntimeException();
        }
        this.field6580.field5665 = arg4 * 8 + 5;
        if (this.field6580.field5665 >= this.field6580.field5663.length) {
            throw new RuntimeException();
        } else if (this.field6589[arg4] == null) {
            int var6 = this.field6580.method2319((byte) 113);
            int var7 = this.field6580.method2319((byte) 105);
            class108 var8 = new class108(arg4, arg3, arg2, this.field6587, this.field6590, var6, var7, arg1);
            if (arg0 != 32368) {
                field6588 = null;
            }
            this.field6589[arg4] = var8;
            return var8;
        } else {
            return this.field6589[arg4];
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 54)
    public final void method2731(int arg0) {
        field6585++;
        if (this.field6589 == null) {
            return;
        }
        int var2 = 0;
        int var3 = -101 / ((-arg0 - 17) / 33);
        while (var2 < this.field6589.length) {
            if (this.field6589[var2] != null) {
                this.field6589[var2].method740((byte) 39);
            }
            var2++;
        }
        for (int var4 = 0; var4 < this.field6589.length; var4++) {
            if (this.field6589[var4] != null) {
                this.field6589[var4].method745(false);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)I", line = 89)
    public static final int method2732(byte arg0, int arg1) {
        if (arg0 != 78) {
            field6584 = -65;
        }
        field6593++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lwk;IBLwk;)Lib;", line = 102)
    public final class108 method2733(class97 arg0, int arg1, byte arg2, class97 arg3) {
        if (arg2 >= -47) {
            return null;
        } else {
            field6586++;
            return this.method2730(32368, true, arg0, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Lvl;", line = 118)
    public static final class11 method2734(int arg0, int arg1) {
        field6591++;
        if (arg0 != -2) {
            method2736(false, null, true);
        }
        if (arg1 == 0) {
            if ((double) class245.field3556 == 3.0D) {
                return class132.field1734;
            }
            if ((double) class245.field3556 == 4.0D) {
                return class68.field860;
            }
            if ((double) class245.field3556 == 6.0D) {
                return class510.field7558;
            }
            if ((double) class245.field3556 >= 8.0D) {
                return class377.field5337;
            }
        } else if (arg1 == 1) {
            if ((double) class245.field3556 == 3.0D) {
                return class510.field7558;
            }
            if ((double) class245.field3556 == 4.0D) {
                return class377.field5337;
            }
            if ((double) class245.field3556 == 6.0D) {
                return class496.field7037;
            }
            if ((double) class245.field3556 >= 8.0D) {
                return class273.field4051;
            }
        } else if (arg1 == 2) {
            if ((double) class245.field3556 == 3.0D) {
                return class496.field7037;
            }
            if ((double) class245.field3556 == 4.0D) {
                return class273.field4051;
            }
            if ((double) class245.field3556 == 6.0D) {
                return class127.field1710;
            }
            if ((double) class245.field3556 >= 8.0D) {
                return class150.field2035;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V", line = 185)
    public static void method2735(int arg0) {
        field6588 = null;
        int var1 = -8 / ((-arg0 - 19) / 34);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z[BZ)Ljava/lang/Object;", line = 194)
    public static final Object method2736(boolean arg0, byte[] arg1, boolean arg2) {
        if (!arg0) {
            field6584 = 7;
        }
        field6582++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class3.field64) {
            try {
                class538 var3 = (class538) Class.forName("ao").getDeclaredConstructor().newInstance();
                var3.method1225((byte) 122, arg1);
                return var3;
            } catch (Throwable var4) {
                class3.field64 = true;
            }
        }
        return arg2 ? class220.method1366(arg1, -24315) : arg1;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lwd;Lkv;)V", line = 227)
    public class473(class183 arg0, class180 arg1) {
        this.field6590 = arg1;
        this.field6587 = arg0;
        if (!this.field6587.method1152(20)) {
            this.field6592 = this.field6587.method1149((byte) 0, 255, (byte) 127, true, 255);
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)Z", line = 239)
    public final boolean method2737(int arg0) {
        field6583++;
        if (this.field6580 != null) {
            return true;
        }
        if (this.field6592 == null) {
            if (this.field6587.method1152(20)) {
                return false;
            }
            this.field6592 = this.field6587.method1149((byte) 0, 255, (byte) 127, true, 255);
        }
        if (this.field6592.field2496) {
            return false;
        } else {
            int var2 = -111 / ((arg0 - 40) / 52);
            this.field6580 = new class403(this.field6592.method1073(-121));
            this.field6589 = new class108[(this.field6580.field5663.length - 5) / 8];
            return true;
        }
    }
}
