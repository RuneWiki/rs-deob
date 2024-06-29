import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class46 {

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "[F")
    public float[] field682 = new float[4];

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "Z")
    public boolean field666;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "Z")
    public boolean field676;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
    public int field678;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
    public int field674;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "I")
    public int field683;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public int field670;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "[S")
    public short[] field668;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public int field662;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    private int field672;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    private int field659;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "Lsf;")
    public static class108 field664 = class140.method973(255, "null");

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "Lsf;")
    private static class108 field663 = class140.method973(255, "Unable to find ");

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field660 = 0;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "Z")
    public static boolean field673 = false;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "[S")
    public static short[] field677 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "Lsf;")
    public static class108 field684 = class140.method973(255, "Ausw-=hlen");

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "Lsf;")
    public static class108 field686 = class140.method973(255, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "Lsf;")
    public static class108 field690 = class140.method973(255, "Chargement des fichiers config )2 ");

    @OriginalMember(owner = "client!fk", name = "F", descriptor = "Lsf;")
    public static class108 field688 = field663;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "F")
    public float field657;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "F")
    public float field658;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
    private int field675;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "I")
    private int field679;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
    private int field681;

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "I")
    private int field685;

    @OriginalMember(owner = "client!fk", name = "E", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!fk", name = "H", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "J")
    public static long field661;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "Lsb;")
    public class111 field680;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V", line = 6)
    public static final void method326(byte arg0) {
        field667++;
        class187.method1342((byte) -96, 5);
        if (arg0 <= 72) {
            field660 = 69;
        }
        class171.method1190(-6464, 5);
        class116.method829(5, -120);
        class184.method1329(5, -113);
        class98.method668(0, 5);
        class17.method115(5, 3);
        class86.method594(4, 5);
        class73.method487(5, 16711680);
        class290.method2074(-20076, 5);
        class157.method1098(5, 0);
        class210.method1454((byte) 72, 5);
        class66.method451(50, (byte) 108);
        class126.method870(5, 2047);
        class299.method2109(5, (byte) 26);
        class293.field5122.method637(5, 115);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V", line = 35)
    private final void method327(byte arg0) {
        if (arg0 != -107) {
            method330((byte) -113);
        }
        field669++;
        int var2 = this.field659;
        if (var2 == 2) {
            this.field679 = 1;
            this.field685 = 2048;
            this.field681 = 0;
            this.field675 = 2048;
        } else if (var2 == 3) {
            this.field681 = 0;
            this.field685 = 2048;
            this.field675 = 4096;
            this.field679 = 1;
        } else if (var2 == 4) {
            this.field685 = 2048;
            this.field679 = 4;
            this.field681 = 0;
            this.field675 = 2048;
        } else if (var2 == 5) {
            this.field681 = 0;
            this.field685 = 2048;
            this.field675 = 8192;
            this.field679 = 4;
        } else if (var2 == 12) {
            this.field675 = 2048;
            this.field681 = 0;
            this.field679 = 2;
            this.field685 = 2048;
        } else if (var2 == 13) {
            this.field681 = 0;
            this.field685 = 2048;
            this.field679 = 2;
            this.field675 = 8192;
        } else if (var2 == 10) {
            this.field685 = 512;
            this.field681 = 1536;
            this.field675 = 2048;
            this.field679 = 3;
        } else if (var2 == 11) {
            this.field681 = 1536;
            this.field679 = 3;
            this.field675 = 4096;
            this.field685 = 512;
        } else if (var2 == 6) {
            this.field675 = 2048;
            this.field685 = 768;
            this.field681 = 1280;
            this.field679 = 3;
        } else if (var2 == 7) {
            this.field681 = 1280;
            this.field679 = 3;
            this.field675 = 4096;
            this.field685 = 768;
        } else if (var2 == 8) {
            this.field685 = 1024;
            this.field675 = 2048;
            this.field679 = 3;
            this.field681 = 1024;
        } else if (var2 == 9) {
            this.field681 = 1024;
            this.field685 = 1024;
            this.field679 = 3;
            this.field675 = 4096;
        } else if (var2 == 14) {
            this.field675 = 2048;
            this.field679 = 1;
            this.field685 = 768;
            this.field681 = 1280;
        } else if (var2 == 15) {
            this.field681 = 1536;
            this.field679 = 1;
            this.field685 = 512;
            this.field675 = 4096;
        } else if (var2 == 16) {
            this.field679 = 1;
            this.field681 = 1792;
            this.field675 = 8192;
            this.field685 = 256;
        } else {
            this.field685 = 2048;
            this.field681 = 0;
            this.field679 = 0;
            this.field675 = 2048;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V", line = 236)
    private final void method328(boolean arg0) {
        field687++;
        if (!arg0) {
            int var2 = (this.field670 << 7) + 64;
            this.field657 = 1.0F / (float) (var2 * var2);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IZB)V", line = 280)
    public final void method329(int arg0, boolean arg1, byte arg2) {
        field665++;
        int var4 = this.field672 + (this.field675 * arg0 / 50) & 0x7FF;
        int var5 = this.field679;
        int var6;
        if (var5 == 1) {
            var6 = (class263.field4653[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class62.field991[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg1) {
            var6 = 2048;
        }
        if (arg2 != 19) {
            this.method329(-14, false, (byte) -41);
        }
        this.field658 = (float) ((this.field685 * var6 >> 11) + this.field681) / 2048.0F;
        float var7 = this.field658 / 255.0F;
        this.field682[0] = (float) (class162.method1118(16726019, this.field662) >> 16) * var7;
        this.field682[2] = (float) class162.method1118(255, this.field662) * var7;
        this.field682[1] = var7 * (float) (class162.method1118(65459, this.field662) >> 8);
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)V", line = 357)
    public static void method330(byte arg0) {
        field686 = null;
        field684 = null;
        field688 = null;
        if (arg0 == 125) {
            field663 = null;
            field690 = null;
            field677 = null;
            field664 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V", line = 400)
    protected class46() {
        if (class62.field991 == null) {
            class157.method1095(1);
        }
        this.method327((byte) -107);
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lrm;)V", line = 414)
    public class46(class249 arg0) {
        if (class62.field991 == null) {
            class157.method1095(1);
        }
        this.field671 = arg0.method1731(true);
        this.field666 = (this.field671 & 0x10) != 0;
        this.field676 = (this.field671 & 0x8) != 0;
        this.field671 &= 0x7;
        this.field678 = arg0.method1712(-1);
        this.field674 = arg0.method1712(-1);
        this.field683 = arg0.method1712(-1);
        this.field670 = arg0.method1731(true);
        this.method328(false);
        this.field668 = new short[this.field670 * 2 + 1];
        for (int var2 = 0; var2 < this.field668.length; var2++) {
            this.field668[var2] = (short) arg0.method1712(-1);
        }
        this.field662 = class263.field4657[arg0.method1712(-1)];
        int var3 = arg0.method1731(true);
        this.field672 = var3 & 0xE0 << 3;
        this.field659 = var3 & 0x1F;
        this.method327((byte) -107);
    }
}
