import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class74 {

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "F")
    public static float field860 = 0.0F;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "S")
    public static short field861 = 256;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "[[Z")
    public static boolean[][] field864 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "Lqu;")
    public static class364 field862 = new class364(72, -1);

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)V", line = 5)
    public static void method432(boolean arg0) {
        field864 = null;
        if (arg0) {
            method432(false);
        }
        field862 = null;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BLjava/lang/String;)J", line = 27)
    public static final long method433(byte arg0, String arg1) {
        field863++;
        if (arg0 != 99) {
            field860 = -0.5732813F;
        }
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = ((var3 << 5) + ((long) arg1.charAt(var5))) - var3;
        }
        return var3;
    }
}
