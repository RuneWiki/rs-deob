import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class295 extends class34 {

    @OriginalMember(owner = "client!ph", name = "U", descriptor = "I")
    public static int field4482 = 0;

    @OriginalMember(owner = "client!ph", name = "Q", descriptor = "[I")
    public static int[] field4478 = new int[128];

    @OriginalMember(owner = "client!ph", name = "T", descriptor = "[Ljava/lang/String;")
    public static String[] field4481 = new String[5];

    @OriginalMember(owner = "client!ph", name = "W", descriptor = "[I")
    public static int[] field4484 = new int[1000];

    @OriginalMember(owner = "client!ph", name = "db", descriptor = "Ljava/lang/String;")
    public static String field4491 = "Loading - please wait.";

    @OriginalMember(owner = "client!ph", name = "eb", descriptor = "[Lig;")
    public static class57[] field4492 = new class57[50];

    @OriginalMember(owner = "client!ph", name = "hb", descriptor = "[I")
    public static int[] field4495 = new int[] { 4, 3, 0, 0, 6, 0, 6, 0, 7, -2, 0, 0, 0, 0, 14, 1, 0, 0, 28, 0, -1, -2, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 10, 0, 0, 3, 0, 0, 0, 0, 2, 15, 0, 0, -2, 6, 8, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, -2, 0, 0, 8, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 6, 6, 0, 0, 2, 0, 0, 2, 6, 8, 0, -1, 0, 3, 0, 0, 0, 6, 12, 0, 5, 2, 0, 0, 0, -2, 0, 0, 0, 0, 0, 3, -2, 10, -2, 0, -2, 0, -2, 0, 0, 0, 0, 0, 0, 0, 2, 0, -1, 0, 0, 0, 3, 12, 2, 0, 0, 1, 0, 0, -1, 8, 0, 0, 3, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, -1, -2, 9, 0, 6, 7, 0, 12, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 7, 0, 8, 0, 0, 0, 0, 0, 0, 11, 3, -2, 8, 0, 10, -2, 0, 0, 0, 0, 0, 0, 0, -1, 20, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 5, -1, 0, 0, 0, 4, 0, 0, 0, 6, 0, 0, 15, 1, 0, -2, 7, 1, 0, 14, 8, 0, -1, 0, 3, 1, 0, 5, -1, 2, 0, 0, 8, 0, 0, 12, 0, 4, 0, 0, 0, 17, 8 };

    @OriginalMember(owner = "client!ph", name = "P", descriptor = "I")
    private int field4477;

    @OriginalMember(owner = "client!ph", name = "R", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!ph", name = "S", descriptor = "I")
    private int field4480;

    @OriginalMember(owner = "client!ph", name = "V", descriptor = "I")
    private int field4483;

    @OriginalMember(owner = "client!ph", name = "X", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!ph", name = "Y", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!ph", name = "Z", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!ph", name = "ab", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!ph", name = "bb", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!ph", name = "fb", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!ph", name = "gb", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!ph", name = "cb", descriptor = "J")
    public static long field4490;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "(I)V")
    public static void method1941(int arg0) {
        field4495 = null;
        if (arg0 > -82) {
            method1946(116);
        }
        field4478 = null;
        field4491 = null;
        field4481 = null;
        field4492 = null;
        field4484 = null;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(I)V")
    private class295(int arg0) {
        super(0, false);
        this.method1947(arg0, -1117933084);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZIZIIII)V")
    public static final void method1942(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 713) {
            method1943(-29, 87, (byte) -68);
        }
        if (arg4 < arg6) {
            int var7 = (arg4 - -arg6) / 2;
            class293 var8 = class101.field1471[var7];
            int var9 = arg4;
            class101.field1471[var7] = class101.field1471[arg6];
            class101.field1471[arg6] = var8;
            for (int var10 = arg4; arg6 > var10; ++var10) {
                if (class90.method681(class101.field1471[var10], arg2, true, arg0, arg5, arg1, var8) <= 0) {
                    class293 var11 = class101.field1471[var10];
                    class101.field1471[var10] = class101.field1471[var9];
                    class101.field1471[var9++] = var11;
                }
            }
            class101.field1471[arg6] = class101.field1471[var9];
            class101.field1471[var9] = var8;
            method1942(arg0, arg1, arg2, 713, arg4, arg5, var9 + -1);
            method1942(arg0, arg1, arg2, 713, var9 + 1, arg5, arg6);
        }
        ++field4489;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIB)V")
    public static final void method1943(int arg0, int arg1, byte arg2) {
        class166.field2447[arg1] = arg0;
        ++field4494;
        class280 var3 = (class280) class47.field797.method306((long) arg1, 16216);
        if (arg2 > 9) {
            if (var3 == null) {
                class280 var4 = new class280(class257.method1736(14361) - -500L);
                class47.field797.method309((byte) -8, var4, (long) arg1);
            } else {
                var3.field4300 = class257.method1736(14361) + 500L;
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
    public class295() {
        this(0);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method1944(String arg0, byte arg1) {
        if (arg1 >= -45) {
            field4490 = 39L;
        }
        ++field4493;
        int var2 = class106.method773(false, arg0);
        return ~var2 == 0 ? "" : class162.method1093((byte) -112, " ", "<br>", class154.field2251.field3731[var2]);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljk;Z)Ljava/lang/String;")
    public static final String method1945(class297 arg0, boolean arg1) {
        if (!arg1) {
            method1944((String) null, (byte) -64);
        }
        ++field4485;
        if (client.method333(arg0).method1961(3) == 0) {
            return null;
        } else if (arg0.field4539 != null && ~arg0.field4539.trim().length() != -1) {
            return arg0.field4539;
        } else {
            return class112.field1712 ? "Hidden-use" : null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "(I)V")
    public static final void method1946(int arg0) {
        ++field4486;
        int var1 = (class185.field2687.field425 >> 7) + class90.field1367;
        class167.field2465 = 0;
        int var2 = (class185.field2687.field455 >> 7) + class188.field2774;
        if (var1 >= 3053 && ~var1 >= -3157 && ~var2 <= -3057 && var2 <= 3136) {
            class167.field2465 = 1;
        }
        if (arg0 != 6863) {
            method1943(97, -33, (byte) 13);
        }
        if (var1 >= 3072 && ~var1 >= -3119 && ~var2 <= -9493 && ~var2 >= -9536) {
            class167.field2465 = 1;
        }
        if (class167.field2465 == 1 && ~var1 <= -3140 && ~var1 >= -3200 && ~var2 <= -3009 && ~var2 >= -3063) {
            class167.field2465 = 0;
        }
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(II)V")
    private final void method1947(int arg0, int arg1) {
        ++field4487;
        this.field4483 = (arg0 & 16711680) >> 12;
        if (arg1 == -1117933084) {
            this.field4480 = (arg0 & 255) << 4;
            this.field4477 = arg0 >> 4 & 4080;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        ++field4488;
        if (arg1 == 0) {
            this.method1947(arg2.method408(8), -1117933084);
        }
        if (arg0 != 6) {
            field4478 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        int[][] var3 = super.field618.method91(67, arg1);
        if (super.field618.field211) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class226.field3527; ++var7) {
                var4[var7] = this.field4483;
                var5[var7] = this.field4477;
                var6[var7] = this.field4480;
            }
        }
        int var8 = 47 % ((arg0 - -54) / 44);
        ++field4479;
        return var3;
    }
}
