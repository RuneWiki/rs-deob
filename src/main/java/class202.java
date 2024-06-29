import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class202 {

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "[I")
    public static int[] field3647 = new int[32];

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "[I")
    public static int[] field3646 = new int[100];

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "Lwj;")
    public static class6 field3649 = null;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "Lhj;")
    private static class69 field3652;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "Lhj;")
    public static class69 field3654;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "Lhj;")
    public static class69 field3653;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "Lnc;")
    public static class83 field3651;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "[I")
    public static int[] field3656;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "[[[B")
    public static byte[][][] field3655;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLfh;)Lia;")
    public static final class215 method1468(byte arg0, class128 arg1) {
        if (arg0 == -42) {
            field3648++;
            return new class215(arg1.method955((byte) 113), arg1.method955((byte) 75), arg1.method955((byte) 76), arg1.method955((byte) 105), arg1.method952((byte) -56), arg1.method937(false));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lnc;I)V")
    public static final void method1469(class83 arg0, int arg1) {
        class133.field2478 = class200.method1455((byte) 22, arg0, class62.field1194);
        class258.field4636 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) (class156.field2916[var2] >> 16 & 0xFF);
            int var5 = (class156.field2916[var2 + 1] & 0xFF0000) >> 16;
            float var6 = ((float) var5 - var4) / 64.0F;
            int var7 = class156.field2916[var2 + 1] >> 8 & 0xFF;
            float var8 = (float) (class156.field2916[var2] & 0xFF);
            int var9 = class156.field2916[var2 + 1] & 0xFF;
            float var10 = ((float) var9 - var8) / 64.0F;
            float var11 = (float) ((class156.field2916[var2] & 0xFF00) >> 8);
            float var12 = ((float) var7 - var11) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class258.field4636[var2 * 64 + var13] = class230.method1644(class230.method1644((int) var11 << 8, (int) var4 << 16), (int) var8);
                var11 += var12;
                var8 += var10;
                var4 += var6;
            }
        }
        field3644++;
        if (arg1 != -28322200) {
            field3655 = null;
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class258.field4636[var3] = class156.field2916[3];
        }
        class179.field3249 = new int[32768];
        class9.field72 = new int[32768];
        class157.method1185(126, (class121) null);
        class36.field497 = new int[32768];
        class13.field186 = new int[32768];
        class194.field3533 = new class264(128, 254);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static void method1470(int arg0) {
        field3655 = null;
        field3646 = null;
        field3647 = null;
        field3652 = null;
        field3653 = null;
        field3651 = null;
        field3656 = null;
        field3654 = null;
        if (arg0 != 32768) {
            method1468((byte) -68, (class128) null);
        }
        field3649 = null;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3647[var1] = var0 - 1;
            var0 += var0;
        }
        field3652 = class181.method1318("World", (byte) -121);
        field3654 = class181.method1318("Hierhin gehen", (byte) -111);
        field3653 = field3652;
    }
}
