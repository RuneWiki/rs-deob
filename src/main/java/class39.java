import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class39 extends class137 {

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "[J")
    public static long[] field968 = new long[100];

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
    public static int field969 = 0;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    public static int field965 = -1;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "Laf;")
    public static class7 field971 = class48.method406(40, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "Lnd;")
    public static class94 field980 = new class94();

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
    public int field964;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    public int field972;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "I")
    public int field978;

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "I")
    public int field981;

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "I")
    public int field982;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "Lof;")
    public class103 field963;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "Lof;")
    public class103 field967;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "Lq;")
    public static class111 field973;

    @OriginalMember(owner = "client!fc", name = "W", descriptor = "Lr;")
    public static class118 field984;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "Laf;")
    public class7 field975;

    @OriginalMember(owner = "client!fc", name = "V", descriptor = "[Lqc;")
    public static class114[] field983;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "[Ljava/lang/Object;")
    public Object[] field962;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lkb;B)V")
    public static final void method334(class71 arg0, byte arg1) {
        field970++;
        if (arg1 < -40) {
            class84.field1993 = arg0;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public static void method335(int arg0) {
        field973 = null;
        field983 = null;
        field971 = null;
        field968 = null;
        if (arg0 == 0) {
            field984 = null;
            field980 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)Lh;")
    public static final class49 method336(int arg0, int arg1) {
        field977++;
        class49 var2 = (class49) class94.field2198.method395(127, (long) arg0);
        if (arg1 != -1) {
            field971 = null;
        }
        if (var2 != null) {
            return var2;
        }
        class49 var3 = class50.method415(arg0, false, 20, class77.field1792, class152.field3560);
        if (var3 != null) {
            class94.field2198.method388(var3, (long) arg0, 2047);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)Laf;")
    public static final class7 method337(int arg0, int arg1) {
        field974++;
        if (arg0 < 999999999) {
            return class51.method421((byte) 126, arg0);
        } else if (arg1 == 5233) {
            return class93.field2178;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLaf;)Z")
    public static final boolean method338(boolean arg0, class7 arg1) {
        field966++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class21.field546; var2++) {
            if (arg1.method84(class10.field277[var2], 127)) {
                return true;
            }
        }
        if (arg1.method84(class21.field531.field2121, 127)) {
            return true;
        } else if (arg0) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Lkb;B)V")
    public static final void method339(class71 arg0, byte arg1) {
        field979++;
        if (arg1 != 79) {
            field980 = null;
        }
        class75.field1734 = arg0;
    }
}
