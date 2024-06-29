import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class276 {

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Lao;")
    public static class191 field3675 = new class191(41, 3);

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Lao;")
    public static class191 field3676 = new class191(52, 8);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 3)
    public static final int method1677(String arg0, boolean arg1) {
        field3672++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) - (var3 - class291.method1754(arg0.charAt(var4), 24391));
        }
        if (!arg1) {
            method1677(null, true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Loj;IIBIZI)V", line = 28)
    public static final void method1678(class260 arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5, int arg6) {
        field3674++;
        if (class347.field4621 >= 50 || arg0 == null || arg0.field3481 == null || arg0.field3481.length <= arg6 || arg0.field3481[arg6] == null) {
            return;
        }
        int var7 = arg0.field3481[arg6][0];
        int var8 = var7 >> 8;
        int var9 = var7 >> 5 & 0x7;
        if (arg3 <= 64) {
            field3675 = null;
        }
        int var10 = var7 & 0x1F;
        if (arg0.field3481[arg6].length > 1) {
            int var11 = (int) (Math.random() * (double) arg0.field3481[arg6].length);
            if (var11 > 0) {
                var8 = arg0.field3481[arg6][var11];
            }
        }
        if (var10 == 0) {
            if (arg5) {
                class379.method2313(89, 255, var9, 0, var8);
            }
        } else if (class319.field4256.field4650 != 0) {
            int var12 = arg2 - 64 >> 7;
            int var13 = arg4 - 64 >> 7;
            class40.field429[class347.field4621++] = new class282((byte) 1, var8, var9, 0, 255, (var13 << 8) + ((arg1 << 24) + (var12 << 16)) + var10);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 86)
    public static void method1679(int arg0) {
        field3675 = null;
        if (arg0 >= -37) {
            field3675 = null;
        }
        field3676 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V", line = 97)
    public static final void method1680(int arg0, int arg1) {
        if (arg1 != 17162) {
            field3676 = null;
        }
        field3673++;
        class184 var2 = class277.method1682(arg0, 4, -66);
        var2.method1075((byte) 105);
    }
}
