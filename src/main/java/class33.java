import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class33 extends class139 {

    @OriginalMember(owner = "client!db", name = "db", descriptor = "I")
    private int field651 = 585;

    @OriginalMember(owner = "client!db", name = "U", descriptor = "I")
    public static int field642 = 0;

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "Lrf;")
    public static class163 field646 = class53.method392(-127, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!db", name = "ab", descriptor = "Lrf;")
    public static class163 field648 = class53.method392(-108, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "Lrf;")
    public static class163 field647 = class53.method392(-79, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!db", name = "V", descriptor = "Lrf;")
    public static class163 field643 = class53.method392(111, "sl_back");

    @OriginalMember(owner = "client!db", name = "hb", descriptor = "Lrf;")
    public static class163 field655 = class53.method392(-98, "null");

    @OriginalMember(owner = "client!db", name = "ib", descriptor = "Lrf;")
    private static class163 field656 = class53.method392(-114, "button near the top of that page)3");

    @OriginalMember(owner = "client!db", name = "fb", descriptor = "Lrf;")
    private static class163 field653 = class53.method392(-72, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!db", name = "eb", descriptor = "Lrf;")
    public static class163 field652 = class53.method392(-123, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!db", name = "gb", descriptor = "Lrf;")
    public static class163 field654 = field653;

    @OriginalMember(owner = "client!db", name = "bb", descriptor = "Lrf;")
    public static class163 field649 = field656;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!db", name = "W", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!db", name = "X", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!db", name = "cb", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        if (arg1 != 7451) {
            this.method64(16, -109, (class52) null);
        }
        int[] var3 = super.field2859.method1319(-116, arg0);
        if (super.field2859.field3966) {
            int var4 = class180.field3607[arg0];
            for (int var5 = 0; ~class23.field402 < ~var5; ++var5) {
                int var6 = class189.field3772[var5];
                if (var6 > this.field651 && ~(-this.field651 + 4096) < ~var6 && -this.field651 + 2048 < var4 && ~var4 > ~(this.field651 + 2048)) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field651 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (var6 > -this.field651 + 2048 && this.field651 + 2048 > var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field651;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field651 + 2048);
                } else if (var4 >= this.field651 && ~(4096 - this.field651) <= ~var4) {
                    if (~this.field651 >= ~var6 && 4096 - this.field651 >= var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (2048 - this.field651);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field651;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field651 + 2048);
                }
            }
        }
        ++field641;
        return var3;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    public class33() {
        super(0, true);
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(I)[Lpf;")
    public static final class145[] method214(int arg0) {
        class145[] var1 = new class145[class22.field386];
        for (int var2 = arg0; var2 < class22.field386; ++var2) {
            class145 var3 = new class145();
            var3.field2971 = class206.field4036;
            var3.field2973 = class81.field1639;
            var3.field2975 = class102.field2135[var2];
            var3.field2970 = class129.field2686[var2];
            var3.field2972 = class108.field2242[var2];
            var3.field2976 = class57.field1158[var2];
            var3.field2974 = class167.field3393;
            var3.field2977 = class202.field3980[var2];
            var1[var2] = var3;
        }
        class119.method814((byte) 125);
        ++field645;
        return var1;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(Z)V")
    public static void method215(boolean arg0) {
        field653 = null;
        field655 = null;
        field643 = null;
        if (!arg0) {
            method214(-91);
        }
        field646 = null;
        field656 = null;
        field654 = null;
        field649 = null;
        field648 = null;
        field652 = null;
        field647 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        ++field650;
        if (arg1 == 21) {
            if (~arg0 == -1) {
                this.field651 = arg2.method390((byte) 122);
            }
        }
    }
}
