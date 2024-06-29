import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class32 extends class513 {

    @OriginalMember(owner = "client!wv", name = "t", descriptor = "I")
    public int field657 = -1;

    @OriginalMember(owner = "client!wv", name = "q", descriptor = "I")
    public int field654 = 0;

    @OriginalMember(owner = "client!wv", name = "l", descriptor = "I")
    public static int field649 = 1;

    @OriginalMember(owner = "client!wv", name = "v", descriptor = "I")
    public static int field659 = 1;

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "I")
    public int field647;

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "I")
    public int field648;

    @OriginalMember(owner = "client!wv", name = "m", descriptor = "I")
    public int field650;

    @OriginalMember(owner = "client!wv", name = "n", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "client!wv", name = "o", descriptor = "I")
    public int field652;

    @OriginalMember(owner = "client!wv", name = "r", descriptor = "I")
    public int field655;

    @OriginalMember(owner = "client!wv", name = "s", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!wv", name = "u", descriptor = "I")
    public int field658;

    @OriginalMember(owner = "client!wv", name = "w", descriptor = "I")
    public int field660;

    @OriginalMember(owner = "client!wv", name = "x", descriptor = "I")
    public int field661;

    @OriginalMember(owner = "client!wv", name = "y", descriptor = "I")
    public int field662;

    @OriginalMember(owner = "client!wv", name = "p", descriptor = "Ljea;")
    public static class417 field653;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IILwt;)V", line = 3)
    public static final void method402(int arg0, int arg1, class282 arg2) {
        field656++;
        if (class244.field3334 >= 50 || arg2 == null || arg2.field3832 == null || arg2.field3832.length <= arg0 || arg2.field3832[arg0] == null) {
            return;
        }
        int var3 = arg2.field3832[arg0][0];
        int var4 = var3 >> 8;
        if (arg2.field3832[arg0].length > 1) {
            int var5 = (int) ((double) arg2.field3832[arg0].length * Math.random());
            if (var5 > 0) {
                var4 = arg2.field3832[arg0][var5];
            }
        }
        int var6 = (var3 & 0xFD) >> 5;
        int var7 = 256;
        if (arg2.field3842 != null && arg2.field3841 != null) {
            var7 = class576.method3368(arg2.field3842[arg0], arg2.field3841[arg0], false);
        }
        if (arg1 != -1830945624) {
            field659 = 49;
        }
        if (arg2.field3818) {
            class188.method1164(255, 0, var4, -1, false, var7, var6);
        } else {
            class6.method38((byte) 85, var4, 255, var7, 0, var6);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V", line = 47)
    public static void method403(int arg0) {
        int var1 = -88 % ((-arg0 - 74) / 34);
        field653 = null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)V", line = 59)
    public static final void method404(int arg0, int arg1) {
        class433 var2 = class281.field3808[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class433 var4 = class281.field3808[var3][arg0][arg1] = class281.field3808[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class182 var5 = var4.field6218; var5 != null; var5 = var5.field2226) {
                    class43 var6 = var5.field2227;
                    if (var6.field769 == arg0 && var6.field768 == arg1) {
                        var6.field532--;
                    }
                }
                if (var4.field6221 != null) {
                    var4.field6221.field532--;
                }
                if (var4.field6217 != null) {
                    var4.field6217.field532--;
                }
                if (var4.field6210 != null) {
                    var4.field6210.field532--;
                }
                if (var4.field6212 != null) {
                    var4.field6212.field532--;
                }
                if (var4.field6209 != null) {
                    var4.field6209.field532--;
                }
            }
        }
        if (class281.field3808[0][arg0][arg1] == null) {
            class281.field3808[0][arg0][arg1] = new class433(0);
            class281.field3808[0][arg0][arg1].field6205 = 1;
        }
        class281.field3808[0][arg0][arg1].field6207 = var2;
        class281.field3808[3][arg0][arg1] = null;
    }
}
