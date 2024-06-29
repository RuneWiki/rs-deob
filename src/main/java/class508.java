import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class508 {

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "I")
    public static int field6779;

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "Luk;")
    public static class263 field6778;

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "Lvfa;")
    public static class672 field6777;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V", line = 7)
    public static final void method2851(int arg0) {
        field6776++;
        try {
            if (class320.field4576 == 1) {
                int var1 = class566.field7445.method39(true);
                if (var1 > 0 && class566.field7445.method36(100)) {
                    int var2 = var1 - class670.field9141;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class566.field7445.method34(true, var2);
                    return;
                }
                class566.field7445.method41(2064);
                class566.field7445.method30(12865);
                class574.field7537 = null;
                class422.field5819 = null;
                if (class556.field7305 == null) {
                    class320.field4576 = 0;
                } else {
                    class320.field4576 = 2;
                }
            }
            if (arg0 < -74 && class320.field4576 == 3) {
                int var3 = class566.field7445.method39(true);
                if (class175.field2641 > var3 && class566.field7445.method36(100)) {
                    int var4 = class506.field6765 + var3;
                    if (class175.field2641 < var4) {
                        var4 = class175.field2641;
                    }
                    class566.field7445.method34(true, var4);
                } else {
                    class506.field6765 = 0;
                    class320.field4576 = 0;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class566.field7445.method41(2064);
            class556.field7305 = null;
            class320.field4576 = 0;
            class422.field5819 = null;
            class577.field7577 = null;
            class574.field7537 = null;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)V", line = 78)
    public static void method2852(byte arg0) {
        field6777 = null;
        field6778 = null;
        int var1 = 90 % ((arg0 - 58) / 57);
    }
}
