import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class115 {

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "Lgg;")
    private class114 field1416 = new class114(256);

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "Lbm;")
    private class684 field1422;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "Ld;")
    private class96 field1417;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "Let;")
    public static class718 field1415;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
    public static void method782(byte arg0) {
        if (arg0 <= 70) {
            method782((byte) 41);
        }
        field1415 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V")
    public final void method783(boolean arg0) {
        field1419++;
        if (!arg0) {
            this.field1416.method775(1, 5);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public final void method784(int arg0) {
        field1418++;
        this.field1416.method776((byte) -83);
        if (arg0 != 0) {
            this.field1416 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)Lbaa;")
    public final class620 method785(int arg0, int arg1) {
        field1421++;
        Object var3 = this.field1416.method778((long) arg1, -68);
        if (var3 != null) {
            return (class620) var3;
        } else if (this.field1417.method390(arg1, -9396)) {
            class91 var4 = this.field1417.method389(9559, arg1);
            int var5 = var4.field1159 ? 64 : this.field1422.field9631;
            if (arg0 > -107) {
                return null;
            }
            class620 var7;
            if (var4.field1168 && this.field1422.method57()) {
                float[] var6 = this.field1417.method393(-22704, var5, arg1, 0.7F, false, var5);
                var7 = this.field1422.method3710(var5, class440.field6178, var5, var6, -31, var4.field1153 != 0);
            } else {
                int[] var8;
                if (var4.field1165 != 2 && class372.method2268(120, var4.field1149)) {
                    var8 = this.field1417.method395(true, 0.7F, var5, arg1, -11288, var5);
                } else {
                    var8 = this.field1417.method397(arg1, 0.7F, 13049, var5, var5, false);
                }
                var7 = this.field1422.method3731(var8, var4.field1153 != 0, (byte) 75, var5, var5);
            }
            var7.method381(var4.field1157, -13021, var4.field1162);
            this.field1416.method774((long) arg1, 93, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lbm;Ld;)V")
    public class115(class684 arg0, class96 arg1) {
        this.field1422 = arg0;
        this.field1417 = arg1;
    }
}
