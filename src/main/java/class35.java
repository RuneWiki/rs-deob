import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class35 extends class134 {

    @OriginalMember(owner = "client!ef", name = "cb", descriptor = "I")
    public int field973 = 0;

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "Lwd;")
    public static class150 field964 = class2.method9(true, "Titelbild geladen)3");

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "Lof;")
    public static class103 field961 = new class103();

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "Lwd;")
    public static class150 field971 = class2.method9(true, ":  ");

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "Lwd;")
    public static class150 field966 = class2.method9(true, "title_mute");

    @OriginalMember(owner = "client!ef", name = "gb", descriptor = "[I")
    public static int[] field977 = new int[5];

    @OriginalMember(owner = "client!ef", name = "hb", descriptor = "Lwd;")
    private static class150 field978 = class2.method9(true, "Loaded gamescreen");

    @OriginalMember(owner = "client!ef", name = "fb", descriptor = "Lwd;")
    public static class150 field976 = field978;

    @OriginalMember(owner = "client!ef", name = "eb", descriptor = "Lwc;")
    public static class149 field975 = new class149();

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!ef", name = "bb", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!ef", name = "db", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!ef", name = "ib", descriptor = "Lce;")
    public static class20 field979;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[Lwd;)[Lwd;")
    public static final class150[] method266(int arg0, class150[] arg1) {
        field967++;
        class150[] var2 = new class150[arg0];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class111.method786((byte) -118, new class150[] { class29.method239(1000, var3), class73.field1813 });
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class111.method786((byte) -127, new class150[] { var2[var3], arg1[var3] });
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)Z")
    public static final boolean method267(int arg0, int arg1, int arg2) {
        field972++;
        if (arg1 == arg2 && class134.field3161 == arg0) {
            return true;
        } else if (arg1 == 1 && class144.field3482 == arg0) {
            return true;
        } else {
            return (arg1 == 2 || arg1 == 3) && class112.field2585 == arg0;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lwb;B)V")
    public final void method268(class148 arg0, byte arg1) {
        field969++;
        int var3 = 56 % ((arg1 - 35) / 34);
        while (true) {
            int var4 = arg0.method1137(255);
            if (var4 == 0) {
                return;
            }
            this.method270(2, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
    public static void method269(int arg0) {
        field961 = null;
        field975 = null;
        field979 = null;
        field977 = null;
        field978 = null;
        field976 = null;
        field966 = null;
        field964 = null;
        if (arg0 >= 4) {
            field971 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILwb;I)V")
    private final void method270(int arg0, class148 arg1, int arg2) {
        if (arg0 == arg2) {
            this.field973 = arg1.method1140(-1);
        }
        field965++;
    }
}
