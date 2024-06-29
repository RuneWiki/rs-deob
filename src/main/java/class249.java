import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class249 {

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Z")
    public boolean field4142 = false;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Z")
    public boolean field4136 = false;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public int field4141 = -1;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "Lbd;")
    public class191 field4148 = null;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "[S")
    public short[] field4143;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "[S")
    public short[] field4144;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "[S")
    public short[] field4140;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "[S")
    public short[] field4133;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "[S")
    public short[] field4135;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "[B")
    public byte[] field4137;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "[B")
    private static byte[] field4134 = new byte[500];

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "[S")
    private static short[] field4139 = new short[500];

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "[S")
    private static short[] field4138 = new short[500];

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "[S")
    private static short[] field4146 = new short[500];

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "[S")
    private static short[] field4145 = new short[500];

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "[S")
    private static short[] field4147 = new short[500];

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()V")
    public static void method1783() {
        field4139 = null;
        field4147 = null;
        field4146 = null;
        field4138 = null;
        field4145 = null;
        field4134 = null;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "([BLbd;)V")
    public class249(byte[] arg0, class191 arg1) {
        this.field4148 = arg1;
        class152 var3 = new class152(arg0);
        class152 var4 = new class152(arg0);
        var3.field2511 = 2;
        int var5 = var3.method1111(255);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field2511 = var3.field2511 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field4148.field3084[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method1111(255);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field4139[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field4147[var6] = var13;
                } else {
                    field4147[var6] = (short) var4.method1083(-64);
                }
                if ((var12 & 0x2) == 0) {
                    field4146[var6] = var13;
                } else {
                    field4146[var6] = (short) var4.method1083(-64);
                }
                if ((var12 & 0x4) == 0) {
                    field4138[var6] = var13;
                } else {
                    field4138[var6] = (short) var4.method1083(-64);
                }
                field4134[var6] = (byte) (var12 >>> 3 & 0x3);
                if (var11 == 2) {
                    field4147[var6] = (short) (((field4147[var6] & 0xFF) << 3) + (field4147[var6] >> 8 & 0x7));
                    field4146[var6] = (short) (((field4146[var6] & 0xFF) << 3) + (field4146[var6] >> 8 & 0x7));
                    field4138[var6] = (short) (((field4138[var6] & 0xFF) << 3) + (field4138[var6] >> 8 & 0x7));
                }
                field4145[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field4145[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field4136 = true;
                } else if (var11 == 7) {
                    this.field4142 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field2511) {
            throw new RuntimeException();
        }
        this.field4141 = var6;
        this.field4143 = new short[var6];
        this.field4144 = new short[var6];
        this.field4140 = new short[var6];
        this.field4133 = new short[var6];
        this.field4135 = new short[var6];
        this.field4137 = new byte[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field4143[var10] = field4139[var10];
            this.field4144[var10] = field4147[var10];
            this.field4140[var10] = field4146[var10];
            this.field4133[var10] = field4138[var10];
            this.field4135[var10] = field4145[var10];
            this.field4137[var10] = field4134[var10];
        }
    }
}
