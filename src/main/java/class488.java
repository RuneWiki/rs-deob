import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eka")
public class class488 {

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "I")
    public int field6899 = 128;

    @OriginalMember(owner = "client!eka", name = "l", descriptor = "I")
    public int field6910 = 128;

    @OriginalMember(owner = "client!eka", name = "c", descriptor = "I")
    public int field6901;

    @OriginalMember(owner = "client!eka", name = "d", descriptor = "I")
    public int field6902;

    @OriginalMember(owner = "client!eka", name = "b", descriptor = "I")
    public int field6900;

    @OriginalMember(owner = "client!eka", name = "j", descriptor = "I")
    public int field6908;

    @OriginalMember(owner = "client!eka", name = "g", descriptor = "I")
    public static int field6905 = 100;

    @OriginalMember(owner = "client!eka", name = "i", descriptor = "I")
    public static int field6907 = 0;

    @OriginalMember(owner = "client!eka", name = "e", descriptor = "I")
    public static int field6903;

    @OriginalMember(owner = "client!eka", name = "f", descriptor = "I")
    public static int field6904;

    @OriginalMember(owner = "client!eka", name = "m", descriptor = "I")
    public static int field6911;

    @OriginalMember(owner = "client!eka", name = "h", descriptor = "Lnt;")
    public static class231 field6906;

    @OriginalMember(owner = "client!eka", name = "k", descriptor = "Z")
    public static boolean field6909;

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(Leka;I)V")
    public final void method2850(class488 arg0, int arg1) {
        this.field6910 = arg0.field6910;
        this.field6908 = arg0.field6908;
        if (arg1 != 20134) {
            return;
        }
        this.field6902 = arg0.field6902;
        this.field6899 = arg0.field6899;
        this.field6900 = arg0.field6900;
        field6904++;
        this.field6901 = arg0.field6901;
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(B)Leka;")
    public final class488 method2851(byte arg0) {
        int var2 = 99 % ((arg0 + 14) / 50);
        field6903++;
        return new class488(this.field6901, this.field6910, this.field6899, this.field6900, this.field6908, this.field6902);
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(I)V")
    public static void method2852(int arg0) {
        if (arg0 == -6408) {
            field6906 = null;
        }
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(IZ)I")
    public static final int method2853(int arg0, boolean arg1) {
        field6911++;
        if (arg1) {
            method2854(16, -124, 16, null, null);
        }
        if (arg0 == 6406) {
            return 1;
        } else if (arg0 == 6409) {
            return 1;
        } else if (arg0 == 32841) {
            return 1;
        } else if (arg0 == 6410) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(IIILjd;Ljd;)V")
    public static final void method2854(int arg0, int arg1, int arg2, class239 arg3, class239 arg4) {
        class379 var5 = class386.method2357(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field5432 = arg3;
        var5.field5444 = arg4;
        int var6 = class622.field8777 == class311.field4628 ? 1 : 0;
        if (!arg3.method254((byte) 104)) {
            arg3.field7714 = class511.field7305[var6];
            class511.field7305[var6] = arg3;
        } else if (arg3.method248((byte) -55)) {
            arg3.field7714 = class110.field1365[var6];
            class110.field1365[var6] = arg3;
        } else {
            arg3.field7714 = class472.field6734[var6];
            class472.field6734[var6] = arg3;
            class432.field6151 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method254((byte) 104)) {
            if (arg4.method248((byte) -55)) {
                arg4.field7714 = class110.field1365[var6];
                class110.field1365[var6] = arg4;
                return;
            }
            arg4.field7714 = class472.field6734[var6];
            class472.field6734[var6] = arg4;
            class432.field6151 = true;
            return;
        }
        arg4.field7714 = class511.field7305[var6];
        class511.field7305[var6] = arg4;
    }

    @OriginalMember(owner = "client!eka", name = "<init>", descriptor = "(I)V")
    public class488(int arg0) {
        this.field6901 = arg0;
    }

    @OriginalMember(owner = "client!eka", name = "<init>", descriptor = "(IIIIII)V")
    private class488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6899 = arg2;
        this.field6902 = arg5;
        this.field6901 = arg0;
        this.field6910 = arg1;
        this.field6900 = arg3;
        this.field6908 = arg4;
    }
}
