import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class15 {

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "Z")
    public boolean field210 = true;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "Z")
    public boolean field216 = true;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    private int field202 = 0;

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "I")
    public int field221 = 512;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    public int field214 = -1;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "Lem;")
    public static class610 field215 = new class610(1);

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public int field203;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public int field204;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public int field207;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
    public int field213;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "Lnd;")
    public static class132 field218;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ds", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field222;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "[Lac;")
    public static class712[] field219;

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "[[I")
    public static int[][] field220;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method192(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field206++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = arg3 - arg6;
        int var12 = arg2 - arg6;
        int var13 = arg3 * arg3;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        if (arg4 >= -125) {
            method194(true, -50, null);
        }
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg2 - 1) * var27;
        int var37 = var30;
        if (class112.field1386 <= arg5 && class328.field4190 >= arg5) {
            int[] var38 = field220[arg5];
            int var39 = class711.method3927(arg0 - arg3, -113, class592.field8242, class108.field1334);
            int var40 = class711.method3927(arg0 + arg3, -109, class592.field8242, class108.field1334);
            int var41 = class711.method3927(arg0 - var11, -126, class592.field8242, class108.field1334);
            int var42 = class711.method3927(arg0 + var11, -116, class592.field8242, class108.field1334);
            class284.method1709(var38, var41, -8251, var39, arg7);
            class284.method1709(var38, var42, -8251, var41, arg1);
            class284.method1709(var38, var40, -8251, var42, arg7);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var8++;
                    var35 += var28;
                    var31 += var28;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        var10++;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var10++;
                    var33 += var30;
                    var37 += var30;
                }
                var25 += -var43;
                var26 += -var34;
                var43 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var31 += var28;
                var8++;
                var35 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var36 -= var27;
            var32 -= var27;
            var9--;
            int var45 = arg5 - var9;
            int var46 = arg5 + var9;
            if (class112.field1386 <= var46 && class328.field4190 >= var45) {
                int var47 = class711.method3927(arg0 + var8, -123, class592.field8242, class108.field1334);
                int var48 = class711.method3927(arg0 - var8, -123, class592.field8242, class108.field1334);
                if (var44) {
                    int var49 = class711.method3927(arg0 + var10, -117, class592.field8242, class108.field1334);
                    int var50 = class711.method3927(arg0 - var10, -115, class592.field8242, class108.field1334);
                    if (var45 >= class112.field1386) {
                        int[] var51 = field220[var45];
                        class284.method1709(var51, var50, -8251, var48, arg7);
                        class284.method1709(var51, var49, -8251, var50, arg1);
                        class284.method1709(var51, var47, -8251, var49, arg7);
                    }
                    if (var46 <= class328.field4190) {
                        int[] var52 = field220[var46];
                        class284.method1709(var52, var50, -8251, var48, arg7);
                        class284.method1709(var52, var49, -8251, var50, arg1);
                        class284.method1709(var52, var47, -8251, var49, arg7);
                    }
                } else {
                    if (var45 >= class112.field1386) {
                        class284.method1709(field220[var45], var47, -8251, var48, arg7);
                    }
                    if (class328.field4190 >= var46) {
                        class284.method1709(field220[var46], var47, -8251, var48, arg7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(BII)V")
    public static final void method193(byte arg0, int arg1, int arg2) {
        field209++;
        class335.field4310++;
        if (arg0 > -56) {
            method198(true);
        }
        class650 var3 = class314.method1837(class229.field2993, true, class625.field8727);
        var3.field8928.method1101(arg2, 255);
        var3.field8928.method1147(23689, arg1);
        class108.method745(var3, -126);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZILjava/awt/Component;)Lsv;")
    public static final class543 method194(boolean arg0, int arg1, Component arg2) {
        field217++;
        try {
            Constructor var3 = Class.forName("dda").getDeclaredConstructor(field222 == null ? (field222 = method199("java.awt.Component")) : field222, Boolean.TYPE);
            return (class543) var3.newInstance(arg2, Boolean.valueOf(arg0));
        } catch (Throwable var4) {
            return arg1 < 87 ? null : new class444(arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)V")
    private final void method195(int arg0, int arg1) {
        field205++;
        double var3 = (double) ((arg0 & 0xFF7DF5) >> 16) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF4C) >> 8) / 256.0D;
        if (arg1 < 111) {
            this.field210 = true;
        }
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field204 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field213 = (int) (var15 * 256.0D);
        if (this.field204 < 0) {
            this.field204 = 0;
        } else if (this.field204 > 255) {
            this.field204 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field203 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field203 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field213 < 0) {
            this.field213 = 0;
        } else if (this.field213 > 255) {
            this.field213 = 255;
        }
        if (this.field203 < 1) {
            this.field203 = 1;
        }
        this.field207 = (int) ((double) this.field203 * var19);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(BLtn;)V")
    public final void method196(byte arg0, class179 arg1) {
        while (true) {
            int var3 = arg1.method1094(255);
            if (var3 == 0) {
                if (arg0 < 121) {
                    return;
                }
                field211++;
                return;
            }
            this.method197(arg1, true, var3);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Ltn;ZI)V")
    private final void method197(class179 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field220 = null;
        }
        field212++;
        if (arg2 == 1) {
            this.field202 = arg0.method1114(95);
            this.method195(this.field202, 125);
        } else if (arg2 == 2) {
            this.field214 = arg0.method1107(false);
            if (this.field214 == 65535) {
                this.field214 = -1;
            }
        } else if (arg2 == 3) {
            this.field221 = arg0.method1107(false) << 2;
        } else if (arg2 == 4) {
            this.field216 = false;
        } else if (arg2 == 5) {
            this.field210 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)V")
    public static void method198(boolean arg0) {
        field219 = null;
        field220 = null;
        if (arg0) {
            method192(-71, -46, 28, 88, (byte) -117, -11, -13, 4);
        }
        field215 = null;
        field218 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method199(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
