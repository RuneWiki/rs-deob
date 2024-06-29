import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class15 extends class381 {

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "[I")
    public int[] field328 = new int[1];

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "[I")
    public int[] field330 = new int[] { -1 };

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "[F")
    public static float[] field331 = new float[16];

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z[III[I)J")
    private final long method102(boolean arg0, int[] arg1, int arg2, int arg3, int[] arg4) {
        field327++;
        long[] var6 = class187.field2528;
        int var7 = 121 % ((arg2 + 46) / 33);
        long var8 = -1L;
        long var10 = var8 >>> 8 ^ var6[(int) ((var8 ^ (long) (arg3 >> 8)) & 0xFFL)];
        long var12 = var10 >>> 8 ^ var6[(int) (((long) arg3 ^ var10) & 0xFFL)];
        for (int var14 = 0; var14 < arg4.length; var14++) {
            long var18 = var12 >>> 8 ^ var6[(int) ((var12 ^ (long) (arg4[var14] >> 24)) & 0xFFL)];
            long var20 = var18 >>> 8 ^ var6[(int) (((long) (arg4[var14] >> 16) ^ var18) & 0xFFL)];
            long var22 = var6[(int) (((long) (arg4[var14] >> 8) ^ var20) & 0xFFL)] ^ var20 >>> 8;
            var12 = var22 >>> 8 ^ var6[(int) (((long) arg4[var14] ^ var22) & 0xFFL)];
        }
        if (arg1 != null) {
            for (int var15 = 0; var15 < 5; var15++) {
                var12 = var6[(int) (((long) arg1[var15] ^ var12) & 0xFFL)] ^ var12 >>> 8;
            }
        }
        return var12 >>> 8 ^ var6[(int) ((var12 ^ (long) (arg0 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lrm;ZLr;IIILhq;IBI)Lda;")
    public final class395 method103(class242 arg0, boolean arg1, class98 arg2, int arg3, int arg4, int arg5, class47 arg6, int arg7, byte arg8, int arg9) {
        field332++;
        class395 var11 = null;
        int var12 = arg3;
        class589 var13 = null;
        if (arg7 != -1) {
            var13 = class547.field8070.method408(arg7, false);
        }
        int[] var14 = this.field330;
        if (var13 != null && var13.field8550 != null) {
            var14 = new int[var13.field8550.length];
            for (int var15 = 0; var15 < var13.field8550.length; var15++) {
                int var16 = var13.field8550[var15];
                if (var16 >= 0 && this.field330.length > var16) {
                    var14[var15] = this.field330[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        if (arg8 <= 106) {
            this.field328 = null;
        }
        int var23 = 0;
        class128 var24 = null;
        class128 var25 = null;
        if (arg6 != null) {
            var12 = arg3 | 0x20;
            int var26 = arg6.field732[arg5];
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class203.field2769.method2967(-1, var27);
            if (var24 != null) {
                var18 |= var24.method913(127, var21);
                var17 |= var24.method916(var21, (byte) -103);
                var20 |= var24.method914((byte) -127, var21);
                var19 |= arg6.field726;
            }
            if ((arg6.field722 || class59.field959) && arg9 != -1 && arg9 < arg6.field732.length) {
                var23 = arg6.field729[arg5];
                int var28 = arg6.field732[arg9];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class203.field2769.method2967(-1, var22 >>> 16);
                }
                if (var25 != null) {
                    var18 |= var25.method913(83, var22);
                    var17 |= var25.method916(var22, (byte) -103);
                    var20 |= var25.method914((byte) -125, var22);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
            if (var20) {
                var12 |= 0x400;
            }
        }
        long var30 = this.method102(arg1, arg0 == null ? null : arg0.field3206, 60, arg7, var14);
        if (class222.field2941 != null) {
            var11 = (class395) class222.field2941.method3901(var30, -88);
        }
        if (var11 == null || arg2.method706(var11.method1027(), var12) != 0) {
            if (var11 != null) {
                var12 = arg2.method661(var12, var11.method1027());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class259.field3355.method2382(var14[var34], (byte) 28).method2411(arg1, 0)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class677[] var35 = new class677[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class259.field3355.method2382(var14[var36], (byte) 28).method2407((byte) -97, arg1);
                }
            }
            if (var13 != null && var13.field8534 != null) {
                for (int var37 = 0; var37 < var13.field8534.length; var37++) {
                    if (var13.field8534[var37] != null && var35[var37] != null) {
                        int var38 = var13.field8534[var37][0];
                        int var39 = var13.field8534[var37][1];
                        int var40 = var13.field8534[var37][2];
                        int var41 = var13.field8534[var37][3];
                        int var42 = var13.field8534[var37][4];
                        int var43 = var13.field8534[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method3800(var42, var43, (byte) -26, var41);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method3799(var38, var40, var39, 125);
                        }
                    }
                }
            }
            class677 var44 = new class677(var35, var35.length);
            if (arg0 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg2.method651(var44, var32, class365.field5348, 64, 850);
            if (arg0 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class383.field5749.length; var46++) {
                        if (arg0.field3206[var45] < class383.field5749[var46][var45].length) {
                            var11.method1052(class685.field9675[var46][var45], class383.field5749[var46][var45][arg0.field3206[var45]]);
                        }
                    }
                }
            }
            if (class222.field2941 != null) {
                var11.method1017(var12);
                class222.field2941.method3894(var11, (byte) 60, var30);
            }
        }
        if (arg6 == null || var24 == null) {
            return var11;
        } else {
            class395 var47 = var11.method1038((byte) 1, var12, true);
            var47.method2456(var23, var21, 0, var25, var24, arg4 - 1, var22, 0, arg6.field726);
            return var47;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public static final void method104(byte arg0) {
        for (int var1 = 0; var1 < class317.field4622.length; var1++) {
            for (int var2 = 0; var2 < class317.field4622[0].length; var2++) {
                for (int var3 = 0; var3 < class317.field4622[0][0].length; var3++) {
                    class317.field4622[var1][var2][var3] = 0;
                }
            }
        }
        field329++;
        if (arg0 != 19) {
            method104((byte) 115);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIII)V")
    public static final void method105(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field333++;
        if (arg4 != -27395) {
            field331 = null;
        }
        for (class65 var5 = (class65) class111.field1644.method1904(false); var5 != null; var5 = (class65) class111.field1644.method1901(124)) {
            class607.method3470(arg3, arg0, arg2, (byte) -79, var5, arg1);
        }
        for (class65 var6 = (class65) class232.field3072.method1904(false); var6 != null; var6 = (class65) class232.field3072.method1901(arg4 + 27508)) {
            byte var12 = 1;
            class589 var13 = var6.field1015.method2957(true);
            if (var6.field1015.field7334 == -1 || var6.field1015.field7404) {
                var12 = 0;
            } else if (var6.field1015.field7334 == var13.field8562 || var6.field1015.field7334 == var13.field8572 || var6.field1015.field7334 == var13.field8579 || var6.field1015.field7334 == var13.field8575) {
                var12 = 2;
            } else if (var6.field1015.field7334 == var13.field8543 || var6.field1015.field7334 == var13.field8554 || var6.field1015.field7334 == var13.field8557 || var6.field1015.field7334 == var13.field8539) {
                var12 = 3;
            }
            if (var6.field1024 != var12) {
                int var14 = class369.method2285(var6.field1015, 0);
                class76 var15 = var6.field1015.field805;
                if (var15.field1212 != null) {
                    var15 = var15.method443(class308.field4545, (byte) 119);
                }
                if (var15 == null || var14 == -1) {
                    var6.field1039 = -1;
                    var6.field1024 = var12;
                    var6.field1012 = false;
                } else if (var6.field1039 == var14 && var15.field1227 == var6.field1012) {
                    var6.field1024 = var12;
                    var6.field1016 = var15.field1193;
                } else {
                    boolean var16 = false;
                    if (var6.field1034 == null) {
                        var16 = true;
                    } else {
                        var6.field1016 -= 512;
                        if (var6.field1016 <= 0) {
                            class556.field8166.method2205(var6.field1034);
                            var16 = true;
                            var6.field1034 = null;
                        }
                    }
                    if (var16) {
                        var6.field1039 = var14;
                        var6.field1019 = null;
                        var6.field1012 = var15.field1227;
                        var6.field1016 = var15.field1193;
                        var6.field1014 = null;
                        var6.field1024 = var12;
                    }
                }
            }
            var6.field1020 = var6.field1015.field7895;
            var6.field1033 = var6.field1015.field7895 + (var6.field1015.method422((byte) 103) << 8);
            var6.field1027 = var6.field1015.field7896;
            var6.field1035 = var6.field1015.field7896 + (var6.field1015.method422((byte) -55) << 8);
            class607.method3470(arg3, arg0, arg2, (byte) -79, var6, arg1);
        }
        for (class65 var7 = (class65) class587.field8519.method1993(-74); var7 != null; var7 = (class65) class587.field8519.method1997(9831)) {
            byte var8 = 1;
            class589 var9 = var7.field1013.method2957(true);
            if (var7.field1013.field7334 == -1 || var7.field1013.field7404) {
                var8 = 0;
            } else if (var7.field1013.field7334 == var9.field8562 || var7.field1013.field7334 == var9.field8572 || var7.field1013.field7334 == var9.field8579 || var7.field1013.field7334 == var9.field8575) {
                var8 = 2;
            } else if (var7.field1013.field7334 == var9.field8543 || var7.field1013.field7334 == var9.field8554 || var7.field1013.field7334 == var9.field8557 || var7.field1013.field7334 == var9.field8539) {
                var8 = 3;
            }
            if (var7.field1024 != var8) {
                int var10 = class265.method1595(0, var7.field1013);
                if (var7.field1039 == var10 && var7.field1012 == var7.field1013.field1107) {
                    var7.field1024 = var8;
                    var7.field1016 = var7.field1013.field1121;
                } else {
                    boolean var11 = false;
                    if (var7.field1034 == null) {
                        var11 = true;
                    } else {
                        var7.field1016 -= 512;
                        if (var7.field1016 <= 0) {
                            class556.field8166.method2205(var7.field1034);
                            var11 = true;
                            var7.field1034 = null;
                        }
                    }
                    if (var11) {
                        var7.field1014 = null;
                        var7.field1016 = var7.field1013.field1121;
                        var7.field1019 = null;
                        var7.field1012 = var7.field1013.field1107;
                        var7.field1039 = var10;
                        var7.field1024 = var8;
                    }
                }
            }
            var7.field1020 = var7.field1013.field7895;
            var7.field1033 = var7.field1013.field7895 + (var7.field1013.method422((byte) -36) << 8);
            var7.field1027 = var7.field1013.field7896;
            var7.field1035 = var7.field1013.field7896 + (var7.field1013.method422((byte) 50) << 8);
            class607.method3470(arg3, arg0, arg2, (byte) -79, var7, arg1);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
    public static void method106(boolean arg0) {
        field331 = null;
        if (!arg0) {
            field331 = null;
        }
    }
}
