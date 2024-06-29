import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class175 {

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
    public static int field2678 = 0;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "Ljv;")
    public static class55 field2676 = new class55(260);

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "Lpi;")
    public static class342 field2680 = new class342("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
    public static int field2681 = 0;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
    public static int field2682 = 13156520;

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 14)
    public static final void method1257(String arg0, int arg1) {
        System.out.println("Error: " + class111.method831(arg0, "%0a", (byte) 81, "\n"));
        if (arg1 != 14660) {
            method1257(null, -115);
        }
        field2677++;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V", line = 36)
    public static void method1258(byte arg0) {
        if (arg0 == 56) {
            field2676 = null;
            field2680 = null;
        }
    }
}
