import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class128 {

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public int field2576 = -1;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Led;")
    public class45 field2578 = null;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Z")
    public boolean field2583 = false;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "[S")
    public short[] field2584;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "[S")
    public short[] field2579;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "[S")
    public short[] field2580;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "[S")
    public short[] field2577;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "[S")
    public short[] field2575;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "[S")
    private static short[] field2581 = new short[500];

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "[S")
    private static short[] field2582 = new short[500];

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "[S")
    private static short[] field2585 = new short[500];

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "[S")
    private static short[] field2586 = new short[500];

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "[S")
    private static short[] field2587 = new short[500];

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "()V")
    public static void method851() {
        field2581 = null;
        field2582 = null;
        field2586 = null;
        field2585 = null;
        field2587 = null;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "([BLed;)V")
    public class128(byte[] arg0, class45 arg1) {
        this.field2578 = arg1;
        class70 var3 = new class70(arg0);
        class70 var4 = new class70(arg0);
        var3.field1472 = 2;
        int var5 = var3.method443(255);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field1472 = var3.field1472 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2578.field1005[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method443(255);
            if (var11 > 0) {
                if (this.field2578.field1005[var9] == 0) {
                    var8 = var9;
                }
                field2581[var6] = (short) var9;
                short var12 = 0;
                if (this.field2578.field1005[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field2582[var6] = var12;
                } else {
                    field2582[var6] = (short) var4.method445((byte) 106);
                }
                if ((var11 & 0x2) == 0) {
                    field2586[var6] = var12;
                } else {
                    field2586[var6] = (short) var4.method445((byte) 115);
                }
                if ((var11 & 0x4) == 0) {
                    field2585[var6] = var12;
                } else {
                    field2585[var6] = (short) var4.method445((byte) 126);
                }
                if (this.field2578.field1005[var9] == 2) {
                    field2582[var6] = (short) (((field2582[var6] & 0xFF) << 3) + (field2582[var6] >> 8 & 0x7));
                    field2586[var6] = (short) (((field2586[var6] & 0xFF) << 3) + (field2586[var6] >> 8 & 0x7));
                    field2585[var6] = (short) (((field2585[var6] & 0xFF) << 3) + (field2585[var6] >> 8 & 0x7));
                }
                field2587[var6] = -1;
                if (this.field2578.field1005[var9] >= 1 && this.field2578.field1005[var9] <= 3 && var7 > var8) {
                    field2587[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field2578.field1005[var9] == 5) {
                    this.field2583 = true;
                }
            }
        }
        if (arg0.length != var4.field1472) {
            throw new RuntimeException();
        }
        this.field2576 = var6;
        this.field2584 = new short[var6];
        this.field2579 = new short[var6];
        this.field2580 = new short[var6];
        this.field2577 = new short[var6];
        this.field2575 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field2584[var10] = field2581[var10];
            this.field2579[var10] = field2582[var10];
            this.field2580[var10] = field2586[var10];
            this.field2577[var10] = field2585[var10];
            this.field2575[var10] = field2587[var10];
        }
    }
}
