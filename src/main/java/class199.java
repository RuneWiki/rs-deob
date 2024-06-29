import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class199 extends class112 {

    @OriginalMember(owner = "client!ci", name = "M", descriptor = "I")
    public static int field3207 = 0;

    @OriginalMember(owner = "client!ci", name = "K", descriptor = "I")
    public static int field3205 = 0;

    @OriginalMember(owner = "client!ci", name = "U", descriptor = "Lwm;")
    public static class152 field3215 = class157.method1048("Starte 3D)2Softwarebibliothek)3", 96);

    @OriginalMember(owner = "client!ci", name = "X", descriptor = "Lwm;")
    private static class152 field3217 = class157.method1048("Connection lost)3", 109);

    @OriginalMember(owner = "client!ci", name = "T", descriptor = "Lwm;")
    public static class152 field3214 = class157.method1048("Memory after cleanup=", 116);

    @OriginalMember(owner = "client!ci", name = "O", descriptor = "Z")
    public static boolean field3209 = true;

    @OriginalMember(owner = "client!ci", name = "L", descriptor = "I")
    public static int field3206 = 0;

    @OriginalMember(owner = "client!ci", name = "db", descriptor = "Lwm;")
    public static class152 field3223 = field3217;

    @OriginalMember(owner = "client!ci", name = "ab", descriptor = "Luc;")
    public static class189 field3220 = new class189();

    @OriginalMember(owner = "client!ci", name = "N", descriptor = "I")
    private int field3208;

    @OriginalMember(owner = "client!ci", name = "P", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!ci", name = "Q", descriptor = "I")
    private int field3211;

    @OriginalMember(owner = "client!ci", name = "R", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!ci", name = "S", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!ci", name = "W", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!ci", name = "Z", descriptor = "I")
    private int field3219;

    @OriginalMember(owner = "client!ci", name = "bb", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!ci", name = "cb", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!ci", name = "eb", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!ci", name = "fb", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!ci", name = "gb", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!ci", name = "Y", descriptor = "[[[B")
    public static byte[][][] field3218;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILhi;)V", line = 13)
    public final void method52(int arg0, int arg1, class291 arg2) {
        if (arg1 == 0) {
            this.method1330(arg2.method2009((byte) 64), (byte) 127);
        }
        if (arg0 != 31164) {
            field3206 = 100;
        }
        field3225++;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V", line = 32)
    public class199() {
        this(0);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIIII)Z", line = 36)
    public static final boolean method1327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZ)[[I", line = 63)
    public final int[][] method55(int arg0, boolean arg1) {
        int[][] var3 = this.field1594.method656((byte) 121, arg0);
        if (arg1) {
            method1327(125, 8, 120, 32, -45, 79, -81, -36);
        }
        field3216++;
        if (this.field1594.field1402) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class58.field889; var7++) {
                var4[var7] = this.field3219;
                var5[var7] = this.field3211;
                var6[var7] = this.field3208;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(I)V", line = 101)
    private class199(int arg0) {
        super(0, false);
        this.method1330(arg0, (byte) 113);
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(B)V", line = 121)
    public static void method1328(byte arg0) {
        field3218 = (byte[][][]) null;
        field3214 = null;
        field3217 = null;
        field3215 = null;
        if (arg0 > 76) {
            field3223 = null;
            field3220 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(III)V", line = 171)
    public static final void method1329(int arg0, int arg1, int arg2) {
        field3213++;
        class155.field2464[arg0] = arg1;
        class139 var3 = (class139) class183.field2901.method1586((long) arg0, -92);
        if (var3 == null) {
            class139 var4 = new class139(4611686018427387905L);
            class183.field2901.method1593((long) arg0, var4, 27497);
        } else if (var3.field2118 != 4611686018427387905L) {
            var3.field2118 = class76.method507(-30994) + 500L | 0x4000000000000000L;
        }
        if (arg2 != -30091) {
            field3215 = (class152) null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)V", line = 197)
    private final void method1330(int arg0, byte arg1) {
        if (arg1 <= 105) {
            method1331((class249) null, 125);
        }
        field3222++;
        this.field3211 = arg0 >> 4 & 0xFF0;
        this.field3219 = arg0 >> 12 & 0xFF0;
        this.field3208 = arg0 & 0xFF << 4;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ldd;I)V", line = 218)
    public static final void method1331(class249 arg0, int arg1) {
        int var2 = 41 % ((19 - arg1) / 54);
        field3224++;
        arg0.field4236 = false;
        if (arg0.field4224 != -1) {
            class141 var3 = class133.method851(arg0.field4224, 0);
            if (var3 == null || var3.field2177 == null) {
                arg0.field4224 = -1;
            } else {
                arg0.field4199++;
                if (var3.field2177.length > arg0.field4183 && var3.field2150[arg0.field4183] < arg0.field4199) {
                    arg0.field4199 = 1;
                    arg0.field4218++;
                    arg0.field4183++;
                    class18.method114(arg0.field4162, arg0.field4183, arg0.field4231, var3, class85.field1176 == arg0, 28972);
                }
                if (var3.field2177.length <= arg0.field4183) {
                    arg0.field4183 = 0;
                    arg0.field4199 = 0;
                    class18.method114(arg0.field4162, arg0.field4183, arg0.field4231, var3, class85.field1176 == arg0, 28972);
                }
                arg0.field4218 = arg0.field4183 + 1;
                if (arg0.field4218 >= var3.field2177.length) {
                    arg0.field4218 = 0;
                }
            }
        }
        if (arg0.field4182 != -1 && class142.field2187 >= arg0.field4164) {
            int var4 = class189.method1255(arg0.field4182, (byte) 51).field5170;
            if (var4 == -1) {
                arg0.field4182 = -1;
            } else {
                class141 var5 = class133.method851(var4, 116);
                if (var5 == null || var5.field2177 == null) {
                    arg0.field4182 = -1;
                } else {
                    if (arg0.field4233 < 0) {
                        arg0.field4233 = 0;
                        class18.method114(arg0.field4162, 0, arg0.field4231, var5, class85.field1176 == arg0, 28972);
                    }
                    arg0.field4196++;
                    if (var5.field2177.length > arg0.field4233 && arg0.field4196 > var5.field2150[arg0.field4233]) {
                        arg0.field4196 = 1;
                        arg0.field4233++;
                        class18.method114(arg0.field4162, arg0.field4233, arg0.field4231, var5, class85.field1176 == arg0, 28972);
                    }
                    if (var5.field2177.length <= arg0.field4233) {
                        arg0.field4182 = -1;
                    }
                    arg0.field4242 = arg0.field4233 + 1;
                    if (var5.field2177.length <= arg0.field4242) {
                        arg0.field4242 = -1;
                    }
                }
            }
        }
        if (arg0.field4240 != -1 && arg0.field4216 <= 1) {
            class141 var6 = class133.method851(arg0.field4240, 101);
            if (var6.field2175 == 1 && arg0.field4262 > 0 && arg0.field4267 <= class142.field2187 && arg0.field4212 < class142.field2187) {
                arg0.field4216 = 1;
                return;
            }
        }
        if (arg0.field4240 != -1 && arg0.field4216 == 0) {
            class141 var7 = class133.method851(arg0.field4240, -90);
            if (var7 == null || var7.field2177 == null) {
                arg0.field4240 = -1;
            } else {
                arg0.field4257++;
                if (var7.field2177.length > arg0.field4258 && var7.field2150[arg0.field4258] < arg0.field4257) {
                    arg0.field4258++;
                    arg0.field4257 = 1;
                    class18.method114(arg0.field4162, arg0.field4258, arg0.field4231, var7, class85.field1176 == arg0, 28972);
                }
                if (var7.field2177.length <= arg0.field4258) {
                    arg0.field4258 -= var7.field2162;
                    arg0.field4226++;
                    if (var7.field2149 <= arg0.field4226) {
                        arg0.field4240 = -1;
                    } else if (arg0.field4258 >= 0 && var7.field2177.length > arg0.field4258) {
                        class18.method114(arg0.field4162, arg0.field4258, arg0.field4231, var7, class85.field1176 == arg0, 28972);
                    } else {
                        arg0.field4240 = -1;
                    }
                }
                arg0.field4174 = arg0.field4258 + 1;
                if (var7.field2177.length <= arg0.field4174) {
                    arg0.field4174 -= var7.field2162;
                    if (arg0.field4226 + 1 >= var7.field2149) {
                        arg0.field4174 = -1;
                    } else if (arg0.field4174 < 0 || arg0.field4174 >= var7.field2177.length) {
                        arg0.field4174 = -1;
                    }
                }
                arg0.field4236 = var7.field2173;
            }
        }
        if (arg0.field4216 > 0) {
            arg0.field4216--;
        }
        for (int var8 = 0; var8 < arg0.field4163.length; var8++) {
            class111 var9 = arg0.field4163[var8];
            if (var9 != null) {
                if (var9.field1566 > 0) {
                    var9.field1566--;
                } else {
                    class141 var10 = class133.method851(var9.field1562, 107);
                    if (var10 == null || var10.field2177 == null) {
                        arg0.field4163[var8] = null;
                    } else {
                        var9.field1564++;
                        if (var10.field2177.length > var9.field1565 && var10.field2150[var9.field1565] < var9.field1564) {
                            var9.field1565++;
                            var9.field1564 = 1;
                            class18.method114(arg0.field4162, var9.field1565, arg0.field4231, var10, class85.field1176 == arg0, 28972);
                        }
                        if (var10.field2177.length <= var9.field1565) {
                            var9.field1565 -= var10.field2162;
                            var9.field1561++;
                            if (var10.field2149 <= var9.field1561) {
                                arg0.field4163[var8] = null;
                            } else if (var9.field1565 >= 0 && var10.field2177.length > var9.field1565) {
                                class18.method114(arg0.field4162, var9.field1565, arg0.field4231, var10, class85.field1176 == arg0, 28972);
                            } else {
                                arg0.field4163[var8] = null;
                            }
                        }
                        var9.field1569 = var9.field1565 + 1;
                        if (var9.field1569 >= var10.field2177.length) {
                            var9.field1569 -= var10.field2162;
                            if (var10.field2149 <= var9.field1561 + 1) {
                                var9.field1569 = -1;
                            } else if (var9.field1569 < 0 || var10.field2177.length <= var9.field1569) {
                                var9.field1569 = -1;
                            }
                        }
                    }
                }
            }
        }
    }
}
