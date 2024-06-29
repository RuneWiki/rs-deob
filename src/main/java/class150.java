import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class150 extends RuntimeException {

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "Ljava/lang/String;")
    public String field3448;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3450;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field3449 = 0;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "[I")
    public static int[] field3455 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "Lsc;")
    public static class128 field3457 = class129.method1017(false, "Spieler");

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "[I")
    public static int[] field3443;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lhe;B)Z")
    public static final boolean method1192(class54 arg0, byte arg1) {
        field3444++;
        if (arg0.field1087 == null) {
            return false;
        }
        if (arg1 != 29) {
            method1192(null, (byte) -105);
        }
        for (int var2 = 0; var2 < arg0.field1087.length; var2++) {
            int var3 = class147.method1183(true, arg0, var2);
            int var4 = arg0.field1152[var2];
            if (arg0.field1087[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field1087[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field1087[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1193(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field3446++;
        class119.field2688[0].method430(arg2, arg3);
        class119.field2688[1].method430(arg2, arg3 + arg0 - 16);
        class138.method1136(arg2, arg3 + 16, 16, arg0 - 32, class157.field3594);
        if (arg4 != 51) {
            field3449 = -12;
        }
        int var6 = (arg0 - 32) * arg0 / arg5;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg0 - var6 - 32) * arg1 / (arg5 - arg0);
        class138.method1136(arg2, arg3 + var7 + 16, 16, var6, class154.field3554);
        class138.method1137(arg2, arg3 + var7 + 16, var6, class11.field175);
        class138.method1137(arg2 + 1, arg3 - (-16 - var7), var6, class11.field175);
        class138.method1142(arg2, arg3 + var7 + 16, 16, class11.field175);
        class138.method1142(arg2, arg3 + var7 + 17, 16, class11.field175);
        class138.method1137(arg2 + 15, arg3 + 16 + var7, var6, class67.field1503);
        class138.method1137(arg2 + 14, arg3 + var7 + 17, var6 - 1, class67.field1503);
        class138.method1142(arg2, var7 + var6 + arg3 + 15, 16, class67.field1503);
        class138.method1142(arg2 + 1, arg3 + 14 - -var7 - -var6, 15, class67.field1503);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public static void method1194(byte arg0) {
        field3443 = null;
        field3455 = null;
        field3457 = null;
        if (arg0 <= 62) {
            field3455 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)I")
    public static final int method1195(int arg0, int arg1, int arg2, int arg3) {
        field3454++;
        if (arg0 >= -93) {
            return 83;
        } else {
            int var4 = 256 - arg2;
            return ((arg1 & 0xFF00) * arg2 + (arg3 & 0xFF00) * var4 & 0xFF0000) + ((arg1 & 0xFF00FF) * arg2 + (arg3 & 0xFF00FF) * var4 & 0xFF00FF00) >> 8;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIZIIIII)V")
    public static final void method1196(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2) {
            method1194((byte) -43);
        }
        field3452++;
        if (class65.method488((byte) 120, arg7)) {
            class2.method4(arg5, -1, arg1, (byte) 123, arg3, class123.field2791[arg7], arg4, arg6, arg0);
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class150(Throwable arg0, String arg1) {
        this.field3448 = arg1;
        this.field3450 = arg0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V")
    public static final void method1197(int arg0, int arg1, int arg2) {
        if (arg0 != 20) {
            return;
        }
        field3456++;
        if (class36.field685 == 2) {
            class134.method1084((class6.field80 - class62.field1325 << 7) + class106.field2420, class35.field672 * 2, (class113.field2545 - class66.field1482 << 7) + class124.field2805, arg0 ^ 0x52);
            if (class18.field316 > -1 && class29.field554 % 20 < 10) {
                class104.field2374[0].method64(class18.field316 + arg1 - 12, class127.field2884 - 28 + arg2);
            }
        }
    }
}
