import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class19 extends class51 {

    @OriginalMember(owner = "client!cd", name = "V", descriptor = "I")
    public int field375 = -1;

    @OriginalMember(owner = "client!cd", name = "bb", descriptor = "I")
    private int field381 = 128;

    @OriginalMember(owner = "client!cd", name = "ab", descriptor = "I")
    private int field380 = 0;

    @OriginalMember(owner = "client!cd", name = "wb", descriptor = "I")
    private int field402 = -1;

    @OriginalMember(owner = "client!cd", name = "ob", descriptor = "Z")
    public boolean field394 = false;

    @OriginalMember(owner = "client!cd", name = "lb", descriptor = "I")
    public int field391 = 2;

    @OriginalMember(owner = "client!cd", name = "rb", descriptor = "I")
    public int field397 = -1;

    @OriginalMember(owner = "client!cd", name = "Ib", descriptor = "Z")
    public boolean field414 = true;

    @OriginalMember(owner = "client!cd", name = "ub", descriptor = "Z")
    public boolean field400 = true;

    @OriginalMember(owner = "client!cd", name = "Db", descriptor = "I")
    private int field409 = -1;

    @OriginalMember(owner = "client!cd", name = "gb", descriptor = "I")
    public int field386 = -1;

    @OriginalMember(owner = "client!cd", name = "Fb", descriptor = "I")
    public int field411 = -1;

    @OriginalMember(owner = "client!cd", name = "vb", descriptor = "I")
    public int field401 = 0;

    @OriginalMember(owner = "client!cd", name = "sb", descriptor = "I")
    private int field398 = 0;

    @OriginalMember(owner = "client!cd", name = "X", descriptor = "I")
    public int field377 = 0;

    @OriginalMember(owner = "client!cd", name = "Ab", descriptor = "Z")
    private boolean field406 = false;

    @OriginalMember(owner = "client!cd", name = "Hb", descriptor = "Z")
    public boolean field413 = false;

    @OriginalMember(owner = "client!cd", name = "Lb", descriptor = "I")
    public int field417 = -1;

    @OriginalMember(owner = "client!cd", name = "Rb", descriptor = "Z")
    private boolean field423 = false;

    @OriginalMember(owner = "client!cd", name = "W", descriptor = "I")
    public int field376 = 0;

    @OriginalMember(owner = "client!cd", name = "cb", descriptor = "I")
    public int field382 = 0;

    @OriginalMember(owner = "client!cd", name = "Mb", descriptor = "I")
    public int field418 = 1;

    @OriginalMember(owner = "client!cd", name = "Ub", descriptor = "[Lic;")
    public class59[] field426 = new class59[5];

    @OriginalMember(owner = "client!cd", name = "mb", descriptor = "I")
    private int field392 = 0;

    @OriginalMember(owner = "client!cd", name = "Sb", descriptor = "I")
    private int field424 = 128;

    @OriginalMember(owner = "client!cd", name = "Vb", descriptor = "I")
    private int field427 = 128;

    @OriginalMember(owner = "client!cd", name = "Ob", descriptor = "I")
    private int field420 = -1;

    @OriginalMember(owner = "client!cd", name = "fb", descriptor = "Z")
    public boolean field385 = false;

    @OriginalMember(owner = "client!cd", name = "Tb", descriptor = "I")
    public int field425 = 16;

    @OriginalMember(owner = "client!cd", name = "cc", descriptor = "I")
    public int field434 = 1;

    @OriginalMember(owner = "client!cd", name = "zb", descriptor = "I")
    private int field405 = 0;

    @OriginalMember(owner = "client!cd", name = "Cb", descriptor = "Lic;")
    public class59 field408 = class90.field2277;

    @OriginalMember(owner = "client!cd", name = "bc", descriptor = "I")
    public int field433 = -1;

    @OriginalMember(owner = "client!cd", name = "ac", descriptor = "I")
    private int field432 = 0;

    @OriginalMember(owner = "client!cd", name = "xb", descriptor = "I")
    public static int field403 = 0;

    @OriginalMember(owner = "client!cd", name = "Qb", descriptor = "[Lic;")
    public static class59[] field422 = new class59[1000];

    @OriginalMember(owner = "client!cd", name = "Wb", descriptor = "I")
    public static int field428 = 0;

    @OriginalMember(owner = "client!cd", name = "eb", descriptor = "Lic;")
    private static class59 field384 = class59.method433(0, "Please enter your username)3");

    @OriginalMember(owner = "client!cd", name = "Xb", descriptor = "I")
    public static int field429 = 0;

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "Lic;")
    public static class59 field374 = field384;

    @OriginalMember(owner = "client!cd", name = "Y", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!cd", name = "db", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!cd", name = "kb", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!cd", name = "nb", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!cd", name = "pb", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!cd", name = "qb", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!cd", name = "tb", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!cd", name = "Eb", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!cd", name = "Gb", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!cd", name = "Jb", descriptor = "I")
    public int field415;

    @OriginalMember(owner = "client!cd", name = "Kb", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!cd", name = "Nb", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!cd", name = "Pb", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!cd", name = "Zb", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!cd", name = "dc", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!cd", name = "Yb", descriptor = "Ldd;")
    public static class26 field430;

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "[I")
    private int[] field373;

    @OriginalMember(owner = "client!cd", name = "Z", descriptor = "[I")
    public int[] field379;

    @OriginalMember(owner = "client!cd", name = "ib", descriptor = "[I")
    private int[] field388;

    @OriginalMember(owner = "client!cd", name = "Bb", descriptor = "[I")
    public int[] field407;

    @OriginalMember(owner = "client!cd", name = "hb", descriptor = "[S")
    private short[] field387;

    @OriginalMember(owner = "client!cd", name = "jb", descriptor = "[S")
    private short[] field389;

    @OriginalMember(owner = "client!cd", name = "yb", descriptor = "[S")
    private short[] field404;

    @OriginalMember(owner = "client!cd", name = "ec", descriptor = "[S")
    private short[] field436;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
    public final void method96(int arg0) {
        if (this.field375 == -1) {
            this.field375 = 0;
            if (this.field388 != null && (this.field373 == null || this.field373[0] == 10)) {
                this.field375 = 1;
            }
            for (int var2 = 0; var2 < 5; var2++) {
                if (this.field426[var2] != null) {
                    this.field375 = 1;
                }
            }
        }
        int var3 = -54 % ((-arg0 - 24) / 48);
        if (this.field433 == -1) {
            this.field433 = this.field391 == 0 ? 0 : 1;
        }
        field410++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIB)Ldf;")
    private final class28 method97(int arg0, int arg1, byte arg2) {
        if (arg2 != 102) {
            method106(88);
        }
        field421++;
        class28 var4 = null;
        if (this.field373 == null) {
            if (arg1 != 10) {
                return null;
            }
            if (this.field388 == null) {
                return null;
            }
            boolean var5 = this.field406;
            if (arg1 == 2 && arg0 > 3) {
                var5 = !var5;
            }
            int var6 = this.field388.length;
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = this.field388[var7];
                if (var5) {
                    var8 += 65536;
                }
                var4 = (class28) class96.field2436.method675((long) var8, 26431);
                if (var4 == null) {
                    var4 = class28.method210(class143.field3141, var8 & 0xFFFF, 0);
                    if (var4 == null) {
                        return null;
                    }
                    if (var5) {
                        var4.method215();
                    }
                    class96.field2436.method672(-30464, var4, (long) var8);
                }
                if (var6 > 1) {
                    class116.field2722[var7] = var4;
                }
            }
            if (var6 > 1) {
                var4 = new class28(class116.field2722, var6);
            }
        } else {
            int var9 = -1;
            for (int var10 = 0; var10 < this.field373.length; var10++) {
                if (this.field373[var10] == arg1) {
                    var9 = var10;
                    break;
                }
            }
            if (var9 == -1) {
                return null;
            }
            boolean var11 = this.field406 ^ arg0 > 3;
            int var12 = this.field388[var9];
            if (var11) {
                var12 += 65536;
            }
            var4 = (class28) class96.field2436.method675((long) var12, 26431);
            if (var4 == null) {
                var4 = class28.method210(class143.field3141, var12 & 0xFFFF, 0);
                if (var4 == null) {
                    return null;
                }
                if (var11) {
                    var4.method215();
                }
                class96.field2436.method672(-30464, var4, (long) var12);
            }
        }
        boolean var13;
        if (this.field424 == 128 && this.field427 == 128 && this.field381 == 128) {
            var13 = false;
        } else {
            var13 = true;
        }
        boolean var14;
        if (this.field380 == 0 && this.field398 == 0 && this.field405 == 0) {
            var14 = false;
        } else {
            var14 = true;
        }
        class28 var15 = new class28(var4, arg0 == 0 && !var13 && !var14, this.field389 == null, this.field436 == null, true);
        if (arg1 == 4 && arg0 > 3) {
            var15.method208(256);
            var15.method214(45, 0, -45);
        }
        int var16 = arg0 & 0x3;
        if (var16 == 1) {
            var15.method230();
        } else if (var16 == 2) {
            var15.method221();
        } else if (var16 == 3) {
            var15.method229();
        }
        if (this.field389 != null) {
            for (int var17 = 0; var17 < this.field389.length; var17++) {
                var15.method228(this.field389[var17], this.field387[var17]);
            }
        }
        if (this.field436 != null) {
            for (int var18 = 0; var18 < this.field436.length; var18++) {
                var15.method223(this.field436[var18], this.field404[var18]);
            }
        }
        if (var13) {
            var15.method222(this.field424, this.field427, this.field381);
        }
        if (var14) {
            var15.method214(this.field380, this.field398, this.field405);
        }
        return var15;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II[[IIIIZ)Lnb;")
    public final class92 method98(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, boolean arg6) {
        long var8;
        if (this.field373 == null) {
            var8 = (this.field415 << 10) + arg0;
        } else {
            var8 = (this.field415 << 10) + ((arg1 << 3) + arg0);
        }
        field435++;
        class92 var10 = (class92) class102.field2483.method675(var8, 26431);
        if (arg6) {
            method104(12);
        }
        if (var10 == null) {
            class28 var11 = this.method97(arg0, arg1, (byte) 102);
            if (var11 == null) {
                return null;
            }
            var10 = var11.method217(this.field432 + 64, this.field392 * 5 + 768, -50, -10, -50);
            class102.field2483.method672(-30464, var10, var8);
        }
        if (this.field420 >= 0) {
            var10 = var10.method776(arg2, arg5, arg4, arg3, true, this.field420);
        }
        return var10;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lwf;B)Z")
    public static final boolean method99(class159 arg0, byte arg1) {
        field378++;
        if (arg1 >= -20) {
            return true;
        } else if (arg0.field3617 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < arg0.field3617.length; var2++) {
                int var3 = class116.method930(arg0, var2, 0);
                int var4 = arg0.field3636[var2];
                if (arg0.field3617[var2] == 2) {
                    if (var4 <= var3) {
                        return false;
                    }
                } else if (arg0.field3617[var2] == 3) {
                    if (var3 <= var4) {
                        return false;
                    }
                } else if (arg0.field3617[var2] == 4) {
                    if (var3 == var4) {
                        return false;
                    }
                } else if (var3 != var4) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BIII[[III)Lka;")
    public final class70 method100(byte arg0, int arg1, int arg2, int arg3, int[][] arg4, int arg5, int arg6) {
        field393++;
        if (arg0 > -83) {
            this.method96(-19);
        }
        long var8;
        if (this.field373 == null) {
            var8 = (this.field415 << 10) + arg2;
        } else {
            var8 = (this.field415 << 10) - (-(arg5 << 3) - arg2);
        }
        class70 var10 = (class70) class128.field2896.method675(var8, 26431);
        if (var10 == null) {
            class28 var11 = this.method97(arg2, arg5, (byte) 102);
            if (var11 == null) {
                return null;
            }
            if (this.field423) {
                var11.field726 = (short) (this.field392 * 5 + 768);
                var10 = var11;
                var11.field716 = (short) (this.field432 + 64);
                var11.method216();
            } else {
                var10 = var11.method217(this.field432 + 64, this.field392 * 5 + 768, -50, -10, -50);
            }
            class128.field2896.method672(-30464, var10, var8);
        }
        if (this.field423) {
            var10 = ((class28) var10).method220();
        }
        if (this.field420 >= 0) {
            if (var10 instanceof class92) {
                var10 = ((class92) var10).method776(arg4, arg3, arg1, arg6, true, this.field420);
            } else if (var10 instanceof class28) {
                var10 = ((class28) var10).method213(arg4, arg3, arg1, arg6, true, this.field420);
            }
        }
        return var10;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIILdc;II[[II)Lnb;")
    public final class92 method101(int arg0, int arg1, int arg2, int arg3, class25 arg4, int arg5, int arg6, int[][] arg7, int arg8) {
        if (arg5 != -5665) {
            return null;
        }
        field390++;
        long var10;
        if (this.field373 == null) {
            var10 = (this.field415 << 10) + arg8;
        } else {
            var10 = (this.field415 << 10) + (arg6 << 3) + arg8;
        }
        class92 var12 = (class92) class102.field2483.method675(var10, 26431);
        if (var12 == null) {
            class28 var13 = this.method97(arg8, arg6, (byte) 102);
            if (var13 == null) {
                return null;
            }
            var12 = var13.method217(this.field432 + 64, this.field392 * 5 + 768, -50, -10, -50);
            class102.field2483.method672(-30464, var12, var10);
        }
        if (arg4 == null && this.field420 == -1) {
            return var12;
        }
        class92 var14;
        if (arg4 == null) {
            var14 = var12.method761(true);
        } else {
            var14 = arg4.method170(var12, arg0, (byte) -33, arg8);
        }
        if (this.field420 >= 0) {
            var14 = var14.method776(arg7, arg3, arg2, arg1, false, this.field420);
        }
        return var14;
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)Lcd;")
    public final class19 method102(int arg0) {
        field416++;
        if (arg0 != -19992) {
            this.field411 = -97;
        }
        int var2 = -1;
        if (this.field402 != -1) {
            var2 = class25.method175(this.field402, false);
        } else if (this.field409 != -1) {
            var2 = class85.field2124[this.field409];
        }
        return var2 < 0 || this.field379.length <= var2 || this.field379[var2] == -1 ? null : class53.method397(this.field379[var2], 13415);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Z")
    public final boolean method103(int arg0, int arg1) {
        field412++;
        if (arg1 != 0) {
            field428 = 53;
        }
        if (this.field373 != null) {
            for (int var3 = 0; var3 < this.field373.length; var3++) {
                if (this.field373[var3] == arg0) {
                    return class143.field3141.method182(this.field388[var3] & 0xFFFF, 0, 1);
                }
            }
            return true;
        } else if (this.field388 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var4 = true;
            for (int var5 = 0; var5 < this.field388.length; var5++) {
                var4 &= class143.field3141.method182(this.field388[var5] & 0xFFFF, 0, arg1 + 1);
            }
            return var4;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V")
    public static final void method104(int arg0) {
        field396++;
        if (class32.field873 == 53) {
            int var1 = class10.field213.method1194(false);
            int var2 = class80.field1984 + (var1 >> 4 & 0x7);
            int var3 = class34.field916 + (var1 & 0x7);
            int var4 = class10.field213.method1161((byte) 60);
            int var5 = class10.field213.method1161((byte) 60);
            int var6 = class10.field213.method1161((byte) 60);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class83 var7 = class23.field563[class44.field1127][var2][var3];
                if (var7 != null) {
                    for (class15 var8 = (class15) var7.method682(arg0 ^ 0x5); var8 != null; var8 = (class15) var7.method684((byte) -65)) {
                        if ((var4 & 0x7FFF) == var8.field303 && var8.field301 == var5) {
                            var8.field301 = var6;
                            break;
                        }
                    }
                    class70.method554((byte) -114, var2, var3);
                }
            }
        } else if (class32.field873 == 137) {
            int var9 = class10.field213.method1180(-128);
            int var10 = class10.field213.method1180(-128);
            int var11 = class10.field213.method1173(false);
            int var12 = (var11 & 0x7) + class34.field916;
            int var13 = (var11 >> 4 & 0x7) + class80.field1984;
            if (var13 >= 0 && var12 >= 0 && var13 < 104 && var12 < 104) {
                class15 var14 = new class15();
                var14.field301 = var9;
                var14.field303 = var10;
                if (class23.field563[class44.field1127][var13][var12] == null) {
                    class23.field563[class44.field1127][var13][var12] = new class83();
                }
                class23.field563[class44.field1127][var13][var12].method689(var14, (byte) 12);
                class70.method554((byte) -114, var13, var12);
            }
        } else if (class32.field873 == 201) {
            int var15 = class10.field213.method1194(false);
            int var16 = var15 >> 2;
            int var17 = var15 & 0x3;
            int var18 = class24.field594[var16];
            int var19 = class10.field213.method1200((byte) 124);
            int var20 = class10.field213.method1194(false);
            int var21 = (var20 & 0x7) + class34.field916;
            int var22 = (var20 >> 4 & 0x7) + class80.field1984;
            if (var22 >= 0 && var21 >= 0 && var22 < 104 && var21 < 104) {
                class54.method406(class44.field1127, var22, var21, 0, var17, var16, -1, var19, var18, arg0 - 40);
            }
        } else if (class32.field873 == 40) {
            int var23 = class10.field213.method1194(false);
            int var24 = (var23 >> 4 & 0x7) + class80.field1984;
            int var25 = (var23 & 0x7) + class34.field916;
            int var26 = var24 + class10.field213.method1169((byte) -85);
            int var27 = class10.field213.method1169((byte) -50) + var25;
            int var28 = class10.field213.method1178((byte) -33);
            int var29 = class10.field213.method1161((byte) 60);
            int var30 = class10.field213.method1194(false) * 4;
            int var31 = class10.field213.method1194(false) * 4;
            int var32 = class10.field213.method1161((byte) 60);
            int var33 = class10.field213.method1161((byte) 60);
            int var34 = class10.field213.method1194(false);
            int var35 = class10.field213.method1194(false);
            if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && var29 != 65535) {
                int var36 = var24 * 128 + 64;
                int var37 = var27 * 128 + 64;
                int var38 = var26 * 128 + 64;
                int var39 = var25 * 128 + 64;
                class148 var40 = new class148(var29, class44.field1127, var36, var39, class147.method1095((byte) 30, var39, class44.field1127, var36) - var30, var32 - -class23.field561, class23.field561 + var33, var34, var35, var28, var31);
                var40.method1104((byte) 45, var38, class147.method1095((byte) 30, var37, class44.field1127, var38) - var31, var37, class23.field561 + var32);
                class89.field2242.method689(var40, (byte) -123);
            }
        } else if (class32.field873 == 96) {
            int var41 = class10.field213.method1199(43);
            int var42 = (var41 & 0x7) + class34.field916;
            int var43 = class80.field1984 + (var41 >> 4 & 0x7);
            int var44 = class10.field213.method1199(-120);
            int var45 = var44 & 0x3;
            int var46 = var44 >> 2;
            int var47 = class24.field594[var46];
            int var48 = class10.field213.method1161((byte) 60);
            if (var43 >= 0 && var42 >= 0 && var43 < 103 && var42 < 103) {
                if (var47 == 0) {
                    class137 var49 = class3.field58.method909(class44.field1127, var43, var42);
                    if (var49 != null) {
                        int var50 = var49.field3069 >> 14 & 0x7FFF;
                        if (var46 == 2) {
                            var49.field3063 = new class8(var50, 2, var45 + 4, class44.field1127, var43, var42, var48, false, var49.field3063);
                            var49.field3072 = new class8(var50, 2, var45 + 1 & 0x3, class44.field1127, var43, var42, var48, false, var49.field3072);
                        } else {
                            var49.field3063 = new class8(var50, var46, var45, class44.field1127, var43, var42, var48, false, var49.field3063);
                        }
                    }
                }
                if (var47 == 1) {
                    class120 var51 = class3.field58.method901(class44.field1127, var43, var42);
                    if (var51 != null) {
                        int var52 = var51.field2760 >> 14 & 0x7FFF;
                        if (var46 == 4 || var46 == 5) {
                            var51.field2764 = new class8(var52, 4, var45, class44.field1127, var43, var42, var48, false, var51.field2764);
                        } else if (var46 == 6) {
                            var51.field2764 = new class8(var52, 4, var45 + 4, class44.field1127, var43, var42, var48, false, var51.field2764);
                        } else if (var46 == 7) {
                            var51.field2764 = new class8(var52, 4, (var45 + 2 & 0x3) + 4, class44.field1127, var43, var42, var48, false, var51.field2764);
                        } else if (var46 == 8) {
                            var51.field2764 = new class8(var52, 4, var45 + 4, class44.field1127, var43, var42, var48, false, var51.field2764);
                            var51.field2763 = new class8(var52, 4, (var45 + 2 & 0x3) + 4, class44.field1127, var43, var42, var48, false, var51.field2763);
                        }
                    }
                }
                if (var47 == 2) {
                    if (var46 == 11) {
                        var46 = 10;
                    }
                    class21 var53 = class3.field58.method866(class44.field1127, var43, var42);
                    if (var53 != null) {
                        var53.field473 = new class8(var53.field461 >> 14 & 0x7FFF, var46, var45, class44.field1127, var43, var42, var48, false, var53.field473);
                    }
                }
                if (var47 == 3) {
                    class32 var54 = class3.field58.method878(class44.field1127, var43, var42);
                    if (var54 != null) {
                        var54.field857 = new class8(var54.field872 >> 14 & 0x7FFF, 22, var45, class44.field1127, var43, var42, var48, false, var54.field857);
                    }
                }
            }
        } else {
            if (arg0 != 5) {
                method104(89);
            }
            if (class32.field873 == 174) {
                int var55 = class10.field213.method1200((byte) 113);
                int var56 = class10.field213.method1194(false);
                int var57 = class80.field1984 + (var56 >> 4 & 0x7);
                int var58 = (var56 & 0x7) + class34.field916;
                if (var57 >= 0 && var58 >= 0 && var57 < 104 && var58 < 104) {
                    class83 var59 = class23.field563[class44.field1127][var57][var58];
                    if (var59 != null) {
                        for (class15 var60 = (class15) var59.method682(0); var60 != null; var60 = (class15) var59.method684((byte) -65)) {
                            if ((var55 & 0x7FFF) == var60.field303) {
                                var60.method929(98);
                                break;
                            }
                        }
                        if (var59.method682(0) == null) {
                            class23.field563[class44.field1127][var57][var58] = null;
                        }
                        class70.method554((byte) -114, var57, var58);
                    }
                }
            } else if (class32.field873 == 147) {
                int var61 = class10.field213.method1199(105);
                int var62 = (var61 >> 4 & 0x7) + class80.field1984;
                int var63 = (var61 & 0x7) + class34.field916;
                int var64 = class10.field213.method1194(false);
                int var65 = var64 & 0x3;
                int var66 = var64 >> 2;
                int var67 = class24.field594[var66];
                if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104) {
                    class54.method406(class44.field1127, var62, var63, 0, var65, var66, -1, -1, var67, -106);
                }
            } else if (class32.field873 == 177) {
                int var68 = class10.field213.method1211(false);
                int var69 = class10.field213.method1200((byte) 101);
                int var70 = class10.field213.method1173(false);
                int var71 = class34.field916 + (var70 & 0x7);
                int var72 = (var70 >> 4 & 0x7) + class80.field1984;
                int var73 = class10.field213.method1211(false);
                if (var72 >= 0 && var71 >= 0 && var72 < 104 && var71 < 104 && class2.field42 != var68) {
                    class15 var74 = new class15();
                    var74.field303 = var73;
                    var74.field301 = var69;
                    if (class23.field563[class44.field1127][var72][var71] == null) {
                        class23.field563[class44.field1127][var72][var71] = new class83();
                    }
                    class23.field563[class44.field1127][var72][var71].method689(var74, (byte) 108);
                    class70.method554((byte) -114, var72, var71);
                }
            } else if (class32.field873 == 168) {
                int var75 = class10.field213.method1194(false);
                int var76 = class80.field1984 + (var75 >> 4 & 0x7);
                int var77 = class34.field916 + (var75 & 0x7);
                int var78 = class10.field213.method1161((byte) 60);
                int var79 = class10.field213.method1194(false);
                int var80 = class10.field213.method1161((byte) 60);
                if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
                    int var81 = var76 * 128 + 64;
                    int var82 = var77 * 128 + 64;
                    class91 var83 = new class91(var78, class44.field1127, var81, var82, class147.method1095((byte) 30, var82, class44.field1127, var81) - var79, var80, class23.field561);
                    class44.field1131.method689(var83, (byte) 81);
                }
            } else {
                if (class32.field873 == 223) {
                    int var84 = class10.field213.method1194(false);
                    int var85 = (var84 >> 4 & 0x7) + class80.field1984;
                    int var86 = (var84 & 0x7) + class34.field916;
                    int var87 = class10.field213.method1161((byte) 60);
                    int var88 = class10.field213.method1194(false);
                    int var89 = var88 >> 4 & 0xF;
                    int var90 = class10.field213.method1194(false);
                    int var91 = var88 & 0x7;
                    if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
                        int var92 = var89 + 1;
                        if (var85 - var92 <= class159.field3650.field1719[0] && var85 + var92 >= class159.field3650.field1719[0] && var86 - var92 <= class159.field3650.field1704[0] && class159.field3650.field1704[0] <= var86 + var92 && class73.field1804 != 0 && var91 > 0 && class68.field1703 < 50) {
                            class75.field1855[class68.field1703] = var87;
                            class61.field1562[class68.field1703] = var91;
                            class38.field973[class68.field1703] = var90;
                            class4.field81[class68.field1703] = null;
                            class22.field522[class68.field1703] = (var85 << 16) + (var86 << 8) + var89;
                            class68.field1703++;
                        }
                    }
                }
                if (class32.field873 == 179) {
                    int var93 = class10.field213.method1199(arg0 ^ 0xFFFFFFA1);
                    int var94 = (var93 >> 4 & 0x7) + class80.field1984;
                    int var95 = (var93 & 0x7) + class34.field916;
                    int var96 = class10.field213.method1180(-128);
                    int var97 = class10.field213.method1180(-128);
                    int var98 = class10.field213.method1173(false);
                    int var99 = var98 & 0x3;
                    int var100 = var98 >> 2;
                    int var101 = class24.field594[var100];
                    int var102 = class10.field213.method1161((byte) 60);
                    byte var103 = class10.field213.method1169((byte) -121);
                    byte var104 = class10.field213.method1196(-35);
                    byte var105 = class10.field213.method1196(-71);
                    int var106 = class10.field213.method1211(false);
                    byte var107 = class10.field213.method1197(arg0 ^ 0x8005);
                    class49 var108;
                    if (class2.field42 == var106) {
                        var108 = class159.field3650;
                    } else {
                        var108 = class91.field2323[var106];
                    }
                    if (var108 != null) {
                        class19 var109 = class53.method397(var102, 13415);
                        int var110;
                        int var111;
                        if (var99 == 1 || var99 == 3) {
                            var110 = var109.field418;
                            var111 = var109.field434;
                        } else {
                            var110 = var109.field434;
                            var111 = var109.field418;
                        }
                        int var112 = var94 + (var111 + 1 >> 1);
                        int var113 = var94 + (var111 >> 1);
                        int var114 = var95 + (var110 >> 1);
                        int[][] var115 = class26.field695[class44.field1127];
                        int var116 = (var110 + 1 >> 1) + var95;
                        int var117 = (var94 << 7) + (var111 << 6);
                        int var118 = (var95 << 7) + (var110 << 6);
                        int var119 = var115[var113][var114] + var115[var113][var116] + var115[var112][var114] + var115[var112][var116] >> 2;
                        class92 var120 = var109.method98(var99, var100, var115, var118, var119, var117, false);
                        if (var120 != null) {
                            if (var105 > var103) {
                                byte var121 = var105;
                                var105 = var103;
                                var103 = var121;
                            }
                            if (var104 < var107) {
                                byte var122 = var107;
                                var107 = var104;
                                var104 = var122;
                            }
                            class54.method406(class44.field1127, var94, var95, var96 + 1, 0, 0, var97 + 1, -1, var101, -24);
                            var108.field1243 = var95 * 128 + var110 * 64;
                            var108.field1251 = var94 * 128 + var111 * 64;
                            var108.field1256 = var119;
                            var108.field1219 = var94 + var103;
                            var108.field1253 = var94 + var105;
                            var108.field1236 = var95 + var107;
                            var108.field1232 = var95 + var104;
                            var108.field1240 = var120;
                            var108.field1230 = class23.field561 + var97;
                            var108.field1228 = var96 + class23.field561;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lwd;I)V")
    public final void method105(class157 arg0, int arg1) {
        field395++;
        if (arg1 != -1) {
            field422 = null;
        }
        while (true) {
            int var3 = arg0.method1194(false);
            if (var3 == 0) {
                return;
            }
            this.method108(-834, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)V")
    public static void method106(int arg0) {
        field430 = null;
        if (arg0 != -27483) {
            field374 = null;
        }
        field374 = null;
        field384 = null;
        field422 = null;
    }

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "(I)V")
    public static final void method107(int arg0) {
        field399++;
        try {
            if (class84.field2085 == 0) {
                if (class102.field2491 != null) {
                    class102.field2491.method308(19401);
                    class102.field2491 = null;
                }
                class125.field2845 = 0;
                class126.field2857 = false;
                class7.field138 = null;
                class84.field2085 = 1;
            }
            if (class84.field2085 == 1) {
                if (class7.field138 == null) {
                    class7.field138 = class102.field2497.method540(class89.field2263, (byte) -65, class73.field1817);
                }
                if (class7.field138.field252 == 2) {
                    throw new IOException();
                }
                if (class7.field138.field252 == 1) {
                    class102.field2491 = new class40((Socket) class7.field138.field254, class102.field2497);
                    class84.field2085 = 2;
                    class7.field138 = null;
                }
            }
            if (class84.field2085 == 2) {
                long var1 = class94.field2404 = class90.field2295.method447(12074);
                class125.field2842.field3457 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class125.field2842.method1205(14, 8584);
                class125.field2842.method1205(var3, 8584);
                class102.field2491.method306(2, 0, 15731, class125.field2842.field3473);
                class84.field2085 = 3;
                class10.field213.field3457 = 0;
            }
            if (class84.field2085 == 3) {
                if (class107.field2582 != null) {
                    class107.field2582.method161(-29104);
                }
                if (class131.field2938 != null) {
                    class131.field2938.method161(-29104);
                }
                int var4 = class102.field2491.method302(-110);
                if (class107.field2582 != null) {
                    class107.field2582.method161(-29104);
                }
                if (class131.field2938 != null) {
                    class131.field2938.method161(-29104);
                }
                if (var4 != 0) {
                    class107.method839(var4, 3072);
                    return;
                }
                class84.field2085 = 4;
                class10.field213.field3457 = 0;
            }
            if (class84.field2085 == 4) {
                if (class10.field213.field3457 < 8) {
                    int var5 = class102.field2491.method305((byte) 107);
                    if (8 - class10.field213.field3457 < var5) {
                        var5 = 8 - class10.field213.field3457;
                    }
                    if (var5 > 0) {
                        class102.field2491.method309(class10.field213.field3457, (byte) 114, var5, class10.field213.field3473);
                        class10.field213.field3457 += var5;
                    }
                }
                if (class10.field213.field3457 == 8) {
                    class10.field213.field3457 = 0;
                    class24.field579 = class10.field213.method1186(false);
                    class84.field2085 = 5;
                }
            }
            if (class84.field2085 == 5) {
                class125.field2842.field3457 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class24.field579 >> 32), (int) class24.field579 };
                class125.field2842.method1205(10, 8584);
                class125.field2842.method1195(var6[0], 852);
                class125.field2842.method1195(var6[1], 852);
                class125.field2842.method1195(var6[2], 852);
                class125.field2842.method1195(var6[3], 852);
                class125.field2842.method1201(class90.field2295.method447(12074), (byte) 38);
                class125.field2842.method1187(100, class90.field2290);
                class125.field2842.method1204((byte) -103, class84.field2108, class148.field3220);
                class85.field2135.field3457 = 0;
                if (class64.field1635 == 40) {
                    class85.field2135.method1205(18, 8584);
                } else {
                    class85.field2135.method1205(16, 8584);
                }
                class85.field2135.method1205(class125.field2842.field3457 + 93, 8584);
                class85.field2135.method1195(472, 852);
                class85.field2135.method1205(class127.field2882 ? 1 : 0, 8584);
                class43.method331(-56, class85.field2135);
                class85.field2135.method1195(class89.field2265.field643, 852);
                class85.field2135.method1195(class98.field2445.field643, 852);
                class85.field2135.method1195(class114.field2708.field643, 852);
                class85.field2135.method1195(class40.field1013.field643, 852);
                class85.field2135.method1195(class103.field2514.field643, 852);
                class85.field2135.method1195(class38.field993.field643, 852);
                class85.field2135.method1195(class73.field1832.field643, 852);
                class85.field2135.method1195(class89.field2266.field643, 852);
                class85.field2135.method1195(class100.field2476.field643, 852);
                class85.field2135.method1195(class9.field189.field643, 852);
                class85.field2135.method1195(class77.field1892.field643, 852);
                class85.field2135.method1195(class84.field2083.field643, 852);
                class85.field2135.method1195(class154.field3332.field643, 852);
                class85.field2135.method1195(class75.field1856.field643, 852);
                class85.field2135.method1195(class83.field2062.field643, 852);
                class85.field2135.method1195(class8.field170.field643, 852);
                class85.field2135.method1193(class125.field2842.field3473, 0, 255, class125.field2842.field3457);
                class102.field2491.method306(class85.field2135.field3457, 0, 15731, class85.field2135.field3473);
                class125.field2842.method1069(var6, -104);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class10.field213.method1069(var6, -104);
                class84.field2085 = 6;
            }
            if (class84.field2085 == 6 && class102.field2491.method305((byte) 107) > 0) {
                int var8 = class102.field2491.method302(-112);
                if (var8 == 21 && class64.field1635 == 20) {
                    class84.field2085 = 7;
                } else if (var8 == 2) {
                    class84.field2085 = 9;
                } else if (var8 == 15 && class64.field1635 == 40) {
                    class125.method961(0);
                    return;
                } else if (var8 == 23 && class32.field867 < 1) {
                    class84.field2085 = 0;
                    class32.field867++;
                } else {
                    class107.method839(var8, 3072);
                    return;
                }
            }
            if (class84.field2085 == 7 && class102.field2491.method305((byte) 107) > 0) {
                class34.field912 = class102.field2491.method302(-121) * 60 + 180;
                class84.field2085 = 8;
            }
            if (class84.field2085 == 8) {
                class125.field2845 = 0;
                class81.method666(class84.field2115, class46.method358(new class59[] { class46.method361(class34.field912 / 60, 60), class35.field933 }, (byte) -75), -93, class86.field2179);
                if (--class34.field912 <= 0) {
                    class84.field2085 = 0;
                }
            } else {
                if (class84.field2085 == 9 && class102.field2491.method305((byte) 107) >= 8) {
                    class9.field193 = class102.field2491.method302(-114);
                    class154.field3333 = class102.field2491.method302(-108) == 1;
                    class2.field42 = class102.field2491.method302(-100);
                    class2.field42 <<= 0x8;
                    class2.field42 += class102.field2491.method302(-84);
                    class116.field2735 = class102.field2491.method302(-86);
                    class102.field2491.method309(0, (byte) 37, 1, class10.field213.field3473);
                    class10.field213.field3457 = 0;
                    class32.field873 = class10.field213.method1074(-24234);
                    class102.field2491.method309(0, (byte) 40, 2, class10.field213.field3473);
                    class10.field213.field3457 = 0;
                    class34.field914 = class10.field213.method1161((byte) 60);
                    class84.field2085 = 10;
                }
                if (arg0 >= 90) {
                    if (class84.field2085 != 10) {
                        class125.field2845++;
                        if (class125.field2845 > 2000) {
                            if (class32.field867 < 1) {
                                if (class73.field1817 == class68.field1723) {
                                    class73.field1817 = class57.field1397;
                                } else {
                                    class73.field1817 = class68.field1723;
                                }
                                class84.field2085 = 0;
                                class32.field867++;
                            } else {
                                class107.method839(-3, 3072);
                            }
                        }
                    } else if (class102.field2491.method305((byte) 107) >= class34.field914) {
                        class10.field213.field3457 = 0;
                        class102.field2491.method309(0, (byte) 33, class34.field914, class10.field213.field3473);
                        class55.method410((byte) 82);
                        class157.field3436 = -1;
                        class65.method533(2864, false);
                        class32.field873 = -1;
                    }
                }
            }
        } catch (IOException var9) {
            if (class32.field867 < 1) {
                class84.field2085 = 0;
                class32.field867++;
                if (class73.field1817 == class68.field1723) {
                    class73.field1817 = class57.field1397;
                } else {
                    class73.field1817 = class68.field1723;
                }
            } else {
                class107.method839(-2, 3072);
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILwd;)V")
    private final void method108(int arg0, int arg1, class157 arg2) {
        if (arg0 != -834) {
            this.method100((byte) 25, -78, -1, 91, null, -36, -83);
        }
        field383++;
        if (arg1 == 1) {
            int var14 = arg2.method1194(false);
            if (var14 > 0) {
                if (this.field388 == null || class121.field2781) {
                    this.field373 = new int[var14];
                    this.field388 = new int[var14];
                    for (int var15 = 0; var15 < var14; var15++) {
                        this.field388[var15] = arg2.method1161((byte) 60);
                        this.field373[var15] = arg2.method1194(false);
                    }
                } else {
                    arg2.field3457 += var14 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field408 = arg2.method1214((byte) -46);
        } else if (arg1 == 5) {
            int var4 = arg2.method1194(false);
            if (var4 > 0) {
                if (this.field388 != null && !class121.field2781) {
                    arg2.field3457 += var4 * 2;
                    return;
                }
                this.field388 = new int[var4];
                this.field373 = null;
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field388[var5] = arg2.method1161((byte) 60);
                }
                return;
            }
        } else if (arg1 == 14) {
            this.field418 = arg2.method1194(false);
            return;
        } else if (arg1 == 15) {
            this.field434 = arg2.method1194(false);
        } else if (arg1 == 17) {
            this.field400 = false;
            this.field391 = 0;
            return;
        } else if (arg1 == 18) {
            this.field400 = false;
            return;
        } else if (arg1 == 19) {
            this.field375 = arg2.method1194(false);
            return;
        } else if (arg1 == 21) {
            this.field420 = 0;
            return;
        } else if (arg1 == 22) {
            this.field423 = true;
            return;
        } else if (arg1 == 23) {
            this.field394 = true;
            return;
        } else {
            if (arg1 == 24) {
                this.field411 = arg2.method1161((byte) 60);
                if (this.field411 == 65535) {
                    this.field411 = -1;
                    return;
                }
            } else if (arg1 == 27) {
                this.field391 = 1;
                return;
            } else if (arg1 == 28) {
                this.field425 = arg2.method1194(false);
                return;
            } else if (arg1 == 29) {
                this.field432 = arg2.method1169((byte) 112);
            } else if (arg1 == 39) {
                this.field392 = arg2.method1169((byte) -127) * 5;
                return;
            } else {
                if (arg1 >= 30 && arg1 < 35) {
                    this.field426[arg1 - 30] = arg2.method1214((byte) -46);
                    if (this.field426[arg1 - 30].method423(class108.field2617, -61)) {
                        this.field426[arg1 - 30] = null;
                        return;
                    }
                } else if (arg1 == 40) {
                    int var12 = arg2.method1194(false);
                    this.field387 = new short[var12];
                    this.field389 = new short[var12];
                    for (int var13 = 0; var13 < var12; var13++) {
                        this.field389[var13] = (short) arg2.method1161((byte) 60);
                        this.field387[var13] = (short) arg2.method1161((byte) 60);
                    }
                } else if (arg1 == 41) {
                    int var6 = arg2.method1194(false);
                    this.field404 = new short[var6];
                    this.field436 = new short[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field436[var7] = (short) arg2.method1161((byte) 60);
                        this.field404[var7] = (short) arg2.method1161((byte) 60);
                    }
                    return;
                } else if (arg1 == 60) {
                    this.field386 = arg2.method1161((byte) 60);
                    return;
                } else if (arg1 == 62) {
                    this.field406 = true;
                    return;
                } else if (arg1 == 64) {
                    this.field414 = false;
                    return;
                } else if (arg1 == 65) {
                    this.field424 = arg2.method1161((byte) 60);
                    return;
                } else if (arg1 == 66) {
                    this.field427 = arg2.method1161((byte) 60);
                    return;
                } else if (arg1 == 67) {
                    this.field381 = arg2.method1161((byte) 60);
                    return;
                } else if (arg1 == 68) {
                    this.field417 = arg2.method1161((byte) 60);
                    return;
                } else if (arg1 == 69) {
                    this.field382 = arg2.method1194(false);
                    return;
                } else if (arg1 == 70) {
                    this.field380 = arg2.method1178((byte) -33);
                    return;
                } else if (arg1 == 71) {
                    this.field398 = arg2.method1178((byte) -33);
                    return;
                } else if (arg1 == 72) {
                    this.field405 = arg2.method1178((byte) -33);
                    return;
                } else if (arg1 == 73) {
                    this.field385 = true;
                    return;
                } else if (arg1 == 74) {
                    this.field413 = true;
                    return;
                } else if (arg1 == 75) {
                    this.field433 = arg2.method1194(false);
                    return;
                } else if (arg1 == 77) {
                    this.field402 = arg2.method1161((byte) 60);
                    if (this.field402 == 65535) {
                        this.field402 = -1;
                    }
                    this.field409 = arg2.method1161((byte) 60);
                    if (this.field409 == 65535) {
                        this.field409 = -1;
                    }
                    int var8 = arg2.method1194(false);
                    this.field379 = new int[var8 + 1];
                    for (int var9 = 0; var9 <= var8; var9++) {
                        this.field379[var9] = arg2.method1161((byte) 60);
                        if (this.field379[var9] == 65535) {
                            this.field379[var9] = -1;
                        }
                    }
                    return;
                } else if (arg1 == 78) {
                    this.field397 = arg2.method1161((byte) 60);
                    this.field377 = arg2.method1194(false);
                    return;
                } else {
                    if (arg1 == 79) {
                        this.field401 = arg2.method1161((byte) 60);
                        this.field376 = arg2.method1161((byte) 60);
                        this.field377 = arg2.method1194(false);
                        int var10 = arg2.method1194(false);
                        this.field407 = new int[var10];
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field407[var11] = arg2.method1161((byte) 60);
                        }
                    } else if (arg1 == 81) {
                        this.field420 = arg2.method1194(false) * 256;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "(I)Z")
    public final boolean method109(int arg0) {
        field419++;
        if (this.field379 == null) {
            return this.field397 != -1 || this.field407 != null;
        }
        int var2 = -93 / ((23 - arg0) / 60);
        for (int var3 = 0; var3 < this.field379.length; var3++) {
            if (this.field379[var3] != -1) {
                class19 var4 = class53.method397(this.field379[var3], 13415);
                if (var4.field397 != -1 || var4.field407 != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "(I)Z")
    public final boolean method110(int arg0) {
        field431++;
        if (this.field388 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field388.length; var3++) {
            var2 &= class143.field3141.method182(this.field388[var3] & 0xFFFF, 0, 1);
        }
        if (arg0 != 164579463) {
            field428 = 20;
        }
        return var2;
    }
}
