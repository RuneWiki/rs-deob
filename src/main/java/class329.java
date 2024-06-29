import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class329 {

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "Ljava/lang/String;")
    public static String field5099 = "Loading config - ";

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "[F")
    public static float[] field5087 = new float[4];

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public int field5089;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public int field5090;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public int field5091;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public int field5092;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public int field5093;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public int field5096;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public int field5097;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "[B")
    public byte[] field5095;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "[B")
    public byte[] field5100;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "[I")
    public static int[] field5088;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V", line = 4)
    public static void method2243(int arg0) {
        if (arg0 != 4) {
            method2244(-37L, (byte) -79);
        }
        field5087 = null;
        field5099 = null;
        field5088 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(JB)V", line = 31)
    public static final void method2244(long arg0, byte arg1) {
        field5094++;
        if (arg0 == 0L) {
            return;
        }
        class159.field2372.method59(0, (byte) 73);
        class159.field2372.method261(1523335144, arg0);
        if (arg1 == -11) {
            class141.field2178++;
        }
    }
}
