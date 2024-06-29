import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class340 {

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "Z")
    public boolean field4898 = false;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public int field4895 = 0;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "Lms;")
    public class448 field4902 = null;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "Z")
    public boolean field4906 = false;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "[S")
    public short[] field4893;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "[S")
    public short[] field4897;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "[S")
    public short[] field4905;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "[S")
    public short[] field4894;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "[S")
    public short[] field4900;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "[B")
    public byte[] field4892;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "[B")
    private static byte[] field4896 = new byte[500];

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "[S")
    private static short[] field4899 = new short[500];

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "[S")
    private static short[] field4904 = new short[500];

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "[S")
    private static short[] field4903 = new short[500];

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "[S")
    private static short[] field4901 = new short[500];

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "[S")
    private static short[] field4907 = new short[500];

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "()V")
    public static void method2222() {
        field4899 = null;
        field4907 = null;
        field4904 = null;
        field4901 = null;
        field4903 = null;
        field4896 = null;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "([BLms;)V")
    public class340(byte[] arg0, class448 arg1) {
        this.field4902 = arg1;
        try {
            class228 var3 = new class228(arg0);
            class228 var4 = new class228(arg0);
            var3.field3029 = 2;
            int var5 = var3.method1348(-114);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field3029 = var3.field3029 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field4902.field6563[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1348(-111);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field4899[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field4907[var6] = var12;
                    } else {
                        field4907[var6] = (short) var4.method1351((byte) -121);
                    }
                    if ((var11 & 0x2) == 0) {
                        field4904[var6] = var12;
                    } else {
                        field4904[var6] = (short) var4.method1351((byte) -117);
                    }
                    if ((var11 & 0x4) == 0) {
                        field4901[var6] = var12;
                    } else {
                        field4901[var6] = (short) var4.method1351((byte) -117);
                    }
                    field4896[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2) {
                        field4907[var6] = (short) (((field4907[var6] & 0xFF) << 3) + (field4907[var6] >> 8 & 0x7));
                        field4904[var6] = (short) (((field4904[var6] & 0xFF) << 3) + (field4904[var6] >> 8 & 0x7));
                        field4901[var6] = (short) (((field4901[var6] & 0xFF) << 3) + (field4901[var6] >> 8 & 0x7));
                        field4907[var6] = (short) (field4907[var6] << 3);
                        field4904[var6] = (short) (field4904[var6] << 3);
                        field4901[var6] = (short) (field4901[var6] << 3);
                    }
                    field4903[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field4903[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field4898 = true;
                    } else if (var10 == 7) {
                        this.field4906 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field3029) {
                throw new RuntimeException();
            }
            this.field4895 = var6;
            this.field4893 = new short[var6];
            this.field4897 = new short[var6];
            this.field4905 = new short[var6];
            this.field4894 = new short[var6];
            this.field4900 = new short[var6];
            this.field4892 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field4893[var13] = field4899[var13];
                this.field4897[var13] = field4907[var13];
                this.field4905[var13] = field4904[var13];
                this.field4894[var13] = field4901[var13];
                this.field4900[var13] = field4903[var13];
                this.field4892[var13] = field4896[var13];
            }
        } catch (Exception var14) {
            this.field4895 = 0;
            this.field4898 = false;
            this.field4906 = false;
        }
    }
}
