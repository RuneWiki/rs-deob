import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class550 {

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field7910 = new String[100];

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "Loo;")
    public static class652 field7901 = new class652(30);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public int field7897;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public static int field7898;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public int field7899;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    public int field7900;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field7902;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public static int field7903;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
    public static int field7904;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
    public int field7905;

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public int field7906;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
    public int field7907;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    public int field7908;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "I")
    public int field7909;

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
    public int field7911;

    @OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
    public int field7912;

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
    public int field7913;

    @OriginalMember(owner = "client!hr", name = "r", descriptor = "I")
    public int field7914;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V")
    public static void method3282(byte arg0) {
        field7901 = null;
        field7910 = null;
        if (arg0 >= -104) {
            field7901 = null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
    public static final void method3283(int arg0) {
        field7902++;
        if (arg0 != -513) {
            return;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class768.field10571; var2++) {
            for (int var3 = 0; var3 < class350.field4898; var3++) {
                if (class559.method3304(var2, class767.field10562, var1, 58, true, var3)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZIZI)V")
    public static final void method3284(int arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        field7904++;
        class289.method1858(class386.field5355.length - 1, arg2, arg4, arg0, (byte) 46, arg1, arg3);
        class548.field7879 = 0;
        class212.field3297 = null;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)V")
    public static final void method3285(int arg0) {
        if (arg0 <= 20) {
            method3282((byte) 121);
        }
        field7903++;
        class647.field9055 = true;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILhr;)Z")
    public final boolean method3286(int arg0, class550 arg1) {
        field7898++;
        if (arg0 != 100) {
            this.field7897 = -30;
        }
        return this.field7908 == arg1.field7908 && this.field7906 == arg1.field7906 && this.field7913 == arg1.field7913;
    }
}
