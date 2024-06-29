import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class282 {

    @OriginalMember(owner = "client!on", name = "a", descriptor = "[I")
    public static int[] field3950 = new int[32];

    @OriginalMember(owner = "client!on", name = "f", descriptor = "Lada;")
    public static class144 field3955 = new class144(37, 4);

    @OriginalMember(owner = "client!on", name = "d", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "Lkda;")
    public static class328 field3951;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "Lkda;")
    public static class328 field3952;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lkda;I)V", line = 8)
    public static final void method1757(class328 arg0, int arg1) {
        class210.field3105 = arg0.method1967(-1, "p11_full");
        field3953++;
        class38.field464 = arg0.method1967(-1, "p12_full");
        class279.field3913 = arg0.method1967(-1, "b12_full");
        class572.field8431 = arg0.method1967(-1, "hitmarks");
        class166.field2615 = arg0.method1967(-1, "hitbar_default");
        class379.field5226 = arg0.method1967(-1, "timerbar_default");
        class65.field805 = arg0.method1967(-1, "headicons_pk");
        class15.field153 = arg0.method1967(-1, "headicons_prayer");
        if (arg1 >= -34) {
            field3951 = null;
        }
        class106.field1526 = arg0.method1967(-1, "hint_headicons");
        class440.field5878 = arg0.method1967(-1, "hint_mapmarkers");
        class116.field1629 = arg0.method1967(-1, "mapflag");
        class386.field5314 = arg0.method1967(-1, "cross");
        class561.field8336 = arg0.method1967(-1, "mapdots");
        class140.field1989 = arg0.method1967(-1, "scrollbar");
        class115.field1624 = arg0.method1967(-1, "name_icons");
        class321.field4430 = arg0.method1967(-1, "floorshadows");
        class553.field8241 = arg0.method1967(-1, "compass");
        class373.field5123 = arg0.method1967(-1, "otherlevel");
        class117.field1648 = arg0.method1967(-1, "hint_mapedge");
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(III)Z", line = 37)
    public static final boolean method1758(int arg0, int arg1, int arg2) {
        field3956++;
        if (arg2 != 0) {
            method1758(-83, 35, -1);
        }
        return class200.method1342((byte) 80, arg1, arg0) & (class393.method2336(arg0, -9359, arg1) | (arg0 & 0x2000) != 0 | class77.method592(0, arg1, arg0));
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lks;BZ)V", line = 54)
    public static final void method1759(class373 arg0, byte arg1, boolean arg2) {
        field3954++;
        if (class103.field1484 >= 400) {
            return;
        }
        if (class541.field8119 != arg0) {
            String var3;
            if (arg0.field5155 == 0) {
                boolean var4 = true;
                if (class541.field8119.field5146 != -1 && arg0.field5146 != -1) {
                    int var5 = arg0.field5165 < class541.field8119.field5165 ? class541.field8119.field5165 : arg0.field5165;
                    int var6 = arg0.field5146 <= class541.field8119.field5146 ? arg0.field5146 : class541.field8119.field5146;
                    int var7 = (var5 * 10 / 100) + var6 + 5;
                    int var8 = class541.field8119.field5165 - arg0.field5165;
                    if (var8 < 0) {
                        var8 = -var8;
                    }
                    if (var8 > var7) {
                        var4 = false;
                    }
                }
                String var9 = class348.field4768 == class143.field2006 ? class5.field40.method3408(96, class63.field795) : class101.field1464.method3408(arg1 ^ 0xFFFFFF80, class63.field795);
                if (arg0.field5165 < arg0.field5164) {
                    var3 = arg0.method2228(true, -1) + (var4 ? class341.method2092(class541.field8119.field5165, arg0.field5165, (byte) -43) : "<col=ffffff>") + " (" + var9 + arg0.field5165 + "+" + (arg0.field5164 - arg0.field5165) + ")";
                } else {
                    var3 = arg0.method2228(true, arg1 + 19) + (var4 ? class341.method2092(class541.field8119.field5165, arg0.field5165, (byte) -108) : "<col=ffffff>") + " (" + var9 + arg0.field5165 + ")";
                }
            } else {
                var3 = arg0.method2228(true, arg1 ^ 0x13) + " (" + class630.field9256.method3408(105, class63.field795) + arg0.field5155 + ")";
            }
            if (class606.field9002) {
                if (!arg2 && (class364.field4945 & 0x8) != 0) {
                    class625.field9203++;
                    class335.method2049(0, class402.field5501, (long) arg0.field1904, 126, true, 19, class217.field3182, false, -1, 0, class537.field8008 + " -> <col=ffffff>" + var3);
                }
            } else if (arg2) {
                class335.method2049(0, -1, 0L, 122, false, -1, "<col=cccccc>" + var3, true, 0, 0, "");
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class228.field3338[var10] != null) {
                        short var12 = 0;
                        if (class348.field4768 == class210.field3104 && class228.field3338[var10].equalsIgnoreCase(class624.field9189.method3408(109, class63.field795))) {
                            if (class541.field8119.field5165 < arg0.field5165) {
                                var12 = 2000;
                            }
                            if (class541.field8119.field5128 != 0 && arg0.field5128 != 0) {
                                if (class541.field8119.field5128 == arg0.field5128) {
                                    var12 = 2000;
                                } else {
                                    var12 = 0;
                                }
                            }
                        } else if (class66.field807[var10]) {
                            var12 = 2000;
                        }
                        short var13 = (short) (class571.field8409[var10] + var12);
                        int var14 = class48.field566[var10] == -1 ? class414.field5625 : class48.field566[var10];
                        class222.field3229++;
                        class335.method2049(0, var14, (long) arg0.field1904, 124, true, var13, class228.field3338[var10], false, -1, 0, "<col=ffffff>" + var3);
                    }
                }
            }
            if (arg1 == -20 && !arg2) {
                for (class583 var11 = (class583) class174.field2677.method124((byte) 42); var11 != null; var11 = (class583) class174.field2677.method120(62)) {
                    if (var11.field8566 == 18) {
                        var11.field8567 = "<col=ffffff>" + var3;
                        return;
                    }
                }
            }
        } else if (class606.field9002 && (class364.field4945 & 0x10) != 0) {
            class335.method2049(0, class402.field5501, 0L, 122, true, 58, class217.field3182, false, -1, 0, class537.field8008 + " -> <col=ffffff>" + class266.field3791.method3408(arg1 ^ 0xFFFFFF8A, class63.field795));
            class426.field5741++;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V", line = 208)
    public static void method1760(int arg0) {
        field3950 = null;
        field3955 = null;
        if (arg0 < -84) {
            field3951 = null;
            field3952 = null;
        }
    }
}
