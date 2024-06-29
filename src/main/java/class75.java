import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class75 {

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "Lad;")
    private class11 field949 = new class11(16);

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "Ldn;")
    private class201 field948;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "[I")
    public static int[] field943 = new int[64];

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "Z")
    public static boolean field947 = false;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field945 = 0;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ldn;I)V")
    public static final void method426(class201 arg0, int arg1) {
        class14.field239 = arg1;
        field939++;
        class366.field4709 = 0;
        class287.field3663 = new class362();
        class519.field7676 = new class341[1024];
        class103.method693(arg1 + 18411, arg0);
        class56.method323((byte) 93, arg0);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
    public final void method427(int arg0, int arg1) {
        if (arg1 != 32660) {
            return;
        }
        field946++;
        class11 var3 = this.field949;
        synchronized (this.field949) {
            this.field949.method80(-51, arg0);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public final void method428(int arg0) {
        class11 var2 = this.field949;
        synchronized (this.field949) {
            this.field949.method84(-112);
        }
        if (arg0 != -18804) {
            this.method431((byte) 9, 114);
        }
        field941++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lgf;B)I")
    public static final int method429(class395 arg0, byte arg1) {
        if (arg1 != 8) {
            field940 = -29;
        }
        field950++;
        if (arg0.field5200 == 0) {
            return 0;
        }
        if (arg0.field5202 != -1) {
            class395 var2 = null;
            if (arg0.field5202 < 32768) {
                var2 = class527.field7791[arg0.field5202];
            } else if (arg0.field5202 >= 32768) {
                var2 = class76.field952[arg0.field5202 - 32768];
            }
            if (var2 != null) {
                int var3 = arg0.field6239 - var2.field6239;
                int var4 = arg0.field6241 - var2.field6241;
                if (var3 != 0 || var4 != 0) {
                    arg0.method2341(true, (int) (Math.atan2((double) var3, (double) var4) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if ((arg0 instanceof class518)) {
            class518 var8 = (class518) arg0;
            if (var8.field7668 != -1 && (var8.field5244 == 0 || var8.field5245 > 0)) {
                var8.method2341(true, var8.field7668);
                var8.field7668 = -1;
            }
        } else if (arg0 instanceof class295) {
            class295 var5 = (class295) arg0;
            if (var5.field3829 != -1 && (var5.field5244 == 0 || var5.field5245 > 0)) {
                int var6 = var5.field6239 - (var5.field3829 - class35.field545 - class35.field545) * 64;
                int var7 = var5.field6241 - (var5.field3835 - class336.field4299 - class336.field4299) * 64;
                if (var6 != 0 || var7 != 0) {
                    var5.method2341(true, (int) (Math.atan2((double) var6, (double) var7) * 2607.5945876176133D) & 0x3FFF);
                }
                var5.field3829 = -1;
            }
        }
        return arg0.method2356(arg1 + 27609);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lso;IIIII)Lbv;")
    public final class466 method430(class198 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 0) {
            return null;
        }
        field938++;
        class41[] var7 = null;
        class186 var8 = this.method431((byte) -83, arg4);
        if (var8.field2437 != null) {
            var7 = new class41[var8.field2437.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class318 var10 = arg0.method1272(30, var8.field2437[var9]);
                var7[var9] = new class41(var10.field4091, var10.field4089, var10.field4092, var10.field4087, var10.field4083, var10.field4090, var10.field4084, var10.field4085);
            }
        }
        return new class466(var8.field2433, var7, var8.field2438, arg5, arg2, arg1);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)Lvr;")
    private final class186 method431(byte arg0, int arg1) {
        field944++;
        class11 var3 = this.field949;
        class186 var4;
        synchronized (this.field949) {
            var4 = (class186) this.field949.method78((long) arg1, (byte) -101);
        }
        if (arg0 >= -51) {
            return null;
        } else if (var4 == null) {
            byte[] var5 = this.field948.method1313((byte) -112, 29, arg1);
            class186 var6 = new class186();
            if (var5 != null) {
                var6.method1230(0, new class88(var5));
            }
            class11 var7 = this.field949;
            synchronized (this.field949) {
                this.field949.method88((long) arg1, 67, var6);
                return var6;
            }
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
    public static void method432(boolean arg0) {
        if (!arg0) {
            method426(null, -106);
        }
        field943 = null;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
    public final void method433(int arg0) {
        class11 var2 = this.field949;
        synchronized (this.field949) {
            this.field949.method90((byte) -27);
        }
        if (arg0 != 29539) {
            this.method427(13, 70);
        }
        field942++;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lgt;ILdn;)V")
    public class75(class65 arg0, int arg1, class201 arg2) {
        this.field948 = arg2;
        this.field948.method1302(-93, 29);
    }
}
