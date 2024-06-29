import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class129 extends class189 {

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "Leg;")
    private static class37 field2143 = class174.method1167("Loaded fonts", 106);

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "[I")
    public static int[] field2145 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "Leg;")
    private static class37 field2142 = class174.method1167("level: ", 108);

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "[J")
    public static long[] field2141 = new long[500];

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "Leg;")
    public static class37 field2144 = field2143;

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "Leg;")
    public static class37 field2155 = field2142;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "Ldj;")
    public class129 field2148;

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "Ldj;")
    public class129 field2156;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V")
    public final void method913(byte arg0) {
        if (arg0 < 80) {
            field2141 = null;
        }
        field2147++;
        if (this.field2148 != null) {
            this.field2148.field2156 = this.field2156;
            this.field2156.field2148 = this.field2148;
            this.field2148 = null;
            this.field2156 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILpe;)V")
    public static final void method914(int arg0, class237 arg1) {
        field2153++;
        int var2 = arg1.field4175;
        if (var2 == 324) {
            if (class145.field2472 == -1) {
                class145.field2472 = arg1.field4104;
                class178.field2970 = arg1.field4207;
            }
            if (class239.field4255.field5030) {
                arg1.field4104 = class145.field2472;
            } else {
                arg1.field4104 = class178.field2970;
            }
        } else if (var2 == 325) {
            if (class145.field2472 == -1) {
                class178.field2970 = arg1.field4207;
                class145.field2472 = arg1.field4104;
            }
            if (class239.field4255.field5030) {
                arg1.field4104 = class178.field2970;
            } else {
                arg1.field4104 = class145.field2472;
            }
        } else if (var2 == 327) {
            arg1.field4107 = 150;
            arg1.field4145 = (int) (Math.sin((double) class72.field1146 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field4119 = 5;
            arg1.field4085 = -1;
        } else if (~var2 == arg0) {
            if (class82.field1285.field3235 == null) {
                arg1.field4085 = 0;
            } else {
                arg1.field4107 = 150;
                arg1.field4145 = (int) (Math.sin((double) class72.field1146 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field4119 = 5;
                arg1.field4085 = ((int) class82.field1285.field3235.method217((byte) -102) << 11) + 2047;
                arg1.field4165 = class82.field1285.field1792;
                arg1.field4181 = class82.field1285.field1789;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIII)V")
    public static final void method915(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2149++;
        int var6 = 0;
        if (arg3 != -23215) {
            return;
        }
        int var7 = arg5 * arg5;
        int var8 = arg2 * arg2;
        int var9 = arg2;
        int var10 = arg2 << 1;
        int var11 = var7 << 1;
        int var12 = var8 << 1;
        int var13 = (1 - var10) * var7 + var12;
        int var14 = var8 - (var10 - 1) * var11;
        int var15 = var7 << 2;
        int var16 = var8 << 2;
        int var17 = ((var6 << 1) + 3) * var12;
        int var18 = (var6 + 1) * var16;
        if (class286.field5050 <= arg4 && arg4 <= class96.field1507) {
            int var19 = class139.method975(class178.field2972, true, arg0 + arg5, class217.field3741);
            int var20 = class139.method975(class178.field2972, true, arg0 - arg5, class217.field3741);
            class145.method1010(var19, var20, -25086, arg1, class210.field3617[arg4]);
        }
        int var21 = ((arg2 << 1) - 3) * var11;
        int var22 = (arg2 - 1) * var15;
        while (var9 > 0) {
            var9--;
            if (var13 < 0) {
                while (var13 < 0) {
                    var6++;
                    var14 += var18;
                    var18 += var16;
                    var13 += var17;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var18;
                var13 += var17;
                var17 += var16;
                var18 += var16;
                var6++;
            }
            var14 += -var21;
            var21 -= var15;
            int var23 = arg4 + var9;
            int var24 = arg4 - var9;
            var13 += -var22;
            if (var23 >= class286.field5050 && class96.field1507 >= var24) {
                int var25 = class139.method975(class178.field2972, true, arg0 + var6, class217.field3741);
                int var26 = class139.method975(class178.field2972, true, arg0 - var6, class217.field3741);
                if (var24 >= class286.field5050) {
                    class145.method1010(var25, var26, -25086, arg1, class210.field3617[var24]);
                }
                if (class96.field1507 >= var23) {
                    class145.method1010(var25, var26, arg3 ^ 0x3B53, arg1, class210.field3617[var23]);
                }
            }
            var22 -= var15;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILeg;Z)V")
    public static final void method916(int arg0, class37 arg1, boolean arg2) {
        class274 var3 = class166.method1116(2, arg0, true);
        field2151++;
        var3.method1835(-29);
        var3.field4812 = arg1;
        if (arg2) {
            field2143 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)V")
    public static final void method917(boolean arg0) {
        class178.method1185(5, (byte) 119);
        field2154++;
        class236.method1617((byte) 117, 5);
        class215.method1524(128, 5);
        class240.method1645((byte) 110, 5);
        if (!arg0) {
            field2144 = null;
        }
        class169.method1132(6, 5);
        class109.method757(5, 0);
        class202.method1401(5, -91);
        class77.method528(9232, 5);
        class239.method1641(5, (byte) 50);
        class26.method154(5, -4742);
        class124.method893((byte) 53, 5);
        class280.method1879(1, 50);
        class156.method1063(5, -23917);
        class203.method1418(78, 5);
        class88.field1388.method1402((byte) -113, 5);
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
    public static void method918(int arg0) {
        field2145 = null;
        field2141 = null;
        if (arg0 == 941741986) {
            field2155 = null;
            field2144 = null;
            field2142 = null;
            field2143 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([Leg;I)[Leg;")
    public static final class37[] method919(class37[] arg0, int arg1) {
        field2152++;
        class37[] var2 = new class37[5];
        int var3 = 0;
        if (arg1 != 2047) {
            field2141 = null;
        }
        while (var3 < 5) {
            var2[var3] = class156.method1061((byte) 96, new class37[] { class163.method1096(var3, (byte) -35), class180.field3013 });
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class156.method1061((byte) -72, new class37[] { var2[var3], arg0[var3] });
            }
            var3++;
        }
        return var2;
    }
}
