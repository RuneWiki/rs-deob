import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class182 extends class247 {

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "[I")
    public int[] field2864 = new int[] { -1 };

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "[I")
    public int[] field2866 = new int[1];

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "I")
    public static int field2865 = 3353893;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "Z")
    public static boolean field2860 = false;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "[I")
    public static int[] field2861;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)V")
    public static final void method1292(byte arg0) {
        class79.field1198 = -1;
        field2862++;
        class162.field2487 = null;
        if (arg0 != 123) {
            method1292((byte) 96);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lvl;BIILvl;)Lfc;")
    public static final class213 method1293(class73 arg0, byte arg1, int arg2, int arg3, class73 arg4) {
        if (arg1 >= -124) {
            return null;
        } else {
            field2863++;
            return class135.method862(arg2, arg3, (byte) 118, arg0) ? class311.method2093(arg4.method501(-2, arg3, arg2), (byte) -78) : null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)V")
    public static final void method1294(int arg0, int arg1) {
        class113 var2 = class184.field2892[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class113 var4 = class184.field2892[var3][arg0][arg1] = class184.field2892[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field1636--;
                for (int var5 = 0; var5 < var4.field1646; var5++) {
                    class158 var6 = var4.field1634[var5];
                    if ((var6.field2354 >> 29 & 0x3L) == 2L && var6.field2352 == arg0 && var6.field2359 == arg1) {
                        var6.field2366--;
                    }
                }
            }
        }
        if (class184.field2892[0][arg0][arg1] == null) {
            class184.field2892[0][arg0][arg1] = new class113(0, arg0, arg1);
        }
        class184.field2892[0][arg0][arg1].field1635 = var2;
        class184.field2892[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V")
    public static void method1295(int arg0) {
        field2861 = null;
        if (arg0 != -28740) {
            field2861 = null;
        }
    }
}
