import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gja")
public abstract class class54 {

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "Lhia;")
    public class73 field589;

    @OriginalMember(owner = "client!gja", name = "d", descriptor = "I")
    public int field593;

    @OriginalMember(owner = "client!gja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field600 = new String[] { method413(method412("W\u0005RG\u0005\u0018")), method413(method412("W\u0005RG\u001e\u0018")), method413(method412("KA\u001dG,")), method413(method412("W\u0005RGmY\u0001Z\u001do\u0018")), method413(method412("^\u001a_\u0005")), method413(method412("W\u0005RG\u0000\u0018")), method413(method412("W\u0005RG\u0004\u0018")), method413(method412("W\u0005RG\u0003\u0018")), method413(method412("W\u0005RG\u001f\u0018")), method413(method412("W\u0005RG\u0001\u0018")), method413(method412("W\u0005RG\u0002\u0018")) };

    @OriginalMember(owner = "client!gja", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field598 = new String[100];

    @OriginalMember(owner = "client!gja", name = "e", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!gja", name = "f", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!gja", name = "k", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!gja", name = "g", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!gja", name = "i", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!gja", name = "c", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!gja", name = "j", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!gja", name = "l", descriptor = "Lbu;")
    public static class21 field592;

    @OriginalMember(owner = "client!gja", name = "h", descriptor = "Liga;")
    public static class481 field590;

    @OriginalMember(owner = "client!gja", name = "b", descriptor = "(I)V")
    public static final void method404(int arg0) {
        try {
            class351.field5422 = 200;
            class443.field6512 = (int) ((double) class648.field9378 * 34.46D);
            field594++;
            class443.field6512 <<= 0x2;
            if (arg0 <= 0) {
                method406((byte) 93, null, -6);
            }
            if (class610.field8913.method576()) {
                class443.field6512 += 512;
            }
            class120.method1047(1, false);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field600[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(Z)V")
    public abstract void method115(boolean arg0);

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(I)V")
    public static final void method405(int arg0) {
        try {
            if (arg0 != 0) {
                field598 = null;
            }
            class459.field6679 = true;
            field597++;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field600[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(BLjava/lang/String;I)V")
    public static final void method406(byte arg0, String arg1, int arg2) {
        try {
            field588++;
            int var3 = class3.field34;
            int var4 = 96 % ((arg0 - 19) / 48);
            int[] var5 = class358.field5483;
            boolean var6 = false;
            for (int var7 = 0; var7 < var3; var7++) {
                class726 var8 = class197.field2685[var5[var7]];
                if (var8 != null && class225.field3446 != var8 && var8.field10506 != null && var8.field10506.equalsIgnoreCase(arg1)) {
                    if (arg2 == 1) {
                        class107.field1249++;
                        class280 var9 = class610.method4508(class456.field6645, class279.field4190, (byte) 82);
                        var9.field4197.method1430(false, 0);
                        var9.field4197.method1406(var5[var7], 380332136);
                        class106.method934((byte) 53, var9);
                    } else if (arg2 == 4) {
                        class685.field9940++;
                        class280 var10 = class610.method4508(class517.field7478, class279.field4190, (byte) 44);
                        var10.field4197.method1428((byte) -24, 0);
                        var10.field4197.method1446(var5[var7], (byte) 98);
                        class106.method934((byte) 53, var10);
                    } else if (arg2 == 5) {
                        class157.field1947++;
                        class280 var14 = class610.method4508(class85.field945, class279.field4190, (byte) -90);
                        var14.field4197.method1418((byte) -95, var5[var7]);
                        var14.field4197.method1457(128, 0);
                        class106.method934((byte) 53, var14);
                    } else if (arg2 == 6) {
                        class624.field9128++;
                        class280 var13 = class610.method4508(class139.field1650, class279.field4190, (byte) 86);
                        var13.field4197.method1446(var5[var7], (byte) 98);
                        var13.field4197.method1428((byte) -24, 0);
                        class106.method934((byte) 53, var13);
                    } else if (arg2 == 7) {
                        class309.field4846++;
                        class280 var11 = class610.method4508(class597.field8782, class279.field4190, (byte) -126);
                        var11.field4197.method1446(var5[var7], (byte) 98);
                        var11.field4197.method1410(0, 26913);
                        class106.method934((byte) 53, var11);
                    } else if (arg2 == 9) {
                        class280 var12 = class610.method4508(class157.field1959, class279.field4190, (byte) 103);
                        var12.field4197.method1446(var5[var7], (byte) 98);
                        var12.field4197.method1428((byte) -24, 0);
                        class106.method934((byte) 53, var12);
                    }
                    var6 = true;
                    break;
                }
            }
            if (!var6) {
                class536.method4041(4, class309.field4868.method2616(false, class167.field2300) + arg1, 112);
            }
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field600[5] + arg0 + ',' + (arg1 == null ? field600[4] : field600[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(IB)V")
    public final void method407(int arg0, byte arg1) {
        try {
            if (arg1 >= -77) {
                field592 = null;
            }
            if (this.method109(arg0, (byte) -107) != 3) {
                this.method113(0, arg0);
            }
            field591++;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field600[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(Lhia;)V")
    public class54(class73 arg0) {
        try {
            this.field589 = arg0;
            this.field593 = this.method111(false);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field600[3] + (arg0 == null ? field600[4] : field600[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "c", descriptor = "(I)V")
    public static void method408(int arg0) {
        try {
            if (arg0 != -10) {
                field590 = null;
            }
            field590 = null;
            field592 = null;
            field598 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field600[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(IIILlk;IIIILvea;III)V")
    public static final void method409(int arg0, int arg1, int arg2, class613 arg3, int arg4, int arg5, int arg6, int arg7, class288 arg8, int arg9, int arg10, int arg11) {
        try {
            class80.field909 = arg3;
            class216.field3287 = null;
            field596++;
            int var12 = -103 % ((arg1 - 63) / 32);
            class559.field8332 = arg6;
            class494.field7100 = arg8;
            class550.field8198 = arg4;
            class314.field4971 = arg11;
            class162.field2192 = arg2;
            class246.field3757 = arg9;
            class5.field46 = null;
            class620.field9108 = arg7;
            class83.field932 = arg0;
            class382.field5788 = arg10;
            field590 = null;
            class431.field6342 = arg5;
            class466.method3542(-97);
            class565.field8379 = true;
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field600[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field600[4] : field600[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 == null ? field600[4] : field600[2]) + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(II)V")
    public abstract void method113(int arg0, int arg1);

    @OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(ILhia;)V")
    public class54(int arg0, class73 arg1) {
        try {
            this.field593 = arg0;
            this.field589 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field600[3] + arg0 + ',' + (arg1 == null ? field600[4] : field600[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "b", descriptor = "(Z)I")
    public abstract int method111(boolean arg0);

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(BI)I")
    public static final int method410(byte arg0, int arg1) {
        try {
            field599++;
            int var2 = 46 / ((arg0 + 15) / 43);
            int var3 = 0;
            if (arg1 < 0 || arg1 >= 65536) {
                var3 += 16;
                arg1 >>>= 0x10;
            }
            if (arg1 >= 256) {
                arg1 >>>= 0x8;
                var3 += 8;
            }
            if (arg1 >= 16) {
                arg1 >>>= 0x4;
                var3 += 4;
            }
            if (arg1 >= 4) {
                arg1 >>>= 0x2;
                var3 += 2;
            }
            if (arg1 >= 1) {
                var3++;
                arg1 >>>= 0x1;
            }
            return arg1 + var3;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field600[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "b", descriptor = "(II)V")
    public static final void method411(int arg0, int arg1) {
        try {
            class352.field5439 = 3;
            class84.field942 = arg1;
            class599.field8812 = arg0;
            field595++;
            class180.field2496 = 100;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field600[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "b", descriptor = "(IB)I")
    public abstract int method109(int arg0, byte arg1);

    @OriginalMember(owner = "client!gja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method412(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x51);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method413(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 48;
                    break;
                case 1:
                    var10005 = 111;
                    break;
                case 2:
                    var10005 = 51;
                    break;
                case 3:
                    var10005 = 105;
                    break;
                default:
                    var10005 = 81;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
