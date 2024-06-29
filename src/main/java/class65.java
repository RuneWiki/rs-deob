import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class65 extends class69 {

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "Lmc;")
    public static class75 field1704 = class30.method234(true, ": ");

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "Lmc;")
    public static class75 field1708 = class30.method234(true, "::errortest");

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
    public static int field1713 = 0;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "Lmc;")
    public static class75 field1712 = class30.method234(true, "Konfig geladen)3");

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "Lmc;")
    public static class75 field1715 = class30.method234(true, "(Z");

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
    public int field1711;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "Lbe;")
    public class12 field1706;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "Lja;")
    public static class55 field1703;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "Lp;")
    public class90 field1707;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "[B")
    public byte[] field1709;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V", line = 9)
    public static void method567(int arg0) {
        field1715 = null;
        field1704 = null;
        field1712 = null;
        field1703 = null;
        if (arg0 != 128) {
            field1710 = 122;
        }
        field1708 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBIILje;I)V", line = 38)
    public static final void method568(int arg0, byte arg1, int arg2, int arg3, class59 arg4, int arg5) {
        field1705++;
        class100 var6 = new class100();
        var6.field2574 = arg4.field1522;
        var6.field2565 = arg4.field1492;
        int var7 = arg4.field1530;
        var6.field2572 = arg2;
        var6.field2571 = arg5 * 128;
        var6.field2578 = arg4.field1497;
        var6.field2598 = arg4.field1513 * 128;
        var6.field2570 = arg4.field1499;
        int var8 = arg4.field1525;
        if (arg3 == 1 || arg3 == 3) {
            var7 = arg4.field1525;
            var8 = arg4.field1530;
        }
        var6.field2569 = (arg5 + var8) * 128;
        var6.field2579 = (arg0 + var7) * 128;
        if (arg1 != 65) {
            return;
        }
        var6.field2566 = arg0 * 128;
        if (arg4.field1484 != null) {
            var6.field2583 = arg4;
            var6.method834(-116);
        }
        class90.field2210.method245(var6, 0);
        if (var6.field2578 != null) {
            var6.field2575 = (int) ((double) (var6.field2565 - var6.field2570) * Math.random()) + var6.field2570;
        }
    }
}
