import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class343 {

    @OriginalMember(owner = "client!db", name = "d", descriptor = "Ljda;")
    private class239 field5056 = new class239(64);

    @OriginalMember(owner = "client!db", name = "b", descriptor = "Laj;")
    private class333 field5054;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public int field5060;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field5055 = 0;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)Leka;")
    public final class493 method2178(int arg0, byte arg1) {
        field5053++;
        class239 var3 = this.field5056;
        class493 var4;
        synchronized (this.field5056) {
            var4 = (class493) this.field5056.method1541(-10, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        } else if (arg1 > -123) {
            return null;
        } else {
            class333 var5 = this.field5054;
            byte[] var6;
            synchronized (this.field5054) {
                var6 = this.field5054.method2095(arg0, 16, 1);
            }
            class493 var7 = new class493();
            if (var6 != null) {
                var7.method2859((byte) -50, new class376(var6));
            }
            class239 var8 = this.field5056;
            synchronized (this.field5056) {
                this.field5056.method1544(true, var7, (long) arg0);
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BI)V")
    public final void method2179(byte arg0, int arg1) {
        field5058++;
        if (arg0 > -25) {
            this.field5060 = 86;
        }
        class239 var3 = this.field5056;
        synchronized (this.field5056) {
            this.field5056.method1546(arg1, (byte) -8);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public final void method2180(int arg0) {
        if (arg0 != 64) {
            return;
        }
        class239 var2 = this.field5056;
        synchronized (this.field5056) {
            this.field5056.method1555((byte) -3);
        }
        field5057++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
    public final void method2181(byte arg0) {
        field5059++;
        class239 var2 = this.field5056;
        synchronized (this.field5056) {
            if (arg0 == -86) {
                this.field5056.method1552(-125);
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lgia;ILaj;)V")
    public class343(class285 arg0, int arg1, class333 arg2) {
        this.field5054 = arg2;
        if (this.field5054 == null) {
            this.field5060 = 0;
        } else {
            this.field5060 = this.field5054.method2090(16, false);
        }
    }
}
