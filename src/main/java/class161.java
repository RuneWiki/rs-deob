import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class161 extends class179 {

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "I")
    public static int field2434 = -1;

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "Ljava/lang/String;")
    public static String field2446 = "level: ";

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!tf", name = "D", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "Ljava/lang/String;")
    public String field2448;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "[C")
    public char[] field2437;

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "[C")
    public char[] field2441;

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "[I")
    public static int[] field2438;

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "[I")
    public int[] field2443;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "[I")
    public int[] field2449;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "(I)V")
    public final void method1255(int arg0) {
        field2442++;
        if (this.field2449 != null) {
            for (int var2 = 0; var2 < this.field2449.length; var2++) {
                this.field2449[var2] = class439.method2744(this.field2449[var2], 32768);
            }
        }
        if (this.field2443 != null) {
            for (int var3 = 0; var3 < this.field2443.length; var3++) {
                this.field2443[var3] = class439.method2744(this.field2443[var3], 32768);
            }
        }
        int var4 = -15 % ((-arg0 - 31) / 42);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IBIIIIZFI)[[I")
    public static final int[][] method1256(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, float arg7, int arg8) {
        field2440++;
        int[][] var9 = new int[arg5][arg8];
        class423 var10 = new class423();
        var10.field6161 = arg2;
        var10.field6157 = arg6;
        var10.field6162 = (int) (arg7 * 4096.0F);
        var10.field6163 = arg0;
        var10.field6149 = arg3;
        var10.method83(true);
        class106.method941(arg5, arg1 ^ 0xFFFFFF95, arg8);
        if (arg1 == -11) {
            for (int var11 = 0; var11 < arg5; var11++) {
                var10.method2658(var9[var11], arg1 + 5273, var11);
            }
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZC)I")
    public final int method1257(boolean arg0, char arg1) {
        field2433++;
        if (this.field2443 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg0) {
            this.method1258((byte) 95, 55, (class37) null);
        }
        while (var3 < this.field2443.length) {
            if (this.field2437[var3] == arg1) {
                return this.field2443[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BILec;)V")
    private final void method1258(byte arg0, int arg1, class37 arg2) {
        field2439++;
        if (arg1 == 1) {
            this.field2448 = arg2.method322((byte) -34);
        } else if (arg1 == 2) {
            int var7 = arg2.method271((byte) 112);
            this.field2443 = new int[var7];
            this.field2437 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2443[var8] = arg2.method320((byte) -87);
                byte var9 = arg2.method291(0);
                this.field2437[var8] = var9 == 0 ? 0 : class254.method1841(var9, (byte) -128);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method271((byte) 119);
            this.field2441 = new char[var4];
            this.field2449 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2449[var5] = arg2.method320((byte) -87);
                byte var6 = arg2.method291(0);
                this.field2441[var5] = var6 == 0 ? 0 : class254.method1841(var6, (byte) -128);
            }
        }
        if (arg0 > -50) {
            field2446 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lqa;I)Z")
    public static final boolean method1259(class242 arg0, int arg1) {
        field2444++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field3496) {
            return false;
        } else if (arg0.method1768(21)) {
            if (arg1 != 10418) {
                method1259((class242) null, 44);
            }
            if (class211.field3137.method1219((long) arg0.field3502, -91) == null) {
                return class242.field3523.method1219((long) arg0.field3528, arg1 - 10516) == null;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lec;Z)V")
    public final void method1260(class37 arg0, boolean arg1) {
        if (!arg1) {
            this.method1258((byte) 104, -88, (class37) null);
        }
        field2435++;
        while (true) {
            int var3 = arg0.method271((byte) 105);
            if (var3 == 0) {
                return;
            }
            this.method1258((byte) -93, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "(B)V")
    public static void method1261(byte arg0) {
        field2438 = null;
        if (arg0 < -87) {
            field2446 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method1262(int arg0, int arg1, int arg2, Class arg3) {
        class168 var4 = class443.field6447[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class36 var5 = var4.field2488; var5 != null; var5 = var5.field505) {
            class447 var6 = var5.field511;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6526 == arg1 && var6.field6513 == arg2) {
                class372.method2365(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IC)I")
    public final int method1263(int arg0, char arg1) {
        field2447++;
        if (this.field2449 == null) {
            return -1;
        }
        if (arg0 != -1) {
            this.field2449 = null;
        }
        for (int var3 = 0; var3 < this.field2449.length; var3++) {
            if (this.field2441[var3] == arg1) {
                return this.field2449[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ldp;BLdp;)V")
    public static final void method1264(class174 arg0, byte arg1, class174 arg2) {
        class381.field5417 = arg2;
        class183.field2704 = arg0;
        if (arg1 <= 11) {
            field2434 = 55;
        }
        field2436++;
    }
}
