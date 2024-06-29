import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class438 {

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "[Ljb;")
    private class422[] field5846 = null;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "[Ljb;")
    public class422[] field5852 = null;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "Lvi;")
    public class462 field5850 = null;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "Z")
    public boolean field5849;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "[Z")
    public static boolean[] field5854;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V")
    public static void method2551(byte arg0) {
        int var1 = -97 / ((arg0 - 66) / 36);
        field5854 = null;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2552(int arg0, String arg1) {
        field5851++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = arg0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(B)V")
    public static final void method2553(byte arg0) {
        field5848++;
        if (class190.field2830) {
            return;
        }
        class190.field2830 = true;
        if (arg0 <= 30) {
            method2554(null, true, (byte) 75, null);
        }
        if (class56.field668.field6852) {
            class278.field3902 = ((int) class278.field3902 - 17 & 0xFFFFFFF0);
        } else {
            class92.field1389 += (-12.0F - class92.field1389) / 2.0F;
        }
        class24.field226 = true;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Ljava/lang/String;ZBLra;)V")
    public static final void method2554(String arg0, boolean arg1, byte arg2, class92 arg3) {
        field5853++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class643.field9365.method2125(arg0, null, 250, false);
        int var8 = class643.field9365.method2128(null, 250, 0, arg0) * 13;
        class99.field1445.method498(var5 - var4, -var4 + var6, var4 + var7 + var4, var4 + var8 + var4, -16777216, 0);
        class99.field1445.method445(var5 - var4, var6 - var4, var4 + var7 + var4, var4 + var8 + var4, -1, 0);
        arg3.method717(null, var7, var8, 0, 0, -1, null, var5, null, -1, 1, (byte) 41, 1, 0, var6, arg0);
        if (arg2 != -26) {
            field5847 = -10;
        }
        class118.method852(var5 - var4, -var4 + var6, var4 + var8 + var4, var4 + var7 - -var4, true);
        if (arg1) {
            try {
                class99.field1445.method493();
            } catch (class416 var9) {
            }
        }
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lcb;)V")
    public class438(class444 arg0) {
        this.field5849 = arg0.field6141;
        if (this.field5849 && !arg0.method2583(0, class540.field8108, class194.field2874)) {
            this.field5849 = false;
        }
        if (this.field5849 || arg0.method2633((byte) 124, class194.field2874, class540.field8108)) {
            class449.method2714(128);
            if (this.field5849) {
                byte[] var2 = class585.method3481(0, class332.field4598, false);
                this.field5850 = arg0.method2568(class540.field8108, 128, 128, 16, 0, var2);
                byte[] var3 = class585.method3481(0, class453.field6397, false);
                arg0.method2568(class540.field8108, 128, 128, 16, 0, var3);
            } else {
                this.field5852 = new class422[16];
                for (int var4 = 0; var4 < 16; var4++) {
                    byte[] var7 = class515.method3052(var4 * 128 * 128 * 2, class332.field4598, 32768, 244);
                    this.field5852[var4] = arg0.method2622(true, 128, 3000, var7, 128, class540.field8108);
                }
                this.field5846 = new class422[16];
                for (int var5 = 0; var5 < 16; var5++) {
                    byte[] var6 = class515.method3052(var5 * 128 * 128 * 2, class453.field6397, 32768, 244);
                    this.field5846[var5] = arg0.method2622(true, 128, 3000, var6, 128, class540.field8108);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)Z")
    public final boolean method2555(boolean arg0) {
        if (!arg0) {
            method2554(null, true, (byte) -30, null);
        }
        field5845++;
        if (this.field5849) {
            return this.field5850 != null;
        } else {
            return this.field5852 != null;
        }
    }
}
