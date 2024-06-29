import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class201 {

    @OriginalMember(owner = "client!b", name = "M", descriptor = "Ldg;")
    private class261 field2959 = null;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "Z")
    private boolean field2931;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public int field2925;

    @OriginalMember(owner = "client!b", name = "D", descriptor = "Lsr;")
    private class151 field2952;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    public static int field2946 = 0;

    @OriginalMember(owner = "client!b", name = "P", descriptor = "Lcp;")
    public static class470 field2962;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "Ljava/lang/String;")
    public static String field2965;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!b", name = "B", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!b", name = "C", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!b", name = "E", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!b", name = "G", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!b", name = "H", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!b", name = "J", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!b", name = "K", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!b", name = "L", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!b", name = "N", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "[Ljava/lang/Object;")
    private Object[] field2941;

    @OriginalMember(owner = "client!b", name = "O", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field2961;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZLjava/awt/Frame;Lmj;)V")
    public static final void method1227(boolean arg0, Frame arg1, class430 arg2) {
        while (true) {
            class366 var3 = arg2.method2522((byte) -108, arg1);
            while (var3.field5253 == 0) {
                class111.method713(57, 10L);
            }
            if (var3.field5253 == 1) {
                field2954++;
                arg1.setVisible(arg0);
                arg1.dispose();
                return;
            }
            class111.method713(55, 100L);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)[B")
    public final byte[] method1228(int arg0, int arg1) {
        field2956++;
        if (!this.method1256(110)) {
            return null;
        } else if (this.field2959.field3824.length == 1) {
            return this.method1257(arg0, 0, 24558);
        } else if (!this.method1239(arg0, -21697)) {
            return null;
        } else if (this.field2959.field3824[arg0] == 1) {
            return this.method1257(0, arg0, 24558);
        } else {
            if (arg1 < 3) {
                this.field2941 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)I")
    public final int method1229(byte arg0) {
        field2953++;
        if (!this.method1256(arg0 ^ 0xFFFFFFE1)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2941.length; var4++) {
            if (this.field2959.field3831[var4] > 0) {
                var2 += 100;
                var3 += this.method1236((byte) -59, var4);
            }
        }
        if (arg0 != -53) {
            this.method1231(58);
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(II)Z")
    public final boolean method1230(int arg0, int arg1) {
        field2940++;
        if (!this.method1256(-121)) {
            return false;
        } else if (this.field2959.field3824.length == 1) {
            return this.method1237(0, 0, arg1);
        } else {
            int var3 = 83 / ((39 - arg0) / 42);
            if (!this.method1239(arg1, -21697)) {
                return false;
            } else if (this.field2959.field3824[arg1] == 1) {
                return this.method1237(arg1, 0, 0);
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public final void method1231(int arg0) {
        field2930++;
        int var2 = 51 % ((-arg0 - 60) / 39);
        if (this.field2961 != null) {
            for (int var3 = 0; var3 < this.field2961.length; var3++) {
                this.field2961[var3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)[I")
    public final int[] method1232(int arg0, byte arg1) {
        field2923++;
        if (!this.method1239(arg0, -21697)) {
            return null;
        } else if (arg1 >= -102) {
            return null;
        } else {
            int[] var3 = this.field2959.field3818[arg0];
            if (var3 == null) {
                var3 = new int[this.field2959.field3831[arg0]];
                int var4 = 0;
                while (var3.length > var4) {
                    var3[var4] = var4++;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)I")
    public final int method1233(int arg0) {
        field2960++;
        if (this.method1256(103)) {
            return arg0 == -1 ? this.field2959.field3824.length : 108;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public final int method1234(boolean arg0, String arg1) {
        field2951++;
        if (!this.method1256(47)) {
            return -1;
        }
        String var3 = arg1.toLowerCase();
        if (arg0) {
            field2965 = null;
        }
        int var4 = this.field2959.field3822.method2402(class8.method29(var3, 0), -1);
        return this.method1239(var4, -21697) ? var4 : -1;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(II)I")
    public final int method1235(int arg0, int arg1) {
        field2943++;
        if (this.method1239(arg1, -21697)) {
            return arg0 == 0 ? this.field2959.field3824[arg1] : 56;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)I")
    private final int method1236(byte arg0, int arg1) {
        field2945++;
        if (this.method1239(arg1, arg0 ^ 0x54FA)) {
            if (arg0 != -59) {
                this.method1252((byte) -28, 114);
            }
            return this.field2941[arg1] == null ? this.field2952.method947(13038, arg1) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III)Z")
    public final boolean method1237(int arg0, int arg1, int arg2) {
        field2948++;
        if (!this.method1258(-15029, arg2, arg0)) {
            return false;
        } else if (this.field2961[arg0] != null && this.field2961[arg0][arg2] != null) {
            return true;
        } else if (this.field2941[arg0] == null) {
            this.method1260(arg0, arg1);
            return this.field2941[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(BI)V")
    public final void method1238(byte arg0, int arg1) {
        if (arg0 < 81) {
            field2962 = null;
        }
        field2949++;
        if (this.method1239(arg1, -21697) && this.field2961 != null) {
            this.field2961[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(II)Z")
    private final boolean method1239(int arg0, int arg1) {
        if (arg1 != -21697) {
            this.field2931 = true;
        }
        field2926++;
        if (!this.method1256(-120)) {
            return false;
        } else if (arg0 >= 0 && arg0 < this.field2959.field3824.length && this.field2959.field3824[arg0] != 0) {
            return true;
        } else if (class187.field2801) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIB[I)Z")
    private final boolean method1240(int arg0, int arg1, byte arg2, int[] arg3) {
        field2929++;
        if (!this.method1239(arg0, -21697)) {
            return false;
        } else if (this.field2941[arg0] == null) {
            return false;
        } else {
            int var5 = this.field2959.field3831[arg0];
            int[] var6 = this.field2959.field3818[arg0];
            if (this.field2961[arg0] == null) {
                this.field2961[arg0] = new Object[this.field2959.field3824[arg0]];
            }
            if (arg2 != -55) {
                return false;
            }
            Object[] var7 = this.field2961[arg0];
            boolean var8 = true;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg3 == null || arg3[0] == 0 && arg3[1] == 0 && arg3[2] == 0 && arg3[3] == 0) {
                var11 = class394.method2354(96, this.field2941[arg0], false);
            } else {
                var11 = class394.method2354(118, this.field2941[arg0], true);
                class276 var12 = new class276(var11);
                var12.method1698(-74, arg3, 5, var12.field4064.length);
            }
            byte[] var13;
            try {
                var13 = class237.method1509(var11, arg2 ^ 0x4C);
            } catch (RuntimeException var49) {
                throw class89.method500(var49, "T3 - " + (arg3 != null) + "," + arg0 + "," + var11.length + "," + class66.method401(-103, var11, var11.length) + "," + class66.method401(-47, var11, var11.length - 2) + "," + this.field2959.field3825[arg0] + "," + this.field2959.field3827);
            }
            if (this.field2931) {
                this.field2941[arg0] = null;
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field2925 == 0) {
                    var7[var48] = class74.method437(false, (byte) 116, var13);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field2925 == 2) {
                int var31 = var13.length;
                int var51 = var31 - 1;
                int var32 = var13[var51] & 0xFF;
                int var33 = var51 - var5 * var32 * 4;
                class276 var34 = new class276(var13);
                int var35 = 0;
                var34.field4021 = var33;
                int var36 = 0;
                for (int var37 = 0; var37 < var32; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var34.method1688(20402);
                        int var40;
                        if (var6 == null) {
                            var40 = var39;
                        } else {
                            var40 = var6[var39];
                        }
                        if (arg1 == var40) {
                            var35 += var38;
                            var36 = var40;
                        }
                    }
                }
                if (var35 == 0) {
                    return true;
                }
                byte[] var41 = new byte[var35];
                int var42 = 0;
                var34.field4021 = var33;
                int var43 = 0;
                for (int var44 = 0; var44 < var32; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var34.method1688(arg2 + 20457);
                        int var47;
                        if (var6 == null) {
                            var47 = var46;
                        } else {
                            var47 = var6[var46];
                        }
                        if (arg1 == var47) {
                            class415.method2448(var13, var43, var41, var42, var45);
                            var42 += var45;
                        }
                        var43 += var45;
                    }
                }
                var7[var36] = var41;
            } else {
                int var15 = var13.length;
                int var50 = var15 - 1;
                int var16 = var13[var50] & 0xFF;
                int var17 = var50 - var5 * 4 * var16;
                class276 var18 = new class276(var13);
                var18.field4021 = var17;
                int[] var19 = new int[var5];
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var5; var22++) {
                        var21 += var18.method1688(20402);
                        var19[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var5][];
                for (int var24 = 0; var24 < var5; var24++) {
                    var23[var24] = new byte[var19[var24]];
                    var19[var24] = 0;
                }
                var18.field4021 = var17;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var5; var28++) {
                        var27 += var18.method1688(20402);
                        class415.method2448(var13, var25, var23[var28], var19[var28], var27);
                        var25 += var27;
                        var19[var28] += var27;
                    }
                }
                for (int var29 = 0; var29 < var5; var29++) {
                    int var30;
                    if (var6 == null) {
                        var30 = var29;
                    } else {
                        var30 = var6[var29];
                    }
                    if (this.field2925 == 0) {
                        var7[var30] = class74.method437(false, (byte) 36, var23[var29]);
                    } else {
                        var7[var30] = var23[var29];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BZZ)V")
    public final void method1241(byte arg0, boolean arg1, boolean arg2) {
        field2933++;
        if (!this.method1256(8)) {
            return;
        }
        if (arg2) {
            this.field2959.field3815 = null;
            this.field2959.field3828 = null;
        }
        if (arg0 != 125) {
            this.method1241((byte) -49, true, false);
        }
        if (arg1) {
            this.field2959.field3819 = null;
            this.field2959.field3822 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V")
    public final void method1242(boolean arg0) {
        if (this.field2941 != null) {
            for (int var2 = 0; var2 < this.field2941.length; var2++) {
                this.field2941[var2] = null;
            }
        }
        if (!arg0) {
            this.field2959 = null;
        }
        field2958++;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
    public static final void method1243(int arg0) {
        field2942++;
        class257 var1 = (class257) class170.field2480.method2843(1123227612);
        if (arg0 != -9425) {
            field2965 = null;
        }
        while (var1 != null) {
            class389 var2 = var1.field3762;
            if (class29.field394 != var2.field4319 || var2.field5528 < class353.field5090) {
                var1.method1510((byte) -13);
                var2.method2335((byte) -30);
            } else if (class353.field5090 >= var2.field5545) {
                if (var2.field5534 > 0) {
                    class216 var3 = class139.field1851[var2.field5534 - 1];
                    if (var3 != null && var3.field4331 >= 0 && var3.field4331 < class58.field758 * 128 && var3.field4317 >= 0 && var3.field4317 < class287.field4181 * 128) {
                        var2.method2341(var3.field4331, var3.field4317, class353.field5090, (byte) 81, class132.method835(var3.field4317, var2.field4319, var3.field4331, 2002) - var2.field5519);
                    }
                }
                if (var2.field5534 < 0) {
                    int var4 = -var2.field5534 - 1;
                    class452 var5;
                    if (class295.field4273 == var4) {
                        var5 = class492.field6935;
                    } else {
                        var5 = class124.field1559[var4];
                    }
                    if (var5 != null && var5.field4331 >= 0 && var5.field4331 < (class58.field758 * 128) && var5.field4317 >= 0 && class287.field4181 * 128 > var5.field4317) {
                        var2.method2341(var5.field4331, var5.field4317, class353.field5090, (byte) 81, class132.method835(var5.field4317, var2.field4319, var5.field4331, arg0 + 11427) - var2.field5519);
                    }
                }
                var2.method2337(class332.field4840, -1);
                class271.method1659(var2, true);
            }
            var1 = (class257) class170.field2480.method2842(1673506446);
        }
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(I)I")
    public final int method1244(int arg0) {
        if (arg0 <= 56) {
            return -60;
        }
        field2937++;
        if (!this.method1256(120)) {
            throw new IllegalStateException("");
        }
        return this.field2959.field3827;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B")
    public final byte[] method1245(String arg0, String arg1, byte arg2) {
        field2924++;
        if (!this.method1256(-117)) {
            return null;
        }
        if (arg2 != -26) {
            this.method1238((byte) -38, 112);
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field2959.field3822.method2402(class8.method29(var4, 0), -1);
        if (this.method1239(var6, -21697)) {
            int var7 = this.field2959.field3828[var6].method2402(class8.method29(var5, 0), -1);
            return this.method1257(var7, var6, arg2 ^ 0xFFFFA008);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(I)V")
    public static void method1246(int arg0) {
        int var1 = -122 % ((arg0 - 69) / 54);
        field2962 = null;
        field2965 = null;
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(II)V")
    private final void method1247(int arg0, int arg1) {
        field2935++;
        this.field2952.method951(2, arg1);
        if (arg0 != -11854) {
            this.field2941 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(BI)Z")
    public final boolean method1248(byte arg0, int arg1) {
        if (arg0 < 65) {
            return true;
        }
        field2939++;
        if (!this.method1239(arg1, -21697)) {
            return false;
        } else if (this.field2941[arg1] == null) {
            this.method1260(arg1, 0);
            return this.field2941[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method1249(byte arg0, String arg1) {
        field2928++;
        if (this.method1256(-117)) {
            int var3 = -49 % ((-arg0 - 52) / 36);
            String var4 = arg1.toLowerCase();
            int var5 = this.field2959.field3822.method2402(class8.method29(var4, 0), -1);
            this.method1247(-11854, var5);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method1250(int arg0, String arg1) {
        field2955++;
        if (!this.method1256(-125)) {
            return false;
        }
        if (arg0 < 109) {
            this.method1245((String) null, (String) null, (byte) 15);
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field2959.field3822.method2402(class8.method29(var3, 0), -1);
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!b", name = "f", descriptor = "(I)Z")
    public final boolean method1251(int arg0) {
        field2934++;
        if (!this.method1256(21)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field2959.field3817.length; var3++) {
            int var5 = this.field2959.field3817[var3];
            if (this.field2941[var5] == null) {
                this.method1260(var5, 0);
                if (this.field2941[var5] == null) {
                    var2 = false;
                }
            }
        }
        int var4 = -33 % ((arg0 + 69) / 54);
        return var2;
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(BI)I")
    public final int method1252(byte arg0, int arg1) {
        field2957++;
        if (!this.method1256(-117)) {
            return -1;
        }
        int var3 = this.field2959.field3822.method2402(arg1, -1);
        if (this.method1239(var3, -21697)) {
            if (arg0 != 103) {
                this.method1251(61);
            }
            return var3;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method1253(int arg0, String arg1) {
        field2927++;
        if (!this.method1256(-125)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 != 22473) {
            this.method1256(-108);
        }
        int var4 = this.field2959.field3822.method2402(class8.method29(var3, 0), -1);
        return this.method1248((byte) 75, var4);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III[I)[B")
    public final byte[] method1254(int arg0, int arg1, int arg2, int[] arg3) {
        field2932++;
        if (arg2 != -22152) {
            return null;
        } else if (this.method1258(-15029, arg0, arg1)) {
            if (this.field2961[arg1] == null || this.field2961[arg1][arg0] == null) {
                boolean var5 = this.method1240(arg1, arg0, (byte) -55, arg3);
                if (!var5) {
                    this.method1260(arg1, 0);
                    boolean var6 = this.method1240(arg1, arg0, (byte) -55, arg3);
                    if (!var6) {
                        return null;
                    }
                }
            }
            byte[] var7 = class394.method2354(103, this.field2961[arg1][arg0], false);
            if (this.field2925 == 1) {
                this.field2961[arg1][arg0] = null;
                if (this.field2959.field3824[arg1] == 1) {
                    this.field2961[arg1] = null;
                }
            } else if (this.field2925 == 2) {
                this.field2961[arg1] = null;
            }
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(ILjava/lang/String;)I")
    public final int method1255(int arg0, String arg1) {
        field2950++;
        if (this.method1256(52)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field2959.field3822.method2402(class8.method29(var3, arg0), ~arg0);
            return this.method1236((byte) -59, var4);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!b", name = "g", descriptor = "(I)Z")
    private final boolean method1256(int arg0) {
        int var2 = -118 / ((-arg0 - 59) / 56);
        field2936++;
        if (this.field2959 == null) {
            this.field2959 = this.field2952.method950((byte) -63);
            if (this.field2959 == null) {
                return false;
            }
            this.field2961 = new Object[this.field2959.field3829][];
            this.field2941 = new Object[this.field2959.field3829];
        }
        return true;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(III)[B")
    public final byte[] method1257(int arg0, int arg1, int arg2) {
        field2944++;
        if (arg2 != 24558) {
            field2946 = -20;
        }
        return this.method1254(arg0, arg1, -22152, (int[]) null);
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lsr;ZI)V")
    public class201(class151 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field2931 = arg1;
        this.field2925 = arg2;
        this.field2952 = arg0;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(III)Z")
    private final boolean method1258(int arg0, int arg1, int arg2) {
        field2938++;
        if (!this.method1256(127)) {
            return false;
        } else if (arg2 >= 0 && arg1 >= 0 && arg2 < this.field2959.field3824.length && arg1 < this.field2959.field3824[arg2]) {
            return arg0 == -15029 ? true : true;
        } else if (class187.field2801) {
            throw new IllegalArgumentException(arg2 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
    public final boolean method1259(String arg0, byte arg1, String arg2) {
        field2964++;
        if (!this.method1256(-125)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field2959.field3822.method2402(class8.method29(var4, 0), -1);
        if (arg1 != -38) {
            this.method1239(80, -24);
        }
        if (this.method1239(var6, arg1 ^ 0x54E5)) {
            int var7 = this.field2959.field3828[var6].method2402(class8.method29(var5, 0), -1);
            return this.method1237(var6, 0, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!b", name = "f", descriptor = "(II)V")
    private final void method1260(int arg0, int arg1) {
        field2947++;
        if (this.field2931) {
            this.field2941[arg0] = this.field2952.method949(true, arg0);
        } else {
            this.field2941[arg0] = class74.method437(false, (byte) -124, this.field2952.method949(true, arg0));
        }
        if (arg1 != 0) {
            this.method1228(-9, 107);
        }
    }

    static {
        new class326("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
        field2962 = new class470(8);
        field2965 = "";
    }
}
