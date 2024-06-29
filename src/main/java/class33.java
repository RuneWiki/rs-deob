import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class33 extends RuntimeException {

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "Ljava/lang/String;")
    public String field508;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field504;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "Ljava/lang/String;")
    public static String field505 = "flash2:";

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "[I")
    public static int[] field502 = new int[2];

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field500 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "Ljava/lang/String;")
    public static String field509 = "glow3:";

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)Ltd;")
    public static final class74 method218(int arg0, boolean arg1) {
        field507++;
        class74 var2 = (class74) class103.field1430.method961((long) arg0, 9156);
        if (var2 != null) {
            return var2;
        } else if (arg1) {
            return null;
        } else {
            byte[] var3 = class275.field4258.method1576(-80, class116.method788(arg0, (byte) 47), class6.method37(20383, arg0));
            class74 var4 = new class74();
            if (var3 != null) {
                var4.method470(0, new class224(var3));
            }
            class103.field1430.method957(21915, (long) arg0, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    public static void method219(byte arg0) {
        field505 = null;
        field502 = null;
        field500 = null;
        field509 = null;
        if (arg0 >= -69) {
            method218(-8, true);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Le;IIIIIIIZ)V")
    public static final void method220(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class124.field1745;
        int var11;
        int var12 = var11 = (arg7 << 7) - class65.field889;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class200.field2788[arg1][arg6][arg7] - class21.field309;
        int var18 = class200.field2788[arg1][arg6 + 1][arg7] - class21.field309;
        int var19 = class200.field2788[arg1][arg6 + 1][arg7 + 1] - class21.field309;
        int var20 = class200.field2788[arg1][arg6][arg7 + 1] - class21.field309;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class90.field1261;
        int var46 = (var24 << 9) / var25 + class90.field1256;
        int var47 = (var27 << 9) / var31 + class90.field1261;
        int var48 = (var30 << 9) / var31 + class90.field1256;
        int var49 = (var33 << 9) / var37 + class90.field1261;
        int var50 = (var36 << 9) / var37 + class90.field1256;
        int var51 = (var39 << 9) / var43 + class90.field1261;
        int var52 = (var42 << 9) / var43 + class90.field1256;
        class90.field1268 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class65.field885 && class44.method296(class90.field1261 + class68.field914, class90.field1256 + class44.field660, var50, var52, var48, var49, var51, var47)) {
                class233.field3520 = arg6;
                class172.field2400 = arg7;
            }
            if (!arg8) {
                class90.field1265 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class90.field1254 || var51 > class90.field1254 || var47 > class90.field1254) {
                    class90.field1265 = true;
                }
                if (arg0.field893 == -1) {
                    if (arg0.field898 != 12345678) {
                        class90.method574(var50, var52, var48, var49, var51, var47, arg0.field898, arg0.field890, arg0.field899);
                    }
                } else if (!class212.field3187) {
                    int var53 = class90.field1260.method911(79, arg0.field893);
                    class90.method574(var50, var52, var48, var49, var51, var47, class227.method1503(var53, arg0.field898), class227.method1503(var53, arg0.field890), class227.method1503(var53, arg0.field899));
                } else if (arg0.field894) {
                    class90.method589(var50, var52, var48, var49, var51, var47, arg0.field898, arg0.field890, arg0.field899, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field893);
                } else {
                    class90.method589(var50, var52, var48, var49, var51, var47, arg0.field898, arg0.field890, arg0.field899, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field893);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class65.field885 && class44.method296(class90.field1261 + class68.field914, class90.field1256 + class44.field660, var46, var48, var52, var45, var47, var51)) {
            class233.field3520 = arg6;
            class172.field2400 = arg7;
        }
        if (arg8) {
            return;
        }
        class90.field1265 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class90.field1254 || var47 > class90.field1254 || var51 > class90.field1254) {
            class90.field1265 = true;
        }
        if (arg0.field893 != -1) {
            if (class212.field3187) {
                class90.method589(var46, var48, var52, var45, var47, var51, arg0.field902, arg0.field899, arg0.field890, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field893);
                return;
            }
            int var54 = class90.field1260.method911(101, arg0.field893);
            class90.method574(var46, var48, var52, var45, var47, var51, class227.method1503(var54, arg0.field902), class227.method1503(var54, arg0.field899), class227.method1503(var54, arg0.field890));
        } else if (arg0.field902 != 12345678) {
            class90.method574(var46, var48, var52, var45, var47, var51, arg0.field902, arg0.field899, arg0.field890);
            return;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(IZ)V")
    public static final void method221(int arg0, boolean arg1) {
        byte[][] var2 = class287.field4548;
        int var3 = class146.field2029.length;
        if (arg0 > -2) {
            return;
        }
        field499++;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class274.field4242[var4] >> 8) * 64 - class37.field565;
                int var7 = (class274.field4242[var4] & 0xFF) * 64 - class216.field3255;
                class156.method1038(false);
                class215.method1403(class122.field1703, arg1, var7, var5, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static final void method222(int arg0) {
        field503++;
        class208.field2953.method546(-90762264);
        if (arg0 != -4747) {
            method218(-127, true);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)J")
    public static final long method223(int arg0, int arg1, int arg2) {
        class89 var3 = class194.field2682[arg0][arg1][arg2];
        return var3 == null || var3.field1235 == null ? 0L : var3.field1235.field3453;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class33(Throwable arg0, String arg1) {
        this.field508 = arg1;
        this.field504 = arg0;
    }
}
