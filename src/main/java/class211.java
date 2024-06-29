import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class211 extends class600 {

    @OriginalMember(owner = "client!iba", name = "i", descriptor = "Leda;")
    public static class116 field3223 = new class116(75, -1);

    @OriginalMember(owner = "client!iba", name = "r", descriptor = "I")
    public static int field3232 = 0;

    @OriginalMember(owner = "client!iba", name = "g", descriptor = "I")
    public int field3221;

    @OriginalMember(owner = "client!iba", name = "h", descriptor = "I")
    public int field3222;

    @OriginalMember(owner = "client!iba", name = "j", descriptor = "I")
    public int field3224;

    @OriginalMember(owner = "client!iba", name = "k", descriptor = "I")
    public int field3225;

    @OriginalMember(owner = "client!iba", name = "l", descriptor = "I")
    public int field3226;

    @OriginalMember(owner = "client!iba", name = "m", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!iba", name = "o", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!iba", name = "p", descriptor = "I")
    public int field3230;

    @OriginalMember(owner = "client!iba", name = "n", descriptor = "Lqu;")
    public static class282 field3228;

    @OriginalMember(owner = "client!iba", name = "q", descriptor = "Ljava/lang/String;")
    public String field3231;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method1446(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3227++;
        int var8 = arg2 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class55.field716 - class344.field4815) * var8 / 100 + class344.field4815;
        int var10 = arg4 * var9 >> 8;
        int var11 = 16384 - arg5 & 0x3FFF;
        int var12 = 16384 - arg1 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class302.field4241[var11] * -var10 >> 14;
            var15 = class302.field4242[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class302.field4241[var12] * var15 >> 14;
            var15 = class302.field4242[var12] * var15 >> 14;
        }
        if (arg0 < 59) {
            field3232 = 3;
        }
        class666.field9366 = arg5;
        class432.field6220 = arg1;
        class277.field3933 = arg3 - var14;
        class322.field4478 = arg6 - var15;
        class551.field8078 = arg7 - var13;
        class694.field9854 = 0;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(B)V")
    public static void method1447(byte arg0) {
        if (arg0 >= -127) {
            method1447((byte) -62);
        }
        field3228 = null;
        field3223 = null;
    }
}
