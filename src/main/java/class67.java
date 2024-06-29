import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class67 {

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Ljava/lang/String;")
    public String field1261;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "Ljava/lang/String;")
    public String field1265;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Ljava/lang/String;")
    public String field1263;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "[Lgw;")
    public static class172[] field1260 = new class172[14];

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Lmu;")
    public static class303 field1258 = new class303(1, 2);

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field1267 = -1;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field1271 = 0;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "D")
    public static double field1268;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "Z")
    public static boolean field1270;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "[I")
    public static int[] field1266;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIB)I", line = 6)
    public static final int method672(int arg0, int arg1, int arg2, byte arg3) {
        field1264++;
        if (arg3 != 71) {
            return -122;
        }
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lke;I)V", line = 29)
    public static final void method673(class598 arg0, int arg1) {
        field1259++;
        if (arg1 != -28482) {
            field1260 = null;
        }
        class397 var2 = (class397) class68.field1280.method1465((long) arg0.field5716, -6008);
        if (var2 == null) {
            return;
        }
        if (var2.field5810 != null) {
            class326.field4510.method1321(var2.field5810);
            var2.field5810 = null;
        }
        var2.method2314((byte) 82);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)V", line = 63)
    public static final void method674(int arg0, byte arg1) {
        field1262++;
        class192.field2851 = 1000000000L / (long) arg0;
        if (arg1 != -124) {
            method675(-83);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 77)
    public static void method675(int arg0) {
        field1260 = null;
        field1266 = null;
        field1258 = null;
        if (arg0 < 100) {
            field1270 = false;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 95)
    public class67(String arg0, String arg1, String arg2) {
        this.field1261 = arg1;
        this.field1265 = arg2;
        this.field1263 = arg0;
    }
}
