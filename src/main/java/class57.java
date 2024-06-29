import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class57 {

    @OriginalMember(owner = "client!g", name = "h", descriptor = "[I")
    public static int[] field1006 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "J")
    public static long field1000;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static final void method385(int arg0) {
        if (arg0 != -1) {
            method386(-92);
        }
        field1004++;
        class82.field1438 = new class192();
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
    public static void method386(int arg0) {
        field1006 = null;
        if (arg0 < 126) {
            field1003 = 124;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILai;)V")
    public static final void method387(int arg0, class10 arg1) {
        field1001++;
        if (class75.field1288 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg1.method62((byte) -90);
        if (var3 == 0L) {
            return;
        }
        while (class75.field1288.length > var2 && class75.field1288[var2].field2291 != var3) {
            var2++;
        }
        if (class75.field1288.length <= var2 || class75.field1288[var2] == null) {
            return;
        }
        if (arg0 <= 122) {
            method389(null, null, null, null, (byte) -41);
        }
        class66.field1152++;
        class76.field1323.method635((byte) -64, 236);
        class76.field1323.method783(class75.field1288[var2].field2291, -30);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I[B)Lte;")
    public static final class177 method388(int arg0, byte[] arg1) {
        field1005++;
        if (arg1 == null) {
            return null;
        }
        class177 var2 = new class177(arg1, class87.field1547, class18.field263, class100.field1857, class145.field2781, class140.field2639, class189.field3615);
        class56.method383(-109);
        if (arg0 != -1) {
            field1003 = -8;
        }
        return var2;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lc;Lai;Lc;Lai;B)Lte;")
    public static final class177 method389(class21 arg0, class10 arg1, class21 arg2, class10 arg3, byte arg4) {
        if (arg4 == 96) {
            field999++;
            int var5 = arg0.method156(0, arg3);
            int var6 = arg0.method154(var5, true, arg1);
            return class145.method1009(arg4 - 99, var6, arg0, arg2, var5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
    public static final void method390(int arg0) {
        if (arg0 > 68) {
            class144.field2719.method226((byte) -90);
            field1002++;
        }
    }
}
