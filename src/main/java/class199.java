import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class199 {

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "I")
    private int field2829;

    @OriginalMember(owner = "client!sba", name = "l", descriptor = "[Lpaa;")
    private class578[] field2840;

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "Llga;")
    public static class663 field2830 = new class663(64);

    @OriginalMember(owner = "client!sba", name = "k", descriptor = "Lfh;")
    public static class604 field2839 = new class604();

    @OriginalMember(owner = "client!sba", name = "n", descriptor = "[I")
    public static int[] field2842 = new int[8];

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!sba", name = "e", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!sba", name = "g", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!sba", name = "i", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!sba", name = "m", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!sba", name = "f", descriptor = "J")
    private long field2834;

    @OriginalMember(owner = "client!sba", name = "h", descriptor = "Lni;")
    public static class482 field2836;

    @OriginalMember(owner = "client!sba", name = "j", descriptor = "Lpaa;")
    private class578 field2838;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lpaa;BJ)V", line = 9)
    public final void method1315(class578 arg0, byte arg1, long arg2) {
        field2841++;
        if (arg0.field8159 != null) {
            arg0.method3301(84);
        }
        class578 var5 = this.field2840[(int) ((long) (this.field2829 - 1) & arg2)];
        arg0.field8163 = var5;
        arg0.field8159 = var5.field8159;
        arg0.field8159.field8163 = arg0;
        if (arg1 < 4) {
            method1317(-88, 10);
        }
        arg0.field8154 = arg2;
        arg0.field8163.field8159 = arg0;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)Lpaa;", line = 32)
    public final class578 method1316(int arg0) {
        field2831++;
        if (this.field2838 == null) {
            return null;
        }
        class578 var2 = this.field2840[(int) (this.field2834 & (long) (this.field2829 - 1))];
        if (arg0 != -13760) {
            return null;
        }
        while (this.field2838 != var2) {
            if (this.field2838.field8154 == this.field2834) {
                class578 var3 = this.field2838;
                this.field2838 = this.field2838.field8163;
                return var3;
            }
            this.field2838 = this.field2838.field8163;
        }
        this.field2838 = null;
        return null;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(II)S", line = 66)
    public static final short method1317(int arg0, int arg1) {
        field2835++;
        int var2 = (arg0 & 0xFD15) >> 10;
        int var3 = (arg0 & 0x387) >> 3;
        int var4 = arg0 & 0x7F;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return arg1 == 2124276899 ? (short) (var7 >> 4 << 7 | var2 << 10 | var6) : 82;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(IJ)Lpaa;", line = 99)
    public final class578 method1318(int arg0, long arg1) {
        field2833++;
        this.field2834 = arg1;
        class578 var4 = this.field2840[(int) (arg1 & (long) (this.field2829 - 1))];
        if (arg0 >= -8) {
            return null;
        }
        for (this.field2838 = var4.field8163; this.field2838 != var4; this.field2838 = this.field2838.field8163) {
            if (this.field2838.field8154 == arg1) {
                class578 var5 = this.field2838;
                this.field2838 = this.field2838.field8163;
                return var5;
            }
        }
        this.field2838 = null;
        return null;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(II[FIFIIIBIFFI)V", line = 135)
    public static final void method1319(int arg0, int arg1, float[] arg2, int arg3, float arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, float arg10, float arg11, int arg12) {
        int var13 = arg0 - arg6;
        int var14 = arg5 - arg1;
        if (arg8 != 94) {
            return;
        }
        field2837++;
        int var15 = arg12 - arg3;
        float var16 = arg2[2] * (float) var13 + arg2[1] * (float) var14 + arg2[0] * (float) var15;
        float var17 = arg2[5] * (float) var13 + arg2[3] * (float) var15 + arg2[4] * (float) var14;
        float var18 = arg2[8] * (float) var13 + arg2[6] * (float) var15 + arg2[7] * (float) var14;
        float var19;
        float var20;
        if (arg9 == 0) {
            var20 = arg4 + 0.5F - var18;
            var19 = arg11 + var16 + 0.5F;
        } else if (arg9 == 1) {
            var20 = arg4 + var18 + 0.5F;
            var19 = arg11 + var16 + 0.5F;
        } else if (arg9 == 2) {
            var19 = arg11 + 0.5F - var16;
            var20 = arg10 + 0.5F - var17;
        } else if (arg9 == 3) {
            var20 = arg10 + 0.5F - var17;
            var19 = arg11 + var16 + 0.5F;
        } else if (arg9 == 4) {
            var19 = arg4 + var18 + 0.5F;
            var20 = arg10 + 0.5F - var17;
        } else {
            var20 = arg10 + 0.5F - var17;
            var19 = arg4 + 0.5F - var18;
        }
        if (arg7 == 1) {
            float var22 = var19;
            var19 = -var20;
            var20 = var22;
        } else if (arg7 == 2) {
            var20 = -var20;
            var19 = -var19;
        } else if (arg7 == 3) {
            float var21 = var19;
            var19 = var20;
            var20 = -var21;
        }
        class491.field6712 = var20;
        class378.field5058 = var19;
    }

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)V", line = 231)
    public static void method1320(int arg0) {
        field2839 = null;
        if (arg0 <= 33) {
            field2830 = null;
        }
        field2836 = null;
        field2830 = null;
        field2842 = null;
    }

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(I)V", line = 243)
    public class199(int arg0) {
        this.field2829 = arg0;
        this.field2840 = new class578[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class578 var3 = this.field2840[var2] = new class578();
            var3.field8163 = var3;
            var3.field8159 = var3;
        }
    }
}
