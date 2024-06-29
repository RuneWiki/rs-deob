import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class145 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Z")
    public boolean field2134 = true;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "C")
    private char field2135;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public int field2140;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Ljava/lang/String;")
    public String field2141;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "[S")
    public static short[] field2136;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILsv;I)V")
    private final void method1002(int arg0, class319 arg1, int arg2) {
        field2145++;
        if (arg2 == 1) {
            this.field2135 = class294.method1703(arg1.method1894(arg0 - 2018), -833419040);
        } else if (arg2 == 2) {
            this.field2140 = arg1.method1863(~arg0);
        } else if (arg2 == 4) {
            this.field2134 = false;
        } else if (arg2 == 5) {
            this.field2141 = arg1.method1871(arg0 + 114);
        }
        if (arg0 != 0) {
            method1009(true, true, null, null);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)Z")
    public final boolean method1003(byte arg0) {
        field2139++;
        if (arg0 != 122) {
            field2136 = null;
        }
        return this.field2135 == 's';
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLsv;)V")
    public final void method1004(byte arg0, class319 arg1) {
        field2137++;
        while (true) {
            int var3 = arg1.method1869(-97);
            if (var3 == 0) {
                if (arg0 == -39) {
                    return;
                } else {
                    field2136 = null;
                    return;
                }
            }
            this.method1002(0, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static void method1005(int arg0) {
        field2136 = null;
        if (arg0 > -36) {
            field2136 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V")
    public static final void method1006(byte arg0) {
        if (arg0 >= -66) {
            field2136 = null;
        }
        class441.field6352 = class192.method1270(8, 2048, true, 35, 0.4F, (byte) 108, 4, 8);
        field2138++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lmg;IILza;I)V")
    public static final void method1007(class530 arg0, int arg1, int arg2, class295 arg3, int arg4) {
        class377.field5430.method3143(true);
        field2143++;
        if (class407.field5772) {
            return;
        }
        if (arg4 != -2) {
            field2136 = null;
        }
        for (class237 var5 = (class237) arg0.method3137(0); var5 != null; var5 = (class237) arg0.method3132(0)) {
            class92 var6 = class472.field6803.method1655(var5.field3280, (byte) -123);
            if (class462.method2684(var6, (byte) -115)) {
                boolean var7 = class423.method2527(arg2, arg3, var5, var6, true, arg1);
                if (var7) {
                    class371.method2219(arg3, var5, (byte) -83, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)V")
    public static final void method1008(int arg0, int arg1) {
        field2142++;
        class314 var2 = class177.method1213(false, 16, arg0);
        var2.method1811((byte) 86);
        if (arg1 != -1773) {
            field2136 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZZLjava/lang/String;Ldk;)Lek;")
    public static final class431 method1009(boolean arg0, boolean arg1, String arg2, class421 arg3) {
        field2144++;
        int var4 = arg3.method2488(arg2, arg0);
        if (var4 == -1) {
            return new class431(0);
        }
        int[] var5 = arg3.method2499(0, var4);
        class431 var6 = new class431(var5.length);
        int var7 = 0;
        if (arg0) {
            method1006((byte) 74);
        }
        int var8 = 0;
        while (true) {
            while (var6.field6245 > var7) {
                class319 var9 = new class319(arg3.method2512(var4, (byte) -93, var5[var8++]));
                int var10 = var9.method1863(-1);
                int var11 = var9.method1844(-125);
                int var12 = var9.method1869(-69);
                if (!arg1 && var12 == 1) {
                    var6.field6245--;
                } else {
                    var6.field6243[var7] = var10;
                    var6.field6240[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }
}
