import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class129 {

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field1797 = 0;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field1799 = 0;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field1801 = 2;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "Lh;")
    public static class223 field1794;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "[I")
    public static int[] field1795;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "[Lim;")
    public static class178[] field1800;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([IIIII)V")
    public static final void method822(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        arg1--;
        field1803++;
        if (arg2 != -2426) {
            field1795 = null;
        }
        int var13 = arg4 - 1;
        int var5 = var13 - 7;
        while (arg1 < var5) {
            int var6 = arg1 + 1;
            arg0[var6] = arg3;
            int var7 = var6 + 1;
            arg0[var7] = arg3;
            int var8 = var7 + 1;
            arg0[var8] = arg3;
            int var9 = var8 + 1;
            arg0[var9] = arg3;
            int var10 = var9 + 1;
            arg0[var10] = arg3;
            int var11 = var10 + 1;
            arg0[var11] = arg3;
            int var12 = var11 + 1;
            arg0[var12] = arg3;
            arg1 = var12 + 1;
            arg0[arg1] = arg3;
        }
        while (arg1 < var13) {
            arg1++;
            arg0[arg1] = arg3;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)Lpb;")
    public static final class180 method823(int arg0, int arg1, int arg2) {
        class91 var3 = class246.field3856[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1334;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lwf;")
    public static final class18 method824(Throwable arg0, String arg1) {
        field1802++;
        class18 var2;
        if (arg0 instanceof class18) {
            var2 = (class18) arg0;
            var2.field315 = var2.field315 + ' ' + arg1;
        } else {
            var2 = new class18(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public static void method825(int arg0) {
        field1800 = null;
        field1795 = null;
        field1794 = null;
        if (arg0 != 0) {
            field1797 = -78;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BII)V")
    public static final void method826(byte arg0, int arg1, int arg2) {
        class39 var3 = class149.method935(-122, arg1, 5);
        int var4 = 70 % ((93 - arg0) / 33);
        field1798++;
        var3.method261(0);
        var3.field598 = arg2;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public static final void method827(byte arg0) {
        class70.field1005.method944(arg0 + 22);
        class37.field562.method944(arg0 - 11);
        field1796++;
        class32.field477.method944(-127);
        if (arg0 != 103) {
            method827((byte) -20);
        }
    }
}
