import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "[[I")
    public static int[][] field116 = new int[104][104];

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Lu;")
    private static class135 field115 = class87.method676((byte) -118, "Enter name of player to add to list");

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "Lu;")
    public static class135 field122 = field115;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Lu;")
    public static class135 field119 = class87.method676((byte) -114, "@yel@*V");

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Lu;")
    private static class135 field121 = class87.method676((byte) -47, "System update in: ");

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field124 = 0;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Lu;")
    public static class135 field123 = field121;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "Lu;")
    private static class135 field113 = class87.method676((byte) -43, "glow2:");

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "Lu;")
    public static class135 field120 = field113;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "Lu;")
    public static class135 field117 = field113;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public static int field126 = 0;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "Le;")
    public static class29 field125 = new class29(64);

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public static int field127 = 0;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public static int field128 = 0;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "Lda;")
    public static class23 field129 = new class23();

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "[I")
    public static int[] field111;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "[I")
    public static int[] field130;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIZ)I")
    public static final int method20(int arg0, int arg1, boolean arg2) {
        field118++;
        class69 var3 = (class69) class103.field2490.method842((long) arg1, 125);
        if (!arg2) {
            return -100;
        } else if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field1698.length; var5++) {
                if (var3.field1692[var5] == arg0) {
                    var4 += var3.field1698[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static final void method21(int arg0) {
        field114++;
        if (arg0 >= -91) {
            method22(93);
        }
        if (class8.field153 != null) {
            class8.field153.method874((byte) -94);
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)Lbc;")
    public static final class11 method22(int arg0) {
        field110++;
        class11 var1 = new class11();
        var1.field264 = client.field533[0];
        var1.field269 = class48.field1140;
        var1.field265 = class80.field1918;
        if (arg0 != 1) {
            return null;
        }
        var1.field266 = class86.field2061[0];
        var1.field267 = class59.field1451[0];
        int var2 = var1.field266 * var1.field264;
        var1.field268 = new int[var2];
        var1.field263 = class107.field2567[0];
        byte[] var3 = class29.field699[0];
        for (int var4 = 0; var4 < var2; var4++) {
            var1.field268[var4] = class69.field1696[class4.method19(255, var3[var4])];
        }
        class43.method320(109);
        return var1;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZII)I")
    public static final int method23(boolean arg0, int arg1, int arg2) {
        field112++;
        int var3 = class130.method1046(56, arg1 - 1, arg2 + -1) + class130.method1046(86, arg1 - 1, arg2 - -1) + class130.method1046(120, arg1 + 1, arg2 + -1) + class130.method1046(-121, arg1 + 1, arg2 + 1);
        if (!arg0) {
            method24((byte) 80);
        }
        int var4 = class130.method1046(-125, arg1, arg2 - 1) + class130.method1046(1, arg1, arg2 + 1) + class130.method1046(57, arg1 + -1, arg2) + class130.method1046(-121, arg1 - -1, arg2);
        int var5 = class130.method1046(-122, arg1, arg2);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static void method24(byte arg0) {
        field117 = null;
        field120 = null;
        field113 = null;
        field116 = null;
        field129 = null;
        field130 = null;
        field123 = null;
        int var1 = 55 % ((71 - arg0) / 51);
        field115 = null;
        field122 = null;
        field119 = null;
        field111 = null;
        field125 = null;
        field121 = null;
    }
}
