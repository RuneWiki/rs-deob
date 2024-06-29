import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class70 extends class120 {

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    private int field1476;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    private int field1478;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    private int field1479;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    private int field1480;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "Z")
    public static boolean field1477 = false;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "J")
    public static long field1481 = 0L;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "Ljava/lang/String;")
    public static String field1487 = "Prepared sound engine";

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "Lbm;")
    public static class307 field1485;

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(IIIIII)V", line = 4)
    public class70(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1476 = arg0;
        this.field1478 = arg2;
        this.field1479 = arg1;
        this.field1480 = arg3;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIZ)V", line = 17)
    public final void method293(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method293(-110, -119, false);
        }
        field1484++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 31)
    public static void method538(byte arg0) {
        field1485 = null;
        if (arg0 != 9) {
            method538((byte) 114);
        }
        field1487 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V", line = 50)
    public final void method290(int arg0, int arg1, int arg2) {
        field1488++;
        if (arg0 >= -46) {
            this.field1478 = 84;
        }
        int var4 = this.field1478 * arg1 >> 12;
        int var5 = this.field1476 * arg1 >> 12;
        int var6 = this.field1479 * arg2 >> 12;
        int var7 = this.field1480 * arg2 >> 12;
        class191.method1221(var4, this.field2084, (byte) -106, var6, var5, var7);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(IIZ)V", line = 79)
    public final void method292(int arg0, int arg1, boolean arg2) {
        field1483++;
        if (arg2) {
            this.method293(-28, 111, false);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZIII)V", line = 91)
    public static final void method539(boolean arg0, int arg1, int arg2, int arg3) {
        field1489++;
        class2 var4 = class212.method1433(arg1, 9, -13802);
        if (arg0) {
            field1477 = false;
        }
        var4.method13((byte) -1);
        var4.field39 = arg2;
        var4.field43 = arg3;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V", line = 110)
    public static final void method540(byte arg0) {
        field1482++;
        class148.field2423 = null;
        class345.field5355 = null;
        class26.field510 = null;
        class210.field3388 = null;
        if (arg0 != 91) {
            method540((byte) 122);
        }
    }
}
