import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class29 {

    @OriginalMember(owner = "client!aba", name = "n", descriptor = "I")
    private int field370 = -1;

    @OriginalMember(owner = "client!aba", name = "q", descriptor = "Z")
    public boolean field374 = true;

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "I")
    private int field373;

    @OriginalMember(owner = "client!aba", name = "k", descriptor = "Ljj;")
    private class334 field360;

    @OriginalMember(owner = "client!aba", name = "g", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client!aba", name = "h", descriptor = "Lbd;")
    private class591 field363;

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "I")
    private int field365;

    @OriginalMember(owner = "client!aba", name = "f", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "Luba;")
    private class517 field375;

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "I")
    public int field359;

    @OriginalMember(owner = "client!aba", name = "m", descriptor = "Lcf;")
    private class196 field362;

    @OriginalMember(owner = "client!aba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field376 = new String[] { method327(method326("s\u0019+v\u0015:")), method327(method326("s\u0019+v\u0011:")), method327(method326("s\u0019+v\u0016:")), method327(method326("s\u0019+v\u0017:")), method327(method326("|\u000e&4")), method327(method326("s\u0019+v\u0010:")), method327(method326("iUdv)")), method327(method326("s\u0019+vh{\u0015#,j:")) };

    @OriginalMember(owner = "client!aba", name = "p", descriptor = "I")
    public static int field372 = -1;

    @OriginalMember(owner = "client!aba", name = "i", descriptor = "Lui;")
    public static class251 field366 = new class251(10);

    @OriginalMember(owner = "client!aba", name = "o", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!aba", name = "j", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!aba", name = "l", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "(B)V")
    public final void method321(byte arg0) {
        try {
            field371++;
            this.method325(this.field359, this.field375, (byte) 100);
            if (arg0 != 31) {
                this.field373 = -19;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field376[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(B)V")
    public static void method322(byte arg0) {
        try {
            field366 = null;
            if (arg0 != -50) {
                field366 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field376[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)V")
    private final void method323(int arg0) {
        try {
            if (arg0 != 1) {
                this.field361 = 72;
            }
            field364++;
            if (this.field374) {
                this.field374 = false;
                byte[] var2 = this.field363.field8516;
                int var3 = 0;
                int var4 = this.field363.field8507;
                int var5 = this.field363.field8507 * this.field373 + this.field367;
                for (int var6 = -128; var6 < 0; var6++) {
                    var3 = (var3 << 8) - var3;
                    for (int var7 = -128; var7 < 0; var7++) {
                        if (var2[var5++] != 0) {
                            var3++;
                        }
                    }
                    var5 += var4 - 128;
                }
                if (this.field362 != null && this.field370 == var3) {
                    this.field374 = false;
                } else {
                    this.field370 = var3;
                    int var8 = 0;
                    int var9 = this.field373 * var4 + this.field367;
                    if (this.field360.method2082(-27964, class496.field7281, class18.field235)) {
                        if (class162.field2106 == null) {
                            class162.field2106 = new byte[16384];
                        }
                        byte[] var14 = class162.field2106;
                        for (int var15 = -128; var15 < 0; var15++) {
                            for (int var16 = -128; var16 < 0; var16++) {
                                if (var2[var9] == 0) {
                                    int var17 = 0;
                                    if (var2[var9 - 1] != 0) {
                                        var17++;
                                    }
                                    if (var2[var9 + 1] != 0) {
                                        var17++;
                                    }
                                    if (var2[var9 - var4] != 0) {
                                        var17++;
                                    }
                                    if (var2[var4 + var9] != 0) {
                                        var17++;
                                    }
                                    var14[var8++] = (byte) (var17 * 17);
                                } else {
                                    var14[var8++] = 68;
                                }
                                var9++;
                            }
                            var9 += this.field363.field8507 - 128;
                        }
                        if (this.field362 == null) {
                            this.field362 = this.field360.method2675(128, false, class162.field2106, class18.field235, (byte) -50, 128);
                            this.field362.method1706(-18440, false, false);
                        } else {
                            this.field362.method1699(class18.field235, 0, class162.field2106, -19548, 128, 128, 128, 0, 0);
                        }
                    } else {
                        if (class89.field1245 == null) {
                            class89.field1245 = new int[16384];
                        }
                        int[] var10 = class89.field1245;
                        for (int var11 = -128; var11 < 0; var11++) {
                            for (int var12 = -128; var12 < 0; var12++) {
                                if (var2[var9] == 0) {
                                    int var13 = 0;
                                    if (var2[var9 - 1] != 0) {
                                        var13++;
                                    }
                                    if (var2[var9 + 1] != 0) {
                                        var13++;
                                    }
                                    if (var2[var9 - var4] != 0) {
                                        var13++;
                                    }
                                    if (var2[var4 + var9] != 0) {
                                        var13++;
                                    }
                                    var10[var8++] = var13 * 17 << 24;
                                } else {
                                    var10[var8++] = 1140850688;
                                }
                                var9++;
                            }
                            var9 += this.field363.field8507 - 128;
                        }
                        if (this.field362 == null) {
                            this.field362 = this.field360.method2613(128, 10, false, class89.field1245, 128);
                            this.field362.method1706(-18440, false, false);
                        } else {
                            this.field362.method1704(0, 0, (byte) 60, 128, class89.field1245, 128, 128, 0);
                        }
                    }
                }
            }
        } catch (RuntimeException var19) {
            throw class665.method4799(var19, field376[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)V")
    public static final void method324(byte arg0) {
        try {
            field369++;
            class248.field3552.method782(5, (byte) -50);
            class129.field1611.method4755(5, (byte) 112);
            class732.field10450.method2755((byte) -65, 5);
            class101.field1359.method2828(5, (byte) 21);
            class321.field4379.method595(50, 5);
            class153.field1955.method3239(-1, 5);
            class10.field132.method1890(true, 5);
            class11.field153.method3473((byte) -40, 5);
            class16.field203.method5243(5, 64);
            class640.field9099.method1939(5, -1);
            class272.field3853.method855(5, -27159);
            class135.field1750.method3957(0, 5);
            class772.field10996.method2796(0, 5);
            class319.field4356.method2507(false, 5);
            class123.field1553.method2202(1000, 5);
            class202.field2972.method607(5, 0);
            class646.field9183.method5250(-1573592480, 5);
            class671.field9451.method1274(16, 5);
            if (arg0 > -1) {
                field372 = -21;
            }
            class463.field6758.method4692(123, 5);
            class345.field5030.method4350(false, 5);
            class443.field6547.method4510(5, 78);
            class505.field7396.method4303((byte) -118, 5);
            class561.field8158.method1406(5, (byte) 4);
            class144.method1248(5, (byte) -128);
            class5.method34(50, -30582);
            class225.method1877(50, (byte) 55);
            class156.method1312(96, 5);
            class10.method68(1010, 5);
            class255.field3662.method2038(0, 5);
            class565.field8248.method2038(0, 5);
            class30.field378.method2038(0, 5);
            class282.field3973.method2038(0, 5);
            class158.field2027.method2038(0, 5);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field376[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(ILuba;B)V")
    public final void method325(int arg0, class517 arg1, byte arg2) {
        try {
            int var4 = 55 / ((-arg2 - 29) / 48);
            if (arg0 > 0) {
                this.method323(1);
                this.field360.method2668(24, this.field362);
                this.field360.method2074(class12.field163, this.field361, this.field365 + 1 - this.field361, arg1, 0, arg0, 13);
            }
            field368++;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field376[5] + arg0 + ',' + (arg1 == null ? field376[4] : field376[6]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Ljj;Lbd;Leh;IIIII)V")
    public class29(class334 arg0, class591 arg1, class544 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            this.field373 = arg7;
            this.field360 = arg0;
            this.field367 = arg6;
            this.field363 = arg1;
            int var9 = 0x1 << arg5;
            int var10 = 0;
            int var11 = arg3 << arg5;
            int var12 = arg4 << arg5;
            for (int var13 = 0; var13 < var9; var13++) {
                int var14 = var11 + (var12 + var13) * arg2.field10701;
                for (int var15 = 0; var15 < var9; var15++) {
                    short[] var16 = arg2.field7966[var14++];
                    if (var16 != null) {
                        var10 += var16.length;
                    }
                }
            }
            if (var10 <= 0) {
                this.field362 = null;
                this.field359 = 0;
            } else {
                this.field365 = Integer.MIN_VALUE;
                this.field361 = Integer.MAX_VALUE;
                this.field375 = this.field360.method2071(false, -21663);
                this.field375.method2344(var10, 118);
                for (int var17 = 0; var17 < 4; var17++) {
                    Buffer var18 = this.field375.method2343((byte) 54, true);
                    if (var18 != null) {
                        Stream var19 = this.field360.method2651(var18, 16);
                        if (Stream.method3200()) {
                            for (int var20 = 0; var20 < var9; var20++) {
                                int var21 = (var12 + var20) * arg2.field10701 + var11;
                                for (int var22 = 0; var22 < var9; var22++) {
                                    short[] var23 = arg2.field7966[var21++];
                                    if (var23 != null) {
                                        for (int var24 = 0; var24 < var23.length; var24++) {
                                            int var25 = var23[var24] & 0xFFFF;
                                            if (this.field361 > var25) {
                                                this.field361 = var25;
                                            }
                                            if (var25 > this.field365) {
                                                this.field365 = var25;
                                            }
                                            var19.method3195(var25);
                                        }
                                    }
                                }
                            }
                        } else {
                            for (int var26 = 0; var26 < var9; var26++) {
                                int var27 = (var12 + var26) * arg2.field10701 + var11;
                                for (int var28 = 0; var28 < var9; var28++) {
                                    short[] var29 = arg2.field7966[var27++];
                                    if (var29 != null) {
                                        for (int var30 = 0; var30 < var29.length; var30++) {
                                            int var31 = var29[var30] & 0xFFFF;
                                            if (var31 > this.field365) {
                                                this.field365 = var31;
                                            }
                                            if (this.field361 > var31) {
                                                this.field361 = var31;
                                            }
                                            var19.method3198(var31);
                                        }
                                    }
                                }
                            }
                        }
                        var19.method3199();
                        if (this.field375.method2339(true)) {
                            break;
                        }
                    }
                }
                this.field359 = var10 / 3;
            }
        } catch (RuntimeException var33) {
            throw class665.method4799(var33, field376[7] + (arg0 == null ? field376[4] : field376[6]) + ',' + (arg1 == null ? field376[4] : field376[6]) + ',' + (arg2 == null ? field376[4] : field376[6]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!aba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method326(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x54);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method327(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 18;
                    break;
                case 1:
                    var10005 = 123;
                    break;
                case 2:
                    var10005 = 74;
                    break;
                case 3:
                    var10005 = 88;
                    break;
                default:
                    var10005 = 84;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
