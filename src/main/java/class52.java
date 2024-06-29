import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class52 {

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "[I")
    public static int[] field847 = new int[4096];

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "[I")
    public static int[] field852 = new int[14];

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "[I")
    public static int[] field850 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
    public static int field853 = 0;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    public static int field844 = 0;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "Lac;")
    public static class216 field855;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)V", line = 5)
    public static final void method498(int arg0, int arg1) {
        class410 var2 = class68.field1018;
        synchronized (class68.field1018) {
            class68.field1018.method2534(0, arg0);
        }
        field848++;
        class410 var3 = class388.field5462;
        synchronized (class388.field5462) {
            class388.field5462.method2534(0, arg0);
            if (arg1 < 12) {
                method499((byte) -5);
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)V", line = 34)
    public static final void method499(byte arg0) {
        int var1 = -24 / ((arg0 - 63) / 35);
        field856++;
        class210.field2929.method2539(78);
        class286.field3833.method2539(119);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IILap;)Ljava/lang/String;", line = 48)
    public static final String method500(int arg0, int arg1, class289 arg2) {
        field846++;
        try {
            int var3 = arg2.method1821(arg1 - 31989);
            if (arg0 < var3) {
                var3 = arg0;
            }
            if (arg1 != 31911) {
                field850 = null;
            }
            byte[] var4 = new byte[var3];
            arg2.field3938 += class94.field1372.method65(var4, arg2.field3882, var3, arg2.field3938, 0, 43);
            return class267.method1715(var4, var3, 0, arg1 ^ 0x7CFA);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)V", line = 83)
    public static void method501(byte arg0) {
        field852 = null;
        field850 = null;
        if (arg0 > 52) {
            field855 = null;
            field847 = null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZI)V", line = 99)
    public static final void method502(boolean arg0, int arg1) {
        field849++;
        class450 var2 = class59.method540(1, arg1, 1000);
        var2.method2798(-664528978);
        if (arg0) {
            method502(false, 124);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IC)Z", line = 113)
    public static final boolean method503(int arg0, char arg1) {
        field845++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg0 > -99) {
            field855 = null;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class43.field645;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZLhq;BLpe;II)V", line = 160)
    public static final void method504(int arg0, boolean arg1, class175 arg2, byte arg3, class391 arg4, int arg5, int arg6) {
        if (arg1) {
            class442.field6361.method722((class249.field3414 - class442.field6361.method740()) / 2, (class258.field3488 - class442.field6361.method739()) / 2);
            class96.field1391.method722((class249.field3414 - class96.field1391.method740()) / 2, 18);
        }
        field854++;
        arg2.method1309(-1, class42.field640 == 1 ? class356.field4839 : class223.field3097, (byte) 106, arg0, class258.field3488 / 2 - 26, class249.field3414 / 2);
        int var7 = class258.field3488 / 2 - 18;
        arg4.method167(class249.field3414 / 2 - 152, var7, 304, 34, arg6, 0);
        int var8 = 30 / ((arg3 - 31) / 61);
        arg4.method167(class249.field3414 / 2 - 151, var7 + 1, 302, 32, 0, 0);
        arg4.method95(class249.field3414 / 2 - 150, var7 + 2, class312.field4217 * 3, 30, arg5, 0);
        arg4.method95(class249.field3414 / 2 + class312.field4217 * 3 - 150, var7 - -2, 300 - (class312.field4217 * 3), 30, 0, 0);
        arg2.method1309(-1, class267.field3599, (byte) 106, arg0, class258.field3488 / 2 + 4, class249.field3414 / 2);
    }
}
