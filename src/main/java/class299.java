import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class299 {

    @OriginalMember(owner = "client!uu", name = "l", descriptor = "Lpa;")
    private class387 field4504 = new class387(64);

    @OriginalMember(owner = "client!uu", name = "m", descriptor = "Lpa;")
    public class387 field4505 = new class387(2);

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "Lcb;")
    public class544 field4499;

    @OriginalMember(owner = "client!uu", name = "k", descriptor = "Lcb;")
    private class544 field4503;

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "Lga;")
    public static class420 field4496 = new class420();

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "Lga;")
    public static class420 field4498 = new class420();

    @OriginalMember(owner = "client!uu", name = "j", descriptor = "[I")
    public static int[] field4502 = new int[4];

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!uu", name = "i", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
    public static void method1993(int arg0) {
        field4502 = null;
        field4496 = null;
        field4498 = null;
        if (arg0 != 33) {
            method1997(null, 100, 69, 109, null, 14);
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V")
    public final void method1994(int arg0) {
        class387 var2 = this.field4504;
        synchronized (this.field4504) {
            if (arg0 != 3235) {
                method1997(null, -65, 103, 17, null, -70);
            }
            this.field4504.method2369(-1);
        }
        field4495++;
        class387 var3 = this.field4505;
        synchronized (this.field4505) {
            this.field4505.method2369(-1);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)Low;")
    public final class364 method1995(int arg0, int arg1) {
        field4501++;
        class387 var3 = this.field4504;
        class364 var4;
        synchronized (this.field4504) {
            var4 = (class364) this.field4504.method2373((long) arg0, 103);
        }
        if (var4 != null) {
            return var4;
        }
        class544 var5 = this.field4503;
        byte[] var6;
        synchronized (this.field4503) {
            var6 = this.field4503.method3150(arg0, 35, 33);
            int var7 = -107 / ((arg1 - 29) / 55);
        }
        class364 var8 = new class364();
        var8.field5262 = this;
        if (var6 != null) {
            var8.method2277((byte) 117, new class120(var6));
        }
        class387 var9 = this.field4504;
        synchronized (this.field4504) {
            this.field4504.method2362(var8, 0, (long) arg0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)V")
    public final void method1996(int arg0) {
        class387 var2 = this.field4504;
        synchronized (this.field4504) {
            this.field4504.method2364(arg0 ^ 0x20);
        }
        field4494++;
        class387 var3 = this.field4505;
        synchronized (this.field4505) {
            if (arg0 != 33) {
                field4498 = null;
            }
            this.field4505.method2364(1);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lka;IIILpw;I)V")
    public static final void method1997(class495 arg0, int arg1, int arg2, int arg3, class733 arg4, int arg5) {
        field4493++;
        if (arg0 != null) {
            if (arg2 != 5378) {
                field4502 = null;
            }
            arg4.method4101(arg1, arg3, (byte) 77, arg0.method115(), arg0.method65(), arg0.method79(), arg0.method80(), arg0.method75(), arg0.method97(), arg5, arg0.method94());
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(II)V")
    public final void method1998(int arg0, int arg1) {
        field4497++;
        class387 var3 = this.field4504;
        synchronized (this.field4504) {
            if (arg0 != 33) {
                field4502 = null;
            }
            this.field4504.method2366(arg1, 118);
        }
        class387 var4 = this.field4505;
        synchronized (this.field4505) {
            this.field4505.method2366(arg1, arg0 ^ 0x4F);
        }
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Liv;ILcb;Lcb;)V")
    public class299(class106 arg0, int arg1, class544 arg2, class544 arg3) {
        this.field4499 = arg3;
        this.field4503 = arg2;
        this.field4503.method3147(33, 108);
    }
}
