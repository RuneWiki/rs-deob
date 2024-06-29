import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class57 {

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Lae;")
    public static class6 field1238 = class64.method474(117, "mapmarker");

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Lae;")
    public static class6 field1240 = class64.method474(109, "mapscene");

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "[I")
    public static int[] field1243 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field1244 = 0;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "[Lvb;")
    public static class129[] field1246 = new class129[256];

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Lae;")
    public static class6 field1236 = class64.method474(108, "Fallen lassen");

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "[[I")
    public static int[][] field1248 = new int[104][104];

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "[Lae;")
    public static class6[] field1247 = new class6[500];

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "Lvb;")
    public static class129 field1249;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "[[[B")
    public static byte[][][] field1239;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)Z", line = 3)
    public static final boolean method427(int arg0, byte arg1) {
        field1237++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class61.field1333[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (var2 == 31) {
            return true;
        } else {
            return arg1 >= -126;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLbf;)V", line = 27)
    public static final void method428(byte arg0, class14 arg1) {
        field1245++;
        if (arg0 < 58) {
            field1238 = null;
        }
        class105.field2479 = arg1;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 49)
    public static void method429(int arg0) {
        field1238 = null;
        field1249 = null;
        field1236 = null;
        field1243 = null;
        field1247 = null;
        field1248 = null;
        if (arg0 == 28375) {
            field1246 = null;
            field1240 = null;
            field1239 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)I", line = 81)
    public static final int method430(int arg0) {
        int var1 = 3;
        if (arg0 < 110) {
            return -122;
        }
        field1241++;
        if (class79.field1903 < 310) {
            int var2 = class103.field2439 >> 7;
            int var3 = class68.field1513 >> 7;
            int var4 = class12.field229.field1752 >> 7;
            if ((class108.field2582[class15.field305][var2][var3] & 0x4) != 0) {
                var1 = class15.field305;
            }
            int var5 = class12.field229.field1783 >> 7;
            int var6;
            if (var3 < var4) {
                var6 = var4 - var3;
            } else {
                var6 = var3 - var4;
            }
            int var7;
            if (var5 > var2) {
                var7 = var5 - var2;
            } else {
                var7 = var2 - var5;
            }
            if (var6 >= var7) {
                int var8 = var7 * 65536 / var6;
                int var9 = 32768;
                while (var3 != var4) {
                    if (var4 > var3) {
                        var3++;
                    } else if (var4 < var3) {
                        var3--;
                    }
                    var9 += var8;
                    if ((class108.field2582[class15.field305][var2][var3] & 0x4) != 0) {
                        var1 = class15.field305;
                    }
                    if (var9 >= 65536) {
                        if (var5 > var2) {
                            var2++;
                        } else if (var2 > var5) {
                            var2--;
                        }
                        var9 -= 65536;
                        if ((class108.field2582[class15.field305][var2][var3] & 0x4) != 0) {
                            var1 = class15.field305;
                        }
                    }
                }
            } else {
                int var10 = var6 * 65536 / var7;
                int var11 = 32768;
                while (var2 != var5) {
                    if (var5 > var2) {
                        var2++;
                    } else if (var5 < var2) {
                        var2--;
                    }
                    if ((class108.field2582[class15.field305][var2][var3] & 0x4) != 0) {
                        var1 = class15.field305;
                    }
                    var11 += var10;
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var3 < var4) {
                            var3++;
                        } else if (var4 < var3) {
                            var3--;
                        }
                        if ((class108.field2582[class15.field305][var2][var3] & 0x4) != 0) {
                            var1 = class15.field305;
                        }
                    }
                }
            }
        }
        if ((class108.field2582[class15.field305][class12.field229.field1783 >> 7][class12.field229.field1752 >> 7] & 0x4) != 0) {
            var1 = class15.field305;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V", line = 204)
    public static final void method431(int arg0) {
        field1242++;
        for (class103 var1 = (class103) class24.field609.method798(false); var1 != null; var1 = (class103) class24.field609.method792((byte) -87)) {
            if (var1.field2425 == -1) {
                var1.field2447 = 0;
                class133.method1095(1, var1);
            } else {
                var1.method498(arg0 ^ 0xFFFFFF9E);
            }
        }
        if (arg0 != -1) {
            field1239 = null;
        }
    }
}
