import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class269 {

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public int field4733 = -1;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Lhk;")
    public class121 field4738 = null;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "Z")
    public boolean field4742 = false;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "[S")
    public short[] field4739;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "[S")
    public short[] field4737;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "[S")
    public short[] field4745;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "[S")
    public short[] field4740;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "[S")
    public short[] field4734;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "[S")
    private static short[] field4736 = new short[500];

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "[S")
    private static short[] field4735 = new short[500];

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "[S")
    private static short[] field4743 = new short[500];

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "[S")
    private static short[] field4741 = new short[500];

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "[S")
    private static short[] field4744 = new short[500];

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "()V")
    public static void method1847() {
        field4735 = null;
        field4743 = null;
        field4744 = null;
        field4741 = null;
        field4736 = null;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "([BLhk;)V")
    public class269(byte[] arg0, class121 arg1) {
        this.field4738 = arg1;
        class200 var3 = new class200(arg0);
        class200 var4 = new class200(arg0);
        var3.field3565 = 2;
        int var5 = var3.method1408((byte) -102);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field3565 = var3.field3565 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field4738.field2349[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method1408((byte) -55);
            if (var11 > 0) {
                if (this.field4738.field2349[var9] == 0) {
                    var8 = var9;
                }
                field4735[var6] = (short) var9;
                short var12 = 0;
                if (this.field4738.field2349[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field4743[var6] = var12;
                } else {
                    field4743[var6] = (short) var4.method1404(0);
                }
                if ((var11 & 0x2) == 0) {
                    field4744[var6] = var12;
                } else {
                    field4744[var6] = (short) var4.method1404(0);
                }
                if ((var11 & 0x4) == 0) {
                    field4741[var6] = var12;
                } else {
                    field4741[var6] = (short) var4.method1404(0);
                }
                if (this.field4738.field2349[var9] == 2) {
                    field4743[var6] = (short) (((field4743[var6] & 0xFF) << 3) + (field4743[var6] >> 8 & 0x7));
                    field4744[var6] = (short) (((field4744[var6] & 0xFF) << 3) + (field4744[var6] >> 8 & 0x7));
                    field4741[var6] = (short) (((field4741[var6] & 0xFF) << 3) + (field4741[var6] >> 8 & 0x7));
                }
                field4736[var6] = -1;
                if (this.field4738.field2349[var9] >= 1 && this.field4738.field2349[var9] <= 3 && var7 > var8) {
                    field4736[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field4738.field2349[var9] == 5) {
                    this.field4742 = true;
                }
            }
        }
        if (arg0.length != var4.field3565) {
            throw new RuntimeException();
        }
        this.field4733 = var6;
        this.field4739 = new short[var6];
        this.field4737 = new short[var6];
        this.field4745 = new short[var6];
        this.field4740 = new short[var6];
        this.field4734 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field4739[var10] = field4735[var10];
            this.field4737[var10] = field4743[var10];
            this.field4745[var10] = field4744[var10];
            this.field4740[var10] = field4741[var10];
            this.field4734[var10] = field4736[var10];
        }
    }
}
