import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class168 extends class359 {

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public volatile int field2351 = -1;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "Ljava/lang/String;")
    public volatile String field2352;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static volatile int field2349 = -1;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "Lra;")
    public static class57 field2348;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)V", line = 6)
    public static final void method1109(byte arg0) {
        field2353++;
        if (arg0 <= 43) {
            field2348 = null;
        }
        class333.method2133();
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(B)V", line = 18)
    public static void method1110(byte arg0) {
        field2348 = null;
        if (arg0 > -56) {
            field2349 = -86;
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 36)
    public class168(String arg0) {
        this.field2352 = arg0;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V", line = 51)
    public static final void method1111(int arg0) {
        field2350++;
        int var1 = 0;
        if (arg0 != -1) {
            method1111(33);
        }
        while (class426.field6168 > var1) {
            int var2 = class201.field2770[var1];
            class358 var3 = class81.field917[var2];
            if (var3 != null) {
                class233.method1491((byte) 69, var3.field5229.field4982, var3);
            }
            var1++;
        }
    }
}
