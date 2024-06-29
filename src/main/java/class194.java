import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class194 {

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    public int field3471;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public int field3466;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public int field3461;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public int field3464;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "[J")
    public static long[] field3465 = new long[32];

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public static int field3470 = 1;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "[S")
    public static short[] field3462 = new short[500];

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "Lkh;")
    public static class117 field3469 = class224.method1450((byte) -105, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "Lkh;")
    public static class117 field3467 = class224.method1450((byte) 120, "oder benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "[I")
    public static int[] field3458;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
    public static void method1293(byte arg0) {
        field3462 = null;
        if (arg0 > -127) {
            field3470 = -84;
        }
        field3465 = null;
        field3458 = null;
        field3467 = null;
        field3469 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)Ltg;")
    public static final class215 method1294(byte arg0, int arg1) {
        field3459++;
        class215 var2 = (class215) class104.field1895.method506(1, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = client.field784.method104(-99, 1, arg1);
        class215 var4 = new class215();
        if (var3 != null) {
            var4.method1412(new class145(var3), arg1, -11678);
        }
        if (arg0 > -85) {
            field3470 = 37;
        }
        class104.field1895.method497((long) arg1, var4, -112);
        return var4;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    public class194() {
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lrh;)V")
    public class194(class194 arg0) {
        this.field3471 = arg0.field3471;
        this.field3466 = arg0.field3466;
        this.field3461 = arg0.field3461;
        this.field3464 = arg0.field3464;
    }
}
