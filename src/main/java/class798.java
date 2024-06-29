import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class798 {

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "Ljava/lang/String;")
    private String field11589 = field11605[1];

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11605 = new String[] { method5764(method5763("5QUdG")), method5764(method5763(")@\u0017J")), method5764(method5763("5QUmG")), method5764(method5763("<\u001bU\b\u0012")), method5764(method5763("5QUnG")), method5764(method5763("5QUcG")), method5764(method5763("5QU`G")), method5764(method5763("5QUjG")), method5764(method5763("5QUbG")), method5764(method5763("5QUgG")), method5764(method5763("5QUaG")), method5764(method5763("5QUeG")), method5764(method5763("5QUlG")), method5764(method5763("5QUoG")), method5764(method5763("5QUkG")) };

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "C")
    public char field11590;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "C")
    public char field11592;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field11585;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field11586;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field11587;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field11588;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field11591;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    public static int field11593;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field11594;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public static int field11595;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public static int field11596;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field11597;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field11598;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    private int field11599;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    private int field11600;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
    public static int field11602;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field11603;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "Ldfa;")
    private class477 field11601;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "Ljava/lang/Object;")
    private Object field11604;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 3)
    public final boolean method5750(int arg0, String arg1) {
        try {
            field11594++;
            if (this.field11604 == null) {
                return false;
            }
            if (this.field11601 == null) {
                this.method5762(-15619);
            }
            if (arg0 != 0) {
                return false;
            }
            for (class324 var3 = (class324) this.field11601.method3693(false, class100.method980(arg1, arg0 + 2)); var3 != null; var3 = (class324) this.field11601.method3699(-1)) {
                if (var3.field4415.equals(arg1)) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11605[12] + arg0 + ',' + (arg1 == null ? field11605[1] : field11605[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)I", line = 31)
    public final int method5751(int arg0) {
        try {
            if (arg0 == 0) {
                field11595++;
                return this.field11600;
            } else {
                return -80;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11605[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)V", line = 47)
    public static final void method5752(int arg0, int arg1, int arg2) {
        try {
            if (arg1 <= -108) {
                field11593++;
                class294 var3 = class146.method1261((long) arg0, 122, 14);
                var3.method2378(-68);
                var3.field4133 = arg2;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11605[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)I", line = 63)
    public final int method5753(int arg0, int arg1) {
        try {
            if (arg1 != -1) {
                this.field11590 = '\u0017';
            }
            field11591++;
            if (this.field11604 == null) {
                return this.field11599;
            } else if ((this.field11604 instanceof class477)) {
                class529 var5 = (class529) ((class477) this.field11604).method3693(false, (long) arg0);
                return var5 == null ? this.field11599 : var5.field7679;
            } else {
                Integer[] var3 = (Integer[]) this.field11604;
                if (arg0 >= 0 && arg0 < var3.length) {
                    Integer var4 = var3[arg0];
                    return var4 == null ? this.field11599 : var4;
                } else {
                    return this.field11599;
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field11605[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZFFIF)F", line = 105)
    public static final float method5754(boolean arg0, float arg1, float arg2, int arg3, float arg4) {
        try {
            if (!arg0) {
                method5757(72, 0, (byte) -125);
            }
            field11598++;
            float[] var5 = class119.field1513[arg3];
            return var5[2] * arg2 + var5[0] * arg4 + var5[1] * arg1;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field11605[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Z", line = 118)
    public final boolean method5755(int arg0, int arg1) {
        try {
            if (arg0 > -81) {
                method5759(null, 80);
            }
            field11586++;
            if (this.field11604 == null) {
                return false;
            }
            if (this.field11601 == null) {
                this.method5761(19415);
            }
            class529 var3 = (class529) this.field11601.method3693(false, (long) arg1);
            return var3 != null;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11605[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjc;)V", line = 143)
    public final void method5756(int arg0, class711 arg1) {
        try {
            while (true) {
                int var3 = arg1.method5128(0);
                if (var3 == 0) {
                    field11585++;
                    if (arg0 != 28876) {
                        this.field11600 = -68;
                        return;
                    }
                    return;
                }
                this.method5758(126, arg1, var3);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11605[4] + arg0 + ',' + (arg1 == null ? field11605[1] : field11605[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIB)Z", line = 164)
    public static final boolean method5757(int arg0, int arg1, byte arg2) {
        try {
            field11587++;
            int var3 = -111 / ((arg2 + 21) / 52);
            return (arg1 & 0x10000) != 0;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11605[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjc;I)V", line = 180)
    private final void method5758(int arg0, class711 arg1, int arg2) {
        try {
            field11588++;
            int var4 = -12 / ((16 - arg0) / 45);
            if (arg2 == 1) {
                this.field11590 = class365.method2901((byte) 111, arg1.method5125((byte) -36));
            } else if (arg2 == 2) {
                this.field11592 = class365.method2901((byte) 88, arg1.method5125((byte) 108));
            } else if (arg2 == 3) {
                this.field11589 = arg1.method5144(-16414);
            } else if (arg2 == 4) {
                this.field11599 = arg1.method5113(18443);
            } else if (arg2 == 5 || arg2 == 6) {
                this.field11600 = arg1.method5116((byte) -119);
                class477 var5 = new class477(class788.method5671(1282334120, this.field11600));
                for (int var6 = 0; var6 < this.field11600; var6++) {
                    int var7 = arg1.method5113(18443);
                    class578 var8;
                    if (arg2 == 5) {
                        var8 = new class482(arg1.method5144(-16414));
                    } else {
                        var8 = new class529(arg1.method5113(18443));
                    }
                    var5.method3691(var8, (long) var7, -1);
                }
                this.field11604 = var5;
            } else if (arg2 == 7) {
                int var9 = arg1.method5116((byte) -114);
                this.field11600 = arg1.method5116((byte) -117);
                String[] var10 = new String[var9];
                for (int var11 = 0; var11 < this.field11600; var11++) {
                    int var12 = arg1.method5116((byte) -127);
                    var10[var12] = arg1.method5144(-16414);
                }
                this.field11604 = var10;
            } else if (arg2 == 8) {
                int var13 = arg1.method5116((byte) -120);
                this.field11600 = arg1.method5116((byte) -128);
                Integer[] var14 = new Integer[var13];
                for (int var15 = 0; var15 < this.field11600; var15++) {
                    int var16 = arg1.method5116((byte) -125);
                    var14[var16] = Integer.valueOf(arg1.method5113(18443));
                }
                this.field11604 = var14;
            }
        } catch (RuntimeException var18) {
            throw class665.method4799(var18, field11605[2] + arg0 + ',' + (arg1 == null ? field11605[1] : field11605[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lqo;I)V", line = 277)
    public static final void method5759(class170 arg0, int arg1) {
        try {
            field11602++;
            class84 var2 = arg0.field2228;
            if (class694.field9700 == arg0.field2246 || !var2.method835(false) || var2.method829(-128, 1)) {
                int var3 = arg0.field2246 - arg0.field2237;
                int var4 = class694.field9700 - arg0.field2237;
                int var5 = arg0.field2233 * 512 + arg0.method1437((byte) -28) * 256;
                int var6 = arg0.field2244 * 512 + arg0.method1437((byte) -28) * 256;
                int var7 = arg0.field2240 * 512 + (arg0.method1437((byte) -28) * 256);
                int var8 = arg0.field2247 * 512 + (arg0.method1437((byte) -28) * 256);
                arg0.field2969 = ((var3 - var4) * var5 + (var4 * var7)) / var3;
                arg0.field2984 = ((var3 - var4) * var6 + (var4 * var8)) / var3;
            }
            arg0.field2262 = 0;
            if (arg1 >= 87) {
                if (arg0.field2238 == 0) {
                    arg0.method1436(2, false, 8192);
                }
                if (arg0.field2238 == 1) {
                    arg0.method1436(2, false, 12288);
                }
                if (arg0.field2238 == 2) {
                    arg0.method1436(2, false, 0);
                }
                if (arg0.field2238 == 3) {
                    arg0.method1436(2, false, 4096);
                }
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field11605[10] + (arg0 == null ? field11605[1] : field11605[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 325)
    public final String method5760(int arg0, byte arg1) {
        try {
            if (arg1 != -28) {
                return null;
            }
            field11603++;
            if (this.field11604 == null) {
                return this.field11589;
            } else if (this.field11604 instanceof class477) {
                class482 var3 = (class482) ((class477) this.field11604).method3693(false, (long) arg0);
                return var3 == null ? this.field11589 : var3.field7096;
            } else {
                String[] var4 = (String[]) this.field11604;
                if (arg0 >= 0 && arg0 < var4.length) {
                    String var5 = var4[arg0];
                    return var5 == null ? this.field11589 : var5;
                } else {
                    return this.field11589;
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field11605[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 365)
    private final void method5761(int arg0) {
        try {
            if ((this.field11604 instanceof class477)) {
                class477 var5 = (class477) this.field11604;
                this.field11601 = new class477(var5.method3698(arg0 - 19373));
                for (class529 var6 = (class529) var5.method3696(arg0 ^ 0x4BD7); var6 != null; var6 = (class529) var5.method3697(-73)) {
                    class529 var7 = new class529((int) var6.field8378);
                    this.field11601.method3691(var7, (long) var6.field7679, -1);
                }
            } else {
                Integer[] var2 = (Integer[]) this.field11604;
                this.field11601 = new class477(class788.method5671(1282334120, var2.length));
                for (int var3 = 0; var3 < var2.length; var3++) {
                    if (var2[var3] != null) {
                        class529 var4 = new class529(var3);
                        this.field11601.method3691(var4, (long) var2[var3], -1);
                    }
                }
            }
            if (arg0 != 19415) {
                this.field11599 = -95;
            }
            field11597++;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field11605[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V", line = 417)
    private final void method5762(int arg0) {
        try {
            if ((this.field11604 instanceof class477)) {
                class477 var5 = (class477) this.field11604;
                this.field11601 = new class477(var5.method3698(-120));
                for (class482 var6 = (class482) var5.method3696(0); var6 != null; var6 = (class482) var5.method3697(-62)) {
                    class324 var7 = new class324(var6.field7096, (int) var6.field8378);
                    this.field11601.method3691(var7, class100.method980(var6.field7096, arg0 + 15621), -1);
                }
            } else {
                String[] var2 = (String[]) this.field11604;
                this.field11601 = new class477(class788.method5671(1282334120, var2.length));
                for (int var3 = 0; var3 < var2.length; var3++) {
                    if (var2[var3] != null) {
                        class324 var4 = new class324(var2[var3], var3);
                        this.field11601.method3691(var4, class100.method980(var2[var3], arg0 ^ 0xFFFFC2FF), -1);
                    }
                }
            }
            if (arg0 != -15619) {
                this.method5762(74);
            }
            field11596++;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field11605[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5763(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5764(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 71;
                    break;
                case 1:
                    var10005 = 53;
                    break;
                case 2:
                    var10005 = 123;
                    break;
                case 3:
                    var10005 = 38;
                    break;
                default:
                    var10005 = 111;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
