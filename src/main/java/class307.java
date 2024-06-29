import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class307 {

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field5189 = 0;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field5187 = 0;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public int field5188;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public int field5194;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public int field5195;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "Z")
    public static boolean field5191;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)V", line = 20)
    public static final void method2093(int arg0, byte arg1) {
        if (arg1 > 57) {
            class93.field1685.method231((byte) 113, arg0);
            class249.field4383.method231((byte) 113, arg0);
            field5190++;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIJ)Z", line = 43)
    public static final boolean method2094(int arg0, int arg1, int arg2, long arg3) {
        class125 var5 = class312.field5246[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field2198 != null && var5.field2198.field2860 == arg3) {
            return true;
        } else if (var5.field2192 != null && var5.field2192.field4027 == arg3) {
            return true;
        } else if (var5.field2190 != null && var5.field2190.field2493 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field2201; var6++) {
                if (var5.field2204[var6].field1814 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }
}
