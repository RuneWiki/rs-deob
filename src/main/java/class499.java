import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class499 {

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "Z")
    public boolean field6816 = false;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "Z")
    public static boolean field6821 = false;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "Lcq;")
    public static class494 field6814 = new class494();

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field6826 = -1;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field6812;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field6819;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field6824;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public static int field6827;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "Lma;")
    public static class14 field6818;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILsk;ZI)Z")
    public abstract boolean method290(int arg0, int arg1, class650 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lsk;)V")
    public abstract void method312(class650 arg0);

    @OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
    public abstract boolean method277();

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILs;Ls;III)V")
    public abstract void method280(int arg0, int arg1, class296 arg2, class296 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
    public abstract int method297();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lsk;IZ)V")
    public abstract void method293(class650 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILija;)V")
    public final void method2852(int arg0, int arg1, class366 arg2) {
        field6812++;
        if (arg0 == -1) {
            return;
        }
        this.method314();
        if (!this.method277()) {
            this.method328();
            return;
        }
        class167 var4 = arg2.field4964[arg0];
        class38 var5 = var4.field2687;
        for (int var6 = arg1; var6 < var4.field2701; var6++) {
            short var7 = var4.field2686[var6];
            if (var5.field646[var7]) {
                if (var4.field2693[var6] != -1) {
                    this.method317(0, 0, 0, 0);
                }
                this.method317(var5.field643[var7], var4.field2690[var6], var4.field2689[var6], var4.field2698[var6]);
            }
        }
        this.method284();
        this.method328();
    }

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
    public abstract void method318(int arg0);

    @OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lr;)Lr;")
    public abstract class196 method325(class196 arg0);

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
    public abstract void method317(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III[ZLija;IZIIIILija;ILija;Lija;)V")
    public final void method2853(int arg0, int arg1, int arg2, boolean[] arg3, class366 arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, class366 arg11, int arg12, class366 arg13, class366 arg14) {
        field6823++;
        if (arg9 == -1) {
            return;
        }
        if (arg3 == null || arg2 == -1) {
            this.method2854(0, arg6, arg1, arg10, arg5, 96, arg11, arg13, arg9);
            return;
        }
        this.method314();
        if (!this.method277()) {
            this.method328();
            return;
        }
        class167 var16 = arg11.field4964[arg9];
        class38 var17 = var16.field2687;
        class167 var18 = null;
        if (arg0 < 23) {
            field6818 = null;
        }
        if (arg13 != null) {
            var18 = arg13.field4964[arg5];
            if (var18.field2687 != var17) {
                var18 = null;
            }
        }
        this.method2861(var17, null, var16, arg6, 65535, arg10, 0, var18, arg3, arg1, 0, false);
        class167 var19 = arg14.field4964[arg2];
        class167 var20 = null;
        if (arg4 != null) {
            var20 = arg4.field4964[arg7];
            if (var20.field2687 != var17) {
                var20 = null;
            }
        }
        this.method309(0, new int[0], 0, 0, 0, 0, arg6);
        this.method2861(var19.field2687, null, var19, arg6, 65535, arg12, 0, var20, arg3, arg8, 0, true);
        this.method284();
        this.method328();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
    public abstract void method294();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZIIIILija;Lija;I)V")
    public final void method2854(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, class366 arg6, class366 arg7, int arg8) {
        field6815++;
        if (arg8 == -1) {
            return;
        }
        this.method314();
        if (!this.method277()) {
            this.method328();
            return;
        }
        class167 var10 = arg6.field4964[arg8];
        class38 var11 = var10.field2687;
        class167 var12 = null;
        if (arg7 != null) {
            var12 = arg7.field4964[arg4];
            if (var12.field2687 != var11) {
                var12 = null;
            }
        }
        this.method2861(var11, null, var10, arg1, 65535, arg3, 0, var12, null, arg2, arg0, false);
        this.method284();
        this.method328();
        int var13 = 66 / ((arg5 + 33) / 44);
    }

    @OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
    public abstract int method292();

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
    public abstract int method304();

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
    public abstract void method285(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lsk;Leea;II)V")
    public abstract void method310(class650 arg0, class144 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
    public abstract void method289(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
    public abstract void method284();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method306(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
    public abstract void method328();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;IIIZ)V")
    public abstract void method281(class499 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
    public abstract void method282(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZIIIIII)J")
    public static final long method2855(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class60.field828.clear();
        if (!arg0) {
            field6825 = -64;
        }
        field6827++;
        class60.field828.set(arg1, arg3, arg6, arg4, arg2, arg5);
        return class60.field828.getTime().getTime();
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()Z")
    public abstract boolean method288();

    @OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
    public abstract void method279(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lka;")
    public abstract class499 method324(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
    public abstract int method291();

    @OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
    public abstract void method308(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
    public abstract int method283();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III[II[IIZII)V")
    private final void method2856(int arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6, boolean arg7, int arg8, int arg9) {
        field6820++;
        if (arg1 == 1) {
            if (arg8 == 0 || arg8 == 1) {
                int var16 = -arg6;
                arg6 = arg9;
                arg9 = var16;
            } else if (arg8 == 3) {
                int var15 = arg6;
                arg6 = arg9;
                arg9 = var15;
            } else if (arg8 == 2) {
                int var14 = arg6;
                arg6 = -arg9 & 0x3FFF;
                arg9 = var14 & 0x3FFF;
            }
        } else if (arg1 == 2) {
            if (arg8 == 0 || arg8 == 1) {
                arg6 = -arg6;
                arg9 = -arg9;
            } else if (arg8 == 2) {
                arg6 = -arg6 & 0x3FFF;
                arg9 = -arg9 & 0x3FFF;
            }
        } else if (arg1 == 3) {
            if (arg8 == 0 || arg8 == 1) {
                int var13 = arg6;
                arg6 = -arg9;
                arg9 = var13;
            } else if (arg8 == 3) {
                int var11 = arg6;
                arg6 = arg9;
                arg9 = var11;
            } else if (arg8 == 2) {
                int var12 = arg6;
                arg6 = arg9 & 0x3FFF;
                arg9 = -var12 & 0x3FFF;
            }
        }
        if (arg4 == 65535) {
            this.method309(arg8, arg5, arg6, arg2, arg9, arg1, arg7);
        } else {
            this.method289(arg8, arg5, arg6, arg2, arg9, arg7, arg4, arg3);
        }
        if (arg0 >= -120) {
            this.method297();
        }
    }

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
    public abstract void method303(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILha;)V")
    public static final void method2857(int arg0, class66 arg1) {
        field6813++;
        if (!(class690.field9574 >= 2 || class675.field9384) || class84.field1157 != null) {
            return;
        }
        String var2;
        if (class675.field9384 && class690.field9574 < 2) {
            var2 = class508.field6980 + class641.field8850.method3566((byte) -89, class464.field6309) + class420.field5726 + " ->";
        } else if (class318.field4334 && class789.field10821.method1531(96, 81) && class690.field9574 > 2) {
            var2 = class356.method2199((byte) 41, class603.field8440);
        } else {
            class534 var3 = class603.field8440;
            if (var3 == null) {
                return;
            }
            var2 = class356.method2199((byte) 41, var3);
            int[] var4 = null;
            if (class375.method2273((byte) -87, var3.field7229)) {
                var4 = class143.field2427.method1410((byte) 7, (int) var3.field7231).field10030;
            } else if (var3.field7234 != -1) {
                var4 = class143.field2427.method1410((byte) 33, var3.field7234).field10030;
            } else if (class93.method741(-81, var3.field7229)) {
                class755 var7 = (class755) class664.field9216.method337((long) ((int) var3.field7231), 1);
                if (var7 != null) {
                    class666 var8 = var7.field10414;
                    class568 var9 = var8.field9253;
                    if (var9.field8023 != null) {
                        var9 = var9.method3283((byte) -123, class694.field9613);
                    }
                    if (var9 != null) {
                        var4 = var9.field8054;
                    }
                }
            } else if (class453.method2619(86, var3.field7229)) {
                Object var5 = null;
                class445 var6;
                if (var3.field7229 == 1007) {
                    var6 = class414.field5670.method2319((int) var3.field7231, false);
                } else {
                    var6 = class414.field5670.method2319((int) (var3.field7231 >>> 32 & 0x7FFFFFFFL), false);
                }
                if (var6.field6028 != null) {
                    var6 = var6.method2580(35, class694.field9613);
                }
                if (var6 != null) {
                    var4 = var6.field6093;
                }
            }
            if (var4 != null) {
                var2 = var2 + class57.method408((byte) -99, var4);
            }
        }
        if (class690.field9574 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class690.field9574 - 2) + class641.field8843.method3566((byte) -106, class464.field6309);
        }
        if (arg0 >= -58) {
            field6821 = false;
        }
        if (class576.field8175 != null) {
            class67 var11 = class576.field8175.method113(-57, arg1);
            if (var11 == null) {
                var11 = class557.field7861;
            }
            var11.method601(class576.field8175.field342, class576.field8175.field285, class146.field2462, var2, class84.field1150, -22679, class778.field10729, class461.field6257, class576.field8175.field389, class576.field8175.field330, class711.field9781, class576.field8175.field273, class201.field3054, class599.field8385, class576.field8175.field347);
            class735.method4081(class778.field10729[0], class778.field10729[1], class778.field10729[2], class778.field10729[3], (byte) -92);
        } else if (class6.field120 != null && class505.field6887 == class177.field2797) {
            int var10 = class557.field7861.method600(16777215, class146.field2462, class651.field9024 + 16, false, class201.field3054, class599.field8385, 0, var2, class624.field8691 + 4, class461.field6257);
            class735.method4081(class624.field8691 + 4, class651.field9024, var10 + class333.field4511.method1172(var2, (byte) 41), 16, (byte) -117);
            return;
        }
    }

    @OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
    public abstract void method316(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLfca;I)Ljava/lang/String;")
    public static final String method2858(byte arg0, class93 arg1, int arg2) {
        field6819++;
        try {
            int var3 = arg1.method746(false);
            if (var3 > arg2) {
                var3 = arg2;
            }
            int var4 = 125 / ((arg0 - 14) / 45);
            byte[] var5 = new byte[var3];
            arg1.field1442 += class223.field3254.method2527(0, var5, var3, arg1.field1413, arg1.field1442, false);
            return class784.method4279(var5, var3, 0, 255);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
    public abstract boolean method326();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILsk;ZII)Z")
    public abstract boolean method286(int arg0, int arg1, class650 arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
    public abstract int method295();

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
    public abstract boolean method327();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method309(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
    public abstract int method298();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILs;IIIIII)V")
    public final void method2859(int arg0, int arg1, class296 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6822++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg6 / 2;
        int var14 = -arg5 / 2;
        int var15 = arg2.method1907(arg4 + var13, (byte) 91, arg8 + var14);
        int var16 = arg6 / 2;
        int var17 = -arg5 / 2;
        int var18 = arg2.method1907(arg4 + var16, (byte) 102, arg8 + var17);
        int var19 = -arg6 / 2;
        int var20 = arg5 / 2;
        int var21 = arg2.method1907(arg4 + var19, (byte) 96, arg8 + var20);
        int var22 = arg6 / 2;
        int var23 = arg5 / 2;
        int var24 = arg2.method1907(arg4 + var22, (byte) 96, arg8 + var23);
        int var25 = var15 < var18 ? var15 : var18;
        int var26 = var21 < var24 ? var21 : var24;
        int var27 = var24 <= var18 ? var24 : var18;
        if (arg1 != arg5) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg0 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg0;
                        if (var28 < var29) {
                            var28 = var29;
                        }
                    } else if (var28 > arg0) {
                        var28 = arg0;
                    }
                }
                this.method316(var28);
            }
        }
        int var30 = var15 < var21 ? var15 : var21;
        if (arg6 != 0) {
            int var31 = (int) (Math.atan2((double) (var30 - var27), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg7 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg7;
                        if (var32 > var31) {
                            var31 = var32;
                        }
                    } else if (var31 > arg7) {
                        var31 = arg7;
                    }
                }
                this.method302(var31);
            }
        }
        int var33 = var15 + var24;
        if (var18 + var21 < var33) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg3;
        if (var34 != 0) {
            this.method305(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
    public abstract void method314();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lsk;Leea;I)V")
    public abstract void method301(class650 arg0, class144 arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public abstract void method320(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILija;II[IIIZLija;IB)V")
    public final void method2860(int arg0, class366 arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, boolean arg7, class366 arg8, int arg9, byte arg10) {
        field6824++;
        if (arg9 == -1) {
            return;
        }
        this.method314();
        if (!this.method277()) {
            this.method328();
            return;
        }
        class167 var12 = arg1.field4964[arg9];
        class38 var13 = var12.field2687;
        class167 var14 = null;
        int var15 = 25 % ((8 - arg10) / 59);
        if (arg8 != null) {
            var14 = arg8.field4964[arg5];
            if (var14.field2687 != var13) {
                var14 = null;
            }
        }
        this.method2861(var13, arg4, var12, arg7, arg6, arg2, 0, var14, null, arg0, arg3, false);
        this.method284();
        this.method328();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Luja;[ILg;ZIIILg;[ZIIZ)V")
    private final void method2861(class38 arg0, int[] arg1, class167 arg2, boolean arg3, int arg4, int arg5, int arg6, class167 arg7, boolean[] arg8, int arg9, int arg10, boolean arg11) {
        field6817++;
        if (arg7 == null || arg5 == 0) {
            for (int var38 = 0; var38 < arg2.field2701; var38++) {
                short var39 = arg2.field2686[var38];
                if (arg8 == null || arg8[var39] == arg11 || arg0.field643[var39] == 0) {
                    short var40 = arg2.field2693[var38];
                    if (var40 != -1) {
                        this.method2856(-123, arg10, 0, arg1, arg0.field644[var40] & arg4, arg0.field641[var40], 0, arg3, 0, 0);
                    }
                    this.method2856(arg6 - 124, arg10, arg2.field2689[var38], arg1, arg0.field644[var39] & arg4, arg0.field641[var39], arg2.field2690[var38], arg3, arg0.field643[var39], arg2.field2698[var38]);
                }
            }
            return;
        }
        int var13 = arg6;
        int var14 = 0;
        for (int var15 = 0; var15 < arg0.field645; var15++) {
            boolean var16 = false;
            if (var13 < arg2.field2701 && arg2.field2686[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg7.field2701 > var14 && arg7.field2686[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg8 == null || arg11 == arg8[var15] || arg0.field643[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg0.field643[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    byte var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var23 = arg2.field2693[var13];
                        var21 = arg2.field2690[var13];
                        var24 = arg2.field2698[var13];
                        var20 = arg2.field2689[var13];
                        var22 = arg2.field2688[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var21 = var18;
                        var22 = 0;
                        var23 = -1;
                        var24 = var18;
                    }
                    short var25;
                    short var26;
                    short var27;
                    short var28;
                    byte var29;
                    if (var17) {
                        var25 = arg7.field2698[var14];
                        var26 = arg7.field2693[var14];
                        var27 = arg7.field2689[var14];
                        var28 = arg7.field2690[var14];
                        var29 = arg7.field2688[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var29 = 0;
                        var27 = var18;
                        var26 = -1;
                        var28 = var18;
                    }
                    int var31;
                    int var32;
                    int var33;
                    if ((var22 & 0x2) != 0 || (var29 & 0x1) != 0) {
                        var32 = var24;
                        var33 = var20;
                        var31 = var21;
                    } else if (var19 == 2) {
                        int var35 = var28 - var21 & 0x3FFF;
                        int var36 = var27 - var20 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        int var37 = var25 - var24 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var33 = arg5 * var36 / arg9 + var20 & 0x3FFF;
                        var31 = arg5 * var35 / arg9 + var21 & 0x3FFF;
                        var32 = var24 + (arg5 * var37 / arg9) & 0x3FFF;
                    } else if (var19 == 9) {
                        int var30 = var28 - var21 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var31 = arg5 * var30 / arg9 + var21 & 0x3FFF;
                        var32 = 0;
                        var33 = 0;
                    } else if (var19 == 7) {
                        int var34 = var28 - var21 & 0x3F;
                        if (var34 >= 32) {
                            var34 -= 64;
                        }
                        var31 = arg5 * var34 / arg9 + var21 & 0x3F;
                        var33 = (var27 - var20) * arg5 / arg9 + var20;
                        var32 = (var25 - var24) * arg5 / arg9 + var24;
                    } else {
                        var33 = var20 + ((var27 - var20) * arg5 / arg9);
                        var32 = var24 + ((var25 - var24) * arg5 / arg9);
                        var31 = (var28 - var21) * arg5 / arg9 + var21;
                    }
                    if (var23 != -1) {
                        this.method2856(-127, arg10, 0, arg1, arg0.field644[var23] & arg4, arg0.field641[var23], 0, arg3, 0, 0);
                    } else if (var26 != -1) {
                        this.method2856(-122, arg10, 0, arg1, arg0.field644[var26] & arg4, arg0.field641[var26], 0, arg3, 0, 0);
                    }
                    this.method2856(-123, arg10, var33, arg1, arg0.field644[var15] & arg4, arg0.field641[var15], var31, arg3, var19, var32);
                } else {
                    if (var16) {
                        var13++;
                    }
                    if (var17) {
                        var14++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
    public abstract void method305(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
    public abstract void method307(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()[Lqr;")
    public abstract class72[] method322();

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()[Loea;")
    public abstract class624[] method311();

    @OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
    public abstract int method300();

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
    public abstract void method323();

    @OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
    public abstract int method276();

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
    public static void method2862(int arg0) {
        field6818 = null;
        field6814 = null;
        int var1 = 9 % ((-arg0 - 20) / 44);
    }

    @OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
    public abstract void method302(int arg0);

    @OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
    public abstract int method296();

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
    public abstract int method315();
}
