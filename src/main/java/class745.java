import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lja")
public class class745 extends class123 {

    @OriginalMember(owner = "client!lja", name = "q", descriptor = "Ljia;")
    private class645 field10280 = new class645();

    @OriginalMember(owner = "client!lja", name = "F", descriptor = "I")
    private int field10295 = 256;

    @OriginalMember(owner = "client!lja", name = "D", descriptor = "I")
    private int field10293 = 0;

    @OriginalMember(owner = "client!lja", name = "J", descriptor = "I")
    private int field10299 = 256;

    @OriginalMember(owner = "client!lja", name = "y", descriptor = "I")
    private int field10288;

    @OriginalMember(owner = "client!lja", name = "n", descriptor = "I")
    public static int field10277 = 0;

    @OriginalMember(owner = "client!lja", name = "B", descriptor = "[I")
    public static int[] field10291 = new int[14];

    @OriginalMember(owner = "client!lja", name = "m", descriptor = "I")
    public static int field10276;

    @OriginalMember(owner = "client!lja", name = "o", descriptor = "I")
    public static int field10278;

    @OriginalMember(owner = "client!lja", name = "p", descriptor = "I")
    public static int field10279;

    @OriginalMember(owner = "client!lja", name = "r", descriptor = "I")
    public static int field10281;

    @OriginalMember(owner = "client!lja", name = "s", descriptor = "I")
    public static int field10282;

    @OriginalMember(owner = "client!lja", name = "t", descriptor = "I")
    public static int field10283;

    @OriginalMember(owner = "client!lja", name = "u", descriptor = "I")
    public static int field10284;

    @OriginalMember(owner = "client!lja", name = "v", descriptor = "I")
    public static int field10285;

    @OriginalMember(owner = "client!lja", name = "x", descriptor = "I")
    public static int field10287;

    @OriginalMember(owner = "client!lja", name = "z", descriptor = "I")
    public static int field10289;

    @OriginalMember(owner = "client!lja", name = "A", descriptor = "I")
    public static int field10290;

    @OriginalMember(owner = "client!lja", name = "C", descriptor = "I")
    public static int field10292;

    @OriginalMember(owner = "client!lja", name = "E", descriptor = "I")
    public static int field10294;

    @OriginalMember(owner = "client!lja", name = "G", descriptor = "I")
    private int field10296;

    @OriginalMember(owner = "client!lja", name = "I", descriptor = "I")
    public static int field10298;

    @OriginalMember(owner = "client!lja", name = "H", descriptor = "Z")
    private boolean field10297;

    @OriginalMember(owner = "client!lja", name = "K", descriptor = "Z")
    private boolean field10300;

    @OriginalMember(owner = "client!lja", name = "w", descriptor = "[Ls;")
    public static class296[] field10286;

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(IDI)Lcha;", line = 3)
    public final class231 method4131(int arg0, double arg1, int arg2) {
        field10283++;
        long var5 = (long) (this.field10288 << 0 | arg0);
        class231 var7 = (class231) class198.field2996.method1077(var5, (byte) 122);
        if (var7 == null) {
            var7 = new class231(new short[this.field10288][arg0], arg1);
        } else {
            var7.field3358 = arg1;
            class198.field2996.method1075((byte) -61, var5);
        }
        if (arg2 > -81) {
            this.method4132(-21);
        }
        return var7;
    }

