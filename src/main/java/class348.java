import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class348 extends class260 {

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    private int field5420 = 0;

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "I")
    private int field5434 = -1;

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
    private int field5445 = 0;

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "Z")
    private boolean field5436 = false;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "Z")
    private boolean field5425 = false;

    @OriginalMember(owner = "client!oc", name = "Y", descriptor = "I")
    private int field5453 = -32768;

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
    private int field5451;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
    private int field5447;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    private int field5421;

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
    public int field5437;

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "I")
    private int field5429;

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
    public int field5432;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public int field5417;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    public int field5426;

    @OriginalMember(owner = "client!oc", name = "J", descriptor = "I")
    private int field5438;

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "I")
    private int field5448;

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
    public int field5442;

    @OriginalMember(owner = "client!oc", name = "L", descriptor = "Leg;")
    private class314 field5440;

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "I")
    public static int field5430 = 0;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "Lcc;")
    public static class327 field5428 = new class327(5);

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "D")
    private double field5427;

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "D")
    private double field5433;

    @OriginalMember(owner = "client!oc", name = "G", descriptor = "D")
    public double field5435;

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "D")
    private double field5441;

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "D")
    private double field5446;

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "D")
    public double field5449;

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "D")
    private double field5450;

    @OriginalMember(owner = "client!oc", name = "Z", descriptor = "D")
    public double field5454;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    private int field5423;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!oc", name = "K", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
    public int field5443;

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!oc", name = "bb", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "Lne;")
    private class187 field5419;

    @OriginalMember(owner = "client!oc", name = "ab", descriptor = "Lwf;")
    public static class333 field5455;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "[I")
    public static int[] field5418;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V", line = 6)
    public final void method2414(int arg0, int arg1) {
        this.field5454 += (double) arg0 * this.field5441;
        this.field5436 = true;
        if (this.field5448 == -1) {
            this.field5435 += (double) arg0 * this.field5446;
        } else {
            this.field5435 += this.field5427 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field5446;
            this.field5446 += (double) arg0 * this.field5427;
        }
        field5431++;
        this.field5449 += (double) arg0 * this.field5433;
        this.field5443 = (int) (Math.atan2(this.field5433, this.field5441) * 325.949D) + 1024 & 0x7FF;
        this.field5423 = (int) (Math.atan2(this.field5446, this.field5450) * 325.949D) & 0x7FF;
        if (arg1 != 1) {
            field5456 = 2;
        }
        if (this.field5440 == null) {
            return;
        }
        this.field5445 += arg0;
        while (true) {
            do {
                do {
                    if (this.field5440.field4627[this.field5420] >= this.field5445) {
                        return;
                    }
                    this.field5445 -= this.field5440.field4627[this.field5420];
                    this.field5420++;
                    if (this.field5440.field4631.length <= this.field5420) {
                        this.field5420 -= this.field5440.field4636;
                        if (this.field5420 < 0 || this.field5420 >= this.field5440.field4631.length) {
                            this.field5420 = 0;
                        }
                    }
                    this.field5434 = this.field5420 + 1;
                } while (this.field5434 < this.field5440.field4631.length);
                this.field5434 -= this.field5440.field4636;
            } while (this.field5434 >= 0 && this.field5440.field4631.length > this.field5434);
            this.field5434 = -1;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIIIIJILne;)V", line = 69)
    public final void method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class187 arg10) {
        field5439++;
        class81 var13 = this.method2419(true);
        if (var13 != null) {
            this.method2417(-77, var13);
            var13.method585(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field5419);
            this.field5453 = var13.method583();
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)Z", line = 88)
    public static final boolean method2415(byte arg0, int arg1) {
        field5416++;
        if (class158.field2253 == arg1) {
            return false;
        }
        class323.field4735 = new int[104][104];
        class277.field3967 = new int[104][104];
        class305.field4460 = new int[4][13][13];
        class254.field3712 = new int[104][104];
        if (arg0 != 25) {
            method2415((byte) 5, -58);
        }
        for (int var2 = 0; var2 < 4; var2++) {
            class231.field3312[var2] = new class8(104, 104);
        }
        class9.field101 = new byte[4][104][104];
        class306.field4480 = new byte[4][104][104];
        class20.field221 = new class54[4][104][104];
        if (class47.field623) {
            class22.method134(4, 104, 104);
            class151.method1155(104, 104);
            class25.field295 = new class80[13][13];
        }
        class158.field2253 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 295)
    public class348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field5451 = arg3;
        this.field5447 = arg4;
        this.field5436 = false;
        this.field5421 = arg2;
        this.field5437 = arg5;
        this.field5429 = arg8;
        this.field5432 = arg1;
        this.field5417 = arg6;
        this.field5426 = arg9;
        this.field5438 = arg0;
        this.field5448 = arg7;
        this.field5442 = arg10;
        int var12 = class234.method1664(-128, this.field5438).field169;
        if (var12 == -1) {
            this.field5440 = null;
        } else {
            this.field5440 = class207.method1516(var12, 120);
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(IIIII)V", line = 135)
    public final void method2416(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5422++;
        if (!this.field5436) {
            double var6 = (double) (arg2 - this.field5421);
            double var8 = (double) (arg4 - this.field5451);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field5435 = (double) this.field5447;
            this.field5449 = (double) this.field5429 * var6 / var10 + (double) this.field5421;
            this.field5454 = (double) this.field5429 * var8 / var10 + (double) this.field5451;
        }
        double var12 = (double) (this.field5417 + 1 - arg3);
        this.field5433 = ((double) arg2 - this.field5449) / var12;
        this.field5441 = ((double) arg4 - this.field5454) / var12;
        if (arg0 >= -4) {
            this.method2416(11, -71, -105, -1, 43);
        }
        this.field5450 = Math.sqrt(this.field5441 * this.field5441 + this.field5433 * this.field5433);
        if (this.field5448 == -1) {
            this.field5446 = ((double) arg1 - this.field5435) / var12;
        } else {
            if (!this.field5436) {
                this.field5446 = -this.field5450 * Math.tan((double) this.field5448 * 0.02454369D);
            }
            this.field5427 = ((double) arg1 - this.field5435 - (this.field5446 * var12)) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILvg;)V", line = 177)
    private final void method2417(int arg0, class81 arg1) {
        if (class47.field623) {
            class128 var3 = (class128) arg1;
            if ((this.field5419 == null || this.field5419.field2565) && (var3.field1746 != null || var3.field1712 != null)) {
                this.field5419 = new class187(class313.field4603, 1, 1);
            }
            if (this.field5419 != null) {
                this.field5419.method1369(var3.field1746, var3.field1712, false, var3.field1732, var3.field1710, var3.field1699);
            }
        } else {
            class332 var4 = (class332) arg1;
            if ((this.field5419 == null || this.field5419.field2565) && (var4.field4977 != null || var4.field4965 != null)) {
                this.field5419 = new class187(class313.field4603, 1, 1);
            }
            if (this.field5419 != null) {
                this.field5419.method1369(var4.field4977, var4.field4965, false, var4.field4973, var4.field4964, var4.field4953);
            }
        }
        field5444++;
        int var5 = -109 / ((arg0 - 35) / 54);
        this.field5425 = true;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "()I", line = 221)
    public final int method583() {
        field5415++;
        return this.field5453;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 242)
    public static void method2418(int arg0) {
        field5418 = null;
        if (arg0 == 13) {
            field5428 = null;
            field5455 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)Lvg;", line = 257)
    private final class81 method2419(boolean arg0) {
        field5424++;
        if (!arg0) {
            this.field5436 = false;
        }
        class15 var2 = class234.method1664(-128, this.field5438);
        class81 var3 = var2.method114(this.field5434, this.field5445, this.field5420, (byte) 14);
        if (var3 == null) {
            return null;
        } else {
            var3.method591(this.field5423);
            return var3;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIII)V", line = 322)
    public final void method573(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5452++;
        if (!this.field5425) {
            class81 var6 = this.method2419(true);
            if (var6 == null) {
                return;
            }
            this.method2417(104, var6);
        }
        if (this.field5419 != null) {
            this.field5419.method1351(arg0, arg1, arg3, arg2, arg4);
        }
    }
}
