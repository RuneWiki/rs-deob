import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class406 {

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    private int field5757 = 0;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public int field5745;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "[Lev;")
    public class498[] field5747;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "J")
    private long field5749;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "Lev;")
    private class498 field5756;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "Lev;")
    private class498 field5758;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(JI)Lev;", line = 8)
    public final class498 method2405(long arg0, int arg1) {
        field5746++;
        this.field5749 = arg0;
        class498 var4 = this.field5747[(int) ((long) (this.field5745 - 1) & arg0)];
        for (this.field5756 = var4.field7055; this.field5756 != var4; this.field5756 = this.field5756.field7055) {
            if (this.field5756.field7060 == arg0) {
                class498 var5 = this.field5756;
                this.field5756 = this.field5756.field7055;
                return var5;
            }
        }
        if (arg1 >= -28) {
            this.method2405(-127L, 64);
        }
        this.field5756 = null;
        return null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)I", line = 40)
    public final int method2406(boolean arg0) {
        field5750++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field5745; var3++) {
            class498 var4 = this.field5747[var3];
            for (class498 var5 = var4.field7055; var5 != var4; var5 = var5.field7055) {
                var2++;
            }
        }
        if (!arg0) {
            this.method2414((byte) -101);
        }
        return var2;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([Lev;B)I", line = 73)
    public final int method2407(class498[] arg0, byte arg1) {
        field5759++;
        int var3 = 0;
        int var4 = 0;
        if (arg1 <= 58) {
            return 79;
        }
        while (var4 < this.field5745) {
            class498 var5 = this.field5747[var4];
            for (class498 var6 = var5.field7055; var6 != var5; var6 = var6.field7055) {
                arg0[var3++] = var6;
            }
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 105)
    public final void method2408(int arg0) {
        for (int var2 = 0; var2 < this.field5745; var2++) {
            class498 var3 = this.field5747[var2];
            while (true) {
                class498 var4 = var3.field7055;
                if (var3 == var4) {
                    break;
                }
                var4.method2891(95);
            }
        }
        if (arg0 <= 72) {
            this.field5749 = 53L;
        }
        field5755++;
        this.field5758 = null;
        this.field5756 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V", line = 138)
    public static final void method2409(int arg0, Throwable arg1, String arg2) {
        field5751++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class523.method3090((byte) 124, arg1);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            if (arg0 != 3896) {
                method2411(-4, null);
            }
            class196.method1238(-84, var3);
            String var4 = class449.method2625(var3, "%3a", ":", arg0 - 3904);
            String var5 = class449.method2625(var4, "%40", "@", -8);
            String var6 = class449.method2625(var5, "%26", "&", -8);
            String var7 = class449.method2625(var6, "%23", "#", -8);
            if (class518.field7636.field2165 != null) {
                class370 var8 = class518.field7636.method969(new URL(class518.field7636.field2165.getCodeBase(), "clienterror.ws?c=" + class325.field4744 + "&u=" + class161.field2382 + "&v1=" + class151.field2167 + "&v2=" + class151.field2164 + "&e=" + var7), 0);
                while (var8.field5277 == 0) {
                    class52.method411(1L, (byte) 124);
                }
                if (var8.field5277 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field5274;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)Lev;", line = 190)
    public final class498 method2410(byte arg0) {
        field5753++;
        if (this.field5757 > 0 && this.field5747[this.field5757 - 1] != this.field5758) {
            class498 var2 = this.field5758;
            this.field5758 = var2.field7055;
            return var2;
        }
        if (arg0 <= 76) {
            this.field5756 = null;
        }
        while (this.field5745 > this.field5757) {
            class498 var3 = this.field5747[this.field5757++].field7055;
            if (this.field5747[this.field5757 - 1] != var3) {
                this.field5758 = var3.field7055;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILjava/lang/String;)V", line = 224)
    public static final void method2411(int arg0, String arg1) {
        field5748++;
        if (class4.field80 == null) {
            return;
        }
        class61.method498(class244.field3540, 1);
        class172.field2489++;
        if (arg0 == 0) {
            class30.field357.method2376((byte) 122, class540.method3175(arg1, 1));
            class30.field357.method2377((byte) -53, arg1);
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)I", line = 246)
    public final int method2412(int arg0) {
        if (arg0 != 0) {
            this.method2406(false);
        }
        field5754++;
        return this.field5745;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(JLev;I)V", line = 257)
    public final void method2413(long arg0, class498 arg1, int arg2) {
        field5744++;
        if (arg1.field7056 != null) {
            arg1.method2891(62);
        }
        class498 var5 = this.field5747[(int) (arg0 & (long) (this.field5745 + arg2))];
        arg1.field7056 = var5.field7056;
        arg1.field7055 = var5;
        arg1.field7056.field7055 = arg1;
        arg1.field7055.field7056 = arg1;
        arg1.field7060 = arg0;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(I)V", line = 277)
    public class406(int arg0) {
        this.field5745 = arg0;
        this.field5747 = new class498[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class498 var3 = this.field5747[var2] = new class498();
            var3.field7056 = var3;
            var3.field7055 = var3;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)Lev;", line = 298)
    public final class498 method2414(byte arg0) {
        if (arg0 > -126) {
            this.method2407(null, (byte) 55);
        }
        field5743++;
        this.field5757 = 0;
        return this.method2410((byte) 83);
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)Lev;", line = 310)
    public final class498 method2415(int arg0) {
        field5752++;
        if (this.field5756 == null) {
            return null;
        }
        class498 var2 = this.field5747[(int) ((long) (this.field5745 + arg0) & this.field5749)];
        while (this.field5756 != var2) {
            if (this.field5756.field7060 == this.field5749) {
                class498 var3 = this.field5756;
                this.field5756 = this.field5756.field7055;
                return var3;
            }
            this.field5756 = this.field5756.field7055;
        }
        this.field5756 = null;
        return null;
    }
}
