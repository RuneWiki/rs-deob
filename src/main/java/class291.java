import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class291 {

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "[F")
    public float[] field4888 = new float[4];

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public int field4889;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "Z")
    public boolean field4901;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "Z")
    public boolean field4908;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
    public int field4905;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
    public int field4909;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public int field4902;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public int field4893;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "[S")
    public short[] field4892;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
    public int field4904;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
    private int field4915;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    private int field4898;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "Luf;")
    public static class168 field4890 = class148.method1019(-1720, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field4891 = -1;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "Lej;")
    public static class204 field4883 = new class204(5);

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "J")
    public static long field4913 = 0L;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "Luf;")
    public static class168 field4916 = class148.method1019(-1720, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "F")
    public float field4884;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "F")
    public float field4885;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    private int field4886;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    private int field4894;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    private int field4897;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    private int field4899;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "Lga;")
    public static class145 field4907;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "Lkl;")
    public class220 field4903;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "[Laf;")
    public static class67[] field4896;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "[[[B")
    public static byte[][][] field4912;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "[[[B")
    public static byte[][][] field4914;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 18)
    private final void method1995(int arg0) {
        field4911++;
        if (arg0 >= -1) {
            this.method1996(124, 43, true);
        }
        int var2 = this.field4915;
        if (var2 == 2) {
            this.field4894 = 2048;
            this.field4897 = 0;
            this.field4899 = 2048;
            this.field4886 = 1;
        } else if (var2 == 3) {
            this.field4886 = 1;
            this.field4899 = 4096;
            this.field4897 = 0;
            this.field4894 = 2048;
        } else if (var2 == 4) {
            this.field4894 = 2048;
            this.field4886 = 4;
            this.field4899 = 2048;
            this.field4897 = 0;
        } else if (var2 == 5) {
            this.field4894 = 2048;
            this.field4886 = 4;
            this.field4899 = 8192;
            this.field4897 = 0;
        } else if (var2 == 12) {
            this.field4899 = 2048;
            this.field4897 = 0;
            this.field4886 = 2;
            this.field4894 = 2048;
        } else if (var2 == 13) {
            this.field4897 = 0;
            this.field4886 = 2;
            this.field4899 = 8192;
            this.field4894 = 2048;
        } else if (var2 == 10) {
            this.field4894 = 512;
            this.field4899 = 2048;
            this.field4886 = 3;
            this.field4897 = 1536;
        } else if (var2 == 11) {
            this.field4894 = 512;
            this.field4899 = 4096;
            this.field4886 = 3;
            this.field4897 = 1536;
        } else if (var2 == 6) {
            this.field4897 = 1280;
            this.field4894 = 768;
            this.field4886 = 3;
            this.field4899 = 2048;
        } else if (var2 == 7) {
            this.field4894 = 768;
            this.field4897 = 1280;
            this.field4886 = 3;
            this.field4899 = 4096;
        } else if (var2 == 8) {
            this.field4897 = 1024;
            this.field4899 = 2048;
            this.field4894 = 1024;
            this.field4886 = 3;
        } else if (var2 == 9) {
            this.field4899 = 4096;
            this.field4897 = 1024;
            this.field4886 = 3;
            this.field4894 = 1024;
        } else if (var2 == 14) {
            this.field4897 = 1280;
            this.field4886 = 1;
            this.field4899 = 2048;
            this.field4894 = 768;
        } else if (var2 == 15) {
            this.field4899 = 4096;
            this.field4894 = 512;
            this.field4897 = 1536;
            this.field4886 = 1;
        } else if (var2 == 16) {
            this.field4886 = 1;
            this.field4897 = 1792;
            this.field4899 = 8192;
            this.field4894 = 256;
        } else {
            this.field4897 = 0;
            this.field4899 = 2048;
            this.field4894 = 2048;
            this.field4886 = 0;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIZ)V", line = 230)
    public final void method1996(int arg0, int arg1, boolean arg2) {
        int var4 = this.field4898 + (this.field4899 * arg1 / 50) & 0x7FF;
        int var5 = this.field4886;
        int var6;
        if (var5 == 1) {
            var6 = (class173.field2812[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class115.field1793[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
        } else {
            var6 = 2048;
        }
        field4910++;
        if (arg2) {
            var6 = 2048;
        }
        this.field4884 = (float) ((this.field4894 * var6 >> 11) + this.field4897) / 2048.0F;
        float var7 = this.field4884 / 255.0F;
        this.field4888[1] = (float) class159.method1119(255, this.field4904 >> 8) * var7;
        this.field4888[2] = var7 * (float) class159.method1119(255, this.field4904);
        this.field4888[0] = var7 * (float) (class159.method1119(this.field4904, 16759979) >> 16);
        if (arg0 < 76) {
            method1999((class242) null, -119);
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V", line = 391)
    protected class291() {
        if (class115.field1793 == null) {
            class26.method138(49);
        }
        this.method1995(-115);
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lj;)V", line = 402)
    public class291(class153 arg0) {
        if (class115.field1793 == null) {
            class26.method138(57);
        }
        this.field4889 = arg0.method1042((byte) 109);
        this.field4901 = (this.field4889 & 0x8) != 0;
        this.field4908 = (this.field4889 & 0x10) != 0;
        this.field4889 &= 0x7;
        this.field4905 = arg0.method1069(36);
        this.field4909 = arg0.method1069(38);
        this.field4902 = arg0.method1069(61);
        this.field4893 = arg0.method1042((byte) -128);
        this.method1998((byte) 101);
        this.field4892 = new short[this.field4893 * 2 + 1];
        for (int var2 = 0; var2 < this.field4892.length; var2++) {
            this.field4892[var2] = (short) arg0.method1069(92);
        }
        this.field4904 = class173.field2822[arg0.method1069(74)];
        int var3 = arg0.method1042((byte) 93);
        this.field4915 = var3 & 0x1F;
        this.field4898 = (var3 & 0xE0) << 3;
        this.method1995(-45);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V", line = 316)
    public static void method1997(byte arg0) {
        field4907 = null;
        if (arg0 > -45) {
            method1997((byte) 41);
        }
        field4883 = null;
        field4896 = null;
        field4912 = (byte[][][]) null;
        field4916 = null;
        field4890 = null;
        field4914 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V", line = 342)
    private final void method1998(byte arg0) {
        field4906++;
        if (arg0 > 90) {
            int var2 = (this.field4893 << 7) + 64;
            this.field4885 = 1.0F / (float) (var2 * var2);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lg;I)Z", line = 372)
    public static final boolean method1999(class242 arg0, int arg1) {
        field4887++;
        if (arg1 != 7) {
            field4891 = -41;
        }
        if (arg0.field4115 == 205) {
            class48.field596 = 250;
            return true;
        } else {
            return false;
        }
    }
}
