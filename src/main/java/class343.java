import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class343 {

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "Lbh;")
    private class538 field4384 = new class538(128);

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "Lbh;")
    public class538 field4387 = new class538(64);

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "Lwu;")
    public class557 field4383;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "Lwu;")
    private class557 field4385;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)Ljk;")
    public final class185 method1971(int arg0, int arg1) {
        field4379++;
        class538 var3 = this.field4384;
        class185 var4;
        synchronized (this.field4384) {
            var4 = (class185) this.field4384.method3200((long) arg0, arg1 + 3868);
        }
        if (var4 != null) {
            return var4;
        }
        class557 var5 = this.field4385;
        byte[] var6;
        synchronized (this.field4385) {
            var6 = this.field4385.method3322(36, arg0, (byte) 109);
            if (arg1 != -23851) {
                this.field4387 = null;
            }
        }
        class185 var7 = new class185();
        var7.field2679 = arg0;
        var7.field2697 = this;
        if (var6 != null) {
            var7.method1245(new class26(var6), -22030);
        }
        var7.method1239(-38);
        class538 var8 = this.field4384;
        synchronized (this.field4384) {
            this.field4384.method3199((byte) 78, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)V")
    public final void method1972(byte arg0) {
        class538 var2 = this.field4384;
        synchronized (this.field4384) {
            this.field4384.method3202((byte) 127);
            int var3 = 90 / ((arg0 - 66) / 57);
        }
        field4386++;
        class538 var4 = this.field4387;
        synchronized (this.field4387) {
            this.field4387.method3202((byte) 127);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(BI)V")
    public final void method1973(byte arg0, int arg1) {
        field4382++;
        class538 var3 = this.field4384;
        synchronized (this.field4384) {
            this.field4384.method3204((byte) 97, arg1);
        }
        class538 var4 = this.field4387;
        synchronized (this.field4387) {
            if (arg0 != 93) {
                this.method1975(-36, 37, -6);
            }
            this.field4387.method3204((byte) -106, arg1);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
    public final void method1974(int arg0) {
        class538 var2 = this.field4384;
        synchronized (this.field4384) {
            this.field4384.method3210(false);
        }
        field4380++;
        class538 var3 = this.field4387;
        synchronized (this.field4387) {
            this.field4387.method3210(false);
        }
        int var4 = 1 % ((36 - arg0) / 47);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(III)V")
    public final void method1975(int arg0, int arg1, int arg2) {
        this.field4384 = new class538(arg0);
        field4381++;
        this.field4387 = new class538(arg2);
        int var4 = -97 / ((arg1 - 44) / 50);
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lwj;ILwu;Lwu;)V")
    public class343(class121 arg0, int arg1, class557 arg2, class557 arg3) {
        this.field4383 = arg3;
        this.field4385 = arg2;
        this.field4385.method3333(36, 3443);
    }
}
