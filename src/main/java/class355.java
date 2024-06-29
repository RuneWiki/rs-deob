import jaggl.OpenGL;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class355 extends class593 {

    @OriginalMember(owner = "client!lda", name = "o", descriptor = "Ldga;")
    private class713 field5154;

    @OriginalMember(owner = "client!lda", name = "l", descriptor = "Ljd;")
    private class130 field5161;

    @OriginalMember(owner = "client!lda", name = "j", descriptor = "Lnh;")
    private class388 field5150;

    @OriginalMember(owner = "client!lda", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field5168 = new String[] { method2844(method2843("\u001cjP\u000b\u0004X")), method2844(method2843("\u001cjP\u000b\nX")), method2844(method2843("\u001e{]I")), method2844(method2843("\u000b \u001f\u000b?")), method2844(method2843("\u001cjP\u000b\rX")), method2844(method2843("#fPA'\u0002.]L,\u001bg_Bb\u0016oXI'\u00144")), method2844(method2843("\u001cjP\u000b\u0005X")), method2844(method2843("\u001cjP\u000b\u0000X")), method2844(method2843("\u001cjP\u000b\u0007X")), method2844(method2843("\u001cjP\u000b\u0006X")), method2844(method2843("\u001cjP\u000b\u000bX")), method2844(method2843("\u001cjP\u000b\u0003X")), method2844(method2843("\u001cjP\u000b\u0012X")), method2844(method2843("\\.")), method2844(method2843("PI|q")), method2844(method2843("\u001cjP\u000b~\u0019`XQ|X")), method2844(method2843("\u0004|PK1\u0000oC@,\u0004QFD6\u0015|")), method2844(method2843("\u0017b")) };

    @OriginalMember(owner = "client!lda", name = "i", descriptor = "I")
    public static int field5156 = 0;

    @OriginalMember(owner = "client!lda", name = "u", descriptor = "I")
    public static int field5158 = -2;

    @OriginalMember(owner = "client!lda", name = "v", descriptor = "I")
    public static int field5162 = 0;

    @OriginalMember(owner = "client!lda", name = "q", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!lda", name = "r", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!lda", name = "n", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!lda", name = "y", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!lda", name = "t", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!lda", name = "k", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!lda", name = "m", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!lda", name = "z", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!lda", name = "p", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!lda", name = "x", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!lda", name = "h", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!lda", name = "w", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!lda", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field5167;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(BLdga;[Lfb;)Lhaa;", line = 7)
    public static final class3 method2838(byte arg0, class713 arg1, class263[] arg2) {
        try {
            ++field5153;
            for (int var3 = 0; ~var3 > ~arg2.length; ++var3) {
                if (arg2[var3] == null || ~arg2[var3].field3720 >= -1L) {
                    return null;
                }
            }
            long var4 = OpenGL.glCreateProgramObjectARB();
            for (int var6 = 0; arg2.length > var6; ++var6) {
                OpenGL.glAttachObjectARB(var4, arg2[var6].field3720);
            }
            OpenGL.glLinkProgramARB(var4);
            int var7 = -99 / ((-48 - arg0) / 55);
            OpenGL.glGetObjectParameterivARB(var4, 35714, class261.field3708, 0);
            if (class261.field3708[0] == 0) {
                if (class261.field3708[0] == 0) {
                    System.out.println(field5168[5]);
                }
                OpenGL.glGetObjectParameterivARB(var4, 35716, class261.field3708, 1);
                if (class261.field3708[1] > 1) {
                    byte[] var8 = new byte[class261.field3708[1]];
                    OpenGL.glGetInfoLogARB(var4, class261.field3708[1], class261.field3708, 0, var8, 0);
                    System.out.println(new String(var8));
                }
                if (~class261.field3708[0] == -1) {
                    for (int var9 = 0; ~var9 > ~arg2.length; ++var9) {
                        OpenGL.glDetachObjectARB(var4, arg2[var9].field3720);
                    }
                    OpenGL.glDeleteObjectARB(var4);
                    return null;
                }
            }
            return new class3(arg1, var4, arg2);
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field5168[4] + arg0 + ',' + (arg1 != null ? field5168[3] : field5168[2]) + ',' + (arg2 != null ? field5168[3] : field5168[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIB)V", line = 87)
    public final void method463(int arg0, int arg1, byte arg2) {
        try {
            ++field5157;
            if (arg2 < -98) {
                if (!this.field5161.field1621) {
                    int var4 = super.field8530.field4774 % 4000 * 16 / 4000;
                    super.field8530.method2668(24, this.field5161.field1615[var4]);
                    OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    float var5 = (float) (super.field8530.field4774 % 4000) / 4000.0F;
                    super.field8530.method2668(24, this.field5161.field1618);
                    OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field5168[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 116)
    public static final void method2839(int arg0, int arg1, int arg2, Class arg3) {
        class621 var4 = class608.field8715[arg0][arg1][arg2];
        if (var4 != null) {
            for (class219 var5 = var4.field8841; var5 != null; var5 = var5.field3190) {
                class604 var6 = var5.field3188;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field8663 == arg1 && var6.field8669 == arg2) {
                    class625.method4589(var6, false);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 142)
    public static final String method2840(int arg0, long arg1) {
        try {
            class584.field8427.setTime(new Date(arg1));
            ++field5155;
            int var3 = class584.field8427.get(arg0);
            int var4 = class584.field8427.get(5);
            int var5 = class584.field8427.get(2);
            int var6 = class584.field8427.get(1);
            int var7 = class584.field8427.get(11);
            int var8 = class584.field8427.get(12);
            int var9 = class584.field8427.get(13);
            return class164.field2122[var3 + -1] + field5168[13] + var4 / 10 + var4 % 10 + "-" + class383.field5601[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + field5168[14];
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field5168[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IBLah;)V", line = 165)
    public final void method452(int arg0, byte arg1, class764 arg2) {
        try {
            if (arg1 != -106) {
                field5167 = null;
            }
            ++field5152;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5168[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5168[3] : field5168[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)Z", line = 182)
    public final boolean method458(int arg0) {
        try {
            ++field5165;
            if (arg0 <= 70) {
                return false;
            } else {
                return this.field5150 != null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5168[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IZ)V", line = 197)
    public final void method454(int arg0, boolean arg1) {
        try {
            ++field5159;
            OpenGL.glBindProgramARB(34336, this.field5150.field5658);
            OpenGL.glEnable(34336);
            int var3 = -44 / ((-51 - arg0) / 39);
            super.field8530.method2655(1, 0, class514.field7551);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5168[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Ldga;Llga;Ljd;)V", line = 209)
    public class355(class713 arg0, class47 arg1, class130 arg2) {
        super(arg0);
        try {
            this.field5154 = arg0;
            this.field5161 = arg2;
            if (arg1 != null && this.field5161.method1142((byte) -113) && this.field5154.field10136) {
                this.field5150 = class470.method3610(34336, arg1.method529(field5168[17], 1, field5168[16]), this.field5154, 34379);
            } else {
                this.field5150 = null;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5168[15] + (arg0 != null ? field5168[3] : field5168[2]) + ',' + (arg1 != null ? field5168[3] : field5168[2]) + ',' + (arg2 != null ? field5168[3] : field5168[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(ZII)Z", line = 225)
    public static final boolean method2841(boolean arg0, int arg1, int arg2) {
        try {
            ++field5166;
            return arg0 ? true : class585.method4329(0, arg1, arg2) & class421.method3278(arg1, (byte) 84, arg2);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5168[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "(I)V", line = 236)
    public final void method455(int arg0) {
        try {
            super.field8530.method2655(1, 0, class784.field11325);
            ++field5163;
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            if (arg0 != -15226) {
                field5164 = -98;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5168[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(BZ)V", line = 250)
    public final void method460(byte arg0, boolean arg1) {
        try {
            if (arg0 == -20) {
                super.field8530.method2624(class256.field3668, (byte) 107, class647.field9205);
                ++field5160;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5168[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lda", name = "h", descriptor = "(I)V", line = 261)
    public static void method2842(int arg0) {
        try {
            field5167 = null;
            if (arg0 != 1) {
                field5162 = 105;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5168[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2843(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 66);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2844(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 112;
                    break;
                case 1:
                    var10005 = 14;
                    break;
                case 2:
                    var10005 = 49;
                    break;
                case 3:
                    var10005 = 37;
                    break;
                default:
                    var10005 = 66;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
