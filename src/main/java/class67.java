import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public abstract class class67 extends class392 {

    @OriginalMember(owner = "client!hia", name = "y", descriptor = "Z")
    public volatile boolean field741 = true;

    @OriginalMember(owner = "client!hia", name = "x", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!hia", name = "v", descriptor = "Z")
    public boolean field738;

    @OriginalMember(owner = "client!hia", name = "w", descriptor = "Z")
    public boolean field739;

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(IIIIII)V", line = 11)
    public static final void method512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field740++;
        class372.field5192 = arg4;
        class273.field3591 = arg5;
        if (arg0 != -25686) {
            return;
        }
        class106.field1414 = arg1;
        class461.field6379 = arg3;
        class353.field4712 = arg2;
        if (class372.field5192 >= 100) {
            int var6 = class353.field4712 * 512 + 256;
            int var7 = class273.field3591 * 512 + 256;
            int var8 = class86.method624(class61.field677, var7, var6, 24111) - class461.field6379;
            int var9 = var6 - class294.field3956;
            int var10 = var8 - class262.field3429;
            int var11 = var7 - class684.field9518;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class74.field801 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class710.field9907 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            class659.field9198 = 0;
            if (class74.field801 < 1024) {
                class74.field801 = 1024;
            }
            if (class74.field801 > 3072) {
                class74.field801 = 3072;
            }
        }
        class8.field57 = 2;
        class39.field404 = -1;
        class520.field6999 = -1;
    }

    @OriginalMember(owner = "client!hia", name = "b", descriptor = "(I)I")
    public abstract int method510(int arg0);

    @OriginalMember(owner = "client!hia", name = "c", descriptor = "(I)[B")
    public abstract byte[] method511(int arg0);
}
