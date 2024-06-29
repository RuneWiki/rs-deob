import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public abstract class class304 implements class329 {

    @OriginalMember(owner = "client!ft", name = "y", descriptor = "Lbba;")
    private class721 field3929 = class650.field8933;

    @OriginalMember(owner = "client!ft", name = "l", descriptor = "I")
    private int field3916;

    @OriginalMember(owner = "client!ft", name = "v", descriptor = "Lew;")
    public class240 field3926;

    @OriginalMember(owner = "client!ft", name = "q", descriptor = "Lck;")
    public class221 field3921;

    @OriginalMember(owner = "client!ft", name = "s", descriptor = "Lem;")
    public class610 field3923;

    @OriginalMember(owner = "client!ft", name = "w", descriptor = "Z")
    private boolean field3927;

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "I")
    public int field3911;

    @OriginalMember(owner = "client!ft", name = "p", descriptor = "I")
    private int field3920;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!ft", name = "j", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!ft", name = "k", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!ft", name = "m", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!ft", name = "n", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!ft", name = "o", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!ft", name = "r", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!ft", name = "t", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!ft", name = "u", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!ft", name = "x", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!ft", name = "z", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "Lnga;")
    public static class256 field3906;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "([IIIII)V")
    public final void method1785(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field3922++;
        if (arg2 > 0 && !class487.method2850((byte) 42, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg1 > 0 && !class487.method2850((byte) 82, arg1)) {
            throw new IllegalArgumentException("");
        } else if (class440.field6178 == this.field3923) {
            int var6 = 0;
            if (arg3 == 1) {
                int var7 = arg2 >= arg1 ? arg1 : arg2;
                int var8 = arg2 >> 1;
                int var9 = arg1 >> 1;
                int[] var10 = arg0;
                int[] var11 = new int[var8 * var9];
                while (true) {
                    OpenGL.glTexImage2Di(arg4, var6, this.method1798(39), arg2, arg1, 0, 32993, this.field3921.field2901, var10, 0);
                    if (var7 <= 1) {
                        return;
                    }
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = arg2 + var13;
                    int[] var15 = var11;
                    for (int var16 = 0; var16 < var9; var16++) {
                        for (int var17 = 0; var17 < var8; var17++) {
                            int var18 = var10[var13++];
                            int var19 = var10[var13++];
                            int var20 = var10[var14++];
                            int var21 = var10[var14++];
                            int var22 = (var18 & 0xFFCB7A) >> 16;
                            int var23 = (var18 & 0xFF26) >> 8;
                            int var24 = var18 >> 24 & 0xFF;
                            int var25 = var18 & 0xFF;
                            int var26 = ((var19 & 0xFF02) >> 8) + var23;
                            int var27 = ((var19 & 0xFFCEA2) >> 16) + var22;
                            int var28 = (var19 >> 24 & 0xFF) + var24;
                            int var29 = (var19 & 0xFF) + var25;
                            int var30 = (var20 >> 24 & 0xFF) + var28;
                            int var31 = ((var20 & 0xFF3CAE) >> 16) + var27;
                            int var32 = (var20 & 0xFF) + var29;
                            int var33 = (var20 >> 8 & 0xFF) + var26;
                            int var34 = (var21 >> 24 & 0xFF) + var30;
                            int var35 = ((var21 & 0xFF0195) >> 16) + var31;
                            int var36 = ((var21 & 0xFFDB) >> 8) + var33;
                            int var37 = (var21 & 0xFF) + var32;
                            var11[var12++] = class216.method1308(class216.method1308(class272.method1629(var36 << 6, 65280), class216.method1308(class272.method1629(1020, var35) << 14, class272.method1629(1020, var34) << 22)), class272.method1629(1020, var37) >> 2);
                        }
                        var13 += arg2;
                        var14 += arg2;
                    }
                    var11 = var10;
                    arg2 = var8;
                    var10 = var15;
                    arg1 = var9;
                    var9 >>= 0x1;
                    var7 >>= 0x1;
                    var8 >>= 0x1;
                    var6++;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)V")
    public static final void method1786(byte arg0) {
        for (class359 var1 = (class359) class681.field9283.method2565((byte) 97); var1 != null; var1 = (class359) class681.field9283.method2568(-31355)) {
            if (var1.field5121 > 1) {
                var1.field5121 = 0;
                class131.field1569.method774(((class718) var1.field5117.field6099.field8705).field10131, -102, var1);
                var1.field5117.method2563(false);
            }
        }
        field3907++;
        class573.field8011 = 0;
        class1.field1 = 0;
        class565.field7906.method3114(true);
        class124.field1491.method3251(false);
        class681.field9283.method2563(false);
        class322.field4113 = false;
        if (arg0 != -42) {
            method1788(-104, (byte) -32, 67, 38);
        }
    }

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "(I)V")
    public static final void method1787(int arg0) {
        class335.field4312 = arg0;
        for (int var1 = 0; var1 < class90.field1142; var1++) {
            for (int var2 = 0; var2 < class665.field9107; var2++) {
                if (class495.field7002[arg0][var1][var2] == null) {
                    class495.field7002[arg0][var1][var2] = new class73(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IBII)I")
    public static final int method1788(int arg0, byte arg1, int arg2, int arg3) {
        field3915++;
        if (arg0 == arg2) {
            return arg0;
        }
        int var4 = 128 - arg3;
        int var5 = (arg0 & 0x7F) * var4 + (arg2 & 0x7F) * arg3 >> 7;
        int var6 = (arg0 & 0x380) * var4 + (arg2 & 0x380) * arg3 >> 7;
        if (arg1 != -127) {
            method1786((byte) 46);
        }
        int var7 = (arg0 & 0xFC00) * var4 + (arg2 & 0xFC00) * arg3 >> 7;
        return var6 & 0x380 | var7 & 0xFC00 | var5 & 0x7F;
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(B)I")
    private final int method1789(byte arg0) {
        field3919++;
        if (arg0 == -59) {
            int var2 = this.field3923.field8447 * this.field3926.field3090 * this.field3916;
            return this.field3927 ? var2 * 4 / 3 : var2;
        } else {
            return 120;
        }
    }

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "(I)V")
    public static void method1790(int arg0) {
        field3906 = null;
        if (arg0 != -17222) {
            method1788(66, (byte) 37, 11, 109);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lbba;I)V")
    public final void method1466(class721 arg0, int arg1) {
        if (this.field3929 != arg0) {
            this.field3929 = arg0;
            this.method1791(true);
        }
        if (arg1 != 13584) {
            this.field3920 = 30;
        }
        field3928++;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z)V")
    private final void method1791(boolean arg0) {
        this.field3921.method3711(false, this);
        field3917++;
        if (!arg0) {
            this.field3927 = false;
        }
        if (class650.field8933 == this.field3929) {
            OpenGL.glTexParameteri(this.field3911, 10241, this.field3927 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field3911, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field3911, 10241, this.field3927 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field3911, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "([BIIII)V")
    public final void method1792(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field3908++;
        if (arg4 > 0 && !class487.method2850((byte) -84, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class487.method2850((byte) 120, arg3)) {
            int var6 = this.field3923.field8447;
            int var7 = 0;
            int var8 = arg4 < arg3 ? arg4 : arg3;
            int var9 = arg4 >> 1;
            if (arg1 <= 47) {
                method1788(-52, (byte) -112, -90, 42);
            }
            int var10 = arg3 >> 1;
            byte[] var11 = arg0;
            byte[] var12 = new byte[var6 * var10 * var9];
            while (true) {
                OpenGL.glTexImage2Dub(arg2, var7, this.method1798(73), arg4, arg3, 0, class436.method2578(6145, this.field3923), 5121, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg4 * var6;
                byte[] var14 = var12;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = var15;
                    int var17 = var15;
                    int var18 = var13 + var15;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            byte var21 = var11[var17];
                            int var22 = var6 + var17;
                            int var23 = var11[var22] + var21;
                            int var24 = var11[var18] + var23;
                            var17 = var6 + var22;
                            int var25 = var6 + var18;
                            int var26 = var11[var25] + var24;
                            var18 = var6 + var25;
                            var12[var16] = (byte) (var26 >> 2);
                            var16 += var6;
                        }
                        var18 += var13;
                        var17 += var13;
                    }
                }
                var12 = var11;
                var11 = var14;
                arg3 = var10;
                arg4 = var9;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var8 >>= 0x1;
                var7++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)V")
    public final void method1793(int arg0) {
        field3918++;
        int var2 = this.field3921.method3773((byte) 44);
        int var3 = this.field3921.field2903[var2];
        if (this.field3911 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field3911);
            this.field3921.field2903[var2] = this.field3911;
        }
        OpenGL.glBindTexture(this.field3911, this.field3920);
        if (arg0 != 3323) {
            this.method1789((byte) 39);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIZII[[[Lfu;)Z")
    public static final boolean method1794(int arg0, int arg1, boolean arg2, int arg3, int arg4, class73[][][] arg5) {
        field3925++;
        byte var6 = arg2 ? 1 : (byte) (class710.field9990 & 0xFF);
        int var7 = 6 % ((arg1 + 67) / 47);
        if (class406.field5734[class223.field2946][arg4][arg3] == var6) {
            return false;
        } else if ((class215.field2728[class223.field2946][arg4][arg3] & 0x4) == 0) {
            return false;
        } else {
            byte var8 = 0;
            class688.field9749[var8] = arg4;
            int var9 = 0;
            int var36 = var8 + 1;
            class58.field822[var8] = arg3;
            class406.field5734[class223.field2946][arg4][arg3] = var6;
            while (var36 != var9) {
                int var10 = class688.field9749[var9] & 0xFFFF;
                int var11 = class688.field9749[var9] >> 16 & 0xFF;
                int var12 = class688.field9749[var9] >> 24 & 0xFF;
                int var13 = class58.field822[var9] & 0xFFFF;
                int var14 = class58.field822[var9] >> 16 & 0xFF;
                var9 = var9 + 1 & 0xFFF;
                boolean var15 = false;
                if ((class215.field2728[class223.field2946][var10][var13] & 0x4) == 0) {
                    var15 = true;
                }
                boolean var16 = false;
                if (arg5 != null) {
                    label240: for (int var17 = class223.field2946 + 1; var17 <= 3; var17++) {
                        if (arg5[var17] != null && (class215.field2728[var17][var10][var13] & 0x8) == 0) {
                            if (var15 && arg5[var17][var10][var13] != null) {
                                if (arg5[var17][var10][var13].field973 != null) {
                                    int var18 = class5.method18(var11, (byte) -126);
                                    if (arg5[var17][var10][var13].field973.field7417 == var18 || arg5[var17][var10][var13].field961 != null && arg5[var17][var10][var13].field961.field7417 == var18) {
                                        continue;
                                    }
                                    if (var12 != 0) {
                                        int var19 = class5.method18(var12, (byte) 38);
                                        if (arg5[var17][var10][var13].field973.field7417 == var19 || arg5[var17][var10][var13].field961 != null && arg5[var17][var10][var13].field961.field7417 == var19) {
                                            continue;
                                        }
                                    }
                                    if (var14 != 0) {
                                        int var20 = class5.method18(var14, (byte) -4);
                                        if (arg5[var17][var10][var13].field973.field7417 == var20 || arg5[var17][var10][var13].field961 != null && arg5[var17][var10][var13].field961.field7417 == var20) {
                                            continue;
                                        }
                                    }
                                }
                                class73 var21 = arg5[var17][var10][var13];
                                if (var21.field969 != null) {
                                    for (class456 var22 = var21.field969; var22 != null; var22 = var22.field6389) {
                                        class451 var23 = var22.field6384;
                                        if (var23 instanceof class559) {
                                            class559 var24 = (class559) var23;
                                            int var25 = var24.method741(84);
                                            int var26 = var24.method731(126);
                                            if (var25 == 21) {
                                                var25 = 19;
                                            }
                                            int var27 = var26 << 6 | var25;
                                            if (var11 == var27 || var12 != 0 && var12 == var27 || var14 != 0 && var14 == var27) {
                                                continue label240;
                                            }
                                        }
                                    }
                                }
                            }
                            class73 var28 = arg5[var17][var10][var13];
                            if (var28 != null && var28.field969 != null) {
                                for (class456 var29 = var28.field969; var29 != null; var29 = var29.field6389) {
                                    class451 var30 = var29.field6384;
                                    if (var30.field6322 != var30.field6321 || var30.field6328 != var30.field6324) {
                                        for (int var31 = var30.field6321; var31 <= var30.field6322; var31++) {
                                            for (int var32 = var30.field6328; var32 <= var30.field6324; var32++) {
                                                class406.field5734[var17][var31][var32] = var6;
                                            }
                                        }
                                    }
                                }
                            }
                            var16 = true;
                            class406.field5734[var17][var10][var13] = var6;
                        }
                    }
                }
                if (var16) {
                    int var33 = class517.field7282[class223.field2946 + 1].method2381(-125, var10, var13);
                    if (class264.field3346[arg0] < var33) {
                        class264.field3346[arg0] = var33;
                    }
                    int var34 = var10 << 9;
                    int var35 = var13 << 9;
                    if (var34 < class733.field10243[arg0]) {
                        class733.field10243[arg0] = var34;
                    } else if (var34 > class495.field6999[arg0]) {
                        class495.field6999[arg0] = var34;
                    }
                    if (class751.field10506[arg0] > var35) {
                        class751.field10506[arg0] = var35;
                    } else if (class613.field8589[arg0] < var35) {
                        class613.field8589[arg0] = var35;
                    }
                }
                if (!var15) {
                    if (var10 >= 1 && class406.field5734[class223.field2946][var10 - 1][var13] != var6) {
                        class688.field9749[var36] = class216.method1308(-754974720, class216.method1308(var10 - 1, 1179648));
                        class58.field822[var36] = class216.method1308(var13, 1245184);
                        class406.field5734[class223.field2946][var10 - 1][var13] = var6;
                        var36 = var36 + 1 & 0xFFF;
                    }
                    int var10000 = ~class1.field3;
                    var13++;
                    if (var10000 < ~var13) {
                        if (var10 - 1 >= 0 && class406.field5734[class223.field2946][var10 - 1][var13] != var6 && (class215.field2728[class223.field2946][var10][var13] & 0x4) == 0 && (class215.field2728[class223.field2946][var10 - 1][var13 - 1] & 0x4) == 0) {
                            class688.field9749[var36] = class216.method1308(1375731712, class216.method1308(var10 - 1, 1179648));
                            class58.field822[var36] = class216.method1308(var13, 1245184);
                            class406.field5734[class223.field2946][var10 - 1][var13] = var6;
                            var36 = var36 + 1 & 0xFFF;
                        }
                        if (class406.field5734[class223.field2946][var10][var13] != var6) {
                            class688.field9749[var36] = class216.method1308(318767104, class216.method1308(var10, 5373952));
                            class58.field822[var36] = class216.method1308(var13, 5439488);
                            var36 = var36 + 1 & 0xFFF;
                            class406.field5734[class223.field2946][var10][var13] = var6;
                        }
                        if ((var10 + 1) < class613.field8591 && class406.field5734[class223.field2946][var10 + 1][var13] != var6 && (class215.field2728[class223.field2946][var10][var13] & 0x4) == 0 && (class215.field2728[class223.field2946][var10 + 1][var13 - 1] & 0x4) == 0) {
                            class688.field9749[var36] = class216.method1308(-1845493760, class216.method1308(var10 + 1, 5373952));
                            class58.field822[var36] = class216.method1308(var13, 5439488);
                            class406.field5734[class223.field2946][var10 + 1][var13] = var6;
                            var36 = var36 + 1 & 0xFFF;
                        }
                    }
                    var13--;
                    if (class613.field8591 > (var10 + 1) && class406.field5734[class223.field2946][var10 + 1][var13] != var6) {
                        class688.field9749[var36] = class216.method1308(1392508928, class216.method1308(9568256, var10 + 1));
                        class58.field822[var36] = class216.method1308(9633792, var13);
                        class406.field5734[class223.field2946][var10 + 1][var13] = var6;
                        var36 = var36 + 1 & 0xFFF;
                    }
                    var13--;
                    if (var13 >= 0) {
                        if ((var10 - 1) >= 0 && class406.field5734[class223.field2946][var10 - 1][var13] != var6 && (class215.field2728[class223.field2946][var10][var13] & 0x4) == 0 && (class215.field2728[class223.field2946][var10 - 1][var13 + 1] & 0x4) == 0) {
                            class688.field9749[var36] = class216.method1308(301989888, class216.method1308(var10 - 1, 13762560));
                            class58.field822[var36] = class216.method1308(var13, 13828096);
                            class406.field5734[class223.field2946][var10 - 1][var13] = var6;
                            var36 = var36 + 1 & 0xFFF;
                        }
                        if (class406.field5734[class223.field2946][var10][var13] != var6) {
                            class688.field9749[var36] = class216.method1308(class216.method1308(13762560, var10), -1828716544);
                            class58.field822[var36] = class216.method1308(var13, 13828096);
                            class406.field5734[class223.field2946][var10][var13] = var6;
                            var36 = var36 + 1 & 0xFFF;
                        }
                        if (class613.field8591 > (var10 + 1) && class406.field5734[class223.field2946][var10 + 1][var13] != var6 && (class215.field2728[class223.field2946][var10][var13] & 0x4) == 0 && (class215.field2728[class223.field2946][var10 + 1][var13 + 1] & 0x4) == 0) {
                            class688.field9749[var36] = class216.method1308(class216.method1308(var10 + 1, 9568256), -771751936);
                            class58.field822[var36] = class216.method1308(9633792, var13);
                            var36 = var36 + 1 & 0xFFF;
                            class406.field5734[class223.field2946][var10 + 1][var13] = var6;
                        }
                    }
                }
            }
            if (class264.field3346[arg0] != -1000000) {
                class264.field3346[arg0] += 40;
                class733.field10243[arg0] -= 512;
                class495.field6999[arg0] += 512;
                class613.field8589[arg0] += 512;
                class751.field10506[arg0] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ft", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1797(4);
        field3912++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I[FIII)V")
    public final void method1795(int arg0, float[] arg1, int arg2, int arg3, int arg4) {
        field3905++;
        if (arg0 > 0 && !class487.method2850((byte) -102, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class487.method2850((byte) 80, arg2)) {
            int var6 = this.field3923.field8447;
            int var7 = 0;
            int var8 = arg0 < arg2 ? arg0 : arg2;
            if (arg3 == -379199231) {
                int var9 = arg0 >> 1;
                int var10 = arg2 >> 1;
                float[] var11 = arg1;
                float[] var12 = new float[var9 * var10 * var6];
                while (true) {
                    OpenGL.glTexImage2Df(arg4, var7, this.method1798(-123), arg0, arg2, 0, class436.method2578(6145, this.field3923), 5126, var11, 0);
                    if (var8 <= 1) {
                        return;
                    }
                    int var13 = arg0 * var6;
                    for (int var14 = 0; var14 < var6; var14++) {
                        int var16 = var14;
                        int var17 = var14;
                        int var18 = var13 + var14;
                        for (int var19 = 0; var19 < var10; var19++) {
                            for (int var20 = 0; var20 < var9; var20++) {
                                float var21 = var11[var17];
                                int var22 = var6 + var17;
                                float var23 = var11[var22] + var21;
                                float var24 = var11[var18] + var23;
                                var17 = var6 + var22;
                                int var25 = var6 + var18;
                                float var26 = var11[var25] + var24;
                                var18 = var6 + var25;
                                var12[var16] = var26 * 0.25F;
                                var16 += var6;
                            }
                            var18 += var13;
                            var17 += var13;
                        }
                    }
                    float[] var15 = var12;
                    var12 = var11;
                    arg0 = var9;
                    var11 = var15;
                    arg2 = var10;
                    var8 >>= 0x1;
                    var10 >>= 0x1;
                    var9 >>= 0x1;
                    var7++;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IZ)V")
    private final void method1796(int arg0, boolean arg1) {
        if (arg1) {
            this.field3921.field9547 -= arg0;
            field3910++;
            this.field3921.field9547 += this.method1789((byte) -59);
        }
    }

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "(I)V")
    private final void method1797(int arg0) {
        if (arg0 != 4) {
            return;
        }
        field3914++;
        if (this.field3920 > 0) {
            this.field3921.method1405(0, this.field3920, this.method1789((byte) -59));
            this.field3920 = 0;
        }
    }

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "(I)I")
    public final int method1798(int arg0) {
        field3924++;
        if (class240.field3093 == this.field3926) {
            if (class300.field3868 == this.field3923) {
                return 6407;
            }
            if (class440.field6178 == this.field3923) {
                return 6408;
            }
            if (class15.field215 == this.field3923) {
                return 6406;
            }
            if (class750.field10490 == this.field3923) {
                return 6409;
            }
            if (class332.field4276 == this.field3923) {
                return 6410;
            }
            if (class590.field8226 == this.field3923) {
                return 6145;
            }
        } else if (class240.field3096 == this.field3926) {
            if (class300.field3868 == this.field3923) {
                return 34843;
            }
            if (class440.field6178 == this.field3923) {
                return 34842;
            }
            if (class15.field215 == this.field3923) {
                return 34844;
            }
            if (class750.field10490 == this.field3923) {
                return 34846;
            }
            if (class332.field4276 == this.field3923) {
                return 34847;
            }
            if (class590.field8226 == this.field3923) {
                return 6145;
            }
        } else if (class240.field3097 == this.field3926) {
            if (class300.field3868 == this.field3923) {
                return 34837;
            }
            if (class440.field6178 == this.field3923) {
                return 34836;
            }
            if (class15.field215 == this.field3923) {
                return 34838;
            }
            if (class750.field10490 == this.field3923) {
                return 34840;
            }
            if (class332.field4276 == this.field3923) {
                return 34841;
            }
            if (class590.field8226 == this.field3923) {
                return 6145;
            }
        }
        int var2 = 57 % ((-arg0 - 2) / 34);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lck;ILem;Lew;IZ)V")
    public class304(class221 arg0, int arg1, class610 arg2, class240 arg3, int arg4, boolean arg5) {
        this.field3916 = arg4;
        this.field3926 = arg3;
        this.field3921 = arg0;
        this.field3923 = arg2;
        this.field3927 = arg5;
        this.field3911 = arg1;
        OpenGL.glGenTextures(1, class149.field1809, 0);
        this.field3920 = class149.field1809[0];
        this.method1791(true);
        this.method1796(0, true);
    }
}
