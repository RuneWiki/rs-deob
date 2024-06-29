import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class697 extends class461 {

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
    private int field9785;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
    private int field9779;

    @OriginalMember(owner = "client!pn", name = "t", descriptor = "I")
    private int field9791;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    private int field9782;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
    private int field9780;

    @OriginalMember(owner = "client!pn", name = "s", descriptor = "I")
    private int field9790;

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "I")
    private int field9787;

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
    private int field9783;

    @OriginalMember(owner = "client!pn", name = "u", descriptor = "I")
    public static int field9792 = 1337;

    @OriginalMember(owner = "client!pn", name = "v", descriptor = "Lgj;")
    public static class593 field9793 = new class593();

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public static int field9777;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    public static int field9778;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    public static int field9781;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
    public static int field9784;

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "I")
    public static int field9788;

    @OriginalMember(owner = "client!pn", name = "r", descriptor = "I")
    public static int field9789;

    @OriginalMember(owner = "client!pn", name = "w", descriptor = "I")
    public static int field9794;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "Lkca;")
    public static class76 field9786;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IC)Z")
    public static final boolean method3858(int arg0, char arg1) {
        ++field9784;
        if (arg0 != 8212) {
            method3860((class449) null, (byte) 79, (class519) null);
        }
        if (arg1 >= ' ' && ~arg1 >= -127) {
            return true;
        } else if (arg1 >= 160 && arg1 <= 255) {
            return true;
        } else {
            return ~arg1 == -8365 || ~arg1 == -339 || arg1 == 8212 || ~arg1 == -340 || ~arg1 == -377;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BZ)C")
    public static final char method3859(byte arg0, boolean arg1) {
        if (arg1) {
            method3858(-67, (char) 65456);
        }
        ++field9794;
        int var2 = 255 & arg0;
        if (~var2 == -1) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (~var2 <= -129 && var2 < 160) {
                char var3 = class104.field1562[var2 + -128];
                if (~var3 == -1) {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) var2;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)V")
    public final void method703(int arg0, int arg1, int arg2) {
        if (arg1 >= -88) {
            field9777 = 33;
        }
        ++field9781;
        int var4 = this.field9780 * arg2 >> 12;
        int var5 = this.field9790 * arg0 >> 12;
        int var6 = this.field9783 * arg2 >> 12;
        int var7 = this.field9787 * arg0 >> 12;
        int var8 = this.field9782 * arg2 >> 12;
        int var9 = this.field9779 * arg0 >> 12;
        int var10 = this.field9785 * arg2 >> 12;
        int var11 = this.field9791 * arg0 >> 12;
        class122.method949(var8, var11, super.field6248, var5, var6, var4, var10, var9, 3314, var7);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lbi;BLii;)V")
    public static final void method3860(class449 arg0, byte arg1, class519 arg2) {
        ++field9788;
        class166.field2585 = "";
        if (arg1 == 28) {
            class103.field1540 = arg0;
            class318.field4367 = arg2;
            if (class360.field4864.startsWith("win")) {
                class166.field2585 = class166.field2585 + "windows/";
            } else if (class360.field4864.startsWith("linux")) {
                class166.field2585 = class166.field2585 + "linux/";
            } else if (class360.field4864.startsWith("mac")) {
                class166.field2585 = class166.field2585 + "macos/";
            }
            if (!class318.field4367.field6917) {
                if (!class360.field4867.startsWith("amd64") && !class360.field4867.startsWith("x86_64")) {
                    if (!class360.field4867.startsWith("i386") && !class360.field4867.startsWith("i486") && !class360.field4867.startsWith("i586") && !class360.field4867.startsWith("x86")) {
                        if (!class360.field4867.startsWith("ppc")) {
                            class166.field2585 = class166.field2585 + "universal/";
                        } else {
                            class166.field2585 = class166.field2585 + "ppc/";
                        }
                    } else {
                        class166.field2585 = class166.field2585 + "x86/";
                    }
                } else {
                    class166.field2585 = class166.field2585 + "x86_64/";
                }
            } else {
                class166.field2585 = class166.field2585 + "msjava/";
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class697(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field9785 = arg6;
        this.field9779 = arg5;
        this.field9791 = arg7;
        this.field9782 = arg4;
        this.field9780 = arg0;
        this.field9790 = arg1;
        this.field9787 = arg3;
        this.field9783 = arg2;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIB)V")
    public final void method705(int arg0, int arg1, byte arg2) {
        ++field9778;
        if (arg2 != -56) {
            method3861(true);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BII)V")
    public final void method704(byte arg0, int arg1, int arg2) {
        ++field9789;
        if (arg0 <= 79) {
            field9792 = 5;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)V")
    public static void method3861(boolean arg0) {
        field9793 = null;
        if (!arg0) {
            field9792 = -55;
        }
        field9786 = null;
    }
}
