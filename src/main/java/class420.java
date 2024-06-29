import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class420 extends class302 {

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "Z")
    public static boolean field5888 = false;

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "[Lji;")
    public static class611[] field5891 = new class611[2048];

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "Lsfa;")
    public static class696 field5890 = new class696();

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(B)V")
    public static void method2403(byte arg0) {
        if (arg0 > -2) {
            method2403((byte) -40);
        }
        field5891 = null;
        field5890 = null;
    }
}
