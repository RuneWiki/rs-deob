import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class260 extends class198 {

    @OriginalMember(owner = "client!ru", name = "s", descriptor = "[I")
    public static int[] field3679 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!ru", name = "t", descriptor = "Luo;")
    public static class696 field3680 = new class696(14, 0);

    @OriginalMember(owner = "client!ru", name = "z", descriptor = "Luo;")
    public static class696 field3686 = new class696(15, 4);

    @OriginalMember(owner = "client!ru", name = "A", descriptor = "Luo;")
    public static class696 field3687 = new class696(16, -2);

    @OriginalMember(owner = "client!ru", name = "B", descriptor = "Luo;")
    public static class696 field3688 = new class696(17, 0);

    @OriginalMember(owner = "client!ru", name = "C", descriptor = "Luo;")
    public static class696 field3689 = new class696(18, -2);

    @OriginalMember(owner = "client!ru", name = "D", descriptor = "Luo;")
    public static class696 field3690 = new class696(19, -2);

    @OriginalMember(owner = "client!ru", name = "E", descriptor = "Luo;")
    public static class696 field3691 = new class696(22, -2);

    @OriginalMember(owner = "client!ru", name = "F", descriptor = "Luo;")
    public static class696 field3692 = new class696(23, 4);

    @OriginalMember(owner = "client!ru", name = "G", descriptor = "Luo;")
    public static class696 field3693 = new class696(24, -1);

    @OriginalMember(owner = "client!ru", name = "H", descriptor = "Luo;")
    public static class696 field3694 = new class696(26, 0);

    @OriginalMember(owner = "client!ru", name = "J", descriptor = "Luo;")
    public static class696 field3695 = new class696(27, 0);

    @OriginalMember(owner = "client!ru", name = "K", descriptor = "Luo;")
    public static class696 field3696 = new class696(28, -2);

    @OriginalMember(owner = "client!ru", name = "L", descriptor = "[Luo;")
    private static class696[] field3697 = new class696[32];

    @OriginalMember(owner = "client!ru", name = "r", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!ru", name = "u", descriptor = "I")
    private int field3681;

    @OriginalMember(owner = "client!ru", name = "w", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!ru", name = "x", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!ru", name = "v", descriptor = "J")
    private long field3682;

    @OriginalMember(owner = "client!ru", name = "y", descriptor = "Luf;")
    public static class519 field3685;

    static {
        class696[] var0 = class160.method1227(0);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field3697[var0[var1].field9792] = var0[var1];
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V", line = 4)
    public static void method1691(byte arg0) {
        field3690 = null;
        field3693 = null;
        field3694 = null;
        field3680 = null;
        int var1 = 91 / ((arg0 + 75) / 34);
        field3686 = null;
        field3689 = null;
        field3688 = null;
        field3685 = null;
        field3691 = null;
        field3695 = null;
        field3697 = null;
        field3687 = null;
        field3692 = null;
        field3679 = null;
        field3696 = null;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILlm;)V", line = 34)
    public final void method858(int arg0, class50 arg1) {
        field3678++;
        if (arg0 != 3) {
            field3686 = null;
        }
        arg1.method388(this.field3682, this.field3681, 4);
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Leba;)V", line = 57)
    public static final void method1692(class284 arg0) {
        if (class774.field10661 >= 65535) {
            return;
        }
        class217 var1 = arg0.field4161;
        class208.field3032[class774.field10661] = arg0;
        class724.field10089[class774.field10661] = false;
        class774.field10661++;
        int var2 = arg0.field4162;
        if (arg0.field4177) {
            var2 = 0;
        }
        int var3 = arg0.field4162;
        if (arg0.field4179) {
            var3 = class169.field2565 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method1490((byte) -126) + class358.field5076 - var1.method1491(0) >> class679.field9600;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method1490((byte) -126) + var1.method1491(0) - class358.field5076 >> class679.field9600;
            if (var7 >= class681.field9665) {
                var7 = class681.field9665 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field4166[var5++];
                int var10 = (var1.method1495(false) + class358.field5076 - var1.method1491(0) >> class679.field9600) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class42.field520) {
                    var11 = class42.field520 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class293.field4281[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class293.field4281[var4][var12][var8] = var13 | (long) class774.field10661;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class293.field4281[var4][var12][var8] = var13 | (long) class774.field10661 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class293.field4281[var4][var12][var8] = var13 | (long) class774.field10661 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class293.field4281[var4][var12][var8] = var13 | (long) class774.field10661 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZLol;)V", line = 156)
    public final void method855(boolean arg0, class431 arg1) {
        this.field3681 = arg1.method2526(17);
        if (!arg0) {
            field3693 = null;
        }
        field3683++;
        this.field3682 = arg1.method2567((byte) -126);
    }
}
