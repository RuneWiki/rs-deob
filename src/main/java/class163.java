import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class163 {

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public int field2391 = 16777215;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public int field2386 = 8;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public int field2382;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public int field2388;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public int field2392;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public int field2393;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public int field2394;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Z")
    public boolean field2384;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)Z")
    public static final boolean method1102(byte arg0, int arg1) {
        field2383++;
        if (arg0 != -115) {
            return true;
        }
        class386 var2 = class238.method1474(false, arg1);
        if (var2 == null) {
            return false;
        } else if (class216.field2911 == 3) {
            String var3 = "";
            if (class281.field3698 != class168.field2433) {
                var3 = ":" + (var2.field5250 + 7000);
            }
            String var4 = "";
            if (class88.field1341 != null) {
                var4 = "/p=" + class88.field1341;
            }
            String var5 = "http://" + var2.field5248 + var3 + "/l=" + class489.field6789 + "/a=" + class213.field2891 + var4 + "/j" + (class223.field3009 ? "1" : "0") + ",o" + (class33.field543 ? "1" : "0") + ",a2";
            try {
                class170.field2476.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        } else {
            class273.field3588 = var2.field5248;
            class145.field2063 = var2.field5250;
            if (class281.field3698 != class168.field2433) {
                class477.field6572 = class145.field2063 + 50000;
                class437.field5997 = class145.field2063 + 40000;
                class456.field6271 = class437.field5997;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lmd;I)V")
    public final void method1103(class379 arg0, int arg1) {
        if (arg1 < 29) {
            this.field2393 = 8;
        }
        while (true) {
            int var3 = arg0.method2238(255);
            if (var3 == 0) {
                field2387++;
                return;
            }
            this.method1104(var3, -6, arg0);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILmd;)V")
    private final void method1104(int arg0, int arg1, class379 arg2) {
        if (arg1 != -6) {
            method1102((byte) -121, 27);
        }
        field2389++;
        if (arg0 == 1) {
            this.field2386 = arg2.method2212((byte) 83);
        } else if (arg0 == 2) {
            this.field2384 = true;
        } else if (arg0 == 3) {
            this.field2382 = arg2.method2202(arg1 ^ 0x6706);
            this.field2392 = arg2.method2202(-26372);
            this.field2388 = arg2.method2202(-26372);
        } else if (arg0 == 4) {
            this.field2393 = arg2.method2238(255);
        } else if (arg0 == 5) {
            this.field2394 = arg2.method2212((byte) 83);
        } else if (arg0 == 6) {
            this.field2391 = arg2.method2249((byte) 65);
            return;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static final void method1105(int arg0) {
        class110.method763(-94, (long) class31.field516, class370.field4984);
        field2385++;
        if (class474.field6555 != -1) {
            class130.method928(class474.field6555, -1);
        }
        for (int var1 = 0; var1 < class210.field2871; var1++) {
            if (class204.field2824[var1]) {
                class153.field2231[var1] = true;
            }
            class110.field1586[var1] = class204.field2824[var1];
            class204.field2824[var1] = false;
        }
        class56.field884 = class31.field516;
        if (class370.field4984.method627()) {
            class228.field3080 = true;
        }
        if (class474.field6555 != -1) {
            class210.field2871 = 0;
            class57.method409(-19089);
        }
        class370.field4984.method539();
        class278.method1653(false, class385.field5243);
        class128.field1871 = 0;
        int var2 = 28 / ((arg0 + 42) / 49);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)B")
    public static final byte method1106(int arg0, int arg1, int arg2) {
        if (arg2 != 29128) {
            return -46;
        }
        field2390++;
        if (arg1 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
