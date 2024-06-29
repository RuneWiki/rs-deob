import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class540 {

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "Z")
    public boolean field7837 = false;

    @OriginalMember(owner = "client!cv", name = "m", descriptor = "Led;")
    public class367 field7843 = null;

    @OriginalMember(owner = "client!cv", name = "q", descriptor = "I")
    public int field7847 = 0;

    @OriginalMember(owner = "client!cv", name = "l", descriptor = "Z")
    public boolean field7842 = false;

    @OriginalMember(owner = "client!cv", name = "p", descriptor = "Z")
    public boolean field7846 = false;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "[S")
    public short[] field7832;

    @OriginalMember(owner = "client!cv", name = "k", descriptor = "[S")
    public short[] field7841;

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "[S")
    public short[] field7836;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "[S")
    public short[] field7831;

    @OriginalMember(owner = "client!cv", name = "j", descriptor = "[S")
    public short[] field7840;

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "[B")
    public byte[] field7833;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "[S")
    private static short[] field7834 = new short[500];

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "[B")
    private static byte[] field7835 = new byte[500];

    @OriginalMember(owner = "client!cv", name = "o", descriptor = "[S")
    private static short[] field7845 = new short[500];

    @OriginalMember(owner = "client!cv", name = "h", descriptor = "[S")
    private static short[] field7838 = new short[500];

    @OriginalMember(owner = "client!cv", name = "n", descriptor = "[S")
    private static short[] field7844 = new short[500];

    @OriginalMember(owner = "client!cv", name = "i", descriptor = "[S")
    private static short[] field7839 = new short[500];

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "()V")
    public static void method3251() {
        field7844 = null;
        field7838 = null;
        field7834 = null;
        field7845 = null;
        field7839 = null;
        field7835 = null;
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "([BLed;)V")
    public class540(byte[] arg0, class367 arg1) {
        this.field7843 = arg1;
        try {
            class479 var3 = new class479(arg0);
            class479 var4 = new class479(arg0);
            var3.method2886(true);
            var3.field6864 += 2;
            int var5 = var3.method2886(true);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field6864 = var3.field6864 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field7843.field5371[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2886(true);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field7844[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field7838[var6] = var12;
                    } else {
                        field7838[var6] = (short) var4.method2925(-64);
                    }
                    if ((var11 & 0x2) == 0) {
                        field7834[var6] = var12;
                    } else {
                        field7834[var6] = (short) var4.method2925(-64);
                    }
                    if ((var11 & 0x4) == 0) {
                        field7845[var6] = var12;
                    } else {
                        field7845[var6] = (short) var4.method2925(-64);
                    }
                    field7835[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field7838[var6] = (short) (field7838[var6] << 2 & 0x3FFF);
                        field7834[var6] = (short) (field7834[var6] << 2 & 0x3FFF);
                        field7845[var6] = (short) (field7845[var6] << 2 & 0x3FFF);
                    }
                    field7839[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field7839[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field7842 = true;
                    } else if (var10 == 7) {
                        this.field7837 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field7846 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field6864) {
                throw new RuntimeException();
            }
            this.field7847 = var6;
            this.field7832 = new short[var6];
            this.field7841 = new short[var6];
            this.field7836 = new short[var6];
            this.field7831 = new short[var6];
            this.field7840 = new short[var6];
            this.field7833 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field7832[var13] = field7844[var13];
                this.field7841[var13] = field7838[var13];
                this.field7836[var13] = field7834[var13];
                this.field7831[var13] = field7845[var13];
                this.field7840[var13] = field7839[var13];
                this.field7833[var13] = field7835[var13];
            }
        } catch (Exception var14) {
            this.field7847 = 0;
            this.field7842 = false;
            this.field7837 = false;
        }
    }
}
