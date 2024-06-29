import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class192 {

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "Lkba;")
    private class108 field2314;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "[[B")
    public static byte[][] field2308 = new byte[1000][];

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "F")
    public static float field2310;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "Lgda;")
    private class55 field2316;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "([I[II)V")
    public static final void method1071(int[] arg0, int[] arg1, int arg2) {
        field2312++;
        if (arg0 == null || arg1 == null) {
            class654.field9113 = null;
            class216.field2615 = null;
            class253.field3265 = null;
            return;
        }
        class253.field3265 = arg0;
        class216.field2615 = new int[arg0.length];
        class654.field9113 = new byte[arg0.length][][];
        for (int var3 = arg2; var3 < class253.field3265.length; var3++) {
            class654.field9113[var3] = new byte[arg1[var3]][];
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Lgda;")
    public final class55 method1072(int arg0) {
        field2311++;
        if (arg0 != 1000) {
            return null;
        }
        class55 var2 = this.field2316;
        if (this.field2314.field1438 == var2) {
            this.field2316 = null;
            return null;
        } else {
            this.field2316 = var2.field564;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)Lgda;")
    public final class55 method1073(byte arg0) {
        if (arg0 >= -113) {
            return null;
        }
        field2315++;
        class55 var2 = this.field2314.field1438.field564;
        if (this.field2314.field1438 == var2) {
            this.field2316 = null;
            return null;
        } else {
            this.field2316 = var2.field564;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BLkba;)V")
    public final void method1074(byte arg0, class108 arg1) {
        this.field2314 = arg1;
        if (arg0 == 26) {
            field2309++;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILem;)V")
    public static final void method1075(int arg0, class227 arg1) {
        field2313++;
        if (arg1 == null || arg0 <= 117) {
            return;
        }
        class139.field1783.method725(arg1, -20911);
        class43.field470++;
        Object var2 = null;
        class756 var5;
        if (arg1.field2947 || "".equals(arg1.field2950)) {
            var5 = new class756(arg1.field2950);
            class331.field4464++;
        } else {
            long var3 = arg1.field2949;
            for (var5 = (class756) class513.field6948.method2552(var3, -1); var5 != null && !var5.field10550.equals(arg1.field2950); var5 = (class756) class513.field6948.method2555(122)) {
            }
            if (var5 == null) {
                var5 = (class756) class452.field6304.method1571(-126, var3);
                if (var5 != null && !var5.field10550.equals(arg1.field2950)) {
                    var5 = null;
                }
                if (var5 == null) {
                    var5 = new class756(arg1.field2950);
                }
                class513.field6948.method2558(var5, var3, -1);
                class331.field4464++;
            }
        }
        if (var5.method4205(90, arg1)) {
            class23.method88(var5, (byte) 87);
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
    public static void method1076(int arg0) {
        field2308 = null;
        if (arg0 <= 19) {
            field2310 = -0.7901263F;
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
    public class192() {
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lkba;)V")
    public class192(class108 arg0) {
        this.field2314 = arg0;
    }
}
