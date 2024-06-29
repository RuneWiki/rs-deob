import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class29 extends class7 {

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "I")
    private int field560 = 585;

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "Lob;")
    public static class141 field557 = class175.method1195(40, "mapdots");

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "Lob;")
    public static class141 field561 = class175.method1195(40, "::");

    @OriginalMember(owner = "client!ch", name = "Z", descriptor = "Z")
    public static boolean field565 = true;

    @OriginalMember(owner = "client!ch", name = "ab", descriptor = "Lob;")
    private static class141 field566 = class175.method1195(40, "Attack");

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "Lob;")
    public static class141 field564 = field566;

    @OriginalMember(owner = "client!ch", name = "bb", descriptor = "I")
    public static int field567 = 0;

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "Lvc;")
    public static class212 field558 = new class212(128);

    @OriginalMember(owner = "client!ch", name = "cb", descriptor = "I")
    public static int field568 = 0;

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "Lph;")
    public static class157 field562;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        if (~arg0 == -1) {
            this.field560 = arg2.method1007(122);
        }
        int var5 = 84 / ((66 - arg1) / 57);
        ++field563;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        if (arg0 < 13) {
            this.method30((byte) 29, -102);
        }
        ++field559;
        int[] var3 = super.field100.method842(arg1, 12);
        if (super.field100.field2534) {
            int var4 = class177.field3503[arg1];
            for (int var5 = 0; ~class117.field2272 < ~var5; ++var5) {
                int var6 = class15.field272[var5];
                if (~this.field560 > ~var6 && -this.field560 + 4096 > var6 && ~(2048 - this.field560) > ~var4 && ~(this.field560 + 2048) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field560);
                    var3[var5] = 4096 - var10;
                } else if (~var6 < ~(2048 - this.field560) && var6 < this.field560 + 2048) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 <= -1 ? var11 : -var11;
                    int var13 = var12 - this.field560;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field560 + 2048);
                } else if (~this.field560 >= ~var4 && ~var4 >= ~(-this.field560 + 4096)) {
                    if (~this.field560 >= ~var6 && -this.field560 + 4096 >= var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = ~var15 <= -1 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field560 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field560;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field560 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    public class29() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V")
    public static void method205(byte arg0) {
        field564 = null;
        field561 = null;
        field557 = null;
        field566 = null;
        field562 = null;
        field558 = null;
        if (arg0 != -33) {
            method205((byte) 39);
        }
    }
}
