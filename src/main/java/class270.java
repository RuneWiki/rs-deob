import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class270 {

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "[Z")
    public static boolean[] field3916 = new boolean[100];

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "I")
    public static int field3918 = 0;

    @OriginalMember(owner = "client!sda", name = "d", descriptor = "I")
    public static int field3919 = 1;

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!sda", name = "f", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!sda", name = "g", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!sda", name = "h", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!sda", name = "i", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!sda", name = "e", descriptor = "[[Z")
    public static boolean[][] field3920;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V", line = 9)
    public static void method1748(int arg0) {
        int var1 = -24 % ((-arg0 - 82) / 33);
        field3920 = null;
        field3916 = null;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(Ljava/lang/String;ZB)V", line = 20)
    public static final void method1749(String arg0, boolean arg1, byte arg2) {
        field3924++;
        if (arg0 == null) {
            return;
        }
        if (class47.field600 >= 100) {
            class227.method1550((byte) -67, 4, class620.field8700.method3580(class140.field2081, 12));
            return;
        }
        int var3 = 74 % ((-arg2 - 8) / 62);
        String var4 = class663.method3782((byte) 103, arg0);
        if (var4 == null) {
            return;
        }
        for (int var5 = 0; var5 < class47.field600; var5++) {
            String var10 = class663.method3782((byte) 62, class646.field9032[var5]);
            if (var10 != null && var10.equals(var4)) {
                class227.method1550((byte) -67, 4, arg0 + class620.field8701.method3580(class140.field2081, 12));
                return;
            }
            if (class758.field10440[var5] != null) {
                String var11 = class663.method3782((byte) 80, class758.field10440[var5]);
                if (var11 != null && var11.equals(var4)) {
                    class227.method1550((byte) -67, 4, arg0 + class620.field8701.method3580(class140.field2081, 12));
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < class22.field365; var6++) {
            String var8 = class663.method3782((byte) 72, class440.field5967[var6]);
            if (var8 != null && var8.equals(var4)) {
                class227.method1550((byte) -67, 4, class620.field8706.method3580(class140.field2081, 12) + arg0 + class620.field8707.method3580(class140.field2081, 12));
                return;
            }
            if (class36.field484[var6] != null) {
                String var9 = class663.method3782((byte) 80, class36.field484[var6]);
                if (var9 != null && var9.equals(var4)) {
                    class227.method1550((byte) -67, 4, class620.field8706.method3580(class140.field2081, 12) + arg0 + class620.field8707.method3580(class140.field2081, 12));
                    return;
                }
            }
        }
        if (class663.method3782((byte) 62, class210.field3250.field9768).equals(var4)) {
            class227.method1550((byte) -67, 4, class620.field8703.method3580(class140.field2081, 12));
            return;
        }
        class629.field8823++;
        class312 var7 = class353.method2245(class87.field971, class505.field7180, (byte) 24);
        var7.field4445.method2952(0, class348.method2204((byte) -78, arg0) + 1);
        var7.field4445.method2953(arg0, -28136);
        var7.field4445.method2952(0, arg1 ? 1 : 0);
        class208.method1440(var7, 121);
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "([IBLqfa;II[I)Lun;", line = 118)
    public static final class444 method1750(int[] arg0, byte arg1, class106 arg2, int arg3, int arg4, int[] arg5) {
        if (arg1 != 41) {
            return null;
        }
        field3917++;
        byte[] var6 = new byte[arg3 * arg4];
        for (int var7 = 0; var7 < arg3; var7++) {
            int var8 = arg4 * var7 + arg5[var7];
            for (int var9 = 0; var9 < arg0[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class444(arg2, arg4, arg3, var6);
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(III)Z", line = 154)
    public static final boolean method1751(int arg0, int arg1, int arg2) {
        field3922++;
        if (arg0 == 33) {
            return (arg2 & 0x21) != 0;
        } else {
            return true;
        }
    }
}
