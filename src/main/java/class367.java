import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class367 {

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "Lka;")
    private class473 field5261 = new class473(16);

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "Ldk;")
    private class421 field5270;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "[I")
    public static int[] field5263 = new int[500];

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
    public static int field5266 = 0;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
    public static int field5267 = 0;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "[I")
    public static int[] field5272 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "Lep;")
    public static class310 field5268;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)Lbw;", line = 4)
    public final class331 method2194(int arg0, int arg1) {
        field5269++;
        class473 var3 = this.field5261;
        class331 var4;
        synchronized (this.field5261) {
            var4 = (class331) this.field5261.method2767((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class421 var5 = this.field5270;
        byte[] var6;
        synchronized (this.field5270) {
            if (arg0 != -8039) {
                this.field5261 = null;
            }
            var6 = this.field5270.method2512(30, (byte) -93, arg1);
        }
        class331 var7 = new class331();
        if (var6 != null) {
            var7.method1957(new class319(var6), -5);
        }
        class473 var8 = this.field5261;
        synchronized (this.field5261) {
            this.field5261.method2777(-1025, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(II)V", line = 39)
    public final void method2195(int arg0, int arg1) {
        if (arg0 != 4286) {
            this.field5270 = null;
        }
        field5271++;
        class473 var3 = this.field5261;
        synchronized (this.field5261) {
            this.field5261.method2779(14896, arg1);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V", line = 56)
    public final void method2196(int arg0) {
        class473 var2 = this.field5261;
        synchronized (this.field5261) {
            this.field5261.method2764(-769);
            if (arg0 < 60) {
                method2199((byte) -6, null);
            }
        }
        field5262++;
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V", line = 76)
    public final void method2197(int arg0) {
        field5264++;
        class473 var2 = this.field5261;
        synchronized (this.field5261) {
            this.field5261.method2774((byte) 118);
        }
        if (arg0 != -21275) {
            field5266 = 8;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V", line = 89)
    public static void method2198(byte arg0) {
        if (arg0 <= 21) {
            field5267 = 38;
        }
        field5263 = null;
        field5272 = null;
        field5268 = null;
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lad;ILdk;)V", line = 121)
    public class367(class12 arg0, int arg1, class421 arg2) {
        this.field5270 = arg2;
        this.field5270.method2509(0, 30);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(BLdk;)V", line = 106)
    public static final void method2199(byte arg0, class421 arg1) {
        class279.field3793 = 0;
        field5265++;
        class323.field4435 = 0;
        class32.field475 = new class439();
        if (arg0 != 2) {
            field5272 = null;
        }
        class26.field357 = new class150[1024];
        class196.method1279(-1, arg1);
        class34.method247(arg1, 1);
    }
}
