import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class699 {

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "[I")
    private int[] field9443 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Ljr;")
    public static class112 field9442 = new class112(8);

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "J")
    public static long field9461 = -1L;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    public static int field9460 = -1;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field9441;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field9445;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field9446;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field9447;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field9448;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field9449;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field9450;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field9452;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public static int field9457;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    public static int field9458;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "Loha;")
    public class738 field9454;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "Ljava/awt/Frame;")
    public static Frame field9455;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "[I")
    private int[] field9451;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "[S")
    private short[] field9444;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "[S")
    private short[] field9453;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "[S")
    private short[] field9456;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "[S")
    private short[] field9459;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)Lbh;")
    public final class37 method3902(int arg0) {
        field9447++;
        if (this.field9451 == null) {
            return null;
        }
        class37[] var2 = new class37[this.field9451.length];
        class91 var3 = this.field9454.field9936;
        synchronized (this.field9454.field9936) {
            int var4 = 0;
            while (true) {
                if (var4 >= this.field9451.length) {
                    break;
                }
                var2[var4] = class756.method4222(0, this.field9454.field9936, this.field9451[var4], -1);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field9451.length; var5++) {
            if (var2[var5].field897 < 13) {
                var2[var5].method458(2, 113);
            }
        }
        class37 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class37(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (arg0 < 53) {
            this.method3902(-22);
        }
        if (this.field9453 != null) {
            for (int var7 = 0; var7 < this.field9453.length; var7++) {
                var6.method464(this.field9453[var7], (byte) 126, this.field9459[var7]);
            }
        }
        if (this.field9444 != null) {
            for (int var8 = 0; var8 < this.field9444.length; var8++) {
                var6.method461(this.field9444[var8], 0, this.field9456[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)Z")
    public final boolean method3903(byte arg0) {
        field9449++;
        boolean var2 = true;
        class91 var3 = this.field9454.field9936;
        synchronized (this.field9454.field9936) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field9443[var4] != -1 && !this.field9454.field9936.method873(-10499, this.field9443[var4], 0)) {
                    var2 = false;
                }
            }
            if (arg0 <= 87) {
                method3912(96);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)Lbh;")
    public final class37 method3904(byte arg0) {
        field9450++;
        class37[] var2 = new class37[5];
        int var3 = 0;
        class91 var4 = this.field9454.field9936;
        synchronized (this.field9454.field9936) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field9443[var5] != -1) {
                    var2[var3++] = class756.method4222(0, this.field9454.field9936, this.field9443[var5], -1);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field897 < 13) {
                var2[var6].method458(2, 99);
            }
        }
        if (arg0 > -27) {
            return null;
        }
        class37 var7 = new class37(var2, var3);
        if (this.field9453 != null) {
            for (int var8 = 0; var8 < this.field9453.length; var8++) {
                var7.method464(this.field9453[var8], (byte) 126, this.field9459[var8]);
            }
        }
        if (this.field9444 != null) {
            for (int var9 = 0; var9 < this.field9444.length; var9++) {
                var7.method461(this.field9444[var9], 0, this.field9456[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILcea;B)V")
    private final void method3905(int arg0, class215 arg1, byte arg2) {
        if (arg0 == 1) {
            arg1.method1535(arg2 + 320);
        } else if (arg0 == 2) {
            int var4 = arg1.method1535(arg2 + 320);
            this.field9451 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field9451[var5] = arg1.method1478(842397944);
            }
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var6 = arg1.method1535(arg2 ^ 0xFFFFFF40);
                this.field9459 = new short[var6];
                this.field9453 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field9453[var7] = (short) arg1.method1478(842397944);
                    this.field9459[var7] = (short) arg1.method1478(842397944);
                }
            } else if (arg0 == 41) {
                int var8 = arg1.method1535(255);
                this.field9444 = new short[var8];
                this.field9456 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field9444[var9] = (short) arg1.method1478(arg2 + 842398009);
                    this.field9456[var9] = (short) arg1.method1478(842397944);
                }
            } else if (arg0 >= 60 && arg0 < 70) {
                this.field9443[arg0 - 60] = arg1.method1478(842397944);
            }
        }
        field9458++;
        if (arg2 != -65) {
            field9461 = -90L;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)V")
    public static final void method3906(int arg0, byte arg1) {
        field9448++;
        if (class326.field4513 == 0) {
            class266.field3769.method93(0, arg0);
        } else {
            class273.field3839 = arg0;
        }
        if (arg1 > -26) {
            method3910(-111);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILcea;)V")
    public final void method3907(int arg0, class215 arg1) {
        field9446++;
        while (true) {
            int var3 = arg1.method1535(255);
            if (var3 == 0) {
                int var4 = -5 / ((73 - arg0) / 49);
                return;
            }
            this.method3905(var3, arg1, (byte) -65);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([I[IIII)V")
    public static final void method3908(int[] arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field9452++;
        if (arg3 != -22222) {
            field9442 = null;
        }
        if (arg2 >= arg4) {
            return;
        }
        int var5 = (arg2 + arg4) / 2;
        int var6 = arg2;
        int var7 = arg0[var5];
        arg0[var5] = arg0[arg4];
        arg0[arg4] = var7;
        int var8 = arg1[var5];
        arg1[var5] = arg1[arg4];
        arg1[arg4] = var8;
        int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
        for (int var10 = arg2; var10 < arg4; var10++) {
            if (arg0[var10] < (var10 & var9) + var7) {
                int var11 = arg0[var10];
                arg0[var10] = arg0[var6];
                arg0[var6] = var11;
                int var12 = arg1[var10];
                arg1[var10] = arg1[var6];
                arg1[var6++] = var12;
            }
        }
        arg0[arg4] = arg0[var6];
        arg0[var6] = var7;
        arg1[arg4] = arg1[var6];
        arg1[var6] = var8;
        method3908(arg0, arg1, arg2, -22222, var6 - 1);
        method3908(arg0, arg1, var6 + 1, arg3, arg4);
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)Z")
    public final boolean method3909(byte arg0) {
        field9457++;
        if (arg0 != 34) {
            this.method3909((byte) -15);
        }
        if (this.field9451 == null) {
            return true;
        }
        boolean var2 = true;
        class91 var3 = this.field9454.field9936;
        synchronized (this.field9454.field9936) {
            for (int var4 = 0; var4 < this.field9451.length; var4++) {
                if (!this.field9454.field9936.method873(-10499, this.field9451[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public static final void method3910(int arg0) {
        field9441++;
        int var1 = class219.field3167;
        int[] var2 = class87.field1561;
        for (int var3 = 0; var3 < var1; var3++) {
            class598 var4 = class49.field1040[var2[var3]];
            if (var4 != null) {
                class346.method2179(false, var4.method2457((byte) 60), var4);
            }
        }
        if (arg0 != 4740) {
            method3908(null, null, 79, -21, 64);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIII)V")
    public static final void method3911(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9445++;
        class594 var5 = class692.method3869(arg3, (byte) 105, 10);
        var5.method3378(-25490);
        var5.field8125 = arg1;
        int var6 = 112 % ((arg2 - 76) / 44);
        var5.field8124 = arg4;
        var5.field8126 = arg0;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
    public static void method3912(int arg0) {
        field9442 = null;
        int var1 = 90 / ((arg0 - 19) / 43);
        field9455 = null;
    }
}
