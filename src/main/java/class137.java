import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class137 {

    @OriginalMember(owner = "client!va", name = "j", descriptor = "Z")
    public boolean field3318 = false;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public int field3317 = -1;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "Ltc;")
    public class127 field3319 = null;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "[I")
    public int[] field3310;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "[I")
    public int[] field3311;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "[I")
    public int[] field3309;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "[I")
    public int[] field3315;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "[I")
    private static int[] field3313 = new int[500];

    @OriginalMember(owner = "client!va", name = "d", descriptor = "[I")
    private static int[] field3312 = new int[500];

    @OriginalMember(owner = "client!va", name = "h", descriptor = "[I")
    private static int[] field3316 = new int[500];

    @OriginalMember(owner = "client!va", name = "f", descriptor = "[I")
    private static int[] field3314 = new int[500];

    @OriginalMember(owner = "client!va", name = "a", descriptor = "()V")
    public static void method1124() {
        field3312 = null;
        field3316 = null;
        field3313 = null;
        field3314 = null;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "([BLtc;)V")
    public class137(byte[] arg0, class127 arg1) {
        this.field3319 = arg1;
        class51 var3 = new class51(arg0);
        class51 var4 = new class51(arg0);
        var3.field1128 = 2;
        int var5 = var3.method373(25094);
        int var6 = -1;
        int var7 = 0;
        var4.field1128 = var3.field1128 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method373(25094);
            if (var10 > 0) {
                if (this.field3319.field3066[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field3319.field3066[var11] == 0) {
                            field3312[var7] = var11;
                            field3316[var7] = 0;
                            field3313[var7] = 0;
                            field3314[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field3312[var7] = var8;
                short var12 = 0;
                if (this.field3319.field3066[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field3316[var7] = var12;
                } else {
                    field3316[var7] = var4.method410(-30497);
                }
                if ((var10 & 0x2) == 0) {
                    field3313[var7] = var12;
                } else {
                    field3313[var7] = var4.method410(-30497);
                }
                if ((var10 & 0x4) == 0) {
                    field3314[var7] = var12;
                } else {
                    field3314[var7] = var4.method410(-30497);
                }
                var6 = var8;
                var7++;
                if (this.field3319.field3066[var8] == 5) {
                    this.field3318 = true;
                }
            }
        }
        if (arg0.length != var4.field1128) {
            throw new RuntimeException();
        }
        this.field3317 = var7;
        this.field3310 = new int[var7];
        this.field3311 = new int[var7];
        this.field3309 = new int[var7];
        this.field3315 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field3310[var9] = field3312[var9];
            this.field3311[var9] = field3316[var9];
            this.field3309[var9] = field3313[var9];
            this.field3315[var9] = field3314[var9];
        }
    }
}
