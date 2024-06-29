import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class316 {

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    public int field4505 = 0;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "Lgp;")
    public class36 field4514 = null;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "Z")
    public boolean field4516 = false;

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "Z")
    public boolean field4515 = false;

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "Z")
    public boolean field4520 = false;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "[S")
    public short[] field4506;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "[S")
    public short[] field4511;

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "[S")
    public short[] field4519;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "[S")
    public short[] field4504;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "[S")
    public short[] field4513;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "[B")
    public byte[] field4508;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "[S")
    private static short[] field4509 = new short[500];

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "[S")
    private static short[] field4512 = new short[500];

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "[B")
    private static byte[] field4517 = new byte[500];

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "[S")
    private static short[] field4507 = new short[500];

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "[S")
    private static short[] field4510 = new short[500];

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "[S")
    private static short[] field4518 = new short[500];

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "()V")
    public static void method1974() {
        field4509 = null;
        field4510 = null;
        field4518 = null;
        field4507 = null;
        field4512 = null;
        field4517 = null;
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "([BLgp;)V")
    public class316(byte[] arg0, class36 arg1) {
        this.field4514 = arg1;
        try {
            class209 var3 = new class209(arg0);
            class209 var4 = new class209(arg0);
            var3.field3037 = 2;
            int var5 = var3.method1428(32122);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field3037 = var3.field3037 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field4514.field378[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1428(32122);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field4509[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field4510[var6] = var12;
                    } else {
                        field4510[var6] = (short) var4.method1414((byte) 107);
                    }
                    if ((var11 & 0x2) == 0) {
                        field4518[var6] = var12;
                    } else {
                        field4518[var6] = (short) var4.method1414((byte) 117);
                    }
                    if ((var11 & 0x4) == 0) {
                        field4507[var6] = var12;
                    } else {
                        field4507[var6] = (short) var4.method1414((byte) 127);
                    }
                    field4517[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field4510[var6] = (short) (((field4510[var6] & 0xFF) << 3) + (field4510[var6] >> 8 & 0x7));
                        field4518[var6] = (short) (((field4518[var6] & 0xFF) << 3) + (field4518[var6] >> 8 & 0x7));
                        field4507[var6] = (short) (((field4507[var6] & 0xFF) << 3) + (field4507[var6] >> 8 & 0x7));
                        field4510[var6] = (short) (field4510[var6] << 3);
                        field4518[var6] = (short) (field4518[var6] << 3);
                        field4507[var6] = (short) (field4507[var6] << 3);
                    }
                    field4512[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field4512[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field4515 = true;
                    } else if (var10 == 7) {
                        this.field4516 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field4520 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field3037) {
                throw new RuntimeException();
            }
            this.field4505 = var6;
            this.field4506 = new short[var6];
            this.field4511 = new short[var6];
            this.field4519 = new short[var6];
            this.field4504 = new short[var6];
            this.field4513 = new short[var6];
            this.field4508 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field4506[var13] = field4509[var13];
                this.field4511[var13] = field4510[var13];
                this.field4519[var13] = field4518[var13];
                this.field4504[var13] = field4507[var13];
                this.field4513[var13] = field4512[var13];
                this.field4508[var13] = field4517[var13];
            }
        } catch (Exception var14) {
            this.field4505 = 0;
            this.field4515 = false;
            this.field4516 = false;
        }
    }
}
