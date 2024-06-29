import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class258 {

    @OriginalMember(owner = "client!ada", name = "m", descriptor = "I")
    public int field3775 = class535.method3149((byte) -50);

    @OriginalMember(owner = "client!ada", name = "n", descriptor = "I")
    public int field3776;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "Ljava/lang/String;")
    public String field3763;

    @OriginalMember(owner = "client!ada", name = "l", descriptor = "I")
    public int field3774;

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "I")
    public int field3764;

    @OriginalMember(owner = "client!ada", name = "h", descriptor = "Ljava/lang/String;")
    public String field3770;

    @OriginalMember(owner = "client!ada", name = "e", descriptor = "I")
    public int field3767;

    @OriginalMember(owner = "client!ada", name = "d", descriptor = "Ljava/lang/String;")
    public String field3766;

    @OriginalMember(owner = "client!ada", name = "k", descriptor = "Ljava/lang/String;")
    public String field3773;

    @OriginalMember(owner = "client!ada", name = "f", descriptor = "[I")
    public static int[] field3768 = new int[8];

    @OriginalMember(owner = "client!ada", name = "i", descriptor = "[I")
    public static int[] field3771 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!ada", name = "p", descriptor = "[I")
    public static int[] field3778 = new int[4096];

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!ada", name = "g", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!ada", name = "j", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!ada", name = "o", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!ada", name = "q", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(FFIF)F", line = 6)
    public static final float method1626(float arg0, float arg1, int arg2, float arg3) {
        field3779++;
        if (arg2 != 4096) {
            method1628(true, null);
        }
        return (arg0 - arg3) * arg1 + arg3;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;BILjava/lang/String;Ljava/lang/String;)V", line = 18)
    public final void method1627(int arg0, int arg1, String arg2, String arg3, byte arg4, int arg5, String arg6, String arg7) {
        this.field3775 = class535.method3149((byte) -103);
        field3765++;
        if (arg4 != -26) {
            return;
        }
        this.field3763 = arg2;
        this.field3770 = arg3;
        this.field3764 = class576.field8505;
        this.field3774 = arg0;
        this.field3773 = arg6;
        this.field3766 = arg7;
        this.field3776 = arg5;
        this.field3767 = arg1;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(ZLjava/lang/String;)Z", line = 39)
    public static final boolean method1628(boolean arg0, String arg1) {
        field3769++;
        return arg0 ? class63.method396(true, 0, 10, arg1) : true;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(II)Lrb;", line = 56)
    public static final class352 method1629(int arg0, int arg1) {
        field3772++;
        class352[] var2 = class463.method2747(false);
        int var3 = -3 / ((72 - arg0) / 51);
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4].field5122 == arg1) {
                return var2[var4];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)V", line = 94)
    public static void method1630(int arg0) {
        field3778 = null;
        field3768 = null;
        field3771 = null;
        if (arg0 != -11956) {
            field3771 = null;
        }
    }

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 111)
    public class258(int arg0, int arg1, String arg2, String arg3, String arg4, int arg5, String arg6) {
        this.field3776 = arg5;
        this.field3763 = arg4;
        this.field3774 = arg0;
        this.field3764 = class576.field8505;
        this.field3770 = arg3;
        this.field3767 = arg1;
        this.field3766 = arg6;
        this.field3773 = arg2;
    }
}
