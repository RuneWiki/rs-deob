import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class101 {

    @OriginalMember(owner = "client!dba", name = "k", descriptor = "[I")
    public static int[] field1414 = new int[8];

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "[I")
    public static int[] field1408 = new int[1];

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "[[Ljava/lang/String;")
    public static String[][] field1407 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!dba", name = "g", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!dba", name = "h", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!dba", name = "l", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "J")
    public long field1409;

    @OriginalMember(owner = "client!dba", name = "i", descriptor = "Ldba;")
    public class101 field1412;

    @OriginalMember(owner = "client!dba", name = "m", descriptor = "Ldba;")
    public class101 field1416;

    @OriginalMember(owner = "client!dba", name = "j", descriptor = "Ltm;")
    public static class412 field1413;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIB)B", line = 5)
    public static final byte method787(int arg0, int arg1, byte arg2) {
        field1404++;
        if (arg2 != -66) {
            field1408 = null;
        }
        if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(III)Z", line = 27)
    public static final boolean method788(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            field1413 = null;
        }
        field1415++;
        return (arg2 & 0xC580) != 0;
    }

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "(Z)V", line = 41)
    public static void method789(boolean arg0) {
        field1414 = null;
        field1413 = null;
        field1408 = null;
        field1407 = null;
        if (arg0) {
            field1413 = null;
        }
    }

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "(I)Z", line = 54)
    public final boolean method790(int arg0) {
        field1410++;
        if (arg0 == 1) {
            return this.field1416 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 73)
    public static final String method791(byte arg0, String arg1) {
        field1411++;
        int var2 = 45 % ((arg0 + 1) / 62);
        String var3 = class23.method184(class548.method3108((byte) 17, arg1), false);
        if (var3 == null) {
            var3 = "";
        }
        return var3;
    }

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(B)V", line = 88)
    public final void method792(byte arg0) {
        field1406++;
        if (this.field1416 == null) {
            return;
        }
        this.field1416.field1412 = this.field1412;
        this.field1412.field1416 = this.field1416;
        this.field1412 = null;
        this.field1416 = null;
        if (arg0 > -87) {
            method791((byte) -115, null);
        }
    }

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "(B)V", line = 106)
    public static final void method793(byte arg0) throws IOException {
        int var1 = -84 / ((38 - arg0) / 33);
        if (class457.field6340 != null && class718.field10015 > 0) {
            class104.field1435.field5459 = 0;
            while (true) {
                class267 var2 = (class267) class200.field2655.method2551((byte) -108);
                if (var2 == null || (class104.field1435.field5518.length - class104.field1435.field5459) < var2.field3940) {
                    class457.field6340.method3024(0, class104.field1435.field5459, 55, class104.field1435.field5518);
                    class88.field1232 = 0;
                    class757.field10506 += class104.field1435.field5459;
                    break;
                }
                class104.field1435.method2403(var2.field3938.field5518, var2.field3940, 128, 0);
                class718.field10015 -= var2.field3940;
                var2.method792((byte) -117);
                var2.field3938.method2414(0);
                var2.method1743((byte) 93);
            }
        }
        field1405++;
    }
}
