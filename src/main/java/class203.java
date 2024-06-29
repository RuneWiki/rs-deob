import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class203 {

    @OriginalMember(owner = "client!q", name = "h", descriptor = "Z")
    public boolean field2955 = false;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "Lb;")
    public class122 field2962 = null;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Z")
    public boolean field2951 = false;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public int field2963 = 0;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "[S")
    public short[] field2961;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "[S")
    public short[] field2960;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "[S")
    public short[] field2954;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "[S")
    public short[] field2949;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "[S")
    public short[] field2959;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "[B")
    public byte[] field2958;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "[S")
    private static short[] field2952 = new short[500];

    @OriginalMember(owner = "client!q", name = "c", descriptor = "[S")
    private static short[] field2950 = new short[500];

    @OriginalMember(owner = "client!q", name = "i", descriptor = "[S")
    private static short[] field2956 = new short[500];

    @OriginalMember(owner = "client!q", name = "a", descriptor = "[S")
    private static short[] field2948 = new short[500];

    @OriginalMember(owner = "client!q", name = "j", descriptor = "[B")
    private static byte[] field2957 = new byte[500];

    @OriginalMember(owner = "client!q", name = "f", descriptor = "[S")
    private static short[] field2953 = new short[500];

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "([BLb;)V", line = 61)
    public class203(byte[] arg0, class122 arg1) {
        this.field2962 = arg1;
        try {
            class37 var3 = new class37(arg0);
            class37 var4 = new class37(arg0);
            var3.field565 = 2;
            int var5 = var3.method271((byte) 123);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field565 = var3.field565 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field2962.field1934[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method271((byte) 115);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field2952[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field2956[var6] = var12;
                    } else {
                        field2956[var6] = (short) var4.method263(false);
                    }
                    if ((var11 & 0x2) == 0) {
                        field2953[var6] = var12;
                    } else {
                        field2953[var6] = (short) var4.method263(false);
                    }
                    if ((var11 & 0x4) == 0) {
                        field2950[var6] = var12;
                    } else {
                        field2950[var6] = (short) var4.method263(false);
                    }
                    field2957[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2) {
                        field2956[var6] = (short) (((field2956[var6] & 0xFF) << 3) + (field2956[var6] >> 8 & 0x7));
                        field2953[var6] = (short) (((field2953[var6] & 0xFF) << 3) + (field2953[var6] >> 8 & 0x7));
                        field2950[var6] = (short) (((field2950[var6] & 0xFF) << 3) + (field2950[var6] >> 8 & 0x7));
                        field2956[var6] = (short) (field2956[var6] << 3);
                        field2953[var6] = (short) (field2953[var6] << 3);
                        field2950[var6] = (short) (field2950[var6] << 3);
                    }
                    field2948[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field2948[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field2951 = true;
                    } else if (var10 == 7) {
                        this.field2955 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field565) {
                throw new RuntimeException();
            }
            this.field2963 = var6;
            this.field2961 = new short[var6];
            this.field2960 = new short[var6];
            this.field2954 = new short[var6];
            this.field2949 = new short[var6];
            this.field2959 = new short[var6];
            this.field2958 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field2961[var13] = field2952[var13];
                this.field2960[var13] = field2956[var13];
                this.field2954[var13] = field2953[var13];
                this.field2949[var13] = field2950[var13];
                this.field2959[var13] = field2948[var13];
                this.field2958[var13] = field2957[var13];
            }
        } catch (Exception var14) {
            this.field2963 = 0;
            this.field2951 = false;
            this.field2955 = false;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()V", line = 39)
    public static void method1543() {
        field2952 = null;
        field2956 = null;
        field2953 = null;
        field2950 = null;
        field2948 = null;
        field2957 = null;
    }
}
