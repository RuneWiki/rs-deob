import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class172 {

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public int field3006 = -1;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "[I")
    private int[] field2991 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!di", name = "t", descriptor = "Z")
    public boolean field3010 = false;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "Lpj;")
    public static class237 field2998 = class33.method353("(U0a )2 via: ", 63);

    @OriginalMember(owner = "client!di", name = "e", descriptor = "[I")
    public static int[] field2995 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!di", name = "c", descriptor = "Lpj;")
    private static class237 field2993 = class33.method353("Examine", 57);

    @OriginalMember(owner = "client!di", name = "y", descriptor = "I")
    public static int field3015 = 0;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "Lpj;")
    public static class237 field3014 = class33.method353("blinken2:", 26);

    @OriginalMember(owner = "client!di", name = "b", descriptor = "Lpj;")
    public static class237 field2992 = field2993;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "[I")
    private int[] field3005;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "[S")
    private short[] field2996;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "[S")
    private short[] field3000;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "[S")
    private short[] field3011;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "[S")
    private short[] field3012;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IILie;)V")
    private final void method1188(int arg0, int arg1, class32 arg2) {
        if (arg1 != 60) {
            method1190((byte[]) null, (byte) 18);
        }
        if (arg0 == 1) {
            this.field3006 = arg2.method316((byte) -76);
        } else if (arg0 == 2) {
            int var4 = arg2.method316((byte) 2);
            this.field3005 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3005[var5] = arg2.method339(-16777216);
            }
        } else if (arg0 == 3) {
            this.field3010 = true;
        } else if (arg0 == 40) {
            int var6 = arg2.method316((byte) 125);
            this.field3012 = new short[var6];
            this.field3000 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3012[var7] = (short) arg2.method339(class38.method384(arg1, -16777156));
                this.field3000[var7] = (short) arg2.method339(-16777216);
            }
        } else if (arg0 == 41) {
            int var8 = arg2.method316((byte) 118);
            this.field3011 = new short[var8];
            this.field2996 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3011[var9] = (short) arg2.method339(-16777216);
                this.field2996[var9] = (short) arg2.method339(-16777216);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field2991[arg0 - 60] = arg2.method339(-16777216);
        }
        field2997++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILfa;)V")
    public static final void method1189(int arg0, class239 arg1) {
        field3013++;
        if (class234.field4057) {
            return;
        }
        class192.method1310();
        int var2 = 69 % ((17 - arg0) / 60);
        class142.field2582 = class114.method842(arg1, 0, class184.field3223);
        int var3 = class119.field2087;
        int var4 = var3 * 956 / 503;
        class142.field2582.method844((class142.field2585 - var4) / 2, 0, var4, var3);
        class214.field3672 = class222.method1477(90, class208.field3541, arg1);
        class214.field3672.method1055(class142.field2585 / 2 - (class214.field3672.field2746 / 2), 18);
        class234.field4057 = true;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([BB)V")
    public static final void method1190(byte[] arg0, byte arg1) {
        class32 var2 = new class32(arg0);
        var2.field647 = arg0.length - 2;
        class92.field1668 = var2.method339(-16777216);
        field3004++;
        class124.field2184 = new boolean[class92.field1668];
        class127.field2221 = new byte[class92.field1668][];
        class252.field4341 = new int[class92.field1668];
        class175.field3063 = new int[class92.field1668];
        class174.field3060 = new int[class92.field1668];
        class226.field3868 = new int[class92.field1668];
        class69.field1364 = new byte[class92.field1668][];
        var2.field647 = arg0.length - (class92.field1668 * 8) - 7;
        class52.field1094 = var2.method339(-16777216);
        class43.field944 = var2.method339(-16777216);
        int var3 = (var2.method316((byte) -114) & 0xFF) + 1;
        for (int var4 = 0; var4 < class92.field1668; var4++) {
            class252.field4341[var4] = var2.method339(-16777216);
        }
        int var5 = -93 % ((-arg1 - 64) / 51);
        for (int var6 = 0; var6 < class92.field1668; var6++) {
            class226.field3868[var6] = var2.method339(-16777216);
        }
        for (int var7 = 0; var7 < class92.field1668; var7++) {
            class174.field3060[var7] = var2.method339(-16777216);
        }
        for (int var8 = 0; var8 < class92.field1668; var8++) {
            class175.field3063[var8] = var2.method339(-16777216);
        }
        var2.field647 = arg0.length + 3 - (var3 * 3) - (class92.field1668 * 8) - 7;
        class139.field2398 = new int[var3];
        for (int var9 = 1; var9 < var3; var9++) {
            class139.field2398[var9] = var2.method313((byte) -80);
            if (class139.field2398[var9] == 0) {
                class139.field2398[var9] = 1;
            }
        }
        var2.field647 = 0;
        for (int var10 = 0; var10 < class92.field1668; var10++) {
            int var11 = class175.field3063[var10];
            int var12 = class174.field3060[var10];
            int var13 = var11 * var12;
            byte[] var14 = new byte[var13];
            class127.field2221[var10] = var14;
            byte[] var15 = new byte[var13];
            class69.field1364[var10] = var15;
            boolean var16 = false;
            int var17 = var2.method316((byte) -101);
            if ((var17 & 0x1) == 0) {
                for (int var23 = 0; var23 < var13; var23++) {
                    var14[var23] = var2.method325(89);
                }
                if ((var17 & 0x2) != 0) {
                    for (int var24 = 0; var24 < var13; var24++) {
                        byte var25 = var15[var24] = var2.method325(-103);
                        var16 |= var25 != -1;
                    }
                }
            } else {
                int var18 = 0;
                label88: while (true) {
                    if (var12 <= var18) {
                        if ((var17 & 0x2) == 0) {
                            break;
                        }
                        int var19 = 0;
                        while (true) {
                            if (var19 >= var12) {
                                break label88;
                            }
                            for (int var20 = 0; var20 < var11; var20++) {
                                byte var21 = var15[var12 * var20 + var19] = var2.method325(51);
                                var16 |= var21 != -1;
                            }
                            var19++;
                        }
                    }
                    for (int var22 = 0; var22 < var11; var22++) {
                        var14[var12 * var22 + var18] = var2.method325(-117);
                    }
                    var18++;
                }
            }
            class124.field2184[var10] = var16;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)Lmb;")
    public final class157 method1191(int arg0) {
        field3008++;
        if (this.field3005 == null) {
            return null;
        }
        class157[] var2 = new class157[this.field3005.length];
        if (arg0 != 2) {
            this.field3000 = null;
        }
        for (int var3 = 0; var3 < this.field3005.length; var3++) {
            var2[var3] = class157.method1116(class242.field4254, this.field3005[var3], 0);
        }
        class157 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class157(var2, var2.length);
        }
        if (this.field3012 != null) {
            for (int var5 = 0; var5 < this.field3012.length; var5++) {
                var4.method1092(this.field3012[var5], this.field3000[var5]);
            }
        }
        if (this.field3011 != null) {
            for (int var6 = 0; var6 < this.field3011.length; var6++) {
                var4.method1099(this.field3011[var6], this.field2996[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)Lmd;")
    public static final class212 method1192(int arg0, int arg1, int arg2) {
        class35 var3 = class274.field4775[arg0][arg1][arg2];
        return var3 == null ? null : var3.field749;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)Z")
    public final boolean method1193(boolean arg0) {
        field3001++;
        if (this.field3005 == null) {
            return true;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < this.field3005.length; var3++) {
            if (!class242.field4254.method1634(this.field3005[var3], 0, false)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V")
    public static final void method1194(int arg0) {
        field3003++;
        try {
            if (arg0 <= 66) {
                method1194(44);
            }
            if (class41.field930 == 1) {
                int var1 = class115.field2020.method1846((byte) -107);
                if (var1 > 0 && class115.field2020.method1863(-10375)) {
                    int var2 = var1 - class43.field953;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class115.field2020.method1869(var2, 25835);
                } else {
                    class115.field2020.method1834(-26608);
                    class115.field2020.method1864(-14941);
                    class177.field3111 = null;
                    class95.field1688 = null;
                    if (class55.field1144 == null) {
                        class41.field930 = 0;
                    } else {
                        class41.field930 = 2;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class115.field2020.method1834(-26608);
            class95.field1688 = null;
            class55.field1144 = null;
            class177.field3111 = null;
            class41.field930 = 0;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 != 18353) {
            method1189(45, (class239) null);
        }
        field3007++;
        for (int var9 = 0; var9 < class77.field1449.field1000; var9++) {
            int var10 = class77.field1449.field1007[var9] - class202.field3466;
            int var11 = (arg6 - arg3) * (var10 - arg7) / (arg4 - arg7) + arg3;
            int var12 = class17.field296 - (class77.field1449.field987[var9] - (class115.field2017 - 1));
            int var13 = 16777215;
            int var14 = (arg0 - arg8) * (var12 - arg5) / (arg2 - arg5) + arg8;
            int var15 = class77.field1449.method427(true, var9);
            class86 var16 = null;
            if (var15 == 0) {
                if ((double) class169.field2966 == 3.0D) {
                    var16 = class17.field302;
                }
                if ((double) class169.field2966 == 4.0D) {
                    var16 = class100.field1777;
                }
                if ((double) class169.field2966 == 6.0D) {
                    var16 = class196.field3415;
                }
                if ((double) class169.field2966 == 8.0D) {
                    var16 = class247.field4305;
                }
            }
            if (var15 == 1) {
                if ((double) class169.field2966 == 3.0D) {
                    var16 = class196.field3415;
                }
                if ((double) class169.field2966 == 4.0D) {
                    var16 = class247.field4305;
                }
                if ((double) class169.field2966 == 6.0D) {
                    var16 = class11.field199;
                }
                if ((double) class169.field2966 == 8.0D) {
                    var16 = class163.field2907;
                }
            }
            if (var15 == 2) {
                var13 = 16755200;
                if ((double) class169.field2966 == 3.0D) {
                    var16 = class11.field199;
                }
                if ((double) class169.field2966 == 4.0D) {
                    var16 = class163.field2907;
                }
                if ((double) class169.field2966 == 6.0D) {
                    var16 = class151.field2684;
                }
                if ((double) class169.field2966 == 8.0D) {
                    var16 = class128.field2251;
                }
            }
            if (class77.field1449.field1001[var9] != -1) {
                var13 = class77.field1449.field1001[var9];
            }
            if (var16 != null) {
                class237[] var17 = new class237[class77.field1449.field1002[var9].method1582(60, (byte) -96) + 1];
                class96.field1708.method1340(class77.field1449.field1002[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var14 - (var18 - 1) * var16.method660() / 2;
                int var20 = var19 + var16.method654() / 2;
                for (int var21 = 0; var21 < var18; var21++) {
                    class237 var22 = var18 - 1 == var21 ? var17[var21] : var17[var21].method1620(107, var17[var21].method1588(false) - 4, 0);
                    var16.method652(var22, var11, var20, var13, true);
                    var20 += var16.method660();
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)Z")
    public final boolean method1196(int arg0) {
        field2999++;
        boolean var2 = true;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field2991[var3] != -1 && !class242.field4254.method1634(this.field2991[var3], 0, false)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V")
    public static void method1197(int arg0) {
        field3014 = null;
        field2998 = null;
        field2992 = null;
        field2995 = null;
        field2993 = null;
        if (arg0 != 1689) {
            method1195(32, -25, 52, -2, -37, 76, 41, -100, 40);
        }
    }

    @OriginalMember(owner = "client!di", name = "e", descriptor = "(I)Lmb;")
    public final class157 method1198(int arg0) {
        field3009++;
        class157[] var2 = new class157[5];
        if (arg0 != 25771) {
            field3014 = null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2991[var4] != -1) {
                var2[var3++] = class157.method1116(class242.field4254, this.field2991[var4], 0);
            }
        }
        class157 var5 = new class157(var2, var3);
        if (this.field3012 != null) {
            for (int var6 = 0; var6 < this.field3012.length; var6++) {
                var5.method1092(this.field3012[var6], this.field3000[var6]);
            }
        }
        if (this.field3011 != null) {
            for (int var7 = 0; var7 < this.field3011.length; var7++) {
                var5.method1099(this.field3011[var7], this.field2996[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lie;Z)V")
    public final void method1199(class32 arg0, boolean arg1) {
        field2994++;
        while (true) {
            int var3 = arg0.method316((byte) 107);
            if (var3 == 0) {
                if (arg1) {
                    return;
                } else {
                    this.method1198(100);
                    return;
                }
            }
            this.method1188(var3, 60, arg0);
        }
    }
}
