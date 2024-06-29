import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class299 {

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public int field3872 = 128;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public int field3889 = 128;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public int field3874;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public int field3884;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public int field3878;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public int field3879;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field3883 = -1;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "J")
    public static long field3888 = 0L;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field3876 = 0;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "Ldn;")
    public static class201 field3880;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Lsj;")
    public static class502 field3873;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ub", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field3890;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1798(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILjava/lang/String;[BII)I", line = 8)
    public static final int method1791(int arg0, int arg1, String arg2, byte[] arg3, int arg4, int arg5) {
        field3877++;
        int var6 = arg1 - arg5;
        int var7 = 0;
        if (arg4 <= 10) {
            method1797();
        }
        while (var7 < var6) {
            char var8 = arg2.charAt(arg5 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg3[arg0 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg3[arg0 + var7] = -128;
            } else if (var8 == '‚') {
                arg3[arg0 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg3[arg0 + var7] = -125;
            } else if (var8 == '„') {
                arg3[arg0 + var7] = -124;
            } else if (var8 == '…') {
                arg3[arg0 + var7] = -123;
            } else if (var8 == '†') {
                arg3[arg0 + var7] = -122;
            } else if (var8 == '‡') {
                arg3[arg0 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg3[arg0 + var7] = -120;
            } else if (var8 == '‰') {
                arg3[arg0 + var7] = -119;
            } else if (var8 == 'Š') {
                arg3[arg0 + var7] = -118;
            } else if (var8 == '‹') {
                arg3[arg0 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg3[arg0 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg3[arg0 + var7] = -114;
            } else if (var8 == '‘') {
                arg3[arg0 + var7] = -111;
            } else if (var8 == '’') {
                arg3[arg0 + var7] = -110;
            } else if (var8 == '“') {
                arg3[arg0 + var7] = -109;
            } else if (var8 == '”') {
                arg3[arg0 + var7] = -108;
            } else if (var8 == '•') {
                arg3[arg0 + var7] = -107;
            } else if (var8 == '–') {
                arg3[arg0 + var7] = -106;
            } else if (var8 == '—') {
                arg3[arg0 + var7] = -105;
            } else if (var8 == '˜') {
                arg3[arg0 + var7] = -104;
            } else if (var8 == '™') {
                arg3[arg0 + var7] = -103;
            } else if (var8 == 'š') {
                arg3[arg0 + var7] = -102;
            } else if (var8 == '›') {
                arg3[arg0 + var7] = -101;
            } else if (var8 == 'œ') {
                arg3[arg0 + var7] = -100;
            } else if (var8 == 'ž') {
                arg3[arg0 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg3[arg0 + var7] = -97;
            } else {
                arg3[arg0 + var7] = 63;
            }
            var7++;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 151)
    public static void method1792(int arg0) {
        int var1 = 59 / ((33 - arg0) / 57);
        field3880 = null;
        field3873 = null;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(I)V", line = 270)
    public class299(int arg0) {
        this.field3874 = arg0;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(IIIIII)V", line = 280)
    private class299(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3872 = arg1;
        this.field3884 = arg4;
        this.field3878 = arg3;
        this.field3879 = arg5;
        this.field3889 = arg2;
        this.field3874 = arg0;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V", line = 165)
    public static final void method1793(byte arg0) {
        field3875++;
        class38 var1 = null;
        try {
            class277 var2 = class172.field2221.method2629("2", false);
            while (var2.field3542 == 0) {
                class463.method2773(1L, -116);
            }
            if (var2.field3542 == 1) {
                var1 = (class38) var2.field3541;
                byte[] var3 = new byte[(int) var1.method241(-122)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method244(var4, var3.length - var4, var3, -35);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class81.method462(-306674912, new class88(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method243(0);
            }
            if (arg0 < 123) {
                field3873 = null;
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)Lub;", line = 215)
    public final class299 method1794(int arg0) {
        field3882++;
        return arg0 < 19 ? null : new class299(this.field3874, this.field3872, this.field3889, this.field3878, this.field3884, this.field3879);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BC)Z", line = 226)
    public static final boolean method1795(byte arg0, char arg1) {
        if (arg0 != -109) {
            method1795((byte) -113, (char) 65525);
        }
        field3881++;
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILub;)V", line = 237)
    public final void method1796(int arg0, class299 arg1) {
        if (arg0 != -161) {
            method1797();
        }
        this.field3879 = arg1.field3879;
        field3886++;
        this.field3872 = arg1.field3872;
        this.field3874 = arg1.field3874;
        this.field3889 = arg1.field3889;
        this.field3884 = arg1.field3884;
        this.field3878 = arg1.field3878;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "()V", line = 295)
    public static final void method1797() {
        for (int var0 = 0; var0 < class278.field3564; var0++) {
            if (!class301.field3903[var0]) {
                class86 var1 = class121.field1683[var0];
                class182 var2 = var1.field1155;
                int var3 = var1.field1158;
                int var4 = var2.method1194(true) - class477.field6971;
                int var5 = (var4 * 2 >> class169.field2206) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method1203((byte) -76) - var4 >> class169.field2206;
                int var9 = var2.method1202((byte) -104) - var4 >> class169.field2206;
                int var10 = var2.method1202((byte) -59) + var4 >> class169.field2206;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class13.field230) {
                    var10 = class13.field230 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field1160[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class166.field2155) {
                        var16 = class166.field2155 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class448 var19 = class346.method2038(var3, var17, var11, field3890 == null ? (field3890 = method1798("oh")) : field3890);
                        if (var19 != null && var19.field6232 != 0) {
                            if (var19.field6232 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field1160[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field1160[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field1160[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field1160[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class301.field3903[var0] = true;
                class92.field1285[var3].method1186(var2, var7);
            }
        }
    }
}
