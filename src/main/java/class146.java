import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class146 extends class112 {

    @OriginalMember(owner = "client!va", name = "L", descriptor = "I")
    private int field2232 = 4096;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "Z")
    private boolean field2236 = true;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "[I")
    public static int[] field2243 = new int[14];

    @OriginalMember(owner = "client!va", name = "N", descriptor = "Lek;")
    public static class183 field2234 = new class183();

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "I")
    public static int field2246 = 500;

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "I")
    public static int field2245 = 0;

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "[I")
    public static int[] field2247 = new int[14];

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!va", name = "R", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!va", name = "S", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!va", name = "T", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!va", name = "U", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!va", name = "X", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ISIILwm;JILwm;)V", line = 5)
    public static final void method915(int arg0, short arg1, int arg2, int arg3, class152 arg4, long arg5, int arg6, class152 arg7) {
        int var9 = -46 % ((arg0 + 26) / 63);
        field2231++;
        if (class70.field1016 || class160.field2556 >= 500) {
            return;
        }
        class123.field1734[class160.field2556] = arg7;
        class55.field864[class160.field2556] = arg4;
        class83.field1156[class160.field2556] = arg2 == -1 ? class321.field5607 : arg2;
        class273.field4688[class160.field2556] = arg1;
        class208.field3391[class160.field2556] = arg5;
        class26.field445[class160.field2556] = arg3;
        class64.field955[class160.field2556] = arg6;
        class160.field2556++;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(BI)V", line = 33)
    public static final void method916(byte arg0, int arg1) {
        class307.field5275 = new int[arg1];
        class295.field5042 = new int[arg1];
        class224.field3642 = new int[arg1];
        class23.field405 = new int[arg1];
        field2238++;
        if (arg0 > -60) {
            method917(-36);
        }
        class127.field1919 = new int[arg1];
    }

    @OriginalMember(owner = "client!va", name = "h", descriptor = "(I)V", line = 50)
    public static final void method917(int arg0) {
        int var1 = 76 / ((arg0 - 56) / 58);
        class223.field3631.method1613(-22696);
        field2241++;
    }

    @OriginalMember(owner = "client!va", name = "i", descriptor = "(I)V", line = 59)
    public static void method918(int arg0) {
        field2243 = null;
        if (arg0 == 14) {
            field2234 = null;
            field2247 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([I[JI)V", line = 75)
    public static final void method919(int[] arg0, long[] arg1, int arg2) {
        field2239++;
        class259.method1799(arg0, -126, arg1.length - 1, arg2, arg1);
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(BI)V", line = 84)
    public static final void method920(byte arg0, int arg1) {
        if (arg1 == -1 && !class111.field1571) {
            class320.method2254(13715);
        } else if (arg1 != -1 && (class40.field653 != arg1 || !class172.method1154(true)) && class6.field93 != 0 && !class111.field1571) {
            class173.method1159(1, 2, false, class280.field4783, class6.field93, 0, arg1);
        }
        int var2 = 125 % ((arg0 + 33) / 35);
        field2235++;
        class40.field653 = arg1;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V", line = 201)
    public class146() {
        super(1, false);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ)[[I", line = 119)
    public final int[][] method55(int arg0, boolean arg1) {
        if (arg1) {
            field2246 = 52;
        }
        field2240++;
        int[][] var3 = this.field1594.method656((byte) -70, arg0);
        if (this.field1594.field1402) {
            int[] var4 = this.method751(class275.field4712 & arg0 - 1, (byte) 107, 0);
            int[] var5 = this.method751(arg0, (byte) 105, 0);
            int[] var6 = this.method751(arg0 + 1 & class275.field4712, (byte) 98, 0);
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            for (int var10 = 0; var10 < class58.field889; var10++) {
                int var11 = (var5[var10 + 1 & class251.field4304] - var5[class251.field4304 & var10 - 1]) * this.field2232;
                int var12 = (var6[var10] - var4[var10]) * this.field2232;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var13 * var13 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var20 = var12 / var17;
                    var19 = var11 / var17;
                    var18 = 16777216 / var17;
                }
                if (this.field2236) {
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var9[var10] = var19;
                var8[var10] = var20;
                var7[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILhi;)V", line = 206)
    public final void method52(int arg0, int arg1, class291 arg2) {
        if (arg0 != 31164) {
            this.method55(-52, true);
        }
        if (arg1 == 0) {
            this.field2232 = arg2.method2021((byte) 74);
        } else if (arg1 == 1) {
            this.field2236 = arg2.method2011(-122) == 1;
        }
        field2242++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)V", line = 250)
    public static final void method921(int arg0, byte arg1) {
        field2237++;
        class128.field1948 = arg0;
        int var2 = 26 / ((arg1 + 77) / 35);
        class113.method758(3, -1);
        class113.method758(4, -1);
    }
}
