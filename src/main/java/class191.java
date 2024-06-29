import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class191 {

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "Lki;")
    public class498 field2842 = null;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "Z")
    public boolean field2841 = false;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "Z")
    public boolean field2843 = false;

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "I")
    public int field2848 = 0;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "Z")
    public boolean field2844 = false;

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "[S")
    public short[] field2850;

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "[S")
    public short[] field2845;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "[S")
    public short[] field2840;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "[S")
    public short[] field2847;

    @OriginalMember(owner = "client!tr", name = "q", descriptor = "[S")
    public short[] field2852;

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "[B")
    public byte[] field2849;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "[S")
    private static short[] field2836 = new short[500];

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "[B")
    private static byte[] field2839 = new byte[500];

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "[S")
    private static short[] field2837 = new short[500];

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "[S")
    private static short[] field2846 = new short[500];

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "[S")
    private static short[] field2838 = new short[500];

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "[S")
    private static short[] field2851 = new short[500];

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "()V")
    public static void method1328() {
        field2836 = null;
        field2846 = null;
        field2837 = null;
        field2838 = null;
        field2851 = null;
        field2839 = null;
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "([BLki;)V")
    public class191(byte[] arg0, class498 arg1) {
        this.field2842 = arg1;
        try {
            class145 var3 = new class145(arg0);
            class145 var4 = new class145(arg0);
            var3.field2289 = 2;
            int var5 = var3.method1063((byte) 117);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field2289 = var3.field2289 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field2842.field7350[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1063((byte) 105);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field2836[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field2846[var6] = var12;
                    } else {
                        field2846[var6] = (short) var4.method1107(false);
                    }
                    if ((var11 & 0x2) == 0) {
                        field2837[var6] = var12;
                    } else {
                        field2837[var6] = (short) var4.method1107(false);
                    }
                    if ((var11 & 0x4) == 0) {
                        field2838[var6] = var12;
                    } else {
                        field2838[var6] = (short) var4.method1107(false);
                    }
                    field2839[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field2846[var6] = (short) (((field2846[var6] & 0xFF) << 3) + (field2846[var6] >> 8 & 0x7));
                        field2837[var6] = (short) (((field2837[var6] & 0xFF) << 3) + (field2837[var6] >> 8 & 0x7));
                        field2838[var6] = (short) (((field2838[var6] & 0xFF) << 3) + (field2838[var6] >> 8 & 0x7));
                        field2846[var6] = (short) (field2846[var6] << 3);
                        field2837[var6] = (short) (field2837[var6] << 3);
                        field2838[var6] = (short) (field2838[var6] << 3);
                    }
                    field2851[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field2851[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field2843 = true;
                    } else if (var10 == 7) {
                        this.field2841 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field2844 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field2289) {
                throw new RuntimeException();
            }
            this.field2848 = var6;
            this.field2850 = new short[var6];
            this.field2845 = new short[var6];
            this.field2840 = new short[var6];
            this.field2847 = new short[var6];
            this.field2852 = new short[var6];
            this.field2849 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field2850[var13] = field2836[var13];
                this.field2845[var13] = field2846[var13];
                this.field2840[var13] = field2837[var13];
                this.field2847[var13] = field2838[var13];
                this.field2852[var13] = field2851[var13];
                this.field2849[var13] = field2839[var13];
            }
        } catch (Exception var14) {
            this.field2848 = 0;
            this.field2843 = false;
            this.field2841 = false;
        }
    }
}
