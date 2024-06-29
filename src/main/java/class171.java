import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class171 {

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field3127 = 0;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "[I")
    public static int[] field3128 = new int[5];

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "Lcc;")
    public static class209 field3129 = class95.method669(109, "Veuillez commencer par supprimer ");

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "Lcc;")
    public static class209 field3131 = class95.method669(117, "cookieprefix");

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "[Z")
    public static boolean[] field3136 = new boolean[8];

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "Lij;")
    public static class194 field3132 = null;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Lw;")
    public static class143 field3130;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "Lp;")
    public static class285 field3134;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)Z")
    public static final boolean method1183(int arg0) {
        int var1 = -121 % ((50 - arg0) / 50);
        field3126++;
        if (class181.field3284) {
            try {
                if ((Boolean) class112.field2260.method1463(class230.field4187.field2638, (byte) 110)) {
                    return false;
                }
                return true;
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
    public static void method1184(int arg0) {
        if (arg0 != 0) {
            method1184(54);
        }
        field3130 = null;
        field3132 = null;
        field3129 = null;
        field3136 = null;
        field3128 = null;
        field3134 = null;
        field3131 = null;
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V")
    public static final void method1185(int arg0) {
        for (int var1 = 0; var1 < class113.field2275; var1++) {
            class199 var2 = class78.method547(var1, 16);
            if (var2 != null && var2.field3567 == 0) {
                class284.field4997[var1] = 0;
                class38.field647[var1] = 0;
            }
        }
        if (arg0 != -6858) {
            method1187(-122, 97);
        }
        class94.field1859 = new class255(16);
        field3133++;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lsj;I)V")
    public static final void method1186(class49 arg0, int arg1) {
        field3135++;
        class153.field2769 = arg0;
        if (arg1 != -123) {
            method1187(32, 28);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)Z")
    public static final boolean method1187(int arg0, int arg1) {
        int var2 = -35 / ((arg1 + 59) / 57);
        field3137++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }
}
