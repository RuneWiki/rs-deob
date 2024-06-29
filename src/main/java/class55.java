import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class55 extends class317 {

    @OriginalMember(owner = "client!bj", name = "R", descriptor = "Lj;")
    public static class285 field866 = new class285(64);

    @OriginalMember(owner = "client!bj", name = "bb", descriptor = "I")
    public static int field876 = 0;

    @OriginalMember(owner = "client!bj", name = "ab", descriptor = "[I")
    public static int[] field875 = new int[14];

    @OriginalMember(owner = "client!bj", name = "cb", descriptor = "Z")
    public static volatile boolean field877 = true;

    @OriginalMember(owner = "client!bj", name = "T", descriptor = "B")
    public byte field868;

    @OriginalMember(owner = "client!bj", name = "G", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!bj", name = "Q", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!bj", name = "S", descriptor = "I")
    public int field867;

    @OriginalMember(owner = "client!bj", name = "U", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!bj", name = "V", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!bj", name = "W", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!bj", name = "X", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!bj", name = "Y", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!bj", name = "Z", descriptor = "Lpe;")
    public class101 field874;

    @OriginalMember(owner = "client!bj", name = "db", descriptor = "Lja;")
    public static class64 field878;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lo;IIII)V", line = 11)
    public static final void method401(class208 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -4845) {
            field866 = (class285) null;
        }
        field873++;
        if (class65.field1062 >= 400) {
            return;
        }
        if (arg0.field3313 != null) {
            arg0 = arg0.method1518(-4841);
        }
        if (arg0 == null || !arg0.field3275) {
            return;
        }
        String var5 = arg0.field3325;
        if (arg0.field3290 != 0) {
            String var6 = class141.field2241 == 1 ? class65.field1056 : class107.field1783;
            var5 = var5 + class87.method627(0, class19.field356.field481, arg0.field3290) + " (" + var6 + arg0.field3290 + ")";
        }
        if (class152.field2451 == 1) {
            class116.field1894++;
            class34.method236((short) 39, arg1, class57.field917, arg4, class89.field1364, (byte) 40, class258.field3979 + " -> <col=ffff00>" + var5, (long) arg3);
        } else if (class219.field3514) {
            class37 var14 = class88.field1349 == -1 ? null : class185.method1392(class88.field1349, arg2 + 4856);
            if ((class329.field5083 & 0x2) != 0 && (var14 == null || arg0.method1517(var14.field676, class88.field1349, 11239) != var14.field676)) {
                class103.field1730++;
                class34.method236((short) 26, arg1, class239.field3722, arg4, class306.field4820, (byte) 40, class82.field1232 + " -> <col=ffff00>" + var5, (long) arg3);
            }
        } else {
            class213.field3398++;
            String[] var7 = arg0.field3312;
            if (class107.field1779) {
                var7 = class173.method1282(var7, 24624);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class141.field2241 != 0 || !var7[var8].equalsIgnoreCase(class18.field354))) {
                        class93.field1525++;
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 45;
                        }
                        int var10 = -1;
                        if (arg0.field3339 == var8) {
                            var10 = arg0.field3284;
                        }
                        if (arg0.field3316 == var8) {
                            var10 = arg0.field3308;
                        }
                        if (var8 == 1) {
                            var9 = 46;
                        }
                        if (var8 == 2) {
                            var9 = 29;
                        }
                        if (var8 == 3) {
                            var9 = 6;
                        }
                        if (var8 == 4) {
                            var9 = 19;
                        }
                        class34.method236(var9, arg1, var7[var8], arg4, var10, (byte) 40, "<col=ffff00>" + var5, (long) arg3);
                    }
                }
            }
            if (class141.field2241 == 0 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class18.field354)) {
                        class193.field3068++;
                        short var12 = 0;
                        short var13 = 0;
                        if (arg0.field3290 > class19.field356.field481) {
                            var13 = 2000;
                        }
                        if (var11 == 0) {
                            var12 = 45;
                        }
                        if (var11 == 1) {
                            var12 = 46;
                        }
                        if (var11 == 2) {
                            var12 = 29;
                        }
                        if (var11 == 3) {
                            var12 = 6;
                        }
                        if (var11 == 4) {
                            var12 = 19;
                        }
                        if (var12 != 0) {
                            var12 += var13;
                        }
                        class34.method236(var12, arg1, var7[var11], arg4, arg0.field3289, (byte) 40, "<col=ffff00>" + var5, (long) arg3);
                    }
                }
            }
            class34.method236((short) 1002, arg1, class285.field4377, arg4, class68.field1087, (byte) 40, "<col=ffff00>" + var5, (long) arg3);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)[B", line = 171)
    public final byte[] method402(byte arg0) {
        if (arg0 > -31) {
            method404(14, -35, -71, -122, (byte) -119, 41);
        }
        field869++;
        if (this.field4940 || this.field874.field1667 < this.field874.field1661.length - this.field868) {
            throw new RuntimeException();
        }
        return this.field874.field1661;
    }

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "(I)V", line = 190)
    public static void method403(int arg0) {
        field875 = null;
        field866 = null;
        if (arg0 != 45) {
            field877 = false;
        }
        field878 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIBI)V", line = 202)
    public static final void method404(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        class48.field806 = arg5;
        class231.field3670 = arg1;
        class19.field358 = arg0;
        int var6 = -119 / ((69 - arg4) / 34);
        field870++;
        class228.field3643 = arg3;
        class125.field1995 = arg2;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)V", line = 218)
    public static final void method405(int arg0, int arg1) {
        field865++;
        if (class26.field427 == null || arg0 > class26.field427.length) {
            class26.field427 = new int[arg0];
        }
        if (arg1 != 20333) {
            field872 = -97;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)I", line = 237)
    public final int method406(byte arg0) {
        if (arg0 == 34) {
            field871++;
            return this.field874 == null ? 0 : this.field874.field1667 * 100 / (this.field874.field1661.length - this.field868);
        } else {
            return -62;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZZ)V", line = 255)
    public static final void method407(boolean arg0, boolean arg1) {
        field864++;
        byte var2;
        byte[][] var3;
        if (class265.field4126 && arg1) {
            var2 = 1;
            var3 = class30.field508;
        } else {
            var3 = class2.field2;
            var2 = 4;
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var6 = var3[var5];
            int var7 = (class102.field1728[var5] & 0xFF) * 64 - class91.field1485;
            int var8 = (class102.field1728[var5] >> 8) * 64 - class177.field2780;
            if (var6 != null) {
                class84.method605((byte) 52);
                class165.method1213(class76.field1166 * 8 - 48, var7, var8, (class111.field1847 - 6) * 8, arg1, class244.field3772, -105, var6);
            }
        }
        int var9 = 0;
        if (!arg0) {
            return;
        }
        while (var9 < var4) {
            int var10 = (class102.field1728[var9] & 0xFF) * 64 - class91.field1485;
            byte[] var11 = var3[var9];
            int var12 = (class102.field1728[var9] >> 8) * 64 - class177.field2780;
            if (var11 == null && class76.field1166 < 800) {
                class84.method605((byte) 52);
                for (int var13 = 0; var13 < var2; var13++) {
                    class297.method2078(var13, 64, var12, var10, 64, -128);
                }
            }
            var9++;
        }
    }
}
