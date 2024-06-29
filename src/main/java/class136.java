import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class136 {

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public int field2572 = -1;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "Z")
    public boolean field2570 = false;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "Lke;")
    public class104 field2578 = null;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "[S")
    public short[] field2576;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "[S")
    public short[] field2568;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "[S")
    public short[] field2573;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "[S")
    public short[] field2580;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "[S")
    public short[] field2569;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "[S")
    private static short[] field2574 = new short[500];

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "[S")
    private static short[] field2575 = new short[500];

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "[S")
    private static short[] field2577 = new short[500];

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "[S")
    private static short[] field2579 = new short[500];

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "[S")
    private static short[] field2571 = new short[500];

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "([BLke;)V")
    public class136(byte[] arg0, class104 arg1) {
        this.field2578 = arg1;
        class121 var3 = new class121(arg0);
        class121 var4 = new class121(arg0);
        var3.field2222 = 2;
        int var5 = var3.method751((byte) 113);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field2222 = var3.field2222 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2578.field1934[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method751((byte) 111);
            if (var11 > 0) {
                if (this.field2578.field1934[var9] == 0) {
                    var8 = var9;
                }
                field2575[var6] = (short) var9;
                short var12 = 0;
                if (this.field2578.field1934[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field2571[var6] = var12;
                } else {
                    field2571[var6] = (short) var4.method771((byte) 81);
                }
                if ((var11 & 0x2) == 0) {
                    field2577[var6] = var12;
                } else {
                    field2577[var6] = (short) var4.method771((byte) 82);
                }
                if ((var11 & 0x4) == 0) {
                    field2579[var6] = var12;
                } else {
                    field2579[var6] = (short) var4.method771((byte) 114);
                }
                if (this.field2578.field1934[var9] == 2) {
                    field2571[var6] = (short) (((field2571[var6] & 0xFF) << 3) + (field2571[var6] >> 8 & 0x7));
                    field2577[var6] = (short) (((field2577[var6] & 0xFF) << 3) + (field2577[var6] >> 8 & 0x7));
                    field2579[var6] = (short) (((field2579[var6] & 0xFF) << 3) + (field2579[var6] >> 8 & 0x7));
                }
                field2574[var6] = -1;
                if (this.field2578.field1934[var9] >= 1 && this.field2578.field1934[var9] <= 3 && var7 > var8) {
                    field2574[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field2578.field1934[var9] == 5) {
                    this.field2570 = true;
                }
            }
        }
        if (arg0.length != var4.field2222) {
            throw new RuntimeException();
        }
        this.field2572 = var6;
        this.field2576 = new short[var6];
        this.field2568 = new short[var6];
        this.field2573 = new short[var6];
        this.field2580 = new short[var6];
        this.field2569 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field2576[var10] = field2575[var10];
            this.field2568[var10] = field2571[var10];
            this.field2573[var10] = field2577[var10];
            this.field2580[var10] = field2579[var10];
            this.field2569[var10] = field2574[var10];
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "()V")
    public static void method856() {
        field2575 = null;
        field2571 = null;
        field2577 = null;
        field2579 = null;
        field2574 = null;
    }
}
