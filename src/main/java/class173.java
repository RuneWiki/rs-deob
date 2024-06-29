import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class173 extends class59 {

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "I")
    public static int field2721 = 0;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "I")
    public static int field2723 = 0;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
    public int field2714;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "I")
    public int field2716;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "I")
    public int field2719;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
    public int field2720;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "I")
    public int field2726;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "Ljava/lang/String;")
    public String field2718;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "[I")
    public int[] field2715;

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "[I")
    public int[] field2717;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "[Lac;")
    public class153[] field2724;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "[Ljava/lang/String;")
    public String[] field2722;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIZLqk;I)V")
    public static final void method1240(int arg0, int arg1, int arg2, boolean arg3, class57 arg4, int arg5) {
        field2725++;
        if (class210.field3275 >= 50 || arg4 == null || arg4.field848 == null || arg4.field848.length <= arg5 || arg4.field848[arg5] == null) {
            return;
        }
        int var6 = arg4.field848[arg5][0];
        int var7 = var6 & 0x1F;
        int var8 = var6 >> 5 & 0x7;
        if (arg2 != -9160) {
            return;
        }
        int var9 = var6 >> 8;
        if (arg4.field848[arg5].length > 1) {
            int var10 = (int) ((double) arg4.field848[arg5].length * Math.random());
            if (var10 > 0) {
                var9 = arg4.field848[arg5][var10];
            }
        }
        if (var7 == 0) {
            if (arg3) {
                class205.method1416(var9, var8, 8526, 0, 255);
            }
        } else if (class235.field3792 != 0) {
            class235.field3794[class210.field3275] = var9;
            class170.field2625[class210.field3275] = var8;
            int var11 = (arg0 - 64) / 128;
            class46.field574[class210.field3275] = 0;
            class112.field1627[class210.field3275] = null;
            int var12 = (arg1 - 64) / 128;
            class250.field4058[class210.field3275] = 255;
            class200.field3154[class210.field3275] = (var11 << 16) + (var12 << 8) + var7;
            class210.field3275++;
        }
    }
}
