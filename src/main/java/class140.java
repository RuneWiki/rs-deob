import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class140 extends class175 {

    @OriginalMember(owner = "client!ah", name = "ab", descriptor = "I")
    private int field2511 = 585;

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "Z")
    public static boolean field2503 = true;

    @OriginalMember(owner = "client!ah", name = "X", descriptor = "I")
    public static int field2508 = 1;

    @OriginalMember(owner = "client!ah", name = "bb", descriptor = "I")
    public static int field2512 = 0;

    @OriginalMember(owner = "client!ah", name = "T", descriptor = "I")
    public static int field2504 = 0;

    @OriginalMember(owner = "client!ah", name = "db", descriptor = "[Lrg;")
    public static class239[] field2514 = new class239[2048];

    @OriginalMember(owner = "client!ah", name = "U", descriptor = "Lhe;")
    public static class136 field2505 = new class136(5000);

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!ah", name = "V", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!ah", name = "W", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!ah", name = "Y", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!ah", name = "Z", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!ah", name = "cb", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!ah", name = "R", descriptor = "[Lmj;")
    public static class246[] field2502;

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
    public class140() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        int var4 = 126 % ((-22 - arg0) / 58);
        if (~arg1 == -1) {
            this.field2511 = arg2.method1663((byte) 127);
        }
        ++field2509;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(Z)V")
    public static void method1040(boolean arg0) {
        field2505 = null;
        field2502 = null;
        if (!arg0) {
            field2514 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        int var3 = -48 / ((arg0 - 62) / 54);
        ++field2510;
        int[] var4 = super.field3044.method904((byte) -104, arg1);
        if (super.field3044.field2150) {
            int var5 = class23.field395[arg1];
            for (int var6 = 0; var6 < class1.field11; ++var6) {
                int var7 = class244.field4240[var6];
                if (this.field2511 < var7 && var7 < -this.field2511 + 4096 && -this.field2511 + 2048 < var5 && this.field2511 + 2048 > var5) {
                    int var8 = -var7 + 2048;
                    int var9 = var8 < 0 ? -var8 : var8;
                    int var10 = var9 << 12;
                    int var11 = var10 / (2048 - this.field2511);
                    var4[var6] = -var11 + 4096;
                } else if (~(2048 - this.field2511) > ~var7 && ~var7 > ~(this.field2511 + 2048)) {
                    int var12 = var5 - 2048;
                    int var13 = ~var12 <= -1 ? var12 : -var12;
                    int var14 = var13 - this.field2511;
                    int var15 = var14 << 12;
                    var4[var6] = var15 / (-this.field2511 + 2048);
                } else if (var5 >= this.field2511 && var5 <= 4096 - this.field2511) {
                    if (var7 >= this.field2511 && -this.field2511 + 4096 >= var7) {
                        var4[var6] = 0;
                    } else {
                        int var16 = 2048 - var5;
                        int var17 = ~var16 > -1 ? -var16 : var16;
                        int var18 = var17 << 12;
                        int var19 = var18 / (-this.field2511 + 2048);
                        var4[var6] = -var19 + 4096;
                    }
                } else {
                    int var20 = var7 + -2048;
                    int var21 = ~var20 > -1 ? -var20 : var20;
                    int var22 = var21 - this.field2511;
                    int var23 = var22 << 12;
                    var4[var6] = var23 / (-this.field2511 + 2048);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)I")
    public static final int method1041(int arg0, int arg1) {
        ++field2506;
        if (arg1 != 32677) {
            method1040(true);
        }
        return arg0 >> 11 & 127;
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(B)V")
    public static final void method1042(byte arg0) {
        if (arg0 == -74) {
            ++field2507;
            class269.field4691.method83(0);
        }
    }
}
