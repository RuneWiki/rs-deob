import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class627 {

    @OriginalMember(owner = "client!lha", name = "e", descriptor = "I")
    public static int field8774 = 0;

    @OriginalMember(owner = "client!lha", name = "c", descriptor = "Lmia;")
    public static class63 field8772 = new class63(3, 8);

    @OriginalMember(owner = "client!lha", name = "g", descriptor = "I")
    public static int field8776 = -1;

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "I")
    public static int field8770;

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "I")
    public static int field8771;

    @OriginalMember(owner = "client!lha", name = "d", descriptor = "I")
    public static int field8773;

    @OriginalMember(owner = "client!lha", name = "f", descriptor = "I")
    public static int field8775;

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(II)Z")
    public static final boolean method3618(int arg0, int arg1) {
        if (arg0 != 7) {
            field8776 = -63;
        }
        field8773++;
        return arg1 == 3 || arg1 == 7 || arg1 == 10;
    }

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "(II)Z")
    public static final boolean method3619(int arg0, int arg1) {
        if (arg0 == 2) {
            field8771++;
            return (-arg1 & arg1) == arg1;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(Z)V")
    public static void method3620(boolean arg0) {
        field8772 = null;
        if (arg0) {
            field8776 = -118;
        }
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(IIIBI)V")
    public static final void method3621(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field8775++;
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -122 / ((arg3 - 39) / 61);
        int var9 = -1;
        int var10 = class462.method2818(class391.field5895, class497.field7073, arg0 + arg4, 8373);
        int var11 = class462.method2818(class391.field5895, class497.field7073, arg4 - arg0, 8373);
        class238.method1577(arg2, class664.field9322[arg1], var10, var11, (byte) 121);
        while (var5 < var6) {
            var9 += 2;
            var7 += var9;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var12 = arg1 - var6;
                int var13 = arg1 + var6;
                if (var13 >= class166.field2622 && class432.field6446 >= var12) {
                    int var14 = class462.method2818(class391.field5895, class497.field7073, arg4 + var5, 8373);
                    int var15 = class462.method2818(class391.field5895, class497.field7073, arg4 - var5, 8373);
                    if (class432.field6446 >= var13) {
                        class238.method1577(arg2, class664.field9322[var13], var14, var15, (byte) -85);
                    }
                    if (class166.field2622 <= var12) {
                        class238.method1577(arg2, class664.field9322[var12], var14, var15, (byte) 121);
                    }
                }
            }
            var5++;
            int var16 = arg1 - var5;
            int var17 = arg1 + var5;
            if (var17 >= class166.field2622 && class432.field6446 >= var16) {
                int var18 = class462.method2818(class391.field5895, class497.field7073, arg4 + var6, 8373);
                int var19 = class462.method2818(class391.field5895, class497.field7073, arg4 - var6, 8373);
                if (var17 <= class432.field6446) {
                    class238.method1577(arg2, class664.field9322[var17], var18, var19, (byte) 127);
                }
                if (class166.field2622 <= var16) {
                    class238.method1577(arg2, class664.field9322[var16], var18, var19, (byte) 122);
                }
            }
        }
    }
}
