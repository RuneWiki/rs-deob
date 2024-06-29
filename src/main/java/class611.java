import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class611 extends class504 {

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    public int field8070 = 0;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "Lan;")
    private class22 field8071;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "[I")
    private int[] field8067;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public int field8062;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public int field8069;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "I")
    public int field8080;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "F")
    public float field8075;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
    public int field8072;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "Lej;")
    private class111 field8066;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "Lcu;")
    private static class206 field8063 = new class206(20, 2);

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public static int field8065;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public static int field8068;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    public static int field8073;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "I")
    public static int field8076;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "I")
    public static int field8077;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
    public static int field8078;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "I")
    public static int field8079;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
    public static int field8081;

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
    public static int field8083;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "Leu;")
    private class448 field8064;

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8082;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field8074;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V")
    public final void method3343(int arg0, int arg1) {
        field8076++;
        this.field8074 = this.field8066.method847(true, arg0 * 4, true);
        this.field8082 = new Stream(this.field8074, 0, arg0 * 4);
        int var3 = -73 % ((arg1 + 58) / 58);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIII)V")
    public final void method3344(int arg0, int arg1, int arg2, int arg3) {
        field8081++;
        this.field8067[this.field8071.field2247 * arg1 + arg0] = class220.method1393(this.field8067[this.field8071.field2247 * arg1 + arg0], 0x1 << arg3);
        if (arg2 > 77) {
            this.field8070++;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(FIIII)V")
    public final void method3345(float arg0, int arg1, int arg2, int arg3, int arg4) {
        field8077++;
        if (this.field8062 != -1) {
            class364 var6 = this.field8066.field8808.method2760(this.field8062, 21351);
            int var7 = var6.field4929 & 0xFF;
            if (var7 != 0 && var6.field4937 != 4) {
                int var8;
                if (arg4 < 0) {
                    var8 = 0;
                } else if (arg4 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg4 * 131586;
                }
                if (var7 == 256) {
                    arg1 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg1 = ((arg1 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg1 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field4926 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg1 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg1 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg1 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg1 = (var14 >> 8) + (var12 << 8 & 0xFF001B) + (var13 & 0xFF00);
            }
        }
        this.field8082.method3475(arg2 * 4);
        if (arg3 <= 86) {
            return;
        }
        if (arg0 != 1.0F) {
            int var15 = arg1 >> 16 & 0xFF;
            int var16 = (arg1 & 0xFF7D) >> 8;
            int var17 = arg1 & 0xFF;
            int var18 = (int) ((float) var15 * arg0);
            int var19 = (int) ((float) var16 * arg0);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var20 = (int) ((float) var17 * arg0);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg1 = var19 << 8 | var18 << 16 | var20;
        }
        if (this.field8066.field1835 == 0) {
            this.field8082.method3482((byte) arg1);
            this.field8082.method3482((byte) (arg1 >> 8));
            this.field8082.method3482((byte) (arg1 >> 16));
        } else {
            this.field8082.method3482((byte) (arg1 >> 16));
            this.field8082.method3482((byte) (arg1 >> 8));
            this.field8082.method3482((byte) arg1);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILfg;B)V")
    public static final void method3346(int arg0, int arg1, class117 arg2, byte arg3) {
        field8083++;
        if (arg2 == null || class480.field6411.field7850 == arg2) {
            return;
        }
        int var4 = arg2.field2003;
        int var5 = arg2.field1999;
        int var6 = arg2.field1993;
        int var7 = (int) arg2.field1996;
        long var8 = arg2.field1996;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        if (var6 == 50) {
            class625 var10 = class457.method2609(var5, var4, (byte) 14);
            if (var10 != null) {
                class27.method236(var10, 100);
            }
        }
        if (var6 == 51) {
            class115.field1974 = 0;
            class170.field2631 = arg0;
            class427.field5862 = 2;
            class613.field8106 = arg1;
            class85.field1300++;
            class402 var11 = class390.method2252(class446.field6114, -96, class262.field3644);
            var11.field5354.method2031((byte) 54, class233.field3269 + var5);
            var11.field5354.method2030(var7, 76);
            var11.field5354.method2030(class473.field6334 + var4, 23);
            var11.field5354.method1989((byte) -47, class561.field7444.method3271(82, 0) ? 1 : 0);
            class36.method278(0, var11);
            class111.method833(var4, var5, 8493);
        }
        if (var6 == 19) {
            class403 var12 = class572.field7601[var7];
            if (var12 != null) {
                class427.field5862 = 2;
                class501.field6704++;
                class170.field2631 = arg0;
                class613.field8106 = arg1;
                class115.field1974 = 0;
                class402 var13 = class390.method2252(class59.field910, -99, class262.field3644);
                var13.field5354.method2021(1326408496, var7);
                var13.field5354.method1989((byte) -47, class561.field7444.method3271(82, 0) ? 1 : 0);
                class36.method278(0, var13);
                class157.method1098(var12.method2317((byte) 40), true, 0, var12.method2317((byte) 40), var12.field5649[0], (byte) 105, var12.field5643[0], 0, -2);
            }
        }
        if (var6 == 20) {
            class170.field2631 = arg0;
            class115.field1974 = 0;
            class427.field5862 = 2;
            class613.field8106 = arg1;
            class317.field4359++;
            class402 var14 = class390.method2252(class490.field6610, -88, class262.field3644);
            var14.field5354.method2030(class473.field6334 + var4, 49);
            var14.field5354.method2031((byte) 54, var5 + class233.field3269);
            var14.field5354.method2003(var7, 16777216);
            var14.field5354.method1980(-345277664, class561.field7444.method3271(82, 0) ? 1 : 0);
            class36.method278(0, var14);
            class111.method833(var4, var5, 8493);
        }
        if (var6 == 8) {
            class427.field5862 = 2;
            class450.field6171++;
            class115.field1974 = 0;
            class170.field2631 = arg0;
            class613.field8106 = arg1;
            class402 var15 = class390.method2252(class465.field6271, -79, class262.field3644);
            var15.field5354.method2003(var4 + class473.field6334, 16777216);
            var15.field5354.method2012((byte) 30, class561.field7444.method3271(82, 0) ? 1 : 0);
            var15.field5354.method2021(1326408496, var7);
            var15.field5354.method2031((byte) 54, class233.field3269 + var5);
            class36.method278(0, var15);
            class111.method833(var4, var5, 8493);
        }
        if (var6 == 22) {
            class280 var16 = (class280) class616.field8143.method2918((long) var7, (byte) -127);
            if (var16 != null) {
                class427.field5862 = 2;
                class613.field8106 = arg1;
                class115.field1974 = 0;
                class390.field5151++;
                class170.field2631 = arg0;
                class287 var17 = var16.field3983;
                class402 var18 = class390.method2252(class351.field4807, -87, class262.field3644);
                var18.field5354.method2031((byte) 54, var7);
                var18.field5354.method1989((byte) -47, class561.field7444.method3271(82, 0) ? 1 : 0);
                class36.method278(0, var18);
                class157.method1098(var17.method2317((byte) 40), true, 0, var17.method2317((byte) 40), var17.field5649[0], (byte) 105, var17.field5643[0], 0, -2);
            }
        }
        if (var6 == 21) {
            class403 var19 = class572.field7601[var7];
            if (var19 != null) {
                class170.field2631 = arg0;
                class613.field8106 = arg1;
                class427.field5862 = 2;
                class115.field1974 = 0;
                class230.field3223++;
                class402 var20 = class390.method2252(class683.field9613, -91, class262.field3644);
                var20.field5354.method2031((byte) 54, var7);
                var20.field5354.method2020(class561.field7444.method3271(82, 0) ? 1 : 0, (byte) -107);
                class36.method278(0, var20);
                class157.method1098(var19.method2317((byte) 40), true, 0, var19.method2317((byte) 40), var19.field5649[0], (byte) 105, var19.field5643[0], 0, -2);
            }
        }
        if (var6 == 10) {
            class625 var21 = class457.method2609(var5, var4, (byte) -84);
            if (var21 != null) {
                class671.method3761(1);
                class52 var22 = client.method1701(var21);
                class154.method1083(var22.method355((byte) -55), (byte) -41, var22.field729, var21);
                class680.field9585 = class80.method637(-59, var21);
                class214.field3060 = var21.field8357 + "<col=ffffff>";
                if (class680.field9585 == null) {
                    class680.field9585 = "Null";
                }
            }
            return;
        }
        if (arg3 <= 44) {
            field8063 = null;
        }
        if (var6 == 12 && class436.field5966 == null) {
            class129.method988(var4, -87, var5);
            class436.field5966 = class457.method2609(var5, var4, (byte) -87);
            class463.method2624(false, class436.field5966);
        }
        if (var6 == 1012) {
            class613.field8106 = arg1;
            class427.field5862 = 2;
            class115.field1974 = 0;
            class172.field2659++;
            class170.field2631 = arg0;
            class402 var23 = class390.method2252(class266.field3690, -102, class262.field3644);
            var23.field5354.method2031((byte) 54, var7);
            class36.method278(0, var23);
        }
        if (var6 == 48) {
            class280 var24 = (class280) class616.field8143.method2918((long) var7, (byte) 0);
            if (var24 != null) {
                class613.field8106 = arg1;
                class287 var25 = var24.field3983;
                class427.field5862 = 2;
                class115.field1974 = 0;
                class674.field9535++;
                class170.field2631 = arg0;
                class402 var26 = class390.method2252(class98.field1483, -114, class262.field3644);
                var26.field5354.method1989((byte) -47, class561.field7444.method3271(82, 0) ? 1 : 0);
                var26.field5354.method2021(1326408496, var7);
                class36.method278(0, var26);
                class157.method1098(var25.method2317((byte) 40), true, 0, var25.method2317((byte) 40), var25.field5649[0], (byte) 105, var25.field5643[0], 0, -2);
            }
        }
        if (var6 == 9) {
            class403 var27 = class572.field7601[var7];
            if (var27 != null) {
                class415.field5676++;
                class115.field1974 = 0;
                class613.field8106 = arg1;
                class427.field5862 = 2;
                class170.field2631 = arg0;
                class402 var28 = class390.method2252(class515.field6885, -111, class262.field3644);
                var28.field5354.method2020(class561.field7444.method3271(82, 0) ? 1 : 0, (byte) -25);
                var28.field5354.method2030(var7, 48);
                class36.method278(0, var28);
                class157.method1098(var27.method2317((byte) 40), true, 0, var27.method2317((byte) 40), var27.field5649[0], (byte) 105, var27.field5643[0], 0, -2);
            }
        }
        if (var6 == 3) {
            class613.field8106 = arg1;
            class686.field9644++;
            class170.field2631 = arg0;
            class115.field1974 = 0;
            class427.field5862 = 2;
            class402 var29 = class390.method2252(class534.field7091, -115, class262.field3644);
            var29.field5354.method2021(1326408496, class233.field3269 + var5);
            var29.field5354.method2030(class473.field6334 + var4, 124);
            var29.field5354.method2003((int) (var8 >>> 32) & Integer.MAX_VALUE, 16777216);
            var29.field5354.method2020(class561.field7444.method3271(82, 0) ? 1 : 0, (byte) -109);
            class36.method278(0, var29);
            class287.method1775(var4, var5, var8, (byte) 87);
        }
        if (var6 == 11) {
            class427.field5862 = 2;
            class164.field2563++;
            class613.field8106 = arg1;
            class170.field2631 = arg0;
            class115.field1974 = 0;
            class402 var30 = class390.method2252(class429.field5887, -77, class262.field3644);
            var30.field5354.method1989((byte) -47, class561.field7444.method3271(82, 0) ? 1 : 0);
            var30.field5354.method2030(class473.field6334 + var4, 63);
            var30.field5354.method2021(1326408496, class233.field3269 + var5);
            var30.field5354.method2030((int) (var8 >>> 32) & Integer.MAX_VALUE, 106);
            class36.method278(0, var30);
            class287.method1775(var4, var5, var8, (byte) 59);
        }
        if (var6 == 59) {
            class280 var31 = (class280) class616.field8143.method2918((long) var7, (byte) -38);
            if (var31 != null) {
                class613.field8106 = arg1;
                class115.field1974 = 0;
                class170.field2631 = arg0;
                class427.field5862 = 2;
                class162.field2555++;
                class287 var32 = var31.field3983;
                class402 var33 = class390.method2252(class36.field547, -127, class262.field3644);
                var33.field5354.method2021(1326408496, var7);
                var33.field5354.method2012((byte) 67, class561.field7444.method3271(82, 0) ? 1 : 0);
                class36.method278(0, var33);
                class157.method1098(var32.method2317((byte) 40), true, 0, var32.method2317((byte) 40), var32.field5649[0], (byte) 105, var32.field5643[0], 0, -2);
            }
        }
        if (var6 == 1010) {
            class170.field2631 = arg0;
            class119.field2021++;
            class115.field1974 = 0;
            class613.field8106 = arg1;
            class427.field5862 = 2;
            class402 var34 = class390.method2252(class249.field3446, -85, class262.field3644);
            var34.field5354.method2031((byte) 54, var7);
            class36.method278(0, var34);
        }
        if (var6 == 5) {
            class403 var35 = class572.field7601[var7];
            if (var35 != null) {
                class170.field2631 = arg0;
                class427.field5862 = 2;
                class613.field8106 = arg1;
                class117.field2002++;
                class115.field1974 = 0;
                class402 var36 = class390.method2252(class418.field5717, -104, class262.field3644);
                var36.field5354.method2031((byte) 54, var7);
                var36.field5354.method2020(class561.field7444.method3271(82, 0) ? 1 : 0, (byte) -114);
                class36.method278(0, var36);
                class157.method1098(var35.method2317((byte) 40), true, 0, var35.method2317((byte) 40), var35.field5649[0], (byte) 105, var35.field5643[0], 0, -2);
            }
        }
        if (var6 == 46) {
            class280 var37 = (class280) class616.field8143.method2918((long) var7, (byte) 35);
            if (var37 != null) {
                class236.field3330++;
                class170.field2631 = arg0;
                class613.field8106 = arg1;
                class287 var38 = var37.field3983;
                class115.field1974 = 0;
                class427.field5862 = 2;
                class402 var39 = class390.method2252(class483.field6537, -116, class262.field3644);
                var39.field5354.method2031((byte) 54, var7);
                var39.field5354.method2020(class561.field7444.method3271(82, 0) ? 1 : 0, (byte) 61);
                class36.method278(0, var39);
                class157.method1098(var38.method2317((byte) 40), true, 0, var38.method2317((byte) 40), var38.field5649[0], (byte) 105, var38.field5643[0], 0, -2);
            }
        }
        if (var6 == 58) {
            if (class150.field2398 > 0 && class561.field7444.method3271(82, 0) && class561.field7444.method3271(81, 0)) {
                class247.method1516((byte) -44, class233.field3269 + var5, class199.field2897.field8609, class473.field6334 + var4);
            } else {
                class402 var40 = class615.method3369(var7, -1, var5, var4);
                if (var7 == 1) {
                    var40.field5354.method1980(-345277664, -1);
                    var40.field5354.method1980(-345277664, -1);
                    var40.field5354.method2031((byte) 54, (int) class42.field602);
                    var40.field5354.method1980(-345277664, 57);
                    var40.field5354.method1980(-345277664, class588.field7795);
                    var40.field5354.method1980(-345277664, class376.field5073);
                    var40.field5354.method1980(-345277664, 89);
                    var40.field5354.method2031((byte) 54, class199.field2897.field8620);
                    var40.field5354.method2031((byte) 54, class199.field2897.field8612);
                    var40.field5354.method1980(-345277664, 63);
                } else {
                    class170.field2631 = arg0;
                    class115.field1974 = 0;
                    class427.field5862 = 1;
                    class613.field8106 = arg1;
                }
                class36.method278(0, var40);
                class157.method1098(1, true, 0, 1, var5, (byte) 105, var4, 0, -4);
            }
        }
        if (var6 == 30) {
            class403 var41 = class572.field7601[var7];
            if (var41 != null) {
                class115.field1974 = 0;
                class613.field8106 = arg1;
                class43.field623++;
                class170.field2631 = arg0;
                class427.field5862 = 2;
                class402 var42 = class390.method2252(class260.field3578, -116, class262.field3644);
                var42.field5354.method1980(-345277664, class561.field7444.method3271(82, 0) ? 1 : 0);
                var42.field5354.method2030(var7, 13);
                class36.method278(0, var42);
                class157.method1098(var41.method2317((byte) 40), true, 0, var41.method2317((byte) 40), var41.field5649[0], (byte) 105, var41.field5643[0], 0, -2);
            }
        }
        if (var6 == 1002 || var6 == 1008 || var6 == 1009 || var6 == 1007 || var6 == 1011) {
            class358.method2111(var6, var7, var4, (byte) 16);
        }
        if (var6 == 1004) {
            class613.field8106 = arg1;
            class427.field5862 = 2;
            class115.field1974 = 0;
            class382.field5100++;
            class170.field2631 = arg0;
            class402 var43 = class390.method2252(class256.field3546, -92, class262.field3644);
            var43.field5354.method1989((byte) -47, class561.field7444.method3271(82, 0) ? 1 : 0);
            var43.field5354.method2030((int) (var8 >>> 32) & Integer.MAX_VALUE, 109);
            var43.field5354.method2031((byte) 54, class473.field6334 + var4);
            var43.field5354.method2030(class233.field3269 + var5, 62);
            class36.method278(0, var43);
            class287.method1775(var4, var5, var8, (byte) -119);
        }
        if (var6 == 60) {
            class403 var44 = class572.field7601[var7];
            if (var44 != null) {
                class559.field7415++;
                class427.field5862 = 2;
                class613.field8106 = arg1;
                class170.field2631 = arg0;
                class115.field1974 = 0;
                class402 var45 = class390.method2252(class102.field1522, -128, class262.field3644);
                var45.field5354.method2003(var7, 16777216);
                var45.field5354.method1980(-345277664, class561.field7444.method3271(82, 0) ? 1 : 0);
                class36.method278(0, var45);
                class157.method1098(var44.method2317((byte) 40), true, 0, var44.method2317((byte) 40), var44.field5649[0], (byte) 105, var44.field5643[0], 0, -2);
            }
        }
        if (var6 == 4 || var6 == 1006) {
            class58.method475(var4, var7, var5, (byte) 108, arg2.field1994);
        }
        if (var6 == 15) {
            class280 var46 = (class280) class616.field8143.method2918((long) var7, (byte) -23);
            if (var46 != null) {
                class613.field8106 = arg1;
                class587.field7783++;
                class287 var47 = var46.field3983;
                class170.field2631 = arg0;
                class427.field5862 = 2;
                class115.field1974 = 0;
                class402 var48 = class390.method2252(class127.field2134, -100, class262.field3644);
                var48.field5354.method2012((byte) 71, class561.field7444.method3271(82, 0) ? 1 : 0);
                var48.field5354.method2030(var7, 60);
                class36.method278(0, var48);
                class157.method1098(var47.method2317((byte) 40), true, 0, var47.method2317((byte) 40), var47.field5649[0], (byte) 105, var47.field5643[0], 0, -2);
            }
        }
        if (var6 == 47) {
            class403 var49 = class572.field7601[var7];
            if (var49 != null) {
                field8078++;
                class170.field2631 = arg0;
                class115.field1974 = 0;
                class613.field8106 = arg1;
                class427.field5862 = 2;
                class402 var50 = class390.method2252(class137.field2219, -99, class262.field3644);
                var50.field5354.method2030(var7, 40);
                var50.field5354.method2021(1326408496, class522.field6979);
                var50.field5354.method2021(1326408496, class37.field563);
                var50.field5354.method1989((byte) -47, class561.field7444.method3271(82, 0) ? 1 : 0);
                var50.field5354.method1982(class255.field3536, (byte) 63);
                class36.method278(0, var50);
                class157.method1098(var49.method2317((byte) 40), true, 0, var49.method2317((byte) 40), var49.field5649[0], (byte) 105, var49.field5643[0], 0, -2);
            }
        }
        if (var6 == 49) {
            class613.field8106 = arg1;
            class115.field1974 = 0;
            class427.field5862 = 2;
            class170.field2631 = arg0;
            class61.field919++;
            class402 var51 = class390.method2252(class103.field1530, -96, class262.field3644);
            var51.field5354.method2021(1326408496, class473.field6334 + var4);
            var51.field5354.method2031((byte) 54, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            var51.field5354.method2031((byte) 54, var5 + class233.field3269);
            var51.field5354.method1980(-345277664, class561.field7444.method3271(82, 0) ? 1 : 0);
            class36.method278(0, var51);
            class287.method1775(var4, var5, var8, (byte) 87);
        }
        if (var6 == 1003) {
            class170.field2631 = arg0;
            class613.field8106 = arg1;
            class427.field5862 = 2;
            class115.field1974 = 0;
            class280 var52 = (class280) class616.field8143.method2918((long) var7, (byte) 20);
            if (var52 != null) {
                class287 var53 = var52.field3983;
                class419 var54 = var53.field4052;
                if (var54.field5753 != null) {
                    var54 = var54.method2401(false, class80.field1261);
                }
                if (var54 != null) {
                    class416.field5687++;
                    class402 var55 = class390.method2252(field8063, -105, class262.field3644);
                    var55.field5354.method2031((byte) 54, var54.field5725);
                    class36.method278(0, var55);
                }
            }
        }
        if (var6 == 44) {
            class170.field2631 = arg0;
            class613.field8106 = arg1;
            class287.field4056++;
            class115.field1974 = 0;
            class427.field5862 = 2;
            class402 var56 = class390.method2252(class608.field8044, -117, class262.field3644);
            var56.field5354.method2003(var7, 16777216);
            var56.field5354.method2031((byte) 54, var5 + class233.field3269);
            var56.field5354.method1989((byte) -47, class561.field7444.method3271(82, 0) ? 1 : 0);
            var56.field5354.method2021(1326408496, class473.field6334 + var4);
            class36.method278(0, var56);
            class111.method833(var4, var5, 8493);
        }
        if (var6 == 17) {
            class115.field1974 = 0;
            class170.field2631 = arg0;
            class283.field4009++;
            class613.field8106 = arg1;
            class427.field5862 = 1;
            class402 var57 = class390.method2252(class411.field5591, -109, class262.field3644);
            var57.field5354.method1983(class255.field3536, -30995);
            var57.field5354.method2031((byte) 54, class522.field6979);
            var57.field5354.method2030(class233.field3269 + var5, 32);
            var57.field5354.method2003(class473.field6334 + var4, 16777216);
            var57.field5354.method2003(class37.field563, 16777216);
            class36.method278(0, var57);
            class157.method1098(1, true, 0, 1, var5, (byte) 105, var4, 0, -4);
        }
        if (var6 == 18) {
            class115.field1974 = 0;
            class613.field8106 = arg1;
            class170.field2631 = arg0;
            class97.field1463++;
            class427.field5862 = 2;
            class402 var58 = class390.method2252(class338.field4682, -127, class262.field3644);
            var58.field5354.method2031((byte) 54, class473.field6334 + var4);
            var58.field5354.method2012((byte) 96, class561.field7444.method3271(82, 0) ? 1 : 0);
            var58.field5354.method2031((byte) 54, var7);
            var58.field5354.method2031((byte) 54, var5 + class233.field3269);
            class36.method278(0, var58);
            class111.method833(var4, var5, 8493);
        }
        if (var6 == 57) {
            class280 var59 = (class280) class616.field8143.method2918((long) var7, (byte) -57);
            if (var59 != null) {
                class287 var60 = var59.field3983;
                class115.field1974 = 0;
                class445.field6089++;
                class170.field2631 = arg0;
                class613.field8106 = arg1;
                class427.field5862 = 2;
                class402 var61 = class390.method2252(class570.field7568, -121, class262.field3644);
                var61.field5354.method2003(var7, 16777216);
                var61.field5354.method2003(class37.field563, 16777216);
                var61.field5354.method2031((byte) 54, class522.field6979);
                var61.field5354.method2002((byte) 125, class255.field3536);
                var61.field5354.method2012((byte) 41, class561.field7444.method3271(82, 0) ? 1 : 0);
                class36.method278(0, var61);
                class157.method1098(var60.method2317((byte) 40), true, 0, var60.method2317((byte) 40), var60.field5649[0], (byte) 105, var60.field5643[0], 0, -2);
            }
        }
        if (var6 == 45) {
            class403 var62 = class572.field7601[var7];
            if (var62 != null) {
                class427.field5862 = 2;
                class170.field2631 = arg0;
                class568.field7534++;
                class613.field8106 = arg1;
                class115.field1974 = 0;
                class402 var63 = class390.method2252(class190.field2798, -75, class262.field3644);
                var63.field5354.method2021(1326408496, var7);
                var63.field5354.method2012((byte) 76, class561.field7444.method3271(82, 0) ? 1 : 0);
                class36.method278(0, var63);
                class157.method1098(var62.method2317((byte) 40), true, 0, var62.method2317((byte) 40), var62.field5649[0], (byte) 105, var62.field5643[0], 0, -2);
            }
        }
        if (var6 == 25) {
            class427.field5862 = 2;
            class115.field1974 = 0;
            class170.field2631 = arg0;
            class613.field8106 = arg1;
            class655.field8880++;
            class402 var64 = class390.method2252(class636.field8569, -102, class262.field3644);
            var64.field5354.method2021(1326408496, class37.field563);
            var64.field5354.method2003(class522.field6979, 16777216);
            var64.field5354.method2003(var4 + class473.field6334, 16777216);
            var64.field5354.method2021(1326408496, class233.field3269 + var5);
            var64.field5354.method1980(-345277664, class561.field7444.method3271(82, 0) ? 1 : 0);
            var64.field5354.method2030(var7, 38);
            var64.field5354.method2014(-2, class255.field3536);
            class36.method278(0, var64);
            class111.method833(var4, var5, 8493);
        }
        if (var6 == 23) {
            class115.field1974 = 0;
            class427.field5862 = 2;
            class170.field2631 = arg0;
            field8078++;
            class613.field8106 = arg1;
            class402 var65 = class390.method2252(class137.field2219, -78, class262.field3644);
            var65.field5354.method2030(class199.field2897.field5633, 34);
            var65.field5354.method2021(1326408496, class522.field6979);
            var65.field5354.method2021(1326408496, class37.field563);
            var65.field5354.method1989((byte) -47, class561.field7444.method3271(82, 0) ? 1 : 0);
            var65.field5354.method1982(class255.field3536, (byte) 63);
            class36.method278(0, var65);
        }
        if (var6 == 13) {
            class107.field1582++;
            class115.field1974 = 0;
            class613.field8106 = arg1;
            class170.field2631 = arg0;
            class427.field5862 = 2;
            class402 var66 = class390.method2252(class584.field7750, -83, class262.field3644);
            var66.field5354.method2031((byte) 54, var4 + class473.field6334);
            var66.field5354.method2021(1326408496, class233.field3269 + var5);
            var66.field5354.method2031((byte) 54, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var66.field5354.method2020(class561.field7444.method3271(82, 0) ? 1 : 0, (byte) -114);
            class36.method278(0, var66);
            class287.method1775(var4, var5, var8, (byte) 29);
        }
        if (var6 == 16) {
            class66.field1009++;
            class613.field8106 = arg1;
            class115.field1974 = 0;
            class427.field5862 = 2;
            class170.field2631 = arg0;
            class402 var67 = class390.method2252(class333.field4576, -122, class262.field3644);
            var67.field5354.method2003(class522.field6979, 16777216);
            var67.field5354.method2030(Integer.MAX_VALUE & (int) (var8 >>> 32), 115);
            var67.field5354.method2003(class37.field563, 16777216);
            var67.field5354.method2012((byte) 78, class561.field7444.method3271(82, 0) ? 1 : 0);
            var67.field5354.method2003(class233.field3269 + var5, 16777216);
            var67.field5354.method2002((byte) 123, class255.field3536);
            var67.field5354.method2031((byte) 54, class473.field6334 + var4);
            class36.method278(0, var67);
            class287.method1775(var4, var5, var8, (byte) 22);
        }
        if (var6 == 6) {
            class403 var68 = class572.field7601[var7];
            if (var68 != null) {
                class168.field2603++;
                class170.field2631 = arg0;
                class427.field5862 = 2;
                class115.field1974 = 0;
                class613.field8106 = arg1;
                class402 var69 = class390.method2252(class450.field6173, -85, class262.field3644);
                var69.field5354.method2003(var7, 16777216);
                var69.field5354.method2020(class561.field7444.method3271(82, 0) ? 1 : 0, (byte) -108);
                class36.method278(0, var69);
                class157.method1098(var68.method2317((byte) 40), true, 0, var68.method2317((byte) 40), var68.field5649[0], (byte) 105, var68.field5643[0], 0, -2);
            }
        }
        if (var6 == 2) {
            if (class150.field2398 > 0 && class561.field7444.method3271(82, 0) && class561.field7444.method3271(81, 0)) {
                class247.method1516((byte) -44, class233.field3269 + var5, class199.field2897.field8609, class473.field6334 + var4);
            } else {
                class88.field1338++;
                class427.field5862 = 1;
                class613.field8106 = arg1;
                class115.field1974 = 0;
                class170.field2631 = arg0;
                class402 var70 = class390.method2252(class395.field5236, -119, class262.field3644);
                var70.field5354.method2030(class473.field6334 + var4, 67);
                var70.field5354.method2003(class233.field3269 + var5, 16777216);
                class36.method278(0, var70);
            }
        }
        if (class400.field5305) {
            class671.method3761(1);
        }
        if (class207.field2981 != null && class458.field6219 == 0) {
            class463.method2624(false, class207.field2981);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II[I)V")
    public final void method3347(int arg0, int arg1, int[] arg2) {
        int var4 = 113 % ((42 - arg1) / 50);
        field8073++;
        class4 var5 = this.field8066.method839(this.field8070 * 3, 85);
        Buffer var6 = var5.method27((byte) -64, true);
        if (var6 == null) {
            return;
        }
        Stream var7 = this.field8066.method896(var6, (byte) -83);
        int var8 = 0;
        int var9 = 32767;
        int var10 = -32768;
        if (Stream.method3473()) {
            label97: for (int var19 = 0; var19 < arg0; var19++) {
                int var21 = arg2[var19];
                int var22 = this.field8067[var21];
                short[] var23 = this.field8071.field327[var21];
                if (var22 != 0 && var23 != null) {
                    int var24 = 0;
                    int var25 = 0;
                    while (true) {
                        while (true) {
                            if (var25 >= var23.length) {
                                continue label97;
                            }
                            if ((0x1 << var24++ & var22) == 0) {
                                var25 += 3;
                            } else {
                                var8++;
                                for (int var26 = 0; var26 < 3; var26++) {
                                    int var27 = var23[var25++] & 0xFFFF;
                                    var7.method3474(var27);
                                    if (var27 < var9) {
                                        var9 = var27;
                                    }
                                    if (var27 > var10) {
                                        var10 = var27;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            label123: for (int var11 = 0; var11 < arg0; var11++) {
                int var12 = arg2[var11];
                short[] var13 = this.field8071.field327[var12];
                int var14 = this.field8067[var12];
                if (var14 != 0 && var13 != null) {
                    int var15 = 0;
                    int var16 = 0;
                    while (true) {
                        while (true) {
                            if (var13.length <= var16) {
                                continue label123;
                            }
                            if ((0x1 << var15++ & var14) == 0) {
                                var16 += 3;
                            } else {
                                for (int var17 = 0; var17 < 3; var17++) {
                                    int var18 = var13[var16++] & 0xFFFF;
                                    if (var18 > var10) {
                                        var10 = var18;
                                    }
                                    var7.method3478(var18);
                                    if (var9 > var18) {
                                        var9 = var18;
                                    }
                                }
                                var8++;
                            }
                        }
                    }
                }
            }
        }
        var7.method3479();
        if (!var5.method28(11390) || var8 <= 0) {
            return;
        }
        this.field8066.method846((this.field8071.field342 & 0x8) != 0, this.field8062, (this.field8071.field342 & 0x7) != 0, (byte) 54);
        if (this.field8066.field1883) {
            this.field8066.method445(Integer.MAX_VALUE, this.field8072, this.field8069, this.field8080);
        }
        class74 var20 = this.field8066.method879(0);
        var20.method585(1.0F, 1.0F / this.field8075, 1.0F / this.field8075, (byte) 24);
        this.field8066.method866(5758, class19.field313);
        this.field8066.method48((byte) -32, this.field8064, 1);
        this.field8066.method62(false, this.field8071.field372);
        this.field8066.method53(0, var9, class620.field8229, var5, 0, var10 + 1 - var9, var8);
        this.field8066.method842(-106);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
    public static void method3348(byte arg0) {
        if (arg0 > -73) {
            field8063 = null;
        }
        field8063 = null;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)V")
    public final void method3349(int arg0, int arg1) {
        if (arg0 == 2) {
            this.field8082.method3475(arg1 * 4 + 3);
            field8079++;
            this.field8082.method3482(-1);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lhfa;B)I")
    public static final int method3350(class287 arg0, byte arg1) {
        field8065++;
        class419 var2 = arg0.field4052;
        if (arg1 != 78) {
            field8063 = null;
        }
        if (var2.field5753 != null) {
            var2 = var2.method2401(false, class80.field1261);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field5731;
        class543 var4 = arg0.method2353(-1);
        if (arg0.field5609) {
            var3 = var2.field5754;
        } else if (arg0.field5584 == var4.field7186 || arg0.field5584 == var4.field7136 || arg0.field5584 == var4.field7174 || arg0.field5584 == var4.field7147) {
            var3 = var2.field5755;
        } else if (arg0.field5584 == var4.field7155 || arg0.field5584 == var4.field7153 || arg0.field5584 == var4.field7156 || arg0.field5584 == var4.field7163) {
            var3 = var2.field5743;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZI)V")
    public final void method3351(boolean arg0, int arg1) {
        field8068++;
        this.field8082.method3479();
        this.field8064 = this.field8066.method108(arg0, 15918);
        this.field8064.method2521((byte) -61, 4, arg1 * 4, this.field8074);
        this.field8082 = null;
        this.field8074 = null;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lan;IIIII)V")
    public class611(class22 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8071 = arg0;
        this.field8067 = new int[this.field8071.field2248 * this.field8071.field2247];
        this.field8062 = arg1;
        this.field8069 = arg4;
        this.field8080 = arg5;
        this.field8075 = arg2;
        this.field8072 = arg3;
        this.field8066 = this.field8071.field349;
    }
}
