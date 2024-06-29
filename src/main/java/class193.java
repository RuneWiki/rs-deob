import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public abstract class class193 {

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Luf;")
    public static class168 field3138 = class148.method1019(-1720, "<)4col>");

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "Ljk;")
    public static class76 field3136 = new class76();

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public static int field3143 = 0;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public int field3134;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public int field3135;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public int field3139;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public int field3141;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public int field3142;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public int field3146;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIIIII)V", line = 15)
    public static final void method1359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3137++;
        if (class150.field2331 <= arg8 && class65.field874 >= arg8 && arg0 >= class150.field2331 && class65.field874 >= arg0 && arg1 >= class150.field2331 && arg1 <= class65.field874 && arg2 >= class150.field2331 && class65.field874 >= arg2 && arg4 >= class9.field112 && arg4 <= class44.field538 && arg9 >= class9.field112 && arg9 <= class44.field538 && arg7 >= class9.field112 && class44.field538 >= arg7 && class9.field112 <= arg6 && arg6 <= class44.field538) {
            class67.method376(arg4, arg6, arg2, (byte) 127, arg5, arg0, arg1, arg8, arg9, arg7);
        } else {
            class214.method1485(arg9, arg2, arg3 + 2, arg5, arg6, arg0, arg1, arg4, arg8, arg7);
        }
        if (arg3 != 1) {
            method1361(-48, 84, 76, 4, true);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V", line = 33)
    public static void method1360(byte arg0) {
        field3138 = null;
        field3136 = null;
        if (arg0 < 29) {
            field3136 = (class76) null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIZ)V", line = 45)
    public static final void method1361(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3145++;
        for (int var5 = 0; var5 < class227.field3685; var5++) {
            if (arg1 < (class69.field915[var5] + class204.field3346[var5]) && class204.field3346[var5] < arg1 + arg3 && (class82.field1168[var5] + class256.field4357[var5]) > arg0 && class256.field4357[var5] < arg0 + arg2) {
                class131.field2028[var5] = true;
            }
        }
        if (!arg4) {
            method1359(-29, 93, -92, 105, 37, 112, -104, -118, 126, -73);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)I", line = 76)
    public static final int method1362(int arg0, int arg1) {
        int var2 = -9 / ((arg0 + 64) / 46);
        field3140++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIII)Z", line = 97)
    public static final boolean method1365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class144.field2216[arg0][var8][var9] == -class238.field3842) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class227.field3686[arg0][arg1][arg3] + arg5;
            if (!class174.method1258(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class174.method1258(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class174.method1258(var10, var12, var14)) {
                return false;
            } else if (class174.method1258(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class18.method84(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class174.method1258(var6 + 1, class227.field3686[arg0][arg1][arg3] + arg5, var7 + 1) && class174.method1258(var6 + 128 - 1, class227.field3686[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class174.method1258(var6 + 128 - 1, class227.field3686[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class174.method1258(var6 + 1, class227.field3686[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)V")
    public abstract void method1363(int arg0, int arg1);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)V")
    public abstract void method1364(int arg0, int arg1, int arg2);
}
