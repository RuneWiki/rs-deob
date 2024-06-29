import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class652 {

    @OriginalMember(owner = "client!lha", name = "e", descriptor = "Lem;")
    private class239 field9030 = new class239();

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "Ljava/lang/String;")
    public String field9026;

    @OriginalMember(owner = "client!lha", name = "d", descriptor = "I")
    public static int field9029 = 0;

    @OriginalMember(owner = "client!lha", name = "h", descriptor = "Lkh;")
    public static class17 field9033 = null;

    @OriginalMember(owner = "client!lha", name = "i", descriptor = "I")
    public static int field9034 = 0;

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "I")
    public static int field9027;

    @OriginalMember(owner = "client!lha", name = "f", descriptor = "I")
    public static int field9031;

    @OriginalMember(owner = "client!lha", name = "g", descriptor = "I")
    public static int field9032;

    @OriginalMember(owner = "client!lha", name = "j", descriptor = "I")
    public static int field9035;

    @OriginalMember(owner = "client!lha", name = "k", descriptor = "I")
    public static int field9036;

    @OriginalMember(owner = "client!lha", name = "l", descriptor = "I")
    public static int field9037;

    @OriginalMember(owner = "client!lha", name = "m", descriptor = "I")
    public static int field9038;

    @OriginalMember(owner = "client!lha", name = "n", descriptor = "I")
    public static int field9039;

    @OriginalMember(owner = "client!lha", name = "o", descriptor = "I")
    private volatile int field9040;

    @OriginalMember(owner = "client!lha", name = "p", descriptor = "I")
    public static int field9041;

    @OriginalMember(owner = "client!lha", name = "q", descriptor = "I")
    public static int field9042;

    @OriginalMember(owner = "client!lha", name = "r", descriptor = "Lwl;")
    private class432 field9043;

    @OriginalMember(owner = "client!lha", name = "c", descriptor = "[I")
    public static int[] field9028;

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(IIIII)Z", line = 3)
    public static final boolean method3654(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9035++;
        if ((class554.field7832[0][arg1][arg2] & 0x2) != 0) {
            return true;
        } else if ((class554.field7832[arg3][arg1][arg2] & 0x10) != 0) {
            return false;
        } else if (arg4 == class597.method3399(arg2, arg1, arg3, (byte) -110)) {
            return true;
        } else {
            if (arg0 != 18334) {
                field9029 = -24;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lgj;Llu;Z)V", line = 25)
    public static final void method3655(class662 arg0, class742 arg1, boolean arg2) {
        class120.field2187 = arg0;
        field9037++;
        class322.field4420 = arg1;
        if (!arg2) {
            return;
        }
        class593.field8327 = "";
        if (class384.field5205.startsWith("win")) {
            class593.field8327 = class593.field8327 + "windows/";
        } else if (class384.field5205.startsWith("linux")) {
            class593.field8327 = class593.field8327 + "linux/";
        } else if (class384.field5205.startsWith("mac")) {
            class593.field8327 = class593.field8327 + "macos/";
        }
        if (class322.field4420.field10253) {
            class593.field8327 = class593.field8327 + "msjava/";
        } else if (class384.field5206.startsWith("amd64") || class384.field5206.startsWith("x86_64")) {
            class593.field8327 = class593.field8327 + "x86_64/";
        } else if (class384.field5206.startsWith("i386") || class384.field5206.startsWith("i486") || class384.field5206.startsWith("i586") || class384.field5206.startsWith("x86")) {
            class593.field8327 = class593.field8327 + "x86/";
        } else if (class384.field5206.startsWith("ppc")) {
            class593.field8327 = class593.field8327 + "ppc/";
        } else {
            class593.field8327 = class593.field8327 + "universal/";
        }
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(I)V", line = 75)
    public static void method3656(int arg0) {
        field9028 = null;
        field9033 = null;
        if (arg0 != 19637) {
            field9028 = null;
        }
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(ILvi;)V", line = 88)
    public final void method3657(int arg0, class567 arg1) {
        class239 var3 = this.field9030;
        synchronized (this.field9030) {
            if (arg0 != 0) {
                this.field9043 = null;
            }
            this.field9030.method1600(arg1, arg0 - 3);
            this.field9040++;
        }
        field9027++;
        if (this.field9043 != null) {
            class432 var4 = this.field9043;
            synchronized (this.field9043) {
                this.field9043.notify();
            }
        }
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(B)Lwaa;", line = 114)
    public static final class732 method3658(byte arg0) {
        class262.field3684 = 0;
        if (arg0 != -50) {
            field9033 = null;
        }
        field9036++;
        return class210.method1473(arg0 ^ 0x6B);
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(ILwl;)V", line = 129)
    public final void method3659(int arg0, class432 arg1) {
        if (arg0 != 0) {
            field9028 = null;
        }
        this.field9043 = arg1;
        field9038++;
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(ILcn;)V", line = 140)
    public final void method3660(int arg0, class543 arg1) {
        field9031++;
        arg1.field7401 = false;
        class239 var3 = this.field9030;
        synchronized (this.field9030) {
            this.field9030.method1600(arg1, -3);
            this.field9040++;
        }
        if (this.field9043 != null) {
            class432 var4 = this.field9043;
            synchronized (this.field9043) {
                this.field9043.notify();
            }
        }
        if (arg0 <= 82) {
            field9029 = -89;
        }
    }

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "(ILcn;)V", line = 164)
    public final void method3661(int arg0, class543 arg1) {
        if (arg0 != 11) {
            method3654(76, -42, -128, 33, -106);
        }
        field9032++;
        arg1.field7401 = true;
        class239 var3 = this.field9030;
        synchronized (this.field9030) {
            this.field9030.method1600(arg1, -3);
            this.field9040++;
        }
        if (this.field9043 != null) {
            class432 var4 = this.field9043;
            synchronized (this.field9043) {
                this.field9043.notify();
            }
        }
    }

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "(B)Lgv;", line = 187)
    public final class90 method3662(byte arg0) {
        if (arg0 != 41) {
            return null;
        }
        field9041++;
        Object var2 = null;
        class239 var3 = this.field9030;
        synchronized (this.field9030) {
            class90 var4 = this.field9030.method1597((byte) 105);
            var4.method731((byte) 39);
            this.field9040--;
            return var4;
        }
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(ILjava/lang/String;)V", line = 205)
    public static final void method3663(int arg0, String arg1) {
        if (class238.field3400 == null) {
            class552.method3175((byte) 123);
        }
        field9039++;
        class46.field720.setTime(new Date(class197.method1423(1)));
        int var2 = class46.field720.get(11);
        int var3 = -63 / ((-arg0 - 52) / 43);
        int var4 = class46.field720.get(12);
        int var5 = class46.field720.get(13);
        String var6 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var4 / 10 + var4 % 10 + ":" + var5 / 10 + var5 % 10;
        String[] var7 = class478.method2738(arg1, '\n', 14388);
        for (int var8 = 0; var8 < var7.length; var8++) {
            for (int var9 = class476.field6433; var9 > 0; var9--) {
                class238.field3400[var9] = class238.field3400[var9 - 1];
            }
            class238.field3400[0] = var6 + ": " + var7[var8];
            if (class551.field7632 != null) {
                try {
                    class551.field7632.write(class503.method2877(class238.field3400[0] + "\n", 99));
                } catch (IOException var10) {
                }
            }
            if (class476.field6433 < (class238.field3400.length - 1)) {
                if (class362.field4935 > 0) {
                    class362.field4935++;
                }
                class476.field6433++;
            }
        }
    }

    @OriginalMember(owner = "client!lha", name = "c", descriptor = "(B)Z", line = 273)
    public final boolean method3664(byte arg0) {
        if (arg0 == -97) {
            field9042++;
            return this.field9040 == 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lha", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 293)
    public class652(String arg0) {
        this.field9026 = arg0;
    }
}
