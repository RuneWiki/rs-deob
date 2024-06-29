import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class46 {

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field1099 = 0;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Lu;")
    public static class135 field1095 = class87.method676((byte) -80, " weitere Optionen");

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Lu;")
    public static class135 field1096 = class87.method676((byte) -92, "(Y ");

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field1101 = -1;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Lu;")
    private static class135 field1100 = class87.method676((byte) -51, "Existing User");

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Lu;")
    public static class135 field1104 = class87.method676((byte) -81, "cross");

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Lu;")
    public static class135 field1105 = field1100;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Lla;")
    public static class77 field1103 = new class77();

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "Lu;")
    public static class135 field1108 = class87.method676((byte) -53, "sl_flags");

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field1107 = -1;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "Lu;")
    public static class135 field1109 = class87.method676((byte) -40, "auf der Hautpseite)3");

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Lu;")
    public static class135 field1110 = class87.method676((byte) -50, "mn");

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Llc;")
    public static class79 field1097;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    public static void method353(byte arg0) {
        field1104 = null;
        field1097 = null;
        field1096 = null;
        field1095 = null;
        field1100 = null;
        field1105 = null;
        field1103 = null;
        field1109 = null;
        field1108 = null;
        if (arg0 != 74) {
            method355(21, 65, -3, -99, -92, 108, 109);
        }
        field1110 = null;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
    public static final void method354(byte arg0) {
        class128.field3091.method234(arg0 - 22728);
        field1102++;
        if (arg0 != 62) {
            field1103 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIII)V")
    public static final void method355(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 2048 - arg3 & 0x7FF;
        if (arg4 != -26) {
            method355(14, 92, -71, -59, -36, -31, 20);
        }
        field1098++;
        int var8 = 2048 - arg1 & 0x7FF;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg6;
        if (var7 != 0) {
            int var12 = class51.field1213[var7];
            int var13 = class51.field1203[var7];
            int var14 = var10 * var13 - arg6 * var12 >> 16;
            var11 = var10 * var12 + arg6 * var13 >> 16;
            var10 = var14;
        }
        if (var8 != 0) {
            int var15 = class51.field1213[var8];
            int var16 = class51.field1203[var8];
            int var17 = var11 * var15 + var9 * var16 >> 16;
            var11 = var11 * var16 - var9 * var15 >> 16;
            var9 = var17;
        }
        class132.field3185 = arg5 - var9;
        class117.field2806 = arg1;
        class47.field1122 = arg0 - var11;
        class17.field386 = arg2 - var10;
        class62.field1552 = arg3;
    }
}
