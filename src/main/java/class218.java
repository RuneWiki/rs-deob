import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public abstract class class218 extends class540 {

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field3119 = 0;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)I")
    public abstract int method1506(byte arg0);

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)J")
    public abstract long method1507(byte arg0);

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(B)I")
    public abstract int method1508(byte arg0);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)I")
    public abstract int method1509(int arg0);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIBLft;)V")
    public static final void method1510(int arg0, int arg1, byte arg2, class4 arg3) {
        field3118++;
        if (!class422.field5962) {
            return;
        }
        int var4 = 0;
        for (class312 var5 = (class312) arg3.field46.method2480(381); var5 != null; var5 = (class312) arg3.field46.method2476((byte) 18)) {
            int var11 = class328.method2123(var5, 75);
            if (var4 < var11) {
                var4 = var11;
            }
        }
        var4 += 8;
        int var6 = arg3.field49 * 16 + 21;
        class204.field2992 = arg3.field49 * 16 + (class102.field1283 ? 26 : 22);
        int var7 = class611.field8627 + class505.field7233;
        if (var7 + var4 > class638.field8980) {
            var7 = class505.field7233 - var4;
        }
        int var8 = -61 / ((-arg2 - 66) / 57);
        if (var7 < 0) {
            var7 = 0;
        }
        int var9 = class102.field1283 ? 33 : 31;
        int var10 = arg0 + 13 - var9;
        if (class512.field7325 < var6 + var10) {
            var10 = class512.field7325 - var6;
        }
        class209.field3041 = var7;
        if (var10 < 0) {
            var10 = 0;
        }
        class149.field1906 = var10;
        class569.field8059 = arg3;
        class126.field1652 = var4;
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(B)I")
    public abstract int method1511(byte arg0);
}
