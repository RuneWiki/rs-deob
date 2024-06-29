import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class180 {

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public int field2899 = -1;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "Ldj;")
    public class343 field2900 = null;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "Z")
    public boolean field2910 = false;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "Z")
    public boolean field2914 = false;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "[S")
    public short[] field2909;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "[S")
    public short[] field2913;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "[S")
    public short[] field2912;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "[S")
    public short[] field2908;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "[S")
    public short[] field2905;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "[B")
    public byte[] field2906;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "[B")
    private static byte[] field2904 = new byte[500];

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "[S")
    private static short[] field2903 = new short[500];

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "[S")
    private static short[] field2902 = new short[500];

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "[S")
    private static short[] field2901 = new short[500];

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "[S")
    private static short[] field2911 = new short[500];

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "[S")
    private static short[] field2907 = new short[500];

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "()V", line = 9)
    public static void method1247() {
        field2903 = null;
        field2907 = null;
        field2911 = null;
        field2901 = null;
        field2902 = null;
        field2904 = null;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "([BLdj;)V", line = 60)
    public class180(byte[] arg0, class343 arg1) {
        this.field2900 = arg1;
        class192 var3 = new class192(arg0);
        class192 var4 = new class192(arg0);
        var3.field3129 = 2;
        int var5 = var3.method1399(-1172389784);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field3129 = var3.field3129 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field2900.field5355[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method1399(-1172389784);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field2903[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field2907[var6] = var12;
                } else {
                    field2907[var6] = (short) var4.method1402(-21420);
                }
                if ((var11 & 0x2) == 0) {
                    field2911[var6] = var12;
                } else {
                    field2911[var6] = (short) var4.method1402(-21420);
                }
                if ((var11 & 0x4) == 0) {
                    field2901[var6] = var12;
                } else {
                    field2901[var6] = (short) var4.method1402(-21420);
                }
                field2904[var6] = (byte) (var11 >>> 3 & 0x3);
                if (var10 == 2) {
                    field2907[var6] = (short) (((field2907[var6] & 0xFF) << 3) + (field2907[var6] >> 8 & 0x7));
                    field2911[var6] = (short) (((field2911[var6] & 0xFF) << 3) + (field2911[var6] >> 8 & 0x7));
                    field2901[var6] = (short) (((field2901[var6] & 0xFF) << 3) + (field2901[var6] >> 8 & 0x7));
                }
                field2902[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field2902[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field2914 = true;
                } else if (var10 == 7) {
                    this.field2910 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field3129) {
            throw new RuntimeException();
        }
        this.field2899 = var6;
        this.field2909 = new short[var6];
        this.field2913 = new short[var6];
        this.field2912 = new short[var6];
        this.field2908 = new short[var6];
        this.field2905 = new short[var6];
        this.field2906 = new byte[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field2909[var13] = field2903[var13];
            this.field2913[var13] = field2907[var13];
            this.field2912[var13] = field2911[var13];
            this.field2908[var13] = field2901[var13];
            this.field2905[var13] = field2902[var13];
            this.field2906[var13] = field2904[var13];
        }
    }
}
