import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class200 extends class21 {

    @OriginalMember(owner = "client!bj", name = "T", descriptor = "Lsl;")
    public static class39 field3197 = new class39(16);

    @OriginalMember(owner = "client!bj", name = "U", descriptor = "Lab;")
    public static class279 field3198 = new class279(100);

    @OriginalMember(owner = "client!bj", name = "N", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!bj", name = "O", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!bj", name = "P", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!bj", name = "Q", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!bj", name = "R", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!bj", name = "S", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!bj", name = "V", descriptor = "[Loj;")
    public static class283[] field3199;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)V", line = 8)
    public static void method1274(int arg0) {
        field3198 = null;
        field3199 = null;
        if (arg0 == 4) {
            field3197 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(II)V", line = 20)
    public static final void method1275(int arg0, int arg1) {
        class47 var2 = class326.field4975[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class47 var4 = class326.field4975[var3][arg0][arg1] = class326.field4975[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field962--;
                for (int var5 = 0; var5 < var4.field969; var5++) {
                    class271 var6 = var4.field974[var5];
                    if ((var6.field4191 >> 29 & 0x3L) == 2L && var6.field4180 == arg0 && var6.field4187 == arg1) {
                        var6.field4175--;
                    }
                }
            }
        }
        if (class326.field4975[0][arg0][arg1] == null) {
            class326.field4975[0][arg0][arg1] = new class47(0, arg0, arg1);
        }
        class326.field4975[0][arg0][arg1].field976 = var2;
        class326.field4975[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)[I", line = 58)
    public final int[] method177(int arg0, int arg1) {
        int[] var3 = this.field443.method1040(arg1, false);
        if (this.field443.field2637) {
            int[][] var4 = this.method173(0, arg1, (byte) 100);
            int[] var5 = var4[2];
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            for (int var8 = 0; var8 < class294.field4489; var8++) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        field3195++;
        int var9 = 34 / ((arg0 - 33) / 36);
        return var3;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(ZI)V", line = 97)
    public static final void method1276(boolean arg0, int arg1) {
        field3192++;
        if (arg1 == -1 || !class303.field4607[arg1]) {
            return;
        }
        class302.field4577.method2039(121, arg1);
        if (class138.field2300[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class138.field2300[arg1].length; var3++) {
            if (class138.field2300[arg1][var3] != null) {
                if (class138.field2300[arg1][var3].field1358 == 2) {
                    var2 = false;
                } else {
                    class138.field2300[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class138.field2300[arg1] = null;
        }
        class303.field4607[arg1] = arg0;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V", line = 140)
    public class200() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIILu;II)V", line = 151)
    public static final void method1277(int arg0, int arg1, int arg2, int arg3, class25 arg4, int arg5, int arg6) {
        field3194++;
        long var7 = 0L;
        if (arg2 == 0) {
            var7 = class14.method104(arg6, arg5, arg1);
        } else if (arg2 == 1) {
            var7 = class342.method2371(arg6, arg5, arg1);
        } else if (arg2 == 2) {
            var7 = class194.method1239(arg6, arg5, arg1);
        } else if (arg2 == 3) {
            var7 = class131.method864(arg6, arg5, arg1);
        }
        if (arg0 != -371909580) {
            method1274(-123);
        }
        boolean var9 = true;
        boolean var10 = false;
        int var11 = ((int) var7 & 0x7F67F) >> 14;
        boolean var12 = false;
        int var13 = ((int) var7 & 0x39C413) >> 20;
        int var14 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        class31 var15 = class277.method1864(var14, arg0 + 371909580);
        if (var15.method255(arg0 + 371877474)) {
            class172.method1090(arg5, arg1, var15, arg6, 0);
        }
        if (var7 == 0L) {
            return;
        }
        class19 var16 = null;
        class19 var17 = null;
        if (arg2 == 0) {
            class41 var18 = class186.method1191(arg6, arg5, arg1);
            if (var18 != null) {
                var17 = var18.field788;
                var16 = var18.field796;
            }
            if (var15.field624 != 0) {
                arg4.method202(var15.field639, arg1, var13, !var15.field614, arg5, var11, arg0 ^ 0xE9D51C1B);
            }
        } else if (arg2 == 1) {
            class11 var21 = class2.method11(arg6, arg5, arg1);
            if (var21 != null) {
                var16 = var21.field224;
                var17 = var21.field231;
            }
        } else if (arg2 == 2) {
            class271 var20 = class173.method1091(arg6, arg5, arg1);
            if (var20 != null) {
                var16 = var20.field4182;
            }
            if (var15.field624 != 0 && (var15.field589 + arg5) < 104 && (var15.field589 + arg1) < 104 && (var15.field616 + arg5) < 104 && arg1 + var15.field616 < 104) {
                arg4.method208(arg5, var15.field589, var13, arg1, (byte) -51, var15.field616, !var15.field614, var15.field639);
            }
        } else if (arg2 == 3) {
            class289 var19 = class146.method947(arg6, arg5, arg1);
            if (var19 != null) {
                var16 = var19.field4443;
            }
            if (var15.field624 == 1) {
                arg4.method206((byte) 51, arg1, arg5);
            }
        }
        if (var15.field597 != null) {
            var15 = var15.method250((byte) -65);
        }
        if (!class249.field3893 || var15 == null || !var15.field615) {
            return;
        }
        if (var11 == 2) {
            if (var16 instanceof class331) {
                ((class331) var16).method2294(-1650);
            } else {
                class122.method795(var13 + 4, arg5, arg1, var15, 0, 0, (byte) -127, var11, arg3);
            }
            if ((var17 instanceof class331)) {
                ((class331) var17).method2294(-1650);
            } else {
                class122.method795(var13 + 1 & 0x3, arg5, arg1, var15, 0, 0, (byte) -127, var11, arg3);
            }
        } else if (var11 == 5) {
            if (var16 instanceof class331) {
                ((class331) var16).method2294(arg0 + 371907930);
            } else {
                class122.method795(var13, arg5, arg1, var15, class62.field1191[var13] * 8, class24.field483[var13] * 8, (byte) -128, 4, arg3);
            }
        } else if (var11 == 6) {
            if ((var16 instanceof class331)) {
                ((class331) var16).method2294(arg0 + 371907930);
            } else {
                class122.method795(var13 + 4, arg5, arg1, var15, class215.field3439[var13] * 8, class46.field948[var13] * 8, (byte) -126, 4, arg3);
            }
        } else if (var11 == 7) {
            if ((var16 instanceof class331)) {
                ((class331) var16).method2294(arg0 ^ 0x162AE5BA);
            } else {
                class122.method795((var13 + 2 & 0x3) + 4, arg5, arg1, var15, 0, 0, (byte) -125, 4, arg3);
            }
        } else if (var11 == 8) {
            if ((var16 instanceof class331)) {
                ((class331) var16).method2294(-1650);
            } else {
                class122.method795(var13 + 4, arg5, arg1, var15, class215.field3439[var13] * 8, class46.field948[var13] * 8, (byte) -125, 4, arg3);
            }
            if (var17 instanceof class331) {
                ((class331) var17).method2294(-1650);
            } else {
                class122.method795((var13 + 2 & 0x3) + 4, arg5, arg1, var15, class215.field3439[var13] * 8, class46.field948[var13] * 8, (byte) -123, 4, arg3);
            }
        } else if (var11 == 11) {
            if (var16 instanceof class331) {
                ((class331) var16).method2294(-1650);
            } else {
                class122.method795(var13 + 4, arg5, arg1, var15, 0, 0, (byte) -124, 10, arg3);
            }
        } else if (var16 instanceof class331) {
            ((class331) var16).method2294(-1650);
        } else {
            class122.method795(var13, arg5, arg1, var15, 0, 0, (byte) -127, var11, arg3);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/lang/String;ILkl;)Ljava/lang/String;", line = 345)
    public static final String method1278(String arg0, int arg1, class68 arg2) {
        if (arg1 != 8) {
            return (String) null;
        }
        if (arg0.indexOf("%") != -1) {
            label57: while (true) {
                int var3 = arg0.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg0.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg0.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg0.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg0.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label57;
                                                        }
                                                        String var9 = "";
                                                        if (class326.field4986 != null) {
                                                            if (class326.field4986.field1853 == null) {
                                                                var9 = class147.method955(4803, class326.field4986.field1850);
                                                            } else {
                                                                var9 = (String) class326.field4986.field1853;
                                                            }
                                                        }
                                                        arg0 = arg0.substring(0, var8) + var9 + arg0.substring(var8 + 4);
                                                    }
                                                }
                                                arg0 = arg0.substring(0, var7) + client.method356(class259.method1737(14, arg2, 4), 0) + arg0.substring(var7 + 2);
                                            }
                                        }
                                        arg0 = arg0.substring(0, var6) + client.method356(class259.method1737(14, arg2, 3), 0) + arg0.substring(var6 + 2);
                                    }
                                }
                                arg0 = arg0.substring(0, var5) + client.method356(class259.method1737(arg1 + 6, arg2, 2), 0) + arg0.substring(var5 + 2);
                            }
                        }
                        arg0 = arg0.substring(0, var4) + client.method356(class259.method1737(arg1 + 6, arg2, 1), 0) + arg0.substring(var4 + 2);
                    }
                }
                arg0 = arg0.substring(0, var3) + client.method356(class259.method1737(14, arg2, 0), 0) + arg0.substring(var3 + 2);
            }
        }
        field3196++;
        return arg0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 434)
    public static final void method1279(byte arg0, Component arg1) {
        if (arg0 != -11) {
            field3199 = (class283[]) null;
        }
        arg1.addMouseListener(class95.field1710);
        arg1.addMouseMotionListener(class95.field1710);
        field3193++;
        arg1.addFocusListener(class95.field1710);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([Ljava/lang/Object;I[J)V", line = 456)
    public static final void method1280(Object[] arg0, int arg1, long[] arg2) {
        if (arg1 != 2) {
            method1275(-43, -47);
        }
        field3191++;
        class176.method1108(0, (byte) -1, arg2, arg2.length - 1, arg0);
    }
}
