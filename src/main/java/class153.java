import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class153 {

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    public int field2463 = -1;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "Z")
    public boolean field2457 = false;

    @OriginalMember(owner = "client!in", name = "k", descriptor = "Z")
    public boolean field2465 = false;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "Lpa;")
    public class2 field2466 = null;

    @OriginalMember(owner = "client!in", name = "o", descriptor = "[S")
    public short[] field2469;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "[S")
    public short[] field2458;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "[S")
    public short[] field2456;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "[S")
    public short[] field2462;

    @OriginalMember(owner = "client!in", name = "n", descriptor = "[S")
    public short[] field2468;

    @OriginalMember(owner = "client!in", name = "m", descriptor = "[B")
    public byte[] field2467;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "[B")
    private static byte[] field2460 = new byte[500];

    @OriginalMember(owner = "client!in", name = "g", descriptor = "[S")
    private static short[] field2461 = new short[500];

    @OriginalMember(owner = "client!in", name = "a", descriptor = "[S")
    private static short[] field2455 = new short[500];

    @OriginalMember(owner = "client!in", name = "e", descriptor = "[S")
    private static short[] field2459 = new short[500];

    @OriginalMember(owner = "client!in", name = "j", descriptor = "[S")
    private static short[] field2464 = new short[500];

    @OriginalMember(owner = "client!in", name = "p", descriptor = "[S")
    private static short[] field2470 = new short[500];

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "([BLpa;)V", line = 55)
    public class153(byte[] arg0, class2 arg1) {
        this.field2466 = arg1;
        class101 var3 = new class101(arg0);
        class101 var4 = new class101(arg0);
        var3.field1667 = 2;
        int var5 = var3.method741(59);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field1667 = var3.field1667 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field2466.field10[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method741(116);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field2470[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field2464[var6] = var12;
                } else {
                    field2464[var6] = (short) var4.method779((byte) 108);
                }
                if ((var11 & 0x2) == 0) {
                    field2461[var6] = var12;
                } else {
                    field2461[var6] = (short) var4.method779((byte) -76);
                }
                if ((var11 & 0x4) == 0) {
                    field2459[var6] = var12;
                } else {
                    field2459[var6] = (short) var4.method779((byte) 122);
                }
                field2460[var6] = (byte) (var11 >>> 3 & 0x3);
                if (var10 == 2) {
                    field2464[var6] = (short) (((field2464[var6] & 0xFF) << 3) + (field2464[var6] >> 8 & 0x7));
                    field2461[var6] = (short) (((field2461[var6] & 0xFF) << 3) + (field2461[var6] >> 8 & 0x7));
                    field2459[var6] = (short) (((field2459[var6] & 0xFF) << 3) + (field2459[var6] >> 8 & 0x7));
                }
                field2455[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field2455[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field2465 = true;
                } else if (var10 == 7) {
                    this.field2457 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field1667) {
            throw new RuntimeException();
        }
        this.field2463 = var6;
        this.field2469 = new short[var6];
        this.field2458 = new short[var6];
        this.field2456 = new short[var6];
        this.field2462 = new short[var6];
        this.field2468 = new short[var6];
        this.field2467 = new byte[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field2469[var13] = field2470[var13];
            this.field2458[var13] = field2464[var13];
            this.field2456[var13] = field2461[var13];
            this.field2462[var13] = field2459[var13];
            this.field2468[var13] = field2455[var13];
            this.field2467[var13] = field2460[var13];
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "()V", line = 41)
    public static void method1171() {
        field2470 = null;
        field2464 = null;
        field2461 = null;
        field2459 = null;
        field2455 = null;
        field2460 = null;
    }
}
