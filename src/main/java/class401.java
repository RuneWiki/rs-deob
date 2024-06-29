import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class401 {

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "Ldj;")
    public static class197 field5388 = new class197();

    @OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
    public static int field5391 = 1;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(BLet;)Lbo;", line = 3)
    public static final class245 method2257(byte arg0, class613 arg1) {
        field5390++;
        int var2 = 21 % ((arg0 + 12) / 51);
        class245 var3;
        if (class454.field6489 == null) {
            var3 = new class245();
        } else {
            var3 = class454.field6489;
            class454.field6489 = class454.field6489.field3027;
            class244.field3022--;
            var3.field3027 = null;
        }
        var3.field3029 = arg1;
        return var3;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)V", line = 25)
    public static final void method2258(int arg0) {
        field5387++;
        int[] var1 = new int[class19.field153.field522];
        int var2 = 0;
        for (int var3 = arg0; var3 < class19.field153.field522; var3++) {
            class487 var5 = class19.field153.method272(var3, -11824);
            if (var5.field7061 >= 0 || var5.field7055 >= 0) {
                var1[var2++] = var3;
            }
        }
        class300.field3733 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class300.field3733[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)V", line = 57)
    public static void method2259(int arg0) {
        if (arg0 > -50) {
            method2257((byte) -1, null);
        }
        field5388 = null;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lnp;Z)V", line = 77)
    public static final void method2260(class115 arg0, boolean arg1) {
        field5389++;
        int var2 = arg0.method662(true);
        class212.field2574 = new class504[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class212.field2574[var3] = new class504();
            class212.field2574[var3].field7265 = arg0.method662(true);
            class212.field2574[var3].field7264 = arg0.method655(552922456);
        }
        class267.field3330 = arg0.method662(true);
        class25.field224 = arg0.method662(!arg1);
        class217.field2619 = arg0.method662(true);
        class674.field9394 = new class130[class25.field224 + 1 - class267.field3330];
        for (int var4 = 0; var4 < class217.field2619; var4++) {
            int var5 = arg0.method662(!arg1);
            class130 var6 = class674.field9394[var5] = new class130();
            var6.field9798 = arg0.method620((byte) 14);
            var6.field9794 = arg0.method631(arg1);
            var6.field1468 = class267.field3330 + var5;
            var6.field1466 = arg0.method655(552922456);
            var6.field1461 = arg0.method655(552922456);
        }
        class647.field9125 = arg0.method631(arg1);
        class245.field3024 = true;
    }
}
