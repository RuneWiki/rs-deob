import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class329 extends class262 {

    @OriginalMember(owner = "client!oq", name = "r", descriptor = "F")
    private float field4378 = 0.0F;

    @OriginalMember(owner = "client!oq", name = "u", descriptor = "Lvt;")
    private class276 field4381;

    @OriginalMember(owner = "client!oq", name = "w", descriptor = "Lwo;")
    public static class690 field4383 = new class690(34, 14);

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!oq", name = "p", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!oq", name = "q", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!oq", name = "s", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!oq", name = "t", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!oq", name = "v", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!oq", name = "x", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ljava/io/File;II)[B")
    public static final byte[] method1911(File arg0, int arg1, int arg2) {
        ++field4376;
        try {
            if (arg1 >= -5) {
                method1911((File) null, -16, -80);
            }
            byte[] var3 = new byte[arg2];
            class323.method1876(arg2, -120, arg0, var3);
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(B)V")
    public final void method596(byte arg0) {
        if (super.field3601.method2379(104) == 0) {
            class653 var2 = super.field3601.method2311((byte) -119);
            super.field3601.method2318(1, -30954);
            class653 var3 = super.field3601.method2373((byte) -90);
            var3.method711(var2);
            var3.method3701(1.0F, (byte) -125, 0.125F, 0.125F);
            var3.method3695((byte) 67, this.field4378, 0.0F, 0.0F);
            super.field3601.method2319((byte) 112, class405.field5718);
            super.field3601.method2318(0, -30954);
        }
        ++field4374;
        if (arg0 < 9) {
            this.method596((byte) -62);
        }
    }

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)V")
    public final void method374(int arg0) {
        ++field4379;
        super.field3601.method2318(1, -30954);
        super.field3601.method2303((byte) -128, class652.field9230, class652.field9230);
        super.field3601.method2301(0, class519.field7612, 2);
        super.field3601.method2348(0, 6655, class519.field7612);
        super.field3601.method498(1, 1);
        super.field3601.method2316((byte) 102, (class644) null);
        super.field3601.method2318(0, -30954);
        super.field3601.method2348(0, 6655, class519.field7612);
        if (arg0 < 42) {
            method1911((File) null, 39, 7);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)Z")
    public final boolean method375(int arg0) {
        ++field4380;
        return arg0 != -18095 ? true : this.field4381.method1670(false);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILoa;B)V")
    public final void method371(int arg0, class644 arg1, byte arg2) {
        ++field4382;
        super.field3601.method2316((byte) 92, arg1);
        if (arg2 <= 80) {
            method1911((File) null, -78, -87);
        }
    }

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "(I)V")
    public static void method1912(int arg0) {
        if (arg0 == 0) {
            field4383 = null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IZI)V")
    public final void method373(int arg0, boolean arg1, int arg2) {
        super.field3601.method2318(1, -30954);
        ++field4375;
        if (~(arg0 & 128) != -1) {
            super.field3601.method2316((byte) 126, (class644) null);
        } else if ((arg2 & 1) == 1) {
            if (this.field4381.field3776) {
                this.field4378 = (float) (super.field3601.field5487 % 4000) / 4000.0F;
                super.field3601.method2316((byte) 108, this.field4381.field3777);
            } else {
                int var4 = super.field3601.field5487 % 4000 * 16 / 4000;
                super.field3601.method2316((byte) 124, this.field4381.field3770[var4]);
            }
        } else if (this.field4381.field3776) {
            super.field3601.method2316((byte) 94, this.field4381.field3777);
        } else {
            super.field3601.method2316((byte) 109, this.field4381.field3770[0]);
        }
        if (arg1) {
            super.field3601.method2318(0, -30954);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IZ)V")
    public final void method377(int arg0, boolean arg1) {
        super.field3601.method2318(1, -30954);
        ++field4377;
        super.field3601.method2303((byte) -88, class231.field3011, class698.field9875);
        super.field3601.method512(true, 0, 9494, class519.field7612, false);
        super.field3601.method2348(0, 6655, class141.field1760);
        super.field3601.method498(1, 0);
        super.field3601.method2318(0, -30954);
        super.field3601.method2331(true, -16777216);
        super.field3601.method2348(0, 6655, class308.field4083);
        this.method596((byte) 80);
        if (arg0 <= 37) {
            field4383 = null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lifa;Lvt;)V")
    public class329(class393 arg0, class276 arg1) {
        super(arg0);
        this.field4381 = arg1;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZI)V")
    public final void method372(boolean arg0, int arg1) {
        super.field3601.method2303((byte) 95, class231.field3011, class652.field9230);
        ++field4384;
        if (arg1 != 0) {
            method1911((File) null, 9, 99);
        }
    }
}
