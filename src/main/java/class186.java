import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class186 extends class151 {

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public static int field3203 = -1;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public static int field3200 = 0;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
    public static int field3214 = 2301979;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "Lbd;")
    private static class162 field3206 = class17.method142(0, "white:");

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "Lbd;")
    public static class162 field3216 = class17.method142(0, ")3");

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "Lbd;")
    public static class162 field3199 = field3206;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "Lbd;")
    public static class162 field3208 = field3206;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
    public int field3207;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
    public int field3215;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "[I")
    public int[] field3202;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "[I")
    public int[] field3204;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "[I")
    public int[] field3213;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "[Lvb;")
    public class166[] field3209;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "[Lvb;")
    public class166[] field3211;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "[[[B")
    public byte[][][] field3201;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjava/lang/String;)V", line = 16)
    public static final void method1401(int arg0, String arg1) {
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        if (arg0 != 3) {
            method1402(76);
        }
        field3210++;
        System.exit(1);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 36)
    public static void method1402(int arg0) {
        field3216 = null;
        field3199 = null;
        field3206 = null;
        field3208 = null;
        if (arg0 != 3310) {
            field3200 = 109;
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)[F", line = 62)
    public static final float[] method1403(byte arg0) {
        float var1 = class108.method875() + class108.method871();
        field3205++;
        int var2 = class108.method874();
        if (arg0 > -34) {
            field3214 = 102;
        }
        class258.field4301[3] = 1.0F;
        float var3 = (float) ((var2 & 0xFF25CA) >> 16) / 255.0F;
        float var4 = (float) ((var2 & 0xFFF9) >> 8) / 255.0F;
        float var5 = 0.58823526F;
        class258.field4301[0] = class182.field3128[0] * var3 * var5 * var1;
        class258.field4301[1] = class182.field3128[1] * var4 * var5 * var1;
        float var6 = (float) (var2 & 0xFF) / 255.0F;
        class258.field4301[2] = class182.field3128[2] * var6 * var5 * var1;
        return class258.field4301;
    }
}
