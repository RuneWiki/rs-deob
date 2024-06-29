import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class61 extends class689 {

    @OriginalMember(owner = "client!gda", name = "N", descriptor = "I")
    public int field640;

    @OriginalMember(owner = "client!gda", name = "L", descriptor = "F")
    public float field644;

    @OriginalMember(owner = "client!gda", name = "P", descriptor = "F")
    public float field646;

    @OriginalMember(owner = "client!gda", name = "J", descriptor = "I")
    public int field645;

    @OriginalMember(owner = "client!gda", name = "I", descriptor = "Z")
    public boolean field639;

    @OriginalMember(owner = "client!gda", name = "Q", descriptor = "[Ljava/lang/String;")
    private static final String[] field647 = new String[] { method447(method446("_t%a6")), method447(method446("C>jawM4b;u\f")), method447(method446("J/g#")), method447(method446("C>ja\b\f")), method447(method446("C>ja\t\f")), method447(method446("Q7")), method447(method446("Q6")), method447(method446("C>ja\n\f")) };

    @OriginalMember(owner = "client!gda", name = "M", descriptor = "[I")
    public static int[] field642 = new int[3];

    @OriginalMember(owner = "client!gda", name = "K", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!gda", name = "O", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lffa;IIIII)V")
    public class61(class197 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        try {
            this.field640 = arg3;
            this.field644 = (float) arg3 / (float) arg5;
            this.field646 = (float) arg2 / (float) arg4;
            this.field645 = arg2;
            this.field639 = false;
            this.method5046(false, (byte) -117, false);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field647[1] + (arg0 != null ? field647[0] : field647[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lffa;IIIIZ[BI)V")
    public class61(class197 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        try {
            this.field640 = arg4;
            this.field645 = arg3;
            if (~super.field7473 == -34038) {
                this.field644 = (float) arg4;
                this.field646 = (float) arg3;
                this.field639 = false;
            } else {
                this.field639 = true;
                this.field646 = this.field644 = 1.0F;
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field647[1] + (arg0 != null ? field647[0] : field647[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field647[0] : field647[2]) + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lffa;IIIIIIZ)V")
    public class61(class197 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        try {
            this.field645 = arg3;
            this.field646 = (float) arg3 / (float) arg5;
            this.field644 = (float) arg4 / (float) arg6;
            this.field639 = false;
            this.field640 = arg4;
            this.method5046(false, (byte) -106, false);
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field647[1] + (arg0 != null ? field647[0] : field647[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lffa;IIII)V")
    public class61(class197 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        try {
            this.field645 = arg3;
            this.field640 = arg4;
            if (~super.field7473 != -34038) {
                this.field639 = true;
                this.field646 = this.field644 = 1.0F;
            } else {
                this.field644 = (float) arg4;
                this.field646 = (float) arg3;
                this.field639 = false;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field647[1] + (arg0 != null ? field647[0] : field647[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lffa;IIIIIZ)V")
    public class61(class197 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        try {
            this.field640 = arg5;
            this.field645 = arg4;
            if (super.field7473 != 34037) {
                this.field639 = true;
                this.field646 = this.field644 = 1.0F;
            } else {
                this.field644 = (float) arg5;
                this.field639 = false;
                this.field646 = (float) arg4;
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field647[1] + (arg0 != null ? field647[0] : field647[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lffa;IIIII[BI)V")
    public class61(class197 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        try {
            this.field645 = arg2;
            this.field640 = arg3;
            this.method5049(arg6, arg7, true, 0, arg3, -118, 0, 0, arg2, 0);
            this.field639 = false;
            this.field644 = (float) arg3 / (float) arg5;
            this.field646 = (float) arg2 / (float) arg4;
            this.method5046(false, (byte) -101, false);
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field647[1] + (arg0 != null ? field647[0] : field647[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field647[0] : field647[2]) + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lffa;IIIZ[III)V")
    public class61(class197 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        try {
            if (~super.field7473 != -34038) {
                this.field646 = this.field644 = 1.0F;
                this.field639 = true;
            } else {
                this.field639 = false;
                this.field646 = (float) arg2;
                this.field644 = (float) arg3;
            }
            this.field640 = arg3;
            this.field645 = arg2;
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field647[1] + (arg0 != null ? field647[0] : field647[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field647[0] : field647[2]) + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!gda", name = "g", descriptor = "(I)V")
    public static void method443(int arg0) {
        try {
            field642 = null;
            if (arg0 != -1) {
                method444((byte) -3);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field647[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lffa;IIII[I)V")
    public class61(class197 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        try {
            this.field645 = arg1;
            this.field640 = arg2;
            this.method5048(arg2, arg1, 0, arg5, 0, 0, true, 0, true);
            this.field644 = (float) arg2 / (float) arg4;
            this.field639 = false;
            this.field646 = (float) arg1 / (float) arg3;
            this.method5046(false, (byte) -101, false);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field647[1] + (arg0 != null ? field647[0] : field647[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field647[0] : field647[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "(B)V")
    public static final void method444(byte arg0) {
        try {
            class460.method3507(false, class289.field4305.field818.method1942(false));
            ++field641;
            int var1 = (class271.field4116 >> 12) - -(class494.field7101 >> 3);
            class520.field7618 = class225.field3446.field6200 = 0;
            int var2 = (class683.field9899 >> 12) - -(class281.field4219 >> 3);
            class225.field3446.method5296(8, (byte) 106, 8);
            byte var3 = 18;
            class516.field7461 = new int[var3];
            class301.field4726 = new int[var3];
            class530.field7791 = new byte[var3][];
            class754.field10979 = new byte[var3][];
            class416.field6135 = new int[var3];
            class752.field10938 = new int[var3];
            class694.field10133 = new int[var3];
            class88.field993 = new int[var3];
            class274.field4140 = new byte[var3][];
            class608.field8893 = new byte[var3][];
            class28.field350 = new int[var3][4];
            class106.field1223 = new byte[var3][];
            int var4 = 0;
            for (int var5 = (var1 - (class648.field9378 >> 4)) / 8; ~var5 >= ~(((class648.field9378 >> 4) + var1) / 8); ++var5) {
                for (int var6 = (var2 - (class659.field9506 >> 4)) / 8; var6 <= ((class659.field9506 >> 4) + var2) / 8; ++var6) {
                    int var7 = (var5 << 8) - -var6;
                    class752.field10938[var4] = var7;
                    class694.field10133[var4] = class550.field8195.method3627("m" + var5 + "_" + var6, -119);
                    class301.field4726[var4] = class550.field8195.method3627("l" + var5 + "_" + var6, -92);
                    class88.field993[var4] = class550.field8195.method3627("n" + var5 + "_" + var6, -120);
                    class516.field7461[var4] = class550.field8195.method3627(field647[5] + var5 + "_" + var6, class219.method1916(arg0, 25));
                    class416.field6135[var4] = class550.field8195.method3627(field647[6] + var5 + "_" + var6, -71);
                    if (~class88.field993[var4] == 0) {
                        class694.field10133[var4] = -1;
                        class301.field4726[var4] = -1;
                        class516.field7461[var4] = -1;
                        class416.field6135[var4] = -1;
                    }
                    ++var4;
                }
            }
            for (int var8 = var4; class88.field993.length > var8; ++var8) {
                class88.field993[var8] = -1;
                class694.field10133[var8] = -1;
                class301.field4726[var8] = -1;
                class516.field7461[var8] = -1;
                class416.field6135[var8] = -1;
            }
            if (arg0 != -81) {
                method443(-58);
            }
            byte var9;
            if (class138.field1645 == 3) {
                var9 = 4;
            } else {
                var9 = 8;
            }
            class353.method2891(0, var2, false, var9, var1);
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field647[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "(I)Z")
    public static final boolean method445(int arg0) {
        try {
            ++field643;
            class534.field7820 = true;
            ++class544.field8130;
            if (arg0 != 8321) {
                method443(-26);
            }
            return true;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field647[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method446(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 75);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method447(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 36;
                    break;
                case 1:
                    var10005 = 90;
                    break;
                case 2:
                    var10005 = 11;
                    break;
                case 3:
                    var10005 = 79;
                    break;
                default:
                    var10005 = 75;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
