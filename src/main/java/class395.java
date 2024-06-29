import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class395 {

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "Lta;")
    public static class301 field5658;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lcv;B)I")
    public static final int method2345(class264 arg0, byte arg1) {
        field5656++;
        if (class66.field868 == arg0) {
            return 7681;
        } else if (class594.field8145 == arg0) {
            return 8448;
        } else if (class75.field948 == arg0) {
            return 34165;
        } else if (class129.field1635 == arg0) {
            return 260;
        } else if (class517.field7094 == arg0) {
            return 34023;
        } else {
            int var2 = 4 / ((39 - arg1) / 41);
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)Z")
    public static final boolean method2346(int arg0, int arg1, int arg2) {
        field5657++;
        if (class325.method2087(-1, arg0, arg2)) {
            if (arg1 != 34165) {
                field5658 = null;
            }
            return class411.method2408(arg0, arg2, 0) | (arg2 & 0x9000) != 0 | class512.method2896((byte) 119, arg2, arg0) ? true : (arg0 & 0x37) == 0 & ((arg2 & 0x2000) != 0 | class278.method1687(arg2, arg0, 0) | class96.method534(arg2, -25442, arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
    public static void method2347(byte arg0) {
        field5658 = null;
        if (arg0 >= -121) {
            field5658 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIII)V")
    public static final void method2348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2;
        if (arg3 != 36864) {
            method2345(null, (byte) 54);
        }
        while (arg5 >= var6) {
            class653.method3620(arg4, arg1, false, arg0, class319.field4673[var6]);
            var6++;
        }
        field5659++;
    }
}
