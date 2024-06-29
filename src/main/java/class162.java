import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class162 {

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "Lvl;")
    private class11 field2281;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "Lvn;")
    private class204 field2285;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "Lje;")
    private class276 field2286;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "Lsl;")
    public static class318 field2290 = new class318(47, 3);

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "Lbg;")
    public static class324 field2293 = new class324(86, 8);

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "Ltb;")
    public static class274 field2294;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "Liv;")
    private class65 field2288;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "Z")
    public static boolean field2279;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "[Llv;")
    private class308[] field2284;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field2292;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)Z")
    public final boolean method1137(boolean arg0) {
        field2289++;
        if (this.field2288 != null) {
            return true;
        }
        if (this.field2286 == null) {
            if (this.field2285.method1417(0)) {
                return false;
            }
            this.field2286 = this.field2285.method1422(255, (byte) 0, (byte) -90, true, 255);
        }
        if (this.field2286.field2230) {
            return false;
        }
        if (!arg0) {
            this.field2281 = null;
        }
        this.field2288 = new class65(this.field2286.method1123(false));
        this.field2284 = new class308[(this.field2288.field783.length - 5) / 8];
        return true;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public static void method1138(int arg0) {
        if (arg0 == 3) {
            field2290 = null;
            field2294 = null;
            field2293 = null;
            field2292 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
    public static final void method1139(byte arg0) {
        if (arg0 != 60) {
            return;
        }
        for (int var1 = 0; var1 < class435.field6370.length; var1++) {
            for (int var2 = 0; var2 < class435.field6370[var1].length; var2++) {
                class435.field6370[var1][var2] = class206.field3000;
            }
        }
        field2283++;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lst;Lst;II)Llv;")
    private final class308 method1140(class297 arg0, class297 arg1, int arg2, int arg3) {
        if (arg2 != 255) {
            method1143(true, -36, false, 12, 105);
        }
        field2278++;
        return this.method1144(arg1, true, (byte) -115, arg3, arg0);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)I")
    public static final int method1141(int arg0, int arg1) {
        field2280++;
        if (arg1 != 20268) {
            return 98;
        }
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xE0) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
    public final void method1142(int arg0) {
        field2287++;
        if (this.field2284 == null || arg0 < 48) {
            return;
        }
        for (int var2 = 0; var2 < this.field2284.length; var2++) {
            if (this.field2284[var2] != null) {
                this.field2284[var2].method1910((byte) -98);
            }
        }
        for (int var3 = 0; var3 < this.field2284.length; var3++) {
            if (this.field2284[var3] != null) {
                this.field2284[var3].method1908(23747);
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lvn;Lvl;)V")
    public class162(class204 arg0, class11 arg1) {
        this.field2281 = arg1;
        this.field2285 = arg0;
        if (!this.field2285.method1417(0)) {
            this.field2286 = this.field2285.method1422(255, (byte) 0, (byte) -45, true, 255);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZIZII)Lfs;")
    public static final class387 method1143(boolean arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field2282++;
        class297 var5 = null;
        if (class242.field3582 != null) {
            var5 = new class297(arg1, class242.field3582, class476.field7014[arg1], 1000000);
        }
        class4.field64[arg1] = class194.field2831.method1140(class413.field6143, var5, 255, arg1);
        if (arg2) {
            class4.field64[arg1].method1914((byte) 126);
        }
        if (arg3 < 42) {
            field2293 = null;
        }
        return new class387(class4.field64[arg1], arg0, arg4);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lst;ZBILst;)Llv;")
    private final class308 method1144(class297 arg0, boolean arg1, byte arg2, int arg3, class297 arg4) {
        field2291++;
        if (this.field2288 == null) {
            throw new RuntimeException();
        }
        this.field2288.field827 = arg3 * 8 + 5;
        if (this.field2288.field783.length <= this.field2288.field827) {
            throw new RuntimeException();
        } else if (this.field2284[arg3] == null) {
            int var6 = this.field2288.method616((byte) 89);
            int var7 = this.field2288.method616((byte) 94);
            class308 var8 = new class308(arg3, arg0, arg4, this.field2285, this.field2281, var6, var7, arg1);
            this.field2284[arg3] = var8;
            int var9 = 23 / ((-arg2 - 73) / 33);
            return var8;
        } else {
            return this.field2284[arg3];
        }
    }
}
