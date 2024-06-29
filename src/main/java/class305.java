import java.util.Date;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class305 {

    @OriginalMember(owner = "client!ww", name = "g", descriptor = "Lme;")
    private class668 field4009 = new class668(256);

    @OriginalMember(owner = "client!ww", name = "f", descriptor = "Lpe;")
    private class615 field4008;

    @OriginalMember(owner = "client!ww", name = "i", descriptor = "F")
    public static float field4011 = 1.0F;

    @OriginalMember(owner = "client!ww", name = "h", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field4010 = new Hashtable();

    @OriginalMember(owner = "client!ww", name = "k", descriptor = "[[B")
    public static byte[][] field4013 = new byte[1000][];

    @OriginalMember(owner = "client!ww", name = "j", descriptor = "Lnj;")
    public static class415 field4012 = new class415(71, 7);

    @OriginalMember(owner = "client!ww", name = "l", descriptor = "J")
    public static long field4014 = -1L;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!ww", name = "d", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!ww", name = "m", descriptor = "Lta;")
    public static class597 field4015;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 3)
    public static final String method1799(int arg0, long arg1) {
        class22.field237.setTime(new Date(arg1));
        field4003++;
        int var3 = class22.field237.get(7);
        int var4 = class22.field237.get(5);
        int var5 = class22.field237.get(2);
        int var6 = class22.field237.get(1);
        int var7 = class22.field237.get(11);
        int var8 = class22.field237.get(12);
        int var9 = class22.field237.get(13);
        if (arg0 != -19484) {
            method1799(-118, 120L);
        }
        return class614.field8298[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class44.field626[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(II)V", line = 29)
    public final void method1800(int arg0, int arg1) {
        if (arg1 != 1000) {
            this.method1801((byte) -41);
        }
        class668 var3 = this.field4009;
        synchronized (this.field4009) {
            this.field4009.method3659(-107, arg0);
        }
        field4007++;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)V", line = 44)
    public final void method1801(byte arg0) {
        field4005++;
        class668 var2 = this.field4009;
        synchronized (this.field4009) {
            int var3 = -75 / ((51 - arg0) / 49);
            this.field4009.method3658(0);
        }
    }

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "(B)V", line = 56)
    public final void method1802(byte arg0) {
        if (arg0 >= -93) {
            this.method1804(-28, (byte) 22);
        }
        field4004++;
        class668 var2 = this.field4009;
        synchronized (this.field4009) {
            this.field4009.method3656((byte) 0);
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Z)V", line = 71)
    public static void method1803(boolean arg0) {
        field4013 = null;
        if (!arg0) {
            method1803(false);
        }
        field4010 = null;
        field4012 = null;
        field4015 = null;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IB)Loaa;", line = 92)
    public final class500 method1804(int arg0, byte arg1) {
        field4006++;
        class668 var3 = this.field4009;
        class500 var5;
        synchronized (this.field4009) {
            int var4 = 77 % ((arg1 - 73) / 42);
            var5 = (class500) this.field4009.method3655(-119, (long) arg0);
        }
        if (var5 != null) {
            return var5;
        }
        class615 var6 = this.field4008;
        byte[] var7;
        synchronized (this.field4008) {
            var7 = this.field4008.method3346(-1, 26, arg0);
        }
        class500 var8 = new class500();
        if (var7 != null) {
            var8.method2705(-25, new class418(var7));
        }
        class668 var9 = this.field4009;
        synchronized (this.field4009) {
            this.field4009.method3650((long) arg0, -111, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lvd;ILpe;)V", line = 130)
    public class305(class635 arg0, int arg1, class615 arg2) {
        this.field4008 = arg2;
        this.field4008.method3341(26, -19046);
    }
}
