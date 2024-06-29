import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class672 {

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "Ljda;")
    private class239 field9455 = new class239(64);

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "Laj;")
    private class333 field9460;

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "Z")
    public static boolean field9457 = false;

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "I")
    public static int field9456;

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "I")
    public static int field9458;

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "I")
    public static int field9459;

    @OriginalMember(owner = "client!lca", name = "g", descriptor = "I")
    public static int field9461;

    @OriginalMember(owner = "client!lca", name = "h", descriptor = "I")
    public static int field9462;

    @OriginalMember(owner = "client!lca", name = "i", descriptor = "I")
    public static int field9463;

    @OriginalMember(owner = "client!lca", name = "j", descriptor = "I")
    public static int field9464;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IZ)Lcaa;", line = 4)
    public final class320 method3738(int arg0, boolean arg1) {
        field9463++;
        class239 var3 = this.field9455;
        class320 var4;
        synchronized (this.field9455) {
            var4 = (class320) this.field9455.method1541(-10, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class333 var5 = this.field9460;
        byte[] var6;
        synchronized (this.field9460) {
            var6 = this.field9460.method2095(arg0, 54, 1);
        }
        class320 var7 = new class320();
        if (var6 != null) {
            var7.method2032(new class376(var6), -60);
        }
        class239 var8 = this.field9455;
        synchronized (this.field9455) {
            this.field9455.method1544(arg1, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIZ)V", line = 36)
    public static final void method3739(int arg0, int arg1, boolean arg2) {
        if (arg0 <= 74) {
            return;
        }
        field9464++;
        if (arg2) {
            class267 var3 = class545.method3099((byte) 85, class269.field3966, class351.field5147);
            var3.field3938.method2415(false, arg1);
            class617.method3392(var3, true);
        } else {
            class173.method1238(class34.field559, arg1, -1);
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)V", line = 66)
    public final void method3740(byte arg0) {
        field9462++;
        class239 var2 = this.field9455;
        synchronized (this.field9455) {
            this.field9455.method1555((byte) -3);
        }
        if (arg0 != 77) {
            method3743((byte) 52);
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V", line = 79)
    public final void method3741(int arg0) {
        if (arg0 != 12558) {
            this.field9455 = null;
        }
        class239 var2 = this.field9455;
        synchronized (this.field9455) {
            this.field9455.method1552(14);
        }
        field9456++;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(BI)V", line = 92)
    public final void method3742(byte arg0, int arg1) {
        class239 var3 = this.field9455;
        synchronized (this.field9455) {
            this.field9455.method1546(arg1, (byte) -8);
        }
        field9461++;
        if (arg0 != 125) {
            this.method3738(-91, false);
        }
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(B)V", line = 107)
    public static final void method3743(byte arg0) {
        class359.field5249 = new class412();
        field9458++;
        if (arg0 >= -57) {
            method3739(-42, -32, true);
        }
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Lgia;ILaj;)V", line = 121)
    public class672(class285 arg0, int arg1, class333 arg2) {
        this.field9460 = arg2;
        if (this.field9460 != null) {
            this.field9460.method2090(54, false);
        }
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)V", line = 141)
    public static final void method3744(int arg0) {
        class239 var1 = class593.field8007;
        synchronized (class593.field8007) {
            class593.field8007.method1555((byte) -3);
        }
        if (arg0 != -20162) {
            method3744(-80);
        }
        field9459++;
    }
}
