import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class375 extends class254 {

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field5498 = 0;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Lqp;")
    public static class466 field5493 = new class466("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public int field5494;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public int field5495;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public int field5497;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public int field5499;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "Lco;")
    public class77 field5496;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V", line = 6)
    public static void method2240(byte arg0) {
        if (arg0 != 24) {
            method2240((byte) -70);
        }
        field5493 = null;
    }
}
