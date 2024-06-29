import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class501 extends class361 {

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    public int field7113 = (int) (class524.method3075(18) / 1000L);

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "Ljava/lang/String;")
    public String field7118;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "S")
    public short field7114;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "Lqe;")
    public static class469 field7117 = new class469(48, -1);

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "Z")
    public static boolean field7119 = false;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "[Ljava/lang/String;")
    public static String[] field7120 = new String[100];

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
    public static int field7121 = -1;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "I")
    public static int field7123;

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "J")
    public static long field7122;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)V", line = 3)
    public static void method2978(int arg0) {
        int var1 = 41 / ((arg0 + 78) / 35);
        field7120 = null;
        field7117 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljo;ZIIILvd;I)V", line = 15)
    public static final void method2979(class336 arg0, boolean arg1, int arg2, int arg3, int arg4, class39 arg5, int arg6) {
        class187.method1308(arg6, arg5, arg3, arg1, arg2, 0);
        field7115++;
        if (arg4 != 29756) {
            field7119 = false;
        }
        class2.field18 = arg0;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)Z", line = 29)
    public static final boolean method2980(int arg0, int arg1, int arg2) {
        field7116++;
        if (arg0 == 6790) {
            return class612.method3545((byte) -96, arg1, arg2) || class33.method163(arg2, arg1, 544);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lds;)V", line = 40)
    public static final void method2981(class14 arg0) {
        if (class625.field8752 >= 65535) {
            return;
        }
        class609 var1 = arg0.field199;
        class234.field3410[class625.field8752] = arg0;
        class313.field4428[class625.field8752] = false;
        class625.field8752++;
        int var2 = arg0.field184;
        if (arg0.field195) {
            var2 = 0;
        }
        int var3 = arg0.field184;
        if (arg0.field187) {
            var3 = class409.field6165 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method3531(20597) + class631.field8819 - var1.method3537(6490) >> class459.field6769;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method3531(20597) + var1.method3537(6490) - class631.field8819 >> class459.field6769;
            if (var7 >= class565.field8040) {
                var7 = class565.field8040 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field189[var5++];
                int var10 = (var1.method3533(false) + class631.field8819 - var1.method3537(6490) >> class459.field6769) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class34.field356) {
                    var11 = class34.field356 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class146.field1947[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class146.field1947[var4][var12][var8] = var13 | (long) class625.field8752;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class146.field1947[var4][var12][var8] = var13 | (long) class625.field8752 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class146.field1947[var4][var12][var8] = var13 | (long) class625.field8752 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class146.field1947[var4][var12][var8] = var13 | (long) class625.field8752 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 133)
    public class501(String arg0, int arg1) {
        this.field7118 = arg0;
        this.field7114 = (short) arg1;
    }
}
