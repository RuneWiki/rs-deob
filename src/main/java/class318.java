import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class318 {

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "Z")
    public boolean field4877 = false;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "Z")
    public boolean field4875 = false;

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "Z")
    public boolean field4879 = false;

    @OriginalMember(owner = "client!rq", name = "p", descriptor = "Lmd;")
    public class183 field4887 = null;

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
    public int field4881 = 0;

    @OriginalMember(owner = "client!rq", name = "k", descriptor = "[S")
    public short[] field4882;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "[S")
    public short[] field4872;

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "[S")
    public short[] field4880;

    @OriginalMember(owner = "client!rq", name = "l", descriptor = "[S")
    public short[] field4883;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "[S")
    public short[] field4874;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "[B")
    public byte[] field4878;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "[S")
    private static short[] field4873 = new short[500];

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "[B")
    private static byte[] field4876 = new byte[500];

    @OriginalMember(owner = "client!rq", name = "o", descriptor = "[S")
    private static short[] field4886 = new short[500];

    @OriginalMember(owner = "client!rq", name = "n", descriptor = "[S")
    private static short[] field4885 = new short[500];

    @OriginalMember(owner = "client!rq", name = "q", descriptor = "[S")
    private static short[] field4888 = new short[500];

    @OriginalMember(owner = "client!rq", name = "m", descriptor = "[S")
    private static short[] field4884 = new short[500];

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "()V", line = 11)
    public static void method2068() {
        field4884 = null;
        field4886 = null;
        field4873 = null;
        field4885 = null;
        field4888 = null;
        field4876 = null;
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "([BLmd;)V", line = 65)
    public class318(byte[] arg0, class183 arg1) {
        this.field4887 = arg1;
        try {
            class91 var3 = new class91(arg0);
            class91 var4 = new class91(arg0);
            var3.field1292 = 2;
            int var5 = var3.method618((byte) 100);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field1292 = var3.field1292 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field4887.field2591[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method618((byte) 100);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field4884[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field4886[var6] = var12;
                    } else {
                        field4886[var6] = (short) var4.method616((byte) -67);
                    }
                    if ((var11 & 0x2) == 0) {
                        field4873[var6] = var12;
                    } else {
                        field4873[var6] = (short) var4.method616((byte) -67);
                    }
                    if ((var11 & 0x4) == 0) {
                        field4885[var6] = var12;
                    } else {
                        field4885[var6] = (short) var4.method616((byte) -67);
                    }
                    field4876[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field4886[var6] = (short) (((field4886[var6] & 0xFF) << 3) + (field4886[var6] >> 8 & 0x7));
                        field4873[var6] = (short) (((field4873[var6] & 0xFF) << 3) + (field4873[var6] >> 8 & 0x7));
                        field4885[var6] = (short) (((field4885[var6] & 0xFF) << 3) + (field4885[var6] >> 8 & 0x7));
                        field4886[var6] = (short) (field4886[var6] << 3);
                        field4873[var6] = (short) (field4873[var6] << 3);
                        field4885[var6] = (short) (field4885[var6] << 3);
                    }
                    field4888[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field4888[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field4879 = true;
                    } else if (var10 == 7) {
                        this.field4877 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field4875 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field1292) {
                throw new RuntimeException();
            }
            this.field4881 = var6;
            this.field4882 = new short[var6];
            this.field4872 = new short[var6];
            this.field4880 = new short[var6];
            this.field4883 = new short[var6];
            this.field4874 = new short[var6];
            this.field4878 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field4882[var13] = field4884[var13];
                this.field4872[var13] = field4886[var13];
                this.field4880[var13] = field4873[var13];
                this.field4883[var13] = field4885[var13];
                this.field4874[var13] = field4888[var13];
                this.field4878[var13] = field4876[var13];
            }
        } catch (Exception var14) {
            this.field4881 = 0;
            this.field4879 = false;
            this.field4877 = false;
        }
    }
}
