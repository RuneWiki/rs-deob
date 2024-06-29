import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class97 {

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "Lwg;")
    private class58 field1297 = new class58(64);

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Lwg;")
    private class58 field1305 = new class58(100);

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "Lkr;")
    private class329 field1299;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "Luv;")
    public static class3 field1295 = new class3(38, 8);

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field1304 = 0;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "Lpaa;")
    public static class317 field1302 = new class317(6, 6);

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static void method534(int arg0) {
        field1302 = null;
        field1295 = null;
        if (arg0 != 100) {
            method534(-49);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZ)Lna;")
    public final class320 method535(int arg0, boolean arg1) {
        field1296++;
        class58 var3 = this.field1297;
        class320 var4;
        synchronized (this.field1297) {
            var4 = (class320) this.field1297.method323((long) arg0, -19814);
        }
        if (var4 != null) {
            return var4;
        }
        class329 var5 = this.field1299;
        byte[] var6;
        synchronized (this.field1299) {
            var6 = this.field1299.method2054(arg1, class150.method826(arg0, 92), class625.method3606(arg0, -1));
        }
        class320 var7 = new class320();
        var7.field4411 = this;
        var7.field4428 = arg0;
        if (var6 != null) {
            var7.method1998((byte) -96, new class551(var6));
        }
        var7.method1999(7550);
        class58 var8 = this.field1297;
        synchronized (this.field1297) {
            this.field1297.method316((long) arg0, (byte) -119, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)Lhr;")
    public final class556 method536(int arg0, byte arg1) {
        field1300++;
        class58 var3 = this.field1305;
        class556 var4;
        synchronized (this.field1305) {
            var4 = (class556) this.field1305.method323((long) arg0, -19814);
            if (var4 == null) {
                var4 = new class556(arg0);
                this.field1305.method316((long) arg0, (byte) -114, var4);
            }
        }
        if (arg1 != -46) {
            this.method537((byte) 25);
        }
        synchronized (var4) {
            return var4.method3118(113) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    public final void method537(byte arg0) {
        field1301++;
        if (arg0 != -115) {
            method534(28);
        }
        class58 var2 = this.field1297;
        synchronized (this.field1297) {
            this.field1297.method317((byte) 21);
        }
        class58 var3 = this.field1305;
        synchronized (this.field1305) {
            this.field1305.method317((byte) 21);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)V")
    public final void method538(int arg0, int arg1) {
        class58 var3 = this.field1297;
        synchronized (this.field1297) {
            this.field1297.method320(arg0, -306674912);
            if (arg1 != 38) {
                method534(53);
            }
        }
        field1298++;
        class58 var4 = this.field1305;
        synchronized (this.field1305) {
            this.field1305.method320(arg0, arg1 - 306674950);
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V")
    public final void method539(int arg0) {
        field1303++;
        class58 var2 = this.field1297;
        synchronized (this.field1297) {
            this.field1297.method315(arg0 - 37);
        }
        class58 var3 = this.field1305;
        synchronized (this.field1305) {
            this.field1305.method315(1);
            if (arg0 != 38) {
                this.method539(33);
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lg;ILkr;Lkr;Lkr;)V")
    public class97(class513 arg0, int arg1, class329 arg2, class329 arg3, class329 arg4) {
        this.field1299 = arg2;
        if (this.field1299 != null) {
            int var6 = this.field1299.method2046((byte) 64) - 1;
            this.field1299.method2064(0, var6);
        }
        class514.method2862(arg3, arg4, 2048, 2);
    }
}
