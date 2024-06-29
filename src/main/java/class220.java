import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class220 {

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Z")
    public boolean field3169 = false;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public int field3175 = -1;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Z")
    public boolean field3174 = false;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "Laf;")
    public class345 field3180 = null;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "[S")
    public short[] field3167;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "[S")
    public short[] field3179;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "[S")
    public short[] field3165;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "[S")
    public short[] field3168;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "[S")
    public short[] field3172;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "[B")
    public byte[] field3170;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "[S")
    private static short[] field3166 = new short[500];

    @OriginalMember(owner = "client!a", name = "g", descriptor = "[B")
    private static byte[] field3171 = new byte[500];

    @OriginalMember(owner = "client!a", name = "m", descriptor = "[S")
    private static short[] field3177 = new short[500];

    @OriginalMember(owner = "client!a", name = "i", descriptor = "[S")
    private static short[] field3173 = new short[500];

    @OriginalMember(owner = "client!a", name = "n", descriptor = "[S")
    private static short[] field3178 = new short[500];

    @OriginalMember(owner = "client!a", name = "l", descriptor = "[S")
    private static short[] field3176 = new short[500];

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V", line = 11)
    public static void method1604() {
        field3178 = null;
        field3177 = null;
        field3166 = null;
        field3173 = null;
        field3176 = null;
        field3171 = null;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "([BLaf;)V", line = 60)
    public class220(byte[] arg0, class345 arg1) {
        this.field3180 = arg1;
        class299 var3 = new class299(arg0);
        class299 var4 = new class299(arg0);
        var3.field4351 = 2;
        int var5 = var3.method2096((byte) -122);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field4351 = var3.field4351 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field3180.field5353[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method2096((byte) -122);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field3178[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field3177[var6] = var12;
                } else {
                    field3177[var6] = (short) var4.method2064((byte) 42);
                }
                if ((var11 & 0x2) == 0) {
                    field3166[var6] = var12;
                } else {
                    field3166[var6] = (short) var4.method2064((byte) 42);
                }
                if ((var11 & 0x4) == 0) {
                    field3173[var6] = var12;
                } else {
                    field3173[var6] = (short) var4.method2064((byte) 42);
                }
                field3171[var6] = (byte) (var11 >>> 3 & 0x3);
                if (var10 == 2) {
                    field3177[var6] = (short) (((field3177[var6] & 0xFF) << 3) + (field3177[var6] >> 8 & 0x7));
                    field3166[var6] = (short) (((field3166[var6] & 0xFF) << 3) + (field3166[var6] >> 8 & 0x7));
                    field3173[var6] = (short) (((field3173[var6] & 0xFF) << 3) + (field3173[var6] >> 8 & 0x7));
                }
                field3176[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field3176[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field3169 = true;
                } else if (var10 == 7) {
                    this.field3174 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field4351) {
            throw new RuntimeException();
        }
        this.field3175 = var6;
        this.field3167 = new short[var6];
        this.field3179 = new short[var6];
        this.field3165 = new short[var6];
        this.field3168 = new short[var6];
        this.field3172 = new short[var6];
        this.field3170 = new byte[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field3167[var13] = field3178[var13];
            this.field3179[var13] = field3177[var13];
            this.field3165[var13] = field3166[var13];
            this.field3168[var13] = field3173[var13];
            this.field3172[var13] = field3176[var13];
            this.field3170[var13] = field3171[var13];
        }
    }
}
