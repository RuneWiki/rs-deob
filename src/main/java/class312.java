import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class312 extends class329 {

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    public int field4011;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    private int field4008;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    private int field4016;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public int field4004;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    private int field4010;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    private int field4013;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public int field4006;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public int field4003;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    private int field4009;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public static int field4005 = -1;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)Lev;")
    public static final class597 method1803(int arg0, int arg1, int arg2) {
        class75 var3 = class270.field3423[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1030;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIZ)Z")
    public final boolean method1804(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return false;
        } else {
            field4017++;
            return arg0 >= this.field4009 && this.field4016 >= arg0 && arg1 >= this.field4008 && this.field4010 >= arg1;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II[IB)V")
    public final void method1805(int arg0, int arg1, int[] arg2, byte arg3) {
        field4019++;
        if (arg3 > -35) {
            method1810('Y', true);
        }
        arg2[1] = arg1 + this.field4009 - this.field4003;
        arg2[2] = this.field4008 + arg0 - this.field4004;
        arg2[0] = this.field4013;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIB)Z")
    public static final boolean method1806(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field4012++;
        if (arg5 >= -29) {
            method1810('\u001f', true);
        }
        for (int var6 = arg1; var6 <= arg0; var6++) {
            for (int var7 = arg2; var7 <= arg4; var7++) {
                if (class644.field9052[var6][var7] == arg3 && class453.field5805[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([IIII)V")
    public final void method1807(int[] arg0, int arg1, int arg2, int arg3) {
        arg0[2] = arg1 - (this.field4008 - this.field4004);
        arg0[1] = this.field4003 + arg2 - this.field4009;
        field4002++;
        arg0[arg3] = 0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIII)Z")
    public final boolean method1808(int arg0, int arg1, int arg2, int arg3) {
        field4015++;
        if (arg1 <= 37) {
            method1810((char) 65422, true);
        }
        return this.field4013 == arg3 && this.field4009 <= arg0 && this.field4016 >= arg0 && arg2 >= this.field4008 && this.field4010 >= arg2;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(III)Z")
    public final boolean method1809(int arg0, int arg1, int arg2) {
        if (arg1 == 7369) {
            field4018++;
            return arg2 >= this.field4003 && arg2 <= this.field4011 && arg0 >= this.field4004 && arg0 <= this.field4006;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class312(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field4011 = arg7;
        this.field4008 = arg2;
        this.field4016 = arg3;
        this.field4004 = arg6;
        this.field4010 = arg4;
        this.field4013 = arg0;
        this.field4006 = arg8;
        this.field4003 = arg5;
        this.field4009 = arg1;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(CZ)C")
    public static final char method1810(char arg0, boolean arg1) {
        field4014++;
        if (arg0 == 'Æ') {
            return 'E';
        }
        if (!arg1) {
            field4005 = 55;
        }
        if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILrj;ILjava/awt/Component;I)Lah;")
    public static final class258 method1811(int arg0, class648 arg1, int arg2, Component arg3, int arg4) {
        field4007++;
        if (class392.field4942 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            if (arg0 != 12869) {
                return null;
            }
            try {
                class258 var5 = (class258) Class.forName("o").getDeclaredConstructor().newInstance();
                var5.field3162 = arg2;
                var5.field3146 = new int[(class382.field4824 ? 2 : 1) * 256];
                var5.method1212(arg3);
                var5.field3163 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field3163 > 16384) {
                    var5.field3163 = 16384;
                }
                var5.method1206(var5.field3163);
                if (class465.field5925 > 0 && class324.field4171 == null) {
                    class324.field4171 = new class250();
                    class324.field4171.field3070 = arg1;
                    arg1.method3626(class465.field5925, class324.field4171, 0);
                }
                if (class324.field4171 != null) {
                    if (class324.field4171.field3073[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class324.field4171.field3073[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class200 var6 = new class200(arg1, arg4);
                    var6.field3162 = arg2;
                    var6.field3146 = new int[(class382.field4824 ? 2 : 1) * 256];
                    var6.method1212(arg3);
                    var6.field3163 = 16384;
                    var6.method1206(var6.field3163);
                    if (class465.field5925 > 0 && class324.field4171 == null) {
                        class324.field4171 = new class250();
                        class324.field4171.field3070 = arg1;
                        arg1.method3626(class465.field5925, class324.field4171, 0);
                    }
                    if (class324.field4171 != null) {
                        if (class324.field4171.field3073[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class324.field4171.field3073[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class258();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
