import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class332 {

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "Ljava/lang/String;")
    public static String field5316 = "glow2:";

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Lvh;")
    public static class62 field5309 = new class62(30);

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V", line = 6)
    public static void method2298(int arg0) {
        field5316 = null;
        if (arg0 != -22396) {
            field5316 = (String) null;
        }
        field5309 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IJ)V", line = 31)
    public static final void method2299(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var5) {
        }
        field5310++;
        int var4 = 10 % ((arg0 + 21) / 52);
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V", line = 78)
    public static final void method2300(int arg0) {
        field5315++;
        if (arg0 != 87) {
            field5314 = -55;
        }
        if (class105.field1451) {
            class86.field1135 = null;
            class105.field1451 = false;
            class43.field475 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILnk;IB)[Lpa;", line = 106)
    public static final class2[] method2301(int arg0, class16 arg1, int arg2, byte arg3) {
        field5313++;
        if (class102.method648(arg0, -1000000000, arg2, arg1)) {
            if (arg3 > -77) {
                method2299(-40, -46L);
            }
            return class197.method1377(-23251);
        } else {
            return null;
        }
    }
}
