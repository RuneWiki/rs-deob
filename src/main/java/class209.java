import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class209 extends class94 implements class525 {

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    private int field2478;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Lft;")
    public static class4 field2476 = new class4();

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field2481 = 0;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "Llja;")
    public static class744 field2483 = new class744(12, 7);

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)I")
    public final int method1317(byte arg0) {
        ++field2484;
        int var2 = 124 / ((26 - arg0) / 55);
        return this.field2478;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V")
    public static void method1318(boolean arg0) {
        field2476 = null;
        field2483 = null;
        if (arg0) {
            method1320((class75) null, -93);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III[B)V")
    public final void method1319(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field2475;
        this.method828(arg3, arg0);
        this.field2478 = arg1;
        if (arg2 != -21246) {
            field2483 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lqh;I)Ljava/lang/String;")
    public static final String method1320(class75 arg0, int arg1) {
        ++field2482;
        if (arg1 > -2) {
            return null;
        } else if (arg0.field1035 != null && arg0.field1035.length() != 0) {
            return arg0.field1028 != null && ~arg0.field1028.length() < -1 ? arg0.field1026 + class637.field8707.method3584(class770.field10592, true) + arg0.field1028 + class637.field8707.method3584(class770.field10592, true) + arg0.field1035 : arg0.field1026 + class637.field8707.method3584(class770.field10592, true) + arg0.field1035;
        } else {
            return arg0.field1028 != null && arg0.field1028.length() > 0 ? arg0.field1026 + class637.field8707.method3584(class770.field10592, true) + arg0.field1028 : arg0.field1026;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)I")
    public final int method1321(int arg0) {
        int var2 = 59 / ((arg0 - 69) / 36);
        ++field2477;
        return 0;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lpc;I[BI)V")
    public class209(class700 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field2478 = arg1;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)Lat;")
    public static final class398 method1322(byte arg0, int arg1) {
        ++field2474;
        class398 var2 = (class398) class615.field8271.method1684((long) arg1, -359);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class39.field571.method437(0, (byte) 107, arg1);
            if (arg0 < 97) {
                field2481 = 3;
            }
            class398 var4 = new class398();
            if (var3 != null) {
                var4.method2334(new class403(var3), 5861);
            }
            var4.method2337((byte) -113);
            class615.field8271.method1686(-25638, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)J")
    public final long method1323(int arg0) {
        ++field2479;
        if (arg0 != -7206) {
            method1320((class75) null, -28);
        }
        return super.field1237.getAddress();
    }
}
