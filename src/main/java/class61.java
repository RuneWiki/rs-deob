import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class61 {

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field782 = 1;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "Z")
    public static boolean field784 = false;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field781 = 50;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "[I")
    public static int[] field780 = new int[field781];

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "[I")
    public static int[] field794 = new int[field781];

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "[I")
    public static int[] field786 = new int[field781];

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "[I")
    public static int[] field783 = new int[field781];

    @OriginalMember(owner = "client!gg", name = "F", descriptor = "[I")
    public static int[] field805 = new int[500];

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field795 = new String[field781];

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "[I")
    public static int[] field811 = new int[field781];

    @OriginalMember(owner = "client!gg", name = "G", descriptor = "[I")
    public static int[] field806 = new int[field781];

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "[I")
    public static int[] field810 = new int[field781];

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public int field774;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public int field775;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public int field776;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public int field778;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public int field779;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public int field788;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public int field789;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public int field791;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public int field792;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public int field793;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "I")
    public int field798;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
    public int field799;

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "I")
    public int field801;

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "I")
    public int field803;

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "I")
    public int field804;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "I")
    public int field807;

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "I")
    public int field808;

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
    public int field809;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "Leh;")
    public static class137 field800;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V")
    public static final void method354(int arg0, int arg1) {
        class282.field4469 = 3;
        if (arg1 != -30265) {
            field786 = null;
        }
        field785++;
        class259.field4216 = arg0;
        class180.field2862 = 20;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILbj;Lbj;)V")
    public static final void method355(int arg0, class88 arg1, class88 arg2) {
        if (arg0 != 19379) {
            field806 = null;
        }
        field777++;
        if (arg1.field1083 != null) {
            arg1.method480(71);
        }
        arg1.field1083 = arg2;
        arg1.field1078 = arg2.field1078;
        arg1.field1083.field1078 = arg1;
        arg1.field1078.field1083 = arg1;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)Lvg;")
    public static final class22 method356(int arg0, int arg1, int arg2) {
        field796++;
        class22 var3 = new class22();
        class148 var4 = (class148) class170.field2693.method710((byte) -102);
        if (arg0 != 500) {
            method355(-40, (class88) null, (class88) null);
        }
        while (var4 != null) {
            if (var4.field2335 && var4.method1021(arg1, arg2, (byte) 104)) {
                var3.method125(var4, -1);
            }
            var4 = (class148) class170.field2693.method709(false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILeh;Leh;)I")
    public static final int method357(int arg0, class137 arg1, class137 arg2) {
        field790++;
        int var3 = 0;
        if (arg1.method938(class287.field4584, 843075268)) {
            var3++;
        }
        if (arg1.method938(class76.field951, 843075268)) {
            var3++;
        }
        if (arg1.method938(class207.field3315, 843075268)) {
            var3++;
        }
        if (arg2.method938(class287.field4584, 843075268)) {
            var3++;
        }
        if (arg2.method938(class76.field951, 843075268)) {
            var3++;
        }
        int var4 = 118 / ((arg0 - 43) / 63);
        if (arg2.method938(class207.field3315, 843075268)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)Lwb;")
    public static final class123 method358(int arg0, int arg1) {
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (arg1 > -117) {
            method354(-11, 83);
        }
        field797++;
        if (class75.field937[var2] == null || class75.field937[var2][var3] == null) {
            boolean var4 = class210.method1477((byte) 80, var2);
            if (!var4) {
                return null;
            }
        }
        return class75.field937[var2][var3];
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public static void method359(byte arg0) {
        field810 = null;
        field811 = null;
        field795 = null;
        field805 = null;
        field800 = null;
        if (arg0 != -37) {
            return;
        }
        field786 = null;
        field794 = null;
        field783 = null;
        field780 = null;
        field806 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)V")
    public static final void method360(int arg0, byte arg1) {
        if (arg1 != -53) {
            method359((byte) 0);
        }
        class220.field3524 = arg0;
        class166.field2666 = -1;
        field787++;
        class236.field3910 = -1;
        class92.method511((byte) 50);
    }
}
