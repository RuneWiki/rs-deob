import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class131 extends class153 {

    @OriginalMember(owner = "client!wi", name = "Y", descriptor = "Lpj;")
    private class237 field2309 = class196.field3416;

    @OriginalMember(owner = "client!wi", name = "I", descriptor = "I")
    public static int field2293 = 0;

    @OriginalMember(owner = "client!wi", name = "J", descriptor = "Lpj;")
    public static class237 field2294 = class33.method353("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 44);

    @OriginalMember(owner = "client!wi", name = "Q", descriptor = "[S")
    public static short[] field2301 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!wi", name = "Z", descriptor = "Lpj;")
    public static class237 field2310 = class33.method353("; Max)2Age=", 106);

    @OriginalMember(owner = "client!wi", name = "P", descriptor = "[I")
    public static int[] field2300 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!wi", name = "O", descriptor = "Lpj;")
    public static class237 field2299 = class33.method353("details", 38);

    @OriginalMember(owner = "client!wi", name = "W", descriptor = "I")
    public static int field2307 = -1;

    @OriginalMember(owner = "client!wi", name = "N", descriptor = "Lak;")
    public static class135 field2298 = new class135(64);

    @OriginalMember(owner = "client!wi", name = "E", descriptor = "I")
    public int field2289;

    @OriginalMember(owner = "client!wi", name = "F", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!wi", name = "G", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!wi", name = "H", descriptor = "I")
    private int field2292;

    @OriginalMember(owner = "client!wi", name = "K", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!wi", name = "M", descriptor = "I")
    public int field2297;

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!wi", name = "T", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!wi", name = "U", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!wi", name = "V", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!wi", name = "X", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!wi", name = "cb", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!wi", name = "eb", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!wi", name = "bb", descriptor = "Loj;")
    public static class156 field2312;

    @OriginalMember(owner = "client!wi", name = "L", descriptor = "Lge;")
    private class69 field2296;

    @OriginalMember(owner = "client!wi", name = "db", descriptor = "Lge;")
    public class69 field2314;

    @OriginalMember(owner = "client!wi", name = "ab", descriptor = "[[[S")
    public static short[][][] field2311;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "(I)V")
    private final void method920(int arg0) {
        this.field2296 = new class69(this.field2314.method558((byte) -60));
        if (arg0 != 5) {
            field2294 = null;
        }
        for (class166 var2 = (class166) this.field2314.method566(0); var2 != null; var2 = (class166) this.field2314.method565(-25)) {
            class166 var3 = new class166((int) var2.field1530);
            this.field2296.method562(var3, (long) var2.field2932, (byte) 56);
        }
        field2290++;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(IB)I")
    public final int method921(int arg0, byte arg1) {
        field2305++;
        int var3 = 72 / ((arg1 + 50) / 58);
        if (this.field2314 == null) {
            return this.field2292;
        } else {
            class166 var4 = (class166) this.field2314.method568((long) arg0, -1);
            return var4 == null ? this.field2292 : var4.field2932;
        }
    }

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "(I)V")
    private final void method922(int arg0) {
        this.field2296 = new class69(this.field2314.method558((byte) -60));
        field2304++;
        for (class190 var2 = (class190) this.field2314.method566(arg0 - 4); var2 != null; var2 = (class190) this.field2314.method565(-126)) {
            class83 var3 = new class83(var2.field3303, (int) var2.field1530);
            this.field2296.method562(var3, var2.field3303.method1613(-97), (byte) 56);
        }
        if (arg0 != 4) {
            this.field2297 = -19;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLpj;)Lpj;")
    public static final class237 method923(byte arg0, class237 arg1) {
        field2303++;
        int var2 = class39.method401(arg1, arg0 + 13411);
        if (arg0 == 20) {
            return var2 == -1 ? class122.field2152 : class77.field1449.field1002[var2].method1592(class262.field4482, (byte) 119, class238.field4169);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZII)Lpj;")
    public static final class237 method924(boolean arg0, int arg1, int arg2) {
        field2315++;
        if (arg2 != 10) {
            field2307 = 96;
        }
        return class204.method1379(arg1, (byte) -74, arg0, 10);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lpj;I)Z")
    public final boolean method925(class237 arg0, int arg1) {
        if (arg1 != 4) {
            return true;
        }
        field2313++;
        if (this.field2314 == null) {
            return false;
        }
        if (this.field2296 == null) {
            this.method922(4);
        }
        for (class83 var3 = (class83) this.field2296.method568(arg0.method1613(-74), arg1 - 5); var3 != null; var3 = (class83) this.field2296.method559(false)) {
            if (var3.field1556.method1585((byte) 94, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)Z")
    public final boolean method926(int arg0, int arg1) {
        field2306++;
        if (this.field2314 == null) {
            return false;
        }
        if (this.field2296 == null) {
            this.method920(5);
        }
        int var3 = 99 / ((-arg0 - 59) / 52);
        class166 var4 = (class166) this.field2296.method568((long) arg1, -1);
        return var4 != null;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)Lpj;")
    public final class237 method927(int arg0, int arg1) {
        if (arg0 != 25606) {
            this.method920(8);
        }
        field2308++;
        if (this.field2314 == null) {
            return this.field2309;
        } else {
            class190 var3 = (class190) this.field2314.method568((long) arg1, arg0 - 25607);
            return var3 == null ? this.field2309 : var3.field3303;
        }
    }

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "(I)V")
    public static void method928(int arg0) {
        field2298 = null;
        field2299 = null;
        field2301 = null;
        field2310 = null;
        field2312 = null;
        field2300 = null;
        if (arg0 != 0) {
            field2298 = null;
        }
        field2311 = null;
        field2294 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILie;)V")
    public final void method929(int arg0, class32 arg1) {
        if (arg0 != -1) {
            return;
        }
        field2291++;
        while (true) {
            int var3 = arg1.method316((byte) 102);
            if (var3 == 0) {
                return;
            }
            this.method930(arg1, -18714, var3);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lie;II)V")
    private final void method930(class32 arg0, int arg1, int arg2) {
        field2302++;
        if (arg1 != -18714) {
            field2312 = null;
        }
        if (arg2 == 1) {
            this.field2297 = arg0.method316((byte) -128);
        } else if (arg2 == 2) {
            this.field2289 = arg0.method316((byte) 116);
        } else if (arg2 == 3) {
            this.field2309 = arg0.method324(1);
        } else if (arg2 == 4) {
            this.field2292 = arg0.method319((byte) -18);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method339(-16777216);
            this.field2314 = new class69(class10.method114(var4, (byte) -120));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method319((byte) -18);
                class81 var7;
                if (arg2 == 5) {
                    var7 = new class190(arg0.method324(arg1 ^ 0xFFFFB6E7));
                } else {
                    var7 = new class166(arg0.method319((byte) -18));
                }
                this.field2314.method562(var7, (long) var6, (byte) 56);
            }
        }
    }
}
