import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class518 implements Runnable {

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "[Ljba;")
    public volatile class398[] field7372 = new class398[2];

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "Z")
    public volatile boolean field7374 = false;

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "Z")
    public volatile boolean field7369 = false;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "F")
    public static float field7368 = 0.0F;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
    public static int field7367;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "I")
    public static int field7373;

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "Lvc;")
    public class316 field7375;

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "[I")
    public static int[] field7371;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V")
    public static final void method3037(byte arg0) {
        field7370++;
        if (arg0 < 61) {
            method3038((byte) 49, null, -10);
        }
        class382 var1 = (class382) class43.field528.method2765(-12261);
        boolean var2 = class643.field8813 != null || class242.field3233 > 0;
        int var3 = var1.method779((byte) 81);
        int var4 = var1.method776(-127);
        if (var2) {
            class117.field1421 = 1;
        }
        if (var2) {
            class38.field482 = class231.field3108;
        } else {
            class209.method1277((byte) -100, var3, class231.field3108, var4);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLjava/lang/String;I)Z")
    public static final boolean method3038(byte arg0, String arg1, int arg2) {
        field7373++;
        if (class202.field2644.field4385) {
            class584.field8222 = new class748();
            class584.field8222.field10402 = arg1;
            class584.field8222.field10399 = arg2;
            if (class408.field5781 != class277.field3922) {
                class584.field8222.field10389 = class584.field8222.field10399 + 40000;
                class584.field8222.field10395 = class584.field8222.field10399 + 50000;
            }
            if (class315.field4364.length > arg2 && class315.field4364[arg2] != null) {
                class273.field3901 = class315.field4364[arg2].field2182;
            }
            return true;
        }
        String var3 = "";
        if (class408.field5781 != class277.field3922) {
            var3 = ":" + (arg2 + 7000);
        }
        String var4 = "";
        if (class614.field8594 != null) {
            var4 = "/p=" + class614.field8594;
        }
        String var5 = "http://" + arg1 + var3 + "/l=" + class549.field7669 + "/a=" + class638.field8771 + var4 + "/j" + (class100.field1195 ? "1" : "0") + ",o" + (class387.field5485 ? "1" : "0") + ",a2";
        if (arg0 != 49) {
            method3038((byte) -11, null, -23);
        }
        try {
            class499.field7161.getAppletContext().showDocument(new URL(var5), "_self");
            return true;
        } catch (Exception var6) {
            return false;
        }
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(B)V")
    public static void method3039(byte arg0) {
        field7371 = null;
        if (arg0 != -99) {
            method3039((byte) 16);
        }
    }

    @OriginalMember(owner = "client!hv", name = "run", descriptor = "()V")
    public final void run() {
        field7367++;
        this.field7369 = true;
        try {
            while (!this.field7374) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class398 var2 = this.field7372[var1];
                    if (var2 != null) {
                        var2.method2484(-8910);
                    }
                }
                class756.method4205(10L, 0);
                class546.method3163(null, this.field7375, 0);
            }
        } catch (Exception var9) {
            class248.method1583((byte) -71, null, var9);
        } finally {
            Object var6 = null;
            this.field7369 = false;
        }
    }
}
