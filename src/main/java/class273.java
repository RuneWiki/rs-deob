import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class273 extends class14 {

    @OriginalMember(owner = "client!rm", name = "w", descriptor = "I")
    private int field4326;

    @OriginalMember(owner = "client!rm", name = "C", descriptor = "I")
    private int field4332;

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "I")
    private int field4329;

    @OriginalMember(owner = "client!rm", name = "y", descriptor = "I")
    private int field4328;

    @OriginalMember(owner = "client!rm", name = "v", descriptor = "Z")
    public static boolean field4325 = false;

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "Lqj;")
    public static class280 field4322 = new class280(64);

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!rm", name = "u", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!rm", name = "x", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!rm", name = "B", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!rm", name = "D", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!rm", name = "A", descriptor = "Ltj;")
    public static class201 field4330;

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(IIIIIII)V", line = 6)
    public class273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4326 = arg3;
        this.field4332 = arg2;
        this.field4329 = arg0;
        this.field4328 = arg1;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)V", line = 19)
    public final void method84(int arg0, int arg1, int arg2) {
        if (arg2 != 9432) {
            field4322 = (class280) null;
        }
        field4333++;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(IB)V", line = 29)
    public static final void method1966(int arg0, byte arg1) {
        if (arg1 <= 28) {
            method1970((byte[]) null, 66);
        }
        field4327++;
        if (class296.method2104((byte) -64, arg0)) {
            method1971(1237279888, class232.field3512[arg0], -1);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V", line = 45)
    public static final void method1967(byte arg0) {
        if (arg0 <= 62) {
            method1970((byte[]) null, -74);
        }
        field4321++;
        class45.field516.method383((byte) -48);
        class31.field358.method383((byte) -48);
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(BII)V", line = 58)
    public final void method89(byte arg0, int arg1, int arg2) {
        field4320++;
        int var4 = this.field4329 * arg1 >> 12;
        int var5 = this.field4328 * arg2 >> 12;
        int var6 = -94 / ((-arg0) / 32);
        int var7 = this.field4326 * arg2 >> 12;
        int var8 = this.field4332 * arg1 >> 12;
        class311.method2199(this.field146, this.field138, this.field151, 126, var5, var4, var7, var8);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BII)V", line = 77)
    public final void method82(byte arg0, int arg1, int arg2) {
        field4319++;
        if (arg0 > -47) {
            field4325 = false;
        }
        int var4 = this.field4332 * arg2 >> 12;
        int var5 = this.field4328 * arg1 >> 12;
        int var6 = this.field4326 * arg1 >> 12;
        int var7 = this.field4329 * arg2 >> 12;
        class203.method1417(var7, -1, var4, this.field146, var5, var6);
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)V", line = 99)
    public static void method1968(byte arg0) {
        field4322 = null;
        if (arg0 <= -49) {
            field4330 = null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "([ILwf;[I[IZ)V", line = 112)
    public static final void method1969(int[] arg0, class67 arg1, int[] arg2, int[] arg3, boolean arg4) {
        if (!arg4) {
            field4322 = (class280) null;
        }
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg0[var5];
            int var8 = arg2[var5];
            for (int var9 = 0; var8 != 0 && arg1.field3769.length > var9; var9++) {
                if ((var8 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field3769[var9] = null;
                    } else {
                        class111 var10 = class289.method2067((byte) -109, var6);
                        class69 var11 = arg1.field3769[var9];
                        int var12 = var10.field1542;
                        if (var11 != null) {
                            if (var11.field867 == var6) {
                                if (var12 == 0) {
                                    var11 = arg1.field3769[var9] = null;
                                } else if (var12 == 1) {
                                    var11.field864 = 1;
                                    var11.field855 = 0;
                                    var11.field854 = var7;
                                    var11.field862 = 0;
                                    var11.field858 = 0;
                                    class313.method2210(var10, 0, 50, arg1.field3763, class11.field113 == arg1, arg1.field3767);
                                } else if (var12 == 2) {
                                    var11.field855 = 0;
                                }
                            } else if (var10.field1521 >= class289.method2067((byte) -110, var11.field867).field1521) {
                                var11 = arg1.field3769[var9] = null;
                            }
                        }
                        if (var11 == null) {
                            class69 var13 = arg1.field3769[var9] = new class69();
                            var13.field862 = 0;
                            var13.field854 = var7;
                            var13.field858 = 0;
                            var13.field855 = 0;
                            var13.field867 = var6;
                            var13.field864 = 1;
                            class313.method2210(var10, 0, 50, arg1.field3763, class11.field113 == arg1, arg1.field3767);
                        }
                    }
                }
                var8 >>>= 0x1;
            }
        }
        field4324++;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "([BI)Ljh;", line = 208)
    public static final class299 method1970(byte[] arg0, int arg1) {
        field4323++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != -1) {
            method1968((byte) -22);
        }
        class299 var2 = new class299(arg0, class110.field1518, class33.field392, class245.field3855, class259.field4093, class14.field145);
        class99.method627(arg1 + 3736);
        return var2;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I[Lhi;I)V", line = 231)
    private static final void method1971(int arg0, class323[] arg1, int arg2) {
        if (arg0 != 1237279888) {
            field4325 = false;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class323 var4 = arg1[var3];
            if (var4 != null && var4.field5196 == arg2 && (!var4.field5172 || !client.method2015(var4))) {
                if (var4.field5107 == 0) {
                    if (!var4.field5172 && client.method2015(var4) && class131.field1888 != var4) {
                        continue;
                    }
                    method1971(1237279888, arg1, var4.field5073);
                    if (var4.field5036 != null) {
                        method1971(arg0, var4.field5036, var4.field5073);
                    }
                    class238 var5 = (class238) class88.field1166.method770((long) var4.field5073, -51);
                    if (var5 != null) {
                        method1966(var5.field3658, (byte) 34);
                    }
                }
                if (var4.field5107 == 6) {
                    if (var4.field5026 != -1 || var4.field5173 != -1) {
                        boolean var6 = class174.method1211(-5, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field5173;
                        } else {
                            var7 = var4.field5026;
                        }
                        if (var7 != -1) {
                            class111 var8 = class289.method2067((byte) -16, var7);
                            if (var8 != null) {
                                var4.field5021 += class266.field4193;
                                while (var8.field1524[var4.field5064] < var4.field5021) {
                                    var4.field5021 -= var8.field1524[var4.field5064];
                                    var4.field5064++;
                                    if (var4.field5064 >= var8.field1533.length) {
                                        var4.field5064 -= var8.field1552;
                                        if (var4.field5064 < 0 || var8.field1533.length <= var4.field5064) {
                                            var4.field5064 = 0;
                                        }
                                    }
                                    var4.field5122 = var4.field5064 + 1;
                                    if (var8.field1533.length <= var4.field5122) {
                                        var4.field5122 -= var8.field1552;
                                        if (var4.field5122 < 0 || var4.field5122 >= var8.field1533.length) {
                                            var4.field5122 = -1;
                                        }
                                    }
                                    class107.method693(var4, 6);
                                }
                            }
                        }
                    }
                    if (var4.field5124 != 0 && !var4.field5172) {
                        int var9 = var4.field5124 >> 16;
                        int var10 = var4.field5124 << 16 >> 16;
                        int var11 = class266.field4193 * var10;
                        int var12 = class266.field4193 * var9;
                        var4.field5032 = var4.field5032 + var12 & 0x7FF;
                        var4.field5072 = var4.field5072 + var11 & 0x7FF;
                        class107.method693(var4, 6);
                    }
                }
            }
        }
        field4331++;
    }
}
