import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class266 implements Runnable {

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
    public static int field4022 = 64;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
    public static int field4020 = 0;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "Lso;")
    public static class433 field4017 = new class433();

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "Ldg;")
    public static class376 field4028 = new class376(40, 7);

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "Lpga;")
    private class494 field4016;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field4025;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "Z")
    private volatile boolean field4019;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "[Lnl;")
    private class511[] field4018;

    @OriginalMember(owner = "client!eo", name = "run", descriptor = "()V", line = 6)
    public final void run() {
        field4026++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field4016.field7019));
            String var2 = var1.readLine();
            class325 var3 = class320.method2004(1);
            while (var2 != null) {
                var3.method2048(1, var2);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method2046(0);
            if (var4.length % 3 != 0) {
                return;
            }
            this.field4018 = new class511[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field4018[var5 / 3] = new class511(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field4019 = true;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)Z", line = 46)
    public final boolean method1740(int arg0) {
        field4023++;
        if (this.field4019) {
            return true;
        }
        if (arg0 != -3) {
            field4017 = null;
        }
        if (this.field4016 == null) {
            try {
                int var2 = class379.field5372 == class296.field4357 ? 80 : class352.field5077.field4938 + 7000;
                this.field4016 = class368.field5267.method18(arg0 - 46, new URL("http://" + class352.field5077.field4948 + ":" + var2 + "/news.ws?game=" + class586.field8208.field9738));
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field4016 == null || this.field4016.field7024 == 2) {
            return true;
        } else if (this.field4016.field7024 == 1) {
            if (this.field4025 == null) {
                this.field4025 = new Thread(this);
                this.field4025.start();
            }
            return this.field4019;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ICI)I", line = 88)
    public static final int method1741(int arg0, char arg1, int arg2) {
        field4021++;
        if (arg2 <= 10) {
            return -19;
        }
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            char var4 = Character.toLowerCase(arg1);
            var3 = (var4 << 4) + 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BLig;)I", line = 116)
    public static final int method1742(byte arg0, class218 arg1) {
        field4024++;
        if (arg0 != 123) {
            method1742((byte) -34, null);
        }
        if (class218.field3047 == arg1) {
            return 5120;
        } else if (class218.field3048 == arg1) {
            return 5122;
        } else if (class218.field3049 == arg1) {
            return 5124;
        } else if (class218.field3050 == arg1) {
            return 5121;
        } else if (class218.field3051 == arg1) {
            return 5123;
        } else if (class218.field3052 == arg1) {
            return 5125;
        } else if (class218.field3053 == arg1) {
            return 5131;
        } else if (class218.field3054 == arg1) {
            return 5126;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)Lnl;", line = 158)
    public final class511 method1743(int arg0, int arg1) {
        if (arg0 > -54) {
            return null;
        } else {
            field4027++;
            return this.field4018 == null || arg1 < 0 || this.field4018.length <= arg1 ? null : this.field4018[arg1];
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V", line = 179)
    public static void method1744(byte arg0) {
        if (arg0 == -95) {
            field4028 = null;
            field4017 = null;
        }
    }
}
