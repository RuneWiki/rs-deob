import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class38 {

    @OriginalMember(owner = "client!f", name = "p", descriptor = "Z")
    public boolean field598 = false;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "Z")
    public boolean field597 = false;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "Lei;")
    public class182 field585 = null;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public int field592 = -1;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "[S")
    public short[] field596;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "[S")
    public short[] field588;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "[S")
    public short[] field591;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "[S")
    public short[] field587;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "[S")
    public short[] field594;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "[B")
    public byte[] field584;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "[S")
    private static short[] field590 = new short[500];

    @OriginalMember(owner = "client!f", name = "g", descriptor = "[B")
    private static byte[] field589 = new byte[500];

    @OriginalMember(owner = "client!f", name = "k", descriptor = "[S")
    private static short[] field593 = new short[500];

    @OriginalMember(owner = "client!f", name = "a", descriptor = "[S")
    private static short[] field583 = new short[500];

    @OriginalMember(owner = "client!f", name = "m", descriptor = "[S")
    private static short[] field595 = new short[500];

    @OriginalMember(owner = "client!f", name = "d", descriptor = "[S")
    private static short[] field586 = new short[500];

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()V")
    public static void method272() {
        field593 = null;
        field583 = null;
        field590 = null;
        field586 = null;
        field595 = null;
        field589 = null;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "([BLei;)V")
    public class38(byte[] arg0, class182 arg1) {
        this.field585 = arg1;
        class274 var3 = new class274(arg0);
        class274 var4 = new class274(arg0);
        var3.field4458 = 2;
        int var5 = var3.method1849(255);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field4458 = var3.field4458 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field585.field3022[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method1849(255);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field593[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field583[var6] = var13;
                } else {
                    field583[var6] = (short) var4.method1816(-103);
                }
                if ((var12 & 0x2) == 0) {
                    field590[var6] = var13;
                } else {
                    field590[var6] = (short) var4.method1816(-61);
                }
                if ((var12 & 0x4) == 0) {
                    field586[var6] = var13;
                } else {
                    field586[var6] = (short) var4.method1816(-93);
                }
                field589[var6] = (byte) (var12 >>> 3 & 0x3);
                if (var11 == 2) {
                    field583[var6] = (short) (((field583[var6] & 0xFF) << 3) + (field583[var6] >> 8 & 0x7));
                    field590[var6] = (short) (((field590[var6] & 0xFF) << 3) + (field590[var6] >> 8 & 0x7));
                    field586[var6] = (short) (((field586[var6] & 0xFF) << 3) + (field586[var6] >> 8 & 0x7));
                }
                field595[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field595[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field598 = true;
                } else if (var11 == 7) {
                    this.field597 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field4458) {
            throw new RuntimeException();
        }
        this.field592 = var6;
        this.field596 = new short[var6];
        this.field588 = new short[var6];
        this.field591 = new short[var6];
        this.field587 = new short[var6];
        this.field594 = new short[var6];
        this.field584 = new byte[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field596[var10] = field593[var10];
            this.field588[var10] = field583[var10];
            this.field591[var10] = field590[var10];
            this.field587[var10] = field586[var10];
            this.field594[var10] = field595[var10];
            this.field584[var10] = field589[var10];
        }
    }
}
