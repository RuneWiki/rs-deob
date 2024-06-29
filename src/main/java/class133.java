import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class133 {

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "B")
    private byte field2420;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public int field2408;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public int field2419;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public int field2413;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public int field2417;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public int field2422;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Ltg;")
    private static class184 field2405 = class135.method812("Connection timed out)3", 3);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "[I")
    public static int[] field2407 = new int[32];

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field2410 = 0;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field2404 = 0;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "Ltg;")
    public static class184 field2414 = field2405;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "[I")
    public static int[] field2411 = new int[100];

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "[I")
    public static int[] field2415 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "Lsc;")
    public static class171 field2418;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "[I")
    public static int[] field2406;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "[[S")
    public static short[][] field2409;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lub;ZIIZI)V")
    public static final void method803(class188 arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field2412++;
        if (class91.field1700 >= 50 || (arg0.field3635 == null || arg0.field3635.length <= arg5)) {
            return;
        }
        int var6 = arg0.field3635[arg5];
        if (var6 == 0 || !arg4) {
            return;
        }
        int var7 = var6 >> 8;
        int var8 = var6 >> 4 & 0x7;
        int var9 = var6 & 0xF;
        if (var9 == 0) {
            if (arg1) {
                class159.method965((byte) -122, var8, var7, 0);
            }
        } else if (class170.field3230 != 0) {
            int var10 = (arg3 - 64) / 128;
            class189.field3663[class91.field1700] = var7;
            class131.field2383[class91.field1700] = var8;
            int var11 = (arg2 - 64) / 128;
            class198.field3867[class91.field1700] = 0;
            class179.field3421[class91.field1700] = null;
            class57.field1025[class91.field1700] = (var10 << 16) + var9 + (var11 << 8);
            class91.field1700++;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static void method804(int arg0) {
        field2415 = null;
        field2406 = null;
        field2409 = null;
        field2411 = null;
        field2418 = null;
        field2414 = null;
        field2407 = null;
        field2405 = null;
        if (arg0 >= -104) {
            field2411 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)I")
    public final int method805(int arg0) {
        field2416++;
        if (arg0 != 0) {
            field2418 = null;
        }
        return this.field2420 & 0x7;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)I")
    public final int method806(byte arg0) {
        if (arg0 >= -111) {
            this.method805(39);
        }
        field2423++;
        return (this.field2420 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
    public class133() {
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lka;)V")
    public class133(class97 arg0) {
        this.field2420 = arg0.method591(65280);
        this.field2408 = arg0.method611(false);
        this.field2419 = arg0.method599(-16003);
        this.field2413 = arg0.method599(-16003);
        this.field2417 = arg0.method599(-16003);
        this.field2422 = arg0.method599(-16003);
    }
}
