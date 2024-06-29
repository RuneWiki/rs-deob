import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class150 {

    @OriginalMember(owner = "client!id", name = "i", descriptor = "Ldh;")
    public class121 field2321 = null;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Z")
    public boolean field2315 = false;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public int field2324 = -1;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Z")
    public boolean field2314 = false;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "[S")
    public short[] field2317;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "[S")
    public short[] field2313;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "[S")
    public short[] field2320;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "[S")
    public short[] field2318;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "[S")
    public short[] field2326;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "[B")
    public byte[] field2323;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "[S")
    private static short[] field2316 = new short[500];

    @OriginalMember(owner = "client!id", name = "g", descriptor = "[S")
    private static short[] field2319 = new short[500];

    @OriginalMember(owner = "client!id", name = "m", descriptor = "[S")
    private static short[] field2325 = new short[500];

    @OriginalMember(owner = "client!id", name = "j", descriptor = "[S")
    private static short[] field2322 = new short[500];

    @OriginalMember(owner = "client!id", name = "o", descriptor = "[S")
    private static short[] field2327 = new short[500];

    @OriginalMember(owner = "client!id", name = "p", descriptor = "[B")
    private static byte[] field2328 = new byte[500];

    @OriginalMember(owner = "client!id", name = "a", descriptor = "()V")
    public static void method1019() {
        field2319 = null;
        field2322 = null;
        field2327 = null;
        field2316 = null;
        field2325 = null;
        field2328 = null;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "([BLdh;)V")
    public class150(byte[] arg0, class121 arg1) {
        this.field2321 = arg1;
        class37 var3 = new class37(arg0);
        class37 var4 = new class37(arg0);
        var3.field588 = 2;
        int var5 = var3.method333((byte) -59);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field588 = var3.field588 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field2321.field1869[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method333((byte) -59);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field2319[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field2322[var6] = var13;
                } else {
                    field2322[var6] = (short) var4.method282(128);
                }
                if ((var12 & 0x2) == 0) {
                    field2327[var6] = var13;
                } else {
                    field2327[var6] = (short) var4.method282(128);
                }
                if ((var12 & 0x4) == 0) {
                    field2316[var6] = var13;
                } else {
                    field2316[var6] = (short) var4.method282(128);
                }
                field2328[var6] = (byte) (var12 >>> 3 & 0x3);
                if (var11 == 2) {
                    field2322[var6] = (short) (((field2322[var6] & 0xFF) << 3) + (field2322[var6] >> 8 & 0x7));
                    field2327[var6] = (short) (((field2327[var6] & 0xFF) << 3) + (field2327[var6] >> 8 & 0x7));
                    field2316[var6] = (short) (((field2316[var6] & 0xFF) << 3) + (field2316[var6] >> 8 & 0x7));
                }
                field2325[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field2325[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field2314 = true;
                } else if (var11 == 7) {
                    this.field2315 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field588) {
            throw new RuntimeException();
        }
        this.field2324 = var6;
        this.field2317 = new short[var6];
        this.field2313 = new short[var6];
        this.field2320 = new short[var6];
        this.field2318 = new short[var6];
        this.field2326 = new short[var6];
        this.field2323 = new byte[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field2317[var10] = field2319[var10];
            this.field2313[var10] = field2322[var10];
            this.field2320[var10] = field2327[var10];
            this.field2318[var10] = field2316[var10];
            this.field2326[var10] = field2325[var10];
            this.field2323[var10] = field2328[var10];
        }
    }
}
