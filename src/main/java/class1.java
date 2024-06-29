import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class1 {

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "[F")
    public float[] field4 = new float[4];

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public int field11;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "Z")
    public boolean field19;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "Z")
    public boolean field6;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public int field1;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    public int field16;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public int field13;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public int field14;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "[S")
    public short[] field24;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public int field3;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    private int field8;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    private int field15;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "Lve;")
    public static class255 field20 = class87.method607(107, "leuchten1:");

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "Lve;")
    public static class255 field9 = class87.method607(67, "::rebuild");

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "Lve;")
    private static class255 field17 = class87.method607(48, "Loading world list data");

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "Lve;")
    public static class255 field26 = field17;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "F")
    public float field2;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "F")
    public float field21;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    private int field18;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
    private int field22;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
    private int field23;

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    private int field5;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "Laa;")
    public class8 field10;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V", line = 14)
    private final void method1(byte arg0) {
        field25++;
        int var2 = (this.field14 << 7) + 64;
        int var3 = -90 / ((65 - arg0) / 42);
        this.field2 = 1.0F / (float) (var2 * var2);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZII)V", line = 27)
    public final void method2(boolean arg0, int arg1, int arg2) {
        field12++;
        int var4 = this.field5 * arg2 / 50 + this.field15 & 0x7FF;
        int var5 = this.field22;
        int var6;
        if (var5 == 1) {
            var6 = (class283.field4877[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class259.field4397[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg0) {
            var6 = 2048;
        }
        this.field21 = (float) (this.field23 + (this.field18 * var6 >> 11)) / 2048.0F;
        float var7 = this.field21 / 255.0F;
        this.field4[2] = var7 * (float) class154.method1134(255, this.field3);
        this.field4[0] = (float) (class154.method1134(this.field3, 16731399) >> 16) * var7;
        this.field4[arg1] = (float) class154.method1134(255, this.field3 >> 8) * var7;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V", line = 120)
    private final void method3(byte arg0) {
        field7++;
        int var2 = -17 % ((57 - arg0) / 46);
        int var3 = this.field8;
        if (var3 == 2) {
            this.field23 = 0;
            this.field18 = 2048;
            this.field22 = 1;
            this.field5 = 2048;
        } else if (var3 == 3) {
            this.field5 = 4096;
            this.field18 = 2048;
            this.field22 = 1;
            this.field23 = 0;
        } else if (var3 == 4) {
            this.field22 = 4;
            this.field23 = 0;
            this.field18 = 2048;
            this.field5 = 2048;
        } else if (var3 == 5) {
            this.field22 = 4;
            this.field5 = 8192;
            this.field18 = 2048;
            this.field23 = 0;
        } else if (var3 == 12) {
            this.field23 = 0;
            this.field22 = 2;
            this.field5 = 2048;
            this.field18 = 2048;
        } else if (var3 == 13) {
            this.field18 = 2048;
            this.field5 = 8192;
            this.field22 = 2;
            this.field23 = 0;
        } else if (var3 == 10) {
            this.field18 = 512;
            this.field5 = 2048;
            this.field23 = 1536;
            this.field22 = 3;
        } else if (var3 == 11) {
            this.field18 = 512;
            this.field23 = 1536;
            this.field5 = 4096;
            this.field22 = 3;
        } else if (var3 == 6) {
            this.field5 = 2048;
            this.field22 = 3;
            this.field18 = 768;
            this.field23 = 1280;
        } else if (var3 == 7) {
            this.field18 = 768;
            this.field23 = 1280;
            this.field22 = 3;
            this.field5 = 4096;
        } else if (var3 == 8) {
            this.field5 = 2048;
            this.field18 = 1024;
            this.field23 = 1024;
            this.field22 = 3;
        } else if (var3 == 9) {
            this.field5 = 4096;
            this.field18 = 1024;
            this.field22 = 3;
            this.field23 = 1024;
        } else if (var3 == 14) {
            this.field22 = 1;
            this.field18 = 768;
            this.field23 = 1280;
            this.field5 = 2048;
        } else if (var3 == 15) {
            this.field23 = 1536;
            this.field5 = 4096;
            this.field18 = 512;
            this.field22 = 1;
        } else if (var3 == 16) {
            this.field5 = 8192;
            this.field18 = 256;
            this.field23 = 1792;
            this.field22 = 1;
        } else {
            this.field22 = 0;
            this.field23 = 0;
            this.field18 = 2048;
            this.field5 = 2048;
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V", line = 357)
    protected class1() {
        if (class259.field4397 == null) {
            class275.method1927(-113);
        }
        this.method3((byte) -9);
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lpb;)V", line = 375)
    public class1(class70 arg0) {
        if (class259.field4397 == null) {
            class275.method1927(-107);
        }
        this.field11 = arg0.method481(0);
        this.field19 = (this.field11 & 0x8) != 0;
        this.field6 = (this.field11 & 0x10) != 0;
        this.field11 &= 0x7;
        this.field1 = arg0.method423(255);
        this.field16 = arg0.method423(255);
        this.field13 = arg0.method423(255);
        this.field14 = arg0.method481(0);
        this.method1((byte) -62);
        this.field24 = new short[this.field14 * 2 + 1];
        for (int var2 = 0; var2 < this.field24.length; var2++) {
            this.field24[var2] = (short) arg0.method423(255);
        }
        this.field3 = class283.field4865[arg0.method423(255)];
        int var3 = arg0.method481(0);
        this.field8 = var3 & 0x1F;
        this.field15 = var3 & 0xE0 << 3;
        this.method3((byte) -119);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 332)
    public static void method4(int arg0) {
        field26 = null;
        field20 = null;
        if (arg0 != 768) {
            field9 = (class255) null;
        }
        field17 = null;
        field9 = null;
    }
}
