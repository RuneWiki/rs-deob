import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class376 {

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "Los;")
    public static class309 field5499 = new class309("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!ts", name = "k", descriptor = "[I")
    public static int[] field5504 = new int[2];

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "I")
    public static int field5503 = 0;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "I")
    public int field5497;

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!ts", name = "m", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "Ljava/lang/String;")
    public String field5505;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "[I")
    public static int[] field5498;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZII)I")
    public static final int method2308(boolean arg0, int arg1, int arg2) {
        field5494++;
        if (!arg0) {
            field5499 = null;
        }
        return arg2 == 1 || arg2 == 3 ? class102.field1940[arg1 & 0x3] : class93.field1852[arg1 & 0x3];
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
    public static final void method2309(int arg0) {
        class191.field3073 = false;
        int var1 = -26 / ((-arg0 - 18) / 33);
        class472.field6997 = null;
        field5506++;
        class102.method895(0);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V")
    public static void method2310(boolean arg0) {
        field5504 = null;
        field5498 = null;
        field5499 = null;
        if (!arg0) {
            method2308(false, -15, 81);
        }
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
    public static final void method2311(int arg0) {
        field5495++;
        if (class210.field3355 == 0) {
            return;
        }
        try {
            if (++class522.field7580 > 2000) {
                if (class216.field3417 != null) {
                    class216.field3417.method2319((byte) 124);
                    class216.field3417 = null;
                }
                if (class505.field7373 >= 1) {
                    class210.field3355 = 0;
                    class393.field6007 = -5;
                    return;
                }
                class397.field6032.field3822 = !class397.field6032.field3822;
                class522.field7580 = 0;
                class505.field7373++;
                class210.field3355 = 1;
            }
            int var1 = 97 / ((arg0 + 86) / 39);
            if (class210.field3355 == 1) {
                class17.field275 = class497.field7305.method2882(true, class397.field6032.method1605((byte) -112), class397.field6032.field3826);
                class210.field3355 = 2;
            }
            if (class210.field3355 == 2) {
                if (class17.field275.field2119 == 2) {
                    throw new IOException();
                }
                if (class17.field275.field2119 != 1) {
                    return;
                }
                class216.field3417 = new class378((Socket) class17.field275.field2115, class497.field7305);
                class17.field275 = null;
                class216.field3417.method2329(0, class335.field5062.field4399, 3, class335.field5062.field4408);
                class44.method275(false);
                int var2 = class216.field3417.method2328(0);
                class44.method275(false);
                if (var2 != 21) {
                    class393.field6007 = var2;
                    class210.field3355 = 0;
                    class216.field3417.method2319((byte) 108);
                    class216.field3417 = null;
                    return;
                }
                class210.field3355 = 3;
            }
            if (class210.field3355 == 3) {
                if (class216.field3417.method2321(0) < 1) {
                    return;
                }
                class278.field4188 = new String[class216.field3417.method2328(0)];
                class210.field3355 = 4;
            }
            if (class210.field3355 == 4 && class216.field3417.method2321(0) >= class278.field4188.length * 8) {
                class219.field3446.field4399 = 0;
                class216.field3417.method2322(0, class278.field4188.length * 8, (byte) 114, class219.field3446.field4408);
                for (int var3 = 0; var3 < class278.field4188.length; var3++) {
                    class278.field4188[var3] = class356.method2198(10601, class219.field3446.method1877(false));
                }
                class393.field6007 = 21;
                class210.field3355 = 0;
                class216.field3417.method2319((byte) 123);
                class216.field3417 = null;
            }
        } catch (IOException var4) {
            if (class216.field3417 != null) {
                class216.field3417.method2319((byte) 125);
                class216.field3417 = null;
            }
            if (class505.field7373 >= 1) {
                class210.field3355 = 0;
                class393.field6007 = -4;
            } else {
                class210.field3355 = 1;
                class522.field7580 = 0;
                class397.field6032.field3822 = !class397.field6032.field3822;
                class505.field7373++;
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IBZIZ)Lph;")
    public static final class459 method2312(int arg0, byte arg1, boolean arg2, int arg3, boolean arg4) {
        if (arg1 <= 65) {
            method2311(82);
        }
        field5496++;
        class137 var5 = null;
        if (class316.field4781 != null) {
            var5 = new class137(arg3, class316.field4781, class246.field3800[arg3], 1000000);
        }
        class352.field5193[arg3] = class151.field2496.method2100(arg3, var5, class443.field6575, -1);
        if (arg4) {
            class352.field5193[arg3].method1224(0);
        }
        return new class459(class352.field5193[arg3], arg2, arg0);
    }
}
