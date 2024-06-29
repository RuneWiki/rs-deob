import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class653 extends class333 {

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "[Lkv;")
    public static class214[] field9160 = new class214[1024];

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
    public int field9157;

    @OriginalMember(owner = "client!qq", name = "m", descriptor = "I")
    public int field9159;

    @OriginalMember(owner = "client!qq", name = "q", descriptor = "I")
    public static int field9163;

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "Lsb;")
    public class305 field9161;

    @OriginalMember(owner = "client!qq", name = "p", descriptor = "Lla;")
    public static class413 field9162;

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "Lce;")
    public class445 field9158;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V", line = 11)
    public final void method3636(byte arg0) {
        field9163++;
        if (class364.field4885.length > class381.field5163) {
            class364.field4885[class381.field5163++] = this;
            if (arg0 != -87) {
                method3637(3);
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V", line = 25)
    public static void method3637(int arg0) {
        field9162 = null;
        field9160 = null;
        if (arg0 != 1024) {
            method3637(73);
        }
    }
}
