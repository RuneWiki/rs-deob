import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class252 {

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z[I[I)V")
    public static final void method1674(boolean arg0, int[] arg1, int[] arg2) {
        field3556++;
        if (arg2 == null || arg1 == null) {
            class724.field10149 = null;
            class180.field2728 = null;
            class4.field52 = null;
            return;
        }
        class4.field52 = arg2;
        class180.field2728 = new int[arg2.length];
        class724.field10149 = new byte[arg2.length][][];
        for (int var3 = 0; var3 < class4.field52.length; var3++) {
            class724.field10149[var3] = new byte[arg1[var3]][];
        }
        if (arg0) {
            method1674(true, null, null);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIII)I")
    public static final int method1675(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        if (arg1 <= 56) {
            return -78;
        }
        field3555++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 4095 - arg2;
        } else if (var4 == 2) {
            return 4095 - arg0;
        } else {
            return arg2;
        }
    }
}
