import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class676 extends class270 {

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "Lpr;")
    public static class407 field9581 = new class407(47, 5);

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "Loh;")
    public static class368 field9584 = new class368();

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "I")
    public static int field9588 = 0;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public int field9573;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field9575;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public int field9576;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public int field9577;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public int field9579;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
    public int field9583;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "I")
    public int field9586;

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "Lrt;")
    public static class208 field9587;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "Lep;")
    public class382 field9578;

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "Lep;")
    public class382 field9585;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "Ljava/lang/String;")
    public String field9574;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "Z")
    public boolean field9582;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "[Ljava/lang/Object;")
    public Object[] field9580;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V", line = 8)
    public static void method3779(byte arg0) {
        field9581 = null;
        int var1 = -115 / ((-arg0 - 69) / 42);
        field9587 = null;
        field9584 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLjava/lang/String;)I", line = 34)
    public static final int method3780(byte arg0, String arg1) {
        field9575++;
        if (arg1 == null) {
            return -1;
        }
        int var2 = 0;
        if (arg0 < 100) {
            field9584 = null;
        }
        while (class210.field2549 > var2) {
            if (arg1.equalsIgnoreCase(class314.field4077[var2])) {
                return var2;
            }
            var2++;
        }
        return -1;
    }
}
