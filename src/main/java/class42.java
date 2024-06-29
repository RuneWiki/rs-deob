import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class42 extends class154 {

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "Loh;")
    private static class258 field578 = class153.method1046("Examine", 85);

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "Loh;")
    public static class258 field576 = class153.method1046("Okay", 118);

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "Loh;")
    private static class258 field588 = class153.method1046("slide:", 91);

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "Loh;")
    public static class258 field583 = field588;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public static int field582 = 0;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "Loh;")
    public static class258 field587 = field578;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "Loh;")
    public static class258 field599 = field588;

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "Loh;")
    public static class258 field604 = class153.method1046("Benutzeroberfl-=che geladen)3", 118);

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public int field580;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
    public int field584;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
    public int field591;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    public int field594;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
    public int field601;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "Ls;")
    public class171 field596;

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "Ls;")
    public class171 field598;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "Loh;")
    public class258 field575;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "Z")
    public boolean field602;

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "[Lfb;")
    public static class219[] field597;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "[Ljava/lang/Object;")
    public Object[] field600;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lgb;B)V", line = 5)
    public static final void method336(class213 arg0, byte arg1) {
        if (arg1 != -97) {
            field583 = (class258) null;
        }
        field585++;
        class248.field4286 = arg0.method1451(-126, class224.field3831);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILok;)V", line = 18)
    public static final void method337(int arg0, class107 arg1) {
        field589++;
        for (class124 var2 = (class124) class281.field4821.method83(-122); var2 != null; var2 = (class124) class281.field4821.method87((byte) -80)) {
            if (var2.field2212 == arg1) {
                if (var2.field2193 != null) {
                    class184.field3279.method112(var2.field2193);
                    var2.field2193 = null;
                }
                var2.method1054((byte) 79);
                return;
            }
        }
        if (arg0 != -1) {
            field583 = (class258) null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(B)V", line = 50)
    public static void method338(byte arg0) {
        field604 = null;
        field576 = null;
        field583 = null;
        field578 = null;
        field597 = null;
        field599 = null;
        if (arg0 == -35) {
            field587 = null;
            field588 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)Z", line = 109)
    public static final boolean method339(byte arg0, int arg1) {
        class98 var2 = class27.method210(127, arg1);
        field586++;
        if (var2 == null) {
            return false;
        } else if (class295.field5062 == 1 || class295.field5062 == 2 || class50.field789 == 2) {
            byte[] var3 = var2.field1752.method1793(37);
            class120.field2112 = new String(var3, 0, var3.length);
            class253.field4358 = var2.field1747;
            if (class50.field789 != 0) {
                class130.field2294 = class253.field4358 + 40000;
                class193.field3413 = class130.field2294;
                class118.field2090 = class253.field4358 + 50000;
            }
            return true;
        } else {
            class258 var4 = class286.field4937;
            if (class50.field789 != 0) {
                var4 = class100.method755(-6, new class258[] { class93.field1649, class218.method1481(-49, var2.field1747 + 7000) });
            }
            class258 var5 = class286.field4937;
            if (class70.field1210 != null) {
                var5 = class100.method755(-6, new class258[] { class132.field2303, class70.field1210 });
            }
            class258 var6 = class100.method755(-6, new class258[] { class144.field2402, var2.field1752, var4, class91.field1609, class218.method1481(-49, class310.field5259), class49.field730, class218.method1481(49, class62.field1097), var5, class68.field1182, class50.field768 ? class209.field3605 : class118.field2095, class219.field3796, class271.field4699 ? class209.field3605 : class118.field2095, class120.field2114, class173.field3098 ? class209.field3605 : class118.field2095 });
            try {
                if (arg0 < 49) {
                    method341(-10);
                }
                class303.field5178.getAppletContext().showDocument(var6.method1770(true), "_self");
                return true;
            } catch (Exception var8) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)V", line = 161)
    public static final void method340(int arg0, int arg1) {
        class106.field1896 = arg1;
        field603++;
        if (arg0 != 2) {
            field604 = (class258) null;
        }
        class61.field1090 = 50;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 188)
    public static final void method341(int arg0) {
        field593++;
        class83.field1406.method981(32);
        class176.field3167.method1310((byte) 114);
        if (arg0 > -3) {
            field582 = 69;
        }
        class128.field2267.method1310((byte) 103);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)Z", line = 202)
    public static final boolean method342(int arg0, int arg1) {
        if (arg1 != 3688950) {
            field582 = -43;
        }
        field595++;
        return ((arg0 & 0x3849F6) >> 21) != 0;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(II)I", line = 222)
    public static final int method343(int arg0, int arg1) {
        field574++;
        int var2 = arg1 & 0x3F;
        int var3 = arg1 >> 6 & 0x3;
        if (arg0 != -24987) {
            return 17;
        }
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }
}
