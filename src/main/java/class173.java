import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class173 {

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "[[I")
    private int[][] field2726;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    private int field2718;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    private int field2719;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "[Lbl;")
    public static class312[] field2716 = new class312[14];

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ICB)I", line = 5)
    public static final int method1276(int arg0, char arg1, byte arg2) {
        if (arg2 != 14) {
            method1278(53, -86, 67, -4, -36, 61, 66, -112);
        }
        field2722++;
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg1 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[B)[B", line = 29)
    public final byte[] method1277(int arg0, byte[] arg1) {
        field2721++;
        if (this.field2726 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field2719 / (long) this.field2718) + 14;
            int var4 = 0;
            int var5 = 0;
            int[] var6 = new int[var3];
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var8 = arg1[var7];
                int[] var9 = this.field2726[var5];
                for (int var10 = 0; var10 < 14; var10++) {
                    var6[var4 + var10] += var9[var10] * var8;
                }
                int var11 = this.field2719 + var5;
                int var12 = var11 / this.field2718;
                var5 = var11 - this.field2718 * var12;
                var4 += var12;
            }
            arg1 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var6[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg1[var13] = -128;
                } else if (var14 > 127) {
                    arg1[var13] = 127;
                } else {
                    arg1[var13] = (byte) var14;
                }
            }
        }
        if (arg0 != 0) {
            this.field2719 = -89;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIII)Z", line = 97)
    public static final boolean method1278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2720++;
        if (arg3 != -1024) {
            return true;
        }
        long var8 = class70.method540(arg7, arg2 + arg6, arg5 - -arg0);
        if (var8 != 0L) {
            int var10 = (int) var8 >> 20 & 0x3;
            int var11 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
            int var12 = (int) var8 >> 14 & 0x1F;
            class6 var13 = class28.method190(-117, var11);
            if (var13.field45 == -1) {
                int var14 = arg1;
                int[] var15 = class182.field2913;
                int var16 = (103 - arg5) * 2048 + ((arg2 * 4) + 24624);
                if (var8 > 0L) {
                    var14 = arg4;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 1) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 512 + 3] = var14;
                        var15[var16 + 1027] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    }
                }
                if (var12 == 3) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                    }
                }
                if (var12 == 2) {
                    if (var10 == 3) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 3 + 512] = var14;
                        var15[var16 + 1027] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    }
                }
            } else if (!class140.method1071(arg3 + 1028, arg0, var13, var10, arg5, arg6, arg2)) {
                return false;
            }
        }
        long var17 = class103.method799(arg7, arg2 + arg6, arg5 - -arg0);
        if (var17 != 0L) {
            int var19 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            int var20 = ((int) var17 & 0x3E7FDA) >> 20;
            int var21 = ((int) var17 & 0x7DD23) >> 14;
            class6 var22 = class28.method190(38, var19);
            if (var22.field45 == -1) {
                if (var21 == 9) {
                    int var23 = 15658734;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int[] var24 = class182.field2913;
                    int var25 = (52736 - (arg5 * 512)) * 4 + arg2 * 4 + 24624;
                    if (var20 == 0 || var20 == 2) {
                        var24[var25 + 1536] = var23;
                        var24[var25 + 1 + 1024] = var23;
                        var24[var25 + 512 + 2] = var23;
                        var24[var25 + 3] = var23;
                    } else {
                        var24[var25] = var23;
                        var24[var25 + 1 + 512] = var23;
                        var24[var25 + 1026] = var23;
                        var24[var25 + 3 + 1536] = var23;
                    }
                }
            } else if (!class140.method1071(4, arg0, var22, var20, arg5, arg6, arg2)) {
                return false;
            }
        }
        long var26 = class34.method239(arg7, arg2 + arg6, arg5 - -arg0);
        if (var26 != 0L) {
            int var28 = (int) var26 >> 20 & 0x3;
            int var29 = (int) (var26 >>> 32) & Integer.MAX_VALUE;
            class6 var30 = class28.method190(arg3 ^ 0xFFFFFC26, var29);
            if (var30.field45 != -1 && !class140.method1071(4, arg0, var30, var28, arg5, arg6, arg2)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V", line = 315)
    public static void method1279(byte arg0) {
        field2716 = null;
        if (arg0 != 35) {
            method1281(false, (Component) null);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)I", line = 334)
    public final int method1280(int arg0, int arg1) {
        if (this.field2726 != null) {
            arg1 = (int) ((long) this.field2719 * (long) arg1 / (long) this.field2718);
        }
        field2725++;
        if (arg0 != -1) {
            this.method1277(-52, (byte[]) null);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(II)V", line = 347)
    public class173(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class11.method101(arg0, true, arg1);
            int var4 = arg0 / var3;
            this.field2726 = new int[var4][14];
            int var5 = arg1 / var3;
            this.field2718 = var4;
            this.field2719 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field2726[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var11 > var10) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var8) * 3.141592653589793D;
                    if (-1.0E-4D > var16 || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLjava/awt/Component;)V", line = 408)
    public static final void method1281(boolean arg0, Component arg1) {
        arg1.addMouseListener(class114.field1862);
        arg1.addMouseMotionListener(class114.field1862);
        if (arg0) {
            method1281(true, (Component) null);
        }
        arg1.addFocusListener(class114.field1862);
        field2723++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;", line = 424)
    public static final String[] method1282(String[] arg0, int arg1) {
        field2717++;
        String[] var2 = new String[5];
        if (arg1 != 24624) {
            method1276(-123, '7', (byte) -41);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)I", line = 450)
    public final int method1283(byte arg0, int arg1) {
        field2724++;
        if (this.field2726 != null) {
            arg1 = (int) ((long) this.field2719 * (long) arg1 / (long) this.field2718) + 6;
        }
        int var3 = -119 / ((24 - arg0) / 51);
        return arg1;
    }
}
