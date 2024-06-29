import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class80 {

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field1319 = 0;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field1326 = 0;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Lph;")
    public static class229 field1322 = class266.method1858("::cardmem", 0);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "J")
    public long field1325;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Ll;")
    public class80 field1317;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Ll;")
    public class80 field1318;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "[I")
    public static int[] field1321;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)V", line = 7)
    public static final void method595(int arg0, byte arg1) {
        field1316++;
        if (class169.field2786 == arg0) {
            return;
        }
        if (class169.field2786 == 0) {
            class331.method2266((byte) 113);
        }
        if (arg0 == 40) {
            class116.method878(26666);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg0 != 40 && class263.field4396 != null) {
            class263.field4396.method534(-1);
            class263.field4396 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class69.field1107 = 1;
            class190.field3083 = 0;
            class196.field3280 = 0;
            class272.field4557 = 1;
            class295.field4828 = 0;
            class154.method1116(-1, true);
        }
        if (arg1 > -125) {
            return;
        }
        if (arg0 == 25 || arg0 == 10) {
            class188.method1316(-3);
        }
        if (arg0 == 5) {
            class98.method725(true, class209.field3442);
        } else {
            class180.method1283(29379);
        }
        boolean var3 = class169.field2786 == 5 || class169.field2786 == 10 || class169.field2786 == 28;
        if (var2 != var3) {
            if (var2) {
                class187.field3048 = class289.field4741;
                if (class234.field3860 == 0) {
                    class176.method1271(106, 2);
                } else {
                    class174.method1256(class289.field4741, 2, false, 255, 0, class219.field3599, -95);
                }
                class177.field2921.method178((byte) 24, false);
            } else {
                class176.method1271(-108, 2);
                class177.field2921.method178((byte) 64, true);
            }
        }
        if (class99.field1675 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
            class99.method729();
        }
        class169.field2786 = arg0;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 87)
    public static final void method596(int arg0) {
        if (class169.field2786 == 10 && class99.field1675) {
            method595(28, (byte) -128);
        }
        field1320++;
        if (class169.field2786 == 30) {
            method595(25, (byte) -126);
        }
        if (arg0 != 28) {
            field1321 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V", line = 111)
    public static void method597(int arg0) {
        if (arg0 != 0) {
            method596(-128);
        }
        field1321 = null;
        field1322 = null;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V", line = 149)
    public final void method598(int arg0) {
        if (arg0 <= 4) {
            field1322 = (class229) null;
        }
        field1323++;
        if (this.field1318 != null) {
            this.field1318.field1317 = this.field1317;
            this.field1317.field1318 = this.field1318;
            this.field1318 = null;
            this.field1317 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)Z", line = 177)
    public final boolean method599(int arg0) {
        if (arg0 != 5) {
            this.field1325 = 61L;
        }
        field1324++;
        return this.field1318 != null;
    }
}
