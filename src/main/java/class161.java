import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class161 {

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public static int field2051 = 0;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "Lim;")
    public static class353 field2054 = new class353(11, -1);

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "[B")
    public byte[] field2050;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "[S")
    public short[] field2052;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "[S")
    public short[] field2053;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "[S")
    public short[] field2055;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
    public static void method875(int arg0) {
        if (arg0 == -1) {
            field2054 = null;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BIIIII)V")
    public static final void method876(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2049++;
        if (class113.field1453 >= arg2 && arg4 >= class535.field7467) {
            boolean var6;
            if (class594.field8575 > arg5) {
                arg5 = class594.field8575;
                var6 = false;
            } else if (arg5 > class355.field4972) {
                var6 = false;
                arg5 = class355.field4972;
            } else {
                var6 = true;
            }
            boolean var7;
            if (class594.field8575 > arg3) {
                arg3 = class594.field8575;
                var7 = false;
            } else if (arg3 <= class355.field4972) {
                var7 = true;
            } else {
                arg3 = class355.field4972;
                var7 = false;
            }
            if (arg2 >= class535.field7467) {
                class373.method2275((byte) -9, arg3, arg1, arg5, class256.field3173[arg2++]);
            } else {
                arg2 = class535.field7467;
            }
            if (arg4 <= class113.field1453) {
                class373.method2275((byte) -9, arg3, arg1, arg5, class256.field3173[arg4--]);
            } else {
                arg4 = class113.field1453;
            }
            if (var6 && var7) {
                for (int var8 = arg2; var8 <= arg4; var8++) {
                    int[] var9 = class256.field3173[var8];
                    var9[arg5] = var9[arg3] = arg1;
                }
            } else if (var6) {
                for (int var10 = arg2; var10 <= arg4; var10++) {
                    class256.field3173[var10][arg5] = arg1;
                }
            } else if (var7) {
                for (int var11 = arg2; var11 <= arg4; var11++) {
                    class256.field3173[var11][arg3] = arg1;
                }
            }
        }
        int var12 = -18 / ((60 - arg0) / 42);
    }
}
