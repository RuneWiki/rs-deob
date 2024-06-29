import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class157 extends class120 {

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "Lwf;")
    public static class79 field2333 = new class79(22, 6);

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "Lwf;")
    public static class79 field2339 = new class79(31, 3);

    @OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
    public static int field2344 = 328;

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "Lus;")
    public static class1 field2342 = new class1(64, 6);

    @OriginalMember(owner = "client!uk", name = "C", descriptor = "F")
    public static float field2346 = 0.0F;

    @OriginalMember(owner = "client!uk", name = "D", descriptor = "J")
    public static long field2347 = 0L;

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "Lkr;")
    public static class486 field2349 = new class486();

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public int field2330;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public int field2331;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    public int field2335;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "I")
    public int field2340;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
    public int field2341;

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "I")
    public int field2343;

    @OriginalMember(owner = "client!uk", name = "B", descriptor = "Lhi;")
    public static class125 field2345;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "Lb;")
    public static class201 field2337;

    @OriginalMember(owner = "client!uk", name = "E", descriptor = "Lb;")
    public static class201 field2348;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "Ljava/lang/String;")
    public String field2336;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ldt;I)Ldt;")
    public static final class145 method986(class145 arg0, int arg1) {
        field2329++;
        if (arg0.field1947 != -1) {
            return class166.method1028(arg0.field1947, 74);
        }
        int var2 = arg0.field1933 >>> 16;
        class478 var3 = new class478(class146.field2146);
        if (arg1 != -24360) {
            return null;
        }
        for (class465 var4 = (class465) var3.method2797((byte) -92); var4 != null; var4 = (class465) var3.method2795(-1)) {
            if (var4.field6502 == var2) {
                return class166.method1028((int) var4.field3568, 72);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lcj;B)V")
    public static final void method987(class451 arg0, byte arg1) {
        if (arg1 >= -86) {
            field2338 = -106;
        }
        field2334++;
        if (!class19.field260) {
            arg0.method1510((byte) -13);
            class476.field6690--;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)V")
    public static void method988(byte arg0) {
        field2345 = null;
        field2337 = null;
        field2349 = null;
        if (arg0 > 87) {
            field2342 = null;
            field2339 = null;
            field2333 = null;
            field2348 = null;
        }
    }
}
