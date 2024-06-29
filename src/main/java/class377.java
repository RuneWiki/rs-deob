import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class class377 extends class117 {

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "Lqj;")
    public static class352 field5624;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "(I)V")
    public static void method2395(int arg0) {
        if (arg0 != 3358) {
            field5624 = null;
        }
        field5624 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BILqf;)Z")
    public static final boolean method2396(byte arg0, int arg1, class477 arg2) {
        field5627++;
        int var3 = arg2.method2847(110, 2);
        if (var3 == 0) {
            if (arg2.method2847(-44, 1) != 0) {
                method2396((byte) -89, arg1, arg2);
            }
            int var4 = arg2.method2847(126, 6);
            int var5 = arg2.method2847(108, 6);
            boolean var6 = arg2.method2847(119, 1) == 1;
            if (var6) {
                class515.field7572[class165.field2467++] = arg1;
            }
            if (class390.field5783[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class417 var7 = class518.field7618[arg1];
            class62 var8 = class390.field5783[arg1] = new class62();
            var8.field331 = arg1;
            if (class253.field3640[arg1] != null) {
                var8.method558(false, class253.field3640[arg1]);
            }
            var8.method186(15505, var7.field6160);
            var8.field355 = var7.field6158;
            int var9 = var7.field6166;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            int var12 = var9 & 0xFF;
            var8.field1102 = var7.field6162;
            var8.field413[0] = class133.field2063[arg1];
            var8.field5538 = (byte) var10;
            var8.method552(0, (var11 << 6) + var4 - class483.field7082, (var12 << 6) + var5 + -class465.field6840);
            var8.field1066 = false;
            class518.field7618[arg1] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg2.method2847(10, 2);
            int var14 = class518.field7618[arg1].field6166;
            class518.field7618[arg1].field6166 = ((var14 >> 28) + var13 & 0x3 << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg2.method2847(arg0 + 8, 5);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class518.field7618[arg1].field6166;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = (var18 & 0x3FD35E) >> 14;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var21--;
                var20--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var20++;
                var21--;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var21++;
                var20--;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var21++;
                var20++;
            }
            class518.field7618[arg1].field6166 = (var19 << 28) + ((var20 << 14) + var21);
            return false;
        } else {
            int var22 = arg2.method2847(-74, 18);
            int var23 = var22 >> 16;
            int var24 = (var22 & 0xFFA0) >> 8;
            if (arg0 != -89) {
                return true;
            }
            int var25 = var22 & 0xFF;
            int var26 = class518.field7618[arg1].field6166;
            int var27 = (var26 >> 28) + var23 & 0x3;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var26 + var25 & 0xFF;
            class518.field7618[arg1].field6166 = (var27 << 28) + var29 + (var28 << 14);
            return false;
        }
    }

    @OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V")
    public static final void method2397(int arg0) {
        field5626++;
        if (arg0 != -21986) {
            field5624 = null;
        }
        if (!class253.method1611((byte) -127)) {
            return;
        }
        if (class82.field1358 == null) {
            class256.method1625(false);
        }
        class151.field2320 = true;
        class134.field2069 = 0;
        try {
            class107.field1671 = class238.field3446.getToolkit().getSystemClipboard();
        } catch (Exception var1) {
        }
    }
}
