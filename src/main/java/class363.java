import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class363 {

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "Lvh;")
    private class328 field5185 = new class328(64);

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "Lvh;")
    public class328 field5186 = new class328(30);

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "Lpj;")
    private class132 field5176;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "Lpj;")
    public class132 field5177;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Z")
    public static boolean field5178 = false;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "Lfu;")
    public static class356 field5180 = null;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "[I")
    public static int[] field5181 = new int[2];

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "[I")
    public static int[] field5182 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public int field5187;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Ljr;")
    public static class96 field5174;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V", line = 3)
    public static void method2126(byte arg0) {
        field5182 = null;
        int var1 = 121 % ((44 - arg0) / 48);
        field5174 = null;
        field5180 = null;
        field5181 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 18)
    public final void method2127(int arg0) {
        field5175++;
        class328 var2 = this.field5185;
        synchronized (this.field5185) {
            this.field5185.method1987(-31085);
        }
        if (arg0 == -3985) {
            class328 var3 = this.field5186;
            synchronized (this.field5186) {
                this.field5186.method1987(-31085);
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Lor;", line = 37)
    public final class586 method2128(int arg0, int arg1) {
        field5179++;
        if (arg1 != -1) {
            this.method2127(126);
        }
        class328 var3 = this.field5185;
        class586 var4;
        synchronized (this.field5185) {
            var4 = (class586) this.field5185.method1986((byte) -119, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class132 var5 = this.field5176;
        byte[] var6;
        synchronized (this.field5176) {
            var6 = this.field5176.method940(class477.method2714(arg0, arg1 - 91), class648.method3608(arg0, 0), 0);
        }
        class586 var7 = new class586();
        var7.field8193 = arg0;
        var7.field8173 = this;
        if (var6 != null) {
            var7.method3264(new class96(var6), false);
        }
        class328 var8 = this.field5185;
        synchronized (this.field5185) {
            this.field5185.method1985(var7, (long) arg0, (byte) -102);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)V", line = 72)
    public final void method2129(int arg0, int arg1) {
        field5183++;
        this.field5187 = arg0;
        class328 var3 = this.field5186;
        synchronized (this.field5186) {
            if (arg1 != 30) {
                this.method2130(41, -74);
            }
            this.field5186.method1997(1);
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(II)V", line = 86)
    public final void method2130(int arg0, int arg1) {
        class328 var3 = this.field5185;
        synchronized (this.field5185) {
            if (arg1 != -1) {
                return;
            }
            this.field5185.method1989(arg0, (byte) 112);
        }
        field5184++;
        class328 var4 = this.field5186;
        synchronized (this.field5186) {
            this.field5186.method1989(arg0, (byte) 91);
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V", line = 113)
    public final void method2131(byte arg0) {
        field5173++;
        class328 var2 = this.field5185;
        synchronized (this.field5185) {
            this.field5185.method1997(1);
        }
        class328 var3 = this.field5186;
        synchronized (this.field5186) {
            if (arg0 > 24) {
                this.field5186.method1997(1);
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Ldd;ILpj;Lpj;)V", line = 144)
    public class363(class647 arg0, int arg1, class132 arg2, class132 arg3) {
        this.field5176 = arg2;
        this.field5177 = arg3;
        int var5 = this.field5176.method917((byte) -74) - 1;
        this.field5176.method936(var5, -118);
    }
}
