import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class272 extends class326 {

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
    private int field4217 = 3072;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "I")
    private int field4219 = 2048;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    private int field4223 = 1024;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
    public static int field4215 = 20;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
    public static int field4222 = 0;

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "[J")
    public static long[] field4225 = new long[32];

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "Lwb;")
    public static class142 field4216;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "Ldk;")
    public static class226 field4220;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)V", line = 6)
    public static final void method1916(byte arg0, int arg1) {
        field4213++;
        if (!class245.field3828) {
            arg1 = -1;
        }
        if (arg0 != -26 || class91.field1224 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class251 var2 = class221.method1617(arg0 + 59, arg1);
            class190 var3 = var2.method1797(arg0 ^ 0xFFFFFFE6);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class42.field581.method1008(var3.method1404(), new Point(var2.field3949, var2.field3962), var3.field2793, true, var3.field2790, class116.field1615);
                class91.field1224 = arg1;
            }
        }
        if (arg1 == -1 && class91.field1224 != -1) {
            class42.field581.method1008((int[]) null, new Point(), -1, true, -1, class116.field1615);
            class91.field1224 = -1;
        }
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(B)V", line = 44)
    public final void method99(byte arg0) {
        field4224++;
        if (arg0 == 31) {
            this.field4219 = this.field4217 - this.field4223;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)[I", line = 57)
    public final int[] method103(int arg0, int arg1) {
        field4212++;
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (arg0 > -25) {
            this.method98(-119, true, (class6) null);
        }
        if (this.field5112.field3583) {
            int[] var4 = this.method2287(0, arg1, -3896);
            for (int var5 = 0; var5 < class166.field2731; var5++) {
                var3[var5] = this.field4223 + (var4[var5] * this.field4219 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZLvl;)V", line = 90)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        field4221++;
        if (arg1) {
            this.method99((byte) 17);
        }
        if (arg0 == 0) {
            this.field4223 = arg2.method39((byte) 36);
        } else if (arg0 == 1) {
            this.field4217 = arg2.method39((byte) 85);
        } else if (arg0 == 2) {
            this.field5121 = arg2.method58(-288140008) == 1;
        }
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)V", line = 133)
    public static void method1917(int arg0) {
        field4220 = null;
        field4225 = null;
        if (arg0 != 13038) {
            field4216 = (class142) null;
        }
        field4216 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BJ)V", line = 145)
    public static final void method1918(byte arg0, long arg1) {
        field4218++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg0 != 22) {
            method1919((Object) null, -69, false);
        }
        if ((arg1 % 10L) == 0L) {
            class225.method1652(2698, arg1 - 1L);
            class225.method1652(2698, 1L);
        } else {
            class225.method1652(2698, arg1);
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V", line = 171)
    public class272() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/Object;IZ)[B", line = 175)
    public static final byte[] method1919(Object arg0, int arg1, boolean arg2) {
        field4214++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) ((byte[]) arg0);
            return arg2 ? class279.method1961(var3, (byte) 100) : var3;
        } else if ((arg0 instanceof class340)) {
            class340 var4 = (class340) arg0;
            return var4.method722((byte) 19);
        } else {
            if (arg1 <= 95) {
                field4215 = -101;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IB)[[I", line = 222)
    public final int[][] method253(int arg0, byte arg1) {
        field4211++;
        int[][] var3 = this.field5104.method2365((byte) -118, arg0);
        if (this.field5104.field5325) {
            int[][] var4 = this.method2293(-15033, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class166.field2731; var11++) {
                var8[var11] = (var5[var11] * this.field4219 >> 12) + this.field4223;
                var9[var11] = this.field4223 + (var6[var11] * this.field4219 >> 12);
                var10[var11] = (var7[var11] * this.field4219 >> 12) + this.field4223;
            }
        }
        int var12 = 38 / ((arg1 - 60) / 51);
        return var3;
    }
}
