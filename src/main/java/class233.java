import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class233 {

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "Z")
    public boolean field4030 = false;

    @OriginalMember(owner = "client!pr", name = "l", descriptor = "I")
    public int field4039 = 0;

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "Z")
    public boolean field4037 = false;

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "Lae;")
    public class191 field4043 = null;

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "Z")
    public boolean field4044 = false;

    @OriginalMember(owner = "client!pr", name = "m", descriptor = "[S")
    public short[] field4040;

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "[S")
    public short[] field4036;

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "[S")
    public short[] field4038;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "[S")
    public short[] field4032;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "[S")
    public short[] field4033;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "[B")
    public byte[] field4028;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "[S")
    private static short[] field4029 = new short[500];

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "[B")
    private static byte[] field4034 = new byte[500];

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "[S")
    private static short[] field4035 = new short[500];

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "[S")
    private static short[] field4031 = new short[500];

    @OriginalMember(owner = "client!pr", name = "n", descriptor = "[S")
    private static short[] field4041 = new short[500];

    @OriginalMember(owner = "client!pr", name = "o", descriptor = "[S")
    private static short[] field4042 = new short[500];

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "()V")
    public static void method1606() {
        field4031 = null;
        field4035 = null;
        field4042 = null;
        field4029 = null;
        field4041 = null;
        field4034 = null;
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "([BLae;)V")
    public class233(byte[] arg0, class191 arg1) {
        this.field4043 = arg1;
        try {
            class23 var3 = new class23(arg0);
            class23 var4 = new class23(arg0);
            var3.field301 = 2;
            int var5 = var3.method126((byte) -108);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field301 = var3.field301 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field4043.field2967[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method126((byte) -74);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field4031[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field4035[var6] = var12;
                    } else {
                        field4035[var6] = (short) var4.method137(-49152);
                    }
                    if ((var11 & 0x2) == 0) {
                        field4042[var6] = var12;
                    } else {
                        field4042[var6] = (short) var4.method137(-49152);
                    }
                    if ((var11 & 0x4) == 0) {
                        field4029[var6] = var12;
                    } else {
                        field4029[var6] = (short) var4.method137(-49152);
                    }
                    field4034[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field4035[var6] = (short) (((field4035[var6] & 0xFF) << 3) + (field4035[var6] >> 8 & 0x7));
                        field4042[var6] = (short) (((field4042[var6] & 0xFF) << 3) + (field4042[var6] >> 8 & 0x7));
                        field4029[var6] = (short) (((field4029[var6] & 0xFF) << 3) + (field4029[var6] >> 8 & 0x7));
                        field4035[var6] = (short) (field4035[var6] << 3);
                        field4042[var6] = (short) (field4042[var6] << 3);
                        field4029[var6] = (short) (field4029[var6] << 3);
                    }
                    field4041[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field4041[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field4037 = true;
                    } else if (var10 == 7) {
                        this.field4030 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field4044 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field301) {
                throw new RuntimeException();
            }
            this.field4039 = var6;
            this.field4040 = new short[var6];
            this.field4036 = new short[var6];
            this.field4038 = new short[var6];
            this.field4032 = new short[var6];
            this.field4033 = new short[var6];
            this.field4028 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field4040[var13] = field4031[var13];
                this.field4036[var13] = field4035[var13];
                this.field4038[var13] = field4042[var13];
                this.field4032[var13] = field4029[var13];
                this.field4033[var13] = field4041[var13];
                this.field4028[var13] = field4034[var13];
            }
        } catch (Exception var14) {
            this.field4039 = 0;
            this.field4037 = false;
            this.field4030 = false;
        }
    }
}
