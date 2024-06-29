import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aka")
public class class86 extends class206 {

    @OriginalMember(owner = "client!aka", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field972 = new String[] { method730(method729("v|\u001963?")), method730(method729("v|\u001960?")), method730(method729("l9V6\u000f")), method730(method729("v|\u001961?")), method730(method729("yb\u0014t")) };

    @OriginalMember(owner = "client!aka", name = "r", descriptor = "I")
    public static int field958 = 0;

    @OriginalMember(owner = "client!aka", name = "n", descriptor = "[I")
    public static int[] field962 = new int[1];

    @OriginalMember(owner = "client!aka", name = "w", descriptor = "I")
    public int field956;

    @OriginalMember(owner = "client!aka", name = "s", descriptor = "I")
    public int field961;

    @OriginalMember(owner = "client!aka", name = "x", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!aka", name = "v", descriptor = "I")
    public int field965;

    @OriginalMember(owner = "client!aka", name = "q", descriptor = "I")
    public int field966;

    @OriginalMember(owner = "client!aka", name = "t", descriptor = "I")
    public int field968;

    @OriginalMember(owner = "client!aka", name = "m", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!aka", name = "o", descriptor = "I")
    public int field971;

    @OriginalMember(owner = "client!aka", name = "u", descriptor = "Lcn;")
    public class541 field959;

    @OriginalMember(owner = "client!aka", name = "y", descriptor = "Lcn;")
    public class541 field970;

    @OriginalMember(owner = "client!aka", name = "k", descriptor = "Ljava/lang/String;")
    public String field967;

    @OriginalMember(owner = "client!aka", name = "p", descriptor = "Z")
    public boolean field963;

    @OriginalMember(owner = "client!aka", name = "j", descriptor = "[I")
    public static int[] field960;

    @OriginalMember(owner = "client!aka", name = "l", descriptor = "[Ljava/lang/Object;")
    public Object[] field957;

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(B)V", line = 12)
    public static void method726(byte arg0) {
        try {
            field960 = null;
            if (arg0 < 123) {
                field962 = null;
            }
            field962 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field972[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(IBIIII[B)V", line = 28)
    public static final void method727(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        try {
            field969++;
            int var7 = -66 / ((arg1 - 12) / 63);
            if (arg3 > 0 && !class40.method269(arg3, 116)) {
                throw new IllegalArgumentException("");
            } else if (arg5 <= 0 || class40.method269(arg5, 104)) {
                int var8 = class673.method4947(arg0, true);
                int var9 = 0;
                int var10 = arg3 < arg5 ? arg3 : arg5;
                int var11 = arg3 >> 1;
                int var12 = arg5 >> 1;
                byte[] var13 = arg6;
                byte[] var14 = new byte[var8 * var11 * var12];
                while (true) {
                    OpenGL.glTexImage2Dub(arg4, var9, arg2, arg3, arg5, 0, arg0, 5121, var13, 0);
                    if (var10 <= 1) {
                        return;
                    }
                    int var15 = arg3 * var8;
                    for (int var16 = 0; var16 < var8; var16++) {
                        int var17 = var16;
                        int var18 = var16;
                        int var19 = var15 + var16;
                        for (int var20 = 0; var20 < var12; var20++) {
                            for (int var21 = 0; var21 < var11; var21++) {
                                byte var22 = var13[var18];
                                int var23 = var8 + var18;
                                int var24 = var13[var23] + var22;
                                int var25 = var13[var19] + var24;
                                var18 = var8 + var23;
                                int var26 = var8 + var19;
                                int var27 = var13[var26] + var25;
                                var14[var17] = (byte) (var27 >> 2);
                                var19 = var8 + var26;
                                var17 += var8;
                            }
                            var19 += var15;
                            var18 += var15;
                        }
                    }
                    byte[] var28 = var14;
                    var14 = var13;
                    arg3 = var11;
                    arg5 = var12;
                    var13 = var28;
                    var9++;
                    var11 >>= 0x1;
                    var10 >>= 0x1;
                    var12 >>= 0x1;
                }
            } else {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var30) {
            throw class759.method5498(var30, field972[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field972[4] : field972[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(IB)V", line = 123)
    public static final void method728(int arg0, byte arg1) {
        try {
            field964++;
            if (class138.field1645 != arg0) {
                if (arg1 != -96) {
                    method727(30, (byte) 84, 124, -70, -34, 74, null);
                }
                if (arg0 == 13) {
                    class245.method2084((byte) 122);
                }
                if (arg0 != 13 && class354.field5455 != null) {
                    class354.field5455.method2700((byte) 98);
                    class354.field5455 = null;
                }
                if (arg0 == 3) {
                    class298.method2517(16384, class742.field10801 != class461.field6733);
                }
                if (arg0 == 7) {
                    class755.method5483(34, class9.field89 != class742.field10801);
                }
                if (arg0 == 5 || arg0 == 12) {
                    class592.method4410(-63);
                } else if (arg0 == 6 || arg0 == 9) {
                    class245.method2084((byte) 120);
                }
                if (class432.method3310(class138.field1645, 256)) {
                    class669.field9714.field6927 = 2;
                    class489.field7024.field6927 = 2;
                    class234.field3531.field6927 = 2;
                    class137.field1631.field6927 = 2;
                    class411.field6075.field6927 = 2;
                    class604.field8851.field6927 = 2;
                    class122.field1440.field6927 = 2;
                }
                if (class432.method3310(arg0, 256)) {
                    class117.field1395 = 0;
                    class316.field4997 = 1;
                    class184.field2540 = 1;
                    class229.field3484 = 0;
                    class225.field3447 = 0;
                    class123.method1069(true, false);
                    class669.field9714.field6927 = 1;
                    class489.field7024.field6927 = 1;
                    class234.field3531.field6927 = 1;
                    class137.field1631.field6927 = 1;
                    class411.field6075.field6927 = 1;
                    class604.field8851.field6927 = 1;
                    class122.field1440.field6927 = 1;
                }
                if (arg0 == 11 || arg0 == 3) {
                    class706.method5161((byte) 121);
                }
                boolean var2 = arg0 == 2 || class197.method1677((byte) 52, arg0) || class212.method1866(4, arg0);
                boolean var3 = class138.field1645 == 2 || class197.method1677((byte) -108, class138.field1645) || class212.method1866(4, class138.field1645);
                if (var3 != var2) {
                    if (var2) {
                        class96.field1077 = class666.field9683;
                        if (class289.field4305.field817.method4492(false) == 0) {
                            class31.method208(2, 0);
                        } else {
                            class719.method5245(class666.field9683, 0, 1, class289.field4305.field817.method4492(false), 2, false, class232.field3503);
                            class297.method2506(arg1 ^ 0xFFFFFF5F);
                        }
                        class768.field11093.method1254((byte) 1, false);
                    } else {
                        class31.method208(2, 0);
                        class768.field11093.method1254((byte) 1, true);
                    }
                }
                if (class432.method3310(arg0, 256) || arg0 == 13) {
                    class610.field8913.method575();
                }
                class138.field1645 = arg0;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field972[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method729(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x72);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method730(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 23;
                    break;
                case 1:
                    var10005 = 23;
                    break;
                case 2:
                    var10005 = 120;
                    break;
                case 3:
                    var10005 = 24;
                    break;
                default:
                    var10005 = 114;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
