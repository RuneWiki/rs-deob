import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class309 extends class240 {

    @OriginalMember(owner = "client!gn", name = "w", descriptor = "[I")
    private int[] field4700 = new int[this.field3577];

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "[I")
    public static int[] field4693 = new int[50];

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "I")
    public static int field4694 = 0;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "Lug;")
    public static class242 field4697 = new class242();

    @OriginalMember(owner = "client!gn", name = "C", descriptor = "[I")
    public static int[] field4706 = new int[1000];

    @OriginalMember(owner = "client!gn", name = "A", descriptor = "Z")
    public static boolean field4704 = false;

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "I")
    private int field4692;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!gn", name = "v", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!gn", name = "x", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!gn", name = "y", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "I")
    private int field4703;

    @OriginalMember(owner = "client!gn", name = "D", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!gn", name = "B", descriptor = "[B")
    private byte[] field4705;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V", line = 4)
    public final void method1395(int arg0) {
        field4695++;
        if (arg0 != 4) {
            this.method1389(false);
        }
        this.field4703 = 0;
        this.field4692 = 0;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIILmd;IJZ)Z", line = 15)
    public static final boolean method2136(int arg0, int arg1, int arg2, int arg3, int arg4, class233 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class327.method2229(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Llm;B)V", line = 52)
    public static final void method2137(class210 arg0, byte arg1) {
        field4707++;
        class12.field139 = arg0;
        if (arg1 >= -24) {
            field4694 = 105;
        }
    }

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "(I)V", line = 66)
    public static final void method2138(int arg0) {
        class284.field4295.method2182(false);
        field4702++;
        if (arg0 <= 75) {
            method2138(-24);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)V", line = 77)
    public final void method1389(boolean arg0) {
        field4701++;
        this.field4703 = Math.abs(this.field4703);
        if (!arg0) {
            field4706 = (int[]) null;
        }
        if (this.field4703 >= 4096) {
            this.field4703 = 4095;
        }
        this.method1216(this.field4692++, (byte) (this.field4703 >> 4));
        this.field4703 = 0;
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(IIIIIF)V", line = 99)
    public class309(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field3577; var7++) {
            this.field4700[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)V", line = 126)
    public final void method1387(int arg0, int arg1, int arg2) {
        field4696++;
        if (arg2 == 0) {
            this.field4703 += this.field4700[arg0] * arg1 >> 12;
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(III)V", line = 137)
    public static final void method2139(int arg0, int arg1, int arg2) {
        class246.field3671++;
        field4699++;
        if (arg1 != -6023) {
            field4693 = (int[]) null;
        }
        class234.field3507.method28(240, false);
        class234.field3507.method1798(arg2, 107);
        class234.field3507.method1841(124, arg0);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V", line = 158)
    public static void method2140(byte arg0) {
        if (arg0 <= 67) {
            field4704 = true;
        }
        field4697 = null;
        field4706 = null;
        field4693 = null;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IB)V", line = 172)
    public void method1216(int arg0, byte arg1) {
        field4698++;
        this.field4705[this.field4692++] = (byte) ((class124.method893(arg1, 255) >> 1) + 127);
    }
}
