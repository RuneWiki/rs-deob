import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class141 extends class136 {

    @OriginalMember(owner = "client!eq", name = "H", descriptor = "Lpn;")
    public static class523 field1994 = new class523("", 12);

    @OriginalMember(owner = "client!eq", name = "I", descriptor = "Lgk;")
    public static class331 field1995 = new class331("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!eq", name = "K", descriptor = "[I")
    public static int[] field1997 = new int[1000];

    @OriginalMember(owner = "client!eq", name = "L", descriptor = "Lgk;")
    public static class331 field1998 = new class331("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!eq", name = "C", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!eq", name = "D", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!eq", name = "E", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!eq", name = "F", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!eq", name = "G", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!eq", name = "M", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!eq", name = "N", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!eq", name = "J", descriptor = "[[I")
    public static int[][] field1996;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IILuu;I)V", line = 7)
    public static final void method1051(int arg0, int arg1, class188 arg2, int arg3) {
        ++field1990;
        if (class134.field1943 == null && !class500.field7415) {
            if (arg2 != null && class232.method1556(arg0 + 3547, arg2) != null) {
                class134.field1943 = arg2;
                class326.field4577 = class232.method1556(3547, arg2);
                class203.field2948 = arg1;
                class367.field5456 = arg0;
                class432.field6353 = arg3;
                class20.field234 = false;
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Luu;I)V", line = 26)
    public static final void method1052(class188 arg0, int arg1) {
        ++field1991;
        if (arg1 == 18804) {
            if (class513.field7567 == arg0.field2732) {
                if (class435.field6375.field5074 == null) {
                    arg0.field2741 = 0;
                    arg0.field2622 = 0;
                } else {
                    arg0.field2735 = 150;
                    arg0.field2764 = 2047 & (int) (256.0D * Math.sin((double) class263.field3867 / 40.0D));
                    arg0.field2651 = 5;
                    arg0.field2622 = class396.field5815;
                    arg0.field2741 = class80.method727((byte) -93, class435.field6375.field5074);
                    arg0.field2628 = class435.field6375.field1715;
                    arg0.field2686 = class435.field6375.field1690;
                    arg0.field2705 = 0;
                    arg0.field2639 = class435.field6375.field1763;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(B)V", line = 63)
    public static void method1053(byte arg0) {
        field1997 = null;
        field1994 = null;
        field1996 = null;
        if (arg0 < 8) {
            method1051(-65, 91, (class188) null, 33);
        }
        field1995 = null;
        field1998 = null;
    }

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "(I)V", line = 77)
    public static final void method1054(int arg0) {
        ++field1993;
        for (class289 var1 = (class289) class372.field5532.method1018(40); var1 != null; var1 = (class289) class372.field5532.method1022((byte) -112)) {
            class107 var2 = var1.field4158;
            if (class525.field7714 == var2.field6328 && ~var2.field1494 <= ~class263.field3867) {
                if (~var2.field1520 >= ~class263.field3867) {
                    if (~var2.field1505 < -1) {
                        class461 var3 = class250.field3690[var2.field1505 - 1];
                        if (var3 != null && ~var3.field6335 <= -1 && ~(class397.field5828 * 128) < ~var3.field6335 && ~var3.field6334 <= -1 && ~(class457.field6713 * 128) < ~var3.field6334) {
                            var2.method888(class263.field3867, var3.field6335, class66.method643(var3.field6335, 86, var2.field6328, var3.field6334) - var2.field1504, var3.field6334, 16);
                        }
                    }
                    if (var2.field1505 < 0) {
                        int var4 = -var2.field1505 + -1;
                        class364 var5;
                        if (~class396.field5815 == ~var4) {
                            var5 = class435.field6375;
                        } else {
                            var5 = class384.field5647[var4];
                        }
                        if (var5 != null && ~var5.field6335 <= -1 && var5.field6335 < class397.field5828 * 128 && ~var5.field6334 <= -1 && var5.field6334 < class457.field6713 * 128) {
                            var2.method888(class263.field3867, var5.field6335, class66.method643(var5.field6335, arg0 ^ 25961, var2.field6328, var5.field6334) - var2.field1504, var5.field6334, 71);
                        }
                    }
                    var2.method889((byte) -51, class406.field6056);
                    class322.method1989(var2, true);
                }
            } else {
                var1.method1525((byte) 116);
                var2.method884((byte) -105);
            }
        }
        if (arg0 != 25861) {
            field1996 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V", line = 135)
    public class141() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILjava/lang/String;)J", line = 138)
    public static final long method1055(int arg0, String arg1) {
        ++field1992;
        long var2 = 0L;
        int var4 = arg1.length();
        if (arg0 != 1) {
            method1055(-9, (String) null);
        }
        for (int var5 = 0; ~var4 < ~var5; ++var5) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (~var6 <= -66 && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (~var6 <= -49 && ~var6 >= -58) {
                var2 += (long) (var6 + -48 + 27);
            }
            if (~var2 <= -177917621779460414L) {
                break;
            }
        }
        while (~(var2 % 37L) == -1L && ~var2 != -1L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)[I", line = 182)
    public final int[] method82(int arg0, int arg1) {
        ++field1989;
        int[] var3 = super.field1957.method2887((byte) -112, arg1);
        if (super.field1957.field7031) {
            class201.method1409(var3, 0, class467.field6889, class290.field4168[arg1]);
        }
        int var4 = -55 / ((67 - arg0) / 50);
        return var3;
    }
}
