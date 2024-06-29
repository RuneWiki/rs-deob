import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class507 extends class147 {

    @OriginalMember(owner = "client!uq", name = "t", descriptor = "J")
    private long field6969 = -1L;

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "Ljava/lang/String;")
    private String field6967 = null;

    @OriginalMember(owner = "client!uq", name = "v", descriptor = "J")
    public static long field6971 = 0L;

    @OriginalMember(owner = "client!uq", name = "s", descriptor = "I")
    public static int field6968 = -1;

    @OriginalMember(owner = "client!uq", name = "z", descriptor = "Lsv;")
    public static class570 field6975 = new class570(34, 4);

    @OriginalMember(owner = "client!uq", name = "B", descriptor = "Lin;")
    public static class380 field6976 = new class380(79, 6);

    @OriginalMember(owner = "client!uq", name = "C", descriptor = "Lsv;")
    public static class570 field6977 = new class570(74, 7);

    @OriginalMember(owner = "client!uq", name = "E", descriptor = "[I")
    public static int[] field6978 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!uq", name = "u", descriptor = "B")
    private byte field6970;

    @OriginalMember(owner = "client!uq", name = "w", descriptor = "I")
    private int field6972;

    @OriginalMember(owner = "client!uq", name = "x", descriptor = "I")
    public static int field6973;

    @OriginalMember(owner = "client!uq", name = "y", descriptor = "I")
    public static int field6974;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lol;I)V", line = 5)
    public final void method1162(class431 arg0, int arg1) {
        field6973++;
        if (arg0.method2557(14929) != 255) {
            arg0.field5983--;
            this.field6969 = arg0.method2567((byte) -127);
        }
        this.field6967 = arg0.method2578(1712145680);
        this.field6972 = arg0.method2565((byte) -84);
        this.field6970 = arg0.method2529(69);
        arg0.method2567((byte) -127);
        if (arg1 < -15 && class224.field3297) {
            System.out.println("memberhash:" + this.field6969 + " membername:" + this.field6967);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)V", line = 35)
    public static void method2968(byte arg0) {
        field6975 = null;
        field6977 = null;
        field6978 = null;
        field6976 = null;
        if (arg0 != 60) {
            method2968((byte) 49);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lhi;B)V", line = 67)
    public final void method1161(class465 arg0, byte arg1) {
        field6974++;
        class40 var3 = new class40();
        int var4 = 8 % ((36 - arg1) / 60);
        var3.field473 = this.field6970;
        var3.field469 = this.field6972;
        var3.field470 = this.field6967;
        arg0.method2714(var3, 5);
    }
}
