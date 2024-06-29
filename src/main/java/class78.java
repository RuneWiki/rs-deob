import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class78 {

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    public static int field984 = 104;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "[I")
    public static int[] field985 = new int[50];

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "Lrb;")
    public static class436 field986;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)V")
    public static void method541(byte arg0) {
        field986 = null;
        field985 = null;
        int var1 = -73 / ((arg0 - 36) / 50);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
    public static final void method542(int arg0) {
        class440.field6409.method2307(58);
        field983++;
        class347.field5110.method2307(65);
        if (arg0 != -14274) {
            field984 = 24;
        }
    }
}
