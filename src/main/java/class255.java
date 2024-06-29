import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class255 extends class302 {

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "Lad;")
    public static class275 field4210 = new class275(4);

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "Lgj;")
    public class255 field4204;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "Lgj;")
    public class255 field4207;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "[Lrk;")
    public static class292[] field4205;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "[[[B")
    public static byte[][][] field4213;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLrg;Z)V")
    public static final void method1725(byte arg0, class248 arg1, boolean arg2) {
        field4208++;
        if (arg0 != -10) {
            field4205 = null;
        }
        int var3 = arg1.field3914 == 0 ? arg1.field4016 : arg1.field3914;
        int var4 = arg1.field3994 == 0 ? arg1.field4057 : arg1.field3994;
        class179.method1261(arg2, arg1.field3968, class208.field3315[arg1.field3968 >> 16], 123, var3, var4);
        if (arg1.field4068 != null) {
            class179.method1261(arg2, arg1.field3968, arg1.field4068, 126, var3, var4);
        }
        class109 var5 = (class109) class74.field1192.method371(26, (long) arg1.field3968);
        if (var5 != null) {
            class71.method493(arg2, var5.field1689, var3, 127, var4);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)V")
    public static final void method1726(byte arg0, int arg1) {
        class16.field300 = new int[arg1];
        class87.field1366 = new int[arg1];
        class40.field607 = new int[arg1];
        class205.field3303 = new int[arg1];
        class218.field3424 = new int[arg1];
        if (arg0 >= -85) {
            method1726((byte) -2, 115);
        }
        field4211++;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V")
    public final void method1727(byte arg0) {
        if (arg0 != -54) {
            this.method1727((byte) -103);
        }
        field4209++;
        if (this.field4207 != null) {
            this.field4207.field4204 = this.field4204;
            this.field4204.field4207 = this.field4207;
            this.field4207 = null;
            this.field4204 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lcj;B)Z")
    public static final boolean method1728(class125 arg0, byte arg1) {
        if (arg1 != 126) {
            method1726((byte) -80, 106);
        }
        field4212++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field1998) {
            return false;
        } else if (!arg0.method865(arg1 + 24399)) {
            return false;
        } else if (class60.field867.method371(39, (long) arg0.field1980) == null) {
            return class226.field3546.method371(19, (long) arg0.field1983) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)V")
    public static void method1729(int arg0) {
        field4213 = null;
        field4205 = null;
        if (arg0 >= 97) {
            field4210 = null;
        }
    }
}
