import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class199 {

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    private int field3210 = -1;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    private int field3218 = 0;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "[I")
    public static int[] field3211 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static volatile int field3215 = -1;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3219 = "Allocating memory";

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3212 = null;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public int field3208;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public int field3213;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public int field3216;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public int field3220;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static void method1407(int arg0) {
        field3219 = null;
        field3211 = null;
        field3212 = null;
        if (arg0 < 61) {
            method1407(120);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)V")
    private final void method1408(byte arg0, int arg1) {
        field3214++;
        double var3 = (double) ((arg1 & 0xFF3638) >> 16) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = 0.0D;
        if (var5 > var3) {
            var9 = var5;
        }
        double var13 = var3;
        double var15 = 0.0D;
        if (var3 > var5) {
            var13 = var5;
        }
        if (var13 > var7) {
            var13 = var7;
        }
        if (var9 < var7) {
            var9 = var7;
        }
        double var17 = (var9 + var13) / 2.0D;
        this.field3208 = (int) (var17 * 256.0D);
        if (var9 != var13) {
            if (var3 == var9) {
                var15 = (var5 - var7) / (var9 - var13);
            } else if (var5 == var9) {
                var15 = (var7 - var3) / (var9 - var13) + 2.0D;
            } else if (var7 == var9) {
                var15 = (var3 - var5) / (var9 - var13) + 4.0D;
            }
            if (var17 < 0.5D) {
                var11 = (var9 - var13) / (var9 + var13);
            }
            if (var17 >= 0.5D) {
                var11 = (var9 - var13) / (2.0D - var9 - var13);
            }
        }
        double var19 = var15 / 6.0D;
        if (this.field3208 < 0) {
            this.field3208 = 0;
        } else if (this.field3208 > 255) {
            this.field3208 = 255;
        }
        if (arg0 != -88) {
            this.field3210 = 109;
        }
        this.field3220 = (int) (var11 * 256.0D);
        if (var17 > 0.5D) {
            this.field3216 = (int) ((1.0D - var17) * var11 * 512.0D);
        } else {
            this.field3216 = (int) (var11 * var17 * 512.0D);
        }
        if (this.field3216 < 1) {
            this.field3216 = 1;
        }
        if (this.field3220 < 0) {
            this.field3220 = 0;
        } else if (this.field3220 > 255) {
            this.field3220 = 255;
        }
        this.field3213 = (int) ((double) this.field3216 * var19);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILab;II)V")
    private final void method1409(int arg0, class249 arg1, int arg2, int arg3) {
        field3217++;
        if (arg2 != 0) {
            return;
        }
        if (arg3 == 1) {
            this.field3218 = arg1.method1812((byte) 52);
            this.method1408((byte) -88, this.field3218);
        } else if (arg3 == 2) {
            this.field3210 = arg1.method1821((byte) 51);
            if (this.field3210 != 65535) {
                return;
            }
            this.field3210 = -1;
        } else if (arg3 == 3) {
            arg1.method1821((byte) 51);
            return;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lab;II)V")
    public final void method1410(class249 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method1802((byte) -86);
            if (var4 == 0) {
                if (arg1 != 3809) {
                    this.method1410((class249) null, 95, -121);
                }
                field3209++;
                return;
            }
            this.method1409(arg2, arg0, 0, var4);
        }
    }
}
