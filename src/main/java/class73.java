import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class73 implements Runnable {

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "Z")
    public boolean field1165 = true;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "Ljava/lang/Object;")
    public Object field1164 = new Object();

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "[I")
    public int[] field1170 = new int[500];

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public int field1168 = 0;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "[I")
    public int[] field1171 = new int[500];

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "Lbd;")
    public static class162 field1163 = class17.method142(0, "mapflag");

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "[Z")
    public static boolean[] field1159 = new boolean[100];

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field1169 = -1;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "Lbd;")
    private static class162 field1156 = class17.method142(0, "Loaded update list");

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Lbd;")
    public static class162 field1160 = field1156;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "Z")
    public static boolean field1167;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "[[[I")
    public static int[][][] field1166;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 14)
    public static final void method526(int arg0) {
        field1157++;
        class183 var1 = (class183) class10.field123.method169(30);
        if (arg0 != 64) {
            return;
        }
        while (var1 != null) {
            if (var1.field3156 > 0) {
                var1.field3156--;
            }
            if (var1.field3156 != 0) {
                if (var1.field3154 > 0) {
                    var1.field3154--;
                }
                if (var1.field3154 == 0 && var1.field3148 >= 1 && var1.field3151 >= 1 && var1.field3148 <= 102 && var1.field3151 <= 102 && (var1.field3143 < 0 || class228.method1631(var1.field3143, arg0 ^ 0x44, var1.field3152))) {
                    class42.method315(var1.field3159, (byte) -119, var1.field3152, var1.field3153, var1.field3151, var1.field3143, var1.field3148, var1.field3146);
                    var1.field3154 = -1;
                    if (var1.field3149 == var1.field3143 && var1.field3149 == -1) {
                        var1.method1183(false);
                    } else if (var1.field3149 == var1.field3143 && var1.field3157 == var1.field3146 && var1.field3152 == var1.field3147) {
                        var1.method1183(false);
                    }
                }
            } else if (var1.field3149 < 0 || class228.method1631(var1.field3149, 4, var1.field3147)) {
                class42.method315(var1.field3159, (byte) 65, var1.field3147, var1.field3153, var1.field3151, var1.field3149, var1.field3148, var1.field3157);
                var1.method1183(false);
            }
            var1 = (class183) class10.field123.method165((byte) -101);
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V", line = 71)
    public static void method527(int arg0) {
        field1159 = null;
        if (arg0 > -84) {
            field1169 = -91;
        }
        field1163 = null;
        field1156 = null;
        field1160 = null;
        field1166 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!nh", name = "run", descriptor = "()V", line = 85)
    public final void run() {
        while (this.field1165) {
            Object var1 = this.field1164;
            synchronized (this.field1164) {
                if (this.field1168 < 500) {
                    this.field1171[this.field1168] = class109.field1961;
                    this.field1170[this.field1168] = class274.field4554;
                    this.field1168++;
                }
            }
            class177.method1342(50L, 1);
        }
        field1158++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILob;Lbd;)Lbd;", line = 116)
    public static final class162 method528(int arg0, class78 arg1, class162 arg2) {
        field1155++;
        if (arg0 < 67) {
            return (class162) null;
        } else if (arg2.method1244((byte) 23, class213.field3578) == -1) {
            return arg2;
        } else {
            while (true) {
                int var3 = arg2.method1244((byte) 23, class317.field5352);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.method1244((byte) 23, class213.field3575);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.method1244((byte) 23, class67.field1076);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.method1244((byte) 23, class49.field788);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.method1244((byte) 23, class10.field125);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.method1244((byte) 23, class162.field2856);
                                                        if (var8 == -1) {
                                                            return arg2;
                                                        }
                                                        class162 var9 = class244.field4053;
                                                        if (class248.field4129 != null) {
                                                            var9 = class78.method586(class248.field4129.field2935, -21629);
                                                            try {
                                                                if (class248.field4129.field2933 != null) {
                                                                    byte[] var10 = ((String) class248.field4129.field2933).getBytes("ISO-8859-1");
                                                                    var9 = class95.method768(var10.length, 0, var10, (byte) 120);
                                                                }
                                                            } catch (UnsupportedEncodingException var12) {
                                                            }
                                                        }
                                                        arg2 = class135.method1062(new class162[] { arg2.method1283(0, var8, (byte) 111), var9, arg2.method1254((byte) 95, var8 + 4) }, true);
                                                    }
                                                }
                                                arg2 = class135.method1062(new class162[] { arg2.method1283(0, var7, (byte) 127), class92.method694(-1000000000, class129.method1035(4, arg1, (byte) -72)), arg2.method1254((byte) 95, var7 + 2) }, true);
                                            }
                                        }
                                        arg2 = class135.method1062(new class162[] { arg2.method1283(0, var6, (byte) 81), class92.method694(-1000000000, class129.method1035(3, arg1, (byte) -29)), arg2.method1254((byte) 95, var6 + 2) }, true);
                                    }
                                }
                                arg2 = class135.method1062(new class162[] { arg2.method1283(0, var5, (byte) 119), class92.method694(-1000000000, class129.method1035(2, arg1, (byte) -111)), arg2.method1254((byte) 95, var5 + 2) }, true);
                            }
                        }
                        arg2 = class135.method1062(new class162[] { arg2.method1283(0, var4, (byte) 95), class92.method694(-1000000000, class129.method1035(1, arg1, (byte) -115)), arg2.method1254((byte) 95, var4 + 2) }, true);
                    }
                }
                arg2 = class135.method1062(new class162[] { arg2.method1283(0, var3, (byte) 87), class92.method694(-1000000000, class129.method1035(0, arg1, (byte) -112)), arg2.method1254((byte) 95, var3 + 2) }, true);
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lrg;II)V", line = 219)
    public static final void method529(class301 arg0, int arg1, int arg2) {
        field1162++;
        if (class90.field1598 < arg0.field5049) {
            class199.method1486(-101, arg0);
        } else if (arg0.field5063 < class90.field1598) {
            class256.method1767(127, arg0);
        } else {
            class126.method1015(-11460, arg0);
        }
        if (arg0.field5013 < 128 || arg0.field5047 < 128 || arg0.field5013 >= 13184 || arg0.field5047 >= 13184) {
            arg0.field5063 = 0;
            arg0.field5049 = 0;
            arg0.field5029 = -1;
            arg0.field5057 = -1;
            arg0.field5013 = arg0.field5050[0] * 128 + (arg0.method293((byte) 25) * 64);
            arg0.field5047 = arg0.field5034[0] * 128 + arg0.method293((byte) 25) * 64;
            arg0.method2052(0);
        }
        if (class122.field2215 == arg0 && (arg0.field5013 < 1536 || arg0.field5047 < 1536 || arg0.field5013 >= 11776 || arg0.field5047 >= 11776)) {
            arg0.field5057 = -1;
            arg0.field5049 = 0;
            arg0.field5029 = -1;
            arg0.field5063 = 0;
            arg0.field5013 = arg0.field5050[0] * 128 + (arg0.method293((byte) 25) * 64);
            arg0.field5047 = arg0.field5034[0] * 128 + (arg0.method293((byte) 25) * 64);
            arg0.method2052(0);
        }
        class64.method438(true, arg0);
        class61.method414(arg0, (byte) 107);
        int var3 = -107 / ((arg1 - 54) / 58);
    }
}
