import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public abstract class class314 extends class66 {

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "Z")
    public boolean field4936;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "[Lng;")
    public class314[] field4927;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "Lui;")
    public static class210 field4926 = new class210(6, 0, 4, 2);

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "[I")
    public static int[] field4935 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "[[I")
    public static int[][] field4937 = new int[128][128];

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public int field4925;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "Lvda;")
    public class166 field4931;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "Lkaa;")
    public class44 field4928;

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "Lri;")
    public static class97 field4939;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)[I")
    public final int[] method2140(int arg0, int arg1, int arg2) {
        field4930++;
        if (arg2 > -121) {
            this.method6(1, 60);
        }
        return this.field4927[arg0].field4936 ? this.field4927[arg0].method6(arg1, 124) : this.field4927[arg0].method4(arg1, (byte) 88)[0];
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public void method2141(int arg0) {
        if (this.field4936) {
            this.field4928.method530((byte) 115);
            this.field4928 = null;
        } else {
            this.field4931.method1340((byte) 58);
            this.field4931 = null;
        }
        if (arg0 != 128) {
            this.field4928 = null;
        }
        field4944++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLie;I)V")
    public void method5(byte arg0, class6 arg1, int arg2) {
        if (arg0 < -1) {
            field4943++;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(III)V")
    public void method2142(int arg0, int arg1, int arg2) {
        field4942++;
        int var4 = this.field4925 == 255 ? arg2 : this.field4925;
        if (arg1 > -47) {
            method2148(-39);
        }
        if (this.field4936) {
            this.field4928 = new class44(var4, arg2, arg0);
        } else {
            this.field4931 = new class166(var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIB)[[I")
    public final int[][] method2143(int arg0, int arg1, byte arg2) {
        if (arg2 != -4) {
            this.method2141(-71);
        }
        field4929++;
        if (this.field4927[arg0].field4936) {
            int[] var4 = this.field4927[arg0].method6(arg1, 111);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field4927[arg0].method4(arg1, (byte) 86);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)[[I")
    public int[][] method4(int arg0, byte arg1) {
        if (arg1 <= 68) {
            return null;
        } else {
            field4934++;
            throw new IllegalStateException("This operation does not have a colour output");
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)I")
    public int method2144(int arg0) {
        field4938++;
        if (arg0 > -64) {
            field4937 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)I")
    public int method2145(int arg0) {
        field4933++;
        int var2 = -125 % ((arg0 - 4) / 48);
        return -1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)[I")
    public int[] method6(int arg0, int arg1) {
        field4941++;
        if (arg1 <= 109) {
            this.field4927 = null;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V")
    public static final void method2146(boolean arg0) {
        field4940++;
        class441 var1 = null;
        try {
            class701 var2 = class402.field6207.method3169(0, "2", arg0);
            while (var2.field9884 == 0) {
                class549.method3313(1L, 125);
            }
            if (var2.field9884 == 1) {
                var1 = (class441) var2.field9885;
                byte[] var3 = new byte[(int) var1.method2789(0)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2790(var4, -1, var3.length - var4, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class266.method1884(79, new class6(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method2785(-1856);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(IZ)V")
    public class314(int arg0, boolean arg1) {
        this.field4936 = arg1;
        this.field4927 = new class314[arg0];
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZI)V")
    public static final void method2147(int arg0, boolean arg1, int arg2) {
        field4945++;
        class665.field9421 = 3;
        class700.field9878 = arg2;
        class463.method2895(class623.field8794.field6971, class623.field8794.field6959, -21117);
        if (arg0 != 1) {
            method2146(true);
        }
        if (arg1) {
            class136.method1182("", (byte) -111, false, "");
        } else {
            class202.method1569(120);
            class136.method1182(class129.field2116, (byte) -121, false, class650.field9102);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
    public void method3(byte arg0) {
        field4932++;
        if (arg0 != -15) {
            this.method2145(30);
        }
    }

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "(I)V")
    public static void method2148(int arg0) {
        if (arg0 > -17) {
            field4939 = null;
        }
        field4926 = null;
        field4937 = null;
        field4939 = null;
        field4935 = null;
    }
}