    @OriginalMember(owner = "client!lja", name = "b", descriptor = "(I)D", line = 26)
    public final synchronized double method4132(int arg0) {
        if (arg0 != -25450976) {
            this.field10297 = false;
        }
        field10294++;
        if (this.field10293 < 1) {
            return -1.0D;
        } else {
            class231 var2 = (class231) this.field10280.method3589((byte) -128);
            return var2 == null ? -1.0D : (double) (-((float) var2.field3357[0].length / (float) class55.field782)) + var2.field3358;
        }
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(ILcha;)V", line = 49)
    public final synchronized void method4133(int arg0, class231 arg1) {
        while (this.field10293 >= 100) {
            this.field10280.method3584(arg0 + 23286);
            this.field10293--;
        }
        field10298++;
        if (arg0 != 1) {
            field10291 = null;
        }
        this.field10280.method3594((byte) -78, arg1);
        this.field10293++;
    }

    @OriginalMember(owner = "client!lja", name = "c", descriptor = "(I)V", line = 71)
    public static void method4134(int arg0) {
        if (arg0 != 256) {
            field10286 = null;
        }
        field10286 = null;
        field10291 = null;
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(B)V", line = 82)
    private final synchronized void method4135(byte arg0) {
        field10285++;
        class231 var2 = this.method4139(16660);
        if (var2 == null) {
            return;
        }
        var2.method1207(124);
        if (arg0 != 15) {
            this.method354();
        }
        this.field10296 = 0;
        this.field10293--;
        class198.field2996.method1079(var2, var2.method1566((byte) -9), (byte) -123);
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(Z)V", line = 104)
    public final synchronized void method4136(boolean arg0) {
        this.field10297 = arg0;
        field10287++;
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "()Lri;", line = 112)
    public final class123 method355() {
        field10279++;
        return null;
    }

    @OriginalMember(owner = "client!lja", name = "b", descriptor = "([III)V", line = 122)
    public final synchronized void method356(int[] arg0, int arg1, int arg2) {
        field10290++;
        if (this.field10300) {
            return;
        }
        if (this.method4139(16660) != null) {
            int var4 = arg1 + arg2;
            if (class137.field2352) {
                var4 <<= 0x1;
            }
            byte var5 = 0;
            byte var6 = 0;
            if (this.field10288 == 2) {
                var6 = 1;
            }
            while (arg1 < var4) {
                class231 var7 = this.method4139(16660);
                if (var7 == null) {
                    return;
                }
                short[][] var8 = var7.field3357;
                while (arg1 < var4 && this.field10296 < var8[0].length) {
                    if (class137.field2352) {
                        arg0[arg1++] = var8[var5][this.field10296] * this.field10295;
                        arg0[arg1++] = var8[var6][this.field10296] * this.field10299;
                    } else {
                        int var10001 = arg1++;
                        arg0[var10001] += var8[var5][this.field10296] * this.field10295 + var8[var6][this.field10296] * this.field10299;
                    }
                    this.field10296++;
                }
                if (var8[0].length <= this.field10296) {
                    this.method4135((byte) 15);
                }
            }
        } else if (this.field10297) {
            this.method1207(126);
            class198.field2996.method1080(90);
        }
    }

    @OriginalMember(owner = "client!lja", name = "f", descriptor = "(I)I", line = 192)
    public final synchronized int method4137(int arg0) {
        field10284++;
        return arg0 == 256 ? this.field10293 : -4;
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(BZ)V", line = 205)
    public final synchronized void method4138(byte arg0, boolean arg1) {
        if (arg0 != 90) {
            this.field10288 = -2;
        }
        field10289++;
        this.field10300 = arg1;
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(I)V", line = 216)
    public final synchronized void method351(int arg0) {
        field10276++;
        if (this.field10300) {
            return;
        }
        while (true) {
            class231 var2 = this.method4139(16660);
            if (var2 == null) {
                if (this.field10297) {
                    this.method1207(91);
                    class198.field2996.method1080(90);
                }
                return;
            }
            if (arg0 < var2.field3357[0].length - this.field10296) {
                this.field10296 += arg0;
                return;
            }
            arg0 -= var2.field3357[0].length - this.field10296;
            this.method4135((byte) 15);
        }
    }

    @OriginalMember(owner = "client!lja", name = "c", descriptor = "()I", line = 256)
    public final int method354() {
        field10281++;
        return 1;
    }

    @OriginalMember(owner = "client!lja", name = "g", descriptor = "(I)Lcha;", line = 264)
    private final synchronized class231 method4139(int arg0) {
        field10292++;
        return arg0 == 16660 ? (class231) this.field10280.method3589((byte) -128) : null;
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(II)V", line = 278)
    public final void method4140(int arg0, int arg1) {
        field10282++;
        if (arg0 != 256) {
            this.method4133(119, null);
        }
        this.field10299 = arg1;
        this.field10295 = arg1;
    }

    @OriginalMember(owner = "client!lja", name = "<init>", descriptor = "(I)V", line = 321)
    public class745(int arg0) {
        this.field10288 = arg0;
    }

    @OriginalMember(owner = "client!lja", name = "d", descriptor = "()Lri;", line = 301)
    public final class123 method362() {
        field10278++;
        return null;
    }
}
