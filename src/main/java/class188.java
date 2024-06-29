import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class188 implements Runnable {

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "Lft;")
    private class4 field2985 = new class4();

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field2983 = new Thread(this);

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "Lbg;")
    public static class310 field2976 = new class310(28, 6);

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "I")
    public static int field2981 = 0;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ICI)I")
    public static final int method1160(int arg0, char arg1, int arg2) {
        field2978++;
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg1 == 'ñ' && arg2 == 0) {
            var3 = 1762;
        }
        if (arg0 > -72) {
            method1167(-75);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mu", name = "run", descriptor = "()V")
    public final void run() {
        field2986++;
        while (true) {
            class4 var1 = this.field2985;
            class429 var3;
            synchronized (this.field2985) {
                class179 var2;
                for (var2 = this.field2985.method7(false); var2 == null; var2 = this.field2985.method7(false)) {
                    try {
                        this.field2985.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class429)) {
                    return;
                }
                var3 = (class429) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field6295).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field6294 = var5;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lol;I)V")
    private final void method1161(class179 arg0, int arg1) {
        class4 var3 = this.field2985;
        synchronized (this.field2985) {
            this.field2985.method4(1, arg0);
            if (arg1 != -22072) {
                return;
            }
            this.field2985.notify();
        }
        field2975++;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Llt;I)V")
    public static final void method1162(class458 arg0, int arg1) {
        field2984++;
        class391.field5727 = 0;
        class57.field978 = 0;
        class139.field2285 = new class215();
        class442.field6683 = new class81[1024];
        if (arg1 > -126) {
            field2976 = null;
        }
        class334.method2076(arg0, (byte) -27);
        class222.method1349(arg0, -50);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V")
    public final void method1163(int arg0) {
        field2987++;
        if (this.field2983 == null) {
            return;
        }
        this.method1161(new class179(), -22072);
        try {
            if (arg0 != 222) {
                field2981 = -31;
            }
            this.field2983.join();
        } catch (InterruptedException var2) {
        }
        this.field2983 = null;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ltq;B)Ltq;")
    public static final class427 method1164(class427 arg0, byte arg1) {
        field2982++;
        if (arg0.field6253 != -1) {
            return class413.method2435(160291920, arg0.field6253);
        } else if (arg1 <= 119) {
            return null;
        } else {
            int var2 = arg0.field6157 >>> 16;
            class391 var3 = new class391(class245.field3741);
            for (class394 var4 = (class394) var3.method2329(19650); var4 != null; var4 = (class394) var3.method2330((byte) -89)) {
                if (var4.field5750 == var2) {
                    return class413.method2435(160291920, (int) var4.field2798);
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IBI)I")
    public static final int method1165(int arg0, byte arg1, int arg2) {
        field2977++;
        int var3 = arg2 >>> 31;
        if (arg1 != 127) {
            method1162(null, -114);
        }
        return (arg2 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLjava/lang/String;)Lmh;")
    public final class429 method1166(byte arg0, String arg1) {
        field2979++;
        if (this.field2983 == null) {
            throw new IllegalStateException("");
        }
        if (arg0 != -63) {
            method1160(97, '=', 14);
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("");
        }
        class429 var3 = new class429(arg1);
        this.method1161(var3, arg0 - 22009);
        return var3;
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)V")
    public static void method1167(int arg0) {
        field2976 = null;
        if (arg0 != -14468) {
            method1167(22);
        }
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)V")
    public static final void method1168(int arg0) {
        if (arg0 != 58) {
            field2981 = 122;
        }
        field2980++;
        if (class260.field3947.toLowerCase().indexOf("microsoft") != -1) {
            class106.field1862[192] = 58;
            class106.field1862[190] = 72;
            class106.field1862[220] = 74;
            class106.field1862[189] = 26;
            class106.field1862[221] = 43;
            class106.field1862[186] = 57;
            class106.field1862[191] = 73;
            class106.field1862[219] = 42;
            class106.field1862[188] = 71;
            class106.field1862[223] = 28;
            class106.field1862[222] = 59;
            class106.field1862[187] = 27;
            return;
        }
        class106.field1862[91] = 42;
        class106.field1862[92] = 74;
        class106.field1862[46] = 72;
        class106.field1862[44] = 71;
        class106.field1862[45] = 26;
        class106.field1862[93] = 43;
        if (class260.field3949 == null) {
            class106.field1862[222] = 59;
            class106.field1862[192] = 58;
        } else {
            class106.field1862[222] = 58;
            class106.field1862[192] = 28;
            class106.field1862[520] = 59;
        }
        class106.field1862[59] = 57;
        class106.field1862[47] = 73;
        class106.field1862[61] = 27;
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "()V")
    public class188() {
        this.field2983.setDaemon(true);
        this.field2983.start();
    }
}
