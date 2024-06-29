import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class139 {

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Z")
    public boolean field3311 = false;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Lge;")
    public class45 field3315 = null;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public int field3317 = -1;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "[I")
    public int[] field3314;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "[I")
    public int[] field3320;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "[I")
    public int[] field3316;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "[I")
    public int[] field3312;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "[I")
    private static int[] field3310 = new int[500];

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "[I")
    private static int[] field3313 = new int[500];

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "[I")
    private static int[] field3319 = new int[500];

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "[I")
    private static int[] field3318 = new int[500];

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "()V", line = 5)
    public static void method1071() {
        field3319 = null;
        field3310 = null;
        field3313 = null;
        field3318 = null;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "([BLge;)V", line = 42)
    public class139(byte[] arg0, class45 arg1) {
        this.field3315 = arg1;
        class140 var3 = new class140(arg0);
        class140 var4 = new class140(arg0);
        var3.field3347 = 2;
        int var5 = var3.method1105(255);
        int var6 = -1;
        int var7 = 0;
        var4.field3347 = var3.field3347 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method1105(255);
            if (var10 > 0) {
                if (this.field3315.field1100[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field3315.field1100[var11] == 0) {
                            field3319[var7] = var11;
                            field3310[var7] = 0;
                            field3313[var7] = 0;
                            field3318[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field3319[var7] = var8;
                short var12 = 0;
                if (this.field3315.field1100[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field3310[var7] = var12;
                } else {
                    field3310[var7] = var4.method1113(-64);
                }
                if ((var10 & 0x2) == 0) {
                    field3313[var7] = var12;
                } else {
                    field3313[var7] = var4.method1113(-64);
                }
                if ((var10 & 0x4) == 0) {
                    field3318[var7] = var12;
                } else {
                    field3318[var7] = var4.method1113(-64);
                }
                var6 = var8;
                var7++;
                if (this.field3315.field1100[var8] == 5) {
                    this.field3311 = true;
                }
            }
        }
        if (arg0.length != var4.field3347) {
            throw new RuntimeException();
        }
        this.field3317 = var7;
        this.field3314 = new int[var7];
        this.field3320 = new int[var7];
        this.field3316 = new int[var7];
        this.field3312 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field3314[var9] = field3319[var9];
            this.field3320[var9] = field3310[var9];
            this.field3316[var9] = field3313[var9];
            this.field3312[var9] = field3318[var9];
        }
    }
}
