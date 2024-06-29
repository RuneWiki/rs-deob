import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class111 extends class31 {

    @OriginalMember(owner = "client!q", name = "T", descriptor = "I")
    public int field2666 = 0;

    @OriginalMember(owner = "client!q", name = "W", descriptor = "Lid;")
    public class60 field2669 = class152.field3405;

    @OriginalMember(owner = "client!q", name = "bb", descriptor = "Lid;")
    public static class60 field2674 = class11.method72("Verbindung konnte nicht hergestellt werden)3", (byte) 93);

    @OriginalMember(owner = "client!q", name = "V", descriptor = "Lid;")
    private static class60 field2668 = class11.method72("Please remove ", (byte) -23);

    @OriginalMember(owner = "client!q", name = "R", descriptor = "Lid;")
    public static class60 field2664 = field2668;

    @OriginalMember(owner = "client!q", name = "U", descriptor = "Lid;")
    public static class60 field2667 = field2668;

    @OriginalMember(owner = "client!q", name = "cb", descriptor = "Lmc;")
    public static class86 field2675 = new class86(4096);

    @OriginalMember(owner = "client!q", name = "X", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "I")
    public int field2671;

    @OriginalMember(owner = "client!q", name = "Z", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!q", name = "ab", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!q", name = "eb", descriptor = "I")
    public int field2677;

    @OriginalMember(owner = "client!q", name = "fb", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!q", name = "gb", descriptor = "I")
    public int field2679;

    @OriginalMember(owner = "client!q", name = "db", descriptor = "[I")
    public int[] field2676;

    @OriginalMember(owner = "client!q", name = "hb", descriptor = "[I")
    public int[] field2680;

    @OriginalMember(owner = "client!q", name = "S", descriptor = "[Lid;")
    public class60[] field2665;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(B)V")
    public static void method897(byte arg0) {
        field2667 = null;
        field2668 = null;
        field2675 = null;
        int var1 = 54 / ((arg0 - 4) / 39);
        field2664 = null;
        field2674 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lof;I)V")
    public final void method898(class103 arg0, int arg1) {
        field2673++;
        while (true) {
            int var3 = arg0.method829((byte) -128);
            if (var3 == 0) {
                if (arg1 == 4096) {
                    return;
                } else {
                    field2674 = null;
                    return;
                }
            }
            this.method899(var3, arg0, 115);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILof;I)V")
    private final void method899(int arg0, class103 arg1, int arg2) {
        if (arg0 == 1) {
            this.field2671 = arg1.method829((byte) -92);
        } else if (arg0 == 2) {
            this.field2679 = arg1.method829((byte) -123);
        } else if (arg0 == 3) {
            this.field2669 = arg1.method841(27330);
        } else if (arg0 == 4) {
            this.field2677 = arg1.method803(false);
        } else if (arg0 == 5) {
            this.field2666 = arg1.method808(-20054);
            this.field2665 = new class60[this.field2666];
            this.field2676 = new int[this.field2666];
            for (int var4 = 0; var4 < this.field2666; var4++) {
                this.field2676[var4] = arg1.method803(false);
                this.field2665[var4] = arg1.method841(27330);
            }
        } else if (arg0 == 6) {
            this.field2666 = arg1.method808(-20054);
            this.field2676 = new int[this.field2666];
            this.field2680 = new int[this.field2666];
            for (int var5 = 0; var5 < this.field2666; var5++) {
                this.field2676[var5] = arg1.method803(false);
                this.field2680[var5] = arg1.method803(false);
            }
        }
        if (arg2 >= 99) {
            field2672++;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BLie;)V")
    public static final void method900(byte arg0, class61 arg1) {
        class141.field3217 = arg1;
        class13.field243 = class141.field3217.method479(16, (byte) -98);
        field2678++;
        if (arg0 <= 87) {
            field2664 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(II)V")
    public static final void method901(int arg0, int arg1) {
        field2670++;
        if (arg0 == -1 || !class132.field3009[arg0]) {
            return;
        }
        class41.field1104.method476(arg0, (byte) 124);
        if (class45.field1177[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = arg1; var3 < class45.field1177[arg0].length; var3++) {
            if (class45.field1177[arg0][var3] != null) {
                if (class45.field1177[arg0][var3].field938 == 2) {
                    var2 = false;
                } else {
                    class45.field1177[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class45.field1177[arg0] = null;
        }
        class132.field3009[arg0] = false;
    }
}
