import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class8 extends class206 {

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
    public int field109;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "Lwa;")
    public static class75 field106 = class66.method560("<col=ff3000>", false);

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "Lwa;")
    private static class75 field108 = class66.method560("K", false);

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "Lwa;")
    public static class75 field113 = field108;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "Lwa;")
    public static class75 field107 = field108;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILwa;Z)V", line = 4)
    public static final void method40(int arg0, class75 arg1, boolean arg2) {
        class156.field2678++;
        class89.field1470.method87(65280, 106);
        field110++;
        if (!arg2) {
            class89.field1470.method518(101, arg0);
            class89.field1470.method536(-126, arg1.method630(-86));
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I[Lwa;[SIZ)V", line = 18)
    public static final void method41(int arg0, class75[] arg1, short[] arg2, int arg3, boolean arg4) {
        if (arg4) {
            return;
        }
        field105++;
        if (arg0 >= arg3) {
            return;
        }
        int var5 = arg0;
        int var6 = (arg0 + arg3) / 2;
        class75 var7 = arg1[var6];
        arg1[var6] = arg1[arg3];
        arg1[arg3] = var7;
        short var8 = arg2[var6];
        arg2[var6] = arg2[arg3];
        arg2[arg3] = var8;
        for (int var9 = arg0; var9 < arg3; var9++) {
            if (var7 == null || arg1[var9] != null && arg1[var9].method609(-90, var7) < (var9 & 0x1)) {
                class75 var10 = arg1[var9];
                arg1[var9] = arg1[var5];
                arg1[var5] = var10;
                short var11 = arg2[var9];
                arg2[var9] = arg2[var5];
                arg2[var5++] = var11;
            }
        }
        arg1[arg3] = arg1[var5];
        arg1[var5] = var7;
        arg2[arg3] = arg2[var5];
        arg2[var5] = var8;
        method41(arg0, arg1, arg2, var5 - 1, false);
        method41(var5 + 1, arg1, arg2, arg3, false);
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V", line = 73)
    public static void method42(int arg0) {
        field106 = null;
        if (arg0 == -1) {
            field107 = null;
            field113 = null;
            field108 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILwa;)Z", line = 92)
    public static final boolean method43(int arg0, class75 arg1) {
        if (arg0 > -50) {
            field113 = (class75) null;
        }
        field111++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class205.field3472; var2++) {
            if (arg1.method614(class244.field4114[var2], -66)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIBIII)V", line = 120)
    public static final void method44(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field112++;
        if (arg2 >= 11) {
            for (int var6 = arg3; var6 <= arg4; var6++) {
                class150.method1151(7, class63.field1096[var6], arg1, arg0, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V", line = 157)
    public class8() {
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(I)V", line = 159)
    public class8(int arg0) {
        this.field109 = arg0;
    }
}
