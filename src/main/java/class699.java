import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class699 {

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "Lhca;")
    private class244 field9762 = new class244();

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "Ljava/lang/String;")
    public String field9763;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field9752;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field9753;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field9754;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field9755;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field9756;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field9757;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field9758;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field9759;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field9760;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field9761;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int field9764;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    private volatile int field9766;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "Lsb;")
    private class94 field9765;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLli;)V")
    public final void method3948(byte arg0, class488 arg1) {
        class244 var3 = this.field9762;
        synchronized (this.field9762) {
            this.field9762.method1643(arg1, 114);
            int var4 = 96 % ((-arg0 - 57) / 33);
            this.field9766++;
        }
        field9757++;
        if (this.field9765 != null) {
            class94 var5 = this.field9765;
            synchronized (this.field9765) {
                this.field9765.notify();
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILuq;)V")
    public final void method3949(int arg0, class318 arg1) {
        field9754++;
        arg1.field4414 = false;
        class244 var3 = this.field9762;
        synchronized (this.field9762) {
            this.field9762.method1643(arg1, -32);
            this.field9766++;
        }
        if (this.field9765 != null) {
            class94 var4 = this.field9765;
            synchronized (this.field9765) {
                this.field9765.notify();
            }
        }
        if (arg0 != 127) {
            this.method3949(43, null);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
    public static final void method3950(byte arg0) {
        class332.field4707.method2158(1, class332.field4707.field4759, -15);
        field9756++;
        if (arg0 != -123) {
            field9760 = 2;
        }
        class332.field4707.method2158(1, class332.field4707.field4774, arg0 + 108);
        class332.field4707.method2158(2, class332.field4707.field4763, -15);
        class332.field4707.method2158(2, class332.field4707.field4793, -15);
        class332.field4707.method2158(1, class332.field4707.field4779, -15);
        class332.field4707.method2158(1, class332.field4707.field4752, -15);
        class332.field4707.method2158(1, class332.field4707.field4769, -15);
        class332.field4707.method2158(1, class332.field4707.field4799, -15);
        class332.field4707.method2158(1, class332.field4707.field4757, -15);
        class332.field4707.method2158(1, class332.field4707.field4792, -15);
        class332.field4707.method2158(1, class332.field4707.field4787, -15);
        class332.field4707.method2158(1, class332.field4707.field4764, arg0 ^ 0x74);
        class332.field4707.method2158(0, class332.field4707.field4791, arg0 + 108);
        class332.field4707.method2158(1, class332.field4707.field4765, -15);
        class332.field4707.method2158(0, class332.field4707.field4756, -15);
        class332.field4707.method2158(0, class332.field4707.field4773, arg0 + 108);
        class332.field4707.method2158(1, class332.field4707.field4800, -15);
        class332.field4707.method2158(0, class332.field4707.field4770, arg0 ^ 0x74);
        class332.field4707.method2158(0, class332.field4707.field4767, -15);
        class274.method1843(20084);
        class332.field4707.method2158(1, class332.field4707.field4758, -15);
        class332.field4707.method2158(3, class332.field4707.field4785, -15);
        class211.method1261(arg0 ^ 0xFFFFB851);
        class124.method777((byte) -97);
        class641.field8597 = true;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)Lmg;")
    public final class498 method3951(int arg0) {
        if (arg0 != 0) {
            this.method3955((byte) -96, null);
        }
        field9759++;
        Object var2 = null;
        class244 var3 = this.field9762;
        synchronized (this.field9762) {
            class498 var4 = this.field9762.method1638(false);
            var4.method3012(111);
            this.field9766--;
            return var4;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIFIIFFILkt;FFI[BI)V")
    public static final void method3952(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, float arg6, int arg7, class533 arg8, float arg9, float arg10, int arg11, byte[] arg12, int arg13) {
        field9752++;
        int var14 = arg1 * arg11;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg7; var16++) {
            arg8.method2602(arg10 / (float) arg4, arg1, arg5 / (float) arg11, arg4, arg2 * 127.0F, arg3, 0, (byte) -121, var15, arg11, arg9 / (float) arg1);
            int var19 = arg13;
            arg9 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg12[var19] = (byte) ((int) ((float) arg12[var19] + var15[var20]));
                var19++;
            }
            arg2 *= arg6;
            arg5 *= 2.0F;
            arg10 *= 2.0F;
        }
        int var17 = arg13;
        int var18 = 0;
        if (arg0 != 2) {
            return;
        }
        while (var14 > var18) {
            arg12[var17] = (byte) (arg12[var17] + 127);
            var17++;
            var18++;
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)Z")
    public final boolean method3953(int arg0) {
        if (arg0 != 0) {
            this.method3948((byte) -44, null);
        }
        field9764++;
        return this.field9766 == 0;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
    public static final void method3954(boolean arg0) {
        field9755++;
        if (class22.field269) {
            return;
        }
        class484.method2946(0, class320.field4443);
        if (class319.field4435 != null) {
            class484.method2946(0, class319.field4435);
        }
        class22.field269 = arg0;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLuq;)V")
    public final void method3955(byte arg0, class318 arg1) {
        field9753++;
        arg1.field4414 = true;
        class244 var3 = this.field9762;
        synchronized (this.field9762) {
            if (arg0 <= 112) {
                this.field9765 = null;
            }
            this.field9762.method1643(arg1, 113);
            this.field9766++;
        }
        if (this.field9765 != null) {
            class94 var4 = this.field9765;
            synchronized (this.field9765) {
                this.field9765.notify();
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/io/File;BI)[B")
    public static final byte[] method3956(File arg0, byte arg1, int arg2) {
        field9761++;
        try {
            byte[] var3 = new byte[arg2];
            class166.method1029(0, var3, arg0, arg2);
            return arg1 > -127 ? null : var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lsb;B)V")
    public final void method3957(class94 arg0, byte arg1) {
        field9758++;
        this.field9765 = arg0;
        if (arg1 != -120) {
            this.method3957(null, (byte) 28);
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class699(String arg0) {
        this.field9763 = arg0;
    }
}
