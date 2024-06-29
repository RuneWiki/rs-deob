import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class12 extends class101 {

    @OriginalMember(owner = "client!daa", name = "q", descriptor = "I")
    public static int field180 = 0;

    @OriginalMember(owner = "client!daa", name = "y", descriptor = "Ljw;")
    public static class581 field188 = new class581(121, 3);

    @OriginalMember(owner = "client!daa", name = "o", descriptor = "I")
    public int field178;

    @OriginalMember(owner = "client!daa", name = "r", descriptor = "I")
    public int field181;

    @OriginalMember(owner = "client!daa", name = "s", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!daa", name = "t", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!daa", name = "u", descriptor = "I")
    public int field184;

    @OriginalMember(owner = "client!daa", name = "v", descriptor = "I")
    public int field185;

    @OriginalMember(owner = "client!daa", name = "x", descriptor = "I")
    public int field187;

    @OriginalMember(owner = "client!daa", name = "B", descriptor = "I")
    public int field191;

    @OriginalMember(owner = "client!daa", name = "C", descriptor = "Loja;")
    public static class480 field192;

    @OriginalMember(owner = "client!daa", name = "z", descriptor = "Lor;")
    public class668 field189;

    @OriginalMember(owner = "client!daa", name = "A", descriptor = "Lor;")
    public class668 field190;

    @OriginalMember(owner = "client!daa", name = "n", descriptor = "Ljava/lang/String;")
    public String field177;

    @OriginalMember(owner = "client!daa", name = "p", descriptor = "Z")
    public boolean field179;

    @OriginalMember(owner = "client!daa", name = "w", descriptor = "[Ljava/lang/Object;")
    public Object[] field186;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)V")
    public static void method92(byte arg0) {
        field192 = null;
        field188 = null;
        if (arg0 != -57) {
            field180 = -38;
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(BCLjava/lang/String;)I")
    public static final int method93(byte arg0, char arg1, String arg2) {
        field183++;
        int var3 = 0;
        int var4 = arg2.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg1 == arg2.charAt(var5)) {
                var3++;
            }
        }
        int var6 = -75 / ((85 - arg0) / 34);
        return var3;
    }

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "(B)V")
    public static final void method94(byte arg0) {
        class103.method796(false, (byte) -95);
        field182++;
        if (class417.field5982 >= 0 && class417.field5982 != 0) {
            class793.method4365((byte) -41, false, class417.field5982);
            class417.field5982 = -1;
        }
        if (arg0 != 121) {
            method92((byte) -66);
        }
    }
}
