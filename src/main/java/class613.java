import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class613 {

    @OriginalMember(owner = "client!nw", name = "f", descriptor = "Z")
    public boolean field8238 = true;

    @OriginalMember(owner = "client!nw", name = "h", descriptor = "Lmaa;")
    public static class497 field8240;

    @OriginalMember(owner = "client!nw", name = "j", descriptor = "Lmaa;")
    public static class497 field8242 = field8240 = new class497(false);

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "C")
    private char field8235;

    @OriginalMember(owner = "client!nw", name = "m", descriptor = "D")
    public static double field8245;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "I")
    public static int field8233;

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "I")
    public static int field8236;

    @OriginalMember(owner = "client!nw", name = "e", descriptor = "I")
    public static int field8237;

    @OriginalMember(owner = "client!nw", name = "g", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!nw", name = "i", descriptor = "I")
    public static int field8241;

    @OriginalMember(owner = "client!nw", name = "k", descriptor = "I")
    public static int field8243;

    @OriginalMember(owner = "client!nw", name = "l", descriptor = "I")
    public int field8244;

    @OriginalMember(owner = "client!nw", name = "n", descriptor = "J")
    public static long field8246;

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "Ljava/lang/String;")
    public String field8234;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(BI)V")
    public static final void method3468(byte arg0, int arg1) {
        field8236++;
        int var2 = 27 / ((arg0 + 10) / 37);
        class720.field10105 = 100;
        class137.field1713 = arg1;
        class587.field7997 = -1;
        class446.field5988 = 3;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)V")
    public static final void method3469(int arg0) {
        class266.field3145.method2729(-48);
        if (arg0 != 31897) {
            field8242 = null;
        }
        field8233++;
        class535.field7533 = 0;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Les;II)V")
    private final void method3470(class403 arg0, int arg1, int arg2) {
        field8241++;
        if (arg1 == 1) {
            this.field8235 = class625.method3550(arg0.method2392(-84), (byte) 117);
        } else if (arg1 == 2) {
            this.field8244 = arg0.method2381((byte) 107);
        } else if (arg1 == 4) {
            this.field8238 = false;
        } else if (arg1 == 5) {
            this.field8234 = arg0.method2384(arg2 ^ 0xFFFFC671);
        }
        if (arg2 != 8364) {
            this.field8238 = true;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(B)V")
    public static void method3471(byte arg0) {
        field8240 = null;
        if (arg0 > -86) {
            method3469(52);
        }
        field8242 = null;
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(B)Z")
    public final boolean method3472(byte arg0) {
        if (arg0 > -116) {
            method3468((byte) -56, -2);
        }
        field8243++;
        return this.field8235 == 's';
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILes;)V")
    public final void method3473(int arg0, class403 arg1) {
        field8237++;
        while (true) {
            int var3 = arg1.method2396((byte) -93);
            if (var3 == 0) {
                if (arg0 == 0) {
                    return;
                } else {
                    method3469(24);
                    return;
                }
            }
            this.method3470(arg1, var3, arg0 ^ 0x20AC);
        }
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)V")
    public static final void method3474(int arg0) {
        class790.field10877 = arg0;
        for (int var1 = 0; var1 < class307.field3799; var1++) {
            for (int var2 = 0; var2 < class250.field2938; var2++) {
                if (class107.field1351[arg0][var1][var2] == null) {
                    class107.field1351[arg0][var1][var2] = new class727(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "(B)V")
    public static final void method3475(byte arg0) {
        if (class303.field3619 != 0) {
            if (class436.field5748 != null) {
                class436.field5748.method768(0);
                class436.field5748 = null;
            }
            class396.method2326(arg0 ^ 0x7A);
            class365.method2131((byte) -120);
        }
        field8239++;
        if (arg0 != 20) {
            method3468((byte) 58, -55);
        }
    }
}
