import java.awt.Graphics;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class105 {

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Ltd;")
    private static class136 field2479 = class145.method1172(" has logged out)3", 45);

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Ltd;")
    public static class136 field2484 = field2479;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Ltd;")
    public static class136 field2483 = class145.method1172("leuchten3:", 45);

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Ltd;")
    private static class136 field2482 = class145.method1172("Close", 45);

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field2488 = 0;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "Ltd;")
    public static class136 field2487 = field2482;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    public static int field2491 = 128;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field2480 = -1;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "Ltd;")
    public static class136 field2485 = class145.method1172("Angreifen", 45);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2478;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "[I")
    public static int[] field2489;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([BILsb;)V")
    public final void method841(byte[] arg0, int arg1, class127 arg2) {
        field2486++;
        if (arg2.field2960[arg2.field2995] != 31 || arg2.field2960[arg2.field2995 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2478 == null) {
            this.field2478 = new Inflater(true);
        }
        try {
            this.field2478.setInput(arg2.field2960, arg2.field2995 + 10, arg2.field2960.length - arg2.field2995 - 18);
            this.field2478.inflate(arg0);
            if (arg1 > -125) {
                field2485 = null;
            }
        } catch (Exception var4) {
            this.field2478.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2478.reset();
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public static void method842(byte arg0) {
        if (arg0 != 24) {
            return;
        }
        field2483 = null;
        field2479 = null;
        field2482 = null;
        field2485 = null;
        field2484 = null;
        field2489 = null;
        field2487 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZLtd;Z)V")
    public static final void method843(boolean arg0, class136 arg1, boolean arg2) {
        field2490++;
        byte var3 = 6;
        short var4 = 200;
        byte var5 = 6;
        byte var6 = 30;
        class114.method891(var3, var5, var4, var6, 0);
        class114.method897(var3, var5, var4, var6, 16777215);
        class100.field2413.method723(arg1, var3, var5, var4, var6, 16777215, -1, 1, 1, 0);
        if (!arg0) {
            return;
        }
        class14.method101(var4, var5, var6, var3, (byte) -111);
        if (!arg2) {
            class47.method407(var4, var5, 100, var6, var3);
            return;
        }
        try {
            Graphics var7 = class14.field279.getGraphics();
            class12.field219.method521(0, 0, 0, var7);
        } catch (Exception var8) {
            class14.field279.repaint();
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)Lne;")
    public static final class95 method844(int arg0) {
        field2477++;
        class95 var1 = new class95(class81.field1905, class3.field59, class65.field1408, class127.field2953, class124.field2887);
        class124.method957(117);
        if (arg0 > -74) {
            field2488 = -97;
        }
        return var1;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
    public class105() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(III)V")
    private class105(int arg0, int arg1, int arg2) {
    }
}
