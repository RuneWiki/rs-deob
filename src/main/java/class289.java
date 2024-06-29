import jaclib.memory.Buffer;
import jaclib.memory.Source;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class289 extends class438 implements class233 {

    @OriginalMember(owner = "client!uia", name = "F", descriptor = "Luw;")
    public static class208 field3690 = new class208(99, 3);

    @OriginalMember(owner = "client!uia", name = "K", descriptor = "[I")
    public static int[] field3695 = new int[13];

    @OriginalMember(owner = "client!uia", name = "L", descriptor = "B")
    private byte field3696;

    @OriginalMember(owner = "client!uia", name = "A", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!uia", name = "B", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!uia", name = "C", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!uia", name = "D", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!uia", name = "E", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!uia", name = "G", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!uia", name = "H", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!uia", name = "I", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!uia", name = "J", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!uia", name = "M", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!uia", name = "N", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(II[BI)Ljava/lang/String;", line = 4)
    public static final String method1750(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field3698;
        char[] var4 = new char[arg1];
        int var5 = 0;
        for (int var6 = 0; ~arg1 < ~var6; ++var6) {
            int var7 = arg2[arg3 + var6] & 255;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class264.field3516[var7 + -128];
                    if (var8 == 0) {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        if (arg0 != -128) {
            field3695 = null;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!uia", name = "c", descriptor = "(I)I", line = 46)
    public final int method1751(int arg0) {
        ++field3686;
        if (arg0 >= -15) {
            this.field3696 = -34;
        }
        return this.field3696;
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(I)Z", line = 58)
    public final boolean method288(int arg0) {
        ++field3693;
        if (arg0 != -12162) {
            this.method286(-83, false);
        }
        return super.method2504(super.field5752.field2446, -1);
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(IBILjaclib/memory/Source;)Z", line = 69)
    public final boolean method285(int arg0, byte arg1, int arg2, Source arg3) {
        this.field3696 = (byte) arg2;
        if (arg1 != 105) {
            return true;
        } else {
            ++field3689;
            super.method2511(24, arg3, arg0);
            return true;
        }
    }

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "(I)I", line = 86)
    public final int method287(int arg0) {
        if (arg0 != 128) {
            return 88;
        } else {
            ++field3688;
            return super.method287(128);
        }
    }

    @OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(Ljc;Z)V", line = 99)
    public class289(class179 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(III)Z", line = 104)
    public final boolean method283(int arg0, int arg1, int arg2) {
        this.field3696 = (byte) arg1;
        ++field3694;
        super.method2016(arg0, arg2 ^ -21085);
        return arg2 == -21048;
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(B)V", line = 120)
    public final void method284(byte arg0) {
        super.method284((byte) 63);
        if (arg0 <= 33) {
            method1750(-104, 19, (byte[]) null, 116);
        }
        ++field3697;
    }

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "(Z)V", line = 132)
    public static void method1752(boolean arg0) {
        field3690 = null;
        field3695 = null;
        if (!arg0) {
            method1754(false);
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;", line = 145)
    public final Buffer method286(int arg0, boolean arg1) {
        if (arg0 != 16561) {
            return null;
        } else {
            ++field3685;
            return super.method2510(arg1, arg0 + -16448, super.field5752.field2446);
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(Luaa;B)V", line = 157)
    public static final void method1753(class391 arg0, byte arg1) {
        if (arg0.field5007 == 5 && arg0.field5128 != -1) {
            class182.method1216(class576.field7320, arg0, (byte) 126);
        }
        ++field3691;
        if (arg1 != 72) {
            field3690 = null;
        }
    }

    @OriginalMember(owner = "client!uia", name = "c", descriptor = "(Z)V", line = 176)
    public static final void method1754(boolean arg0) {
        if (class659.field8608 != null) {
            try {
                class659.field8608.close();
            } catch (IOException var1) {
            }
        }
        if (!arg0) {
            field3690 = null;
        }
        ++field3692;
        class659.field8608 = null;
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(Loq;Ljava/lang/String;ZI)Ltba;", line = 200)
    public static final class339 method1755(class775 arg0, String arg1, boolean arg2, int arg3) {
        ++field3687;
        if (arg3 == 0) {
            return arg0.method4245(arg1, 65535);
        } else if (~arg3 == -2) {
            try {
                class586.method3135(new Object[] { (new URL(class80.field1134.getCodeBase(), arg1)).toString() }, "openjs", class80.field1134, false);
                class339 var4 = new class339();
                var4.field4144 = 1;
                return var4;
            } catch (Throwable var10) {
                class339 var5 = new class339();
                var5.field4144 = 2;
                return var5;
            }
        } else if (~arg3 == -3) {
            try {
                class80.field1134.getAppletContext().showDocument(new URL(class80.field1134.getCodeBase(), arg1), "_blank");
                class339 var6 = new class339();
                var6.field4144 = 1;
                return var6;
            } catch (Exception var11) {
                class339 var7 = new class339();
                var7.field4144 = 2;
                return var7;
            }
        } else if (arg2) {
            return null;
        } else if (arg3 == 3) {
            try {
                class586.method3137(8259, "loggedout", class80.field1134);
            } catch (Throwable var13) {
            }
            try {
                class80.field1134.getAppletContext().showDocument(new URL(class80.field1134.getCodeBase(), arg1), "_top");
                class339 var8 = new class339();
                var8.field4144 = 1;
                return var8;
            } catch (Exception var12) {
                class339 var9 = new class339();
                var9.field4144 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
