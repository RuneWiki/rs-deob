import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class106 {

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "[I")
    public static int[] field1568 = new int[4096];

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "[I")
    public static int[] field1569 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1570 = null;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "Lec;")
    public static class40 field1564;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1560;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "[Lkj;")
    public static class30[] field1567;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
    public static void method772(byte arg0) {
        field1569 = null;
        field1568 = null;
        field1564 = null;
        field1570 = null;
        if (arg0 <= 100) {
            method772((byte) 73);
        }
        field1567 = null;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
    public class106() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static final int method773(boolean arg0, String arg1) {
        field1566++;
        if (class154.field2251 == null || arg1.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class154.field2251.field3727; var2++) {
            if (class202.method1342(arg1, (byte) 59, class162.method1093((byte) -112, " ", "<br>", class154.field2251.field3731[var2]))) {
                return var2;
            }
        }
        if (arg0) {
            method772((byte) 103);
        }
        return -1;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lca;I[B)V")
    public final void method774(class54 arg0, int arg1, byte[] arg2) {
        if (arg1 != 0) {
            return;
        }
        field1559++;
        if (arg0.field848[arg0.field887] != 31 || arg0.field848[arg0.field887 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1560 == null) {
            this.field1560 = new Inflater(true);
        }
        try {
            this.field1560.setInput(arg0.field848, arg0.field887 + 10, -8 - (arg0.field887 - (arg0.field848.length + -10)));
            this.field1560.inflate(arg2);
        } catch (Exception var4) {
            this.field1560.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1560.reset();
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(III)V")
    private class106(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)Z")
    public static final boolean method775(boolean arg0) {
        if (!arg0) {
            return true;
        }
        field1565++;
        try {
            if (class287.field4391 == 2) {
                if (class9.field107 == null) {
                    class9.field107 = class279.method1857(class11.field162, class280.field4299, class133.field1952);
                    if (class9.field107 == null) {
                        return false;
                    }
                }
                if (class245.field3794 == null) {
                    class245.field3794 = new class244(class25.field494, class235.field3613);
                }
                if (class148.field2151.method1418(class213.field3276, 22050, class9.field107, 0, class245.field3794)) {
                    class148.field2151.method1410(145);
                    class148.field2151.method1425(0, class181.field2643);
                    class148.field2151.method1403(class9.field107, class141.field2034, 0);
                    class9.field107 = null;
                    class287.field4391 = 0;
                    class245.field3794 = null;
                    class11.field162 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class148.field2151.method1434(-2080769);
            class245.field3794 = null;
            class11.field162 = null;
            class287.field4391 = 0;
            class9.field107 = null;
        }
        return false;
    }
}
