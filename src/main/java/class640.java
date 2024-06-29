import java.awt.Color;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class640 {

    @OriginalMember(owner = "client!vv", name = "n", descriptor = "J")
    private long field9284 = -1L;

    @OriginalMember(owner = "client!vv", name = "t", descriptor = "I")
    private int field9290 = 0;

    @OriginalMember(owner = "client!vv", name = "p", descriptor = "J")
    private long field9286 = -1L;

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "Llaa;")
    private class578 field9272;

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "J")
    private long field9274;

    @OriginalMember(owner = "client!vv", name = "r", descriptor = "J")
    private long field9288;

    @OriginalMember(owner = "client!vv", name = "h", descriptor = "[B")
    private byte[] field9278;

    @OriginalMember(owner = "client!vv", name = "s", descriptor = "J")
    private long field9289;

    @OriginalMember(owner = "client!vv", name = "x", descriptor = "[B")
    private byte[] field9294;

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "Luv;")
    public static class3 field9276 = new class3(11, 3);

    @OriginalMember(owner = "client!vv", name = "w", descriptor = "Laea;")
    public static class39 field9293 = new class39();

    @OriginalMember(owner = "client!vv", name = "y", descriptor = "Luv;")
    public static class3 field9295 = new class3(62, -1);

    @OriginalMember(owner = "client!vv", name = "z", descriptor = "[Ljava/awt/Color;")
    public static Color[] field9296 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!vv", name = "A", descriptor = "Ldh;")
    public static class321 field9297 = new class321("", 10);

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
    public static int field9271;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
    public static int field9273;

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "I")
    public static int field9275;

    @OriginalMember(owner = "client!vv", name = "g", descriptor = "I")
    public static int field9277;

    @OriginalMember(owner = "client!vv", name = "i", descriptor = "I")
    public static int field9279;

    @OriginalMember(owner = "client!vv", name = "j", descriptor = "I")
    public static int field9280;

    @OriginalMember(owner = "client!vv", name = "k", descriptor = "I")
    public static int field9281;

    @OriginalMember(owner = "client!vv", name = "l", descriptor = "I")
    public static int field9282;

    @OriginalMember(owner = "client!vv", name = "o", descriptor = "I")
    public static int field9285;

    @OriginalMember(owner = "client!vv", name = "q", descriptor = "I")
    public static int field9287;

    @OriginalMember(owner = "client!vv", name = "u", descriptor = "I")
    public static int field9291;

    @OriginalMember(owner = "client!vv", name = "v", descriptor = "I")
    private int field9292;

    @OriginalMember(owner = "client!vv", name = "m", descriptor = "J")
    private long field9283;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Z)V")
    private final void method3683(boolean arg0) throws IOException {
        if (arg0) {
            field9276 = null;
        }
        this.field9292 = 0;
        field9277++;
        if (this.field9289 != this.field9283) {
            this.field9272.method3250(this.field9289, false);
            this.field9283 = this.field9289;
        }
        this.field9286 = this.field9289;
        while (this.field9278.length > this.field9292) {
            int var2 = this.field9278.length - this.field9292;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field9272.method3247(var2, this.field9278, this.field9292, -87);
            if (var3 == -1) {
                break;
            }
            this.field9292 += var3;
            this.field9283 += var3;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IBIIIII)V")
    public static final void method3684(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9273++;
        if (class594.field8575 <= arg4 && class355.field4972 >= arg6 && class535.field7467 <= arg3 && arg2 <= class113.field1453) {
            if (arg5 == 1) {
                class60.method350(arg3, arg2, arg6, arg0, arg4, 90);
            } else {
                class121.method662(arg5, arg0, 14, arg4, arg2, arg6, arg3);
            }
        } else if (arg5 == 1) {
            class161.method876((byte) 110, arg0, arg3, arg6, arg2, arg4);
        } else {
            class390.method2353((byte) 120, arg2, arg4, arg5, arg6, arg3, arg0);
        }
        if (arg1 >= -120) {
            method3689(null, 115);
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IJ)V")
    public final void method3685(int arg0, long arg1) throws IOException {
        if (arg0 != 1456) {
            return;
        }
        field9280++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method3690((byte) -120));
        }
        this.field9289 = arg1;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V")
    public static void method3686(byte arg0) {
        field9293 = null;
        field9276 = null;
        field9297 = null;
        field9295 = null;
        field9296 = null;
        if (arg0 != -114) {
            method3689(null, -49);
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IILfd;IBIIIIIII)Z")
    public static final boolean method3687(int arg0, int arg1, class143 arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field9291++;
        int var12 = arg9;
        int var13 = arg7;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg9 - var14;
        int var17 = arg7 - var15;
        class76.field1042[var14][var15] = 99;
        class296.field3838[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class599.field8663[var18] = arg9;
        int var36 = var18 + 1;
        class424.field5744[var18] = arg7;
        int[][] var20 = arg2.field1833;
        int var21 = -123 % ((16 - arg4) / 52);
        while (true) {
            label282: while (true) {
                int var22;
                int var23;
                int var24;
                int var25;
                int var27;
                do {
                    do {
                        do {
                            label259: do {
                                if (var36 == var19) {
                                    class54.field725 = var12;
                                    class95.field1284 = var13;
                                    return false;
                                }
                                var13 = class424.field5744[var19];
                                var12 = class599.field8663[var19];
                                var22 = var13 - var17;
                                var19 = var19 + 1 & 0xFFF;
                                var23 = var12 - var16;
                                var24 = var12 - arg2.field1822;
                                var25 = var13 - arg2.field1839;
                                if (arg0 == -4) {
                                    if (arg11 == var12 && arg10 == var13) {
                                        class95.field1284 = var13;
                                        class54.field725 = var12;
                                        return true;
                                    }
                                } else if (arg0 == -3) {
                                    if (class113.method610(45, arg3, var13, arg3, arg10, arg11, arg1, arg6, var12)) {
                                        class95.field1284 = var13;
                                        class54.field725 = var12;
                                        return true;
                                    }
                                } else if (arg0 == -2) {
                                    if (arg2.method786(var13, arg11, arg6, arg1, arg3, arg3, (byte) 83, arg10, arg5, var12)) {
                                        class95.field1284 = var13;
                                        class54.field725 = var12;
                                        return true;
                                    }
                                } else if (arg0 == -1) {
                                    if (arg2.method784(arg1, arg5, var12, arg10, arg6, var13, arg11, 8, arg3)) {
                                        class54.field725 = var12;
                                        class95.field1284 = var13;
                                        return true;
                                    }
                                } else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
                                    if (arg2.method775(arg3, arg8, var12, 18906, var13, arg11, arg0, arg10)) {
                                        class95.field1284 = var13;
                                        class54.field725 = var12;
                                        return true;
                                    }
                                } else if (arg2.method772(arg8, var13, var12, 0, arg3, arg0, arg11, arg10)) {
                                    class54.field725 = var12;
                                    class95.field1284 = var13;
                                    return true;
                                }
                                var27 = class296.field3838[var23][var22] + 1;
                                if (var23 > 0 && class76.field1042[var23 - 1][var22] == 0 && (var20[var24 - 1][var25] & 0x43A40000) == 0 && (var20[var24 - 1][var25 + arg3 - 1] & 0x4E240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= (arg3 - 1)) {
                                            class599.field8663[var36] = var12 - 1;
                                            class424.field5744[var36] = var13;
                                            var36 = var36 + 1 & 0xFFF;
                                            class76.field1042[var23 - 1][var22] = 2;
                                            class296.field3838[var23 - 1][var22] = var27;
                                            break;
                                        }
                                        if ((var20[var24 - 1][var25 + var28] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var23 < 128 - arg3 && class76.field1042[var23 + 1][var22] == 0 && (var20[arg3 + var24][var25] & 0x60E40000) == 0 && (var20[arg3 + var24][arg3 + var25 - 1] & 0x78240000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if ((arg3 - 1) <= var29) {
                                            class599.field8663[var36] = var12 + 1;
                                            class424.field5744[var36] = var13;
                                            class76.field1042[var23 + 1][var22] = 8;
                                            var36 = var36 + 1 & 0xFFF;
                                            class296.field3838[var23 + 1][var22] = var27;
                                            break;
                                        }
                                        if ((var20[arg3 + var24][var25 + var29] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var22 > 0 && class76.field1042[var23][var22 - 1] == 0 && (var20[var24][var25 - 1] & 0x43A40000) == 0 && (var20[arg3 + var24 - 1][var25 - 1] & 0x60E40000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if ((arg3 - 1) <= var30) {
                                            class599.field8663[var36] = var12;
                                            class424.field5744[var36] = var13 - 1;
                                            class76.field1042[var23][var22 - 1] = 1;
                                            var36 = var36 + 1 & 0xFFF;
                                            class296.field3838[var23][var22 - 1] = var27;
                                            break;
                                        }
                                        if ((var20[var24 + var30][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if ((128 - arg3) > var22 && class76.field1042[var23][var22 + 1] == 0 && (var20[var24][arg3 + var25] & 0x4E240000) == 0 && (var20[var24 + arg3 - 1][arg3 + var25] & 0x78240000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg3 - 1) {
                                            class599.field8663[var36] = var12;
                                            class424.field5744[var36] = var13 + 1;
                                            class76.field1042[var23][var22 + 1] = 4;
                                            var36 = var36 + 1 & 0xFFF;
                                            class296.field3838[var23][var22 + 1] = var27;
                                            break;
                                        }
                                        if ((var20[var24 + var31][arg3 + var25] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var23 > 0 && var22 > 0 && class76.field1042[var23 - 1][var22 - 1] == 0 && (var20[var24 - 1][var25 - 1] & 0x43A40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg3 <= var32) {
                                            class599.field8663[var36] = var12 - 1;
                                            class424.field5744[var36] = var13 - 1;
                                            var36 = var36 + 1 & 0xFFF;
                                            class76.field1042[var23 - 1][var22 - 1] = 3;
                                            class296.field3838[var23 - 1][var22 - 1] = var27;
                                            break;
                                        }
                                        if ((var20[var24 - 1][var25 + var32 - 1] & 0x4FA40000) != 0 || (var20[var24 + var32 - 1][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if ((128 - arg3) > var23 && var22 > 0 && class76.field1042[var23 + 1][var22 - 1] == 0 && (var20[arg3 + var24][var25 - 1] & 0x60E40000) == 0) {
                                    int var33 = 1;
                                    while (true) {
                                        if (arg3 <= var33) {
                                            class599.field8663[var36] = var12 + 1;
                                            class424.field5744[var36] = var13 - 1;
                                            class76.field1042[var23 + 1][var22 - 1] = 9;
                                            var36 = var36 + 1 & 0xFFF;
                                            class296.field3838[var23 + 1][var22 - 1] = var27;
                                            break;
                                        }
                                        if ((var20[arg3 + var24][var25 + var33 - 1] & 0x78E40000) != 0 || (var20[var24 + var33][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var33++;
                                    }
                                }
                                if (var23 > 0 && var22 < (128 - arg3) && class76.field1042[var23 - 1][var22 + 1] == 0 && (var20[var24 - 1][arg3 + var25] & 0x4E240000) == 0) {
                                    for (int var34 = 1; var34 < arg3; var34++) {
                                        if ((var20[var24 - 1][var25 + var34] & 0x4FA40000) != 0 || (var20[var24 + var34 - 1][var25 + arg3] & 0x7E240000) != 0) {
                                            continue label259;
                                        }
                                    }
                                    class599.field8663[var36] = var12 - 1;
                                    class424.field5744[var36] = var13 + 1;
                                    var36 = var36 + 1 & 0xFFF;
                                    class76.field1042[var23 - 1][var22 + 1] = 6;
                                    class296.field3838[var23 - 1][var22 + 1] = var27;
                                }
                            } while (128 - arg3 <= var23);
                        } while (128 - arg3 <= var22);
                    } while (class76.field1042[var23 + 1][var22 + 1] != 0);
                } while ((var20[arg3 + var24][var25 + arg3] & 0x78240000) != 0);
                for (int var35 = 1; var35 < arg3; var35++) {
                    if ((var20[var24 + var35][arg3 + var25] & 0x7E240000) != 0 || (var20[arg3 + var24][var25 + var35] & 0x78E40000) != 0) {
                        continue label282;
                    }
                }
                class599.field8663[var36] = var12 + 1;
                class424.field5744[var36] = var13 + 1;
                var36 = var36 + 1 & 0xFFF;
                class76.field1042[var23 + 1][var22 + 1] = 12;
                class296.field3838[var23 + 1][var22 + 1] = var27;
            }
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Z[B)V")
    public final void method3688(boolean arg0, byte[] arg1) throws IOException {
        if (!arg0) {
            this.method3692(0, arg1, (byte) 75, arg1.length);
            field9287++;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Ljc;I)V")
    public static final void method3689(class585 arg0, int arg1) {
        field9282++;
        for (class72 var2 = (class72) class453.field6416.method3188((byte) -100); var2 != null; var2 = (class72) class453.field6416.method3182((byte) -98)) {
            if (var2.field986 == arg0) {
                if (var2.field993 != null) {
                    class92.field1224.method250(var2.field993);
                    var2.field993 = null;
                }
                var2.method589(-8880);
                return;
            }
        }
        if (arg1 != 2015625216) {
            field9293 = null;
        }
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(B)Ljava/io/File;")
    private final File method3690(byte arg0) {
        if (arg0 > -115) {
            method3687(55, -2, null, 119, (byte) -31, 30, -83, 11, 5, -126, 27, -105);
        }
        field9279++;
        return this.field9272.method3248(14357);
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(Z)V")
    private final void method3691(boolean arg0) throws IOException {
        if (arg0) {
            this.field9284 = -11L;
        }
        if (this.field9284 != -1L) {
            if (this.field9284 != this.field9283) {
                this.field9272.method3250(this.field9284, false);
                this.field9283 = this.field9284;
            }
            this.field9272.method3249((byte) 98, this.field9290, this.field9294, 0);
            this.field9283 += this.field9290;
            if (this.field9283 > this.field9274) {
                this.field9274 = this.field9283;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field9286 <= this.field9284 && this.field9286 + ((long) this.field9292) > this.field9284) {
                var2 = this.field9284;
            } else if (this.field9286 >= this.field9284 && this.field9286 < (long) this.field9290 + this.field9284) {
                var2 = this.field9286;
            }
            if ((this.field9284 + ((long) this.field9290)) > this.field9286 && ((long) this.field9292 + this.field9286) >= ((long) this.field9290 + this.field9284)) {
                var4 = this.field9284 + ((long) this.field9290);
            } else if (this.field9284 < ((long) this.field9292 + this.field9286) && ((long) this.field9292 + this.field9286) <= ((long) this.field9290 + this.field9284)) {
                var4 = (long) this.field9292 + this.field9286;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class205.method1311(this.field9294, (int) (var2 - this.field9284), this.field9278, (int) (var2 - this.field9286), var6);
            }
            this.field9290 = 0;
            this.field9284 = -1L;
        }
        field9285++;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I[BBI)V")
    public final void method3692(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        field9271++;
        try {
            if (arg1.length < (arg0 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg3 - arg1.length);
            }
            if (arg2 != 75) {
                this.method3690((byte) -123);
            }
            if (this.field9284 != -1L && this.field9284 <= this.field9289 && this.field9284 + ((long) this.field9290) >= (long) arg3 + this.field9289) {
                class205.method1311(this.field9294, (int) (this.field9289 - this.field9284), arg1, arg0, arg3);
                this.field9289 += arg3;
                return;
            }
            long var5 = this.field9289;
            int var7 = arg0;
            int var8 = arg3;
            if (this.field9286 <= this.field9289 && (long) this.field9292 + this.field9286 > this.field9289) {
                int var9 = (int) ((long) this.field9292 + this.field9286 - this.field9289);
                if (arg3 < var9) {
                    var9 = arg3;
                }
                class205.method1311(this.field9278, (int) (this.field9289 - this.field9286), arg1, arg0, var9);
                this.field9289 += var9;
                arg0 += var9;
                arg3 -= var9;
            }
            if (this.field9278.length < arg3) {
                this.field9272.method3250(this.field9289, false);
                this.field9283 = this.field9289;
                while (arg3 > 0) {
                    int var10 = this.field9272.method3247(arg3, arg1, arg0, arg2 ^ 0xFFFFFFCA);
                    if (var10 == -1) {
                        break;
                    }
                    arg0 += var10;
                    arg3 -= var10;
                    this.field9283 += var10;
                    this.field9289 += var10;
                }
            } else if (arg3 > 0) {
                this.method3683(false);
                int var11 = arg3;
                if (this.field9292 < arg3) {
                    var11 = this.field9292;
                }
                class205.method1311(this.field9278, 0, arg1, arg0, var11);
                arg0 += var11;
                this.field9289 += var11;
                arg3 -= var11;
            }
            if (this.field9284 != -1L) {
                if (this.field9289 < this.field9284 && arg3 > 0) {
                    int var12 = arg0 + ((int) (this.field9284 - this.field9289));
                    if ((arg0 + arg3) < var12) {
                        var12 = arg0 + arg3;
                    }
                    while (arg0 < var12) {
                        arg1[arg0++] = 0;
                        arg3--;
                        this.field9289++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field9284 && ((long) var8 + var5) > this.field9284) {
                    var13 = this.field9284;
                } else if (var5 >= this.field9284 && ((long) this.field9290 + this.field9284) > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (long) this.field9290 + this.field9284 && (long) this.field9290 + this.field9284 <= (long) var8 + var5) {
                    var15 = (long) this.field9290 + this.field9284;
                } else if ((var5 + ((long) var8)) > this.field9284 && ((long) this.field9290 + this.field9284) >= ((long) var8 + var5)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class205.method1311(this.field9294, (int) (var13 - this.field9284), arg1, (int) (var13 - var5) + var7, var17);
                    if (this.field9289 < var15) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field9289));
                        this.field9289 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field9283 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "(B)J")
    public final long method3693(byte arg0) {
        field9281++;
        if (arg0 != 63) {
            this.method3690((byte) -84);
        }
        return this.field9288;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(B[BII)V")
    public final void method3694(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field9275++;
        try {
            if ((long) arg3 + this.field9289 > this.field9288) {
                this.field9288 = (long) arg3 + this.field9289;
            }
            if (this.field9284 != -1L && (this.field9289 < this.field9284 || this.field9289 > (long) this.field9290 + this.field9284)) {
                this.method3691(false);
            }
            if (arg0 < 118) {
                this.method3693((byte) 71);
            }
            if (this.field9284 != -1L && this.field9289 + ((long) arg3) > (long) this.field9294.length + this.field9284) {
                int var5 = (int) (this.field9284 + (long) this.field9294.length - this.field9289);
                class205.method1311(arg1, arg2, this.field9294, (int) (this.field9289 - this.field9284), var5);
                arg3 -= var5;
                arg2 += var5;
                this.field9289 += var5;
                this.field9290 = this.field9294.length;
                this.method3691(false);
            }
            if (arg3 > this.field9294.length) {
                if (this.field9289 != this.field9283) {
                    this.field9272.method3250(this.field9289, false);
                    this.field9283 = this.field9289;
                }
                this.field9272.method3249((byte) 113, arg3, arg1, arg2);
                this.field9283 += arg3;
                if (this.field9283 > this.field9274) {
                    this.field9274 = this.field9283;
                }
                long var6 = -1L;
                if (this.field9286 <= this.field9289 && this.field9286 + ((long) this.field9292) > this.field9289) {
                    var6 = this.field9289;
                } else if (this.field9286 >= this.field9289 && this.field9286 < ((long) arg3 + this.field9289)) {
                    var6 = this.field9286;
                }
                long var8 = -1L;
                if ((long) arg3 + this.field9289 > this.field9286 && ((long) this.field9292 + this.field9286) >= ((long) arg3 + this.field9289)) {
                    var8 = (long) arg3 + this.field9289;
                } else if (this.field9289 < ((long) this.field9292 + this.field9286) && this.field9286 + ((long) this.field9292) <= (long) arg3 + this.field9289) {
                    var8 = (long) this.field9292 + this.field9286;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class205.method1311(arg1, (int) ((long) arg2 + var6 - this.field9289), this.field9278, (int) (var6 - this.field9286), var10);
                }
                this.field9289 += arg3;
            } else if (arg3 > 0) {
                if (this.field9284 == -1L) {
                    this.field9284 = this.field9289;
                }
                class205.method1311(arg1, arg2, this.field9294, (int) (this.field9289 - this.field9284), arg3);
                this.field9289 += arg3;
                if ((this.field9289 - this.field9284) > ((long) this.field9290)) {
                    this.field9290 = (int) (this.field9289 - this.field9284);
                }
            }
        } catch (IOException var12) {
            this.field9283 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Llaa;II)V")
    public class640(class578 arg0, int arg1, int arg2) throws IOException {
        this.field9272 = arg0;
        this.field9288 = this.field9274 = arg0.method3251(-25730);
        this.field9278 = new byte[arg1];
        this.field9289 = 0L;
        this.field9294 = new byte[arg2];
    }
}
