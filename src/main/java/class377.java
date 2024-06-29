import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class377 {

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Luf;")
    private class380 field4987 = new class380(128);

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "Luf;")
    public class380 field5001 = new class380(64);

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "Lga;")
    private class332 field5000;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "Lga;")
    public class332 field4993;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Leba;")
    public static class550 field4988 = new class550(59, 0);

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "[I")
    public static int[] field4991 = new int[500];

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field4992 = 2;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "Ljw;")
    public static class259 field4998 = new class259(3, 7);

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Lr;")
    public static class562 field4985;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 4)
    public final void method2152(byte arg0) {
        field4994++;
        class380 var2 = this.field4987;
        synchronized (this.field4987) {
            this.field4987.method2168((byte) -78);
        }
        class380 var3 = this.field5001;
        synchronized (this.field5001) {
            this.field5001.method2168((byte) -103);
        }
        int var4 = -14 % ((arg0 + 6) / 62);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V", line = 21)
    public final void method2153(boolean arg0) {
        class380 var2 = this.field4987;
        synchronized (this.field4987) {
            if (arg0) {
                return;
            }
            this.field4987.method2172(-15112);
        }
        field4999++;
        class380 var3 = this.field5001;
        synchronized (this.field5001) {
            this.field5001.method2172(-15112);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([J[IZ)V", line = 37)
    public static final void method2154(long[] arg0, int[] arg1, boolean arg2) {
        class180.method1209(arg1, arg0.length - 1, (byte) -11, 0, arg0);
        field4986++;
        if (!arg2) {
            method2156(114);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIB)V", line = 48)
    public final void method2155(int arg0, int arg1, byte arg2) {
        this.field4987 = new class380(arg1);
        if (arg2 < 27) {
            this.method2158(98, (byte) -99);
        }
        field4995++;
        this.field5001 = new class380(arg0);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V", line = 60)
    public static void method2156(int arg0) {
        if (arg0 == 128) {
            field4988 = null;
            field4998 = null;
            field4985 = null;
            field4991 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V", line = 76)
    public final void method2157(int arg0, int arg1) {
        field4990++;
        class380 var3 = this.field4987;
        synchronized (this.field4987) {
            this.field4987.method2179(false, arg0);
        }
        class380 var4 = this.field5001;
        synchronized (this.field5001) {
            int var5 = -78 % ((-arg1 - 32) / 51);
            this.field5001.method2179(false, arg0);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)Lkt;", line = 96)
    public final class83 method2158(int arg0, byte arg1) {
        field4989++;
        class380 var3 = this.field4987;
        class83 var4;
        synchronized (this.field4987) {
            var4 = (class83) this.field4987.method2176(-127, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class332 var5 = this.field5000;
        byte[] var6;
        synchronized (this.field5000) {
            var6 = this.field5000.method1938(arg0, 36, -17);
        }
        if (arg1 >= -116) {
            field4985 = null;
        }
        class83 var7 = new class83();
        var7.field980 = arg0;
        var7.field967 = this;
        if (var6 != null) {
            var7.method448((byte) 119, new class157(var6));
        }
        var7.method449(-122);
        class380 var8 = this.field4987;
        synchronized (this.field4987) {
            this.field4987.method2174(var7, (long) arg0, (byte) 127);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lnq;ILga;Lga;)V", line = 169)
    public class377(class650 arg0, int arg1, class332 arg2, class332 arg3) {
        this.field5000 = arg2;
        this.field4993 = arg3;
        this.field5000.method1939(0, 36);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIZ)V", line = 152)
    public static final void method2159(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field4985 = null;
        }
        field4996++;
        class256 var3 = class592.method3279((byte) -72, 16, arg0);
        var3.method1549(-32042);
        var3.field3358 = arg1;
    }
}
