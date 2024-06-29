import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class62 extends class77 {

    @OriginalMember(owner = "client!db", name = "L", descriptor = "Luj;")
    public class156 field988 = new class156();

    @OriginalMember(owner = "client!db", name = "N", descriptor = "Lbk;")
    public class223 field990 = new class223();

    @OriginalMember(owner = "client!db", name = "J", descriptor = "Lde;")
    private class191 field986;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "[I")
    public static int[] field980 = new int[32];

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    public static int field982 = -1;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lkf;IIIIIIZ)V", line = 4)
    public static final void method457(class41 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field616.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field616[var9] - class89.field1373;
            int var11 = arg0.field618[var9] - class220.field3527;
            int var12 = arg0.field622[var9] - class208.field3314;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field607 != null) {
                class41.field605[var9] = var13;
                class41.field621[var9] = var16;
                class41.field606[var9] = var17;
            }
            class41.field615[var9] = (var13 << 9) / var17 + class284.field4700;
            class41.field620[var9] = (var16 << 9) / var17 + class284.field4697;
        }
        class284.field4689 = 0;
        int var19 = arg0.field624.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field624[var20];
            int var22 = arg0.field611[var20];
            int var23 = arg0.field623[var20];
            int var24 = class41.field615[var21];
            int var25 = class41.field615[var22];
            int var26 = class41.field615[var23];
            int var27 = class41.field620[var21];
            int var28 = class41.field620[var22];
            int var29 = class41.field620[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0 && class4.field121 && class195.method1254(class49.field761 + class284.field4700, class284.field4697 + class241.field3874, var27, var28, var29, var24, var25, var26)) {
                class56.field917 = arg5;
                class110.field1682 = arg6;
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([III)V", line = 89)
    public final void method458(int[] arg0, int arg1, int arg2) {
        field989++;
        this.field990.method458(arg0, arg1, arg2);
        for (class173 var4 = (class173) this.field988.method995(1836596936); var4 != null; var4 = (class173) this.field988.method996(0)) {
            if (!this.field986.method1209(var4, -16384)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field2732) {
                        this.method459(arg0, var4, var5, var6, (byte) -118, var5 + var6);
                        var4.field2732 -= var5;
                        break;
                    }
                    this.method459(arg0, var4, var4.field2732, var6, (byte) -118, var5 + var6);
                    var6 += var4.field2732;
                    var5 -= var4.field2732;
                } while (!this.field986.method1220(var6, arg0, (byte) 100, var5, var4));
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([ILqj;IIBI)V", line = 126)
    private final void method459(int[] arg0, class173 arg1, int arg2, int arg3, byte arg4, int arg5) {
        if ((this.field986.field3061[arg1.field2745] & 0x4) != 0 && arg1.field2749 < 0) {
            int var7 = this.field986.field3010[arg1.field2745] / class230.field3728;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field2748) / var7;
                if (arg2 < var8) {
                    arg1.field2748 += arg2 * var7;
                    break;
                }
                arg2 -= var8;
                arg1.field2733.method458(arg0, arg3, var8);
                arg1.field2748 += var7 * var8 - 1048576;
                int var9 = 262144 / var7;
                arg3 += var8;
                int var10 = class230.field3728 / 100;
                if (var9 < var10) {
                    var10 = var9;
                }
                class239 var11 = arg1.field2733;
                if (this.field986.field3045[arg1.field2745] == 0) {
                    arg1.field2733 = class239.method1531(arg1.field2752, var11.method1552(), var11.method1535(), var11.method1547());
                } else {
                    arg1.field2733 = class239.method1531(arg1.field2752, var11.method1552(), 0, var11.method1547());
                    this.field986.method1215((byte) 97, arg1.field2747.field2828[arg1.field2726] < 0, arg1);
                    arg1.field2733.method1526(var10, var11.method1535());
                }
                if (arg1.field2747.field2828[arg1.field2726] < 0) {
                    arg1.field2733.method1527(-1);
                }
                var11.method1562(var10);
                var11.method458(arg0, arg3, arg5 - arg3);
                if (var11.method1542()) {
                    this.field990.method1420(var11);
                }
            }
        }
        if (arg4 != -118) {
            field980 = (int[]) null;
        }
        field983++;
        arg1.field2733.method458(arg0, arg3, arg2);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lqj;II)V", line = 189)
    private final void method460(class173 arg0, int arg1, int arg2) {
        field981++;
        if ((this.field986.field3061[arg0.field2745] & 0x4) != arg2 && arg0.field2749 < 0) {
            int var4 = this.field986.field3010[arg0.field2745] / class230.field3728;
            int var5 = (var4 + 1048575 - arg0.field2748) / var4;
            arg0.field2748 = arg1 * var4 + arg0.field2748 & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field986.field3045[arg0.field2745] == 0) {
                    arg0.field2733 = class239.method1531(arg0.field2752, arg0.field2733.method1552(), arg0.field2733.method1535(), arg0.field2733.method1547());
                } else {
                    arg0.field2733 = class239.method1531(arg0.field2752, arg0.field2733.method1552(), 0, arg0.field2733.method1547());
                    this.field986.method1215((byte) 83, arg0.field2747.field2828[arg0.field2726] < 0, arg0);
                }
                if (arg0.field2747.field2828[arg0.field2726] < 0) {
                    arg0.field2733.method1527(-1);
                }
                arg1 = arg0.field2748 / var4;
            }
        }
        arg0.field2733.method468(arg1);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)V", line = 228)
    public static void method461(boolean arg0) {
        field980 = null;
        if (!arg0) {
            field982 = 55;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "()Lfg;", line = 238)
    public final class77 method462() {
        field976++;
        class173 var1;
        do {
            var1 = (class173) this.field988.method996(0);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2733 == null);
        return var1.field2733;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V", line = 271)
    public static final void method463(byte arg0) {
        if (arg0 <= 81) {
            method464(101, -57);
        }
        for (int var1 = 0; var1 < class81.field1238; var1++) {
            int var2 = class113.field1723[var1];
            class292 var3 = class23.field346[var2];
            int var4 = class22.field333.method64((byte) 66);
            if ((var4 & 0x4) != 0) {
                var4 += class22.field333.method64((byte) -82) << 8;
            }
            class2.method10(var4, var2, var3, 123);
        }
        field991++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V", line = 306)
    public static final void method464(int arg0, int arg1) {
        field992++;
        class289.field4757 = arg0;
        class265.method1741((byte) 126, 3);
        int var2 = -54 / ((-arg1 - 25) / 54);
        class265.method1741((byte) 127, 4);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIZIII)V", line = 318)
    public static final void method465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (!arg6) {
            field980 = (int[]) null;
        }
        if (arg1 == arg8 && arg0 == arg5 && arg3 == arg7 && arg4 == arg9) {
            class8.method92(arg7, arg1, arg5, 75, arg4, arg2);
        } else {
            int var10 = arg1;
            int var11 = arg1 * 3;
            int var12 = arg5;
            int var13 = arg8 * 3;
            int var14 = arg0 * 3;
            int var15 = arg9 * 3;
            int var16 = arg3 * 3;
            int var17 = arg5 * 3;
            int var18 = arg7 + var13 - var16 - arg1;
            int var19 = arg4 - var15 - (-var14 - -arg5);
            int var20 = var15 + var17 - var14 - var14;
            int var21 = var16 - var13 - (-var11 + var13);
            int var22 = var13 - var11;
            int var23 = var14 - var17;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var21 * var25;
                int var28 = var18 * var26;
                int var29 = var22 * var24;
                int var30 = var19 * var26;
                int var31 = var20 * var25;
                int var32 = var23 * var24;
                int var33 = arg5 + (var30 + var32 + var31 >> 12);
                int var34 = (var27 + var28 + var29 >> 12) + arg1;
                class8.method92(var34, var10, var12, 106, var33, arg2);
                var10 = var34;
                var12 = var33;
            }
        }
        field984++;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "()Lfg;", line = 396)
    public final class77 method466() {
        field979++;
        class173 var1 = (class173) this.field988.method995(1836596936);
        if (var1 == null) {
            return null;
        } else if (var1.field2733 == null) {
            return this.method462();
        } else {
            return var1.field2733;
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lde;)V", line = 478)
    public class62(class191 arg0) {
        this.field986 = arg0;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BLfj;)Lck;", line = 417)
    public static final class119 method467(byte arg0, class3 arg1) {
        field978++;
        if (arg0 != -20) {
            method464(50, -7);
        }
        return class61.method452(arg1, true, 32767);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V", line = 428)
    public final void method468(int arg0) {
        field985++;
        this.field990.method468(arg0);
        for (class173 var2 = (class173) this.field988.method995(1836596936); var2 != null; var2 = (class173) this.field988.method996(0)) {
            if (!this.field986.method1209(var2, -16384)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2732) {
                        this.method460(var2, var3, 0);
                        var2.field2732 -= var3;
                        break;
                    }
                    this.method460(var2, var2.field2732, 0);
                    var3 -= var2.field2732;
                } while (!this.field986.method1220(0, (int[]) null, (byte) 58, var3, var2));
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "()I", line = 469)
    public final int method469() {
        field993++;
        return 0;
    }
}
