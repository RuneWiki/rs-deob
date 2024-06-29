import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public abstract class class652 extends class321 {

    @OriginalMember(owner = "client!nv", name = "u", descriptor = "Lpe;")
    public class611 field9328;

    @OriginalMember(owner = "client!nv", name = "t", descriptor = "I")
    public int field9327;

    @OriginalMember(owner = "client!nv", name = "A", descriptor = "F")
    public static float field9334;

    @OriginalMember(owner = "client!nv", name = "w", descriptor = "I")
    public static int field9330;

    @OriginalMember(owner = "client!nv", name = "z", descriptor = "I")
    public static int field9333;

    @OriginalMember(owner = "client!nv", name = "B", descriptor = "I")
    public static int field9335;

    @OriginalMember(owner = "client!nv", name = "v", descriptor = "J")
    public static long field9329;

    @OriginalMember(owner = "client!nv", name = "y", descriptor = "Lf;")
    public static class256 field9332;

    @OriginalMember(owner = "client!nv", name = "x", descriptor = "Llm;")
    public static class40 field9331;

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lpe;I)V", line = 4)
    public class652(class611 arg0, int arg1) {
        this.field9328 = arg0;
        this.field9327 = arg1;
    }

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "(I)V", line = 18)
    public static void method3689(int arg0) {
        field9332 = null;
        field9331 = null;
        if (arg0 < 78) {
            field9331 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B[ILu;I)V", line = 30)
    public static final void method3690(byte arg0, int[] arg1, class53 arg2, int arg3) {
        if (arg2.field7328 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg2.field7328.length; var5++) {
                if (arg2.field7328[var5] != arg1[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg2.field7389 != -1) {
                class47 var6 = class203.field2769.method2971(-70, arg2.field7389);
                int var7 = var6.field725;
                if (var7 == 1) {
                    arg2.field7392 = arg3;
                    arg2.field7391 = 0;
                    arg2.field7342 = 0;
                    arg2.field7371 = 1;
                    arg2.field7419 = 0;
                    if (!arg2.field7372) {
                        class620.method3567(arg2, arg2.field7419, var6, (byte) -117);
                    }
                }
                if (var7 == 2) {
                    arg2.field7342 = 0;
                }
            }
        }
        field9333++;
        if (arg0 < 81) {
            return;
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg1.length; var9++) {
            if (arg1[var9] != -1) {
                var8 = false;
            }
            if (arg2.field7328 == null || arg2.field7328[var9] == -1 || class203.field2769.method2971(-51, arg1[var9]).field742 >= class203.field2769.method2971(-55, arg2.field7328[var9]).field742) {
                arg2.field7328 = arg1;
                arg2.field7392 = arg3;
                arg2.field7434 = arg2.field7436;
            }
        }
        if (var8) {
            arg2.field7392 = arg3;
            arg2.field7328 = arg1;
            arg2.field7434 = arg2.field7436;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIII)I", line = 122)
    public static final int method3691(int arg0, int arg1, int arg2, int arg3) {
        field9335++;
        int var4 = 87 % (-arg1 / 56);
        if (arg0 == arg2) {
            return arg2;
        }
        int var5 = 128 - arg3;
        int var6 = (arg0 & 0x7F) * arg3 + (arg2 & 0x7F) * var5 >> 7;
        int var7 = (arg0 & 0x380) * arg3 + (arg2 & 0x380) * var5 >> 7;
        int var8 = (arg0 & 0xFC00) * arg3 + (arg2 & 0xFC00) * var5 >> 7;
        return var6 & 0x7F | var8 & 0xFC00 | var7 & 0x380;
    }

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "(I)V", line = 143)
    public static final void method3692(int arg0) {
        field9330++;
        class366.method2243(arg0 - 22000, class335.field4872.field9504, 2, 22050);
        class128.field1846 = class634.method3633(class61.field978, class410.field6110, 22050, -3, 0);
        class507.method2884(class59.method367(null, -1226), -1, true);
        class378.field5680 = class634.method3633(class61.field978, class410.field6110, 2048, -3, 1);
        class556.field8166 = new class358();
        class378.field5680.method153((byte) 76, class556.field8166);
        class592.field8600 = new class501(arg0, class82.field1321);
        class572.field8309 = class18.field360.method1819("scape main", (byte) 32);
        class613.method3488(arg0 ^ 0x15B1);
    }

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "(I)Z")
    public abstract boolean method1255(int arg0);

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1254(int arg0);
}
