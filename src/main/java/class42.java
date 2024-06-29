import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class42 {

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public int field494 = -1;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field486 = -1;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "Ljc;")
    public static class374 field491 = new class374();

    @OriginalMember(owner = "client!na", name = "c", descriptor = "F")
    public static float field488;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Lod;")
    public class433 field489;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "[I")
    public int[] field492;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "[Ljava/lang/String;")
    public String[] field487;

    static {
        new class572(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BIIIZ)V", line = 5)
    public static final void method269(byte arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 < 70) {
            field488 = -0.19569997F;
        }
        field490++;
        if (class526.field7533 == 0) {
            class536.method3246(false, 9057);
        } else {
            class514.field7338 = class526.field7533;
            class430.method2521(0, -2);
        }
        class505.field7143 = arg2;
        class441.field5884 = arg1;
        class132.field1820 = arg4;
        class339.method2082(arg3);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 31)
    public static final long method270(String arg0, int arg1) {
        field493++;
        long var2 = 0L;
        int var4 = arg0.length();
        int var5 = 0;
        if (arg1 < 38) {
            method270(null, 12);
        }
        while (var4 > var5) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 - 64);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 - 21);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
            var5++;
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V", line = 81)
    public static void method271(byte arg0) {
        if (arg0 == -55) {
            field491 = null;
        }
    }
}
