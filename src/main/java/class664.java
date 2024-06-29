import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class664 extends class557 {

    @OriginalMember(owner = "client!av", name = "p", descriptor = "I")
    public static int field8915 = 0;

    @OriginalMember(owner = "client!av", name = "n", descriptor = "B")
    private byte field8913;

    @OriginalMember(owner = "client!av", name = "o", descriptor = "B")
    private byte field8914;

    @OriginalMember(owner = "client!av", name = "r", descriptor = "B")
    private byte field8917;

    @OriginalMember(owner = "client!av", name = "s", descriptor = "B")
    private byte field8918;

    @OriginalMember(owner = "client!av", name = "m", descriptor = "I")
    public static int field8912;

    @OriginalMember(owner = "client!av", name = "q", descriptor = "I")
    public static int field8916;

    @OriginalMember(owner = "client!av", name = "u", descriptor = "I")
    public static int field8920;

    @OriginalMember(owner = "client!av", name = "t", descriptor = "Z")
    private boolean field8919;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Ltn;I)V", line = 6)
    public final void method32(class95 arg0, int arg1) {
        arg0.field1340 = this.field8918;
        if (arg1 != -29265) {
            field8915 = 52;
        }
        arg0.field1334 = this.field8913;
        field8916++;
        arg0.field1322 = this.field8917;
        arg0.field1348 = this.field8919;
        arg0.field1344 = this.field8914;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(BLdt;)V", line = 28)
    public final void method30(byte arg0, class254 arg1) {
        if (arg0 != 110) {
            this.field8917 = 7;
        }
        this.field8919 = arg1.method1731((byte) 64) == 1;
        field8920++;
        this.field8914 = arg1.method1737(true);
        this.field8917 = arg1.method1737(true);
        this.field8913 = arg1.method1737(true);
        this.field8918 = arg1.method1737(true);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "([[BLcc;I)V", line = 47)
    public static final void method3665(byte[][] arg0, class760 arg1, int arg2) {
        field8912++;
        int var3 = 0;
        int var4 = -27 / ((arg2 + 5) / 54);
        while (var3 < arg1.field6789) {
            class324.method2095(-128);
            for (int var5 = 0; var5 < (class102.field1467 >> 3); var5++) {
                for (int var6 = 0; var6 < (class393.field5663 >> 3); var6++) {
                    int var7 = class199.field2587[var3][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x325AB5E) >> 24;
                        if (!arg1.field6799 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = (var7 & 0x3FF9) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class649.field8753.length; var13++) {
                                if (class649.field8753[var13] == var12 && arg0[var13] != null) {
                                    arg1.method4186(3, (var11 & 0x7) * 8, var5 * 8, arg0[var13], class375.field5490, class257.field3830, var6 * 8, var3, var9, (var10 & 0x7) * 8, var8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            var3++;
        }
    }
}
