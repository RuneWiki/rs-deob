import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class197 extends RuntimeException {

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Ljava/lang/String;")
    public String field2803;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2807;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "[I")
    public static int[] field2805 = new int[32];

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field2809 = 0;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "[I")
    public static int[] field2810 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Lwj;")
    public static class130 field2804;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Lbc;")
    public static class282 field2801;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "[[[B")
    public static byte[][][] field2806;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static final void method1270(int arg0) {
        class255.field3684 = null;
        field2808++;
        class39.method246(0, 0, client.field4437, -122, arg0, -1, class123.field1776, 0, class84.field1166);
        if (class255.field3684 != null) {
            class35.method218(0, class4.field58, class100.field1369, class255.field3684, -1412584499, client.field4437, 127, 0, class84.field1166, class219.field3093.field1072);
            class255.field3684 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static void method1271(byte arg0) {
        field2804 = null;
        field2806 = null;
        field2801 = null;
        field2810 = null;
        field2805 = null;
        if (arg0 <= 33) {
            method1271((byte) 51);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI)V")
    public static final void method1272(byte arg0, int arg1) {
        field2802++;
        class204.field2898.method62(-58, arg1);
        if (arg0 != 80) {
            field2809 = 50;
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class197(Throwable arg0, String arg1) {
        this.field2803 = arg1;
        this.field2807 = arg0;
    }
}
