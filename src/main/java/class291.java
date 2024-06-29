import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class291 {

    @OriginalMember(owner = "client!gga", name = "d", descriptor = "Lpca;")
    private class714 field4102 = new class714(128);

    @OriginalMember(owner = "client!gga", name = "f", descriptor = "Lfp;")
    private class323 field4104;

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4101 = null;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "I")
    public static int field4099 = 0;

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!gga", name = "e", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!gga", name = "g", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(ILjava/lang/String;)J", line = 3)
    public static final long method1899(int arg0, String arg1) {
        field4103++;
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = arg0; var5 < var2; var5++) {
            var3 = (long) arg1.charAt(var5) + ((var3 << 5) - var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(II)Lpba;", line = 23)
    public final class331 method1900(int arg0, int arg1) {
        field4100++;
        class714 var3 = this.field4102;
        class331 var4;
        synchronized (this.field4102) {
            var4 = (class331) this.field4102.method4022((long) arg0, (byte) 86);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4104.method2100(class218.method1336(arg0, (byte) -68), (byte) 112, class254.method1685((byte) -58, arg0));
        if (arg1 < 93) {
            field4101 = null;
        }
        class331 var6 = new class331();
        if (var5 != null) {
            var6.method2159(new class675(var5), -1);
        }
        class714 var7 = this.field4102;
        synchronized (this.field4102) {
            this.field4102.method4018((byte) 124, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(Lsaa;ILfp;)V", line = 73)
    public class291(class326 arg0, int arg1, class323 arg2) {
        this.field4104 = arg2;
        if (this.field4104 != null) {
            int var4 = this.field4104.method2098((byte) 20) - 1;
            this.field4104.method2084(var4, 0);
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(Z)V", line = 97)
    public static void method1901(boolean arg0) {
        field4101 = null;
        if (!arg0) {
            method1901(true);
        }
    }
}
