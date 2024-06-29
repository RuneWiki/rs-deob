import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class264 extends class150 {

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "I")
    private int field4087;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "I")
    private int field4083;

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "I")
    private int field4090;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "I")
    private int field4086;

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "[I")
    public static int[] field4088 = new int[4096];

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "[I")
    public static int[] field4091;

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "Lea;")
    public static class204 field4089;

    @OriginalMember(owner = "client!vg", name = "B", descriptor = "[J")
    public static long[] field4093;

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "[I")
    public static int[] field4094;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "Ljava/lang/String;")
    public static String field4092;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIZ)V", line = 8)
    public final void method1060(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method1061(91, -117, -75);
        }
        field4084++;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V", line = 18)
    public static final void method1877(int arg0) {
        class180.field2881 = arg0;
        for (int var1 = 0; var1 < class323.field5009; var1++) {
            for (int var2 = 0; var2 < class196.field3122; var2++) {
                if (class60.field946[arg0][var1][var2] == null) {
                    class60.field946[arg0][var1][var2] = new class272(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(III)V", line = 41)
    public final void method1063(int arg0, int arg1, int arg2) {
        field4082++;
        int var4 = this.field4083 * arg2 >> 12;
        int var5 = this.field4087 * arg2 >> 12;
        int var6 = this.field4090 * arg0 >> 12;
        int var7 = 94 % ((arg1 + 72) / 53);
        int var8 = this.field4086 * arg0 >> 12;
        class84.method603(var6, var4, -124, var5, this.field2413, var8);
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(IIIIII)V", line = 58)
    public class264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field4087 = arg2;
        this.field4083 = arg0;
        this.field4090 = arg1;
        this.field4086 = arg3;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)V", line = 78)
    public final void method1061(int arg0, int arg1, int arg2) {
        if (arg0 != 50) {
            this.method1060(72, 37, true);
        }
        field4081++;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field4088[var0] = class45.method360(var0, -70);
        }
        field4091 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };
        field4089 = new class204();
        field4093 = new long[100];
        field4094 = new int[50];
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V", line = 104)
    public static void method1878(boolean arg0) {
        if (!arg0) {
            return;
        }
        field4089 = null;
        field4093 = null;
        field4091 = null;
        field4088 = null;
        field4092 = null;
        field4094 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([I[II[ILhk;)V", line = 121)
    public static final void method1879(int[] arg0, int[] arg1, int arg2, int[] arg3, class305 arg4) {
        field4085++;
        if (arg2 != -1) {
            field4088 = (int[]) null;
        }
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg0[var5];
            int var8 = arg3[var5];
            int var9 = 0;
            while (var8 != 0 && arg4.field1385.length > var9) {
                if ((var8 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field1385[var9] = null;
                    } else {
                        class269 var10 = class6.method28(var6, 2);
                        class18 var11 = arg4.field1385[var9];
                        int var12 = var10.field4168;
                        if (var11 != null) {
                            if (var11.field347 == var6) {
                                if (var12 == 0) {
                                    var11 = arg4.field1385[var9] = null;
                                } else if (var12 == 1) {
                                    var11.field351 = 0;
                                    var11.field348 = 0;
                                    var11.field341 = 0;
                                    var11.field349 = 1;
                                    var11.field342 = var7;
                                    class89.method632(var10, arg4.field1442, (byte) 110, arg4.field1369, false, 0);
                                } else if (var12 == 2) {
                                    var11.field348 = 0;
                                }
                            } else if (var10.field4187 >= class6.method28(var11.field347, arg2 + 3).field4187) {
                                var11 = arg4.field1385[var9] = null;
                            }
                        }
                        if (var11 == null) {
                            class18 var13 = arg4.field1385[var9] = new class18();
                            var13.field349 = 1;
                            var13.field342 = var7;
                            var13.field347 = var6;
                            var13.field351 = 0;
                            var13.field341 = 0;
                            var13.field348 = 0;
                            class89.method632(var10, arg4.field1442, (byte) 90, arg4.field1369, false, 0);
                        }
                    }
                }
                var9++;
                var8 >>>= 0x1;
            }
        }
    }
}
