import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class162 {

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Z")
    public boolean field2874 = false;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "[I")
    public static int[] field2868 = new int[32];

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "J")
    public static volatile long field2871 = 0L;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public int field2869;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public int field2873;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILpi;II)V", line = 4)
    private final void method1286(int arg0, class336 arg1, int arg2, int arg3) {
        if (arg3 != 21603) {
            this.field2874 = true;
        }
        field2872++;
        if (arg0 == 1) {
            this.field2873 = arg1.method2339((byte) -46);
        } else if (arg0 == 2) {
            this.field2869 = arg1.method2317(21803);
        } else if (arg0 == 3) {
            this.field2874 = true;
        } else if (arg0 == 4) {
            this.field2873 = -1;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZII)Lta;", line = 40)
    public final class217 method1287(boolean arg0, int arg1, int arg2) {
        field2877++;
        class217 var4 = (class217) class56.field861.method467(true, (long) (arg2 << 16 | this.field2873 | (arg0 ? 262144 : 0)));
        if (var4 != null) {
            return var4;
        }
        class35.field496.method432(this.field2873, false);
        if (arg1 != -2715) {
            this.method1293(-42, (class336) null, 15);
        }
        class217 var5 = class102.method876(class35.field496, 0, 24250, this.field2873);
        if (var5 != null) {
            var5.method1598(class308.field4900, class34.field486, class248.field4029);
            var5.field4047 = var5.field4054;
            var5.field4050 = var5.field4048;
            if (arg0) {
                var5.method1592();
            }
            for (int var6 = 0; var6 < arg2; var6++) {
                var5.method1603();
            }
            class56.field861.method465(var5, (long) (this.field2873 | arg2 << 16 | (arg0 ? 262144 : 0)), (byte) 78);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I[Ljava/lang/String;[SII)V", line = 83)
    public static final void method1288(int arg0, String[] arg1, short[] arg2, int arg3, int arg4) {
        field2865++;
        if (arg4 != 1) {
            field2870 = 15;
        }
        if (arg0 >= arg3) {
            return;
        }
        int var5 = (arg0 + arg3) / 2;
        int var6 = arg0;
        String var7 = arg1[var5];
        arg1[var5] = arg1[arg3];
        arg1[arg3] = var7;
        short var8 = arg2[var5];
        arg2[var5] = arg2[arg3];
        arg2[arg3] = var8;
        for (int var9 = arg0; var9 < arg3; var9++) {
            if (var7 == null || arg1[var9] != null && arg1[var9].compareTo(var7) < (var9 & 0x1)) {
                String var10 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6] = var10;
                short var11 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6++] = var11;
            }
        }
        arg1[arg3] = arg1[var6];
        arg1[var6] = var7;
        arg2[arg3] = arg2[var6];
        arg2[var6] = var8;
        method1288(arg0, arg1, arg2, var6 - 1, 1);
        method1288(var6 + 1, arg1, arg2, arg3, 1);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 140)
    public static final void method1289(int arg0) {
        field2878++;
        class336.field5364.method470(12);
        if (arg0 != 1) {
            field2871 = -125L;
        }
        class58.field899.method470(arg0 ^ 0xD);
        class69.field1130.method470(12);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLcg;)I", line = 156)
    public static final int method1290(byte arg0, class49 arg1) {
        if (arg0 != -42) {
            field2870 = 107;
        }
        int var2 = 0;
        if (arg1.method432(class107.field1831, false)) {
            var2++;
        }
        if (arg1.method432(class178.field3026, false)) {
            var2++;
        }
        field2876++;
        return var2;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V", line = 179)
    public static final void method1291(byte arg0) {
        field2875++;
        if (arg0 != -37) {
            field2871 = -123L;
        }
        class342.field5447.method470(12);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V", line = 194)
    public static void method1292(int arg0) {
        if (arg0 == -1) {
            field2868 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILpi;I)V", line = 207)
    public final void method1293(int arg0, class336 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method2364(-9069);
            if (var4 == 0) {
                if (arg0 != 5) {
                    this.method1287(false, -87, 3);
                }
                field2866++;
                return;
            }
            this.method1286(var4, arg1, arg2, arg0 ^ 0x5466);
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)V", line = 224)
    public static final void method1294(byte arg0) {
        class13.method130(-122, 5);
        class332.method2305((byte) -122, 5);
        class170.method1342(-126, 5);
        field2867++;
        class228.method1653(5, false);
        class300.method2075(5, true);
        class140.method1141(5, 4096);
        class28.method255(5, -73);
        class52.method474(5, (byte) -79);
        class329.method2286(5, -16088);
        class126.method1052(-121, 5);
        class127.method1059(28367, 5);
        class346.method2431((byte) -127, 5);
        class13.method132(5, -67);
        class286.method1957((byte) 86, 5);
        class178.method1372((byte) 116, 5);
        class121.method1028(true, 5);
        class327.method2273(false, 5);
        int var1 = 57 % ((-arg0 - 2) / 57);
        class297.method2025(50, -14617);
        class34.method310(5, -14249);
        class214.method1585(0, 5);
        class127.field2208.method469(-11815, 5);
        class123.field2133.method469(-11815, 5);
    }
}
