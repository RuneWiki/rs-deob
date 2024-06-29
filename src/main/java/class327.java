import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class327 {

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
    public static int field4943 = 1;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "Lqc;")
    public static class99 field4938 = new class99(260);

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public static int field4946 = 0;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
    public static int field4947 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4948 = "Loaded title screen";

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public int field4935;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    private int field4939;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public int field4940;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBLcg;)V", line = 7)
    public final void method2284(int arg0, byte arg1, class316 arg2) {
        while (true) {
            int var4 = arg2.method2219(16448);
            if (var4 == 0) {
                field4934++;
                if (arg1 > -67) {
                    method2285(-102, false);
                }
                return;
            }
            this.method2287(-2, var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZ)Lff;", line = 29)
    public static final class181 method2285(int arg0, boolean arg1) {
        field4937++;
        class181 var2 = (class181) class326.field4932.method716((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = client.field1518.method955(class88.method682(arg0, 10383), class68.method500(arg0, arg1), -21853);
        class181 var4 = new class181();
        var4.field2488 = arg0;
        if (var3 != null) {
            var4.method1263(new class316(var3), -1);
        }
        var4.method1256(31);
        class326.field4932.method721((long) arg0, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 53)
    public static void method2286(int arg0) {
        if (arg0 != 6449) {
            field4948 = (String) null;
        }
        field4948 = null;
        field4938 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIILcg;)V", line = 66)
    private final void method2287(int arg0, int arg1, int arg2, class316 arg3) {
        if (~arg1 == arg0) {
            this.field4939 = arg3.method2220((byte) 111);
        } else if (arg1 == 2) {
            this.field4935 = arg3.method2219(16448);
            this.field4940 = arg3.method2219(16448);
        }
        field4944++;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)Lkn;", line = 94)
    public final class178 method2288(int arg0) {
        field4936++;
        class178 var2 = (class178) class193.field2646.method716((long) this.field4939, false);
        if (var2 != null) {
            return var2;
        }
        class178 var3 = class157.method1139(arg0, this.field4939, class167.field2280, arg0 - 127);
        if (var3 != null) {
            class193.field2646.method721((long) this.field4939, var3, arg0 ^ 0x0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BILsc;I)V", line = 114)
    public static final void method2289(byte arg0, int arg1, class329 arg2, int arg3) {
        field4942++;
        if (arg0 >= -97) {
            method2286(-16);
        }
        if (arg2.field3668 == arg1 && arg1 != -1) {
            class125 var4 = class52.method361(true, arg1);
            int var5 = var4.field1681;
            if (var5 == 1) {
                arg2.field3688 = 0;
                arg2.field3684 = 0;
                arg2.field3762 = arg3;
                arg2.field3724 = 1;
                arg2.field3760 = 0;
                class241.method1651(arg2.field3684, false, arg2.field3745, var4, arg2.field3679, 117);
            }
            if (var5 == 2) {
                arg2.field3760 = 0;
            }
        } else if (arg1 == -1 || arg2.field3668 == -1 || class52.method361(true, arg1).field1684 >= class52.method361(true, arg2.field3668).field1684) {
            arg2.field3668 = arg1;
            arg2.field3762 = arg3;
            arg2.field3724 = 1;
            arg2.field3688 = 0;
            arg2.field3684 = 0;
            arg2.field3760 = 0;
            arg2.field3727 = arg2.field3743;
            if (arg2.field3668 != -1) {
                class241.method1651(arg2.field3684, false, arg2.field3745, class52.method361(true, arg2.field3668), arg2.field3679, -70);
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B[B)Z", line = 176)
    public static final boolean method2290(byte arg0, byte[] arg1) {
        field4945++;
        int var2 = -20 % ((arg0 - 71) / 42);
        class316 var3 = new class316(arg1);
        int var4 = var3.method2219(16448);
        if (var4 != 1) {
            return false;
        }
        boolean var5 = var3.method2219(16448) == 1;
        if (var5) {
            class135.method982(var3, (byte) 58);
        }
        class10.method58((byte) -33, var3);
        return true;
    }
}
