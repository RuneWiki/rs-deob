import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ia")
public class class18 {

    @OriginalMember(owner = "mapview!ia", name = "f", descriptor = "Lu;")
    public static class38 field180 = class28.method177("Short)2cut", (byte) -84);

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "[[B")
    public static byte[][] field177 = new byte[250][];

    @OriginalMember(owner = "mapview!ia", name = "h", descriptor = "Z")
    public static boolean field182 = false;

    @OriginalMember(owner = "mapview!ia", name = "k", descriptor = "Lu;")
    public static class38 field185 = class28.method177("Legende", (byte) -84);

    @OriginalMember(owner = "mapview!ia", name = "d", descriptor = "Z")
    public static volatile boolean field178 = false;

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "I")
    public static volatile int field176 = -1;

    @OriginalMember(owner = "mapview!ia", name = "l", descriptor = "I")
    public static int field186 = -1;

    @OriginalMember(owner = "mapview!ia", name = "g", descriptor = "I")
    public static int field181 = 500;

    @OriginalMember(owner = "mapview!ia", name = "m", descriptor = "[J")
    public static long[] field187 = new long[32];

    @OriginalMember(owner = "mapview!ia", name = "j", descriptor = "Z")
    public static boolean field184 = true;

    @OriginalMember(owner = "mapview!ia", name = "n", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "mapview!ia", name = "i", descriptor = "Lea;")
    public static class10 field183;

    @OriginalMember(owner = "mapview!ia", name = "e", descriptor = "Z")
    public static boolean field179;

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "[I")
    public static int[] field175;

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(I)V", line = 24)
    public static void method105(int arg0) {
        field183 = null;
        field177 = null;
        field175 = null;
        field180 = null;
        if (arg0 != 250) {
            method106(-11);
        }
        field185 = null;
        field187 = null;
    }

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "(I)J", line = 86)
    public static final synchronized long method106(int arg0) {
        if (arg0 != -1) {
            return -32L;
        }
        long var1 = System.currentTimeMillis();
        if (class20.field201 > var1) {
            class8.field79 += class20.field201 - var1;
        }
        class20.field201 = var1;
        return var1 + class8.field79;
    }
}
