import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class116 {

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public int field2052 = -1;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "Lqd;")
    public class3 field2056 = null;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "Z")
    public boolean field2060 = false;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "Z")
    public boolean field2047 = false;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "[S")
    public short[] field2055;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "[S")
    public short[] field2051;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "[S")
    public short[] field2058;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "[S")
    public short[] field2054;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "[S")
    public short[] field2059;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "[B")
    public byte[] field2049;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "[S")
    private static short[] field2046 = new short[500];

    @OriginalMember(owner = "client!m", name = "d", descriptor = "[S")
    private static short[] field2048 = new short[500];

    @OriginalMember(owner = "client!m", name = "a", descriptor = "[S")
    private static short[] field2045 = new short[500];

    @OriginalMember(owner = "client!m", name = "f", descriptor = "[B")
    private static byte[] field2050 = new byte[500];

    @OriginalMember(owner = "client!m", name = "i", descriptor = "[S")
    private static short[] field2053 = new short[500];

    @OriginalMember(owner = "client!m", name = "m", descriptor = "[S")
    private static short[] field2057 = new short[500];

    @OriginalMember(owner = "client!m", name = "a", descriptor = "()V")
    public static void method861() {
        field2057 = null;
        field2045 = null;
        field2046 = null;
        field2048 = null;
        field2053 = null;
        field2050 = null;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "([BLqd;)V")
    public class116(byte[] arg0, class3 arg1) {
        this.field2056 = arg1;
        class280 var3 = new class280(arg0);
        class280 var4 = new class280(arg0);
        var3.field5027 = 2;
        int var5 = var3.method1907(16832);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field5027 = var3.field5027 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field2056.field29[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method1907(16832);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field2057[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field2045[var6] = var13;
                } else {
                    field2045[var6] = (short) var4.method1880(-114);
                }
                if ((var12 & 0x2) == 0) {
                    field2046[var6] = var13;
                } else {
                    field2046[var6] = (short) var4.method1880(17);
                }
                if ((var12 & 0x4) == 0) {
                    field2048[var6] = var13;
                } else {
                    field2048[var6] = (short) var4.method1880(-119);
                }
                field2050[var6] = (byte) (var12 >>> 3 & 0x3);
                if (var11 == 2) {
                    field2045[var6] = (short) (((field2045[var6] & 0xFF) << 3) + (field2045[var6] >> 8 & 0x7));
                    field2046[var6] = (short) (((field2046[var6] & 0xFF) << 3) + (field2046[var6] >> 8 & 0x7));
                    field2048[var6] = (short) (((field2048[var6] & 0xFF) << 3) + (field2048[var6] >> 8 & 0x7));
                }
                field2053[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field2053[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field2047 = true;
                } else if (var11 == 7) {
                    this.field2060 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field5027) {
            throw new RuntimeException();
        }
        this.field2052 = var6;
        this.field2055 = new short[var6];
        this.field2051 = new short[var6];
        this.field2058 = new short[var6];
        this.field2054 = new short[var6];
        this.field2059 = new short[var6];
        this.field2049 = new byte[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field2055[var10] = field2057[var10];
            this.field2051[var10] = field2045[var10];
            this.field2058[var10] = field2046[var10];
            this.field2054[var10] = field2048[var10];
            this.field2059[var10] = field2053[var10];
            this.field2049[var10] = field2050[var10];
        }
    }
}
