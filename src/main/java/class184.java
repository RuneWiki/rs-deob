import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class184 {

    @OriginalMember(owner = "client!an", name = "b", descriptor = "Lka;")
    private class473 field2731 = new class473(128);

    @OriginalMember(owner = "client!an", name = "f", descriptor = "Ldk;")
    private class421 field2735;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field2736 = new String[200];

    @OriginalMember(owner = "client!an", name = "i", descriptor = "[I")
    public static int[] field2738 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "Lhv;")
    public static class149 field2733;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "Lwg;")
    public static class41 field2737;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(II)Lgk;", line = 16)
    public static final class468 method1242(int arg0, int arg1) {
        field2732++;
        if (class434.field6283 && arg0 >= class189.field2778 && class395.field5692 >= arg0) {
            if (arg1 <= 105) {
                method1244(true);
            }
            return class336.field4900[arg0 - class189.field2778];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IB)Lui;", line = 30)
    public final class488 method1243(int arg0, byte arg1) {
        field2734++;
        class473 var3 = this.field2731;
        class488 var4;
        synchronized (this.field2731) {
            var4 = (class488) this.field2731.method2767((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2735.method2512(class293.method1697((byte) -88, arg0), (byte) -93, class110.method840(112, arg0));
        class488 var6 = new class488();
        if (arg1 > -96) {
            method1244(false);
        }
        if (var5 != null) {
            var6.method2895((byte) -56, new class319(var5));
        }
        class473 var7 = this.field2731;
        synchronized (this.field2731) {
            this.field2731.method2777(-1025, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lad;ILdk;)V", line = 81)
    public class184(class12 arg0, int arg1, class421 arg2) {
        this.field2735 = arg2;
        if (this.field2735 != null) {
            int var4 = this.field2735.method2493((byte) -41) - 1;
            this.field2735.method2509(0, var4);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V", line = 65)
    public static void method1244(boolean arg0) {
        if (!arg0) {
            field2736 = null;
            field2738 = null;
            field2733 = null;
            field2737 = null;
        }
    }
}
