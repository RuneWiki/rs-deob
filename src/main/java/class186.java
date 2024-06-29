import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cka")
public class class186 {

    @OriginalMember(owner = "client!cka", name = "h", descriptor = "Ljda;")
    private class239 field2484 = new class239(64);

    @OriginalMember(owner = "client!cka", name = "p", descriptor = "I")
    public int field2492 = 0;

    @OriginalMember(owner = "client!cka", name = "i", descriptor = "Laj;")
    private class333 field2485;

    @OriginalMember(owner = "client!cka", name = "b", descriptor = "I")
    public int field2478;

    @OriginalMember(owner = "client!cka", name = "d", descriptor = "I")
    public static int field2480 = 0;

    @OriginalMember(owner = "client!cka", name = "l", descriptor = "[I")
    public static int[] field2488 = new int[32];

    @OriginalMember(owner = "client!cka", name = "g", descriptor = "Ljw;")
    public static class581 field2483 = new class581(101, 0);

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!cka", name = "c", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!cka", name = "e", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!cka", name = "f", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!cka", name = "j", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!cka", name = "m", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!cka", name = "n", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!cka", name = "o", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!cka", name = "k", descriptor = "[I")
    public static int[] field2487;

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "([II[Ljava/lang/Object;II)V", line = 6)
    public static final void method1288(int[] arg0, int arg1, Object[] arg2, int arg3, int arg4) {
        if (arg1 < arg4) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg1;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var7;
            Object var8 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var8;
            int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
            for (int var10 = arg1; var10 < arg4; var10++) {
                if (((var10 & var9) + var7) > arg0[var10]) {
                    int var11 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6] = var11;
                    Object var12 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6++] = var12;
                }
            }
            arg0[arg4] = arg0[var6];
            arg0[var6] = var7;
            arg2[arg4] = arg2[var6];
            arg2[var6] = var8;
            method1288(arg0, arg1, arg2, 33, var6 - 1);
            method1288(arg0, var6 + 1, arg2, 112, arg4);
        }
        field2490++;
        if (arg3 <= 16) {
            method1293(96, -68, -41);
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(III)I", line = 64)
    public static final int method1289(int arg0, int arg1, int arg2) {
        field2482++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg0 != 27743) {
            method1293(-14, -18, 26);
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(IBI)I", line = 86)
    public static final int method1290(int arg0, byte arg1, int arg2) {
        field2479++;
        if (class207.field2711 == -1) {
            return 1;
        }
        if (arg2 != class712.field9959.field1270.method4293(78)) {
            class554.method3128(-3, class474.field6552.method2780(93, class38.field589), true, arg2);
            if (class712.field9959.field1270.method4293(52) != arg2) {
                return -1;
            }
        }
        try {
            Dimension var3 = class706.field9894.getSize();
            class660.method3653(class105.field1452, class379.field5542, class7.field76, true, arg1 - 96, class474.field6552.method2780(126, class38.field589));
            class782 var4 = class558.method3142(2085750768, class237.field3203, class207.field2711, 0);
            long var5 = class302.method1910(0);
            class379.field5542.method543();
            class334.field4865.method981(0, class30.field464, 0);
            class379.field5542.method526(class334.field4865);
            class379.field5542.method540(var3.width / 2, var3.height / 2, 512, 512);
            class379.field5542.method452(1.0F);
            class379.field5542.method533(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class500 var7 = class379.field5542.method510(var4, 2048, 64, 64, 768);
            int var8 = 0;
            label45: for (int var9 = 0; var9 < 500; var9++) {
                class379.field5542.method458(0);
                class379.field5542.method483();
                for (int var10 = 15; var10 >= 0; var10--) {
                    for (int var11 = 0; var11 <= var10; var11++) {
                        class176.field2342.method981((int) (((float) var11 - (float) var10 / 2.0F) * (float) class48.field722), 0, (var10 + 1) * class48.field722);
                        var8++;
                        var7.method292(class176.field2342, null, 0);
                        if (class302.method1910(0) - var5 >= (long) arg0) {
                            break label45;
                        }
                    }
                }
            }
            if (arg1 != 28) {
                method1289(-93, -106, 40);
            }
            class379.field5542.method468();
            long var12 = (long) (var8 * 1000) / (class302.method1910(0) - var5);
            class379.field5542.method458(0);
            class379.field5542.method483();
            return (int) var12;
        } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(I)V", line = 169)
    public final void method1291(int arg0) {
        field2491++;
        class239 var2 = this.field2484;
        synchronized (this.field2484) {
            this.field2484.method1555((byte) -3);
        }
        if (arg0 != 16) {
            this.field2484 = null;
        }
    }

    @OriginalMember(owner = "client!cka", name = "b", descriptor = "(I)V", line = 182)
    public static void method1292(int arg0) {
        field2483 = null;
        field2488 = null;
        field2487 = null;
        if (arg0 != 101) {
            method1292(-36);
        }
    }

    @OriginalMember(owner = "client!cka", name = "b", descriptor = "(III)V", line = 199)
    public static final void method1293(int arg0, int arg1, int arg2) {
        if (class99.field1374 != arg0) {
            if (arg1 < 0) {
                for (int var3 = 0; var3 < 16; var3++) {
                    class348.field5114[var3] = arg2;
                }
            } else {
                class348.field5114[arg1] = arg2;
            }
        }
        field2486++;
        class207.field2705.method4173(arg2, arg1, 0);
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(B)V", line = 228)
    public final void method1294(byte arg0) {
        if (arg0 >= -54) {
            this.field2484 = null;
        }
        class239 var2 = this.field2484;
        synchronized (this.field2484) {
            this.field2484.method1552(-127);
        }
        field2477++;
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(II)V", line = 242)
    public final void method1295(int arg0, int arg1) {
        if (arg1 != -31533) {
            this.field2485 = null;
        }
        class239 var3 = this.field2484;
        synchronized (this.field2484) {
            this.field2484.method1546(arg0, (byte) -8);
        }
        field2481++;
    }

    @OriginalMember(owner = "client!cka", name = "<init>", descriptor = "(Lgia;ILaj;)V", line = 308)
    public class186(class285 arg0, int arg1, class333 arg2) {
        this.field2485 = arg2;
        this.field2478 = this.field2485.method2090(4, false);
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(IB)Lck;", line = 272)
    public final class669 method1296(int arg0, byte arg1) {
        field2489++;
        class239 var3 = this.field2484;
        class669 var4;
        synchronized (this.field2484) {
            var4 = (class669) this.field2484.method1541(-10, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class333 var5 = this.field2485;
        byte[] var6;
        synchronized (this.field2485) {
            var6 = this.field2485.method2095(arg0, 4, 1);
        }
        class669 var7 = new class669();
        var7.field9408 = arg0;
        var7.field9404 = this;
        if (var6 != null) {
            var7.method3719(-7, new class376(var6));
        }
        if (arg1 < 80) {
            return null;
        }
        var7.method3723(127);
        class239 var8 = this.field2484;
        synchronized (this.field2484) {
            this.field2484.method1544(true, var7, (long) arg0);
            return var7;
        }
    }
}
