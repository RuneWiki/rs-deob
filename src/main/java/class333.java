import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class333 {

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "Lhba;")
    public class639 field4833 = null;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "I")
    public int field4841 = 0;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "Z")
    public boolean field4839 = false;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "Z")
    public boolean field4843 = false;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "Z")
    public boolean field4847 = false;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "[S")
    public short[] field4845;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "[S")
    public short[] field4831;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "[S")
    public short[] field4846;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "[S")
    public short[] field4836;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "[S")
    public short[] field4834;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "[B")
    public byte[] field4844;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "[B")
    private static byte[] field4832 = new byte[500];

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "[S")
    private static short[] field4835 = new short[500];

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "[S")
    private static short[] field4838 = new short[500];

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "[S")
    private static short[] field4837 = new short[500];

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "[S")
    private static short[] field4842 = new short[500];

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "[S")
    private static short[] field4840 = new short[500];

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "()V", line = 8)
    public static void method2042() {
        field4840 = null;
        field4838 = null;
        field4842 = null;
        field4835 = null;
        field4837 = null;
        field4832 = null;
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "([BLhba;)V", line = 65)
    public class333(byte[] arg0, class639 arg1) {
        this.field4833 = arg1;
        try {
            class540 var3 = new class540(arg0);
            class540 var4 = new class540(arg0);
            var3.method3115(29871);
            var3.field7956 += 2;
            int var5 = var3.method3115(29871);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field7956 = var3.field7956 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field4833.field9175[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method3115(29871);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field4840[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field4838[var6] = var12;
                    } else {
                        field4838[var6] = (short) var4.method3158((byte) -110);
                    }
                    if ((var11 & 0x2) == 0) {
                        field4842[var6] = var12;
                    } else {
                        field4842[var6] = (short) var4.method3158((byte) -106);
                    }
                    if ((var11 & 0x4) == 0) {
                        field4835[var6] = var12;
                    } else {
                        field4835[var6] = (short) var4.method3158((byte) -113);
                    }
                    field4832[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field4838[var6] = (short) (field4838[var6] << 2 & 0x3FFF);
                        field4842[var6] = (short) (field4842[var6] << 2 & 0x3FFF);
                        field4835[var6] = (short) (field4835[var6] << 2 & 0x3FFF);
                    }
                    field4837[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field4837[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field4847 = true;
                    } else if (var10 == 7) {
                        this.field4843 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field4839 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field7956) {
                throw new RuntimeException();
            }
            this.field4841 = var6;
            this.field4845 = new short[var6];
            this.field4831 = new short[var6];
            this.field4846 = new short[var6];
            this.field4836 = new short[var6];
            this.field4834 = new short[var6];
            this.field4844 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field4845[var13] = field4840[var13];
                this.field4831[var13] = field4838[var13];
                this.field4846[var13] = field4842[var13];
                this.field4836[var13] = field4835[var13];
                this.field4834[var13] = field4837[var13];
                this.field4844[var13] = field4832[var13];
            }
        } catch (Exception var14) {
            this.field4841 = 0;
            this.field4847 = false;
            this.field4843 = false;
        }
    }
}
