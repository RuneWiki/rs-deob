import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class65 {

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Z")
    public boolean field959 = false;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public int field949;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public int field957;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILaj;II)V", line = 5)
    private final void method515(int arg0, class1 arg1, int arg2, int arg3) {
        if (arg3 != 10935) {
            this.field959 = true;
        }
        field952++;
        if (arg2 == 1) {
            this.field949 = arg1.method56(19612);
        } else if (arg2 == 2) {
            this.field957 = arg1.method4(true);
        } else if (arg2 == 3) {
            this.field959 = true;
        } else if (arg2 == 4) {
            this.field949 = -1;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)V", line = 33)
    public static final void method516(boolean arg0, int arg1) {
        if (!arg0) {
            class1.field59.method2285(arg1, (byte) -94);
            field958++;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Laj;II)V", line = 48)
    public final void method517(class1 arg0, int arg1, int arg2) {
        field950++;
        if (arg2 <= 56) {
            this.method517((class1) null, -13, -79);
        }
        while (true) {
            int var4 = arg0.method15((byte) 107);
            if (var4 == 0) {
                return;
            }
            this.method515(arg1, arg0, var4, 10935);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIIIII)V", line = 68)
    public static final void method518(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0) {
            return;
        }
        field953++;
        int var6 = (arg2 - 32) * arg2 / arg5;
        if (var6 < 8) {
            var6 = 8;
        }
        class322.field5047[0].method990(arg4, arg1);
        int var7 = (arg2 - var6 - 32) * arg3 / (arg5 - arg2);
        class322.field5047[1].method990(arg4, arg1 + arg2 - 16);
        if (!class162.field2623) {
            class33.method288(arg4, arg1 + 16, 16, arg2 - 32, class242.field3623);
            class33.method288(arg4, arg1 + var7 + 16, 16, var6, class135.field2129);
            class33.method307(arg4, arg1 + var7 + 16, var6, class343.field5319);
            class33.method307(arg4 + 1, var7 + 16 + arg1, var6, class343.field5319);
            class33.method301(arg4, arg1 + var7 + 16, 16, class343.field5319);
            class33.method301(arg4, arg1 + var7 + 17, 16, class343.field5319);
            class33.method307(arg4 + 15, arg1 + var7 + 16, var6, class167.field2695);
            class33.method307(arg4 + 14, arg1 + 17 + var7, var6 - 1, class167.field2695);
            class33.method301(arg4, arg1 + var7 + var6 + 15, 16, class167.field2695);
            class33.method301(arg4 + 1, arg1 - -14 + var7 - -var6, 15, class167.field2695);
            return;
        }
        class114.method887(arg4, arg1 + 16, 16, arg2 - 32, class242.field3623);
        class114.method887(arg4, arg1 - (-var7 - 16), 16, var6, class135.field2129);
        class114.method883(arg4, arg1 - (-var7 - 16), var6, class343.field5319);
        class114.method883(arg4 + 1, var7 + 16 + arg1, var6, class343.field5319);
        class114.method889(arg4, arg1 + var7 + 16, 16, class343.field5319);
        class114.method889(arg4, arg1 - (-var7 - 17), 16, class343.field5319);
        class114.method883(arg4 + 15, arg1 + 16 + var7, var6, class167.field2695);
        class114.method883(arg4 + 14, arg1 + var7 + 17, var6 - 1, class167.field2695);
        class114.method889(arg4, arg1 + var6 + var7 + 15, 16, class167.field2695);
        class114.method889(arg4 + 1, arg1 + 14 + var7 + var6, 15, class167.field2695);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lpk;BI)Leg;", line = 119)
    public static final class317 method519(class120 arg0, byte arg1, int arg2) {
        int var3 = 35 / ((-arg1 - 73) / 43);
        field956++;
        return class75.method592(arg0, -99, arg2) ? class135.method1037(-1) : null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 133)
    public static final String method520(int arg0, long arg1) {
        field955++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            int var6 = 76 / ((arg0 + 61) / 41);
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var7 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var7.append(class339.field5241[(int) (var8 - (arg1 * 37L))]);
            }
            return var7.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZZI)Lwk;", line = 173)
    public final class186 method521(boolean arg0, boolean arg1, int arg2) {
        field951++;
        class186 var4 = (class186) class260.field3857.method2288((long) ((arg1 ? 262144 : 0) | this.field949 | arg2 << 16), (byte) 84);
        if (var4 != null) {
            return var4;
        }
        class17.field339.method939((byte) 54, this.field949);
        if (!arg0) {
            this.field957 = -100;
        }
        class186 var5 = class303.method2154(class17.field339, this.field949, false, 0);
        if (var5 != null) {
            var5.method1352(class66.field1007, class95.field1537, class78.field1226);
            var5.field3070 = var5.field3064;
            var5.field3066 = var5.field3065;
            if (arg1) {
                var5.method1351();
            }
            for (int var6 = 0; var6 < arg2; var6++) {
                var5.method1353();
            }
            class260.field3857.method2281(0, (long) ((arg1 ? 262144 : 0) | arg2 << 16 | this.field949), var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)I", line = 213)
    public static final int method522(int arg0, byte arg1) {
        int var2 = -37 % ((35 - arg1) / 63);
        field954++;
        return arg0 & 0xFF;
    }
}
