import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class175 extends class383 {

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "[F")
    public static float[] field2274 = new float[16];

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "[I")
    public static int[] field2278 = new int[2];

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "F")
    public static float field2276;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public int field2273;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public int field2279;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "[I")
    public static int[] field2275;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method1119(byte arg0, String arg1) {
        field2280++;
        int var2 = arg1.length();
        if (arg0 != -80) {
            return -110L;
        }
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = ((var3 << 5) + ((long) arg1.charAt(var5))) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public static void method1120(int arg0) {
        field2278 = null;
        field2275 = null;
        if (arg0 != 16) {
            method1120(-74);
        }
        field2274 = null;
    }
}
