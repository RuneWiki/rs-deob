import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class155 {

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    private int field2111;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public int field2113;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public int field2119;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "Loha;")
    public class772 field2112;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BLjava/lang/String;Lqn;Ljava/lang/String;I)Leba;")
    public static final class615 method1130(byte arg0, String arg1, class70 arg2, String arg3, int arg4) {
        field2118++;
        if (arg4 == 0) {
            return arg2.method612(arg1, 32);
        } else if (arg0 != 7) {
            return null;
        } else if (arg4 == 1) {
            try {
                Object var5 = class623.method3413(arg3, new Object[] { (new URL(class735.field10183.getCodeBase(), arg1)).toString() }, 31580, class735.field10183);
                if (var5 == null) {
                    throw new RuntimeException();
                }
                class615 var6 = new class615();
                var6.field8321 = 1;
                return var6;
            } catch (Throwable var12) {
                class615 var7 = new class615();
                var7.field8321 = 2;
                return var7;
            }
        } else if (arg4 == 2) {
            try {
                class735.field10183.getAppletContext().showDocument(new URL(class735.field10183.getCodeBase(), arg1), "_blank");
                class615 var8 = new class615();
                var8.field8321 = 1;
                return var8;
            } catch (Exception var13) {
                class615 var9 = new class615();
                var9.field8321 = 2;
                return var9;
            }
        } else if (arg4 == 3) {
            try {
                class623.method3414(class735.field10183, "loggedout", (byte) 114);
            } catch (Throwable var15) {
            }
            try {
                class735.field10183.getAppletContext().showDocument(new URL(class735.field10183.getCodeBase(), arg1), "_top");
                class615 var10 = new class615();
                var10.field8321 = 1;
                return var10;
            } catch (Exception var14) {
                class615 var11 = new class615();
                var11.field8321 = 2;
                return var11;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V")
    public static final void method1131(byte arg0) {
        if (arg0 <= 28) {
            method1131((byte) -4);
        }
        field2115++;
        if (class276.field4092 < 0) {
            class276.field4092 = 0;
            class232.field3167 = -1;
            class587.field7831 = -1;
        }
        if (class276.field4092 > class375.field5448) {
            class276.field4092 = class375.field5448;
            class232.field3167 = -1;
            class587.field7831 = -1;
        }
        if (class66.field947 < 0) {
            class587.field7831 = -1;
            class66.field947 = 0;
            class232.field3167 = -1;
        }
        if (class66.field947 > class375.field5436) {
            class66.field947 = class375.field5436;
            class587.field7831 = -1;
            class232.field3167 = -1;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljp;II)V")
    private final void method1132(class376 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field2111 = arg0.method2359(-1);
        } else if (arg2 == 2) {
            this.field2119 = arg0.method2398(-1372747256);
            this.field2113 = arg0.method2398(-1372747256);
        }
        field2114++;
        if (arg1 != -3) {
            this.field2111 = 1;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZBI)V")
    public static final void method1133(int arg0, boolean arg1, byte arg2, int arg3) {
        field2116++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class386.field5629 = arg3;
        class269.field3962 = arg0;
        class418.field6010 = arg1;
        if (arg2 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljp;I)V")
    public final void method1134(class376 arg0, int arg1) {
        field2120++;
        if (arg1 != -1) {
            this.field2119 = -10;
        }
        while (true) {
            int var3 = arg0.method2398(arg1 - 1372747255);
            if (var3 == 0) {
                return;
            }
            this.method1132(arg0, arg1 - 2, var3);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)Leu;")
    public final synchronized class508 method1135(int arg0) {
        field2117++;
        class508 var2 = (class508) this.field2112.field10638.method1541(-10, (long) this.field2111);
        if (var2 != null) {
            return var2;
        }
        class508 var3 = class508.method2950(this.field2112.field10635, this.field2111, arg0);
        if (var3 != null) {
            this.field2112.field10638.method1544(true, var3, (long) this.field2111);
        }
        return var3;
    }
}
