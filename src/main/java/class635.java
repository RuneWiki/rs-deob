import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class635 extends class389 {

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "B")
    public byte field8981 = 5;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "J")
    public static long field8984 = 0L;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public static int field8980 = 0;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "Lnea;")
    public static class664 field8985 = new class664(91, 8);

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
    public int field8982;

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "I")
    public int field8986;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "I")
    public int field8987;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "I")
    public int field8988;

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "I")
    public int field8989;

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "I")
    public int field8990;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "Z")
    public boolean field8983;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Z)V")
    public static void method3540(boolean arg0) {
        field8985 = null;
        if (!arg0) {
            method3540(true);
        }
    }
}
