import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class340 {

    @OriginalMember(owner = "client!li", name = "h", descriptor = "Lah;")
    public class168 field5075 = null;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public int field5080 = 0;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "Z")
    public boolean field5079 = false;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "Z")
    public boolean field5083 = false;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "[S")
    public short[] field5070;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "[S")
    public short[] field5076;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "[S")
    public short[] field5068;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "[S")
    public short[] field5073;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "[S")
    public short[] field5074;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "[B")
    public byte[] field5081;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "[S")
    private static short[] field5069 = new short[500];

    @OriginalMember(owner = "client!li", name = "d", descriptor = "[S")
    private static short[] field5071 = new short[500];

    @OriginalMember(owner = "client!li", name = "k", descriptor = "[S")
    private static short[] field5078 = new short[500];

    @OriginalMember(owner = "client!li", name = "e", descriptor = "[B")
    private static byte[] field5072 = new byte[500];

    @OriginalMember(owner = "client!li", name = "j", descriptor = "[S")
    private static short[] field5077 = new short[500];

    @OriginalMember(owner = "client!li", name = "o", descriptor = "[S")
    private static short[] field5082 = new short[500];

    @OriginalMember(owner = "client!li", name = "a", descriptor = "()V")
    public static void method2076() {
        field5082 = null;
        field5077 = null;
        field5069 = null;
        field5078 = null;
        field5071 = null;
        field5072 = null;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "([BLah;)V")
    public class340(byte[] arg0, class168 arg1) {
        this.field5075 = arg1;
        try {
            class385 var3 = new class385(arg0);
            class385 var4 = new class385(arg0);
            var3.field5666 = 2;
            int var5 = var3.method2343(255);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field5666 = var3.field5666 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field5075.field2410[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2343(255);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field5082[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field5077[var6] = var12;
                    } else {
                        field5077[var6] = (short) var4.method2342((byte) -46);
                    }
                    if ((var11 & 0x2) == 0) {
                        field5069[var6] = var12;
                    } else {
                        field5069[var6] = (short) var4.method2342((byte) -46);
                    }
                    if ((var11 & 0x4) == 0) {
                        field5078[var6] = var12;
                    } else {
                        field5078[var6] = (short) var4.method2342((byte) -46);
                    }
                    field5072[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2) {
                        field5077[var6] = (short) (((field5077[var6] & 0xFF) << 3) + (field5077[var6] >> 8 & 0x7));
                        field5069[var6] = (short) (((field5069[var6] & 0xFF) << 3) + (field5069[var6] >> 8 & 0x7));
                        field5078[var6] = (short) (((field5078[var6] & 0xFF) << 3) + (field5078[var6] >> 8 & 0x7));
                        field5077[var6] = (short) (field5077[var6] << 3);
                        field5069[var6] = (short) (field5069[var6] << 3);
                        field5078[var6] = (short) (field5078[var6] << 3);
                    }
                    field5071[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field5071[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field5079 = true;
                    } else if (var10 == 7) {
                        this.field5083 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field5666) {
                throw new RuntimeException();
            }
            this.field5080 = var6;
            this.field5070 = new short[var6];
            this.field5076 = new short[var6];
            this.field5068 = new short[var6];
            this.field5073 = new short[var6];
            this.field5074 = new short[var6];
            this.field5081 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field5070[var13] = field5082[var13];
                this.field5076[var13] = field5077[var13];
                this.field5068[var13] = field5069[var13];
                this.field5073[var13] = field5078[var13];
                this.field5074[var13] = field5071[var13];
                this.field5081[var13] = field5072[var13];
            }
        } catch (Exception var14) {
            this.field5080 = 0;
            this.field5079 = false;
            this.field5083 = false;
        }
    }
}
