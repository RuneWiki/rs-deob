import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class21 {

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Ljo;")
    private class382 field314 = new class382(64);

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Lok;")
    private class74 field308;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public int field312;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Luv;")
    public static class2 field311 = new class2(67, -1);

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "J")
    public static long field315 = 0L;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)Lnq;", line = 9)
    public final class494 method215(int arg0, int arg1) {
        if (arg0 > -81) {
            return null;
        }
        field307++;
        class382 var3 = this.field314;
        class494 var4;
        synchronized (this.field314) {
            var4 = (class494) this.field314.method2288((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class74 var5 = this.field308;
        byte[] var6;
        synchronized (this.field308) {
            var6 = this.field308.method541(arg1, 16, (byte) -122);
        }
        class494 var7 = new class494();
        if (var6 != null) {
            var7.method2941(new class468(var6), 0);
        }
        class382 var8 = this.field314;
        synchronized (this.field314) {
            this.field314.method2290((long) arg1, var7, 117);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)V", line = 39)
    public final void method216(byte arg0, int arg1) {
        if (arg0 <= 104) {
            this.method219(70);
        }
        class382 var3 = this.field314;
        synchronized (this.field314) {
            this.field314.method2294(arg1, true);
        }
        field316++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 55)
    public final void method217(byte arg0) {
        field313++;
        class382 var2 = this.field314;
        synchronized (this.field314) {
            this.field314.method2293(false);
        }
        if (arg0 <= 51) {
            field315 = 40L;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 71)
    public static final void method218(int arg0) {
        field310++;
        class517.method3064();
        for (int var1 = 0; var1 < 4; var1++) {
            class151.field2300[var1].method1959(13734);
        }
        if (arg0 >= -104) {
            method218(-23);
        }
        class464.method2684(-1);
        class147.method1068((byte) -125);
        System.gc();
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V", line = 92)
    public final void method219(int arg0) {
        field309++;
        class382 var2 = this.field314;
        synchronized (this.field314) {
            this.field314.method2287(113);
            if (arg0 != 16) {
                this.field314 = null;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V", line = 108)
    public static void method220(byte arg0) {
        field311 = null;
        int var1 = -95 % ((arg0 + 27) / 49);
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lkr;ILok;)V", line = 123)
    public class21(class262 arg0, int arg1, class74 arg2) {
        this.field308 = arg2;
        if (this.field308 == null) {
            this.field312 = 0;
        } else {
            this.field312 = this.field308.method536(false, 16);
        }
    }
}
