import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class686 {

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field9719;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field9720;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field9721;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field9723;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field9724;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "[I")
    public static int[] field9722;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public static void method3856(byte arg0) {
        if (arg0 >= -6) {
            method3856((byte) 56);
        }
        field9722 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method3857(String arg0, int arg1) {
        if (class696.field9798 == null) {
            class609.method3501(45);
        }
        field9724++;
        class223.field3356.setTime(new Date(class525.method3074((byte) -101)));
        if (arg1 <= 13) {
            method3859(null, null, false, 35);
        }
        int var2 = class223.field3356.get(11);
        int var3 = class223.field3356.get(12);
        int var4 = class223.field3356.get(13);
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var6 = class394.method2433('\n', arg0, (byte) 104);
        for (int var7 = 0; var7 < var6.length; var7++) {
            for (int var8 = class210.field3196; var8 > 0; var8--) {
                class696.field9798[var8] = class696.field9798[var8 - 1];
            }
            class696.field9798[0] = var5 + ": " + var6[var7];
            if ((class696.field9798.length - 1) > class210.field3196) {
                if (class167.field2785 > 0) {
                    class167.field2785++;
                }
                class210.field3196++;
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILsh;)I")
    public static final int method3858(int arg0, class62 arg1) {
        if (arg0 != 9216) {
            field9722 = null;
        }
        field9719++;
        if (class705.field9924 == arg1) {
            return 9216;
        } else if (class356.field5328 == arg1) {
            return 34065;
        } else if (class172.field2837 == arg1) {
            return 34066;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lan;[IZI)V")
    public static final void method3859(class22 arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0.field8760 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg0.field8760.length; var5++) {
                if (arg0.field8760[var5] != arg1[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg0.field8755 != -1) {
                class138 var6 = class357.field5338.method2099(arg0.field8755, true);
                int var7 = var6.field2434;
                if (var7 == 1) {
                    arg0.field8740 = 1;
                    arg0.field8677 = 0;
                    arg0.field8738 = arg3;
                    arg0.field8722 = 0;
                    arg0.field8741 = 0;
                    class536.method3101(arg0.field8677, (byte) 124, var6, arg0.field9815, arg0.field9806, arg0.field9814, false);
                }
                if (var7 == 2) {
                    arg0.field8722 = 0;
                }
            }
        }
        field9720++;
        boolean var8 = true;
        if (arg2) {
            return;
        }
        for (int var9 = 0; var9 < arg1.length; var9++) {
            if (arg1[var9] != -1) {
                var8 = false;
            }
            if (arg0.field8760 == null || arg0.field8760[var9] == -1 || class357.field5338.method2099(arg1[var9], true).field2441 >= class357.field5338.method2099(arg0.field8760[var9], true).field2441) {
                arg0.field8760 = arg1;
                arg0.field8738 = arg3;
                arg0.field8780 = arg0.field8779;
            }
        }
        if (var8) {
            arg0.field8760 = arg1;
            arg0.field8780 = arg0.field8779;
            arg0.field8738 = arg3;
        }
    }
}
