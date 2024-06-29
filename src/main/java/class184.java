import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class184 implements Runnable {

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Lmfa;")
    private class562 field2236 = new class562();

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field2238 = new Thread(this);

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "S")
    public static short field2242 = 320;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILmu;)V")
    private final void method1066(int arg0, class270 arg1) {
        class562 var3 = this.field2236;
        synchronized (this.field2236) {
            this.field2236.method3164(arg1, 256);
            this.field2236.notify();
            if (arg0 != 2) {
                this.field2236 = null;
            }
        }
        field2235++;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1067(String arg0, int arg1) {
        field2237++;
        int var2 = 0;
        if (arg1 < 47) {
            field2242 = -67;
        }
        while (var2 < class90.field1003.length) {
            if (class90.field1003[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/lang/String;B)Luba;")
    public final class392 method1068(String arg0, byte arg1) {
        field2241++;
        if (this.field2238 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class392 var3 = new class392(arg0);
            this.method1066(2, var3);
            int var4 = 44 / ((arg1 - 64) / 46);
            return var3;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZZ)V")
    public static final void method1069(boolean arg0, boolean arg1) {
        if (class170.field2043 != null) {
            class170.field2043.method1642(-1);
            class170.field2043 = null;
        }
        field2239++;
        class274.field3474 = 0;
        class99.method612(-28086);
        class397.method2172();
        for (int var2 = 0; var2 < 4; var2++) {
            class475.field6919[var2].method1580(-124);
        }
        class526.method2994(32130, arg0);
        System.gc();
        class649.method3656(2, true);
        class80.field832 = -1;
        class548.field7834 = false;
        class618.method3471((byte) -109, true);
        class311.field4022 = 0;
        class682.field9685 = 0;
        class65.field687 = 0;
        class381.field4954 = 0;
        class227.field2904 = 0;
        class146.field1642 = 0;
        for (int var3 = 0; var3 < class81.field863.length; var3++) {
            class81.field863[var3] = null;
        }
        class448.method2484((byte) -86);
        for (int var4 = 0; var4 < 2048; var4++) {
            class362.field4726[var4] = null;
        }
        class118.field1356 = 0;
        class392.field5223.method3227((byte) -122);
        class208.field2528 = 0;
        class152.field1725.method3227((byte) -104);
        class438.method2419(59);
        class30.field353 = 0;
        class491.field7127.method1380(false);
        class426.method2301(-16842);
        class191.method1103(0);
        class67.field725 = 0L;
        class450.field6201 = null;
        if (arg1) {
            class508.method2921(12, (byte) -117);
            return;
        }
        class508.method2921(3, (byte) -111);
        try {
            class432.method2311(4975, "loggedout", class485.field7068);
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!oe", name = "run", descriptor = "()V")
    public final void run() {
        field2243++;
        while (true) {
            class562 var1 = this.field2236;
            class392 var3;
            synchronized (this.field2236) {
                class270 var2;
                for (var2 = this.field2236.method3171(768); var2 == null; var2 = this.field2236.method3171(768)) {
                    try {
                        this.field2236.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class392)) {
                    return;
                }
                var3 = (class392) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field5224).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field5225 = var5;
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class184() {
        this.field2238.setDaemon(true);
        this.field2238.start();
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ICI)C")
    public static final char method1070(int arg0, char arg1, int arg2) {
        field2244++;
        if (arg0 != 24153) {
            method1067(null, 52);
        }
        if (arg1 >= 'À' && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 == 'Ñ' && arg2 != 0) {
                return 'N';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 == 'ñ' && arg2 != 0) {
                return 'n';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        if (arg1 == 'Œ') {
            return 'O';
        } else if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public final void method1071(int arg0) {
        field2240++;
        if (this.field2238 == null) {
            return;
        }
        this.method1066(2, new class270());
        try {
            this.field2238.join();
        } catch (InterruptedException var2) {
        }
        if (arg0 <= 13) {
            this.field2238 = null;
        }
        this.field2238 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BIZIZ)Ljo;")
    public static final class303 method1072(byte arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        field2245++;
        class59 var5 = null;
        if (class579.field8243 != null) {
            var5 = new class59(arg1, class579.field8243, class539.field7756[arg1], 1000000);
        }
        if (arg0 != -112) {
            field2242 = 9;
        }
        class294.field3864[arg1] = class215.field2613.method1964(class603.field8546, var5, 0, arg1);
        if (arg2) {
            class294.field3864[arg1].method1210(arg0 ^ 0x6F);
        }
        return new class303(class294.field3864[arg1], arg4, arg3);
    }
}
