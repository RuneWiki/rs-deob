import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class107 {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1669 = "Allocated memory";

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "[I")
    public static int[] field1670 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Lcc;")
    public static class222 field1672 = null;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field1677 = -1;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "[S")
    public static short[] field1673;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "[[[B")
    public static byte[][][] field1671;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)I")
    public static final int method807(int arg0) {
        int var1 = -2 / ((arg0 - 29) / 49);
        field1676++;
        return 2;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIII)V")
    public static final void method808(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1674++;
        int var9 = arg3 + 1;
        class173.method1240((byte) -122, arg4, class55.field872[arg3], arg0, arg2);
        int var10 = arg5 - 1;
        class173.method1240((byte) -125, arg4, class55.field872[arg5], arg0, arg2);
        int var6 = -8 % ((37 - arg1) / 40);
        for (int var7 = var9; var7 <= var10; var7++) {
            int[] var8 = class55.field872[var7];
            var8[arg2] = var8[arg4] = arg0;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
    public static void method809(int arg0) {
        field1673 = null;
        field1670 = null;
        field1671 = null;
        field1669 = null;
        if (arg0 >= -26) {
            method810(-45, -84, -87, -94, 34, -26, 91);
        }
        field1672 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method810(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class207 var7 = new class207();
        var7.field3203 = arg1 / 128;
        var7.field3202 = arg2 / 128;
        var7.field3199 = arg3 / 128;
        var7.field3183 = arg4 / 128;
        var7.field3186 = arg0;
        var7.field3200 = arg1;
        var7.field3195 = arg2;
        var7.field3194 = arg3;
        var7.field3188 = arg4;
        var7.field3204 = arg5;
        var7.field3184 = arg6;
        class142.field2112[class174.field2690++] = var7;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lvd;Ljava/lang/Object;I)V")
    public static final void method811(class4 arg0, Object arg1, int arg2) {
        field1675++;
        if (arg0.field71 == null) {
            return;
        }
        int var3 = 0;
        if (arg2 != -15021) {
            field1673 = null;
        }
        while (var3 < 50 && arg0.field71.peekEvent() != null) {
            class122.method922(1L, (byte) -122);
            var3++;
        }
        if (arg1 != null) {
            arg0.field71.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
