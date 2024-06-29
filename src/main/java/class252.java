import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class252 {

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "Lwg;")
    public class267 field4267 = null;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Z")
    public boolean field4262 = false;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Z")
    public boolean field4269 = false;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public int field4263 = -1;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "[S")
    public short[] field4259;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "[S")
    public short[] field4265;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "[S")
    public short[] field4258;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "[S")
    public short[] field4268;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "[S")
    public short[] field4261;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "[B")
    public byte[] field4270;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "[S")
    private static short[] field4264 = new short[500];

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "[S")
    private static short[] field4257 = new short[500];

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "[S")
    private static short[] field4266 = new short[500];

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "[S")
    private static short[] field4272 = new short[500];

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "[B")
    private static byte[] field4271 = new byte[500];

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "[S")
    private static short[] field4260 = new short[500];

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()V")
    public static void method1832() {
        field4260 = null;
        field4257 = null;
        field4272 = null;
        field4266 = null;
        field4264 = null;
        field4271 = null;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "([BLwg;)V")
    public class252(byte[] arg0, class267 arg1) {
        this.field4267 = arg1;
        class249 var3 = new class249(arg0);
        class249 var4 = new class249(arg0);
        var3.field4160 = 2;
        int var5 = var3.method1802((byte) 116);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field4160 = var3.field4160 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field4267.field4451[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method1802((byte) -118);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field4260[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field4257[var6] = var13;
                } else {
                    field4257[var6] = (short) var4.method1761(255);
                }
                if ((var12 & 0x2) == 0) {
                    field4272[var6] = var13;
                } else {
                    field4272[var6] = (short) var4.method1761(255);
                }
                if ((var12 & 0x4) == 0) {
                    field4266[var6] = var13;
                } else {
                    field4266[var6] = (short) var4.method1761(255);
                }
                field4271[var6] = (byte) (var12 >>> 3 & 0x3);
                if (var11 == 2) {
                    field4257[var6] = (short) (((field4257[var6] & 0xFF) << 3) + (field4257[var6] >> 8 & 0x7));
                    field4272[var6] = (short) (((field4272[var6] & 0xFF) << 3) + (field4272[var6] >> 8 & 0x7));
                    field4266[var6] = (short) (((field4266[var6] & 0xFF) << 3) + (field4266[var6] >> 8 & 0x7));
                }
                field4264[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field4264[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field4269 = true;
                } else if (var11 == 7) {
                    this.field4262 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field4160) {
            throw new RuntimeException();
        }
        this.field4263 = var6;
        this.field4259 = new short[var6];
        this.field4265 = new short[var6];
        this.field4258 = new short[var6];
        this.field4268 = new short[var6];
        this.field4261 = new short[var6];
        this.field4270 = new byte[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field4259[var10] = field4260[var10];
            this.field4265[var10] = field4257[var10];
            this.field4258[var10] = field4272[var10];
            this.field4268[var10] = field4266[var10];
            this.field4261[var10] = field4264[var10];
            this.field4270[var10] = field4271[var10];
        }
    }
}
