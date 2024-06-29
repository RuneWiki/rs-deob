import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class68 extends class389 {

    @OriginalMember(owner = "client!sga", name = "l", descriptor = "Ldh;")
    public static class320 field691 = new class320(4, -1);

    @OriginalMember(owner = "client!sga", name = "p", descriptor = "I")
    public static int field695 = 0;

    @OriginalMember(owner = "client!sga", name = "o", descriptor = "Ltp;")
    public static class532 field694 = null;

    @OriginalMember(owner = "client!sga", name = "i", descriptor = "I")
    public int field688;

    @OriginalMember(owner = "client!sga", name = "k", descriptor = "I")
    public int field690;

    @OriginalMember(owner = "client!sga", name = "m", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!sga", name = "q", descriptor = "I")
    public int field696;

    @OriginalMember(owner = "client!sga", name = "r", descriptor = "I")
    public int field697;

    @OriginalMember(owner = "client!sga", name = "s", descriptor = "I")
    public int field698;

    @OriginalMember(owner = "client!sga", name = "t", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!sga", name = "u", descriptor = "I")
    public int field700;

    @OriginalMember(owner = "client!sga", name = "n", descriptor = "J")
    public static long field693;

    @OriginalMember(owner = "client!sga", name = "j", descriptor = "Ljava/lang/String;")
    public String field689;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(B)V")
    public static void method497(byte arg0) {
        if (arg0 > 13) {
            field691 = null;
            field694 = null;
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lha;B)V")
    public static final void method498(class58 arg0, byte arg1) {
        if (arg1 != -80) {
            return;
        }
        field692++;
        if (class644.field9214) {
            class2.method5(arg0, -1);
        } else {
            class364.method2126(arg0, (byte) 51);
        }
    }
}
