import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class231 extends class90 {

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Lmb;")
    public static class96 field3969 = class243.method1708("Hidden)2", (byte) 106);

    @OriginalMember(owner = "client!a", name = "p", descriptor = "Lmb;")
    public static class96 field3973 = class243.method1708(" weitere Optionen", (byte) 102);

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field3974 = 0;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Loa;")
    public static class262 field3970 = new class262();

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public static int field3976 = 0;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZZ)V")
    public static final void method1574(boolean arg0, boolean arg1) {
        field3967++;
        byte var2 = 4;
        byte[][] var3 = class241.field4191;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class157.field2741[var5] & 0xFF) * 64 - class225.field3832;
            int var12 = (class157.field2741[var5] >> 8) * 64 - class196.field3383;
            byte[] var13 = var3[var5];
            if (var13 != null) {
                class135.method1009((byte) 3);
                class216.method1494(arg1, class62.field1064, var13, class260.field4578 * 8 - 48, (byte) -101, var12, class128.field2342 * 8 - 48, var11);
            }
        }
        if (arg0) {
            method1574(false, true);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class157.field2741[var6] >> 8) * 64 - class196.field3383;
            byte[] var8 = var3[var6];
            int var9 = (class157.field2741[var6] & 0xFF) * 64 - class225.field3832;
            if (var8 == null && class128.field2342 < 800) {
                class135.method1009((byte) 3);
                for (int var10 = 0; var10 < var2; var10++) {
                    class188.method1327(var9, (byte) -128, 64, var10, var7, 64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IZIIIIIII)V")
    public static final void method1575(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3972++;
        int var9 = arg7 - arg0;
        if (!arg1) {
            method1577(112, 25, 24, 96, 4);
        }
        int var10 = (arg5 - arg6 << 16) / var9;
        int var11 = arg3 - arg4;
        int var12 = (arg2 - arg8 << 16) / var11;
        class188.method1328(arg4, arg6, arg7, var12, arg0, 0, arg3, var10, 0, 6205, arg8);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
    public static void method1576(int arg0) {
        if (arg0 != -21116) {
            field3971 = 20;
        }
        field3970 = null;
        field3969 = null;
        field3973 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIII)V")
    public static final void method1577(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= arg0) {
            class36.method283(arg0, class229.field3939[arg1], arg3, (byte) -126, arg2);
        } else {
            class36.method283(arg3, class229.field3939[arg1], arg0, (byte) -86, arg2);
        }
        field3975++;
        if (arg4 != 8) {
            field3969 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lff;B)V")
    public static final void method1578(class3 arg0, byte arg1) {
        class33.field561 = arg0;
        field3968++;
        if (arg1 != -127) {
            method1577(39, -84, 13, 116, 68);
        }
    }
}
