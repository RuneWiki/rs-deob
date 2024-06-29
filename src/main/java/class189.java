import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class189 {

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Z")
    public static boolean field3020 = false;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "[I")
    public static int[] field3017 = new int[32];

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field3026 = 0;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field3025 = 0;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Lgg;")
    public static class61 field3018 = new class61(16);

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "[I")
    public static int[] field3028 = new int[2000];

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Ldl;")
    public static class33 field3023;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "Ljava/awt/Font;")
    public static Font field3021;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "[[[B")
    public static byte[][][] field3022;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBI)V")
    public static final void method1287(int arg0, byte arg1, int arg2) {
        field3027++;
        class283 var3 = class46.method360(5, -101, arg2);
        var3.method1893(0);
        if (arg1 == -46) {
            var3.field4528 = arg0;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIIIIILeb;I)V")
    public static final void method1288(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class103 arg6, int arg7) {
        field3024++;
        int var8 = arg3 * arg3 + arg5 * arg5;
        if (arg0) {
            method1288(true, -12, 29, 1, -62, 84, (class103) null, 37);
        }
        if (var8 > arg1) {
            return;
        }
        int var9 = Math.min(arg6.field1691 / 2, arg6.field1693 / 2);
        if (var8 <= (var9 * var9)) {
            class156.method1048(arg5, arg7, class195.field3158[arg4], arg3, arg6, arg2, (byte) 41);
            return;
        }
        var9 -= 10;
        int var10 = (int) class121.field2039 + class93.field1330 & 0x7FF;
        int var11 = class145.field2338[var10];
        int var12 = class145.field2348[var10];
        int var13 = var12 * 256 / (class77.field1050 + 256);
        int var14 = var11 * 256 / (class77.field1050 + 256);
        int var15 = arg5 * var14 + (arg3 * var13) >> 16;
        int var16 = arg5 * var13 - (arg3 * var14) >> 16;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var9 * Math.sin(var17));
        int var20 = (int) (Math.cos(var17) * (double) var9);
        ((class43) class128.field2140[arg4]).method168(arg6.field1691 / 2 + arg2 + var19 - 10, -var20 + arg7 - (-(arg6.field1693 / 2) + 10), 20, 20, 15, 15, var17, 256);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public static void method1289(byte arg0) {
        field3022 = null;
        field3018 = null;
        field3021 = null;
        field3023 = null;
        field3017 = null;
        if (arg0 >= 52) {
            field3028 = null;
        }
    }
}
