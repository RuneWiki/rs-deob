import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class145 {

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public int field2645 = -1;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Z")
    public boolean field2654 = false;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Lli;")
    public class180 field2655 = null;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "[S")
    public short[] field2651;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "[S")
    public short[] field2648;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "[S")
    public short[] field2647;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "[S")
    public short[] field2650;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "[S")
    public short[] field2646;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "[S")
    private static short[] field2644 = new short[500];

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "[S")
    private static short[] field2643 = new short[500];

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "[S")
    private static short[] field2649 = new short[500];

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "[S")
    private static short[] field2652 = new short[500];

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "[S")
    private static short[] field2653 = new short[500];

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "()V", line = 25)
    public static void method1058() {
        field2644 = null;
        field2652 = null;
        field2649 = null;
        field2653 = null;
        field2643 = null;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "([BLli;)V", line = 53)
    public class145(byte[] arg0, class180 arg1) {
        this.field2655 = arg1;
        class134 var3 = new class134(arg0);
        class134 var4 = new class134(arg0);
        var3.field2299 = 2;
        int var5 = var3.method948(-124);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field2299 = var3.field2299 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field2655.field3137[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method948(-128);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field2644[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field2652[var6] = var12;
                } else {
                    field2652[var6] = (short) var4.method973((byte) -117);
                }
                if ((var11 & 0x2) == 0) {
                    field2649[var6] = var12;
                } else {
                    field2649[var6] = (short) var4.method973((byte) 104);
                }
                if ((var11 & 0x4) == 0) {
                    field2653[var6] = var12;
                } else {
                    field2653[var6] = (short) var4.method973((byte) -8);
                }
                if (var10 == 2) {
                    field2652[var6] = (short) (((field2652[var6] & 0xFF) << 3) + (field2652[var6] >> 8 & 0x7));
                    field2649[var6] = (short) (((field2649[var6] & 0xFF) << 3) + (field2649[var6] >> 8 & 0x7));
                    field2653[var6] = (short) (((field2653[var6] & 0xFF) << 3) + (field2653[var6] >> 8 & 0x7));
                }
                field2643[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field2643[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field2654 = true;
                } else if (var10 == 7) {
                }
                var6++;
            }
        }
        if (arg0.length != var4.field2299) {
            throw new RuntimeException();
        }
        this.field2645 = var6;
        this.field2651 = new short[var6];
        this.field2648 = new short[var6];
        this.field2647 = new short[var6];
        this.field2650 = new short[var6];
        this.field2646 = new short[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field2651[var13] = field2644[var13];
            this.field2648[var13] = field2652[var13];
            this.field2647[var13] = field2649[var13];
            this.field2650[var13] = field2653[var13];
            this.field2646[var13] = field2643[var13];
        }
    }
}
