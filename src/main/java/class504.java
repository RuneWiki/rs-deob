import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class504 {

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "Lpca;")
    private class653 field7250 = new class653(64);

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "Lpca;")
    public class653 field7258 = new class653(2);

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "Ljo;")
    private class303 field7247;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "Ljo;")
    public class303 field7255;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "Lkfa;")
    public static class549 field7249 = new class549(54, 7);

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "I")
    public static int field7260 = 0;

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "Z")
    public static boolean field7259 = false;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "I")
    public static int field7253;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
    public static int field7256;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
    public static int field7257;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "Lmfa;")
    public static class562 field7252;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BI)Ltk;", line = 5)
    public final class312 method2895(byte arg0, int arg1) {
        field7256++;
        class653 var3 = this.field7250;
        class312 var4;
        synchronized (this.field7250) {
            var4 = (class312) this.field7250.method3690((byte) 6, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class303 var5 = this.field7247;
        byte[] var6;
        synchronized (this.field7247) {
            var6 = this.field7247.method1719(arg1, 33, 4);
        }
        class312 var7 = new class312();
        var7.field4028 = this;
        if (var6 != null) {
            var7.method1765(-1, new class452(var6));
        }
        class653 var8 = this.field7250;
        synchronized (this.field7250) {
            this.field7250.method3683(var7, (byte) 108, (long) arg1);
        }
        if (arg0 < 125) {
            this.method2896(-100, 34);
        }
        return var7;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)V", line = 37)
    public final void method2896(int arg0, int arg1) {
        class653 var3 = this.field7250;
        synchronized (this.field7250) {
            this.field7250.method3691(false, arg1);
        }
        int var4 = -46 % ((5 - arg0) / 47);
        field7253++;
        class653 var5 = this.field7258;
        synchronized (this.field7258) {
            this.field7258.method3691(false, arg1);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILiaa;)Loq;", line = 55)
    public static final class326 method2897(int arg0, class452 arg1) {
        field7257++;
        class352 var2 = class620.method3478(arg1, 36068);
        if (arg0 != -1) {
            field7252 = null;
        }
        int var3 = arg1.method2575((byte) -48);
        int var4 = arg1.method2575((byte) -48);
        return new class326(var2.field4605, var2.field4608, var2.field4610, var2.field4612, var2.field4617, var2.field4607, var2.field4609, var3, var4);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)V", line = 73)
    public final void method2898(byte arg0) {
        class653 var2 = this.field7250;
        synchronized (this.field7250) {
            this.field7250.method3687((byte) -10);
        }
        field7251++;
        class653 var3 = this.field7258;
        synchronized (this.field7258) {
            if (arg0 == -111) {
                this.field7258.method3687((byte) -10);
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IJ)V", line = 90)
    public static final void method2899(int arg0, long arg1) {
        field7254++;
        if (arg0 < 61) {
            return;
        }
        int var3 = class638.field9053;
        if (class534.field7634 != var3) {
            int var4 = var3 - class534.field7634;
            int var5 = (int) ((long) var4 * arg1 / 320L);
            if (var4 > 0) {
                if (var5 == 0) {
                    var5 = 1;
                } else if (var5 > var4) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = -1;
            } else if (var5 < var4) {
                var5 = var4;
            }
            class534.field7634 += var5;
        }
        int var6 = class437.field6085;
        if (class656.field9368 != var6) {
            int var7 = var6 - class656.field9368;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class656.field9368 += var8;
        }
        if (!class601.field8530.field2880) {
            class90.field1041 += (float) arg1 * class574.field8149 / 40.0F * 8.0F;
            class89.field958 += (float) arg1 * class526.field7522 / 40.0F * 8.0F;
        }
        class61.method406(16384);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V", line = 173)
    public final void method2900(int arg0) {
        field7248++;
        if (arg0 != -1) {
            return;
        }
        class653 var2 = this.field7250;
        synchronized (this.field7250) {
            this.field7250.method3684(arg0 - 17199);
        }
        class653 var3 = this.field7258;
        synchronized (this.field7258) {
            this.field7258.method3684(-17200);
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V", line = 194)
    public static void method2901(int arg0) {
        if (arg0 != 23230) {
            field7252 = null;
        }
        field7249 = null;
        field7252 = null;
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Ljda;ILjo;Ljo;)V", line = 214)
    public class504(class207 arg0, int arg1, class303 arg2, class303 arg3) {
        this.field7247 = arg2;
        this.field7255 = arg3;
        this.field7247.method1727(-77, 33);
    }
}
