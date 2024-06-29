import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class152 {

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public int field2724 = -1;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "Z")
    public boolean field2735 = false;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "Lkg;")
    public class103 field2736 = null;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "[S")
    public short[] field2732;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "[S")
    public short[] field2727;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "[S")
    public short[] field2728;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "[S")
    public short[] field2729;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "[S")
    public short[] field2730;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "[S")
    private static short[] field2725 = new short[500];

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "[S")
    private static short[] field2726 = new short[500];

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "[S")
    private static short[] field2731 = new short[500];

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "[S")
    private static short[] field2733 = new short[500];

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "[S")
    private static short[] field2734 = new short[500];

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "([BLkg;)V")
    public class152(byte[] arg0, class103 arg1) {
        this.field2736 = arg1;
        class97 var3 = new class97(arg0);
        class97 var4 = new class97(arg0);
        var3.field1834 = 2;
        int var5 = var3.method588((byte) -77);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field1834 = var3.field1834 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2736.field1877[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method588((byte) -63);
            if (var11 > 0) {
                if (this.field2736.field1877[var9] == 0) {
                    var8 = var9;
                }
                field2731[var6] = (short) var9;
                short var12 = 0;
                if (this.field2736.field1877[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field2726[var6] = var12;
                } else {
                    field2726[var6] = (short) var4.method603(-1);
                }
                if ((var11 & 0x2) == 0) {
                    field2734[var6] = var12;
                } else {
                    field2734[var6] = (short) var4.method603(-1);
                }
                if ((var11 & 0x4) == 0) {
                    field2733[var6] = var12;
                } else {
                    field2733[var6] = (short) var4.method603(-1);
                }
                field2725[var6] = -1;
                if (this.field2736.field1877[var9] >= 1 && this.field2736.field1877[var9] <= 3 && var7 > var8) {
                    field2725[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field2736.field1877[var9] == 5) {
                    this.field2735 = true;
                }
            }
        }
        if (arg0.length != var4.field1834) {
            throw new RuntimeException();
        }
        this.field2724 = var6;
        this.field2732 = new short[var6];
        this.field2727 = new short[var6];
        this.field2728 = new short[var6];
        this.field2729 = new short[var6];
        this.field2730 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field2732[var10] = field2731[var10];
            this.field2727[var10] = field2726[var10];
            this.field2728[var10] = field2734[var10];
            this.field2729[var10] = field2733[var10];
            this.field2730[var10] = field2725[var10];
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()V")
    public static void method928() {
        field2731 = null;
        field2726 = null;
        field2734 = null;
        field2733 = null;
        field2725 = null;
    }
}
