import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class318 {

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "Z")
    public boolean field4936 = false;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "[F")
    public float[] field4934 = new float[4];

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public int field4937;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "Z")
    public boolean field4933;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "Z")
    public boolean field4958;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public int field4931;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "I")
    public int field4952;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public int field4935;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public int field4941;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "[S")
    public short[] field4950;

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "I")
    public int field4954;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
    public int field4948;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    private int field4940;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "[I")
    public static int[] field4951 = new int[32];

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    public static volatile int field4959 = 0;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "Z")
    public static boolean field4960;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "F")
    public float field4946;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "F")
    public float field4956;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    private int field4939;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    private int field4945;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    private int field4947;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    private int field4949;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "Lgi;")
    public class216 field4944;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V", line = 45)
    private final void method2176(byte arg0) {
        int var2 = this.field4948;
        if (var2 == 2) {
            this.field4949 = 2048;
            this.field4945 = 1;
            this.field4939 = 0;
            this.field4947 = 2048;
        } else if (var2 == 3) {
            this.field4945 = 1;
            this.field4949 = 2048;
            this.field4947 = 4096;
            this.field4939 = 0;
        } else if (var2 == 4) {
            this.field4949 = 2048;
            this.field4939 = 0;
            this.field4947 = 2048;
            this.field4945 = 4;
        } else if (var2 == 5) {
            this.field4945 = 4;
            this.field4949 = 2048;
            this.field4939 = 0;
            this.field4947 = 8192;
        } else if (var2 == 12) {
            this.field4945 = 2;
            this.field4949 = 2048;
            this.field4947 = 2048;
            this.field4939 = 0;
        } else if (var2 == 13) {
            this.field4947 = 8192;
            this.field4949 = 2048;
            this.field4945 = 2;
            this.field4939 = 0;
        } else if (var2 == 10) {
            this.field4939 = 1536;
            this.field4949 = 512;
            this.field4945 = 3;
            this.field4947 = 2048;
        } else if (var2 == 11) {
            this.field4939 = 1536;
            this.field4945 = 3;
            this.field4947 = 4096;
            this.field4949 = 512;
        } else if (var2 == 6) {
            this.field4947 = 2048;
            this.field4939 = 1280;
            this.field4949 = 768;
            this.field4945 = 3;
        } else if (var2 == 7) {
            this.field4939 = 1280;
            this.field4947 = 4096;
            this.field4945 = 3;
            this.field4949 = 768;
        } else if (var2 == 8) {
            this.field4949 = 1024;
            this.field4945 = 3;
            this.field4939 = 1024;
            this.field4947 = 2048;
        } else if (var2 == 9) {
            this.field4939 = 1024;
            this.field4945 = 3;
            this.field4949 = 1024;
            this.field4947 = 4096;
        } else if (var2 == 14) {
            this.field4939 = 1280;
            this.field4947 = 2048;
            this.field4945 = 1;
            this.field4949 = 768;
        } else if (var2 == 15) {
            this.field4939 = 1536;
            this.field4945 = 1;
            this.field4947 = 4096;
            this.field4949 = 512;
        } else if (var2 == 16) {
            this.field4939 = 1792;
            this.field4945 = 1;
            this.field4949 = 256;
            this.field4947 = 8192;
        } else {
            this.field4949 = 2048;
            this.field4939 = 0;
            this.field4945 = 0;
            this.field4947 = 2048;
        }
        if (arg0 != 22) {
            this.method2178(-57, 22, -96, -118, (byte) 80);
        }
        field4942++;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V", line = 212)
    public static final void method2177(int arg0) {
        class22.field237.method1433(30);
        class266.field3983.method1433(30);
        field4938++;
        class79.field1107.method1433(30);
        if (arg0 != 4096) {
            method2182(10, 119);
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V", line = 406)
    protected class318() {
        if (class126.field1989 == null) {
            class95.method759((byte) 101);
        }
        this.method2176((byte) 22);
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lhb;)V", line = 416)
    public class318(class35 arg0) {
        if (class126.field1989 == null) {
            class95.method759((byte) 81);
        }
        this.field4937 = arg0.method273(65280);
        this.field4933 = (this.field4937 & 0x8) != 0;
        this.field4958 = (this.field4937 & 0x10) != 0;
        this.field4937 &= 0x7;
        this.field4931 = arg0.method300(-1394191632);
        this.field4952 = arg0.method300(-1394191632);
        this.field4935 = arg0.method300(-1394191632);
        this.field4941 = arg0.method273(65280);
        this.method2183(124);
        this.field4950 = new short[this.field4941 * 2 + 1];
        for (int var2 = 0; var2 < this.field4950.length; var2++) {
            this.field4950[var2] = (short) arg0.method300(-1394191632);
        }
        this.field4954 = class56.field832[arg0.method300(-1394191632)];
        int var3 = arg0.method273(65280);
        this.field4948 = var3 & 0x1F;
        this.field4940 = var3 & 0xE0 << 3;
        if (this.field4948 != 31) {
            this.method2176((byte) 22);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIB)V", line = 233)
    public final void method2178(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 < 7) {
            this.field4950 = (short[]) null;
        }
        this.field4945 = arg0;
        this.field4939 = arg1;
        field4955++;
        this.field4947 = arg3;
        this.field4949 = arg2;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)V", line = 252)
    public static void method2179(byte arg0) {
        if (arg0 > -76) {
            field4951 = (int[]) null;
        }
        field4951 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIB)I", line = 279)
    public static final int method2180(int arg0, int arg1, byte arg2) {
        int var3 = arg1 - 1 & arg0 >> 31;
        field4930++;
        int var4 = 75 / ((-arg2 - 65) / 58);
        return ((arg0 >>> 31) + arg0) % arg1 + var3;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BIZ)V", line = 290)
    public final void method2181(byte arg0, int arg1, boolean arg2) {
        if (arg0 <= 0) {
            return;
        }
        field4943++;
        int var4 = this.field4947 * arg1 / 50 + this.field4940 & 0x7FF;
        int var5 = this.field4945;
        int var6;
        if (var5 == 1) {
            var6 = (class56.field838[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class126.field1989[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg2) {
            var6 = 2048;
        }
        this.field4946 = (float) ((this.field4949 * var6 >> 11) + this.field4939) / 2048.0F;
        float var7 = this.field4946 / 255.0F;
        this.field4934[0] = var7 * (float) (class142.method1078(this.field4954, 16713309) >> 16);
        this.field4934[1] = var7 * (float) (class142.method1078(this.field4954, 65331) >> 8);
        this.field4934[2] = (float) class142.method1078(this.field4954, 255) * var7;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V", line = 369)
    public static final void method2182(int arg0, int arg1) {
        class299.field4706.method1429((byte) 127, arg1);
        if (arg0 != -1360812026) {
            method2179((byte) -61);
        }
        field4953++;
        class53.field810.method1429((byte) 127, arg1);
        class116.field1815.method1429((byte) 127, arg1);
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4951[var1] = var0 - 1;
            var0 += var0;
        }
        field4960 = false;
        field4961 = -1;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V", line = 390)
    private final void method2183(int arg0) {
        if (arg0 <= 123) {
            this.field4946 = -0.111217454F;
        }
        int var2 = (this.field4941 << 7) + 64;
        field4957++;
        this.field4956 = 1.0F / (float) (var2 * var2);
    }
}
