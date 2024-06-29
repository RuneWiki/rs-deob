import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class400 {

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IILjava/lang/String;[B)I", line = 4)
    public static final int method2283(int arg0, int arg1, String arg2, byte[] arg3) {
        field5108++;
        int var4 = arg2.length();
        if (arg1 != 11750) {
            return 107;
        }
        int var5 = arg0;
        for (int var6 = 0; var6 < var4; var6++) {
            char var7 = arg2.charAt(var6);
            if (var7 <= '\u007F') {
                arg3[var5++] = (byte) var7;
            } else if (var7 <= '߿') {
                arg3[var5++] = (byte) class131.method954(192, var7 >> 6);
                arg3[var5++] = (byte) class131.method954(class597.method3238(var7, 63), 128);
            } else {
                arg3[var5++] = (byte) class131.method954(224, var7 >> 12);
                arg3[var5++] = (byte) class131.method954(128, class597.method3238(var7, 4065) >> 6);
                arg3[var5++] = (byte) class131.method954(128, class597.method3238(63, var7));
            }
        }
        return var5 - arg0;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIII)I", line = 47)
    public static final int method2284(int arg0, int arg1, int arg2, int arg3) {
        field5109++;
        if (class484.field6455 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg0 - class706.field9866;
        int var7 = arg1 - class706.field9860;
        class700 var8 = (class700) class706.field9838.method2090(true);
        if (arg3 != 24214) {
            method2284(-71, -77, -50, 4);
        }
        while (var8 != null) {
            if (var8.field9761 == arg2) {
                int var9 = var8.field9760;
                int var10 = var8.field9759;
                int var11 = var9 + class706.field9866 << 14 | class706.field9860 + var10;
                int var12 = (var6 - var9) * (var6 - var9) + (var7 - var10) * (var7 - var10);
                if (var4 < 0 || var12 < var5) {
                    var5 = var12;
                    var4 = var11;
                }
            }
            var8 = (class700) class706.field9838.method2088(-152);
        }
        return var4;
    }
}
