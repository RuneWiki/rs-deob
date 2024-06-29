import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class574 {

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "Ltb;")
    private class450 field8003 = new class450(64);

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "Ltb;")
    public class450 field8011 = new class450(2);

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "Lpl;")
    public class612 field8005;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "Lpl;")
    private class612 field8004;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "Lsfa;")
    public static class291 field7999 = new class291();

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "Z")
    public static boolean field8006 = false;

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
    public static int field8007 = 0;

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "[S")
    public static short[] field8009 = new short[256];

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    public static int field7998;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
    public static int field8000;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
    public static int field8001;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
    public static int field8002;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
    public static int field8008;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
    public static int field8010;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V", line = 3)
    public final void method3164(int arg0) {
        field8000++;
        class450 var2 = this.field8003;
        synchronized (this.field8003) {
            this.field8003.method2406(18385);
        }
        class450 var3 = this.field8011;
        synchronized (this.field8011) {
            if (arg0 != 256) {
                this.field8004 = null;
            }
            this.field8011.method2406(18385);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)V", line = 19)
    public final void method3165(byte arg0) {
        if (arg0 >= -30) {
            method3169((byte) 57);
        }
        class450 var2 = this.field8003;
        synchronized (this.field8003) {
            this.field8003.method2412((byte) -122);
        }
        field8001++;
        class450 var3 = this.field8011;
        synchronized (this.field8011) {
            this.field8011.method2412((byte) 122);
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)V", line = 38)
    public static final void method3166(byte arg0) {
        int var1 = 99 % ((-arg0 - 79) / 47);
        class272.method1564(2);
        field8002++;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V", line = 49)
    public final void method3167(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field8004 = null;
        }
        class450 var3 = this.field8003;
        synchronized (this.field8003) {
            this.field8003.method2411(true, arg1);
        }
        field7998++;
        class450 var4 = this.field8011;
        synchronized (this.field8011) {
            this.field8011.method2411(true, arg1);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IB)Lag;", line = 71)
    public final class473 method3168(int arg0, byte arg1) {
        if (arg1 <= 69) {
            method3166((byte) 107);
        }
        field8010++;
        class450 var3 = this.field8003;
        class473 var4;
        synchronized (this.field8003) {
            var4 = (class473) this.field8003.method2418((long) arg0, (byte) 100);
        }
        if (var4 != null) {
            return var4;
        }
        class612 var5 = this.field8004;
        byte[] var6;
        synchronized (this.field8004) {
            var6 = this.field8004.method3365(arg0, 92, 33);
        }
        class473 var7 = new class473();
        var7.field5999 = this;
        if (var6 != null) {
            var7.method2497(-40, new class630(var6));
        }
        class450 var8 = this.field8003;
        synchronized (this.field8003) {
            this.field8003.method2409((long) arg0, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(B)V", line = 106)
    public static void method3169(byte arg0) {
        if (arg0 != 6) {
            field7999 = null;
        }
        field7999 = null;
        field8009 = null;
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lrf;ILpl;Lpl;)V", line = 140)
    public class574(class112 arg0, int arg1, class612 arg2, class612 arg3) {
        this.field8005 = arg3;
        this.field8004 = arg2;
        this.field8004.method3349(33, true);
    }
}
