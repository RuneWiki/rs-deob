import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class39 extends class169 {

    @OriginalMember(owner = "client!bt", name = "D", descriptor = "Ljava/lang/Object;")
    private Object field295;

    @OriginalMember(owner = "client!bt", name = "G", descriptor = "Lvj;")
    public static class373 field298 = new class373(30, 7);

    @OriginalMember(owner = "client!bt", name = "I", descriptor = "Lvj;")
    public static class373 field300 = new class373(72, 6);

    @OriginalMember(owner = "client!bt", name = "E", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!bt", name = "F", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!bt", name = "J", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!bt", name = "L", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!bt", name = "H", descriptor = "Ldn;")
    public static class438 field299;

    @OriginalMember(owner = "client!bt", name = "K", descriptor = "[I")
    public static int[] field302;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;BZI)Z", line = 8)
    public static final boolean method207(String arg0, byte arg1, boolean arg2, int arg3) {
        field296++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        int var5 = 34 % ((arg1 - 70) / 33);
        boolean var6 = false;
        int var7 = 0;
        int var8 = arg0.length();
        for (int var9 = 0; var9 < var8; var9++) {
            char var10 = arg0.charAt(var9);
            if (var9 == 0) {
                if (var10 == '-') {
                    var4 = true;
                    continue;
                }
                if (var10 == '+' && arg2) {
                    continue;
                }
            }
            int var12;
            if (var10 >= '0' && var10 <= '9') {
                var12 = var10 - '0';
            } else if (var10 >= 'A' && var10 <= 'Z') {
                var12 = var10 - '7';
            } else if (var10 >= 'a' && var10 <= 'z') {
                var12 = var10 - 'W';
            } else {
                return false;
            }
            if (arg3 <= var12) {
                return false;
            }
            if (var4) {
                var12 = -var12;
            }
            int var11 = arg3 * var7 + var12;
            if (var11 / arg3 != var7) {
                return false;
            }
            var7 = var11;
            var6 = true;
        }
        return var6;
    }

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "(I)V", line = 85)
    public static void method208(int arg0) {
        field298 = null;
        int var1 = -114 % ((-arg0 - 43) / 48);
        field302 = null;
        field299 = null;
        field300 = null;
    }

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 100)
    public final Object method43(int arg0) {
        field297++;
        if (arg0 != -401) {
            field303 = 91;
        }
        return this.field295;
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)Z", line = 111)
    public final boolean method44(int arg0) {
        field301++;
        if (arg0 > -16) {
            field300 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Lada;Ljava/lang/Object;I)V", line = 122)
    public class39(class142 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field295 = arg1;
    }
}
