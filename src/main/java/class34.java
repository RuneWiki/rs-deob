import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class34 extends class518 {

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "I")
    private int field420 = -1;

    @OriginalMember(owner = "client!uf", name = "M", descriptor = "[Ljava/lang/String;")
    private static final String[] field424 = new String[] { method356(method355("a\u007fY?\u0019Au\u000f,\u0014LxWd")), method356(method355("]w\u0001\u001c]")), method356(method355("]w\u0001\u0012]")), method356(method355("]w\u0001\u0011]")), method356(method355("]w\u0001\u0013]")), method356(method355("]w\u0001\u001d]")), method356(method355("FdC2")), method356(method355("S?\u0001p\b")), method356(method355("]w\u0001\u001a]")), method356(method355("]w\u0001\u001f]")) };

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
    private int field416;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!uf", name = "J", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "[I")
    private int[] field421;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)[[I")
    public final int[][] method349(int arg0, int arg1) {
        try {
            ++field419;
            int[][] var3 = super.field7575.method1955(arg1, -2);
            if (arg0 != 0) {
                this.method349(-91, 44);
            }
            if (super.field7575.field3416) {
                int var4 = this.field416 * (class606.field8689 != this.field413 ? this.field413 * arg1 / class606.field8689 : arg1);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                if (~class110.field1436 == ~this.field416) {
                    for (int var8 = 0; ~class110.field1436 < ~var8; ++var8) {
                        int var9 = this.field421[var4++];
                        var7[var8] = class434.method3377(4080, var9 << 4);
                        var6[var8] = class434.method3377(4080, var9 >> 4);
                        var5[var8] = class434.method3377(var9, 16711680) >> 12;
                    }
                } else {
                    for (int var10 = 0; class110.field1436 > var10; ++var10) {
                        int var11 = this.field416 * var10 / class110.field1436;
                        int var12 = this.field421[var4 + var11];
                        var7[var10] = class434.method3377(var12, 255) << 4;
                        var6[var10] = class434.method3377(var12, 65280) >> 4;
                        var5[var10] = class434.method3377(4080, var12 >> 12);
                    }
                }
            }
            return var3;
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field424[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILjc;I)V")
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            ++field423;
            if (~arg0 == -1) {
                this.field420 = arg1.method5116((byte) -125);
            }
            if (arg2 != -3) {
                this.field413 = 111;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field424[5] + arg0 + ',' + (arg1 != null ? field424[7] : field424[6]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class34() {
        super(0, false);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)I")
    public final int method350(int arg0) {
        try {
            ++field415;
            if (arg0 != 3) {
                this.method351(120);
            }
            return this.field420;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field424[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
    public final void method351(int arg0) {
        try {
            ++field418;
            if (arg0 == -1) {
                super.method351(arg0);
                this.field421 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field424[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(III)V")
    public final void method352(int arg0, int arg1, int arg2) {
        try {
            super.method352(arg0, arg1, arg2);
            ++field422;
            if (~this.field420 <= -1 && class24.field292 != null) {
                int var4 = class24.field292.method4500(-23641, this.field420).field9599 ? 64 : 128;
                this.field421 = class24.field292.method4502(1.0F, var4, arg2 ^ 149, var4, this.field420, false);
                this.field413 = var4;
                this.field416 = var4;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field424[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIII[BII[BI)V")
    public static final void method353(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        try {
            ++field414;
            int var9 = -(arg0 >> 2);
            int var15 = -(arg0 & 3);
            for (int var10 = -arg6; ~var10 > -1; ++var10) {
                int var10001;
                for (int var11 = var9; var11 < 0; ++var11) {
                    var10001 = arg5++;
                    arg7[var10001] = (byte) (arg7[var10001] + -arg4[arg8++]);
                    int var16 = arg5++;
                    arg7[var16] = (byte) (arg7[var16] + -arg4[arg8++]);
                    int var17 = arg5++;
                    arg7[var17] = (byte) (arg7[var17] + -arg4[arg8++]);
                    int var18 = arg5++;
                    arg7[var18] = (byte) (arg7[var18] + -arg4[arg8++]);
                }
                for (int var12 = var15; ~var12 > -1; ++var12) {
                    var10001 = arg5++;
                    arg7[var10001] = (byte) (arg7[var10001] + -arg4[arg8++]);
                }
                arg8 += arg3;
                arg5 += arg1;
            }
            if (arg2 == -1040068350) {
                ;
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field424[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field424[7] : field424[6]) + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field424[7] : field424[6]) + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZBII)Ljava/lang/String;")
    public static final String method354(boolean arg0, byte arg1, int arg2, int arg3) {
        try {
            ++field417;
            if (arg2 >= 2 && ~arg2 >= -37) {
                if (arg1 != -96) {
                    method354(true, (byte) 56, -53, 104);
                }
                if (arg0 && ~arg3 <= -1) {
                    int var4 = 2;
                    for (int var5 = arg3 / arg2; ~var5 != -1; var5 /= arg2) {
                        ++var4;
                    }
                    char[] var6 = new char[var4];
                    var6[0] = '+';
                    for (int var7 = var4 + -1; ~var7 < -1; --var7) {
                        int var8 = arg3;
                        arg3 /= arg2;
                        int var9 = -(arg2 * arg3) + var8;
                        if (~var9 <= -11) {
                            var6[var7] = (char) (var9 + 87);
                        } else {
                            var6[var7] = (char) (var9 + 48);
                        }
                    }
                    return new String(var6);
                } else {
                    return Integer.toString(arg3, arg2);
                }
            } else {
                throw new IllegalArgumentException(field424[0] + arg2);
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field424[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method355(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 117);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method356(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 40;
                    break;
                case 1:
                    var10005 = 17;
                    break;
                case 2:
                    var10005 = 47;
                    break;
                case 3:
                    var10005 = 94;
                    break;
                default:
                    var10005 = 117;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
