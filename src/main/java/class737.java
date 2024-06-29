import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class737 {

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "Llja;")
    public static class744 field10287 = new class744(85, 7);

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field10283;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field10284;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field10286;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field10288;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field10289;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "Lde;")
    public static class558 field10285;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "[I")
    public static int[] field10282;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static void method4145(int arg0) {
        field10287 = null;
        if (arg0 == 20361) {
            field10282 = null;
            field10285 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public static final void method4146(byte arg0) {
        class754.field10460 = -1;
        class13.field218 = 0;
        class687.field9376 = -1;
        field10288++;
        class384.field4910 = -1;
        int var1 = -10 % ((-arg0 - 10) / 50);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBILjava/lang/Object;)[B")
    public static final byte[] method4147(int arg0, byte arg1, int arg2, Object arg3) {
        field10289++;
        if (arg3 == null) {
            return null;
        } else if (arg3 instanceof byte[]) {
            byte[] var4 = (byte[]) arg3;
            return class586.method3367(arg2, arg0, var4, (byte) 63);
        } else if (arg3 instanceof class608) {
            class608 var5 = (class608) arg3;
            return var5.method1620(arg1 ^ 0xFFFFFFAC, arg0, arg2);
        } else {
            if (arg1 != -84) {
                method4147(125, (byte) 68, -75, null);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
    public static final void method4148(int arg0) {
        field10284++;
        class569.field7811.method902((byte) 66);
        if (arg0 != -1) {
            field10287 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lmaa;)V")
    public static final void method4149(class497 arg0) {
        class613.field8242 = arg0;
    }
}
