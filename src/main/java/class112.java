import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class112 {

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "Z")
    public static boolean field1592 = false;

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "Lgba;")
    public static class574 field1589 = new class574(5000);

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V")
    public static final void method817(byte arg0) {
        class117 var1 = class236.field3411;
        synchronized (class236.field3411) {
            class236.field3411.method837(arg0 + 249);
            if (arg0 != -124) {
                method818(-31, -24, true);
            }
        }
        field1588++;
        class117 var2 = class120.field1690;
        synchronized (class120.field1690) {
            class120.field1690.method837(127);
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method818(int arg0, int arg1, boolean arg2) {
        field1591++;
        if (arg2) {
            return (arg1 & 0x10) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)V")
    public static final void method819(int arg0, int arg1) {
        class85.method639(2);
        field1590++;
        int var2 = class110.field1564.method2302(3, arg1).field1722;
        if (var2 == 0) {
            return;
        }
        int var3 = class556.field8280.field5300[arg1];
        if (arg0 < 50) {
            field1589 = null;
        }
        if (var2 == 6) {
            class51.field601 = var3;
        }
        if (var2 == 5) {
            class299.field4105 = var3;
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V")
    public static void method820(int arg0) {
        if (arg0 == -7889) {
            field1589 = null;
        }
    }
}
