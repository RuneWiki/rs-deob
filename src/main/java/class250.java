import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class250 {

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Lrg;")
    public class54 field4418 = null;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public int field4415 = -1;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "Z")
    public boolean field4422 = false;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "[S")
    public short[] field4423;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "[S")
    public short[] field4413;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "[S")
    public short[] field4417;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "[S")
    public short[] field4412;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "[S")
    public short[] field4420;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "[S")
    private static short[] field4416 = new short[500];

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "[S")
    private static short[] field4419 = new short[500];

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "[S")
    private static short[] field4421 = new short[500];

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "[S")
    private static short[] field4414 = new short[500];

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "[S")
    private static short[] field4424 = new short[500];

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "()V")
    public static void method1692() {
        field4414 = null;
        field4419 = null;
        field4421 = null;
        field4424 = null;
        field4416 = null;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "([BLrg;)V")
    public class250(byte[] arg0, class54 arg1) {
        this.field4418 = arg1;
        class56 var3 = new class56(arg0);
        class56 var4 = new class56(arg0);
        var3.field699 = 2;
        int var5 = var3.method367(1);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field699 = var3.field699 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field4418.field672[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method367(1);
            if (var11 > 0) {
                if (this.field4418.field672[var9] == 0) {
                    var8 = var9;
                }
                field4414[var6] = (short) var9;
                short var12 = 0;
                if (this.field4418.field672[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field4419[var6] = var12;
                } else {
                    field4419[var6] = (short) var4.method325(-6419);
                }
                if ((var11 & 0x2) == 0) {
                    field4421[var6] = var12;
                } else {
                    field4421[var6] = (short) var4.method325(-6419);
                }
                if ((var11 & 0x4) == 0) {
                    field4424[var6] = var12;
                } else {
                    field4424[var6] = (short) var4.method325(-6419);
                }
                if (this.field4418.field672[var9] == 2) {
                    field4419[var6] = (short) (((field4419[var6] & 0xFF) << 3) + (field4419[var6] >> 8 & 0x7));
                    field4421[var6] = (short) (((field4421[var6] & 0xFF) << 3) + (field4421[var6] >> 8 & 0x7));
                    field4424[var6] = (short) (((field4424[var6] & 0xFF) << 3) + (field4424[var6] >> 8 & 0x7));
                }
                field4416[var6] = -1;
                if (this.field4418.field672[var9] >= 1 && this.field4418.field672[var9] <= 3 && var7 > var8) {
                    field4416[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field4418.field672[var9] == 5) {
                    this.field4422 = true;
                }
            }
        }
        if (arg0.length != var4.field699) {
            throw new RuntimeException();
        }
        this.field4415 = var6;
        this.field4423 = new short[var6];
        this.field4413 = new short[var6];
        this.field4417 = new short[var6];
        this.field4412 = new short[var6];
        this.field4420 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field4423[var10] = field4414[var10];
            this.field4413[var10] = field4419[var10];
            this.field4417[var10] = field4421[var10];
            this.field4412[var10] = field4424[var10];
            this.field4420[var10] = field4416[var10];
        }
    }
}
