import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class49 {

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field953 = 0;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "Lrf;")
    private static class163 field954 = class53.method392(72, "flash1:");

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "Lrf;")
    public static class163 field957 = field954;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Lrf;")
    public static class163 field951 = field954;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public static volatile int field960 = 0;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "Lrf;")
    public static class163 field959 = class53.method392(-79, "Sichtbare Karte vorbereitet)3");

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "Lle;")
    public static class109 field949;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "Lu;")
    public static class184 field950;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "Lu;")
    public static class184 field955;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "Lue;")
    public static class189 field958;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "[Lpf;")
    public static class145[] field952;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIII)V")
    public static final void method299(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field956++;
        long var6 = class6.method58(arg0, arg3, arg5);
        if (arg2 != 2) {
            return;
        }
        if (var6 != 0L) {
            int var8 = (int) var6 >> 20 & 0x3;
            int[] var9 = class64.field1346.field3370;
            int var10 = (int) var6 >> 14 & 0x1F;
            int var11 = arg4;
            int var12 = arg3 * 4 + (52736 - arg5 * 512) * 4 + 24624;
            int var13 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            if (var6 > 0L) {
                var11 = arg1;
            }
            class61 var14 = class199.method1314((byte) 127, var13);
            if (var14.field1299 == -1) {
                if (var10 == 0 || var10 == 2) {
                    if (var8 == 0) {
                        var9[var12] = var11;
                        var9[var12 + 512] = var11;
                        var9[var12 + 1024] = var11;
                        var9[var12 + 1536] = var11;
                    } else if (var8 == 1) {
                        var9[var12] = var11;
                        var9[var12 + 1] = var11;
                        var9[var12 + 2] = var11;
                        var9[var12 + 3] = var11;
                    } else if (var8 == 2) {
                        var9[var12 + 3] = var11;
                        var9[var12 + 3 + 512] = var11;
                        var9[var12 + 1027] = var11;
                        var9[var12 + 3 + 1536] = var11;
                    } else if (var8 == 3) {
                        var9[var12 + 1536] = var11;
                        var9[var12 + 1536 + 1] = var11;
                        var9[var12 + 2 + 1536] = var11;
                        var9[var12 + 1536 + 3] = var11;
                    }
                }
                if (var10 == 3) {
                    if (var8 == 0) {
                        var9[var12] = var11;
                    } else if (var8 == 1) {
                        var9[var12 + 3] = var11;
                    } else if (var8 == 2) {
                        var9[var12 + 3 + 1536] = var11;
                    } else if (var8 == 3) {
                        var9[var12 + 1536] = var11;
                    }
                }
                if (var10 == 2) {
                    if (var8 == 3) {
                        var9[var12] = var11;
                        var9[var12 + 512] = var11;
                        var9[var12 + 1024] = var11;
                        var9[var12 + 1536] = var11;
                    } else if (var8 == 0) {
                        var9[var12] = var11;
                        var9[var12 + 1] = var11;
                        var9[var12 + 2] = var11;
                        var9[var12 + 3] = var11;
                    } else if (var8 == 1) {
                        var9[var12 + 3] = var11;
                        var9[var12 + 3 + 512] = var11;
                        var9[var12 + 3 + 1024] = var11;
                        var9[var12 + 1536 + 3] = var11;
                    } else if (var8 == 2) {
                        var9[var12 + 1536] = var11;
                        var9[var12 + 1 + 1536] = var11;
                        var9[var12 + 2 + 1536] = var11;
                        var9[var12 + 1539] = var11;
                    }
                }
            } else {
                class145 var15 = class5.field112[var14.field1299];
                if (var15 != null) {
                    int var16 = (var14.field1257 * 4 - var15.field2972) / 2;
                    int var17 = (var14.field1250 * 4 - var15.field2976) / 2;
                    var15.method944(arg3 * 4 + var16 + 48, 48 - -((-arg5 + 104 - var14.field1250) * 4) + var17);
                }
            }
        }
        long var18 = class9.method74(arg0, arg3, arg5);
        if (var18 != 0L) {
            int var20 = (int) var18 >> 20 & 0x3;
            int var21 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            int var22 = (int) var18 >> 14 & 0x1F;
            class61 var23 = class199.method1314((byte) 126, var21);
            if (var23.field1299 != -1) {
                class145 var24 = class5.field112[var23.field1299];
                if (var24 != null) {
                    int var25 = (var23.field1257 * 4 - var24.field2972) / 2;
                    int var26 = (var23.field1250 * 4 - var24.field2976) / 2;
                    var24.method944(arg3 * 4 + var25 + 48, (-var23.field1250 + -arg5 + 104) * 4 + 48 + var26);
                }
            } else if (var22 == 9) {
                int var27 = 15658734;
                if (var18 > 0L) {
                    var27 = 15597568;
                }
                int[] var28 = class64.field1346.field3370;
                int var29 = (103 - arg5) * 2048 + arg3 * 4 + 24624;
                if (var20 == 0 || var20 == 2) {
                    var28[var29 + 1536] = var27;
                    var28[var29 + 1025] = var27;
                    var28[var29 + 2 + 512] = var27;
                    var28[var29 + 3] = var27;
                } else {
                    var28[var29] = var27;
                    var28[var29 + 1 + 512] = var27;
                    var28[var29 + 1024 + 2] = var27;
                    var28[var29 + 1536 + 3] = var27;
                }
            }
        }
        long var30 = class48.method294(arg0, arg3, arg5);
        if (var30 == 0L) {
            return;
        }
        int var32 = Integer.MAX_VALUE & (int) (var30 >>> 32);
        class61 var33 = class199.method1314((byte) 127, var32);
        if (var33.field1299 == -1) {
            return;
        }
        class145 var34 = class5.field112[var33.field1299];
        if (var34 != null) {
            int var35 = (var33.field1257 * 4 - var34.field2972) / 2;
            int var36 = (var33.field1250 * 4 - var34.field2976) / 2;
            var34.method944(var35 + arg3 * 4 + 48, (-arg5 + 104 + -var33.field1250) * 4 + 48 + var36);
            return;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void method300(int arg0) {
        field951 = null;
        field958 = null;
        if (arg0 != 0) {
            return;
        }
        field949 = null;
        field950 = null;
        field959 = null;
        field952 = null;
        field954 = null;
        field957 = null;
        field955 = null;
    }
}
