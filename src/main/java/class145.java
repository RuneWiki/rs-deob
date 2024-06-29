import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class145 {

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "Lia;")
    private class231 field2315;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "Lii;")
    private class263 field2317;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "Lqk;")
    private class213 field2308;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field2311 = 0;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2310 = "Loaded defaults";

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static volatile int field2312 = -1;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2303 = -1;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2304 = "K";

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Lai;")
    private class88 field2305;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "[Led;")
    public static class186[] field2306;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "[Llh;")
    private class295[] field2314;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILuh;ZLuh;Z)Llh;")
    private final class295 method980(int arg0, class103 arg1, boolean arg2, class103 arg3, boolean arg4) {
        field2313++;
        if (this.field2305 == null) {
            throw new RuntimeException();
        }
        this.field2305.field1535 = arg0 * 8 + 5;
        if (this.field2305.field1535 >= this.field2305.field1471.length) {
            throw new RuntimeException();
        }
        if (!arg2) {
            method983(-120);
        }
        if (this.field2314[arg0] != null) {
            return this.field2314[arg0];
        }
        int var6 = this.field2305.method641(-1);
        int var7 = this.field2305.method641(-1);
        class295 var8 = new class295(arg0, arg3, arg1, this.field2315, this.field2317, var6, var7, arg4);
        this.field2314[arg0] = var8;
        return var8;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)[Lul;")
    public static final class192[] method981(int arg0) {
        if (arg0 >= -20) {
            return null;
        }
        field2301++;
        class192[] var1 = new class192[class293.field4626];
        for (int var2 = 0; var2 < class293.field4626; var2++) {
            var1[var2] = new class290(class213.field3317, class130.field2056, class193.field3066[var2], class108.field1779[var2], class28.field390[var2], class171.field2679[var2], class198.field3123[var2], class94.field1601);
        }
        class19.method179(8);
        return var1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static final void method982(byte arg0) {
        if (arg0 <= 54) {
            field2311 = 17;
        }
        field2316++;
        class261.field4170.method290(-7981);
        class2.field6.method603((byte) 111);
        class221.field3397.method603((byte) 111);
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public static void method983(int arg0) {
        if (arg0 == 64) {
            field2306 = null;
            field2304 = null;
            field2310 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
    public final void method984(boolean arg0) {
        if (!arg0) {
            return;
        }
        field2318++;
        if (this.field2314 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field2314.length; var2++) {
            if (this.field2314[var2] != null) {
                this.field2314[var2].method1967(-106);
            }
        }
        for (int var3 = 0; var3 < this.field2314.length; var3++) {
            if (this.field2314[var3] != null) {
                this.field2314[var3].method1968((byte) -67);
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V")
    public static final void method985(int arg0) {
        field2302++;
        if (arg0 != -13238) {
            field2303 = 101;
        }
        for (int var1 = 0; var1 < class112.field1841; var1++) {
            int var10002 = class165.field2591[var1]--;
            if (class165.field2591[var1] >= -10) {
                class92 var3 = class250.field4031[var1];
                if (var3 == null) {
                    var3 = class92.method699(class135.field2097, class122.field1956[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class165.field2591[var1] += var3.method697();
                    class250.field4031[var1] = var3;
                }
                if (class165.field2591[var1] < 0) {
                    int var10;
                    if (class121.field1944[var1] == 0) {
                        var10 = class296.field4682[var1] * class18.field272 >> 8;
                    } else {
                        int var4 = (class121.field1944[var1] & 0xFF) * 128;
                        int var5 = class121.field1944[var1] >> 16 & 0xFF;
                        int var6 = var5 * 128 + 64 - class283.field4473.field2240;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = (class121.field1944[var1] & 0xFFC5) >> 8;
                        int var8 = var7 * 128 + 64 - class283.field4473.field2278;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var6 + var8 - 128;
                        if (var9 > var4) {
                            class165.field2591[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = class296.field4682[var1] * class86.field1445 * (var4 - var9) / var4 >> 8;
                    }
                    if (var10 > 0) {
                        class285 var11 = var3.method698().method1914(class42.field601);
                        class14 var12 = class14.method117(var11, 100, var10);
                        var12.method152(class131.field2060[var1] - 1);
                        class257.field4118.method1203(var12);
                    }
                    class165.field2591[var1] = -100;
                }
            } else {
                class112.field1841--;
                for (int var2 = var1; var2 < class112.field1841; var2++) {
                    class122.field1956[var2] = class122.field1956[var2 + 1];
                    class250.field4031[var2] = class250.field4031[var2 + 1];
                    class131.field2060[var2] = class131.field2060[var2 + 1];
                    class165.field2591[var2] = class165.field2591[var2 + 1];
                    class121.field1944[var2] = class121.field1944[var2 + 1];
                    class296.field4682[var2] = class296.field4682[var2 + 1];
                }
                var1--;
            }
        }
        if (class148.field2341 && !class61.method462(1)) {
            if (class294.field4633 != 0 && class167.field2618 != -1) {
                class132.method916(arg0 ^ 0x2B94, class31.field459, class167.field2618, 0, false, class294.field4633);
            }
            class148.field2341 = false;
        } else if (class294.field4633 != 0 && class167.field2618 != -1 && !class61.method462(1)) {
            class257.field4109++;
            client.field2435.method536((byte) -104, 190);
            client.field2435.method639(class167.field2618, (byte) -120);
            class167.field2618 = -1;
        }
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)Z")
    public final boolean method986(int arg0) {
        field2309++;
        if (arg0 != -1) {
            this.method986(-28);
        }
        if (this.field2305 != null) {
            return true;
        }
        if (this.field2308 == null) {
            if (this.field2315.method1548(true)) {
                return false;
            }
            this.field2308 = this.field2315.method1540((byte) 0, 0, 255, 255, true);
        }
        if (this.field2308.field2377) {
            return false;
        } else {
            this.field2305 = new class88(this.field2308.method1024(arg0 ^ 0x66));
            this.field2314 = new class295[(this.field2305.field1471.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Luh;ILuh;I)Llh;")
    public final class295 method987(class103 arg0, int arg1, class103 arg2, int arg3) {
        field2307++;
        if (arg3 < 102) {
            this.method986(-115);
        }
        return this.method980(arg1, arg0, true, arg2, true);
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lia;Lii;)V")
    public class145(class231 arg0, class263 arg1) {
        this.field2315 = arg0;
        this.field2317 = arg1;
        if (!this.field2315.method1548(true)) {
            this.field2308 = this.field2315.method1540((byte) 0, 0, 255, 255, true);
        }
    }
}
