import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class200 {

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "Lmf;")
    private class382 field2822 = new class382(64);

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "Lmf;")
    public class382 field2835 = new class382(2);

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "Lpu;")
    private class522 field2832;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "Lpu;")
    public class522 field2829;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public static int field2824 = 0;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public static int field2825 = -1;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "[I")
    public static int[] field2828 = new int[] { 3500, 200 };

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public static int field2826 = -1;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lr;BLvg;)V", line = 3)
    public static final void method1329(class166 arg0, byte arg1, class49 arg2) {
        field2831++;
        if (arg1 != 7) {
            method1334(23, 96);
        }
        boolean var3 = class41.field682.method2227(arg2.field995 | 0xFF000000, arg2.field924, arg2.field1017, arg2.field898, arg2.field1023, arg0, arg2.field911 ? class648.field9106.field6993 : null, -21207) == null;
        if (var3) {
            class111.field1685.method474(new class85(arg2.field1023, arg2.field1017, arg2.field898, arg2.field995 | 0xFF000000, arg2.field924, arg2.field911), arg1 - 1);
            class563.method3215(true, arg2);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)Lbg;", line = 22)
    public final class428 method1330(int arg0, int arg1) {
        field2833++;
        class382 var3 = this.field2822;
        class428 var4;
        synchronized (this.field2822) {
            var4 = (class428) this.field2822.method2287(1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field2832;
        byte[] var6;
        synchronized (this.field2832) {
            var6 = this.field2832.method3007(33, arg0, 5);
        }
        class428 var7 = new class428();
        var7.field6290 = this;
        if (var6 != null) {
            var7.method2562(0, new class695(var6));
        }
        class382 var8 = this.field2822;
        synchronized (this.field2822) {
            this.field2822.method2291(var7, (long) arg0, 1);
        }
        if (arg1 <= 10) {
            this.method1335((byte) 105, 51);
        }
        return var7;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V", line = 55)
    public static void method1331(byte arg0) {
        if (arg0 != 56) {
            method1329(null, (byte) -74, null);
        }
        field2828 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)V", line = 66)
    public final void method1332(boolean arg0) {
        if (!arg0) {
            this.method1333(119);
        }
        field2823++;
        class382 var2 = this.field2822;
        synchronized (this.field2822) {
            this.field2822.method2279(0);
        }
        class382 var3 = this.field2835;
        synchronized (this.field2835) {
            this.field2835.method2279(0);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 84)
    public final void method1333(int arg0) {
        field2827++;
        class382 var2 = this.field2822;
        synchronized (this.field2822) {
            this.field2822.method2285((byte) -120);
            if (arg0 != 200) {
                this.method1333(113);
            }
        }
        class382 var3 = this.field2835;
        synchronized (this.field2835) {
            this.field2835.method2285((byte) -117);
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(II)V", line = 113)
    public static final void method1334(int arg0, int arg1) {
        class9.field89 = -1;
        if (arg0 == 37) {
            class25.field341 = 3.0F;
        } else if (arg0 == 50) {
            class25.field341 = 4.0F;
        } else if (arg0 == 75) {
            class25.field341 = 6.0F;
        } else if (arg0 == 100) {
            class25.field341 = 8.0F;
        } else if (arg0 == 200) {
            class25.field341 = 16.0F;
        }
        if (arg1 != -18088) {
            field2826 = 53;
        }
        field2830++;
        class9.field89 = -1;
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lkr;ILpu;Lpu;)V", line = 177)
    public class200(class693 arg0, int arg1, class522 arg2, class522 arg3) {
        this.field2832 = arg2;
        this.field2829 = arg3;
        this.field2832.method2988(-71, 33);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BI)V", line = 158)
    public final void method1335(byte arg0, int arg1) {
        class382 var3 = this.field2822;
        synchronized (this.field2822) {
            if (arg0 != -60) {
                method1334(1, 61);
            }
            this.field2822.method2290(false, arg1);
        }
        field2834++;
        class382 var4 = this.field2835;
        synchronized (this.field2835) {
            this.field2835.method2290(false, arg1);
        }
    }
}
