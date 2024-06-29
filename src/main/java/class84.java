import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class84 {

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public int field2122 = -1;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "Lva;")
    public class127 field2124 = null;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "Z")
    public boolean field2126 = false;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "[I")
    public int[] field2125;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "[I")
    public int[] field2123;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "[I")
    public int[] field2128;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "[I")
    public int[] field2127;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "[I")
    private static int[] field2118 = new int[500];

    @OriginalMember(owner = "client!o", name = "b", descriptor = "[I")
    private static int[] field2119 = new int[500];

    @OriginalMember(owner = "client!o", name = "d", descriptor = "[I")
    private static int[] field2121 = new int[500];

    @OriginalMember(owner = "client!o", name = "c", descriptor = "[I")
    private static int[] field2120 = new int[500];

    @OriginalMember(owner = "client!o", name = "a", descriptor = "()V", line = 5)
    public static void method747() {
        field2119 = null;
        field2120 = null;
        field2118 = null;
        field2121 = null;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "([BLva;)V", line = 42)
    public class84(byte[] arg0, class127 arg1) {
        this.field2124 = arg1;
        class8 var3 = new class8(arg0);
        class8 var4 = new class8(arg0);
        var3.field268 = 2;
        int var5 = var3.method145(false);
        int var6 = -1;
        int var7 = 0;
        var4.field268 = var3.field268 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method145(false);
            if (var10 > 0) {
                if (this.field2124.field3120[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field2124.field3120[var11] == 0) {
                            field2119[var7] = var11;
                            field2120[var7] = 0;
                            field2118[var7] = 0;
                            field2121[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2119[var7] = var8;
                short var12 = 0;
                if (this.field2124.field3120[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field2120[var7] = var12;
                } else {
                    field2120[var7] = var4.method159((byte) -116);
                }
                if ((var10 & 0x2) == 0) {
                    field2118[var7] = var12;
                } else {
                    field2118[var7] = var4.method159((byte) 114);
                }
                if ((var10 & 0x4) == 0) {
                    field2121[var7] = var12;
                } else {
                    field2121[var7] = var4.method159((byte) 113);
                }
                var6 = var8;
                var7++;
                if (this.field2124.field3120[var8] == 5) {
                    this.field2126 = true;
                }
            }
        }
        if (arg0.length != var4.field268) {
            throw new RuntimeException();
        }
        this.field2122 = var7;
        this.field2125 = new int[var7];
        this.field2123 = new int[var7];
        this.field2128 = new int[var7];
        this.field2127 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field2125[var9] = field2119[var9];
            this.field2123[var9] = field2120[var9];
            this.field2128[var9] = field2118[var9];
            this.field2127[var9] = field2121[var9];
        }
    }
}
