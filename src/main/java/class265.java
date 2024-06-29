import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class265 extends class61 {

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "Llc;")
    public class143 field4767;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "Llc;")
    public static class143 field4773 = class66.method374("Lade)3)3)3", -1);

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "Llc;")
    private static class143 field4771 = class66.method374("glow3:", -1);

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "Llc;")
    public static class143 field4770 = field4771;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public static int field4772 = 20;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "Llc;")
    public static class143 field4775 = field4771;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "[I")
    public static int[] field4766 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "Llc;")
    public static class143 field4776 = class66.method374("Wordpack geladen)3", -1);

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
    public static void method1766(byte arg0) {
        field4773 = null;
        field4771 = null;
        field4776 = null;
        int var1 = 105 / ((arg0 + 18) / 53);
        field4775 = null;
        field4770 = null;
        field4766 = null;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
    public class265() {
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIB)I")
    public static final int method1767(int arg0, int arg1, int arg2, byte arg3) {
        field4774++;
        int var4 = arg2 - 1 & arg1;
        int var5 = arg1 / arg2;
        int var6 = arg0 / arg2;
        int var7 = class153.method1010(false, var5, var6);
        int var8 = arg2 - 1 & arg0;
        int var9 = class153.method1010(false, var5 + 1, var6);
        if (arg3 != -39) {
            method1768(-22, 25);
        }
        int var10 = class153.method1010(false, var5, var6 + 1);
        int var11 = class153.method1010(false, var5 + 1, var6 + 1);
        int var12 = class50.method304(var7, var4, 0, var9, arg2);
        int var13 = class50.method304(var10, var4, 0, var11, arg2);
        return class50.method304(var12, var8, 0, var13, arg2);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V")
    public static final void method1768(int arg0, int arg1) {
        field4769++;
        if (arg0 == -1 && !class175.field3142) {
            class282.method1849(arg1 ^ 0xFFFFBFDB);
        } else if (arg0 != -1 && (class221.field4001 != arg0 || !client.method1513((byte) 71)) && class211.field3926 != 0 && !class175.field3142) {
            class167.method1104(class211.field3926, 0, arg0, false, 2, class278.field4911, arg1 + 16542);
        }
        if (arg1 != -16422) {
            field4775 = null;
        }
        class221.field4001 = arg0;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Llc;)V")
    public class265(class143 arg0) {
        this.field4767 = arg0;
    }
}
