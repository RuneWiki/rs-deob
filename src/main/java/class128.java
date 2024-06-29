import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public abstract class class128 implements class536 {

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Z")
    private boolean field1968 = false;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public int field1970;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "Lpg;")
    public class333 field1978;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public int field1972;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    private int field1969;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "Z")
    private boolean field1977;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public int field1975;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "Lrb;")
    public static class283 field1974 = new class283(46, 14);

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "F")
    public static float field1973;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)I", line = 8)
    private final int method919(int arg0) {
        if (arg0 <= 26) {
            this.method925(100);
        }
        field1985++;
        int var2 = this.field1978.method2019((byte) 76, this.field1972) * this.field1969;
        return this.field1977 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V", line = 21)
    private final void method920(byte arg0) {
        field1986++;
        this.field1978.method1977(this, true);
        int var2 = 40 % ((-arg0 - 17) / 34);
        if (this.field1968) {
            OpenGL.glTexParameteri(this.field1970, 10241, this.field1977 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field1970, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field1970, 10241, this.field1977 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field1970, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)V", line = 42)
    public static final void method921(int arg0, int arg1) {
        if (arg1 != 0) {
            method929((byte) -12);
        }
        class437.field6310 = new int[arg0];
        class109.field1770 = new int[arg0];
        class325.field4447 = new int[arg0];
        field1980++;
        class278.field3785 = new int[arg0];
        class292.field3953 = new int[arg0];
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)V", line = 61)
    private final void method922(int arg0, byte arg1) {
        field1976++;
        this.field1978.field4742 -= arg0;
        if (arg1 != 41) {
            this.method922(9, (byte) -124);
        }
        this.field1978.field4742 += this.method919(arg1 + 6);
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V", line = 76)
    public final void method923(int arg0) {
        field1983++;
        if (arg0 == -31252 && this.field1975 > 0) {
            this.field1978.method1985(768, this.field1975, this.method919(42));
            this.field1975 = 0;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZI)V", line = 98)
    public final void method924(boolean arg0, int arg1) {
        if (this.field1977 != arg0) {
            int var3 = this.method919(58);
            this.field1977 = true;
            this.method920((byte) 94);
            this.method922(var3, (byte) 41);
        }
        field1982++;
        if (arg1 != 28940) {
            field1973 = -0.51738405F;
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)Z", line = 120)
    public final boolean method925(int arg0) {
        field1971++;
        if (!this.field1978.field4773) {
            if (arg0 != 0) {
                this.method924(false, 107);
            }
            return false;
        }
        int var2 = this.method919(arg0 + 126);
        this.field1978.method1977(this, true);
        OpenGL.glGenerateMipmapEXT(this.field1970);
        this.field1977 = true;
        this.method920((byte) 24);
        this.method922(var2, (byte) 41);
        return true;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)V", line = 144)
    public static final void method926(byte arg0, int arg1) {
        if (arg0 == 33) {
            field1984++;
            class314 var2 = class177.method1213(false, 12, arg1);
            var2.method1811((byte) 86);
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)I", line = 158)
    public final int method927(byte arg0) {
        field1979++;
        if (arg0 != -109) {
            field1973 = 0.64707524F;
        }
        return this.field1975;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZ)V", line = 174)
    public final void method928(int arg0, boolean arg1) {
        if (this.field1968 != arg1) {
            this.field1968 = arg1;
            this.method920((byte) 77);
        }
        if (arg0 <= 94) {
            method926((byte) -36, -77);
        }
        field1967++;
    }

    @OriginalMember(owner = "client!fg", name = "finalize", descriptor = "()V", line = 193)
    protected final void finalize() throws Throwable {
        field1981++;
        this.method923(-31252);
        super.finalize();
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(B)V", line = 202)
    public static void method929(byte arg0) {
        if (arg0 < -124) {
            field1974 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lpg;IIIZ)V", line = 214)
    public class128(class333 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field1970 = arg1;
        this.field1978 = arg0;
        this.field1972 = arg2;
        this.field1969 = arg3;
        this.field1977 = arg4;
        OpenGL.glGenTextures(1, class134.field2047, 0);
        this.field1975 = class134.field2047[0];
        this.method922(0, (byte) 41);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V")
    public abstract void method137(boolean arg0);
}
