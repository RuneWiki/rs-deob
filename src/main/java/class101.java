import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class101 extends class22 {

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
    public static int field2257 = -1;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "Lva;")
    private static class121 field2253 = class107.method797("Unable to connect)3", -10983);

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "Lva;")
    public static class121 field2261 = field2253;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "Lva;")
    private static class121 field2249 = class107.method797("Public chat", -10983);

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "Lva;")
    public static class121 field2251 = field2253;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
    public static int field2262 = 0;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "Lva;")
    public static class121 field2260 = class107.method797("title)3jpg", -10983);

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "Lva;")
    public static class121 field2265 = field2249;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
    public static int field2266 = 0;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "Lva;")
    private static class121 field2267 = class107.method797("Try again in 60 secs)3)3)3", -10983);

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "Lva;")
    public static class121 field2264 = field2267;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "I")
    public int field2254;

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "Lbe;")
    public class12 field2259;

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "Lle;")
    public class71 field2252;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "[B")
    public byte[] field2263;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "[I")
    public static int[] field2248;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lhe;I)V", line = 13)
    public static final void method683(class47 arg0, int arg1) {
        if (arg1 < -74) {
            class120.field2774 = arg0;
            field2247++;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/awt/Component;ILs;)Lfe;", line = 24)
    public static final class36 method684(Component arg0, int arg1, class105 arg2) {
        if (arg1 != 0) {
            method684(null, -66, null);
        }
        class28.method223(arg2, arg0, (byte) 88);
        field2256++;
        class36 var3 = new class36();
        class27.method209(103, var3);
        return var3;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 54)
    public static void method685(int arg0) {
        if (arg0 != 0) {
            method685(-37);
        }
        field2260 = null;
        field2253 = null;
        field2249 = null;
        field2267 = null;
        field2248 = null;
        field2251 = null;
        field2265 = null;
        field2261 = null;
        field2264 = null;
    }
}
