import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class172 extends class211 {

    @OriginalMember(owner = "client!tba", name = "C", descriptor = "I")
    private int field2387 = 12288;

    @OriginalMember(owner = "client!tba", name = "M", descriptor = "I")
    private int field2388 = 0;

    @OriginalMember(owner = "client!tba", name = "Q", descriptor = "I")
    private int field2396 = 2048;

    @OriginalMember(owner = "client!tba", name = "O", descriptor = "I")
    private int field2390 = 0;

    @OriginalMember(owner = "client!tba", name = "I", descriptor = "I")
    private int field2395 = 4096;

    @OriginalMember(owner = "client!tba", name = "L", descriptor = "I")
    private int field2399 = 8192;

    @OriginalMember(owner = "client!tba", name = "U", descriptor = "I")
    private int field2401 = 2048;

    @OriginalMember(owner = "client!tba", name = "D", descriptor = "[Ljava/lang/String;")
    private static final String[] field2404 = new String[] { method1532(method1531("D\u000f\u0006p")), method1532(method1531("QTD2U")), method1532(method1531("^\u0018\u000b2n\u0002")), method1532(method1531("^\u0018\u000b2i\u0002")), method1532(method1531("^\u0018\u000b2o\u0002")), method1532(method1531("^\u0018\u000b2m\u0002")), method1532(method1531("^\u0018\u000b2b\u0002")), method1532(method1531("^\u0018\u000b2j\u0002")), method1532(method1531("^\u0018\u000b2k\u0002")), method1532(method1531("^\u0018\u000b2l\u0002")), method1532(method1531("^\u0018\u000b2c\u0002")), method1532(method1531("y\u0012\u000bxMXZ\tsEZ\u0013\u0006y\bL\u001b\u0003pMN@")), method1532(method1531("^\u0018\u000b2`\u0002")) };

    @OriginalMember(owner = "client!tba", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field2384 = new String[8];

    @OriginalMember(owner = "client!tba", name = "R", descriptor = "Leu;")
    public static class505 field2400 = new class505(2);

    @OriginalMember(owner = "client!tba", name = "G", descriptor = "I")
    public static int field2402 = 0;

    @OriginalMember(owner = "client!tba", name = "E", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!tba", name = "S", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!tba", name = "X", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!tba", name = "T", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!tba", name = "J", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!tba", name = "N", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!tba", name = "V", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!tba", name = "F", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!tba", name = "K", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!tba", name = "W", descriptor = "[I")
    public static int[] field2403;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V")
    public final void method437(int arg0) {
        try {
            class100.method826(15667);
            if (arg0 != 27132) {
                this.field2396 = 12;
            }
            ++field2386;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2404[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "(III)Z")
    private final boolean method1524(int arg0, int arg1, int arg2) {
        try {
            ++field2392;
            int var4 = (-arg0 + arg2) * this.field2387 >> 12;
            int var5 = class713.field10336[var4 * 255 >> 12 & 255];
            int var6 = (var5 << 12) / this.field2387;
            if (arg1 != 4096) {
                this.field2388 = -94;
            }
            int var7 = (var6 << 12) / this.field2399;
            int var8 = this.field2395 * var7 >> 12;
            return ~var8 < ~(arg0 + arg2) && -var8 < arg0 + arg2;
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field2404[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(II)[I")
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field2389;
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (arg0 != 8217) {
                method1525(-63, 2, 44, -82, -107, (class260) null, -80);
            }
            if (super.field3231.field57) {
                int var4 = class302.field4735[arg1] + -2048;
                for (int var5 = 0; ~class343.field5332 < ~var5; ++var5) {
                    int var6 = class88.field997[var5] + -2048;
                    int var7 = var6 - -this.field2401;
                    int var8 = ~var7 <= 2047 ? var7 : var7 - -4096;
                    int var9 = var8 > 2048 ? var8 + -4096 : var8;
                    int var10 = this.field2390 + var4;
                    int var11 = var10 >= -2048 ? var10 : var10 + 4096;
                    int var12 = var11 <= 2048 ? var11 : var11 + -4096;
                    int var13 = this.field2388 + var6;
                    int var14 = ~var13 <= 2047 ? var13 : var13 - -4096;
                    int var15 = ~var14 < -2049 ? var14 - 4096 : var14;
                    int var16 = var4 - -this.field2396;
                    int var17 = ~var16 <= 2047 ? var16 : var16 + 4096;
                    int var18 = ~var17 < -2049 ? var17 - 4096 : var17;
                    var3[var5] = !this.method1524(var9, 4096, var12) && !this.method1527(var15, -108, var18) ? 0 : 4096;
                }
            }
            return var3;
        } catch (RuntimeException var20) {
            throw class759.method5498(var20, field2404[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(IIIIILcca;I)Z")
    public static final boolean method1525(int arg0, int arg1, int arg2, int arg3, int arg4, class260 arg5, int arg6) {
        try {
            ++field2397;
            if (class64.field658 && class16.field197) {
                if (class73.field850 < 100) {
                    return false;
                } else if (arg1 == arg6 && ~arg2 == ~arg4) {
                    if (!class56.method418(arg2, arg0, 123, arg1)) {
                        return false;
                    } else if (class109.method958((byte) 109, arg5)) {
                        ++class519.field7615;
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    int var7 = -126 / ((arg3 - 48) / 58);
                    for (int var8 = arg1; arg6 >= var8; ++var8) {
                        for (int var9 = arg2; arg4 >= var9; ++var9) {
                            if (class80.field902[arg0][var8][var9] == -class178.field2481) {
                                return false;
                            }
                        }
                    }
                    if (!class109.method958((byte) 118, arg5)) {
                        return false;
                    } else {
                        ++class519.field7615;
                        return true;
                    }
                }
            } else {
                return false;
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field2404[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field2404[1] : field2404[0]) + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(BI)V")
    public static final void method1526(byte arg0, int arg1) {
        try {
            ++field2391;
            class313 var2 = class196.method1670((long) arg1, 2, 83);
            if (arg0 != 50) {
                method1525(-109, -120, -47, 81, 58, (class260) null, -93);
            }
            var2.method2635(true);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field2404[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "()V")
    public class172() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "(III)Z")
    private final boolean method1527(int arg0, int arg1, int arg2) {
        try {
            ++field2398;
            int var4 = 122 / ((62 - arg1) / 44);
            int var5 = (arg0 + arg2) * this.field2387 >> 12;
            int var6 = class713.field10336[(var5 * 255 & 1048088) >> 12];
            int var7 = (var6 << 12) / this.field2387;
            int var8 = (var7 << 12) / this.field2399;
            int var9 = this.field2395 * var8 >> 12;
            return -arg0 + arg2 < var9 && -var9 < -arg0 + arg2;
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field2404[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I[BLrda;I)Lhu;")
    public static final class143 method1528(int arg0, byte[] arg1, class690 arg2, int arg3) {
        try {
            ++field2393;
            if (arg1 != null && arg1.length != 0) {
                long var4 = OpenGL.glCreateShaderObjectARB(arg3);
                OpenGL.glShaderSourceRawARB(var4, arg1);
                int var6 = 73 / ((arg0 - 35) / 49);
                OpenGL.glCompileShaderARB(var4);
                OpenGL.glGetObjectParameterivARB(var4, 35713, class540.field7913, 0);
                if (class540.field7913[0] == 0) {
                    if (class540.field7913[0] == 0) {
                        System.out.println(field2404[11]);
                    }
                    OpenGL.glGetObjectParameterivARB(var4, 35716, class540.field7913, 1);
                    if (~class540.field7913[1] < -2) {
                        byte[] var7 = new byte[class540.field7913[1]];
                        OpenGL.glGetInfoLogARB(var4, class540.field7913[1], class540.field7913, 0, var7, 0);
                        System.out.println(new String(var7));
                    }
                    if (~class540.field7913[0] == -1) {
                        OpenGL.glDeleteObjectARB(var4);
                        return null;
                    }
                }
                return new class143(arg2, var4, arg3);
            } else {
                return null;
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field2404[12] + arg0 + ',' + (arg1 != null ? field2404[1] : field2404[0]) + ',' + (arg2 != null ? field2404[1] : field2404[0]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "(I)I")
    public static final int method1529(int arg0) {
        try {
            ++field2385;
            if (arg0 != -2018) {
                field2403 = null;
            }
            return class591.field8684;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2404[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tba", name = "g", descriptor = "(I)V")
    public static void method1530(int arg0) {
        try {
            field2400 = null;
            field2403 = null;
            field2384 = null;
            if (arg0 != 715572492) {
                field2384 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2404[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(BILib;)V")
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (arg1 != 2) {
                        if (arg1 != 3) {
                            if (~arg1 != -5) {
                                if (arg1 != 5) {
                                    if (~arg1 == -7) {
                                        this.field2399 = arg2.method1445((byte) 120);
                                    }
                                } else {
                                    this.field2395 = arg2.method1445((byte) 104);
                                }
                            } else {
                                this.field2387 = arg2.method1445((byte) 113);
                            }
                        } else {
                            this.field2396 = arg2.method1445((byte) 121);
                        }
                    } else {
                        this.field2388 = arg2.method1445((byte) 121);
                    }
                } else {
                    this.field2390 = arg2.method1445((byte) 108);
                }
            } else {
                this.field2401 = arg2.method1445((byte) 110);
            }
            ++field2394;
            if (arg0 <= 67) {
                field2402 = -115;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field2404[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2404[1] : field2404[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!tba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1531(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 40);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1532(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 42;
                    break;
                case 1:
                    var10005 = 122;
                    break;
                case 2:
                    var10005 = 106;
                    break;
                case 3:
                    var10005 = 28;
                    break;
                default:
                    var10005 = 40;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
