import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class615 {

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Lvi;")
    private class560 field8397 = new class560(64);

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Lpq;")
    private class159 field8393;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field8390;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field8392;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field8394;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field8395;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "[Lraa;")
    public static class218[] field8396;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "[Lxa;")
    public static class424[] field8391;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static void method3379(int arg0) {
        field8396 = null;
        if (arg0 != 5) {
            method3379(-12);
        }
        field8391 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lpq;B)V")
    public static final void method3380(class159 arg0, byte arg1) {
        field8394++;
        if (arg1 >= -78) {
            method3379(127);
        }
        class156.field1931 = arg0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lrd;")
    public final class464 method3381(int arg0, int arg1) {
        field8395++;
        if (arg0 != 25192) {
            this.field8393 = null;
        }
        class560 var3 = this.field8397;
        class464 var4;
        synchronized (this.field8397) {
            var4 = (class464) this.field8397.method3134((long) arg1, -118);
        }
        if (var4 != null) {
            return var4;
        }
        class159 var5 = this.field8393;
        byte[] var6;
        synchronized (this.field8393) {
            var6 = this.field8393.method1087(5, arg1, 1);
        }
        class464 var7 = new class464();
        if (var6 != null) {
            var7.method2631(arg0 ^ 0x6205, new class138(var6));
        }
        class560 var8 = this.field8397;
        synchronized (this.field8397) {
            this.field8397.method3130((long) arg1, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Luea;ILpq;)V")
    public class615(class484 arg0, int arg1, class159 arg2) {
        this.field8393 = arg2;
        this.field8393.method1076(5, 0);
    }
}
