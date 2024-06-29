import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class305 {

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "Lrf;")
    private class59 field4600 = new class59();

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
    public static int field4596 = 0;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!ks", name = "j", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!ks", name = "k", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!ks", name = "l", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!ks", name = "m", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!ks", name = "n", descriptor = "Lfr;")
    public static class285 field4609;

    @OriginalMember(owner = "client!ks", name = "o", descriptor = "Lrf;")
    private class59 field4610;

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "[Ll;")
    public static class16[] field4603;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V", line = 3)
    public static void method1954(byte arg0) {
        if (arg0 < 15) {
            method1956(true, 13);
        }
        field4609 = null;
        field4603 = null;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)Z", line = 15)
    public final boolean method1955(byte arg0) {
        field4598++;
        if (arg0 > -16) {
            return true;
        } else {
            return this.field4600.field708 == this.field4600;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZI)I", line = 26)
    public static final int method1956(boolean arg0, int arg1) {
        field4605++;
        double var2 = (double) ((arg1 & 0xFF875B) >> 16) / 256.0D;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (!arg0) {
            field4596 = 21;
        }
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var22 >> 1) + ((var20 & 0xFF) >> 2 << 10) + (var21 >> 5 << 7);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILrf;)V", line = 130)
    public final void method1957(int arg0, class59 arg1) {
        field4606++;
        if (arg1.field704 != null) {
            arg1.method526((byte) -82);
        }
        arg1.field704 = this.field4600.field704;
        arg1.field708 = this.field4600;
        arg1.field704.field708 = arg1;
        int var3 = -90 % ((arg0 - 88) / 38);
        arg1.field708.field704 = arg1;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)Lrf;", line = 154)
    public final class59 method1958(int arg0) {
        field4604++;
        class59 var2 = this.field4600.field708;
        if (arg0 < 3) {
            return null;
        } else if (this.field4600 == var2) {
            this.field4610 = null;
            return null;
        } else {
            this.field4610 = var2.field708;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V", line = 179)
    public final void method1959(int arg0) {
        while (true) {
            class59 var2 = this.field4600.field708;
            if (this.field4600 == var2) {
                if (arg0 != 0) {
                    return;
                }
                field4597++;
                this.field4610 = null;
                return;
            }
            var2.method526((byte) -115);
        }
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)Lrf;", line = 200)
    public final class59 method1960(int arg0) {
        field4608++;
        class59 var2 = this.field4600.field704;
        if (arg0 > -111) {
            this.field4610 = null;
        }
        if (this.field4600 == var2) {
            this.field4610 = null;
            return null;
        } else {
            this.field4610 = var2.field704;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "(I)Lrf;", line = 223)
    public final class59 method1961(int arg0) {
        int var2 = 102 / ((arg0 - 33) / 46);
        field4602++;
        class59 var3 = this.field4610;
        if (this.field4600 == var3) {
            this.field4610 = null;
            return null;
        } else {
            this.field4610 = var3.field708;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "(I)I", line = 246)
    public final int method1962(int arg0) {
        int var2 = -98 % ((7 - arg0) / 42);
        field4607++;
        int var3 = 0;
        class59 var4 = this.field4600.field708;
        while (this.field4600 != var4) {
            var4 = var4.field708;
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "()V", line = 296)
    public class305() {
        this.field4600.field704 = this.field4600;
        this.field4600.field708 = this.field4600;
    }

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "(I)Lrf;", line = 274)
    public final class59 method1963(int arg0) {
        field4601++;
        if (arg0 != 217) {
            field4609 = null;
        }
        class59 var2 = this.field4600.field708;
        if (this.field4600 == var2) {
            return null;
        } else {
            var2.method526((byte) 100);
            return var2;
        }
    }
}
