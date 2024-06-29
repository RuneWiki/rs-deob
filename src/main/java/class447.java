import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class447 {

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    private int field6940 = 0;

    @OriginalMember(owner = "client!un", name = "l", descriptor = "I")
    public int field6941 = -1;

    @OriginalMember(owner = "client!un", name = "p", descriptor = "I")
    public int field6943 = 512;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "Z")
    public boolean field6945 = true;

    @OriginalMember(owner = "client!un", name = "o", descriptor = "Z")
    public boolean field6946 = true;

    @OriginalMember(owner = "client!un", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6951 = new String[] { method3496(method3495("<\r-P=")), method3496(method3495("2M-9h")), method3496(method3495("'\u0016o{")), method3496(method3495("<\r-T=")), method3496(method3495("<\r-V=")), method3496(method3495("<\r-U=")), method3496(method3495("<\r-S=")), method3496(method3495("<\r-Q=")), method3496(method3495("<\r-R=")) };

    @OriginalMember(owner = "client!un", name = "k", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    public int field6936;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    public static int field6938;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public int field6939;

    @OriginalMember(owner = "client!un", name = "m", descriptor = "I")
    public static int field6944;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public int field6947;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field6948;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    public int field6949;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "I")
    public static int field6950;

    @OriginalMember(owner = "client!un", name = "n", descriptor = "Leca;")
    public static class793 field6942;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIILmj;Lha;)V")
    public static final void method3488(int arg0, int arg1, int arg2, int arg3, class683 arg4, class63 arg5) {
        try {
            if (arg1 > 119) {
                for (int var6 = 7; var6 >= 0; var6--) {
                    for (int var7 = 127; var7 >= 0; var7--) {
                        int var8 = (arg2 & 0x3F) << 10 | (var6 & 0x7) << 7 | var7 & 0x7F;
                        class517.method3877(true, false, 1);
                        int var9 = class613.field8810[var8];
                        class300.method2587((byte) 89, false, true);
                        arg5.method242((arg4.field9797 * var7 >> 7) + arg0, arg3 - -((7 - var6) * arg4.field9777 >> 3), (arg4.field9797 >> 7) + 1, (arg4.field9777 >> 3) - -1, var9, 0);
                    }
                }
                field6935++;
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field6951[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field6951[2] : field6951[1]) + ',' + (arg5 == null ? field6951[2] : field6951[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
    public static void method3489(int arg0) {
        try {
            field6942 = null;
            if (arg0 != -1643799417) {
                field6942 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6951[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "([JI[Ljava/lang/Object;)V")
    public static final void method3490(long[] arg0, int arg1, Object[] arg2) {
        try {
            class443.method3471(0, (byte) -55, arg0.length - 1, arg0, arg2);
            int var3 = 96 % ((arg1 - 7) / 57);
            field6950++;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6951[5] + (arg0 == null ? field6951[2] : field6951[1]) + ',' + arg1 + ',' + (arg2 == null ? field6951[2] : field6951[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lwq;I)V")
    public final void method3491(class176 arg0, int arg1) {
        try {
            if (arg1 != -1) {
                this.field6947 = -68;
            }
            while (true) {
                int var3 = arg0.method1645((byte) -118);
                if (var3 == 0) {
                    field6938++;
                    return;
                }
                this.method3494(var3, arg1 + 128, arg0);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6951[8] + (arg0 == null ? field6951[2] : field6951[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ZILvf;III[II)Lub;")
    public static final class20 method3492(boolean arg0, int arg1, class159 arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7) {
        try {
            field6948++;
            if (arg7 <= 2) {
                method3488(-105, 110, 44, 127, null, null);
            }
            if (!arg2.field2513 && (!class46.method469(arg3, 1010) || !class46.method469(arg1, 1010))) {
                return arg2.field2481 ? new class20(arg2, 34037, arg3, arg1, arg0, arg6, arg5, arg4) : new class20(arg2, arg3, arg1, class90.method883((byte) 109, arg3), class90.method883((byte) 73, arg1), arg6);
            } else {
                return new class20(arg2, 3553, arg3, arg1, arg0, arg6, arg5, arg4);
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field6951[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6951[2] : field6951[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field6951[2] : field6951[1]) + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)V")
    private final void method3493(int arg0, int arg1) {
        try {
            field6944++;
            double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
            double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
            double var7 = (double) (arg0 & 0xFF) / 256.0D;
            double var9 = var3;
            if (var3 > var5) {
                var9 = var5;
            }
            if (var7 < var9) {
                var9 = var7;
            }
            double var11 = var3;
            if (var5 > var3) {
                var11 = var5;
            }
            if (var11 < var7) {
                var11 = var7;
            }
            double var13 = 0.0D;
            double var15 = 0.0D;
            double var17 = (var9 + var11) / 2.0D;
            if (var9 != var11) {
                if (var17 < 0.5D) {
                    var15 = (var11 - var9) / (var9 + var11);
                }
                if (var17 >= 0.5D) {
                    var15 = (var11 - var9) / (2.0D - var11 - var9);
                }
                if (var3 == var11) {
                    var13 = (var5 - var7) / (var11 - var9);
                } else if (var5 == var11) {
                    var13 = (var7 - var3) / (var11 - var9) + 2.0D;
                } else if (var7 == var11) {
                    var13 = (var3 - var5) / (var11 - var9) + 4.0D;
                }
            }
            this.field6939 = (int) (var15 * 256.0D);
            this.field6949 = (int) (var17 * 256.0D);
            double var19 = var13 / 6.0D;
            if (this.field6949 < 0) {
                this.field6949 = 0;
            } else if (this.field6949 > 255) {
                this.field6949 = 255;
            }
            if (arg1 == -6779) {
                if (this.field6939 < 0) {
                    this.field6939 = 0;
                } else if (this.field6939 > 255) {
                    this.field6939 = 255;
                }
                if (var17 > 0.5D) {
                    this.field6936 = (int) ((1.0D - var17) * var15 * 512.0D);
                } else {
                    this.field6936 = (int) (var15 * var17 * 512.0D);
                }
                if (this.field6936 < 1) {
                    this.field6936 = 1;
                }
                this.field6947 = (int) ((double) this.field6936 * var19);
            }
        } catch (RuntimeException var22) {
            throw class590.method4333(var22, field6951[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IILwq;)V")
    private final void method3494(int arg0, int arg1, class176 arg2) {
        try {
            field6937++;
            if (arg1 <= 1) {
                this.field6940 = 41;
            }
            if (arg0 == 1) {
                this.field6940 = arg2.method1685(false);
                this.method3493(this.field6940, -6779);
            } else if (arg0 == 2) {
                this.field6941 = arg2.method1687((byte) -126);
                if (this.field6941 == 65535) {
                    this.field6941 = -1;
                    return;
                }
            } else if (arg0 == 3) {
                this.field6943 = arg2.method1687((byte) -41) << 2;
                return;
            } else if (arg0 == 4) {
                this.field6946 = false;
                return;
            } else if (arg0 == 5) {
                this.field6945 = false;
            } else {
                return;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6951[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6951[2] : field6951[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!un", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3495(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x15);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!un", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3496(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 73;
                    break;
                case 1:
                    var10005 = 99;
                    break;
                case 2:
                    var10005 = 3;
                    break;
                case 3:
                    var10005 = 23;
                    break;
                default:
                    var10005 = 21;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
