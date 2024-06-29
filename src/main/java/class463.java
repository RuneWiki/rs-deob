import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class463 {

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
    public static int field5904 = 0;

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "Lrga;")
    public static class280 field5899 = new class280(70, 1);

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "[Lvj;")
    public static class422[] field5907 = new class422[16];

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "I")
    public int field5895;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
    public int field5896;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "I")
    public int field5897;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "I")
    public int field5898;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
    public int field5900;

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "I")
    public int field5903;

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "I")
    public int field5905;

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "[B")
    public byte[] field5902;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "[B")
    public byte[] field5906;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(JJ)J", line = 11)
    public static long method2462(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V", line = 27)
    public static void method2463(int arg0) {
        field5907 = null;
        if (arg0 >= 120) {
            field5899 = null;
        }
    }
}
