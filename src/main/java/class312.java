import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class312 {

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Z")
    public boolean field4944 = false;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Z")
    public boolean field4936 = false;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Lpg;")
    public class222 field4945 = null;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public int field4950 = -1;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "[S")
    public short[] field4948;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "[S")
    public short[] field4942;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "[S")
    public short[] field4938;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "[S")
    public short[] field4935;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "[S")
    public short[] field4943;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "[B")
    public byte[] field4940;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "[S")
    private static short[] field4937 = new short[500];

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "[B")
    private static byte[] field4939 = new byte[500];

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "[S")
    private static short[] field4946 = new short[500];

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "[S")
    private static short[] field4941 = new short[500];

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "[S")
    private static short[] field4947 = new short[500];

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "[S")
    private static short[] field4949 = new short[500];

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V", line = 8)
    public static void method2154() {
        field4947 = null;
        field4941 = null;
        field4949 = null;
        field4946 = null;
        field4937 = null;
        field4939 = null;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "([BLpg;)V", line = 60)
    public class312(byte[] arg0, class222 arg1) {
        this.field4945 = arg1;
        class336 var3 = new class336(arg0);
        class336 var4 = new class336(arg0);
        var3.field5353 = 2;
        int var5 = var3.method2364(-9069);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field5353 = var3.field5353 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field4945.field3697[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method2364(-9069);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field4947[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field4941[var6] = var12;
                } else {
                    field4941[var6] = (short) var4.method2321((byte) -62);
                }
                if ((var11 & 0x2) == 0) {
                    field4949[var6] = var12;
                } else {
                    field4949[var6] = (short) var4.method2321((byte) -62);
                }
                if ((var11 & 0x4) == 0) {
                    field4946[var6] = var12;
                } else {
                    field4946[var6] = (short) var4.method2321((byte) -62);
                }
                field4939[var6] = (byte) (var11 >>> 3 & 0x3);
                if (var10 == 2) {
                    field4941[var6] = (short) (((field4941[var6] & 0xFF) << 3) + (field4941[var6] >> 8 & 0x7));
                    field4949[var6] = (short) (((field4949[var6] & 0xFF) << 3) + (field4949[var6] >> 8 & 0x7));
                    field4946[var6] = (short) (((field4946[var6] & 0xFF) << 3) + (field4946[var6] >> 8 & 0x7));
                }
                field4937[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field4937[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field4936 = true;
                } else if (var10 == 7) {
                    this.field4944 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field5353) {
            throw new RuntimeException();
        }
        this.field4950 = var6;
        this.field4948 = new short[var6];
        this.field4942 = new short[var6];
        this.field4938 = new short[var6];
        this.field4935 = new short[var6];
        this.field4943 = new short[var6];
        this.field4940 = new byte[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field4948[var13] = field4947[var13];
            this.field4942[var13] = field4941[var13];
            this.field4938[var13] = field4949[var13];
            this.field4935[var13] = field4946[var13];
            this.field4943[var13] = field4937[var13];
            this.field4940[var13] = field4939[var13];
        }
    }
}
