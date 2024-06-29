import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class77 {

    @OriginalMember(owner = "client!a", name = "c", descriptor = "[I")
    public static int[] field1147 = new int[32];

    @OriginalMember(owner = "client!a", name = "n", descriptor = "[[[Lhe;")
    public static class47[][][] field1158 = new class47[4][104][104];

    @OriginalMember(owner = "client!a", name = "x", descriptor = "Lqe;")
    private static class168 field1168 = class66.method448("cyan:", -120);

    @OriginalMember(owner = "client!a", name = "w", descriptor = "Lqe;")
    public static class168 field1167 = class66.method448("Suche nach Updates )2 ", -108);

    @OriginalMember(owner = "client!a", name = "r", descriptor = "Lqe;")
    public static class168 field1162 = field1168;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "Lqe;")
    public static class168 field1166 = field1168;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public int field1145;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public int field1146;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public int field1148;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public int field1149;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public int field1150;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public int field1151;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public int field1153;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public int field1154;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public int field1155;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public int field1156;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public int field1157;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public int field1159;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public int field1160;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public int field1161;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public int field1163;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "I")
    public int field1165;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "I")
    public int field1169;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "I")
    public int field1170;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static void method516(int arg0) {
        field1167 = null;
        if (arg0 != 128) {
            method518(12, 70, -74, 124);
        }
        field1158 = null;
        field1166 = null;
        field1162 = null;
        field1147 = null;
        field1168 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIZZ)V")
    public static final void method517(int arg0, int arg1, boolean arg2, boolean arg3) {
        field1164++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class247.field4280 = arg2;
        if (arg3) {
            class87.field1357 = arg0;
            class106.field1692 = arg1;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII)Z")
    public static final boolean method518(int arg0, int arg1, int arg2, int arg3) {
        if (!class158.method1034(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class23.field275[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class108.field1739) {
                    if (!class64.method428(var4, var6, var5)) {
                        return false;
                    }
                    if (!class64.method428(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class64.method428(var4, var7, var5)) {
                        return false;
                    }
                    if (!class64.method428(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class64.method428(var4, var8, var5)) {
                    return false;
                }
                if (!class64.method428(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class102.field1648) {
                    if (!class64.method428(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class64.method428(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class64.method428(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class64.method428(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class64.method428(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class64.method428(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class108.field1739) {
                    if (!class64.method428(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class64.method428(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class64.method428(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class64.method428(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class64.method428(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class64.method428(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class102.field1648) {
                    if (!class64.method428(var4, var6, var5)) {
                        return false;
                    }
                    if (!class64.method428(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class64.method428(var4, var7, var5)) {
                        return false;
                    }
                    if (!class64.method428(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class64.method428(var4, var8, var5)) {
                    return false;
                }
                if (!class64.method428(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class64.method428(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class64.method428(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class64.method428(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class64.method428(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class64.method428(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIII)V")
    public static final void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1152++;
        class246[] var7 = class44.field579;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class246 var9 = var7[var8];
            if (var9 != null && var9.field4269 == 2) {
                class109.method711(arg5 >> 1, arg3, (var9.field4264 - class246.field4261 << 7) + var9.field4257, (-class125.field2060 + var9.field4262 << 7) + var9.field4271, var9.field4270 * 2, arg4 >> 1, arg6, 0);
                if (class178.field3123 > -1 && class133.field2326 % 20 < 10) {
                    class87.field1356[var9.field4259].method73(arg1 + class178.field3123 - 12, class59.field812 + -28 + arg0);
                }
            }
        }
        if (arg2 != -1) {
            field1167 = null;
        }
    }
}
