import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class16 extends class145 {

    @OriginalMember(owner = "client!kn", name = "J", descriptor = "I")
    private int field188 = 0;

    @OriginalMember(owner = "client!kn", name = "I", descriptor = "I")
    private int field187 = 2048;

    @OriginalMember(owner = "client!kn", name = "G", descriptor = "I")
    private int field185 = 10;

    @OriginalMember(owner = "client!kn", name = "H", descriptor = "[Ldh;")
    public static class192[] field186 = new class192[8];

    @OriginalMember(owner = "client!kn", name = "F", descriptor = "[S")
    public static short[] field184 = new short[] { 9, 17, 14, 37, 57, 12, 4, 43 };

    @OriginalMember(owner = "client!kn", name = "L", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!kn", name = "M", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!kn", name = "O", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!kn", name = "P", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!kn", name = "R", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!kn", name = "N", descriptor = "[I")
    private int[] field191;

    @OriginalMember(owner = "client!kn", name = "Q", descriptor = "[I")
    private int[] field194;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        int var3 = -70 % ((arg1 - 16) / 49);
        ++field195;
        int[] var4 = super.field2218.method1614(91, arg0);
        if (super.field2218.field3396) {
            int var5 = class134.field1902[arg0];
            if (this.field188 != 0) {
                for (int var6 = 0; ~var6 > ~class156.field2364; ++var6) {
                    int var7 = 0;
                    short var8 = 0;
                    int var9 = class229.field3181[var6];
                    int var10 = this.field188;
                    if (var10 != 1) {
                        if (~var10 != -3) {
                            if (~var10 == -4) {
                                var7 = (-var5 + var9 >> 1) + 2048;
                            }
                        } else {
                            var7 = 2048 - -(var9 - 4096 + var5 >> 1);
                        }
                    } else {
                        var7 = var9;
                    }
                    for (int var11 = 0; this.field185 > var11; ++var11) {
                        if (~this.field191[var11] >= ~var7 && this.field191[var11 - -1] > var7) {
                            if (this.field194[var11] > var7) {
                                var8 = 4096;
                            }
                            break;
                        }
                    }
                    var4[var6] = var8;
                }
            } else {
                short var12 = 0;
                for (int var13 = 0; var13 < this.field185; ++var13) {
                    if (this.field191[var13] <= var5 && ~var5 > ~this.field191[var13 + 1]) {
                        if (~var5 > ~this.field194[var13]) {
                            var12 = 4096;
                        }
                        break;
                    }
                }
                class152.method1171(var4, 0, class156.field2364, var12);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lap;BI)V")
    public final void method2(class289 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field188 = arg0.method1861((byte) -72);
                }
            } else {
                this.field187 = arg0.method1853(104);
            }
        } else {
            this.field185 = arg0.method1861((byte) -72);
        }
        ++field189;
        int var5 = -19 / ((arg1 - 11) / 52);
    }

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "(I)V")
    public static void method86(int arg0) {
        field184 = null;
        if (arg0 != -31489) {
            field190 = -87;
        }
        field186 = null;
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(B)V")
    public final void method87(byte arg0) {
        this.method88(arg0 ^ -56);
        ++field193;
        if (arg0 != 77) {
            this.method2((class289) null, (byte) 81, 14);
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
    public class16() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "(I)V")
    private final void method88(int arg0) {
        ++field192;
        int var2 = 0;
        this.field191 = new int[this.field185 + 1];
        this.field194 = new int[this.field185 + 1];
        int var3 = 4096 / this.field185;
        int var4 = this.field187 * var3 >> 12;
        for (int var5 = 0; var5 < this.field185; ++var5) {
            this.field191[var5] = var2;
            this.field194[var5] = var2 - -var4;
            var2 += var3;
        }
        if (arg0 >= -79) {
            this.field188 = 58;
        }
        this.field191[this.field185] = 4096;
        this.field194[this.field185] = this.field194[0] + 4096;
    }
}
