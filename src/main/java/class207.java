import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class207 {

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public int field3293;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public int field3286;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public int field3289;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "Lui;")
    public class286 field3296;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field3290 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "[I")
    public static int[] field3294 = new int[3];

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public static void method1447(int arg0) {
        field3294 = null;
        if (arg0 != 0) {
            method1448(false, true);
        }
        field3290 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZZ)V")
    public static final void method1448(boolean arg0, boolean arg1) {
        if (!arg1) {
            field3297++;
            class26.field328 = arg0;
            class103.field1660 = !class129.method918(arg1);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3291++;
        if (arg8 < 128 || arg4 < 128 || arg8 > 13056 || arg4 > 13056) {
            class263.field4220 = -1;
            class23.field288 = -1;
            return;
        }
        int var9 = class155.method1060((byte) -12, class56.field941, arg4, arg8) - arg0;
        int var10 = var9 - class46.field776;
        int var11 = arg4 - class104.field1666;
        int var12 = arg8 - class148.field2314;
        if (arg1 != 13056) {
            return;
        }
        int var13 = class302.field4823[class264.field4245];
        int var14 = class302.field4823[class71.field1207];
        int var15 = class302.field4824[class264.field4245];
        int var16 = class302.field4824[class71.field1207];
        int var17 = var11 * var14 + var12 * var16 >> 16;
        int var18 = var11 * var16 - (var12 * var14) >> 16;
        int var20 = arg5 + var17;
        int var21 = var10 * var15 - var13 * var18 >> 16;
        int var22 = var10 * var13 + var15 * var18 >> 16;
        if (var22 < 50) {
            class263.field4220 = -1;
            class23.field288 = -1;
        } else {
            class263.field4220 = (var20 << 9) / var22 + arg2;
            class23.field288 = (var21 << 9) / var22 + arg6;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BII)V")
    public static final void method1450(byte arg0, int arg1, int arg2) {
        class204.field3248 = new class173(arg1);
        field3292++;
        int var3 = -119 / ((-arg0 - 68) / 40);
        class94.field1522 = new class173(arg2);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)I")
    public static final int method1451(int arg0, byte arg1) {
        if (arg1 == 48) {
            field3288++;
            return arg0 >>> 7;
        } else {
            return 82;
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(IIII)V")
    public class207(int arg0, int arg1, int arg2, int arg3) {
        class286 var5 = class66.method463(arg0, 243);
        this.field3293 = arg3;
        this.field3286 = arg2;
        this.field3289 = arg1;
        if (var5.field4550 == -1) {
            this.field3296 = var5;
        } else {
            this.field3296 = class66.method463(var5.field4550, 243);
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lui;III)V")
    public class207(class286 arg0, int arg1, int arg2, int arg3) {
        this.field3293 = arg3;
        this.field3296 = arg0;
        this.field3286 = arg2;
        this.field3289 = arg1;
    }
}
