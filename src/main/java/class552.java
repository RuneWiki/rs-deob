import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class552 {

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
    public static int field6914 = 1;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public static int field6911;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public static int field6913;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "[[B")
    public static byte[][] field6912;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I[B)V", line = 4)
    public static final synchronized void method2948(int arg0, byte[] arg1) {
        if (arg0 != 24069) {
            field6914 = 18;
        }
        field6913++;
        if (arg1.length == 100 && class24.field276 < 1000) {
            class182.field2135[class24.field276++] = arg1;
        } else if (arg1.length == 5000 && class391.field5007 < 250) {
            class556.field6956[class391.field5007++] = arg1;
        } else if (arg1.length == 30000 && class85.field1092 < 50) {
            class242.field3120[class85.field1092++] = arg1;
        } else if (class634.field8599 != null) {
            for (int var2 = 0; var2 < class613.field8336.length; var2++) {
                if (class613.field8336[var2] == arg1.length && class634.field8599[var2].length > class514.field6535[var2]) {
                    class634.field8599[var2][class514.field6535[var2]++] = arg1;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Loa;Lnt;III)V", line = 55)
    public static final void method2949(class650 arg0, class209 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class546.field6871) {
            class565 var5 = class407.field5237[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field7085 != null && var5.field7085.method137(-62)) {
                arg1.method135(true, arg0, var5.field7085, 0, 0, class97.field1256, 12137);
            }
        }
        if (arg4 < class546.field6871) {
            class565 var6 = class407.field5237[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field7085 != null && var6.field7085.method137(-37)) {
                arg1.method135(true, arg0, var6.field7085, 0, class97.field1256, 0, 12137);
            }
        }
        if (arg3 < class546.field6871 && arg4 < class36.field538) {
            class565 var7 = class407.field5237[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field7085 != null && var7.field7085.method137(-43)) {
                arg1.method135(true, arg0, var7.field7085, 0, class97.field1256, class97.field1256, 12137);
            }
        }
        if (arg3 < class546.field6871 && arg4 > 0) {
            class565 var8 = class407.field5237[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field7085 != null && var8.field7085.method137(-93)) {
                arg1.method135(true, arg0, var8.field7085, 0, -class97.field1256, class97.field1256, 12137);
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)[B", line = 102)
    public static final synchronized byte[] method2950(int arg0, int arg1) {
        field6911++;
        if (arg0 == 100 && class24.field276 > 0) {
            byte[] var2 = class182.field2135[--class24.field276];
            class182.field2135[class24.field276] = null;
            return var2;
        } else if (arg0 == 5000 && class391.field5007 > 0) {
            byte[] var3 = class556.field6956[--class391.field5007];
            class556.field6956[class391.field5007] = null;
            return var3;
        } else if (arg0 == 30000 && class85.field1092 > 0) {
            byte[] var4 = class242.field3120[--class85.field1092];
            class242.field3120[class85.field1092] = null;
            return var4;
        } else {
            if (class634.field8599 != null) {
                for (int var5 = 0; var5 < class613.field8336.length; var5++) {
                    if (class613.field8336[var5] == arg0 && class514.field6535[var5] > 0) {
                        byte[] var6 = class634.field8599[var5][--class514.field6535[var5]];
                        class634.field8599[var5][class514.field6535[var5]] = null;
                        return var6;
                    }
                }
            }
            return arg1 == 0 ? new byte[arg0] : null;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)V", line = 169)
    public static void method2951(boolean arg0) {
        if (!arg0) {
            method2950(-108, 120);
        }
        field6912 = null;
    }
}
