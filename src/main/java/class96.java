import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class96 {

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!qu", name = "j", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!qu", name = "k", descriptor = "I")
    public static int field1660;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qu", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field1661;

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1652;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lud;B[B)V")
    public final void method864(class35 arg0, byte arg1, byte[] arg2) {
        if (arg1 >= -82) {
            method870(-54, null);
        }
        field1651++;
        if (arg0.field483[arg0.field469] != 31 || arg0.field483[arg0.field469 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1652 == null) {
            this.field1652 = new Inflater(true);
        }
        try {
            this.field1652.setInput(arg0.field483, arg0.field469 + 10, -8 - arg0.field469 + -10 + arg0.field483.length);
            this.field1652.inflate(arg2);
        } catch (Exception var4) {
            this.field1652.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1652.reset();
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method865(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field1653++;
        if (arg7 != 101) {
            method867(-79, -105, 40);
        }
        int var8 = arg1 - arg5;
        int var9 = arg6 + arg5;
        for (int var10 = arg6; var10 < var9; var10++) {
            class399.method2472(27113, arg3, arg0, arg2, class329.field4651[var10]);
        }
        for (int var11 = arg1; var11 > var8; var11--) {
            class399.method2472(27113, arg3, arg0, arg2, class329.field4651[var11]);
        }
        int var12 = arg0 - arg5;
        int var13 = arg3 + arg5;
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class329.field4651[var14];
            class399.method2472(27113, arg3, var13, arg2, var15);
            class399.method2472(27113, var13, var12, arg4, var15);
            class399.method2472(27113, var12, arg0, arg2, var15);
        }
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V")
    public class96() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZII)I")
    public static final int method866(int arg0, boolean arg1, int arg2, int arg3) {
        field1655++;
        int var4 = arg0 / arg2;
        int var5 = arg2 - 1 & arg0;
        int var6 = arg3 / arg2;
        int var7 = arg3 & arg2 - 1;
        int var8 = class319.method2048((byte) 37, var4, var6);
        int var9 = class319.method2048((byte) 37, var4 + 1, var6);
        int var10 = class319.method2048((byte) 37, var4, var6 + 1);
        if (arg1) {
            return -73;
        } else {
            int var11 = class319.method2048((byte) 37, var4 + 1, var6 + 1);
            int var12 = class351.method2207(var8, arg2, var9, -23, var5);
            int var13 = class351.method2207(var10, arg2, var11, -23, var5);
            return class351.method2207(var12, arg2, var13, -23, var7);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(III)V")
    public static final void method867(int arg0, int arg1, int arg2) {
        class198.field2843 = arg0;
        field1656++;
        if (arg1 != 1) {
            method871(null, -13, -38, -4, -77, null, 86, -62, null);
        }
        class546.field7700 = arg2;
        if (class435.field6079 == 0) {
            class575.field8149 = class700.field9834 * 2 + class546.field7700;
            class584.field8240 = class198.field2843 + (class685.field9658 * 2);
        } else if (class435.field6079 == 1) {
            class63.field1151 = class546.field7700 / class208.field2997 + class130.field1949 + 2;
            class688.field9694 = class198.field2843 / class653.field9197 + class457.field6603 + 2;
            class575.field8149 = class63.field1151 * class208.field2997;
            class584.field8240 = class688.field9694 * class653.field9197;
            class685.field9658 = class584.field8240 - class198.field2843 >> 1;
            class700.field9834 = class575.field8149 - class546.field7700 >> 1;
        } else if (class435.field6079 == 2) {
            class584.field8240 = class198.field2843;
            class575.field8149 = class546.field7700;
            return;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Ljava/lang/String;IZIZLjava/lang/String;I)V")
    public static final void method868(String arg0, int arg1, boolean arg2, int arg3, boolean arg4, String arg5, int arg6) {
        class136.field2119.field3022 = 1;
        field1658++;
        String var7 = arg5.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (arg1 != -1) {
            class513 var11 = class285.field4042.method2993(arg1, (byte) 80);
            if (var11 == null || var11.method3063((byte) -93) != arg2) {
                return;
            }
            if (var11.method3063((byte) -90)) {
                var10 = var11.field7320;
            } else {
                var9 = var11.field7315;
            }
        }
        int var12 = 0;
        for (int var13 = 0; var13 < class558.field7942.field1260; var13++) {
            class253 var16 = class558.field7942.method721(-31, var13);
            if ((!arg4 || var16.field3669) && var16.field3619 == -1 && var16.field3640 == -1 && var16.field3674 == 0 && var16.field3644.toLowerCase().indexOf(var7) != -1) {
                if (arg1 != -1) {
                    if (arg2) {
                        if (!arg0.equals(var16.method1720(11, var10, arg1))) {
                            continue;
                        }
                    } else if (var16.method1726(-26242, arg1, var9) != arg6) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    class330.field4657 = null;
                    class525.field7465 = -1;
                    return;
                }
                if (var8.length <= var12) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; var18 < var12; var18++) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        class525.field7465 = var12;
        class271.field3882 = 0;
        class330.field4657 = var8;
        String[] var14 = new String[class525.field7465];
        if (arg3 >= -23) {
            return;
        }
        for (int var15 = 0; var15 < class525.field7465; var15++) {
            var14[var15] = class558.field7942.method721(124, var8[var15]).field3644;
        }
        class426.method2592((byte) 65, class330.field4657, var14);
        class136.field2119.method1464((byte) 67);
        class136.field2119.field3022 = 2;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I[B)[B")
    public final byte[] method869(int arg0, byte[] arg1) {
        field1659++;
        class35 var3 = new class35(arg1);
        var3.field469 = arg1.length - 4;
        if (arg0 != 14723) {
            return null;
        }
        int var4 = var3.method247(false);
        var3.field469 = 0;
        byte[] var5 = new byte[var4];
        this.method864(var3, (byte) -96, var5);
        return var5;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method870(int arg0, String arg1) {
        field1654++;
        if (arg0 != 0) {
            method866(-40, true, -23, 116);
        }
        return class86.method815(arg0 ^ 0x7, arg1, field1661 == null ? (field1661 = method873("dca")) : field1661);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Laa;IIIILdm;IILha;)V")
    public static final void method871(class484 arg0, int arg1, int arg2, int arg3, int arg4, class50 arg5, int arg6, int arg7, class58 arg8) {
        if (arg1 != -2) {
            method871(null, -87, -58, -105, -27, null, 40, 23, null);
        }
        field1650++;
        class524 var9 = class399.field5581.method2641(arg2, 111);
        if (var9 == null || !var9.field7413 || !var9.method3108(class742.field10408, 0)) {
            return;
        }
        if (var9.field7440 != null) {
            int[] var10 = new int[var9.field7440.length];
            for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                int var28;
                if (class666.field9338 == 4) {
                    var28 = (int) class321.field4568 & 0x3FFF;
                } else {
                    var28 = (int) class321.field4568 + class440.field6138 & 0x3FFF;
                }
                int var29 = class316.field4487[var28];
                int var30 = class316.field4490[var28];
                if (class666.field9338 != 4) {
                    var29 = var29 * 256 / (class113.field1812 + 256);
                    var30 = var30 * 256 / (class113.field1812 + 256);
                }
                var10[var11 * 2] = ((var9.field7440[var11 * 2 + 1] * 4 + arg6) * var29 + ((var9.field7440[var11 * 2] * 4 + arg3) * var30) >> 14) + arg5.field783 / 2 + arg7;
                var10[var11 * 2 + 1] = arg5.field830 / 2 + arg4 - ((arg6 + (var9.field7440[var11 * 2 + 1] * 4)) * var30 - (var9.field7440[var11 * 2] * 4 + arg3) * var29 >> 14);
            }
            class207.method1445(arg8, var10, var9.field7430, arg5.field827, arg5.field778);
            if (var9.field7417 > 0) {
                for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                    int var20 = var10[var12 * 2];
                    int var21 = var10[var12 * 2 + 1];
                    int var22 = var10[(var12 + 1) * 2];
                    int var23 = var10[var12 * 2 + 2 + 1];
                    if (var20 > var22) {
                        int var25 = var20;
                        int var26 = var21;
                        var20 = var22;
                        var21 = var23;
                        var22 = var25;
                        var23 = var26;
                    } else if (var20 == var22 && var21 > var23) {
                        int var24 = var21;
                        var21 = var23;
                        var23 = var24;
                    }
                    arg8.method526(var20, var21, var22, var23, var9.field7421[var9.field7438[var12] & 0xFF], 1, arg0, arg7, arg4, var9.field7417, var9.field7450, var9.field7416);
                }
                int var13 = var10[var10.length - 2];
                int var14 = var10[var10.length - 1];
                int var15 = var10[0];
                int var16 = var10[1];
                if (var13 > var15) {
                    int var17 = var13;
                    int var18 = var14;
                    var13 = var15;
                    var14 = var16;
                    var15 = var17;
                    var16 = var18;
                } else if (var13 == var15 && var16 < var14) {
                    int var19 = var14;
                    var14 = var16;
                    var16 = var19;
                }
                arg8.method526(var13, var14, var15, var16, var9.field7421[var9.field7438[var9.field7438.length - 1] & 0xFF], 1, arg0, arg7, arg4, var9.field7417, var9.field7450, var9.field7416);
            } else {
                for (int var27 = 0; var27 < (var10.length / 2 - 1); var27++) {
                    arg8.method588(var10[var27 * 2], var10[var27 * 2 + 1], var10[var27 * 2 + 2], var10[(var27 + 1) * 2 + 1], var9.field7421[var9.field7438[var27] & 0xFF], 1, arg0, arg7, arg4);
                }
                arg8.method588(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field7421[var9.field7438[var9.field7438.length - 1] & 0xFF], 1, arg0, arg7, arg4);
            }
        }
        class743 var31 = null;
        if (var9.field7434 != -1) {
            var31 = var9.method3104(false, arg1 + 90, arg8);
            if (var31 != null) {
                class43.method392(arg7, arg4, arg5, var31, (byte) 111, arg3, arg6, arg0);
            }
        }
        if (var9.field7425 == null) {
            return;
        }
        int var32 = 0;
        if (var31 != null) {
            var32 = var31.method95();
        }
        class59 var33 = class242.field3393;
        class323 var34 = class119.field1867;
        if (var9.field7457 == 1) {
            var33 = class722.field10090;
            var34 = class436.field6100;
        }
        if (var9.field7457 == 2) {
            var34 = class419.field5896;
            var33 = class537.field7568;
        }
        class237.method1605(arg6, var33, arg3, arg5, arg4, arg7, var9.field7425, (byte) -57, var32, var34, var9.field7452, arg0);
        return;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V")
    public static final void method872(byte arg0) {
        field1660++;
        if (class476.field6812 == null) {
            return;
        }
        try {
            int var1 = -54 / ((arg0 - 20) / 40);
            String var2 = class476.field6812.getParameter("cookiehost");
            int var3 = (int) (class742.method4128(1) / 86400000L) - 11745;
            String var4 = "usrdob=" + var3 + "; version=1; path=/; domain=" + var2;
            class101.method891(28521, class476.field6812, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(III)V")
    private class96(int arg0, int arg1, int arg2) {
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method873(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
