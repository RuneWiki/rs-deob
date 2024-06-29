import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class263 {

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "[I")
    public static int[] field3315 = new int[1000];

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3316 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "Lde;")
    public static class534 field3317 = new class534(30);

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "[I")
    public static int[] field3320 = new int[1000];

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field3319 = 0;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "Lkg;")
    public static class275 field3318 = new class275(72, -1);

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V", line = 3)
    public static void method1577(int arg0) {
        field3320 = null;
        field3317 = null;
        field3316 = null;
        field3315 = null;
        field3318 = null;
        if (arg0 != 1000) {
            method1577(-72);
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V", line = 26)
    public static final void method1578(int arg0) {
        if (arg0 != 1537192584) {
            method1577(-55);
        }
        for (int var1 = 0; var1 < class646.field8947; var1++) {
            int var2 = class751.field10483[var1];
            class592 var3 = (class592) class207.field2745.method1160((long) var2, 127);
            if (var3 != null) {
                class733 var4 = var3.field8280;
                class203.method1314(var4, var4.field10192.field1918, -117);
            }
        }
        field3314++;
    }
}
