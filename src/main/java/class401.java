import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class401 extends class45 {

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "S")
    public short field5317;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "Leba;")
    public static class550 field5318 = new class550(97, 3);

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "Lla;")
    public static class409 field5319;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V", line = 4)
    public static final void method2294(byte arg0) {
        int var1 = -107 % ((11 - arg0) / 47);
        class595.field8206.method3063((byte) -19);
        field5316++;
        class516.field7172.method884(-127);
        class53.field693.method884(-127);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V", line = 17)
    public static void method2295(int arg0) {
        field5319 = null;
        if (arg0 != 3) {
            method2294((byte) 122);
        }
        field5318 = null;
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V", line = 32)
    public class401() {
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(S)V", line = 34)
    public class401(short arg0) {
        this.field5317 = arg0;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)V", line = 45)
    public static final void method2296(byte arg0) {
        field5320++;
        if (class475.field6610 < 1024.0F) {
            class475.field6610 = 1024.0F;
        }
        while (class565.field7707 >= 16384.0F) {
            class565.field7707 -= 16384.0F;
        }
        if (class475.field6610 > 3072.0F) {
            class475.field6610 = 3072.0F;
        }
        if (arg0 != 57) {
            return;
        }
        while (class565.field7707 < 0.0F) {
            class565.field7707 += 16384.0F;
        }
        int var1 = class470.field6552 >> 9;
        int var2 = class424.field5715 >> 9;
        int var3 = class180.method1211(class298.field3942, true, class470.field6552, class424.field5715);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && (class703.field9886 - 4) > var1 && var2 < class431.field5789 - 4) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class298.field3942;
                    if (var7 < 3 && class8.method44(var6, var5, arg0 + 15033)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class327.field4403.field1044 != null && class327.field4403.field1044[var7] != null) {
                        var8 = (class327.field4403.field1044[var7][var5][var6] & 0xFF) * 8;
                    }
                    if (class246.field3214 != null && class246.field3214[var7] != null) {
                        int var9 = var8 + var3 - class246.field3214[var7].method1611(var5, true, var6);
                        if (var9 > var4) {
                            var4 = var9;
                        }
                    }
                }
            }
        }
        int var10 = (var4 >> 2) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class288.field3803) {
            class288.field3803 += (var10 - class288.field3803) / 24;
        } else if (var10 < class288.field3803) {
            class288.field3803 += (var10 - class288.field3803) / 80;
            return;
        }
    }
}
