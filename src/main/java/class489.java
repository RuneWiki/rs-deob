import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class489 {

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "Leq;")
    private static class213 field6763 = new class213(16);

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "I")
    public static int field6775 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "[S")
    private static short[] field6774 = new short[1];

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
    public static int field6772 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "[B")
    private static byte[] field6770 = new byte[1];

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "Luh;")
    public static class168 field6776 = new class168();

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "F")
    public static float field6769;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "F")
    public static float field6771;

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!kp", name = "u", descriptor = "I")
    public static int field6779;

    @OriginalMember(owner = "client!kp", name = "w", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!kp", name = "z", descriptor = "I")
    public static int field6784;

    @OriginalMember(owner = "client!kp", name = "A", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!kp", name = "C", descriptor = "I")
    public static int field6787;

    @OriginalMember(owner = "client!kp", name = "D", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!kp", name = "E", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!kp", name = "F", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!kp", name = "J", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!kp", name = "L", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!kp", name = "N", descriptor = "I")
    public static int field6798;

    @OriginalMember(owner = "client!kp", name = "O", descriptor = "I")
    public static int field6799;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "Loda;")
    public static class119 field6764;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "Ldfa;")
    public static class167 field6765;

    @OriginalMember(owner = "client!kp", name = "I", descriptor = "Leq;")
    private static class213 field6793;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "Luha;")
    public static class245 field6767;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "Lon;")
    public static class337 field6760;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "Ltu;")
    public static class350 field6768;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "Lqe;")
    private static class468 field6762;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "Lcb;")
    private static class521 field6761;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "Ldd;")
    public static class703 field6766;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "Lin;")
    public static class91 field6759;

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "[B")
    private static byte[] field6778;

    @OriginalMember(owner = "client!kp", name = "v", descriptor = "[B")
    private static byte[] field6780;

    @OriginalMember(owner = "client!kp", name = "B", descriptor = "[B")
    private static byte[] field6786;

    @OriginalMember(owner = "client!kp", name = "K", descriptor = "[B")
    private static byte[] field6795;

    @OriginalMember(owner = "client!kp", name = "M", descriptor = "[B")
    private static byte[] field6797;

    @OriginalMember(owner = "client!kp", name = "x", descriptor = "[I")
    private static int[] field6782;

    @OriginalMember(owner = "client!kp", name = "y", descriptor = "[S")
    private static short[] field6783;

    @OriginalMember(owner = "client!kp", name = "H", descriptor = "[S")
    private static short[] field6792;

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "[[[B")
    public static byte[][][] field6773;

    @OriginalMember(owner = "client!kp", name = "G", descriptor = "[[[Ltca;")
    private static class174[][][] field6791;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lha;Llga;Lii;)V", line = 3)
    public static final void method2873(class59 arg0, class710 arg1, class553 arg2) {
        if (arg2.field7636 == null) {
            return;
        }
        int[] var3 = new int[arg2.field7636.length];
        for (int var4 = 0; var4 < var3.length / 2; var4++) {
            int var21 = arg2.field7636[var4 * 2] + arg1.field9634;
            int var22 = arg2.field7636[var4 * 2 + 1] + arg1.field9633;
            var3[var4 * 2] = (field6798 - field6794) * (var21 - field6796) / (field6787 - field6796) + field6794;
            var3[var4 * 2 + 1] = field6790 - (field6790 - field6784) * (var22 - field6779) / (field6799 - field6779);
        }
        class402.method2508(arg0, var3, arg2.field7627);
        if (arg2.field7629 > 0) {
            for (int var5 = 0; var5 < var3.length / 2 - 1; var5++) {
                int var13 = var3[var5 * 2];
                int var14 = var3[var5 * 2 + 1];
                int var15 = var3[(var5 + 1) * 2];
                int var16 = var3[(var5 + 1) * 2 + 1];
                if (var15 < var13) {
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
                arg0.method258(var13, var14, var15, var16, arg2.field7617[arg2.field7609[var5] & 0xFF], 1, arg2.field7629, arg2.field7620, arg2.field7646);
            }
            int var6 = var3[var3.length - 2];
            int var7 = var3[var3.length - 1];
            int var8 = var3[0];
            int var9 = var3[1];
            if (var8 < var6) {
                int var10 = var6;
                int var11 = var7;
                var6 = var8;
                var7 = var9;
                var8 = var10;
                var9 = var11;
            } else if (var6 == var8 && var9 < var7) {
                int var12 = var7;
                var7 = var9;
                var9 = var12;
            }
            arg0.method258(var6, var7, var8, var9, arg2.field7617[arg2.field7609[arg2.field7609.length - 1] & 0xFF], 1, arg2.field7629, arg2.field7620, arg2.field7646);
            return;
        }
        for (int var20 = 0; var20 < var3.length / 2 - 1; var20++) {
            arg0.method616(var3[var20 * 2 + 1], var3[var20 * 2], var3[(var20 + 1) * 2], -8003, arg2.field7617[arg2.field7609[var20] & 0xFF], var3[(var20 + 1) * 2 + 1]);
        }
        arg0.method616(var3[var3.length - 1], var3[var3.length - 2], var3[0], -8003, arg2.field7617[arg2.field7609[arg2.field7609.length - 1] & 0xFF], var3[1]);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "()V", line = 114)
    public static void method2874() {
        field6761 = null;
        field6762 = null;
        field6767 = null;
        field6760 = null;
        field6764 = null;
        field6766 = null;
        field6765 = null;
        field6759 = null;
        field6763 = null;
        field6773 = null;
        field6774 = null;
        field6770 = null;
        field6768 = null;
        field6776 = null;
        field6782 = null;
        field6795 = null;
        field6786 = null;
        field6792 = null;
        field6778 = null;
        field6797 = null;
        field6783 = null;
        field6780 = null;
        field6793 = null;
        field6791 = null;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lha;Llga;IIII)V", line = 142)
    private static final void method2875(class59 arg0, class710 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field9635 = ((arg1.field9634 - field6796) * arg2 + arg4 >> 16) + field6794;
        arg1.field9637 = field6790 - ((arg1.field9633 - field6779) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lha;)V", line = 147)
    public static final void method2876(class59 arg0) {
        int var1 = field6787 - field6796;
        int var2 = field6799 - field6779;
        int var3 = (field6798 - field6794 << 16) / var1;
        int var4 = (field6790 - field6784 << 16) / var2;
        method2893(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "()V", line = 159)
    public static final void method2877() {
        field6795 = null;
        field6786 = null;
        field6792 = null;
        field6778 = null;
        field6797 = null;
        field6783 = null;
        field6780 = null;
        field6793 = null;
        field6791 = null;
        field6782 = null;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lha;Lcea;IIII[I[I)V", line = 172)
    private static final void method2878(class59 arg0, class215 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method1535(255);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method1535(255);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field6795[field6781 * arg5 + arg4] = (byte) var11;
                    field6778[field6781 * arg5 + arg4] = 0;
                } else {
                    field6778[field6781 * arg5 + arg4] = (byte) var11;
                    field6797[field6781 * arg5 + arg4] = 0;
                    field6795[field6781 * arg5 + arg4] = arg1.method1536(-115);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method1535(255);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method1535(255);
                var18 = arg1.method1535(255);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method1535(255);
            }
            if (var15 == 0) {
                field6795[field6781 * arg5 + arg4] = (byte) var16;
                field6778[field6781 * arg5 + arg4] = (byte) var17;
                field6797[field6781 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field6783[field6781 * arg5 + arg4] = (short) (arg1.method1478(842397944) + 1);
                    field6780[field6781 * arg5 + arg4] = arg1.method1536(-122);
                } else if (var19 > 1) {
                    field6783[field6781 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method1478(842397944);
                        var21[var22] = arg1.method1536(-120);
                    }
                    field6793.method1468((byte) 33, (long) (arg4 << 16 | arg5), new class725(var20, var21));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method1478(842397944);
                        var24[var25] = arg1.method1536(-92);
                    }
                }
                if (field6791[var15 - 1][arg2 - (field6788 >> 6)][arg3 - (field6785 >> 6)] == null) {
                    field6791[var15 - 1][arg2 - (field6788 >> 6)][arg3 - (field6785 >> 6)] = new class174();
                }
                class229 var26 = new class229(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field6791[var15 - 1][arg2 - (field6788 >> 6)][arg3 - (field6785 >> 6)].method1298(-86, var26);
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIIIII)V", line = 306)
    public static final void method2879(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6796 = arg0 - field6788;
        field6799 = arg1 - field6785;
        field6787 = arg2 - field6788;
        field6779 = arg3 - field6785;
        field6794 = arg4;
        field6784 = arg5;
        field6798 = arg6;
        field6790 = arg7;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lin;Lcb;Lqe;Luha;Lon;Loda;Ldd;)V", line = 316)
    public static final void method2880(class91 arg0, class521 arg1, class468 arg2, class245 arg3, class337 arg4, class119 arg5, class703 arg6) {
        field6759 = arg0;
        field6761 = arg1;
        field6762 = arg2;
        field6767 = arg3;
        field6760 = arg4;
        field6764 = arg5;
        field6766 = arg6;
        field6763.method1466(0);
        int var7 = field6759.method870("details", 0);
        int[] var8 = field6759.method849(var7, 0);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class167 var10 = class738.method4058(var8[var9], true, field6759, var7);
                field6763.method1468((byte) 25, (long) var10.field2613, var10);
            }
        }
        class78.method721(true, false, (byte) 11);
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "()V", line = 350)
    private static final void method2881() {
        for (int var0 = 0; var0 < field6781; var0++) {
            for (int var11 = 0; var11 < field6789; var11++) {
                int var12 = field6783[field6781 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class725 var13 = (class725) field6793.method1465((long) (var0 << 16 | var11), -6008);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field9822.length; var14++) {
                                class99 var15 = field6767.method1680(0, var13.field9822[var14] & 0xFFFF);
                                int var16 = var15.field1756;
                                if (var15.field1780 != null) {
                                    class99 var17 = var15.method925(field6766, (byte) 47);
                                    if (var17 != null) {
                                        var16 = var17.field1756;
                                    }
                                }
                                if (var16 != -1) {
                                    class710 var18 = new class710(var16);
                                    var18.field9634 = var0;
                                    var18.field9633 = var11;
                                    field6776.method1273(var18, -20180);
                                }
                            }
                        }
                    } else {
                        class99 var19 = field6767.method1680(0, var12 - 1);
                        int var20 = var19.field1756;
                        if (var19.field1780 != null) {
                            class99 var21 = var19.method925(field6766, (byte) 47);
                            if (var21 != null) {
                                var20 = var21.field1756;
                            }
                        }
                        if (var20 != -1) {
                            class710 var22 = new class710(var20);
                            var22.field9634 = var0;
                            var22.field9633 = var11;
                            field6776.method1273(var22, -20180);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field6791[0].length; var2++) {
                for (int var3 = 0; var3 < field6791[0][0].length; var3++) {
                    class174 var4 = field6791[var1][var2][var3];
                    if (var4 != null) {
                        for (class229 var5 = (class229) var4.method1301(8); var5 != null; var5 = (class229) var4.method1307((byte) 127)) {
                            if (var5.field3315 != null) {
                                for (int var6 = 0; var6 < var5.field3315.length; var6++) {
                                    class99 var7 = field6767.method1680(0, var5.field3315[var6] & 0xFFFF);
                                    int var8 = var7.field1756;
                                    if (var7.field1780 != null) {
                                        class99 var9 = var7.method925(field6766, (byte) 47);
                                        if (var9 != null) {
                                            var8 = var9.field1756;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class710 var10 = new class710(var8);
                                        var10.field9634 = ((field6788 >> 6) + var2) * 64 + var5.field3320 - field6788;
                                        var10.field9633 = ((field6785 >> 6) + var3) * 64 + var5.field3318 - field6785;
                                        field6776.method1273(var10, -20180);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V", line = 506)
    public static final void method2882(int arg0) {
        field6765 = (class167) field6763.method1465((long) arg0, -6008);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lha;IIIIIII[S[BZ)V", line = 509)
    private static final void method2883(class59 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method217(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field6782[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method217(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class378.method2384(field6782[arg6], arg5, arg0, 0, var12, field6777, arg7 >> 6 & 0x3, field6773, arg3, arg1, var11, arg4, arg2);
                }
            }
        }
        if (arg8 == null) {
            return;
        }
        int var14;
        if (arg3 == 1) {
            var14 = arg1;
        } else {
            var14 = arg1 + arg3 - 1;
        }
        int var15;
        if (arg4 == 1) {
            var15 = arg2;
        } else {
            var15 = arg2 + arg4 - 1;
        }
        for (int var16 = 0; var16 < arg8.length; var16++) {
            int var17 = arg9[var16] & 0x3F;
            if (var17 == 0 || var17 == 2 || var17 == 3 || var17 == 9) {
                class99 var18 = field6767.method1680(0, arg8[var16] & 0xFFFF);
                if (var18.field1710 == -1) {
                    int var19 = -3355444;
                    if (var18.field1709 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method338(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method226(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method338(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method226(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method338(arg1, arg2, arg4, -1, 0);
                            arg0.method226(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method338(var14, arg2, arg4, -1, 0);
                            arg0.method226(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method338(var14, arg2, arg4, -1, 0);
                            arg0.method226(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method338(arg1, arg2, arg4, -1, 0);
                            arg0.method226(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method226(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method226(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method226(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method226(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method226(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method226(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lha;II)V", line = 671)
    public static final void method2884(class59 arg0, int arg1, int arg2) {
        class215 var3 = new class215(field6759.method844(field6765.field2610, "area", -29832));
        int var4 = var3.method1535(255);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method1535(255);
        }
        int var7 = var3.method1535(255);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1535(255);
        }
        while (true) {
            while (var3.field3109 < var3.field3066.length) {
                if (var3.method1535(255) == 0) {
                    int var22 = var3.method1535(255);
                    int var23 = var3.method1535(255);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field6788;
                            int var27 = var23 * 64 + var25 - field6785;
                            method2878(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method1535(255);
                    int var29 = var3.method1535(255);
                    int var30 = var3.method1535(255);
                    int var31 = var3.method1535(255);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field6788;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field6785;
                            method2878(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field6786 = new byte[field6789 * field6781];
            field6792 = new short[field6789 * field6781];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field6789 * field6781];
                for (int var13 = 0; var13 < field6791[var11].length; var13++) {
                    for (int var19 = 0; var19 < field6791[var11][0].length; var19++) {
                        class174 var20 = field6791[var11][var13][var19];
                        if (var20 != null) {
                            for (class229 var21 = (class229) var20.method1301(8); var21 != null; var21 = (class229) var20.method1307((byte) 1)) {
                                var12[(var19 * 64 + var21.field3318) * field6781 + var13 * 64 + var21.field3320] = (byte) var21.field3319;
                            }
                        }
                    }
                }
                method2896(var12, field6786, field6792, arg1, arg2);
                for (int var14 = 0; var14 < field6791[var11].length; var14++) {
                    for (int var15 = 0; var15 < field6791[var11][0].length; var15++) {
                        class174 var16 = field6791[var11][var14][var15];
                        if (var16 != null) {
                            for (class229 var17 = (class229) var16.method1301(8); var17 != null; var17 = (class229) var16.method1307((byte) 122)) {
                                int var18 = (var15 * 64 + var17.field3318) * field6781 + var14 * 64 + var17.field3320;
                                var17.field3319 = (field6786[var18] & 0xFF) << 16 | field6792[var18] & 0xFFFF;
                                if (var17.field3319 != 0) {
                                    var17.field3319 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method2896(field6795, field6786, field6792, arg1, arg2);
            field6795 = null;
            method2881();
            return;
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)Ldfa;", line = 849)
    public static final class167 method2885(int arg0) {
        return (class167) field6763.method1465((long) arg0, -6008);
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(Lha;)Luh;", line = 854)
    public static final class168 method2886(class59 arg0) {
        int var1 = field6787 - field6796;
        int var2 = field6799 - field6779;
        int var3 = (field6798 - field6794 << 16) / var1;
        int var4 = (field6790 - field6784 << 16) / var2;
        return method2890(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ld;III)I", line = 867)
    private static final int method2887(class152 arg0, int arg1, int arg2, int arg3) {
        class39 var4 = field6761.method3032(arg1, false);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field961;
        if (var5 >= 0 && arg0.method1180(var5, -6662).field9951) {
            var5 = -1;
        }
        int var9;
        if (var4.field955 >= 0) {
            int var6 = var4.field955;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class646.field8885[class160.method1228(class154.method1189(96, -119, var8), 30) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class646.field8885[class160.method1228(class154.method1189(96, -85, arg0.method1180(var5, -6662).field9950), 30) & 0xFFFF] | 0xFF000000;
        } else if (var4.field949 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field949;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class646.field8885[class160.method1228(class154.method1189(96, -80, var12), 30) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "()V", line = 923)
    public static final void method2888() {
        field6795 = new byte[field6789 * field6781];
        field6778 = new byte[field6789 * field6781];
        field6797 = new byte[field6789 * field6781];
        field6783 = new short[field6789 * field6781];
        field6780 = new byte[field6789 * field6781];
        field6793 = new class213(1024);
        field6791 = new class174[3][field6781 >> 6][field6789 >> 6];
        field6782 = new int[field6761.field7223 + 1];
    }

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "()V", line = 934)
    public static final void method2889() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field6768.field4884; var1++) {
            boolean var2 = field6765.method1253(var0, field6768.field4881[var1] >> 14 & 0x3FFF, field6768.field4881[var1] & 0x3FFF, field6768.field4881[var1] >> 28 & 0x3, (byte) -28);
            if (var2) {
                class710 var3 = new class710(field6768.field4882[var1]);
                var3.field9634 = var0[1] - field6788;
                var3.field9633 = var0[2] - field6785;
                field6776.method1273(var3, -20180);
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lha;IIII)Luh;", line = 957)
    private static final class168 method2890(class59 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class710 var5 = (class710) field6776.method1269(4); var5 != null; var5 = (class710) field6776.method1264((byte) 74)) {
            method2875(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field6776;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lha;IIII[S[B)V", line = 968)
    private static final void method2891(class59 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class99 var8 = field6767.method1680(0, arg5[var7] & 0xFFFF);
            int var9 = var8.field1710;
            if (var9 != -1) {
                class754 var10 = field6764.method1035((byte) 31, var9);
                class496 var11 = var10.method4210(var8.field1747 ? arg6[var7] >> 6 & 0x3 : 0, var8.field1760 ? var8.field1737 : false, 125, arg0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method1618() >> 2;
                    int var13 = arg4 * var11.method1614() >> 2;
                    if (var10.field10527) {
                        int var14 = var8.field1796;
                        int var15 = var8.field1761;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field10529 == 0) {
                            var11.method2924(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method2922(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field10529 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ld;II)V", line = 1028)
    public static final void method2892(class152 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field6761.field7223; var3++) {
            field6782[var3 + 1] = method2887(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(Lha;IIII)V", line = 1039)
    private static final void method2893(class59 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field6787 - field6796;
        int var6 = field6799 - field6779;
        if (field6787 < field6781) {
            var5++;
        }
        if (field6799 < field6789) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field6794;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field6794;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field6796 + var7;
                if (var52 >= 0 && var52 < field6781) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field6790 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field6790 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field6779 + var53;
                            int var58 = field6781 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field6789) {
                                var59 = (field6786[var58] & 0xFF) << 16 | field6792[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field6778[var58] & 0xFF;
                                var61 = field6783[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field6765.field2619 != -1) {
                                    var62 = field6765.field2619 | 0xFF000000;
                                } else if ((field6799 + var53 & 0x4) == (field6796 + var7 & 0x4)) {
                                    var62 = field6782[field6761.field7241 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method217(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method2883(arg0, var49, var54, var51, var56, var59, var60, field6797[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class725 var63 = (class725) field6793.method1465((long) (var52 << 16 | var57), -6008);
                                if (var63 != null) {
                                    method2883(arg0, var49, var54, var51, var56, var59, var60, field6797[var58], var63.field9822, var63.field9823, true);
                                }
                            } else {
                                field6774[0] = (short) (var61 - 1);
                                field6770[0] = field6780[var58];
                                method2883(arg0, var49, var54, var51, var56, var59, var60, field6797[var58], field6774, field6770, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field6790 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field6790 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field6765.field2619 != -1) {
                            var68 = field6765.field2619 | 0xFF000000;
                        } else if ((field6799 + var64 & 0x4) == (field6796 + var7 & 0x4)) {
                            var68 = field6782[field6761.field7241 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method217(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field6794;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field6794;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field6796 + var8;
                if (var41 >= 0 && var41 < field6781) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field6790 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field6790 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field6779 + var42;
                            if (var46 >= 0 && var46 < field6789) {
                                int var47 = field6783[field6781 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method2891(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class725 var48 = (class725) field6793.method1465((long) (var41 << 16 | var46), -6008);
                                    if (var48 != null) {
                                        method2891(arg0, var38, var43, var40, var45, var48.field9822, var48.field9823);
                                    }
                                } else {
                                    field6774[0] = (short) (var47 - 1);
                                    field6770[0] = field6780[field6781 * var46 + var41];
                                    method2891(arg0, var38, var43, var40, var45, field6774, field6770);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field6796 >> 6;
        int var10 = field6779 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field6787 >> 6;
        int var12 = field6799 >> 6;
        if (var11 >= field6791[0].length) {
            var11 = field6791[0].length - 1;
        }
        if (var12 >= field6791[0][0].length) {
            var12 = field6791[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class174 var28 = field6791[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field6788 >> 6) + var14) * 64;
                        int var30 = ((field6785 >> 6) + var27) * 64;
                        for (class229 var31 = (class229) var28.method1301(8); var31 != null; var31 = (class229) var28.method1307((byte) -79)) {
                            int var32 = var31.field3320 + var29 - field6788 - field6796;
                            int var33 = var31.field3318 + var30 - field6785 - field6779;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field6794;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field6794;
                            int var36 = field6790 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field6790 - (arg2 * var33 + arg4 >> 16);
                            method2883(arg0, var34, var36, var35 - var34, var37 - var36, var31.field3319, var31.field3314 & 0xFF, var31.field3317, var31.field3315, var31.field3316, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class174 var17 = field6791[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field6788 >> 6) + var15) * 64;
                        int var19 = ((field6785 >> 6) + var16) * 64;
                        for (class229 var20 = (class229) var17.method1301(8); var20 != null; var20 = (class229) var17.method1307((byte) -75)) {
                            int var21 = var20.field3320 + var18 - field6788 - field6796;
                            int var22 = var20.field3318 + var19 - field6785 - field6779;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field6794;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field6794;
                            int var25 = field6790 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field6790 - (arg2 * var22 + arg4 >> 16);
                            method2891(arg0, var23, var25, var24 - var23, var26 - var25, var20.field3315, var20.field3316);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)Ldfa;", line = 1383)
    public static final class167 method2894(int arg0, int arg1) {
        for (class167 var2 = (class167) field6763.method1469(0); var2 != null; var2 = (class167) field6763.method1467(0)) {
            if (var2.field2624 && var2.method1255((byte) -120, arg0, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)Lmn;", line = 1397)
    public static final class368 method2895(int arg0, int arg1) {
        class368 var2 = new class368();
        for (class167 var3 = (class167) field6763.method1469(0); var3 != null; var3 = (class167) field6763.method1467(0)) {
            if (var3.field2624 && var3.method1255((byte) 29, arg0, arg1)) {
                var2.method2338(true, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "([B[B[SII)V", line = 1419)
    private static final void method2896(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field6789];
        int[] var6 = new int[field6789];
        int[] var7 = new int[field6789];
        int[] var8 = new int[field6789];
        int[] var9 = new int[field6789];
        for (int var10 = -5; var10 < field6781; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field6789; var13++) {
                int var10002;
                if (var11 < field6781) {
                    int var28 = arg0[field6781 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class103 var29 = field6762.method2753(true, var28 - 1);
                        var5[var13] += var29.field1836;
                        var6[var13] += var29.field1827;
                        var7[var13] += var29.field1830;
                        var8[var13] += var29.field1838;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field6781 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class103 var31 = field6762.method2753(true, var30 - 1);
                        var5[var13] -= var31.field1836;
                        var6[var13] -= var31.field1827;
                        var7[var13] -= var31.field1830;
                        var8[var13] -= var31.field1838;
                        var10002 = var9[var13]--;
                    }
                }
            }
            if (var10 >= 0) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                for (int var19 = -5; var19 < field6789; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field6789) {
                        var14 += var5[var20];
                        var15 += var6[var20];
                        var16 += var7[var20];
                        var17 += var8[var20];
                        var18 += var9[var20];
                    }
                    int var21 = var19 - 5;
                    if (var21 >= 0) {
                        var14 -= var5[var21];
                        var15 -= var6[var21];
                        var16 -= var7[var21];
                        var17 -= var8[var21];
                        var18 -= var9[var21];
                    }
                    if (var19 >= 0 && var18 > 0) {
                        if ((arg0[field6781 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field6781 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class34.method441(var16 / var18, (byte) 76, var15 / var18, var14 * 256 / var17);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field6781 * var19 + var10;
                            int var27 = class646.field8885[class160.method1228(class548.method3158(var25, 96, (byte) 76), 30) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }
}
