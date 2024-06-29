import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class160 {

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public int field2519;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public int field2520;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public int field2515;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public int field2523;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field2521 = 0;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "Lj;")
    public static class285 field2516 = new class285(128);

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field2526 = null;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "Lja;")
    public static class64 field2524;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 7)
    public static final void method1192(int arg0) {
        field2518++;
        boolean var1 = false;
        if (arg0 != 31150) {
            field2525 = 22;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class65.field1062 - 1); var2++) {
                if (class12.field233[var2] < 1000 && class12.field233[var2 + 1] > 1000) {
                    String var3 = class13.field246[var2];
                    var1 = false;
                    class13.field246[var2] = class13.field246[var2 + 1];
                    class13.field246[var2 + 1] = var3;
                    String var4 = class298.field4711[var2];
                    class298.field4711[var2] = class298.field4711[var2 + 1];
                    class298.field4711[var2 + 1] = var4;
                    int var5 = class156.field2492[var2];
                    class156.field2492[var2] = class156.field2492[var2 + 1];
                    class156.field2492[var2 + 1] = var5;
                    int var6 = class59.field930[var2];
                    class59.field930[var2] = class59.field930[var2 + 1];
                    class59.field930[var2 + 1] = var6;
                    int var7 = class40.field728[var2];
                    class40.field728[var2] = class40.field728[var2 + 1];
                    class40.field728[var2 + 1] = var7;
                    short var8 = class12.field233[var2];
                    class12.field233[var2] = class12.field233[var2 + 1];
                    class12.field233[var2 + 1] = var8;
                    long var9 = class311.field4888[var2];
                    class311.field4888[var2] = class311.field4888[var2 + 1];
                    class311.field4888[var2 + 1] = var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V", line = 65)
    public static void method1193(int arg0) {
        field2526 = null;
        field2524 = null;
        field2516 = null;
        if (arg0 != -1) {
            method1195(102, 49);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V", line = 78)
    public static final void method1194(byte arg0) {
        class207.field3269 = new class292[field2524.method466((byte) 23)][];
        class12.field238 = new boolean[field2524.method466((byte) 23)];
        if (arg0 > -41) {
            field2526 = (String[]) null;
        }
        field2527++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)V", line = 103)
    public static final void method1195(int arg0, int arg1) {
        class258.field3996.method1828(arg1, (byte) -69);
        class245.field3781.method1828(arg1, (byte) 102);
        field2517++;
        int var2 = -90 % ((-arg0 - 46) / 58);
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V", line = 112)
    public class160() {
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lej;)V", line = 123)
    public class160(class160 arg0) {
        this.field2519 = arg0.field2519;
        this.field2520 = arg0.field2520;
        this.field2515 = arg0.field2515;
        this.field2523 = arg0.field2523;
    }
}
