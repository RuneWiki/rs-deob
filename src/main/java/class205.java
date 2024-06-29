import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class205 {

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "[J")
    public static long[] field3366 = new long[1000];

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
    public static int field3372 = -1;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
    public static int field3374 = 0;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "Lak;")
    public static class172 field3369;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "[I")
    public static int[] field3370;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lle;IIBI)V", line = 28)
    public static final void method1492(class97 arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 >= -123) {
            method1493((byte) 114);
        }
        field3375++;
        for (class155 var5 = (class155) class240.field3813.method1240(3); var5 != null; var5 = (class155) class240.field3813.method1235(false)) {
            if (var5.field2394 == arg4 && (arg1 * 128) == var5.field2395 && arg2 * 128 == var5.field2389 && var5.field2384.field1345 == arg0.field1345) {
                if (var5.field2375 != null) {
                    class191.field3127.method118(var5.field2375);
                    var5.field2375 = null;
                }
                if (var5.field2399 != null) {
                    class191.field3127.method118(var5.field2399);
                    var5.field2399 = null;
                }
                var5.method1212((byte) 104);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V", line = 67)
    public static void method1493(byte arg0) {
        field3369 = null;
        field3366 = null;
        field3370 = null;
        if (arg0 > -41) {
            method1492((class97) null, -66, -41, (byte) 20, -22);
        }
    }
}
