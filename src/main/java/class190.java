import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class190 {

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    private int field3292 = 0;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    private int field3291 = -1;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public int field3281;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public int field3283;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public int field3288;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public int field3293;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "[I")
    public static int[] field3286;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1247(Component arg0, int arg1) {
        field3282++;
        Method var2 = class117.field2191;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class218.field3747);
        if (arg1 != 1611550343) {
            method1247((Component) null, -119);
        }
        arg0.addFocusListener(class218.field3747);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILlh;)V")
    public final void method1248(int arg0, int arg1, class249 arg2) {
        while (true) {
            int var4 = arg2.method1677(arg0 - 6677);
            if (var4 == 0) {
                if (arg0 != 0) {
                    return;
                }
                field3284++;
                return;
            }
            this.method1250(30704, arg1, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BII)I")
    public static final int method1249(byte arg0, int arg1, int arg2) {
        field3289++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            if (arg0 != -91) {
                method1252((byte) -126);
            }
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIILlh;)V")
    private final void method1250(int arg0, int arg1, int arg2, class249 arg3) {
        if (arg2 == 1) {
            this.field3292 = arg3.method1648((byte) -119);
            this.method1251(-1, this.field3292);
        } else if (arg2 == 2) {
            this.field3291 = arg3.method1674(1355769544);
            if (this.field3291 == 65535) {
                this.field3291 = -1;
            }
        } else if (arg2 == 3) {
            arg3.method1674(1355769544);
        }
        if (arg0 != 30704) {
            this.field3292 = -84;
        }
        field3287++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
    private final void method1251(int arg0, int arg1) {
        field3290++;
        double var3 = (double) ((arg1 & 0xFF3EB5) >> 16) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var3 > var5) {
            var9 = var5;
        }
        double var13 = 0.0D;
        if (var11 < var7) {
            var11 = var7;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        this.field3283 = (int) (var17 * 256.0D);
        if (arg0 < ~this.field3283) {
            this.field3283 = 0;
        } else if (this.field3283 > 255) {
            this.field3283 = 255;
        }
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
        double var19 = var13 / 6.0D;
        this.field3293 = (int) (var15 * 256.0D);
        if (var17 > 0.5D) {
            this.field3281 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3281 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field3293 < 0) {
            this.field3293 = 0;
        } else if (this.field3293 > 255) {
            this.field3293 = 255;
        }
        if (this.field3281 < 1) {
            this.field3281 = 1;
        }
        this.field3288 = (int) ((double) this.field3281 * var19);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
    public static void method1252(byte arg0) {
        field3286 = null;
        if (arg0 != -28) {
            method1247((Component) null, 22);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBILha;III)V")
    public static final void method1253(int arg0, byte arg1, int arg2, class63 arg3, int arg4, int arg5, int arg6) {
        field3285++;
        if (arg1 <= 96) {
            field3286 = null;
        }
        int var7 = arg2 * arg2 + arg6 * arg6;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg3.field1215 / 2, arg3.field1196 / 2);
        if ((var8 * var8) >= var7) {
            class9.method41(arg6, -90, arg3, arg5, arg2, class73.field1452[arg0], arg4);
            return;
        }
        var8 -= 10;
        int var9 = class259.field4562 + class124.field2341 & 0x7FF;
        int var10 = class123.field2314[var9];
        int var11 = var10 * 256 / (class240.field4172 + 256);
        int var12 = class123.field2326[var9];
        int var13 = var12 * 256 / (class240.field4172 + 256);
        int var14 = arg2 * var13 + arg6 * var11 >> 16;
        int var15 = arg6 * var13 - (arg2 * var11) >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) (Math.sin(var16) * (double) var8);
        int var19 = (int) ((double) var8 * Math.cos(var16));
        ((class168) class121.field2295[arg0]).method982(arg5 + (arg3.field1215 / 2) + var18 - 10, arg3.field1196 / 2 + -var19 + arg4 + -10, 20, 20, 15, 15, var16, 256);
    }
}
