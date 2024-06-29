import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 extends class167 {

    @OriginalMember(owner = "client!af", name = "bb", descriptor = "I")
    private int field113 = 1;

    @OriginalMember(owner = "client!af", name = "jb", descriptor = "I")
    private int field121 = 204;

    @OriginalMember(owner = "client!af", name = "ib", descriptor = "I")
    private int field120 = 1;

    @OriginalMember(owner = "client!af", name = "X", descriptor = "[S")
    public static short[] field109 = new short[256];

    @OriginalMember(owner = "client!af", name = "cb", descriptor = "[I")
    public static int[] field114 = new int[100];

    @OriginalMember(owner = "client!af", name = "T", descriptor = "Lkh;")
    private static class117 field105 = class224.method1450((byte) 122, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!af", name = "ab", descriptor = "Lkh;")
    public static class117 field112 = field105;

    @OriginalMember(owner = "client!af", name = "W", descriptor = "[[I")
    public static int[][] field108 = new int[104][104];

    @OriginalMember(owner = "client!af", name = "gb", descriptor = "[I")
    public static int[] field118 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!af", name = "hb", descriptor = "Lkh;")
    public static class117 field119 = class224.method1450((byte) -88, "compass");

    @OriginalMember(owner = "client!af", name = "kb", descriptor = "Lkh;")
    private static class117 field122 = class224.method1450((byte) -61, "This world is full)3");

    @OriginalMember(owner = "client!af", name = "Z", descriptor = "Lkh;")
    public static class117 field111 = field122;

    @OriginalMember(owner = "client!af", name = "U", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!af", name = "Y", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!af", name = "db", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!af", name = "eb", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!af", name = "fb", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!af", name = "V", descriptor = "Lsf;")
    public static class203 field107;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        if (arg1) {
            method52((byte) 126);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field121 = arg0.method1049((byte) 113);
                }
            } else {
                this.field113 = arg0.method998(65);
            }
        } else {
            this.field120 = arg0.method998(65);
        }
        ++field115;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class7() {
        super(0, true);
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(B)V")
    public static void method52(byte arg0) {
        field119 = null;
        field118 = null;
        field111 = null;
        field114 = null;
        field108 = null;
        field107 = null;
        if (arg0 != 103) {
            method52((byte) -7);
        }
        field105 = null;
        field122 = null;
        field112 = null;
        field109 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        ++field110;
        if (arg0 != -96) {
            field107 = null;
        }
        int[] var3 = super.field3013.method1463((byte) -115, arg1);
        if (super.field3013.field4085) {
            for (int var4 = 0; class115.field2146 > var4; ++var4) {
                int var5 = class70.field1350[var4];
                int var6 = this.field120 * var5 >> 12;
                int var7 = var5 % (4096 / this.field120) * this.field120;
                int var8 = class143.field2583[arg1];
                int var9 = var8 % (4096 / this.field113) * this.field113;
                int var10 = this.field113 * var8 >> 12;
                if (this.field121 > var9) {
                    for (var6 -= var10; ~var6 > -1; var6 += 4) {
                    }
                    while (var6 > 3) {
                        var6 -= 4;
                    }
                    if (~var6 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var7 < this.field121) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~var7 > ~this.field121) {
                    int var11;
                    for (var11 = var6 - var10; ~var11 > -1; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lai;Lai;BLai;Lwd;)Z")
    public static final boolean method54(class10 arg0, class10 arg1, byte arg2, class10 arg3, class243 arg4) {
        ++field117;
        if (arg2 != -38) {
            field118 = null;
        }
        class39.field897 = arg4;
        class159.field2917 = arg1;
        class223.field4019 = arg0;
        class112.field2108 = arg3;
        return true;
    }
}
