import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class317 {

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "Z")
    public boolean field4933 = false;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "Z")
    public static boolean field4929 = false;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public int field4925;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public int field4927;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "J")
    public static long field4928;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILjj;)V", line = 4)
    public final void method2230(int arg0, int arg1, class44 arg2) {
        field4931++;
        while (true) {
            int var4 = arg2.method286((byte) -82);
            if (var4 == 0) {
                if (arg1 != 0) {
                    this.method2232(-124, false, (byte) -114);
                }
                return;
            }
            this.method2235(arg2, (byte) -62, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIII)V", line = 25)
    public static final void method2231(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= 121) {
            field4929 = true;
        }
        field4932++;
        class344 var5 = class110.method759(4, arg4, false);
        var5.method2390((byte) -90);
        var5.field5344 = arg2;
        var5.field5354 = arg1;
        var5.field5349 = arg3;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZB)Lrg;", line = 43)
    public final class326 method2232(int arg0, boolean arg1, byte arg2) {
        field4936++;
        class326 var4 = (class326) class207.field3409.method704((byte) 103, (long) (this.field4927 | arg0 << 16 | (arg1 ? 262144 : 0)));
        if (var4 != null) {
            return var4;
        }
        class209.field3439.method1276(this.field4927, -46);
        if (arg2 < 60) {
            this.field4927 = -95;
        }
        class326 var5 = class10.method56(class209.field3439, 0, this.field4927, 9);
        if (var5 != null) {
            var5.method2280(class318.field4949, class252.field4034, class135.field2150);
            var5.field4158 = var5.field4155;
            var5.field4154 = var5.field4163;
            if (arg1) {
                var5.method2287();
            }
            for (int var6 = 0; var6 < arg0; var6++) {
                var5.method2284();
            }
            class207.field3409.method703(var5, (long) (this.field4927 | arg0 << 16 | (arg1 ? 262144 : 0)), (byte) -107);
        }
        return var5;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)Lum;", line = 100)
    public static final class50 method2233(int arg0, byte arg1) {
        class50 var2 = (class50) class36.field478.method704((byte) 36, (long) arg0);
        field4930++;
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -106) {
            method2234(-32, (byte) -115);
        }
        byte[] var3 = class14.field164.method1287(arg0, 3, -1);
        class50 var4 = new class50();
        if (var3 != null) {
            var4.method325(new class44(var3), -127);
        }
        class36.field478.method703(var4, (long) arg0, (byte) 39);
        return var4;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(IB)V", line = 126)
    public static final void method2234(int arg0, byte arg1) {
        class87.method598(class87.field1201, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        if (arg1 < -82) {
            class87.method594(-50.0F, -60.0F, -50.0F);
            field4935++;
            class87.method589(class87.field1203, 0, false);
            class87.method591();
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljj;BII)V", line = 140)
    private final void method2235(class44 arg0, byte arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field4927 = arg0.method271(21081);
        } else if (arg2 == 2) {
            this.field4925 = arg0.method273(-867673064);
        } else if (arg2 == 3) {
            this.field4933 = true;
        } else if (arg2 == 4) {
            this.field4927 = -1;
        }
        if (arg1 == -62) {
            field4926++;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)V", line = 173)
    public static final void method2236(boolean arg0, int arg1) {
        if (arg1 >= -67) {
            method2236(false, -103);
        }
        field4934++;
        byte[][] var2;
        byte var3;
        if (class232.field3690 && arg0) {
            var2 = class156.field2413;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class129.field2017;
        }
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var6 = null;
            int var7 = class330.field5109[var5] >> 8;
            int var8 = class330.field5109[var5] & 0xFF;
            int var9 = var7 * 64 - class70.field989;
            int var10 = var8 * 64 - class205.field3367;
            byte[] var11 = var2[var5];
            if (var11 != null) {
                class76.method516((byte) -51);
                var6 = class247.method1763(var9, class70.field989, var10, var11, arg0, class126.field1964, true, class205.field3367);
            }
            if (!arg0 && class142.field2215 / 8 == var7 && class63.field914 / 8 == var8) {
                if (var6 == null) {
                    class55.field771 = -1;
                } else {
                    class55.field771 = var6[0];
                    class160.field2652 = var6[4];
                    class89.field1238 = var6[3];
                    class243.field3841 = var6[2];
                    class86.field1198 = var6[1];
                }
            }
        }
        for (int var12 = 0; var12 < var4; var12++) {
            int var13 = (class330.field5109[var12] >> 8) * 64 - class70.field989;
            byte[] var14 = var2[var12];
            int var15 = (class330.field5109[var12] & 0xFF) * 64 - class205.field3367;
            if (var14 == null && class63.field914 < 800) {
                class76.method516((byte) -51);
                for (int var16 = 0; var16 < var3; var16++) {
                    class84.method568(var15, 64, (byte) -122, var16, 64, var13);
                }
            }
        }
    }
}
