import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class183 extends class285 {

    @OriginalMember(owner = "client!pl", name = "L", descriptor = "I")
    private int field2957 = 0;

    @OriginalMember(owner = "client!pl", name = "M", descriptor = "I")
    private int field2958 = -1;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
    private int field2947;

    @OriginalMember(owner = "client!pl", name = "G", descriptor = "Lve;")
    public static class255 field2953 = class87.method607(89, "k");

    @OriginalMember(owner = "client!pl", name = "I", descriptor = "I")
    public static int field2954 = -1;

    @OriginalMember(owner = "client!pl", name = "B", descriptor = "Lve;")
    public static class255 field2948 = class87.method607(37, "<br>(X");

    @OriginalMember(owner = "client!pl", name = "C", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!pl", name = "D", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!pl", name = "E", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!pl", name = "F", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!pl", name = "K", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!pl", name = "N", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!pl", name = "J", descriptor = "Lrg;")
    public static class88 field2955;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(B)V", line = 13)
    public final void method1280(byte arg0) {
        if (arg0 != -113) {
            method1281(-83);
        }
        int var2 = class287.method2030((byte) -126);
        if ((var2 & 0x1) == 0) {
            class281.method1953(this.field2958);
        }
        if ((var2 & 0x2) == 0) {
            class281.method1964(0);
        }
        field2949++;
        if ((var2 & 0x4) == 0) {
            class281.method1983(0);
        }
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)V", line = 37)
    public static void method1281(int arg0) {
        field2953 = null;
        field2948 = null;
        field2955 = null;
        if (arg0 != -15) {
            method1283(-26, 97);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)Lbh;", line = 49)
    public static final class261 method1282(int arg0, int arg1) {
        field2951++;
        if (arg0 == 0) {
            return new class196();
        } else if (arg0 == 1) {
            return new class300();
        } else if (arg0 == 2) {
            return new class201();
        } else if (arg0 == 3) {
            return new class217();
        } else if (arg0 == 4) {
            return new class85();
        } else if (arg0 == 5) {
            return new class77();
        } else if (arg0 == 6) {
            return new class80();
        } else if (arg0 == 7) {
            return new class3();
        } else if (arg0 == 8) {
            return new class162();
        } else if (arg0 == 9) {
            return new class158();
        } else if (arg0 == 10) {
            return new class104();
        } else if (arg0 == 11) {
            return new class166();
        } else if (arg0 == 12) {
            return new class20();
        } else if (arg0 == 13) {
            return new class308();
        } else if (arg0 == 14) {
            return new class38();
        } else if (arg0 == 15) {
            return new class265();
        } else if (arg0 == 16) {
            return new class19();
        } else if (arg0 == 17) {
            return new class174();
        } else if (arg0 == 18) {
            return new class115();
        } else if (arg0 == 19) {
            return new class232();
        } else if (arg0 == 20) {
            return new class187();
        } else if (arg0 == 21) {
            return new class297();
        } else if (arg0 == 22) {
            return new class76();
        } else if (arg0 == 23) {
            return new class206();
        } else if (arg0 == 24) {
            return new class63();
        } else if (arg0 == 25) {
            return new class230();
        } else if (arg0 == 26) {
            return new class79();
        } else if (arg0 == 27) {
            return new class185();
        } else if (arg0 == 28) {
            return new class309();
        } else if (arg0 == 29) {
            return new class124();
        } else if (arg0 == 30) {
            return new class220();
        } else if (arg0 == 31) {
            return new class49();
        } else if (arg0 == 32) {
            return new class119();
        } else if (arg0 == 33) {
            return new class143();
        } else if (arg0 == 34) {
            return new class114();
        } else if (arg0 == 35) {
            return new class241();
        } else if (arg0 == 36) {
            return new class108();
        } else if (arg0 == 37) {
            return new class64();
        } else if (arg0 == 38) {
            return new class279();
        } else if (arg0 == 39) {
            return new class292();
        } else {
            int var3 = -37 / ((arg1 - 25) / 59);
            return null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "finalize", descriptor = "()V", line = 366)
    protected final void finalize() throws Throwable {
        field2956++;
        if (this.field2958 != -1) {
            class139.method1044(this.field2958, this.field2957, this.field2947);
            this.field2958 = -1;
            this.field2957 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)I", line = 395)
    public static final int method1283(int arg0, int arg1) {
        field2959++;
        return arg0 == 827 ? arg1 >>> 7 : -2;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(I)V", line = 420)
    public class183(int arg0) {
        int[] var2 = new int[1];
        GL var3 = class281.field4839;
        var3.glGenTextures(1, var2, 0);
        this.field2958 = var2[0];
        this.field2947 = class139.field2330;
        class281.method1953(this.field2958);
        int var4 = class283.field4865[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var3.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var3.glTexParameteri(3553, 10241, 9729);
        var3.glTexParameteri(3553, 10240, 9729);
        class139.field2326 += var6.limit() - this.field2957;
        this.field2957 = var6.limit();
    }
}
