import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class429 extends class311 {

    @OriginalMember(owner = "client!h", name = "x", descriptor = "I")
    public int field5977;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "Ljava/lang/String;")
    public String field5972;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "J")
    public long field5969;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "Ljava/lang/String;")
    public String field5976;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "I")
    public int field5980;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "I")
    public int field5974;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "I")
    public int field5975;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "J")
    public static long field5970 = 0L;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "[S")
    public static short[] field5973 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!h", name = "B", descriptor = "[[I")
    public static int[][] field5981 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!h", name = "z", descriptor = "Lhc;")
    public static class368 field5979 = new class368("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!h", name = "E", descriptor = "Z")
    public static boolean field5984 = false;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "I")
    public static int field5978;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "I")
    public static int field5983;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V", line = 22)
    public static void method2644(int arg0) {
        field5973 = null;
        field5979 = null;
        field5981 = null;
        int var1 = -49 / ((35 - arg0) / 37);
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V", line = 40)
    public static final void method2645(int arg0) {
        field5983++;
        if (!class213.field2980) {
            return;
        }
        class108 var1 = class451.method2815(class217.field3045, class34.field467, (byte) -53);
        if (arg0 != 4) {
            field5984 = true;
        }
        if (var1 != null && var1.field1616 != null) {
            class101 var2 = new class101();
            var2.field1393 = var1.field1616;
            var2.field1403 = var1;
            class172.method1230(var2);
        }
        class156.field2225 = -1;
        class213.field2980 = false;
        class266.field3633 = -1;
        class298.method1821((byte) -89, var1);
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V", line = 71)
    public class429(String arg0, String arg1, int arg2, int arg3, long arg4, int arg5, int arg6) {
        this.field5977 = arg3;
        this.field5972 = arg1;
        this.field5969 = arg4;
        this.field5976 = arg0;
        this.field5980 = arg2;
        this.field5974 = arg6;
        this.field5975 = arg5;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)V", line = 85)
    public static final void method2646(int arg0, int arg1) {
        if (arg0 <= 46) {
            method2645(-112);
        }
        field5982++;
        class408 var2 = class323.field4386;
        synchronized (class323.field4386) {
            class323.field4386.method2531(arg1, 112);
        }
    }
}
