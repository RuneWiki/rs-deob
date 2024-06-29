import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class391 implements Runnable {

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "[Lcba;")
    public volatile class550[] field5754 = new class550[2];

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "Z")
    public volatile boolean field5757 = false;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "Z")
    public volatile boolean field5759 = false;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public static int field5763 = 0;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "Lwea;")
    public class158 field5764;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "[I")
    public static int[] field5756;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "[Lga;")
    public static class404[] field5762;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 3)
    public static final String method2462(byte arg0, String arg1) {
        if (arg0 != 31) {
            method2464((byte) 87);
        }
        field5758++;
        String var2 = null;
        int var3 = arg1.indexOf("--> ");
        if (var3 >= 0) {
            var2 = arg1.substring(0, var3 + 4);
            arg1 = arg1.substring(var3 + 4);
        }
        if (arg1.startsWith("directlogin ")) {
            int var4 = arg1.indexOf(" ", "directlogin ".length());
            if (var4 >= 0) {
                int var5 = arg1.length();
                arg1 = arg1.substring(0, var4) + " ";
                for (int var6 = var4 + 1; var6 < var5; var6++) {
                    arg1 = arg1 + "*";
                }
            }
        }
        return var2 == null ? arg1 : var2 + arg1;
    }

    @OriginalMember(owner = "client!tm", name = "run", descriptor = "()V", line = 57)
    public final void run() {
        this.field5759 = true;
        field5760++;
        try {
            while (!this.field5757) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class550 var2 = this.field5754[var1];
                    if (var2 != null) {
                        var2.method3165(-6858);
                    }
                }
                class700.method3916((byte) -107, 10L);
                class392.method2468((byte) -42, null, this.field5764);
            }
        } catch (Exception var9) {
            class444.method2672(null, var9, 15004);
        } finally {
            Object var6 = null;
            this.field5759 = false;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 92)
    public static void method2463(int arg0) {
        field5756 = null;
        if (arg0 != 0) {
            method2463(-18);
        }
        field5762 = null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V", line = 115)
    public static final void method2464(byte arg0) {
        if (arg0 != 99) {
            field5756 = null;
        }
        class641.field8829 = new class155(8);
        field5755++;
        class434.field6207 = 0;
        for (class385 var1 = (class385) class286.field3996.method1301(8); var1 != null; var1 = (class385) class286.field3996.method1307((byte) -115)) {
            var1.method2424();
        }
    }
}
