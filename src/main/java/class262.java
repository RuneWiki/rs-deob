import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class262 {

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "[Lbd;")
    public static class162[] field4369 = new class162[8];

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "Lbd;")
    public static class162 field4368 = class17.method142(0, "");

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field4370 = 0;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "J")
    public static long field4378 = 0L;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field4367 = 0;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "Lbd;")
    public static class162 field4372 = class17.method142(0, ")2");

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field4377 = 0;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "[I")
    public static int[] field4375 = new int[64];

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4373 = Calendar.getInstance();

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field4380 = 0;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lob;IIIIII)V", line = 47)
    public static final void method1802(class78 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 1) {
            field4373 = (Calendar) null;
        }
        field4366++;
        int var7 = arg3 * arg3 + arg6 * arg6;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg0.field1340 / 2, arg0.field1367 / 2);
        if (var7 <= (var8 * var8)) {
            class47.method351(class27.field463[arg5], arg1, arg3, arg0, arg4, arg6, 2);
            return;
        }
        int var9 = class305.field5137 + class265.field4414 & 0x7FF;
        var8 -= 10;
        int var10 = class312.field5269[var9];
        int var11 = class312.field5262[var9];
        int var12 = var10 * 256 / (class23.field396 + 256);
        int var13 = var11 * 256 / (class23.field396 + 256);
        int var14 = arg3 * var12 + arg6 * var13 >> 16;
        int var15 = arg6 * var12 - (arg3 * var13) >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) (Math.cos(var16) * (double) var8);
        if (class117.field2159) {
            ((class140) class222.field3709[arg5]).method1089(240, 240, (arg0.field1340 / 2 + arg1 + var18) * 16, (arg0.field1367 / 2 + arg4 - var19) * 16, (int) (var16 * 10430.378D), 4096);
        } else {
            ((class79) class222.field3709[arg5]).method602(arg0.field1340 / 2 + var18 + arg1 - 10, arg0.field1367 / 2 + (arg4 - 10) + -var19, 20, 20, 15, 15, var16, 256);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V", line = 96)
    public static final void method1803(int arg0, int arg1, int arg2) {
        class302.field5073 = true;
        class123.field2237 = arg0;
        class123.field2226 = arg1;
        class314.field5300 = arg2;
        class302.field5095 = -1;
        class286.field4828 = -1;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 105)
    public static final void method1804(int arg0) {
        class198.field3365.method1533(true);
        field4376++;
        if (arg0 != -12039) {
            field4367 = -23;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V", line = 118)
    public static void method1805(int arg0) {
        field4368 = null;
        field4372 = null;
        if (arg0 <= 76) {
            field4380 = 58;
        }
        field4375 = null;
        field4369 = null;
        field4373 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIZ)V", line = 150)
    public static final void method1806(int arg0, int arg1, boolean arg2) {
        field4371++;
        if (class293.field4931 < 2 && class148.field2674 == 0 && !class13.field213) {
            return;
        }
        class162 var3;
        if (class148.field2674 == 1 && class293.field4931 < 2) {
            var3 = class135.method1062(new class162[] { class267.field4443, class89.field1591, class190.field3246, class43.field706 }, true);
        } else if (class13.field213 && class293.field4931 < 2) {
            var3 = class135.method1062(new class162[] { class245.field4074, class89.field1591, class243.field4042, class43.field706 }, true);
        } else {
            var3 = class180.method1370((byte) 127, class293.field4931 - 1);
        }
        if (class293.field4931 > 2) {
            var3 = class135.method1062(new class162[] { var3, class141.field2499, class156.method1212(10, class293.field4931 - 2), class190.field3245 }, true);
        }
        if (arg2) {
            field4369 = (class162[]) null;
        }
        int var4 = class207.field3507.method1883(var3, arg1 + 4, arg0 - -15, 16777215, 0, class181.field3111, class288.field4855);
        class222.method1608(arg0, 15, 117, var4 + class207.field3507.method1896(var3), arg1 - -4);
    }
}
