import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class144 {

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "Lrp;")
    private class288 field2338 = new class288(64);

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "Llt;")
    public class458 field2344;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "Llt;")
    private class458 field2340;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "Lft;")
    public static class4 field2339 = new class4();

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "Lql;")
    public static class496 field2346;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "[Lig;")
    public static class154[] field2343;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V", line = 6)
    public final void method945(int arg0) {
        class288 var2 = this.field2338;
        synchronized (this.field2338) {
            this.field2338.method1749((byte) -50);
        }
        if (arg0 != 3) {
            this.field2338 = null;
        }
        field2345++;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V", line = 20)
    public final void method946(byte arg0) {
        field2341++;
        class288 var2 = this.field2338;
        synchronized (this.field2338) {
            this.field2338.method1761(-114);
        }
        if (arg0 <= 42) {
            this.field2338 = null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)V", line = 37)
    public static void method947(byte arg0) {
        if (arg0 != 25) {
            method947((byte) -38);
        }
        field2343 = null;
        field2346 = null;
        field2339 = null;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(II)Lis;", line = 49)
    public final class331 method948(int arg0, int arg1) {
        field2347++;
        class288 var3 = this.field2338;
        class331 var4;
        synchronized (this.field2338) {
            var4 = (class331) this.field2338.method1752(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2340.method2715(arg0, arg1, false);
        class331 var6 = new class331();
        var6.field4969 = this;
        if (var5 != null) {
            var6.method2052(0, new class40(var5));
        }
        class288 var7 = this.field2338;
        synchronized (this.field2338) {
            this.field2338.method1758(1, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(II)V", line = 78)
    public final void method949(int arg0, int arg1) {
        class288 var3 = this.field2338;
        synchronized (this.field2338) {
            if (arg1 != -20227) {
                return;
            }
            this.field2338.method1760(arg0, 30398);
        }
        field2342++;
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lcm;ILlt;Llt;)V", line = 99)
    public class144(class491 arg0, int arg1, class458 arg2, class458 arg3) {
        this.field2344 = arg3;
        this.field2340 = arg2;
        this.field2340.method2726((byte) 113, 3);
    }
}
