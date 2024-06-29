import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class254 extends class209 {

    @OriginalMember(owner = "client!mv", name = "w", descriptor = "I")
    public int field3244 = -1;

    @OriginalMember(owner = "client!mv", name = "r", descriptor = "Lkg;")
    public static class179 field3239 = new class179(78, 8);

    @OriginalMember(owner = "client!mv", name = "v", descriptor = "[S")
    public static short[] field3243 = new short[256];

    @OriginalMember(owner = "client!mv", name = "o", descriptor = "I")
    public int field3236;

    @OriginalMember(owner = "client!mv", name = "s", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!mv", name = "t", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!mv", name = "u", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!mv", name = "p", descriptor = "Ljava/lang/String;")
    public String field3237;

    @OriginalMember(owner = "client!mv", name = "q", descriptor = "Ljava/lang/String;")
    public String field3238;

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(B)V", line = 4)
    public static final void method1526(byte arg0) {
        for (class413 var1 = (class413) class45.field540.method2096(arg0 ^ 45); var1 != null; var1 = (class413) class45.field540.method2096(arg0 ^ 45)) {
            class477.method2898((byte) 44, var1);
        }
        ++field3240;
        int var2;
        int var3;
        if (class407.field5817.method580(class377.field4959, (byte) -35)) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = class415.field5926;
            var3 = class415.field5926;
        }
        client.method1236();
        for (int var4 = var3; var2 >= var4; ++var4) {
            client.method1240();
            client.method1245(var4);
            client.method1223(var4);
        }
        if (arg0 != 45) {
            field3239 = null;
        }
        client.method1237();
        client.method1224();
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIII)I", line = 51)
    public static final int method1527(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= -65) {
            field3239 = null;
        }
        if (~arg2 < -244) {
            arg0 >>= 4;
        } else if (arg2 <= 217) {
            if (~arg2 < -193) {
                arg0 >>= 2;
            } else if (~arg2 < -180) {
                arg0 >>= 1;
            }
        } else {
            arg0 >>= 3;
        }
        ++field3242;
        return (arg2 >> 1) + (((arg1 >> 2 & 63) << 10) - -(arg0 >> 5 << 7));
    }

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "(I)V", line = 77)
    public static void method1528(int arg0) {
        if (arg0 <= 31) {
            method1526((byte) -115);
        }
        field3243 = null;
        field3239 = null;
    }

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "(I)Lan;", line = 92)
    public final class20 method1529(int arg0) {
        if (arg0 != -18827) {
            method1526((byte) 116);
        }
        ++field3241;
        return class72.field933[super.field2701];
    }
}
