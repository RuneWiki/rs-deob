import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class290 {

    @OriginalMember(owner = "client!l", name = "i", descriptor = "Laf;")
    private class39 field4275 = new class39(64);

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Lae;")
    private class283 field4270;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public int field4268;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "[I")
    public static int[] field4274 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Lo;")
    public static class208 field4269 = new class208(12, 0, 1, 0);

    @OriginalMember(owner = "client!l", name = "l", descriptor = "Lvb;")
    public static class395 field4278 = new class395();

    @OriginalMember(owner = "client!l", name = "m", descriptor = "Ljn;")
    public static class134 field4279 = new class134(111, 6);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "Lqu;")
    public static class313 field4277;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 4)
    public final void method1923(int arg0) {
        field4271++;
        class39 var2 = this.field4275;
        synchronized (this.field4275) {
            this.field4275.method319(-17);
        }
        if (arg0 != 0) {
            this.method1923(-113);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V", line = 20)
    public final void method1924(byte arg0) {
        class39 var2 = this.field4275;
        synchronized (this.field4275) {
            if (arg0 >= -22) {
                this.method1923(101);
            }
            this.field4275.method314(-2);
        }
        field4276++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)Lwi;", line = 38)
    public final class502 method1925(int arg0, byte arg1) {
        field4273++;
        class39 var3 = this.field4275;
        class502 var4;
        synchronized (this.field4275) {
            var4 = (class502) this.field4275.method312(0, (long) arg0);
        }
        if (arg1 != -23) {
            field4269 = null;
        }
        if (var4 != null) {
            return var4;
        }
        class283 var5 = this.field4270;
        byte[] var6;
        synchronized (this.field4270) {
            var6 = this.field4270.method1849(arg0, (byte) -107, 16);
        }
        class502 var7 = new class502();
        if (var6 != null) {
            var7.method2940(new class511(var6), (byte) 118);
        }
        class39 var8 = this.field4275;
        synchronized (this.field4275) {
            this.field4275.method305(var7, (long) arg0, arg1 ^ 0xFFFFB879);
            return var7;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIB)V", line = 72)
    public static final void method1926(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field4267++;
        if (arg4 != 1) {
            field4279 = null;
        }
        if (class727.field10060 <= arg2 && arg2 <= class474.field6576) {
            int var5 = class436.method2621(arg3, class627.field8783, class177.field2236, arg4 + 511);
            int var6 = class436.method2621(arg0, class627.field8783, class177.field2236, arg4 + 511);
            class345.method2178(var5, arg2, (byte) -81, var6, arg1);
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V", line = 92)
    public static void method1927(int arg0) {
        field4269 = null;
        field4278 = null;
        field4279 = null;
        field4277 = null;
        if (arg0 > -44) {
            field4274 = null;
        }
        field4274 = null;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IB)V", line = 109)
    public final void method1928(int arg0, byte arg1) {
        if (arg1 <= 106) {
            field4277 = null;
        }
        field4272++;
        class39 var3 = this.field4275;
        synchronized (this.field4275) {
            this.field4275.method308(-1, arg0);
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljk;ILae;)V", line = 127)
    public class290(class788 arg0, int arg1, class283 arg2) {
        this.field4270 = arg2;
        if (this.field4270 == null) {
            this.field4268 = 0;
        } else {
            this.field4268 = this.field4270.method1867(16, (byte) 49);
        }
    }
}
