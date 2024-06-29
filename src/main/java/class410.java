import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class410 {

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public int field5861;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public int field5858;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public int field5859;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public int field5857;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Lap;")
    public static class335 field5853 = new class335("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!v", name = "e", descriptor = "[I")
    public static int[] field5855 = new int[100];

    @OriginalMember(owner = "client!v", name = "f", descriptor = "Lup;")
    public static class181 field5856 = new class181(14, 7);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V", line = 4)
    public static void method2432(byte arg0) {
        field5856 = null;
        field5855 = null;
        if (arg0 < 83) {
            method2433(null, false, -116, -18);
        }
        field5853 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/String;ZII)I", line = 19)
    public static final int method2433(String arg0, boolean arg1, int arg2, int arg3) {
        field5851++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        if (arg2 != 5565) {
            return 16;
        }
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
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
                throw new NumberFormatException();
            }
            if (var11 >= arg3) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if ((var10 / arg3) != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)Lv;", line = 103)
    public final class410 method2434(int arg0, int arg1) {
        field5852++;
        return arg0 == 8969 ? new class410(this.field5861, arg1, this.field5858, this.field5859) : null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BIIII)V", line = 116)
    public static final void method2435(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field5854++;
        int var5 = -30 % ((arg0 + 7) / 56);
        for (int var6 = 0; var6 < class65.field840; var6++) {
            Rectangle var7 = class463.field6651[var6];
            if (arg1 < (var7.x + var7.width) && (arg1 + arg2) > var7.x && arg4 < var7.y + var7.height && var7.y < arg3 + arg4) {
                class324.field4108[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)V", line = 147)
    public static final void method2436(int arg0, int arg1) {
        if (arg0 != 57) {
            return;
        }
        field5860++;
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        class198.field2587 = arg1;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(IIII)V", line = 164)
    public class410(int arg0, int arg1, int arg2, int arg3) {
        this.field5861 = arg0;
        this.field5858 = arg2;
        this.field5859 = arg3;
        this.field5857 = arg1;
    }
}
