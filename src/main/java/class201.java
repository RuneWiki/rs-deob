import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class201 {

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public static volatile int field3191 = 0;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "[I")
    public static int[] field3190 = new int[14];

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public int field3177;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public int field3178;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public int field3180;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public int field3184;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public int field3187;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public int field3188;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "Leh;")
    public static class137 field3185;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "[Lwj;")
    public static class149[] field3174;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "[S")
    public static short[] field3176;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "[[S")
    public static short[][] field3186;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIII)V")
    public static final void method1401(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3179++;
        class217.method1520(arg3, arg0, arg2 + arg3, arg0 - -arg4);
        class217.method1526(arg3, arg0, arg2, arg4, 0);
        if (arg1 != 16777215) {
            field3186 = null;
        }
        if (class113.field1622 < 100) {
            return;
        }
        if (class264.field4259 == null || class264.field4259.field720 != arg2 || class264.field4259.field719 != arg4) {
            class227 var5 = new class227(arg2, arg4);
            class217.method1536(var5.field3640, arg2, arg4);
            class50.method287(arg2, -34, arg4, class7.field88, class44.field562, 0, 0, 0, 0);
            class264.field4259 = var5;
            class52.field673.method1118(63);
        }
        class264.field4259.method322(arg3, arg0);
        int var6 = arg3 + (class184.field2935 * arg2 / class44.field562);
        int var7 = 16711680;
        int var8 = class162.field2575 * arg2 / class44.field562;
        int var9 = class287.field4574 * arg4 / class7.field88 + arg0;
        if (class297.field4695 == 1) {
            var7 = 16777215;
        }
        int var10 = class162.field2577 * arg4 / class7.field88;
        class217.method1540(var6, var9, var8, var10, var7, 128);
        class217.method1528(var6, var9, var8, var10, var7);
        if (class282.field4469 <= 0) {
            return;
        }
        int var11;
        if (class180.field2862 > 10) {
            var11 = (20 - class180.field2862) * 25;
        } else {
            var11 = class180.field2862 * 25;
        }
        for (class41 var12 = (class41) class78.field980.method1802(43); var12 != null; var12 = (class41) class78.field980.method1815(0)) {
            if (class259.field4216 == var12.field510) {
                int var13 = arg3 + (var12.field515 * arg2 / class44.field562);
                int var14 = var12.field513 * arg4 / class7.field88 + arg0;
                class217.method1540(var13 - 2, var14 + -2, 4, 4, 16776960, var11);
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIB)V")
    public static final void method1402(int arg0, int arg1, byte arg2) {
        field3189++;
        if (arg2 < -35) {
            class15.field189++;
            class4.field57.method1932(false, 173);
            class4.field57.method573(arg0, (byte) -48);
            class4.field57.method572(true, arg1);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static final void method1403(int arg0) {
        class81.field1004.method1701((byte) 122);
        field3175++;
        class21.field266.method1701((byte) 80);
        if (arg0 != 6188) {
            field3183 = -109;
        }
        class235.field3886.method1701((byte) 56);
        class221.field3560.method1701((byte) 62);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public static void method1404(byte arg0) {
        field3176 = null;
        field3174 = null;
        field3185 = null;
        field3190 = null;
        field3186 = null;
        if (arg0 != -121) {
            method1402(-4, 105, (byte) -95);
        }
    }
}
