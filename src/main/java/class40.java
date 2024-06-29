import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class40 {

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    private int field745 = 0;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "Lkd;")
    private class204 field743;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "[C")
    public static char[] field748 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field746 = -1;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "Laf;")
    public static class68 field747 = new class68(4);

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "Lel;")
    private class202 field750;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "[Ld;")
    public static class238[] field753;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "[[I")
    public static int[][] field751;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)Lel;")
    public final class202 method347(int arg0) {
        this.field745 = 0;
        if (arg0 < 48) {
            method348(-77, 70L, (short) 119, (String) null, 76, -31, (String) null, false);
        }
        field749++;
        return this.method349(-18635);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IJSLjava/lang/String;IILjava/lang/String;Z)V")
    public static final void method348(int arg0, long arg1, short arg2, String arg3, int arg4, int arg5, String arg6, boolean arg7) {
        if (!arg7) {
            method350(15);
        }
        field744++;
        if (class199.field3181 || class205.field3291 >= 500) {
            return;
        }
        class7.field88[class205.field3291] = arg3;
        class113.field1893[class205.field3291] = arg6;
        class6.field75[class205.field3291] = arg5 == -1 ? class67.field1111 : arg5;
        class279.field4427[class205.field3291] = arg2;
        class214.field3506[class205.field3291] = arg1;
        class253.field4035[class205.field3291] = arg4;
        class200.field3190[class205.field3291] = arg0;
        class205.field3291++;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)Lel;")
    public final class202 method349(int arg0) {
        field752++;
        if (arg0 != -18635) {
            this.method349(-9);
        }
        if (this.field745 > 0 && this.field743.field3270[this.field745 - 1] != this.field750) {
            class202 var2 = this.field750;
            this.field750 = var2.field3245;
            return var2;
        }
        while (this.field745 < this.field743.field3277) {
            class202 var3 = this.field743.field3270[this.field745++].field3245;
            if (this.field743.field3270[this.field745 - 1] != var3) {
                this.field750 = var3.field3245;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V")
    public static void method350(int arg0) {
        if (arg0 >= -7) {
            method350(-115);
        }
        field747 = null;
        field748 = null;
        field751 = null;
        field753 = null;
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lkd;)V")
    public class40(class204 arg0) {
        this.field743 = arg0;
    }
}
