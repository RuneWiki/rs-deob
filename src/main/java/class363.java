import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class363 {

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "Ljda;")
    private class239 field5293 = new class239(16);

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "Laj;")
    private class333 field5297;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field5289 = 0;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field5290 = 0;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field5291 = 0;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field5292 = -1;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Lhh;")
    public final class140 method2279(int arg0, int arg1) {
        field5294++;
        class239 var3 = this.field5293;
        class140 var4;
        synchronized (this.field5293) {
            var4 = (class140) this.field5293.method1541(-10, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class333 var5 = this.field5297;
        byte[] var6;
        synchronized (this.field5297) {
            var6 = this.field5297.method2095(arg0, 30, 1);
        }
        class140 var7 = new class140();
        if (arg1 > -48) {
            this.method2279(45, 63);
        }
        if (var6 != null) {
            var7.method1077((byte) 123, new class376(var6));
        }
        class239 var8 = this.field5293;
        synchronized (this.field5293) {
            this.field5293.method1544(true, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BI)V")
    public final void method2280(byte arg0, int arg1) {
        class239 var3 = this.field5293;
        synchronized (this.field5293) {
            if (arg0 != 64) {
                field5291 = 50;
            }
            this.field5293.method1546(arg1, (byte) -8);
        }
        field5295++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
    public final void method2281(int arg0) {
        if (arg0 != 4681) {
            return;
        }
        field5288++;
        class239 var2 = this.field5293;
        synchronized (this.field5293) {
            this.field5293.method1552(-128);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public final void method2282(byte arg0) {
        field5296++;
        class239 var2 = this.field5293;
        synchronized (this.field5293) {
            this.field5293.method1555((byte) -3);
        }
        if (arg0 >= -52) {
            this.field5297 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lgia;ILaj;)V")
    public class363(class285 arg0, int arg1, class333 arg2) {
        this.field5297 = arg2;
        this.field5297.method2090(30, false);
    }
}
