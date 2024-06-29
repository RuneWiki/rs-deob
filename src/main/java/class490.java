import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class490 implements class541 {

    @OriginalMember(owner = "client!cga", name = "o", descriptor = "Ldfa;")
    private class477 field7183 = new class477(128);

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "[I")
    private int[] field7173;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "[I")
    public int[] field7178;

    @OriginalMember(owner = "client!cga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7186 = new String[] { method3781(method3780("r_Hp\t9")), method3781(method3780("r_Hp\b9")), method3781(method3780("r_Hp\f9")), method3781(method3780("r_Hp\u000f9")), method3781(method3780("cL")), method3781(method3780("r_Hp\u00029")), method3781(method3780("j\u0016\u0007p7")), method3781(method3780("r_Hp\u00009")), method3781(method3780("\u007fME2")), method3781(method3780("r_Hp\u00039")), method3781(method3780("r_Hp\u000e9")), method3781(method3780("r_HpvxV@*t9")), method3781(method3780("r_Hp\r9")), method3781(method3780("r_Hp\u000b9")), method3781(method3780("r_Hp\u00019")) };

    @OriginalMember(owner = "client!cga", name = "f", descriptor = "Lgia;")
    public static class173 field7184 = new class173(method3781(method3780("Fqy")), 2);

    @OriginalMember(owner = "client!cga", name = "g", descriptor = "I")
    public static int field7170;

    @OriginalMember(owner = "client!cga", name = "e", descriptor = "I")
    public static int field7171;

    @OriginalMember(owner = "client!cga", name = "n", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!cga", name = "i", descriptor = "I")
    public static int field7174;

    @OriginalMember(owner = "client!cga", name = "p", descriptor = "I")
    public static int field7175;

    @OriginalMember(owner = "client!cga", name = "l", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!cga", name = "j", descriptor = "I")
    public static int field7177;

    @OriginalMember(owner = "client!cga", name = "d", descriptor = "I")
    public static int field7179;

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "I")
    public static int field7180;

    @OriginalMember(owner = "client!cga", name = "m", descriptor = "I")
    public static int field7182;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cga", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field7185;

    @OriginalMember(owner = "client!cga", name = "h", descriptor = "Ljava/lang/Object;")
    public static Object field7181;

    // $FF: synthetic method
    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3779(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "(III)V", line = 3)
    public final void method3768(int arg0, int arg1, int arg2) {
        try {
            if (arg1 != 50) {
                this.method3778(63, 42);
            }
            field7179++;
            class609 var4 = class16.field203.method5241(arg2, 64);
            int var5 = var4.field8723;
            int var6 = var4.field8725;
            int var7 = var4.field8724;
            int var8 = class316.field4332[var7 - var6];
            if (arg0 < 0 || var8 < arg0) {
                arg0 = 0;
            }
            int var9 = var8 << var6;
            this.method3769(false, var5, this.field7178[var5] & ~var9 | var9 & arg0 << var6);
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field7186[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(ZII)V", line = 34)
    public final void method3769(boolean arg0, int arg1, int arg2) {
        try {
            field7177++;
            this.field7178[arg1] = arg2;
            if (!arg0) {
                class239 var4 = (class239) this.field7183.method3693(arg0, (long) arg1);
                if (var4 == null) {
                    class239 var5 = new class239(class614.method4531(-19) + 500L);
                    this.field7183.method3691(var5, (long) arg1, -1);
                } else {
                    var4.field3447 = class614.method4531(-93) + 500L;
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field7186[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IZ)I", line = 64)
    public final int method3770(int arg0, boolean arg1) {
        try {
            field7172++;
            if (arg0 != 28658) {
                field7184 = null;
            }
            long var3 = class614.method4531(-24);
            for (class239 var5 = arg1 ? (class239) this.field7183.method3696(0) : (class239) this.field7183.method3697(-122); var5 != null; var5 = (class239) this.field7183.method3697(arg0 - 28715)) {
                if (var3 > (var5.field3447 & 0x3FFFFFFFFFFFFFFFL)) {
                    if ((var5.field3447 & 0x4000000000000000L) != 0L) {
                        int var6 = (int) var5.field8378;
                        this.field7178[var6] = this.field7173[var6];
                        var5.method4294(0);
                        return var6;
                    }
                    var5.method4294(0);
                }
            }
            return -1;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field7186[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(BI)I", line = 104)
    public final int method3771(byte arg0, int arg1) {
        try {
            if (arg0 >= -126) {
                field7181 = null;
            }
            field7171++;
            return this.field7178[arg1];
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7186[13] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "(I)V", line = 116)
    public static void method3772(int arg0) {
        try {
            field7181 = null;
            if (arg0 != -238043880) {
                field7184 = null;
            }
            field7184 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7186[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lkn;ILrfa;I)V", line = 127)
    public static final void method3773(class437 arg0, int arg1, class202 arg2, int arg3) {
        try {
            field7176++;
            if (class347.field5048 < 50 && arg0 != null && arg0.field6435 != null && arg1 < arg0.field6435.length && arg0.field6435[arg1] != null) {
                int var4 = arg0.field6435[arg1][0];
                if (arg3 <= 76) {
                    field7181 = null;
                }
                int var5 = var4 >> 8;
                int var6 = var4 >> 5 & 0x7;
                int var7 = var4 & 0x1F;
                if (arg0.field6435[arg1].length > 1) {
                    int var8 = (int) (Math.random() * (double) arg0.field6435[arg1].length);
                    if (var8 > 0) {
                        var5 = arg0.field6435[arg1][var8];
                    }
                }
                int var9 = 256;
                if (arg0.field6429 != null && arg0.field6428 != null) {
                    var9 = (int) (Math.random() * (double) (arg0.field6428[arg1] - arg0.field6429[arg1])) + arg0.field6429[arg1];
                }
                int var10 = arg0.field6443 == null ? 255 : arg0.field6443[arg1];
                if (var7 == 0) {
                    if (class203.field2988 == arg2) {
                        if (arg0.field6427) {
                            class241.method1991(0, (byte) -92, false, var5, var6, var9, var10);
                            return;
                        }
                        class336.method2699(var9, var5, var10, 0, var6, true);
                    }
                } else if (class451.field6612.field9087.method2498(3) != 0) {
                    int var11 = arg2.field2969 - 256 >> 9;
                    int var12 = arg2.field2984 - 256 >> 9;
                    int var13 = class203.field2988 == arg2 ? 0 : (var11 << 16) + ((arg2.field2981 << 24) + (var12 << 8) + var7);
                    class759.field10834[class347.field5048++] = new class441((byte) (arg0.field6427 ? 2 : 1), var5, var6, 0, var10, var13, var9, arg2);
                }
            }
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field7186[7] + (arg0 == null ? field7186[8] : field7186[6]) + ',' + arg1 + ',' + (arg2 == null ? field7186[8] : field7186[6]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIIIIIBI)V", line = 198)
    public static final void method3774(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        try {
            field7175++;
            if (arg6 <= 14) {
                field7184 = null;
            }
            if (arg0 >= 0 && arg5 >= 0 && class625.field8929 - 1 > arg0 && class14.field187 - 1 > arg5 && class608.field8715 != null) {
                if (arg4 == 0) {
                    class675 var8 = (class675) class185.method1526(arg2, arg0, arg5);
                    class675 var9 = (class675) class138.method1209(arg2, arg0, arg5);
                    if (var8 != null && arg3 != 2) {
                        if ((var8 instanceof class466)) {
                            ((class466) var8).field6792.method2904(false, arg1);
                        } else {
                            class748.method5417((byte) -52, arg7, var8.method584(false), arg1, arg3, arg4, arg0, arg5, arg2);
                        }
                    }
                    if (var9 != null) {
                        if (var9 instanceof class466) {
                            ((class466) var9).field6792.method2904(false, arg1);
                            return;
                        }
                        class748.method5417((byte) -52, arg7, var9.method584(false), arg1, arg3, arg4, arg0, arg5, arg2);
                        return;
                    }
                } else if (arg4 == 1) {
                    class675 var10 = (class675) class501.method3838(arg2, arg0, arg5);
                    if (var10 != null) {
                        if (var10 instanceof class710) {
                            ((class710) var10).field9922.method2904(false, arg1);
                            return;
                        }
                        int var11 = var10.method584(false);
                        if (arg3 != 4 && arg3 != 5) {
                            if (arg3 == 6) {
                                class748.method5417((byte) -52, arg7 + 4, var11, arg1, 4, arg4, arg0, arg5, arg2);
                            } else if (arg3 == 7) {
                                class748.method5417((byte) -52, (arg7 + 2 & 0x3) + 4, var11, arg1, 4, arg4, arg0, arg5, arg2);
                                return;
                            } else if (arg3 == 8) {
                                class748.method5417((byte) -52, arg7 + 4, var11, arg1, 4, arg4, arg0, arg5, arg2);
                                class748.method5417((byte) -52, (arg7 + 2 & 0x3) + 4, var11, arg1, 4, arg4, arg0, arg5, arg2);
                                return;
                            }
                            return;
                        }
                        class748.method5417((byte) -52, arg7, var11, arg1, 4, arg4, arg0, arg5, arg2);
                        return;
                    }
                } else if (arg4 == 2) {
                    class675 var13 = (class675) class590.method4352(arg2, arg0, arg5, field7185 == null ? (field7185 = method3779(field7186[4])) : field7185);
                    if (var13 == null) {
                        return;
                    }
                    if (arg3 == 11) {
                        arg3 = 10;
                    }
                    if (!(var13 instanceof class55)) {
                        class748.method5417((byte) -52, arg7, var13.method584(false), arg1, arg3, arg4, arg0, arg5, arg2);
                        return;
                    }
                    ((class55) var13).field754.method2904(false, arg1);
                } else if (arg4 == 3) {
                    class675 var12 = (class675) class254.method2130(arg2, arg0, arg5);
                    if (var12 != null) {
                        if (var12 instanceof class800) {
                            ((class800) var12).field11622.method2904(false, arg1);
                            return;
                        }
                        class748.method5417((byte) -52, arg7, var12.method584(false), arg1, arg3, arg4, arg0, arg5, arg2);
                        return;
                    }
                }
            }
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field7186[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(III)V", line = 316)
    public final void method3775(int arg0, int arg1, int arg2) {
        try {
            field7180++;
            this.field7173[arg1] = arg2;
            class239 var4 = (class239) this.field7183.method3693(false, (long) arg1);
            if (var4 == null) {
                class239 var5 = new class239(4611686018427387905L);
                this.field7183.method3691(var5, (long) arg1, -1);
            } else if (var4.field3447 != 4611686018427387905L) {
                var4.field3447 = class614.method4531(-31) + 500L | 0x4000000000000000L;
            }
            int var6 = -115 / ((33 - arg0) / 58);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field7186[12] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)V", line = 345)
    public final void method3776(int arg0) {
        try {
            int var2 = 0;
            if (arg0 != 30111) {
                this.field7183 = null;
            }
            while (var2 < class640.field9099.field3374) {
                class141 var3 = class640.field9099.method1940(-15568, var2);
                if (var3 != null && var3.field1831 == 0) {
                    this.field7173[var2] = 0;
                    this.field7178[var2] = 0;
                }
                var2++;
            }
            field7182++;
            this.field7183 = new class477(128);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7186[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "(III)V", line = 373)
    public final void method3777(int arg0, int arg1, int arg2) {
        try {
            field7170++;
            class609 var4 = class16.field203.method5241(arg2, 64);
            int var5 = var4.field8723;
            int var6 = var4.field8725;
            int var7 = var4.field8724;
            if (arg0 != 15802) {
                this.method3770(34, true);
            }
            int var8 = class316.field4332[var7 - var6];
            if (arg1 < 0 || arg1 > var8) {
                arg1 = 0;
            }
            int var9 = var8 << var6;
            this.method3775(-70, var5, ~var9 & this.field7173[var5] | arg1 << var6 & var9);
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field7186[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(II)I", line = 402)
    public final int method3778(int arg0, int arg1) {
        try {
            field7174++;
            if (arg0 < 5) {
                method3773(null, 56, null, -56);
            }
            class609 var3 = class16.field203.method5241(arg1, 64);
            int var4 = var3.field8723;
            int var5 = var3.field8725;
            int var6 = var3.field8724;
            int var7 = class316.field4332[var6 - var5];
            return var7 & this.field7178[var4] >> var5;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field7186[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cga", name = "<init>", descriptor = "()V", line = 428)
    public class490() {
        try {
            this.field7173 = new int[class640.field9099.field3374];
            this.field7178 = new int[class640.field9099.field3374];
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7186[11] + ')');
        }
    }

    @OriginalMember(owner = "client!cga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3780(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3781(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 17;
                    break;
                case 1:
                    var10005 = 56;
                    break;
                case 2:
                    var10005 = 41;
                    break;
                case 3:
                    var10005 = 94;
                    break;
                default:
                    var10005 = 74;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
