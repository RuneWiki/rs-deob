import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class634 extends class13 {

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "Lej;")
    public static class124 field8707 = new class124(14, -1);

    @OriginalMember(owner = "client!jk", name = "I", descriptor = "I")
    public static int field8719 = 0;

    @OriginalMember(owner = "client!jk", name = "x", descriptor = "I")
    public int field8708;

    @OriginalMember(owner = "client!jk", name = "y", descriptor = "I")
    public int field8709;

    @OriginalMember(owner = "client!jk", name = "E", descriptor = "I")
    public int field8715;

    @OriginalMember(owner = "client!jk", name = "G", descriptor = "I")
    public int field8717;

    @OriginalMember(owner = "client!jk", name = "H", descriptor = "I")
    public static int field8718;

    @OriginalMember(owner = "client!jk", name = "K", descriptor = "I")
    public static int field8721;

    @OriginalMember(owner = "client!jk", name = "A", descriptor = "Luw;")
    public class418 field8711;

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "Ljava/lang/String;")
    public String field8710;

    @OriginalMember(owner = "client!jk", name = "D", descriptor = "[I")
    public int[] field8714;

    @OriginalMember(owner = "client!jk", name = "F", descriptor = "[I")
    public int[] field8716;

    @OriginalMember(owner = "client!jk", name = "C", descriptor = "[Leq;")
    public class213[] field8713;

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "[Lea;")
    public static class546[] field8720;

    @OriginalMember(owner = "client!jk", name = "B", descriptor = "[Ljava/lang/String;")
    public String[] field8712;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lro;)V")
    public static final void method3615(class2 arg0) {
        if (class234.field3398 >= 65535) {
            return;
        }
        class669 var1 = arg0.field18;
        class394.field5788[class234.field3398] = arg0;
        class184.field2781[class234.field3398] = false;
        class234.field3398++;
        int var2 = arg0.field4;
        if (arg0.field22) {
            var2 = 0;
        }
        int var3 = arg0.field4;
        if (arg0.field10) {
            var3 = class510.field7094 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method3752((byte) 89) + class72.field1328 - var1.method3758(-1) >> class130.field2185;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method3752((byte) 122) + var1.method3758(-1) - class72.field1328 >> class130.field2185;
            if (var7 >= class432.field6185) {
                var7 = class432.field6185 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field15[var5++];
                int var10 = (var1.method3759(-1) + class72.field1328 - var1.method3758(-1) >> class130.field2185) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class434.field6208) {
                    var11 = class434.field6208 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class582.field7967[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class582.field7967[var4][var12][var8] = var13 | (long) class234.field3398;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class582.field7967[var4][var12][var8] = var13 | (long) class234.field3398 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class582.field7967[var4][var12][var8] = var13 | (long) class234.field3398 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class582.field7967[var4][var12][var8] = var13 | (long) class234.field3398 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "(B)V")
    public static final void method3616(byte arg0) {
        field8718++;
        if (arg0 != -48) {
            method3615(null);
        }
        if (class164.field2589 != null) {
            class164.field2589 = null;
            class633.method3613(class142.field2352, class465.field6522, class157.field2522, 0, class562.field7760);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static void method3617(int arg0) {
        field8707 = null;
        if (arg0 != 1) {
            field8719 = -66;
        }
        field8720 = null;
    }
}
