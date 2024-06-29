import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class181 extends class215 {

    @OriginalMember(owner = "client!g", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2731 = "Loading interfaces - ";

    @OriginalMember(owner = "client!g", name = "f", descriptor = "Lqb;")
    public static class117 field2727 = new class117(16);

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field2734 = 1;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "[S")
    public static short[] field2733;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(III)J", line = 7)
    public static final long method1248(int arg0, int arg1, int arg2) {
        class196 var3 = class194.field2947[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field2979; var4++) {
            class44 var5 = var3.field2998[var4];
            if ((var5.field502 >> 29 & 0x3L) == 2L && var5.field504 == arg1 && var5.field497 == arg2) {
                return var5.field502;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V", line = 30)
    public static void method1249(byte arg0) {
        if (arg0 > -91) {
            method1250(-81, -47);
        }
        field2733 = null;
        field2727 = null;
        field2731 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Z", line = 58)
    public static final boolean method1250(int arg0, int arg1) {
        field2728++;
        if (arg1 != -4) {
            method1252(-112, 87, 111, -109, (byte) -115, -65, 108, 63);
        }
        return (arg0 & -arg0) == arg0;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIZII)V", line = 69)
    public static final void method1251(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field2726++;
        if (arg2) {
            method1252(-78, 16, 35, 67, (byte) 98, 31, -128, 18);
        }
        for (int var5 = 0; var5 < class63.field765; var5++) {
            if (class280.field4417[var5] + class213.field3239[var5] > arg1 && class213.field3239[var5] < arg1 + arg3 && arg0 < class116.field1612[var5] + class71.field891[var5] && class116.field1612[var5] < (arg0 + arg4)) {
                class302.field4702[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIBIII)V", line = 92)
    public static final void method1252(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (arg4 < 45) {
            return;
        }
        field2732++;
        if (arg3 < 1 || arg7 < 1 || arg3 > 102 || arg7 > 102) {
            return;
        }
        if (!class103.method653(-29308) && (class225.field3398[0][arg3][arg7] & 0x2) == 0) {
            int var8 = arg5;
            if ((class225.field3398[arg5][arg3][arg7] & 0x8) != 0) {
                var8 = 0;
            }
            if (class207.field3127 != var8) {
                return;
            }
        }
        int var9 = arg5;
        if (arg5 < 3 && (class225.field3398[1][arg3][arg7] & 0x2) == 2) {
            var9 = arg5 + 1;
        }
        class69.method433(class247.field3914[arg5], arg3, arg7, arg5, var9, 0, arg0);
        if (arg1 >= 0) {
            boolean var10 = class353.field5629;
            class353.field5629 = true;
            class100.method638(var9, false, -43, arg2, arg5, class247.field3914[arg5], arg1, arg7, false, arg6, arg3);
            class353.field5629 = var10;
        }
    }
}
