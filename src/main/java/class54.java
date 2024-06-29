import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class54 {

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Ljava/lang/String;")
    public static String field813 = "Please remove ";

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "[I")
    public static int[] field817 = new int[50];

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLlb;)V", line = 6)
    public static final void method478(byte arg0, class211 arg1) {
        field816++;
        class38.field577 = class269.method1874(0, arg1, 116, class65.field962);
        class263.field3937 = class176.method1276(0, arg1, class292.field4584, (byte) 57);
        int var2 = -26 / ((-arg0 - 8) / 36);
        class180.field2708 = class176.method1276(0, arg1, class27.field305, (byte) 57);
        class43.field673 = class176.method1276(0, arg1, class93.field1342, (byte) 57);
        class51.field788 = class176.method1276(0, arg1, class184.field2894, (byte) 57);
        class163.field2432 = class176.method1276(0, arg1, class87.field1284, (byte) 57);
        class40.field596 = class176.method1276(0, arg1, class201.field3193, (byte) 57);
        class200.field3172 = class99.method776(false, arg1, class102.field1582, 0);
        class200.field3163 = class258.method1794(0, arg1, class170.field2533, 25701);
        class121.field1888 = class258.method1794(0, arg1, class109.field1706, 25701);
        class278.field4269 = class183.method1330(arg1, (byte) -116, 0, client.field3796);
        class255.field3810 = class183.method1330(arg1, (byte) 68, 0, class218.field3443);
        class136.field2119.method433(class255.field3810, (int[]) null);
        class182.field2726.method433(class255.field3810, (int[]) null);
        class64.field956.method433(class255.field3810, (int[]) null);
        if (class36.field534) {
            class247.field3713 = class224.method1598(arg1, class217.field3421, 0, 37);
            for (int var3 = 0; var3 < class247.field3713.length; var3++) {
                class247.field3713[var3].method581();
            }
        }
        class134 var4 = class149.method1103(0, arg1, class10.field97, (byte) -53);
        var4.method1021();
        if (class36.field534) {
            class126.field1999 = new class221(var4);
        } else {
            class126.field1999 = var4;
        }
        class134[] var5 = class269.method1874(0, arg1, 59, class188.field2986);
        for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6].method1021();
        }
        if (class36.field534) {
            class228.field3528 = new class27[var5.length];
            for (int var7 = 0; var7 < var5.length; var7++) {
                class228.field3528[var7] = new class221(var5[var7]);
            }
        } else {
            class228.field3528 = var5;
        }
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 41.0D) - 20;
        int var11 = (int) (Math.random() * 21.0D) - 10;
        for (int var12 = 0; var12 < class38.field577.length; var12++) {
            class38.field577[var12].method1012(var8 + var10, var9 - -var10, var10 + var11);
        }
        if (class36.field534) {
            class126.field1998 = new class27[class38.field577.length];
            for (int var13 = 0; var13 < class38.field577.length; var13++) {
                class126.field1998[var13] = new class221(class38.field577[var13]);
            }
        } else {
            class126.field1998 = class38.field577;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I[[FILcj;[ILgi;[[FII[[I[[F)V", line = 107)
    public static final void method479(int arg0, float[][] arg1, int arg2, class318 arg3, int[] arg4, class216 arg5, float[][] arg6, int arg7, int arg8, int[][] arg9, float[][] arg10) {
        field814++;
        int[] var11 = new int[arg4.length / 2];
        int var12 = 0;
        if (arg0 != 18659) {
            field817 = (int[]) null;
        }
        while (var12 < var11.length) {
            int var13 = arg4[var12 + var12];
            int var14 = arg4[var12 + var12 + 1];
            if (arg2 == 1) {
                int var15 = var13;
                var13 = var14;
                var14 = 128 - var15;
            } else if (arg2 == 2) {
                var13 = 128 - var13;
                var14 = 128 - var14;
            } else if (arg2 == 3) {
                int var16 = var13;
                var13 = 128 - var14;
                var14 = var16;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg6[arg8][arg7];
                var18 = arg1[arg8][arg7];
                var19 = arg10[arg8][arg7];
            } else if (var13 == 128 && var14 == 0) {
                var19 = arg10[arg8 + 1][arg7];
                var17 = arg6[arg8 + 1][arg7];
                var18 = arg1[arg8 + 1][arg7];
            } else if (var13 == 128 && var14 == 128) {
                var19 = arg10[arg8 + 1][arg7 + 1];
                var18 = arg1[arg8 + 1][arg7 + 1];
                var17 = arg6[arg8 + 1][arg7 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var19 = arg10[arg8][arg7 + 1];
                var18 = arg1[arg8][arg7 + 1];
                var17 = arg6[arg8][arg7 + 1];
            } else {
                float var20 = arg6[arg8][arg7];
                float var21 = arg10[arg8][arg7];
                float var22 = arg1[arg8][arg7];
                float var23 = (float) var13 / 128.0F;
                float var24 = (arg1[arg8 + 1][arg7] - var22) * var23 + var22;
                float var25 = (arg10[arg8 + 1][arg7] - var21) * var23 + var21;
                float var26 = (arg6[arg8 + 1][arg7] - var20) * var23 + var20;
                float var27 = (float) var14 / 128.0F;
                float var28 = arg10[arg8][arg7 + 1];
                float var29 = (arg10[arg8 + 1][arg7 + 1] - var28) * var23 + var28;
                var19 = (var29 - var25) * var27 + var25;
                float var30 = arg6[arg8][arg7 + 1];
                float var31 = (arg6[arg8 + 1][arg7 + 1] - var30) * var23 + var30;
                var17 = (var31 - var26) * var27 + var26;
                float var32 = arg1[arg8][arg7 + 1];
                float var33 = (arg1[arg8 + 1][arg7 + 1] - var32) * var23 + var32;
                var18 = (var33 - var24) * var27 + var24;
            }
            int var34 = (arg7 << 7) + var14;
            int var35 = (arg8 << 7) + var13;
            int var36 = class49.method452(var14, arg7, arg8, arg9, var13, -11908);
            var11[var12] = arg5.method1550(arg3, var35, var36, var34, var19, var17, var18);
            var12++;
        }
        arg5.method1551(var11);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 225)
    public static void method480(int arg0) {
        field817 = null;
        field813 = null;
        if (arg0 != 21) {
            field817 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lhb;II)V", line = 236)
    public static final void method481(class35 arg0, int arg1, int arg2) {
        if (class278.field4273 != null) {
            try {
                class278.field4273.method1837(0L, 0);
                class278.field4273.method1838(24, arg2, arg0.field437, -1);
            } catch (Exception var5) {
            }
        }
        int var4 = -76 / ((arg1 - 81) / 44);
        field815++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 266)
    public static final String[] method482(int arg0, String[] arg1) {
        String[] var2 = new String[5];
        field811++;
        for (int var3 = arg0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZI[[F[ZIZBZIII[I[[I[[F[[IZI[[FLjn;IIB)V", line = 289)
    public static final void method483(boolean arg0, int arg1, float[][] arg2, boolean[] arg3, int arg4, boolean arg5, byte arg6, boolean arg7, int arg8, int arg9, int arg10, int[] arg11, int[][] arg12, float[][] arg13, int[][] arg14, boolean arg15, int arg16, float[][] arg17, class123 arg18, int arg19, int arg20, byte arg21) {
        field818++;
        if (arg21 > -112) {
            return;
        }
        int var22 = (arg5 ? 255 : 0) + (arg19 << 8);
        int var23 = (arg1 << 8) + (arg0 ? 255 : 0);
        int var24 = (arg16 << 8) + (arg15 ? 255 : 0);
        int[] var25 = new int[arg11.length / 2];
        int var26 = (arg8 << 8) + (arg7 ? 255 : 0);
        for (int var27 = 0; var27 < var25.length; var27++) {
            int var28 = arg11[var27 + var27];
            int var29 = arg11[var27 + var27 + 1];
            int[][] var30 = arg14 == null || arg3 == null || !arg3[var27] ? arg12 : arg14;
            var25[var27] = class203.method1467(var28, arg18, 104, var26, arg2, var29, arg6, var30, arg13, arg10, var22, arg14, var23, (float) arg9, false, arg4, arg17, var24);
        }
        arg18.method944(arg20, arg10, arg4, var25, (int[]) null, false);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V", line = 328)
    public static final void method484(int arg0) {
        field812++;
        if (class204.field3240 == 0) {
            return;
        }
        try {
            if (++class4.field26 > 2000) {
                if (class297.field4661 != null) {
                    class297.field4661.method916(-25224);
                    class297.field4661 = null;
                }
                if (class324.field5044 >= 1) {
                    class204.field3240 = 0;
                    class179.field2685 = -5;
                    return;
                }
                if (class208.field3276 == class196.field3101) {
                    class208.field3276 = class4.field20;
                } else {
                    class208.field3276 = class196.field3101;
                }
                class204.field3240 = 1;
                class324.field5044++;
                class4.field26 = 0;
            }
            if (arg0 != 255) {
                return;
            }
            if (class204.field3240 == 1) {
                class183.field2747 = class301.field4715.method162(class208.field3276, (byte) -98, class255.field3816);
                class204.field3240 = 2;
            }
            if (class204.field3240 == 2) {
                if (class183.field2747.field3585 == 2) {
                    throw new IOException();
                }
                if (class183.field2747.field3585 != 1) {
                    return;
                }
                class297.field4661 = new class118((Socket) class183.field2747.field3590, class301.field4715);
                class183.field2747 = null;
                class297.field4661.method920((byte) -76, class159.field2372.field437, 0, class159.field2372.field455);
                if (class256.field3818 != null) {
                    class256.field3818.method1858((byte) 101);
                }
                if (class261.field3861 != null) {
                    class261.field3861.method1858((byte) 26);
                }
                int var1 = class297.field4661.method918(arg0 ^ 0xFF);
                if (class256.field3818 != null) {
                    class256.field3818.method1858((byte) 42);
                }
                if (class261.field3861 != null) {
                    class261.field3861.method1858((byte) 97);
                }
                if (var1 != 21) {
                    class204.field3240 = 0;
                    class179.field2685 = var1;
                    class297.field4661.method916(-25224);
                    class297.field4661 = null;
                    return;
                }
                class204.field3240 = 3;
            }
            if (class204.field3240 == 3) {
                if (class297.field4661.method915(0) < 1) {
                    return;
                }
                class60.field891 = new String[class297.field4661.method918(0)];
                class204.field3240 = 4;
            }
            if (class204.field3240 == 4) {
                if (class297.field4661.method915(arg0 ^ 0xFF) < class60.field891.length * 8) {
                    return;
                }
                class88.field1293.field455 = 0;
                class297.field4661.method919(class60.field891.length * 8, class88.field1293.field437, 10224, 0);
                for (int var2 = 0; var2 < class60.field891.length; var2++) {
                    class60.field891[var2] = class92.method730(class88.field1293.method289((byte) 126), -20313);
                }
                class204.field3240 = 0;
                class179.field2685 = 21;
                class297.field4661.method916(-25224);
                class297.field4661 = null;
                return;
            }
        } catch (IOException var4) {
            if (class297.field4661 != null) {
                class297.field4661.method916(-25224);
                class297.field4661 = null;
            }
            if (class324.field5044 < 1) {
                class4.field26 = 0;
                class204.field3240 = 1;
                if (class208.field3276 == class196.field3101) {
                    class208.field3276 = class4.field20;
                } else {
                    class208.field3276 = class196.field3101;
                }
                class324.field5044++;
            } else {
                class204.field3240 = 0;
                class179.field2685 = -4;
            }
        }
    }
}
