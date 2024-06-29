import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class62 {

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "[F")
    public float[] field786 = new float[4];

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "Z")
    public boolean field784 = false;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public int field773;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "Z")
    public boolean field760;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "Z")
    public boolean field768;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public int field764;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public int field758;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    public int field777;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "[S")
    public short[] field775;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public int field771;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    private int field763;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public int field765;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "Z")
    public static boolean field762 = false;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "Ldh;")
    public static class179 field770 = new class179(16);

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "I")
    public static int field785 = -1;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "Lra;")
    public static class336 field780 = new class336();

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "Ljava/lang/String;")
    public static String field789 = "Close";

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "F")
    public float field774;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "F")
    public float field781;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    private int field766;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    private int field778;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
    private int field782;

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "I")
    private int field787;

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "Lwc;")
    public class111 field783;

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "Lbh;")
    public static class288 field790;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Llc;I)V", line = 4)
    public static final void method359(class175 arg0, int arg1) {
        if (arg1 != 4096) {
            method360((byte) 126);
        }
        field761++;
        class340.field5277 = arg0;
        class140.field1963 = class340.field5277.method1197(-96, 16);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V", line = 23)
    public static void method360(byte arg0) {
        field780 = null;
        field790 = null;
        field789 = null;
        if (arg0 != 14) {
            method359((class175) null, 30);
        }
        field770 = null;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V", line = 38)
    private final void method361(byte arg0) {
        if (arg0 == 48) {
            field769++;
            int var2 = (this.field777 << 7) + 64;
            this.field781 = 1.0F / (float) (var2 * var2);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZII)V", line = 50)
    public final void method362(boolean arg0, int arg1, int arg2) {
        field776++;
        int var4 = this.field763 + (this.field782 * arg1 / 50) & 0x7FF;
        int var5 = this.field778;
        int var6;
        if (var5 == 1) {
            var6 = (class215.field3024[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class186.field2692[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 >= 1024 ? 2048 - var4 : var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg2 != 1683129931) {
            return;
        }
        if (arg0) {
            var6 = 2048;
        }
        this.field774 = (float) ((this.field766 * var6 >> 11) + this.field787) / 2048.0F;
        float var7 = this.field774 / 255.0F;
        this.field786[1] = var7 * (float) (class229.method1613(65478, this.field771) >> 8);
        this.field786[2] = (float) class229.method1613(this.field771, 255) * var7;
        this.field786[0] = (float) class229.method1613(this.field771 >> 16, 255) * var7;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V", line = 167)
    private final void method363(boolean arg0) {
        int var2 = this.field765;
        if (var2 == 2) {
            this.field778 = 1;
            this.field782 = 2048;
            this.field766 = 2048;
            this.field787 = 0;
        } else if (var2 == 3) {
            this.field787 = 0;
            this.field766 = 2048;
            this.field778 = 1;
            this.field782 = 4096;
        } else if (var2 == 4) {
            this.field787 = 0;
            this.field766 = 2048;
            this.field782 = 2048;
            this.field778 = 4;
        } else if (var2 == 5) {
            this.field782 = 8192;
            this.field778 = 4;
            this.field787 = 0;
            this.field766 = 2048;
        } else if (var2 == 12) {
            this.field782 = 2048;
            this.field778 = 2;
            this.field766 = 2048;
            this.field787 = 0;
        } else if (var2 == 13) {
            this.field787 = 0;
            this.field778 = 2;
            this.field766 = 2048;
            this.field782 = 8192;
        } else if (var2 == 10) {
            this.field778 = 3;
            this.field787 = 1536;
            this.field782 = 2048;
            this.field766 = 512;
        } else if (var2 == 11) {
            this.field787 = 1536;
            this.field766 = 512;
            this.field782 = 4096;
            this.field778 = 3;
        } else if (var2 == 6) {
            this.field782 = 2048;
            this.field778 = 3;
            this.field787 = 1280;
            this.field766 = 768;
        } else if (var2 == 7) {
            this.field782 = 4096;
            this.field766 = 768;
            this.field778 = 3;
            this.field787 = 1280;
        } else if (var2 == 8) {
            this.field782 = 2048;
            this.field778 = 3;
            this.field766 = 1024;
            this.field787 = 1024;
        } else if (var2 == 9) {
            this.field778 = 3;
            this.field766 = 1024;
            this.field787 = 1024;
            this.field782 = 4096;
        } else if (var2 == 14) {
            this.field787 = 1280;
            this.field778 = 1;
            this.field782 = 2048;
            this.field766 = 768;
        } else if (var2 == 15) {
            this.field787 = 1536;
            this.field766 = 512;
            this.field778 = 1;
            this.field782 = 4096;
        } else if (var2 == 16) {
            this.field782 = 8192;
            this.field766 = 256;
            this.field778 = 1;
            this.field787 = 1792;
        } else {
            this.field782 = 2048;
            this.field766 = 2048;
            this.field778 = 0;
            this.field787 = 0;
        }
        if (arg0) {
            this.field781 = 0.23953372F;
        }
        field767++;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBIII)V", line = 342)
    public final void method364(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        this.field782 = arg3;
        this.field766 = arg2;
        this.field778 = arg0;
        field779++;
        this.field787 = arg4;
        if (arg1 >= -35) {
            this.method364(-96, (byte) 74, 60, -42, 71);
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V", line = 389)
    protected class62() {
        if (class186.field2692 == null) {
            class171.method1124(107);
        }
        this.method363(false);
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lp;)V", line = 400)
    public class62(class107 arg0) {
        if (class186.field2692 == null) {
            class171.method1124(107);
        }
        this.field773 = arg0.method661(-1);
        this.field760 = (this.field773 & 0x10) != 0;
        this.field768 = (this.field773 & 0x8) != 0;
        this.field773 &= 0x7;
        this.field759 = arg0.method624(14612);
        this.field764 = arg0.method624(14612);
        this.field758 = arg0.method624(14612);
        this.field777 = arg0.method661(-1);
        this.method361((byte) 48);
        this.field775 = new short[this.field777 * 2 + 1];
        for (int var2 = 0; var2 < this.field775.length; var2++) {
            this.field775[var2] = (short) arg0.method624(14612);
        }
        this.field771 = class215.field3023[arg0.method624(14612)];
        int var3 = arg0.method661(-1);
        this.field763 = var3 & 0xE0 << 3;
        this.field765 = var3 & 0x1F;
        if (this.field765 != 31) {
            this.method363(false);
        }
    }
}
