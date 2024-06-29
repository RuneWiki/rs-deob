import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class120 extends class513 {

    @OriginalMember(owner = "client!rea", name = "p", descriptor = "[F")
    public static float[] field1654 = new float[16];

    @OriginalMember(owner = "client!rea", name = "k", descriptor = "Lhj;")
    public static class46 field1649 = new class46();

    @OriginalMember(owner = "client!rea", name = "s", descriptor = "I")
    public static int field1657 = 0;

    @OriginalMember(owner = "client!rea", name = "l", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!rea", name = "m", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!rea", name = "n", descriptor = "I")
    public int field1652;

    @OriginalMember(owner = "client!rea", name = "r", descriptor = "I")
    public int field1656;

    @OriginalMember(owner = "client!rea", name = "q", descriptor = "Lju;")
    public class102 field1655;

    @OriginalMember(owner = "client!rea", name = "o", descriptor = "Lwn;")
    public class583 field1653;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IBI)Z")
    public static final boolean method781(int arg0, byte arg1, int arg2) {
        field1651++;
        int var3 = -25 / ((arg1 + 69) / 49);
        return (arg2 & 0x70000) != 0 | class311.method1818(arg0, arg2, false) || class731.method4068(arg0, -210571632, arg2);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V")
    public final void method782(int arg0) {
        field1650++;
        if (arg0 != 16) {
            this.field1655 = null;
        }
        if (class663.field9345.length > class631.field8990) {
            class663.field9345[class631.field8990++] = this;
        }
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(I)V")
    public static void method783(int arg0) {
        field1654 = null;
        if (arg0 <= 24) {
            field1649 = null;
        }
        field1649 = null;
    }
}
