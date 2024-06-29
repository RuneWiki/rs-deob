import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class148 {

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public int field2557 = -1;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Z")
    public boolean field2550 = false;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "Z")
    public boolean field2562 = false;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Lce;")
    public class216 field2561 = null;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "[S")
    public short[] field2564;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "[S")
    public short[] field2552;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "[S")
    public short[] field2549;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "[S")
    public short[] field2559;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "[S")
    public short[] field2556;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "[B")
    public byte[] field2554;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "[S")
    private static short[] field2558 = new short[500];

    @OriginalMember(owner = "client!id", name = "e", descriptor = "[S")
    private static short[] field2553 = new short[500];

    @OriginalMember(owner = "client!id", name = "l", descriptor = "[S")
    private static short[] field2560 = new short[500];

    @OriginalMember(owner = "client!id", name = "c", descriptor = "[B")
    private static byte[] field2551 = new byte[500];

    @OriginalMember(owner = "client!id", name = "g", descriptor = "[S")
    private static short[] field2555 = new short[500];

    @OriginalMember(owner = "client!id", name = "o", descriptor = "[S")
    private static short[] field2563 = new short[500];

    @OriginalMember(owner = "client!id", name = "a", descriptor = "()V")
    public static void method1031() {
        field2553 = null;
        field2560 = null;
        field2558 = null;
        field2555 = null;
        field2563 = null;
        field2551 = null;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "([BLce;)V")
    public class148(byte[] arg0, class216 arg1) {
        this.field2561 = arg1;
        class149 var3 = new class149(arg0);
        class149 var4 = new class149(arg0);
        var3.field2593 = 2;
        int var5 = var3.method1045((byte) -76);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field2593 = var3.field2593 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field2561.field3838[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method1045((byte) 103);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field2553[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field2560[var6] = var13;
                } else {
                    field2560[var6] = (short) var4.method1057((byte) 56);
                }
                if ((var12 & 0x2) == 0) {
                    field2558[var6] = var13;
                } else {
                    field2558[var6] = (short) var4.method1057((byte) 56);
                }
                if ((var12 & 0x4) == 0) {
                    field2555[var6] = var13;
                } else {
                    field2555[var6] = (short) var4.method1057((byte) 56);
                }
                field2551[var6] = (byte) (var12 >>> 3 & 0x3);
                if (var11 == 2) {
                    field2560[var6] = (short) (((field2560[var6] & 0xFF) << 3) + (field2560[var6] >> 8 & 0x7));
                    field2558[var6] = (short) (((field2558[var6] & 0xFF) << 3) + (field2558[var6] >> 8 & 0x7));
                    field2555[var6] = (short) (((field2555[var6] & 0xFF) << 3) + (field2555[var6] >> 8 & 0x7));
                }
                field2563[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field2563[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field2550 = true;
                } else if (var11 == 7) {
                    this.field2562 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field2593) {
            throw new RuntimeException();
        }
        this.field2557 = var6;
        this.field2564 = new short[var6];
        this.field2552 = new short[var6];
        this.field2549 = new short[var6];
        this.field2559 = new short[var6];
        this.field2556 = new short[var6];
        this.field2554 = new byte[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field2564[var10] = field2553[var10];
            this.field2552[var10] = field2560[var10];
            this.field2549[var10] = field2558[var10];
            this.field2559[var10] = field2555[var10];
            this.field2556[var10] = field2563[var10];
            this.field2554[var10] = field2551[var10];
        }
    }
}
