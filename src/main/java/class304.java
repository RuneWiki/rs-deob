import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class304 {

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "Lco;")
    private class210 field4499 = new class210(64);

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "Lg;")
    private class470 field4493;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "Lsd;")
    public static class74 field4490 = new class74(96, 7);

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "Z")
    public static boolean field4495 = true;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "Z")
    public static boolean field4496 = true;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public static int field4494 = 127;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "Lcr;")
    public static class206 field4500;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method1899(int arg0, int arg1, int arg2, Class arg3) {
        class263 var4 = class293.field4356[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class248 var5 = var4.field3801; var5 != null; var5 = var5.field3490) {
            class83 var6 = var5.field3487;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field999 == arg1 && var6.field1004 == arg2) {
                class483.method2855(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)Lri;")
    public final class105 method1900(int arg0, int arg1) {
        field4498++;
        class210 var3 = this.field4499;
        class105 var4;
        synchronized (this.field4499) {
            var4 = (class105) this.field4499.method1163((byte) -42, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4493.method2768(-20472, arg1, arg0);
        class105 var6 = new class105();
        if (var5 != null) {
            var6.method505(new class179(var5), -115);
        }
        var6.method502(true);
        class210 var7 = this.field4499;
        synchronized (this.field4499) {
            this.field4499.method1172((long) arg1, 1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V")
    public final void method1901(byte arg0) {
        if (arg0 > -17) {
            this.method1900(-85, 68);
        }
        class210 var2 = this.field4499;
        synchronized (this.field4499) {
            this.field4499.method1169(1076);
        }
        field4492++;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(II)V")
    public final void method1902(int arg0, int arg1) {
        class210 var3 = this.field4499;
        synchronized (this.field4499) {
            this.field4499.method1166(arg1, (byte) -52);
        }
        if (arg0 != 28192) {
            method1904(36);
        }
        field4497++;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
    public final void method1903(int arg0) {
        if (arg0 >= -18) {
            this.field4493 = null;
        }
        field4491++;
        class210 var2 = this.field4499;
        synchronized (this.field4499) {
            this.field4499.method1165((byte) 118);
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
    public static void method1904(int arg0) {
        field4500 = null;
        field4490 = null;
        if (arg0 != 127) {
            method1899(98, -78, -80, (Class) null);
        }
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lci;ILg;)V")
    public class304(class421 arg0, int arg1, class470 arg2) {
        this.field4493 = arg2;
        if (this.field4493 != null) {
            this.field4493.method2755(-106, 35);
        }
    }
}
