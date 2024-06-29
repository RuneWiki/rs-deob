import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class60 {

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Lie;")
    public class72 field1143 = null;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Z")
    public boolean field1145 = false;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public int field1151 = -1;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "[S")
    public short[] field1152;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "[S")
    public short[] field1147;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "[S")
    public short[] field1155;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "[S")
    public short[] field1154;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "[S")
    public short[] field1148;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "[S")
    private static short[] field1149 = new short[500];

    @OriginalMember(owner = "client!v", name = "d", descriptor = "[S")
    private static short[] field1146 = new short[500];

    @OriginalMember(owner = "client!v", name = "h", descriptor = "[S")
    private static short[] field1150 = new short[500];

    @OriginalMember(owner = "client!v", name = "b", descriptor = "[S")
    private static short[] field1144 = new short[500];

    @OriginalMember(owner = "client!v", name = "k", descriptor = "[S")
    private static short[] field1153 = new short[500];

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
    public static void method344() {
        field1149 = null;
        field1144 = null;
        field1150 = null;
        field1146 = null;
        field1153 = null;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "([BLie;)V")
    public class60(byte[] arg0, class72 arg1) {
        this.field1143 = arg1;
        class190 var3 = new class190(arg0);
        class190 var4 = new class190(arg0);
        var3.field3487 = 2;
        int var5 = var3.method1265(123);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field3487 = var3.field3487 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field1143.field1360[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method1265(115);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field1149[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field1144[var6] = var13;
                } else {
                    field1144[var6] = (short) var4.method1285(-49152);
                }
                if ((var12 & 0x2) == 0) {
                    field1150[var6] = var13;
                } else {
                    field1150[var6] = (short) var4.method1285(-49152);
                }
                if ((var12 & 0x4) == 0) {
                    field1146[var6] = var13;
                } else {
                    field1146[var6] = (short) var4.method1285(-49152);
                }
                if (var11 == 2) {
                    field1144[var6] = (short) (((field1144[var6] & 0xFF) << 3) + (field1144[var6] >> 8 & 0x7));
                    field1150[var6] = (short) (((field1150[var6] & 0xFF) << 3) + (field1150[var6] >> 8 & 0x7));
                    field1146[var6] = (short) (((field1146[var6] & 0xFF) << 3) + (field1146[var6] >> 8 & 0x7));
                }
                field1153[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field1153[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field1145 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field3487) {
            throw new RuntimeException();
        }
        this.field1151 = var6;
        this.field1152 = new short[var6];
        this.field1147 = new short[var6];
        this.field1155 = new short[var6];
        this.field1154 = new short[var6];
        this.field1148 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field1152[var10] = field1149[var10];
            this.field1147[var10] = field1144[var10];
            this.field1155[var10] = field1150[var10];
            this.field1154[var10] = field1146[var10];
            this.field1148[var10] = field1153[var10];
        }
    }
}
