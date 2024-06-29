import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class86 extends class99 {

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "S")
    public static short field1301 = 205;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field1300 = 0;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "Lbf;")
    public static class209 field1298 = new class209(16);

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "Lma;")
    public static class5 field1304 = class12.method119("slr2)3ws?order=LPWM", (byte) 110);

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "Lma;")
    public static class5 field1306 = class12.method119("rot:", (byte) 116);

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "B")
    public static byte field1297;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "Lje;")
    public static class158 field1302;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "Lpg;")
    public static class295 field1307;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lni;Z)V", line = 26)
    public static final void method571(class202 arg0, boolean arg1) {
        class2.field17 = arg0;
        if (arg1) {
            method571((class202) null, true);
        }
        field1296++;
        class301.field5069 = class2.field17.method1326((byte) -124, 4);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lni;Lni;I)V", line = 44)
    public static final void method572(class202 arg0, class202 arg1, int arg2) {
        class282.field4791 = class76.method531((byte) 77, arg0, 0, arg1, class202.field3224);
        field1299++;
        class239.field3973 = class46.method348(-128, arg1, arg0, 0, class202.field3224);
        if (arg2 < 77) {
            field1305 = -54;
        }
        class72.field1127 = class76.method531((byte) 94, arg0, 0, arg1, class80.field1244);
        class201.field3197 = class76.method531((byte) -58, arg0, 0, arg1, class226.field3712);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 64)
    public static void method573(int arg0) {
        if (arg0 < 31) {
            method573(112);
        }
        field1307 = null;
        field1298 = null;
        field1306 = null;
        field1304 = null;
        field1302 = null;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)I", line = 84)
    public static final int method574(int arg0) {
        if (arg0 > -24) {
            method573(101);
        }
        field1295++;
        return 2;
    }
}
