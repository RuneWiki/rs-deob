import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public abstract class class128 {

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Lhb;")
    private static class44 field3069 = class102.method810("Checking for updates )2 ", -28606);

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Lhb;")
    private static class44 field3076 = class102.method810("Please close the interface you have open before using (Wreport abuse(W", -28606);

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lhb;")
    public static class44 field3068 = field3076;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field3074 = 0;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "Lhb;")
    public static class44 field3077 = class102.method810("@gr3@", -28606);

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Lhb;")
    public static class44 field3072 = field3069;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "Lhb;")
    public static class44 field3083 = class102.method810("Lade Benutzeroberfl-=che )2 ", -28606);

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "Lhb;")
    private static class44 field3078 = class102.method810("Accept trade", -28606);

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "Lhb;")
    public static class44 field3075 = field3078;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "Lhe;")
    public static class47 field3082 = new class47();

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "J")
    public static long field3079;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Lqd;")
    public static class100 field3071;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "[Lne;")
    public static class83[] field3081;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 3)
    public static final void method956(int arg0) {
        class120.method929(true);
        class88.method714(23391);
        class52.method492((byte) -128);
        field3084++;
        class120.method927(arg0 ^ 0xFFFFE08B);
        if (arg0 != 0) {
            return;
        }
        class129.method960(false);
        class16.method111(-79);
        class95.method754(false);
        class4.method37(0);
        class39.method345(0);
        class127.method954(true);
        class36.method342(123);
        class89.method719(-66);
        ((class96) class58.field1516).method757(-19130);
        class92.field2345.method887(arg0 - 1);
        class97.field2480.method887(-1);
        class5.field132.method887(-1);
        class105.field2699.method887(-1);
        class79.field1983.method887(~arg0);
        class94.field2398.method887(-1);
        class25.field606.method887(~arg0);
        class105.field2688.method887(-1);
        class48.field1204.method887(-1);
        field3071.method887(~arg0);
        class130.field3114.method887(-1);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ltd;Ltd;ZLtd;)V", line = 37)
    public static final void method957(class116 arg0, class116 arg1, boolean arg2, class116 arg3) {
        if (!arg2) {
            method956(5);
        }
        field3073++;
        class33.field811 = arg1;
        class109.field2740 = arg3;
        class14.field272 = arg0;
        class113.field2777 = new class72[class109.field2740.method873(0)][];
        class69.field1719 = new boolean[class109.field2740.method873(0)];
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V", line = 56)
    public static void method958(boolean arg0) {
        field3069 = null;
        field3075 = null;
        field3072 = null;
        field3082 = null;
        if (arg0) {
            return;
        }
        field3071 = null;
        field3068 = null;
        field3077 = null;
        field3083 = null;
        field3076 = null;
        field3078 = null;
        field3081 = null;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
    public abstract void method72(int arg0);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)I")
    public abstract int method73(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
    public abstract void method71(int arg0);
}
