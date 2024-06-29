import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class507 {

    @OriginalMember(owner = "client!pw", name = "j", descriptor = "Lrh;")
    private class176 field7467 = new class176();

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "I")
    public static int field7461;

    @OriginalMember(owner = "client!pw", name = "e", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!pw", name = "g", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!pw", name = "h", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!pw", name = "i", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!pw", name = "k", descriptor = "I")
    public static int field7468;

    @OriginalMember(owner = "client!pw", name = "l", descriptor = "I")
    public static int field7469;

    @OriginalMember(owner = "client!pw", name = "m", descriptor = "I")
    public static int field7470;

    @OriginalMember(owner = "client!pw", name = "n", descriptor = "I")
    public static int field7471;

    @OriginalMember(owner = "client!pw", name = "o", descriptor = "I")
    public static int field7472;

    @OriginalMember(owner = "client!pw", name = "p", descriptor = "Lrh;")
    private class176 field7473;

    @OriginalMember(owner = "client!pw", name = "f", descriptor = "Laa;")
    public static class341 field7463;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(II)V")
    public static final void method3036(int arg0, int arg1) {
        field7464++;
        class177 var2 = class344.method2229(5, arg1, (byte) 112);
        if (arg0 > 74) {
            var2.method1194(-78);
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)V")
    public static final void method3037(int arg0) {
        field7458++;
        if (class401.field6108 != null) {
            return;
        }
        class401.field6108 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        if (arg0 > -86) {
            return;
        }
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if (var8 < 0.5D) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - (var6 * var8);
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if ((var4 * 6.0D < 1.0D)) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if (var4 * 2.0D < 1.0D) {
                    var12 = var16;
                } else if ((var4 * 3.0D < 2.0D)) {
                    var12 = (0.6666666666666666D - var4) * (var16 - var18) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if ((var24 * 2.0D < 1.0D)) {
                    var14 = var16;
                } else if ((var24 * 3.0D < 2.0D)) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) + (var33 << 8) + var34;
            class401.field6108[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(I)Lrh;")
    public final class176 method3038(int arg0) {
        field7466++;
        int var2 = -60 / ((arg0 + 25) / 49);
        class176 var3 = this.field7467.field2348;
        if (this.field7467 == var3) {
            return null;
        } else {
            var3.method1184(121);
            return var3;
        }
    }

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "(I)Z")
    public final boolean method3039(int arg0) {
        field7470++;
        if (arg0 == -1582849078) {
            return this.field7467.field2348 == this.field7467;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Z)Lrh;")
    public final class176 method3040(boolean arg0) {
        field7472++;
        class176 var2 = this.field7467.field2348;
        if (this.field7467 == var2) {
            this.field7473 = null;
            return null;
        }
        if (arg0) {
            field7462 = 25;
        }
        this.field7473 = var2.field2348;
        return var2;
    }

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "(I)Lrh;")
    public final class176 method3041(int arg0) {
        field7471++;
        class176 var2 = this.field7467.field2351;
        if (arg0 != 6) {
            return null;
        } else if (this.field7467 == var2) {
            this.field7473 = null;
            return null;
        } else {
            this.field7473 = var2.field2351;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pw", name = "e", descriptor = "(I)V")
    public static void method3042(int arg0) {
        if (arg0 != 3) {
            method3042(59);
        }
        field7463 = null;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)Lrh;")
    public final class176 method3043(byte arg0) {
        field7460++;
        if (arg0 != -125) {
            return null;
        }
        class176 var2 = this.field7473;
        if (this.field7467 == var2) {
            this.field7473 = null;
            return null;
        } else {
            this.field7473 = var2.field2348;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pw", name = "f", descriptor = "(I)Luo;")
    public static final class412 method3044(int arg0) {
        class114.field1585 = 0;
        field7468++;
        if (arg0 < 18) {
            method3044(109);
        }
        return class296.method1893((byte) -122);
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lrh;I)V")
    public final void method3045(class176 arg0, int arg1) {
        field7459++;
        if (arg0.field2351 != null) {
            arg0.method1184(-43);
        }
        arg0.field2348 = this.field7467;
        arg0.field2351 = this.field7467.field2351;
        arg0.field2351.field2348 = arg0;
        if (arg1 <= 12) {
            this.method3040(true);
        }
        arg0.field2348.field2351 = arg0;
    }

    @OriginalMember(owner = "client!pw", name = "g", descriptor = "(I)V")
    public final void method3046(int arg0) {
        while (true) {
            class176 var2 = this.field7467.field2348;
            if (this.field7467 == var2) {
                field7461++;
                if (arg0 < 74) {
                    return;
                }
                this.field7473 = null;
                return;
            }
            var2.method1184(-104);
        }
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(II)V")
    public static final void method3047(int arg0, int arg1) {
        field7469++;
        class274.field3809 = arg0;
        if (arg1 != -1582849078) {
            method3036(-68, -42);
        }
        class173.field2324.method2127((byte) -16);
    }

    @OriginalMember(owner = "client!pw", name = "h", descriptor = "(I)I")
    public final int method3048(int arg0) {
        int var2 = -14 % ((90 - arg0) / 34);
        field7465++;
        int var3 = 0;
        class176 var4 = this.field7467.field2348;
        while (this.field7467 != var4) {
            var4 = var4.field2348;
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "()V")
    public class507() {
        this.field7467.field2348 = this.field7467;
        this.field7467.field2351 = this.field7467;
    }
}
