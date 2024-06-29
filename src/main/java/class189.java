import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class189 extends class4 {

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "[Z")
    public static boolean[] field3697 = new boolean[5];

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "Lkb;")
    public static class93 field3695 = class76.method390(":duelfriend:", 0);

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "I")
    public static int field3696 = 0;

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "Lkb;")
    public static class93 field3703 = class76.method390(":assist:", 0);

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "I")
    public int field3699;

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "I")
    public int field3702;

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILkb;ILkb;)V")
    public static final void method1223(int arg0, class93 arg1, int arg2, class93 arg3) {
        field3701++;
        class201.method1315(arg0, arg1, arg3, null, 99);
        if (arg2 != 2249) {
            method1224(-21);
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
    public static void method1224(int arg0) {
        field3695 = null;
        if (arg0 == -1) {
            field3697 = null;
            field3703 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(Z)Lfd;")
    public final class52 method21(boolean arg0) {
        field3698++;
        return arg0 ? null : class166.method1126(-92, this.field3702).method1121(null, this.field3699, -104, 0);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IB)V")
    public static final void method1225(int arg0, byte arg1) {
        field3705++;
        if (class67.method352(2, arg0)) {
            int var2 = 19 % ((arg1 + 26) / 60);
            class102.method568(class28.field460[arg0], -1, 0);
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(IIII)I")
    public static final int method1226(int arg0, int arg1, int arg2, int arg3) {
        field3704++;
        int var4 = arg2 >> 7;
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg2 & 0x7F;
        int var8 = arg3;
        if (arg3 < 3 && (class136.field2637[1][var4][var5] & 0x2) == 2) {
            var8 = arg3 + 1;
        }
        int var9 = (128 - var7) * class151.field2935[var8][var4][var5] + class151.field2935[var8][var4 + 1][var5] * var7 >> 7;
        int var10 = (128 - var7) * class151.field2935[var8][var4][var5 - arg1] + class151.field2935[var8][var4 + 1][var5 + 1] * var7 >> 7;
        return (128 - var6) * var9 + var6 * var10 >> 7;
    }
}
