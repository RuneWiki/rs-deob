import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class488 {

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "Z")
    public boolean field7079;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
    public static int field7077 = 0;

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "I")
    public static int field7085 = 0;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
    public static int field7076;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "I")
    public static int field7078;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
    public static int field7080;

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
    public static int field7082;

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!ts", name = "k", descriptor = "I")
    public static int field7086;

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "Ltfa;")
    public class31 field7081;

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "Ltfa;")
    public class31 field7087;

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "Z")
    public boolean field7084;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)Z")
    public final boolean method2820(int arg0) {
        field7078++;
        if (arg0 != 25637) {
            this.method2820(61);
        }
        return this.field7084 && !this.field7079;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V")
    public static final void method2821(boolean arg0) {
        if (arg0) {
            class97.field1074 = class631.field8958;
            class628.field8912 = class591.field8415;
        } else {
            class97.field1074 = class678.field9612;
            class628.field8912 = class275.field3477;
        }
        class337.field4416 = class97.field1074.length;
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
    public final void method2822(int arg0) {
        field7080++;
        if (arg0 >= -4) {
            method2823(-122, -95);
        }
        if (this.field7087 != null) {
            this.field7087.method166((byte) -47);
        }
        this.field7084 = false;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)Z")
    public static final boolean method2823(int arg0, int arg1) {
        int var2 = 20 % ((-arg1 - 25) / 43);
        field7082++;
        return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(II)I")
    public static final int method2824(int arg0, int arg1) {
        field7083++;
        if (arg1 != 10807) {
            method2821(false);
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

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lhk;Lqq;Loa;IIBLbv;I)V")
    public static final void method2825(class89 arg0, class434 arg1, class635 arg2, int arg3, int arg4, byte arg5, class276 arg6, int arg7) {
        field7076++;
        int var8 = arg6.field3485 - (arg4 / 2) - 5;
        if (arg5 != -78) {
            return;
        }
        int var9 = arg7 + 2;
        if (arg0.field961 != 0) {
            arg2.method3552(arg1.method2314() * arg3 + (arg7 - var9) + 1, arg4 + 10, 7, arg0.field961, var9, var8);
        }
        if (arg0.field979 != 0) {
            arg2.method3556(var9, (byte) 38, arg0.field979, arg4 + 10, var8, arg1.method2314() * arg3 + arg7 + 1 - var9);
        }
        int var10 = arg0.field952;
        if (arg6.field3486 && arg0.field959 != -1) {
            var10 = arg0.field959;
        }
        for (int var11 = 0; var11 < arg3; var11++) {
            String var12 = class571.field8106[var11];
            if ((arg3 - 1) > var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg1.method2319(arg2, var12, arg6.field3485, arg7, var10, true);
            arg7 += arg1.method2314();
        }
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Z)V")
    public class488(boolean arg0) {
        this.field7079 = arg0;
    }
}
