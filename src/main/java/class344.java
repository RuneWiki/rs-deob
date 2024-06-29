import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class344 implements Runnable {

    @OriginalMember(owner = "client!np", name = "i", descriptor = "[Lvn;")
    public volatile class208[] field5001 = new class208[2];

    @OriginalMember(owner = "client!np", name = "g", descriptor = "Z")
    public volatile boolean field4999 = false;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "Z")
    public volatile boolean field4996 = false;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "Lkn;")
    public static class530 field4997 = new class530("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!np", name = "j", descriptor = "Lam;")
    public static class455 field5002 = new class455();

    @OriginalMember(owner = "client!np", name = "k", descriptor = "Leh;")
    public static class246 field5003 = new class246(59, 6);

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "Lnt;")
    public class151 field4993;

    @OriginalMember(owner = "client!np", name = "h", descriptor = "Lrt;")
    public static class154 field5000;

    @OriginalMember(owner = "client!np", name = "l", descriptor = "Lab;")
    public static class483 field5004;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method2049(int arg0, int arg1) {
        field4998++;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class84.field1063.method3116(class149.field1979, (byte) 116) + " (" + var2 + ")</col>";
        } else {
            if (arg1 >= -36) {
                field5002 = null;
            }
            return var2.length() > 6 ? " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class102.field1356.method3116(class149.field1979, (byte) 104) + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!np", name = "run", descriptor = "()V")
    public final void run() {
        field4994++;
        this.field4996 = true;
        try {
            while (!this.field4999) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class208 var2 = this.field5001[var1];
                    if (var2 != null) {
                        var2.method1329(3);
                    }
                }
                class52.method411(10L, (byte) 120);
                class325.method1958(null, this.field4993, -3138);
            }
        } catch (Exception var9) {
            class406.method2409(3896, var9, null);
        } finally {
            Object var6 = null;
            this.field4996 = false;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
    public static void method2050(int arg0) {
        field5003 = null;
        field5000 = null;
        field4997 = null;
        field5004 = null;
        field5002 = null;
        if (arg0 != 8) {
            method2051((byte) 116, 59);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(BI)V")
    public static final void method2051(byte arg0, int arg1) {
        int var2 = -96 / ((arg0 - 23) / 46);
        field4995++;
        class45 var3 = class354.method2094(arg1, (byte) -93, 4);
        var3.method261(4);
    }
}
