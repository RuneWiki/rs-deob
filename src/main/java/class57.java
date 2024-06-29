import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class57 {

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public int field1161 = -1;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Z")
    public boolean field1166 = false;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Loc;")
    public class100 field1169 = null;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "[I")
    public int[] field1165;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "[I")
    public int[] field1160;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "[I")
    public int[] field1170;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "[I")
    public int[] field1162;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "[I")
    private static int[] field1163 = new int[500];

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "[I")
    private static int[] field1164 = new int[500];

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "[I")
    private static int[] field1167 = new int[500];

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "[I")
    private static int[] field1168 = new int[500];

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()V")
    public static void method413() {
        field1164 = null;
        field1168 = null;
        field1163 = null;
        field1167 = null;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "([BLoc;)V")
    public class57(byte[] arg0, class100 arg1) {
        this.field1169 = arg1;
        class77 var3 = new class77(arg0);
        class77 var4 = new class77(arg0);
        var3.field1691 = 2;
        int var5 = var3.method570((byte) 123);
        int var6 = -1;
        int var7 = 0;
        var4.field1691 = var3.field1691 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method570((byte) 123);
            if (var10 > 0) {
                if (this.field1169.field2421[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field1169.field2421[var11] == 0) {
                            field1164[var7] = var11;
                            field1168[var7] = 0;
                            field1163[var7] = 0;
                            field1167[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1164[var7] = var8;
                short var12 = 0;
                if (this.field1169.field2421[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field1168[var7] = var12;
                } else {
                    field1168[var7] = var4.method578(126);
                }
                if ((var10 & 0x2) == 0) {
                    field1163[var7] = var12;
                } else {
                    field1163[var7] = var4.method578(91);
                }
                if ((var10 & 0x4) == 0) {
                    field1167[var7] = var12;
                } else {
                    field1167[var7] = var4.method578(99);
                }
                var6 = var8;
                var7++;
                if (this.field1169.field2421[var8] == 5) {
                    this.field1166 = true;
                }
            }
        }
        if (arg0.length != var4.field1691) {
            throw new RuntimeException();
        }
        this.field1161 = var7;
        this.field1165 = new int[var7];
        this.field1160 = new int[var7];
        this.field1170 = new int[var7];
        this.field1162 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field1165[var9] = field1164[var9];
            this.field1160[var9] = field1168[var9];
            this.field1170[var9] = field1163[var9];
            this.field1162[var9] = field1167[var9];
        }
    }
}
