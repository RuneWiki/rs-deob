import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class227 extends class186 {

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
    private final int field3916;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    private final int field3900;

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
    private final int field3915;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
    private int field3911;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "Loh;")
    public static class258 field3906 = class153.method1046("Lade Konfiguration )2 ", 114);

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "[S")
    public static short[] field3910 = new short[500];

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "[I")
    public static int[] field3904 = new int[2];

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "[I")
    public static int[] field3917 = new int[2000];

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "F")
    public static float field3899;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    private int field3901;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "I")
    private int field3907;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
    private int field3909;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "I")
    private int field3914;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "[B")
    private byte[] field3908;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)V", line = 4)
    public final void method1266(byte arg0) {
        field3898++;
        this.field3911 = this.field3915;
        this.field3901 >>= 0x4;
        if (arg0 < 70) {
            field3917 = (int[]) null;
        }
        if (this.field3901 < 0) {
            this.field3901 = 0;
        } else if (this.field3901 > 255) {
            this.field3901 = 255;
        }
        this.method1026(this.field3907++, (byte) this.field3901);
        this.field3901 = 0;
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V", line = 35)
    public static final void method1518(int arg0) {
        if (arg0 > -56) {
            method1520(false);
        }
        class153.field2631.method1161(117);
        class281.field4831.method1161(-122);
        field3905++;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZIIIIFIBI)[[I", line = 49)
    public static final int[][] method1519(boolean arg0, int arg1, int arg2, int arg3, int arg4, float arg5, int arg6, byte arg7, int arg8) {
        field3913++;
        int[][] var9 = new int[arg2][arg3];
        class30 var10 = new class30();
        if (arg7 <= 92) {
            method1519(false, 12, -104, -46, -66, 1.2228129F, 12, (byte) 81, 22);
        }
        var10.field362 = arg8;
        var10.field357 = (int) (arg5 * 4096.0F);
        var10.field348 = arg0;
        var10.field364 = arg1;
        var10.field365 = arg6;
        var10.method223(11135);
        class301.method2115(arg3, arg2, (byte) 69);
        for (int var11 = 0; var11 < arg2; var11++) {
            var10.method222(var11, -102, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(III)V", line = 82)
    public final void method1267(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field3914 = this.field3900 - (arg2 >= 0 ? arg2 : -arg2);
            this.field3914 = this.field3914 * this.field3914 >> 12;
            this.field3901 = this.field3914;
            this.field3909 = 4096;
        } else {
            this.field3909 = this.field3916 * this.field3914 >> 12;
            this.field3914 = this.field3900 - (arg2 < 0 ? -arg2 : arg2);
            if (this.field3909 < 0) {
                this.field3909 = 0;
            } else if (this.field3909 > 4096) {
                this.field3909 = 4096;
            }
            this.field3914 = this.field3914 * this.field3914 >> 12;
            this.field3914 = this.field3914 * this.field3909 >> 12;
            this.field3901 += this.field3914 * this.field3911 >> 12;
            this.field3911 = this.field3915 * this.field3911 >> 12;
        }
        field3912++;
        if (arg0 != 4) {
            this.method1026(1, (byte) -38);
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V", line = 120)
    public static void method1520(boolean arg0) {
        field3917 = null;
        if (arg0) {
            field3906 = (class258) null;
        }
        field3910 = null;
        field3904 = null;
        field3906 = null;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(IIIIIFFF)V", line = 134)
    public class227(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field3916 = (int) (arg7 * 4096.0F);
        this.field3900 = (int) (arg6 * 4096.0F);
        this.field3911 = this.field3915 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V", line = 172)
    public final void method1264(int arg0) {
        field3902++;
        this.field3901 = 0;
        this.field3907 = 0;
        if (arg0 > -90) {
            this.field3911 = 113;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)V", line = 187)
    public void method1026(int arg0, byte arg1) {
        field3903++;
        this.field3908[arg0] = arg1;
    }
}
