import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class156 {

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "Z")
    public boolean field2724 = false;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "Luh;")
    public class100 field2726 = null;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public int field2731 = -1;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "[S")
    public short[] field2730;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "[S")
    public short[] field2727;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "[S")
    public short[] field2723;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "[S")
    public short[] field2729;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "[S")
    public short[] field2725;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "[S")
    private static short[] field2720 = new short[500];

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "[S")
    private static short[] field2721 = new short[500];

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "[S")
    private static short[] field2728 = new short[500];

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "[S")
    private static short[] field2732 = new short[500];

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "[S")
    private static short[] field2722 = new short[500];

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "()V")
    public static void method1111() {
        field2728 = null;
        field2720 = null;
        field2722 = null;
        field2732 = null;
        field2721 = null;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "([BLuh;)V")
    public class156(byte[] arg0, class100 arg1) {
        this.field2726 = arg1;
        class25 var3 = new class25(arg0);
        class25 var4 = new class25(arg0);
        var3.field481 = 2;
        int var5 = var3.method189((byte) -103);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field481 = var3.field481 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field2726.field1627[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method189((byte) -103);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field2728[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field2720[var6] = var13;
                } else {
                    field2720[var6] = (short) var4.method204(-128);
                }
                if ((var12 & 0x2) == 0) {
                    field2722[var6] = var13;
                } else {
                    field2722[var6] = (short) var4.method204(-123);
                }
                if ((var12 & 0x4) == 0) {
                    field2732[var6] = var13;
                } else {
                    field2732[var6] = (short) var4.method204(100);
                }
                if (var11 == 2) {
                    field2720[var6] = (short) (((field2720[var6] & 0xFF) << 3) + (field2720[var6] >> 8 & 0x7));
                    field2722[var6] = (short) (((field2722[var6] & 0xFF) << 3) + (field2722[var6] >> 8 & 0x7));
                    field2732[var6] = (short) (((field2732[var6] & 0xFF) << 3) + (field2732[var6] >> 8 & 0x7));
                }
                field2721[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field2721[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field2724 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field481) {
            throw new RuntimeException();
        }
        this.field2731 = var6;
        this.field2730 = new short[var6];
        this.field2727 = new short[var6];
        this.field2723 = new short[var6];
        this.field2729 = new short[var6];
        this.field2725 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field2730[var10] = field2728[var10];
            this.field2727[var10] = field2720[var10];
            this.field2723[var10] = field2722[var10];
            this.field2729[var10] = field2732[var10];
            this.field2725[var10] = field2721[var10];
        }
    }
}
