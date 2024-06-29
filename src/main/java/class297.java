import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class297 {

    @OriginalMember(owner = "client!w", name = "d", descriptor = "J")
    public long field4732 = 0L;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "[I")
    public static int[] field4730 = new int[128];

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public int field4734;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public int field4735;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public int field4739;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public int field4742;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public int field4743;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Luk;")
    public class104 field4741;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "Luk;")
    public class104 field4744;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IZ)V", line = 11)
    public static final void method2022(int arg0, boolean arg1) {
        field4738++;
        if (arg0 != 4056) {
            field4731 = 18;
        }
        byte var2;
        byte[][] var3;
        if (class43.field680 && arg1) {
            var2 = 1;
            var3 = class144.field2624;
        } else {
            var3 = class310.field4910;
            var2 = 4;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class215.method1587(false);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class222.field3700[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg1 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = var7 >> 3 & 0x7FF;
                            int var11 = var7 >> 14 & 0x3FF;
                            int var12 = (var11 / 8 << 8) + var10 / 8;
                            for (int var13 = 0; var13 < class56.field866.length; var13++) {
                                if (class56.field866[var13] == var12 && var3[var13] != null) {
                                    class184.method1417(var5 * 8, var3[var13], -4765, var6 * 8, class163.field2882, arg1, (var10 & 0x7) * 8, var9, var8, (var11 & 0x7) * 8, var4);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V", line = 97)
    public static final void method2023(byte arg0) {
        field4740++;
        class171.field2962.method466(-1);
        int var1 = -43 % ((-arg0 - 84) / 36);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII)Z", line = 106)
    public static final boolean method2024(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class295.field4717[arg0][var8][var9] == -class322.field5115) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class137.field2487[arg0][arg1][arg3] + arg5;
            if (!class317.method2182(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class317.method2182(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class317.method2182(var10, var12, var14)) {
                return false;
            } else if (class317.method2182(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class31.method291(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class317.method2182(var6 + 1, class137.field2487[arg0][arg1][arg3] + arg5, var7 + 1) && class317.method2182(var6 + 128 - 1, class137.field2487[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class317.method2182(var6 + 128 - 1, class137.field2487[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class317.method2182(var6 + 1, class137.field2487[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)V", line = 166)
    public static final void method2025(int arg0, int arg1) {
        if (arg1 == -14617) {
            field4733++;
            class336.field5364.method469(-11815, arg0);
            class58.field899.method469(-11815, arg0);
            class69.field1130.method469(-11815, arg0);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 179)
    public static final void method2026(Component arg0, int arg1) {
        if (arg1 != 1) {
            field4730 = (int[]) null;
        }
        field4729++;
        arg0.removeKeyListener(class296.field4723);
        arg0.removeFocusListener(class296.field4723);
        class140.field2569 = -1;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II)Lwl;", line = 205)
    public static final class100 method2027(int arg0, int arg1) {
        field4736++;
        class100 var2 = (class100) class48.field736.method467(true, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        class100 var3 = class220.method1616(false, 126, class97.field1584, class185.field3142, arg1);
        if (var3 != null) {
            class48.field736.method465(var3, (long) arg1, (byte) 116);
        }
        if (arg0 != 0) {
            method2023((byte) -86);
        }
        return var3;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 226)
    public static void method2028(int arg0) {
        field4730 = null;
        if (arg0 > -73) {
            method2027(57, 45);
        }
    }
}
