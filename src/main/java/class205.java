import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class205 {

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "Lrh;")
    public static class46 field3207 = new class46();

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "[B")
    public static byte[] field3212 = new byte[32896];

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "Lpk;")
    public static class100 field3215;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public int field3205;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public int field3206;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public int field3208;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public int field3209;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public int field3210;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public int field3211;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public static final void method1400(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class48 var13 = new class48();
        var13.field620 = arg9;
        var13.field618 = arg6;
        var13.field619 = arg7;
        var13.field624 = arg8;
        var13.field616 = arg1;
        field3214++;
        if (arg12 <= 111) {
            method1402(-81);
        }
        var13.field610 = arg4;
        var13.field613 = arg0;
        var13.field609 = arg5;
        var13.field615 = arg10;
        var13.field617 = arg3;
        var13.field623 = arg11;
        var13.field622 = arg2;
        class111.field1679.method349(var13, true);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)I")
    public static final int method1401(int arg0) {
        field3213++;
        if (arg0 >= -27) {
            return 21;
        } else if ((double) class60.field842 == 3.0D) {
            return 37;
        } else if ((double) class60.field842 == 4.0D) {
            return 50;
        } else if ((double) class60.field842 == 6.0D) {
            return 75;
        } else if ((double) class60.field842 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V")
    public static void method1402(int arg0) {
        int var1 = -13 / ((arg0 - 47) / 63);
        field3212 = null;
        field3207 = null;
        field3215 = null;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3212[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field3215 = new class100(16);
    }
}
