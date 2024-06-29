import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class129 {

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public int field2829 = -1;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Lgg;")
    public static class63 field2817 = class116.method911(43, "lila:");

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field2821 = 0;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "Lgg;")
    private static class63 field2822 = class116.method911(43, "K");

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Lgg;")
    public static class63 field2818 = class116.method911(43, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Lgg;")
    public static class63 field2819 = field2822;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Lgg;")
    public static class63 field2825 = field2822;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "Lgg;")
    public static class63 field2831 = class116.method911(43, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Ln;")
    public class117 field2824;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "Lje;")
    public static class87 field2826;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "[I")
    public int[] field2815;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "[Lgg;")
    public class63[] field2828;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Lhg;")
    public static final class72 method956(int arg0, int arg1) {
        field2816++;
        class72 var2 = (class72) class34.field810.method289((long) arg0, -130079263);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class56.field1481.method745(arg1, arg0, 0);
        class72 var4 = new class72();
        if (var3 != null) {
            var4.method673(arg1 - 13, new class3(var3));
        }
        class34.field810.method293(false, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljc;Ljc;I)V")
    public static final void method957(class85 arg0, class85 arg1, int arg2) {
        field2823++;
        if (arg2 != 32526) {
            method956(-19, 82);
        }
        class15.field370 = arg0;
        class94.field2258 = arg1;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([BIII)Lgg;")
    public static final class63 method958(byte[] arg0, int arg1, int arg2, int arg3) {
        int var4 = -42 / ((-arg3 - 28) / 59);
        field2827++;
        class63 var5 = new class63();
        var5.field1628 = 0;
        var5.field1602 = new byte[arg2];
        for (int var6 = arg1; var6 < arg1 + arg2; var6++) {
            if (arg0[var6] != 0) {
                var5.field1602[var5.field1628++] = arg0[var6];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZB)V")
    public static final void method959(boolean arg0, byte arg1) {
        field2830++;
        if (arg1 != -112 || class158.field3275 == null) {
            return;
        }
        try {
            class3 var2 = new class3(4);
            var2.method66(2, arg0 ? 2 : 3);
            var2.method57(3, 0);
            class158.field3275.method512(0, 4, var2.field48, (byte) -96);
        } catch (IOException var4) {
            try {
                class158.field3275.method509(true);
            } catch (Exception var3) {
            }
            class158.field3275 = null;
            class174.field3581++;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method960(int arg0) {
        field2817 = null;
        field2825 = null;
        field2826 = null;
        field2818 = null;
        if (arg0 != -29409) {
            field2826 = null;
        }
        field2822 = null;
        field2819 = null;
        field2831 = null;
    }
}
