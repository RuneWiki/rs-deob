import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class49 implements Runnable {

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Z")
    public boolean field1004 = true;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "Ljava/lang/Object;")
    public Object field1006 = new Object();

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public int field1007 = 0;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "[I")
    public int[] field1021 = new int[500];

    @OriginalMember(owner = "client!h", name = "x", descriptor = "[I")
    public int[] field1023 = new int[500];

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Lbc;")
    public static class11 field1003 = new class11(30);

    @OriginalMember(owner = "client!h", name = "m", descriptor = "Lpe;")
    public static class109 field1012 = class141.method1120("Unerwartete Antwort vom Anmelde)2Server)3", 0);

    @OriginalMember(owner = "client!h", name = "p", descriptor = "J")
    public static volatile long field1015 = 0L;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "[Led;")
    public static class33[] field1014 = new class33[4];

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field1009 = -1;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "Lpe;")
    public static class109 field1010 = class141.method1120(": ", 0);

    @OriginalMember(owner = "client!h", name = "s", descriptor = "Lpe;")
    public static class109 field1018 = class141.method1120("Wir vermuten)1 dass Ihr Konto gestohlen wurde", 0);

    @OriginalMember(owner = "client!h", name = "t", descriptor = "Lpe;")
    private static class109 field1019 = class141.method1120("To play on this world move to a free area first", 0);

    @OriginalMember(owner = "client!h", name = "u", descriptor = "Lpe;")
    private static class109 field1020 = class141.method1120("Username: ", 0);

    @OriginalMember(owner = "client!h", name = "r", descriptor = "Lpe;")
    public static class109 field1017 = class141.method1120("p11_full", 0);

    @OriginalMember(owner = "client!h", name = "q", descriptor = "Lpe;")
    public static class109 field1016 = field1019;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "Lpe;")
    public static class109 field1011 = class141.method1120("me", 0);

    @OriginalMember(owner = "client!h", name = "w", descriptor = "Lpe;")
    public static class109 field1022 = field1020;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "Lac;")
    public static class4 field1013;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "Lna;")
    public static class91 field1008;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "[Le;")
    public static class29[] field1024;

    @OriginalMember(owner = "client!h", name = "run", descriptor = "()V")
    public final void run() {
        field1002++;
        while (this.field1004) {
            Object var1 = this.field1006;
            synchronized (this.field1006) {
                if (this.field1007 < 500) {
                    this.field1023[this.field1007] = class82.field1754;
                    this.field1021[this.field1007] = class48.field992;
                    this.field1007++;
                }
            }
            class99.method797(50L, false);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)V")
    public static final void method420(int arg0, byte arg1) {
        field1000++;
        int var2 = 83 % ((-arg1 - 18) / 53);
        if (class113.method941(arg0, (byte) -116)) {
            class38.method364(true, class114.field2525[arg0], -1);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lpe;ILpe;Lpe;)V")
    public static final void method421(class109 arg0, int arg1, class109 arg2, class109 arg3) {
        class72.field1477 = arg0;
        class72.field1475 = arg2;
        field1005++;
        if (arg1 != -8453) {
            method422((byte) -25);
        }
        class72.field1456 = arg3;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public static void method422(byte arg0) {
        field1008 = null;
        field1019 = null;
        field1017 = null;
        field1014 = null;
        field1020 = null;
        field1022 = null;
        field1003 = null;
        field1024 = null;
        field1010 = null;
        field1013 = null;
        field1012 = null;
        field1018 = null;
        field1011 = null;
        field1016 = null;
        int var1 = 94 % ((arg0 - 22) / 51);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)I")
    public static final int method423(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 == -1073289080) {
            field1001++;
            int var4 = 256 - arg0;
            return ((arg1 & 0xFF00FF) * arg0 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg0 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
        } else {
            return 8;
        }
    }
}
