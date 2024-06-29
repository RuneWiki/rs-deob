import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class344 {

    @OriginalMember(owner = "client!at", name = "a", descriptor = "Lvh;")
    private class328 field4970 = new class328(64);

    @OriginalMember(owner = "client!at", name = "g", descriptor = "Lpj;")
    private class132 field4976;

    @OriginalMember(owner = "client!at", name = "b", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!at", name = "c", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!at", name = "e", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!at", name = "f", descriptor = "Ljava/lang/Object;")
    public static Object field4975;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
    public static void method2050(int arg0) {
        int var1 = 34 % ((6 - arg0) / 58);
        field4975 = null;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(BIIZZ)V")
    public static final void method2051(byte arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        field4974++;
        class339.method2032(arg4, 8573, arg1, class182.field2690.length - 1, arg2, 0, arg3);
        class363.field5180 = null;
        class515.field7038 = 0;
        int var5 = -9 / ((arg0 + 71) / 47);
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(II)Z")
    public static final boolean method2052(int arg0, int arg1) {
        field4971++;
        if (arg1 != 0) {
            field4975 = null;
        }
        return arg0 == 3 || arg0 == 5 || arg0 == 6;
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(II)Llr;")
    public final class688 method2053(int arg0, int arg1) {
        field4973++;
        class328 var3 = this.field4970;
        class688 var4;
        synchronized (this.field4970) {
            var4 = (class688) this.field4970.method1986((byte) -105, (long) arg0);
        }
        if (arg1 >= -56) {
            field4975 = null;
        }
        if (var4 != null) {
            return var4;
        }
        class132 var5 = this.field4976;
        byte[] var6;
        synchronized (this.field4976) {
            var6 = this.field4976.method940(5, arg0, 0);
        }
        class688 var7 = new class688();
        if (var6 != null) {
            var7.method3787(-25378, new class96(var6));
        }
        class328 var8 = this.field4970;
        synchronized (this.field4970) {
            this.field4970.method1985(var7, (long) arg0, (byte) -102);
            return var7;
        }
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Ldd;ILpj;)V")
    public class344(class647 arg0, int arg1, class132 arg2) {
        this.field4976 = arg2;
        this.field4976.method936(5, -121);
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(BI)I")
    public static final int method2054(byte arg0, int arg1) {
        field4972++;
        return arg0 <= 75 ? 103 : arg1 >>> 7;
    }
}
