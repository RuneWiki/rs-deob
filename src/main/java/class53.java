import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class53 extends class161 {

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "Lp;")
    public static class280 field867 = class18.method140((byte) -128, ":chalreq:");

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    public static volatile int field874 = 0;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "Lp;")
    public static class280 field875 = class18.method140((byte) -127, ")2");

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "F")
    public static float field866;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "J")
    public long field865;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Lkb;")
    public class53 field864;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "Lkb;")
    public class53 field873;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)V")
    public static final void method388(byte arg0, int arg1) {
        field870++;
        if (!class48.method356(-664, arg1)) {
            return;
        }
        class113[] var2 = class251.field4394[arg1];
        int var3 = -83 / ((arg0 + 69) / 55);
        for (int var4 = 0; var4 < var2.length; var4++) {
            class113 var5 = var2[var4];
            if (var5 != null) {
                var5.field1884 = 0;
                var5.field1912 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIZIII)V")
    public static final void method389(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field872++;
        int var9 = arg8 - arg4;
        int var10 = arg2 - arg1;
        int var11 = (arg7 - arg6 << 16) / var10;
        int var12 = (arg0 - arg3 << 16) / var9;
        if (arg5) {
            field866 = 0.2135974F;
        }
        class96.method673(arg8, arg4, var11, 0, var12, arg6, arg2, 0, arg1, (byte) 115, arg3);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method390(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class3.field98[arg0][var8][var14] == -class183.field3221) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class145.field2529[arg0][arg1][arg3] + arg5;
            if (!class269.method1804(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class269.method1804(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class269.method1804(var9, var11, var13)) {
                return false;
            } else if (class269.method1804(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class89.method637(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class269.method1804(var6 + 1, class145.field2529[arg0][arg1][arg3] + arg5, var7 + 1) && class269.method1804(var6 + 128 - 1, class145.field2529[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class269.method1804(var6 + 128 - 1, class145.field2529[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class269.method1804(var6 + 1, class145.field2529[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBILtg;)[Leg;")
    public static final class223[] method391(int arg0, byte arg1, int arg2, class180 arg3) {
        if (arg1 != 3) {
            field875 = null;
        }
        field868++;
        return class90.method648(arg0, arg2, arg3, -41) ? class136.method934(true) : null;
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
    public final void method392(int arg0) {
        field869++;
        if (this.field873 == null) {
            return;
        }
        this.field873.field864 = this.field864;
        this.field864.field873 = this.field873;
        this.field873 = null;
        if (arg0 != 1) {
            this.field864 = null;
        }
        this.field864 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static void method393(byte arg0) {
        if (arg0 < 34) {
            field874 = -69;
        }
        field867 = null;
        field875 = null;
    }
}
