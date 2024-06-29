import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class282 extends class187 {

    @OriginalMember(owner = "client!wn", name = "v", descriptor = "Ljava/lang/String;")
    public static String field4336 = "Face here";

    @OriginalMember(owner = "client!wn", name = "r", descriptor = "I")
    public static int field4332 = 0;

    @OriginalMember(owner = "client!wn", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4330 = "Loaded update list";

    @OriginalMember(owner = "client!wn", name = "u", descriptor = "[B")
    public static byte[] field4335 = new byte[32896];

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!wn", name = "q", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!wn", name = "s", descriptor = "I")
    public int field4333;

    @OriginalMember(owner = "client!wn", name = "t", descriptor = "I")
    public int field4334;

    @OriginalMember(owner = "client!wn", name = "w", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!wn", name = "x", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!wn", name = "y", descriptor = "I")
    public int field4339;

    @OriginalMember(owner = "client!wn", name = "z", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1852(int arg0, int arg1) {
        field4340++;
        class260.field4037.method1287(arg1, 118);
        class133.field2095.method1287(arg1, -91);
        class285.field4365.method1287(arg1, 115);
        if (arg0 <= 0) {
            method1856((byte) 73);
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(II)V", line = 22)
    public static final void method1853(int arg0, int arg1) {
        field4328++;
        class34.field438.method1287(arg1, 121);
        if (arg0 <= 54) {
            field4332 = 10;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field4335[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V", line = 41)
    public static final void method1854(int arg0) {
        class132.field2070.method1296(255);
        field4338++;
        class280.field4318.method1296(255);
        class46.field647.method1296(255);
        if (arg0 != 32079) {
            field4336 = (String) null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIIIIII)V", line = 90)
    public static final void method1855(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4331++;
        if (class183.method1263(0, arg8)) {
            class221.method1475(arg2, arg4, arg6, -1, (byte) -63, class219.field3487[arg8], arg0, arg5, arg3, arg7);
            if (arg1 != 255) {
                field4332 = 69;
            }
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class2.field12[var9] = true;
            }
        } else {
            class2.field12[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V", line = 120)
    public static void method1856(byte arg0) {
        field4335 = null;
        field4336 = null;
        if (arg0 >= 19) {
            field4330 = null;
        }
    }
}
