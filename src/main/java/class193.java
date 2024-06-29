import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class193 {

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public int field2826 = 128;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
    public int field2831 = 128;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
    public int field2828;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public int field2823;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
    public int field2830;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
    public int field2833;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "[Lse;")
    public static class167[] field2821 = new class167[32768];

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "Lki;")
    public static class498 field2825 = new class498(12, 8);

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    public static int field2832 = 0;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "I")
    public static int field2829;

    static {
        new class475("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)V", line = 7)
    public static final void method1304(boolean arg0) {
        field2824++;
        for (class214 var1 = (class214) class100.field1459.method816(118); var1 != null; var1 = (class214) class100.field1459.method812(103)) {
            class417 var2 = var1.field3121;
            if (var2.field6256) {
                var1.method2049(-50);
                var2.method2498(false);
            } else if (var2.field6249 <= class317.field4559) {
                var2.method2503(0, class500.field7364);
                if (var2.field6256) {
                    var1.method2049(-63);
                } else {
                    class114.method758(var2, true);
                }
            }
        }
        if (arg0) {
            method1307(78, null);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)Leo;", line = 44)
    public final class193 method1305(byte arg0) {
        field2827++;
        int var2 = -122 % ((-arg0 - 62) / 46);
        return new class193(this.field2828, this.field2831, this.field2826, this.field2823, this.field2830, this.field2833);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V", line = 58)
    public static void method1306(int arg0) {
        if (arg0 == 5199) {
            field2821 = null;
            field2825 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I[S)[S", line = 69)
    public static final short[] method1307(int arg0, short[] arg1) {
        field2829++;
        if (arg0 < 9) {
            method1304(true);
        }
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class520.method3077(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILeo;)V", line = 87)
    public final void method1308(int arg0, class193 arg1) {
        this.field2828 = arg1.field2828;
        this.field2826 = arg1.field2826;
        field2822++;
        this.field2823 = arg1.field2823;
        this.field2830 = arg1.field2830;
        this.field2833 = arg1.field2833;
        if (arg0 != 12) {
            field2832 = 36;
        }
        this.field2831 = arg1.field2831;
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(I)V", line = 125)
    public class193(int arg0) {
        this.field2828 = arg0;
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(IIIIII)V", line = 132)
    private class193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2831 = arg1;
        this.field2823 = arg3;
        this.field2830 = arg4;
        this.field2833 = arg5;
        this.field2828 = arg0;
        this.field2826 = arg2;
    }
}
