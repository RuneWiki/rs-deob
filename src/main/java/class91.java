import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class91 extends class213 {

    @OriginalMember(owner = "client!id", name = "V", descriptor = "Le;")
    public class44 field1718;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "I")
    public static int field1714 = 0;

    @OriginalMember(owner = "client!id", name = "S", descriptor = "[[I")
    public static int[][] field1715 = new int[5][5000];

    @OriginalMember(owner = "client!id", name = "N", descriptor = "[Lvd;")
    public static class222[] field1710 = new class222[100];

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "Lba;")
    public static class13 field1713 = null;

    @OriginalMember(owner = "client!id", name = "T", descriptor = "I")
    public static int field1716 = 5063219;

    @OriginalMember(owner = "client!id", name = "X", descriptor = "[Lac;")
    public static class4[] field1720 = new class4[50];

    @OriginalMember(owner = "client!id", name = "O", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!id", name = "W", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!id", name = "Y", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!id", name = "U", descriptor = "Lr;")
    public static class178 field1717;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "[Lbg;")
    public static class19[] field1709;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "(I)V")
    public static void method582(int arg0) {
        field1715 = null;
        field1710 = null;
        int var1 = -87 % ((arg0 - 12) / 44);
        field1717 = null;
        field1720 = null;
        field1709 = null;
        field1713 = null;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Le;)V")
    public class91(class44 arg0) {
        this.field1718 = arg0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lab;B)V")
    public static final void method583(class3 arg0, byte arg1) {
        field1719++;
        class63.field1164 = arg0;
        if (arg1 != -78) {
            method584(86, null);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILvd;)V")
    public static final void method584(int arg0, class222 arg1) {
        try {
            if (arg0 != 17407) {
                field1716 = 33;
            }
            class22.field530.getAppletContext().showDocument(arg1.method1432(class22.field530.getCodeBase(), 56), "_blank");
        } catch (Exception var2) {
        }
        field1721++;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V")
    public static final void method585(byte arg0) {
        class80.method527(class182.field3369, 31702);
        field1711++;
        class102.field1899++;
        if (class13.field276 && class60.field1115) {
            if (arg0 < 41) {
                method583(null, (byte) -96);
            }
            int var1 = class137.field2651;
            int var2 = var1 - class186.field3438;
            int var3 = class182.field3369.field278;
            int var4 = class94.field1769;
            int var5 = var4 - class130.field2528;
            if (var5 < class66.field1249) {
                var5 = class66.field1249;
            }
            if (var2 < class39.field867) {
                var2 = class39.field867;
            }
            if (class182.field3369.field245 + var2 > class39.field867 + class57.field1074.field245) {
                var2 = class39.field867 + class57.field1074.field245 - class182.field3369.field245;
            }
            int var6 = class57.field1074.field314 + var2 - class39.field867;
            if (class66.field1249 + class57.field1074.field341 < var5 - -class182.field3369.field341) {
                var5 = class66.field1249 + class57.field1074.field341 - class182.field3369.field341;
            }
            int var7 = var5 + class57.field1074.field316 - class66.field1249;
            int var8 = var2 - class108.field1998;
            int var9 = var5 - class165.field3137;
            if (class102.field1899 > class182.field3369.field229 && (var9 > var3 || var9 < -var3 || var8 > var3 || -var3 > var8)) {
                class82.field1582 = true;
            }
            if (class182.field3369.field225 != null && class82.field1582) {
                class191 var10 = new class191();
                var10.field3521 = class182.field3369;
                var10.field3526 = var7;
                var10.field3517 = var6;
                var10.field3510 = class182.field3369.field225;
                class52.method373(-32560, var10);
            }
            if (class94.field1773 == 0) {
                if (class82.field1582) {
                    if (class182.field3369.field368 != null) {
                        class191 var11 = new class191();
                        var11.field3515 = class182.field3372;
                        var11.field3510 = class182.field3369.field368;
                        var11.field3521 = class182.field3369;
                        var11.field3526 = var7;
                        var11.field3517 = var6;
                        class52.method373(-32560, var11);
                    }
                    if (class182.field3372 != null && class94.method602(class182.field3369, (byte) -28) != null) {
                        class76.field1478++;
                        class42.field895.method1347((byte) -105, 136);
                        class42.field895.method672(-279704376, class182.field3369.field264);
                        class42.field895.method678(class182.field3369.field269, true);
                        class42.field895.method663(-102, class182.field3372.field264);
                        class42.field895.method702(441048200, class182.field3372.field269);
                    }
                } else if ((class155.field2952 == 1 || class155.method991(class172.field3227 - 1, 2)) && class172.field3227 > 2) {
                    class21.method205((byte) 71);
                } else if (class172.field3227 > 0) {
                    class71.method485(2, class172.field3227 - 1);
                }
                class182.field3369 = null;
            }
        } else if (class102.field1899 > 1) {
            class182.field3369 = null;
        }
    }
}
