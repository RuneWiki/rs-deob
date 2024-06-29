import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class614 extends class471 {

    @OriginalMember(owner = "client!ica", name = "l", descriptor = "I")
    public static int field8830;

    @OriginalMember(owner = "client!ica", name = "m", descriptor = "I")
    public static int field8831;

    @OriginalMember(owner = "client!ica", name = "n", descriptor = "I")
    public int field8832;

    @OriginalMember(owner = "client!ica", name = "o", descriptor = "I")
    public static int field8833;

    @OriginalMember(owner = "client!ica", name = "p", descriptor = "I")
    public static int field8834;

    @OriginalMember(owner = "client!ica", name = "q", descriptor = "I")
    public int field8835;

    @OriginalMember(owner = "client!ica", name = "r", descriptor = "I")
    public static int field8836;

    @OriginalMember(owner = "client!ica", name = "s", descriptor = "I")
    public int field8837;

    @OriginalMember(owner = "client!ica", name = "t", descriptor = "I")
    public static int field8838;

    @OriginalMember(owner = "client!ica", name = "u", descriptor = "I")
    public static int field8839;

    @OriginalMember(owner = "client!ica", name = "v", descriptor = "I")
    public int field8840;

    @OriginalMember(owner = "client!ica", name = "w", descriptor = "I")
    public static int field8841;

    @OriginalMember(owner = "client!ica", name = "x", descriptor = "I")
    public static int field8842;

    @OriginalMember(owner = "client!ica", name = "z", descriptor = "I")
    public static int field8844;

    @OriginalMember(owner = "client!ica", name = "A", descriptor = "I")
    public static int field8845;

    @OriginalMember(owner = "client!ica", name = "B", descriptor = "I")
    public static int field8846;

    @OriginalMember(owner = "client!ica", name = "y", descriptor = "J")
    public long field8843;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3523(int arg0) {
        for (class58 var1 = (class58) class148.field1822.method1132((byte) 99); var1 != null; var1 = (class58) class148.field1822.method1134(8446)) {
            if (var1.field909) {
                var1.method588(112);
            }
        }
        field8833++;
        for (class58 var2 = (class58) class188.field2301.method1132((byte) -93); var2 != null; var2 = (class58) class188.field2301.method1134(arg0 + 8446)) {
            if (var2.field909) {
                var2.method588(arg0 + 104);
            }
        }
        if (arg0 != 0) {
            method3527(-119, -66, -82, 99, 90, -128, 123, 113, 122);
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Z)J", line = 40)
    public final long method1731(boolean arg0) {
        field8845++;
        if (!arg0) {
            this.field8843 = 121L;
        }
        return this.field8843;
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(I)V", line = 51)
    public static final void method3524(int arg0) {
        if (arg0 == 0) {
            if (class517.field7570.field3404 && class562.field8111.field4476 != -1) {
                class426.method2565(class562.field8111.field4476, true, class562.field8111.field4480);
            }
            field8836++;
        }
    }

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "(Z)I", line = 67)
    public final int method1730(boolean arg0) {
        if (!arg0) {
            field8846 = -18;
        }
        field8831++;
        return this.field8832;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(II)Lkb;", line = 81)
    public static final class640 method3525(int arg0, int arg1) {
        field8842++;
        if (arg0 != -32452) {
            field8846 = 18;
        }
        if (arg1 == 0) {
            if ((double) class550.field7984 == 3.0D) {
                return class287.field3876;
            }
            if ((double) class550.field7984 == 4.0D) {
                return class473.field6605;
            }
            if ((double) class550.field7984 == 6.0D) {
                return class318.field4207;
            }
            if ((double) class550.field7984 >= 8.0D) {
                return class561.field8108;
            }
        } else if (arg1 == 1) {
            if ((double) class550.field7984 == 3.0D) {
                return class318.field4207;
            }
            if ((double) class550.field7984 == 4.0D) {
                return class561.field8108;
            }
            if ((double) class550.field7984 == 6.0D) {
                return class74.field1108;
            }
            if ((double) class550.field7984 >= 8.0D) {
                return class630.field9049;
            }
        } else if (arg1 == 2) {
            if ((double) class550.field7984 == 3.0D) {
                return class74.field1108;
            }
            if ((double) class550.field7984 == 4.0D) {
                return class630.field9049;
            }
            if ((double) class550.field7984 == 6.0D) {
                return class630.field9050;
            }
            if ((double) class550.field7984 >= 8.0D) {
                return class571.field8343;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(Z)I", line = 150)
    public final int method1729(boolean arg0) {
        if (arg0) {
            field8846 = 33;
        }
        field8830++;
        return this.field8840;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIZ)Z", line = 166)
    public static final boolean method3526(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field8846 = -62;
        }
        field8841++;
        return (arg1 & 0x70000) != 0 | class7.method42(0, arg0, arg1) || class436.method2611(arg1, arg0, 65535);
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIIIIIII)V", line = 177)
    public static final void method3527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg6 != 0) {
            method3526(-29, 98, false);
        }
        class147.field1801[class516.field7558++] = new class568(arg7, arg2, arg1, arg5, arg5, arg1, arg4, arg8, arg8, arg4, arg3, arg3, arg0, arg0);
        field8834++;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(ILun;)Lmba;", line = 188)
    public static final class386 method3528(int arg0, class389 arg1) {
        arg1.method2229(255);
        field8839++;
        int var2 = arg1.method2229(255);
        class386 var3 = class622.method3562(73, var2);
        var3.field5132 = arg1.method2229(255);
        int var4 = arg1.method2229(255);
        int var5 = 54 % ((arg0 - 53) / 41);
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = arg1.method2229(255);
            var3.method355(var7, (byte) 127, arg1);
        }
        var3.method358(78);
        return var3;
    }

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "(B)I", line = 225)
    public final int method1733(byte arg0) {
        if (arg0 <= 66) {
            return 69;
        } else {
            field8844++;
            return this.field8835;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)I", line = 236)
    public final int method1732(byte arg0) {
        if (arg0 != 88) {
            this.method1732((byte) -87);
        }
        field8838++;
        return this.field8837;
    }
}
