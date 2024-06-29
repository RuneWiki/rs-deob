import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class270 {

    @OriginalMember(owner = "client!se", name = "j", descriptor = "Lqj;")
    private class535 field3939 = new class535(64);

    @OriginalMember(owner = "client!se", name = "l", descriptor = "Luq;")
    private class172 field3941;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "Ljq;")
    public static class537 field3940 = new class537(0, 0);

    @OriginalMember(owner = "client!se", name = "n", descriptor = "[I")
    public static int[] field3943 = new int[1000];

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "Luq;")
    public static class172 field3942;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "[[B")
    public static byte[][] field3936;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
    public static final void method1793(boolean arg0) {
        field3934++;
        for (class608 var1 = (class608) class398.field5706.method679((byte) -86); var1 != null; var1 = (class608) class398.field5706.method681(-27)) {
            if (var1.field8225) {
                var1.method1102((byte) 89);
            } else {
                var1.field8231 = true;
                if (var1.field8230 >= 0 && var1.field8232 >= 0 && class102.field1467 > var1.field8230 && var1.field8232 < class393.field5663) {
                    class58.method366(0, var1);
                }
            }
        }
        if (arg0) {
            return;
        }
        for (class608 var2 = (class608) class518.field7196.method679((byte) -86); var2 != null; var2 = (class608) class518.field7196.method681(-94)) {
            if (var2.field8225) {
                var2.method1102((byte) 92);
            } else {
                var2.field8231 = true;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public static void method1794(int arg0) {
        field3942 = null;
        field3943 = null;
        field3936 = null;
        field3940 = null;
        if (arg0 != 54) {
            method1799(-107, 107, 45);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
    public final void method1795(int arg0) {
        field3935++;
        class535 var2 = this.field3939;
        synchronized (this.field3939) {
            if (arg0 != 64) {
                this.method1795(84);
            }
            this.field3939.method3113(-128);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V")
    public final void method1796(int arg0, int arg1) {
        class535 var3 = this.field3939;
        synchronized (this.field3939) {
            this.field3939.method3101(false, arg0);
            int var4 = 71 % ((arg1 - 46) / 58);
        }
        field3930++;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)I")
    public static final int method1797(int arg0) {
        field3937++;
        int var1 = class574.field7827.method1558((byte) 122);
        if (class170.field2232.length - 1 > var1) {
            class574.field7827 = class170.field2232[var1 + 1];
        }
        if (arg0 > -87) {
            field3943 = null;
        }
        return 100;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V")
    public final void method1798(boolean arg0) {
        field3933++;
        class535 var2 = this.field3939;
        synchronized (this.field3939) {
            this.field3939.method3103(-11294);
        }
        if (!arg0) {
            this.method1795(98);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)I")
    public static final int method1799(int arg0, int arg1, int arg2) {
        field3932++;
        double var3 = Math.log((double) arg1) / Math.log(2.0D);
        double var5 = Math.log((double) arg2) / Math.log(2.0D);
        if (arg0 == 2) {
            double var7 = (var3 - var5) * Math.random() + var5;
            return (int) (Math.pow(2.0D, var7) + 0.5D);
        } else {
            return -115;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)Lfv;")
    public final class132 method1800(int arg0, int arg1) {
        field3938++;
        class535 var3 = this.field3939;
        class132 var4;
        synchronized (this.field3939) {
            var4 = (class132) this.field3939.method3109((byte) 121, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class172 var5 = this.field3941;
        byte[] var6;
        synchronized (this.field3941) {
            var6 = this.field3941.method1188(54, arg1 - 49235, arg0);
            if (arg1 != 31188) {
                this.method1798(true);
            }
        }
        class132 var7 = new class132();
        if (var6 != null) {
            var7.method931(new class254(var6), arg1 ^ 0x14F1);
        }
        class535 var8 = this.field3939;
        synchronized (this.field3939) {
            this.field3939.method3108((long) arg0, arg1 - 14851, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lkw;ILuq;)V")
    public class270(class263 arg0, int arg1, class172 arg2) {
        this.field3941 = arg2;
        if (this.field3941 != null) {
            this.field3941.method1175(54, (byte) 102);
        }
    }
}
