import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class161 {

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    private int field2944 = -1;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    private int field2936 = 0;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "Ldb;")
    private class36 field2953 = new class36();

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "Z")
    public boolean field2957 = false;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    private int field2934;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    private int field2948;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "[[[I")
    private int[][][] field2937;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "[Lcd;")
    private class27[] field2946;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "[I")
    public static int[] field2942 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "Lkh;")
    public static class117 field2939 = class224.method1450((byte) 110, "overlay2)3dat");

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field2941 = 0;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public static int field2952 = 0;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIII)V")
    public static final void method1143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2956++;
        if (arg2 < 22) {
            return;
        }
        class146.field2681[0].method1084(arg5, arg0);
        int var6 = (arg1 - 32) * arg1 / arg3;
        if (var6 < 8) {
            var6 = 8;
        }
        class146.field2681[1].method1084(arg5, arg1 + arg0 - 16);
        int var7 = (arg1 - var6 - 32) * arg4 / (arg3 - arg1);
        class83.method579(arg5, arg0 + 16, 16, arg1 - 32, class30.field720);
        class83.method579(arg5, arg0 + var7 + 16, 16, var6, class57.field1175);
        class83.method577(arg5, arg0 + var7 + 16, var6, class237.field4288);
        class83.method577(arg5 + 1, arg0 - (-16 - var7), var6, class237.field4288);
        class83.method569(arg5, arg0 + var7 + 16, 16, class237.field4288);
        class83.method569(arg5, arg0 + var7 + 17, 16, class237.field4288);
        class83.method577(arg5 + 15, arg0 - (-16 - var7), var6, class60.field1217);
        class83.method577(arg5 + 14, arg0 + 17 - -var7, var6 - 1, class60.field1217);
        class83.method569(arg5, arg0 + var7 + var6 + 15, 16, class60.field1217);
        class83.method569(arg5 + 1, arg0 + var6 + var7 + 14, 15, class60.field1217);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)Lwe;")
    public static final class244 method1144(int arg0, byte arg1) {
        field2945++;
        class244 var2 = (class244) class191.field3408.method506(arg1 ^ 0x59, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 88) {
            method1149(40, (byte) -99);
        }
        byte[] var3 = class105.field1915.method104(arg1 - 176, class85.method593(true, arg0), class115.method769(arg0, -17516));
        class244 var4 = new class244();
        if (var3 != null) {
            var4.method1572((byte) -125, new class145(var3));
        }
        class191.field3408.method497((long) arg0, var4, -101);
        return var4;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method1145(int arg0) {
        field2939 = null;
        field2942 = null;
        if (arg0 != 0) {
            field2952 = -105;
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
    public final void method1146(int arg0) {
        if (arg0 <= 13) {
            return;
        }
        for (int var2 = 0; var2 < this.field2948; var2++) {
            this.field2937[var2][0] = null;
            this.field2937[var2][1] = null;
            this.field2937[var2][2] = null;
            this.field2937[var2] = null;
        }
        this.field2937 = null;
        this.field2946 = null;
        this.field2953.method324(-124);
        this.field2953 = null;
        field2947++;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIII)V")
    public static final void method1147(int arg0, int arg1, int arg2, int arg3) {
        field2954++;
        class9 var4 = class101.method686(124, arg0, arg2);
        if (var4 != null && var4.field177 != null) {
            class51 var5 = new class51();
            var5.field1046 = var4;
            var5.field1048 = var4.field177;
            class102.method689(var5, -65);
        }
        class234.field4231 = arg1;
        class105.field1913 = arg2;
        class30.field717 = arg0;
        class82.field1543 = true;
        class62.method457(var4, 0);
        if (arg3 < 93) {
            method1153(-47L, -5);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)[[I")
    public final int[][] method1148(int arg0, int arg1) {
        if (arg1 != 8708) {
            method1152(-11, 32, -7, 124, 122, 90, 103, 78, -4);
        }
        field2935++;
        if (this.field2948 == this.field2934) {
            this.field2957 = this.field2946[arg0] == null;
            this.field2946[arg0] = class227.field4091;
            return this.field2937[arg0];
        } else if (this.field2948 == 1) {
            this.field2957 = this.field2944 != arg0;
            this.field2944 = arg0;
            return this.field2937[0];
        } else {
            class27 var3 = this.field2946[arg0];
            if (var3 == null) {
                this.field2957 = true;
                if (this.field2948 > this.field2936) {
                    var3 = new class27(arg0, this.field2936);
                    this.field2936++;
                } else {
                    class27 var4 = (class27) this.field2953.method318(arg1 ^ 0xFFFFDD87);
                    var3 = new class27(arg0, var4.field665);
                    this.field2946[var4.field666] = null;
                    var4.method123((byte) -126);
                }
                this.field2946[arg0] = var3;
            } else {
                this.field2957 = false;
            }
            this.field2953.method323(-83, var3);
            return this.field2937[var3.field665];
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(IB)Lkh;")
    public static final class117 method1149(int arg0, byte arg1) {
        field2950++;
        int var2 = 109 / ((arg1 + 32) / 62);
        if (arg0 < 100000) {
            return class36.method316((byte) -34, new class117[] { class13.field415, class42.method358(arg0, (byte) 34), class198.field3555 });
        } else if (arg0 < 10000000) {
            return class36.method316((byte) -34, new class117[] { class120.field2269, class42.method358(arg0 / 1000, (byte) 34), class211.field3841, class198.field3555 });
        } else {
            return class36.method316((byte) -34, new class117[] { class239.field4318, class42.method358(arg0 / 1000000, (byte) 34), class225.field4057, class198.field3555 });
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIBI)I")
    public static final int method1150(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg3 / arg1;
        int var5 = arg3 & arg1 - 1;
        field2949++;
        int var6 = arg0 / arg1;
        int var7 = class190.method1272(var4, var6, (byte) -126);
        int var8 = arg1 - 1 & arg0;
        if (arg2 != -98) {
            field2940 = 62;
        }
        int var9 = class190.method1272(var4 + 1, var6, (byte) -113);
        int var10 = class190.method1272(var4, var6 + 1, (byte) 89);
        int var11 = class190.method1272(var4 + 1, var6 + 1, (byte) -102);
        int var12 = class40.method349(var7, var9, arg1, var5, (byte) -118);
        int var13 = class40.method349(var10, var11, arg1, var5, (byte) -102);
        return class40.method349(var12, var13, arg1, var8, (byte) -100);
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)[[[I")
    public final int[][][] method1151(int arg0) {
        field2938++;
        if (this.field2948 != this.field2934) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 < 126) {
            this.method1151(-100);
        }
        for (int var2 = 0; var2 < this.field2948; var2++) {
            this.field2946[var2] = class227.field4091;
        }
        return this.field2937;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = arg0 - arg4;
        field2951++;
        int var10 = arg7 - arg6;
        int var11 = (arg3 - arg5 << 16) / var9;
        int var12 = (arg8 - arg1 << 16) / var10;
        boolean var13;
        if (class243.field4426 > 0 && class243.field4426 % 10 < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        for (int var14 = 0; var14 < var9; var14++) {
            int var31 = var11 * var14 >> 16;
            int var32 = (var14 + 1) * var11 >> 16;
            int var33 = var32 - var31;
            if (var33 > 0) {
                int var34 = arg5 + var31;
                int var10000 = arg5 + var32;
                int[][] var36 = class56.field1155[var14 + arg4 >> 6];
                for (int var37 = 0; var37 < var10; var37++) {
                    int var38 = var12 * var37 >> 16;
                    int var39 = (var37 + 1) * var12 >> 16;
                    int var40 = var39 - var38;
                    if (var40 > 0) {
                        var10000 = arg1 + var39;
                        int var42 = arg1 + var38;
                        int var43 = arg6 + var37 >> 6;
                        if (var36[var43] != null) {
                            int var44 = ((var37 + arg6 & 0x3F) << 6) + (arg4 + var14 & 0x3F);
                            int var45 = var36[var43][var44];
                            if (var45 != 0) {
                                class211 var46 = class48.method379(115, var45 - 1);
                                if (var13 && class185.field3326 == var46.field3833) {
                                    class157 var47 = new class157();
                                    var47.field2852 = var34;
                                    var47.field2854 = var46.field3833;
                                    var47.field2856 = var42;
                                    class137.field2477.method325(126, var47);
                                }
                                class1.field5[var46.field3833].method273(var34 - 7, var42 + -7);
                            }
                        }
                    }
                }
            }
        }
        if (class90.field1672 == class9.field152) {
            for (class72 var15 = (class72) class41.field931.method314((byte) -26); var15 != null; var15 = (class72) class41.field931.method320(arg2 ^ 0xFFFFFFF9)) {
                int var16 = var15.field1381;
                int var17 = var16 - class80.field1501;
                int var18 = var15.field1384;
                int var19 = class33.field773 + class173.field3116 - var18;
                int var20 = (var17 - arg4) * (arg3 - arg5) / (arg0 - arg4) + arg5;
                int var21 = (var19 - arg6) * (arg8 - arg1) / (arg7 - arg6) + arg1;
                class197 var22 = null;
                int var23 = 16777215;
                int var24 = var15.field1378;
                if (var24 == 0) {
                    if (class90.field1672 == 3.0D) {
                        var22 = class102.field1861;
                    }
                    if (class90.field1672 == 4.0D) {
                        var22 = class27.field675;
                    }
                    if (class90.field1672 == 6.0D) {
                        var22 = class174.field3135;
                    }
                    if (class90.field1672 == 8.0D) {
                        var22 = class157.field2862;
                    }
                }
                if (var24 == 1) {
                    if (class90.field1672 == 3.0D) {
                        var22 = class174.field3135;
                    }
                    if (class90.field1672 == 4.0D) {
                        var22 = class157.field2862;
                    }
                    if (class90.field1672 == 6.0D) {
                        var22 = class191.field3405;
                    }
                    if (class90.field1672 == 8.0D) {
                        var22 = class223.field4020;
                    }
                }
                if (var24 == 2) {
                    if (class90.field1672 == 3.0D) {
                        var22 = class191.field3405;
                    }
                    var23 = 16755200;
                    if (class90.field1672 == 4.0D) {
                        var22 = class223.field4020;
                    }
                    if (class90.field1672 == 6.0D) {
                        var22 = class3.field42;
                    }
                    if (class90.field1672 == 8.0D) {
                        var22 = class71.field1365;
                    }
                }
                if (var22 != null) {
                    class117[] var25 = var15.field1386;
                    int var26 = var25.length;
                    int var27 = var21 - (var26 - 1) * var22.method1305() / 2;
                    int var28 = var27 + var22.method1310() / 2;
                    for (int var29 = 0; var29 < var26; var29++) {
                        var22.method1309(var25[var29], var20, var28, var23, true);
                        var28 += var22.method1305();
                    }
                }
            }
        }
        if (arg2 != -7) {
            return;
        }
        for (class157 var30 = (class157) class137.field2477.method314((byte) -26); var30 != null; var30 = (class157) class137.field2477.method320(arg2 + 7)) {
            class1.field5[var30.field2854].method273(var30.field2852 - 7, var30.field2856 + -7);
            class83.method583(var30.field2852, var30.field2856, 15, 16776960, 128);
            class83.method583(var30.field2852, var30.field2856, 7, 16777215, 256);
        }
        class137.field2477.method324(-111);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(JI)V")
    public static final void method1153(long arg0, int arg1) {
        try {
            Thread.sleep(arg0);
            if (arg1 >= -62) {
                field2939 = null;
            }
        } catch (InterruptedException var3) {
        }
        field2955++;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(III)V")
    public class161(int arg0, int arg1, int arg2) {
        this.field2934 = arg1;
        this.field2948 = arg0;
        this.field2937 = new int[this.field2948][3][arg2];
        this.field2946 = new class27[this.field2934];
    }
}
