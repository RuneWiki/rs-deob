import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class91 {

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "[I")
    private int[] field1634;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field1638 = 0;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Lhn;")
    public static class317 field1635 = new class317(32);

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "Z")
    public static boolean field1639 = false;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field1640 = 0;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Lum;")
    public static class222 field1637;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIII)V", line = 8)
    public static final void method645(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class29.field399 >= arg3 && arg0 >= class60.field931) {
            boolean var6;
            if (arg5 < class200.field3443) {
                arg5 = class200.field3443;
                var6 = false;
            } else if (arg5 > class207.field3623) {
                arg5 = class207.field3623;
                var6 = false;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg4 < class200.field3443) {
                arg4 = class200.field3443;
                var7 = false;
            } else if (class207.field3623 >= arg4) {
                var7 = true;
            } else {
                arg4 = class207.field3623;
                var7 = false;
            }
            if (class60.field931 <= arg3) {
                class114.method780(96, arg5, arg4, arg1, class73.field1117[arg3++]);
            } else {
                arg3 = class60.field931;
            }
            if (arg0 > class29.field399) {
                arg0 = class29.field399;
            } else {
                class114.method780(109, arg5, arg4, arg1, class73.field1117[arg0--]);
            }
            if (var6 && var7) {
                for (int var8 = arg3; var8 <= arg0; var8++) {
                    int[] var9 = class73.field1117[var8];
                    var9[arg5] = var9[arg4] = arg1;
                }
            } else if (var6) {
                for (int var10 = arg3; var10 <= arg0; var10++) {
                    class73.field1117[var10][arg5] = arg1;
                }
            } else if (var7) {
                for (int var11 = arg3; var11 <= arg0; var11++) {
                    class73.field1117[var11][arg4] = arg1;
                }
            }
        }
        field1633++;
        if (arg2 > -68) {
            field1637 = (class222) null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)I", line = 114)
    public final int method646(int arg0, int arg1) {
        int var3 = -88 % ((-arg0 - 33) / 54);
        field1641++;
        int var4 = (this.field1634.length >> 1) - 1;
        int var5 = var4 & arg1;
        while (true) {
            int var6 = this.field1634[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field1634[var5 + var5] == arg1) {
                return var6;
            }
            var5 = var4 & var5 + 1;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 143)
    public static void method647(int arg0) {
        if (arg0 != -1) {
            method645(50, 45, -8, -99, -51, -76);
        }
        field1635 = null;
        field1637 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z[I[Ljava/lang/Object;II)V", line = 162)
    public static final void method648(boolean arg0, int[] arg1, Object[] arg2, int arg3, int arg4) {
        if (arg0) {
            field1638 = 52;
        }
        field1636++;
        if (arg4 <= arg3) {
            return;
        }
        int var5 = (arg3 + arg4) / 2;
        int var6 = arg3;
        int var7 = arg1[var5];
        arg1[var5] = arg1[arg4];
        arg1[arg4] = var7;
        Object var8 = arg2[var5];
        arg2[var5] = arg2[arg4];
        arg2[arg4] = var8;
        for (int var9 = arg3; var9 < arg4; var9++) {
            if (arg1[var9] < ((var9 & 0x1) + var7)) {
                int var10 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6] = var10;
                Object var11 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6++] = var11;
            }
        }
        arg1[arg4] = arg1[var6];
        arg1[var6] = var7;
        arg2[arg4] = arg2[var6];
        arg2[var6] = var8;
        method648(false, arg1, arg2, arg3, var6 - 1);
        method648(false, arg1, arg2, var6 + 1, arg4);
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "([I)V", line = 214)
    public class91(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field1634 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field1634[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field1634[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field1634[var5 + var5] = arg0[var4];
            this.field1634[var5 + var5 + 1] = var4++;
        }
    }
}
