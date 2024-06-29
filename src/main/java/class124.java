import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class124 {

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Z")
    public boolean field3158 = false;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public int field3159 = -1;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Lmc;")
    public class86 field3153 = null;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "[I")
    public int[] field3157;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "[I")
    public int[] field3151;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "[I")
    public int[] field3150;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "[I")
    public int[] field3152;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "[I")
    private static int[] field3155 = new int[500];

    @OriginalMember(owner = "client!s", name = "g", descriptor = "[I")
    private static int[] field3156 = new int[500];

    @OriginalMember(owner = "client!s", name = "e", descriptor = "[I")
    private static int[] field3154 = new int[500];

    @OriginalMember(owner = "client!s", name = "k", descriptor = "[I")
    private static int[] field3160 = new int[500];

    @OriginalMember(owner = "client!s", name = "a", descriptor = "()V")
    public static void method1053() {
        field3154 = null;
        field3155 = null;
        field3160 = null;
        field3156 = null;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "([BLmc;)V")
    public class124(byte[] arg0, class86 arg1) {
        this.field3153 = arg1;
        class114 var3 = new class114(arg0);
        class114 var4 = new class114(arg0);
        var3.field2816 = 2;
        int var5 = var3.method957((byte) 74);
        int var6 = -1;
        int var7 = 0;
        var4.field2816 = var3.field2816 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method957((byte) 37);
            if (var10 > 0) {
                if (this.field3153.field2171[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field3153.field2171[var11] == 0) {
                            field3154[var7] = var11;
                            field3155[var7] = 0;
                            field3160[var7] = 0;
                            field3156[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field3154[var7] = var8;
                short var12 = 0;
                if (this.field3153.field2171[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field3155[var7] = var12;
                } else {
                    field3155[var7] = var4.method923((byte) -123);
                }
                if ((var10 & 0x2) == 0) {
                    field3160[var7] = var12;
                } else {
                    field3160[var7] = var4.method923((byte) -124);
                }
                if ((var10 & 0x4) == 0) {
                    field3156[var7] = var12;
                } else {
                    field3156[var7] = var4.method923((byte) -128);
                }
                var6 = var8;
                var7++;
                if (this.field3153.field2171[var8] == 5) {
                    this.field3158 = true;
                }
            }
        }
        if (arg0.length != var4.field2816) {
            throw new RuntimeException();
        }
        this.field3159 = var7;
        this.field3157 = new int[var7];
        this.field3151 = new int[var7];
        this.field3150 = new int[var7];
        this.field3152 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field3157[var9] = field3154[var9];
            this.field3151[var9] = field3155[var9];
            this.field3150[var9] = field3160[var9];
            this.field3152[var9] = field3156[var9];
        }
    }
}
