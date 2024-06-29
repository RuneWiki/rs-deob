import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class class208 {

    @OriginalMember(owner = "client!md", name = "c", descriptor = "Leg;")
    public static class37 field3522 = class174.method1167("Regarder dans cette direction", -118);

    @OriginalMember(owner = "client!md", name = "f", descriptor = "Leg;")
    public static class37 field3525 = class174.method1167("Sprites geladen)3", 64);

    @OriginalMember(owner = "client!md", name = "k", descriptor = "Leg;")
    public static class37 field3530 = class174.method1167(",Mcran)2titre ouvert", 104);

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Lbf;")
    public static class202 field3521 = new class202(64);

    @OriginalMember(owner = "client!md", name = "m", descriptor = "S")
    public static short field3532 = 320;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public static int field3533 = 0;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public int field3520;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public int field3524;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public int field3526;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public int field3527;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public int field3528;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public int field3529;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static final void method1437(int arg0) {
        field3523++;
        if (arg0 >= -53) {
            return;
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class159.field2661 - 1; var2++) {
                if (class264.field4642[var2] < 1000 && class264.field4642[var2 + 1] > 1000) {
                    var1 = false;
                    class37 var3 = class160.field2663[var2];
                    class160.field2663[var2] = class160.field2663[var2 + 1];
                    class160.field2663[var2 + 1] = var3;
                    class37 var4 = class40.field645[var2];
                    class40.field645[var2] = class40.field645[var2 + 1];
                    class40.field645[var2 + 1] = var4;
                    int var5 = class26.field368[var2];
                    class26.field368[var2] = class26.field368[var2 + 1];
                    class26.field368[var2 + 1] = var5;
                    int var6 = class217.field3726[var2];
                    class217.field3726[var2] = class217.field3726[var2 + 1];
                    class217.field3726[var2 + 1] = var6;
                    short var7 = class264.field4642[var2];
                    class264.field4642[var2] = class264.field4642[var2 + 1];
                    class264.field4642[var2 + 1] = var7;
                    long var8 = class129.field2141[var2];
                    class129.field2141[var2] = class129.field2141[var2 + 1];
                    class129.field2141[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static final void method1438(byte arg0) {
        if (arg0 != 36) {
            return;
        }
        field3531++;
        for (int var1 = -1; var1 < class138.field2360; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class285.field5020[var1];
            }
            class188 var6 = class98.field1526[var5];
            if (var6 != null && var6.field1776 > 0) {
                var6.field1776--;
                if (var6.field1776 == 0) {
                    var6.field1832 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class46.field729; var2++) {
            int var3 = class98.field1525[var2];
            class163 var4 = class55.field833[var3];
            if (var4 != null && var4.field1776 > 0) {
                var4.field1776--;
                if (var4.field1776 == 0) {
                    var4.field1832 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V")
    public abstract void method109(int arg0, int arg1);

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public static void method1439(int arg0) {
        field3525 = null;
        if (arg0 == 1) {
            field3522 = null;
            field3530 = null;
            field3521 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)V")
    public abstract void method106(int arg0, int arg1, int arg2);
}
