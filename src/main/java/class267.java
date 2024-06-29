import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class267 extends class146 {

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "[Lie;")
    public static class47[] field4276 = new class47[29];

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    public int field4263;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    public int field4265;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    public int field4266;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    public int field4267;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    public int field4268;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
    public int field4269;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
    public int field4270;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "I")
    public int field4271;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
    public int field4272;

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "I")
    public int field4275;

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "I")
    public int field4278;

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "I")
    public int field4280;

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "I")
    public int field4283;

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "I")
    public int field4284;

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "I")
    public int field4285;

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "I")
    public int field4286;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "I")
    public int field4287;

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "Lsb;")
    public static class124 field4282;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "Luk;")
    public class199 field4264;

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "Lff;")
    public class221 field4277;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "Lcb;")
    public class33 field4262;

    @OriginalMember(owner = "client!ri", name = "J", descriptor = "Lbe;")
    public class86 field4281;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;II)V")
    public static final void method1819(String arg0, int arg1, String arg2, String arg3, int arg4, int arg5) {
        for (int var6 = 99; var6 > 0; var6--) {
            class282.field4471[var6] = class282.field4471[var6 - 1];
            class118.field1993[var6] = class118.field1993[var6 - 1];
            class100.field1526[var6] = class100.field1526[var6 - 1];
            class239.field3775[var6] = class239.field3775[var6 - 1];
            class172.field2914[var6] = class172.field2914[var6 - 1];
        }
        class118.field1993[0] = arg3;
        class100.field1526[0] = arg0;
        class152.field2477++;
        class152.field2483 = class61.field1040;
        class239.field3775[0] = arg2;
        class282.field4471[arg4] = arg5;
        field4261++;
        class172.field2914[0] = arg1;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZLjava/lang/String;I)Z")
    public static final boolean method1820(int arg0, boolean arg1, String arg2, int arg3) {
        field4273++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var5 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg3) {
                return false;
            }
            if (var5) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if (var10 / arg3 != var6) {
                return false;
            }
            var6 = var10;
            var4 = true;
        }
        if (arg0 > -40) {
            return true;
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(Z)V")
    public final void method1821(boolean arg0) {
        if (arg0) {
            return;
        }
        this.field4262 = null;
        field4260++;
        this.field4281 = null;
        this.field4264 = null;
        this.field4277 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method1822(int arg0) {
        field4276 = null;
        int var1 = -38 % ((arg0 - 42) / 58);
        field4282 = null;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
    public static final void method1823(int arg0) {
        field4279++;
        class224.field3572.method1156(-84);
        if (arg0 >= -24) {
            field4274 = 37;
        }
    }
}
