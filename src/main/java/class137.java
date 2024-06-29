import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class137 {

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field2400 = 0;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "Llc;")
    public static class143 field2403 = class66.method374("Chargement de l(W-Bcran)2titre )2 ", -1);

    @OriginalMember(owner = "client!e", name = "h", descriptor = "Llc;")
    public static class143 field2407 = class66.method374("mapfunction", -1);

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "[[[B")
    public static byte[][][] field2405;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILfi;)V")
    public static final void method820(int arg0, int arg1, class228 arg2) {
        if (arg2.field4139 > class146.field2635) {
            class257.method1703(arg2, arg0 ^ 0x7405);
        } else if (class146.field2635 > arg2.field4128) {
            class16.method122(92, arg2);
        } else {
            class207.method1443(arg2, 0);
        }
        if (arg2.field4178 < 128 || arg2.field4108 < 128 || arg2.field4178 >= 13184 || arg2.field4108 >= 13184) {
            arg2.field4128 = 0;
            arg2.field4139 = 0;
            arg2.field4119 = -1;
            arg2.field4131 = -1;
            arg2.field4178 = arg2.field4148[0] * 128 + arg2.method218((byte) -126) * 64;
            arg2.field4108 = arg2.field4115[0] * 128 + (arg2.method218((byte) 122) * 64);
            arg2.method1553((byte) 96);
        }
        field2402++;
        if (arg0 != 29802) {
            method822(124, true);
        }
        if (class229.field4195 == arg2 && (arg2.field4178 < 1536 || arg2.field4108 < 1536 || arg2.field4178 >= 11776 || arg2.field4108 >= 11776)) {
            arg2.field4119 = -1;
            arg2.field4139 = 0;
            arg2.field4128 = 0;
            arg2.field4131 = -1;
            arg2.field4178 = arg2.field4148[0] * 128 + arg2.method218((byte) 92) * 64;
            arg2.field4108 = arg2.field4115[0] * 128 + arg2.method218((byte) 57) * 64;
            arg2.method1553((byte) -107);
        }
        class32.method214(arg2, -121);
        class66.method379(74, arg2);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public static void method821(int arg0) {
        field2405 = null;
        if (arg0 == -1) {
            field2403 = null;
            field2407 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IZ)V")
    public static final void method822(int arg0, boolean arg1) {
        field2401++;
        byte[][] var2 = class240.field4330;
        byte var3 = 4;
        if (arg0 != 128) {
            method822(52, true);
        }
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class6.field88[var5] >> 8) * 64 - class148.field2733;
            int var12 = (class6.field88[var5] & 0xFF) * 64 - class141.field2466;
            byte[] var13 = var2[var5];
            if (var13 != null) {
                class224.method1543((byte) -56);
                class36.method240(var13, class171.field3052, (class66.field1233 - 6) * 8, arg1, class272.field4854 * 8 - 48, var11, 64, var12);
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class6.field88[var6] & 0xFF) * 64 - class141.field2466;
            byte[] var8 = var2[var6];
            int var9 = (class6.field88[var6] >> 8) * 64 - class148.field2733;
            if (var8 == null && class272.field4854 < 800) {
                class224.method1543((byte) -56);
                for (int var10 = 0; var10 < var3; var10++) {
                    class120.method736(var7, 0, var9, var10, 64, 64);
                }
            }
        }
    }
}
