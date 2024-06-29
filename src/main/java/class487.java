import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class487 extends class466 {

    @OriginalMember(owner = "client!qi", name = "J", descriptor = "I")
    private int field6834 = 1;

    @OriginalMember(owner = "client!qi", name = "K", descriptor = "I")
    private int field6835 = 1;

    @OriginalMember(owner = "client!qi", name = "S", descriptor = "I")
    private int field6843 = 204;

    @OriginalMember(owner = "client!qi", name = "I", descriptor = "Lcba;")
    public static class471 field6833 = new class471(9, 6);

    @OriginalMember(owner = "client!qi", name = "N", descriptor = "[I")
    public static int[] field6838 = new int[1];

    @OriginalMember(owner = "client!qi", name = "O", descriptor = "[S")
    public static short[] field6839 = new short[256];

    @OriginalMember(owner = "client!qi", name = "L", descriptor = "Ltl;")
    public static class531 field6836 = new class531("WTI", 5);

    @OriginalMember(owner = "client!qi", name = "E", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!qi", name = "F", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!qi", name = "G", descriptor = "I")
    public static int field6831;

    @OriginalMember(owner = "client!qi", name = "H", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!qi", name = "M", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!qi", name = "P", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!qi", name = "Q", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!qi", name = "R", descriptor = "Lha;")
    public static class52 field6842;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V")
    public static void method2829(byte arg0) {
        field6838 = null;
        field6836 = null;
        field6839 = null;
        field6833 = null;
        field6842 = null;
        int var1 = -28 % ((arg0 - -15) / 59);
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
    public class487() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZZ)Z")
    public static boolean method2830(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)J")
    public static final long method2831(byte arg0) {
        int var1 = 73 / ((arg0 - 39) / 35);
        ++field6829;
        return class96.field1459.method571(124);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field6843 = arg0.method93((byte) 101);
                }
            } else {
                this.field6834 = arg0.method110((byte) 39);
            }
        } else {
            this.field6835 = arg0.method110((byte) 93);
        }
        ++field6840;
        if (arg1 != -5062) {
            this.field6843 = -61;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field6830;
        int[] var3 = super.field6557.method565(arg0, -24728);
        if (arg1 != 0) {
            this.field6843 = -67;
        }
        if (super.field6557.field1163) {
            for (int var4 = 0; ~var4 > ~class312.field4207; ++var4) {
                int var5 = class431.field6129[var4];
                int var6 = class63.field1085[arg0];
                int var7 = this.field6835 * var5 >> 12;
                int var8 = this.field6834 * var6 >> 12;
                int var9 = var5 % (4096 / this.field6835) * this.field6835;
                int var10 = var6 % (4096 / this.field6834) * this.field6834;
                if (var10 < this.field6843) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field6843 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field6843 > var9) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
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

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIII)V")
    public static final void method2832(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class491.field6875.field3372 != arg1 && arg0 != 0 && class202.field2830 < 50 && ~arg3 != 0) {
            class233.field3289[class202.field2830++] = new class640((byte) 1, arg3, arg0, arg2, arg4, 0);
        }
        ++field6837;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBII)I")
    public static final int method2833(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg2 & 3;
        ++field6831;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return -arg0 + 1023;
        } else {
            return arg1 < 2 ? -61 : -arg3 + 1023;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILan;Lan;)I")
    public static final int method2834(int arg0, class21 arg1, class21 arg2) {
        if (arg0 != -12305) {
            method2829((byte) -104);
        }
        ++field6832;
        int var3 = 0;
        if (arg2.method221(class491.field6877, (byte) -57)) {
            ++var3;
        }
        if (arg2.method221(class176.field2518, (byte) 75)) {
            ++var3;
        }
        if (arg2.method221(class643.field9333, (byte) -64)) {
            ++var3;
        }
        if (arg1.method221(class491.field6877, (byte) 96)) {
            ++var3;
        }
        if (arg1.method221(class176.field2518, (byte) -73)) {
            ++var3;
        }
        if (arg1.method221(class643.field9333, (byte) -88)) {
            ++var3;
        }
        return var3;
    }
}
