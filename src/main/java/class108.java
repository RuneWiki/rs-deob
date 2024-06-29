import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class108 {

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public int field1558 = 0;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field1559 = 0;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "Z")
    public static boolean field1560 = false;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lkl;I)V")
    public final void method708(class114 arg0, int arg1) {
        if (arg1 <= 85) {
            return;
        }
        while (true) {
            int var3 = arg0.method760(false);
            if (var3 == 0) {
                field1562++;
                return;
            }
            this.method710(arg0, 13567, var3);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method709(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg9 != -6) {
            return;
        }
        if (arg3 >= class93.field1412 && arg3 <= class142.field2061 && class93.field1412 <= arg7 && arg7 <= class142.field2061 && arg1 >= class93.field1412 && class142.field2061 >= arg1 && class93.field1412 <= arg2 && arg2 <= class142.field2061 && arg6 >= class93.field1418 && class254.field3857 >= arg6 && arg5 >= class93.field1418 && arg5 <= class254.field3857 && arg8 >= class93.field1418 && class254.field3857 >= arg8 && arg0 >= class93.field1418 && class254.field3857 >= arg0) {
            class80.method535(arg3, arg5, arg0, arg4, arg7, (byte) 15, arg6, arg1, arg8, arg2);
        } else {
            class193.method1236((byte) -73, arg7, arg3, arg2, arg5, arg8, arg1, arg6, arg4, arg0);
        }
        field1561++;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lkl;II)V")
    private final void method710(class114 arg0, int arg1, int arg2) {
        if (arg2 == 5) {
            this.field1558 = arg0.method756(-29901);
        }
        field1557++;
        if (arg1 != 13567) {
            field1559 = 1;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static final void method711(int arg0) {
        field1563++;
        int var1 = -46 / ((25 - arg0) / 57);
        for (int var2 = -1; var2 < class193.field2770; var2++) {
            int var6;
            if (var2 == -1) {
                var6 = 2047;
            } else {
                var6 = class110.field1589[var2];
            }
            class53 var7 = class194.field2777[var6];
            if (var7 != null && var7.field115 > 0) {
                var7.field115--;
                if (var7.field115 == 0) {
                    var7.field69 = null;
                }
            }
        }
        for (int var3 = 0; var3 < class51.field756; var3++) {
            int var4 = class67.field1049[var3];
            class72 var5 = class82.field1268[var4];
            if (var5 != null && var5.field115 > 0) {
                var5.field115--;
                if (var5.field115 == 0) {
                    var5.field69 = null;
                }
            }
        }
    }
}
