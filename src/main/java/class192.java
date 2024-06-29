import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class192 {

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "J")
    private long field2270;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    private int field2272;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "[I")
    public static int[] field2273 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "J")
    public static long field2274 = 0L;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)I")
    private final int method1129(int arg0, int arg1) {
        int var3 = -26 % ((arg0 - 51) / 63);
        field2269++;
        return (int) (this.field2270 >> class133.field1622 * arg1) & 0xF;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)Lmr;")
    public final class133 method1130(int arg0, byte arg1) {
        if (arg1 != -85) {
            field2273 = null;
        }
        field2276++;
        return class133.method864(17551)[this.method1129(-16, arg0)];
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)I")
    public final int method1131(byte arg0) {
        field2275++;
        if (arg0 <= 14) {
            field2273 = null;
        }
        return this.field2272;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/String;ILqj;I)Lue;")
    public static final class218 method1132(String arg0, int arg1, class476 arg2, int arg3) {
        field2271++;
        if (arg3 == 0) {
            return arg2.method2600((byte) 1, arg0);
        } else if (arg3 == 1) {
            try {
                class104.method743(new Object[] { (new URL(class95.field1241.getCodeBase(), arg0)).toString() }, class95.field1241, "openjs", true);
                class218 var4 = new class218();
                var4.field2546 = 1;
                return var4;
            } catch (Throwable var10) {
                class218 var5 = new class218();
                var5.field2546 = 2;
                return var5;
            }
        } else if (arg3 == 2) {
            try {
                class95.field1241.getAppletContext().showDocument(new URL(class95.field1241.getCodeBase(), arg0), "_blank");
                class218 var6 = new class218();
                var6.field2546 = 1;
                return var6;
            } catch (Exception var11) {
                class218 var7 = new class218();
                var7.field2546 = 2;
                return var7;
            }
        } else if (arg1 != 22711) {
            return null;
        } else if (arg3 == 3) {
            try {
                class104.method744(class95.field1241, "loggedout", 110);
            } catch (Throwable var13) {
            }
            try {
                class95.field1241.getAppletContext().showDocument(new URL(class95.field1241.getCodeBase(), arg0), "_top");
                class218 var8 = new class218();
                var8.field2546 = 1;
                return var8;
            } catch (Exception var12) {
                class218 var9 = new class218();
                var9.field2546 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLmr;)V")
    private final void method1133(byte arg0, class133 arg1) {
        this.field2270 |= (arg1.field1614 << class133.field1622 * this.field2272++);
        field2277++;
        if (arg0 != -42) {
            this.field2272 = 22;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
    public static void method1134(boolean arg0) {
        if (arg0) {
            field2273 = null;
        }
        field2273 = null;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lmr;)V")
    public class192(class133 arg0) {
        this.field2270 = arg0.field1614;
        this.field2272 = 1;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "([Lmr;)V")
    public class192(class133[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method1133((byte) -42, arg0[var2]);
        }
    }
}
