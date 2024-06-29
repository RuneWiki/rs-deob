import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class174 extends class69 {

    @OriginalMember(owner = "client!np", name = "s", descriptor = "I")
    public int field2203;

    @OriginalMember(owner = "client!np", name = "q", descriptor = "I")
    public int field2201;

    @OriginalMember(owner = "client!np", name = "j", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!np", name = "k", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!np", name = "l", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!np", name = "m", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!np", name = "n", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!np", name = "o", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!np", name = "p", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!np", name = "r", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!np", name = "t", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!np", name = "u", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method1106(int arg0) {
        if (arg0 >= -126) {
            method1111(null, 33, true, 13);
        }
        field2205++;
        return (this.field2201 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(CI)C", line = 19)
    public static final char method1107(char arg0, int arg1) {
        field2198++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg1 != -624489072) {
            return (char) 65422;
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)Z", line = 47)
    public final boolean method1108(int arg0, int arg1) {
        field2196++;
        if (arg0 == -112857776) {
            return (this.field2201 >> arg1 + 1 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lae;Lvt;I)V", line = 64)
    public static final void method1109(class283 arg0, class768 arg1, int arg2) {
        class457.field6388 = arg0;
        class648.field9060 = "";
        field2194++;
        class407.field5733 = arg1;
        if (class528.field7246.startsWith("win")) {
            class648.field9060 = class648.field9060 + "windows/";
        } else if (class528.field7246.startsWith("linux")) {
            class648.field9060 = class648.field9060 + "linux/";
        } else if (class528.field7246.startsWith("mac")) {
            class648.field9060 = class648.field9060 + "macos/";
        }
        if (arg2 < 7) {
            return;
        }
        if (class407.field5733.field10561) {
            class648.field9060 = class648.field9060 + "msjava/";
        } else if (class528.field7252.startsWith("amd64") || class528.field7252.startsWith("x86_64")) {
            class648.field9060 = class648.field9060 + "x86_64/";
        } else if (class528.field7252.startsWith("i386") || class528.field7252.startsWith("i486") || class528.field7252.startsWith("i586") || class528.field7252.startsWith("x86")) {
            class648.field9060 = class648.field9060 + "x86/";
        } else if (class528.field7252.startsWith("ppc")) {
            class648.field9060 = class648.field9060 + "ppc/";
        } else {
            class648.field9060 = class648.field9060 + "universal/";
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(III)Lwc;", line = 113)
    public static final class391 method1110(int arg0, int arg1, int arg2) {
        class472 var3 = class59.field688[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6548;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lul;IZI)Lraa;", line = 122)
    public static final class508 method1111(class486 arg0, int arg1, boolean arg2, int arg3) {
        field2197++;
        int var4 = arg3 << 10 | arg0.field6716;
        class508 var5 = (class508) class194.field2417.method1800(-1, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class540.field7466.method1854(0, class540.field7466.method1841((byte) -104, var4));
        if (var6 == null) {
            if (arg2) {
                return null;
            }
            int var9 = arg0.field6716 | arg1 + 65536 << 10;
            class508 var10 = (class508) class194.field2417.method1800(-1, (long) var9 << 16);
            if (var10 != null) {
                return var10;
            }
            byte[] var11 = class540.field7466.method1854(0, class540.field7466.method1841((byte) -125, var9));
            if (var11 == null) {
                int var14 = arg0.field6716 | 0x3FFFC00;
                class508 var15 = (class508) class194.field2417.method1800(-1, (long) var14 << 16);
                if (var15 != null) {
                    return var15;
                }
                byte[] var16 = class540.field7466.method1854(0, class540.field7466.method1841((byte) -119, var14));
                if (var16 == null) {
                    return null;
                } else if (var16.length <= 1) {
                    return null;
                } else {
                    class508 var17;
                    try {
                        var17 = class35.method282(var16, 0);
                    } catch (Exception var21) {
                        throw new RuntimeException(var21.getMessage() + " S: " + var14);
                    }
                    var17.field6900 = arg0;
                    class194.field2417.method1799(var17, -1, (long) var14 << 16);
                    return var17;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class508 var12;
                try {
                    var12 = class35.method282(var11, 0);
                } catch (Exception var20) {
                    throw new RuntimeException(var20.getMessage() + " S: " + var9);
                }
                var12.field6900 = arg0;
                class194.field2417.method1799(var12, -1, (long) var9 << 16);
                return var12;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class508 var7;
            try {
                var7 = class35.method282(var6, 0);
            } catch (Exception var19) {
                throw new RuntimeException(var19.getMessage() + " S: " + var4);
            }
            var7.field6900 = arg0;
            class194.field2417.method1799(var7, -1, (long) var4 << 16);
            return var7;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)I", line = 204)
    public final int method1112(byte arg0) {
        if (arg0 <= 44) {
            this.field2201 = 127;
        }
        field2200++;
        return class485.method2883(this.field2201, (byte) -101);
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(II)V", line = 214)
    public class174(int arg0, int arg1) {
        this.field2203 = arg1;
        this.field2201 = arg0;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIIIIII)V", line = 224)
    public static final void method1113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 != 115) {
            method1113(70, 20, 77, 58, 50, -99, -58, -79, -89);
        }
        class428.field5974[class752.field10378++] = new class532(arg6, arg5, arg7, arg2, arg2, arg7, arg8, arg0, arg0, arg8, arg4, arg4, arg3, arg3);
        field2195++;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)Z", line = 235)
    public final boolean method1114(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            field2202++;
            return (this.field2201 >> 22 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(I)I", line = 248)
    public final int method1115(int arg0) {
        field2204++;
        if (arg0 != -852618862) {
            this.field2203 = -93;
        }
        return (this.field2201 & 0x1E8893) >> 18;
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(I)Z", line = 259)
    public final boolean method1116(int arg0) {
        field2199++;
        if (arg0 == -18824) {
            return (this.field2201 & 0x1) != 0;
        } else {
            return false;
        }
    }
}
