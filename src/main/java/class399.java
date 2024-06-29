import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class399 {

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field5368;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "Ljb;")
    public static class340 field5369;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "Lsf;")
    public static class361 field5370;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public static final void method2326(int arg0) {
        class118.method822(-110, class405.field5576);
        if (arg0 != 1135345664) {
            return;
        }
        class522.field7726++;
        field5368++;
        class193.field2708.method2200(arg0 - 1135345657, class170.method1136((byte) 77));
        class193.field2708.method2246(class149.field2132, (byte) -92);
        class193.field2708.method2246(class175.field2555, (byte) -124);
        class193.field2708.method2200(7, class154.field2244.field7756);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
    public static void method2327(int arg0) {
        field5370 = null;
        int var1 = 12 / ((arg0 - 53) / 45);
        field5369 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIILvl;Lvl;)V")
    public static final void method2328(int arg0, int arg1, int arg2, class11 arg3, class11 arg4) {
        class409 var5 = class185.method1204(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field5625 = arg3;
            var5.field5628 = arg4;
        }
    }
}
