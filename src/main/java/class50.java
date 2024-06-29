import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class50 extends class219 {

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "Z")
    private boolean field665 = false;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    private int field655 = -32768;

    @OriginalMember(owner = "client!ej", name = "db", descriptor = "I")
    private int field696 = -1;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    private int field662 = 0;

    @OriginalMember(owner = "client!ej", name = "kb", descriptor = "I")
    private int field703 = 0;

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "I")
    private int field670;

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "I")
    public int field683;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    private int field660;

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "I")
    public int field686;

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
    private int field681;

    @OriginalMember(owner = "client!ej", name = "Y", descriptor = "I")
    public int field691;

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
    private int field673;

    @OriginalMember(owner = "client!ej", name = "X", descriptor = "I")
    public int field690;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
    private int field674;

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "I")
    private int field676;

    @OriginalMember(owner = "client!ej", name = "eb", descriptor = "I")
    public int field697;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "Lsi;")
    private class198 field657;

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "[S")
    public static short[] field667 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "Z")
    public static boolean field666 = false;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "I")
    public static int field668 = -1;

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "Ljava/lang/String;")
    public static String field678 = "K";

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "S")
    public static short field684 = 32767;

    @OriginalMember(owner = "client!ej", name = "cb", descriptor = "[[I")
    public static int[][] field695 = new int[104][104];

    @OriginalMember(owner = "client!ej", name = "ab", descriptor = "Z")
    public static boolean field693 = true;

    @OriginalMember(owner = "client!ej", name = "fb", descriptor = "[Lck;")
    public static class218[] field698 = new class218[14];

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "D")
    private double field659;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "D")
    private double field663;

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "D")
    public double field672;

    @OriginalMember(owner = "client!ej", name = "U", descriptor = "D")
    public double field687;

    @OriginalMember(owner = "client!ej", name = "W", descriptor = "D")
    private double field689;

    @OriginalMember(owner = "client!ej", name = "hb", descriptor = "D")
    public double field700;

    @OriginalMember(owner = "client!ej", name = "ib", descriptor = "D")
    private double field701;

    @OriginalMember(owner = "client!ej", name = "jb", descriptor = "D")
    private double field702;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public int field654;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "I")
    private int field675;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!ej", name = "Z", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!ej", name = "bb", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!ej", name = "gb", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!ej", name = "lb", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!ej", name = "V", descriptor = "Lql;")
    private class217 field688;

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "Lhc;")
    public static class229 field682;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "Lfl;")
    public static class241 field656;

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "[I")
    public static int[] field677;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field653;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "[[B")
    public static byte[][] field658;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "()I")
    public final int method363() {
        field694++;
        return this.field655;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
    public static final void method364(int arg0) {
        field652++;
        if (class131.field1918 == 0) {
            return;
        }
        try {
            if ((++class207.field3225) > 1500) {
                if (class240.field3833 != null) {
                    class240.field3833.method1842(false);
                    class240.field3833 = null;
                }
                if (class190.field3012 >= 1) {
                    class131.field1918 = 0;
                    class149.field2208 = -5;
                    return;
                }
                if (class202.field3170 == class155.field2304) {
                    class155.field2304 = class209.field3263;
                } else {
                    class155.field2304 = class202.field3170;
                }
                class131.field1918 = 1;
                class190.field3012++;
                class207.field3225 = 0;
            }
            if (class131.field1918 == 1) {
                class286.field4541 = class2.field23.method140(arg0 - 6407, class235.field3773, class155.field2304);
                class131.field1918 = 2;
            }
            if (class131.field1918 == 2) {
                if (class286.field4541.field3247 == 2) {
                    throw new IOException();
                }
                if (class286.field4541.field3247 != 1) {
                    return;
                }
                class240.field3833 = new class273((Socket) class286.field4541.field3249, class2.field23);
                class286.field4541 = null;
                class240.field3833.method1843(-100, class13.field165.field339, class13.field165.field349, 0);
                if (class239.field3821 != null) {
                    class239.field3821.method402(21);
                }
                if (class54.field739 != null) {
                    class54.field739.method402(51);
                }
                int var1 = class240.field3833.method1839((byte) -120);
                if (class239.field3821 != null) {
                    class239.field3821.method402(124);
                }
                if (class54.field739 != null) {
                    class54.field739.method402(38);
                }
                if (var1 != 101) {
                    class131.field1918 = 0;
                    class149.field2208 = var1;
                    class240.field3833.method1842(false);
                    class240.field3833 = null;
                    return;
                }
                class131.field1918 = 3;
            }
            if (class131.field1918 == 3) {
                if (class240.field3833.method1840((byte) 121) < 2) {
                    return;
                }
                int var2 = class240.field3833.method1839((byte) -59) << 8 | class240.field3833.method1839((byte) -122);
                class59.method425((byte) -36, var2);
                if (class30.field402 == -1) {
                    class131.field1918 = 0;
                    class149.field2208 = 6;
                    class240.field3833.method1842(false);
                    class240.field3833 = null;
                    return;
                }
                class131.field1918 = 0;
                class240.field3833.method1842(false);
                class240.field3833 = null;
                class173.method1217((byte) 44);
                return;
            }
        } catch (IOException var3) {
            if (class240.field3833 != null) {
                class240.field3833.method1842(false);
                class240.field3833 = null;
            }
            if (class190.field3012 >= 1) {
                class131.field1918 = 0;
                class149.field2208 = -4;
            } else {
                if (class202.field3170 == class155.field2304) {
                    class155.field2304 = class209.field3263;
                } else {
                    class155.field2304 = class202.field3170;
                }
                class207.field3225 = 0;
                class190.field3012++;
                class131.field1918 = 1;
            }
        }
        if (arg0 != -5) {
            method368(-42, (class82) null);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BI)V")
    public final void method365(byte arg0, int arg1) {
        this.field665 = true;
        field685++;
        this.field687 += (double) arg1 * this.field701;
        this.field700 += (double) arg1 * this.field702;
        if (arg0 != 62) {
            return;
        }
        if (this.field681 == -1) {
            this.field672 += (double) arg1 * this.field663;
        } else {
            this.field672 += this.field659 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field663;
            this.field663 += (double) arg1 * this.field659;
        }
        this.field654 = (int) (Math.atan2(this.field702, this.field701) * 325.949D) + 1024 & 0x7FF;
        this.field675 = (int) (Math.atan2(this.field663, this.field689) * 325.949D) & 0x7FF;
        if (this.field657 == null) {
            return;
        }
        this.field662 += arg1;
        while (true) {
            do {
                do {
                    if (this.field662 <= this.field657.field3080[this.field703]) {
                        return;
                    }
                    this.field662 -= this.field657.field3080[this.field703];
                    this.field703++;
                    if (this.field657.field3107.length <= this.field703) {
                        this.field703 -= this.field657.field3079;
                        if (this.field703 < 0 || this.field703 >= this.field657.field3107.length) {
                            this.field703 = 0;
                        }
                    }
                    this.field696 = this.field703 + 1;
                } while (this.field657.field3107.length > this.field696);
                this.field696 -= this.field657.field3079;
            } while (this.field696 >= 0 && this.field696 < this.field657.field3107.length);
            this.field696 = -1;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ldl;I)Z")
    public static final boolean method366(class123 arg0, int arg1) {
        field661++;
        int var2 = 27 % ((arg1 + 20) / 48);
        return arg0.method806(108, class104.field1605);
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)I")
    public static final int method367(int arg0) {
        class96.field1476 = 0;
        field669++;
        if (arg0 < 66) {
            field695 = null;
        }
        return class234.method1592(true);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILlk;)V")
    public static final void method368(int arg0, class82 arg1) {
        int var2 = 54 % ((-arg0 - 42) / 55);
        field692++;
        if (arg1.field1289 == 0) {
            return;
        }
        class85 var3 = arg1.method564(126);
        if (arg1.field1281 != -1 && arg1.field1281 < 32768) {
            class56 var4 = class100.field1566[arg1.field1281];
            if (var4 != null) {
                int var5 = arg1.field1226 - var4.field1226;
                int var6 = arg1.field1273 - var4.field1273;
                if (var5 != 0 || var6 != 0) {
                    arg1.field1211 = (int) (Math.atan2((double) var5, (double) var6) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field1281 >= 32768) {
            int var7 = arg1.field1281 - 32768;
            if (class45.field574 == var7) {
                var7 = 2047;
            }
            class186 var8 = class153.field2277[var7];
            if (var8 != null) {
                int var9 = arg1.field1226 - var8.field1226;
                int var10 = arg1.field1273 - var8.field1273;
                if (var9 != 0 || var10 != 0) {
                    arg1.field1211 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field1192 != 0 || arg1.field1225 != 0) && (arg1.field1246 == 0 || arg1.field1206 > 0)) {
            int var11 = arg1.field1273 - (arg1.field1225 - class246.field3943 - class246.field3943) * 64;
            int var12 = arg1.field1226 - ((arg1.field1192 - class126.field1869 - class126.field1869) * 64);
            if (var12 != 0 || var11 != 0) {
                arg1.field1211 = (int) (Math.atan2((double) var12, (double) var11) * 325.949D) & 0x7FF;
            }
            arg1.field1225 = 0;
            arg1.field1192 = 0;
        }
        int var13 = arg1.field1211 - arg1.field1222 & 0x7FF;
        if (var13 == 0) {
            arg1.field1227 = 0;
            arg1.field1263 = 0;
        } else if (var3.field1333 == 0) {
            arg1.field1227++;
            if (var13 <= 1024) {
                arg1.field1222 += arg1.field1289;
                boolean var14 = true;
                if (arg1.field1289 > var13 || var13 > 2048 - arg1.field1289) {
                    arg1.field1222 = arg1.field1211;
                    var14 = false;
                }
                if (arg1.field1196 == var3.field1319 && (arg1.field1227 > 25 || var14)) {
                    if (var3.field1349 == -1) {
                        arg1.field1196 = var3.field1347;
                    } else {
                        arg1.field1196 = var3.field1349;
                    }
                }
            } else {
                arg1.field1222 -= arg1.field1289;
                boolean var15 = true;
                if (arg1.field1289 > var13 || var13 > 2048 - arg1.field1289) {
                    arg1.field1222 = arg1.field1211;
                    var15 = false;
                }
                if (arg1.field1196 == var3.field1319 && (arg1.field1227 > 25 || var15)) {
                    if (var3.field1335 == -1) {
                        arg1.field1196 = var3.field1347;
                    } else {
                        arg1.field1196 = var3.field1335;
                    }
                }
            }
            arg1.field1222 &= 0x7FF;
        } else {
            if (arg1.field1196 == var3.field1319 && arg1.field1227 > 25) {
                if (var3.field1349 == -1) {
                    arg1.field1196 = var3.field1347;
                } else {
                    arg1.field1196 = var3.field1349;
                }
            }
            int var16 = arg1.field1211 << 5;
            if (arg1.field1247 != var16) {
                arg1.field1212 = 0;
                arg1.field1247 = var16;
                int var17 = var16 - arg1.field1200 & 0xFFFF;
                int var18 = arg1.field1263 * arg1.field1263 / (var3.field1333 * 2);
                if (arg1.field1263 > 0 && var17 >= var18 && (var17 - var18) < 32768) {
                    arg1.field1275 = var17 / 2;
                    arg1.field1223 = true;
                    int var19 = var3.field1321 * var3.field1321 / (var3.field1333 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (arg1.field1275 > var19) {
                        arg1.field1275 = var17 - var19;
                    }
                } else if (arg1.field1263 < 0 && 65536 - var17 >= var18 && (65536 - var17 - var18) < 32768) {
                    arg1.field1275 = (65536 - var17) / 2;
                    arg1.field1223 = true;
                    int var20 = var3.field1321 * var3.field1321 / (var3.field1333 * 2);
                    if (var20 > 32767) {
                        var20 = 32767;
                    }
                    if (var20 < arg1.field1275) {
                        arg1.field1275 = 65536 - var17 - var20;
                    }
                } else {
                    arg1.field1223 = false;
                }
            }
            if (arg1.field1263 == 0) {
                int var21 = arg1.field1247 - arg1.field1200 & 0xFFFF;
                if (var3.field1333 > var21) {
                    arg1.field1200 = arg1.field1247;
                } else {
                    arg1.field1223 = true;
                    arg1.field1212 = 0;
                    int var22 = var3.field1321 * var3.field1321 / (var3.field1333 * 2);
                    if (var22 > 32767) {
                        var22 = 32767;
                    }
                    if (var21 >= 32768) {
                        arg1.field1275 = (65536 - var21) / 2;
                        arg1.field1263 = -var3.field1333;
                        if (arg1.field1275 > var22) {
                            arg1.field1275 = 65536 - var21 - var22;
                        }
                    } else {
                        arg1.field1275 = var21 / 2;
                        arg1.field1263 = var3.field1333;
                        if (arg1.field1275 > var22) {
                            arg1.field1275 = var21 - var22;
                        }
                    }
                }
            } else if (arg1.field1263 > 0) {
                if (arg1.field1212 >= arg1.field1275) {
                    arg1.field1223 = false;
                }
                if (!arg1.field1223) {
                    arg1.field1263 -= var3.field1333;
                    if (arg1.field1263 < 0) {
                        arg1.field1263 = 0;
                    }
                } else if (var3.field1321 > arg1.field1263) {
                    arg1.field1263 += var3.field1333;
                }
            } else {
                if (arg1.field1275 <= arg1.field1212) {
                    arg1.field1223 = false;
                }
                if (!arg1.field1223) {
                    arg1.field1263 += var3.field1333;
                    if (arg1.field1263 > 0) {
                        arg1.field1263 = 0;
                    }
                } else if ((-var3.field1321) < arg1.field1263) {
                    arg1.field1263 -= var3.field1333;
                }
            }
            arg1.field1200 += arg1.field1263;
            if (arg1.field1263 <= 0) {
                arg1.field1212 -= arg1.field1263;
            } else {
                arg1.field1212 += arg1.field1263;
            }
            arg1.field1200 &= 0xFFFF;
            arg1.field1222 = arg1.field1200 >> 5;
        }
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(I)Lua;")
    private final class114 method369(int arg0) {
        field680++;
        class70 var2 = class77.method521(this.field673, (byte) -42);
        class114 var3 = var2.method473(this.field703, (byte) -67, this.field662, this.field696);
        if (var3 == null) {
            return null;
        } else if (arg0 > -7) {
            return null;
        } else {
            var3.method739(this.field675);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIII)V")
    public final void method370(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field671++;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V")
    public static void method371(byte arg0) {
        field678 = null;
        field682 = null;
        field653 = null;
        if (arg0 != -52) {
            method366((class123) null, 25);
        }
        field658 = null;
        field695 = null;
        field667 = null;
        field656 = null;
        field698 = null;
        field677 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIZI)V")
    public final void method372(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field704++;
        if (!this.field665) {
            double var6 = (double) (arg2 - this.field674);
            double var8 = (double) (arg1 - this.field676);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field672 = (double) this.field670;
            this.field687 = (double) this.field660 * var8 / var10 + (double) this.field676;
            this.field700 = (double) this.field660 * var6 / var10 + (double) this.field674;
        }
        if (!arg3) {
            this.field688 = null;
        }
        double var12 = (double) (this.field690 + 1 - arg4);
        this.field702 = ((double) arg2 - this.field700) / var12;
        this.field701 = ((double) arg1 - this.field687) / var12;
        this.field689 = Math.sqrt(this.field702 * this.field702 + this.field701 * this.field701);
        if (this.field681 == -1) {
            this.field663 = ((double) arg0 - this.field672) / var12;
        } else {
            if (!this.field665) {
                this.field663 = -this.field689 * Math.tan((double) this.field681 * 0.02454369D);
            }
            this.field659 = ((double) arg0 - this.field672 - (this.field663 * var12)) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIIIIJILql;)V")
    public final void method373(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class217 arg10) {
        field664++;
        class114 var13 = this.method369(-105);
        if (var13 != null) {
            var13.method373(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field688);
            this.field655 = var13.method363();
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field670 = arg4;
        this.field683 = arg10;
        this.field660 = arg8;
        this.field686 = arg1;
        this.field681 = arg7;
        this.field691 = arg5;
        this.field673 = arg0;
        this.field690 = arg6;
        this.field665 = false;
        this.field674 = arg2;
        this.field676 = arg3;
        this.field697 = arg9;
        int var12 = class77.method521(this.field673, (byte) -42).field985;
        if (var12 == -1) {
            this.field657 = null;
        } else {
            this.field657 = class104.method688(var12, 30091);
        }
    }
}
