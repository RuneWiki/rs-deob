import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class128 extends class86 {

    @OriginalMember(owner = "client!ol", name = "P", descriptor = "I")
    private int field2126 = 4096;

    @OriginalMember(owner = "client!ol", name = "R", descriptor = "I")
    private int field2128 = 0;

    @OriginalMember(owner = "client!ol", name = "M", descriptor = "Ljava/lang/String;")
    public static String field2123 = "Loaded fonts";

    @OriginalMember(owner = "client!ol", name = "T", descriptor = "I")
    public static int field2130 = 100;

    @OriginalMember(owner = "client!ol", name = "K", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!ol", name = "O", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!ol", name = "S", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!ol", name = "V", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!ol", name = "W", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!ol", name = "L", descriptor = "Lue;")
    public static class13 field2122;

    @OriginalMember(owner = "client!ol", name = "N", descriptor = "Lrn;")
    public static class18 field2124;

    @OriginalMember(owner = "client!ol", name = "U", descriptor = "Lfk;")
    public static class317 field2131;

    @OriginalMember(owner = "client!ol", name = "X", descriptor = "Lrg;")
    public static class342 field2134;

    @OriginalMember(owner = "client!ol", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field2127;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIII)V", line = 11)
    public static final void method1112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class249.field3860 = arg2;
        field2129++;
        class162.field2579 = arg0;
        class287.field4450 = arg5;
        class29.field476 = arg3;
        if (arg1 != -384) {
            method1113((byte) -85, -25);
        }
        class98.field1482 = arg4;
        if (class98.field1482 >= 100) {
            int var6 = class162.field2579 * 128 + 64;
            int var7 = class249.field3860 * 128 + 64;
            int var8 = class193.method1469(var7, var6, (byte) -47, class119.field1826) - class287.field4450;
            int var9 = var6 - class151.field2465;
            int var10 = var8 - class64.field975;
            int var11 = var7 - class10.field143;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class191.field3005 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class15.field248 = (int) (Math.atan2((double) var9, (double) var11) * -325.949D) & 0x7FF;
            if (class191.field3005 < 128) {
                class191.field3005 = 128;
            }
            if (class191.field3005 > 383) {
                class191.field3005 = 383;
            }
        }
        class314.field4858 = 2;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(IB)[[I", line = 58)
    public final int[][] method156(int arg0, byte arg1) {
        field2133++;
        int[][] var3 = this.field1227.method2025(false, arg0);
        if (arg1 > -126) {
            method1112(34, 42, -96, 124, 103, -36);
        }
        if (this.field1227.field4277) {
            int[][] var4 = this.method782(arg0, 0, 1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class93.field1424; var11++) {
                int var12 = var6[var11];
                int var13 = var5[var11];
                int var14 = var8[var11];
                if (this.field2128 > var13) {
                    var7[var11] = this.field2128;
                } else if (var13 <= this.field2126) {
                    var7[var11] = var13;
                } else {
                    var7[var11] = this.field2126;
                }
                if (this.field2128 > var12) {
                    var9[var11] = this.field2128;
                } else if (this.field2126 >= var12) {
                    var9[var11] = var12;
                } else {
                    var9[var11] = this.field2126;
                }
                if (var14 < this.field2128) {
                    var10[var11] = this.field2128;
                } else if (var14 > this.field2126) {
                    var10[var11] = this.field2126;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(II)[I", line = 139)
    public final int[] method158(int arg0, int arg1) {
        field2121++;
        int[] var3 = this.field1225.method1914(arg0, 88);
        if (arg1 < 7) {
            field2131 = (class317) null;
        }
        if (this.field1225.field3995) {
            int[] var4 = this.method774(0, arg0, 0);
            for (int var5 = 0; var5 < class93.field1424; var5++) {
                int var6 = var4[var5];
                if (this.field2128 > var6) {
                    var3[var5] = this.field2128;
                } else if (var6 > this.field2126) {
                    var3[var5] = this.field2126;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V", line = 239)
    public class128() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZLug;)V", line = 200)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        if (arg0 == 0) {
            this.field2128 = arg2.method314((byte) 124);
        } else if (arg0 == 1) {
            this.field2126 = arg2.method314((byte) 99);
        } else if (arg0 == 2) {
            this.field1228 = arg2.method281(-124) == 1;
        }
        if (arg1) {
            field2134 = (class342) null;
        }
        field2125++;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)V", line = 244)
    public static final void method1113(byte arg0, int arg1) {
        class264.field4101.method649((byte) 75, arg1);
        class53.field801.method649((byte) 75, arg1);
        field2132++;
        if (arg0 != 89) {
            method1114((byte) 55);
        }
        class184.field2891.method649((byte) 75, arg1);
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V", line = 257)
    public static void method1114(byte arg0) {
        field2124 = null;
        field2122 = null;
        if (arg0 == -58) {
            field2127 = null;
            field2123 = null;
            field2131 = null;
            field2134 = null;
        }
    }
}
