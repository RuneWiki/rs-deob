import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class278 {

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field4296 = 0;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field4302 = 0;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "[I")
    public static int[] field4304 = new int[2500];

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field4309 = 0;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "[J")
    public static long[] field4306 = new long[1000];

    @OriginalMember(owner = "client!re", name = "o", descriptor = "[Lgi;")
    public static class216[] field4308 = new class216[28];

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public int field4294;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public int field4295;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public int field4299;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "[Lgk;")
    public static class7[] field4307;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V", line = 8)
    public static final void method1985(byte arg0) {
        class294.field4640 = (byte[][][]) null;
        class179.field2863 = null;
        class193.field3069 = (byte[][][]) null;
        class87.field1337 = null;
        int var1 = 56 % ((71 - arg0) / 43);
        class74.field1136 = (byte[][][]) null;
        class263.field4071 = null;
        class115.field1886 = null;
        class139.field2215 = null;
        field4297++;
        class100.field1647 = (byte[][][]) null;
        class295.field4667 = (byte[][][]) null;
        class151.field2426 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([SZ)[S", line = 32)
    public static final short[] method1986(short[] arg0, boolean arg1) {
        field4298++;
        if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class271.method1957(arg0, 0, var2, 0, arg0.length);
            return arg1 ? var2 : (short[]) null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lpe;BI)V", line = 50)
    private final void method1987(class101 arg0, byte arg1, int arg2) {
        field4303++;
        if (arg2 == 1) {
            this.field4295 = arg0.method731(false);
            this.field4299 = arg0.method741(71);
            this.field4294 = arg0.method741(70);
        }
        if (arg1 != -25) {
            field4307 = (class7[]) null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)Ld;", line = 78)
    public static final class143 method1988(int arg0, int arg1) {
        if (arg0 > -78) {
            method1985((byte) -101);
        }
        field4301++;
        class143 var2 = (class143) class250.field3856.method2017(1022, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class202.field3175.method467(arg1, 78, 5);
        class143 var4 = new class143();
        if (var3 != null) {
            var4.method1093(24484, new class101(var3));
        }
        class250.field3856.method2018((long) arg1, var4, -60);
        return var4;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZLpe;)V", line = 110)
    public final void method1989(boolean arg0, class101 arg1) {
        if (arg0) {
            return;
        }
        while (true) {
            int var3 = arg1.method741(46);
            if (var3 == 0) {
                field4305++;
                return;
            }
            this.method1987(arg1, (byte) -25, var3);
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V", line = 131)
    public static void method1990(byte arg0) {
        field4307 = null;
        int var1 = -3 / ((arg0 + 38) / 42);
        field4306 = null;
        field4304 = null;
        field4308 = null;
    }
}
