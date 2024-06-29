import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class64 extends class72 {

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    private final int field1121;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    private final int field1118;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    private final int field1120;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    private final int field1127;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    public static int field1119 = 0;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "Loh;")
    public static class258 field1126 = class153.method1046("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", 87);

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "Loh;")
    private static class258 field1124 = class153.method1046("You can(Wt add yourself to your own friend list)3", 114);

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "Loh;")
    public static class258 field1135 = null;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "Loh;")
    public static class258 field1125 = field1124;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "Loh;")
    public static class258 field1131 = class153.method1046("Titelbild ge-Offnet)3", 124);

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "F")
    public static float field1117;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "Lgb;")
    public static class213 field1115;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "Lgb;")
    public static class213 field1123;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "Ljava/awt/Image;")
    public static Image field1129;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "[[[B")
    public static byte[][][] field1122;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII)Z", line = 3)
    public static final boolean method491(int arg0, int arg1, int arg2, int arg3) {
        if (!client.method346(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class201.field3482[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class190.field3359) {
                    if (!class229.method1526(var4, var6, var5)) {
                        return false;
                    }
                    if (!class229.method1526(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class229.method1526(var4, var7, var5)) {
                        return false;
                    }
                    if (!class229.method1526(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class229.method1526(var4, var8, var5)) {
                    return false;
                }
                if (!class229.method1526(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class289.field4986) {
                    if (!class229.method1526(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class229.method1526(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class229.method1526(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class229.method1526(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class229.method1526(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class229.method1526(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class190.field3359) {
                    if (!class229.method1526(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class229.method1526(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class229.method1526(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class229.method1526(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class229.method1526(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class229.method1526(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class289.field4986) {
                    if (!class229.method1526(var4, var6, var5)) {
                        return false;
                    }
                    if (!class229.method1526(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class229.method1526(var4, var7, var5)) {
                        return false;
                    }
                    if (!class229.method1526(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class229.method1526(var4, var8, var5)) {
                    return false;
                }
                if (!class229.method1526(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class229.method1526(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class229.method1526(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class229.method1526(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class229.method1526(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class229.method1526(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIB)V", line = 191)
    public final void method492(int arg0, int arg1, byte arg2) {
        field1132++;
        if (arg2 >= -120) {
            field1123 = (class213) null;
        }
        int var4 = this.field1118 * arg0 >> 12;
        int var5 = this.field1120 * arg0 >> 12;
        int var6 = this.field1121 * arg1 >> 12;
        int var7 = this.field1127 * arg1 >> 12;
        class155.method1057(var7, this.field1267, -1, var4, var5, var6);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V", line = 212)
    public static void method493(boolean arg0) {
        field1123 = null;
        field1115 = null;
        field1125 = null;
        field1126 = null;
        field1129 = null;
        field1122 = (byte[][][]) null;
        field1135 = null;
        if (arg0) {
            field1124 = null;
            field1131 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(III)V", line = 236)
    public final void method494(int arg0, int arg1, int arg2) {
        if (arg1 == 17898) {
            field1130++;
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(IIIIIII)V", line = 250)
    public class64(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1121 = arg1;
        this.field1118 = arg0;
        this.field1120 = arg2;
        this.field1127 = arg3;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)V", line = 289)
    public final void method495(int arg0, int arg1, int arg2) {
        field1128++;
        int var4 = this.field1118 * arg1 >> 12;
        if (arg2 != 512) {
            this.method495(-123, -99, -84);
        }
        int var5 = this.field1121 * arg0 >> 12;
        int var6 = this.field1127 * arg0 >> 12;
        int var7 = this.field1120 * arg1 >> 12;
        class290.method2045(var7, -1, this.field1264, var4, this.field1269, var6, var5, this.field1267);
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIB)V", line = 311)
    public static final void method496(int arg0, int arg1, byte arg2) {
        field1133++;
        int var3 = 36 / ((arg2 + 19) / 39);
        int var4 = arg1--;
        int var5 = class185.field3296[arg1];
        if (var4 > 25) {
            var4 = 25;
        }
        int var6 = class8.field109[arg1];
        if (arg0 == 0) {
            class268.field4669++;
            class159.field2710.method885(8, -112);
            class159.field2710.method1598(var4 + var4 + 3, 27052);
        }
        if (arg0 == 1) {
            class85.field1442++;
            class159.field2710.method885(99, -118);
            class159.field2710.method1598(var4 + var4 + 3 + 14, 27052);
        }
        if (arg0 == 2) {
            class307.field5210++;
            class159.field2710.method885(122, -99);
            class159.field2710.method1598(var4 + var4 + 3, 27052);
        }
        class10.field118 = class8.field109[0];
        class6.field82 = class185.field3296[0];
        for (int var7 = 1; var7 < var4; var7++) {
            arg1--;
            class159.field2710.method1569(-976377816, class8.field109[arg1] - var6);
            class159.field2710.method1569(-976377816, class185.field3296[arg1] - var5);
        }
        class159.field2710.method1592(false, var6 + class229.field3955);
        class159.field2710.method1598(client.field610[82] ? 1 : 0, 27052);
        class159.field2710.method1619(8316, class311.field5271 + var5);
    }
}
