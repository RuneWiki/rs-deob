import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class152 extends class739 {

    @OriginalMember(owner = "client!ho", name = "F", descriptor = "I")
    private int field2090 = 0;

    @OriginalMember(owner = "client!ho", name = "I", descriptor = "I")
    private int field2093 = 0;

    @OriginalMember(owner = "client!ho", name = "J", descriptor = "I")
    private int field2094 = 1;

    @OriginalMember(owner = "client!ho", name = "E", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!ho", name = "G", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!ho", name = "H", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lsl;II)V", line = 4)
    public final void method214(class461 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -4) {
                    this.field2094 = arg0.method2600((byte) -124);
                }
            } else {
                this.field2090 = arg0.method2600((byte) -124);
            }
        } else {
            this.field2093 = arg0.method2600((byte) -125);
        }
        if (arg2 != -3) {
            this.field2093 = -69;
        }
        ++field2089;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)[I", line = 51)
    public final int[] method215(int arg0, int arg1) {
        ++field2092;
        if (arg0 != -23347) {
            this.method214((class461) null, -71, 46);
        }
        int[] var3 = super.field10311.method2116(arg1, (byte) 55);
        if (super.field10311.field4728) {
            int var4 = class287.field3604[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; class29.field523 > var6; ++var6) {
                int var7 = class634.field8751[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (this.field2093 == 0) {
                    var9 = (-var4 + var7) * this.field2094;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field2094 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (~this.field2090 == -1) {
                    var12 = class709.field9851[var12 >> 4 & 255] + 4096 >> 1;
                } else if (~this.field2090 == -3) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V", line = 118)
    public final void method216(int arg0) {
        ++field2091;
        class144.method1039((byte) -24);
        if (arg0 != -21773) {
            this.field2094 = -125;
        }
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V", line = 137)
    public class152() {
        super(0, true);
    }
}
