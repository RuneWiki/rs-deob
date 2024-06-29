import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class338 {

    @OriginalMember(owner = "client!wca", name = "j", descriptor = "Ltb;")
    private class450 field4390 = new class450(64);

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "Lpl;")
    private class612 field4385;

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "I")
    public static int field4384 = 0;

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "[Lau;")
    public static class521[] field4383 = new class521[128];

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!wca", name = "f", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!wca", name = "g", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!wca", name = "h", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!wca", name = "i", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)V", line = 9)
    public static void method1899(byte arg0) {
        if (arg0 != 116) {
            method1899((byte) -26);
        }
        field4383 = null;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IB)Lcg;", line = 23)
    public final class601 method1900(int arg0, byte arg1) {
        field4387++;
        if (arg1 < 51) {
            return null;
        }
        class450 var3 = this.field4390;
        class601 var4;
        synchronized (this.field4390) {
            var4 = (class601) this.field4390.method2418((long) arg0, (byte) 100);
        }
        if (var4 != null) {
            return var4;
        }
        class612 var5 = this.field4385;
        byte[] var6;
        synchronized (this.field4385) {
            var6 = this.field4385.method3365(arg0, 31, 32);
        }
        class601 var7 = new class601();
        if (var6 != null) {
            var7.method3298(new class630(var6), 126);
        }
        class450 var8 = this.field4390;
        synchronized (this.field4390) {
            this.field4390.method2409((long) arg0, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(B)V", line = 55)
    public static final void method1901(byte arg0) {
        int var1 = 30 / ((arg0 - 43) / 49);
        class378.field4782.method398(true);
        field4382++;
        class169.field2209.method1540(1252027233);
        class670.field9432.method1540(1252027233);
    }

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "(B)V", line = 67)
    public final void method1902(byte arg0) {
        class450 var2 = this.field4390;
        synchronized (this.field4390) {
            this.field4390.method2406(18385);
        }
        field4381++;
        if (arg0 < 38) {
            method1901((byte) -56);
        }
    }

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "(B)V", line = 83)
    public static final void method1903(byte arg0) {
        if (class642.field9049 != null) {
            for (int var1 = 0; var1 < class430.field5385; var1++) {
                class642.field9049[var1] = null;
            }
            class642.field9049 = null;
        }
        field4388++;
        if (arg0 < 16) {
            method1901((byte) -5);
        }
        if (class425.field5335 != null) {
            for (int var2 = 0; var2 < class207.field2629; var2++) {
                class425.field5335[var2] = null;
            }
            class425.field5335 = null;
        }
        if (class311.field3980 != null) {
            for (int var3 = 0; var3 < class472.field5992; var3++) {
                class311.field3980[var3] = null;
            }
            class311.field3980 = null;
        }
        class484.field6435 = null;
        class169.field2211 = null;
        class294.field3635 = -1;
        class278.field3478 = -1;
        class359.field4578 = null;
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(IB)V", line = 143)
    public final void method1904(int arg0, byte arg1) {
        class450 var3 = this.field4390;
        synchronized (this.field4390) {
            this.field4390.method2411(true, arg0);
        }
        field4389++;
        if (arg1 != 57) {
            this.field4385 = null;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)V", line = 156)
    public final void method1905(int arg0) {
        field4386++;
        class450 var2 = this.field4390;
        synchronized (this.field4390) {
            this.field4390.method2412((byte) 97);
        }
        if (arg0 != 32) {
            field4384 = 21;
        }
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Lrf;ILpl;)V", line = 171)
    public class338(class112 arg0, int arg1, class612 arg2) {
        this.field4385 = arg2;
        this.field4385.method3349(32, true);
    }
}
