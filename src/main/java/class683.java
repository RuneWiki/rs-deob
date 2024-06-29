import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class683 {

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
    public static int field9716;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
    public static int field9717;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public static int field9718;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
    public static int field9719;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lvj;Z[[[BIB)Z", line = 13)
    public static final boolean method3862(class204 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class109.field1768) {
            return false;
        }
        int var5 = arg0.field3155 >> class49.field637;
        int var6 = arg0.field3154 >> class49.field637;
        if (var5 < class608.field8742 || var5 >= class684.field9729 || var6 < class31.field458 || var6 >= class172.field2786) {
            return true;
        } else if ((arg2 == null || arg0.field3158 < arg3 || arg2[arg0.field3158][var5][var6] != arg4) && arg0.method587((byte) -58) && !arg0.method588(0)) {
            return false;
        } else {
            if (!arg1 && var5 >= class371.field5135 - 16 && var5 <= class371.field5135 + 16 && var6 >= class22.field303 - 16 && var6 <= class22.field303 + 16) {
                if (class215.field3244) {
                    class254.field3674[class456.field6547++].method1890(1, arg0);
                    class456.field6547 %= class255.field3675;
                } else {
                    arg0.method625(91, class490.field7029);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIBLwv;II)Ljava/awt/Frame;", line = 48)
    public static final Frame method3863(int arg0, int arg1, byte arg2, class705 arg3, int arg4, int arg5) {
        field9719++;
        if (!arg3.method3959(114)) {
            return null;
        }
        if (arg4 == 0) {
            class680[] var6 = class65.method540(113, arg3);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field9677 == arg5 && var6[var8].field9674 == arg1 && (arg0 == 0 || var6[var8].field9678 == arg0) && (!var7 || arg4 < var6[var8].field9682)) {
                    var7 = true;
                    arg4 = var6[var8].field9682;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class614 var9 = arg3.method3966(arg0, arg1, (byte) 81, arg5, arg4);
        while (var9.field8787 == 0) {
            class564.method3300((byte) 120, 10L);
        }
        Frame var10 = (Frame) var9.field8785;
        if (arg2 < 91) {
            method3862(null, true, null, 53, (byte) -119);
        }
        if (var10 == null) {
            return null;
        } else if (var9.field8787 == 2) {
            class247.method1590(arg3, -2, var10);
            return null;
        } else {
            return var10;
        }
    }
}
