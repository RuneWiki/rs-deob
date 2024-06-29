import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class676 {

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field9607;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field9608;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field9610;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "Ljava/lang/String;")
    public static String field9609;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z[BII)[B")
    public static final byte[] method3803(boolean arg0, byte[] arg1, int arg2, int arg3) {
        field9610++;
        if (arg0) {
            field9609 = null;
        }
        byte[] var4 = new byte[arg3];
        class692.method3873(arg1, arg2, var4, 0, arg3);
        return var4;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static final void method3804(int arg0) {
        field9608++;
        if (arg0 >= -73) {
            method3806(67);
        }
        if (class194.field3050) {
            return;
        }
        if (class527.field7429.field2675) {
            class27.field926 = ((int) class27.field926 - 17 & 0xFFFFFFF0);
        } else {
            class623.field9015 += (-class623.field9015 - 12.0F) / 2.0F;
        }
        class194.field3050 = true;
        class292.field4392 = true;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V")
    public static final void method3805(int arg0, int arg1) {
        field9607++;
        if (arg0 == -17) {
            class19 var2 = class373.method2355(arg0 + 108, arg1, 10);
            var2.method438(arg0 ^ 0xFFFFFCC9);
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
    public static void method3806(int arg0) {
        field9609 = null;
        if (arg0 <= 64) {
            field9609 = null;
        }
    }
}
