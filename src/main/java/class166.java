import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class166 {

    @OriginalMember(owner = "client!in", name = "f", descriptor = "Lad;")
    private class11 field2147 = new class11(64);

    @OriginalMember(owner = "client!in", name = "i", descriptor = "Lad;")
    public class11 field2150 = new class11(2);

    @OriginalMember(owner = "client!in", name = "a", descriptor = "Ldn;")
    private class201 field2142;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "Ldn;")
    public class201 field2143;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "I")
    public static int field2149 = -1;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "Lpi;")
    public static class340 field2144 = new class340(37, 0);

    @OriginalMember(owner = "client!in", name = "m", descriptor = "[Lhi;")
    public static class44[] field2154 = new class44[14];

    @OriginalMember(owner = "client!in", name = "o", descriptor = "I")
    public static int field2156 = -1;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!in", name = "j", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!in", name = "k", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!in", name = "n", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IB)V", line = 9)
    public final void method1097(int arg0, byte arg1) {
        field2148++;
        class11 var3 = this.field2147;
        synchronized (this.field2147) {
            int var4 = 74 % ((arg1 - 70) / 52);
            this.field2147.method80(-51, arg0);
        }
        class11 var5 = this.field2150;
        synchronized (this.field2150) {
            this.field2150.method80(-55, arg0);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V", line = 25)
    public static void method1098(byte arg0) {
        field2154 = null;
        if (arg0 < 73) {
            method1098((byte) 37);
        }
        field2144 = null;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V", line = 42)
    public final void method1099(int arg0) {
        field2151++;
        class11 var2 = this.field2147;
        synchronized (this.field2147) {
            this.field2147.method84(arg0 - 76);
        }
        class11 var3 = this.field2150;
        synchronized (this.field2150) {
            if (arg0 != 14) {
                field2154 = null;
            }
            this.field2150.method84(100);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II)Lds;", line = 58)
    public final class274 method1100(int arg0, int arg1) {
        field2146++;
        class11 var3 = this.field2147;
        class274 var4;
        synchronized (this.field2147) {
            var4 = (class274) this.field2147.method78((long) arg0, (byte) -116);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2142.method1313((byte) -117, arg1, arg0);
        class274 var6 = new class274();
        var6.field3475 = this;
        if (var5 != null) {
            var6.method1684((byte) -73, new class88(var5));
        }
        class11 var7 = this.field2147;
        synchronized (this.field2147) {
            this.field2147.method88((long) arg0, 106, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(B)V", line = 83)
    public final void method1101(byte arg0) {
        class11 var2 = this.field2147;
        synchronized (this.field2147) {
            this.field2147.method90((byte) -27);
        }
        field2145++;
        class11 var3 = this.field2150;
        synchronized (this.field2150) {
            if (arg0 <= -48) {
                this.field2150.method90((byte) -27);
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lgt;ILdn;Ldn;)V", line = 124)
    public class166(class65 arg0, int arg1, class201 arg2, class201 arg3) {
        this.field2142 = arg2;
        this.field2143 = arg3;
        this.field2142.method1302(-114, 33);
    }
}
