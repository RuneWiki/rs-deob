import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public class class221 {

    @OriginalMember(owner = "client!uga", name = "f", descriptor = "[I")
    public static int[] field2866 = new int[1];

    @OriginalMember(owner = "client!uga", name = "c", descriptor = "I")
    public int field2863;

    @OriginalMember(owner = "client!uga", name = "e", descriptor = "I")
    public int field2865;

    @OriginalMember(owner = "client!uga", name = "g", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!uga", name = "h", descriptor = "I")
    public int field2868;

    @OriginalMember(owner = "client!uga", name = "i", descriptor = "I")
    public int field2869;

    @OriginalMember(owner = "client!uga", name = "j", descriptor = "I")
    public int field2870;

    @OriginalMember(owner = "client!uga", name = "k", descriptor = "I")
    public int field2871;

    @OriginalMember(owner = "client!uga", name = "l", descriptor = "I")
    public int field2872;

    @OriginalMember(owner = "client!uga", name = "d", descriptor = "J")
    public static long field2864;

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "[B")
    public byte[] field2861;

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "[B")
    public byte[] field2862;

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(BB)Z")
    public static final boolean method1411(byte arg0, byte arg1) {
        field2867++;
        if (arg0 > -90) {
            field2866 = null;
        }
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            return false;
        } else {
            return var2 < 128 || var2 >= 160 || class652.field8796[var2 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(I)V")
    public static void method1412(int arg0) {
        field2866 = null;
        if (arg0 != -14211) {
            method1412(-57);
        }
    }
}
