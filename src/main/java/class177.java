import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public abstract class class177 {

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public int field2839;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public int field2841;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public int field2847;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)Z", line = 8)
    public final boolean method1391(byte arg0) {
        int var2 = -106 / ((arg0 - 42) / 47);
        field2837++;
        return (this.field2839 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)Z", line = 19)
    public final boolean method1392(int arg0) {
        field2842++;
        if (arg0 != 238) {
            this.field2839 = -62;
        }
        return (this.field2839 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)Z", line = 33)
    public final boolean method1393(byte arg0) {
        field2846++;
        if (arg0 == 61) {
            return (this.field2839 & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IBIII)V", line = 44)
    public static final void method1394(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -73) {
            method1396(false, (byte[]) null);
        }
        field2845++;
        if (arg2 >= arg4) {
            for (int var5 = arg4; var5 < arg2; var5++) {
                class353.field5599[var5][arg3] = arg0;
            }
        } else {
            for (int var6 = arg2; var6 < arg4; var6++) {
                class353.field5599[var6][arg3] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)Lim;", line = 80)
    public static final class201 method1395(int arg0) {
        field2843++;
        if (class258.field4324 >= class118.field1999.length) {
            return arg0 == 24 ? null : (class201) null;
        } else {
            return class118.field1999[class258.field4324++];
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z[B)[B", line = 101)
    public static final byte[] method1396(boolean arg0, byte[] arg1) {
        if (arg0) {
            return (byte[]) null;
        }
        field2840++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class242.method1841(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)Z", line = 116)
    public final boolean method1397(byte arg0) {
        field2844++;
        if (arg0 >= -85) {
            this.field2839 = 126;
        }
        return (this.field2839 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 131)
    public static final byte[] method1398(int arg0, String arg1) {
        field2835++;
        int var2 = arg1.length();
        if (arg0 != -14084) {
            method1400((byte) 97, 110);
        }
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)Llb;", line = 269)
    public static final class341 method1399(boolean arg0) {
        if (arg0) {
            field2838++;
            class341 var1 = new class341(class164.field2595, class318.field5070, class189.field3035[0], class19.field211[0], class221.field3595[0], class322.field5132[0], class163.field2578[0], class121.field2026);
            class211.method1592((byte) 41);
            return var1;
        } else {
            return (class341) null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)Z", line = 284)
    public static final boolean method1400(byte arg0, int arg1) {
        if (arg0 <= 73) {
            method1396(true, (byte[]) null);
        }
        byte var2 = 0;
        field2834++;
        byte var3 = 0;
        if (class255.field4300 == null) {
            if (class42.field607 || class190.field3046 == null) {
                class255.field4300 = new class351(512, 512);
            } else {
                class255.field4300 = (class351) class190.field3046;
            }
            int[] var4 = class255.field4300.field5571;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; var7 < 104 - var3 - 1; var7++) {
                int var8 = (var3 + 103 - var7) * 4 * 512 + 24628;
                for (int var9 = var2 + 1; var9 < (104 - var2 - 1); var9++) {
                    if ((class178.field2856[arg1][var9][var7] & 0x18) == 0) {
                        class49.method388(var4, var8, 512, arg1, var9, var7);
                    }
                    if (arg1 < 3 && (class178.field2856[arg1 + 1][var9][var7] & 0x8) != 0) {
                        class49.method388(var4, var8, 512, arg1 + 1, var9, var7);
                    }
                    var8 += 4;
                }
            }
            class232.field3856 = 0;
            for (int var10 = 0; var10 < 104; var10++) {
                for (int var11 = 0; var11 < 104; var11++) {
                    long var12 = class117.method922(arg1, var2 + var10, var3 + var11);
                    if (var12 == 0L) {
                        var12 = class1.method1(arg1, var2 + var10, var3 + var11);
                    }
                    if (var12 == 0L) {
                        var12 = class252.method1955(arg1, var2 + var10, var3 + var11);
                    }
                    if (var12 == 0L) {
                        var12 = class64.method555(arg1, var10 + var2, var3 + var11);
                    }
                    if (var12 != 0L) {
                        class29 var14 = class166.method1292(0, (int) (var12 >>> 32) & Integer.MAX_VALUE);
                        if (!var14.field364 || class286.field4661) {
                            int var15 = var14.field388;
                            if (var14.field418 != null) {
                                for (int var16 = 0; var16 < var14.field418.length; var16++) {
                                    if (var14.field418[var16] != -1) {
                                        class29 var17 = class166.method1292(0, var14.field418[var16]);
                                        if (var17.field388 >= 0) {
                                            var15 = var17.field388;
                                        }
                                    }
                                }
                            }
                            if (var15 >= 0) {
                                boolean var18 = false;
                                int var19 = var10 + var2;
                                class213 var20 = class169.method1315(var15, 62);
                                if (var20 != null && var20.field3414) {
                                    var18 = true;
                                }
                                int var21 = var3 + var11;
                                if (var18) {
                                    int[][] var22 = class32.field459[arg1].field266;
                                    for (int var23 = 0; var23 < 10; var23++) {
                                        int var24 = (int) (Math.random() * 4.0D);
                                        if (var24 == 0 && var19 > 0 && var19 > (var10 - 3) && (var22[var19 - 1][var21] & 0x2C0108) == 0) {
                                            var19--;
                                        }
                                        if (var24 == 1 && var19 < 103 && var19 < var10 + 3 && (var22[var19 + 1][var21] & 0x2C0180) == 0) {
                                            var19++;
                                        }
                                        if (var24 == 2 && var21 > 0 && var21 > (var11 - 3) && (var22[var19][var21 - 1] & 0x2C0102) == 0) {
                                            var21--;
                                        }
                                        if (var24 == 3 && var21 < 103 && var11 + 3 > var21 && (var22[var19][var21 + 1] & 0x2C0120) == 0) {
                                            var21++;
                                        }
                                    }
                                }
                                class25.field311[class232.field3856] = var14.field417;
                                class340.field5431[class232.field3856] = var19 - var2;
                                class216.field3454[class232.field3856] = var21 - var3;
                                class232.field3856++;
                            }
                        }
                    }
                }
            }
        }
        int var25 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 228;
        class255.field4300.method2472();
        int var26 = ((int) (Math.random() * 20.0D)) + 238 - 10 << 16;
        for (int var27 = 1; var27 < 103; var27++) {
            for (int var28 = 1; var28 < 103; var28++) {
                if ((class178.field2856[arg1][var2 + var28][var3 + var27] & 0x18) == 0 && !class350.method2468(var2, arg1, var26, 2047, var28, var3, var25, var27)) {
                    if (class42.field607) {
                        class246.field4036 = null;
                    } else {
                        class292.field4728.method2415(-1);
                    }
                    return false;
                }
                if (arg1 < 3 && (class178.field2856[arg1 + 1][var2 + var28][var3 + var27] & 0x8) != 0 && !class350.method2468(var2, arg1 + 1, var26, 2047, var28, var3, var25, var27)) {
                    if (class42.field607) {
                        class246.field4036 = null;
                    } else {
                        class292.field4728.method2415(-1);
                    }
                    return false;
                }
            }
        }
        if (class42.field607) {
            int[] var29 = class255.field4300.field5571;
            int var30 = var29.length;
            for (int var31 = 0; var31 < var30; var31++) {
                if (var29[var31] == 0) {
                    var29[var31] = 1;
                }
            }
            class190.field3046 = new class58(class255.field4300);
        } else {
            class190.field3046 = class255.field4300;
        }
        if (class42.field607) {
            class246.field4036 = null;
        } else {
            class292.field4728.method2415(-1);
        }
        class255.field4300 = null;
        return true;
    }
}
