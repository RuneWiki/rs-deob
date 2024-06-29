import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class223 {

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public int field3858 = -1;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Lpb;")
    public class239 field3860 = null;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Z")
    public boolean field3857 = false;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "[S")
    public short[] field3862;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "[S")
    public short[] field3863;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "[S")
    public short[] field3859;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "[S")
    public short[] field3852;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "[S")
    public short[] field3853;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "[S")
    private static short[] field3854 = new short[500];

    @OriginalMember(owner = "client!w", name = "e", descriptor = "[S")
    private static short[] field3856 = new short[500];

    @OriginalMember(owner = "client!w", name = "d", descriptor = "[S")
    private static short[] field3855 = new short[500];

    @OriginalMember(owner = "client!w", name = "j", descriptor = "[S")
    private static short[] field3861 = new short[500];

    @OriginalMember(owner = "client!w", name = "m", descriptor = "[S")
    private static short[] field3864 = new short[500];

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()V")
    public static void method1477() {
        field3864 = null;
        field3855 = null;
        field3854 = null;
        field3861 = null;
        field3856 = null;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "([BLpb;)V")
    public class223(byte[] arg0, class239 arg1) {
        this.field3860 = arg1;
        class230 var3 = new class230(arg0);
        class230 var4 = new class230(arg0);
        var3.field3933 = 2;
        int var5 = var3.method1516((byte) 82);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field3933 = var3.field3933 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3860.field4148[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method1516((byte) 82);
            if (var11 > 0) {
                if (this.field3860.field4148[var9] == 0) {
                    var8 = var9;
                }
                field3864[var6] = (short) var9;
                short var12 = 0;
                if (this.field3860.field4148[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field3855[var6] = var12;
                } else {
                    field3855[var6] = (short) var4.method1536((byte) 6);
                }
                if ((var11 & 0x2) == 0) {
                    field3854[var6] = var12;
                } else {
                    field3854[var6] = (short) var4.method1536((byte) 6);
                }
                if ((var11 & 0x4) == 0) {
                    field3861[var6] = var12;
                } else {
                    field3861[var6] = (short) var4.method1536((byte) 6);
                }
                if (this.field3860.field4148[var9] == 2) {
                    field3855[var6] = (short) (((field3855[var6] & 0xFF) << 3) + (field3855[var6] >> 8 & 0x7));
                    field3854[var6] = (short) (((field3854[var6] & 0xFF) << 3) + (field3854[var6] >> 8 & 0x7));
                    field3861[var6] = (short) (((field3861[var6] & 0xFF) << 3) + (field3861[var6] >> 8 & 0x7));
                }
                field3856[var6] = -1;
                if (this.field3860.field4148[var9] >= 1 && this.field3860.field4148[var9] <= 3 && var7 > var8) {
                    field3856[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field3860.field4148[var9] == 5) {
                    this.field3857 = true;
                }
            }
        }
        if (arg0.length != var4.field3933) {
            throw new RuntimeException();
        }
        this.field3858 = var6;
        this.field3862 = new short[var6];
        this.field3863 = new short[var6];
        this.field3859 = new short[var6];
        this.field3852 = new short[var6];
        this.field3853 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field3862[var10] = field3864[var10];
            this.field3863[var10] = field3855[var10];
            this.field3859[var10] = field3854[var10];
            this.field3852[var10] = field3861[var10];
            this.field3853[var10] = field3856[var10];
        }
    }
}
