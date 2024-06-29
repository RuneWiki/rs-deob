import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class363 {

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Lpca;")
    private class653 field4743 = new class653(64);

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Ljo;")
    private class303 field4740;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public int field4738;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 3)
    public final void method1991(int arg0) {
        class653 var2 = this.field4743;
        synchronized (this.field4743) {
            this.field4743.method3684(-17200);
        }
        if (arg0 != 1) {
            this.method1994(33, 101);
        }
        field4741++;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V", line = 20)
    public final void method1992(int arg0) {
        class653 var2 = this.field4743;
        synchronized (this.field4743) {
            this.field4743.method3687((byte) -10);
        }
        if (arg0 <= 91) {
            this.field4740 = null;
        }
        field4744++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;I)V", line = 34)
    public static final void method1993(String arg0, boolean arg1, String arg2, int arg3) {
        class380.field4932 = arg2;
        class673.field9560 = arg0;
        class44.field497 = arg1;
        field4739++;
        if (!class44.field497 && class19.field176 != 3 && (class380.field4932.equals("") || class673.field9560.equals(""))) {
            class539.method3071(3, (byte) -93);
        } else if (arg3 >= 16) {
            if (class19.field176 != 1) {
                class436.field6078 = 0;
                class405.field5405 = -1;
            }
            class236.field3000 = false;
            class539.method3071(-3, (byte) -79);
            class274.field3474 = 1;
            class387.field5175 = 0;
            class415.field5503 = 0;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)V", line = 66)
    public final void method1994(int arg0, int arg1) {
        field4745++;
        class653 var3 = this.field4743;
        synchronized (this.field4743) {
            if (arg1 != -3) {
                this.field4740 = null;
            }
            this.field4743.method3691(false, arg0);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)I", line = 80)
    public static final int method1995(int arg0, int arg1, int arg2, int arg3) {
        field4737++;
        if (class628.field8912 == null) {
            return 0;
        }
        int var4 = arg3 >> 9;
        int var5 = arg1 >> 9;
        if (var4 < 0 || var5 < 0 || var4 > class399.field5338 - 1 || (class349.field4567 - 1) < var5) {
            return 0;
        }
        int var6 = arg0;
        if (arg0 < 3 && (class379.field4922[1][var4][var5] & 0x2) != 0) {
            var6 = arg0 + 1;
        }
        if (arg2 != -1327568407) {
            method1995(-117, 95, -70, 25);
        }
        return class628.field8912[var6].method242(arg3, arg1);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)Llv;", line = 109)
    public final class405 method1996(int arg0, int arg1) {
        field4742++;
        class653 var3 = this.field4743;
        class405 var4;
        synchronized (this.field4743) {
            var4 = (class405) this.field4743.method3690((byte) -101, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class303 var5 = this.field4740;
        byte[] var6;
        synchronized (this.field4740) {
            var6 = this.field4740.method1719(arg1, arg0, 4);
        }
        class405 var7 = new class405();
        if (var6 != null) {
            var7.method2205(new class452(var6), (byte) -116);
        }
        class653 var8 = this.field4743;
        synchronized (this.field4743) {
            this.field4743.method3683(var7, (byte) -9, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Ljda;ILjo;)V", line = 142)
    public class363(class207 arg0, int arg1, class303 arg2) {
        this.field4740 = arg2;
        if (this.field4740 == null) {
            this.field4738 = 0;
        } else {
            this.field4738 = this.field4740.method1727(-77, 16);
        }
    }
}
