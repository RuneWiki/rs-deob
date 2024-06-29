import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class216 extends class137 {

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "Ltl;")
    public class255 field3569;

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!bj", name = "G", descriptor = "Ldk;")
    public static class251 field3566;

    @OriginalMember(owner = "client!bj", name = "K", descriptor = "Ldk;")
    public static class251 field3570;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "(I)V")
    public static void method1498(int arg0) {
        if (arg0 != 10830) {
            method1500(-45);
        }
        field3570 = null;
        field3566 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
    public static final void method1499(byte arg0) {
        field3567++;
        class213.field3529.method1255(-103);
        class72.field1214.method1255(-93);
        if (arg0 != -77) {
            method1499((byte) 124);
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Ltl;)V")
    public class216(class255 arg0) {
        this.field3569 = arg0;
    }

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "(I)V")
    public static final void method1500(int arg0) {
        field3568++;
        if (class208.field3298 != null) {
            class208.field3298.method974((byte) 118);
            class208.field3298 = null;
        }
        class201.method1407(7311);
        class206.method1445();
        for (int var1 = 0; var1 < 4; var1++) {
            class131.field2065[var1].method305(true);
        }
        class185.method1329(false, false);
        System.gc();
        class94.method652(arg0 ^ 0x658F, 2);
        class277.field4451 = false;
        class281.field4498 = -1;
        class119.method845(true, arg0 ^ 0x61);
        class276.field4438 = 0;
        class48.field801 = 0;
        class19.field226 = 0;
        class292.field4683 = false;
        class108.field1732 = arg0;
        for (int var2 = 0; var2 < client.field4852.length; var2++) {
            client.field4852[var2] = null;
        }
        class246.field3912 = 0;
        class13.field145 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class270.field4355[var3] = null;
            class131.field2069[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class12.field127[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class192.field3113[var5][var6][var7] = null;
                }
            }
        }
        class206.method1439(0);
        class128.field2018 = 0;
        class215.method1496(false);
        class241.method1620(true, 9083);
        try {
            class297.method1967(false, "loggedout", class268.field4323.field751);
        } catch (Throwable var8) {
        }
    }
}
