import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class574 extends class145 {

    @OriginalMember(owner = "client!dv", name = "H", descriptor = "I")
    private int field8281 = 4096;

    @OriginalMember(owner = "client!dv", name = "G", descriptor = "I")
    private int field8280 = 0;

    @OriginalMember(owner = "client!dv", name = "J", descriptor = "Lea;")
    public static class474 field8283 = new class474("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!dv", name = "K", descriptor = "[I")
    public static int[] field8284 = new int[5];

    @OriginalMember(owner = "client!dv", name = "M", descriptor = "Lig;")
    public static class206 field8286 = new class206(89, 0);

    @OriginalMember(owner = "client!dv", name = "O", descriptor = "[I")
    public static int[] field8288 = new int[500];

    @OriginalMember(owner = "client!dv", name = "N", descriptor = "Ljava/lang/String;")
    public static String field8287 = null;

    @OriginalMember(owner = "client!dv", name = "P", descriptor = "Lsc;")
    public static class293 field8289 = new class293(8);

    @OriginalMember(owner = "client!dv", name = "F", descriptor = "I")
    public static int field8279;

    @OriginalMember(owner = "client!dv", name = "I", descriptor = "I")
    public static int field8282;

    @OriginalMember(owner = "client!dv", name = "Q", descriptor = "Lvp;")
    public static class162 field8290;

    @OriginalMember(owner = "client!dv", name = "L", descriptor = "Lgh;")
    public static class476 field8285;

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "()V")
    public class574() {
        super(1, true);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)V")
    public static void method3337(byte arg0) {
        field8290 = null;
        field8287 = null;
        field8285 = null;
        field8284 = null;
        field8283 = null;
        field8289 = null;
        field8286 = null;
        if (arg0 > -30) {
            field8289 = null;
        }
        field8288 = null;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZI)[I")
    public final int[] method27(boolean arg0, int arg1) {
        ++field8279;
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (super.field1779.field4602) {
            int[] var4 = this.method865(0, arg1, (byte) -55);
            for (int var5 = 0; ~class647.field9368 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field8280 <= var6 && ~var6 >= ~this.field8281 ? 4096 : 0;
            }
        }
        if (arg0) {
            field8283 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IILrt;)V")
    public final void method28(int arg0, int arg1, class194 arg2) {
        if (arg1 > -67) {
            field8286 = null;
        }
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field8281 = arg2.method1220(111);
            }
        } else {
            this.field8280 = arg2.method1220(122);
        }
        ++field8282;
    }
}
