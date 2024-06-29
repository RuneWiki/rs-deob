import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class292 {

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "[F")
    public float[] field4971 = new float[4];

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public int field4969;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "Z")
    public boolean field4960;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "Z")
    public boolean field4976;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public int field4962;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public int field4959;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public int field4973;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public int field4961;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "[S")
    public short[] field4964;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public int field4966;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    private int field4965;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    private int field4968;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field4956 = 0;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field4963 = 0;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "Lmh;")
    public static class62 field4977 = class201.method1405(true, "Lade)3)3)3");

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    public static int field4974 = 0;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "Lmj;")
    public static class150 field4972 = new class150(0, 0);

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "F")
    public float field4958;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "F")
    public float field4978;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    private int field4951;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    private int field4953;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    private int field4957;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    private int field4967;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Lgm;")
    public class58 field4954;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1980(boolean arg0) {
        field4977 = null;
        if (arg0) {
            field4956 = 65;
        }
        field4972 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)Lji;", line = 22)
    public static final class151 method1981(int arg0) {
        if (arg0 != 9766) {
            return (class151) null;
        }
        field4955++;
        class151 var1 = (class151) class163.field2639.method1742(arg0 - 9511);
        if (var1 != null) {
            var1.method1444((byte) 89);
            var1.method1421(-83);
            return var1;
        }
        class151 var2;
        do {
            var2 = (class151) class127.field2102.method1742(255);
            if (var2 == null) {
                return null;
            }
            if (var2.method1083((byte) 120) > class293.method1985((byte) -71)) {
                return null;
            }
            var2.method1444((byte) 89);
            var2.method1421(61);
        } while ((Long.MIN_VALUE & var2.field3426) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZIZ)V", line = 90)
    public final void method1982(boolean arg0, int arg1, boolean arg2) {
        field4975++;
        int var4 = this.field4957 * arg1 / 50 + this.field4965 & 0x7FF;
        int var5 = this.field4953;
        int var6;
        if (var5 == 1) {
            var6 = (class23.field245[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class276.field4736[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
        } else {
            var6 = 2048;
        }
        if (!arg0) {
            this.method1984(92);
        }
        if (arg2) {
            var6 = 2048;
        }
        this.field4978 = (float) (this.field4951 + (this.field4967 * var6 >> 11)) / 2048.0F;
        float var7 = this.field4978 / 255.0F;
        this.field4971[1] = var7 * (float) (class234.method1648(this.field4966, 65345) >> 8);
        this.field4971[0] = var7 * (float) (class234.method1648(16764156, this.field4966) >> 16);
        this.field4971[2] = var7 * (float) class234.method1648(this.field4966, 255);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V", line = 166)
    private final void method1983(byte arg0) {
        int var2 = (this.field4961 << 7) + 64;
        this.field4958 = 1.0F / (float) (var2 * var2);
        field4952++;
        if (arg0 < 109) {
            field4956 = -56;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V", line = 182)
    private final void method1984(int arg0) {
        if (arg0 != 2048) {
            return;
        }
        int var2 = this.field4968;
        if (var2 == 2) {
            this.field4957 = 2048;
            this.field4953 = 1;
            this.field4967 = 2048;
            this.field4951 = 0;
        } else if (var2 == 3) {
            this.field4951 = 0;
            this.field4953 = 1;
            this.field4967 = 2048;
            this.field4957 = 4096;
        } else if (var2 == 4) {
            this.field4951 = 0;
            this.field4957 = 2048;
            this.field4967 = 2048;
            this.field4953 = 4;
        } else if (var2 == 5) {
            this.field4953 = 4;
            this.field4951 = 0;
            this.field4957 = 8192;
            this.field4967 = 2048;
        } else if (var2 == 12) {
            this.field4951 = 0;
            this.field4967 = 2048;
            this.field4953 = 2;
            this.field4957 = 2048;
        } else if (var2 == 13) {
            this.field4967 = 2048;
            this.field4953 = 2;
            this.field4957 = 8192;
            this.field4951 = 0;
        } else if (var2 == 10) {
            this.field4957 = 2048;
            this.field4951 = 1536;
            this.field4967 = 512;
            this.field4953 = 3;
        } else if (var2 == 11) {
            this.field4967 = 512;
            this.field4951 = 1536;
            this.field4957 = 4096;
            this.field4953 = 3;
        } else if (var2 == 6) {
            this.field4957 = 2048;
            this.field4953 = 3;
            this.field4951 = 1280;
            this.field4967 = 768;
        } else if (var2 == 7) {
            this.field4951 = 1280;
            this.field4953 = 3;
            this.field4967 = 768;
            this.field4957 = 4096;
        } else if (var2 == 8) {
            this.field4957 = 2048;
            this.field4953 = 3;
            this.field4967 = 1024;
            this.field4951 = 1024;
        } else if (var2 == 9) {
            this.field4957 = 4096;
            this.field4951 = 1024;
            this.field4953 = 3;
            this.field4967 = 1024;
        } else if (var2 == 14) {
            this.field4951 = 1280;
            this.field4957 = 2048;
            this.field4967 = 768;
            this.field4953 = 1;
        } else if (var2 == 15) {
            this.field4967 = 512;
            this.field4953 = 1;
            this.field4957 = 4096;
            this.field4951 = 1536;
        } else if (var2 == 16) {
            this.field4953 = 1;
            this.field4957 = 8192;
            this.field4967 = 256;
            this.field4951 = 1792;
        } else {
            this.field4957 = 2048;
            this.field4967 = 2048;
            this.field4953 = 0;
            this.field4951 = 0;
        }
        field4970++;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V", line = 402)
    protected class292() {
        if (class276.field4736 == null) {
            class71.method512(16260);
        }
        this.method1984(2048);
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lmi;)V", line = 412)
    public class292(class92 arg0) {
        if (class276.field4736 == null) {
            class71.method512(16260);
        }
        this.field4969 = arg0.method702(-1);
        this.field4960 = (this.field4969 & 0x10) != 0;
        this.field4976 = (this.field4969 & 0x8) != 0;
        this.field4969 &= 0x7;
        this.field4962 = arg0.method721(35);
        this.field4959 = arg0.method721(42);
        this.field4973 = arg0.method721(81);
        this.field4961 = arg0.method702(-1);
        this.method1983((byte) 119);
        this.field4964 = new short[this.field4961 * 2 + 1];
        for (int var2 = 0; var2 < this.field4964.length; var2++) {
            this.field4964[var2] = (short) arg0.method721(59);
        }
        this.field4966 = class23.field246[arg0.method721(100)];
        int var3 = arg0.method702(-1);
        this.field4965 = var3 & 0xE0 << 3;
        this.field4968 = var3 & 0x1F;
        this.method1984(2048);
    }
}
