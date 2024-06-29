import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class153 extends class200 {

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "[I")
    public static int[] field2422 = new int[100];

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "[Z")
    public static boolean[] field2429 = new boolean[5];

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "Lan;")
    private class20 field2423;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(IIB)I")
    public final int method1159(int arg0, int arg1, byte arg2) {
        field2424++;
        if (this.field2423 == null) {
            return arg1;
        }
        if (arg2 != 98) {
            this.method1163((byte) -13, -90, null);
        }
        class451 var4 = (class451) this.field2423.method171((byte) -103, (long) arg0);
        return var4 == null ? arg1 : var4.field6742;
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)V")
    public static void method1160(int arg0) {
        if (arg0 != 4642) {
            method1160(-126);
        }
        field2422 = null;
        field2429 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lcu;B)V")
    public final void method1161(class145 arg0, byte arg1) {
        if (arg1 < 44) {
            return;
        }
        while (true) {
            int var3 = arg0.method1063((byte) -61);
            if (var3 == 0) {
                field2425++;
                return;
            }
            this.method1164(arg0, var3, -90);
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(Ljava/lang/String;II)V")
    public static final void method1162(String arg0, int arg1, int arg2) {
        field2427++;
        class54 var3 = class442.method2651(arg1, 3, -13208);
        var3.method480(arg2);
        var3.field931 = arg0;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BILjava/lang/String;)Ljava/lang/String;")
    public final String method1163(byte arg0, int arg1, String arg2) {
        field2426++;
        if (this.field2423 == null) {
            return arg2;
        } else {
            int var4 = -37 / ((arg0 + 36) / 34);
            class521 var5 = (class521) this.field2423.method171((byte) -86, (long) arg1);
            return var5 == null ? arg2 : var5.field7736;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lcu;II)V")
    private final void method1164(class145 arg0, int arg1, int arg2) {
        if (arg1 == 249) {
            int var4 = arg0.method1063((byte) 104);
            if (this.field2423 == null) {
                int var5 = class51.method464(1905326856, var4);
                this.field2423 = new class20(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1063((byte) 106) == 1;
                int var8 = arg0.method1085(106);
                class320 var9;
                if (var7) {
                    var9 = new class521(arg0.method1101((byte) -89));
                } else {
                    var9 = new class451(arg0.method1070(-32387));
                }
                this.field2423.method166(var9, (long) var8, -90);
            }
        }
        if (arg2 <= -69) {
            field2428++;
        }
    }
}
