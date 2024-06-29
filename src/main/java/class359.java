import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class359 extends class478 implements Runnable {

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "Z")
    private boolean field5454 = true;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public int field5453 = -1;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "Lfl;")
    private class518 field5455;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Lrn;")
    public static class174 field5450 = new class174(42, 11);

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V", line = 4)
    public static void method2261(byte arg0) {
        int var1 = -1 / ((-arg0 - 6) / 39);
        field5450 = null;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)Ljava/lang/String;", line = 13)
    public static final String method2262(int arg0) {
        if (arg0 != 110) {
            return null;
        }
        field5457++;
        String var1 = "www";
        if (class423.field6322 == class284.field4055) {
            var1 = "www-wtrc";
        } else if (class516.field7583 == class423.field6322) {
            var1 = "www-wtqa";
        } else if (class423.field6322 == class257.field3728) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class66.field1138 != null) {
            var2 = "/p=" + class66.field1138;
        }
        return "http://" + var1 + "." + class403.field6054.field3438 + ".com/l=" + client.field2870 + "/a=" + class110.field1871 + var2 + "/";
    }

    @OriginalMember(owner = "client!cb", name = "run", descriptor = "()V", line = 43)
    public final void run() {
        field5456++;
        while (this.field5454) {
            this.field5455.method3099(this, (byte) 92);
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V", line = 63)
    public final void method2263(byte arg0) {
        if (arg0 >= -22) {
            this.run();
        }
        this.field5454 = false;
        field5452++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLln;IIB)V", line = 74)
    public static final void method2264(byte arg0, class256 arg1, int arg2, int arg3, byte arg4) {
        field5451++;
        int var5 = arg1.field7692[0];
        int var6 = arg1.field7694[0];
        if (var5 < 0 || var5 >= class33.field662 || var6 < 0 || class121.field1966 <= var6 || arg2 < 0 || class33.field662 <= arg2 || arg3 < 0 || class121.field1966 <= arg3) {
            return;
        }
        int var7 = class408.method2484(-4, var5, true, arg2, 0, class141.field2244[arg1.field6232], 0, arg4 - 50, var6, arg3, arg1.method1654(89), 0, class149.field2375, class338.field5094, 0);
        if (arg4 != 110) {
            field5450 = null;
        }
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg1.method1658(class149.field2375[var8], (byte) -106, arg0, class338.field5094[var8]);
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(B)V", line = 112)
    public final void method2265(byte arg0) {
        (new Thread(this, "a")).start();
        if (arg0 != -111) {
            method2262(-8);
        }
        field5449++;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lfl;)V", line = 130)
    public class359(class518 arg0) {
        this.field5455 = arg0;
    }
}
