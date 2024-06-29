import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class250 extends class33 {

    @OriginalMember(owner = "client!c", name = "K", descriptor = "Ljava/lang/Object;")
    private Object field3589;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "Ljava/lang/String;")
    public static String field3585 = "level: ";

    @OriginalMember(owner = "client!c", name = "I", descriptor = "I")
    public static int field3587 = 2;

    @OriginalMember(owner = "client!c", name = "J", descriptor = "I")
    public static int field3588 = 5063219;

    @OriginalMember(owner = "client!c", name = "H", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!c", name = "P", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V", line = 5)
    public static final void method1704(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > -89) {
            return;
        }
        field3594++;
        if (arg3 == 0) {
            class90.field1264.method2238(117, (byte) -128);
            class90.field1264.method2184((byte) 89, 5);
            class26.field328++;
        }
        if (arg3 == 1) {
            class344.field5208++;
            class90.field1264.method2238(235, (byte) -128);
            class90.field1264.method2184((byte) 89, 19);
        }
        class90.field1264.method2174((byte) 91, class149.field2067[82] ? 1 : 0);
        class90.field1264.method2169(true, class132.field1809 + arg1);
        class90.field1264.method2206(class296.field4394 + arg0, -128);
        class167.field2278 = arg1;
        class288.field4282 = arg0;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 35)
    public final Object method190(byte arg0) {
        field3593++;
        return arg0 == 80 ? this.field3589 : (Object) null;
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(B)V", line = 48)
    public static final void method1705(byte arg0) {
        field3592++;
        class61.method411();
        int var1 = 0;
        if (arg0 >= -92) {
            field3588 = -75;
        }
        while (var1 < 4) {
            class312.field4714[var1].method532((byte) -115);
            var1++;
        }
        System.gc();
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)Z", line = 68)
    public final boolean method184(int arg0) {
        int var2 = 23 / ((27 - arg0) / 45);
        field3591++;
        return false;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIBI)V", line = 87)
    public static final void method1706(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field3590++;
        if (arg4 != 94) {
            method1706(40, -7, -112, 116, (byte) 32, -52);
        }
        for (int var6 = arg3; var6 <= arg5; var6++) {
            class190.method1329(class126.field1723[var6], arg1, arg0, (byte) -114, arg2);
        }
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "(B)V", line = 108)
    public static void method1707(byte arg0) {
        if (arg0 != -114) {
            field3585 = (String) null;
        }
        field3585 = null;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 126)
    public class250(Object arg0) {
        this.field3589 = arg0;
    }
}
